<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcBieuMauHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.duongthuy.business.DuongThuyUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo"%>
<%@page import="vn.dtt.duongbo.portlet.canbo.utils.VanThuBusinessUtils"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongbo.utils.format.ConvertUtil"%>
<%@page
	import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
String idThuTucHanhChinh = ParamUtil.getString(request, Constants.ID_THU_TUC_HANH_CHINH);
long organizationId = 0;
if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
	organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();
}
//String userName = PortalUtil.getUser(request).getFullName();
long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
String phieuXuLyId = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY);
String quyTrinhThuTucId = ParamUtil.getString(request, Constants.ID_QUY_TRINH_THU_TUC);
String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY);
String viewPdf = ParamUtil.getString(request, Constants.VIEW_PDF);
String isSuaCheckList = ParamUtil.getString(request, "suaCheckList");

TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.getTthcHoSoThuTuc(hoSoThuTucId);
TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.getTthcThuTucHanhChinh(hoSoThuTuc.getThuTucHanhChinhId());

PortletURL traKetQua19DvcURL = renderResponse.createActionURL();
traKetQua19DvcURL.setParameter(ActionRequest.ACTION_NAME, "traKetQua19DvcAction");
traKetQua19DvcURL.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
traKetQua19DvcURL.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
traKetQua19DvcURL.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
traKetQua19DvcURL.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
traKetQua19DvcURL.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
traKetQua19DvcURL.setParameter(Constants.ID_DOANH_NGHIEP, String.valueOf(hoSoThuTuc.getNguoiLamThuTucId()));
traKetQua19DvcURL.setParameter(Constants.TRANG_THAI_HO_SO, Constants.DOANH_NGHIEP_TRANG_THAI_HO_SO_HOAN_THANH);

String maThuTuc = thuTucHanhChinh.getMaThuTuc();

Map<String, String> mapMaThuTucMa_ThanhPhanHoSo = new HashMap<String, String>();

mapMaThuTucMa_ThanhPhanHoSo.put("DTND_19C1", "DTTPHS17");
mapMaThuTucMa_ThanhPhanHoSo.put("DTND_19C2", "DTTPHS34");
mapMaThuTucMa_ThanhPhanHoSo.put("DTND_19C3", "DTTPHS51");
mapMaThuTucMa_ThanhPhanHoSo.put("DTND_19C4", "DTTPHS68");
mapMaThuTucMa_ThanhPhanHoSo.put("DTND_19C5", "DTTPHS75");
mapMaThuTucMa_ThanhPhanHoSo.put("DTND_19C6", "DTTPHS82");
mapMaThuTucMa_ThanhPhanHoSo.put("DTND_19C7", "DTTPHS89");
mapMaThuTucMa_ThanhPhanHoSo.put("DTND_19C8", "DTTPHS99");
mapMaThuTucMa_ThanhPhanHoSo.put("DTND_19C9", "DTTPHS110");
mapMaThuTucMa_ThanhPhanHoSo.put("DTND_19C10", "DTTPHS121");
mapMaThuTucMa_ThanhPhanHoSo.put("DTND_19C11", "DTTPHS234");
mapMaThuTucMa_ThanhPhanHoSo.put("DTND_19C12", "DTTPHS235");
mapMaThuTucMa_ThanhPhanHoSo.put("DTND_19C13", "DTTPHS236");
mapMaThuTucMa_ThanhPhanHoSo.put("DTND_19C14", "DTTPHS237");
mapMaThuTucMa_ThanhPhanHoSo.put("DTND_19C15", "DTTPHS238");
mapMaThuTucMa_ThanhPhanHoSo.put("DTND_19C16", "DTTPHS239");
mapMaThuTucMa_ThanhPhanHoSo.put("DTND_19C17", "DTTPHS240");
mapMaThuTucMa_ThanhPhanHoSo.put("DTND_19C18", "DTTPHS241");
mapMaThuTucMa_ThanhPhanHoSo.put("DTND_19C19", "DTTPHS242");

String maThanhPhanHoSo = GetterUtil.getString(mapMaThuTucMa_ThanhPhanHoSo.get(maThuTuc));


TthcThanhPhanHoSo thanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.getByThuTucHanhChinhIdAndMaThanhPhan(
		thuTucHanhChinh.getId(), maThanhPhanHoSo);
%>

<div class="TabbedPanelsContent">
	<div style="margin-top: 20px;">
		<aui:form method="POST" action="" name="myForm" id="myForm" enctype="multipart/form-data">
			
			<c:choose>
				<c:when test="<%= Validator.isNotNull(thanhPhanHoSo) %>">
					<div class="col-xs-12 form-group"> 
						<input type="radio" style="float: left; margin: 1px 10px 0 0" checked="checked" value="<%= thanhPhanHoSo.getId() %>" name="<%= renderResponse.getNamespace() + Constants.ID_THANH_PHAN_HO_SO %>" id="<%= renderResponse.getNamespace() + Constants.ID_THANH_PHAN_HO_SO %>">
						<span style="font-size: 13.5px" class="vert"><%= thanhPhanHoSo.getTenThanhPhan() %></span>
					</div>
					
					<div class="col-xs-12 form-group">
						<label for="sel1">Tên tài liệu :</label>
						<input type="text" class="form-control" value="" id="<portlet:namespace/>tenTaiLieu" name="<portlet:namespace/>tenTaiLieu">
						<input type="file" id="<portlet:namespace/>attachment" name="<portlet:namespace/>attachment" style="position: static !important;">
					</div>
					
					<div class="col-xs-12 form-group" style="text-align: center;">
						<input class="button btn btn-primary" type="button" value="Trả kết quả" onclick="summitForm('<%=traKetQua19DvcURL%>')"/>
					</div>
				</c:when>
				<c:otherwise>
					<div role="alert" class="alert alert-warning">
						<h5>Không tìm thấy thành phần hồ sơ trả kết quả tương ứng với thủ tục hành chính <strong><%= maThuTuc + " " + maThanhPhanHoSo %></strong></h5>
					</div>
				</c:otherwise>
			</c:choose>
		</aui:form>
	</div>
</div>
<style>
.myTTTare{
	width: 100% !important;
}
</style>
<script type="text/javascript">
	function summitForm(url) {
		document.getElementById('<portlet:namespace />myForm').action = url;
		document.getElementById('<portlet:namespace />myForm').submit();
	}
</script>
