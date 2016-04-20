package vn.dtt.duongbo.utils.document;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.List;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

public class DocumentUtils {

	static Log log = LogFactoryUtil.getLog(DocumentUtils.class);

	public static long uploadTaiLieu(byte[] b, long userIdUpload, String formatFile) {
		String tenUpload = "duong_bo" + System.nanoTime();
		IDocumentStorage iDocumentStorage = new DocumentStorageImpl();
		ResultUpload upload = iDocumentStorage.upload(userIdUpload, b, tenUpload +  parseString(formatFile));
		if (upload != null && upload.getCode().compareTo(DocumentStorageImpl.UPLOAD_OK) == 0) {
			return upload.getFileId();
		}
		return 0;
	}
	
	public static byte[] getByteFromInputStream(InputStream inputStream)
	{
		if (inputStream != null)
		{
			try {
				BufferedInputStream byteArrayInputStream = new BufferedInputStream(
						inputStream);
				ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
				int data = byteArrayInputStream.read();
				while (data != -1) {
					byteArrayOutputStream.write(data);
					data = byteArrayInputStream.read();
				}

				return byteArrayOutputStream.toByteArray();
			}
			catch (Exception e) {
				log.error(e);
			}
		}

		return null;
	}
	
	private static String parseString(String formatFile) {
		try {
			if (formatFile != null && formatFile.trim().length() > 0) {
				String extendFile = formatFile.substring(formatFile.trim().lastIndexOf("."), formatFile.trim().length());
				return extendFile;
			}
		} catch (Exception e) {
			log.error(e);
		}

		return "";
	}
	public static String getLinkDownloadFromNoiLuuTruTaiLieuId(long NoiLuuTruTaiLieuId) {
		IDocumentStorage iDocumentStorage = new DocumentStorageImpl();
		return iDocumentStorage.getURLById(NoiLuuTruTaiLieuId);
	}
	
	public static void writeData(String data, String tenFileDinhKemCaMoRong) {
		try {
			FileWriter fileWriter = new FileWriter("/opt/liferay/data_dinhkem/" + System.currentTimeMillis() +  tenFileDinhKemCaMoRong.replaceAll(".pdf", ".txt"));
			fileWriter.write(data);
			fileWriter.close();
		} catch (Exception e) {
			log.error(e);
		}
	}
	
	public static boolean validateFile(String fileName, byte[] fileBytes, List<String> errors) {

		boolean flag = false;

		String[] validFileExtensions = DEFAULT_FILE_EXTENSIONS;

		// Validate upload file extension
		for (int i = 0; i < validFileExtensions.length; i++) {

			String validExtension = validFileExtensions[i].toLowerCase();

			if (StringUtil.endsWith(fileName, validExtension)) {
				flag = true;
				break;
			}
//			if (!Validator.equals(validExtension, StringPool.STAR)
//					&& StringUtil.endsWith(fileName, validExtension)) {
//				flag = true;
//				break;
//			}
		}
		
		if (!flag && errors != null) {
			errors.add(ERROR_FILE_INVALID_EXTENSION);
		}

		long fileMaxSize = DEFAULT_MAX_SIZE;

		// Validate upload file size
		if (fileBytes != null) {

			if(fileBytes.length > 0 && fileMaxSize > 0 && fileBytes.length > fileMaxSize) {
				flag = false;
				
				if(errors != null) {
					errors.add(ERROR_FILE_MAX_SIZE);
				}
			}
		}

		return flag;
	}
	
	public static final String[] DEFAULT_FILE_EXTENSIONS = { ".doc", ".pdf", ".docx", ".xls", ".xlsx", ".gif", ".png", ".jpeg", ".jpg", ".txt" };
	
	public static final long DEFAULT_MAX_SIZE = 0;	// unlimited
	
	public static final String ERROR_FILE_INVALID_EXTENSION = "ERROR_FILE_INVALID_EXTENSION";
	
	public static final String ERROR_FILE_MAX_SIZE = "ERROR_FILE_MAX_SIZE";
}
