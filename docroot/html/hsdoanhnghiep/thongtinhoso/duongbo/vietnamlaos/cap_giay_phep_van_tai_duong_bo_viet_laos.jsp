<%@page import="vn.dtt.duongbo.utils.format.DateUtils"%>
<%@page import="vn.dtt.duongbo.maudon.model.DeNghiCapGiayPhepVanTaiDuongBoVietLao"%>
<%@page import="vn.dtt.duongbo.business.nghiepvu.NghiepVuUtils"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="vn.dtt.duongbo.business.DanhMucConstants"%>
<%@page import="vn.dtt.duongbo.dao.common.model.impl.TthcBieuMauHoSoImpl"%>
<%@page import="vn.dtt.duongbo.report.ReportUtils"%>
<%@page import="vn.dtt.duongbo.utils.DoanhNghiepUtils"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalService"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.portlet.doanhnghiep.DoanhNghiepAction"%>
<%@page import="vn.dtt.duongbo.maudon.xml.MauDonFactory"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcBieuMauHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoBieuMauLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepUserLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongbo.utils.*"%>
<%@page import="java.util.List"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%! private static Log _log = LogFactoryUtil.getLog(DoanhNghiepAction.class); %>

<%
	_log.info("/html/hsdoanhnghiep/thongtinhoso/vietnamlaos/cap_giay_phep_van_tai_duong_bo_viet_laos.jsp");
	
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	long idNoiDungHoSo = ParamUtil.getLong(request, Constants.ID_NOI_DUNG_HO_SO);
	
	String noiDungXmml = ParamUtil.getString(request, "noiDungXmml");
	
	long bieuMauHoSoId = 0;
	
	String node_1 = "";
	
	TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(thuTucHanhChinhId);
	TthcThanhPhanHoSo thanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.fetchTthcThanhPhanHoSo(thanhPhanHoSoId);
	TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
	
	long userId = PortalUtil.getUserId(request);
	DnDoanhNghiep doanhNghiep = DoanhNghiepUtils.getDoanhNghiepByUserId(userId);
	
	TthcBieuMauHoSo bieuMauHoSo = NghiepVuUtils.getBieuMauHoSoByThanhPhanHoSoId(thanhPhanHoSoId);
	_log.info("------/maBieuMauHoSo---------" + bieuMauHoSo.getMaBieuMau());
	_log.info("------/thuTucHanhChinh-------" + thuTucHanhChinh.getMaThuTuc());
	
	List<String> codeLoaiHinhHoatDongList = null;
	
	List<String> codeLyDoCapLaiList = null;
	
	DeNghiCapGiayPhepVanTaiDuongBoVietLao donLienVan = null;
	TthcNoidungHoSo noidungHoSo = null;
	if(idNoiDungHoSo > 0){
		noidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(idNoiDungHoSo);
	}
	
	if (Validator.isNotNull(noidungHoSo) && Validator.isNotNull(noidungHoSo.getNoiDungXml())) {
		
		_log.info("-----noidunghosoId--" + noidungHoSo.getId());
		_log.info("-----noidunghosoXml--" + noidungHoSo.getNoiDungXml());
	
		List<Object> lstObj = MauDonFactory.converXMLMessagesContentToObject(noidungHoSo.getNoiDungXml());
		if (lstObj != null && lstObj.size() > 0) {
			donLienVan = (DeNghiCapGiayPhepVanTaiDuongBoVietLao) lstObj.get(0);
		}
	}
	
	if (donLienVan == null) { donLienVan = MauDonFactory.converXmlToObject(noiDungXmml, new DeNghiCapGiayPhepVanTaiDuongBoVietLao());}
	
	if (donLienVan != null) {
		codeLoaiHinhHoatDongList = donLienVan.getLoaiHinhHoatDongs();
		codeLyDoCapLaiList = donLienVan.getLyDoCapLais();
	}
	
	if (donLienVan == null) { donLienVan = new DeNghiCapGiayPhepVanTaiDuongBoVietLao(); 	}
	
	_log.info("--------codeLoaiHinhHoatDongList--" + codeLoaiHinhHoatDongList);
	_log.info("--------codeLyDoCapLaiList--" + codeLyDoCapLaiList);
	
	String loaiTthc = ParamUtil.getString(request, Constants.LOAI_THU_TUC_HANH_CHINH);
	String maLoaiHinhDeNghiCap = "";
	String maLyDoCapLai = "";
	
	if (Constants.TTHC_VIET_LAO_CAP_PHEP_DUONG_BO.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc())) {
		maLoaiHinhDeNghiCap = DanhMucConstants.DM_CODE_LOAI_HINH_DE_NGHI_CAP_MOI;
		
	} else if (Constants.TTHC_VIET_LAO_CAP_LAI_DUONG_BO_HET_HAN.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc())) {
		maLoaiHinhDeNghiCap = DanhMucConstants.DM_CODE_LOAI_HINH_DE_NGHI_CAP_LAI;
		maLyDoCapLai = DanhMucConstants.DM_CODE_LY_DO_CAP_LAI_HET_HAN;
		
	} else if (Constants.TTHC_VIET_LAO_CAP_LAI_DUONG_BO_MAT_MAT.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc())) {
		maLoaiHinhDeNghiCap = DanhMucConstants.DM_CODE_LOAI_HINH_DE_NGHI_CAP_LAI;
		maLyDoCapLai = DanhMucConstants.DM_CODE_LY_DO_CAP_LAI_MAT_MAT;
		
	} else if (Constants.TTHC_VIET_LAO_CAP_LAI_DUONG_BO_HU_HONG.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc())) {
		maLoaiHinhDeNghiCap = DanhMucConstants.DM_CODE_LOAI_HINH_DE_NGHI_CAP_LAI;
		maLyDoCapLai = DanhMucConstants.DM_CODE_LY_DO_CAP_LAI_HONG;
	}
	
	node_1 = "TN,VC,VL";
	
	List<DmDataItem> lstCoQuanCapPhep = DanhMucConstants.getCoQuanCapPhep(thuTucHanhChinhId+"");
	List<DmDataItem> allLoaiHinhHoatDong = DanhMucConstants.getallLoaiHinhHoatDong();
	List<DmDataItem> allLoaiHinhDeNghiCap = DanhMucConstants.getallLoaiHinhDeNghiCap();
	List<DmDataItem> allLyDoCapLai = DanhMucConstants.getallLyDoCapLai();
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

