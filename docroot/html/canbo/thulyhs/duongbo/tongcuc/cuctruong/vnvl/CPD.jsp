
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%

PortletURL quocTe_vietLao_CPD = renderResponse.createActionURL();
quocTe_vietLao_CPD.setParameter(ActionRequest.ACTION_NAME, "quocTe_vietLao_CPD");
quocTe_vietLao_CPD.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
quocTe_vietLao_CPD.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
quocTe_vietLao_CPD.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
quocTe_vietLao_CPD.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
quocTe_vietLao_CPD.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
%>

<portlet:renderURL var="renderSearchContent">
			<portlet:param name="jspPage" value="/html/hscanbo/search_content.jsp"/>
			<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC%>" value="<%=StringUtil.valueOf(hoSoThuTucId)%>"/>
			<portlet:param name="<%=Constants.ID_PHIEU_XU_LY%>" value="<%=StringUtil.valueOf(phieuXuLyId)%>"/>
			<portlet:param name="<%=Constants.THANH_PHAN_XU_LY%>" value="<%=StringUtil.valueOf(thanhPhanXuLy)%>"/>
</portlet:renderURL>
<aui:form name="fm" action="#">
<div class="TabbedPanelsContent">
	<div align="center">
		<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/export_cong_van.jsp"%>
	</div>
	<div style = "margin-top: 20px;">
		<aui:input type="hidden" name="keyDichChuyen"></aui:input>
		<aui:input type="hidden" name="<%=Constants.ID_PHIEU_XU_LY %>" value="<%=phieuXuLyId %>"></aui:input>
		<aui:input type="hidden" name="<%=Constants.ID_QUY_TRINH_THU_TUC %>" value="<%=quyTrinhThuTucId %>"></aui:input>
		<aui:input type="hidden" name="actionCHK"></aui:input>
		<aui:input type="hidden" name="actionURL" value="<%=quocTe_vietLao_CPD.toString() %>"></aui:input>
		<aui:input type="hidden" name="userIdXuLy"></aui:input>
			<aui:input type="hidden" name="idFileFm"></aui:input>
		<aui:button cssClass="btn btn-primary" value="Phê Duyệt" onClick="chuyenDichDynamic('Phe.duyet.cap.phep');" />
	</div>
</div>
<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/script_button.jspf"%>
</aui:form>
