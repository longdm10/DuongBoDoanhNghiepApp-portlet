<%@page import="java.util.Arrays"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	PortletURL lienVan_vietLao_choThamXet = renderResponse.createActionURL();
	lienVan_vietLao_choThamXet.setParameter(ActionRequest.ACTION_NAME, "lienVan_vietLao_choThamXet");
	lienVan_vietLao_choThamXet.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
	lienVan_vietLao_choThamXet.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
	lienVan_vietLao_choThamXet.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
	lienVan_vietLao_choThamXet.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
	lienVan_vietLao_choThamXet.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
	lienVan_vietLao_choThamXet.setParameter(Constants.MA_THU_TUC_HANH_CHINH, maThuTucHanhChinh);
	String stringMVCPath = "";
	
	if (Arrays.deepToString(Constants.VIET_LAO_LIEN_VAN_THUONG_MAI).contains(maThuTucHanhChinh)) {
		stringMVCPath = "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvc/cho_tham_xet_viet_cam_gplv_thuong_mai.jsp";
	} else if (Constants.VIET_LAO_LIEN_VAN_PHI_GIA_HAn.equalsIgnoreCase(maThuTucHanhChinh)){
		stringMVCPath = "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvc/cho_tham_xet_viet_cam_gplv_gia_han.jsp";
	}else{
		stringMVCPath = "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvc/cho_tham_xet_viet_cam_gplv_phi_thuong_mai.jsp";
	}
	LogFactoryUtil.getLog(CanBoAction.class).info("--//cho_tham_xet_viet_cam.jsp--mvcPath--" + stringMVCPath);
%>

<div class="TabbedPanelsContent">
	<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/redirect_form.jspf"%>
</div>
<aui:form name="fm" action="#">
	<aui:input type="hidden" name="keyDichChuyen"></aui:input>
	<aui:input type="hidden" name="<%=Constants.ID_PHIEU_XU_LY %>" value="<%=phieuXuLyId %>"></aui:input>
	<aui:input type="hidden" name="<%=Constants.ID_QUY_TRINH_THU_TUC %>" value="<%=quyTrinhThuTucId %>"></aui:input>
	<aui:input type="hidden" name="actionCHK"></aui:input>
	<aui:input type="hidden" name="actionURL" value="<%=lienVan_vietLao_choThamXet.toString() %>"></aui:input>
	<aui:input type="hidden" name="userIdXuLy"></aui:input>
<div id="contentMyPage">
<liferay-util:include page="<%=stringMVCPath %>" servletContext="<%=this.getServletContext() %>">
</liferay-util:include>
</div>
<div id="idBtn">
		<aui:button-row>
			<aui:button cssClass="btn btn-primary" value="Lưu kết quả" onClick="chuyenDichDynamic('Xu.ly');"/>
		</aui:button-row>
	</div>
	<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/script_button.jspf"%>
</aui:form>
