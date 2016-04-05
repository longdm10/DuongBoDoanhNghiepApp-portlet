<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ include file="/html/init.jsp"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<portlet:defineObjects />
<%
PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setParameter("jspPage", "/html/hspttndracangbien/edit.jsp");
portletURL.setParameter("type", "6");
%>
<div id="title"></div>
<div id="action">
	<a href="<%=portletURL.toString()%>">aaaassssssss</a>
</div>
<div>
	<table>
		<tr>
			<th>STTssss</th>
			<th><%= LanguageUtil.get(pageContext, "history") %></th>
			<th><%= LanguageUtil.get(pageContext, "registerNo") %></th>
			<th></th>
		</tr>
		<tr></tr>
	</table>
</div>
