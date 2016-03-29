
package vn.dtt.duongthuy.business;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletRequest;

import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.dao.common.model.DmDataItem;
import vn.dtt.duongbo.dao.common.model.TthcDonViThucHien;
import vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo;
import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo;
import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau;
import vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh;
import vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcDoiTuongThucHienLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcDonViThucHienLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoBieuMauLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil;
import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep;
import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser;
import vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil;
import vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepUserLocalServiceUtil;
import vn.dtt.duongthuy.maudon.DonOnline;
import vn.dtt.duongthuy.maudon.model.DonDTTPHS101;
import vn.dtt.duongthuy.maudon.model.DonDTTPHS112;
import vn.dtt.duongthuy.maudon.model.DonDTTPHS69;
import vn.dtt.duongthuy.maudon.model.DonDTTPHS76;
import vn.dtt.duongthuy.maudon.model.DonDTTPHS83;
import vn.dtt.duongthuy.maudon.model.DonDTTPHS90;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

public class DuongThuyUtil {
	
	private static final Log _log = LogFactoryUtil.getLog(DuongThuyUtil.class);
	
	public static String renderInput(String portletNamespace, String name,
			String style, Map<String, String> mValue,
			Map<String, String> mRequired) {
		
		if(mValue == null) {
			mValue = new HashMap<String, String>();
		}
		
		if(mRequired == null) {
			mRequired = new HashMap<String, String>();
		}
		
		StringBuilder sbHtml = new StringBuilder();
		
		sbHtml.append("<input type='text' name='");
		
		sbHtml.append(portletNamespace);
		sbHtml.append(name);
		sbHtml.append("' ");
		
		sbHtml.append(" id='");
		sbHtml.append(portletNamespace);
		sbHtml.append(name);
		sbHtml.append("' ");
		
		sbHtml.append(" value='");
		sbHtml.append(GetterUtil.getString(mValue.get(name)));
		sbHtml.append("' ");
		
		if(Validator.isNotNull(style)) {
			sbHtml.append(" class='");
			sbHtml.append(style);
			sbHtml.append(" ");
			sbHtml.append(GetterUtil.getString(mRequired.get(name)));
			sbHtml.append("' ");
		}
		
		sbHtml.append("/> ");
		
		return sbHtml.toString();
	}
	
	public static String renderRadio(String portletNamespace, String name, String id, String style, String text,
			String value, String selectedValue) {
		
		StringBuilder sbHtml = new StringBuilder();
		
		sbHtml.append("<input type='radio' name='");
		sbHtml.append(portletNamespace);
		sbHtml.append(name);
		sbHtml.append("' ");
		
		if(Validator.isNotNull(id)) {
			sbHtml.append(" id='");
			sbHtml.append(portletNamespace);
			sbHtml.append(id);
			sbHtml.append("' ");
		}
		
		sbHtml.append(" value='");
		sbHtml.append(value);
		sbHtml.append("' ");
		
		sbHtml.append(" data-text='");
		sbHtml.append(text);
		sbHtml.append("' ");
		
		if(Validator.isNotNull(style)) {
			sbHtml.append(" class='");
			sbHtml.append(style);
			sbHtml.append("' ");
		}
		
		if(value.equalsIgnoreCase(selectedValue)) {
			sbHtml.append(" checked");
		}
		
		sbHtml.append("/> ");
		sbHtml.append(text);
		
		return sbHtml.toString();
	}
	
