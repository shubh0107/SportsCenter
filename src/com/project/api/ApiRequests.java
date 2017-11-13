package com.project.api;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.project.xmlModels.Schedule;

public class ApiRequests {

	// public static void main(String[] args) throws Exception {

	// ApiRequests apiRequests = new ApiRequests();

	/*
	 * System.out.println("Testing 1 - Send Http GET request");
	 * apiRequests.sendGet();
	 * 
	 * System.out.println("\nTesting 2 - Send Http POST request");
	 * apiRequests.sendPost();
	 */

	// HTTP GET request
	public void cricket_sendRequestDailySchedule(String year, String month, String date) throws Exception {

		System.setProperty("http.proxyHost", "proxy.pershing.com");
		System.setProperty("http.proxyPort", "8080");

		String url = "http://api.sportradar.us/cricket-t1/matches/"+year+"/"+month+"/"+date+"/schedule.xml?api_key=b93mepv44ny5r8dg7avwgpmd";
		System.out.println(url);
		URL obj = new URL(url);

		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		// List<Schedule> scheduleList = new ArrayList<Schedule>();

		// con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		//String jsonPrettyPrintString = null;

		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		String xmlResponse = null;

		if (responseCode == HttpURLConnection.HTTP_OK) {

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}

			in.close();
			xmlResponse = response.toString();
			response= null;

		}
		
		/*
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		 
        DocumentBuilder builder;
        try
        {
            builder = factory.newDocumentBuilder();
 
            // Use String reader
            Document document = builder.parse( new InputSource(
                    new StringReader( xmlResponse) ) );
 
            TransformerFactory tranFactory = TransformerFactory.newInstance();
            Transformer aTransformer = tranFactory.newTransformer();
            Source src = new DOMSource( document );
            Result dest = new StreamResult( new File( "C:\\cricketScheduleXml.xml" ) );
            aTransformer.transform( src, dest );
        } catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		*/
		
