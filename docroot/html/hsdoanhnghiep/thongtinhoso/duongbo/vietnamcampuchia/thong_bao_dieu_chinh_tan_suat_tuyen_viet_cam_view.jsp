<%@page import="vn.dtt.duongbo.maudon.model.TBaoDieuChinhTanSuatXeChayTuyenCDVietCam"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepImpl"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="vn.dtt.duongbo.maudon.model.TBaoDieuChinhTanSuatXeChayTuyenCDVietLao"%>
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
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%! private static Log _log = LogFactoryUtil.getLog(DoanhNghiepAction.class); %>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	_log.info("------/thong_bao_dieu_chinh_tan_suat_tuyen_viet_cam_view..jsp-----");

	long userId = PortalUtil.getUserId(request);
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	long idBieuMauHoSo = ParamUtil.getLong(request, Constants.ID_BIEU_MAU_HO_SO);
	
	String soGiayPhepVanTai = ParamUtil.getString(request, "soGiayPhepVanTai");
	String ngayCapGiayPhepVantai = ParamUtil.getString(request, "ngayCapGiayPhepVantai");
	String tinhThanh = ParamUtil.getString(request, "tinhThanh");
	String coQuanGui = ParamUtil.getString(request, "coQuanGui");
	String tuNgay = ParamUtil.getString(request, "tuNgay");
	String xeTangGiam = ParamUtil.getString(request, "xeTangGiam");
	String tuyen = ParamUtil.getString(request, "tuyen");
	String diaChiDoanhNghiep = ParamUtil.getString(request, "diaChiDoanhNghiep");
	
	
	
	_log.info("------xeTangGiam-----"+ xeTangGiam);
	_log.info("------coQuanGui-----"+ coQuanGui);
	_log.info("------tuNgay-----"+ tuNgay);
	_log.info("------tuyen-----"+ tuyen);
	_log.info("------soGiayPhepVanTai-----"+ soGiayPhepVanTai);
	_log.info("------tinhThanh-----"+ coQuanGui);
	_log.info("------ngayCapGiayPhepVantai-----"+ tuNgay);
	
	
	
	
	long idDoanhNghiep = ParamUtil.getLong(request, Constants.ID_DOANH_NGHIEP);
	DnDoanhNghiep doanhNghiep = DnDoanhNghiepLocalServiceUtil.fetchDnDoanhNghiep(idDoanhNghiep);
	if (Validator.isNull(doanhNghiep)) { doanhNghiep = new DnDoanhNghiepImpl(); }
	
	//Ten modal export
	TBaoDieuChinhTanSuatXeChayTuyenCDVietCam mauDon = new TBaoDieuChinhTanSuatXeChayTuyenCDVietCam();
	mauDon.setTenCongTy(doanhNghiep.getTenDoanhNghiep());
	mauDon.setDiaChi(diaChiDoanhNghiep);
	mauDon.setDienThoai(doanhNghiep.getDienThoai());
	mauDon.setSoGiayPhepVanTai(soGiayPhepVanTai);
	mauDon.setNgayCapGiayPhepVantai(ngayCapGiayPhepVantai);
	mauDon.setTuNgay(tuNgay);
	mauDon.setXeTangGiam(xeTangGiam);
	mauDon.setCoQuanGui(coQuanGui);
	mauDon.setTinhThanh(tinhThanh);
	
	_log.info("------doanhnghiep-----"+ doanhNghiep.getTenDoanhNghiep());
	
	String[] lstStringObjctPhuongTien = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[]{});
	
	_log.info("------/--lstStringObjctPhuongTien.size---" + lstStringObjctPhuongTien.length);
	_log.info("------/-lstStringObjctPhuongTien:---" + lstStringObjctPhuongTien);
	
	
	List<TBaoDieuChinhTanSuatXeChayTuyenCDVietCam.DanhSachXe> codeDanhSachXes = new ArrayList<TBaoDieuChinhTanSuatXeChayTuyenCDVietCam.DanhSachXe>();
	
	
	for (String s: lstStringObjctPhuongTien) {
		String[] properties = s.split(";");
		_log.info("-------s: " + s);
		_log.info("-------properties: " + properties);
		if (properties != null && properties.length > 0) {
			TBaoDieuChinhTanSuatXeChayTuyenCDVietCam.DanhSachXe xe = new TBaoDieuChinhTanSuatXeChayTuyenCDVietCam.DanhSachXe();
			xe.setBienSoXe(properties[1]);
			xe.setNhanHieu(properties[2]);
			xe.setTrongTai(properties[3]);
			xe.setNamSX(properties[4]);
			xe.setTenDK(properties[23]);
			codeDanhSachXes.add(xe);
			//_log.info("------/thong_bao_dieu_chinh_tan_suat_tuyen_viet_cam_view.jsp--dsXe---" + xe.getBienSoXe() + "--" + xe.getNhanHieu()+"-xe.setTenDK-"+xe.getTenDK());
		}
		
	}
		_log.info("codeDanhSachXes.size()-------" + codeDanhSachXes.size());
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
	actionBack.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamcampuchia/thong_bao_dieu_chinh_tan_suat_tuyen_viet_cam.jsp");
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
				<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamcampuchia/thong_tin_hs_report_export.jsp"%>
			</div>
			
		</div>
		
		<div class="col-xs-12">
			<aui:form name="myForm" method="POST" action="<%=actionLuuNoiDungHoSo.toString()%>">
				<input type="hidden" name="<%=Constants.ID_THU_TUC_HANH_CHINH%>" value="<%=thuTucHanhChinhId%>">
				<input type="hidden" name="<%=Constants.ID_HO_SO_THU_TUC%>" value="<%=hoSoThuTucId%>">
				<input type="hidden" name="<%=Constants.ID_THANH_PHAN_HO_SO%>" value="<%=thanhPhanHoSoId%>">
				
				<input type="hidden" name="tenDoanhNghiep" value="<%=doanhNghiep.getTenDoanhNghiep()%>">
				<input type="hidden" name="diaChi" value="<%=doanhNghiep.getDiaChi()%>">
				<input type="hidden" name="soDienThoai" value="<%=doanhNghiep.getDienThoai()%>">
				<input type="hidden" name="fax" value="<%=doanhNghiep.getFax()%>">
				
					
				<%for (String s: lstStringObjctPhuongTien) {%>
				<input type="hidden" id="objectPhuongTien" name="objectPhuongTien" value="<%=s%>">
				<%}%>
				
				<input type="hidden" name="tinhThanh" value="<%=tinhThanh%>">
				<input type="hidden" name="coQuanGui" value="<%=coQuanGui%>">
				<input type="hidden" name="tuNgay" value="<%=tuNgay%>">
				<input type="hidden" name="xeTangGiam" value="<%=xeTangGiam%>">
				<input type="hidden" name="tuyen" value="<%=tuyen%>">
				<input type="hidden" name="ngayCapGiayPhepVantai" value="<%=ngayCapGiayPhepVantai%>">
				<input type="hidden" name="soGiayPhepVanTai" value="<%=soGiayPhepVanTai%>">
				
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
	
	
	
	