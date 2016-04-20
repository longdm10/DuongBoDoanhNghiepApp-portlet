<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String pageDes = maThuTucHanhChinh.contains("PH")?"PH".toLowerCase():"BH".toLowerCase();
	
	PortletURL bienHieu_oTo_dangThamXet = renderResponse.createActionURL();
	if(pageDes.equalsIgnoreCase("bh")){
		bienHieu_oTo_dangThamXet.setParameter(ActionRequest.ACTION_NAME, "bienHieu_oTo_dangThamXet");
	}else{
		bienHieu_oTo_dangThamXet.setParameter(ActionRequest.ACTION_NAME, "phuHieu_oTo_dangThamXet");
	}
	bienHieu_oTo_dangThamXet.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
	bienHieu_oTo_dangThamXet.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
	bienHieu_oTo_dangThamXet.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
	bienHieu_oTo_dangThamXet.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
	bienHieu_oTo_dangThamXet.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
	
	PortletURL taoCongVanYcbs = renderResponse.createRenderURL();
	taoCongVanYcbs.setParameter("jspPage", "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/bhph/bh_ph_tao_cong_van.jsp");
	taoCongVanYcbs.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
	taoCongVanYcbs.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
	taoCongVanYcbs.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
	taoCongVanYcbs.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
	taoCongVanYcbs.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
	taoCongVanYcbs.setParameter(Constants.MA_THU_TUC_HANH_CHINH, maThuTucHanhChinh);
	
%>
<div class="TabbedPanelsContent">
	<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/redirect_form.jspf"%>
</div>


<aui:form name="fm" action="#">
	<aui:input type="hidden" name="keyDichChuyen"></aui:input>
	<div id="contentMyPage">
		<liferay-util:include page="<%=\"/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/bhph/bh_ph_form_cho_tham_xet_xu_ly_\"+pageDes+\".jsp\" %>" servletContext="<%=this.getServletContext() %>">
		</liferay-util:include>
	</div>
	<div id="idBtn">
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
		if(code != "CVTCCGP" && code != "CVYCBS"){
			renderUrl = '<%= taoCongVanYcbs.toString().replaceAll("bh_ph_tao_cong_van.jsp", "bh_ph_view_cap_phep_form.jsp").toString()+ "&"+renderResponse.getNamespace()+"keyKetQuaThamTra=" %>';
		}else{
			renderUrl = '<%= taoCongVanYcbs.toString().replaceAll("view_cap_phep_form_bhph.jsp", "bh_ph_tao_cong_van.jsp").toString()+ "&"+renderResponse.getNamespace()+"keyKetQuaThamTra=" %>';
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
		A.io.request('<%=bienHieu_oTo_dangThamXet %>',{
			method: 'POST',
			form: { id: '<portlet:namespace />fm' },
			on: {
					success: function(){
						//message
					}
			}
		});
	});
</aui:script>
