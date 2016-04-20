<%@page import="java.util.Date"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcBieuMauHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoBieuMauLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongbo.maudon.model.TBaoDieuChinhTanSuatXeChayTuyenCDVietLao"%>
<%@page import="vn.dtt.duongbo.maudon.xml.XmlUtils"%>
<%@page import="vn.dtt.duongbo.maudon.xml.MauDonFactory"%>
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
<%@page import="vn.dtt.duongbo.business.DanhMucConstants"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%!private static Log _log = LogFactoryUtil.getLog(DoanhNghiepAction.class);%>

<%
	_log.info("/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/thong_bao_dieu_chinh_tan_suat_tuyen_viet_laos.jsp");
	
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	
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
	
	TBaoDieuChinhTanSuatXeChayTuyenCDVietLao donLienVan = null;
	
	
	TthcNoidungHoSo noidungHoSo = null;
	
	if (hoSoThuTucId > 0) {
		noidungHoSo = TthcNoidungHoSoLocalServiceUtil.getLastByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId, thanhPhanHoSoId);
		if (Validator.isNotNull(noidungHoSo) && Validator.isNotNull(noidungHoSo.getNoiDungXml())) {
			
			_log.info("thong_bao_dieu_chinh_tan_suat_tuyen_viet_cam.jsp--noidungHoSo--" + noidungHoSo.getId());
			
			List<Object> lstObj = MauDonFactory.converXMLMessagesContentToObject(XmlUtils.replaceXML(noidungHoSo.getNoiDungXml()));
			
			if (lstObj != null && lstObj.size() > 0) {
				donLienVan = (TBaoDieuChinhTanSuatXeChayTuyenCDVietLao) lstObj.get(0);
			}
		}
	}
	
	if (donLienVan == null) { donLienVan = MauDonFactory.converXmlToObject(noiDungXmml, new TBaoDieuChinhTanSuatXeChayTuyenCDVietLao()); }
	if (donLienVan == null) { donLienVan = new TBaoDieuChinhTanSuatXeChayTuyenCDVietLao(); }
	
	String loaiTthc = ParamUtil.getString(request, Constants.LOAI_THU_TUC_HANH_CHINH);
	
	List<DmDataItem> lstTinhThanh = DanhMucConstants.getTinhThanh();
	List<DmDataItem> lstCoQuanCapPhep = DanhMucConstants.getCoQuanCapPhep(thuTucHanhChinhId + "");
	List<DmDataItem> lstTuyenVietLao = DanhMucConstants.getTuyenVietLao();
%>
<%
	PortletURL backUrl = renderResponse.createRenderURL();
	backUrl.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/thanh_phan_ho_so.jsp");
	backUrl.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	backUrl.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	backUrl.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
	
	PortletURL xemTruocNoiDung = renderResponse.createActionURL();
	xemTruocNoiDung.setParameter(ActionRequest.ACTION_NAME, "xemTruocNoiDung");
	xemTruocNoiDung.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	xemTruocNoiDung.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	xemTruocNoiDung.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
	xemTruocNoiDung.setParameter(Constants.ID_BIEU_MAU_HO_SO, String.valueOf(bieuMauHoSoId));
	xemTruocNoiDung.setParameter(Constants.ID_DOANH_NGHIEP, doanhNghiep.getId() + "");
	
	xemTruocNoiDung.setParameter(Constants.LOAI_THU_TUC_HANH_CHINH, loaiTthc);
	xemTruocNoiDung.setParameter(
	Constants.PATH_MAUDON_VIEW_PDF, "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/thong_bao_dieu_chinh_tan_suat_tuyen_viet_laos_view.jsp");
%>

<!-- /html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/thong_bao_dieu_chinh_tan_suat_tuyen_viet_laos.jsp -->

