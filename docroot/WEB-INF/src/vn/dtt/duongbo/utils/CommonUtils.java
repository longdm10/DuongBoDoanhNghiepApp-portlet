
package vn.dtt.duongbo.utils;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.PortletSession;

import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.dao.common.model.DmDataItem;
import vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn;
import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapBienHieu;
import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu;
import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam;
import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLao;
import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung;
import vn.dtt.duongbo.dao.common.model.impl.QlvtLoaiHinhHoatDongDnImpl;
import vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapBienHieuImpl;
import vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapPhuHieuImpl;
import vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietCamImpl;
import vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietLaoImpl;
import vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietTrungImpl;
import vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo;
import vn.dtt.duongbo.utils.format.ConvertUtil;
import vn.dtt.duongbo.utils.format.DateUtils;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;

public class CommonUtils {
	
	private static Log _log = LogFactoryUtil.getLog(CommonUtils.class);
	
	public static String checkButton(int componetType, DmDataItem item, List<String> lCheckLists) {
		if (lCheckLists != null) {
			for (String check : lCheckLists) {
				if (check.trim().equalsIgnoreCase(item.getCode())) {
					if (Constants.TYPE_CHECKBOX == componetType || Constants.TYPE_RADIO == componetType) return " checked=\"checked\" ";
				}
			}
		}
		return "";
	}
	
	public static String checkButtonGroupGhLaoCam(int componetType, int groupType) {
		if(componetType == groupType)
			return "checked=\"checked\"";
		return "";
	}
	
	public static boolean checkFromDate(ActionRequest actionRequest) {
		String FORM_DATE = "FORM_DATE_SUBMIT";
		String formDate = ParamUtil.getString(actionRequest, "formDate");
		
		if (formDate != null && formDate.trim().length() > 0) {
			PortletSession portletSession = actionRequest.getPortletSession();
			
			Object oldFormDate = portletSession.getAttribute(FORM_DATE);
			
			if (oldFormDate != null && formDate.equalsIgnoreCase(String.valueOf(oldFormDate))) {
				return true;
			}
			
			portletSession.setAttribute(FORM_DATE, formDate);
		}
		
		return false;
	}
	