xemTruocNoiDung.setParameter(Constants.ID_BIEU_MAU_HO_SO, StringUtil.valueOf(bieuMauHoSoId));
xemTruocNoiDung.setParameter(Constants.ID_DOANH_NGHIEP, doanhNghiep.getId() + "");
xemTruocNoiDung.setParameter("maLoaiHinhDeNghiCap", maLoaiHinhDeNghiCap);

xemTruocNoiDung.setParameter(Constants.LOAI_THU_TUC_HANH_CHINH, loaiTthc);
xemTruocNoiDung.setParameter(Constants.PATH_MAUDON_VIEW_PDF, "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/cap_giay_phep_van_tai_duong_bo_viet_laos_view.jsp");
%>
<aui:form action="<%=xemTruocNoiDung.toString()%>" name="myForm" id="myForm" method="POST">

<!------------------------------------- /cap_giay_phep_van_tai_duong_bo_viet_laos.jsp ---------------------------------------->
<h4 class="PL15 BGT BOB font14 col-xs-12"><%=bieuMauHoSo.getTenBieuMau()%></h4>
<div class="P10 col-xs-12">
	<div class="BGT noidung">
		<div class="box900">
			<div class="col-sm-12">
				<p class="pull-left text-center"><b><%=doanhNghiep.getTenDoanhNghiep().toUpperCase()%><br>
					Đề nghị cấp giấy phép<br>
					-------</b>
				</p>
				<p class="pull-right text-center"><b>CỘNG HÒA XÃ HỘI CHỦ NGHĨA VIỆT NAM<br>
					Độc lập - Tự do - Hạnh phúc</b><br>
					---------------
				</p>
			</div>
			
			<h3 class="tle text-center">ĐƠN ĐỀ NGHỊ<br>CẤP GIẤY PHÉP VẬN TẢI ĐƯỜNG BỘ QUỐC TẾ<br>VIỆT NAM - LÀO</h3>
			
			<div class="text-center col-xs-12 MB20">
				<label class="textlabel col-xs-2 col-xs-offset-3" style="width: 11.1%;">Kính gửi<span class="red">*</span>:</label>
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
				
			<label class="pull-left">1. Tên doanh nghiệp, HTX</label><p class="textU">: <%=doanhNghiep.getTenDoanhNghiep().toUpperCase()%></p>
			
			<label class="pull-left w250">2. Địa chỉ</label>
			<div class="col-sm-7 PA0">
				<input type="text" id="diaChiDoanhNghiep" name="diaChiDoanhNghiep" style="width: 95%" value="<%=doanhNghiep.getDiaChi()%>" class="form-control">
			</div>
			<div class="clear"></div>
			<div style="height: 5px">&nbsp</div>
			
			<label class="pull-left w250">3. Số điện thoại</label>
			<p>
				<span class="pull-left">: <%=doanhNghiep.getDienThoai()%></span>
				<span class="pull-left w250 text-center"><b>Số Fax</b></span>: <%=doanhNghiep.getFax()%></p>
			
			<label class="pull-left">4. Giấy phép kinh doanh vận tải bằng xe ô tô (Giấy chứng nhận đăng ký kinh doanh)</label>
			
			<div class="clear"></div>
			
			<div style="padding:0 15px">
				<label class="pull-left w265">Số</label><p>: <%=(Validator.isNull(doanhNghiep.getSoDangKyKinhDoanh()) ? "" : doanhNghiep.getSoDangKyKinhDoanh())%></p>
				<label class="pull-left w265">Ngày cấp</label><p>: <%=DateUtils.dateToString("dd/MM/yyyy", doanhNghiep.getNgayCapDkKd())%></p>
				<label class="pull-left w265">Cơ quan cấp</label><p>: <%=(Validator.isNull(doanhNghiep.getCoQuanCapDkKd()) ? "" : doanhNghiep.getCoQuanCapDkKd())%></p>
			</div>
			
			<label class="pull-left">5. Đề nghị cấp Giấy phép vận tải đường bộ quốc tế Việt Nam - Lào như sau <span class="red">*</span></label>
			
			<div class="clear"></div>
			
			<div style="padding:0 15px">
				<p>- Loại hình hoạt động (ghi rõ một hoặc một số loại hình đề nghị cấp, gồm: vận tải hành khách bằng ô tô theo tuyến cố định; vận tải hành khách theo hợp đồng; vận tải khách du lịch bằng xe ô tô; vận tải hàng hóa bằng xe ô tô):</p>
				
				<%
				List<DmDataItem> lstLoaiHinhHoatDong = DmDataItemLocalServiceUtil.findByGroupCodeAndNode1(DanhMucConstants.DM_LOAI_HINH_HOAT_DONG, node_1);
				if (lstLoaiHinhHoatDong == null) { lstLoaiHinhHoatDong = new ArrayList<DmDataItem>(); }
				for (DmDataItem item : lstLoaiHinhHoatDong) {
					%>
					<div class="checkbox">
						<label><input type="checkbox" id="loaiHinhHoatDong<%=item.getCode()%>" name="loaiHinhHoatDong" value="<%=item.getCode()%>" <%=CommonUtils.checkButton(Constants.TYPE_CHECKBOX, item, codeLoaiHinhHoatDongList) %>><%=item.getName()%></label>
					</div>
					<%
				}
				%>
				
				<p>- Loại hình đề nghị cấp: <b><%=ReportUtils.getTenDmDataByCode(maLoaiHinhDeNghiCap)%></b></p>
				<%
				if (DanhMucConstants.DM_CODE_LOAI_HINH_DE_NGHI_CAP_LAI.equalsIgnoreCase(maLoaiHinhDeNghiCap.trim())) {
				%>
					<p>Lý do cấp lại <span class="red">*</span>:</p>
					<%
					for(DmDataItem lyDoCapLai : allLyDoCapLai) {
						%>
						<div class="radio">
							<label>
								<input name="lyDoCapLai" id="lyDoCapLai" type="radio" checked="checked" value="<%=lyDoCapLai.getCode()%>" <%=CommonUtils.checkButton(Constants.TYPE_RADIO, lyDoCapLai, codeLyDoCapLaiList) %>><%=lyDoCapLai.getName()%>
							</label>
						</div>
						<%
					}
				}
				
				%>
