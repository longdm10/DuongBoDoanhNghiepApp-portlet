<%@page import="vn.dtt.duongbo.utils.CheckCssUtils"%>
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
	_log.info("/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/bienhieu/de_nghi_cap_bien_hieu_van_tai_du_lich.jsp");
	
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	
	long idNoiDungHoSo = ParamUtil.getLong(request, Constants.ID_NOI_DUNG_HO_SO);
	
	String noiDungXmml = ParamUtil.getString(request, "noiDungXmml");
	
	long bieuMauHoSoId = 0;
	
	_log.info("----loaiTTHC in cap_phep : " + ParamUtil.getString(request, Constants.LOAI_THU_TUC_HANH_CHINH));
	_log.info("----idNoiDungHoSo : " + idNoiDungHoSo);
	
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
	
	DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich donLienVan = null;
	TthcNoidungHoSo noidungHoSo = null;
	if (idNoiDungHoSo > 0) {
		noidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(idNoiDungHoSo);
	}
	
	if (Validator.isNotNull(noidungHoSo) && Validator.isNotNull(noidungHoSo.getNoiDungXml())) {
		
		_log.info("--noidungHoSo--id--" + noidungHoSo.getId());
		
		List<Object> lstObj = MauDonFactory.converXMLMessagesContentToObject(noidungHoSo.getNoiDungXml());
		if (lstObj != null && lstObj.size() > 0) {
			donLienVan = (DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich) lstObj.get(0);
		}
	}
	
	if (donLienVan == null) { donLienVan = MauDonFactory.converXmlToObject(noiDungXmml, new DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich()); }
	if (donLienVan == null) { donLienVan = new DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich(); }
	
	List<String> lstKqLinhVucKinhDoanh = donLienVan.getLinhVucKinhDoanhs();
	
	
	List<DmDataItem> lstTinhThanh = DanhMucConstants.getTinhThanh();
	List<DmDataItem> dmCoQuanCapPhep = DanhMucConstants.getCoQuanCapPhep(thuTucHanhChinhId+"");
	List<DmDataItem> dmLinhVucKinhDoanh = DanhMucConstants.getallLoaiHinhHoatDong();
	
	DmDataItem dmTinhDoanhNghiep = DmDataItemLocalServiceUtil.getByGroupCodeAndItemCode0(DanhMucConstants.DON_VI_HANH_CHINH, doanhNghiep.getMaTinhThanh());
	
%>
<portlet:renderURL var="backUrl">
	<portlet:param name="jspPage" value="/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/bienhieu/thanh_phan_ho_so.jsp"/>
	<portlet:param name="<%= Constants.ID_THU_TUC_HANH_CHINH%>" value="<%= String.valueOf(thuTucHanhChinhId)%>"/>
	<portlet:param name="<%= Constants.ID_HO_SO_THU_TUC%>" value="<%= String.valueOf(hoSoThuTucId)%>"/>
	<portlet:param name="<%= Constants.ID_THANH_PHAN_HO_SO%>" value="<%= String.valueOf(thanhPhanHoSoId)%>"/>
</portlet:renderURL>

<portlet:actionURL var="xemTruocNoiDung" name="xemTruocNoiDung">

	<portlet:param name="<%= Constants.ID_THU_TUC_HANH_CHINH%>" value="<%= String.valueOf(thuTucHanhChinhId)%>"/>
	<portlet:param name="<%= Constants.ID_HO_SO_THU_TUC%>" value="<%= String.valueOf(hoSoThuTucId)%>"/>
	<portlet:param name="<%= Constants.ID_THANH_PHAN_HO_SO%>" value="<%= String.valueOf(thanhPhanHoSoId)%>"/>
	<portlet:param name="<%= Constants.ID_BIEU_MAU_HO_SO%>" value="<%= String.valueOf(bieuMauHoSoId)%>"/>
	<portlet:param name="<%= Constants.PATH_MAUDON_VIEW_PDF%>" value="/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/bienhieu/de_nghi_cap_bien_hieu_van_tai_du_lich_view.jsp"/>
