<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:t="http://feed.elasticstats.com/schema/cricket/cb/v1/matches-summary.xsd">


	<xsl:template match="/">
		<html>
			<body>
				<xsl:apply-templates />
			</body>
		</html>
	</xsl:template>

	<xsl:template match="t:match">

	
	
	
	
		<table class="table table-condensed">
		
				
					<tr>
						<td>
							Team 1
						</td>
						<td>
							<xsl:value-of select="t:home/@name" />
						</td>
						<td>
						<xsl:if test="t:results/@winner_id=t:home/@id">
							<b>WON</b>
						</xsl:if>
						<xsl:if test="t:results/@winner_id!=t:home/@id">
							<b>LOST</b>
						</xsl:if>
					</td>
						
					</tr>
					
					<tr>
						<td>
							Team 2
						</td>
						<td>
							<xsl:value-of select="t:away/@name" />
						</td>
						<td>
						<xsl:if test="t:results/@winner_id=t:away/@id">
							<b>WON</b>
						</xsl:if>
						<xsl:if test="t:results/@winner_id!=t:away/@id">
							<b>LOST</b>
						</xsl:if>				
					</td>
					</tr>
					<tr>
						<td>
							Man of the Match						
						</td>
						<td>						
						</td>
						<td>
							<b><xsl:value-of select="t:man_of_match/@full_name" /></b>
						</td>
					</tr>
					
					
					
					
					
<!-- 			<xsl:for-each select="t:match"> -->
					
<!-- 			</xsl:for-each> -->
			
			
							
			
		</table>
	</xsl:template>
</xsl:stylesheet>