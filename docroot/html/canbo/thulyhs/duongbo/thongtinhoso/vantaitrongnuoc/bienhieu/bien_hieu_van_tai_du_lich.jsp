<%@page import="java.util.Date"%>
<%@page import="vn.dtt.duongbo.maudon.model.DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich"%>
<%@page import="vn.dtt.duongbo.maudon.xml.MauDonFactory"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietTrungLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung"%>
<%@page import="vn.dtt.duongbo.business.DanhMucConstants"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcBieuMauHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoBieuMauLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo"%>
<%@page import="vn.dtt.duongbo.utils.DoanhNghiepUtils"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.duongbo.portlet.doanhnghiep.DoanhNghiepAction"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<link rel="stylesheet" href="<%=request.getContextPath()%>/css/tipsy.css" type="text/css" media="screen" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/jquery.alerts.css" type="text/css" media="screen" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/jquery-ui.css" type="text/css" media="screen" />

<%! private static Log _log = LogFactoryUtil.getLog(DoanhNghiepAction.class); %>

<%
	_log.info("/html/canbo/thulyhs/duongbo/thongtinhoso/vantaitrongnuoc/bienhieu/bien_hieu_van_tai_du_lich.jsp");
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	
	long idNoiDungHoSo = ParamUtil.getLong(request, Constants.ID_NOI_DUNG_HO_SO);
	
	String noiDungXmml = ParamUtil.getString(request, "noiDungXmml");
	
	String linhVucKinhDoanh = ParamUtil.getString(request, "linhVucKinhDoanh");
	
	long bieuMauHoSoId = 0;
	
	_log.info("-------------------loaiTTHC in cap_phep : " + ParamUtil.getString(request, Constants.LOAI_THU_TUC_HANH_CHINH));
	_log.info("-------------------idNoiDungHoSo : " + idNoiDungHoSo);
	
	TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(thuTucHanhChinhId);
	TthcThanhPhanHoSo thanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.fetchTthcThanhPhanHoSo(thanhPhanHoSoId);
	TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
	
	long userId = PortalUtil.getUserId(request);
	DnDoanhNghiep doanhNghiep = DoanhNghiepUtils.getDoanhNghiepByUserId(userId);
	
	TthcBieuMauHoSo bieuMauHoSo = null;
	List<TthcThanhPhanHoSoBieuMau> allThanhPhanHoSoBieuMau = TthcThanhPhanHoSoBieuMauLocalServiceUtil.findByThanhPhanHoSoId(thanhPhanHoSoId);
	if (allThanhPhanHoSoBieuMau != null && allThanhPhanHoSoBieuMau.size() > 0) {
		bieuMauHoSo = TthcBieuMauHoSoLocalServiceUtil.fetchTthcBieuMauHoSo(allThanhPhanHoSoBieuMau.get(0).getBieuMauHoSoId());
		if (bieuMauHoSo != null) {
			bieuMauHoSoId = bieuMauHoSo.getId();
		}
	}
	
	DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich donLienVan = null;
	TthcNoidungHoSo noidungHoSo = null;
	if(idNoiDungHoSo > 0){
		noidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(idNoiDungHoSo);
	}
	
	if (Validator.isNotNull(noidungHoSo) && Validator.isNotNull(noidungHoSo.getNoiDungXml())) {
		
		_log.info("bien_hieu_van_tai_du_lich--noidungHoSo--" + noidungHoSo.getId());
	
		List<Object> lstObj = MauDonFactory.converXMLMessagesContentToObject(noidungHoSo.getNoiDungXml());
		if (lstObj != null && lstObj.size() > 0) {
			donLienVan = (DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich) lstObj.get(0);
		}
	}
	
	//TthcNoidungHoSo tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.findByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId, bieuMauHoSoId, thanhPhanHoSoId);
	List<DmDataItem> lstTinhThanh = DmDataItemLocalServiceUtil.findTinhThanh();
	
	
	PortletURL backUrl = renderResponse.createRenderURL();
	backUrl.setParameter("jspPage", "/html/canbo/thulyhs/duongbo/thongtinhoso/vantaitrongnuoc/bienhieu/thanh_phan_ho_so.jsp");
	backUrl.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	backUrl.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	backUrl.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
	
	
	PortletURL xemTruocNoiDung = renderResponse.createActionURL();
	xemTruocNoiDung.setParameter(ActionRequest.ACTION_NAME, "xemTruocNoiDung");
	xemTruocNoiDung.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	xemTruocNoiDung.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	xemTruocNoiDung.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
	xemTruocNoiDung.setParameter(Constants.ID_BIEU_MAU_HO_SO, String.valueOf(bieuMauHoSoId));
	xemTruocNoiDung.setParameter(Constants.PATH_MAUDON_VIEW_PDF, "/html/canbo/thulyhs/duongbo/thongtinhoso/vantaitrongnuoc/bienhieu/bien_hieu_van_tai_du_lich_view.jsp");
	
