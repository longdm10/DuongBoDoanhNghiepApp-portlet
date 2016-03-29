<%@page import="vn.dtt.duongbo.utils.document.DocumentUtils"%>
<%@page import="vn.dtt.yte.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.yte.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.yte.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.yte.dao.common.model.TthcThanhPhanHoSo"%>
<%@page import="vn.dtt.yte.dao.common.service.TthcThanhPhanHoSoBieuMauLocalServiceUtil"%>
<%@page import="vn.dtt.yte.dao.common.model.TthcThanhPhanHoSoBieuMau"%>
<%@page import="vn.dtt.yte.dao.common.service.TthcBieuMauHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.yte.dao.common.model.TthcBieuMauHoSo"%>
<%@page import="java.util.Arrays"%>
<%@page import="vn.dtt.yte.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.yte.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.yte.dao.nghiepvu.service.ThongTinXuLyLocalServiceUtil"%>
<%@page import="vn.dtt.yte.dao.nghiepvu.model.ThongTinXuLy"%>
<%@page import="vn.dtt.yte.dao.nghiepvu.model.ThongTinDangKy"%>
<%@page import="vn.dtt.yte.dao.nghiepvu.service.ThongTinDangKyLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@ include file="/html/init.jsp"%>

<%@page pageEncoding="UTF-8"%>
<%System.out.println("-------in thong_tin_file_export.jsp----------");
	String tenFileExport = "defaultPDF.pdfs";
	String fileName = "";
	String urlFileDowLoad = "";
	String urlFile = "";
	boolean isExists = false;
	long idQuanLyFile = ParamUtil.getLong(request, Constants.ID_QUAN_LY_FILE);
	long idFile = ParamUtil.getLong(request, Constants.ID_FILE);

	urlFile = DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(idFile);
	if(urlFile != null && urlFile.trim().length() > 0){
		isExists = true;
	} else {
		urlFile = request.getContextPath() + "/export/" + tenFileExport;
	}
	
	
	//String backUrl = ParamUtil.getString(request, "backUrl");
	System.out.println("UrlFile====" + urlFile);
	
	urlFileDowLoad = urlFile.replace(".pdfs", ".pdf");
	
	String doanhNghiepId = ParamUtil.getString(request, Constants.ID_DOANH_NGHIEP);
	String idQlFile = ParamUtil.getString(request, Constants.ID_QUAN_LY_FILE);
	
	
	PortletURL backUrl = renderResponse.createRenderURL();
	backUrl.setParameter("jspPage", "/html/hsdoanhnghiep/quanlyfile/giaytochung/quan_ly_file_search_content.jsp");
	backUrl.setParameter(Constants.ID_QUAN_LY_FILE, String.valueOf(idQuanLyFile));
	backUrl.setParameter(Constants.ID_FILE, String.valueOf(idFile));
	backUrl.setParameter(Constants.ID_DOANH_NGHIEP, String.valueOf(doanhNghiepId));

	
	//PortletURL actionBack = renderResponse.createRenderURL();
	//actionBack.setParameter("jspPage", backUrl);
	//actionBack.setParameter(Constants.ID_QUAN_LY_FILE, String.valueOf(idQuanLyFile));
	//actionBack.setParameter(Constants.ID_FILE, String.valueOf(idFile));
	//actionBack.setParameter(Constants.ID_DOANH_NGHIEP, String.valueOf(doanhNghiepId));
	

if(isExists){
%>
<div align="center" id="reportView">
	<OBJECT data="<%=urlFile%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0"
		type="text/html" TITLE="Báo cáo" 
		WIDTH="100%" HEIGHT="770px"
		style="background: white; min-height: 100%;" >
			<a href="<%=urlFileDowLoad%>"></i>Tải file xuống</a> 
	</object>
</div>
<%}%>



<div class="btns_chuanbihs" style="margin: 5px 0px 10px 0px;">
<input class="button4" style="margin: 15px 0px 45px 5px;" type="button" onclick="window.location.href='<%=backUrl.toString()%>'" value="Quay lại">
</div>