	/**
	 * Ham render du lieu danh muc chung ra combobox
	 * 
	 * @param selectedValue
	 * @param defaultValue
	 * @param defaulCaption
	 * @param comboboxName
	 * @param comboboxId
	 * @param style
	 * @param dataGroupCode
	 * @return
	 */
	public static String renderDanhMucCombobox(String selectedValue,
		String defaultValue, String defaulCaption, String comboboxName,
		String comboboxId, String style, String dataGroupCode) {
		
		StringBuilder combobox = new StringBuilder();
		
		combobox.append("<select name='");
		combobox.append(comboboxName);
		combobox.append("' id='");
		combobox.append(comboboxId);
		combobox.append("' class='");
		combobox.append(style);
		combobox.append("'>");
		combobox.append("<option value='");
		combobox.append(defaultValue);
		combobox.append("'>");
		combobox.append(defaulCaption);
		combobox.append("</option>");
		
		try {
			List<DmDataItem> listObject = new ArrayList<DmDataItem>();
			if(dataGroupCode.equalsIgnoreCase(DTConstants.DANH_MUC.DM_DVHC)) {
				listObject = DmDataItemLocalServiceUtil.findTinhThanh();
			} else {
				listObject = DmDataItemLocalServiceUtil.findByGroupCode(dataGroupCode);
			}
			
			if(listObject != null && listObject.size() > 0) {
				for(DmDataItem obj : listObject) {
					String seld = StringPool.BLANK;
					
					if (StringUtil.equalsIgnoreCase(obj.getCode(), selectedValue)) {
						seld = " selected='selected' ";
					}
					
					combobox.append("<option value='");
					combobox.append(obj.getCode());
					combobox.append("' ");
					combobox.append(seld);
					combobox.append(">");
					combobox.append(obj.getName());
					combobox.append("</option>");
				}
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		combobox.append("</select>");
		
		return combobox.toString();
	}
	
	public static String renderDanhMucCombobox(String portletNamespace,
			String name, String style, String defaultValue,
			String defaulCaption, String dataGroupCode,
			Map<String, String> mValue, Map<String, String> mRequired) {
		
		StringBuilder combobox = new StringBuilder();
		
		combobox.append("<select name='");
		combobox.append(portletNamespace);
		combobox.append(name);
		combobox.append("' id='");
		combobox.append(portletNamespace);
		combobox.append(name);
		combobox.append("' class='");
		combobox.append(style);
		combobox.append(" ");
		combobox.append(GetterUtil.getString(mRequired.get(name)));
		combobox.append("'>");
		
		combobox.append("<option value='");
		combobox.append(defaultValue);
		combobox.append("'>");
		combobox.append(defaulCaption);
		combobox.append("</option>");
		
		try {
			List<DmDataItem> listObject = new ArrayList<DmDataItem>();
			
			if(dataGroupCode.equalsIgnoreCase(DTConstants.DANH_MUC.DM_DVHC)) {
				listObject = DmDataItemLocalServiceUtil.findTinhThanh();
			} else {
				listObject = DmDataItemLocalServiceUtil.findByGroupCode(dataGroupCode);
			}
			
			if(listObject != null && listObject.size() > 0) {
				for(DmDataItem obj : listObject) {
					String seld = StringPool.BLANK;
					
					if (StringUtil.equalsIgnoreCase(obj.getCode(), GetterUtil.getString(mValue.get(name)))) {
						seld = " selected='selected' ";
					}
					
					combobox.append("<option value='");
					combobox.append(obj.getCode());
					combobox.append("' ");
					combobox.append(seld);
					combobox.append(">");
					combobox.append(obj.getName());
					combobox.append("</option>");
				}
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		combobox.append("</select>");
		
		return combobox.toString();
	}

	/**
	 * Ham render danh sach donvithuchien ra selectbox theo thuTucHanhChinhId
	 * 
	 * @param selectedValue
	 * @param defaultValue
	 * @param defaulCaption
	 * @param comboboxName
	 * @param comboboxId
	 * @param style
	 * @param thuTucHanhChinhId
	 * @return
	 */
	public static String renderDonViThucHienCombobox(String selectedValue,
		String defaultValue, String defaulCaption, String comboboxName,
		String comboboxId, String style, long thuTucHanhChinhId) {
		
		List<TthcDonViThucHien> listDVTH = DuongThuyUtil.getListDVTHByThuTucHanhChinhId(thuTucHanhChinhId);
		
		StringBuilder combobox = new StringBuilder();
		
		combobox.append("<select name='");
		combobox.append(comboboxName);
		combobox.append("' id='");
		combobox.append(comboboxId);
		combobox.append("' class='");
		combobox.append(style);
		combobox.append("'>");
		
		if(listDVTH != null && listDVTH.size() > 1) {
			combobox.append("<option value='");
			combobox.append(defaultValue);
			combobox.append("'>");
			combobox.append(defaulCaption);
			combobox.append("</option>");
		}
		
		try {
			for (TthcDonViThucHien dvth : listDVTH) {
				DmDataItem dataItem = DmDataItemLocalServiceUtil.getByCode(dvth.getMaDonVi());
				
				if(dataItem != null) {
					String seld = StringPool.BLANK;
					
					if (StringUtil.equalsIgnoreCase(dvth.getMaDonVi(), selectedValue)) {
						seld = " selected='selected' ";
					}
					
					combobox.append("<option value='");
					combobox.append(dvth.getMaDonVi());
					combobox.append("' ");
					combobox.append(seld);
					combobox.append(">");
					combobox.append(dataItem.getName());
					combobox.append("</option>");
				}
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		combobox.append("</select>");
		
		return combobox.toString();
	}
	
	public static String renderDonViThucHienCombobox(String portletNamespace,
			String name, String style, String defaultValue,
			String defaulCaption, long thuTucHanhChinhId,
			Map<String, String> mValue, Map<String, String> mRequired) {
		
		List<TthcDonViThucHien> listDVTH = DuongThuyUtil.getListDVTHByThuTucHanhChinhId(thuTucHanhChinhId);
		
		StringBuilder combobox = new StringBuilder();
		
		combobox.append("<select name='");
		combobox.append(portletNamespace);
		combobox.append(name);
		combobox.append("' id='");
		combobox.append(portletNamespace);
		combobox.append(name);
		combobox.append("' class='");
		combobox.append(style);
		combobox.append(" ");
		combobox.append(GetterUtil.getString(mRequired.get(name)));
		combobox.append("'>");
		
		if(listDVTH != null && listDVTH.size() > 1) {
			combobox.append("<option value='");
			combobox.append(defaultValue);
			combobox.append("'>");
			combobox.append(defaulCaption);
			combobox.append("</option>");
		}
		
		try {
			for (TthcDonViThucHien dvth : listDVTH) {
				DmDataItem dataItem = DmDataItemLocalServiceUtil.getByCode(dvth.getMaDonVi());
				
				if(dataItem != null) {
					String seld = StringPool.BLANK;
					
					if (StringUtil.equalsIgnoreCase(dvth.getMaDonVi(), mValue.get(name))) {
						seld = " selected='selected' ";
					}
					
					combobox.append("<option value='");
					combobox.append(dvth.getMaDonVi());
					combobox.append("' ");
					combobox.append(seld);
					combobox.append(">");
					combobox.append(dataItem.getName());
					combobox.append("</option>");
				}
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		combobox.append("</select>");
		
		return combobox.toString();
	}
	
	/**
	 * Ham lay danh sach donViThucHien theo thuTucHanhChinhId
	 * 
	 * @param thuTucHanhChinhId
	 * @return
	 */
	public static List<TthcDonViThucHien> getListDVTHByThuTucHanhChinhId(long thuTucHanhChinhId) {
		
		List<TthcDonViThucHien> listDVTH = new ArrayList<TthcDonViThucHien>();
		
		try {
			listDVTH = TthcDonViThucHienLocalServiceUtil.getByThuTucHanhChinhId(thuTucHanhChinhId);
		} catch (SystemException e) {
			_log.error(e);
		}
		
		return listDVTH;
	}
	
	/**
	 * 
	 * @param thuTucHanhChinhId
	 * @return
	 */
	public static long getBieuMauHoSoIdByThanhPhanHoSoId(long thanhPhanHoSoId) {
		long bieuMauHoSoId = 0;
		
		List<TthcThanhPhanHoSoBieuMau> listThanhPhanHoSoBieuMau = 
				TthcThanhPhanHoSoBieuMauLocalServiceUtil.findByThanhPhanHoSoId(thanhPhanHoSoId);
		
		if (listThanhPhanHoSoBieuMau != null && listThanhPhanHoSoBieuMau.size() > 0) {
			bieuMauHoSoId = listThanhPhanHoSoBieuMau.get(0).getBieuMauHoSoId();
		}
		
		return bieuMauHoSoId;
	}
	
	public static long getNguoiLamThuTucIdByUserId(long userId) {
		long nguoiLamThuTucId = 0;
		
		DnDoanhNghiepUser doanhNghiepUser = DnDoanhNghiepUserLocalServiceUtil.findByUserId(userId);
		
		if(doanhNghiepUser != null) {
			nguoiLamThuTucId = doanhNghiepUser.getNguoiLamThuTucId();
		} else {
			_log.info("=== KHONG TIM THAY NGUOI_LAM_THU_TUC VOI USER_ID ===" + userId);
		}
		
		return nguoiLamThuTucId;
	}
	
	public static DonOnline getDonOnline(PortletRequest request, long thanhPhanHoSoId) {
		DonOnline don = null;
		
		try {
			TthcThanhPhanHoSo thanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.fetchTthcThanhPhanHoSo(thanhPhanHoSoId);
			
			String maThanhPhan = GetterUtil.getString(thanhPhanHoSo.getMaThanhPhan());
			
			_log.info("===maThanhPhan===" + maThanhPhan);
			
			Class<?> clazz = Class.forName("vn.dtt.duongthuy.maudon."+maThanhPhan);
			Constructor<?> constructor = clazz.getConstructor(PortletRequest.class);
			don = (DonOnline)constructor.newInstance(request);
		} catch(Exception e) {
			_log.error(e);
		}
		
		return don;
	}
	
	public static String getNoiDungXML(PortletRequest request, long thanhPhanHoSoId) {
		String noiDungXML = StringPool.BLANK;

		DonOnline don = getDonOnline(request, thanhPhanHoSoId);
		
		if(don != null) {
			try {
				noiDungXML = don.getNoiDungXML();
			} catch(IOException e) {
				_log.error(e);
			}
		}
		
		return noiDungXML;
	}
	
	/**
	 * get object xsd
	 * 
	 * @param noiDungHoSoId
	 * @param noiDungXML
	 * @return
	 */
	public static Object getDonOnline(long noiDungHoSoId, String noiDungXML) {
		Object obj = null;
		
		try {
			if(Validator.isNull(noiDungXML) && noiDungHoSoId > 0) {
				TthcNoidungHoSo noiDungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(noiDungHoSoId);
				
				if(noiDungHoSo != null) {
					noiDungXML = noiDungHoSo.getNoiDungXml();
				}
			}
	
			if(Validator.isNotNull(noiDungXML)) {
				obj = DonOnline.getDonOnline(noiDungXML);
			} 
		}catch(SystemException e) {
			_log.error(e);
		}
		
		return obj;
	}
	
	public static long getOrganizationIdByTTHC_DV(long thuTucHanhChinhId, String maDonVi) {
		long organizationId = 0;
		
		try {
			TthcDonViThucHien donViThucHien = TthcDonViThucHienLocalServiceUtil.getByTTHC_MaDV(thuTucHanhChinhId, maDonVi);
			
			if(donViThucHien != null) {
				organizationId = donViThucHien.getToChuc();
			}
		} catch (SystemException e) {
			_log.error(e);
		}
		
		return organizationId;
	}
	
	public static long getLoaiFileByLoaiThanhPhanHoSo(long loaiThanhPhanHoSo) {
		long loaiFile = 0;
		
		if(loaiThanhPhanHoSo == 4) {
			loaiFile = Constants.QUAN_LY_FILE_CHUNG;
		} else {
			loaiFile = Constants.QUAN_LY_FILE_RIENG;
		}
		
		return loaiFile;
	}
	
	/**
	 * getThongTinPhiLePhi return array[]{LoaiPhi, Phi}
	 * 
	 * @param hoSoThuTuc
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public static String[] getThongTinPhiLePhi(TthcHoSoThuTuc hoSoThuTuc) throws PortalException, SystemException {
		
		String[] thongTinPhiLePhi = new String[2];
		
		if(hoSoThuTuc != null) {
		
			_log.info("===hoSoThuTuc===" + hoSoThuTuc.getId());
			
			TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.getTthcThuTucHanhChinh(hoSoThuTuc.getThuTucHanhChinhId());
			
			_log.info("===thuTucHanhChinh===" + thuTucHanhChinh.getId());
			
			// TODO: FIX CUNG DON 2.1,2.2,2.3,3.1,3.2,3.3
			
			String dataItemCode = null;
			String[] thuTucTinhPhi = DTConstants.THU_TUC_TINH_PHI;
			
			if(ArrayUtil.contains(thuTucTinhPhi, thuTucHanhChinh.getMaThuTuc())) {
				
				List<TthcThanhPhanHoSo> listThanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.findByThutucHanhChinhIdAndLoaiThanhPhan(
					String.valueOf(hoSoThuTuc.getThuTucHanhChinhId()), "1");
				
				TthcThanhPhanHoSo tpDonOnline = null;
				// TODO: Doan nay khong hop ly neu 1 ho so thu tuc co 2 don online
				for(TthcThanhPhanHoSo thanhPhanHoSo : listThanhPhanHoSo) {
					if(Validator.isNotNull(thanhPhanHoSo.getMauTrucTuyen())) {
						tpDonOnline = thanhPhanHoSo;
						break;
					}
				}
				
				if(tpDonOnline != null) {
					List<TthcNoidungHoSo> listNoiDungHoSo = TthcNoidungHoSoLocalServiceUtil.findByHoSoThuTucIdAndThanhPhanHoSoId(
						hoSoThuTuc.getId(), tpDonOnline.getId());
					
					TthcNoidungHoSo noiDungHoSo = null;
					
					if(listNoiDungHoSo != null && listNoiDungHoSo.size() > 0) {
						noiDungHoSo = listNoiDungHoSo.get(0);
						
						if(tpDonOnline.getMaThanhPhan().equalsIgnoreCase("DTTPHS90")) {
							DonDTTPHS90 donOnline = (DonDTTPHS90) DonOnline.getDonOnline(noiDungHoSo.getNoiDungXml());
							
							dataItemCode = donOnline.getHang();
						} else if(tpDonOnline.getMaThanhPhan().equalsIgnoreCase("DTTPHS101")) {
							DonDTTPHS101 donOnline = (DonDTTPHS101) DonOnline.getDonOnline(noiDungHoSo.getNoiDungXml());
							
							dataItemCode = donOnline.getHang();
						} else if(tpDonOnline.getMaThanhPhan().equalsIgnoreCase("DTTPHS112")) {
							DonDTTPHS112 donOnline = (DonDTTPHS112) DonOnline.getDonOnline(noiDungHoSo.getNoiDungXml());
							
							dataItemCode = donOnline.getHang();
						}
						
						if(tpDonOnline.getMaThanhPhan().equalsIgnoreCase("DTTPHS69")) {
							DonDTTPHS69 donOnline = (DonDTTPHS69) DonOnline.getDonOnline(noiDungHoSo.getNoiDungXml());
							
							dataItemCode = donOnline.getDoiChieu();
						} else if(tpDonOnline.getMaThanhPhan().equalsIgnoreCase("DTTPHS76")) {
							DonDTTPHS76 donOnline = (DonDTTPHS76) DonOnline.getDonOnline(noiDungHoSo.getNoiDungXml());
							
							dataItemCode = donOnline.getDoiChieu();
						} else if(tpDonOnline.getMaThanhPhan().equalsIgnoreCase("DTTPHS83")) {
							DonDTTPHS83 donOnline = (DonDTTPHS83) DonOnline.getDonOnline(noiDungHoSo.getNoiDungXml());
							
							dataItemCode = donOnline.getDoiChieu();
						} else if(tpDonOnline.getMaThanhPhan().equalsIgnoreCase("DTTPHS123")
								|| tpDonOnline.getMaThanhPhan().equalsIgnoreCase("DTTPHS136")
								|| tpDonOnline.getMaThanhPhan().equalsIgnoreCase("DTTPHS147")
								|| tpDonOnline.getMaThanhPhan().equalsIgnoreCase("DTTPHS160")
								|| tpDonOnline.getMaThanhPhan().equalsIgnoreCase("DTTPHS170")
								|| tpDonOnline.getMaThanhPhan().equalsIgnoreCase("DTTPHS181")
								|| tpDonOnline.getMaThanhPhan().equalsIgnoreCase("DTTPHS192")
								|| tpDonOnline.getMaThanhPhan().equalsIgnoreCase("DTTPHS200")) {
							thongTinPhiLePhi[0] = "";
							thongTinPhiLePhi[1] = "70000";	// fix
						}
						
						_log.info("===noiDungHoSoId===" + noiDungHoSo.getId());
						_log.info("===maThanhPhan===" + tpDonOnline.getMaThanhPhan());
						_log.info("===dataItemCode===" + dataItemCode);
					}
				}
			}
			
			if(Validator.isNotNull(dataItemCode)) {
				DmDataItem dataItem = DmDataItemLocalServiceUtil.getByCode(dataItemCode);
				thongTinPhiLePhi[0] = dataItem.getNode2();
				thongTinPhiLePhi[1] = dataItem.getNode3();
				
				_log.info("===thongTinPhiLePhi===" + "[" + thongTinPhiLePhi[0] + "," + thongTinPhiLePhi[1] + "]");
			}
		}
		
		return thongTinPhiLePhi;
	}
	
	public static List<Long> getListTTHCByUserId(long userId) {
		List<Long> listTTHC = new ArrayList<Long>();
		
		if(userId > 0) {
			try {
				DnDoanhNghiepUser nguoiLamThuTucUser = DnDoanhNghiepUserLocalServiceUtil.findByUserId(userId);
				
				if(nguoiLamThuTucUser != null) {
					DnDoanhNghiep nguoiLamThuTuc = DnDoanhNghiepLocalServiceUtil.fetchDnDoanhNghiep(
						nguoiLamThuTucUser.getNguoiLamThuTucId());
					
					listTTHC = TthcDoiTuongThucHienLocalServiceUtil.getTTHCIdByLoaiDoiTuongThucHien(
						nguoiLamThuTuc.getLoaiNguoiLamThuTuc());
				}
				
			} catch(Exception e) {
				_log.error(e);
			}
		}
		
		return listTTHC;
	}
}