</portlet:actionURL>

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
			<h3 class="tle text-center">GIẤY ĐỀ NGHỊ<br>CẤP BIỂN HIỆU "XE Ô TÔ VẬN CHUYỂN KHÁCH DU LỊCH"</h3>
			<div class="col-sm-12">
			<div class="text-center col-xs-12 MB20">
				<label class="textlabel col-xs-2 col-xs-offset-3" style="width: 9.1%;">Kính gửi:</label>
				<div class="col-xs-5">
					<select class="form-control" id="coQuanGui" name="coQuanGui">
						<option value="">-- Chọn cơ quan cấp phép --</option>
						<%
						for(DmDataItem item : dmCoQuanCapPhep){
							%>
							<option value="<%=item.getCode()%>" <%=((donLienVan == null)? "" : ((donLienVan.getCoQuanGui() == null) ? "" : donLienVan.getCoQuanGui().trim())).equals(item.getCode())? "selected='selected'" : ""%>><%=item.getName()%></option>
							<%
						}
						%>
					</select>
				</div>
			</div>
				<label class="pull-left w250">Tên đơn vị kinh doanh</label><p class="textU">: <%=doanhNghiep.getTenDoanhNghiep().toUpperCase()%></p>
				<label class="pull-left w250">Tên giao dịch quốc tế (nếu có)</label><p class="textU">: <%=doanhNghiep.getTenTiengAnh().toUpperCase()%></p>
				
				<label class="pull-left w250">Trụ sở</label>
				<div class="col-sm-8 PA0">
					<label class="pull-left" style="height: 30px;vertical-align: middle;">: </label>
					<input type="text" id="diaChiDoanhNghiep" name="diaChiDoanhNghiep" style="width: 90%" value="<%=doanhNghiep.getDiaChi()%>" class="form-control">
				</div>
				<div class="clear"></div>
				<div style="height: 5px">&nbsp</div>
				
				<label class="pull-left w250">Số điện thoại</label><p><span class="pull-left">: <%=doanhNghiep.getDienThoai()%></span>
				<span class="pull-left w250 text-center"><b>Fax</b></span>: <%=doanhNghiep.getFax()%></p>
				<label class="pull-left">Giấy phép kinh doanh lữ hành quốc tế (hoặc Giấy chứng nhận đăng ký kinh doanh):</label>
				
				<div class="clear"></div>
				<div style="padding: 0 15px">
					<label class="pull-left w265">Số <span class="red">*</span></label>
					<p>: <%=(Validator.isNull(doanhNghiep.getSoDangKyKinhDoanh()) ? "" : doanhNghiep.getSoDangKyKinhDoanh())%></p>
					
					<label class="pull-left w265">Ngày cấp <span class="red">*</span></label>
					<p>: <%=DateUtils.dateToString("dd/MM/yyyy", doanhNghiep.getNgayCapDkKd())%></p>
					
					<label class="pull-left w265">Cơ quan cấp <span class="red">*</span></label>
					<p>: <%=(Validator.isNull(doanhNghiep.getCoQuanCapDkKd()) ? "" : doanhNghiep.getCoQuanCapDkKd())%></p>
				</div>
				
				
				<div class="clear"></div>
				<label class="pull-left">Lĩnh vực kinh doanh<font color="red">*</font>:</label>
				<div class="clear"></div>
				<div class="col-sm-12" style="padding: 10px;">
					<div class="clear"></div>
					<%
					for (DmDataItem item : dmLinhVucKinhDoanh) {
						%>
						<div class="checkbox">
							<label><input type="checkbox" id="linhVucKinhDoanh_<%=item.getCode()%>" name="linhVucKinhDoanh" value="<%=item.getCode()%>"
								<%=CheckCssUtils.checkedCodeItemFromList(lstKqLinhVucKinhDoanh, item.getCode())%>><%=item.getName()%></label>
						</div>	
						
						<%
					}
					%>
				</div>
				
				<div class="col-sm-12" style="padding: 0px;">
					<div class="col-sm-8" style="padding: 0px;">
						<label class="pull-left">Số xe đề nghị cấp biển hiệu<font color="red">*</font>: <input type="text" style="width: 15% !important;display: initial !important;" name="soXeDeNghiCapBH" id="soXeDeNghiCapBH" class="form-control" value="<%=(donLienVan.getSoXeDeNghi() != null) ? donLienVan.getSoXeDeNghi( ): ""%>"> xe (danh sách xe kèm theo)</label>
					</div>
					<div class="col-sm-4"></div>
				</div>
				
				<div class="clear"></div>
				
				<div class="col-sm-12" style="padding: 0px;">	
					<label class="pull-left">Danh sách xe đề nghị cấp biển hiệu như sau:</label>
				</div>
				
				<!-- noi dung chuc nang Popup -->
				<div class="col-sm-12">
					<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/bienhieu/table_phuong_tien_dang_ki.jsp"%>
				</div>
				
				<div class="col-sm-12" style="margin-top: 15px;margin-bottom: -60px;">
					<p>Các giấy tờ liên quan kèm theo gồm: Giấy xác nhận ô tô vận chuyển khách du lịch (bản chính) (1) và các bản sao: Giấy phép kinh doanh lữ hành quốc tế hoặc Giấy chứng nhận đăng ký kinh doanh vận chuyển khách (2); Giấy chứng nhận đăng ký ô tô (3); Giấy chứng nhận kiểm định an toàn kỹ thuật và bảo vệ môi trường (4); Giấy chứng nhận Bảo hiểm trách nhiệm dân sự của chủ phương tiện (5); Giấy phép lái xe (6); Giấy chứng nhận tập huấn nghiệp vụ du lịch của lái xe (7).
          			 Đơn vị kinh doanh cam kết chịu trách nhiệm về nội dung số liệu trong hồ sơ đề nghị cấp biển hiệu đính kèm./.</p>
				</div>
				
				
			</div>
		
			
			<!-- ----------BUTTON---------------- -->
			<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/bienhieu/_button.jspf"%>
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
		//var soGiayPhepKinhDoanh = document.getElementById("soGiayPhepKinhDoanh").value;
		//var ngayCap = document.getElementById("ngayCap").value;
		var soXeDeNghiCapBH = document.getElementById("soXeDeNghiCapBH").value;
		//var linhVucKinhDoanh = document.getElementById("linhVucKinhDoanh").value;
		
		if (tinhThanh == "") {
			alert("Lựa chọn Tỉnh/Thành Phố");
			return false;
		}

		if (coQuanGui == "") {
			alert("Lựa chọn cơ quan cấp phép");
			return false;
		}

		if (soXeDeNghiCapBH == "") {
			alert("Số xe đề nghị cấp biển hiệu không được để trống ");
			return false;
		}
		
		//if (soGiayPhepKinhDoanh == "") {
		//	alert("Số giấy phép kinh doanh nữ hành quốc tế không được để trống");
		//	return false;
		//}
		
		//if (ngayCap == "") {
		//	alert("Ngày cấp không được để trống");
		//	return false;
		//}

		var radio_check_val = "";
		for (var i = 0; i < document.getElementsByName('linhVucKinhDoanh').length; i++) {
			if (document.getElementsByName('linhVucKinhDoanh')[i].checked) {
				radio_check_val = document.getElementsByName('linhVucKinhDoanh')[i].value;
            }
        }
        if (radio_check_val === "") {
            alert("Chọn Lĩnh vực kinh doanh");
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


