<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepImpl"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="vn.dtt.duongbo.maudon.model.DeNghiGiaHanGiayPhepLienVanVietLao"%>
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
	_log.info("------/don_de_nghi_gia_han_gplv_cho_phuong_tien_viet_laos.jsp-----");

	long userId = PortalUtil.getUserId(request);
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	long idBieuMauHoSo = ParamUtil.getLong(request, Constants.ID_BIEU_MAU_HO_SO);
	
	DnDoanhNghiep doanhNghiep = DoanhNghiepUtils.getDoanhNghiepByUserId(userId);
	
	if (Validator.isNull(doanhNghiep)) {
		_log.info("=====doanhNghiep=== NULL");
		doanhNghiep = new DnDoanhNghiepImpl();
	}
	
	String tenDoanhNghiep = ParamUtil.getString(request, "tenDoanhNghiep").trim();
	String diaChi = ParamUtil.getString(request, "diaChi").trim();
	String soDienThoai = ParamUtil.getString(request, "soDienThoai");
	String soFax = ParamUtil.getString(request, "soFax");
	String soGiayPhep = ParamUtil.getString(request, "soGiayPhep");
	String ngayCapGiayPhep = ParamUtil.getString(request, "ngayCapGiayPhep");
	String noiCap = ParamUtil.getString(request, "noiCap");
	String ngayCoGiaTri = ParamUtil.getString(request, "ngayCoGiaTri");
	String thoiGianNhapCanh = ParamUtil.getString(request, "thoiGianNhapCanh");
	String soNgayGiaHanGplv = ParamUtil.getString(request, "soNgayGiaHanGplv");
	String lyDoDeNghiGiaHan = ParamUtil.getString(request, "lyDoDeNghiGiaHan");
	String soGiaoThongVanTai = ParamUtil.getString(request, "soGiaoThongVanTai");
	String bienSoXe = ParamUtil.getString(request, "bienSoXe");
	String ngayFromGiaHanGplv = ParamUtil.getString(request, "ngayFromGiaHanGplv");
	String ngayToGiaHanGplv = ParamUtil.getString(request, "ngayToGiaHanGplv");
	String ngayFromGiaHanChuyenDi = ParamUtil.getString(request, "ngayFromGiaHanChuyenDi");
	String ngayToGiaHanChuyenDi = ParamUtil.getString(request, "ngayToGiaHanChuyenDi");
	String coQuanGui = ParamUtil.getString(request, "coQuanGui");
	String diaChiDoanhNghiep = ParamUtil.getString(request, "diaChiDoanhNghiep");

	
	
	//Ten modal export
	DeNghiGiaHanGiayPhepLienVanVietLao mauDon = new DeNghiGiaHanGiayPhepLienVanVietLao();
	mauDon.setTenCongTy(doanhNghiep.getTenDoanhNghiep());
	mauDon.setDiaChi(diaChiDoanhNghiep);
	mauDon.setDienThoai(doanhNghiep.getDienThoai());
	mauDon.setFax(doanhNghiep.getFax());
	mauDon.setSoGTVT(soGiaoThongVanTai);
	mauDon.setBiensoGiaHan(bienSoXe);
	mauDon.setSoGPLVVL(soGiayPhep);
	mauDon.setNgayCapGPLVVL(ngayCapGiayPhep);
	mauDon.setNoiCapGPLVVL(noiCap);
	mauDon.setGiaTriGPLVVL(ngayCoGiaTri);
	mauDon.setThoiGianNhapCanh(thoiGianNhapCanh);
	mauDon.setSoNgayGiaHan(soNgayGiaHanGplv);
	mauDon.setLydoGiaHan(lyDoDeNghiGiaHan);
	mauDon.setNgayFromGiahanGplv(ngayFromGiaHanGplv);
	mauDon.setNgayToGiahanGplv(ngayToGiaHanGplv);
	mauDon.setNgayFromGiahanChuyenDi(ngayFromGiaHanChuyenDi);
	mauDon.setNgayToGiahanChuyenDi(ngayToGiaHanChuyenDi);
	mauDon.setCoQuanGui(coQuanGui);
	mauDon.setTinhThanh(doanhNghiep.getMaTinhThanh());
	mauDon.setCoQuanCapGiayPhep(doanhNghiep.getCoQuanCapDkKd());
	mauDon.setNgayCapGiayPhep(DateUtils.dateToString("dd/MM/yyyy", doanhNghiep.getNgayCapDkKd()));
	
	
	String objXml = MauDonFactory.convertObjectToXml(mauDon);
	
	TthcBieuMauHoSo bieuMauHoSo = TthcBieuMauHoSoLocalServiceUtil.fetchTthcBieuMauHoSo(idBieuMauHoSo);
	if (bieuMauHoSo == null) { bieuMauHoSo = new TthcBieuMauHoSoImpl(); }
	
	PortletURL actionLuuNoiDungHoSo = renderResponse.createActionURL();
	actionLuuNoiDungHoSo.setParameter(ActionRequest.ACTION_NAME, "luuNoiDungHoSo");
	actionLuuNoiDungHoSo.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	actionLuuNoiDungHoSo.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	actionLuuNoiDungHoSo.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
	actionLuuNoiDungHoSo.setParameter("noiDungXmml", objXml);
	
	PortletURL actionBack = renderResponse.createRenderURL();
	actionBack.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/don_de_nghi_gia_han_gplv_cho_phuong_tien_viet_laos.jsp");
	actionBack.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	actionBack.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	actionBack.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
	actionBack.setParameter("noiDungXmml", objXml);
	
%>

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
				<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/thong_tin_hs_report_export.jsp"%>
			</div>
			
		</div>
		
		<div class="col-xs-12">
			<aui:form name="myForm" method="POST" action="<%=actionLuuNoiDungHoSo.toString()%>">
				<input type="hidden" name="<%=Constants.ID_THU_TUC_HANH_CHINH%>" value="<%=thuTucHanhChinhId%>">
				<input type="hidden" name="<%=Constants.ID_HO_SO_THU_TUC%>" value="<%=hoSoThuTucId%>">
				<input type="hidden" name="<%=Constants.ID_THANH_PHAN_HO_SO%>" value="<%=thanhPhanHoSoId%>">
				<input type="hidden" name="coQuanGui" value="<%=coQuanGui%>">
				<button class="btn btn-primary" type="button" onclick="summitForm('<%=actionLuuNoiDungHoSo%>')">Lưu lại</button>
				<%-- <button class="btn btn-primary" type="button" onclick="summitForm('<%=actionKySo%>')">Ký số</button> --%>
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
	
	
	
	
	