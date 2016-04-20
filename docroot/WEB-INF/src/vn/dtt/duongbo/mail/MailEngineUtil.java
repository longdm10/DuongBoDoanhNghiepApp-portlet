
package vn.dtt.duongbo.mail;

import com.liferay.mail.service.MailServiceUtil;
import com.liferay.portal.kernel.io.unsync.UnsyncStringWriter;
import com.liferay.portal.kernel.mail.MailMessage;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;

import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Map;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;

public class MailEngineUtil {

	/**
	 * Ham doc noi dung cua email template
	 * 
	 * @param input
	 * @param variables
	 * @return
	 * @throws Exception
	 */
	public static String getContent(String input,
			Map<String, Object> variables) throws Exception {

		VelocityEngine velocityEngine = new VelocityEngine();

		velocityEngine.setProperty(
				RuntimeConstants.RUNTIME_LOG_LOGSYSTEM_CLASS,
				PropsUtil.get(PropsKeys.VELOCITY_ENGINE_LOGGER));

		velocityEngine.setProperty(RuntimeConstants.RUNTIME_LOG_LOGSYSTEM
				+ ".log4j.category",
				PropsUtil.get(PropsKeys.VELOCITY_ENGINE_LOGGER_CATEGORY));

		velocityEngine.init();

		VelocityContext velocityContext = new VelocityContext();

		if (variables != null) {
			Iterator<Map.Entry<String, Object>> itr = variables.entrySet()
					.iterator();

			while (itr.hasNext()) {
				Map.Entry<String, Object> entry = itr.next();

				String key = entry.getKey();
				Object value = entry.getValue();

				if (Validator.isNotNull(key)) {
					velocityContext.put(key, value);
				}
			}
		}

		UnsyncStringWriter unsyncStringWriter = new UnsyncStringWriter();

		velocityEngine.evaluate(velocityContext, unsyncStringWriter,
			MailEngineUtil.class.getName(), input);

		return unsyncStringWriter.toString();
	}
	
	public static void send(String[] toEmails, String[] ccEmails,
			String fromEmail, String fromName, String subject, String mailMsg)
		throws UnsupportedEncodingException, AddressException {
		
		InternetAddress[] toList = new InternetAddress[toEmails.length];
		
		for (int i = 0; i < toEmails.length; i++) {
			toList[i] = new InternetAddress(toEmails[i]);
		}
		
		InternetAddress[] ccList = new InternetAddress[ccEmails.length];
		
		for (int i = 0; i < ccEmails.length; i++) {
			ccList[i] = new InternetAddress(ccEmails[i]);
		}
		
		InternetAddress from = new InternetAddress(fromEmail, fromName);

		MailMessage mailMessage = new MailMessage();

		mailMessage.setTo(toList);

		mailMessage.setCC(ccList);

		mailMessage.setFrom(from);

		mailMessage.setSubject(subject);

		mailMessage.setBody(mailMsg);

		mailMessage.setHTMLFormat(true);

		MailServiceUtil.sendEmail(mailMessage);
	}

	public static void send(String[] toEmails, String fromEmail,
			String fromName, String subject, String mailMsg)
		throws UnsupportedEncodingException, AddressException {
		
		InternetAddress[] toList = new InternetAddress[toEmails.length];
		
		for (int i = 0; i < toEmails.length; i++) {
			toList[i] = new InternetAddress(toEmails[i]);
		}
		
		InternetAddress from = new InternetAddress(fromEmail, fromName);

		MailMessage mailMessage = new MailMessage();

		mailMessage.setTo(toList);

		mailMessage.setFrom(from);

		mailMessage.setSubject(subject);

		mailMessage.setBody(mailMsg);

		mailMessage.setHTMLFormat(true);

		MailServiceUtil.sendEmail(mailMessage);
	}

	public static void send(String toEmail, String ccEmail, String fromEmail,
			String fromName, String subject, String mailMsg)
		throws UnsupportedEncodingException, AddressException {
		
		InternetAddress to = new InternetAddress(toEmail);

		InternetAddress cc = new InternetAddress(ccEmail);

		InternetAddress from = new InternetAddress(fromEmail, fromName);

		MailMessage mailMessage = new MailMessage();

		mailMessage.setTo(to);

		mailMessage.setCC(cc);

		mailMessage.setFrom(from);

		mailMessage.setSubject(subject);

		mailMessage.setBody(mailMsg);

		mailMessage.setHTMLFormat(true);

		MailServiceUtil.sendEmail(mailMessage);
	}

	public static void send(String toEmail, String fromEmail, String fromName,
			String subject, String mailMsg)
		throws UnsupportedEncodingException, AddressException {
		
		InternetAddress to = new InternetAddress(toEmail);

		InternetAddress from = new InternetAddress(fromEmail, fromName);

		MailMessage mailMessage = new MailMessage();

		mailMessage.setTo(to);

		mailMessage.setFrom(from);

		mailMessage.setSubject(subject);

		mailMessage.setBody(mailMsg);

		mailMessage.setHTMLFormat(true);

		MailServiceUtil.sendEmail(mailMessage);
	}
}
