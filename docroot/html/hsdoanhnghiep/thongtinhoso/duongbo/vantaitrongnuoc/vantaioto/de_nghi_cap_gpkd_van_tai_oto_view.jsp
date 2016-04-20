<%@page import="vn.dtt.duongbo.business.nghiepvu.NghiepVuUtils"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepImpl"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="vn.dtt.duongbo.maudon.model.DeNghiCapGiayPhepKDVTBangXeOto"%>
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
	_log.info("------/de_nghi_cap_gpkd_van_tai_oto_view.jsp---------");

	long userId = PortalUtil.getUserId(request);
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	
	
	
	TthcBieuMauHoSo bieuMauHoSo = NghiepVuUtils.getBieuMauHoSoByThanhPhanHoSoId(thanhPhanHoSoId);
	if (bieuMauHoSo == null) { bieuMauHoSo = new TthcBieuMauHoSoImpl(); }
	long idBieuMauHoSo = bieuMauHoSo.getId();
	

	DnDoanhNghiep doanhNghiep = DoanhNghiepUtils.getDoanhNghiepByUserId(userId);
	if (Validator.isNull(doanhNghiep)) { doanhNghiep = new DnDoanhNghiepImpl(); }
	
	String coQuanGui= ParamUtil.getString(request, "coQuanGui");
	String diaChiDoanhNghiep = ParamUtil.getString(request, "diaChiDoanhNghiep");
	
	//Ten modal export
	DeNghiCapGiayPhepKDVTBangXeOto mauDon = new DeNghiCapGiayPhepKDVTBangXeOto();
	mauDon.setTenCongTy(doanhNghiep.getTenDoanhNghiep());
	mauDon.setDiaChi(diaChiDoanhNghiep);
	mauDon.setDienThoai(doanhNghiep.getDienThoai());
	mauDon.setSoGiayPhepKinhDoanh(doanhNghiep.getSoDangKyKinhDoanh());
	mauDon.setNgayCapGiayPhepKinhDoanh(FormatData.parseDateToTringDDMMYYY(doanhNghiep.getNgayCapDkKd()));
		
	mauDon.setCoQuanCapGiayPhepKinhDoanh(doanhNghiep.getCoQuanCapDkKd());
	mauDon.setNguoiDaiDien(doanhNghiep.getNguoiDaiDien());
	mauDon.setCoQuanGui(coQuanGui);
	mauDon.setTenQuocTe(doanhNghiep.getTenTiengAnh());
	mauDon.setTinhThanh(doanhNghiep.getMaTinhThanh());
	
	
	String[] lstloaiHinhKDVT = ParamUtil.getParameterValues(request, "dataLoaiHinhKdvt", new String[]{});
	List<String> codeLoaiHinhKDVTs = Arrays.asList(lstloaiHinhKDVT);
	_log.info("-----loaiHinhKdvt---size---" + codeLoaiHinhKDVTs.size());
	if (codeLoaiHinhKDVTs != null && codeLoaiHinhKDVTs.size() > 0) {
		mauDon.setLoaiHinhKDVTs(codeLoaiHinhKDVTs);
	}
	
	String[] lstObjectLoaiHinhHoatDong = ParamUtil.getParameterValues(request, "objectLoaiHinhHoatDong", new String[]{});
	_log.info("-----lstObjectLoaiHinhHoatDong---size---" + lstObjectLoaiHinhHoatDong.length);
	
	List<DeNghiCapGiayPhepKDVTBangXeOto.DanhSachLoaiHinhHoatDong> codeDanhSachLoaiHinhs = new ArrayList<DeNghiCapGiayPhepKDVTBangXeOto.DanhSachLoaiHinhHoatDong>();
	
	for (String s: lstObjectLoaiHinhHoatDong) {
		String[] properties = s.split(";");
		//_log.info("-------s: " + s);
		//_log.info("-------properties: ");
		System.out.print(properties);
		if (properties != null && properties.length > 0) {
			
			DeNghiCapGiayPhepKDVTBangXeOto.DanhSachLoaiHinhHoatDong loaiHinh = new DeNghiCapGiayPhepKDVTBangXeOto.DanhSachLoaiHinhHoatDong();
			loaiHinh.setLoaiHinhHoatDong(properties[3]);
			loaiHinh.setMauSon(properties[5]);
			loaiHinh.setPhamViHoatDong(properties[7]);
			loaiHinh.setSoLuongPhuongTien(properties[9]);
			loaiHinh.setThietBiGiamSatHanhTrinh(properties[10]);
			
			codeDanhSachLoaiHinhs.add(loaiHinh);
		}
		
	}
	
	if (codeDanhSachLoaiHinhs != null && codeDanhSachLoaiHinhs.size() > 0) {
		mauDon.getDanhSachLoaiHinhHoatDong().addAll(codeDanhSachLoaiHinhs);
	}
	
	//String noiDungLyDoCapLai = ParamUtil.getString(request, "noiDungLyDoCapLai");
	//mauDon.setNoiDungLyDoCapLai(noiDungLyDoCapLai);
	
	String objXml = MauDonFactory.convertObjectToXml(mauDon);

	PortletURL actionLuuNoiDungHoSo = renderResponse.createActionURL();
	actionLuuNoiDungHoSo.setParameter(ActionRequest.ACTION_NAME, "luuNoiDungHoSo");
	actionLuuNoiDungHoSo.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	actionLuuNoiDungHoSo.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	actionLuuNoiDungHoSo.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
	actionLuuNoiDungHoSo.setParameter("noiDungXmml", objXml);
	
/* 	PortletURL actionKySo = renderResponse.createActionURL();
	actionKySo.setParameter(ActionRequest.ACTION_NAME, "kySo");
	actionKySo.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	actionKySo.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	actionKySo.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId)); */
	
	PortletURL actionBack = renderResponse.createRenderURL();
	actionBack.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/vantaioto/de_nghi_cap_gpkd_van_tai_oto.jsp");
	actionBack.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	actionBack.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
	actionBack.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	actionBack.setParameter("noiDungXmml", objXml);
	for (String loaiHinhHoatDong : lstObjectLoaiHinhHoatDong) {
		actionBack.setParameter("objectLoaiHinhHoatDong", loaiHinhHoatDong);
	}
%>

<!-- /html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/vantaioto/de_nghi_cap_gpkd_van_tai_oto_view.jsp -->

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
				<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/vantaioto/thong_tin_hs_report_export.jsp"%>
			</div>
			
		</div>
		
		<div class="col-xs-12">
			<aui:form name="myForm" method="POST" action="<%=actionLuuNoiDungHoSo.toString()%>">
			
				<input type="hidden" name="coQuanGui" value="<%=coQuanGui%>">
				
				<%for (String loaiHinh: lstObjectLoaiHinhHoatDong) {%>
					<input type="hidden" id="objectLoaiHinhHoatDong" name="objectLoaiHinhHoatDong" value="<%=loaiHinh%>">
				<%}%>
				
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
