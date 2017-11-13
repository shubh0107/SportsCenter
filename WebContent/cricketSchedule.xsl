<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:t="http://feed.elasticstats.com/schema/cricket/cb/v1/matches-schedule.xsd">


	<xsl:template match="/">
		<html>
			<body>
				<xsl:apply-templates />
			</body>
		</html>
	</xsl:template>

	<xsl:template match="t:series">


		<table class="table table-condensed">

			<thead>
				<tr>
					<th>Tournament</th>
					<th>Match No.</th>
					<th>Team 1</th>
					<th>Team 2</th>
					<th>Venue</th>
					<th>City</th>
				</tr>
			</thead>
			<xsl:for-each select="t:match">

				<tr>
					<td>
						<xsl:value-of select="../@name" />
					</td>
					<td>
						<xsl:value-of select="@name" />
					</td>
					<td>
						<xsl:value-of select="t:away/@name" />
					</td>
					<td>
						<xsl:value-of select="t:home/@name" />
					</td>
					<td>
						<xsl:value-of select="t:venue/@name" />
					</td>
					<td>
						<xsl:value-of select="t:venue/@city" />
					</td>
					<td>
						<form action="CricketMatchSummary" method="post">
							<textarea hidden="" name="matchId">
								<xsl:value-of select="@id" />
							</textarea>
							<button type="submit">Result</button>
						</form>
					</td>
				</tr>

			</xsl:for-each>
		</table>
	</xsl:template>
</xsl:stylesheet>