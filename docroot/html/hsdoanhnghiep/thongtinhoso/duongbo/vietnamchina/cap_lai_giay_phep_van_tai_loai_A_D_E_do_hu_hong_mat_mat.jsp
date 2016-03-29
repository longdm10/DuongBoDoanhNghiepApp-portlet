<%@page import="vn.dtt.duongbo.business.DanhMucConstants"%>
<%@page import="vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnitImpl"%>
<%@page import="vn.dtt.duongbo.dao.motcua.service.OEPUserMgtWorkingUnitLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit"%>
<%@page import="vn.dtt.duongbo.maudon.xml.MauDonFactory"%>
<%@page import="vn.dtt.duongbo.maudon.model.DeNghiCapLaiGPVTVietTrungDoHongMat"%>
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
<%@page import="vn.dtt.duongbo.utils.format.FormatData"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<link rel="stylesheet" href="<%=request.getContextPath()%>/css/tipsy.css" type="text/css" media="screen" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/jquery.alerts.css" type="text/css" media="screen" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/jquery-ui.css" type="text/css" media="screen" />

<%! private static Log _log = LogFactoryUtil.getLog(DoanhNghiepAction.class); %>

<%
	_log.info("/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/cap_lai_giay_phep_van_tai_loai_A_D_E_do_hu_hong_mat_mat.jsp");
	
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	
	long idNoiDungHoSo = ParamUtil.getLong(request, Constants.ID_NOI_DUNG_HO_SO);
	
	String noiDungXmml = ParamUtil.getString(request, "noiDungXmml");
	
	long bieuMauHoSoId = 0;
	
	
	
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
	
	DeNghiCapLaiGPVTVietTrungDoHongMat donLienVan = null;
	TthcNoidungHoSo noidungHoSo = null;
	if(idNoiDungHoSo > 0){
		noidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(idNoiDungHoSo);
	}
	
	if (Validator.isNotNull(noidungHoSo) && Validator.isNotNull(noidungHoSo.getNoiDungXml())) {
		
		_log.info("--noidungHoSo--" + noidungHoSo.getId());
	
		List<Object> lstObj = MauDonFactory.converXMLMessagesContentToObject(noidungHoSo.getNoiDungXml());
		if (lstObj != null && lstObj.size() > 0) {
			donLienVan = (DeNghiCapLaiGPVTVietTrungDoHongMat) lstObj.get(0);
		}
	}
	if (donLienVan == null) { donLienVan = MauDonFactory.converXmlToObject(noiDungXmml, new DeNghiCapLaiGPVTVietTrungDoHongMat()); }
	
	
	List<DmDataItem> lstTinhThanh = DanhMucConstants.getTinhThanh();
	List<DmDataItem> lstCoQuanCapPhep = DanhMucConstants.getCoQuanCapPhep(thuTucHanhChinhId+"");
%>

<portlet:renderURL var="backUrl">
	<portlet:param name="jspPage" value="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/thanh_phan_ho_so.jsp"/>
	<portlet:param name="<%= Constants.ID_THU_TUC_HANH_CHINH%>" value="<%= String.valueOf(thuTucHanhChinhId)%>"/>
	<portlet:param name="<%= Constants.ID_HO_SO_THU_TUC%>" value="<%= String.valueOf(hoSoThuTucId)%>"/>
	<portlet:param name="<%= Constants.ID_THANH_PHAN_HO_SO%>" value="<%= String.valueOf(thanhPhanHoSoId)%>"/>
</portlet:renderURL>

<portlet:actionURL var="xemTruocNoiDung" name="xemTruocNoiDung">
	<portlet:param name="<%=Constants.ID_THU_TUC_HANH_CHINH %>" value="<%= String.valueOf(thuTucHanhChinhId)%>"/>
	<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC %>" value="<%= String.valueOf(hoSoThuTucId)%>"/>
	<portlet:param name="<%=Constants.ID_THANH_PHAN_HO_SO %>" value="<%= String.valueOf(thanhPhanHoSoId)%>"/>
	<portlet:param name="<%=Constants.ID_BIEU_MAU_HO_SO %>" value="<%= String.valueOf(bieuMauHoSoId)%>"/>
	<portlet:param name="<%=Constants.PATH_MAUDON_VIEW_PDF %>" value="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/cap_lai_giay_phep_van_tai_loai_A_D_E_do_hu_hong_mat_mat_view.jsp"/>
</portlet:actionURL>

<!-- cap_lai_giay_phep_van_tai_loai_A_D_E_do_hu_hong_mat_mat -->
<!-- vietnamchina/cap_lai_giay_phep_van_tai_loai_A_D_E_do_hu_hong_mat_mat.jsp -->

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
			<h3 class="tle text-center">ĐƠN ĐỀ NGHỊ CẤP LẠI GIẤY PHÉP VẬN TẢI<br>APPLICATION FORM FOR TRANSPORT PERMIT RENEWAL</h3>
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
				<p class="text-center"><label>To</label><span class="textU">: Tổng cục đường bộ Việt Nam</span></p>
				<label class="pull-left w250">1. Tên đơn vị vận tải (Transport organization)</label><p class="textU">: <%=doanhNghiep.getTenDoanhNghiep().toUpperCase()%></p>
				
				<label class="pull-left w250">2. Địa chỉ (Address)</label>
				<div class="col-sm-8 PA0">
					<label class="pull-left" style="height: 30px;vertical-align: middle;">: </label>
					<input type="text" id="diaChiDoanhNghiep" name="diaChiDoanhNghiep" style="width: 90%" value="<%=doanhNghiep.getDiaChi()%>" class="form-control">
				</div>
				<div class="clear"></div>
				<div style="height: 5px">&nbsp</div>
				
				<label class="pull-left w250">3. Số điện thoại (Tel)</label><p>: <%=doanhNghiep.getDienThoai()%></p>
				
				<label class="pull-left">4. Giấy chứng nhận đăng ký kinh doanh (Business Registration Certificate No): </label><br/>
