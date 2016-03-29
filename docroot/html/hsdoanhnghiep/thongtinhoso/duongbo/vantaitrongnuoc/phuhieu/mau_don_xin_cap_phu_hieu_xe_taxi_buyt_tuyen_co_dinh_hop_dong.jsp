<%@page import="vn.dtt.duongbo.maudon.model.GiayDeNghiCapPhuHieuBienHieu"%>
<%@page import="vn.dtt.duongbo.maudon.xml.MauDonFactory"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Date"%>
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
	_log.info("/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/phuhieu/mau_don_xin_cap_phu_hieu_xe_taxi_buyt_tuyen_co_dinh_hop_dong.jsp");
	
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	
	long idNoiDungHoSo = ParamUtil.getLong(request, Constants.ID_NOI_DUNG_HO_SO);
	
	String noiDungXmml = ParamUtil.getString(request, "noiDungXmml");
	_log.info("======NOI DUNG XML NHAN VE========="+noiDungXmml);
	
	
	long bieuMauHoSoId = 0;
	
	_log.info("-----loaiTTHC in cap_phep : " + ParamUtil.getString(request, Constants.LOAI_THU_TUC_HANH_CHINH));
	_log.info("-----idNoiDungHoSo : " + idNoiDungHoSo);
	
	TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(thuTucHanhChinhId);
	TthcThanhPhanHoSo thanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.fetchTthcThanhPhanHoSo(thanhPhanHoSoId);
	TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
	
	DnDoanhNghiep doanhNghiep = DoanhNghiepUtils.getDoanhNghiepByUserId(PortalUtil.getUserId(request));
	
	
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
	
	GiayDeNghiCapPhuHieuBienHieu donLienVan = null;
	
	
	TthcNoidungHoSo noidungHoSo = null;
	if(idNoiDungHoSo > 0){
		noidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(idNoiDungHoSo);
	}
	
	if (Validator.isNotNull(noidungHoSo) && Validator.isNotNull(noidungHoSo.getNoiDungXml())) {
		
		_log.info("---noidungHoSo--id---" + noidungHoSo.getId());
		_log.info("---noidungHoSo--xml--" + noidungHoSo.getNoiDungXml());
	
		List<Object> lstObj = MauDonFactory.converXMLMessagesContentToObject(noidungHoSo.getNoiDungXml());
		_log.info("mau_lstObj---------" + lstObj);
		
		
		if (lstObj != null && lstObj.size() > 0) {
			donLienVan = (GiayDeNghiCapPhuHieuBienHieu) lstObj.get(0);
			_log.info("--donLienVan.getSoLuongNopLai()--" + donLienVan.getSoLuongNopLai());
			_log.info("--donLienVan.getSoLuongDeNghiCap()--" + donLienVan.getSoLuongDeNghiCap());
			
		}
	}
	if (donLienVan == null) { donLienVan = MauDonFactory.converXmlToObject(noiDungXmml, new GiayDeNghiCapPhuHieuBienHieu()); }
	if (donLienVan == null) { donLienVan = new GiayDeNghiCapPhuHieuBienHieu(); }
	
	List<DmDataItem> lstTinhThanh = DanhMucConstants.getTinhThanh();
	List<DmDataItem> dmCoQuanCapPhep = DanhMucConstants.getCoQuanCapPhep(thuTucHanhChinhId + "");
	
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
	xemTruocNoiDung.setParameter(Constants.PATH_MAUDON_VIEW_PDF, "/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/phuhieu/mau_don_xin_cap_phu_hieu_xe_taxi_buyt_tuyen_co_dinh_hop_dong_view.jsp");
	
