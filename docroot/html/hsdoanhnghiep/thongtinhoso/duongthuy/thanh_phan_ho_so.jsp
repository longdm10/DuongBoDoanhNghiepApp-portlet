
<%@ include file="/html/init.jsp"%>

<liferay-util:include page="/html/common/thanh_phan_ho_so.jsp" servletContext="<%= this.getServletContext() %>">
	<portlet:param name="jspThanhPhanHoSo" value="/html/hsdoanhnghiep/thongtinhoso/duongthuy/thanh_phan_ho_so.jsp"/>
	<portlet:param name="jspViewMauDon" value="/html/hsdoanhnghiep/thongtinhoso/duongthuy/thanh_phan_ho_so_view.jsp"/>
</liferay-util:include>
