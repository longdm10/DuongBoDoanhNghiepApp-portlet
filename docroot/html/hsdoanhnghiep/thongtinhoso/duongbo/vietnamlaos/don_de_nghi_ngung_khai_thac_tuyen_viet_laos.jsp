<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.duongbo.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="vn.dtt.duongbo.business.nghiepvu.NghiepVuUtils"%>
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
<%@page import="vn.dtt.duongbo.business.DanhMucConstants"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.maudon.model.NgungKhaiThacTuyenVTHKCDBangOtoVietLao"%>
<%@page import="vn.dtt.duongbo.maudon.xml.MauDonFactory"%>
<%@page import="vn.dtt.duongbo.maudon.xml.XmlUtils"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%!private static Log _log = LogFactoryUtil.getLog(DoanhNghiepAction.class);%>

<%
	_log.info("/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/don_de_nghi_ngung_khai_thac_tuyen_viet_laos.jsp");
	
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	
	String noiDungXmml = ParamUtil.getString(request, "noiDungXmml");
	
	long bieuMauHoSoId = 0;
	
	
	
	NgungKhaiThacTuyenVTHKCDBangOtoVietLao donLienVan =null;
	
	
	TthcNoidungHoSo noidungHoSo = null;
	
	if (hoSoThuTucId > 0) {
		noidungHoSo = TthcNoidungHoSoLocalServiceUtil.getLastByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId, thanhPhanHoSoId);
		if (Validator.isNotNull(noidungHoSo) && Validator.isNotNull(noidungHoSo.getNoiDungXml())) {
			
			_log.info("don_de_nghi_ngung_khai_thac_tuyen_viet_cam.jsp--noidungHoSo--" + noidungHoSo.getId());
			
			List<Object> lstObj = MauDonFactory.converXMLMessagesContentToObject(XmlUtils.replaceXML(noidungHoSo.getNoiDungXml()));
			
			if (lstObj != null && lstObj.size() > 0) {
				donLienVan = (NgungKhaiThacTuyenVTHKCDBangOtoVietLao) lstObj.get(0);
			}
		}
	}
	
	if (donLienVan == null) { donLienVan = MauDonFactory.converXmlToObject(noiDungXmml, new NgungKhaiThacTuyenVTHKCDBangOtoVietLao()); }
	
	
	
	TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(thuTucHanhChinhId);
	TthcThanhPhanHoSo thanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.fetchTthcThanhPhanHoSo(thanhPhanHoSoId);
	TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
	
	DnDoanhNghiep doanhNghiep = DoanhNghiepUtils.getDoanhNghiepByUserId(PortalUtil.getUserId(request));
	
	TthcBieuMauHoSo bieuMauHoSo = NghiepVuUtils.getBieuMauHoSoByThanhPhanHoSoId(thanhPhanHoSoId);
	_log.info("------/maBieuMauHoSo---------" + bieuMauHoSo.getMaBieuMau());
	_log.info("------/thuTucHanhChinh-------" + thuTucHanhChinh.getMaThuTuc());
	
	String loaiTthc = ParamUtil.getString(request, Constants.LOAI_THU_TUC_HANH_CHINH);
	
	List<DmDataItem> lstTinhThanh = DanhMucConstants.getTinhThanh();
	List<DmDataItem> lstCoQuanCapPhep = DanhMucConstants.getCoQuanCapPhep(thuTucHanhChinhId+"");
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

xemTruocNoiDung.setParameter(Constants.LOAI_THU_TUC_HANH_CHINH, loaiTthc);
xemTruocNoiDung.setParameter(Constants.PATH_MAUDON_VIEW_PDF, "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/don_de_nghi_ngung_khai_thac_tuyen_viet_laos_view.jsp");
%>

