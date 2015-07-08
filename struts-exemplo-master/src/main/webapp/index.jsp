<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insert page="/pages/tiles/template.jsp">
   <tiles:put name="head" value="/pages/tiles/head.jsp" />
   <tiles:put name="header" value="/pages/tiles/header.jsp" />
   <tiles:put name="menu" value="/pages/tiles/menu.jsp" />
   <tiles:put name="body" value="/pages/welcome.jsp" />
   <tiles:put name="footer" value="/pages/tiles/footer.jsp" />
</tiles:insert> 