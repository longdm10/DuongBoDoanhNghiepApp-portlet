<%@page import="vn.dtt.duongbo.business.DanhMucConstants"%>
<%@page import="vn.dtt.duongbo.maudon.model.DeNghiGioiThieuXinCapGPVTLoaiDVietNam"%>
<%@page import="vn.dtt.duongbo.utils.format.FormatData"%>
<%@page import="vn.dtt.duongbo.maudon.xml.MauDonFactory"%>
<%@page import="vn.dtt.duongbo.maudon.model.DonXinCapGPVTLoaiDCuaPTTrungQuoc"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
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
	_log.info("/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/gioi_thieu_cap_giay_phep_van_tai_loai_D.jsp");
	
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	
	long idNoiDungHoSo = ParamUtil.getLong(request, Constants.ID_NOI_DUNG_HO_SO);
	
	String noiDungXmml = ParamUtil.getString(request, "noiDungXmml");
	
	long bieuMauHoSoId = 0;
	
	List<DmDataItem> lstCoQuanCapPhep = DanhMucConstants.getCoQuanCapPhep(thuTucHanhChinhId+"");
	
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
	_log.info("------/maBieuMauHoSo---------" + bieuMauHoSo.getMaBieuMau());
	_log.info("------/thuTucHanhChinh-------" + thuTucHanhChinh.getMaThuTuc());
	
	DeNghiGioiThieuXinCapGPVTLoaiDVietNam donLienVan = null;
	TthcNoidungHoSo noidungHoSo = null;
	if(idNoiDungHoSo > 0){
		noidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(idNoiDungHoSo);
	}
	
	if (Validator.isNotNull(noidungHoSo) && Validator.isNotNull(noidungHoSo.getNoiDungXml())) {
		
		_log.info("cap_giay_phep_van tai loai D--noidungHoSo--" + noidungHoSo.getId());
		_log.info("cap_giay_phep_van tai loai D--noidungHoSo--" + noidungHoSo.getNoiDungXml());
	
		List<Object> lstObj = MauDonFactory.converXMLMessagesContentToObject(noidungHoSo.getNoiDungXml());
		if (lstObj != null && lstObj.size() > 0) {
			donLienVan = (DeNghiGioiThieuXinCapGPVTLoaiDVietNam) lstObj.get(0);
		}
	}
	
	if (donLienVan == null) { donLienVan = MauDonFactory.converXmlToObject(noiDungXmml, new DeNghiGioiThieuXinCapGPVTLoaiDVietNam()); }
	
	List<DmDataItem> lstTinhThanh = DanhMucConstants.getTinhThanh();
	
	
	PortletURL backUrl = renderResponse.createRenderURL();
	backUrl.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/thanh_phan_ho_so.jsp");
	backUrl.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	backUrl.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	backUrl.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
	
	
	PortletURL xemTruocNoiDung = renderResponse.createActionURL();
	xemTruocNoiDung.setParameter(ActionRequest.ACTION_NAME, "xemTruocNoiDung");
	xemTruocNoiDung.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	xemTruocNoiDung.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	xemTruocNoiDung.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
	xemTruocNoiDung.setParameter(Constants.ID_BIEU_MAU_HO_SO, String.valueOf(bieuMauHoSoId));
	xemTruocNoiDung.setParameter(Constants.PATH_MAUDON_VIEW_PDF, "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/gioi_thieu_cap_giay_phep_van_tai_loai_D_view.jsp");
%>
<aui:form action="<%=xemTruocNoiDung.toString()%>" name="myForm" id="myForm" method="POST">

<h4 class="PL15 BGT BOB font14 col-xs-12"><%=bieuMauHoSo.getTenBieuMau()%></h4>
<div class="P10 col-xs-12">
	<div class="BGT noidung">
		<div class="box1000">
			<div class="col-sm-12">
				<p class="pull-left text-center">
					<b><%=doanhNghiep.getTenDoanhNghiep().toUpperCase()%></b><br>
