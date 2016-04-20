package vn.dtt.duongbo.utils;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Arrays;
import java.util.List;

import javax.imageio.ImageIO;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import vgca.svrsigner.ServerSigner;
import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.duongbo.report.ReportUtils;
import vn.dtt.duongbo.utils.config.DuongBoConfigurationManager;

import com.itextpdf.text.Rectangle;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.util.Base64;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.User;
import com.liferay.portal.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.security.permission.PermissionThreadLocal;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;

public class SignatureUtil {
	public static Log log = LogFactoryUtil.getLog(SignatureUtil.class);
	
	public static void genComputerHashByNoiDungHoSo(ResourceRequest request, ResourceResponse response, String filePath, String roleType) throws IOException {
		log.info("------getComputerHash-----");
		long userId = PortalUtil.getUserId(request);
		byte[] inHash = null;

		String fieldName = StringPool.BLANK;
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();

		JSONArray hashComputers = JSONFactoryUtil.getJSONFactory().createJSONArray();
		JSONArray signFieldNames = JSONFactoryUtil.getJSONFactory().createJSONArray();
		JSONArray filePaths = JSONFactoryUtil.getJSONFactory().createJSONArray();
		JSONArray messages = JSONFactoryUtil.getJSONFactory().createJSONArray();
		
		try{
			//String realExportPathTmp = request.getContextPath();
			
			String realPath = ReportUtils.getTemplateReportFilePath(request);
			String realExportPath = realPath + "chuky/";
			
			String imageBase64 = StringPool.BLANK;
			String email = "nhan.nguyen@dtt.vn";
			String cerPath = realExportPath +  email + ".cer";
			String signImagePath = "";
			signImagePath = realExportPath + "maucondau_cuc_mtyt.png";
			
			log.info("***************************cerPath: "+ cerPath);
			log.info("***************************signImagePath: "+ signImagePath);
			
			imageBase64 = SignatureUtil.getSignatureImageBase64ByPath(signImagePath);
			
			BufferedImage bufferedImage = SignatureUtil.getImageByPath(signImagePath);
			
//			String urlFile = StringPool.BLANK;
//			
//			urlFile = PortalUtil.getPortalURL(request);
//
//			urlFile = urlFile + DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(noidungHoSo.getTaiLieuDinhKem());
			
			log.info("***************************urlFile: "+ filePath);

			//tinh toa do chu ky
			ExtractTextLocations textLocation = new ExtractTextLocations(filePath);
				
			log.info("*********************************"+ textLocation.getAnchorX()+ "-"+ textLocation.getAnchorY()+"********************************");

			log.info("*********************************"+ textLocation.getPageLLX()+ "-"+ textLocation.getPageURX()+ "-"+ textLocation.getPageLLY()+ "-"+ textLocation.getPageURY()+ "*******************************");
			
			//doc file cer tren server
			Certificate cert = SignatureUtil.getCertificateByPath(cerPath);
			ServerSigner signer = SignatureUtil.getServerSigner(filePath, cert, imageBase64);
			
			
			log.info("***************************signer: "+ signer +"*******filePath:"+filePath);
			
			//tinh kich thuoc cua anh
			
			int signatureImageWidth = (bufferedImage != null && bufferedImage.getWidth() > 0) ? bufferedImage.getWidth() : 80;
			
			int signatureImageHeight = (bufferedImage != null && bufferedImage.getHeight() > 0) ? bufferedImage.getHeight() : 80;
			float llx = textLocation.getAnchorX();
			
			float urx = llx + signatureImageWidth/3;
			
			float lly = textLocation.getPageURY() - textLocation.getAnchorY() - signatureImageHeight/3;
			
			float ury = lly + signatureImageHeight/3;
			
		
			
			inHash = signer.computeHash(new Rectangle(llx, lly - 35, urx, ury-20), 1);
			
			
			fieldName = signer.getSignatureName();
			signFieldNames.put(fieldName);
			hashComputers.put(Base64.encode(inHash));
			filePaths.put(filePath);
			log.info("**************inHash: "+ inHash+ "-----------fieldName: "+ fieldName+"----------filePath: "+ filePath);
			messages.put("success"); 
		} catch (Exception e) {
			messages.put("Error signature filePath: " + filePath);
			hashComputers.put(StringPool.BLANK);
			signFieldNames.put(StringPool.BLANK);
			filePaths.put(filePath);
			log.error(e);
		}

		jsonFeed.put("hashComputers", hashComputers);
		jsonFeed.put("signFieldNames", signFieldNames);
		jsonFeed.put("filePaths", filePaths);
		jsonFeed.put("msg", messages);

		PrintWriter out = response.getWriter();
		out.print(jsonFeed.toString());
	}
	
