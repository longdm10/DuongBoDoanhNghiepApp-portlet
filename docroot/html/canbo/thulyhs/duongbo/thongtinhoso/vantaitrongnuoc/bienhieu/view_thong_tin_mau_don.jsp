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
	System.out.println("-------in /canbo/thulyhs/duongbo/thongtinhoso/vantaitrongnuoc/bienhieu/view_thong_tin_mau_don.jsp");
	
	long idNoiDungHoSo = ParamUtil.getLong(request, Constants.ID_NOI_DUNG_HO_SO);
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	String listNoiDungHoSo = ParamUtil.getString(request, "listNoiDungHoSo");
	String backUrl = ParamUtil.getString(request, "backUrl");
	System.out.println("-------backUrl: " + backUrl);
	System.out.println("-------hoSoThuTucId: " + hoSoThuTucId);
	System.out.println("-------idNoiDungHoSo: " + idNoiDungHoSo);
	//long idNoiDungHoSo = 1;
	String tenFileExport = "defaultPDF.pdfs";
	
	
	TthcNoidungHoSo tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(idNoiDungHoSo);
	
	String fileName = "";
	String urlFileDowLoad = "";
	String urlFile = "";
	if(tthcNoidungHoSo != null){
		if(tthcNoidungHoSo.getTaiLieuDinhKem() > 0){
			System.out.println("-------idFileView: " + tthcNoidungHoSo.getTaiLieuDinhKem());
			if(tthcNoidungHoSo.getTaiLieuDinhKem() > 0){
				urlFile = DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(tthcNoidungHoSo.getTaiLieuDinhKem());
			}
			System.out.println("-------urlFile: " + urlFile);
		} else {
			if(tthcNoidungHoSo.getNoiDungXml() != null && tthcNoidungHoSo.getNoiDungXml().trim().length() > 0){
				System.out.println("-------getNoiDungXml ton tai");
				
				List<Object> allMauDon = MauDonFactory.converXMLMessagesContentToObject(tthcNoidungHoSo.getNoiDungXml());
				if(allMauDon != null && allMauDon.size()>0){
					String realPath = ReportUtils.getTemplateReportFilePath(request);
	
					fileName = ReportBusinessUtils.actionExportMauDon(realPath, hoSoThuTucId, thanhPhanHoSoId, allMauDon.get(0));
					
					if (fileName.equalsIgnoreCase(ReportBusinessUtils.FILE_NAME_NULL) == false) {
						tenFileExport = fileName;
					}
					System.out.println("==report_export.jsp======tenFileExport===" + tenFileExport);
					//
					
					urlFile = request.getContextPath() + "/export/" + tenFileExport;
				}
				
			}
		}
		System.out.println("UrlFile====" + urlFile);
		
		if(urlFile.contains(".pdfs")){
			urlFileDowLoad = urlFile.replace(".pdfs", ".pdf");
		} else if(urlFile.contains(".doc")){
			urlFileDowLoad="https://docs.google.com/viewer?url="+PortalUtil.getPortalURL(request)+urlFile+"&embedded=true";
		} else{
			urlFileDowLoad = urlFile;
		}
	}
	
	PortletURL actionBack = renderResponse.createRenderURL();
	actionBack.setParameter("jspPage", backUrl);
	actionBack.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	actionBack.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	actionBack.setParameter("listNoiDungHoSo", String.valueOf(listNoiDungHoSo));
	
%>
	
<%
	if (tthcNoidungHoSo != null) {
%>

<section class="right" style="padding: 1px;">
<div class="main_chuanbihs" style="  margin: 5px;background-color: white;border: 1px solid rgb(176, 176, 175);padding: 10px;">
<div align="center">
	<OBJECT data="<%=urlFileDowLoad%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0"
		type="text/html" TITLE="Báo cáo" 
		WIDTH="100%" HEIGHT="770px"
		style="background: white; min-height: 100%;" >
			<a href="<%=urlFileDowLoad%>">Tai file xuong</a> 
	</object>
</div>
</div>
</section>
<%}%>
<div class="btns_chuanbihs" style="margin: 5px 0px 10px 0px;">
	<button style="margin: 15px 0px 45px 5px;" class="button4" type="button" onclick="window.location.href='<%=actionBack.toString()%>'">Quay lại</button>
</div>

