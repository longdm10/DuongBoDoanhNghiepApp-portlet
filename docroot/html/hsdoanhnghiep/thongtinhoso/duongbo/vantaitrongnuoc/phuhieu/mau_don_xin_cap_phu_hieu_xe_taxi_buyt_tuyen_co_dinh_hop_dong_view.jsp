<%@page import="vn.dtt.duongbo.maudon.model.GiayDeNghiCapPhuHieuBienHieu"%>
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
	_log.info("------/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/phuhieu/mau_don_xin_cap_phu_hieu_xe_taxi_buyt_tuyen_co_dinh_hop_dong_view.jsp---------");
	long userId = PortalUtil.getUserId(request);
	
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	long idBieuMauHoSo = ParamUtil.getLong(request, Constants.ID_BIEU_MAU_HO_SO);
	
	String coQuanGui= ParamUtil.getString(request, "coQuanGui");
	String soLuongBHPHNopLai= ParamUtil.getString(request, "soLuongBHPHNopLai");
	String soLuongDeNghiCap= ParamUtil.getString(request, "soLuongDeNghiCap");
	String diaChiDoanhNghiep = ParamUtil.getString(request, "diaChiDoanhNghiep");
	
	String[] lstStringObjctPhuongTien = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[]{});
	
	_log.info("------/--lstStringObjctPhuongTien.size---" + lstStringObjctPhuongTien.length);
	_log.info("------/--lstStringObjctPhuongTien:---" + lstStringObjctPhuongTien);
	
	List<GiayDeNghiCapPhuHieuBienHieu.DanhSachXe> codeDanhSachXes = new ArrayList<GiayDeNghiCapPhuHieuBienHieu.DanhSachXe>();
	
	for (String s: lstStringObjctPhuongTien) {
		String[] properties = s.split(";");
		//_log.info("-------s: " + s);
		//_log.info("-------properties: " + properties);
		if (properties != null && properties.length > 0) {
			GiayDeNghiCapPhuHieuBienHieu.DanhSachXe xe = new GiayDeNghiCapPhuHieuBienHieu.DanhSachXe();
			xe.setNhanHieu(properties[1]);
			xe.setBienSoXe(properties[2]);
			xe.setSucChua(properties[3]);
			xe.setNuocSX(properties[4]);
			xe.setNamSX(properties[5]);
			xe.setTuyenCD(properties[6]);
			xe.setTuyenHoatDong1(properties[7]);
			xe.setTuyenHoatDong2(properties[8]);
			
			codeDanhSachXes.add(xe);
			
			//String[] lstDiemDungNghi =  properties[18].replace("#", ",").split(",");
			//_log.info("------xe: " + xe.getBienSoXe() + "--loaihinh:" + xe.getTuyenCD() + "--tuyen:" + xe.getTuyenHoatDong1() + "-------" +  xe.getTuyenHoatDong2());
			//_log.info("------tuyen xe: " + xe.getTuyenCD() + ":"+ ((!xe.getTuyenCD().equals("DM_LHHD_HKTCD")) ? vn.dtt.duongbo.report.ReportUtils.getTenDmDataByCode(xe.getTuyenCD()) : (vn.dtt.duongbo.report.ReportUtils.getTenDmDataByCode(xe.getTuyenHoatDong1()) + ", " + vn.dtt.duongbo.report.ReportUtils.getTenDmDataByCode(xe.getTuyenHoatDong2()))));
		}
		
	}
	
	
	long idDoanhNghiep = ParamUtil.getLong(request, Constants.ID_DOANH_NGHIEP);
	DnDoanhNghiep doanhNghiep = DoanhNghiepUtils.getDoanhNghiepByUserId(userId);
	
	//---------Ten modal export
	GiayDeNghiCapPhuHieuBienHieu mauDon = new GiayDeNghiCapPhuHieuBienHieu();
	mauDon.setTinhThanh(doanhNghiep.getMaTinhThanh());
	//mauDon.setQuanHuyen(doanhNghiep.getMaQuanHuyen());
	//mauDon.setPhuongXa(doanhNghiep.getMaPhuongXa());
	
	mauDon.setTenCongTy(doanhNghiep.getTenDoanhNghiep());
	mauDon.setDiaChi(diaChiDoanhNghiep);
	mauDon.setCoQuanGui(coQuanGui);
	mauDon.setSoLuongNopLai(soLuongBHPHNopLai);
	mauDon.setSoDienThoai(doanhNghiep.getDienThoai());
	mauDon.setSoLuongDeNghiCap(soLuongDeNghiCap);
	mauDon.setSoGPVanTai(soLuongBHPHNopLai);
	
	
	mauDon.setSoGiayPhepKDVTOto(doanhNghiep.getSoGpkdVanTaiBangOto());
	mauDon.setNgayCapGiayPhepKDVTOto(DateUtils.dateToString("dd/MM/yyyy", doanhNghiep.getNgayCapGpkdVanTaiBangOto()));
	mauDon.setNoiCapGiayPhepKDVTOto(doanhNghiep.getCoQuanCapGpkdVanTaiBangOto());
	
	if (codeDanhSachXes != null && codeDanhSachXes.size() > 0) {
		_log.info("--codeDanhSachXes---" + codeDanhSachXes.size());
		mauDon.setDanhSachXes(codeDanhSachXes);
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
	actionBack.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/phuhieu/mau_don_xin_cap_phu_hieu_xe_taxi_buyt_tuyen_co_dinh_hop_dong.jsp");
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
				<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/phuhieu/thong_tin_hs_report_export.jsp"%>
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




