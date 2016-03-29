<%@page import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
TthcThuTucHanhChinh thuTuc = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(Long.valueOf("0"+idThuTucHanhChinh));
String pageDes = thuTuc.getMaThuTuc().contains("PH")?"PH".toLowerCase():"BH".toLowerCase();

PortletURL guiDuyetAction = renderResponse.createActionURL();
guiDuyetAction.setParameter(ActionRequest.ACTION_NAME, "quocTe_vietLao_guiDuyet");
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