<aui:form action="<%=xemTruocNoiDung.toString()%>" name="myForm" id="myForm" method="POST">
	<!------------------------------------- /thong_bao_dieu_chinh_tan_suat_tuyen_van_tai_hanh_khach_tuyen_co_dinh.jsp ---------------------------------------->
	<h4 class="PL15 BGT BOB font14 col-xs-12"><%=bieuMauHoSo.getTenBieuMau()%></h4>
	<div class="P10 col-xs-12">
		<div class="BGT noidung">
			<div class="box1000" style="overflow: hidden;">
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
				<h3 class="tle text-center">
					THÔNG BÁO TĂNG/GIẢM TẦN SUẤT CHẠY XE<br>TUYẾN VẬN TẢI HÀNH KHÁCH CỐ ĐỊNH<br>BẰNG XE Ô TÔ GIỮA VIỆT NAM VÀ LÀO
				</h3>
				<div class="col-sm-12">
					<div class="text-center col-xs-12 MB20">
						<label class="textlabel col-xs-2 col-xs-offset-3" style="width: 9.1%;">Kính gửi:</label>
						<div class="col-xs-5">
							<select class="form-control" id="coQuanGui" name="coQuanGui">
								<option value="">-- Chọn cơ quan cấp phép --</option>
								<%
								for (DmDataItem item : lstCoQuanCapPhep) {
									%>
									<option value="<%=item.getCode()%>" <%=(((donLienVan.getCoQuanGui() == null) ? "" : donLienVan.getCoQuanGui().trim())).equals(item.getCode())? "selected='selected'" : ""%>><%=item.getName()%></option>
									<%
								}
								%>
							</select>
						</div>
					</div>
					<label class="pull-left w250">1. Tên doanh nghiệp, HTX</label>
					<p class="textU">: <%=doanhNghiep.getTenDoanhNghiep().toUpperCase()%></p>
					
					<label class="pull-left w250">2. Địa chỉ</label>
					<div class="col-sm-8 PA0">
						<label class="pull-left" style="height: 30px;vertical-align: middle;">: </label>
						<input type="text" id="diaChiDoanhNghiep" name="diaChiDoanhNghiep" style="width: 90%" value="<%=doanhNghiep.getDiaChi()%>" class="form-control">
					</div>
					<div class="clear"></div>
					<div style="height: 5px">&nbsp</div>
						
						
					<label class="pull-left w250">3. Số điện thoại</label>
					<p>
						<span class="pull-left">: <%=doanhNghiep.getDienThoai()%></span><span class="pull-left w250 text-center"><b>Số Fax</b></span>:
						<%=doanhNghiep.getFax()%></p>
						
				<label class="pull-left">4. Giấy phép vận tải đường bộ quốc tế Việt Nam - Lào do Tổng cục Đường bộ Việt Nam cấp:</label>
				<div class="clear"></div>
				<div style="padding: 0 15px; margin-bottom: 15px; overflow: hidden;">
					<label class="pull-left w265">Số <span class="red">*</span></label>
					<div class="col-xs-3 PA0">
						<input type="text" class="form-control" id="soGiayPhepVanTai" name="soGiayPhepVanTai" value="<%=(donLienVan.getSoGiayPhepVanTai() != null) ? donLienVan.getSoGiayPhepVanTai() : ""%>">
					</div>
					<div class="clear" style="margin-top: 10px"></div>
					<label class="pull-left w265">Ngày cấp <span class="red">*</span></label>
					<div class="col-xs-3 PA0">
						<div class="input-group">
							<input type="text" class="form-control" id="ngayCapGiayPhepVantai" name="ngayCapGiayPhepVantai" onclick="gtCalendar('ngayCapGiayPhepVantai')" value="<%=(donLienVan.getNgayCapGiayPhepVantai() != null) ? donLienVan.getNgayCapGiayPhepVantai() : ""%>" >
							<span class="input-group-addon" onclick="gtCalendar('ngayCapGiayPhepVantai')"><i class="fa fa-calendar"></i></span>
						</div>
					</div>
				</div>
				<label class="pull-left w250 textlabel">5. Kể từ ngày <span class="red">*</span></label>
				<div class="col-xs-3 PA0" style="width: 185px;">
					<div class="input-group">
						<input type="text" id="tuNgay" name="tuNgay" class="form-control" onclick="gtCalendar('tuNgay')" value="<%=(donLienVan.getTuNgay() != null ? donLienVan.getTuNgay() : "")%>">
						<span class="input-group-addon" onclick="gtCalendar('tuNgay')">
							<i class="fa fa-calendar"></i>
						</span>
					</div>
				</div>
				<div class="clear"></div>
				<div style="margin-left: 280px; clear: both;">
					<p style="text-align: left; margin-top: 10px !important;">
						<span style="font-family: Arial">doanh nghiệp (HTX) <%=doanhNghiep.getTenDoanhNghiep().toUpperCase()%> sẽ tăng/giảm tần suất
							chạy xe trên tuyến <span class="red">*</span>:
						</span>
					</p>
				</div>
				<div class="MB10" style="margin-left: 280px; width: 63%">
					<select class="form-control" id="tuyen" name="tuyen">
						<option value="1">-- Chọn tuyến --</option>
						<%
						for (DmDataItem item : lstTuyenVietLao) {
							%>
							<option value="<%=item.getCode()%>" <%=(((donLienVan.getTuyen() == null) ? "" : donLienVan.getTuyen().trim())).equals(item.getCode())? "selected='selected'" : ""%>><%=item.getName()%></option>
							<%
							}
						%>
					</select>
				</div>
				<label class="col-xs-12 PA0">6. Danh sách/số chuyến xe tăng/giảm tần suất khai thác <span class="red">*</span></label>
				<div class="col-sm-6 MB10">
					<input type="text" class="form-control" id="xeTangGiam" name="xeTangGiam" value="<%=(donLienVan.getXeTangGiam() != null) ? donLienVan.getXeTangGiam() : ""%>" >
				</div>
				
				<div class="clear"></div>
				<!-- noi dung chuc nang Popup -->
				<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/table_phuong_tien_dang_ki.jsp"%>
				<!--
				
				</div>
				<!-- ----------BUTTON---------------- -->
				<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/_button.jspf"%>
			</div>
		</div>
	</div>
	</div>
