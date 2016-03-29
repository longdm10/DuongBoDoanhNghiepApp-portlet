
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String pageDes = maThuTucHanhChinh.contains("PH")?"PH".toLowerCase():"BH".toLowerCase();
	
	PortletURL canBoDuyetThamXet = renderResponse.createActionURL();
	if(pageDes.equalsIgnoreCase("bh")){
		canBoDuyetThamXet.setParameter(ActionRequest.ACTION_NAME, "bienHieu_oTo_choThamXet");
	}else{
		canBoDuyetThamXet.setParameter(ActionRequest.ACTION_NAME, "phuHieu_oTo_choThamXet");
	}
	canBoDuyetThamXet.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
	canBoDuyetThamXet.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
	canBoDuyetThamXet.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
	canBoDuyetThamXet.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
	canBoDuyetThamXet.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
	
%>
<div class="TabbedPanelsContent">
	<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/redirect_form.jspf"%>
</div>
<aui:form name="fm" action="#">
	<aui:input type="hidden" name="keyDichChuyen"></aui:input>
	<aui:input type="hidden" name="<%=Constants.ID_PHIEU_XU_LY %>" value="<%=phieuXuLyId %>"></aui:input>
	<aui:input type="hidden" name="<%=Constants.ID_QUY_TRINH_THU_TUC %>" value="<%=quyTrinhThuTucId %>"></aui:input>
	<aui:input type="hidden" name="actionCHK"></aui:input>
	<aui:input type="hidden" name="actionURL" value="<%=canBoDuyetThamXet.toString() %>"></aui:input>
	<aui:input type="hidden" name="userIdXuLy"></aui:input>
	<div id="contentMyPage">
		<liferay-util:include page="<%=\"/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/bhph/bh_ph_form_cho_tham_xet_xu_ly_\"+pageDes+\".jsp\" %>" servletContext="<%=this.getServletContext() %>">
		</liferay-util:include>
	</div>
	<div id="idBtn">
		<aui:button-row>
			<aui:button cssClass="btn btn-primary" value="Lưu kết quả" onClick="chuyenDichDynamic('Xu.ly');"/>
		</aui:button-row>
	</div>
	<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/script_button.jspf"%>
</aui:form>
