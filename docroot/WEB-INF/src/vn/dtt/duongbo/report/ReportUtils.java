
package vn.dtt.duongbo.report;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletSession;
import javax.portlet.ResourceRequest;
import javax.servlet.http.HttpServletRequest;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRPrintPage;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import vn.dtt.duongbo.dao.common.model.DmDataItem;
import vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtNoiDungThamTraLocalServiceUtil;
import vn.dtt.duongbo.utils.config.DuongBoConfigurationManager;
import vn.dtt.duongbo.utils.document.DocumentUtils;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class ReportUtils {
	
	private static Log log = LogFactoryUtil.getLog(ReportUtils.class);
	
	public static final String PATH_FILE_REPORT = "report";
	public static final String PATH_FILE_EXPORT = "export";
	
	public static final String BAN_DK_KIEM_TRA = null;
	
	public static String getItemNameInCodeList(List<String> itemCode) {
		String result = "";
		if (itemCode != null && itemCode.size() > 0) {
			for (String s : itemCode) {
				log.info("----------------code Data-------------" + s);
				DmDataItem dataItem = DmDataItemLocalServiceUtil.getByCode(s);
				if (dataItem != null) {
					result = result + "<br>- " + dataItem.getName();
				}
			}
		}
		log.info("------Ten Data--------" + result);
		return result;
	}
	
	public static String getNameInLineCodeList(List<String> itemCode) {
		String result = "";
		if (itemCode != null && itemCode.size() > 0) {
			boolean first = true;
			for (String s : itemCode) {
				log.info("----------------code Data-------------" + s);
				DmDataItem dataItem = DmDataItemLocalServiceUtil.getByCode(s);
				if (dataItem != null) {
					if (first == true) {
						result = result + "" + dataItem.getName();
					} else {
						result = result + "; " + dataItem.getName();
					}
					first = false;
				}
			}
		}
		log.info("------Ten Data--------" + result);
		return result;
	}
	
	public static String getArrayItemNameInLinet(String arrayrItemCode) {
		String result = "";
		if (arrayrItemCode != null && arrayrItemCode.length() > 0) {
			String[] splitItem = arrayrItemCode.split(",");
			boolean first = true;
			for (String s : splitItem) {
				log.info("----------------code Data-------------" + s);
				DmDataItem dataItem = DmDataItemLocalServiceUtil.getByCode(s);
				if (dataItem != null) {
					if (first == true) {
						result = result + "" + dataItem.getName();
					} else {
						result = result + "; " + dataItem.getName();
					}
					first = false;
				}
			}
		}
		log.info("------Ten Data--------" + result);
		return result;
	}
	
	public static String getTemplateReportFilePath(HttpServletRequest request, String reportOrexport, String fileName) {
		
		return request.getSession().getServletContext().getRealPath("/").replace("/", File.separator).replace(File.separator + ".", "") + reportOrexport +
			File.separator + fileName;
	}
	
	public static String getTemplateReportFilePath(PortletSession session) {
		
		return session.getPortletContext().getRealPath("/").replace("/", File.separator).replace(File.separator + ".", "");
	}
	
	public static String getTemplateReportFilePath(ResourceRequest request) {
		return request.getPortletSession().getPortletContext().getRealPath("/").replace("/", File.separator).replace(File.separator + ".", "");
		
	}
	
	public static String getTemplateReportFilePath(HttpServletRequest request) {
		
		return request.getSession().getServletContext().getRealPath("/").replace("/", File.separator).replace(File.separator + ".", "");
	}
	
	/*
	 * Function Export to Server
	 * 
	 */
	public void exportFunction(String tenFile_Template, String tenFile_Export, JRDataSource dataSource, Map<String, Object> parameters) {
		
		try {
			String pathFileTemp = null;
			InputStream inputStream = new FileInputStream(pathFileTemp + tenFile_Template);
			JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
			JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
			
			parameters.put("SUBREPORT_DIR", pathFileTemp);
			
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
			String pathFileSub = null;
			JasperExportManager.exportReportToPdfFile(jasperPrint, pathFileSub + tenFile_Export);
			log.debug("----- END EXPORT SERVER ---" + pathFileSub);
		} catch (Exception e) {
			log.error("---LOI EXPORT ---" + e);
			e.printStackTrace();
		}
	}
	
	/*
	 * Function Export to Server
	 */
	public static String exportFunction(
		String realPath, String dirParent, String tenFile_Template, String tenFile_Export, JRDataSource dataSource, Map<String, Object> parameters) {
		String tenFile = tenFile_Export;
		
		try {
			String pathTemplate = realPath + PATH_FILE_REPORT + File.separator + dirParent + File.separator + tenFile_Template;
			
			log.info("====pathTemplate====" + pathTemplate);
			InputStream inputStream = new FileInputStream(pathTemplate);
			
			JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
			JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
			
			log.info("====SUBREPORT_DIR====" + (realPath + PATH_FILE_REPORT + File.separator + dirParent + File.separator));
			log.info(realPath + "---parameters.put(--------1" + dataSource + "--" + dirParent);
			parameters.put("SUBREPORT_DIR", realPath + PATH_FILE_REPORT + File.separator + dirParent + File.separator);
			log.info(realPath + "---parameters.put(--------2" + dataSource + "--" + dirParent);
			parameters.put("IMG_DIR", realPath + PATH_FILE_REPORT + File.separator + "img" + File.separator);
			log.info("====IMG_DIR====" + realPath + PATH_FILE_REPORT + File.separator + "img" + File.separator);
			
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
			String pathExport = realPath + PATH_FILE_EXPORT + File.separator + tenFile_Export;
			
			log.info("====pathExport====" + pathExport);
			JasperExportManager.exportReportToPdfFile(jasperPrint, pathExport);
			log.info("----- END EXPORT SERVER ---" + pathExport);
		} catch (Exception e) {
			log.info("---LOI EXPORT Return FileName---");
			tenFile = ReportConstant.TEN_FILE_DEFAULT;
			log.info("---LOI EXPORT ---" + e);
			e.printStackTrace();
		}
		
		return tenFile;
	}
	
	public static long uploadFileBieuMauByPath(String sourcePath, String fileName) {
		InputStream inputStream = null;
		
		try {
			inputStream = new FileInputStream(sourcePath);
			
			if (inputStream != null) {
				byte[] fileContent = DocumentUtils.getByteFromInputStream(inputStream);
				long userSystem = DuongBoConfigurationManager.getLongProp("DB-system-use-upload_file_system", 0);
				return DocumentUtils.uploadTaiLieu(fileContent, userSystem, fileName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (Exception e) {
				};
			}
		}
		
		return 0;
	}
	
	public static void exportFunctionWithSubreport(
		HttpServletRequest request, String tenFile_Template, String subreportDir, String tenFile_Export, JRDataSource jrDataSource) {
		
		try {
			String pathTemplate = getTemplateReportFilePath(request, PATH_FILE_REPORT, tenFile_Template);
			log.debug("====pathTemplate====" + pathTemplate);
			InputStream inputStream = new FileInputStream(pathTemplate);
			
			JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
			JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
			
			Map<String, Object> parameters = new HashMap<String, Object>();
			
			subreportDir = getTemplateReportFilePath(request, PATH_FILE_REPORT, subreportDir);
			parameters.put("SUBREPORT_DIR", subreportDir);
			
			log.debug("====subreportDir====" + subreportDir);
			
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, jrDataSource);
			String pathExport = getTemplateReportFilePath(request, PATH_FILE_EXPORT, tenFile_Export);
			
			log.debug("subreport dir: " + parameters.get("SUBREPORT_DIR"));
			log.debug("====pathExport====" + pathExport);
			
			JasperExportManager.exportReportToPdfFile(jasperPrint, pathExport);
			log.debug("----- END EXPORT SERVER ---" + pathExport);
		} catch (Exception e) {
			log.error("---LOI EXPORT ---" + e);
			e.printStackTrace();
		}
		
	}
	
	public static String exportFunctionDataSourc(
		String realPath, String dirParent, String tenFile_Template, String tenFile_Export, JRDataSource dataSource1, Map<String, Object> parameters) {
		String tenFile = tenFile_Export;
		try {
			String pathTemplate = realPath + PATH_FILE_REPORT + File.separator + dirParent + File.separator + tenFile_Template;
			log.info("====pathTemplate====" + pathTemplate);
			InputStream inputStream = new FileInputStream(pathTemplate);
			
			JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
			JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
			
			log.info("====SUBREPORT_DIR====" + (realPath + PATH_FILE_REPORT + File.separator + dirParent + File.separator));
			
			parameters.put("SUBREPORT_DIR", realPath + PATH_FILE_REPORT + File.separator + dirParent + File.separator);
			parameters.put("IMG_DIR", realPath + PATH_FILE_REPORT + File.separator + "img" + File.separator);
			
			log.info("====IMG_DIR====" + realPath + PATH_FILE_REPORT + File.separator + "img" + File.separator);
			JasperPrint jasperPrint1 = JasperFillManager.fillReport(jasperReport, parameters, dataSource1);
			
			String pathExport = realPath + PATH_FILE_EXPORT + File.separator + tenFile_Export;
			
			log.info("====pathExport====" + pathExport);
			
			JasperExportManager.exportReportToPdfFile(jasperPrint1, pathExport);
			log.info("----- END EXPORT SERVER ---" + pathExport);
		} catch (Exception e) {
			log.info("---LOI EXPORT Return FileName---");
			tenFile = ReportConstant.TEN_FILE_DEFAULT;
			log.info("---LOI EXPORT ---" + e);
			e.printStackTrace();
		}
		
		return tenFile;
	}
	
	public static String exportFunctionTwoDataSourc(
		String realPath, String dirParent, String tenFile_Template, String tenFile_Export, JRDataSource dataSource1, JRDataSource dataSource2,
		Map<String, Object> parameters) {
		String tenFile = tenFile_Export;
		try {
			String pathTemplate = realPath + PATH_FILE_REPORT + File.separator + dirParent + File.separator + tenFile_Template;
			log.info("====pathTemplate====" + pathTemplate);
			InputStream inputStream = new FileInputStream(pathTemplate);
			
			JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
			JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
			
			log.info("====SUBREPORT_DIR====" + (realPath + PATH_FILE_REPORT + File.separator + dirParent + File.separator));
			
			parameters.put("SUBREPORT_DIR", realPath + PATH_FILE_REPORT + File.separator + dirParent + File.separator);
			parameters.put("IMG_DIR", realPath + PATH_FILE_REPORT + File.separator + "img" + File.separator);
			
			log.info("====IMG_DIR====" + realPath + PATH_FILE_REPORT + File.separator + "img" + File.separator);
			JasperPrint jasperPrint1 = JasperFillManager.fillReport(jasperReport, parameters, dataSource1);
			//
			if (dataSource2 != null) {
				
				String pathTemplatePhan2 = realPath + PATH_FILE_REPORT + File.separator + dirParent + File.separator + "xu_ly_ho_so.jrxml";
				parameters.put("SUBREPORT_DIR", realPath + PATH_FILE_REPORT + File.separator + dirParent + File.separator);
				
				inputStream = new FileInputStream(pathTemplatePhan2);
				JasperDesign jasperDesignPhan2 = JRXmlLoader.load(inputStream);
				JasperReport jasperReportPhan2 = JasperCompileManager.compileReport(jasperDesignPhan2);
				
				JasperPrint jasperPrint2 = JasperFillManager.fillReport(jasperReportPhan2, parameters, dataSource2);
				for (JRPrintPage page : jasperPrint2.getPages()) {
					jasperPrint1.addPage(page);
				}
			}
			///
			String pathExport = realPath + PATH_FILE_EXPORT + File.separator + tenFile_Export;
			
			log.info("====pathExport====" + pathExport);
			
			JasperExportManager.exportReportToPdfFile(jasperPrint1, pathExport);
			log.info("----- END EXPORT SERVER ---" + pathExport);
		} catch (Exception e) {
			log.info("---LOI EXPORT Return FileName---");
			tenFile = ReportConstant.TEN_FILE_DEFAULT;
			log.info("---LOI EXPORT ---" + e);
			e.printStackTrace();
		}
		
		return tenFile;
	}
	
	public static String getTenDmDataByCode(String itemCode) {
		String result = "";
		
		if (Validator.isNotNull(itemCode)) {
			try {
				DmDataItem dataItem = DmDataItemLocalServiceUtil.getByCode(itemCode);
				
				if (dataItem != null) {
					result = dataItem.getName();
				}else if(itemCode.equalsIgnoreCase("0")) {
					result = "";
				}else {
					result = itemCode;
				}
			} catch (Exception e) {
				log.error(e);
			}
		}
		
		return result;
	}
	
	public static String getTenDmByGroupIdAndCode(long groupId, String itemCode) {
		String result = "";
		if (groupId > 0 && itemCode != null) {
			try {
				DmDataItem dataItem = DmDataItemLocalServiceUtil.findByGroupIdAndCode(groupId, itemCode);
				if (dataItem != null) {
					result = dataItem.getName();
				} else {
					result = itemCode;
				}
			} catch (Exception e) {
				log.error(e);
			}
		}
		return result;
	}
	
	public static String getTenDmByGroupCodeAndItemCode(String groupCode, String itemCode) {
		String result = "";
		if (groupCode != null && itemCode != null) {
			try {
				DmDataItem dataItem = DmDataItemLocalServiceUtil.getByGroupCodeAndItemCode0(groupCode, itemCode);
				if (dataItem != null) {
					result = dataItem.getName();
				} else {
					result = itemCode;
				}
			} catch (Exception e) {
				log.error(e);
			}
		}
		return result;
	}
	
	public static String getTenDonViKhaoNghiemByCode(String maCode) {
		String result = "";
		if (maCode != null && maCode.trim().length() > 0) {
			DmDataItem ten = DmDataItemLocalServiceUtil.getByCode(maCode);
			if (ten != null) {
				result = ten.getName();
			}
		}
		
		return result;
	}
	
	public static String getTenByID(long idItem) {
		String result = "";
		try {
			
			DmDataItem dmItem = DmDataItemLocalServiceUtil.getDmDataItem(idItem);
			if (dmItem != null) {
				result = dmItem.getName();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static String getTenByIDThanhPhanHoSo(String code) {
		String result = "";
		if (Validator.isNotNull(code)) try {
			QlvtNoiDungThamTra qlvtNoiDungThamTra = QlvtNoiDungThamTraLocalServiceUtil.fetchQlvtNoiDungThamTra(Long.valueOf("0"+code));
			if (Validator.isNotNull(qlvtNoiDungThamTra)) {
				result = qlvtNoiDungThamTra.getMucKiemTra();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
}
