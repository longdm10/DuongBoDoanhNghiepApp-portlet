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
String hoSoThuTucId = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
String phieuXuLyId = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY);
String quyTrinhThuTucId = ParamUtil.getString(request, Constants.ID_QUY_TRINH_THU_TUC);
String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY);
String viewPdf = ParamUtil.getString(request, Constants.VIEW_PDF);
String isSuaCheckList = ParamUtil.getString(request, "suaCheckList");


PortletURL canBoDuyetThamXet = renderResponse.createActionURL();
canBoDuyetThamXet.setParameter(ActionRequest.ACTION_NAME, "luuYKien19DvcPhanCongAction");
canBoDuyetThamXet.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
canBoDuyetThamXet.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
canBoDuyetThamXet.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
canBoDuyetThamXet.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
canBoDuyetThamXet.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
%>

<div class="TabbedPanelsContent">
	<div style="margin-top: 20px;">
		<aui:form method="POST" action="" name="myForm" id="myForm">
			<div class="col-xs-12 textlabel">Ý kiến: <span class="red">*</span></div>
			
			<div class="col-xs-12 form-group">
				<textarea class="form-control" class="myTTTare" id="<portlet:namespace/>yKien19Dvc" name="<portlet:namespace/>yKien19Dvc"></textarea>
			</div>
			
			<div class="col-xs-12 form-group">
				<p><i>Ghi chú: Những trường thông tin có dấu "<span class="red">*</span>" là bắt buộc</i></p>
			</div>
			
			<div class="col-xs-12 form-group" style="text-align: center;">
				<input class="button btn btn-primary btn-sm" type="button" value="Chuyển chuyên viên xử lý" onclick="summitForm('<%=canBoDuyetThamXet%>')"/>
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