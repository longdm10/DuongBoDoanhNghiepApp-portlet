/**
 * 
 */
package vn.dtt.duongbo.utils;

import java.io.File;
import java.io.IOException;

import javax.mail.internet.InternetAddress;

import com.liferay.mail.service.MailServiceUtil;
import com.liferay.portal.kernel.mail.MailMessage;

public class DoanhNghiepSentEmailUtils {
	
	/**
	 * 
	 * @param from
	 * @param to
	 * @param subject
	 * @param body
	 * @param htmlFormat
	 * @return
	 * @throws IOException
	 */
	public static boolean sendEmail(String from, String to, String subject,
			String body, boolean htmlFormat) {
		try {
			if (from.trim().length() > 0 && to.trim().length() > 0) {
				MailMessage mailMessage = new MailMessage(new InternetAddress(from), new InternetAddress(to), subject, body,htmlFormat);
				MailServiceUtil.sendEmail(mailMessage);
				return true;
			} else {
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static boolean sendEmailAttachFile(String from, String to,
			String subject, String body, boolean htmlFormat, File file,
			String outputFileName) throws IOException {

		try {
			if (from.trim().length() > 0 && to.trim().length() > 0) {
				MailMessage mailMessage = new MailMessage(new InternetAddress(
						from), new InternetAddress(to), subject, body,
						htmlFormat);
				try {
					mailMessage.addFileAttachment(file, outputFileName);
				} catch (Exception e) {
					e.printStackTrace();
					//LogFactoryMOC.getLog(SentEmailUtils.class).error(e.toString());
				}

				MailServiceUtil.sendEmail(mailMessage);

				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
			//LogFactoryMOC.getLog(SentEmailUtils.class).error(e.toString());
		}
		return false;
	}
}