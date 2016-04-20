<%@page import="vn.dtt.duongbo.utils.format.DateUtils"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepImpl"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="vn.dtt.duongbo.maudon.model.NgungKhaiThacTuyenVTHKCDBangOtoVietLao"%>
<%@page import="vn.dtt.duongbo.maudon.model.DeNghiCapGiayPhepVanTaiDuongBoVietLao"%>
<%@page import="vn.dtt.duongbo.portlet.doanhnghiep.DoanhNghiepAction"%>
<%@page import="vn.dtt.duongbo.dao.common.model.impl.TthcBieuMauHoSoImpl"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcBieuMauHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.maudon.xml.MauDonFactory"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@ include file="/html/init.jsp"%>

<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>


<%
	LogFactoryUtil.getLog(DoanhNghiepAction.class).info("------/don_de_nghi_ngung_khai_thac_tuyen_viet_laos_view.jsp---------");
	long userId = PortalUtil.getUserId(request);
	
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	long idBieuMauHoSo = ParamUtil.getLong(request, Constants.ID_BIEU_MAU_HO_SO);
	long idDoanhNghiep = ParamUtil.getLong(request, Constants.ID_DOANH_NGHIEP);
	
	DnDoanhNghiep doanhNghiep = DnDoanhNghiepLocalServiceUtil.fetchDnDoanhNghiep(idDoanhNghiep);
	if (Validator.isNull(doanhNghiep)) { doanhNghiep = new DnDoanhNghiepImpl(); }
	
	String tuyenNgungKhaiThac = ParamUtil.getString(request, "tuyenNgungKhaiThac");
	String ngayNgungKhaiThac = ParamUtil.getString(request, "ngayNgungKhaiThac");
	String tinhThanh = ParamUtil.getString(request, "tinhThanh");
	String coQuanGui = ParamUtil.getString(request, "coQuanGui");
	String diaChiDoanhNghiep = ParamUtil.getString(request, "diaChiDoanhNghiep");
	
	
	//---------------------Ten modal export
	NgungKhaiThacTuyenVTHKCDBangOtoVietLao mauDon = new NgungKhaiThacTuyenVTHKCDBangOtoVietLao();
	mauDon.setTenCongTy(doanhNghiep.getTenDoanhNghiep());
	mauDon.setDiaChi(diaChiDoanhNghiep);
	mauDon.setDienThoai((doanhNghiep.getDienThoai()));
	mauDon.setNgayCapGiayPhepVantai(DateUtils.dateToString("dd/MM/yyyy", doanhNghiep.getNgayCapDkKd()));
	mauDon.setNgayNgung(ngayNgungKhaiThac);
	mauDon.setSoGiayPhepVanTai(doanhNghiep.getSoDangKyKinhDoanh());
	mauDon.setTenTuyenNgungKhaiThac(tuyenNgungKhaiThac);
	mauDon.setTinhThanh(tinhThanh);
	mauDon.setCoQuanGui(coQuanGui);
	mauDon.setTinhThanh(doanhNghiep.getMaTinhThanh());
	
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
	actionBack.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/don_de_nghi_ngung_khai_thac_tuyen_viet_laos.jsp");
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
				<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/thong_tin_hs_report_export.jsp"%>
			</div>
			
		</div>
		
		<div class="col-xs-12">
			<aui:form name="myForm" method="POST" action="<%=actionLuuNoiDungHoSo.toString()%>">
				<input type="hidden" name="<%=Constants.ID_THU_TUC_HANH_CHINH%>" value="<%=thuTucHanhChinhId%>">
				<input type="hidden" name="<%=Constants.ID_HO_SO_THU_TUC%>" value="<%=hoSoThuTucId%>">
				<input type="hidden" name="<%=Constants.ID_THANH_PHAN_HO_SO%>" value="<%=thanhPhanHoSoId%>">
				
				<input type="hidden" name="tuyenNgungKhaiThac" value="<%=tuyenNgungKhaiThac%>">.
				<input type="hidden" name="ngayNgungKhaiThac" value="<%=ngayNgungKhaiThac%>">
				<input type="hidden" name="tenDoanhNghiep" value="<%=doanhNghiep.getTenDoanhNghiep()%>">
				<input type="hidden" name="diaChi" value="<%=doanhNghiep.getDiaChi()%>">
				<input type="hidden" name="soDienThoai" value="<%=doanhNghiep.getDienThoai()%>">
				<input type="hidden" name="fax" value="<%=doanhNghiep.getFax()%>">
				<input type="hidden" name="soDangKyKinhDoanh" value="<%=doanhNghiep.getSoDangKyKinhDoanh()%>">
				<input type="hidden" name="tinhThanh" value="<%=tinhThanh%>">
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




