<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%

long hoSoThuTucXuLyId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
TthcHoSoThuTuc hoSoThuTucXuLy = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucXuLyId);
if (hoSoThuTucXuLy.getTrangThaiHoSo().trim().equals(Constants.DOANH_NGHIEP_TRANG_THAI_HO_SO_DANG_XU_LY)) {
	%>
	<jsp:include page="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamcampuchia/thanh_phan_ho_so_view.jsp"></jsp:include>
	<%
} else {
	%>
	<jsp:include page="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamcampuchia/thanh_phan_ho_so.jsp"></jsp:include>
	<%
}
%>
