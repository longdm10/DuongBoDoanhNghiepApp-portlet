<%@page import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%

PortletURL xemTruocNoiDung = renderResponse.createActionURL();
xemTruocNoiDung.setParameter(ActionRequest.ACTION_NAME, "lienVan_vietCam_xemTruocNoiDung");
xemTruocNoiDung.setParameter("jspPageSuccess", "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvc/vn_vc_lien_van_tao_cong_van_view.jsp");
xemTruocNoiDung.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
xemTruocNoiDung.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
xemTruocNoiDung.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
xemTruocNoiDung.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
xemTruocNoiDung.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
xemTruocNoiDung.setParameter("tenThanhPhanHoSo", idThuTucHanhChinh);
xemTruocNoiDung.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);

%>
<div class="BGT noidung" style="margin: 10px;">
	<aui:form name="fm" action="#">
		<aui:input type="hidden" name="keyDichChuyen"></aui:input>
		<aui:input type="hidden" name="keyKetQuaThamTra"
			value="<%=keyKetQuaThamTra%>"></aui:input>
		<div class="box1000">
			<liferay-util:include page="<%=\"/html/canbo/thulyhs/duongbo/tongcuc/report_common/cong_van_\"+keyKetQuaThamTra.toLowerCase()+\".jsp\" %>" servletContext="<%=this.getServletContext() %>">
			</liferay-util:include>
			<div class="clear"></div>
			<div style="margin-top: 20px;">
				<input style="width: 10%;" class="btn btn-primary" type="submit"
					value="Xem kết quả"
					onclick="advSubmit('<%=xemTruocNoiDung.toString()%>','');" />
			</div>
		</div>
	</aui:form>
</div>



<script type="text/javascript">
	function onChange(id) {
		document.getElementById(id).style.display = 'block';
	}

	function onChangeHidden(id) {
		document.getElementById(id).style.display = 'none';
	}

	function toggle_visibility(id) {
		var e = document.getElementById(id);
		if (e.style.display == 'block')
			e.style.display = 'none';
		else
			e.style.display = 'block';
	}
</script>
<aui:script use="aui-io-request,aui-node">
	var A = AUI();
	Liferay.provide(window, 'advSubmit', function(action, key) {
		var keyDichChuyen = A.one("#<portlet:namespace/>keyDichChuyen");
		keyDichChuyen.val(key);
		A.one('#<portlet:namespace/>fm').set('action', action);

	});

	
</aui:script>