<%@page import="vn.dtt.duongbo.utils.format.FormatData"%>
<%@page import="vn.dtt.duongbo.utils.format.DateUtils"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.duongbo.business.DanhMucConstants"%>
<%@page import="vn.dtt.duongbo.maudon.xml.MauDonFactory"%>
<%@page import="vn.dtt.duongbo.maudon.model.DeNghiGiaHanGiayPhepVanTaiChoPTTrungQuoc"%>
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
	_log.info("/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/don_gia_han_giay_phep_van_tai_viet_trung.jsp");
	
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
	
	DeNghiGiaHanGiayPhepVanTaiChoPTTrungQuoc donLienVan = null;
	TthcNoidungHoSo noidungHoSo = null;
	if(idNoiDungHoSo > 0){
		noidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(idNoiDungHoSo);
	}
	
	if (Validator.isNotNull(noidungHoSo) && Validator.isNotNull(noidungHoSo.getNoiDungXml())) {
		
		_log.info("cap_giay_phep_lienvan_phi_thuong_mai_viet_laos--noidungHoSo--" + noidungHoSo.getId());
	
		List<Object> lstObj = MauDonFactory.converXMLMessagesContentToObject(noidungHoSo.getNoiDungXml());
		if (lstObj != null && lstObj.size() > 0) {
			donLienVan = (DeNghiGiaHanGiayPhepVanTaiChoPTTrungQuoc) lstObj.get(0);
		}
	}
	
	if (donLienVan == null) { donLienVan = MauDonFactory.converXmlToObject(noiDungXmml, new DeNghiGiaHanGiayPhepVanTaiChoPTTrungQuoc()); }
	
	List<DmDataItem> lstSoNgayGiaHan = DanhMucConstants.getSoNgayGiaHan();
	
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
	xemTruocNoiDung.setParameter(Constants.PATH_MAUDON_VIEW_PDF, "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/don_gia_han_giay_phep_van_tai_viet_trung_view.jsp");
%>

<!-- Modal -->
	
