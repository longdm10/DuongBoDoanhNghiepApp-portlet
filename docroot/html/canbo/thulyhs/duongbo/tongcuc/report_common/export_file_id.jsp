<%@page import="vn.dtt.duongbo.report.ReportBusinessUtils"%>
<%@page import="vn.dtt.duongbo.report.ReportUtils"%>
<%@page import="vn.dtt.duongbo.maudon.xml.MauDonFactory"%>
<%@page import="vn.dtt.duongbo.utils.document.DocumentUtils"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page pageEncoding="UTF-8"%>
<%@ include file="/html/init.jsp"%>

<%
	long idFile = ParamUtil.getLong(request, "idFileReturn");
	String tenFileExport = "defaultPDF.pdfs";
	String fileName = "";
	String urlFileDowLoad = "";
	String urlFile = "";
	urlFile = DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(idFile);
	if(urlFile.contains(".pdfs")){
		urlFileDowLoad = urlFile.replace(".pdfs", ".pdf");
	} else if(urlFile.contains(".doc")){
		urlFileDowLoad="https://docs.google.com/viewer?url="+PortalUtil.getPortalURL(request)+urlFile+"&embedded=true";
	} else{
		urlFileDowLoad = urlFile;
	}
	
%>

<div align="center">
	<OBJECT data="<%=urlFileDowLoad%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0"
		type="text/html" TITLE="Báo cáo" 
		WIDTH="100%" HEIGHT="770px"
		style="background: white; min-height: 100%;" >
			<a href="<%=urlFileDowLoad%>">Tai file xuong</a> 
	</object>
</div>
