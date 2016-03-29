<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepImpl"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="vn.dtt.duongbo.maudon.model.DonXinCapGPLVTMVietLao"%>
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
	
	_log.info("------/cap_giay_phep_lienvan_phuongtien_kinhdoanh_vantai_viet_laos_view.jsp-----");
	
	long userId = PortalUtil.getUserId(request);
	
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long idBieuMauHoSo = ParamUtil.getLong(request, Constants.ID_BIEU_MAU_HO_SO);
	

	long idDoanhNghiep = ParamUtil.getLong(request, Constants.ID_DOANH_NGHIEP);
	DnDoanhNghiep doanhNghiep = DnDoanhNghiepLocalServiceUtil.fetchDnDoanhNghiep(idDoanhNghiep);
	
	if (Validator.isNull(doanhNghiep)) { 
		_log.info("=====doanhNghiep=== NULL");
		doanhNghiep = new DnDoanhNghiepImpl();
	}
	
	
	String tuyenDiCuaKhau = ParamUtil.getString(request, "tuyenDiCuaKhau").trim();
	String tuyenDiTinhThanh = ParamUtil.getString(request, "tuyenDiTinhThanh").trim();
	String culyVanChuyen = ParamUtil.getString(request, "culyVanChuyen");
	String lyDoMat = ParamUtil.getString(request, "lyDoMat");
	
	String selBenXeDi = ParamUtil.getString(request, "selBenXeDi");
	String selBenXeDiThuocTinh = ParamUtil.getString(request, "selBenXeDiThuocTinh");
	String selBenXeDen = ParamUtil.getString(request, "selBenXeDen");
	String selBenXeDenThuocTinh = ParamUtil.getString(request, "selBenXeDenThuocTinh");
	
	String hanhTrinhTuyenDuong = ParamUtil.getString(request, "hanhTrinhTuyenDuong");
	String soCapGiayPhep = ParamUtil.getString(request, "soCapGiayPhep");
	String ngayCapGiayPhep = ParamUtil.getString(request, "ngayCapGiayPhep");
	String coQuanGui = ParamUtil.getString(request, "coQuanGui");
	String diaChiDoanhNghiep = ParamUtil.getString(request, "diaChiDoanhNghiep");
	
	
	//Ten modal export
	DonXinCapGPLVTMVietLao mauDon = new DonXinCapGPLVTMVietLao();
	mauDon.setTenCongTy(doanhNghiep.getTenDoanhNghiep());
	mauDon.setDiaChi(diaChiDoanhNghiep);
	mauDon.setSoDienThoai(doanhNghiep.getDienThoai());
	mauDon.setSoFax(doanhNghiep.getFax());
	mauDon.setLyDoMat(lyDoMat);
	
	mauDon.setSoGPVanTai(doanhNghiep.getSoDangKyKinhDoanh());
	mauDon.setNgayCapGPVanTai(DateUtils.dateToString("dd/MM/yyyy", doanhNghiep.getNgayCapDkKd()));
	
	mauDon.setTuyenDi(tuyenDiCuaKhau);
	mauDon.setTuyenDen(tuyenDiTinhThanh);
	
	mauDon.setBenXedi(selBenXeDi);
	mauDon.setBenXeDen(selBenXeDen);
	
	mauDon.setCuLy(culyVanChuyen);
	mauDon.setHanhTrinh(hanhTrinhTuyenDuong);
	
	mauDon.setSoCongVan(soCapGiayPhep);
	mauDon.setNgayCongVan(ngayCapGiayPhep);
	
	mauDon.setTinhBenDi(selBenXeDiThuocTinh);
	mauDon.setTinhBenDen(selBenXeDenThuocTinh);
	mauDon.setCoQuanGui(coQuanGui);
	mauDon.setTinhThanh(doanhNghiep.getMaTinhThanh());
	
	String[] lstLoaiHinhKDVT = ParamUtil.getParameterValues(request, "loaiHinhKinhDoanhVanTai", new String[]{});
	List<String> codeLoaiHinhKDVTs = Arrays.asList(lstLoaiHinhKDVT);
	if (codeLoaiHinhKDVTs != null && codeLoaiHinhKDVTs.size() > 0) {
		mauDon.getLoaiHinhKDVanTai().addAll(codeLoaiHinhKDVTs);
	}
	
	
	String[] lstStringObjctPhuongTien = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[]{});
	LogFactoryUtil.getLog(DoanhNghiepAction.class).info("------/cap_giay_phep_lienvan_viet_laos_phuongtien_kinhoanh_vantai_view.jsp--lstStringObjctPhuongTien.size---" + lstStringObjctPhuongTien.length);
	List<DonXinCapGPLVTMVietLao.DanhSachXe> codeDanhSachXes = new ArrayList<DonXinCapGPLVTMVietLao.DanhSachXe>();
	
	for (String s: lstStringObjctPhuongTien) {
		String[] properties = s.split(";");
		
		if (properties != null && properties.length > 0) {
			
			DonXinCapGPLVTMVietLao.DanhSachXe xe = new DonXinCapGPLVTMVietLao.DanhSachXe();
			xe.setBienSoXe(properties[1]);
			xe.setNhanHieu(properties[2]);
			xe.setTrongTai(properties[3]);
			xe.setNamSX(properties[4]);
			xe.setHinhThucHoatDong(properties[5]);
			xe.setCuaKhau(properties[6]);
			xe.setThoiGianDeNghi(properties[9] + " - " + properties[10]);
			xe.setThoiGianDeNghiFrom(properties[9]);
			xe.setThoiGianDeNghiTo(properties[10]);
			xe.setSoKhung(properties[11]);
			xe.setSoMay(properties[13]);
			xe.setMauSon(properties[12]);
			
			_log.info("------/cap_giay_phep_lienvan_viet_laos_phuongtien_kinhoanh_vantai_view.jsp--dsXe---" + xe.getBienSoXe() + "--" + xe.getTrongTai());
			codeDanhSachXes.add(xe);
		}
	}
	if (codeDanhSachXes != null && codeDanhSachXes.size() > 0) {
		mauDon.getDanhSachXe().addAll(codeDanhSachXes);
	}
	
	/*List<DonXinCapGPLVTMVietLao.DanhSachXe> codeDanhSachXes = new ArrayList<DonXinCapGPLVTMVietLao.DanhSachXe>();
	codeDanhSachXes.add(xe);
	if (codeDanhSachXes != null && codeDanhSachXes.size() > 0) {
		mauDon.setDanhSachXes(codeDanhSachXes);
	}*/
	
	String objXml = MauDonFactory.convertObjectToXml(mauDon);

	
	TthcBieuMauHoSo bieuMauHoSo = TthcBieuMauHoSoLocalServiceUtil.fetchTthcBieuMauHoSo(idBieuMauHoSo);
	if (bieuMauHoSo == null) { bieuMauHoSo = new TthcBieuMauHoSoImpl(); }
	

	PortletURL actionBack = renderResponse.createRenderURL();
	actionBack.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/cap_giay_phep_lienvan_phuongtien_kinhdoanh_vantai_viet_laos.jsp");
	actionBack.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	actionBack.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	actionBack.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
	actionBack.setParameter(Constants.LOAI_THU_TUC_HANH_CHINH, ParamUtil.getString(request, Constants.LOAI_THU_TUC_HANH_CHINH));
	actionBack.setParameter("noiDungXmml", objXml);
	
	for (String phuongTien: lstStringObjctPhuongTien) {
		actionBack.setParameter("objectPhuongTien", phuongTien);
	}
	
	

