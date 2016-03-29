package vn.dtt.duongbo.dangky;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep;
import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser;
import vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil;
import vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepUserLocalServiceUtil;
import vn.dtt.duongbo.mail.MailEngineUtil;
import vn.dtt.duongbo.utils.config.DuongBoConfigurationManager;
import vn.dtt.duongbo.utils.duongbo.UserDuongBo;
import vn.dtt.duongbo.utils.format.DateUtils;
import vn.dtt.duongbo.utils.format.FormatData;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.ContentUtil;
import com.liferay.util.PwdGenerator;

public class DangKyDoanhNghiepActionUtil {
	
	public static DnDoanhNghiep dangKyCongDan(ActionRequest actionRequest, ActionResponse actionResponse, List<String> errors) {
		String cdTen = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_TEN);
		String cdNgaySinh = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_NGAY_SINH);
		int cdNamSinh = ParamUtil.getInteger(actionRequest, NguoiLamThuTucTerm.CD_NAM_SINH);
		String cdQuocTich = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_QUOC_TICH);
		String cdGioiTinh = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_GIOI_TINH);
		String cdTinhThanh = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_TINH_THANH);
		String cdQuanHuyen = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_QUAN_HUYEN);
		String cdPhuongXa = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_PHUONG_XA);
		String cdDiaChi = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_DIA_CHI);
		String cdCMNDSo = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_CMND_SO);
		String cdCMNDNoiCap = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_CMND_NOI_CAP);
		String cdCMNDNgayCap = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_CMND_NGAY_CAP);
		String cdDienThoai = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_DIEN_THOAI);
		String cdEmail = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_EMAIL);
		
		long companyId = PortalUtil.getCompanyId(actionRequest);
		
		Date now = new Date();
		
		DnDoanhNghiep nguoiLamThuTuc = null;
		
		try { 
			if(DangKyDoanhNghiepActionUtil.validateDangKyCongDan(actionRequest, errors, true)) {
			
				long nguoiLamThuTucId = CounterLocalServiceUtil.increment(DnDoanhNghiep.class.getName());
				
				nguoiLamThuTuc = DnDoanhNghiepLocalServiceUtil.createDnDoanhNghiep(nguoiLamThuTucId);
				
				nguoiLamThuTuc.setTenCongDan(cdTen);
				nguoiLamThuTuc.setMaPhuongXa(cdPhuongXa);
				nguoiLamThuTuc.setMaQuanHuyen(cdQuanHuyen);
				nguoiLamThuTuc.setMaTinhThanh(cdTinhThanh);
				nguoiLamThuTuc.setGioiTinh(cdGioiTinh);
				nguoiLamThuTuc.setNgayDangKi(now);
				nguoiLamThuTuc.setQuocTich(cdQuocTich);
				nguoiLamThuTuc.setDiaChi(cdDiaChi);
				nguoiLamThuTuc.setDienThoai(cdDienThoai);
				nguoiLamThuTuc.setEmail(cdEmail);
				nguoiLamThuTuc.setMaSoCongDan(cdCMNDSo);
				nguoiLamThuTuc.setNoiCapCMND(cdCMNDNoiCap);
				nguoiLamThuTuc.setNgayCapCMND(FormatData.parseStringToDate(cdCMNDNgayCap));
				nguoiLamThuTuc.setLoaiNguoiLamThuTuc(Constants.LOAI_NGUOI_LAM_THU_TUC_CD);
				nguoiLamThuTuc.setNamSinh(String.valueOf(cdNamSinh));
				nguoiLamThuTuc.setNgaySinh(FormatData.parseStringToDate(cdNgaySinh));
				
				String matKhauTuSinh = PwdGenerator.getPassword(PwdGenerator.KEY1 + PwdGenerator.KEY2 + PwdGenerator.KEY3, 8);
				
				nguoiLamThuTuc.setNgayKichHoat(now);
				
				nguoiLamThuTuc = DnDoanhNghiepLocalServiceUtil.updateDnDoanhNghiep(nguoiLamThuTuc);
				
				User userDn = new UserDuongBo().createPortalUser(companyId, matKhauTuSinh, nguoiLamThuTuc.getEmail(), nguoiLamThuTuc.getTenCongDan(), Constants.LOAI_NGUOI_LAM_THU_TUC_CD);
				
				if(userDn != null){
					DnDoanhNghiepUser nguoiLamThuTucUser = DnDoanhNghiepUserLocalServiceUtil.findByUserId(userDn.getUserId());
					
					if(nguoiLamThuTucUser == null){
						long nguoiLamThuTucUserId = CounterLocalServiceUtil.increment(DnDoanhNghiepUser.class.getName());
						
						nguoiLamThuTucUser = DnDoanhNghiepUserLocalServiceUtil.createDnDoanhNghiepUser(nguoiLamThuTucUserId);
						nguoiLamThuTucUser.setNguoiLamThuTucId(nguoiLamThuTuc.getId());
						nguoiLamThuTucUser.setUserId(userDn.getUserId());
						nguoiLamThuTucUser.setMaster(Constants.IS_MASTER_ACCOUNT+"");
						nguoiLamThuTucUser.setTinhTrangHoatDong(Constants.TRANG_THAI_HOAT_DONG);
						nguoiLamThuTucUser.setToChucQuanLy(DuongBoConfigurationManager.getStrProp("id_org_congdan", "0"));
						nguoiLamThuTucUser.setTenTaiKhoan(userDn.getEmailAddress());
						nguoiLamThuTucUser.setTenNguoiDung(userDn.getFullName());
						nguoiLamThuTucUser.setNgayTaoTaiKhoan(nguoiLamThuTuc.getNgayDangKi());
						nguoiLamThuTucUser.setNgayMoTaiKhoan(now);
						
						DnDoanhNghiepUserLocalServiceUtil.updateDnDoanhNghiepUser(nguoiLamThuTucUser);
					}
				}
				
				DangKyDoanhNghiepActionUtil.sendMailDKCongDan(nguoiLamThuTuc, matKhauTuSinh);
			}
		} catch (Exception e) {
			errors.add(DangKyMessageErrors.ERROR_REGISTER);
			_log.error(e);
		}
		
		if(!errors.isEmpty()) {
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_TEN, cdTen);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_NGAY_SINH, cdNgaySinh);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_NAM_SINH, String.valueOf(cdNamSinh));
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_QUOC_TICH, cdQuocTich);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_GIOI_TINH, cdGioiTinh);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_TINH_THANH, cdTinhThanh);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_QUAN_HUYEN, cdQuanHuyen);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_PHUONG_XA, cdPhuongXa);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_DIA_CHI, cdDiaChi);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_CMND_SO, cdCMNDSo);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_CMND_NOI_CAP, cdCMNDNoiCap);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_CMND_NGAY_CAP, cdCMNDNgayCap);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_DIEN_THOAI, cdDienThoai);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_EMAIL, cdEmail);
		}
		
		return nguoiLamThuTuc;
	}
	
	public static DnDoanhNghiep updateCongDan(ActionRequest actionRequest, ActionResponse actionResponse, List<String> errors) {
		String cdTen = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_TEN);
		String cdNgaySinh = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_NGAY_SINH);
		int cdNamSinh = ParamUtil.getInteger(actionRequest, NguoiLamThuTucTerm.CD_NAM_SINH);
		String cdQuocTich = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_QUOC_TICH);
		String cdGioiTinh = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_GIOI_TINH);
		String cdTinhThanh = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_TINH_THANH);
		String cdQuanHuyen = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_QUAN_HUYEN);
		String cdPhuongXa = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_PHUONG_XA);
		String cdDiaChi = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_DIA_CHI);
		String cdCMNDSo = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_CMND_SO);
		String cdCMNDNoiCap = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_CMND_NOI_CAP);
		String cdCMNDNgayCap = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_CMND_NGAY_CAP);
		String cdDienThoai = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_DIEN_THOAI);
		String cdEmail = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_EMAIL);
		
		long nguoiLamThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_DOANH_NGHIEP);
		
		DnDoanhNghiep nguoiLamThuTuc = null;
		
		try { 
			nguoiLamThuTuc = DnDoanhNghiepLocalServiceUtil.getDnDoanhNghiep(nguoiLamThuTucId);
			
			if(DangKyDoanhNghiepActionUtil.validateDangKyCongDan(actionRequest, errors, false)) {
			
				nguoiLamThuTuc.setTenCongDan(cdTen);
				nguoiLamThuTuc.setMaPhuongXa(cdPhuongXa);
				nguoiLamThuTuc.setMaQuanHuyen(cdQuanHuyen);
				nguoiLamThuTuc.setMaTinhThanh(cdTinhThanh);
				nguoiLamThuTuc.setGioiTinh(cdGioiTinh);
				nguoiLamThuTuc.setQuocTich(cdQuocTich);
				nguoiLamThuTuc.setDiaChi(cdDiaChi);
				nguoiLamThuTuc.setDienThoai(cdDienThoai);
				nguoiLamThuTuc.setMaSoCongDan(cdCMNDSo);
				nguoiLamThuTuc.setNoiCapCMND(cdCMNDNoiCap);
				nguoiLamThuTuc.setNgayCapCMND(FormatData.parseStringToDate(cdCMNDNgayCap));
				nguoiLamThuTuc.setNamSinh(String.valueOf(cdNamSinh));
				nguoiLamThuTuc.setNgaySinh(FormatData.parseStringToDate(cdNgaySinh));
				
				nguoiLamThuTuc = DnDoanhNghiepLocalServiceUtil.updateDnDoanhNghiep(nguoiLamThuTuc);
			}
		} catch (Exception e) {
			errors.add(DangKyMessageErrors.ERROR_REGISTER);
			_log.error(e);
		}
		
		if(!errors.isEmpty()) {
			actionResponse.setRenderParameter(Constants.ID_DOANH_NGHIEP, String.valueOf(nguoiLamThuTucId));
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_TEN, cdTen);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_NGAY_SINH, cdNgaySinh);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_NAM_SINH, String.valueOf(cdNamSinh));
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_QUOC_TICH, cdQuocTich);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_GIOI_TINH, cdGioiTinh);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_TINH_THANH, cdTinhThanh);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_QUAN_HUYEN, cdQuanHuyen);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_PHUONG_XA, cdPhuongXa);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_DIA_CHI, cdDiaChi);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_CMND_SO, cdCMNDSo);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_CMND_NOI_CAP, cdCMNDNoiCap);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_CMND_NGAY_CAP, cdCMNDNgayCap);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_DIEN_THOAI, cdDienThoai);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.CD_EMAIL, cdEmail);
		}
		
		return nguoiLamThuTuc;
	}
	
	public static DnDoanhNghiep dangKyDoanhNghiep(ActionRequest actionRequest, ActionResponse actionResponse, List<String> errors) {
		String dnTen = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_TEN);
		String dnTenEn = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_TEN_EN);
		String dnTinhThanh = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_TINH_THANH);
		String dnQuanHuyen = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_QUAN_HUYEN);
		String dnPhuongXa = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_PHUONG_XA);
		String dnDiaChi = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_DIA_CHI);
		String dnDienThoai = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_DIEN_THOAI);
		String dnFax = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_FAX);
		String dnEmail = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_EMAIL);
		
		String dnDKKDSo = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_DKKD_SO);
		String dnDKKDNgayCap = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_DKKD_NGAY_CAP);
		String dnDKKDNoiCap = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_DKKD_NOI_CAP);
		
		String dnDkdvtOtoSo = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_DKKD_VT_OTO_SO);
		String dnDkdvtOtoNgayCap = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_DKKD_VT_OTO_NGAY_CAP);
		String dnDkdvtOtoNoiCap = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_DKKD_VT_OTO_NGAY_CAP);
		
		String dnNguoiDaiDien = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_NGUOI_DAI_DIEN);
		String dnChucVu = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_CHUC_VU);
		String dnNguoiDaiDienDT = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_NGUOI_DAI_DIEN_DIEN_THOAI);
		
		Date now = new Date();
		
		DnDoanhNghiep nguoiLamThuTuc = null;
		
		try { 
			if(DangKyDoanhNghiepActionUtil.validateDangKyDoanhNghiep(actionRequest, errors, true)) {
				
				long nguoiLamThuTucId = CounterLocalServiceUtil.increment(DnDoanhNghiep.class.getName());
				
				nguoiLamThuTuc = DnDoanhNghiepLocalServiceUtil.createDnDoanhNghiep(nguoiLamThuTucId);
				
				nguoiLamThuTuc.setSoDangKyKinhDoanh(dnDKKDSo);
				nguoiLamThuTuc.setTenDoanhNghiep(dnTen);
				nguoiLamThuTuc.setNguoiDaiDien(dnNguoiDaiDien);
				nguoiLamThuTuc.setDiaChi(dnDiaChi);
				nguoiLamThuTuc.setFax(dnFax);
				nguoiLamThuTuc.setEmail(dnEmail);
				nguoiLamThuTuc.setMaPhuongXa(dnPhuongXa);
				nguoiLamThuTuc.setMaQuanHuyen(dnQuanHuyen);
				nguoiLamThuTuc.setMaTinhThanh(dnTinhThanh);
				nguoiLamThuTuc.setTenTiengAnh(dnTenEn);
				nguoiLamThuTuc.setDienThoai(dnDienThoai);
				nguoiLamThuTuc.setSoDienThoaiNguoiDaiDien(dnNguoiDaiDienDT);
				nguoiLamThuTuc.setCoQuanCapDkKd(dnDKKDNoiCap);
				nguoiLamThuTuc.setChucVuNguoiDaiDien(dnChucVu);
				nguoiLamThuTuc.setLoaiNguoiLamThuTuc(Constants.LOAI_NGUOI_LAM_THU_TUC_DN);
				nguoiLamThuTuc.setNgayDangKi(now);
				nguoiLamThuTuc.setNgayCapDkKd(FormatData.parseStringToDate(dnDKKDNgayCap));
				nguoiLamThuTuc.setMaSoDoanhNghiep(dnDKKDSo);
				
				nguoiLamThuTuc.setSoGpkdVanTaiBangOto(dnDkdvtOtoSo);
				nguoiLamThuTuc.setNgayCapGpkdVanTaiBangOto(DateUtils.stringToDate(dnDkdvtOtoNgayCap, "dd/MM/yyyy"));
				nguoiLamThuTuc.setNoiCapCMND(dnDkdvtOtoNoiCap);
				
				
				nguoiLamThuTuc = DnDoanhNghiepLocalServiceUtil.updateDnDoanhNghiep(nguoiLamThuTuc);
			}
			
		} catch (Exception e) {
			errors.add(DangKyMessageErrors.ERROR_REGISTER);
			_log.error(e);
		}
		
		if(!errors.isEmpty()) {
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_TEN, dnTen);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_TEN_EN, dnTenEn);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_TINH_THANH, dnTinhThanh);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_QUAN_HUYEN, dnQuanHuyen);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_PHUONG_XA, dnPhuongXa);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_DIA_CHI, dnDiaChi);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_DIEN_THOAI, dnDienThoai);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_FAX, dnFax);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_EMAIL, dnEmail);
			
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_DKKD_SO, dnDKKDSo);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_DKKD_NGAY_CAP, dnDKKDNgayCap);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_DKKD_NOI_CAP, dnDKKDNoiCap);
			
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_DKKD_VT_OTO_SO, dnDkdvtOtoSo);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_DKKD_VT_OTO_NGAY_CAP, dnDkdvtOtoNgayCap);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_DKKD_VT_OTO_NOI_CAP, dnDkdvtOtoNoiCap);
			
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_NGUOI_DAI_DIEN, dnNguoiDaiDien);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_CHUC_VU, dnChucVu);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_NGUOI_DAI_DIEN_DIEN_THOAI, dnNguoiDaiDienDT);
		}
		
		return nguoiLamThuTuc;
	}
	
	public static DnDoanhNghiep updateDoanhNghiep(ActionRequest actionRequest, ActionResponse actionResponse, List<String> errors) {
		String dnTen = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_TEN);
		String dnTenEn = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_TEN_EN);
		String dnTinhThanh = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_TINH_THANH);
		String dnQuanHuyen = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_QUAN_HUYEN);
		String dnPhuongXa = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_PHUONG_XA);
		String dnDiaChi = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_DIA_CHI);
		String dnDienThoai = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_DIEN_THOAI);
		String dnFax = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_FAX);
		String dnEmail = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_EMAIL);
		
		String dnDKKDSo = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_DKKD_SO);
		String dnDKKDNgayCap = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_DKKD_NGAY_CAP);
		String dnDKKDNoiCap = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_DKKD_NOI_CAP);
		
		String dnDkdvtOtoSo = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_DKKD_VT_OTO_SO);
		String dnDkdvtOtoNgayCap = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_DKKD_VT_OTO_NGAY_CAP);
		String dnDkdvtOtoNoiCap = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_DKKD_VT_OTO_NGAY_CAP);
		
		String dnNguoiDaiDien = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_NGUOI_DAI_DIEN);
		String dnChucVu = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_CHUC_VU);
		String dnNguoiDaiDienDT = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_NGUOI_DAI_DIEN_DIEN_THOAI);
		
		long nguoiLamThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_DOANH_NGHIEP);
		
		DnDoanhNghiep nguoiLamThuTuc = null;
		
		try { 
			if(DangKyDoanhNghiepActionUtil.validateDangKyDoanhNghiep(actionRequest, errors, false)) {
				
				nguoiLamThuTuc = DnDoanhNghiepLocalServiceUtil.getDnDoanhNghiep(nguoiLamThuTucId);
				
				nguoiLamThuTuc.setSoDangKyKinhDoanh(dnDKKDSo);
				nguoiLamThuTuc.setTenDoanhNghiep(dnTen);
				nguoiLamThuTuc.setNguoiDaiDien(dnNguoiDaiDien);
				nguoiLamThuTuc.setDiaChi(dnDiaChi);
				nguoiLamThuTuc.setFax(dnFax);
				nguoiLamThuTuc.setMaPhuongXa(dnPhuongXa);
				nguoiLamThuTuc.setMaQuanHuyen(dnQuanHuyen);
				nguoiLamThuTuc.setMaTinhThanh(dnTinhThanh);
				nguoiLamThuTuc.setTenTiengAnh(dnTenEn);
				nguoiLamThuTuc.setDienThoai(dnDienThoai);
				nguoiLamThuTuc.setSoDienThoaiNguoiDaiDien(dnNguoiDaiDienDT);
				nguoiLamThuTuc.setCoQuanCapDkKd(dnDKKDNoiCap);
				nguoiLamThuTuc.setChucVuNguoiDaiDien(dnChucVu);
				nguoiLamThuTuc.setNgayCapDkKd(FormatData.parseStringToDate(dnDKKDNgayCap));
				nguoiLamThuTuc.setMaSoDoanhNghiep(dnDKKDSo);
				
				nguoiLamThuTuc.setSoGpkdVanTaiBangOto(dnDkdvtOtoSo);
				nguoiLamThuTuc.setNgayCapGpkdVanTaiBangOto(DateUtils.stringToDate(dnDkdvtOtoNgayCap, "dd/MM/yyyy"));
				nguoiLamThuTuc.setNoiCapCMND(dnDkdvtOtoNoiCap);
				
				nguoiLamThuTuc = DnDoanhNghiepLocalServiceUtil.updateDnDoanhNghiep(nguoiLamThuTuc);
			}
			
		} catch (Exception e) {
			errors.add(DangKyMessageErrors.ERROR_REGISTER);
			_log.error(e);
		}
		
		if(!errors.isEmpty()) {
			actionResponse.setRenderParameter(Constants.ID_DOANH_NGHIEP, String.valueOf(nguoiLamThuTucId));
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_TEN, dnTen);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_TEN_EN, dnTenEn);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_TINH_THANH, dnTinhThanh);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_QUAN_HUYEN, dnQuanHuyen);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_PHUONG_XA, dnPhuongXa);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_DIA_CHI, dnDiaChi);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_DIEN_THOAI, dnDienThoai);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_FAX, dnFax);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_EMAIL, dnEmail);
			
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_DKKD_SO, dnDKKDSo);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_DKKD_NGAY_CAP, dnDKKDNgayCap);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_DKKD_NOI_CAP, dnDKKDNoiCap);
			
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_DKKD_VT_OTO_SO, dnDkdvtOtoSo);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_DKKD_VT_OTO_NGAY_CAP, dnDkdvtOtoNgayCap);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_DKKD_VT_OTO_NOI_CAP, dnDkdvtOtoNoiCap);
			
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_NGUOI_DAI_DIEN, dnNguoiDaiDien);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_CHUC_VU, dnChucVu);
			actionResponse.setRenderParameter(NguoiLamThuTucTerm.DN_NGUOI_DAI_DIEN_DIEN_THOAI, dnNguoiDaiDienDT);
		}
		
		return nguoiLamThuTuc;
	}
	
	public static void kichHoatDoanhNghiep(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		UserDuongBo userUtil = new UserDuongBo();
		
		long nguoiLamThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_DOANH_NGHIEP);
		
		Date now = new Date();
		
		DnDoanhNghiep nguoiLamThuTuc = DnDoanhNghiepLocalServiceUtil.fetchDnDoanhNghiep(nguoiLamThuTucId);
		
		User userQuanTri = PortalUtil.getUser(actionRequest);
		
		String matKhauTuSinh = PwdGenerator.getPassword(PwdGenerator.KEY1 + PwdGenerator.KEY2 + PwdGenerator.KEY3, 8);
		
		User userDn = userUtil.createPortalUser(userQuanTri.getCompanyId(), matKhauTuSinh, nguoiLamThuTuc.getEmail(), nguoiLamThuTuc.getTenDoanhNghiep(), Constants.LOAI_NGUOI_LAM_THU_TUC_DN);
		
		if(userDn != null){
			DnDoanhNghiepUser nguoiLamThuTucUser = DnDoanhNghiepUserLocalServiceUtil.findByUserId(userDn.getUserId());
			
			if(nguoiLamThuTucUser == null){
				long nguoiLamThuTucUserId = CounterLocalServiceUtil.increment(DnDoanhNghiepUser.class.getName());
				
				nguoiLamThuTucUser = DnDoanhNghiepUserLocalServiceUtil.createDnDoanhNghiepUser(nguoiLamThuTucUserId);
				
				nguoiLamThuTucUser.setNguoiLamThuTucId(nguoiLamThuTucId);
				nguoiLamThuTucUser.setUserId(userDn.getUserId());
				nguoiLamThuTucUser.setMaster(Constants.IS_MASTER_ACCOUNT+"");
				nguoiLamThuTucUser.setTinhTrangHoatDong(Constants.TRANG_THAI_HOAT_DONG);
				nguoiLamThuTucUser.setToChucQuanLy(DuongBoConfigurationManager.getStrProp("id_org_doanhnghiep", "0"));
				nguoiLamThuTucUser.setTenTaiKhoan(userDn.getEmailAddress());
				nguoiLamThuTucUser.setTenNguoiDung(userDn.getFullName());
				nguoiLamThuTucUser.setNgayTaoTaiKhoan(nguoiLamThuTuc.getNgayDangKi());
				nguoiLamThuTucUser.setNgayMoTaiKhoan(now);
				
				DnDoanhNghiepUserLocalServiceUtil.updateDnDoanhNghiepUser(nguoiLamThuTucUser);
				
				nguoiLamThuTuc.setNgayKichHoat(new Date());
				
				DnDoanhNghiepLocalServiceUtil.updateDnDoanhNghiep(nguoiLamThuTuc);
				
				DangKyDoanhNghiepActionUtil.sendMailKHDoanhNghiep(nguoiLamThuTuc, matKhauTuSinh);
			} else {
				// da ton tai user trong he thong
				SessionErrors.add(actionRequest, DangKyMessageErrors.ERROR_ACTIVE);
				SessionErrors.add(actionRequest, DangKyMessageErrors.USER_ALREADY_EXISTS);
			}
		}
	}
	
	/**
	 * Ham gui mail cho doanh nghiep khi doanh nghiep dang ky
	 * 
	 * @param toEmail
	 */
	public static void sendMailDKDoanhNghiep(DnDoanhNghiep nguoiLamThuTuc) {
		
		String toEmail = nguoiLamThuTuc.getEmail();
		
		try {
			
			String fromEmail = DuongBoConfigurationManager.getStrProp("mail.from.default", "");
			String fromName = DuongBoConfigurationManager.getStrProp("mail.name.from.default", "");
			
			String subjectTemplateDN = ContentUtil.get("vn/dtt/duongbo/dangky/dependencies/dk_dn_subject.vm");

			String bodyTemplateDN = ContentUtil.get("vn/dtt/duongbo/dangky/dependencies/dk_dn_body.vm");

			String subjectDN = MailEngineUtil.getContent(subjectTemplateDN, null);
			String bodyDN = MailEngineUtil.getContent(bodyTemplateDN, null);
			
			// send mail cho doanh nghiep
			if(Validator.isNotNull(fromEmail) && Validator.isNotNull(toEmail)) {
				MailEngineUtil.send(toEmail, fromEmail, fromName, subjectDN, bodyDN);
			}
			
			// send mail cho quan tri de kich hoat
			String toEmailQT = DuongBoConfigurationManager.getStrProp("mail.from.default", "");
					
			String subjectTemplateQT = ContentUtil.get("vn/dtt/duongbo/dangky/dependencies/admin_dk_dn_subject.vm");

			String bodyTemplateQT = ContentUtil.get("vn/dtt/duongbo/dangky/dependencies/admin_dk_dn_body.vm");

			Map<String, Object> variablesQT = new HashMap<String, Object>();
			variablesQT.put("username", toEmail);

			String subjectQT = MailEngineUtil.getContent(subjectTemplateQT, variablesQT);
			String bodyQT = MailEngineUtil.getContent(bodyTemplateQT, variablesQT);
			
			if(Validator.isNotNull(fromEmail) && Validator.isNotNull(toEmail)) {
				MailEngineUtil.send(toEmailQT, fromEmail, fromName, subjectQT, bodyQT);
			}
			
			_log.info("===DK_DN_SUCCESS===" + toEmail);
		} catch (Exception e) {
			_log.info("===DK_DN_ERROR===" + toEmail);
			_log.error(e);
		}
	}
	
	/**
	 * Ham gui mail kich hoat doanh nghiep
	 * 
	 * @param nguoiLamThuTuc
	 */
	public static void sendMailKHDoanhNghiep(DnDoanhNghiep nguoiLamThuTuc, String matKhau) {
		
		String toEmail = nguoiLamThuTuc.getEmail();
		
		try {
			
			String fromEmail = DuongBoConfigurationManager.getStrProp("mail.from.default", "");
			String fromName = DuongBoConfigurationManager.getStrProp("mail.name.from.default", "");
			
			String subjectTemplate = ContentUtil.get("vn/dtt/duongbo/dangky/dependencies/kh_dn_subject.vm");

			String bodyTemplate = ContentUtil.get("vn/dtt/duongbo/dangky/dependencies/kh_dn_body.vm");

			Map<String, Object> variables = new HashMap<String, Object>();
			variables.put("fullname", nguoiLamThuTuc.getTenDoanhNghiep());
			variables.put("username", toEmail);
			variables.put("password", matKhau);
			
			String subject = MailEngineUtil.getContent(subjectTemplate, variables);
			String body = MailEngineUtil.getContent(bodyTemplate, variables);
			
			// send mail cho doanh nghiep
			if(Validator.isNotNull(fromEmail) && Validator.isNotNull(toEmail)) {
				MailEngineUtil.send(toEmail, fromEmail, fromName, subject, body);
			}
			
			_log.info("===KH_DN_SUCCESS===" + toEmail);
		} catch (Exception e) {
			_log.info("===KH_DN_ERROR===" + toEmail);
			_log.error(e);
		}
	}
	
	/**
	 * Ham gui mail kich hoat lai doanh nghiep
	 * 
	 * @param nguoiLamThuTuc
	 */
	public static void sendMailActiveDoanhNghiep(long nguoiLamThuTucId) {
		
		try {
			
			DnDoanhNghiep nguoiLamThuTuc = DnDoanhNghiepLocalServiceUtil.getDnDoanhNghiep(nguoiLamThuTucId);
			
			String toEmail = nguoiLamThuTuc.getEmail();
			
			String fromEmail = DuongBoConfigurationManager.getStrProp("mail.from.default", "");
			String fromName = DuongBoConfigurationManager.getStrProp("mail.name.from.default", "");
			
			String subjectTemplate = ContentUtil.get("vn/dtt/duongbo/dangky/dependencies/active_dn_subject.vm");

			String bodyTemplate = ContentUtil.get("vn/dtt/duongbo/dangky/dependencies/active_dn_body.vm");

			String subject = MailEngineUtil.getContent(subjectTemplate, null);
			String body = MailEngineUtil.getContent(bodyTemplate, null);
			
			// send mail cho doanh nghiep
			if(Validator.isNotNull(fromEmail) && Validator.isNotNull(toEmail)) {
				MailEngineUtil.send(toEmail, fromEmail, fromName, subject, body);
			}
			
			_log.info("===ACTIVE_DN_SUCCESS===" + nguoiLamThuTucId);
		} catch (Exception e) {
			_log.info("===ACTIVE_DN_ERROR===" + nguoiLamThuTucId);
			_log.error(e);
		}
	}
	
	/**
	 * Ham gui mail dung hoat dong doanh nghiep
	 * 
	 * @param nguoiLamThuTuc
	 */
	public static void sendMailInActiveDoanhNghiep(long nguoiLamThuTucId) {
		
		try {
			
			DnDoanhNghiep nguoiLamThuTuc = DnDoanhNghiepLocalServiceUtil.getDnDoanhNghiep(nguoiLamThuTucId);
			
			String toEmail = nguoiLamThuTuc.getEmail();
			
			String fromEmail = DuongBoConfigurationManager.getStrProp("mail.from.default", "");
			String fromName = DuongBoConfigurationManager.getStrProp("mail.name.from.default", "");
			
			String subjectTemplate = ContentUtil.get("vn/dtt/duongbo/dangky/dependencies/inactive_dn_subject.vm");

			String bodyTemplate = ContentUtil.get("vn/dtt/duongbo/dangky/dependencies/inactive_dn_body.vm");

			String subject = MailEngineUtil.getContent(subjectTemplate, null);
			String body = MailEngineUtil.getContent(bodyTemplate, null);
			
			// send mail cho doanh nghiep
			if(Validator.isNotNull(fromEmail) && Validator.isNotNull(toEmail)) {
				MailEngineUtil.send(toEmail, fromEmail, fromName, subject, body);
			}
			
			_log.info("===INACTIVE_DN_SUCCESS===" + nguoiLamThuTucId);
		} catch (Exception e) {
			_log.info("===INACTIVE_DN_ERROR===" + nguoiLamThuTucId);
			_log.error(e);
		}
	}
	
	/**
	 * Ham gui mail cho cong dan khi cong dan dang ky
	 * 
	 * @param toEmail
	 */
	public static void sendMailDKCongDan(DnDoanhNghiep nguoiLamThuTuc, String matKhau) {
		String toEmail = nguoiLamThuTuc.getEmail();
		
		try {
			
			String fromEmail = DuongBoConfigurationManager.getStrProp("mail.from.default", "");
			String fromName = DuongBoConfigurationManager.getStrProp("mail.name.from.default", "");
			
			String subjectTemplate = ContentUtil.get("vn/dtt/duongbo/dangky/dependencies/dk_cd_subject.vm");

			String bodyTemplate = ContentUtil.get("vn/dtt/duongbo/dangky/dependencies/dk_cd_body.vm");

			Map<String, Object> variables = new HashMap<String, Object>();
			variables.put("username", toEmail);
			variables.put("password", matKhau);
			
			String subject = MailEngineUtil.getContent(subjectTemplate, variables);
			String body = MailEngineUtil.getContent(bodyTemplate, variables);
			
			if(Validator.isNotNull(fromEmail) && Validator.isNotNull(toEmail)) {
				MailEngineUtil.send(toEmail, fromEmail, fromName, subject, body);
			}
			
			_log.info("===DK_CD_SUCCESS===" + toEmail);
		} catch (Exception e) {
			_log.info("===DK_CD_ERROR===" + toEmail);
			_log.error(e);
		}
	}
	
	public static boolean validateDangKyCongDan(ActionRequest actionRequest, List<String> errors, boolean addNew) throws SystemException {
		boolean valid = true;
		
		String cdTen = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_TEN);
		String cdTinhThanh = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_TINH_THANH);
		String cdQuanHuyen = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_QUAN_HUYEN);
		String cdPhuongXa = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_PHUONG_XA);
		String cdCMNDSo = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_CMND_SO);
		String cdCMNDNoiCap = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_CMND_NOI_CAP);
		String cdCMNDNgayCap = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_CMND_NGAY_CAP);
		String cdEmail = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.CD_EMAIL);
		
		if (Validator.isNull(cdTen)) {
			errors.add(DangKyMessageErrors.EMPTY_TEN_CONG_DAN);
			valid = false;
		}
		
		if (Validator.isNull(cdTinhThanh)) {
			errors.add(DangKyMessageErrors.EMPTY_TINH_THANH);
			valid = false;
		}
		
		if (Validator.isNull(cdQuanHuyen)) {
			errors.add(DangKyMessageErrors.EMPTY_QUAN_HUYEN);
			valid = false;
		}
		
		if (Validator.isNull(cdPhuongXa)) {
			errors.add(DangKyMessageErrors.EMPTY_PHUONG_XA);
			valid = false;
		}
		
		if (Validator.isNull(cdCMNDSo)) {
			errors.add(DangKyMessageErrors.EMPTY_SO_CMND);
			valid = false;
		}
		
		if (Validator.isNull(cdCMNDNoiCap)) {
			errors.add(DangKyMessageErrors.EMPTY_NOI_CAP);
			valid = false;
		}
		
		if (Validator.isNull(cdCMNDNgayCap)) {
			errors.add(DangKyMessageErrors.EMPTY_NGAY_CAP);
			valid = false;
		}
		
		if(addNew) {
			if (Validator.isNull(cdEmail)) {
				errors.add(DangKyMessageErrors.EMPTY_EMAIL);
				valid = false;
			} else {
				User user = UserLocalServiceUtil.fetchUserByEmailAddress(PortalUtil.getCompanyId(actionRequest), cdEmail);
				
				if(user != null || (user == null && existNguoiLamThuTucForRegister(cdEmail))) {
					errors.add(DangKyMessageErrors.USER_ALREADY_EXISTS);
					valid = false;
				}
			}
		}
		
		return valid;
	}
	
	public static boolean validateDangKyDoanhNghiep(ActionRequest actionRequest, List<String> errors, boolean addNew) throws SystemException {
		boolean valid = true;
		
		String dnTen = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_TEN);
		String dnTinhThanh = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_TINH_THANH);
		String dnQuanHuyen = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_QUAN_HUYEN);
		String dnPhuongXa = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_PHUONG_XA);
		String dnDienThoai = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_DIEN_THOAI);
		String dnEmail = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_EMAIL);
		String dnDKKDSo = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_DKKD_SO);
		String dnDKKDNgayCap = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_DKKD_NGAY_CAP);
		String dnDKKDNoiCap = ParamUtil.getString(actionRequest, NguoiLamThuTucTerm.DN_DKKD_NOI_CAP);
		
		if (Validator.isNull(dnTen)) {
			errors.add(DangKyMessageErrors.EMPTY_TEN_DOANH_NGHIEP);
			valid = false;
		}
		
		if (Validator.isNull(dnTinhThanh)) {
			errors.add(DangKyMessageErrors.EMPTY_TINH_THANH);
			valid = false;
		}
		
		if (Validator.isNull(dnQuanHuyen)) {
			errors.add(DangKyMessageErrors.EMPTY_QUAN_HUYEN);
			valid = false;
		}
		
		if (Validator.isNull(dnPhuongXa)) {
			errors.add(DangKyMessageErrors.EMPTY_PHUONG_XA);
			valid = false;
		}
		
		if (Validator.isNull(dnDienThoai)) {
			errors.add(DangKyMessageErrors.EMPTY_DIEN_THOAI);
			valid = false;
		}
		
		if(addNew) {
			if (Validator.isNull(dnEmail)) {
				errors.add(DangKyMessageErrors.EMPTY_EMAIL);
				valid = false;
			} else {
				User user = UserLocalServiceUtil.fetchUserByEmailAddress(PortalUtil.getCompanyId(actionRequest), dnEmail);
				
				if(user != null || (user == null && existNguoiLamThuTucForRegister(dnEmail))) {
					errors.add(DangKyMessageErrors.USER_ALREADY_EXISTS);
					valid = false;
				}
			}
		}
		
		if (Validator.isNull(dnDKKDSo)) {
			errors.add(DangKyMessageErrors.EMPTY_GIAY_CN_DKKD);
			valid = false;
		}
		
		if (Validator.isNull(dnDKKDNgayCap)) {
			errors.add(DangKyMessageErrors.EMPTY_NGAY_CAP);
			valid = false;
		}
		
		if (Validator.isNull(dnDKKDNoiCap)) {
			errors.add(DangKyMessageErrors.EMPTY_CO_QUAN_CAP);
			valid = false;
		}
		
		return valid;
	}
	
	public static boolean existNguoiLamThuTucForRegister(String email) {
		
		boolean exist = false;
		
		List<DnDoanhNghiep> listNguoiLamThuTuc = DnDoanhNghiepLocalServiceUtil.findByEmail(email);
		for(DnDoanhNghiep nguoiLamThuTuc : listNguoiLamThuTuc) {
			List<DnDoanhNghiepUser> listNguoiLamThuTucUser = DnDoanhNghiepUserLocalServiceUtil.findByDnNguoiLamThuTucUserID(nguoiLamThuTuc.getId());
			
			// Da dk tk DN va dang cho de active
			if(listNguoiLamThuTucUser == null || (listNguoiLamThuTucUser != null && listNguoiLamThuTucUser.size() == 0)) {
				exist = true;
				break;
			}
			
			if(listNguoiLamThuTucUser != null && listNguoiLamThuTucUser.size() > 0) {
				for(DnDoanhNghiepUser nguoiLamThuTucUser : listNguoiLamThuTucUser) {
					
					// Da ton tai tk dang hoat dong trong he thong
					if(!nguoiLamThuTucUser.getTinhTrangHoatDong().equalsIgnoreCase(Constants.TRANG_THAI_DA_XOA)) {
						exist = true;
						break;
					}
				}
			}
		}
		
		return exist;
	}
	
	private static Log _log = LogFactoryUtil.getLog(DangKyDoanhNghiepActionUtil.class);
}
