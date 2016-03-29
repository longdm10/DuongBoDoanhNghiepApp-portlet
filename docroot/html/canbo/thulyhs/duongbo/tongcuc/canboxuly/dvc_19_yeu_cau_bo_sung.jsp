<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@ include file="/html/init.jsp"%>

<liferay-util:include page="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/dvc_19_form_xu_ly.jsp" servletContext="<%=application %>">
	<portlet:param name="<%= Constants.TRANG_THAI_HO_SO %>" value="<%= Constants.DOANH_NGHIEP_TRANG_THAI_HO_SO_CHO_BO_SUNG %>"/>
</liferay-util:include>