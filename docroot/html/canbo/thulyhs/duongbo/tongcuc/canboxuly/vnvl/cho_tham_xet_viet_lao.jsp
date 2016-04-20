
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%

	PortletURL quocTe_vietLao_choThamXet = renderResponse.createActionURL();
	quocTe_vietLao_choThamXet.setParameter(ActionRequest.ACTION_NAME, "quocTe_vietLao_choThamXet");
	quocTe_vietLao_choThamXet.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
	quocTe_vietLao_choThamXet.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
	quocTe_vietLao_choThamXet.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
	quocTe_vietLao_choThamXet.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
	quocTe_vietLao_choThamXet.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
	quocTe_vietLao_choThamXet.setParameter(Constants.MA_THU_TUC_HANH_CHINH, maThuTucHanhChinh);
	String stringMVCPath = "";
	if (Constants.TTHC_VIET_LAO_CAP_PHEP_DUONG_BO.equalsIgnoreCase(maThuTucHanhChinh)) {
		stringMVCPath = "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/cho_tham_xet_viet_lao_qpvt_cap_moi.jsp";
		
	} else if (Constants.TTHC_VIET_LAO_CAP_LAI_DUONG_BO_HET_HAN.equalsIgnoreCase(maThuTucHanhChinh) ||
				Constants.TTHC_VIET_LAO_CAP_LAI_DUONG_BO_HU_HONG.equalsIgnoreCase(maThuTucHanhChinh) ||
				Constants.TTHC_VIET_LAO_CAP_LAI_DUONG_BO_MAT_MAT.equalsIgnoreCase(maThuTucHanhChinh)) {
		stringMVCPath = "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/cho_tham_xet_viet_lao_gqvt_hethan_matmat_huhuong.jsp";
	} else if (Constants.TTHC_VIET_LAO_NGUNG_KHAI_THAC_TUYEN_CO_DINH_VAN_TAI.equalsIgnoreCase(maThuTucHanhChinh)) {
		stringMVCPath = "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/cho_tham_xet_viet_lao_ktt_ngung_khai_thac.jsp";
	} else if (Constants.TTHC_VIET_LAO_KHAI_THAC_TUYEN_HANH_KHACH_CO_DINH_LIEN_VAN_QUOC_TE.equalsIgnoreCase(maThuTucHanhChinh)||Constants.TTHC_VIET_LAO_BO_SUNG_PHUONNG_TIEN_KHAI_THAC_TUYEN_CO_DINH_VAN_TAI.equalsIgnoreCase(maThuTucHanhChinh)) {
		stringMVCPath = "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/cho_tham_xet_viet_lao_ktt_chap_thuan.jsp";
	}  else if (Constants.TTHC_VIET_LAO_THAY_THE_PHUONG_TIEN_KHAI_THAC_TUYEN_CO_DINH_VAN_TAI.equalsIgnoreCase(maThuTucHanhChinh)) {
		stringMVCPath = "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/cho_tham_xet_viet_lao_ktt_thay_the_phuong_tien_tren_tuyen.jsp";
	}  else if (Constants.TTHC_VIET_LAO_DIEU_CHINH_TAN_SUAT_VAN_TAI_HANH_KHACH_CO_DINH.equalsIgnoreCase(maThuTucHanhChinh)) {
		stringMVCPath = "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/cho_tham_xet_viet_lao_ktt_tang_giam_tan_suat.jsp";
	} 
	
	LogFactoryUtil.getLog(CanBoAction.class).debug("--//cho_tham_xet_viet_lao.jsp--mvcPath--" + stringMVCPath);
%>
<div class="TabbedPanelsContent">
	<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/redirect_form.jspf"%>
</div>
<aui:form name="fm" action="#">
<aui:input type="hidden" name="keyDichChuyen"></aui:input>
<aui:input type="hidden" name="<%=Constants.ID_PHIEU_XU_LY %>" value="<%=phieuXuLyId %>"></aui:input>
	<aui:input type="hidden" name="<%=Constants.ID_QUY_TRINH_THU_TUC %>" value="<%=quyTrinhThuTucId %>"></aui:input>
	<aui:input type="hidden" name="actionCHK"></aui:input>
	<aui:input type="hidden" name="actionURL" value="<%=quocTe_vietLao_choThamXet.toString() %>"></aui:input>
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
