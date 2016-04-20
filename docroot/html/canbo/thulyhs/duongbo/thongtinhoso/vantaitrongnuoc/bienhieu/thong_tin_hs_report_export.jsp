<%@page import="vn.dtt.duongbo.report.ReportBusinessUtils"%>
<%@page import="vn.dtt.duongbo.report.ReportUtils"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>

<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%

	String tenFileExport = "defaultPDF.pdfs";
	
	String fileName = "";
	String urlFileDowLoad = "";
	String urlFile = "";
	TthcNoidungHoSo tthcNoidungHoSo = null;
	
	String realPath = ReportUtils.getTemplateReportFilePath(request);

	fileName = ReportBusinessUtils.actionExportMauDon(realPath, hoSoThuTucId, thanhPhanHoSoId, mauDon);
	
	if (fileName.equalsIgnoreCase(ReportBusinessUtils.FILE_NAME_NULL) == false) {
		tenFileExport = fileName;
	}
	
	System.out.println("==/duongbo/thongtinhoso/vantaitrongnuoc/bienhieu/thong_tin_hs_report_export.jsp======tenFileExport===" + tenFileExport);
	//
	
	urlFile = request.getContextPath() + "/export/" + tenFileExport;
			
	
	System.out.println("UrlFile====" + urlFile);
	
	urlFileDowLoad = urlFile.replace(".pdfs", ".pdf");
	
	if (mauDon != null) {
%>

<div align="center">
	<OBJECT data="<%=urlFile%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0"
		type="text/html" TITLE="Báo cáo" 
		WIDTH="100%" HEIGHT="770px"
		style="background: white; min-height: 100%;" >
			<a href="<%=urlFileDowLoad%>"></i>Tải file xuống</a> 
	</object>
</div>
<%}%>