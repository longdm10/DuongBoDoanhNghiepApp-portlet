<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	PortletURL lienVan_vietTrung_dangThamXet = renderResponse.createActionURL();
	lienVan_vietTrung_dangThamXet.setParameter(ActionRequest.ACTION_NAME, "lienVan_vietTrung_dangThamXet");
	lienVan_vietTrung_dangThamXet.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
	lienVan_vietTrung_dangThamXet.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
	lienVan_vietTrung_dangThamXet.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
	lienVan_vietTrung_dangThamXet.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
	lienVan_vietTrung_dangThamXet.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
	
	PortletURL taoCongVanYcbs = renderResponse.createRenderURL();
	taoCongVanYcbs.setParameter("jspPage", "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvt/vn_vt_tao_cong_van.jsp");
	taoCongVanYcbs.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
	taoCongVanYcbs.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
	taoCongVanYcbs.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
	taoCongVanYcbs.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
	taoCongVanYcbs.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
	String stringMVCPath = "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvt/vn_vt_cho_tham_xet_" + maThuTucHanhChinh + ".jsp";
%>
<div class="TabbedPanelsContent">
	<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/redirect_form.jspf"%>
</div>
<aui:form name="fm" action="#">
	<aui:input type="hidden" name="keyDichChuyen"></aui:input>
	<div id="contentMyPage">
		<liferay-util:include page="<%=stringMVCPath %>" servletContext="<%=this.getServletContext() %>">
		</liferay-util:include>
	</div>
	<div id="idBtn">
		<aui:input type="hidden" name="renderUrl" value="<%=taoCongVanYcbs.toString() %>"></aui:input>
		<aui:button-row>
			<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/ket_qua_tham_tra.jspf"%>
			<input style="width: 10%;" class="btn btn-primary" type="submit" value="Lưu kết quả" 
						onclick="submitItemForm();"/>
			<a id="<portlet:namespace/>tcv" class="btn btn-primary" disabled style="color: white;" href="" >Tạo công văn</a>
		</aui:button-row>
	</div>
</aui:form>
<script type="text/javascript">
	var A = AUI();
	function getRenderPar(code) {
		var renderUrl;
		if(code != "CVTCCGP" && code != "CVYCBS" && code != "GPVT_VT_GIAHAN"){
			renderUrl = '<%= taoCongVanYcbs.toString().replaceAll("vn_vt_tao_cong_van.jsp", "vnvt_view_cap_phep_form.jsp").toString()+ "&"+renderResponse.getNamespace()+"keyKetQuaThamTra=" %>';
		}else if(code == "GPVT_VT_GIAHAN"){
			renderUrl = '<%= taoCongVanYcbs.toString().replaceAll("vnvt/vn_vt_tao_cong_van.jsp", "report_common/export_cong_van.jsp").toString()+ "&"+renderResponse.getNamespace()+"keyKetQuaThamTra=" %>';
		}else{
			renderUrl = '<%= taoCongVanYcbs.toString().replaceAll("vnvt_view_cap_phep_form.jsp", "vn_vt_tao_cong_van.jsp").replaceAll("report_common/export_cong_van.jsp", "vnvt/vn_vt_tao_cong_van.jsp").toString()+ "&"+renderResponse.getNamespace()+"keyKetQuaThamTra=" %>';
		}
		A.one("#<portlet:namespace/>tcv").removeAttribute('disabled').removeClass('disabled').addClass('btn-primary').attr('href',renderUrl+code+'&<portlet:namespace/>xuLyPhuHieuId='+A.one("#<portlet:namespace/>inforId3").val());
	}
</script>
<aui:script use="aui-io-request,aui-node">
var A = AUI();
Liferay.provide(window,'submitItemForm',
		function() {
		var A = AUI();
		var errorBlock=A.one('#group-success-block');
		A.io.request('<%=lienVan_vietTrung_dangThamXet %>',{
			method: 'POST',
			form: { id: '<portlet:namespace />fm' },
			on: {
					success: function(){
					
					}
			}
		});
	});
</aui:script>