		File myFile = new File("C:\\workspace-mars\\XBBNHC\\SportsCenter\\WebContent\\cricketScheduleXml.xml");
		FileWriter fileWriter = new FileWriter(myFile, false); // true to append
		                                                     // false to overwrite.
		fileWriter.write(xmlResponse);
		fileWriter.flush();
		fileWriter.close();
		
	}
		

	public void cricket_sendRequestMatchSummary(String matchId) throws Exception {

		System.setProperty("http.proxyHost", "proxy.pershing.com");
		System.setProperty("http.proxyPort", "8080");

		String url = "http://api.sportradar.us/cricket-t1/matches/" + matchId
				+ "/summary.xml?api_key=b93mepv44ny5r8dg7avwgpmd";

		URL obj = new URL(url);

		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		// List<Schedule> scheduleList = new ArrayList<Schedule>();

		// con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();

		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		String xmlResponse = null;

		if (responseCode == HttpURLConnection.HTTP_OK) {

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}

			in.close();
			xmlResponse = response.toString();

		}
		File myFile = new File("C:\\workspace-mars\\XBBNHC\\SportsCenter\\WebContent\\cricketMatchSummaryXml.xml");
		FileWriter fileWriter = new FileWriter(myFile, false); // true to append
		                                                     // false to overwrite.
		fileWriter.write(xmlResponse);
		fileWriter.flush();
		fileWriter.close();
	}

	public void cricket_sendRequestTeamProfile(String teamId) throws Exception {

		System.setProperty("http.proxyHost", "proxy.pershing.com");
		System.setProperty("http.proxyPort", "8080");

		String url = "http://api.sportradar.us/cricket-t1/teams/" + teamId
				+ "/profile.xml?api_key=b93mepv44ny5r8dg7avwgpmd";

		URL obj = new URL(url);

		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		int responseCode = con.getResponseCode();

		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		String xmlResponse = null;

		if (responseCode == HttpURLConnection.HTTP_OK) {

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}

			in.close();
			xmlResponse = response.toString();

		}

		File myFile = new File("C:\\workspace-mars\\XBBNHC\\SportsCenter\\WebContent\\cricketTeamProfileXml.xml");
		FileWriter fileWriter = new FileWriter(myFile, false); // true to append
		                                                     // false to overwrite.
		fileWriter.write(xmlResponse);
		fileWriter.close();
	}

	public String cricket_sendRequestPlayerProfile(String playerId) throws Exception {

		System.setProperty("http.proxyHost", "proxy.pershing.com");
		System.setProperty("http.proxyPort", "8080");

		String url = "http://api.sportradar.us/cricket-t1/players/"+playerId+"/profile.xml?api_key=b93mepv44ny5r8dg7avwgpmd";

		URL obj = new URL(url);

		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		// List<Schedule> scheduleList = new ArrayList<Schedule>();

		// con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();

		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		String xmlResponse = null;

		if (responseCode == HttpURLConnection.HTTP_OK) {

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}

			in.close();
			xmlResponse = response.toString();

		}

		return xmlResponse;
	}
	
	
	public String soccer_RequestDailySchedule() throws Exception {

		System.setProperty("http.proxyHost", "proxy.pershing.com");
		System.setProperty("http.proxyPort", "8080");

		String url = "https://api.sportradar.us/soccer-t3/eu/en/schedules/2017-04-01/schedule.xml?api_key=cbzjxaw8m99pscjbut3mfseu";
		//String url="http://api.sportradar.us/cricket-t1/matches/2017/04/16/schedule.xml?api_key=b93mepv44ny5r8dg7avwgpmd";
		URL obj = new URL(url);

		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		System.out.println("opening connction in soccer_RequestDailySchedule.");
		// optional default is GET
		con.setRequestMethod("GET");
		
		// List<Schedule> scheduleList = new ArrayList<Schedule>();

		// con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		
		
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		String xmlResponse = null;

		if (responseCode == HttpURLConnection.HTTP_OK) {

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}

			in.close();
			xmlResponse = response.toString();

		}

		return xmlResponse;
	}
	
	
	public String soccer_RequestMatchSummary(String matchId) throws Exception {

		System.setProperty("http.proxyHost", "proxy.pershing.com");
		System.setProperty("http.proxyPort", "8080");

		String url = "https://api.sportradar.us/soccer-t3/eu/en/matches/"+matchId+"/summary.xml?api_key=cbzjxaw8m99pscjbut3mfseu";

		URL obj = new URL(url);

		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		// List<Schedule> scheduleList = new ArrayList<Schedule>();

		// con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();

		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		String xmlResponse = null;

		if (responseCode == HttpURLConnection.HTTP_OK) {

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}

			in.close();
			xmlResponse = response.toString();

		}

		return xmlResponse;
	}
	
	public String soccer_RequestMatchProbablity(String matchId) throws Exception {

		System.setProperty("http.proxyHost", "proxy.pershing.com");
		System.setProperty("http.proxyPort", "8080");

		String url = "https://api.sportradar.us/soccer-t3/eu/en/matches/"+matchId+"/probabilities.xml?api_key=cbzjxaw8m99pscjbut3mfseu";

		URL obj = new URL(url);

		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		// List<Schedule> scheduleList = new ArrayList<Schedule>();

		// con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();

		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		String xmlResponse = null;

		if (responseCode == HttpURLConnection.HTTP_OK) {

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}

			in.close();
			xmlResponse = response.toString();

		}

		return xmlResponse;
	}
	
	public String soccer_RequestTournamentInfo(String tournamentId) throws Exception {

		System.setProperty("http.proxyHost", "proxy.pershing.com");
		System.setProperty("http.proxyPort", "8080");

		String url = "https://api.sportradar.us/soccer-t3/eu/en/tournaments/"+tournamentId+"/info.xml?api_key=cbzjxaw8m99pscjbut3mfseu";

		URL obj = new URL(url);

		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		

		// optional default is GET
		con.setRequestMethod("GET");

		// List<Schedule> scheduleList = new ArrayList<Schedule>();

		// con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();

		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		String xmlResponse = null;

		if (responseCode == HttpURLConnection.HTTP_OK) {

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}

			in.close();
			xmlResponse = response.toString();

		}

		return xmlResponse;
	}
	
	public String soccer_sendRequestTeamProfile(String teamId) throws Exception {

		System.setProperty("http.proxyHost", "proxy.pershing.com");
		System.setProperty("http.proxyPort", "8080");

		String url = "https://api.sportradar.us/soccer-t3/eu/en/teams/"+teamId+"/profile.xml?api_key=cbzjxaw8m99pscjbut3mfseu";

		URL obj = new URL(url);

		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		int responseCode = con.getResponseCode();

		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		String xmlResponse = null;

		if (responseCode == HttpURLConnection.HTTP_OK) {

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}

			in.close();
			xmlResponse = response.toString();

		}

		return xmlResponse;
	}
	
	public String tennis_RequestDailySchedule() throws Exception {

		System.setProperty("http.proxyHost", "proxy.pershing.com");
		System.setProperty("http.proxyPort", "8080");

		String url = "http://api.sportradar.us/tennis-t2/en/schedules/2017-04-18/schedule.xml?api_key=x6g35jsh63ykjd6k9e8jxb5a";

		URL obj = new URL(url);

		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		int responseCode = con.getResponseCode();

		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		String xmlResponse = null;

		if (responseCode == HttpURLConnection.HTTP_OK) {

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}

			in.close();
			xmlResponse = response.toString();

		}

		return xmlResponse;
	}
	
	public String tennis_sendRequestMatchSummary(String matchId) throws Exception {

		System.setProperty("http.proxyHost", "proxy.pershing.com");
		System.setProperty("http.proxyPort", "8080");

		String url = "http://api.sportradar.us/tennis-t2/en/matches/"+matchId+"/summary.xml?api_key=x6g35jsh63ykjd6k9e8jxb5a";

		URL obj = new URL(url);

		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		int responseCode = con.getResponseCode();

		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		String xmlResponse = null;

		if (responseCode == HttpURLConnection.HTTP_OK) {

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}

			in.close();
			xmlResponse = response.toString();

		}

		return xmlResponse;
	}
	
	public void tennis_sendRequestPlayerRankings() throws Exception {

		System.setProperty("http.proxyHost", "proxy.pershing.com");
		System.setProperty("http.proxyPort", "8080");

		String url = "http://api.sportradar.us/tennis-t2/en/players/rankings.xml?api_key=x6g35jsh63ykjd6k9e8jxb5a";

		URL obj = new URL(url);

		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		int responseCode = con.getResponseCode();

		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		String xmlResponse = null;

		if (responseCode == HttpURLConnection.HTTP_OK) {

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}

			in.close();
			xmlResponse = response.toString();

		}
		File myFile = new File("C:\\workspace-mars\\XBBNHC\\SportsCenter\\WebContent\\tennisRankingsXml.xml");
		FileWriter fileWriter = new FileWriter(myFile, false); // true to append
		                                                     // false to overwrite.
		fileWriter.write(xmlResponse);
		fileWriter.close();

		
	}
	
	public String tennis_sendRequestDoublesRankings() throws Exception {

		System.setProperty("http.proxyHost", "proxy.pershing.com");
		System.setProperty("http.proxyPort", "8080");

		String url = "http://api.sportradar.us/tennis-t2/en/double_teams/rankings.xml?api_key=x6g35jsh63ykjd6k9e8jxb5a";

		URL obj = new URL(url);

		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		int responseCode = con.getResponseCode();

		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		String xmlResponse = null;

		if (responseCode == HttpURLConnection.HTTP_OK) {

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}

			in.close();
			xmlResponse = response.toString();

		}

		return xmlResponse;
	}
	
	
	
	
	
	
	/*
	 * // Write the parsed document to an xml file TransformerFactory
	 * transformerFactory = TransformerFactory.newInstance(); Transformer
	 * transformer = transformerFactory.newTransformer(); DOMSource source = new
	 * DOMSource(doc);
	 * 
	 * 
	 * StreamResult result = new StreamResult(new File("schedule.xml"));
	 * transformer.transform(source, result);
	 * 
	 * System.out.println(xmlResponse); return xmlResponse;
	 * 
	 * }
	 * 
	 * 
	 * 
	 * //ApiRequestSax apirequestSax = new ApiRequestSax();
	 * //apirequestSax.parseXml(con.getInputStream());
	 * 
	 * 
	 * 
	 * /*
	 * 
	 * 
	 * // Parse the given input DocumentBuilderFactory dbFactory =
	 * DocumentBuilderFactory.newInstance(); DocumentBuilder dBuilder =
	 * dbFactory.newDocumentBuilder(); InputSource is = new InputSource();
	 * is.setCharacterStream(new StringReader(xmlResponse)); Document doc =
	 * dBuilder.parse(is);
	 */

	/*
	 * // Write the parsed document to an xml file TransformerFactory
	 * transformerFactory = TransformerFactory.newInstance(); Transformer
	 * transformer = transformerFactory.newTransformer(); DOMSource source = new
	 * DOMSource(doc);
	 * 
	 * 
	 * StreamResult result = new StreamResult(new File("schedule.xml"));
	 * transformer.transform(source, result);
	 * 
	 * File file = new File("schedule.xml");
	 */

	/*
	 * JAXBContext jaxbContext = JAXBContext.newInstance(Schedule.class);
	 * 
	 * Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	 * 
	 * Schedule schedule = (Schedule) jaxbUnmarshaller.unmarshal(new
	 * StringReader(xmlResponse));
	 * 
	 * System.out.println(schedule); //return schedule;
	 */

	/*
	 * 
	 * NodeList seriesNodeList = doc.getElementsByTagName("series");
	 * visitChildNodes(seriesNodeList); System.out.println(); scheduleList =
	 * saveScheduleList(seriesNodeList,doc); System.out.println();
	 * 
	 * } return scheduleList; } //return nodes;
	 * 
	 * public List<Schedule> saveScheduleList(NodeList seriesNodeList, Document
	 * doc) { System.out.println("in saveScheduleList function"); List<Schedule>
	 * resultList = new ArrayList<Schedule>();
	 * 
	 * for(int i=0; i<seriesNodeList.getLength(); i++) { Node seriesNode =
	 * seriesNodeList.item(i);
	 * 
	 * //NamedNodeMap seriesNodeMap = seriesNode.getAttributes();
	 * 
	 * String seriesName = seriesNode.getAttributes().item(1).getNodeValue();
	 * 
	 * //NodeList matchNodeList = seriesNode.getChildNodes(); NodeList
	 * matchNodeList = doc.getElementsByTagName("match");
	 * 
	 * for(int j=0; j<matchNodeList.getLength(); j++) { Node matchNode =
	 * matchNodeList.item(j);
	 * 
	 * String matchName = matchNode.getAttributes().item(1).getNodeValue();
	 * 
	 * String awayTeamId =
	 * matchNodeList.item(0).getAttributes().item(0).getNodeValue(); String
	 * awayTeamName =
	 * matchNodeList.item(0).getAttributes().item(1).getNodeValue(); String
	 * homeTeamId= matchNodeList.item(1).getAttributes().item(0).getNodeValue();
	 * String homeTeamName =
	 * matchNodeList.item(1).getAttributes().item(1).getNodeValue(); //String
	 * venue = matchNodeList.item(2).getAttributes().item(1).getNodeValue();
	 * //String city =
	 * matchNodeList.item(2).getAttributes().item(2).getNodeValue();
	 * 
	 * Schedule obj = new Schedule(seriesName, matchName, awayTeamName,
	 * awayTeamId, homeTeamName, homeTeamId, "LOLOL", "LOLOL");
	 * System.out.println(obj.getSeriesName()+"\n"+obj.getMatchName()+"\n"+obj.
	 * getAwayTeamId()+"\n"+obj.getAwayTeam()+"\n"+
	 * obj.getHomeTeamId()+"\n"+obj.getHomeTeam()+
	 * "\nVENUE\n+ obj.getCity()\n-----------\n");
	 * 
	 * 
	 * resultList.add(obj);
	 * 
	 * }
	 * 
	 * }
	 * 
	 * 
	 * return resultList; }
	 * 
	 */

	/*
	 * 
	 * private static void visitChildNodes(NodeList nList) { for (int temp = 0;
	 * temp < nList.getLength(); temp++) { Node node = nList.item(temp); if
	 * (node.getNodeType() == Node.ELEMENT_NODE) { System.out.println();
	 * System.out.println("Node Name = " + node.getNodeName() + "; Value = " +
	 * node.getTextContent()); //Check all attributes if (node.hasAttributes())
	 * { // get attributes names and values NamedNodeMap nodeMap =
	 * node.getAttributes(); for (int i = 0; i < nodeMap.getLength(); i++) {
	 * Node tempNode = nodeMap.item(i); System.out.println("Attr name : " +
	 * tempNode.getNodeName()+ "; Value = " + tempNode.getNodeValue()); } if
	 * (node.hasChildNodes()) { //We got more childs; Let's visit them as well
	 * visitChildNodes(node.getChildNodes()); } } } } }
	 * 
	 * 
	 */

	// HTTP POST request
	public void sendPost() throws Exception {

		String url = "https://selfsolve.apple.com/wcResults.do";
		URL obj = new URL(url);
		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

		// add request header
		con.setRequestMethod("POST");
		// con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

		String urlParameters = "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";

		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		// print result
		System.out.println(response.toString());

	}

}
