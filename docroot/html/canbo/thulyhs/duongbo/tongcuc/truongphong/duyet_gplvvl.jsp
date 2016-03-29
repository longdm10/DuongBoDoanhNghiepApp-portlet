
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%

PortletURL lienVan_vietLao_CD = renderResponse.createActionURL();
lienVan_vietLao_CD.setParameter(ActionRequest.ACTION_NAME, "lienVan_vietLao_CD");
lienVan_vietLao_CD.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
lienVan_vietLao_CD.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
lienVan_vietLao_CD.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
lienVan_vietLao_CD.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
lienVan_vietLao_CD.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
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
<aui:input type="hidden" name="actionURL" value="<%=lienVan_vietLao_CD.toString() %>"></aui:input>
<aui:input type="hidden" name="userIdXuLy"></aui:input>
	<%
			if (qlvtThongTinXuLy.getKetQuaXuLy().equalsIgnoreCase("CVYCBS")
						|| qlvtThongTinXuLy.getKetQuaXuLy().equalsIgnoreCase(
								"CVTCCGP")) {
		%>
		<aui:input type="hidden" name="keyDichChuyen"></aui:input>
		<div align="center">
			<%@ include
				file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/export_cong_van.jsp"%>
		</div>
		<%
			} else {
					int xuLyPhuHieuId = 0;
					if (Validator.isNotNull(qlvtThongTinXuLy)) {
						QlvtXuLyGpLienVan ettXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil
								.fetchBythongTinXuLyId(Integer.valueOf("0"
										+ qlvtThongTinXuLy.getId()));
						xuLyPhuHieuId = Validator.isNotNull(ettXuLyGpLienVan) ? Integer
								.valueOf("0" + ettXuLyGpLienVan.getId()) : 0;
					}
		%>
		<div align="center">
			<liferay-util:include
				page="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/vnvl_view_cap_phep_form.jsp"
				servletContext="<%=this.getServletContext()%>">
				<liferay-util:param name="popUp" value="1" />
				<liferay-util:param name="<%=Constants.ID_PHIEU_XU_LY%>"
					value="<%=phieuXuLyId%>" />
				<liferay-util:param name="xuLyPhuHieuId"
					value="<%=String.valueOf(xuLyPhuHieuId)%>" />
			</liferay-util:include>
		</div>
		<%
			}
		%>
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
 