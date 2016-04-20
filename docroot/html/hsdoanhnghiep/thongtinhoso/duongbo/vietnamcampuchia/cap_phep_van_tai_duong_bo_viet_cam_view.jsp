<%@page import="vn.dtt.duongbo.business.nghiepvu.NghiepVuUtils"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepImpl"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="vn.dtt.duongbo.maudon.model.DeNghiCapGiayPhepVanTaiDuongBoVietLao"%>
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
	_log.info("------/cap_phep_van_tai_duong_bo_viet_cam_view.jsp---------");

	long userId = PortalUtil.getUserId(request);
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	
	
	
	TthcBieuMauHoSo bieuMauHoSo = NghiepVuUtils.getBieuMauHoSoByThanhPhanHoSoId(thanhPhanHoSoId);
	if (bieuMauHoSo == null) { bieuMauHoSo = new TthcBieuMauHoSoImpl(); }
	long idBieuMauHoSo = bieuMauHoSo.getId();
	

	DnDoanhNghiep doanhNghiep = DoanhNghiepUtils.getDoanhNghiepByUserId(userId);
	if (Validator.isNull(doanhNghiep)) { doanhNghiep = new DnDoanhNghiepImpl(); }
	
	String maLoaiHinhDeNghiCap = ParamUtil.getString(request, "maLoaiHinhDeNghiCap");
	String noiDungLyDoCapLais= ParamUtil.getString(request, "noiDungLyDoCapLais");
	String coQuanGui= ParamUtil.getString(request, "coQuanGui");
	String diaChiDoanhNghiep = ParamUtil.getString(request, "diaChiDoanhNghiep");
	
	//Ten modal export
	DeNghiCapGiayPhepVanTaiDuongBoVietLao mauDon = new DeNghiCapGiayPhepVanTaiDuongBoVietLao();
	mauDon.setTenCongTy(doanhNghiep.getTenDoanhNghiep());
	mauDon.setTinhThanh(doanhNghiep.getMaTinhThanh());
	mauDon.setDiaChi(diaChiDoanhNghiep);
	mauDon.setDienThoai(doanhNghiep.getDienThoai());
	mauDon.setFax(doanhNghiep.getFax());
	mauDon.setSoGiayPhepKinhDoanh(doanhNghiep.getSoDangKyKinhDoanh());
	mauDon.setCoQuanCapGiayPhepKinhDoanh(doanhNghiep.getCoQuanCapDkKd());
	mauDon.setNoiDungLyDoCapLais(noiDungLyDoCapLais);
	mauDon.setCoQuanGui(coQuanGui);
	
	_log.info("------/noiDungLyDoCapLais=======size---" + noiDungLyDoCapLais);
	
	
	String[] lstLoaiHinhHoatDong = ParamUtil.getParameterValues(request, "loaiHinhHoatDong", new String[]{});
	List<String> codeLoaiHinhHoatDongs = Arrays.asList(lstLoaiHinhHoatDong);
	_log.info("------/cap_phep_van_tai_duong_bo_viet_cam_view.jsp---lstItemLoaiHinhHoatDong---size---" + codeLoaiHinhHoatDongs.size());
	if (codeLoaiHinhHoatDongs != null && codeLoaiHinhHoatDongs.size() > 0) {
		mauDon.getLoaiHinhHoatDongs().addAll(codeLoaiHinhHoatDongs);
	}
	
	mauDon.setLoaiHinhDeNghiCap(maLoaiHinhDeNghiCap);
	
	String[] lstLyDoCapLai = ParamUtil.getParameterValues(request, "lyDoCapLai", new String[]{});
	List<String> codeLyDoCapLais = Arrays.asList(lstLyDoCapLai);
	_log.info("------/cap_phep_van_tai_duong_bo_viet_cam_view.jsp---lstLyDoCapLai---sixe---" + codeLyDoCapLais.size());
	if (codeLyDoCapLais != null && codeLyDoCapLais.size() > 0) {
		mauDon.getLyDoCapLais().addAll(codeLyDoCapLais);
	}
	
	mauDon.setNgayCapGiayPhepKinhDoanh(DateUtils.dateToString("dd/MM/yyyy", doanhNghiep.getNgayCapDkKd()));
	
	String objXml = MauDonFactory.convertObjectToXml(mauDon);
%>

<%
PortletURL actionLuuNoiDungHoSo = renderResponse.createActionURL();
actionLuuNoiDungHoSo.setParameter(ActionRequest.ACTION_NAME, "luuNoiDungHoSo");
actionLuuNoiDungHoSo.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
actionLuuNoiDungHoSo.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
actionLuuNoiDungHoSo.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
actionLuuNoiDungHoSo.setParameter("noiDungXmml", objXml);

/* PortletURL actionKySo = renderResponse.createActionURL();
actionKySo.setParameter(ActionRequest.ACTION_NAME, "kySo");
actionKySo.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
actionKySo.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
actionKySo.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId)); */

PortletURL actionBack = renderResponse.createRenderURL();
actionBack.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamcampuchia/cap_phep_van_tai_duong_bo_viet_cam.jsp");
actionBack.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
actionBack.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
actionBack.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
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
				<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamcampuchia/thong_tin_hs_report_export.jsp"%>
			</div>
			
		</div>
		
		<div class="col-xs-12">
			<aui:form name="myForm" method="POST" action="<%=actionLuuNoiDungHoSo.toString()%>">
			
				<input type="hidden" name="noiDungLyDoCapLais" value="<%=noiDungLyDoCapLais%>">
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




