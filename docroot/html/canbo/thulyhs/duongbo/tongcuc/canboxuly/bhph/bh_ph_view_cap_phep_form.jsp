<%@page import="vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo"%>
<%@page import="vn.dtt.duongbo.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	int xuLyPhuHieuId = ParamUtil.getInteger(request, "xuLyPhuHieuId");
	String tq2 = ParamUtil.getString(request, "tq2");
	MotCuaPhieuXuLy phieu = MotCuaPhieuXuLyLocalServiceUtil.fetchMotCuaPhieuXuLy(Long.valueOf(phieuXuLyId));
	MotCuaTrangThaiHoSo trangThai = MotCuaTrangThaiHoSoLocalServiceUtil.fetchMotCuaTrangThaiHoSo(phieu.getTrangThaiHienTaiId());
	TthcThuTucHanhChinh thuTuc = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(Long.valueOf("0"+idThuTucHanhChinh));
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
<%if(trangThai.getMaTrangThai().equalsIgnoreCase("CB_CTX") || trangThai.getMaTrangThai().equalsIgnoreCase("CB_DTX")){ %>
	<h4 class="PL15 BGT BOB font14 col-xs-12">Thông tin hồ sơ</h4>
<%} %>
<div class="P10 col-xs-12">
	<%if(trangThai.getMaTrangThai().equalsIgnoreCase("CB_CTX") || trangThai.getMaTrangThai().equalsIgnoreCase("CB_DTX")){ %>
		<div class="BGT noidung">
			<div class="TabbedPanelsContent" style="padding-top: 1px;">
			<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/info_cong_van.jsp"%>
	<%} %>
	<aui:form name="fm" action="#">
		<center style="width: 100%">
			<aui:input type="hidden" name="keyDichChuyen"></aui:input>
			<aui:input type="hidden" name="<%=Constants.ID_PHIEU_XU_LY %>" value="<%=phieuXuLyId %>"></aui:input>
			<aui:input type="hidden" name="<%=Constants.ID_QUY_TRINH_THU_TUC %>" value="<%=quyTrinhThuTucId %>"></aui:input>
			<aui:input type="hidden" name="actionCHK"></aui:input>
			<aui:input type="hidden" name="actionURL" value="<%=guiDuyetAction.toString() %>"></aui:input>
			<aui:input type="hidden" name="userIdXuLy"></aui:input>
			<liferay-util:include page="<%=\"/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/bhph/bh_ph_form_cho_tham_xet_xu_ly_\"+pageDes+\"_dv2.jsp\" %>" servletContext="<%=this.getServletContext() %>">
				<liferay-util:param name="xuLyPhuHieuId" value="<%=String.valueOf(xuLyPhuHieuId) %>" />
				<liferay-util:param name="popUp" value="1" />
				<liferay-util:param name="tq2" value="200" />
				<liferay-util:param name="maTrangThai" value="<%=trangThai.getMaTrangThai() %>"></liferay-util:param>
			</liferay-util:include>
		</center>
		<%if(trangThai.getMaTrangThai().equalsIgnoreCase("CB_CTX") || trangThai.getMaTrangThai().equalsIgnoreCase("CB_DTX")){ %>
			<div style="margin: 32px;"> 
				<aui:input type="hidden" name="keyKetQuaThamTra" value="<%=keyKetQuaThamTra%>"></aui:input>
				<aui:button cssClass="btn btn-primary" value="Lưu kết quả" onClick="chuyenDichDynamic('Gui.duyet');"/>
			</div>
		<%} %>
		<div id="dv3">
		</div>
		<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/script_button.jspf"%>
	</aui:form>
	<%if(trangThai.getMaTrangThai().equalsIgnoreCase("CB_CTX") || trangThai.getMaTrangThai().equalsIgnoreCase("CB_DTX")){ %>
		</div>
	</div>
	<%} %>
</div>
<style>
#dv3{
width: 100% !important;
}
.lfr-search-container{
	width: 94%;
}
</style>
