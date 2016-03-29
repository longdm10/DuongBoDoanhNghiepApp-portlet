
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%

PortletURL phuHieu_oTo_CTKQ = renderResponse.createActionURL();
phuHieu_oTo_CTKQ.setParameter(ActionRequest.ACTION_NAME, "phuHieu_oTo_CTKQ");
phuHieu_oTo_CTKQ.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
phuHieu_oTo_CTKQ.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
phuHieu_oTo_CTKQ.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
phuHieu_oTo_CTKQ.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
phuHieu_oTo_CTKQ.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(Long.valueOf("0"+phieuXuLyId));
QlvtThongTinXuLy qlvtThongTinXuLy = null;
if(Validator.isNotNull(thongTinHoSo)){
	qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+thongTinHoSo.getId()));	
}
%>

<portlet:renderURL var="renderSearchContent">
			<portlet:param name="jspPage" value="/html/hscanbo/search_content.jsp"/>
			<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC%>" value="<%=StringUtil.valueOf(hoSoThuTucId)%>"/>
			<portlet:param name="<%=Constants.ID_PHIEU_XU_LY%>" value="<%=StringUtil.valueOf(phieuXuLyId)%>"/>
			<portlet:param name="<%=Constants.THANH_PHAN_XU_LY%>" value="<%=StringUtil.valueOf(thanhPhanXuLy)%>"/>
</portlet:renderURL>
<portlet:actionURL var="addItemURL" name="bienHieu_oTo_CTKQ" />
<portlet:actionURL var="uploadURL" name="upLoadFileBieuMau" />
<aui:form name="fm" action="<%=phuHieu_oTo_CTKQ.toString()%>">
<div class="TabbedPanelsContent">
	<aui:input type="hidden" name="keyDichChuyen"></aui:input>
	<aui:input type="hidden" name="<%=Constants.ID_PHIEU_XU_LY %>" value="<%=phieuXuLyId %>"></aui:input>
	<aui:input type="hidden" name="<%=Constants.ID_QUY_TRINH_THU_TUC %>" value="<%=quyTrinhThuTucId %>"></aui:input>
	<aui:input type="hidden" name="actionCHK"></aui:input>
	<aui:input type="hidden" name="actionURL" value="<%=phuHieu_oTo_CTKQ.toString() %>"></aui:input>
	<aui:input type="hidden" name="userIdXuLy"></aui:input>
		<aui:input type="hidden" name="idRowTMP"></aui:input>
	<%
		if(qlvtThongTinXuLy.getKetQuaXuLy().equalsIgnoreCase("CVYCBS")||qlvtThongTinXuLy.getKetQuaXuLy().equalsIgnoreCase("CVTCCGP")){
			%>
			<div align="center">
				<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/export_cong_van.jsp"%>
			</div>
			<%
		}else{
			int xuLyPhuHieuId=0;
			if(Validator.isNotNull(qlvtThongTinXuLy)){
				QLVTXuLyBienHieu ettXuLyBienHieu = QLVTXuLyBienHieuLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+qlvtThongTinXuLy.getId()));
				QLVTXuLyPhuHieu ettXuLyPhuHieu = QLVTXuLyPhuHieuLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+qlvtThongTinXuLy.getId()));
				xuLyPhuHieuId = Validator.isNotNull(ettXuLyBienHieu)?ettXuLyBienHieu.getId():ettXuLyPhuHieu.getId();
			}
		%>
		<div align="center">
		<liferay-util:include page="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/bhph/bh_ph_view_cap_phep_form.jsp" servletContext="<%=this.getServletContext() %>">
			<liferay-util:param name="popUp" value="1" />
			<liferay-util:param name="<%=Constants.ID_PHIEU_XU_LY %>" value="<%=phieuXuLyId %>" />
			<liferay-util:param name="xuLyPhuHieuId" value="<%=String.valueOf(xuLyPhuHieuId) %>" />
		</liferay-util:include>
		</div>
		<%
		}
		%>
	<div style = "margin-top: 20px;">
		<aui:input type="hidden" name="tenTaiLieuFm"></aui:input>
		<aui:input type="hidden" name="idFileFm"></aui:input>
		<aui:input type="hidden" name="tenTaiLieuFms"></aui:input>
		<aui:input type="hidden" name="idFileFms"></aui:input>
		<aui:input type="hidden" name="idPTFm"></aui:input>
		<aui:button name="btnSubmit" cssClass="btn btn-primary" value="Trả kết quả" onClick="chuyenDichDynamic('Tra.ket.qua.cap.phep');"/>
	</div>
</div>
<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/script_button.jspf"%>
</aui:form>

<aui:script>

Liferay.provide(window, 'uploadFile',
    function() {
        var A = AUI();
        var errorBlock=A.one('#group-success-block'+A.one('#<portlet:namespace/>idRowTMP').val());
        A.io('<%= uploadURL %>',
				{
					dataType: 'json',
					method: "POST",
					form: {
		                    id: "<portlet:namespace />fm",
		                    enctype : 'multipart/form-data',
		                    upload: true
		            },
		            on: {
		                complete: function(id, request) {
		                    // The server returns a response like <div>response</div>
		                    var jsonDDD = JSON.parse(request.responseText);
		                    errorBlock.set("innerHTML","");
			                  var errorMessageNode = A.Node.create(jsonDDD.tenTaiLieu);
							  errorMessageNode.appendTo(errorBlock);
							  A.one('#<portlet:namespace />fName'+A.one('#<portlet:namespace/>idRowTMP').val()).val(jsonDDD.tenTaiLieu);
							  A.one('#<portlet:namespace />fId'+A.one('#<portlet:namespace/>idRowTMP').val()).val(jsonDDD.idFile);
							  A.one('#<portlet:namespace />tenTaiLieuFms').val(A.one('#<portlet:namespace />tenTaiLieuFms').val()+","+A.one('#<portlet:namespace />fName'+A.one('#<portlet:namespace/>idRowTMP').val()).val());
							  A.one('#<portlet:namespace />idFileFms').val(A.one('#<portlet:namespace />idFileFms').val()+","+A.one('#<portlet:namespace />fId'+A.one('#<portlet:namespace/>idRowTMP').val()).val());
							  A.one('#<portlet:namespace />idPTFm').val(A.one('#<portlet:namespace />idPTFm').val().replace(A.one('#<portlet:namespace />fIdPT'+A.one('#<portlet:namespace/>idRowTMP').val()).val(), "")+","+A.one('#<portlet:namespace />fIdPT'+A.one('#<portlet:namespace/>idRowTMP').val()).val());
			                  A.one("#<portlet:namespace/>btnSubmit").removeAttribute('disabled').setStyle('opacity','1');
			                  $('#upLoadFile_dialog').modal('hide');
		                }
		            }
				}
			);
        
    },
    ['aui-io']
);
</aui:script>
<script>
var A = AUI();
function func_uploadFile(idDiv) {
	A.one('#<portlet:namespace/>idRowTMP').val("");
	A.one('#<portlet:namespace/>idRowTMP').val(idDiv);
	$('#upLoadFile_dialog').modal('show');
}

function uploadFilePopup() {
		func_uploadFile();
}


function func_close_dialog() {
	$('#upLoadFile_dialog').dialog('close');
}

</script>