	public static String checkRole(ThemeDisplay themeDisplay, String frefix) {
		StringBuilder liRoleSelected = new StringBuilder();
		try {
			List<Role> liRoles = themeDisplay.getUser().getRoles();
			for (Role role : liRoles) {
				if (role.getName().startsWith(frefix)) {
					if (liRoleSelected.length() == 0) {
						liRoleSelected.append(role.getRoleId());
					} else {
						liRoleSelected.append(",").append(role.getRoleId());
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return liRoleSelected.toString().trim();
	}
	public static boolean checkRole1(ThemeDisplay themeDisplay, MotCuaTrangThaiHoSo motCuaTrangThaiHoSo) {
		try {
			List<Role> liRoles =  themeDisplay.getUser().getRoles();
			
			for (Role role : liRoles) {
				if (role.getRoleId() == motCuaTrangThaiHoSo.getVaiTroXuLy1() || role.getRoleId() == motCuaTrangThaiHoSo.getVaiTroXuLy2() || role.getRoleId() == motCuaTrangThaiHoSo.getVaiTroXuLy3()) {
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public static boolean checkRoleName(ThemeDisplay themeDisplay, String roleName) {
		try {
			List<Role> liRoles = themeDisplay.getUser().getRoles();
		//	System.out.println("CommonUtil==========="+themeDisplay.getUser().getRoles().get(0).getName());
			for (Role role : liRoles) {
				if (role.getName().trim().compareToIgnoreCase(roleName.trim()) == 0) { return true; }
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	

	public static List<User> findUserByRoleName(ThemeDisplay themeDisplay, String name) {
		try {
			Role _role = RoleLocalServiceUtil.loadFetchRole(themeDisplay.getCompanyId(), name);
			if (_role != null) { return UserLocalServiceUtil.getRoleUsers(_role.getRoleId()); }
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ArrayList<User>();
	}
	
	public static String getFullNameUser(User _user) {
		return _user.getFullName();
	}
	
	public static String getFullNameUser(long userId) {
		try {
			User _user = UserLocalServiceUtil.fetchUser(userId);
			return _user.getFullName();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public static QlvtPhuongTienDangKyVietCam passToPhuongTienVietCam(String sProperties) {
		QlvtPhuongTienDangKyVietCam cam = null;
		try {
			_log.info("=== passToPhuongTienVietCam====----------");
			if (Validator.isNotNull(sProperties) && sProperties.length() > 0) {
				cam = new QlvtPhuongTienDangKyVietCamImpl();
				String[] split = sProperties.split(";");
				cam.setId(ConvertUtil.convertToLong(split[0]));
				cam.setBienSo(split[1]);
				cam.setNhanHieu(split[2]);
				cam.setTrongTai(split[3]);
				cam.setNamSanXuat(split[4]);
				cam.setHinhThucHoatDong(split[5]);
				cam.setCuaKhauXuatNhap(split[6]);
				cam.setLoaiHinhHoatDong(split[7]);
				cam.setTuyenHoatDong(split[8]);
				cam.setThoiGianXinCapPhepTu(DateUtils.stringToDate(split[9], "dd/MM/yyyy"));
				cam.setThoiGianXinCapPhepDen(DateUtils.stringToDate(split[10], "dd/MM/yyyy"));
				cam.setSoKhung(split[11]);
				cam.setMauSon(split[12]);
				cam.setSoMay(split[13]);
				cam.setLoaiHangVanChuyen(split[14]);
				cam.setThoiGianDuKienKhoiHanh(DateUtils.stringToDate(split[15], "dd/MM/yyyy"));
				
				if (!"NULL".equalsIgnoreCase(split[16])) {
					cam.setNoiDungHoSoId(Long.parseLong(split[16]));
				}
				
				if (!"NULL".equalsIgnoreCase(split[17])) {
					cam.setHoSoThuTucId(Long.parseLong(split[17]));
				}
				cam.setTenDangKySoHuu(split[22]);
				_log.info("=== passToPhuongTienVietCamsetTenDangKySoHuu ====----------" +cam.getTenDangKySoHuu());
			}
		} catch (Exception e) {
			e.printStackTrace();
			_log.error(e);
		}
		return cam;
		
	}
	
	public static QlvtPhuongTienDangKyVietLao passToPhuongTienVietLao(String sProperties) {
		QlvtPhuongTienDangKyVietLao lao = null;
		try {
			if (Validator.isNotNull(sProperties) && sProperties.length() > 0) {
				lao = new QlvtPhuongTienDangKyVietLaoImpl();
				String[] split = sProperties.split(";");
				
				if (!"NULL".equalsIgnoreCase(split[0])) {
					lao.setId(ConvertUtil.convertToLong(split[0]));
				}
				
				if (!"NULL".equalsIgnoreCase(split[1])) {
					lao.setBienSo(split[1]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[2])) {
					lao.setNhanHieu(split[2]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[3])) {
					lao.setTrongTai(split[3]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[4])) {
					lao.setNamSanXuat(split[4]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[5])) {
					lao.setHinhThucHoatDong(split[5]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[6])) {
					lao.setCuaKhauXuatNhap(split[6]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[7])) {
					lao.setLoaiHinhHoatDong(split[7]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[8])) {
					lao.setTuyenHoatDong(split[8]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[9])) {
					lao.setThoiGianXinCapPhepTu(DateUtils.stringToDate(split[9], "dd/MM/yyyy"));
				}
				
				if (!"NULL".equalsIgnoreCase(split[10])) {
					lao.setThoiGianXinCapPhepDen(DateUtils.stringToDate(split[10], "dd/MM/yyyy"));
				}
				
				if (!"NULL".equalsIgnoreCase(split[11])) {
					lao.setSoKhung(split[11]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[12])) {
					lao.setMauSon(split[12]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[13])) {
					lao.setSoMay(split[13]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[14])) {
					lao.setLoaiHangVanChuyen(split[14]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[15])) {
					lao.setThoiGianDuKienKhoiHanh(DateUtils.stringToDate(split[15], "dd/MM/yyyy"));
				}
				
				if (!"NULL".equalsIgnoreCase(split[16])) {
					lao.setNoiDungHoSoId(Long.parseLong(split[16]));
				}
				
				if (!"NULL".equalsIgnoreCase(split[17])) {
					lao.setHoSoThuTucId(Long.parseLong(split[17]));
				}
				
				if (!"NULL".equalsIgnoreCase(split[23])) {
					lao.setTenDangKySoHuu(split[23]);
				}
				_log.info("=== ENĐ--vao`QlvtPhuongTienDangKyVietLao ====----------" +lao.getTenDangKySoHuu());
			}
		} catch (Exception e) {
			e.printStackTrace();
			_log.error(e);
		}
		return lao;
		
	}
	
	
	
	public static QlvtPhuongTienDangKyVietCam passToPhuongTienVietCam2(String sProperties) {
		QlvtPhuongTienDangKyVietCam cam = null;
		try {
			_log.info("=== passToPhuongTienVietCam2 ---====----------");
			if (Validator.isNotNull(sProperties) && sProperties.length() > 0) {
				cam = new QlvtPhuongTienDangKyVietCamImpl();
				String[] split = sProperties.split(";");
				
				
				if (!"NULL".equalsIgnoreCase(split[0])) {
					cam.setId(ConvertUtil.convertToLong(split[0]));
				}
				
				if (!"NULL".equalsIgnoreCase(split[1])) {
					cam.setBienSo(split[1]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[2])) {
					cam.setNhanHieu(split[2]);
				}
				if (!"NULL".equalsIgnoreCase(split[3])) {
					cam.setTrongTai(split[3]);
				}
				if (!"NULL".equalsIgnoreCase(split[4])) {
					cam.setNamSanXuat(split[4]);
				}
				if (!"NULL".equalsIgnoreCase(split[5])) {
					cam.setHinhThucHoatDong(split[5]);
				}
				if (!"NULL".equalsIgnoreCase(split[6])) {
					cam.setCuaKhauXuatNhap(split[6]);
				}
				if (!"NULL".equalsIgnoreCase(split[7])) {
					
					cam.setLoaiHinhHoatDong(split[7]);
				}
				if (!"NULL".equalsIgnoreCase(split[8])) {
					cam.setTuyenHoatDong(split[8]);
				}
				if (!"NULL".equalsIgnoreCase(split[9])) {
					cam.setThoiGianXinCapPhepTu(DateUtils.stringToDate(split[9], "dd/MM/yyyy"));
				}
				
				if (!"NULL".equalsIgnoreCase(split[10])) {
					cam.setThoiGianXinCapPhepDen(DateUtils.stringToDate(split[10], "dd/MM/yyyy"));
				}
				if (!"NULL".equalsIgnoreCase(split[11])) {
					cam.setSoKhung(split[11]);
				}
				if (!"NULL".equalsIgnoreCase(split[12])) {
					cam.setMauSon(split[12]);
				}
				if (!"NULL".equalsIgnoreCase(split[13])) {
					cam.setSoMay(split[13]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[14])) {
					cam.setLoaiHangVanChuyen(split[14]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[15])) {
					cam.setThoiGianDuKienKhoiHanh(DateUtils.stringToDate(split[15], "dd/MM/yyyy"));
				}
				
				if (!"NULL".equalsIgnoreCase(split[15])) {
					cam.setThoiGianDuKienKhoiHanh(DateUtils.stringToDate(split[15], "dd/MM/yyyy"));
				}
				
				if (!"NULL".equalsIgnoreCase(split[16])) {
					cam.setNoiDungHoSoId(Long.parseLong(split[16]));
				}
				
				if (!"NULL".equalsIgnoreCase(split[17])) {
					cam.setHoSoThuTucId(Long.parseLong(split[17]));
				}
				
				
				if (!"NULL".equalsIgnoreCase(split[23])) {
					cam.setTenDangKySoHuu(split[23]);
				}
				
				_log.info("=== passToPhuongTienVietCamsetTenDangKySoHuu ====----------" +cam.getTenDangKySoHuu());
			}
		} catch (Exception e) {
			e.printStackTrace();
			_log.error(e);
		}
		return cam;
		
	}
	
	
	
	public static QlvtPhuongTienDangKyVietTrung passToPhuongTienVietTrung(String sProperties) {
		QlvtPhuongTienDangKyVietTrung trung = null;
		try {
			_log.info("=======QlvtPhuongTienDangKyVietTrung passToPhuongTienVietTrung========");
			
			/**
			 * 
			 * NULL;Biển kiểm soát xe;NULL;99;99;NULL;DM_CUAKHAUVNTQ_HN;NULL;NULL;NULL;NULL;NULL;NULL;NULL;NULL;NULL;NULL;NULL;NULL;NULL;NULL;NULL;Tên đăng ký chủ sở hữu xe;Xe_29_cho;
			 * */
			
			
			if (Validator.isNotNull(sProperties) && sProperties.length() > 0) {
				trung = new QlvtPhuongTienDangKyVietTrungImpl();
				String[] split = sProperties.split(";");
				
				if (!"NULL".equalsIgnoreCase(split[0])) {
					trung.setId(ConvertUtil.convertToLong(split[0]));
				}
				
				if (!"NULL".equalsIgnoreCase(split[1])) {
					trung.setBienSo(split[1]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[2])) {
					trung.setNhanHieu(split[2]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[3])) {
					trung.setTrongTai(split[3]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[4])) {
					trung.setNamSanXuat(split[4]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[5])) {
					trung.setHinhThucHoatDong(split[5]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[6])) {
					trung.setCuaKhauXuatNhap(split[6]);
				}
				
//				Trung ko co loaiHinhHoatDong
//				if (!"NULL".equalsIgnoreCase(split[7])) {
//					trung.setLoaiHinhHoatDong(split[7]);
//				}
				
				if (!"NULL".equalsIgnoreCase(split[8])) {
					trung.setTuyenHoatDong(split[8]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[9])) {
					trung.setThoiGianXinCapPhepTu(DateUtils.stringToDate(split[9], "dd/MM/yyyy"));
				}
				
				if (!"NULL".equalsIgnoreCase(split[10])) {
					trung.setThoiGianXinCapPhepDen(DateUtils.stringToDate(split[10], "dd/MM/yyyy"));
				}
				
				if (!"NULL".equalsIgnoreCase(split[11])) {
					trung.setSoKhung(split[11]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[12])) {
					trung.setMauSon(split[12]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[13])) {
					trung.setSoMay(split[13]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[14])) {
					trung.setLoaiHangVanChuyen(split[14]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[15])) {
					trung.setThoiGianDuKienKhoiHanh(DateUtils.stringToDate(split[15], "dd/MM/yyyy"));
				}
				
				if (!"NULL".equalsIgnoreCase(split[16])) {
					trung.setNoiDungHoSoId(Long.parseLong(split[16]));
				}
				
				if (!"NULL".equalsIgnoreCase(split[17])) {
					trung.setHoSoThuTucId(Long.parseLong(split[17]));
				}
				
				if (!"NULL".equalsIgnoreCase(split[18])) {
					trung.setDiemDungDoDangKy(split[18]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[19])) {
					trung.setHanhTrinhDeNghi(split[19]);
				}
				
				//20
				
				//21
				
				//22
				if (!"NULL".equalsIgnoreCase(split[22])) {
					trung.setTenDangKySoHuu(split[22]);
				}
				//23
				if (!"NULL".equalsIgnoreCase(split[23])) {
					trung.setLoaiXe(split[23]);
				}
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			_log.error(e);
		}
		return trung;
	}
	
	public static QlvtPhuongTienCapBienHieu passToPhuongTienBienHieu(String sProperties) {
		QlvtPhuongTienCapBienHieu bienhieu = null;
		try {
			_log.info("========vao`  vpassToPhuongTienBienHieu====");
			if (Validator.isNotNull(sProperties) && sProperties.length() > 0) {
				bienhieu = new QlvtPhuongTienCapBienHieuImpl();
				
				
				
				String[] split = sProperties.split(";");
				
				if (!"NULL".equalsIgnoreCase(split[0])) {
					bienhieu.setId(ConvertUtil.convertToLong(split[0]));
				}
				if (!"NULL".equalsIgnoreCase(split[1])) {
					bienhieu.setNhanHieu(split[1]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[2])) {
					bienhieu.setBienSo(split[2]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[5])) {
					bienhieu.setNamSanXuat(split[5]);
				}
				
				
				if (!"NULL".equalsIgnoreCase(split[9])) {
					bienhieu.setNoiDungHoSoId(Long.parseLong(split[9]));
				}
				
				if (!"NULL".equalsIgnoreCase(split[10])) {
					bienhieu.setHoSoThuTucId(Long.parseLong(split[10]));
				}
				
				if (!"NULL".equalsIgnoreCase(split[11])) {
					bienhieu.setSoKhung(split[11]);
				}
				if (!"NULL".equalsIgnoreCase(split[12])) {
					bienhieu.setSoMay(split[12]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[13])) {
					bienhieu.setMauSon(split[13]);
				}
				if (!"NULL".equalsIgnoreCase(split[14])) {
					bienhieu.setSoChoNgoi(Long.parseLong(split[14]));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			_log.error(e);
		}
		return bienhieu;
	}
	
	
	public static QlvtPhuongTienCapPhuHieu passToPhuongTienPhuHieu(String sProperties) {
		QlvtPhuongTienCapPhuHieu phuhieu = null;
		try {
			
			if (Validator.isNotNull(sProperties) && sProperties.length() > 0) {
				phuhieu = new QlvtPhuongTienCapPhuHieuImpl();
				String[] split = sProperties.split(";");
				
				if (!"NULL".equalsIgnoreCase(split[0])) {
					phuhieu.setId(ConvertUtil.convertToLong(split[0]));
				}
				if (!"NULL".equalsIgnoreCase(split[1])) {
					phuhieu.setNhanHieu(split[1]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[2])) {
					phuhieu.setBienSo(split[2]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[3])) {
					phuhieu.setTrongTai(Long.parseLong(split[3]));
				}
				
				if (!"NULL".equalsIgnoreCase(split[4])) {
					phuhieu.setNuocSanXuat(split[4]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[5])) {
					phuhieu.setNamSanXuat(split[5]);
				}
				
				
				if (!"NULL".equalsIgnoreCase(split[6])) {
					phuhieu.setLoaiHinhHoatDong(split[6]);
					if ("DM_LHHD_HKTCD".equalsIgnoreCase(split[6])) {
						if (!"NULL".equalsIgnoreCase(split[7]+","+split[8])) {
							phuhieu.setTuyenHoatDong(split[7]+","+split[8]);
						}
					}else{
					}
					
				}
				if (!"NULL".equalsIgnoreCase(split[9])) {
					phuhieu.setNoiDungHoSoId(Long.parseLong(split[9]));
				}
				
				if (!"NULL".equalsIgnoreCase(split[10])) {
					phuhieu.setHoSoThuTucId(Long.parseLong(split[10]));
				}
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			_log.error(e);
		}
		return phuhieu;
	}
	
	public static QlvtLoaiHinhHoatDongDn passToLoaiHinhHoatDong(String sProperties) {
		QlvtLoaiHinhHoatDongDn loaiHinh = null;
		try {
			
			if (Validator.isNotNull(sProperties) && sProperties.length() > 0) {
				loaiHinh = new QlvtLoaiHinhHoatDongDnImpl();
				String[] split = sProperties.split(";");
				
				if (!"NULL".equalsIgnoreCase(split[0])) {
					loaiHinh.setId(ConvertUtil.convertToLong(split[0]));
				}
				
				if (!"NULL".equalsIgnoreCase(split[1])) {
					loaiHinh.setNoiDungHoSoId(Long.parseLong(split[1]));
				}
				
				if (!"NULL".equalsIgnoreCase(split[2])) {
					loaiHinh.setHoSoThuTucId(Long.parseLong(split[2]));
				}
				
				if (!"NULL".equalsIgnoreCase(split[3])) {
					loaiHinh.setMaLoaiHinhHoatDong(split[3]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[5])) {
					loaiHinh.setMaMauSon(split[5]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[7])) {
					loaiHinh.setMaPhamViHoatDong(split[7]);
				}
				
				
				
				if (!"NULL".equalsIgnoreCase(split[9])) {
					loaiHinh.setSoLuongPhuongTien(split[9]);
				}
				
				if (!"NULL".equalsIgnoreCase(split[10])) {
					loaiHinh.setThietBiGiamSatHanhTrinh(split[10]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			_log.error(e);
		}
		return loaiHinh;
	}
	
	
	public static String passPhuongTienVietLaoToString(QlvtPhuongTienDangKyVietLao phuongTien) {
		StringBuilder builder = new StringBuilder();
		try {
			if (Validator.isNotNull(phuongTien)) {
				
				if (Validator.isNotNull(phuongTien.getId())) {
					builder.append(phuongTien.getId() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getBienSo())) {
					builder.append(phuongTien.getBienSo() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getNhanHieu())) {
					builder.append(phuongTien.getNhanHieu() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getTrongTai())) {
					builder.append(phuongTien.getTrongTai() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getNamSanXuat())) {
					builder.append(phuongTien.getNamSanXuat() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getHinhThucHoatDong())) {
					builder.append(phuongTien.getHinhThucHoatDong() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getCuaKhauXuatNhap())) {
					builder.append(phuongTien.getCuaKhauXuatNhap() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getLoaiHinhHoatDong())) {
					builder.append(phuongTien.getLoaiHinhHoatDong() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getTuyenHoatDong())) {
					builder.append(phuongTien.getTuyenHoatDong() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getThoiGianXinCapPhepTu())) {
					builder.append(DateUtils.dateToString("dd/MM/yyyy", phuongTien.getThoiGianXinCapPhepTu()) + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getThoiGianXinCapPhepDen())) {
					builder.append(DateUtils.dateToString("dd/MM/yyyy", phuongTien.getThoiGianXinCapPhepDen()) + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getSoKhung())) {
					builder.append(phuongTien.getSoKhung() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getMauSon())) {
					builder.append(phuongTien.getMauSon() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getSoMay())) {
					builder.append(phuongTien.getSoMay() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getLoaiHangVanChuyen())) {
					builder.append(phuongTien.getLoaiHangVanChuyen() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getThoiGianDuKienKhoiHanh())) {
					builder.append((DateUtils.dateToString("dd/MM/yyyy", phuongTien.getThoiGianDuKienKhoiHanh())) + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getNoiDungHoSoId())) {
					builder.append(phuongTien.getNoiDungHoSoId() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getHoSoThuTucId())) {
					builder.append(phuongTien.getHoSoThuTucId() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				builder.append("NULL" + ";");
				builder.append("NULL" + ";");
				builder.append("NULL" + ";");
				builder.append("NULL" + ";");
				builder.append("NULL" + ";");
				if (Validator.isNotNull(phuongTien.getTenDangKySoHuu())) {
					builder.append(phuongTien.getTenDangKySoHuu() + ";");
				} else {
					builder.append("NULL" + ";");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			_log.error(e);
		}
		return builder.toString();
	}
	
	
//	public static String passTuyenCoDinhToString(DKKTVTTuyenCoDinhBangOtoVietLao.DanhSachXe danhSachXe) {
//		StringBuilder builder = new StringBuilder();
//		try {
//			if (Validator.isNotNull(danhSachXe)) {
//				
////				if (Validator.isNotNull(danhSachXe.getId())) {
////					builder.append(danhSachXe.getId() + ";");
////				} else {
//					builder.append("NULL" + ";");
////				}
//				
//				if (Validator.isNotNull(danhSachXe.getBienKiemSoat()) && danhSachXe.getBienKiemSoat().length() > 0) {
//					builder.append(danhSachXe.getBienKiemSoat() + ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
//				if (Validator.isNotNull(danhSachXe.getLoaiXe()) && danhSachXe.getLoaiXe().length() > 0) {
//					builder.append(danhSachXe.getLoaiXe() + ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
//				if (Validator.isNotNull(danhSachXe.getSoGhe()) && danhSachXe.getSoGhe().length() > 0) {
//					builder.append(danhSachXe.getSoGhe() + ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
//				if (Validator.isNotNull(danhSachXe.getNamSx()) && danhSachXe.getNamSx().length() > 0) {
//					builder.append(danhSachXe.getNamSx() + ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
////				if (Validator.isNotNull(danhSachXe.getHinhThucHoatDong())) {
////					builder.append(danhSachXe.getHinhThucHoatDong() + ";");
////				} else {
//					builder.append("NULL" + ";");
////				}
//				
//				if (Validator.isNotNull(danhSachXe.getCuaKhau()) && danhSachXe.getCuaKhau().length() > 0) {
//					builder.append(danhSachXe.getCuaKhau() + ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
////				if (Validator.isNotNull(danhSachXe.getLoaiHinhHoatDong())) {
////					builder.append(danhSachXe.getLoaiHinhHoatDong() + ";");
////				} else {
//					builder.append("NULL" + ";");
////				}
//				
////				if (Validator.isNotNull(danhSachXe.getTuyenHoatDong())) {
////					builder.append(danhSachXe.getTuyenHoatDong() + ";");
////				} else {
//					builder.append("NULL" + ";");
////				}
//				
////				if (Validator.isNotNull(danhSachXe.getThoiGianXinCapPhepTu())) {
////					builder.append(DateUtils.dateToString("dd/MM/yyyy", danhSachXe.getThoiGianXinCapPhepTu()) + ";");
////				} else {
//					builder.append("NULL" + ";");
////				}
//				
////				if (Validator.isNotNull(danhSachXe.getThoiGianXinCapPhepDen())) {
////					builder.append(DateUtils.dateToString("dd/MM/yyyy", danhSachXe.getThoiGianXinCapPhepDen()) + ";");
////				} else {
//					builder.append("NULL" + ";");
////				}
//				
////				if (Validator.isNotNull(danhSachXe.getSoKhung())) {
////					builder.append(danhSachXe.getSoKhung() + ";");
////				} else {
//					builder.append("NULL" + ";");
////				}
//				
////				if (Validator.isNotNull(danhSachXe.getMauSon())) {
////					builder.append(danhSachXe.getMauSon() + ";");
////				} else {
//					builder.append("NULL" + ";");
////				}
//				
////				if (Validator.isNotNull(danhSachXe.getSoMay())) {
////					builder.append(danhSachXe.getSoMay() + ";");
////				} else {
//					builder.append("NULL" + ";");
////				}
//				
////				if (Validator.isNotNull(danhSachXe.getLoaiHangVanChuyen())) {
////					builder.append(danhSachXe.getLoaiHangVanChuyen() + ";");
////				} else {
//					builder.append("NULL" + ";");
////				}
//				
////				if (Validator.isNotNull(danhSachXe.getThoiGianDuKienKhoiHanh())) {
////					builder.append((DateUtils.dateToString("dd/MM/yyyy", danhSachXe.getThoiGianDuKienKhoiHanh())) + ";");
////				} else {
//					builder.append("NULL" + ";");
////				}
//				
////				if (Validator.isNotNull(danhSachXe.getNoiDungHoSoId())) {
////					builder.append(danhSachXe.getNoiDungHoSoId() + ";");
////				} else {
//					builder.append("NULL" + ";");
////				}
//				
////				if (Validator.isNotNull(danhSachXe.getHoSoThuTucId())) {
////					builder.append(danhSachXe.getHoSoThuTucId() + ";");
////				} else {
//					builder.append("NULL" + ";");
////				}
//					
//				builder.append("NULL" + ";");
//				builder.append("NULL" + ";");
//				builder.append("NULL" + ";");
//				builder.append("NULL" + ";");
//				builder.append("NULL" + ";");
//				
//				if (Validator.isNotNull(danhSachXe.getTenDangKy()) && danhSachXe.getTenDangKy().length() > 0) {
//					builder.append(danhSachXe.getTenDangKy() + ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			_log.error(e);
//		}
//		return builder.toString();
//	}
	
	
	
	
//	public static String passGPLVTMVietLaoToString(DonXinCapGPLVTMVietLao.DanhSachXe danhSachXe) {
//		StringBuilder builder = new StringBuilder();
//		try {
//			if (Validator.isNotNull(danhSachXe)) {
//				
////				if (Validator.isNotNull(phuongTien.getId())) {
////					builder.append(phuongTien.getId() + ";");
////				} else {
//					builder.append("NULL" + ";");
////				}
//				
//				if (Validator.isNotNull(danhSachXe.getBienSoXe()) && danhSachXe.getBienSoXe().length() > 0) {
//					builder.append(danhSachXe.getBienSoXe() + ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
//				if (Validator.isNotNull(danhSachXe.getNhanHieu()) && danhSachXe.getNhanHieu().length() > 0) {
//					builder.append(danhSachXe.getNhanHieu() + ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
//				if (Validator.isNotNull(danhSachXe.getTrongTai()) && danhSachXe.getTrongTai().length() > 0) {
//					builder.append(danhSachXe.getTrongTai() + ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
//				if (Validator.isNotNull(danhSachXe.getNamSX()) && danhSachXe.getNamSX().length() > 0) {
//					builder.append(danhSachXe.getNamSX() + ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
//				if (Validator.isNotNull(danhSachXe.getHinhThucHoatDong()) && danhSachXe.getHinhThucHoatDong().length() > 0) {
//					builder.append(danhSachXe.getHinhThucHoatDong() + ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
//				if (Validator.isNotNull(danhSachXe.getCuaKhau()) && danhSachXe.getCuaKhau().length() > 0) {
//					builder.append(danhSachXe.getCuaKhau() + ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
////				if (Validator.isNotNull(danhSachXe.getLoaiHinhHoatDong())) {
////					builder.append(danhSachXe.getLoaiHinhHoatDong() + ";");
////				} else {
//					builder.append("NULL" + ";");
////				}
//				
////				if (Validator.isNotNull(phuongTien.getTuyenHoatDong())) {
////					builder.append(phuongTien.getTuyenHoatDong() + ";");
////				} else {
//					builder.append("NULL" + ";");
////				}
//				
//				if (Validator.isNotNull(danhSachXe.getThoiGianDeNghiFrom()) && danhSachXe.getThoiGianDeNghiFrom().length() > 0) {
//					builder.append(danhSachXe.getThoiGianDeNghiFrom()+ ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
//				if (Validator.isNotNull(danhSachXe.getThoiGianDeNghiTo()) && danhSachXe.getThoiGianDeNghiTo().length() > 0) {
//					builder.append(danhSachXe.getThoiGianDeNghiTo()+ ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
//				if (Validator.isNotNull(danhSachXe.getSoKhung()) && danhSachXe.getSoKhung().length() > 0) {
//					builder.append(danhSachXe.getSoKhung() + ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
//				if (Validator.isNotNull(danhSachXe.getMauSon()) && danhSachXe.getMauSon().length() > 0) {
//					builder.append(danhSachXe.getMauSon() + ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
//				if (Validator.isNotNull(danhSachXe.getSoMay()) && danhSachXe.getSoMay().length() > 0) {
//					builder.append(danhSachXe.getSoMay() + ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
////				if (Validator.isNotNull(danhSachXe.getLoaiHangVanChuyen())) {
////					builder.append(danhSachXe.getLoaiHangVanChuyen() + ";");
////				} else {
//					builder.append("NULL" + ";");
////				}
//				
////				if (Validator.isNotNull(danhSachXe.getThoiGianDuKienKhoiHanh())) {
////					builder.append((DateUtils.dateToString("dd/MM/yyyy", phuongTien.getThoiGianDuKienKhoiHanh())) + ";");
////				} else {
//					builder.append("NULL" + ";");
////				}
//				
////				if (Validator.isNotNull(phuongTien.getNoiDungHoSoId())) {
////					builder.append(phuongTien.getNoiDungHoSoId() + ";");
////				} else {
//					builder.append("NULL" + ";");
////				}
//				
////				if (Validator.isNotNull(phuongTien.getHoSoThuTucId())) {
////					builder.append(phuongTien.getHoSoThuTucId() + ";");
////				} else {
//					builder.append("NULL" + ";");
////				}
//				
//				builder.append("NULL" + ";");
//				builder.append("NULL" + ";");
//				builder.append("NULL" + ";");
//				builder.append("NULL" + ";");
//				builder.append("NULL" + ";");
//				
////				if (Validator.isNotNull(phuongTien.getTenDangKySoHuu())) {
////					builder.append(phuongTien.getTenDangKySoHuu() + ";");
////				} else {
//					builder.append("NULL" + ";");
////				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			_log.error(e);
//		}
//		return builder.toString();
//	}
	
//	public static String passXeDonXinCapGPLienVanVietLao(DonXinCapGPLienVanVietLao.DanhSachXe danhSachXe) {
//		StringBuilder builder = new StringBuilder();
//		try {
//			if (Validator.isNotNull(danhSachXe)) {
//				
////				if (Validator.isNotNull(phuongTien.getId())) {
////					builder.append(phuongTien.getId() + ";");
////				} else {
//					builder.append("NULL" + ";");
////				}
//				
//				if (Validator.isNotNull(danhSachXe.getBienSoXe()) && danhSachXe.getBienSoXe().length() > 0) {
//					builder.append(danhSachXe.getBienSoXe() + ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
//				if (Validator.isNotNull(danhSachXe.getNhanHieu()) && danhSachXe.getNhanHieu().length() > 0) {
//					builder.append(danhSachXe.getNhanHieu() + ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
//				if (Validator.isNotNull(danhSachXe.getTrongTai()) && danhSachXe.getTrongTai().length() > 0) {
//					builder.append(danhSachXe.getTrongTai() + ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
//				if (Validator.isNotNull(danhSachXe.getNamSX()) && danhSachXe.getNamSX().length() > 0) {
//					builder.append(danhSachXe.getNamSX() + ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
//				if (Validator.isNotNull(danhSachXe.getHinhThucHoatDong()) && danhSachXe.getHinhThucHoatDong().length() > 0) {
//					builder.append(danhSachXe.getHinhThucHoatDong() + ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
//				if (Validator.isNotNull(danhSachXe.getCuaKhau()) && danhSachXe.getCuaKhau().length() > 0) {
//					builder.append(danhSachXe.getCuaKhau() + ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
//	//			if (Validator.isNotNull(danhSachXe.getLoaiHinhHoatDong())) {
//	//				builder.append(danhSachXe.getLoaiHinhHoatDong() + ";");
//	//			} else {
//					builder.append("NULL" + ";");
//	//			}
//				
//	//			if (Validator.isNotNull(phuongTien.getTuyenHoatDong())) {
//	//				builder.append(phuongTien.getTuyenHoatDong() + ";");
//	//			} else {
//					builder.append("NULL" + ";");
//	//			}
//				
//				if (Validator.isNotNull(danhSachXe.getThoiGianDeNghiFrom()) && danhSachXe.getThoiGianDeNghiFrom().length() > 0) {
//					builder.append(danhSachXe.getThoiGianDeNghiFrom()+ ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
//				if (Validator.isNotNull(danhSachXe.getThoiGianDeNghiTo()) && danhSachXe.getThoiGianDeNghiTo().length() > 0) {
//					builder.append(danhSachXe.getThoiGianDeNghiTo()+ ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
//				if (Validator.isNotNull(danhSachXe.getSoKhung()) && danhSachXe.getSoKhung().length() > 0) {
//					builder.append(danhSachXe.getSoKhung() + ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
//				if (Validator.isNotNull(danhSachXe.getMauSon()) && danhSachXe.getMauSon().length() > 0) {
//					builder.append(danhSachXe.getMauSon() + ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
//				if (Validator.isNotNull(danhSachXe.getSoMay()) && danhSachXe.getSoMay().length() > 0) {
//					builder.append(danhSachXe.getSoMay() + ";");
//				} else {
//					builder.append("NULL" + ";");
//				}
//				
//	//			if (Validator.isNotNull(danhSachXe.getLoaiHangVanChuyen())) {
//	//				builder.append(danhSachXe.getLoaiHangVanChuyen() + ";");
//	//			} else {
//					builder.append("NULL" + ";");
//	//			}
//				
//	//			if (Validator.isNotNull(danhSachXe.getThoiGianDuKienKhoiHanh())) {
//	//				builder.append((DateUtils.dateToString("dd/MM/yyyy", phuongTien.getThoiGianDuKienKhoiHanh())) + ";");
//	//			} else {
//					builder.append("NULL" + ";");
//	//			}
//				
//	//			if (Validator.isNotNull(phuongTien.getNoiDungHoSoId())) {
//	//				builder.append(phuongTien.getNoiDungHoSoId() + ";");
//	//			} else {
//					builder.append("NULL" + ";");
//	//			}
//				
//	//			if (Validator.isNotNull(phuongTien.getHoSoThuTucId())) {
//	//				builder.append(phuongTien.getHoSoThuTucId() + ";");
//	//			} else {
//					builder.append("NULL" + ";");
//	//			}
//				
//				builder.append("NULL" + ";");
//				builder.append("NULL" + ";");
//				builder.append("NULL" + ";");
//				builder.append("NULL" + ";");
//				builder.append("NULL" + ";");
//				
//	//			if (Validator.isNotNull(phuongTien.getTenDangKySoHuu())) {
//	//				builder.append(phuongTien.getTenDangKySoHuu() + ";");
//	//			} else {
//					builder.append("NULL" + ";");
//	//			}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			_log.error(e);
//		}
//		return builder.toString();
//	}
	
	//----------------------------------------------------PHUONG TIEN VIET CAM-----------------------------
	public static String passPhuongTienVietCamToString(QlvtPhuongTienDangKyVietCam phuongTien) {
		StringBuilder builder = new StringBuilder();
		try {
			
			if (Validator.isNotNull(phuongTien)) {
				
				if (Validator.isNotNull(phuongTien.getId())) {
					builder.append(phuongTien.getId() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getBienSo())) {
					builder.append(phuongTien.getBienSo() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getNhanHieu())) {
					builder.append(phuongTien.getNhanHieu() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getTrongTai())) {
					builder.append(phuongTien.getTrongTai() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getNamSanXuat())) {
					builder.append(phuongTien.getNamSanXuat() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getHinhThucHoatDong())) {
					builder.append(phuongTien.getHinhThucHoatDong() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getCuaKhauXuatNhap())) {
					builder.append(phuongTien.getCuaKhauXuatNhap() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getLoaiHinhHoatDong())) {
					builder.append(phuongTien.getLoaiHinhHoatDong() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getTuyenHoatDong())) {
					builder.append(phuongTien.getTuyenHoatDong() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getThoiGianXinCapPhepTu())) {
					builder.append(DateUtils.dateToString("dd/MM/yyyy", phuongTien.getThoiGianXinCapPhepTu()) + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getThoiGianXinCapPhepDen())) {
					builder.append(DateUtils.dateToString("dd/MM/yyyy", phuongTien.getThoiGianXinCapPhepDen()) + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getSoKhung())) {
					builder.append(phuongTien.getSoKhung() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getMauSon())) {
					builder.append(phuongTien.getMauSon() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getSoMay())) {
					builder.append(phuongTien.getSoMay() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getLoaiHangVanChuyen())) {
					builder.append(phuongTien.getLoaiHangVanChuyen() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getThoiGianDuKienKhoiHanh())) {
					builder.append((DateUtils.dateToString("dd/MM/yyyy", phuongTien.getThoiGianDuKienKhoiHanh())) + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getNoiDungHoSoId())) {
					builder.append(phuongTien.getNoiDungHoSoId() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getHoSoThuTucId())) {
					builder.append(phuongTien.getHoSoThuTucId() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				builder.append("NULL" + ";");
				builder.append("NULL" + ";");
				builder.append("NULL" + ";");
				builder.append("NULL" + ";");
				builder.append("NULL" + ";");
				if (Validator.isNotNull(phuongTien.getTenDangKySoHuu())) {
					builder.append(phuongTien.getTenDangKySoHuu() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			_log.error(e);
		}
		return builder.toString();
	}
	
	public static String passPhuongTienVietTrungToString(QlvtPhuongTienDangKyVietTrung phuongTien) {
		StringBuilder builder = new StringBuilder();
		
		_log.info("----------------vao passPhuongTienVietTrungToString");
		try {
			
			if (Validator.isNotNull(phuongTien)) {
				
				//0-id
				if (Validator.isNotNull(phuongTien.getId())) {
					builder.append(phuongTien.getId() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				//1-bienSo
				if (Validator.isNotNull(phuongTien.getBienSo())) {
					builder.append(phuongTien.getBienSo() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				//2-nhanHieu
				//3-textNhanHieu
				if (Validator.isNotNull(phuongTien.getNhanHieu())) {
					builder.append(phuongTien.getNhanHieu() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				//4-trongTai
				if (Validator.isNotNull(phuongTien.getTrongTai())) {
					builder.append(phuongTien.getTrongTai() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				//5-namSanXuat
				if (Validator.isNotNull(phuongTien.getNamSanXuat())) {
					builder.append(phuongTien.getNamSanXuat() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				//6-hinhThucHoatDong
				//7-textHinhThucHoatDong
				if (Validator.isNotNull(phuongTien.getHinhThucHoatDong())) {
					builder.append(phuongTien.getHinhThucHoatDong() + ";");
//					builder.append("NULL" + ";");
				} else {
//					builder.append("NULL" + ";");
					builder.append("NULL" + ";");
				}
				
				//8-cuaKhauXuatNhap
				//9-textCuaKhauXuatNhap
				if (Validator.isNotNull(phuongTien.getCuaKhauXuatNhap())) {
					builder.append(phuongTien.getCuaKhauXuatNhap() + ";");
//					builder.append("NULL" + ";");
				} else {
//					builder.append("NULL" + ";");
					builder.append("NULL" + ";");
				}
				
				//Loai hinh hoat dong, ko co trong Viet_trung
				//10-loaiHinhHoatDong
				//11-textLoaiHinhHoatDong
//				if (Validator.isNotNull(phuongTien.getLoaiHinhHoatDong())) {
//					builder.append(phuongTien.getLoaiHinhHoatDong() + ";");
//				} else {
//					builder.append("NULL" + ";");
					builder.append("NULL" + ";");
//				}
				
				//12-tuyenHoatDong
				//13-textTuyenHoatDong
				if (Validator.isNotNull(phuongTien.getTuyenHoatDong())) {
					builder.append(phuongTien.getTuyenHoatDong() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				//14-thoiGianXinCapPhepTu
				if (Validator.isNotNull(phuongTien.getThoiGianXinCapPhepTu())) {
					builder.append(DateUtils.dateToString("dd/MM/yyyy", phuongTien.getThoiGianXinCapPhepTu()) + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				//15-thoiGianXinCapPhepDen
				if (Validator.isNotNull(phuongTien.getThoiGianXinCapPhepDen())) {
					builder.append(DateUtils.dateToString("dd/MM/yyyy", phuongTien.getThoiGianXinCapPhepDen()) + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				//16-soKhung
				if (Validator.isNotNull(phuongTien.getSoKhung())) {
					builder.append(phuongTien.getSoKhung() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				//17-mauSon
				if (Validator.isNotNull(phuongTien.getMauSon())) {
					builder.append(phuongTien.getMauSon() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				//18-soMay
				if (Validator.isNotNull(phuongTien.getSoMay())) {
					builder.append(phuongTien.getSoMay() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				//19-loaiHangVanChuyen
				if (Validator.isNotNull(phuongTien.getLoaiHangVanChuyen())) {
					builder.append(phuongTien.getLoaiHangVanChuyen() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				//20-thoiGianDuKienKhoiHanh
				if (Validator.isNotNull(phuongTien.getThoiGianDuKienKhoiHanh())) {
					builder.append((DateUtils.dateToString("dd/MM/yyyy", phuongTien.getThoiGianDuKienKhoiHanh())) + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				
				//21-noiDungHoSoId
				if (Validator.isNotNull(phuongTien.getNoiDungHoSoId())) {
					builder.append(phuongTien.getNoiDungHoSoId() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				
				//22-hoSoThuTucId
				if (Validator.isNotNull(phuongTien.getHoSoThuTucId())) {
					builder.append(phuongTien.getHoSoThuTucId() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				//23-diemDungDoDangKy
				//24-textDiemDungDoDangKy
				if (Validator.isNotNull(phuongTien.getDiemDungDoDangKy())) {
					builder.append(phuongTien.getDiemDungDoDangKy().replace(",", "#") + ";");
//					builder.append("NULL" + ";");
				} else {
//					builder.append("NULL" + ";");
					builder.append("NULL" + ";");
				}
				
				//25-hanhTrinhDeNghi
				if (Validator.isNotNull(phuongTien.getHanhTrinhDeNghi())) {
					builder.append(phuongTien.getHanhTrinhDeNghi() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				//26-soGiayPhepMatHong
				if (Validator.isNotNull(phuongTien.getSoGiayPhepBiMatHong())) {
					builder.append(phuongTien.getSoGiayPhepBiMatHong() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				//27-nuocSanXuat
				builder.append("NULL" + ";");
				
				
				//28-tenDangKySoHuuXe
				if (Validator.isNotNull(phuongTien.getTenDangKySoHuu())) {
					builder.append(phuongTien.getTenDangKySoHuu() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				//29-loaiXe
				//30-textLoaiXe
				if (Validator.isNotNull(phuongTien.getLoaiXe())) {
					builder.append(phuongTien.getLoaiXe() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				_log.info("builder.toString()--" + builder.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
			_log.error(e);
		}
		return builder.toString();
	}
	
	public static String passPhuongTienCapBienHieuToString(QlvtPhuongTienCapBienHieu phuongTien) {
		StringBuilder builder = new StringBuilder();
//		_log.info("----------------vao passPhuongTienVietTrungToString");
		System.out.println("----------------vao passPhuongTienCapBienHieuToString");
		try {
			
			if (Validator.isNotNull(phuongTien)) {
				
				if (Validator.isNotNull(phuongTien.getId())) {
					builder.append(phuongTien.getId() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getNhanHieu())) {
					builder.append(phuongTien.getNhanHieu() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getBienSo())) {
					builder.append(phuongTien.getBienSo() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				builder.append("NULL" + ";");
				
				builder.append("NULL" + ";");
				
				if (Validator.isNotNull(phuongTien.getNamSanXuat())) {
					builder.append(phuongTien.getNamSanXuat() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				builder.append("NULL" + ";");
				builder.append("NULL" + ";");
				builder.append("NULL" + ";");
				//
				
				if (Validator.isNotNull(phuongTien.getHoSoThuTucId())) {
					builder.append(phuongTien.getHoSoThuTucId() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getNoiDungHoSoId())) {
					builder.append(phuongTien.getNoiDungHoSoId() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getSoKhung())) {
					builder.append(phuongTien.getSoKhung() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				if (Validator.isNotNull(phuongTien.getSoMay())) {
					builder.append(phuongTien.getSoMay() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				if (Validator.isNotNull(phuongTien.getMauSon())) {
					builder.append(phuongTien.getMauSon() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				if (Validator.isNotNull(phuongTien.getSoChoNgoi())) {
					builder.append(phuongTien.getSoChoNgoi() + ";");
				} else {
					builder.append("NULL" + ";");
				}
//				_log.info(builder.toString());
				System.out.println("----------------builder.toString(): " + builder.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
			_log.error(e);
		}
		return builder.toString();
	}
	
	public static String passPhuongTienCapPhuHieuToString(QlvtPhuongTienCapPhuHieu phuongTien) {
		StringBuilder builder = new StringBuilder();
		
		_log.info("----------------vao passPhuongTienCapPhuHieuToString");
		try {
			if (Validator.isNotNull(phuongTien)) {
				
				if (Validator.isNotNull(phuongTien.getId())) {
					builder.append(phuongTien.getId() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				if (Validator.isNotNull(phuongTien.getNhanHieu())) {
					builder.append(phuongTien.getNhanHieu() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getBienSo())) {
					builder.append(phuongTien.getBienSo() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getTrongTai())) {
					builder.append(phuongTien.getTrongTai() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getNuocSanXuat())) {
					builder.append(phuongTien.getNuocSanXuat()+";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getNamSanXuat())) {
					builder.append(phuongTien.getNamSanXuat() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getLoaiHinhHoatDong())) {
					builder.append(phuongTien.getLoaiHinhHoatDong() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getLoaiHinhHoatDong())) {
					builder.append(phuongTien.getLoaiHinhHoatDong() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getTuyenHoatDong())) {
					String[] allTuyenHd = phuongTien.getTuyenHoatDong().split(",");
					for (int i = 0; i < allTuyenHd.length; i++) {
						builder.append(phuongTien.getTuyenHoatDong() + ";");
					}
					if(allTuyenHd.length < 2){
						builder.append("NULL" + ";");
					}
					
				} else {
					builder.append("NULL" + ";");
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getNoiDungHoSoId())) {
					builder.append(phuongTien.getNoiDungHoSoId() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				if (Validator.isNotNull(phuongTien.getHoSoThuTucId())) {
					builder.append(phuongTien.getHoSoThuTucId() + ";");
				} else {
					builder.append("NULL" + ";");
				}
					builder.append("NULL" + ";");
					builder.append("NULL" + ";");
					builder.append("NULL" + ";");
					builder.append("NULL" + ";");
				
				_log.info("----------------builder.toString(): " + builder.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
			_log.error(e);
		}
		return builder.toString();
	}
	
	public static String passLoaiHinhHoatDongDn(QlvtLoaiHinhHoatDongDn loaiHinh) {
		StringBuilder builder = new StringBuilder();
		
		_log.info("------vao passLoaiHinhHoatDongDn--ToString");
		try {
			if (Validator.isNotNull(loaiHinh)) {
				//0
				if (Validator.isNotNull(loaiHinh.getId())) {
					builder.append(loaiHinh.getId() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				//1
				if (Validator.isNotNull(loaiHinh.getHoSoThuTucId())) {
					builder.append(loaiHinh.getHoSoThuTucId() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				//2
				if (Validator.isNotNull(loaiHinh.getNoiDungHoSoId())) {
					builder.append(loaiHinh.getNoiDungHoSoId() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				
				//3
				if (Validator.isNotNull(loaiHinh.getMaLoaiHinhHoatDong())) {
					builder.append(loaiHinh.getMaLoaiHinhHoatDong() + ";");
					builder.append("NULL" + ";");
				} else {
					builder.append("NULL" + ";");
					builder.append("NULL" + ";");
				}
				
				//4
				if (Validator.isNotNull(loaiHinh.getMaMauSon())) {
					builder.append(loaiHinh.getMaMauSon()+";");
					builder.append("NULL" + ";");
				} else {
					builder.append("NULL" + ";");
					builder.append("NULL" + ";");
				}
				
				//5
				if (Validator.isNotNull(loaiHinh.getMaPhamViHoatDong())) {
					builder.append(loaiHinh.getMaPhamViHoatDong() + ";");
					builder.append("NULL" + ";");
				} else {
					builder.append("NULL" + ";");
					builder.append("NULL" + ";");
				}
				
				//6
				if (Validator.isNotNull(loaiHinh.getSoLuongPhuongTien())) {
					builder.append(loaiHinh.getSoLuongPhuongTien() + ";");
				} else {
					builder.append("NULL" + ";");
				}
			
				//7
				if (Validator.isNotNull(loaiHinh.getThietBiGiamSatHanhTrinh())) {
					builder.append(loaiHinh.getThietBiGiamSatHanhTrinh() + ";");
				} else {
					builder.append("NULL" + ";");
				}
				_log.info("---------builder.toString(): " + builder.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
			_log.error(e);
		}
		return builder.toString();
	}
	
	
	
	public static String getNameItemFromList(List<DmDataItem> lstDataItem, String codeItem) {
		String nameItem = codeItem;
		if (lstDataItem != null && lstDataItem.size() > 0) {
			for (DmDataItem item : lstDataItem) {
				if (codeItem.equalsIgnoreCase(item.getCode())) {
					nameItem = item.getName();
					break;
				}
			}
		}
		return nameItem;
	}
	
	public static String getListNameItemFromList(List<DmDataItem> lstDataItem, String[] codeItemList) {
		String nameItemList = "";
		if (lstDataItem != null && lstDataItem.size() > 0) {
			for(int i=0; i<codeItemList.length; i++){
				for (DmDataItem item : lstDataItem) {
				    if (item.getCode().equalsIgnoreCase(codeItemList[i])) {
				    	nameItemList = nameItemList + "," + item.getName();
				    	break;
					}
				}
			}
		}
		if(nameItemList.trim().length() > 0){
			nameItemList = nameItemList.substring(1);
		}
		return nameItemList;
	}
	
	public static String checkedCodeItemFromList(List<String> lstData, String codeItem) {
		if (codeItem != null && codeItem.trim().length() > 0) {
			if (lstData != null && lstData.size() > 0) {
				for (String s : lstData) {
					if (codeItem.trim().equalsIgnoreCase(s)) {
						return " checked=\"checked\" ";
					}
				}
			}
		}
		return "";
	}

	public static String checkPermissionAssign(long userId, String role) {
		Role role1 = null;
		Role role2 = null;
		try {
			if (ConvertUtil.convertToLong(role) > 0) {
				role1 = RoleLocalServiceUtil.fetchRole(ConvertUtil.convertToLong(role));
			} else {
				String[] idRoles = role.split(",");
				if (idRoles != null) {
					if (idRoles.length > 1) {
						role1 = RoleLocalServiceUtil.fetchRole(ConvertUtil.convertToLong(idRoles[0]));
						role2 = RoleLocalServiceUtil.fetchRole(ConvertUtil.convertToLong(idRoles[1]));
					} else if (idRoles.length == 1) {
						role1 = RoleLocalServiceUtil.fetchRole(ConvertUtil.convertToLong(idRoles[0]));
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		log.info("====checkPermissionAssign======userId=" + userId + ", ===== role1==" + role1);
//		log.info("====checkPermissionAssign======userId=" + userId + ", ===== role2==" + role2);
		if (role1 != null && role2 != null) {
			if (role2.getName().compareToIgnoreCase("MTYT_CANBOXULY") == 0 || role1.getName().compareToIgnoreCase("MTYT_CANBOXULY") == 0) {
				return " and id in (select phieuxulyid from motcua_phancongxuly where nguoixuly = " + userId + " or NGUOIDUOCUYQUYEN = " + userId + " ) ";
			} else if (role2.getName().compareToIgnoreCase("MTYT_LANHDAOPHONG") == 0 && role1.getName().compareToIgnoreCase("MTYT_LANHDAOPHONG") == 0) {
				return " and id in (select phieuxulyid from motcua_phancongxuly where nguoiphancong = " + userId + " ) ";
			}
		} else if (role1 != null && role2 == null) {
			if (role1.getName().compareToIgnoreCase("MTYT_CANBOXULY") == 0) {
				return " and id in (select phieuxulyid from motcua_phancongxuly where nguoixuly = " + userId + " ) ";
			} else if (role1.getName().compareToIgnoreCase("MTYT_LANHDAOPHONG") == 0) {
				return " and id in (select phieuxulyid from motcua_phancongxuly where nguoiphancong = " + userId + " ) ";
			}
		} else if (role2 != null && role1 == null) {
			if (role2.getName().compareToIgnoreCase("MTYT_CANBOXULY") == 0) {
				return " and id in (select phieuxulyid from motcua_phancongxuly where nguoixuly = " + userId + " ) ";
			} else if (role2.getName().compareToIgnoreCase("MTYT_LANHDAOPHONG") == 0) {
				return " and id in (select phieuxulyid from motcua_phancongxuly where nguoiphancong = " + userId + " ) ";
			}
		}
		
		return "";
	}
	public static List<User> findUserByRoleName2(long comPanyId, String name) {
		try {
			Role _role = RoleLocalServiceUtil.loadFetchRole(comPanyId, name);
			if (_role != null) {
				return UserLocalServiceUtil.getRoleUsers(_role.getRoleId());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ArrayList<User>();
	}
}