<!-- End modal -->
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
			<h3 class="tle text-center">ĐƠN ĐỀ NGHỊ GIA HẠN GIẤY PHÉP VẬN TẢI<br/>APPLICATION FORM TO EXTEND THE TRANSPORT PERMIT</h3>
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
				<label class="pull-left w250">1.  Người xin gia hạn (Full name)</label><p class="textU">: <%=doanhNghiep.getTenDoanhNghiep().toUpperCase()%></p>
				
				<label class="pull-left w250">2. Địa chỉ (Address)</label>
				<div class="col-sm-8 PA0">
					<label class="pull-left" style="height: 30px;vertical-align: middle;">: </label>
					<input type="text" id="diaChiDoanhNghiep" name="diaChiDoanhNghiep" style="width: 90%" value="<%=doanhNghiep.getDiaChi()%>" class="form-control">
				</div>
				<div class="clear"></div>
				<div style="height: 5px">&nbsp</div>
				
				<label class="pull-left w250">3. Số điện thoại (Tel)</label><p>: <%=doanhNghiep.getDienThoai()%></p><label class="pull-left w250">Số Fax (Fax)</label><p>: <%=doanhNghiep.getFax()%></p>
				<label class="pull-left w250">4. Địa chỉ Email (Email)</label><p>: <%=doanhNghiep.getEmail()%></p>
				<label class="pull-left ">5. Giấy phép vận tải</label><br/>
				<label class="col-xs-12">Transport permit:</label>
				<div class="row M0">
					<div class="col-xs-4 form-group">
					    <label class="textlabel" for="loaiGiayPhep">Loại(Class)<span class="red">*</span> :</label><br/>
					    <label class="textlabel" for="coQuanCapPhep">Do cơ quan(Issued by) <span class="red">*</span> :</label><br/>
					    <label class="textlabel" for="ngayCapPhep">Cấp ngày (Date) <span class="red">*</span> :</label>
					</div>
					<div class="col-xs-8 form-group">
						<input type="text" name="loaiGiayPhep" id="loaiGiayPhep" class="form-control" value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getLoaiGiayPhepVT())? "" : donLienVan.getLoaiGiayPhepVT())%>">
						<input type="text" style="margin: 4px 0;" name="coQuanCapPhep" id="coQuanCapPhep" class="form-control" value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getNoiCapGiayPhepVT())? "" : donLienVan.getNoiCapGiayPhepVT())%>">
						<div class="input-group">
							<input  type="text" id="ngayCapPhep" name="ngayCapPhep" value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getNgayCapGiayPhepVT())? "" : donLienVan.getNgayCapGiayPhepVT())%>" class="form-control" onclick="gtCalendar('ngayCapPhep')">
							<span class="input-group-addon" onclick="gtCalendar('ngayCapPhep')"><i class="fa fa-calendar" onclick="gtCalendar('ngayCapPhep')"></i></span>
						</div>
					</div>
				</div>
				
				<div>
					<label class="pull-left ">6. Thời gian hết hoạt động tại Việt Nam</label>
					<label class="col-xs-12">The expiry date in Viet Nam<span class="red">*</span>:</label>
					<div class="clear"></div>
					<div class="row M0">
						<div class="col-xs-4 form-group">
						   	<div class="input-group">
								<input type="text" id="thoiGianHetHoatDong" name="thoiGianHetHoatDong" value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getNgayCapGiayPhepVT())? "" : donLienVan.getNgayCapGiayPhepVT())%>" class="form-control" onclick="gtCalendar('thoiGianHetHoatDong')">
								<span class="input-group-addon" onclick="gtCalendar('thoiGianHetHoatDong')"><i class="fa fa-calendar" onclick="gtCalendar('thoiGianHetHoatDong')"></i></span>
							</div>
						</div>
						<div class="col-xs-8 form-group">
						</div>
					</div>
				</div>	
				
				<label class="pull-left ">7. Lý do xin gia hạn (Mô tả lý do không thể về nước theo quy định)</label><br/>
				<label class="col-xs-12">  Reason for extention (explain the reason why you can not come back your country in accordance with the regulation) </label><span class="red">*</span>:<br/>	
				<textarea style="margin: 5px 0 0; width: 100%; height: 50px" id="lyDoXinGiaHan" name="lyDoXinGiaHan"> <%=(Validator.isNull(donLienVan))? "" : (Validator.isNull(donLienVan.getTuNgay())? "" : donLienVan.getTuNgay())%></textarea>		
				
				<label class="pull-left ">8.  Đề nghị xin gia hạn giấy phép vận tải để khắc phục sự cố trong thời gian</label>
				<label class="pull-left "> Proposal to extend the transport permit in order to resolve the problems :<br/>
				<div class="modal-body">
					<div class="col-xs-4 form-group">
						<label for="soNgaySuCo">Số ngày(Days) <span class="red">*</span>:</label>
						<input type="text" id="soNgaySuCo" name="soNgaySuCo" class="form-control"  value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getThoiGian())? "" : donLienVan.getThoiGian())%>" onchange="onChangeDateFrom()">
					</div>
					<div class="col-xs-4 form-group">
						<label for="thoiGianKhacPhucSuCoFrom">Từ ngày(Date from)<span class="red">*</span>:</label>
						<div class="input-group">
							<input type="text" onchange="onChangeDateFrom()" id="thoiGianKhacPhucSuCoFrom" name="thoiGianKhacPhucSuCoFrom" value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getTuNgay())? "" : donLienVan.getTuNgay())%>" class="form-control" onclick="gtCalendar('thoiGianKhacPhucSuCoFrom')">
							<span class="input-group-addon" onclick="gtCalendar('thoiGianKhacPhucSuCoFrom')"><i class="fa fa-calendar" onclick="gtCalendar('thoiGianKhacPhucSuCoFrom')"></i></span>
						</div>
					</div>
					
					<div class="col-xs-4 form-group">
						<label for="thoiGianKhacPhucSuCoTo">Đến ngày(Date to):</label>
						<div class="input-group">
							<input type="text" id="thoiGianKhacPhucSuCoTo" name="thoiGianKhacPhucSuCoTo" value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getDenNgay())? "" : donLienVan.getDenNgay())%>" onclick="gtCalendar('thoiGianKhacPhucSuCoTo')"  class="form-control">
							<span class="input-group-addon" ><i class="fa fa-calendar"></i></span>
						</div>
					</div>
				</div>
			</div>	
			<%
			
			String start = request.getParameter("thoiGianKhacPhucSuCoTo");
			_log.info("----------start: " + start);
			%>
			<label class="pull-left ">9. Trong thời gian được gia hạn tôi xin cam kết thực hiện nghiêm các nội dung quy định trong giấy phép vận tải.</label><br/>
			<label class="col-xs-12">During the extension period, I undertook to implement the contents regulated in the transport permit. </label><br/>
			<div class="clear"></div>
				
			<!-- ----------BUTTON---------------- -->