<!-- 				<label class="col-xs-12">Business Registration Certificate No</label> -->
				<label class="col-xs-12"></label>
				<div style="padding:0 15px">
					<label class="pull-left w265">Số(No) </label>
					<p>: <%=(Validator.isNull(doanhNghiep.getSoDangKyKinhDoanh()) ? "" : doanhNghiep.getSoDangKyKinhDoanh())%></p>
					
					<label class="pull-left w265">Ngày cấp(Dated) </label>
					<p>: <%=(Validator.isNull(doanhNghiep.getNgayCapDkKd()) ? "" : FormatData.parseDateToTringDDMMYYY(doanhNghiep.getNgayCapDkKd()))%></p>
					
					<label class="pull-left w265">Cơ quan cấp(Issued by) </label>
					<p>: <%=Validator.isNull(doanhNghiep.getCoQuanCapDkKd()) ? "" : doanhNghiep.getCoQuanCapDkKd()%></p>
				</div>
				
				<label class="pull-left">5. Giấy phép kinh doanh vận tải bằng xe ô tô (Permit for Transport Business by motor vehice): </label><br/>
<!-- 				<label class="col-xs-12">Permit for Transport Business by motor vehice</label> -->
				<label class="col-xs-12"></label>
				<div style="padding:0 15px">
					<label class="pull-left w265">Số(No) </label>
					<p>: <%=(Validator.isNull(doanhNghiep.getSoGpkdVanTaiBangOto()) ? "" : doanhNghiep.getSoGpkdVanTaiBangOto())%></p>
					
					<label class="pull-left w265">Ngày cấp(Dated) </label>
					<p>: <%=(Validator.isNull(doanhNghiep.getNgayCapGpkdVanTaiBangOto()) ? "" : FormatData.parseDateToTringDDMMYYY(doanhNghiep.getNgayCapGpkdVanTaiBangOto()))%></p>
					
					<label class="pull-left w265">Cơ quan cấp(Issued by) </label>
					<p>: <%=Validator.isNull(doanhNghiep.getCoQuanCapGpkdVanTaiBangOto()) ? "" : doanhNghiep.getCoQuanCapGpkdVanTaiBangOto()%></p>
				</div>
				
				
				
				<label class="pull-left">7.  Đơn vị xin cấp phép cho ô tô do bị mất, hỏng theo danh sách dưới đây <font color="red">*</font>:</label>
				<label class="col-xs-12">Organization requests for transport permit renewal due to loss, damage following the list below::</label>
				<div class="clear"></div>
				
				<!-- noi dung chuc nang Popup -->
				<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/table_phuong_tien_dang_ki.jsp"%>
				
				<label class="pull-left" style="margin-top:15px">8. Người liên hệ để trả kết quả cấp phép:</label>
				<div class="clear"></div>
				<div class="row M0">
					<div class="col-xs-12 form-group">
						<label class="col-xs-2 textlabel PAl0" for="hoTenNguoiLienHeTrakq">Họ tên(Full name) <span class="red">*</span>:</label>
						<p class="col-xs-10">
							<input type="text" name="hoTenNguoiLienHeTrakq" id="hoTenNguoiLienHeTrakq" class="form-control" value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getNguoiLienHeTraKqCapPhep())? "" : donLienVan.getNguoiLienHeTraKqCapPhep())%>">
						</p>
					</div>
					<div class="col-xs-12 form-group">
						<label class="col-xs-2 textlabel PAl0" for="sdtNguoiLienHeTrakq">Số điện thoại(Tel) <span class="red">*</span>:</label>
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
</div>
</aui:form>


<portlet:resourceURL var="updateContentURL" ></portlet:resourceURL>
<script type="text/javascript">
	
	var idTenThuongMai = "" ;
	idTenThuongMai = "#textTenThuongMai";
	
	
	jQuery(document).ready(function($) {
		$(idTenThuongMai).keypad({keypadOnly: false, layout: _specChar, prompt: _promptTitle});
	});

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
	
	function summitForm(url) {
		 var coQuanGui = document.getElementById("coQuanGui").value;
		 var hoTenNguoiLienHeTrakq = document.getElementById("hoTenNguoiLienHeTrakq").value;
		 var sdtNguoiLienHeTrakq = document.getElementById("sdtNguoiLienHeTrakq").value;
		 if (coQuanGui == "") {
				alert("Chọn cơ quan cấp phép");
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
		if(!isNormalInteger(sdtNguoiLienHeTrakq)){
			alert("Số điện thoại phải ở dạng số!");
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


