<%@page import="vn.dtt.duongbo.business.DanhMucConstants"%>
<%@page import="vn.dtt.duongbo.maudon.xml.MauDonFactory"%>
<%@page import="vn.dtt.duongbo.maudon.model.DeNghiCapGPVTVietTrungChoXeCongVu"%>
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
	_log.info("/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/cap_giay_phep_van_tai_cho_xe_cong_vu_viet_trung.jsp");
	
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	String listNoiDungHoSo = ParamUtil.getString(request, Constants.DANH_SACH_NOI_DUNG_HO_SO);
	
	_log.info("thuTucHanhChinhId--" + thuTucHanhChinhId);
	_log.info("hoSoThuTucId-------" + hoSoThuTucId);
	_log.info("thanhPhanHoSoId----" + thanhPhanHoSoId);
	
	
	String noiDungXmml = ParamUtil.getString(request, "noiDungXmml");
	
	long bieuMauHoSoId = 0;
	
	
	
	TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(thuTucHanhChinhId);
	TthcThanhPhanHoSo thanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.fetchTthcThanhPhanHoSo(thanhPhanHoSoId);
	TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
	long idNoiDungHoSo = ParamUtil.getLong(request, Constants.ID_NOI_DUNG_HO_SO);
	
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
	
	
	List<DmDataItem> lstCoQuanCapPhep = DanhMucConstants.getCoQuanCapPhep(thuTucHanhChinhId+"");
	
	DeNghiCapGPVTVietTrungChoXeCongVu donLienVan = null;
	TthcNoidungHoSo noidungHoSo = null;
	if(idNoiDungHoSo > 0){
		noidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(idNoiDungHoSo);
	}
	
	if (Validator.isNotNull(noidungHoSo) && Validator.isNotNull(noidungHoSo.getNoiDungXml())) {
		
		_log.info("cap_giay_phep_lienvan_phi_thuong_mai_viet_laos--noidungHoSo--" + noidungHoSo.getId());
	
		List<Object> lstObj = MauDonFactory.converXMLMessagesContentToObject(noidungHoSo.getNoiDungXml());
		if (lstObj != null && lstObj.size() > 0) {
			donLienVan = (DeNghiCapGPVTVietTrungChoXeCongVu) lstObj.get(0);
		}
	}
	
	if (donLienVan == null) { donLienVan = MauDonFactory.converXmlToObject(noiDungXmml, new DeNghiCapGPVTVietTrungChoXeCongVu()); }
	List<DmDataItem> lstTinhThanh = DanhMucConstants.getTinhThanh();
	
	
	PortletURL backUrl = renderResponse.createRenderURL();
	backUrl.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/thanh_phan_ho_so.jsp");
	backUrl.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	backUrl.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	backUrl.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
	backUrl.setParameter(Constants.DANH_SACH_NOI_DUNG_HO_SO, listNoiDungHoSo);
	
	
	PortletURL xemTruocNoiDung = renderResponse.createActionURL();
	xemTruocNoiDung.setParameter(ActionRequest.ACTION_NAME, "xemTruocNoiDung");
	xemTruocNoiDung.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	xemTruocNoiDung.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	xemTruocNoiDung.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
	xemTruocNoiDung.setParameter(Constants.ID_BIEU_MAU_HO_SO, String.valueOf(bieuMauHoSoId));
	xemTruocNoiDung.setParameter(Constants.DANH_SACH_NOI_DUNG_HO_SO, listNoiDungHoSo);
	xemTruocNoiDung.setParameter(Constants.PATH_MAUDON_VIEW_PDF, "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/cap_giay_phep_van_tai_cho_xe_cong_vu_viet_trung_view.jsp");
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
				<b>CỘNG HÒA XÃ HỘI CHỦ NGHĨA VIỆT NAM</b><br>
				<b>Độc lập - Tự do - Hạnh phúc</b><br>
					---------------
				</p>
			</div>
			<h3 class="tle text-center">ĐƠN ĐỀ NGHỊ<br>CẤP GIẤY PHÉP VẬN TẢI ĐƯỜNG BỘ VIỆT NAM - TRUNG QUỐC</h3>


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
				<label class="pull-left w250">1. Tên doanh nghiệp, hợp tác xã</label><p class="textU">: <%=doanhNghiep.getTenDoanhNghiep().toUpperCase()%></p>
				
				<label class="pull-left w250">2. Địa chỉ</label>
				<div class="col-sm-8 PA0">
					<label class="pull-left" style="height: 30px;vertical-align: middle;">: </label>
					<input type="text" id="diaChiDoanhNghiep" name="diaChiDoanhNghiep" style="width: 90%" value="<%=doanhNghiep.getDiaChi()%>" class="form-control">
				</div>
				<div class="clear"></div>
				<div style="height: 5px">&nbsp</div>
				
				<label class="pull-left w250">3. Số điện thoại</label><p>: <%=doanhNghiep.getDienThoai()%></p>
				<label class="pull-left">4. Mục đích xin cấp phép cho ô tô <font color="red">*</font>:</label>
				<div class="clear"></div>
				<div class="row M0">
					<div class="col-xs-12 form-group">
						<input type="text" name="mucDichCapPhep" id="mucDichCapPhep" class="form-control" value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getDienThoaiNguoiTraKqCapPhep())? "" : donLienVan.getDienThoaiNguoiTraKqCapPhep())%>">
					</div>
				</div>
				<label class="pull-left">5. Đơn vị xin cấp phép cho ô tô theo danh sách dưới đây <font color="red">*</font>:</label>
				<div class="clear"></div>
				
				<!-- noi dung chuc nang Popup -->
				<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/table_phuong_tien_dang_ki.jsp"%>
			
				<label class="pull-left" style="margin-top:15px">6. Người liên hệ để trả kết quả cấp phép:</label>
				<div class="clear"></div>
				<div class="row M0">
					<div class="col-xs-12 form-group">
						<label class="col-xs-2 textlabel" for="sel1">Họ tên <span class="red">*</span>:</label>
						<p class="col-xs-10">
							<input type="text" name="hoTenNguoiLienHeTrakq" id="hoTenNguoiLienHeTrakq" class="form-control" value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getNguoiLienHeTraKqCapPhep())? "" : donLienVan.getNguoiLienHeTraKqCapPhep())%>">
						</p>
					</div>
					<div class="col-xs-12 form-group">
						<label class="col-xs-2 textlabel" for="sel1">Số điện thoại <span class="red">*</span>:</label>
						<p class="col-xs-10">
							<input type="text" name="sdtNguoiLienHeTrakq" id="sdtNguoiLienHeTrakq" class="form-control" value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getDienThoaiNguoiTraKqCapPhep())? "" : donLienVan.getDienThoaiNguoiTraKqCapPhep())%>">
						</p>
					</div>
				</div>
			</div>
			<!-- ----------BUTTON---------------- -->
			<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/_button.jspf"%>
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
		 var hoTenNguoiLienHeTrakq = document.getElementById("hoTenNguoiLienHeTrakq").value;
		 var mucDichCapPhep = document.getElementById("mucDichCapPhep").value;

		 
		 var sdtNguoiLienHeTrakq = document.getElementById("sdtNguoiLienHeTrakq").value;
		 if (coQuanGui == "") {
				alert("Chọn cơ quan cấp phép");
				return false;
			}
		 if (mucDichCapPhep == "") {
				alert("Mục đích xin cấp phép cho ô tô không được để trống");
				return false;
			}
			
		 if (hoTenNguoiLienHeTrakq == "") {
				alert("Họ tên người liên hệ để trả kết quả cấp phép không được để trống");
				return false;
			}

		 if (sdtNguoiLienHeTrakq == "") {
				alert("Số điện thoại người liên hệ để trả kết quả cấp phép không được để trống");
				return false;
			}
			
		document.getElementById('<portlet:namespace />myForm').action = url;
		document.getElementById('<portlet:namespace />myForm').submit();
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


