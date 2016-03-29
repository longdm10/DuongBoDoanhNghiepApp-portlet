<%@page import="com.liferay.portal.model.User"%>
<%@page import="vn.dtt.duongbo.maudon.model.PhuHieuXe6LoaiXe"%>
<%@page import="vn.dtt.duongbo.utils.config.DuongBoConfigurationManager"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepImpl"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="vn.dtt.duongbo.maudon.model.DeNghiCapGiayPhepVanTaiDuongBoVietTrung"%>
<%@page import="vn.dtt.duongbo.portlet.doanhnghiep.DoanhNghiepAction"%>
<%@page import="vn.dtt.duongbo.dao.common.model.impl.TthcBieuMauHoSoImpl"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcBieuMauHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.utils.format.*"%>
<%@page import="vn.dtt.duongbo.utils.*"%>
<%@page import="vn.dtt.duongbo.maudon.xml.MauDonFactory"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@ include file="/html/init.jsp"%>

<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%! private static Log _log = LogFactoryUtil.getLog(DoanhNghiepAction.class); %>

<%
	_log.info("------/html/canbo/thulyhs/duongbo/thongtinhoso/vantaitrongnuoc/phuhieu/phu_hieu_xe_noi_bo_view.jsp---------");
	long userId = PortalUtil.getUserId(request);
	
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	long idBieuMauHoSo = ParamUtil.getLong(request, Constants.ID_BIEU_MAU_HO_SO);
	
	
// 	String doNguoiCap= ParamUtil.getString(request, "doNguoiCap");
// 	String coQuanGui= ParamUtil.getString(request, "coQuanGui");
// 	String tinhThanh= ParamUtil.getString(request, "tinhThanh");
// 	String soGiayPhepKinhDoanh= ParamUtil.getString(request, "soGiayPhepKinhDoanh");
// 	String ngayCap= ParamUtil.getString(request, "ngayCap");
// 	String linhVucKinhDoanh= ParamUtil.getString(request, "linhVucKinhDoanh");
// 	String soXeDeNghiCapBH= ParamUtil.getString(request, "soXeDeNghiCapBH");
// 	String tenQuocTe= ParamUtil.getString(request, "tenQuocTe");
	
	String so = "1";
	String tinhThanh = "TP Hà Giang";
	String tuyenHoatDong = "Hà nội - Hà Giang";
	String donVi = "Công ty TNHH A23 Việt Nam";
	String bienDangKy = "29V3.21415";
	String giaTriDen = "20/06/2016";

	
	long idDoanhNghiep = ParamUtil.getLong(request, Constants.ID_DOANH_NGHIEP);
	DnDoanhNghiep doanhNghiep = DoanhNghiepUtils.getDoanhNghiepByUserId(userId);
	//---------Ten modal export
	PhuHieuXe6LoaiXe mauDon = new PhuHieuXe6LoaiXe();
	mauDon.setBienDangKy(bienDangKy);
	mauDon.setDonVi(donVi);
	mauDon.setGiaTriDen(giaTriDen);
	mauDon.setSo(so);
	mauDon.setTinhThanh(tinhThanh);
	mauDon.setTuyenHoatDong(tuyenHoatDong);
	
	
	String objXml = MauDonFactory.convertObjectToXml(mauDon);
	
	TthcBieuMauHoSo bieuMauHoSo = TthcBieuMauHoSoLocalServiceUtil.fetchTthcBieuMauHoSo(idBieuMauHoSo);
	if (bieuMauHoSo == null) { bieuMauHoSo = new TthcBieuMauHoSoImpl(); }
	
	PortletURL actionLuuNoiDungHoSo = renderResponse.createActionURL();
	actionLuuNoiDungHoSo.setParameter(ActionRequest.ACTION_NAME, "luuNoiDungHoSo");
	actionLuuNoiDungHoSo.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	actionLuuNoiDungHoSo.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	actionLuuNoiDungHoSo.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
	actionLuuNoiDungHoSo.setParameter("noiDungXmml", objXml);
	
	PortletURL actionKySo = renderResponse.createActionURL();
	actionKySo.setParameter(ActionRequest.ACTION_NAME, "kySo");
	actionKySo.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	actionKySo.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	actionKySo.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
	
	PortletURL actionBack = renderResponse.createRenderURL();
	actionBack.setParameter("jspPage", "/html/canbo/thulyhs/duongbo/thongtinhoso/vantaitrongnuoc/phuhieu/phu_hieu_xe_noi_bo.jsp");
	actionBack.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	actionBack.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	actionBack.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
	actionBack.setParameter("noiDungXmml", objXml);
	
	
%>
<div class="title_right"></div>
<h4 class="PL15 BGT BOB font14 col-xs-12"><%=Validator.isNotNull(bieuMauHoSo.getTenBieuMau()) ? bieuMauHoSo.getTenBieuMau() : ""%></h4>
<div class="P10 col-xs-12">
	<div class="BGT noidung">
		<div class="col-xs-12">
			<!-- Hướng dẫn -->
			<div role="alert" class="alert alert-warning">
				<h5 style="margin-top: -10px;">Xem trước nội dung</h5>
			</div>
			
			<!-- noi dung file PDF-->
			<div>
				<%@ include file="/html/canbo/thulyhs/duongbo/thongtinhoso/vantaitrongnuoc/phuhieu/thong_tin_hs_report_export.jsp"%>
			</div>
			
		</div>
		
		<div class="col-xs-12">
			<aui:form name="myForm" method="POST" action="<%=actionLuuNoiDungHoSo.toString()%>">
				<input type="hidden" name="<%=Constants.ID_THU_TUC_HANH_CHINH%>" value="<%=thuTucHanhChinhId%>">
				<input type="hidden" name="<%=Constants.ID_HO_SO_THU_TUC%>" value="<%=hoSoThuTucId%>">
				<input type="hidden" name="<%=Constants.ID_THANH_PHAN_HO_SO%>" value="<%=thanhPhanHoSoId%>">
				<input type="hidden" name="<%=Constants.ID_DOANH_NGHIEP %>" value="<%=String.valueOf(idDoanhNghiep)%>">
				
				<input type="hidden" name="soB" value="<%=soB%>">
				<input type="hidden" name="giaTriDen" value="<%=giaTriDen%>">
				<input type="hidden" name="bienDangKy" value="<%=bienDangKy%>">
				<input type="hidden" name="donVi" value="<%=donVi%>">
				<input type="hidden" name="soA" value="<%=soA%>">
				
				
				<button class="btn btn-primary" type="button" onclick="summitForm('<%=actionLuuNoiDungHoSo%>')">Lưu lại</button>
				<button class="btn btn-primary" type="button" onclick="summitForm('<%=actionKySo%>')">Ký số</button>
				<button class="btn btn-primary" type="button" onclick="summitForm('<%=actionBack%>')">Quay lại</button>
				
			</aui:form>
		</div>
	</div>
</div>

<script type="text/javascript">
function summitForm(url) {
	document.getElementById('<portlet:namespace />myForm').action = url;
	document.getElementById('<portlet:namespace />myForm').submit();
}
</script>




