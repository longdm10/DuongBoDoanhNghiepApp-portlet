<%@page import="vn.dtt.duongbo.business.nghiepvu.NghiepVuUtils"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepImpl"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="vn.dtt.duongbo.maudon.model.DonXinCapGPLienVanVietLao"%>
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
	
	_log.info("------/ tao vào cap_giay_phep_lienvan_phi_thuong_mai_viet_laos_view.jsp-----");

	long userId = PortalUtil.getUserId(request);
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	
	
	TthcBieuMauHoSo bieuMauHoSo = NghiepVuUtils.getBieuMauHoSoByThanhPhanHoSoId(thanhPhanHoSoId);
	if (bieuMauHoSo == null) { bieuMauHoSo = new TthcBieuMauHoSoImpl(); }
	

	long idDoanhNghiep = ParamUtil.getLong(request, Constants.ID_DOANH_NGHIEP);
	DnDoanhNghiep doanhNghiep = DoanhNghiepUtils.getDoanhNghiepByUserId(userId);
	String coQuanGui= ParamUtil.getString(request, "coQuanGui");
	String lyDoMat= ParamUtil.getString(request, "lyDoMat");
	String diaChiDoanhNghiep = ParamUtil.getString(request, "diaChiDoanhNghiep");
	
	_log.info("------/coQuanGui-----"+coQuanGui);
	
	//Ten modal export
	DonXinCapGPLienVanVietLao mauDon = new DonXinCapGPLienVanVietLao();
	mauDon.setTenCongTy(doanhNghiep.getTenDoanhNghiep());
	mauDon.setDiaChi(diaChiDoanhNghiep);
	mauDon.setSoDienThoai(doanhNghiep.getDienThoai());
	mauDon.setSoFax(doanhNghiep.getFax());
	mauDon.setSoGPDKKD(doanhNghiep.getSoDangKyKinhDoanh());
	mauDon.setCQCapGPDKKD(doanhNghiep.getCoQuanCapDkKd());
	mauDon.setNgayCapGPDKKD(DateUtils.dateToString("dd/MM/yyyy", new Date()));
	mauDon.setCoQuanGui(coQuanGui);
	mauDon.setLyDoMat(lyDoMat);
	mauDon.setTinhThanh(doanhNghiep.getMaTinhThanh());
	
	String[] lstMucDichChuyenDi = ParamUtil.getParameterValues(request, "mucDichChuyenDi", new String[]{});
	List<String> codeMucDichChuyenDis = Arrays.asList(lstMucDichChuyenDi);
	if (codeMucDichChuyenDis != null && codeMucDichChuyenDis.size() > 0) {
		mauDon.getMucDichChuyenDi().addAll(codeMucDichChuyenDis);
	}
	
	String[] lstStringObjctPhuongTien = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[]{});
	_log.info("------/cap_giay_phep_lienvan_phi_thuong_mai_viet_laos_view.jsp--lstStringObjctPhuongTien.size---" + lstStringObjctPhuongTien.length);
	
	List<DonXinCapGPLienVanVietLao.DanhSachXe> codeDanhSachXes = new ArrayList<DonXinCapGPLienVanVietLao.DanhSachXe>();
	
	for (String s: lstStringObjctPhuongTien) {
		String[] properties = s.split(";");
		
		if (properties != null && properties.length > 0) {
			
			DonXinCapGPLienVanVietLao.DanhSachXe xe = new DonXinCapGPLienVanVietLao.DanhSachXe();
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
			
			_log.info("------/cap_giay_phep_lienvan_phi_thuong_mai_viet_laos_view.jsp--dsXe---" + xe.getBienSoXe() + "--" + xe.getTrongTai());
			codeDanhSachXes.add(xe);
		}
		
	}
	if (codeDanhSachXes != null && codeDanhSachXes.size() > 0) {
		mauDon.getDanhSachXe().addAll(codeDanhSachXes);
	}
	
	String objXml = MauDonFactory.convertObjectToXml(mauDon);
	
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
	actionBack.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/cap_giay_phep_lienvan_phi_thuong_mai_viet_laos.jsp");
	actionBack.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	actionBack.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	actionBack.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
	actionBack.setParameter(Constants.ID_DOANH_NGHIEP, String.valueOf(idDoanhNghiep));
	actionBack.setParameter(Constants.ID_BIEU_MAU_HO_SO, String.valueOf(bieuMauHoSo.getId()));
	actionBack.setParameter(Constants.LOAI_THU_TUC_HANH_CHINH, ParamUtil.getString(request, Constants.LOAI_THU_TUC_HANH_CHINH));
	actionBack.setParameter("noiDungXmml", objXml);
	for (String phuongTien : lstStringObjctPhuongTien) {
		actionBack.setParameter("objectPhuongTien", phuongTien);
	}
	
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
				<%for (String s : lstMucDichChuyenDi) {%>
					<input type="hidden" id="mucDichChuyenDi" name="mucDichChuyenDi" value="<%=s%>">
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
	
	