//	List<DmDataItem> lstNhanHieuPhuongTien = DmDataItemLocalServiceUtil.findByGroupId(DanhMucConstants.DM_NHANHIEU);
//	List<DmDataItem> lstTuyenHoatDongVietTrung = DmDataItemLocalServiceUtil.findByGroupId(DanhMucConstants.DM_TUYENVNTQ);
//	List<QlvtPhuongTienDangKyVietTrung> lstQlvtPhuongTienDangKyVietTrungs = QlvtPhuongTienDangKyVietTrungLocalServiceUtil.findByNoiDungHoSoId(idNoiDungHoSo);
	
%>
<aui:form action="<%=xemTruocNoiDung.toString()%>" name="myForm" id="myForm" method="POST">
<h4 class="PL15 BGT BOB font14 col-xs-12"><%=bieuMauHoSo.getTenBieuMau()%></h4>
<div class="P10 col-xs-12">
	<div class="BGT noidung">
		<div class="box800">
				<div class="col-sm-12">
					<p class="pull-left text-center">
						<b>Công ty <%=doanhNghiep.getTenDoanhNghiep().toUpperCase()%></b><br>
						<!-- 					<b>Đề nghị cấp giấy phép</b><br> -->
						<b>-------</b>
					</p>
					
					<p class="pull-right text-center">
					
					<div class="text-center col-xs-5 MB20 pull-right PA0">
					<p >
						<b>Số: </b>
						<input type="text" name="numBer" id="numBer" class="form-control">
					</div>
				</div>
			<h3 class="tle text-center">XE NỘI BỘ"</h3>
			<div class="col-sm-12">
				<label class="pull-left w250">Đơn vị: </label>
				<input type="text" name="donVi" id="donVi" class="form-control" >
				<label class="pull-left w250">Biển đăng ký: </label>
				<input type="text" name="bienDangKy" id="bienDangKy" class="form-control" >
				<label class="pull-left w250">Có giá trị đến: </label>
				<input type="text" name="giatriDen" id="giatriDen" class="form-control">
				<div class="text-center col-xs-5 MB20 pull-right PA0">
					<p >
						<div class="text-center col-xs-12 MB20">
							<label class="textlabel col-xs-2 col-xs-offset-3" style="width: 9.1%;">Sở GTVT </label>
							<%
							List<DmDataItem> dmCoQuanCapPhep = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_CO_QUAN_CAP_PHEP);
							%>
							<div class="col-xs-5">
								<select class="form-control" id="coQuanGui" name="coQuanGui">
									<option value="">-- Chọn cơ quan cấp phép --</option>
									<%
									if(dmCoQuanCapPhep != null && dmCoQuanCapPhep.size() >0){
										for(DmDataItem item : dmCoQuanCapPhep){
									%>
										<option value="<%=item.getCode()%>" <%=((donLienVan == null)? "" : ((donLienVan.getCoQuanGui() == null) ? "" : donLienVan.getCoQuanGui().trim())).equals(item.getCode())? "selected='selected'" : ""%>><%=item.getName()%></option>
									<%
										}
									}
									%>
								</select>
							</div>
						</div>
				</div>		
			<!-- ----------BUTTON---------------- -->
			<button class="btn btn-primary MT90" type="button" onclick="summitForm('<%=xemTruocNoiDung%>')">Xem lại trước khi lưu</button>
			<button class="btn btn-primary MT90" type="button" onclick="summitForm2('<%=backUrl%>')">Quay lại</button>
		</div>
	</div>
</div>
</aui:form>