<%-- 				<textarea id="noiDungLyDoCapLais" name="noiDungLyDoCapLais" style="width: 100%" rows="3" cols="80"><%=(Validator.isNull(donLienVan.getNoiDungLyDoCapLais())? "" : (donLienVan.getNoiDungLyDoCapLais())) %></textarea> --%>
			</div>
			
			<!-- ----------BUTTON---------------- -->

					<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/_button.jspf"%>
	
			
			
		</div>
	</div>
</div>
</aui:form>


<script type="text/javascript">
	
	var idTenThuongMai = "" ;
	idTenThuongMai = "#textTenThuongMai";
	
	jQuery(document).ready(function($) {
		$(idTenThuongMai).keypad({keypadOnly: false, layout: _specChar, prompt: _promptTitle});
	});


	
	function summitForm(url) {

		var coQuanGui = document.getElementById("coQuanGui").value;
		if(coQuanGui==""){
			alert("Chọn cơ quan gửi ");
			return false;
			}
		 var radio_check_val = "";
	        for (var i = 0; i < document.getElementsByName('loaiHinhHoatDong').length; i++) {
	            if (document.getElementsByName('loaiHinhHoatDong')[i].checked) {
	                radio_check_val = document.getElementsByName('loaiHinhHoatDong')[i].value;
	            }
	        }
	        if (radio_check_val === "")
	        {
	            alert("Chọn loại hình hoạt động");
				return false;
	        }

	        <%
			if (DanhMucConstants.DM_CODE_LOAI_HINH_DE_NGHI_CAP_LAI.equalsIgnoreCase(maLoaiHinhDeNghiCap.trim())) {
			%>
			var noiDungLyDoCapLais = $("#noiDungLyDoCapLais");
	        
	     	if(typeof(noiDungLyDoCapLais) != "undefined" && noiDungLyDoCapLais.val().trim() === ""){
				alert("Nội dung lý do cấp lại không được để trống ");
				return false;
				}
	        <%
			}
			%>

		
		document.getElementById('<portlet:namespace />myForm').action = url;
		document.getElementById('<portlet:namespace />myForm').submit();
	}
	
</script>