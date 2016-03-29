<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	PortletURL noiDia_oTo_choThamXet = renderResponse.createActionURL();
	noiDia_oTo_choThamXet.setParameter(ActionRequest.ACTION_NAME, "noiDia_oTo_choThamXet");
	noiDia_oTo_choThamXet.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
	noiDia_oTo_choThamXet.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
	noiDia_oTo_choThamXet.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
	noiDia_oTo_choThamXet.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
	noiDia_oTo_choThamXet.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
	noiDia_oTo_choThamXet.setParameter(Constants.MA_THU_TUC_HANH_CHINH, maThuTucHanhChinh);
	String stringMVCPath = "";
	if (Constants.TTHC_OTO_CAP_MOI.equalsIgnoreCase(maThuTucHanhChinh)) {
		stringMVCPath = "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/gpvtoto/cho_tham_xet_oto_qpvt_cap_moi.jsp";
	} else if (Constants.TTHC_OTO_CAP_LAI_THAYDOINOIDUNG.equalsIgnoreCase(maThuTucHanhChinh)){
		stringMVCPath = "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/gpvtoto/cho_tham_xet_oto_qpvt_thay_doi_noi_dung.jsp";
	} else if(Constants.TTHC_OTO_CAP_LAI_HETHAN.equalsIgnoreCase(maThuTucHanhChinh)){
		stringMVCPath = "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/gpvtoto/cho_tham_xet_oto_qpvt_het_han.jsp";	
	} else if(Constants.TTHC_OTO_CAP_LAI_MATMATHUHONG.equalsIgnoreCase(maThuTucHanhChinh)){
		stringMVCPath = "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/gpvtoto/cho_tham_xet_oto_qpvt_hethan_matmat_huhuong.jsp";	
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
	<aui:input type="hidden" name="actionURL" value="<%=noiDia_oTo_choThamXet.toString() %>"></aui:input>
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