<portlet:resourceURL var="updateContentURL" ></portlet:resourceURL>
<script type="text/javascript">
	
	var idTenThuongMai = "" ;
	idTenThuongMai = "#textTenThuongMai";
	
	
	jQuery(document).ready(function($) {
		$(idTenThuongMai).keypad({keypadOnly: false, layout: _specChar, prompt: _promptTitle});
	});

	function summitForm2(url) {
		document.getElementById('<portlet:namespace />myForm').action = url;
		document.getElementById('<portlet:namespace />myForm').submit();
		}
	
	function summitForm(url) {

		

		
		var tinhThanh = document.getElementById("tinhThanh").value;

		var coQuanGui = document.getElementById("coQuanGui").value;

		
		var soGiayPhepKinhDoanh = document.getElementById("soGiayPhepKinhDoanh").value;
		var ngayCap = document.getElementById("ngayCap").value;
		var linhVucKinhDoanh = document.getElementById("linhVucKinhDoanh").value;
		var soXeDeNghiCapBH = document.getElementById("soXeDeNghiCapBH").value;

		
		
		//var textFax = document.getElementById("textFax").value;
		//var textFaxDVDK = document.getElementById("textFaxDVDK").value;
		//var kiemTraTF = isNaN(textFax);
		//var kiemTraTF2 = isNaN(textFaxDVDK);
		//var kiemTraDT = isNaN(dienThoai);
		//var kiemTraDT2 = isNaN(textDienThoaiDVDK);
		
		

		
		
		if (tinhThanh == "") {
			alert("Lựa chọn Tỉnh/Thành Phố");
			return false;
		}

		if (coQuanGui == "") {
			alert("Lựa chọn cơ quan cấp phép");
			return false;
		}
		
		if (soGiayPhepKinhDoanh == "") {
			alert("Số giấy phép kinh doanh nữ hành quốc tế không được để trống");
			return false;
		}
		if (ngayCap == "") {
			alert("Ngày cấp không được để trống");
			return false;
		}

		if (linhVucKinhDoanh == "") {
			alert("Chọn lĩnh vực kinh doanh ");
			return false;
		}
		
		if (soXeDeNghiCapBH == "") {
			alert("Số xe đề nghị cấp biển hiệu không được để trống ");
			return false;
		}
	
		//if (dienThoai.length < 10) {
		//	alert("Điện thoại phải lớn hơn 9 kí tự");
		//	return false;
	//	}
		//if (kiemTraTF == true) {
			//alert("Fax phải để ở định dạng số");
		//	return false;
	//	}
		document.getElementById('<portlet:namespace />myForm').action = url;
		document.getElementById('<portlet:namespace />myForm').submit();
	}
	



	

	function moveOptions(fromId,toId){
		$("#"+fromId+" option").each(function() {
			if(this.selected){			
				$('#'+toId).append($('<option>', { 
			        value: this.value,
			        text : this.text 
			    }));
				
				$(this).remove();
			}
		    
		});
	}

	function myFunction() {
		var x = document.getElementById("textFax").value;
		var soLuong = x.length;
		if (soLuong < 10) {
			alert("Fax lớn hơn 10 kí tự");
			return false;
		}
		if (soLuong > 15) {
			alert("Fax nhỏ hơn 15 kí tự");
			return false;
		}
	}

	function myFunction2() {
		var x = document.getElementById("textFaxDVDK").value;
		var soLuong = x.length;
		if (soLuong < 10) {
			alert("Fax lớn hơn 10 kí tự");
			return false;
		}
		if (soLuong > 15) {
			alert("Fax nhỏ hơn 15 kí tự");
			return false;
		}
	}
	function func_ShowPopUpThemPhuongTien() {
		$('#popUpThemPhuongTien').modal('show');
		/**
		$('#popUpThemPhuongTien').dialog({
			title : 'Tải biểu mẫu',
			resizable : false,
			modal : true,
			width : '700px',
			closeOnEscape : false,
			open : function() {
				jQuery('.ui-widget-overlay').bind('click', function() {
					$('#popUpThemPhuongTien').dialog('close');
				});
			}
		});
		*/
	}
	function func_ClosePopUpThemPhuongTien() {
		$('#popUpThemPhuongTien').modal('hide');
	}
</script>

<style>
	.aui p {
		margin: 10px 0 0px;
	}
	
	.title_right {
		border-bottom: none;;
	}
	
	.box {
		border: none;
		margin: 0px;
		padding: 0px;
		background-color: white;
	}
	.Bo2{
		border:solid 1px #ccc;
		border-radius:6px;
		padding:15px;
		height:150px;
	}
</style>


