<%@page import="vn.dtt.duongbo.business.MotCuaBusiness"%>
<%@page
	import="vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepImpl"%>
<%@page
	import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucImpl"%>
<%@page import="vn.dtt.duongbo.utils.format.DateUtils"%>
<%@page
	import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="vn.dtt.duongbo.portlet.canbo.CanBoAction"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongbo.utils.format.ConvertUtil"%>
<%@page
	import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%!private static Log _log = LogFactoryUtil.getLog(CanBoAction.class);%>
<%
String idThuTucHanhChinh = ParamUtil.getString(request, Constants.ID_THU_TUC_HANH_CHINH);
long organizationId = 0;
if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();
}
String hoSoThuTucId = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
String phieuXuLyId = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY);
String quyTrinhThuTucId = ParamUtil.getString(request, Constants.ID_QUY_TRINH_THU_TUC);
String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY);
String thuTucHanhChinhId = ParamUtil.getString(request, Constants.ID_THU_TUC_HANH_CHINH);
String keyKetQuaThamTra = ParamUtil.getString(request, "keyKetQuaThamTra");
TthcThuTucHanhChinh thuTuc = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(Long.valueOf("0"+thuTucHanhChinhId));
String pageDes = thuTuc.getMaThuTuc().contains("PH")?"PH".toLowerCase():"BH".toLowerCase();

PortletURL guiDuyetAction = renderResponse.createActionURL();
if(pageDes.equalsIgnoreCase("bh")){
	guiDuyetAction.setParameter(ActionRequest.ACTION_NAME, "bienHieu_oTo_guiDuyet");
}else{
	guiDuyetAction.setParameter(ActionRequest.ACTION_NAME, "phuHieu_oTo_guiDuyet");
}
guiDuyetAction.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
guiDuyetAction.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
guiDuyetAction.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
guiDuyetAction.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
guiDuyetAction.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
%>
<h4 class="PL15 BGT BOB font14 col-xs-12">Thông tin hồ sơ</h4>
<div class="P10 col-xs-12">
	<!-- Copy From Here ... -->
	<div class="BGT noidung">
		<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/info_cong_van.jsp"%>
		<div class="TabbedPanelsContent">
			<aui:form name="fm" action="#">
				<aui:input type="hidden" name="keyDichChuyen"></aui:input>
				<aui:input type="hidden" name="keyKetQuaThamTra" value="<%=keyKetQuaThamTra%>"></aui:input>
				<aui:input type="hidden" name="<%=Constants.ID_PHIEU_XU_LY %>" value="<%=phieuXuLyId %>"></aui:input>
				<aui:input type="hidden" name="<%=Constants.ID_QUY_TRINH_THU_TUC %>" value="<%=quyTrinhThuTucId %>"></aui:input>
				<aui:input type="hidden" name="actionCHK"></aui:input>
				<aui:input type="hidden" name="actionURL" value="<%=guiDuyetAction.toString() %>"></aui:input>
				<aui:input type="hidden" name="userIdXuLy"></aui:input>
				<div>
					<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/thong_tin_xu_ly_report_export_vn_vt.jsp"%>
				</div>
				<div style="margin: 10px;">
					<aui:button cssClass="btn btn-primary" value="Lưu kết quả" onClick="chuyenDichDynamic('Gui.duyet');"/>
				</div>
				<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/script_button.jspf"%>
			</aui:form>
		</div>
	</div>
</div>
