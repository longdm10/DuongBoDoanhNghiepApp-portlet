<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongbo.utils.CommonUtils"%>
<%@page import="com.liferay.portal.model.Organization"%>
<%@page import="com.liferay.portal.model.User"%>
<%@ include file="/html/init.jsp"%>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java"%>
<%
boolean roleCheck = CommonUtils.checkRoleName(themeDisplay, Constants.MTYT_KeTOAN);

if (roleCheck) {
	// La vai tro ke toan.
	%>
	<jsp:include page="/html/canbo/search_content_ketoan.jsp"></jsp:include>
	<%
} else {
%>
	<jsp:include page="/html/canbo/search_content.jsp"></jsp:include>
<%
}
%>