	public static String makeReportFille(ResourceRequest request, String hoSoThuTucId, long phieuXuLyId, String idThuTucHanhChinh)
			throws SystemException, Exception, PortalException {
		String fileName = "";
		String urlFile = "";
		long userId = PortalUtil.getUserId(request);
		TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(Long.parseLong(hoSoThuTucId));

//		thongTinDangKy thongTinDangKy = ThongTinDangKyLocalServiceUtil.findByPhieuXuLyId(phieuXuLyId).get(0);
//		ThongTinXuLy thongTinXuLy = ThongTinXuLyLocalServiceUtil.findByThongTinDangKyId(thongTinDangKy.getId()).get(0);
//		
//		DmDataItem itemBieuMau = null;
//		String ketQua = "";

//		
//		if (thongTinXuLy != null) {
//			ketQua = thongTinXuLy.getKetQuaDuyet();
//			if ((ketQua == null ) || (ketQua != null && ketQua.trim().length() == 0)) {
//				ketQua = thongTinXuLy.getKetQuaThamTra();
//			}
//			if (ketQua != null && ketQua.trim().length() > 0) {
//				itemBieuMau = DmDataItemLocalServiceUtil.fetchDmDataItem(Long.parseLong(ketQua.trim()));
//			}
//		}
//		
//		TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(Long.parseLong(idThuTucHanhChinh));
//		
//		TthcBieuMauHoSo bieuMauHoSo = TthcBieuMauHoSoLocalServiceUtil.findByMaBieuMau(itemBieuMau.getNode4());
//		List<TthcThanhPhanHoSoBieuMau> allThanhPhanHoSoBieuMau = TthcThanhPhanHoSoBieuMauLocalServiceUtil.findByBieuMauHoSoId(bieuMauHoSo.getId());
//		List<TthcThanhPhanHoSo> allThanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.findByThuTucHanhChinhId(Long.parseLong(idThuTucHanhChinh));
//		TthcThanhPhanHoSo thanhPhanHoSo = null;
//		if(allThanhPhanHoSoBieuMau != null && allThanhPhanHoSoBieuMau.size() > 0){
//			for (int i = 0; i < allThanhPhanHoSoBieuMau.size(); i++) {
//				for (int j = 0; j < allThanhPhanHoSo.size(); j++) {
//					if(allThanhPhanHoSo.get(j).getId() == allThanhPhanHoSoBieuMau.get(i).getId()){
//						thanhPhanHoSo = allThanhPhanHoSo.get(j);
//						break;
//					}
//				}
//				if(thanhPhanHoSo != null){
//					break;
//				}
//			}
//		}
//		
//		if( !Arrays.asList(Constants.DIEU_KIEN_DICH_CHUYEN_KHONG_CO_BIEU_MAU).contains(itemBieuMau.getNode4().trim())) {
//			log.info("-------vao DIEU_KIEN_DICH_CHUYEN_KHONG_CO_BIEU_MAU");
//			String realPath = ReportUtils.getTemplateReportFilePath(request.getPortletSession());
//			
//			String tenFileExport = "";
//			
//			if( !Arrays.asList(Constants.DIEU_KIEN_DICH_CHUYEN_TRA_KET_QUA).contains(itemBieuMau.getNode4().trim())){
//				log.info("-------vao DIEU_KIEN_DICH_CHUYEN_TRA_KET_QUA");
//				if(thuTucHanhChinh .getId()==11 ||thuTucHanhChinh.getId()==12){
//					Object obj = ReportBusinessUtils.getXuLyHoSoCommonForTTDK(Long.parseLong(hoSoThuTucId), thuTucHanhChinh, itemBieuMau,Constants.MTYT_LANHDAOCUC,userId);
//		
//					fileName = ReportBusinessUtils.actionExportMauDonCanBo(realPath, Long.parseLong(hoSoThuTucId), thongTinXuLy.getId(), itemBieuMau, obj);
//					
//					if (fileName.equalsIgnoreCase(ReportBusinessUtils.FILE_NAME_NULL) == false) {
//						tenFileExport = fileName;
//					}
//				} else {
//					User user = PortalUtil.getUser(request);
//					long organizationId = 0;
//					if (user.getOrganizations().size() > 0) {
//						organizationId = user.getOrganizations().get(0).getOrganizationId();
//					}
//					XuLyHoSo xuLyHoSo = ReportBusinessUtils.getXuLyHoSoDetailForTTDK(user.getFullName(), organizationId, thuTucHanhChinh, thongTinDangKy);
//					if(xuLyHoSo != null ){
//						List<XuLyHoSo.ChiTietTinhTrangHoSo> allChiTiet = xuLyHoSo.getChiTietTinhTrangHoSo();
//					} else{
//						log.info("-------xuLyHoSoPdf null----------");
//					}
//					
//					Object obj = ReportBusinessUtils.getXuLyHoSoCommonForTTDK(Long.parseLong(hoSoThuTucId), thuTucHanhChinh, itemBieuMau,Constants.MTYT_LANHDAOCUC,userId);
//				
//					fileName = ReportBusinessUtils.actionExportMauDonCanBoFrom2Obj(realPath, Long.parseLong(hoSoThuTucId), thongTinXuLy.getId(), itemBieuMau, obj, xuLyHoSo);
//					
//					if (fileName.equalsIgnoreCase(ReportBusinessUtils.FILE_NAME_NULL) == false) {
//						tenFileExport = fileName;
//					}
//				
//				}
//				urlFile = realPath + "/export/" + tenFileExport;
//				log.info("--------------urlFile=" + urlFile);
//			} else{
//				log.info("-------vao else ----DIEU_KIEN_DICH_CHUYEN_TRA_KET_QUA---"+hoSoThuTuc.getDoanhNghiepId());
//				Object obj = ReportBusinessUtils.getXuLyHoSoCommonForTTDK(Long.parseLong(hoSoThuTucId), thuTucHanhChinh, itemBieuMau,Constants.MTYT_LANHDAOCUC,userId);
//				
//				fileName = ReportBusinessUtils.actionExportMauDonCanBo(realPath, Long.parseLong(hoSoThuTucId), thongTinXuLy.getId(), itemBieuMau, obj);
//				
//				if (fileName.equalsIgnoreCase(ReportBusinessUtils.FILE_NAME_NULL) == false) {
//					tenFileExport = fileName;
//				}
//				urlFile = realPath + "/export/" + tenFileExport;
//				log.info("--------------urlFile=" + urlFile);
//				log.info("--------------hoSoThuTucId===============" + hoSoThuTucId);
//			}
//			log.info("-End-instanceof---");
//		}
		return urlFile;
	}