%>
<aui:form action="<%=xemTruocNoiDung.toString()%>" name="myForm" id="myForm" method="POST">
<h4 class="PL15 BGT BOB font14 col-xs-12"><%=bieuMauHoSo.getTenBieuMau()%></h4>
<div class="P10 col-xs-12">
	<div class="BGT noidung">
		<div class="box1000">
				<div class="col-sm-12">
					<p class="pull-left text-center">
						<b><%=doanhNghiep.getTenDoanhNghiep().toUpperCase()%></b><br>
						<b>-------</b>
					</p>
					
					<p class="pull-right text-center">
					
					<div class="text-center col-xs-5 MB20 pull-right PA0">
					<p >
						<b>CỘNG HÒA XÃ HỘI CHỦ NGHĨA VIỆT NAM</b><br> <b>Độc lập - Tự do - Hạnh phúc</b><br> ---------------
					</p>
						<div class="col-xs-6 PA0">
							<select class="form-control" id="tinhThanh" name="tinhThanh">
								<%DmDataItem dmTinhDoanhNghiep = DmDataItemLocalServiceUtil.getByGroupCodeAndItemCode0(DanhMucConstants.DON_VI_HANH_CHINH, doanhNghiep.getMaTinhThanh());%>
								<option value="<%=(dmTinhDoanhNghiep != null) ? dmTinhDoanhNghiep.getCode() : ""%>"><%=(dmTinhDoanhNghiep != null) ? dmTinhDoanhNghiep.getName() : ""%></option>
							</select>
						</div>
						<div>
							<p style="text-align: right;line-height: 30px;">
								<span style="font-family: Arial">, <%=DateUtils.getCurrentDate(new Date()) %></span>
							</p>
						</div>
					</div>
				</div>
			<h3 class="tle text-center">GIẤY ĐỀ NGHỊ CẤP BIỂN HIỆU, PHÙ HIỆU</h3>
			<div class="col-sm-12">
				<div class="text-center col-xs-12 MB20">
					<label class="textlabel col-xs-2 col-xs-offset-3" style="width: 9.1%;">Kính gửi:</label>
					<div class="col-xs-5">
						<select class="form-control" id="coQuanGui" name="coQuanGui">
						<option value="">-- Chọn cơ quan cấp phép --</option>
						<%
						for(DmDataItem item : dmCoQuanCapPhep) {
							%>
							<option value="<%=item.getCode()%>" <%=(((donLienVan.getCoQuanGui() == null) ? "" : donLienVan.getCoQuanGui().trim())).equals(item.getCode())? "selected='selected'" : ""%>><%=item.getName()%></option>
							<%
						}
						%>
					</select>
					</div>
				</div>
					<label class="pull-left w250">1. Tên đơn vị vận tải<span class="red">*</span></label><p class="textU">: <%=doanhNghiep.getTenDoanhNghiep().toUpperCase()%></p>
					
					<label class="pull-left w250">2. Địa chỉ<span class="red">*</span></label>
					<div class="col-sm-8 PA0">
						<label class="pull-left" style="height: 30px;vertical-align: middle;">: </label>
						<input type="text" id="diaChiDoanhNghiep" name="diaChiDoanhNghiep" style="width: 90%" value="<%=doanhNghiep.getDiaChi()%>" class="form-control">
					</div>
					<div class="clear"></div>
					<div style="height: 5px">&nbsp</div>
					
					<label class="pull-left w250">3. Số điện thoại(Fax)</label><p class="textU">: <%=doanhNghiep.getDienThoai()%> (<%=doanhNghiep.getFax()%>)</p>
					<label class="pull-left w250">4. Giấy phép kinh doanh vận tải bằng xe ô tô</label>
					<div class="clear"></div>
					
					<div class="col-xs-6" style="width: 27.4%;">Số</div>
					<div class="col-xs-6">: <%=(Validator.isNull(doanhNghiep.getSoGpkdVanTaiBangOto()) ? "" : doanhNghiep.getSoGpkdVanTaiBangOto())%></div>
					
					<div class="col-xs-6" style="width: 27.4%;">Cấp ngày : </div>
					<div class="col-xs-6">: <%=DateUtils.dateToString("dd/MM/yyyy", doanhNghiep.getNgayCapDkKd())%></div>
					
					<div class="col-xs-6" style="width: 27.4%;">Nơi cấp (1) : </div>
					<div class="col-xs-6">: <%=(Validator.isNull(doanhNghiep.getCoQuanCapDkKd()) ? "" : doanhNghiep.getCoQuanCapDkKd())%></div>
					
					<div class="clear"></div>
					<div class="col-xs-12" style="margin: 10px 0;">
						Số lượng biển hiệu, phù hiệu chạy xe nộp lại: <input type="text" style="width: 15% !important;display: initial !important;" class="form-control" id="soLuongBHPHNopLai" name="soLuongBHPHNopLai" value="<%=(donLienVan.getSoLuongNopLai() == null) ? "" : donLienVan.getSoLuongNopLai()%>"/>
					</div><br/>
					<div class="col-xs-12" style="margin: 10px 0;">
						Đề nghị được cấp (2) số phù hiệu  <input style="width: 15% !important;display: initial !important;" class="form-control" type="text" id="soLuongDeNghiCap" name="soLuongDeNghiCap" value="<%=(donLienVan.getSoLuongDeNghiCap() == null) ? "" : donLienVan.getSoLuongDeNghiCap()%>"/> <br/>
					</div><br/>
					
					<!-- noi dung chuc nang Popup -->
					<div class="clear"></div>
					<label class="pull-left w250">Danh sách xe đề nghị cấp phù hiệu như sau:</label><br/>
					<!-- noi dung chuc nang Popup -->
					<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/phuhieu/table_phuong_tien_dang_ki.jsp"%><br/>
					<div class="clear"></div><br/>
					
					
					<div class="col-sm-12" style="padding: 0px;margin-bottom: -60px;margin-top: -10px;">
						<label class="pull-left w250"><b>Hướng dẫn cách ghi</b></label><br/>
						<label class="pull-left w250" style="width:100%;"><p>(1) Hoạt động vận tải khách nội bộ không điền thông tin này</p></label><br/>
						<label class="pull-left w250"><p>(2) Ghi số lượng phù hiệu, biển hiệu đơn vị xin cấp</p></label><br/>
					</div>
					
					
			</div>
			
			
			<input  type="hidden" id="tenDoanhNghiep" name="tenDoanhNghiep" value="<%=(doanhNghiep.getTenDoanhNghiep() == null ? "" : doanhNghiep.getTenDoanhNghiep())  %>" />
			<input  type="hidden" id="diaChi" name="diaChi" value="<%=(doanhNghiep.getDiaChi() == null? "" : doanhNghiep.getDiaChi())  %>" />
			<input  type="hidden" id="soDienThoai" name="soDienThoai" value="<%=(doanhNghiep.getDienThoai() == null? "" : doanhNghiep.getDienThoai())  %>" />
			<input  type="hidden" id="fax" name="fax" value="<%=(doanhNghiep.getFax() == null? "" : doanhNghiep.getFax())  %>" />
			<input  type="hidden" id="soDangKyKinhDoanh" name="soDangKyKinhDoanh" value="<%=(doanhNghiep.getSoDangKyKinhDoanh() == null? "" : doanhNghiep.getSoDangKyKinhDoanh())  %>" />
				
			<!-- ----------BUTTON---------------- -->
			<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/phuhieu/_button.jspf"%>
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
		
		var soLuongBHPHNopLai = document.getElementById("soLuongBHPHNopLai").value;
		var soLuongDeNghiCap = document.getElementById("soLuongDeNghiCap").value;
		//var textFax = document.getElementById("textFax").value;
		//var textFaxDVDK = document.getElementById("textFaxDVDK").value;
		//var kiemTraTF = isNaN(textFax);
		//var kiemTraTF2 = isNaN(textFaxDVDK);
		//var kiemTraDT = isNaN(dienThoai);
		//var kiemTraDT2 = isNaN(textDienThoaiDVDK);
		
		
		if (tinhThanh == "") {
			alert("Chọn Tỉnh/Thành Phố");
			return false;
		}
		

		if (coQuanGui == "") {
			alert("Chọn cơ quan cấp phép");
			return false;
		}
		
		if (soLuongBHPHNopLai == "") {
			alert("Số hiệu, biển hiêụ không được để trống");
			return false;
		}
		if (soLuongDeNghiCap == "") {
			alert("Số lượng đề nghị không được để trống");
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


