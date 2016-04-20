
<%@page import="vn.dtt.duongbo.dao.common.service.TthcBieuMauHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoBieuMauLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%

PortletURL noiDia_oTo_CTKQ = renderResponse.createActionURL();
noiDia_oTo_CTKQ.setParameter(ActionRequest.ACTION_NAME, "noiDia_oTo_CTKQ");
noiDia_oTo_CTKQ.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
noiDia_oTo_CTKQ.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
noiDia_oTo_CTKQ.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
noiDia_oTo_CTKQ.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
noiDia_oTo_CTKQ.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
%>

<portlet:actionURL var="addItemURL" name="noiDia_oTo_CTKQ" />
<portlet:actionURL var="uploadURL" name="upLoadFileBieuMau" />
<aui:form name="fm" action="<%=noiDia_oTo_CTKQ.toString()%>">
<div class="TabbedPanelsContent">
	<aui:input type="hidden" name="keyDichChuyen"></aui:input>
	<aui:input type="hidden" name="tenTaiLieuFm"></aui:input>
	<aui:input type="hidden" name="<%=Constants.ID_PHIEU_XU_LY %>" value="<%=phieuXuLyId %>"></aui:input>
	<aui:input type="hidden" name="<%=Constants.ID_QUY_TRINH_THU_TUC %>" value="<%=quyTrinhThuTucId %>"></aui:input>
	<aui:input type="hidden" name="actionCHK"></aui:input>
	<aui:input type="hidden" name="actionURL" value="<%=noiDia_oTo_CTKQ.toString() %>"></aui:input>
	<aui:input type="hidden" name="userIdXuLy"></aui:input>
		<aui:input type="hidden" name="idFileFm"></aui:input>
	<div align="center">
		<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/export_cong_van.jsp"%>
	</div>
	
	<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/upload.jspf"%>
	
	<div style = "margin-top: 20px;">
			<aui:button name="btnSubmit" cssClass="btn btn-primary" value="Trả kết quả" onClick="chuyenDichDynamic('Tra.ket.qua.cap.phep');"/>
			<a href="#" class="btn btn-primary" onclick="javascript:func_uploadFile('1');" title="Tải giấy tờ lên">TẢI KẾT QUẢ</a>
	</div>
	<div id="group-success-block">
	
	</div>
	<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/script_button.jspf"%>
</div>
</aui:form>

<aui:script>

Liferay.provide(window, 'uploadFile',
    function() {
        var A = AUI();
        var errorBlock=A.one('#group-success-block');
         var cfg = {
                method: "POST",
                form: {
                    id: "<portlet:namespace />fm",
                    enctype : 'multipart/form-data',
                    upload: true
                }
            };
          A.io('<%= uploadURL %>', cfg);
          A.on('io:complete', function (id, o, args) {
              if (o && o.responseText) {
                  response = A.JSON.parse(o.responseText);
                  errorBlock.set("innerHTML","");
                  var errorMessageNode = A.Node.create("<div class=\"alertSuccessDB\">Tải tệp tin "+response.tenTaiLieu+" Thành công!</div>");
				  errorMessageNode.appendTo(errorBlock);
                  A.one('#<portlet:namespace />tenTaiLieuFm').val(response.tenTaiLieu);
				  A.one('#<portlet:namespace />idFileFm').val(response.idFile);
                  $('.modal-header:first').find('button:first').click();  
                  A.one("#<portlet:namespace/>btnSubmit").removeAttribute('disabled').setStyle('opacity','1');
              }
          });
    },
    ['aui-io']
);
</aui:script>
<script>
function func_uploadFile() {
	$('#upLoadFile_dialog').modal('show');
}

function uploadFilePopup() {
		func_uploadFile();
}


function func_close_dialog() {
	$('#upLoadFile_dialog').dialog('close');
}

</script>