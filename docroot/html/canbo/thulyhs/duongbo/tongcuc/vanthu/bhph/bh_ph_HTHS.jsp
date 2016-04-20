<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String maThuTucHanhChinh = ParamUtil.getString(request, Constants.MA_THU_TUC_HANH_CHINH);
	String pageDes = maThuTucHanhChinh.contains("PH")?"PH".toLowerCase():"BH".toLowerCase();
%>
<liferay-util:include page="<%=\"/html/canbo/thulyhs/duongbo/tongcuc/vanthu/bhph/\"+pageDes+\"_HTHS.jsp\" %>" servletContext="<%=this.getServletContext() %>">
</liferay-util:include>