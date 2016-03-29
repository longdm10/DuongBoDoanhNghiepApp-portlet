<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongbo.portlet.canbo.CanBoAction"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
Object maPhanNhom = renderRequest.getPortletSession().getAttribute(Constants.MA_PHAN_NHOM_HO_SO);
String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY);
String thuLyHoSo1 = "";
String thuLyHoSo2 = "";
String thuLyHoSo3 = "";

String thanhPhanHoSo1 = "";
String thanhPhanHoSo2 = "";
String thanhPhanHoSo3 = "";

String tienTrinhHoSo1 = "";
String tienTrinhHoSo2 = "";
String tienTrinhHoSo3 = "";

String idTab1 = "0";
%>
<script type="text/javascript">
var idTab = 0;
</script>
<%

if (Constants.XU_LY_TT.compareToIgnoreCase(thanhPhanXuLy) == 0) {
	tienTrinhHoSo1 = "TabbedPanelsTabFocused TabbedPanelsTabSelected";
	tienTrinhHoSo2 = "TabbedPanelsContentVisible";
	tienTrinhHoSo3 = "block";
	
	thanhPhanHoSo1 = "";
	thanhPhanHoSo2 = "";
	thanhPhanHoSo3 = "none";
	
	thuLyHoSo1 = "";
	thuLyHoSo2 = "";
	thuLyHoSo3 = "none";
	
	idTab1 = "2";
} else if (Constants.XU_LY_TLHS.compareToIgnoreCase(thanhPhanXuLy) == 0) {
	thuLyHoSo1 = "TabbedPanelsTabFocused TabbedPanelsTabSelected";
	thuLyHoSo2 = "TabbedPanelsContentVisible";
	thuLyHoSo3 = "block";
	
	tienTrinhHoSo1 = "";
	tienTrinhHoSo2 = "";
	tienTrinhHoSo3 = "none";
	
	thanhPhanHoSo1 = "";
	thanhPhanHoSo2 = "";
	thanhPhanHoSo3 = "none";
	
	idTab1 = "1";
} else {
	thanhPhanHoSo1 = "TabbedPanelsTabFocused TabbedPanelsTabSelected";
	thanhPhanHoSo2 = "TabbedPanelsContentVisible";
	thanhPhanHoSo3 = "block";
	
	tienTrinhHoSo1 = "";
	tienTrinhHoSo2 = "";
	tienTrinhHoSo3 = "none";
	
	thuLyHoSo1 = "";
	thuLyHoSo2 = "";
	thuLyHoSo3 = "none";
	
	idTab1 = "0";
}
%>
<h4 class="PL15 BGT BOB font14 col-xs-12">Thông tin hồ sơ</h4>
<div class="P10 col-xs-12">
	<jsp:include page="/html/canbo/thulyhs/duongbo/tongcuc/hoso_detail_content.jsp"></jsp:include>
	
</div>