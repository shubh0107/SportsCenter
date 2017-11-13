<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:t="http://schemas.sportradar.com/sportsapi/v1/tennis">

	<xsl:template match="/">
		<html>
			<body>
				<xsl:apply-templates />
			</body>
		</html>
	</xsl:template>

	<xsl:template match="t:ranking">


		<table class="table table-condensed">

			<thead>
				<tr>
					<th>WTA/ATP</th>
					<th>Rank</th>
					<th>Player Name</th>
					<th>Points</th>
					<th>Nationality</th>
				</tr>
			</thead>
			<xsl:for-each select="t:player_ranking">

				<tr>
					<td>
						<xsl:value-of select="../@name" />
					</td>
					<td>
						<xsl:value-of select="@rank" />
					</td>
					<td>
						<xsl:value-of select="t:player/@name" />
					</td>
					<td>
						<xsl:value-of select="@points" />
					</td>
					<td>
						<xsl:value-of select="t:player/@nationality" />
					</td>
				</tr>

			</xsl:for-each>
		</table>
	</xsl:template>
</xsl:stylesheet>