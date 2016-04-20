<%@page import="vn.dtt.duongbo.business.MotCuaBusiness"%>
<%@page import=" vn.dtt.duongbo.business.Constants"%>
<%@page
	import="vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepImpl"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page
	import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.utils.format.DateUtils"%>
<%@page import="vn.dtt.duongbo.utils.format.FormatData"%>
<%@page import="vn.dtt.duongbo.utils.format.ConvertUtil"%>
<%@page
	import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucImpl"%>
<%@page
	import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="java.util.Date"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>



<style>
.lb_name {
	font-weight: bold;
}
</style>
<%
	long lHoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	String phieuXuLyId = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY);
	String myViewDetailDocument = ParamUtil.getString(request, "myViewDetailDocument");
%>
<input type="hidden" value="<%=myViewDetailDocument %>" id="myViewDetailDocument" />
<div class="BGT noidung">
	<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/info_cong_van.jsp"%>
	<div class="col-xs-12">
		<ul class="nav nav-tabs">
			<li id="myTabs1"><a data-toggle="tab" href="#home">Thành phần hồ sơ</a></li>
			<li id="myTabs2" class="active"><a data-toggle="tab" href="#menu1">Thụ lý
					hồ sơ</a></li>
			<li id="myTabs3"><a data-toggle="tab" href="#menu2">Tiến trình xử lý</a></li>
		</ul>

		<div class="p30 tab-content">
			<div id="home" class="tab-pane fade" style="padding: 15px;">
				<%@ include file="/html/canbo/thanhphanhs/hoso_detail_content_tphs.jsp"%>
			</div>
			<div id="menu1" class="tab-pane fade in active">
				<jsp:include page="/html/canbo/thulyhs/duongbo/tongcuc/hoso_detail_content_tlhs.jsp"></jsp:include>
			</div>
			<div id="menu2" class="tab-pane fade">
			<%@ include file="/html/canbo/tientrinh/hoso_detail_content_tlhs_tt.jsp"%>
				
			</div>
		</div>
	</div>



	<div class="clear"></div>
</div>
<script type="text/javascript">
AUI().ready(function(A){
	var capTinhInput = $("#myViewDetailDocument");
	if(capTinhInput.val() == 1){
		$("#myTabs1").removeClass( "active" ).addClass( "active" );
		$("#myTabs2").removeClass( "active" );
		$("#myTabs3").removeClass( "active" );
		$("#home").removeClass( "in active" ).addClass( "in active" );
		$("#menu1").removeClass( "in active" );
		$("#menu2").removeClass( "in active" );
		}
});
	$( "#myTabs3" ).click(function() {
		$("#tabs-2").css("display", "none");
		$("#menu2").css("display", "block");
		$("#home").css("display", "none");
	});
	$( "#myTabs2" ).click(function() {
		$("#tabs-2").css("display", "block");
		$("#menu2").css("display", "none");
		$("#home").css("display", "none");
	});
	$( "#myTabs1" ).click(function() {
		$("#tabs-2").css("display", "block");
		$("#menu2").css("display", "none");
		$("#home").css("display", "block");
	});
</script>