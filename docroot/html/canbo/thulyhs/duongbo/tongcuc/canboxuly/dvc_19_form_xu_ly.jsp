<%@page import="vn.dtt.duongbo.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy"%>
<%@page import="vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo"%>
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
String trangThaiHoSo = ParamUtil.getString(request, Constants.TRANG_THAI_HO_SO);
long organizationId = 0;
if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
	organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();
}
long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
long phieuXuLyId = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY);
String quyTrinhThuTucId = ParamUtil.getString(request, Constants.ID_QUY_TRINH_THU_TUC);
String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY);
String viewPdf = ParamUtil.getString(request, Constants.VIEW_PDF);
String isSuaCheckList = ParamUtil.getString(request, "suaCheckList");

TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.getTthcHoSoThuTuc(hoSoThuTucId);
TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.getTthcThuTucHanhChinh(hoSoThuTuc.getThuTucHanhChinhId());
MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);

PortletURL actionURL = renderResponse.createActionURL();
actionURL.setParameter(ActionRequest.ACTION_NAME, "traKetQua19DvcAction");
actionURL.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
actionURL.setParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
actionURL.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
actionURL.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
actionURL.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
actionURL.setParameter(Constants.ID_DOANH_NGHIEP, String.valueOf(hoSoThuTuc.getNguoiLamThuTucId()));
actionURL.setParameter(Constants.TRANG_THAI_HO_SO, trangThaiHoSo);

MotCuaTrangThaiHoSo trangThaiHoSoTmp = MotCuaTrangThaiHoSoLocalServiceUtil.getMotCuaTrangThaiHoSo(phieuXuLy.getTrangThaiHienTaiId());

String maThanhPhanHoSo = trangThaiHoSoTmp.getMoTaTrangThai();

TthcThanhPhanHoSo thanhPhanHoSo = null;

if(Validator.isNotNull(maThanhPhanHoSo)) {
	thanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.getByThuTucHanhChinhIdAndMaThanhPhan(thuTucHanhChinh.getId(), maThanhPhanHoSo);
}

String btnMsg = "Xử lý";
%>

<div class="TabbedPanelsContent">
	<div style="margin-top: 20px;">
		<aui:form method="POST" action="" name="myForm" id="myForm" enctype="multipart/form-data">
			
			<div class="col-xs-12 textlabel">Ý kiến: <span class="red">*</span></div>
			
			<div class="col-xs-12 form-group">
				<textarea class="form-control" class="myTTTare" id="<portlet:namespace/>yKien19Dvc" name="<portlet:namespace/>yKien19Dvc"></textarea>
			</div>
			
			<div class="col-xs-12 form-group">
				<p><i>Ghi chú: Những trường thông tin có dấu "<span class="red">*</span>" là bắt buộc</i></p>
			</div>
			
			<c:if test="<%= Validator.isNotNull(thanhPhanHoSo) %>">
				<div class="col-xs-12 form-group"> 
					<input type="radio" style="float: left; margin: 1px 10px 0 0" checked="checked" value="<%= thanhPhanHoSo.getId() %>" name="<%= renderResponse.getNamespace() + Constants.ID_THANH_PHAN_HO_SO %>" id="<%= renderResponse.getNamespace() + Constants.ID_THANH_PHAN_HO_SO %>">
					<span style="font-size: 13.5px" class="vert"><%= thanhPhanHoSo.getTenThanhPhan() %></span>
				</div>
				
				<div class="col-xs-12 form-group">
					<label for="sel1">Tên tài liệu :</label>
					<input type="text" class="form-control" value="" id="<portlet:namespace/>tenTaiLieu" name="<portlet:namespace/>tenTaiLieu">
					<input type="file" id="<portlet:namespace/>attachment" name="<portlet:namespace/>attachment" style="position: static !important;">
				</div>
			</c:if>
			
			<div class="col-xs-12 form-group" style="text-align: center;">
				<input class="button btn btn-primary btn-sm" type="button" value="<%= btnMsg %>" onclick="summitForm('<%=actionURL%>')"/>
			</div>
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
		var yKien = document.getElementById('<portlet:namespace />yKien19Dvc').value;
		
		if(yKien == '') {
			alert('Nhập ý kiến xử lý !');
		} else {
			document.getElementById('<portlet:namespace />myForm').action = url;
			document.getElementById('<portlet:namespace />myForm').submit();
		}
	}
</script>