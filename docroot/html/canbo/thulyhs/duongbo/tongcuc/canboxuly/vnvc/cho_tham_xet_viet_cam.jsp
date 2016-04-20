<%@page import="java.util.Arrays"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	PortletURL quocTe_vietCam_choThamXet = renderResponse.createActionURL();
	quocTe_vietCam_choThamXet.setParameter(ActionRequest.ACTION_NAME, "quocTe_vietCam_choThamXet");
	quocTe_vietCam_choThamXet.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
	quocTe_vietCam_choThamXet.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
	quocTe_vietCam_choThamXet.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
	quocTe_vietCam_choThamXet.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
	quocTe_vietCam_choThamXet.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
	quocTe_vietCam_choThamXet.setParameter(Constants.MA_THU_TUC_HANH_CHINH, maThuTucHanhChinh);
	String stringMVCPath = "";
	if (Arrays.deepToString(Constants.TTHC_VIET_CAM_CAP_PHEP_DUONG_BO_ALL).contains(maThuTucHanhChinh)) {
		stringMVCPath = "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvc/cho_tham_xet_viet_cam_qpvt_cap_moi.jsp";
	} else {
		stringMVCPath = "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvc/cho_tham_xet_viet_cam_qpvt_cap_moi.jsp";
	}
	
%>
<div class="TabbedPanelsContent">
	<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/redirect_form.jspf"%>
</div>
<aui:form name="fm" action="#">
	<aui:input type="hidden" name="keyDichChuyen"></aui:input>
	<aui:input type="hidden" name="<%=Constants.ID_PHIEU_XU_LY %>" value="<%=phieuXuLyId %>"></aui:input>
	<aui:input type="hidden" name="<%=Constants.ID_QUY_TRINH_THU_TUC %>" value="<%=quyTrinhThuTucId %>"></aui:input>
	<aui:input type="hidden" name="actionCHK"></aui:input>
	<aui:input type="hidden" name="actionURL" value="<%=quocTe_vietCam_choThamXet.toString() %>"></aui:input>
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
