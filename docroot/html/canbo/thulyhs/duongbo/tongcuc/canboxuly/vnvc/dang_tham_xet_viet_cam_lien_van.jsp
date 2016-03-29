<%@page import="java.util.Arrays"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%

PortletURL luuKetQuaThamXetLienVanVietLao = renderResponse.createActionURL();
luuKetQuaThamXetLienVanVietLao.setParameter(ActionRequest.ACTION_NAME, "luuKetQuaThamXetLienVanVietLao");
luuKetQuaThamXetLienVanVietLao.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
luuKetQuaThamXetLienVanVietLao.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
luuKetQuaThamXetLienVanVietLao.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
luuKetQuaThamXetLienVanVietLao.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
luuKetQuaThamXetLienVanVietLao.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
//chuyenDichTrangThaiURL.setParameter(Constants.DIEU_KIEN_DICH_CHUYEN, YTeConfigurationManager.getStrProp("dieukiendichchuyen.cbxl.kiem.dinh=Kiem.dinh", "Kiem.dinh"));

PortletURL taoCongVanYcbs = renderResponse.createRenderURL();
taoCongVanYcbs.setParameter("jspPage", "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvc/vn_vc_lien_van_tao_cong_van.jsp");
taoCongVanYcbs.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
taoCongVanYcbs.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
taoCongVanYcbs.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
taoCongVanYcbs.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
taoCongVanYcbs.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
	String stringMVCPath = "";
	

	if (Arrays.deepToString(Constants.VIET_LAO_LIEN_VAN_THUONG_MAI).contains(maThuTucHanhChinh)) {
		stringMVCPath = "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvc/cho_tham_xet_viet_cam_gplv_thuong_mai.jsp";
	} else if (Constants.VIET_LAO_LIEN_VAN_PHI_GIA_HAn.equalsIgnoreCase(maThuTucHanhChinh)){
		stringMVCPath = "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvc/cho_tham_xet_viet_cam_gplv_gia_han.jsp";
	}else{
		stringMVCPath = "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvc/cho_tham_xet_viet_cam_gplv_phi_thuong_mai.jsp";
	}
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
		if(code != "CVTCCGP" && code != "CVYCBS"){
			renderUrl = '<%= taoCongVanYcbs.toString().replaceAll("vn_vc_lien_van_tao_cong_van.jsp", "vnvc_view_cap_phep_form.jsp").toString()+ "&"+renderResponse.getNamespace()+"keyKetQuaThamTra=" %>';
		}else if(code == "GPVT_VT_GIAHAN"){
			renderUrl = '<%= taoCongVanYcbs.toString().replaceAll("vnvc/vn_vc_lien_van_tao_cong_van.jsp", "report_common/export_cong_van.jsp").toString()+ "&"+renderResponse.getNamespace()+"keyKetQuaThamTra=" %>';
		}else{
			renderUrl = '<%= taoCongVanYcbs.toString().replaceAll("vnvc_view_cap_phep_form.jsp", "vn_vc_lien_van_tao_cong_van.jsp").replaceAll("report_common/export_cong_van.jsp", "vnvc/vn_vc_lien_van_tao_cong_van.jsp").toString()+ "&"+renderResponse.getNamespace()+"keyKetQuaThamTra=" %>';
		}
		A.one("#<portlet:namespace/>tcv").removeAttribute('disabled').removeClass('disabled').addClass('btn-primary').attr('href',renderUrl+code+'&<portlet:namespace/>xuLyPhuHieuId='+A.one("#<portlet:namespace/>inforId3").val());
	}
</script>
<aui:script use="aui-io-request,aui-node">
var A = AUI();
Liferay.provide(window, 'advSubmit', function(action,key) {
	var keyDichChuyen = A.one("#<portlet:namespace/>keyDichChuyen");
	keyDichChuyen.val(key);
    A.one('#<portlet:namespace/>fm').set('action',action);

});




	Liferay.provide(window,'submitItemForm',
		function() {
		var A = AUI();
		var errorBlock=A.one('#group-success-block');
		A.io.request('<%=luuKetQuaThamXetLienVanVietLao.toString() %>',{
			method: 'POST',
			form: { id: '<portlet:namespace />fm' },
			on: {
					success: function(){
					var json = JSON.parse(this.get('responseData'));
  					errorBlock.set("innerHTML","");
  					var errorMessageNode = A.Node.create(json.bodyText);
					errorMessageNode.appendTo(errorBlock);
					
					}
			}
		});
	});

</aui:script>