
package vn.dtt.duongbo.utils;

import java.util.Date;
import java.util.List;

import vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo;
import vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep;
import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser;
import vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepImpl;
import vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil;
import vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepUserLocalServiceUtil;
import vn.dtt.duongbo.maudon.xml.MauDonFactory;
import vn.dtt.duongbo.utils.config.DuongBoConfigurationManager;
import vn.dtt.duongbo.utils.format.ConvertUtil;
import vn.dtt.duongbo.utils.format.FormatData;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class DoanhNghiepUtils {
	
	private static Log log = LogFactoryUtil.getLog(DoanhNghiepUtils.class);
	
	public static List<Object> getXmlByHoSoThuTucId(long hoSothutucId) {
		try {
			log.info("getXmlByHoSoThuTucId"+hoSothutucId);
			List<TthcNoidungHoSo> allNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.findByHoSoThuTucId(hoSothutucId);
			String noiDungXml = "";
			if (allNoidungHoSo != null && allNoidungHoSo.size() > 0) {
				for (TthcNoidungHoSo tthcNoidungHoSo : allNoidungHoSo) {
					noiDungXml = tthcNoidungHoSo.getNoiDungXml();
					if (noiDungXml != null && noiDungXml.trim().length() > 0) {
						return MauDonFactory.converXMLMessagesContentToObject(tthcNoidungHoSo.getNoiDungXml());
					}
				}
				
			}
			
		} catch (Exception e) {
		}
		
		return null;
	}
	
	public static synchronized String generateMaSoHoSo(String soDangKyKinhDoanh) {
		String maxMaSoHoSo = TthcHoSoThuTucLocalServiceUtil.maxMaSoHoSo(soDangKyKinhDoanh + "_");
		if (maxMaSoHoSo == null || maxMaSoHoSo.trim().length() == 0) {
			return createMaSoHoSo(1, soDangKyKinhDoanh);
		} else {
			String[] data = maxMaSoHoSo.split("_");
			if (data != null && data.length > 0) { return createMaSoHoSo(ConvertUtil.convertToInt(data[1]) + 1, soDangKyKinhDoanh); }
		}
		
		return createMaSoHoSo(1, soDangKyKinhDoanh);
	}
	
	private static synchronized String createMaSoHoSo(int number, String soDangKyKinhDoanh) {
		int count = 4 - String.valueOf(number).length();
		
		StringBuilder maSoHoSo = new StringBuilder(soDangKyKinhDoanh).append("_");
		for (int i = 1; i <= count; i++) {
			maSoHoSo.append("0");
		}
		maSoHoSo.append(number);
		
		return maSoHoSo.toString();
	}
	
	/*	
	public static synchronized String generateGPDangKyLuuHanh() {
		Date date = new Date();
		String maxMaSoHoSo = GpDangKyLuuHanhLocalServiceUtil.maxGPDangKyLuuHanh(date);
		if (maxMaSoHoSo == null || maxMaSoHoSo.trim().length() == 0) {
			return createGPDangKyLuuHanh(1, date);
		}

		return createGPDangKyLuuHanh(ConvertUtil.convertToInt(maxMaSoHoSo.replaceAll(FormatData.getGPDangKyLuuHanh(date), "")) + 1, date);
	}
	*/
	
	private static synchronized String createGPDangKyLuuHanh(int number, Date date) {
		int count = 3 - String.valueOf(number).length();
		
		StringBuilder maSoHoSo = new StringBuilder(DuongBoConfigurationManager.getStrProp("sufix.gp.dangkyluuhanh.mtyt", "VND-HC-"));
		for (int i = 1; i <= count; i++) {
			maSoHoSo.append("0");
		}
		maSoHoSo.append(number).append(FormatData.getGPDangKyLuuHanh(date));
		
		return maSoHoSo.toString();
	}
	
	/*	
	public static synchronized String generateSoGiayChungNhan() {
		Date date = new Date();
		String maxMaSoHoSo = GpDangKyLuuHanhLocalServiceUtil.maxSoGiayChungNhan(date);
		if (maxMaSoHoSo == null || maxMaSoHoSo.trim().length() == 0) {
			return createSoGiayChungNhan(1, date);
		}

		return createSoGiayChungNhan(ConvertUtil.convertToInt(maxMaSoHoSo.replaceAll(FormatData.getSoGiayChungNhan(date) + YTeConfigurationManager.getStrProp("sufix.gp.sogiaychungnhan.mtyt", "/GCN"), "")) + 1, date);
	}

	private static synchronized String createSoGiayChungNhan(int number, Date date) {
		int count = 3 - String.valueOf(number).length();

		StringBuilder maSoHoSo = new StringBuilder(); 
		for (int i = 1; i <= count ; i++) {
			maSoHoSo.append("0");
		}
		maSoHoSo.append(number).append(FormatData.getSoGiayChungNhan(date));
		maSoHoSo.append(YTeConfigurationManager.getStrProp("sufix.gp.sogiaychungnhan.mtyt", "/GCN"));

		return maSoHoSo.toString();
	}
		
	*/
	
	public static DnDoanhNghiep getDoanhNghiepByUserId(long userId) {
		DnDoanhNghiep doanhNghiep = null;
		try {
			DnDoanhNghiepUser doanhNghiepUser = DnDoanhNghiepUserLocalServiceUtil.findByUserId(userId);
			if (doanhNghiepUser != null) {
				doanhNghiep = DnDoanhNghiepLocalServiceUtil.fetchDnDoanhNghiep(doanhNghiepUser.getNguoiLamThuTucId());
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e);
		}
		if (Validator.isNull(doanhNghiep)) {
			doanhNghiep = new DnDoanhNghiepImpl();
		}
		return doanhNghiep;
	}
	
	public static String getMoney(String money) {
		String tmp = "---";
		if (money != null && !money.equalsIgnoreCase("")) {
			tmp = money;
			int count = 0;
			for (int i = tmp.length() - 1; i >= 0; i--) {
				if (++count == 3) {
					count = 0;
					if (i > 0) {
						tmp = tmp.substring(0, i) + "." + tmp.substring(i);
					}
				}
			}
		}
		return tmp + " VND";
	}
	
}