%>

<portlet:actionURL var="actionLuuNoiDungHoSo" name="luuNoiDungHoSo">
	<portlet:param name="<%= Constants.ID_THU_TUC_HANH_CHINH%>" value="<%= String.valueOf(thuTucHanhChinhId)%>"/>
	<portlet:param name="<%= Constants.ID_HO_SO_THU_TUC%>" value="<%= String.valueOf(hoSoThuTucId)%>"/>
	<portlet:param name="<%= Constants.ID_THANH_PHAN_HO_SO%>" value="<%= String.valueOf(thanhPhanHoSoId)%>"/>
	<portlet:param name="noiDungXmml" value="<%= String.valueOf(objXml)%>"/>
</portlet:actionURL>

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
				<input type="hidden" name="<%=Constants.ID_DOANH_NGHIEP %>" value="<%=String.valueOf(idDoanhNghiep)%>">
				
				<%for (String s : lstLoaiHinhKDVT) {%>
					<input type="hidden" id="loaiHinhKDVT" name="loaiHinhKDVT" value="<%=s%>">
				<%}%>
				
				<%for (String s: lstStringObjctPhuongTien) {%>
					<input type="hidden" id="objectPhuongTien" name="objectPhuongTien" value="<%=s%>">
				<%}%>
				
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



