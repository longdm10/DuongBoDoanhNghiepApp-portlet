
package vn.dtt.duongbo.utils.format;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import vn.dtt.duongbo.utils.config.DuongBoConfigurationManager;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class DateUtils {
	
	private static Log log = LogFactoryUtil.getLog(DateUtils.class);
	
	public static final String CURRENT_TIME_STAMP = new Date().getTime() + "";
	
	static SimpleDateFormat formatDDMMYYYY = new SimpleDateFormat("dd/MM/yyyy");
	
	private static final String NGAY = DuongBoConfigurationManager.getStrProp("vn.dk.label.report.ngay", "ngay");
	private static final String THANG = DuongBoConfigurationManager.getStrProp("vn.dk.label.report.thang", "thang");
	private static final String NAM = DuongBoConfigurationManager.getStrProp("vn.dk.label.report.nam", "nam");
	
	public static String getCurrentDate(Date date) {
		if (Validator.isNotNull(date)) {
			try {
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(date);
				int day = calendar.get(Calendar.DAY_OF_MONTH);
				String sDay = "";
				if (day < 10) {
					sDay = "0" + day;
				} else {
					sDay = day + "";
				}
				
				int month = calendar.get(Calendar.MONTH) + 1;
				String sMonth = "";
				if (month < 10) {
					sMonth = "0" + month;
				} else {
					sMonth = month + "";
				}
				
				int year = calendar.get(Calendar.YEAR);
				return NGAY + " " + sDay + " " + THANG + " " + sMonth + " " + NAM + " " + year;
			} catch (Exception e) {
				log.error(e);
			}
		}
		return "";
	}
	
	public static String dateToString(String format, Date date) { // lay ra ngay, thang, nam, gio, phu, giay hien tai
		String stringResult = "";
		SimpleDateFormat sdf = null;
		try {
			sdf = new SimpleDateFormat(format);
			stringResult = sdf.format(date);
		} catch (Exception e) {
			stringResult = "";
		}
		return stringResult;
	}
	
	public static Date stringToDate(String sDate, String format) {
		Date result = null;
		SimpleDateFormat sdf = null;
		try {
			sdf = new SimpleDateFormat(format);
			result = sdf.parse(sDate);
		} catch (Exception e) {
		}
		return result;
	}
	
	public static boolean isDate(String sDate, String format) {
		SimpleDateFormat sdf = null;
		try {
			sdf = new SimpleDateFormat(format);
			sdf.parse(sDate);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static String getDateAfterNumberDay(int soNgayAfterCurrentDay) {
		try {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(new Date());
			calendar.add(Calendar.DAY_OF_YEAR, soNgayAfterCurrentDay);
			
			return dateToString("dd/MM/yyyy", calendar.getTime());
		} catch (Exception e) {
			
		}
		return "";
	}
	
	public static Date addTime(Date date, int hour, int minutes, int second) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, hour);
		calendar.set(Calendar.MINUTE, minutes);
		calendar.set(Calendar.SECOND, second);
		
		return calendar.getTime();
	}
	
	public static Date getMaxDayOfMonth(Date date, int hour, int minutes, int second) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(addTime(date, hour, minutes, second));
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		return calendar.getTime();
	}
	
	public static Date getMinDayOfMonth(Date date, int hour, int minutes, int second) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(addTime(date, hour, minutes, second));
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
		
		return calendar.getTime();
	}
	
	public static Date addYear(Date date, int yearNumber) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		calendar.add(Calendar.YEAR, yearNumber);
		
		return calendar.getTime();
	}
	
	public static String addDays(Date date, int soNgay) {
		try {
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			calendar.add(Calendar.DAY_OF_YEAR, soNgay);
			
			return dateToString("dd/MM/yyyy", calendar.getTime());
		} catch (Exception e) {
			
		}
		return "";
	}
	
	public static String parseDateToTringDDMMYYY(Date date) {
		try {
			return formatDDMMYYYY.format(date);
		} catch (Exception e) {
		}
		
		return "";
	}
	
	public static String getEndOfDate(Date date) { // lay ra ngay co time dd/mm/yyyy 23:59:59
		String result = FormatData.parseDateToTringYYYYMMDD(date);
		result = result + " 23:59:59";
		return result;
	}
}