<!-- 					<b>Đề nghị cấp giấy phép</b><br> -->
					<b>-------</b>
				</p>
				<p class="pull-right text-center">
					<b>CỘNG HÒA XÃ HỘI CHỦ NGHĨA VIỆT NAM<br/>
					SOCIALIST REPUBLIC OF VIETNAM<br/>
					Độc lập - Tự do - Hạnh phúc<br/>
					Independence - Freedom - Happiness</b><br/>
					--------------------
				</p>
			</div>
			
			<h3 class="tle text-center">ĐƠN ĐỀ NGHỊ<br/>GIỚI THIỆU XIN CẤP GIẤY PHÉP VẬN TẢI LOẠI D<br/>APPLICATION FORM FOR REQUESTING TO ISSUE TRANSPORT PERMIT - D</h3>
			<div class="col-sm-12">
			<div class="text-center col-xs-12 MB20">
				<label class="textlabel col-xs-2 col-xs-offset-3" style="width: 9.1%;">Kính gửi:</label>
				<div class="col-xs-5">
					<select class="form-control" id="coQuanGui" name="coQuanGui">
						<option value="">-- Lựa chọn cơ quan cấp phép --</option>
						<%
						for (DmDataItem item : lstCoQuanCapPhep) {
							%>
							<option value="<%=item.getCode()%>" <%=((donLienVan == null)? "" : ((donLienVan.getCoQuanGui() == null) ? "" : donLienVan.getCoQuanGui().trim())).equals(item.getCode())? "selected='selected'" : ""%>><%=item.getName()%></option>
							<%
						}
						%>
					</select>
				</div>
			</div>
				<p class="text-center" style="margin:-10px 0 20px"><label>To</label><span class="textU">: Directorate for Roads of Viet Nam</span></p>
				<label class="pull-left w250">1. Tên đơn vị vận tải (Transport organization)</label><p class="textU">: <%=doanhNghiep.getTenDoanhNghiep().toUpperCase()%></p>
				
				<label class="pull-left w250">2. Địa chỉ (Address)</label>
				<div class="col-sm-8 PA0">
					<label class="pull-left" style="height: 30px;vertical-align: middle;">: </label>
					<input type="text" id="diaChiDoanhNghiep" name="diaChiDoanhNghiep" style="width: 90%" value="<%=doanhNghiep.getDiaChi()%>" class="form-control">
				</div>
				<div class="clear"></div>
				<div style="height: 5px">&nbsp</div>
				
				<label class="pull-left w250">3. Số điện thoại (Tel)</label><p><span class="pull-left">: <%=doanhNghiep.getDienThoai()%></span>
				<span class="pull-left w250 text-center"><b>Số Fax (Fax)</b></span>: <%=doanhNghiep.getFax()%></p>
				<label class="pull-left w250">4. Địa chỉ Email (Email)</label><p>: <%=doanhNghiep.getEmail()%></p>
				<label>5. Giấy phép (vận chuyển hàng quá khổ, quá tải hoặc hàng nguy hiểm)</label>
				<label class="col-xs-12">Permit (for carrying overload, overweight or dangerous goods)</label>
				<div class="row M0">
					<div class="col-xs-4 form-group">
					    <label class="textlabel" for="sel1">Số (No) <span class="red">*</span> :</label><br>
					    <label class="textlabel" for="sel1">Do cơ quan của Việt Nam<br/>(Issued by Vietnamese authority) <span class="red">*</span> :</label><br>
					    <label class="textlabel" for="sel1">Cấp ngày (Date) <span class="red">*</span> :</label>
					</div>
					<div class="col-xs-8 form-group">
						<input type="text" name="soGiayPhepVCVN" id="soGiayPhepVCVN" class="form-control" value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getSoGiayPhepVC())? "" : donLienVan.getSoGiayPhepVC())%>">
						<input type="text" name="noiCapGiayPhepVCVN" id="noiCapGiayPhepVCVN" class="form-control" value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getNoiCapGiayPhepVC())? "" : donLienVan.getNoiCapGiayPhepVC())%>">
						<div class="input-group">
							<input type="text" id="ngayCapGiayPhepVCVN" name="ngayCapGiayPhepVCVN" value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getNgayCapGiayPhepVC())? "" : donLienVan.getNgayCapGiayPhepVC())%>" class="form-control" onclick="gtCalendar('ngayCapGiayPhepVCVN')">
							<span class="input-group-addon" onclick="gtCalendar('ngayCapGiayPhepVCVN')"><i class="fa fa-calendar" onclick="gtCalendar('ngayCapGiayPhepVCVN')"></i></span>
						</div>
					</div>
				</div>
				<label>6. Xin cấp Giấy phép vận tải loại D cho phương tiện vận tải hàng hóa sang Trung Quốc như sau</label>
				<label class="col-xs-12">Request for Vietnam-China Cross-border Transport Permit - D as follow:</label>
				<div class="clear"></div>
				
				<!-- noi dung chuc nang Popup -->
				<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/table_phuong_tien_dang_ki.jsp"%>
				
				<label>7. Đề nghị Tổng cục Đường bộ Việt Nam giới thiệu với phía cơ quan chức năng của Trung Quốc tạo điều kiện cấp phép cho phương tiện.</label>
				<label class="col-xs-12">Request Directorate for Roads of Vietnam to present to the competent authority of China to facilitate issuing permit.</label>
				
				<label class="pull-left" style="margin-top:15px">8. Người liên hệ để trả kết quả:</label>
				<label class="col-xs-12">Contact person:</label>
				<div class="clear"></div>
				<div class="row M0">
					<div class="col-xs-12 form-group">
						<label class="col-xs-3 textlabel" for="sel1">Địa chỉ(Address) <span class="red">*</span>:</label>
						<p class="col-xs-9">
							<input type="text" name="diaChiNguoiLienHeTrakq" id="diaChiNguoiLienHeTrakq" class="form-control" value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getDiaChiNguoiLienHeTraKqCapPhep())? "" : donLienVan.getDiaChiNguoiLienHeTraKqCapPhep())%>">
						</p>
					</div>
					<div class="col-xs-12 form-group">
						<label class="col-xs-3 textlabel" for="sel1">Số điện thoại(Tel) <span class="red">*</span>:</label>
						<p class="col-xs-9">
							<input type="text" name="sdtNguoiLienHeTrakq" id="sdtNguoiLienHeTrakq" class="form-control" value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getDienThoaiNguoiTraKqCapPhep())? "" : donLienVan.getDienThoaiNguoiTraKqCapPhep())%>">
						</p>
					</div>
				</div>
			</div>
			
			<input  type="hidden" id="tenDoanhNghiep" name="tenDoanhNghiep" value="<%=(doanhNghiep == null) ? "" : (doanhNghiep.getTenDoanhNghiep() == null? "" : doanhNghiep.getTenDoanhNghiep())  %>" />
			<input  type="hidden" id="diaChi" name="diaChi" value="<%=(doanhNghiep == null) ? "" : (doanhNghiep.getDiaChi() == null? "" : doanhNghiep.getDiaChi())  %>" />
			<input  type="hidden" id="soDienThoai" name="soDienThoai" value="<%=(doanhNghiep == null) ? "" : (doanhNghiep.getDienThoai() == null? "" : doanhNghiep.getDienThoai())  %>" />
			<input  type="hidden" id="fax" name="fax" value="<%=(doanhNghiep == null) ? "" : (doanhNghiep.getFax() == null? "" : doanhNghiep.getFax())  %>" />
			<input  type="hidden" id="soDangKyKinhDoanh" name="soDangKyKinhDoanh" value="<%=(doanhNghiep == null) ? "" : (doanhNghiep.getSoDangKyKinhDoanh() == null? "" : doanhNghiep.getSoDangKyKinhDoanh())  %>" />
				
			<!-- ----------BUTTON---------------- -->
