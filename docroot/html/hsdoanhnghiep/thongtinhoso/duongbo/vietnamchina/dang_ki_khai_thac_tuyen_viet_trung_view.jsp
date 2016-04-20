v<%@page import="vn.dtt.duongbo.utils.format.DateUtils"%>
<%@page import="vn.dtt.duongbo.utils.DoanhNghiepUtils"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.duongbo.maudon.model.GiayDangKyKhaiThacTuyenVietTrung"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="vn.dtt.duongbo.maudon.model.DeNghiCapGiayPhepVanTaiDuongBoVietTrung"%>
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

<%! private static Log _log = LogFactoryUtil.getLog(DoanhNghiepAction.class); %>

<%
	_log.info("------/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/don_de_nghi_cap_giay_phep_van_tai_cho_xe_cong_vu_views.jsp---------");
	long userId = PortalUtil.getUserId(request);
	DnDoanhNghiep doanhNghiep = DoanhNghiepUtils.getDoanhNghiepByUserId(userId);
	
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	long idBieuMauHoSo = ParamUtil.getLong(request, Constants.ID_BIEU_MAU_HO_SO);
	
	String listNoiDungHoSo = ParamUtil.getString(request, Constants.DANH_SACH_NOI_DUNG_HO_SO);

	String tinhThanh = ParamUtil.getString(request, "tinhThanh").trim();
	String ngayLamDon = ParamUtil.getString(request, "ngayLamDon").trim();
	String coQuanGui = ParamUtil.getString(request, "coQuanGui").trim();
	
	String thanhPhoDi = ParamUtil.getString(request, "thanhPhoDi").trim();
	String thanhPhoDen = ParamUtil.getString(request, "thanhPhoDen").trim();
	String benDi = ParamUtil.getString(request, "benDi").trim();
	String benDen = ParamUtil.getString(request, "benDen").trim();
	String cuLyVanChuyen = ParamUtil.getString(request, "cuLyVanChuyen").trim();
	String hanhTrinhChayXe = ParamUtil.getString(request, "hanhTrinhChayXe").trim();
	String listDiemDungNghi = ParamUtil.getString(request, "listDiemDungNghi").trim();
	String diaChiDoanhNghiep = ParamUtil.getString(request, "diaChiDoanhNghiep");
	
	
	String[] lstStringObjctPhuongTien = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[]{});
	
	List<GiayDangKyKhaiThacTuyenVietTrung.DanhSachXe> codeDanhSachXes = new ArrayList<GiayDangKyKhaiThacTuyenVietTrung.DanhSachXe>();
	
	for (String s: lstStringObjctPhuongTien) {
		String[] properties = s.split(";");
		//_log.info("-------s: " + s);
		//_log.info("-------properties: " + properties);
		if (properties != null && properties.length > 0) {
			
			GiayDangKyKhaiThacTuyenVietTrung.DanhSachXe xe = new GiayDangKyKhaiThacTuyenVietTrung.DanhSachXe();
			xe.setBienKiemSoat(properties[1]);
			xe.setTenDangKy(properties[22]);
			xe.setLoaiXe(properties[23]);
			//_log.info("-------properties[23]: " + properties[23]);
			xe.setSoGhe(properties[3]);
			xe.setNamSx(properties[4]);
			//_log.info("-------properties[4]: " + properties[4]);
			xe.setCuaKhau(properties[6]);
			
			codeDanhSachXes.add(xe);
		}
		
	}
	
	
	//---------Ten modal export
	GiayDangKyKhaiThacTuyenVietTrung mauDon = new GiayDangKyKhaiThacTuyenVietTrung();
	mauDon.setTenCongTy(doanhNghiep.getTenDoanhNghiep());
	mauDon.setDiaChi(diaChiDoanhNghiep);
	mauDon.setDienThoai(doanhNghiep.getDienThoai());
	mauDon.setFax(doanhNghiep.getFax());
	mauDon.setSoGiayPhepVanTai(doanhNghiep.getSoGpkdVanTaiBangOto());
	mauDon.setNgayCapGiayPhepVantai(DateUtils.dateToString("dd/MM/yyyy", doanhNghiep.getNgayCapGpkdVanTaiBangOto()));
	mauDon.setNoiCapGiayPhepVanTai(doanhNghiep.getCoQuanCapGpkdVanTaiBangOto());
	
	mauDon.setTinhThanh(tinhThanh);
	mauDon.setNgayLamDon(ngayLamDon);
	mauDon.setCoQuanGui(coQuanGui);
	mauDon.setTinhTPDi(thanhPhoDi);
	mauDon.setTinhTPDen(thanhPhoDen);
	mauDon.setBenDi(benDi);
	mauDon.setBenDen(benDen);
	mauDon.setCuLy(cuLyVanChuyen);
	mauDon.setHanhTrinh(hanhTrinhChayXe);
	mauDon.setDiemDungDo(listDiemDungNghi);
	
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
	actionBack.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/dang_ki_khai_thac_tuyen_viet_trung.jsp");
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
				<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/thong_tin_hs_report_export.jsp"%>
			</div>
			
		</div>
		
		<div class="col-xs-12">
			<aui:form name="myForm" method="POST" action="<%=actionLuuNoiDungHoSo.toString()%>">
				<input type="hidden" name="<%=Constants.ID_THU_TUC_HANH_CHINH%>" value="<%=thuTucHanhChinhId%>">
				<input type="hidden" name="<%=Constants.ID_HO_SO_THU_TUC%>" value="<%=hoSoThuTucId%>">
				<input type="hidden" name="<%=Constants.ID_THANH_PHAN_HO_SO%>" value="<%=thanhPhanHoSoId%>">
				
				
				<%for (String s: lstStringObjctPhuongTien) {%>
					<input type="hidden" id="objectPhuongTien" name="objectPhuongTien" value="<%=s%>">
				<%}%>
				<input type="hidden" name="coQuanGui" value="<%=coQuanGui%>">
				<input type="hidden" name="tinhThanh" value="<%=tinhThanh%>">
				
				<input type="hidden" name="thanhPhoDi" value="<%=thanhPhoDi%>">
				<input type="hidden" name="thanhPhoDen" value="<%=thanhPhoDen%>">
				
				<input type="hidden" name="ngayLamDon" value="<%=ngayLamDon%>">
				<input type="hidden" name="benDen" value="<%=benDen%>">
				<input type="hidden" name="benDi" value="<%=benDi%>">
				<input type="hidden" name="cuLyVanChuyen" value="<%=cuLyVanChuyen%>">
				<input type="hidden" name="hanhTrinhChayXe" value="<%=hanhTrinhChayXe%>">
				<input type="hidden" name="listDiemDungNghi" value="<%=listDiemDungNghi%>">
				
				
				
				<button class="btn btn-primary" onclick="summitForm('<%=actionLuuNoiDungHoSo%>')">Lưu lại</button>
				<%-- <button class="btn btn-primary" onclick="summitForm('<%=actionKySo%>')">Ký số</button> --%>
				<button class="btn btn-primary" onclick="summitForm('<%=actionBack%>')">Quay lại</button>
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




