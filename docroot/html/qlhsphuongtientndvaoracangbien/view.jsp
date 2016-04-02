<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<portlet:defineObjects />

<%
String type = PortalUtil.getOriginalServletRequest(request).getParameter("type");
System.out.println("abc " );
%>
<table width="1600px">
	<tr>
		<td width="200px" valign="top" >
		<jsp:include page="/html/menudb/trang_menu_left.jsp"></jsp:include>
		</td>
		<td valign="top">
		<% if(type.equals("1")) { %>
			
		<% } else if(type.equals("2")) { %>
			
		<% } else if(type.equals("3")) { %>
			
		<% } else if(type.equals("4")) { %> 
			
		<% } else if(type.equals("5")) { %> 
			<%@ include file="/html/hspttdnvaocangbien/view.jsp" %>
		<% } else if(type.equals("6")) { %> 
			<%@ include file="/html/hspttndracangbien/view.jsp" %>
		<% } else if(type.equals("7")) { %>
			
		<% } %>
		</td>
	</tr>
</table>