<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/_button.jspf"%>
			
			
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

	
	function summitForm(url) {

		
		var coQuanGui = document.getElementById("coQuanGui").value;
		
		var soGiayPhepVCVN = document.getElementById("soGiayPhepVCVN").value;
		var noiCapGiayPhepVCVN = document.getElementById("noiCapGiayPhepVCVN").value;
		var ngayCapGiayPhepVCVN = document.getElementById("ngayCapGiayPhepVCVN").value;
		var diaChiNguoiLienHeTrakq = document.getElementById("diaChiNguoiLienHeTrakq").value;
		var sdtNguoiLienHeTrakq = document.getElementById("sdtNguoiLienHeTrakq").value;
		
		if (coQuanGui == "") {
			alert("Chọn cơ quan cấp phép");
			return false;
		}

		if (soGiayPhepVCVN == "") {
			alert("Số giấy phép vận chuyển VN không được để trống");
			return false;
		}
		if (noiCapGiayPhepVCVN == "") {
			alert("Nơi giấy phép vận chuyển VN không được để trống");
			return false;
		}
		if (ngayCapGiayPhepVCVN == "") {
			alert("Ngày giấy phép vận chuyển VN không được để trống");
			return false;
		}

		if (diaChiNguoiLienHeTrakq == "") {
			alert("Địa chỉ người liên hệ trả kết quả không được để trống");
			return false;
		}
		if (sdtNguoiLienHeTrakq == "") {
			alert("Số điện thoại người liên hệ trả kết quả không được để trống");
			return false;
		}
		
		
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
	.row-eq-height {
    display: -webkit-box;
    display: -webkit-flex;
    display: -ms-flexbox;
    display: flex;
	}
	.Bo2{
		border:solid 1px #ccc;
		border-radius:6px;
		padding:15px;
		height:150px;
	}
	.striped {background-color: #f9f9f9}
</style>


