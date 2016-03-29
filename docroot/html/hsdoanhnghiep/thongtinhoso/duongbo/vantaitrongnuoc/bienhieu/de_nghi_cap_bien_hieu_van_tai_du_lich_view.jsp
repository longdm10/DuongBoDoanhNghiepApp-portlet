<%@page import="com.liferay.portal.model.User"%>
<%@page import="vn.dtt.duongbo.maudon.model.DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich"%>
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
	_log.info("------/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/bienhieu/de_nghi_cap_bien_hieu_van_tai_du_lich_view.jsp---------");
	long userId = PortalUtil.getUserId(request);
	
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	long idBieuMauHoSo = ParamUtil.getLong(request, Constants.ID_BIEU_MAU_HO_SO);
	
	
	String coQuanGui= ParamUtil.getString(request, "coQuanGui");
	String tinhThanh= ParamUtil.getString(request, "tinhThanh");
	String diaChiDoanhNghiep = ParamUtil.getString(request, "diaChiDoanhNghiep");
	
	String soXeDeNghiCapBH= ParamUtil.getString(request, "soXeDeNghiCapBH");
	
	String[] lstLinhVucKinhDoanh = ParamUtil.getParameterValues(request, "linhVucKinhDoanh", new String[]{});
	
	
	String[] lstStringObjctPhuongTien = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[]{});
	
	_log.info("------/--lstStringObjctPhuongTien.size---" + lstStringObjctPhuongTien.length);
	
	List<DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich.DanhSachXe> codeDanhSachXes = new ArrayList<DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich.DanhSachXe>();
	
	for (String s: lstStringObjctPhuongTien) {
		String[] properties = s.split(";");
		//_log.info("-------s: " + s);
		//_log.info("-------properties: " + properties);
		if (properties != null && properties.length > 0) {
			DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich.DanhSachXe xe = new DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich.DanhSachXe();
			xe.setTenHieu(properties[1]);
			xe.setBienSoXe(properties[2]);
			xe.setSoKhung(properties[11]);
			xe.setSoMay(properties[12]);
			xe.setNamSX(properties[5]);
			xe.setMauSon(properties[13]);
			xe.setSoCho(properties[14]);
			
			codeDanhSachXes.add(xe);
			//_log.info("------/de_nghi_cap_bien_hieu_van_tai_du_lich_view.jsp--dsXe---" + xe.getBienSoXe() + "--" + xe.getSoCho());
		}
		
	}
	
	
	long idDoanhNghiep = ParamUtil.getLong(request, Constants.ID_DOANH_NGHIEP);
	DnDoanhNghiep doanhNghiep = DoanhNghiepUtils.getDoanhNghiepByUserId(userId);
	//---------Ten modal export
	DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich mauDon = new DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich();
	mauDon.setTenCongTy(doanhNghiep.getTenDoanhNghiep());
	mauDon.setDiaChi(diaChiDoanhNghiep);
	mauDon.setCoQuanGui(coQuanGui);
	
	mauDon.setSoXeDeNghi(soXeDeNghiCapBH);
	mauDon.setSoGPKD(doanhNghiep.getSoDangKyKinhDoanh());
	mauDon.setTinhThanh(tinhThanh);
	mauDon.setNoiCapGPKD(doanhNghiep.getCoQuanCapDkKd());
	mauDon.setSoDienThoai(doanhNghiep.getDienThoai());
	mauDon.setSoGPLH(doanhNghiep.getSoDangKyKinhDoanh());
	mauDon.setNgayCapGPKD(DateUtils.dateToString("dd/MM/yyyy", doanhNghiep.getNgayCapDkKd()));
	mauDon.setNgayCapGPLH(DateUtils.dateToString("dd/MM/yyyy", doanhNghiep.getNgayCapDkKd()));
	mauDon.setNoiCapGPLH(doanhNghiep.getCoQuanCapDkKd());
	mauDon.setTenQuocTe(doanhNghiep.getTenTiengAnh());
	
	if (codeDanhSachXes != null && codeDanhSachXes.size() > 0) {
		mauDon.setDanhSachXe(codeDanhSachXes);
	}
	
	List<String> codeLinhVucKinhDoanhs = Arrays.asList(lstLinhVucKinhDoanh);
	if (codeLinhVucKinhDoanhs != null && codeLinhVucKinhDoanhs.size() > 0) {
		mauDon.setLinhVucKinhDoanhs(codeLinhVucKinhDoanhs);
	}
	
	String objXml = MauDonFactory.convertObjectToXml(mauDon);
	
	TthcBieuMauHoSo bieuMauHoSo = TthcBieuMauHoSoLocalServiceUtil.fetchTthcBieuMauHoSo(idBieuMauHoSo);
	if (bieuMauHoSo == null) { bieuMauHoSo = new TthcBieuMauHoSoImpl(); }
	
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
	actionBack.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/bienhieu/de_nghi_cap_bien_hieu_van_tai_du_lich.jsp");
	actionBack.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	actionBack.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	actionBack.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
	actionBack.setParameter("noiDungXmml", objXml);
	for (String phuongTien : lstStringObjctPhuongTien) {
		actionBack.setParameter("objectPhuongTien", phuongTien);
	}
	
	
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
				<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/bienhieu/thong_tin_hs_report_export.jsp"%>
			</div>
			
		</div>
		
		<div class="col-xs-12">
			<aui:form name="myForm" method="POST" action="<%=actionLuuNoiDungHoSo.toString()%>">
				<input type="hidden" name="<%=Constants.ID_THU_TUC_HANH_CHINH%>" value="<%=thuTucHanhChinhId%>">
				<input type="hidden" name="<%=Constants.ID_HO_SO_THU_TUC%>" value="<%=hoSoThuTucId%>">
				<input type="hidden" name="<%=Constants.ID_THANH_PHAN_HO_SO%>" value="<%=thanhPhanHoSoId%>">
				<input type="hidden" name="<%=Constants.ID_DOANH_NGHIEP %>" value="<%=String.valueOf(idDoanhNghiep)%>">
				
				<%for (String s: lstStringObjctPhuongTien) {%>
					<input type="hidden" id="objectPhuongTien" name="objectPhuongTien" value="<%=s%>">
				<%}%>
				<input type="hidden" name="coQuanGui" value="<%=coQuanGui%>">
				<input type="hidden" name="tinhThanh" value="<%=tinhThanh%>">
				
				
				<%for (String s : lstLinhVucKinhDoanh) {%>
					<input type="hidden" id="linhVucKinhDoanh" name="linhVucKinhDoanh" value="<%=s%>">
				<%}%>
				
				<input type="hidden" name="soXeDeNghiCapBH" value="<%=soXeDeNghiCapBH%>">
				
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




