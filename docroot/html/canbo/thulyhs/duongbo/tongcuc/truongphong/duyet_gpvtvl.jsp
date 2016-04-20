
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%

PortletURL quocTe_vietLao_CD = renderResponse.createActionURL();
quocTe_vietLao_CD.setParameter(ActionRequest.ACTION_NAME, "quocTe_vietLao_CD");
quocTe_vietLao_CD.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
quocTe_vietLao_CD.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
quocTe_vietLao_CD.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
quocTe_vietLao_CD.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
quocTe_vietLao_CD.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(Long.valueOf("0"+phieuXuLyId));
QlvtThongTinXuLy qlvtThongTinXuLy = null;
if(Validator.isNotNull(thongTinHoSo)){
	qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+thongTinHoSo.getId()));	
}
%>
<portlet:renderURL var="renderSearchContent">
			<portlet:param name="jspPage" value="/html/hscanbo/search_content.jsp"/>
			<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC%>" value="<%=StringUtil.valueOf(hoSoThuTucId)%>"/>
			<portlet:param name="<%=Constants.ID_PHIEU_XU_LY%>" value="<%=StringUtil.valueOf(phieuXuLyId)%>"/>
			<portlet:param name="<%=Constants.THANH_PHAN_XU_LY%>" value="<%=StringUtil.valueOf(thanhPhanXuLy)%>"/>
</portlet:renderURL>
<portlet:renderURL var="editCongvan">
			<portlet:param name="jspPage1" value="/html/canbo/thulyhs/duongbo/tongcuc/truongphong/edit_cong_van.jsp"/>
			<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC%>" value="<%=StringUtil.valueOf(hoSoThuTucId)%>"/>
			<portlet:param name="<%=Constants.ID_PHIEU_XU_LY%>" value="<%=StringUtil.valueOf(phieuXuLyId)%>"/>
			<portlet:param name="<%=Constants.THANH_PHAN_XU_LY%>" value="<%=StringUtil.valueOf(thanhPhanXuLy)%>"/>
			<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC%>" value="<%=StringUtil.valueOf(hoSoThuTucId)%>"/>
			<portlet:param name="<%=Constants.ID_QUY_TRINH_THU_TUC%>" value="<%=StringUtil.valueOf(quyTrinhThuTucId)%>"/>
			<portlet:param name="<%=Constants.ID_THU_TUC_HANH_CHINH%>" value="<%=StringUtil.valueOf(idThuTucHanhChinh)%>"/>
			<portlet:param name="keyKetQuaThamTra" value="<%=keyKetQuaThamTra%>"/>
</portlet:renderURL>
<aui:form name="fm" action="#">
<div class="TabbedPanelsContent">
	<aui:input type="hidden" name="keyDichChuyen"></aui:input>
<aui:input type="hidden" name="<%=Constants.ID_PHIEU_XU_LY %>" value="<%=phieuXuLyId %>"></aui:input>
<aui:input type="hidden" name="<%=Constants.ID_QUY_TRINH_THU_TUC %>" value="<%=quyTrinhThuTucId %>"></aui:input>
<aui:input type="hidden" name="actionCHK"></aui:input>
<aui:input type="hidden" name="actionURL" value="<%=quocTe_vietLao_CD.toString() %>"></aui:input>
<aui:input type="hidden" name="userIdXuLy"></aui:input>
	<div align="center">
		<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/export_cong_van.jsp"%>
	</div>
	<div style = "margin-top: 20px;">
			<aui:button cssClass="btn btn-primary" value="Duyệt" onClick="<%=\"chuyenDichDynamic('\"+qlvtThongTinXuLy.getKetQuaXuLy()+\"');\" %>"/>
				<aui:button cssClass="btn btn-primary" value="Yêu cầu thẩm xét lại" onClick="chuyenDichDynamic('Yeu.cau.tham.xet.lai');"/>
			<%if(keyKetQuaThamTra.equalsIgnoreCase("CVYCBS")){ %>
				<a style="width: 15%;" class="btn btn-primary" href="<%=editCongvan.toString()%>"/> Edit công văn</a>
			<%} %>	
	</div>
		
</div>
<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/script_button.jspf"%>
</aui:form>
 
 