
<%@page import="vn.dtt.duongbo.utils.format.FormatData"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien"%>
<%@page import="vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLocalServiceUtil"%>
<%@page import="vn.dtt.form.util.FormUtil"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyPhuHieuLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyBienHieuLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan"%>
<%@page import="vn.dtt.duongbo.term.lienvan.QlvtLienVanTerm"%>
<%@page import="vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe"%>
<%@page import="vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto"%>
<%@page import="vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu"%>
<%@page import="vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu"%>
<%@page import="vn.dtt.duongbo.maudon.model.CongVanTuChoiCapPHBH"%>
<%@page import="vn.dtt.duongbo.report.ReportBusinessUtils"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.duongbo.maudon.model.CongVanYCBSHoSoDeNghiCapPHBH"%>
<%@page import="vn.dtt.duongbo.maudon.xml.MauDonFactory"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="org.apache.commons.lang.Validate"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.dtt.duongbo.report.ReportUtils"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String maBMReport = "";
	String tenFileExportReport = "defaultPDF.pdfs";
	String fileNameReport = "";
	String urlFileDowLoadReport = "";
	String urlFileReport = "";
	String realPathReport = ReportUtils.getTemplateReportFilePath(request);
	String idPHieuXuKyReport = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY);
	System.out.println("==idPHieuXuKyReport======"+idPHieuXuKyReport);
	String idTTHCReport = ParamUtil.getString(request, Constants.ID_THU_TUC_HANH_CHINH);
	String tenThanhPhanHoSoReport = ParamUtil.getString(request, "tenThanhPhanHoSo");
	String keyKetQuaThamTraReport = ParamUtil.getString(request, "keyKetQuaThamTra");
	String ngayHieuLucInputReport = ParamUtil.getString(request, "ngayHieuLucInput");
	System.out.println("==ngayHieuLucInputReport======"+ngayHieuLucInputReport);
	String xuLyPhuHieuIdReport = ParamUtil.getString(request, "xuLyPhuHieuId"); 
	String col1 = ParamUtil.getString(request, "col1"); 
	QlvtThongTinHoSo thongTinHoSoReport = null;
	QlvtThongTinXuLy qlvtThongTinXuLyReport = null;
	QlvtXuLyGpLienVan qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.fetchQlvtXuLyGpLienVan(Integer.valueOf("0"+col1));
	String xmlInput = "";
	if(Validator.isNull(idPHieuXuKyReport)){
		QLVTXuLyBienHieu bienHieuReport = QLVTXuLyBienHieuLocalServiceUtil.fetchQLVTXuLyBienHieu(Integer.valueOf("0"+xuLyPhuHieuIdReport));
		QLVTXuLyPhuHieu phuHieuReport = QLVTXuLyPhuHieuLocalServiceUtil.fetchQLVTXuLyPhuHieu(Integer.valueOf("0"+xuLyPhuHieuIdReport));
		QlvtXuLyGpLienVan lienVanReport = QlvtXuLyGpLienVanLocalServiceUtil.fetchQlvtXuLyGpLienVan(Integer.valueOf("0"+xuLyPhuHieuIdReport));
		
		if(Validator.isNotNull(bienHieuReport)){
			idPHieuXuKyReport = bienHieuReport.getThongTinXuLyId()+"";
		}else if(Validator.isNotNull(phuHieuReport)){
			idPHieuXuKyReport = phuHieuReport.getThongTinXuLyId()+"";
		}else if(Validator.isNotNull(lienVanReport)){
			idPHieuXuKyReport = lienVanReport.getThongTinXuLyId()+"";
		}
		qlvtThongTinXuLyReport = QlvtThongTinXuLyLocalServiceUtil.fetchQlvtThongTinXuLy(Integer.valueOf("0"+idPHieuXuKyReport));
		thongTinHoSoReport = QlvtThongTinHoSoLocalServiceUtil.fetchQlvtThongTinHoSo(qlvtThongTinXuLyReport.getThongTinHoSoId());
	}else{
		thongTinHoSoReport = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(Long.valueOf("0"+idPHieuXuKyReport));
	}
	if(Validator.isNotNull(thongTinHoSoReport)){
		qlvtThongTinXuLyReport = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+thongTinHoSoReport.getId()));
		if(Validator.isNotNull(qlvtThongTinXuLyReport.getKetQuaXuLy()) && !qlvtThongTinXuLyReport.getKetQuaXuLy().equalsIgnoreCase(keyKetQuaThamTraReport) && Validator.isNotNull(keyKetQuaThamTraReport)){
			maBMReport = keyKetQuaThamTraReport;
		}else{
			keyKetQuaThamTraReport = Validator.isNotNull(qlvtThongTinXuLyReport.getKetQuaXuLy())?qlvtThongTinXuLyReport.getKetQuaXuLy():keyKetQuaThamTraReport;
			maBMReport = keyKetQuaThamTraReport;
		}
		System.out.println("maBMReportmaBMReportmaBMReportmaBMReportmaBMReportmaBMReportmaBMReportmaBMReportmaBMReportmaBMReport+"+maBMReport);
		System.out.println("====keyKetQuaThamTraReport==="+keyKetQuaThamTraReport);
		Class<?> clazz = Class.forName("vn.dtt.duongbo.maudon.model."+Constants.PDF_MAPPING_XSD.get(Constants.PDF_MAPPING.get(maBMReport)));
		Object obj = clazz.newInstance();
		xmlInput = MauDonFactory.convertObjectToXml(obj);
		List<Object> listObject = new ArrayList<Object>();
		System.out.println("");
		if(Validator.isNull(ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY))){

			listObject = MauDonFactory.converXMLMessagesContentToObject(FormUtil.pdfGenerateValue(xmlInput, obj,thongTinHoSoReport ,qlvtThongTinXuLyReport,col1 ));
		}else{
			if(Validator.isNull(qlvtThongTinXuLyReport.getKetQuaThamDinhXML())){
				System.out.println("======getKetQuaThamDinhXML====="+qlvtThongTinXuLyReport);
				System.out.println("thongTinHoSoReport========exportcongvan===="+thongTinHoSoReport);
				qlvtThongTinXuLyReport.setKetQuaThamDinhXML(FormUtil.pdfGenerateGiayPhep(obj, thongTinHoSoReport, qlvtThongTinXuLyReport));
				qlvtThongTinXuLyReport = QlvtThongTinXuLyLocalServiceUtil.updateQlvtThongTinXuLy(qlvtThongTinXuLyReport);
				xmlInput = qlvtThongTinXuLyReport.getKetQuaThamDinhXML();
				System.out.println("======xmlInput===1=="+xmlInput);
			}else if(Validator.isNotNull(qlvtThongTinXuLyReport.getKetQuaXuLy()) && !qlvtThongTinXuLyReport.getKetQuaXuLy().equalsIgnoreCase(keyKetQuaThamTraReport)){
 				qlvtThongTinXuLyReport.setKetQuaThamDinhXML(FormUtil.pdfGenerateGiayPhep(obj, thongTinHoSoReport, qlvtThongTinXuLyReport));
 				qlvtThongTinXuLyReport.setKetQuaXuLy(keyKetQuaThamTraReport);
 				System.out.println("====FormUtil.pdfGenerateGiayPhep(obj, thongTinHoSoReport, qlvtThongTinXuLyReport)====="+FormUtil.pdfGenerateGiayPhep(obj, thongTinHoSoReport, qlvtThongTinXuLyReport));
				qlvtThongTinXuLyReport = QlvtThongTinXuLyLocalServiceUtil.updateQlvtThongTinXuLy(qlvtThongTinXuLyReport);
				
 				xmlInput = qlvtThongTinXuLyReport.getKetQuaThamDinhXML();
 				System.out.println("====xmlInput==123323====="+xmlInput);
			}
			else{
				System.out.println("======	}else{====="+qlvtThongTinXuLyReport);
				xmlInput = qlvtThongTinXuLyReport.getKetQuaThamDinhXML();
			}
			System.out.println("======qlvtThongTinXuLyReport====="+qlvtThongTinXuLyReport);
			System.out.println("======keyKetQuaThamTraReport====="+keyKetQuaThamTraReport);
 			if(!xmlInput.contains("<Envelope><Header></Header>")){
 				xmlInput = FormUtil.makeNoiDungXmlStandard(xmlInput);
 			}
 			System.out.println("======xmlInput===resuilt=="+xmlInput);
			listObject = MauDonFactory.converXMLMessagesContentToObject(xmlInput);
		}
		
		for(Object object : listObject){
			 if(object.getClass().getName().contains(obj.getClass().getName())){
				 fileNameReport = ReportBusinessUtils.actionExportMauDonDanhSachDonFake(realPathReport,maBMReport, String.valueOf(thongTinHoSoReport.getPhieuXuLyId()),object);
			 	break;
			 }
		}
		tenFileExportReport = fileNameReport;
	}
	//
	urlFileReport = request.getContextPath() + "/export/" + tenFileExportReport;
	urlFileDowLoadReport = urlFileReport.replace(".pdfs", ".pdf");
%>
<div align="center">
	<OBJECT data="<%=urlFileReport%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0" type="text/html" TITLE="Báo cáo"
		WIDTH="100%" HEIGHT="770px" style="background: white; min-height: 100%;">
		<a href="<%=urlFileDowLoadReport%>"></i>Tải file xuống</a>
	</object>
</div>