<!-- 			<div class="row M0"> -->
			<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/_button.jspf"%>
<!-- 			</div> -->
			
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
		
		var loaiGiayPhep = document.getElementById("loaiGiayPhep").value;
		var coQuanCapPhep = document.getElementById("coQuanCapPhep").value;
		var ngayCapPhep = document.getElementById("ngayCapPhep").value;
		var thoiGianHetHoatDong = document.getElementById("thoiGianHetHoatDong").value;

		var lyDoXinGiaHan = document.getElementById("lyDoXinGiaHan").value;
		

		

		if (coQuanGui == "") {
			alert("Chọn cơ quan cấp phép");
			return false;
		}
		
		
		if (loaiGiayPhep == "") {
			alert("Loại giấy phép không được để trống");
			return false;
		}
		if (coQuanCapPhep == "") {
			alert("Cơ quan cấp không được để trống");
			return false;
		}
		if (ngayCapPhep == "") {
			alert("Ngày cấp phép không được để trống");
			return false;
		}
		if (thoiGianHetHoatDong == "") {
			alert("Thời gian hết hoạt động không được để trống");
			return false;
		}

		if (lyDoXinGiaHan == "") {
			alert("Lý do xin gia hạn không được để trống");
			return false;
		}
		
		var soNgaySuCo = document.getElementById("soNgaySuCo").value;
		var ngayFrom = document.getElementById("thoiGianKhacPhucSuCoFrom").value;
		
		var kiemTraTF = isNaN(soNgaySuCo);

		if (soNgaySuCo == "") {
			alert("Số ngày không được để trống");
			return false;
		}

		if (kiemTraTF == true) {
			alert("Số ngày phải để ở định dạng số");
			return false;
		} else {
			if (soNgaySuCo > 10) {
				alert("Số ngày phải nhỏ hơn 10");
				return false;
			}
		}
		if(ngayFrom.trim().length = 0) {
			alert("Từ ngày không được bỏ trống");
			return false;
		}
		
		document.getElementById('<portlet:namespace />myForm').action = url;
		document.getElementById('<portlet:namespace />myForm').submit();
	}

	function onChangeDateFrom() {
		var soNgay = document.getElementById("soNgaySuCo").value;
		var ngayFrom = document.getElementById("thoiGianKhacPhucSuCoFrom").value;

		var kiemTraTF = isNaN(soNgay);

		if (soNgay == "") {
			alert("Số ngày không được để trống");
			return false;
		}

		if (kiemTraTF == true) {
			alert("Số ngày phải để ở định dạng số");
			document.getElementById("soNgaySuCo").value = '';
			return false;
		} else {
			if (soNgay > 10) {
				alert("Số ngày phải nhỏ hơn 10");
				return false;
			}
		}
		if(ngayFrom.trim().length = 0) {
			alert("Từ ngày không được bỏ trống");
			return false;
		} else {
			
			$.ajax({
				url: '<%=updateContentURL%>',
				dataType : "json",
				data : {
					dateCount : soNgay,
					dateFrom : ngayFrom,
					type: 'plusDay'
				},
				type : "get",
				success : function(data) {
					$.each(data, function(idx, obj) {
						document.getElementById("thoiGianKhacPhucSuCoTo").value = obj.value;
					});
				},
				beforeSend : function(data) {
					console.log("(1)==onChangeDateFrom==beforeSend==" + data);
				},
				complete : function(data) {
					console.log("(3)==onChangeDateFrom==complete==" + data);
				},
				error : function(data) {
					console.log("(2)==onChangeDateFrom==error==" + data);
				}
			});
		}
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