</aui:form>


<portlet:resourceURL var="updateContentURL"></portlet:resourceURL>
<script type="text/javascript">
	var idTenThuongMai = "";
	idTenThuongMai = "#textTenThuongMai";

	jQuery(document).ready(function($) {
		$(idTenThuongMai).keypad({
			keypadOnly : false,
			layout : _specChar,
			prompt : _promptTitle
		});
	});

	function summitForm(url) {
		
		
		
		var tinhThanh = document.getElementById("tinhThanh").value;
		var coQuanGui = document.getElementById("coQuanGui").value;
		var tuyen = document.getElementById("tuyen").value;

		
		
		var soGiayPhepVanTai = document.getElementById("soGiayPhepVanTai").value;
		var ngayCapGiayPhepVantai = document.getElementById("ngayCapGiayPhepVantai").value;
		var tuNgay = document.getElementById("tuNgay").value;

		var xeTangGiam = document.getElementById("xeTangGiam").value;

		
		if (tinhThanh == "") {
			alert("Chọn tỉnh thành cấp phép");
			return false;
		}

		if (coQuanGui == "") {
			alert("Chọn cơ quan cấp phép");
			return false;
		}
		if (soGiayPhepVanTai == "") {
			alert("Số giấy phép vận tải không được để trống");
			return false;
		}
		if (ngayCapGiayPhepVantai == "") {
			alert("Ngày cấp giấy phép vận tải không được để trống");
			return false;
		}
		  if(isDate(ngayCapGiayPhepVantai) == false){
				alert("ngày cấp giấy phép vận tải không đúng định dạng");
				return false;
			}
		if (tuNgay == "") {
			alert("Từ ngày không được để trống");
			return false;
		}
		  if(isDate(tuNgay) == false){
				alert("ngày bắt đầu cấp phép không đúng định dạng");
				return false;
			}
		if (xeTangGiam == "") {
			alert("Danh sách xe tăng giảm không được để trống");
			return false;
		}
		
		document.getElementById('<portlet:namespace />myForm').action = url;
		document.getElementById('<portlet:namespace />myForm').submit();
	}

	function isDate(str) {    
		  var parms = str.split(/[\.\-\/]/);
		  var yyyy = parseInt(parms[2],10);
		  var mm   = parseInt(parms[1],10);
		  var dd   = parseInt(parms[0],10);
		  var date = new Date(yyyy,mm-1,dd,0,0,0,0);
		  return mm === (date.getMonth()+1) && dd === date.getDate() && yyyy === date.getFullYear();
		}

	function openDialog(idThanhPhanHoSo) {
		$('#' + idThanhPhanHoSo).modal('show');
		//$('#upLoadFile_dialog_' + idThanhPhanHoSo).modal('show');
	}

	function closeDialog(idThanhPhanHoSo) {
		//$('#' + idThanhPhanHoSo).modal('hide');
		/**$('#upLoadFile_dialog_'+ idThanhPhanHoSo).dialog('close');*/
		//$('#upLoadFile_dialog_'+ idThanhPhanHoSo).modal('hide');
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
