<%@page import="vn.dtt.duongbo.term.quocte.QLVTQuocTeTerm"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String col1 = ParamUtil.getString(request, "col1");
	String col2 = ParamUtil.getString(request, "col2");
	DmDataItem itemLhhd = DmDataItemLocalServiceUtil.getByGroupCodeAndItemCode0(DanhMucConstants.DM_LOAI_HINH_HOAT_DONG, col2);
%>
<aui:input type="hidden" name="<%=QLVTQuocTeTerm.ID_LOAI_HINH %>" value="<%=col1 %>"></aui:input>
<div class="modal-header">
	<h4 class="modal-title"><%=(itemLhhd != null) ? itemLhhd.getName() : ""%></h4>
</div>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Đánh giá phương án kinh doanh vận tải:" inlineField="<%=true %>" >
			
		</aui:field-wrapper>
		
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:input type="radio" name="<%=QLVTQuocTeTerm.KET_QUA_XU_LY_LOAI_HINH %>" value="1" label="Đạt" inlineField="<%=true %>" onClick="showHiddenDiv(1);"></aui:input>
		<aui:input type="radio" name="<%=QLVTQuocTeTerm.KET_QUA_XU_LY_LOAI_HINH %>" value="0" label="Không đạt" inlineField="<%=true %>" onClick="showHiddenDiv(0);"></aui:input>
	</aui:col>
</aui:row>
<div id="divDat" style="display: none;margin-left: 20%;">
	
</div>
<div id="divKoDat"style="display: none;margin-left: 20%;">
	<aui:input type="textarea" name="<%=QLVTQuocTeTerm.LY_DO_KHONG_DAT %>" label="Lý do:" ></aui:input>
</div>
<aui:button-row cssClass="myButtonTop">
	<aui:button cssClass="btn btn-primary" value="Lưu" onClick="submitItemForm();"></aui:button>
</aui:button-row>
<portlet:renderURL var="dv1Page" windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
	<portlet:param name="mvcPath" value="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/cho_tham_xet_viet_lao_qpvt_cap_moi_dv2.jsp"/>
</portlet:renderURL>
<portlet:actionURL var="addItemURL" name="quocTe_vietLao_luuThongTinThamXet" />
<aui:script use="aui-io-request,aui-node">
var A = AUI();
	Liferay.provide(window,'submitItemForm',
		function() {
		var A = AUI();
		var errorBlock=A.one('#group-success-block');
		A.io.request('<%=addItemURL %>',{
			method: 'POST',
			form: { id: '<portlet:namespace />fm' },
			on: {
					success: function(){
					var json = JSON.parse(this.get('responseData'));
  					errorBlock.set("innerHTML","");
  					loadMyPageDv2('<%=dv1Page %>'+'&<portlet:namespace/>xuLyPhuHieuId='+A.one("#<portlet:namespace/>inforId3").val());
  					var errorMessageNode = A.Node.create(json.bodyText);
					errorMessageNode.appendTo(errorBlock);
					
					}
			}
		});
	});
</aui:script>
