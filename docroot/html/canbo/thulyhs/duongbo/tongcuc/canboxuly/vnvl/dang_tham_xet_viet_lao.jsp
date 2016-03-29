<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%

	PortletURL quocTe_vietLao_dangThamXet = renderResponse.createActionURL();
	quocTe_vietLao_dangThamXet.setParameter(ActionRequest.ACTION_NAME, "quocTe_vietLao_dangThamXet");
	quocTe_vietLao_dangThamXet.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
	quocTe_vietLao_dangThamXet.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
	quocTe_vietLao_dangThamXet.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
	quocTe_vietLao_dangThamXet.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
	quocTe_vietLao_dangThamXet.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
	
	PortletURL taoCongVanYcbs = renderResponse.createRenderURL();
	taoCongVanYcbs.setParameter("jspPage", "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/vn_vl_tao_cong_van.jsp");
	taoCongVanYcbs.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
	taoCongVanYcbs.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
	taoCongVanYcbs.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
	taoCongVanYcbs.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
	taoCongVanYcbs.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
	
	String stringMVCPath = "";
	if (Constants.TTHC_VIET_LAO_CAP_PHEP_DUONG_BO.equalsIgnoreCase(maThuTucHanhChinh)) {
		stringMVCPath = "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/dang_tham_xet_viet_lao_qpvt_cap_moi.jsp";
		
	} else if (Constants.TTHC_VIET_LAO_CAP_LAI_DUONG_BO_HET_HAN.equalsIgnoreCase(maThuTucHanhChinh) ||
				Constants.TTHC_VIET_LAO_CAP_LAI_DUONG_BO_HU_HONG.equalsIgnoreCase(maThuTucHanhChinh) ||
				Constants.TTHC_VIET_LAO_CAP_LAI_DUONG_BO_MAT_MAT.equalsIgnoreCase(maThuTucHanhChinh)) {
		stringMVCPath = "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/dang_tham_xet_viet_lao_gqvt_hethan_matmat_huhuong.jsp";
	}else if (Constants.TTHC_VIET_LAO_KHAI_THAC_TUYEN_HANH_KHACH_CO_DINH_LIEN_VAN_QUOC_TE.equalsIgnoreCase(maThuTucHanhChinh)||Constants.TTHC_VIET_LAO_BO_SUNG_PHUONNG_TIEN_KHAI_THAC_TUYEN_CO_DINH_VAN_TAI.equalsIgnoreCase(maThuTucHanhChinh)) {
		stringMVCPath = "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/cho_tham_xet_viet_lao_ktt_chap_thuan.jsp";
	}  else if (Constants.TTHC_VIET_LAO_THAY_THE_PHUONG_TIEN_KHAI_THAC_TUYEN_CO_DINH_VAN_TAI.equalsIgnoreCase(maThuTucHanhChinh)) {
		stringMVCPath = "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/cho_tham_xet_viet_lao_ktt_thay_the_phuong_tien_tren_tuyen.jsp";
	}  else if (Constants.TTHC_VIET_LAO_DIEU_CHINH_TAN_SUAT_VAN_TAI_HANH_KHACH_CO_DINH.equalsIgnoreCase(maThuTucHanhChinh)) {
		stringMVCPath = "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/cho_tham_xet_viet_lao_ktt_tang_giam_tan_suat.jsp";
	}else if (Constants.TTHC_VIET_LAO_NGUNG_KHAI_THAC_TUYEN_CO_DINH_VAN_TAI.equalsIgnoreCase(maThuTucHanhChinh)) {
		stringMVCPath = "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/cho_tham_xet_viet_lao_ktt_ngung_khai_thac.jsp";
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
<div id="idBtn" >
	<aui:button-row>
		<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/ket_qua_tham_tra.jspf"%>
		<input style="width: 10%;" class="btn btn-primary" type="submit" value="Lưu kết quả" 
					onclick="submitItemForm();"/>
		<a id="<portlet:namespace/>tcv" class="btn btn-primary" style="color: white;" href="" >Tạo công văn</a>
	</aui:button-row>
</div>
</aui:form>
<script type="text/javascript">
	var A = AUI();
	function getRenderPar(code) {
		var renderUrl;
		if(code != "CVTCCGP" && code != "CVYCBS"){
			renderUrl = '<%= taoCongVanYcbs.toString().replaceAll("vn_vl_tao_cong_van.jsp", "vn_vl_tao_cong_van_view.jsp").toString()+ "&"+renderResponse.getNamespace()+"keyKetQuaThamTra=" %>';
		}else{
			renderUrl = '<%= taoCongVanYcbs.toString().replaceAll("vn_vl_tao_cong_van_view.jsp", "vn_vl_tao_cong_van.jsp").toString()+ "&"+renderResponse.getNamespace()+"keyKetQuaThamTra=" %>';
		}
		A.one("#<portlet:namespace/>tcv").removeAttribute('disabled').removeClass('disabled').addClass('btn-primary').attr('href',renderUrl+code+'&<portlet:namespace/>xuLyPhuHieuId='+A.one("#<portlet:namespace/>inforId3").val()+'&<portlet:namespace/>ngayHieuLucInput='+A.one("#<portlet:namespace/>ngayHieuLucInput").val());
	}
</script>
<aui:script use="aui-io-request,aui-node">
var A = AUI();
Liferay.provide(window,'submitItemForm',
		function() {
		var A = AUI();
		var errorBlock=A.one('#group-success-block');
		A.io.request('<%=quocTe_vietLao_dangThamXet %>',{
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