<aui:form action="<%=xemTruocNoiDung.toString()%>" name="myForm" id="myForm" method="POST">
	<!------------------------------------- /van_ban_thong_bao_ngung_khai_thac_tuyen_viet_laos.jsp ---------------------------------------->
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

				<%
					if (Constants.LVTT_VIET_NAM_LAO.equalsIgnoreCase(loaiTthc)) {
				%>
				<h3 class="tle text-center">
					THÔNG BÁO<br>NGỪNG KHAI THÁC TUYẾN VẬN TẢI HÀNH KHÁCH<br>CỐ ĐỊNH BẰNG XE Ô TÔ GIỮA VIỆT NAM - LÀO
				</h3>

				<%
					}
				
				%>

				<div class="col-sm-12">
					<!-- 				<p class="text-center"><label>Kính gửi</label><span class="textU">: Tổng cục đường bộ Việt Nam</span></p> -->
					<div class="text-center col-xs-12 MB20">
						<label class="textlabel col-xs-2 col-xs-offset-3" style="width: 9.1%;">Kính gửi:</label>
						<div class="col-xs-5">
							<select class="form-control" id="coQuanGui" name="coQuanGui">
								<option>-- Lựa chọn cơ quan cấp phép --</option>
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
					<label class="pull-left w250">1. Tên doanh nghiệp, hợp tác xã</label>
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
						<span class="pull-left">: <%=doanhNghiep.getDienThoai()%></span> <span class="pull-left w250 text-center"><b>Số Fax</b></span>:
						<%=doanhNghiep.getFax()%></p>
					<%
						if (Constants.LVTT_VIET_NAM_LAO.equalsIgnoreCase(loaiTthc)) {
					%>
					<label class="pull-left">4. Giấy phép vận tải đường bộ quốc tế Việt - Lào do Tổng cục Đường bộ Việt Nam cấp:</label>

					<%
						} else if (Constants.LVTT_VIET_NAM_CAMPUCHIA.equalsIgnoreCase(loaiTthc)) {
					%>
					<label class="pull-left">4. Giấy phép vận tải đường bộ quốc tế Việt Nam - Campuchia do Tổng cục Đường bộ Việt Nam cấp:</label>
					<%
						}
					%>
					<div class="clear"></div>
					<div style="padding: 0 15px">
						<label class="pull-left w265">Số <span class="red">*</span></label>
						<p>
							:
							<%=(Validator.isNull(doanhNghiep.getSoDangKyKinhDoanh()) ? "" : doanhNghiep.getSoDangKyKinhDoanh())%></p>
						<label class="pull-left w265">Ngày cấp <span class="red">*</span></label>
						<p>
							:
							<%=DateUtils.dateToString("dd/MM/yyyy", doanhNghiep.getNgayCapDkKd())%></p>
					</div>

					<label class="pull-left w250 textlabel">5. Kể từ ngày <span class="red">*</span></label>
					<div class="input-group" style="width: 25%">
						<input type="text" class="form-control" id="ngayNgungKhaiThac" name="ngayNgungKhaiThac" onclick="gtCalendar('ngayNgungKhaiThac')" value="<%=donLienVan!=null?donLienVan.getNgayNgung():""%>"> <span
							class="input-group-addon" onclick="gtCalendar('ngayNgungKhaiThac')"><i class="fa fa-calendar" onclick="gtCalendar('ngayNgungKhaiThac')"></i></span>
					</div>
					<label class="pull-left w250 textlabel" style="height: 17px"></label>

					<%
						if (Constants.LVTT_VIET_NAM_LAO.equalsIgnoreCase(loaiTthc)) {
					%>
					<p style="padding: 7px 0 0 15px; font-weight: normal">
						doanh nghiệp (HTX) Công ty
						<%=doanhNghiep.getTenDoanhNghiep().toUpperCase()%>
						sẽ ngừng khai thác tuyến vận tải hành khách tuyến cố định giữa Việt Nam và Lào.
					</p>

					<%
						} else if (Constants.LVTT_VIET_NAM_CAMPUCHIA.equalsIgnoreCase(loaiTthc)) {
					%>
					<p style="padding: 7px 0 0 15px; font-weight: normal">
						doanh nghiệp (HTX) Công ty
						<%=doanhNghiep.getTenDoanhNghiep().toUpperCase()%>
						sẽ ngừng khai thác tuyến vận tải hành khách tuyến cố định giữa Việt Nam và Campuchia.
					</p>
					<%
						}
					%>
					<label class="pull-left textlabel w250">6. Tên tuyến đề nghị ngừng khai thác <span class="red">*</span></label>
					<div class="col-sm-7 PA0">
						<select class="form-control" id="tuyenNgungKhaiThac" name="tuyenNgungKhaiThac">
							<option value="">Chọn tuyến</option>
							<%
								for (DmDataItem item : lstTuyenVietLao) {
							%>
							<option value="<%=item.getCode()%>" <%=((donLienVan == null)? "" : ((donLienVan.getTenTuyenNgungKhaiThac() == null) ? "" : donLienVan.getTenTuyenNgungKhaiThac().trim())).equals(item.getCode())? "selected='selected'" : ""%>><%=item.getName()%></option>
							<%
								}
							%>
						</select>
					</div>
				</div>

				<input type="hidden" id="<%=Constants.ID_DOANH_NGHIEP%>" name="<%=Constants.ID_DOANH_NGHIEP%>" value="<%=doanhNghiep.getId()%>" />

				<!-- ----------BUTTON---------------- -->
				<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/_button.jspf"%>
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
		
		if (tinhThanh == "") {
			alert("Lựa chọn tỉnh thành");
			return false;
		}

		if (coQuanGui == "") {
			alert("Lựa chọn cơ quan cấp phép");
			return false;
		}
		var ngayNgungKhaiThac = document.getElementById("ngayNgungKhaiThac").value;

		//var tuyenNgungKhaiThac = document.getElementById("tuyenNgungKhaiThac").value;
		

		if (ngayNgungKhaiThac == "") {
			alert("Ngày ngừng khai thác không được để trống");
			return false;
		}
		  if(isDate(ngayNgungKhaiThac) == false){
				alert("ngày ngừng khai thác không đúng định dạng");
				return false;
			}
		/*if (tuyenNgungKhaiThac == "") {
			alert("Tuyến ngừng khai thác không được để trống");
			return false;
		}*/
		
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