	public static Certificate getCertificateByPath(String path)
			throws CertificateException, FileNotFoundException,
			URISyntaxException {
		CertificateFactory cf = CertificateFactory.getInstance("X.509");

		Certificate cert = cf.generateCertificate(new FileInputStream(new File(
				path)));

		return cert;
	}

	public static Certificate getCertificateByURL(String url)
			throws CertificateException, FileNotFoundException,
			URISyntaxException {
		CertificateFactory cf = CertificateFactory.getInstance("X.509");

		Certificate cert = cf.generateCertificate(new FileInputStream(new File(
				new URI(url))));

		return cert;
	}

	public static ServerSigner getServerSigner(String fullPath,
			Certificate cert, String imageBase64) {
		ServerSigner signer = new ServerSigner(fullPath, cert);
		signer.setSignatureGraphic(imageBase64);
		return signer;
	}

	public static String getSignatureImageBase64(String url) {

		String base64 = StringPool.BLANK;

		InputStream is = null;

		ByteArrayOutputStream os = null;

		try {
			is = new URL(url).openStream();
			os = new ByteArrayOutputStream();

			byte[] buffer = new byte[1024];

			byte[] imageBuff = null;

			int length;

			while ((length = is.read(buffer)) != -1)
				os.write(buffer, 0, length); // copy streams

			imageBuff = os.toByteArray();

			base64 = Base64.encode(imageBuff);

		} catch (Exception e) {
			_log.error(e);
		} finally {
			try {
				if (is != null) {
					is.close();
				}
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				_log.error(e);
			}
		}
		return base64;
	}

	public static String getSignatureImageBase64ByPath(String fullPath) {

		String base64 = StringPool.BLANK;

		InputStream is = null;

		ByteArrayOutputStream os = null;

		try {
			is = new FileInputStream(new File(fullPath));
			os = new ByteArrayOutputStream();

			byte[] buffer = new byte[1024];

			byte[] imageBuff = null;

			int length;

			while ((length = is.read(buffer)) != -1)
				os.write(buffer, 0, length); // copy streams

			imageBuff = os.toByteArray();

			base64 = Base64.encode(imageBuff);

		} catch (Exception e) {
			_log.error(e);
		} finally {
			try {
				if (is != null) {
					is.close();
				}
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				_log.error(e);
			}
		}
		return base64;
	}

