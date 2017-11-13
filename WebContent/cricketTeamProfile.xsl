<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:t="http://feed.elasticstats.com/schema/cricket/cb/v1/teams-profile.xsd">


	<xsl:template match="/">
		<html>
			<body>
				<h1>
					<xsl:value-of select="/profile/team/@name" />
				</h1>
				<xsl:apply-templates />
			</body>
		</html>
	</xsl:template>

	<xsl:template match="t:lineup">
		
		<table class="table table-condensed">
			<thead>
				<tr>
					<th>Player Name</th>
					<th>Nickname</th>
					<th>Batting Style</th>
					<th>Bowling Style</th>
					<th>Date Of Birth</th>
				</tr>
			</thead>
		<xsl:for-each select="t:player">
			<tr>
				<td>
					<xsl:value-of select="@full_name"/>
				
				</td>
				<td>
					<xsl:value-of select="@nick_name" />
				</td>
				<td>
					<xsl:value-of select="@batting_style" />
				</td>
				<td>
					<xsl:value-of select="@bowling_style"/>
				
				</td>
				<td>
					<xsl:value-of select="@birth_date" />
				</td>

			</tr>
			</xsl:for-each>

		</table>
	</xsl:template>
</xsl:stylesheet>