<%@page import="vn.dtt.duongbo.maudon.model.DKKTVTTuyenCoDinhBangOtoVietCam"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepImpl"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="vn.dtt.duongbo.maudon.model.DKKTVTTuyenCoDinhBangOtoVietLao"%>
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

	_log.info("------/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/dang_ki_khai_thac_van_tai_hanh_khach_tuyen_co_dinh_viet_cam_views.jsp-----");

	long userId = PortalUtil.getUserId(request);
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	long idBieuMauHoSo = ParamUtil.getLong(request, Constants.ID_BIEU_MAU_HO_SO);
	
	
	String  dienThoai = "";
	String  fax = "";
	
	String tinhThanh = ParamUtil.getString(request, "tinhThanh").trim();
	String coQuanGui = ParamUtil.getString(request, "coQuanGui").trim();
	String SoGPVT = ParamUtil.getString(request, "SoGPVT").trim();
	String ngayCapGiayPhep = ParamUtil.getString(request, "ngayCapGiayPhep");
	
	String thanhPhoFrom = ParamUtil.getString(request, "thanhPhoFrom");
	String thanhPhoTo = ParamUtil.getString(request, "thanhPhoTo");
	String benDi = ParamUtil.getString(request, "benDi");
	String benDen = ParamUtil.getString(request, "benDen");
	
	String cuLy = ParamUtil.getString(request, "cuLy");
	String hanhTrinh = ParamUtil.getString(request, "hanhTrinh");
	String diaChiDoanhNghiep = ParamUtil.getString(request, "diaChiDoanhNghiep");
	
	_log.info("thanhPhoFrom--" + thanhPhoFrom);
	_log.info("hanhTrinh-------" + hanhTrinh);
	_log.info("thanhPhoTo----"+ thanhPhoTo);

	long idDoanhNghiep = ParamUtil.getLong(request, Constants.ID_DOANH_NGHIEP);
	DnDoanhNghiep doanhNghiep = DnDoanhNghiepLocalServiceUtil.fetchDnDoanhNghiep(idDoanhNghiep);
	if (Validator.isNull(doanhNghiep)) { doanhNghiep = new DnDoanhNghiepImpl(); }
	
	//Ten modal export
	DKKTVTTuyenCoDinhBangOtoVietCam mauDon = new DKKTVTTuyenCoDinhBangOtoVietCam();
	mauDon.setTenCongTy(doanhNghiep.getTenDoanhNghiep());
	mauDon.setDiaChi(diaChiDoanhNghiep);
	
	if(doanhNghiep!=null){
		dienThoai = doanhNghiep.getDienThoai();
		fax = doanhNghiep.getFax();
		mauDon.setDienThoai(Long.parseLong(dienThoai));
		mauDon.setFax(Long.parseLong(fax));
	}
	mauDon.setTinhThanh(tinhThanh);
	mauDon.setSoGiayPhepVanTai(SoGPVT);
	mauDon.setNgayCapGiayPhepVantai(ngayCapGiayPhep);
	mauDon.setTinhTPDi(thanhPhoFrom);
	mauDon.setTinhTPDen(thanhPhoTo);
	mauDon.setBenDi(benDi);
	mauDon.setBenDen(benDen);
	mauDon.setCuLy(cuLy);
	mauDon.setCoQuanGui(coQuanGui);
	mauDon.setHanhTrinh(hanhTrinh);
	
	List<DKKTVTTuyenCoDinhBangOtoVietCam.DanhSachXe> codeDanhSachXes = new ArrayList<DKKTVTTuyenCoDinhBangOtoVietCam.DanhSachXe>();
	
	String[] lstStringObjctPhuongTien = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[]{});
	_log.info("------/dang_ki_khai_thac_van_tai_hanh_khach_tuyen_co_dinh_viet_cam_views.jsp.--lstStringObjctPhuongTien.size---" + lstStringObjctPhuongTien.length);
	for (String s: lstStringObjctPhuongTien) {
		String[] properties = s.split(";");
		if (properties != null && properties.length > 0) {
			DKKTVTTuyenCoDinhBangOtoVietCam.DanhSachXe xe = new DKKTVTTuyenCoDinhBangOtoVietCam.DanhSachXe();
			xe.setBienKiemSoat(properties[1]);
			xe.setTenDangKy(properties[23]); 
			xe.setLoaiXe(properties[2]); 
			xe.setSoGhe(properties[3]);
			xe.setNamSx(properties[4]);
			xe.setCuaKhau(properties[6]); 
		
 			
			codeDanhSachXes.add(xe);
		}
 	}
	if (codeDanhSachXes != null && codeDanhSachXes.size() > 0) {
		mauDon.getDanhSachXe().addAll(codeDanhSachXes);
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
	actionBack.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamcampuchia/dang_ki_khai_thac_van_tai_hanh_khach_tuyen_co_dinh_viet_cam.jsp");
	actionBack.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	actionBack.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	actionBack.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
	actionBack.setParameter(Constants.LOAI_THU_TUC_HANH_CHINH, ParamUtil.getString(request, Constants.LOAI_THU_TUC_HANH_CHINH));
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
				<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/thong_tin_hs_report_export.jsp"%>
			</div>
			
		</div>
		
		<div class="col-xs-12">
			<aui:form name="myForm" method="POST" action="<%=actionLuuNoiDungHoSo.toString()%>">
				<input type="hidden" name="<%=Constants.ID_THU_TUC_HANH_CHINH%>" value="<%=thuTucHanhChinhId%>">
				<input type="hidden" name="<%=Constants.ID_HO_SO_THU_TUC%>" value="<%=hoSoThuTucId%>">
				<input type="hidden" name="<%=Constants.ID_THANH_PHAN_HO_SO%>" value="<%=thanhPhanHoSoId%>">
				
				<input type="hidden" name="coQuanGui" value="<%=coQuanGui%>">
				<input type="hidden" name="SoGPVT" value="<%=SoGPVT%>">
				<input type="hidden" name="ngayCapGiayPhep" value="<%=ngayCapGiayPhep%>">
				<input type="hidden" name="thanhPhoFrom" value="<%=thanhPhoFrom%>">
				<input type="hidden" name="thanhPhoTo" value="<%=thanhPhoTo%>">
				<input type="hidden" name="benDi" value="<%=benDi%>">
				<input type="hidden" name="benDen" value="<%=benDen%>">
				<input type="hidden" name="cuLy" value="<%=cuLy%>">
				<input type="hidden" name="hanhTrinh" value="<%=hanhTrinh%>">
				
				<%for (String s: lstStringObjctPhuongTien) {%> 
					<input type="hidden" id="objectPhuongTien" name="objectPhuongTien" value="<%=s%>"> 
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
	