	public static BufferedImage getImage(String url) throws IOException,
			URISyntaxException {
		InputStream is = null;
		BufferedImage bimg = null;
		try {
			is = new URL(url).openStream();
			bimg = ImageIO.read(is);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			if (is != null) {
				is.close();
			}
		}

		return bimg;
	}

	public static BufferedImage getImageByPath(String fullPath)
			throws IOException, URISyntaxException {
		InputStream is = null;
		BufferedImage bimg = null;
		try {
			is = new FileInputStream(new File(fullPath));
			bimg = ImageIO.read(is);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			if (is != null) {
				is.close();
			}
		}

		return bimg;
	}

	public static String saveAsPdf(String dest,  long fileId) throws IOException {
		// BufferedImage image = null;
		InputStream is = null;
		OutputStream os = null;
		String imagePath = StringPool.BLANK;
		try {

			// URL url = new URL(strURL);
			// image = ImageIO.read(url);
			//is = new URL(strURL).openStream();
			FileEntry fileEntry =getFileEntry(fileId);
			if(fileEntry==null) return null;
			//is = getInputStreamByFileEntryId(fileId);
			is =fileEntry.getContentStream();
			// image = ImageIO.read(is);
			imagePath = dest +"/"+ fileEntry.getTitle() ;
			// ImageIO.write(image, ext, new File(fileName));

			os = new FileOutputStream(imagePath);

			byte[] b = new byte[1024];
			int length;

			while ((length = is.read(b)) != -1) {
				os.write(b, 0, length);
			}

		} catch (Exception e) {
			
			_log.error(e);
		} finally {
			if (is != null) {
				is.close();
			}
			if (os != null) {
				os.close();
			}
		}
		return imagePath;
	}

	public static String saveAsImage(String strURL, String dest, String email,
			String ext, long fileId) throws IOException {
		// BufferedImage image = null;
		InputStream is = null;
		OutputStream os = null;
		String imagePath = StringPool.BLANK;
		try {

			// URL url = new URL(strURL);
			// image = ImageIO.read(url);
			//is = new URL(strURL).openStream();
			is = getInputStreamByFileEntryId(fileId);
			// image = ImageIO.read(is);
			imagePath = dest + email + "." + ext;
			// ImageIO.write(image, ext, new File(fileName));

			os = new FileOutputStream(imagePath);

			byte[] b = new byte[1024];
			int length;

			while ((length = is.read(b)) != -1) {
				os.write(b, 0, length);
			}

		} catch (IOException e) {
			_log.error(e);
		} finally {
			if (is != null) {
				is.close();
			}
			if (os != null) {
				os.close();
			}
		}
		return imagePath;
	}

	public static FileEntry getFileEntry(long fileEnTryId) {
		FileEntry fileEntry = null;

		try {
			  long userId = DuongBoConfigurationManager.getLongProp("id_admin", 10196L);
//			long userId = 10198;
			// LogFactoryMOC.getLog(DocumentUtils.class).debug("===Starting check permission============userId======="
			// + userId);
			User user = UserLocalServiceUtil.getUserById(userId);

			PermissionThreadLocal
					.setPermissionChecker(PermissionCheckerFactoryUtil.create(
							user, true));
			 fileEntry = DLAppLocalServiceUtil
					.getFileEntry(fileEnTryId);

			//inputStream = fileEntry.getContentStream();
		} catch (Exception e) {
			e.printStackTrace();
			// LogFactoryMOC.getLog(DocumentUtils.class).error(e);
		}

		// LogFactoryMOC.getLog(DocumentUtils.class).debug("===== getInputStreamByFileEntryId return inputStream :::"
		// + inputStream);
		return fileEntry;
	}
	public static InputStream getInputStreamByFileEntryId(long fileEnTryId) {
		InputStream inputStream = null;

		try {
			  long userId = DuongBoConfigurationManager.getLongProp("id_admin", 10196L);
			User user = UserLocalServiceUtil.getUserById(userId);

			PermissionThreadLocal
					.setPermissionChecker(PermissionCheckerFactoryUtil.create(
							user, true));
			FileEntry fileEntry = DLAppLocalServiceUtil
					.getFileEntry(fileEnTryId);

			inputStream = fileEntry.getContentStream();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return inputStream;
	}

	private static Log _log = LogFactoryUtil.getLog(SignatureUtil.class);
}
