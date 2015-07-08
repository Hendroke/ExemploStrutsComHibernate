<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>

<html lang="pt-br">
<head>
<tiles:insert attribute="head" />
</head>
<body>

	<div id="wrapper">

		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
			<tiles:insert attribute="header" />


			<div class="navbar-default sidebar" role="navigation">
				<div class="hero-unit">
					<tiles:insert attribute="menu" />
				</div>
			</div>
		</nav>

		<div id="page-wrapper">
			<tiles:insert attribute="body" />
		</div>


		<footer>
			<tiles:insert attribute="footer" />
		</footer>

	</div>

</body>
</html>