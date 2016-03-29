
package vn.dtt.duongthuy.maudon;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PortalUtil;

import vn.dtt.duongbo.maudon.xml.MauDonFactory;
import vn.dtt.duongbo.utils.format.DateUtils;

public class DonOnline {
	
	public static final String DON_DTTPHS101 = "DTTPHS101";
	
	public static final String DON_DTTPHS112 = "DTTPHS112";
	
	public static final String DON_DTTPHS123 = "DTTPHS123";
	
	public static final String DON_DTTPHS136 = "DTTPHS136";
	
	public static final String DON_DTTPHS147 = "DTTPHS147";
	
	public static final String DON_DTTPHS60 = "DTTPHS160";
	
	public static final String DON_DTTPHS70 = "DTTPHS170";
	
	public static final String DON_DTTPHS181 = "DTTPHS181";
	
	public static final String DON_DTTPHS192 = "DTTPHS192";
	
	public static final String DON_DTTPHS200 = "DTTPHS200";
	
	public static final String DON_DTTPHS209 = "DTTPHS209";
	
	public static final String DON_DTTPHS69 = "DTTPHS69";
	
	public static final String DON_DTTPHS76 = "DTTPHS76";
	
	public static final String DON_DTTPHS83 = "DTTPHS83";
	
	public static final String DON_DTTPHS90 = "DTTPHS90";
	
	public static final String HANG = "HANG";
	
	public static final String TEN = "TEN";
	
	public static final String QUOC_TICH = "QUOC_TICH";
	
	public static final String GIOI_TINH = "GIOI_TINH";
	
	public static final String NGAY_SINH = "NGAY_SINH";
	
	public static final String NOI_CO_TRU = "NOI_CO_TRU";
	
	public static final String DIEN_THOAI = "DIEN_THOAI";
	
	public static final String EMAIL = "EMAIL";
	
	public static final String SO_CMND = "SO_CMND";
	
	public static final String NGAY_CAP_CMND = "NGAY_CAP_CMND";
	
	public static final String NOI_CAP_CMND = "NOI_CAP_CMND";
	
	public static final String TRUONG_TOT_NGHIEP = "TRUONG_TOT_NGHIEP";
	
	public static final String NGANH_TOT_NGHIEP = "NGANH_TOT_NGHIEP";
	
	public static final String KHOA_TOT_NGHIEP = "KHOA_TOT_NGHIEP";
	
	public static final String SO_BANG = "SO_BANG";
	
	public static final String NGAY_CAP_BANG = "NGAY_CAP_BANG";
	
	public static final String CUA = "CUA";
	
	public static final String SO_QUYET_DINH = "SO_QUYET_DINH";
	
	public static final String NGAY_QUYET_DINH = "NGAY_QUYET_DINH";
	
	public static final String DIEU_KIEN = "DIEU_KIEN";
	
	public static final String TINH_THANH_PHO = "TINH_THANH_PHO";
	
	public static final String QTLV_TU_NGAY = "QTLV_TU_NGAY";
	
	public static final String QTLV_DEN_NGAY = "QTLV_DEN_NGAY";
	
	public static final String QTLV_CHUC_DANH = "QTLV_CHUC_DANH";
	
	public static final String QTLV_NOI_LAM_VIEC = "QTLV_NOI_LAM_VIEC";
	
	public static final String QTLV_SO_PTTND = "QTLV_SO_PTTND";
	
	public static final String QTLV_GHI_CHU = "QTLV_GHI_CHU";
	
	public static final String CAPTAU = "CAPTAU";
	
	public static final String QUOCGIA_SANXUAT = "QUOCGIA_SANXUAT";
	
	public static final String CQCP = "CQCP";
	
	public static final String KINH_GUI = "KINH_GUI";
	
	public static final String TO_CHUC_CA_NHAN = "TO_CHUC_CA_NHAN";
	
	public static final String DAI_DIEN = "DAI_DIEN";
	
	public static final String TRU_SO_CHINH = "TRU_SO_CHINH";
	
	public static final String TEN_PHUONG_TIEN = "TEN_PHUONG_TIEN";
	
	public static final String KY_HIEU_THIET_KE = "KY_HIEU_THIET_KE";
	
	public static final String CONG_DUNG_TAU = "CONG_DUNG_TAU";
	
	public static final String NAM_DONG = "NAM_DONG";
	
	public static final String NOI_DONG = "NOI_DONG";
	
	public static final String CAP_TAU = "CAP_TAU";
	
	public static final String VAT_LIEU_VO = "VAT_LIEU_VO";
	
	public static final String CHIEU_DAI_THIET_KE = "CHIEU_DAI_THIET_KE";
	
	public static final String CHIEU_DAI_LON_NHAT = "CHIEU_DAI_LON_NHAT";
	
	public static final String CHIEU_CAO_MAN = "CHIEU_CAO_MAN";
	
	public static final String CHIEU_CHIM = "CHIEU_CHIM";
	
	public static final String CHIEU_RONG_THIET_KE = "CHIEU_RONG_THIET_KE";
	
	public static final String CHIEU_RONG_LON_NHAT = "CHIEU_RONG_LON_NHAT";
	
	public static final String MAN_KHO = "MAN_KHO";
	
	public static final String TRONG_TAI_TOAN_PHAN = "TRONG_TAI_TOAN_PHAN";
	
	public static final String SO_NGUOI_DUOC_PHEP_CHO = "SO_NGUOI_DUOC_PHEP_CHO";
	
	public static final String SUC_KEO_DAY = "SUC_KEO_DAY";
	
	public static final String SO_LUONG_MAY_CHINH = "SO_LUONG_MAY_CHINH";
	
	public static final String KIEU_MAY_CHINH = "KIEU_MAY_CHINH";
	
	public static final String CONG_SUAT_MAY_CHINH = "CONG_SUAT_MAY_CHINH";
	
	public static final String NUOC_SAN_XUAT_MAY_CHINH = "NUOC_SAN_XUAT_MAY_CHINH";
	
	public static final String SO_LUONG_MAY_PHU = "SO_LUONG_MAY_PHU";
	
	public static final String KIEU_MAY_PHU = "KIEU_MAY_PHU";
	
	public static final String CONG_SUAT_MAY_PHU = "CONG_SUAT_MAY_PHU";
	
	public static final String NUOC_SAN_XUAT_MAY_PHU = "NUOC_SAN_XUAT_MAY_PHU";	
	
	public static final String GIAY_PHEP_NHAP_KHAU = "GIAY_PHEP_NHAP_KHAU";
	
	public static final String NGAY_GIAY_PHEP_NHAP_KHAU = "NGAY_GIAY_PHEP_NHAP_KHAU";
	
	public static final String CO_QUAN_CAP_NK = "CO_QUAN_CAP_NK";
	
	public static final String GIAY_CN_ATKT_BVMT = "GIAY_CN_ATKT_BVMT";
	
	public static final String CO_QUAN_CAP_CN = "CO_QUAN_CAP_CN";
	
	public static final String HOA_DON_NOP_LE_PHI = "HOA_DON_NOP_LE_PHI";
	
	public static final String NGAY_HOA_DON = "NGAY_HOA_DON";
	
	public static final String PHUONG_TIEN_DUOC_MUA_HOAC_DONG = "PHUONG_TIEN_DUOC_MUA_HOAC_DONG";
	
	public static final String PHUONG_TIEN_DUOC_MUA_HOAC_DONG_TAI_DIA_CHI = "PHUONG_TIEN_DUOC_MUA_HOAC_DONG_TAI_DIA_CHI";
	
	public static final String MUA_TANG_DONG = "MUA_TANG_DONG";
	
	public static final String THOI_GIAN_MUA_TANG_DONG = "THOI_GIAN_MUA_TANG_DONG";
	
	public static final String TEN_CO_QUAN_DANG_KY_TRUOC_DAY = "TEN_CO_QUAN_DANG_KY_TRUOC_DAY";
	
	public static final String LY_DO_CAP_LAI = "LY_DO_CAP_LAI";
	
	public static final String THONG_SO_CO_BAN = "THONG_SO_CO_BAN";
	
	public static final String SO_DANG_KY = "SO_DANG_KY";
	
	public static final String MUA_LAI_HOAC_DIEU_CHUYEN = "MUA_LAI_HOAC_DIEU_CHUYEN";
	
	public static final String MUA_LAI_HOAC_DIEU_CHUYEN_TU_DON_VI = "MUA_LAI_HOAC_DIEU_CHUYEN_TU_DON_VI";
	
	public static final String MUA_LAI_HOAC_DIEU_CHUYEN_DIA_CHI = "MUA_LAI_HOAC_DIEU_CHUYEN_DIA_CHI";
	
	public static final String DIA_CHI_CAP_LAI_MOI = "DIA_CHI_CAP_LAI_MOI";
	
	public static final String LY_DO_THAY_DOI_DIA_CHI = "LY_DO_THAY_DOI_DIA_CHI";
	
	public static final String LY_DO_XOA_PHUONG_TIEN = "LY_DO_XOA_PHUONG_TIEN";
	
	public static final String NAM_HOAT_DONG = "NAM_HOAT_DONG";
	
	public static final String NGAY_CAP_PHUONG_TIEN = "NGAY_CAP_PHUONG_TIEN";
	
	public static final String ROW_INDEX = "rowIndex";
	
	public static final String DIA_CHI_DANG_KY_TRUOC_DAY = "DIA_CHI_DANG_KY_TRUOC_DAY";
	
	public static final String NGAY_DANG_KY_TRUOC_DAY = "NGAY_DANG_KY_TRUOC_DAY";

	
	
	public DonOnline(PortletRequest portletRequest) {
		HttpServletRequest request = PortalUtil.getHttpServletRequest(portletRequest);
		setDonOnLine(request);
	}
	
	public DonOnline(HttpServletRequest request) {
		setDonOnLine(request);
	}
	
	public String getNoiDungXML() throws IOException {
		return "";
	}
	
	public static Object getDonOnline(String noiDungXML) {
		Object donOnline = null;
		
		if(Validator.isNotNull(noiDungXML)) {
			List<Object> listObject = MauDonFactory.converXMLMessagesContentToObject(noiDungXML);
			
			if(listObject != null && listObject.size() > 0) {
				donOnline = listObject.get(0);
			}
		}
		
		return donOnline;
	}
	
	private void setDonOnLine(HttpServletRequest request) {
		capTau = ParamUtil.getString(request, CAP_TAU);
		vatLieuVo = ParamUtil.getString(request, VAT_LIEU_VO);
		chieuDaiThietKe= ParamUtil.getString(request, CHIEU_DAI_THIET_KE);
		chieuDaiLonNhat = ParamUtil.getString(request, CHIEU_DAI_LON_NHAT);
		chieuCaoMan = ParamUtil.getString(request, CHIEU_CAO_MAN);
		chieuChim = ParamUtil.getString(request, CHIEU_CHIM);
		chieuRongThietKe = ParamUtil.getString(request, CHIEU_RONG_THIET_KE);
		chieuRongLonNhat = ParamUtil.getString(request, CHIEU_RONG_LON_NHAT);
		manKho = ParamUtil.getString(request, MAN_KHO);
		trongTaiToanPhan = ParamUtil.getString(request, TRONG_TAI_TOAN_PHAN);
		soNguoiDuocPhepCho = ParamUtil.getString(request, SO_NGUOI_DUOC_PHEP_CHO);
		sucKeoDay = ParamUtil.getString(request, SUC_KEO_DAY);
		soLuongMayChinh = ParamUtil.getString(request, SO_LUONG_MAY_CHINH);
		kieuMayChinh  = ParamUtil.getString(request, KIEU_MAY_CHINH);
		congSuatMayChinh = ParamUtil.getString(request, CONG_SUAT_MAY_CHINH);
		nuocSanXuatMayChinh  = ParamUtil.getString(request, NUOC_SAN_XUAT_MAY_CHINH);
		soLuongMayPhu = ParamUtil.getString(request, SO_LUONG_MAY_PHU);
		kieuMayPhu = ParamUtil.getString(request, KIEU_MAY_PHU);
		congSuatMayPhu = ParamUtil.getString(request, CONG_SUAT_MAY_PHU);
		nuocSanXuatMayPhu = ParamUtil.getString(request, NUOC_SAN_XUAT_MAY_PHU);
		giayPhepNhapKhau = ParamUtil.getString(request, GIAY_PHEP_NHAP_KHAU);
		coQuanCapNhapKhau  = ParamUtil.getString(request, CO_QUAN_CAP_NK);
		giayCN = ParamUtil.getString(request, GIAY_CN_ATKT_BVMT);
		coQuanCapCN = ParamUtil.getString(request, CO_QUAN_CAP_CN);
		hoaDonNopLePhi = ParamUtil.getString(request, HOA_DON_NOP_LE_PHI);
		namDong = ParamUtil.getString(request, NAM_DONG);
		noiDong = ParamUtil.getString(request, NOI_DONG);
		congDung = ParamUtil.getString(request, CONG_DUNG_TAU);
		kyHieuThietKe = ParamUtil.getString(request, KY_HIEU_THIET_KE);
		tenPhuongTien = ParamUtil.getString(request, TEN_PHUONG_TIEN);
		truSoChinh = ParamUtil.getString(request, TRU_SO_CHINH);
		daiDien = ParamUtil.getString(request, DAI_DIEN);
		vatLieuVo = ParamUtil.getString(request, VAT_LIEU_VO);
		kinhGui = ParamUtil.getString(request, KINH_GUI);
		tenToiLa = ParamUtil.getString(request, TEN);
		quocTich = ParamUtil.getString(request, QUOC_TICH);
		gioiTinh = ParamUtil.getString(request, GIOI_TINH);
		ngaySinh = ParamUtil.getString(request, NGAY_SINH);
		noiCuTru = ParamUtil.getString(request, NOI_CO_TRU);
		soDienThoai = ParamUtil.getString(request, DIEN_THOAI);
		email = ParamUtil.getString(request, EMAIL);
		soCMND = ParamUtil.getString(request, SO_CMND);
		noiCapCMND = ParamUtil.getString(request, NOI_CAP_CMND);
		ngayCapCMND = ParamUtil.getString(request, NGAY_CAP_CMND);
		nganhHoc = ParamUtil.getString(request, NGANH_TOT_NGHIEP);
		khoaHoc = ParamUtil.getString(request, KHOA_TOT_NGHIEP);
		truongHoc = ParamUtil.getString(request, TRUONG_TOT_NGHIEP);
		soGCN = ParamUtil.getString(request, SO_BANG);
		ngayCapGCN = ParamUtil.getString(request, NGAY_CAP_BANG);
		quyetDinhSo = ParamUtil.getString(request, SO_QUYET_DINH);
		ngayQuyetDinh = ParamUtil.getString(request, NGAY_QUYET_DINH);
		cua = ParamUtil.getString(request, CUA);
		doiChieu = ParamUtil.getString(request, DIEU_KIEN);
		tinhThanhPho = ParamUtil.getString(request, TINH_THANH_PHO);
		ngayTao = DateUtils.parseDateToTringDDMMYYY(new Date());
		/*qtlvTuNgays = ParamUtil.getParameterValues(request, QTLV_TU_NGAY);
		qtlvDenNgays = ParamUtil.getParameterValues(request, QTLV_DEN_NGAY);
		qtlvChucDanhs = ParamUtil.getParameterValues(request, QTLV_CHUC_DANH);
		qtlvNoiLamViecs = ParamUtil.getParameterValues(request, QTLV_NOI_LAM_VIEC);
		qtlvSoPTTNDs = ParamUtil.getParameterValues(request, QTLV_SO_PTTND);
		qtlvGhiChus = ParamUtil.getParameterValues(request, QTLV_GHI_CHU);*/
		hoaDonNgay = ParamUtil.getString(request, NGAY_HOA_DON);
		toChucCaNhan = ParamUtil.getString(request, TO_CHUC_CA_NHAN);
		ngayGiayPhepNhapKhau = ParamUtil.getString(request, NGAY_GIAY_PHEP_NHAP_KHAU);
		setHang(ParamUtil.getString(request, HANG));
		ngayCapPhuongTien = ParamUtil.getString(request, NGAY_CAP_PHUONG_TIEN);
		tenCoQuanDangKyTruocDay = ParamUtil.getString(request, TEN_CO_QUAN_DANG_KY_TRUOC_DAY);
		lyDoCapLai = ParamUtil.getString(request, LY_DO_CAP_LAI);
		thongSoCoBan = ParamUtil.getString(request, THONG_SO_CO_BAN);
		soDangKy = ParamUtil.getString(request, SO_DANG_KY);
		//136
		phuongTienMuaLaiHayDongLai = ParamUtil.getString(request, PHUONG_TIEN_DUOC_MUA_HOAC_DONG);
	//	phuongTienNayDuocMuaLaiHayChuyenNhuong = ParamUtil.getString(request, PHUONG_TIEN_DUOC_MUA_HOAC_DONG_TAI_DIA_CHI);
		thoiGianMuaChon = ParamUtil.getString(request, MUA_TANG_DONG);
		thoiGianMuaNhap = ParamUtil.getString(request, THOI_GIAN_MUA_TANG_DONG);
		
		
		//170
		phuongTienNayDuocMuaLaiHayChuyenNhuong = ParamUtil.getString(request, MUA_LAI_HOAC_DIEU_CHUYEN);
		nguoiMuaLai = ParamUtil.getString(request, MUA_LAI_HOAC_DIEU_CHUYEN_TU_DON_VI);
		diaChiNguoiMua = ParamUtil.getString(request, MUA_LAI_HOAC_DIEU_CHUYEN_DIA_CHI);
		//end 170
		//192
		diaChiCapLaiMoi = ParamUtil.getString(request, DIA_CHI_CAP_LAI_MOI);
		lyDoThayDoiDiaChi = ParamUtil.getString(request, LY_DO_THAY_DOI_DIA_CHI);
		//end 192
		//209
		lyDoXoaDangKy = ParamUtil.getString(request, LY_DO_XOA_PHUONG_TIEN);
		rowIndex = ParamUtil.getIntegerValues(request, ROW_INDEX);
		//bo sung 169 170
		diaChiDangKyTruocDay = ParamUtil.getString(request, DIA_CHI_DANG_KY_TRUOC_DAY);
		ngayDangKyTruocDay = ParamUtil.getString(request, NGAY_DANG_KY_TRUOC_DAY);
		
		int i = 0;
		qtlvTuNgays = new String[rowIndex.length];
		qtlvDenNgays = new String[rowIndex.length];
		qtlvChucDanhs = new String[rowIndex.length];
		qtlvNoiLamViecs = new String[rowIndex.length];
		qtlvSoPTTNDs = new String[rowIndex.length];
		qtlvGhiChus = new String[rowIndex.length];
		
		for(int index : rowIndex) {
			qtlvTuNgays[i] = ParamUtil.getString(request, QTLV_TU_NGAY + index);
			qtlvDenNgays[i] = ParamUtil.getString(request, QTLV_DEN_NGAY + index);
			qtlvChucDanhs[i] = ParamUtil.getString(request, QTLV_CHUC_DANH + index);
			qtlvNoiLamViecs[i] = ParamUtil.getString(request, QTLV_NOI_LAM_VIEC + index);
			qtlvSoPTTNDs[i] = ParamUtil.getString(request, QTLV_SO_PTTND + index);
			qtlvGhiChus[i] = ParamUtil.getString(request, QTLV_GHI_CHU + index);
			i++;
		}
	}
	
	public String getKinhGui() {
		return kinhGui;
	}
	public void setKinhGui(String kinhGui) {
		this.kinhGui = kinhGui;
	}

	public String getTenToiLa() {
		return tenToiLa;
	}

	public void setTenToiLa(String tenToiLa) {
		this.tenToiLa = tenToiLa;
	}

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getNoiCuTru() {
		return noiCuTru;
	}

	public void setNoiCuTru(String noiCuTru) {
		this.noiCuTru = noiCuTru;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}

	public String getNoiCapCMND() {
		return noiCapCMND;
	}

	public void setNoiCapCMND(String noiCapCMND) {
		this.noiCapCMND = noiCapCMND;
	}

	public String getNgayCapCMND() {
		return ngayCapCMND;
	}

	public void setNgayCapCMND(String ngayCapCMND) {
		this.ngayCapCMND = ngayCapCMND;
	}

	public String getNganhHoc() {
		return nganhHoc;
	}

	public void setNganhHoc(String nganhHoc) {
		this.nganhHoc = nganhHoc;
	}

	public String getKhoaHoc() {
		return khoaHoc;
	}

	public void setKhoaHoc(String khoaHoc) {
		this.khoaHoc = khoaHoc;
	}

	public String getTruongHoc() {
		return truongHoc;
	}

	public void setTruongHoc(String truongHoc) {
		this.truongHoc = truongHoc;
	}

	public String getSoGCN() {
		return soGCN;
	}

	public void setSoGCN(String soGCN) {
		this.soGCN = soGCN;
	}

	public String getNgayCapGCN() {
		return ngayCapGCN;
	}

	public void setNgayCapGCN(String ngayCapGCN) {
		this.ngayCapGCN = ngayCapGCN;
	}

	public String getQuyetDinhSo() {
		return quyetDinhSo;
	}

	public void setQuyetDinhSo(String quyetDinhSo) {
		this.quyetDinhSo = quyetDinhSo;
	}

	public String getNgayQuyetDinh() {
		return ngayQuyetDinh;
	}

	public void setNgayQuyetDinh(String ngayQuyetDinh) {
		this.ngayQuyetDinh = ngayQuyetDinh;
	}

	public String getCua() {
		return cua;
	}

	public void setCua(String cua) {
		this.cua = cua;
	}

	public String getDoiChieu() {
		return doiChieu;
	}

	public void setDoiChieu(String doiChieu) {
		this.doiChieu = doiChieu;
	}

	public String getTinhThanhPho() {
		return tinhThanhPho;
	}

	public void setTinhThanhPho(String tinhThanhPho) {
		this.tinhThanhPho = tinhThanhPho;
	}

	public String getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(String ngayTao) {
		this.ngayTao = ngayTao;
	}
	
	public String getHang() {
		return hang;
	}
	
	public void setHang(String hang) {
		this.hang = hang;
	}

	public String[] getQtlvTuNgays() {
		return qtlvTuNgays;
	}

	public void setQtlvTuNgays(String[] qtlvTuNgays) {
		this.qtlvTuNgays = qtlvTuNgays;
	}

	public String[] getQtlvDenNgays() {
		return qtlvDenNgays;
	}

	public void setQtlvDenNgays(String[] qtlvDenNgays) {
		this.qtlvDenNgays = qtlvDenNgays;
	}

	public String[] getQtlvChucDanhs() {
		return qtlvChucDanhs;
	}

	public void setQtlvChucDanhs(String[] qtlvChucDanhs) {
		this.qtlvChucDanhs = qtlvChucDanhs;
	}

	public String[] getQtlvNoiLamViecs() {
		return qtlvNoiLamViecs;
	}

	public void setQtlvNoiLamViecs(String[] qtlvNoiLamViecs) {
		this.qtlvNoiLamViecs = qtlvNoiLamViecs;
	}

	public String[] getQtlvSoPTTNDs() {
		return qtlvSoPTTNDs;
	}

	public void setQtlvSoPTTNDs(String[] qtlvSoPTTNDs) {
		this.qtlvSoPTTNDs = qtlvSoPTTNDs;
	}

	public String[] getQtlvGhiChus() {
		return qtlvGhiChus;
	}

	public void setQtlvGhiChus(String[] qtlvGhiChus) {
		this.qtlvGhiChus = qtlvGhiChus;
	}

	public String getToChucCaNhan() {
		return toChucCaNhan;
	}

	public void setToChucCaNhan(String toChucCaNhan) {
		this.toChucCaNhan = toChucCaNhan;
	}

	public String getDaiDien() {
		return daiDien;
	}

	public void setDaiDien(String daiDien) {
		this.daiDien = daiDien;
	}

	public String getTruSoChinh() {
		return truSoChinh;
	}

	public void setTruSoChinh(String truSoChinh) {
		this.truSoChinh = truSoChinh;
	}

	public String getTenPhuongTien() {
		return tenPhuongTien;
	}

	public void setTenPhuongTien(String tenPhuongTien) {
		this.tenPhuongTien = tenPhuongTien;
	}

	public String getKyHieuThietKe() {
		return kyHieuThietKe;
	}

	public void setKyHieuThietKe(String kyHieuThietKe) {
		this.kyHieuThietKe = kyHieuThietKe;
	}

	public String getCongDung() {
		return congDung;
	}

	public void setCongDung(String congDung) {
		this.congDung = congDung;
	}

	public String getNamDong() {
		return namDong;
	}

	public void setNamDong(String namDong) {
		this.namDong = namDong;
	}

	public String getNoiDong() {
		return noiDong;
	}

	public void setNoiDong(String noiDong) {
		this.noiDong = noiDong;
	}

	public String getCapTau() {
		return capTau;
	}

	public void setCapTau(String capTau) {
		this.capTau = capTau;
	}

	public String getVatLieuVo() {
		return vatLieuVo;
	}

	public void setVatLieuVo(String vatLieuVo) {
		this.vatLieuVo = vatLieuVo;
	}

	public String getChieuDaiThietKe() {
		return chieuDaiThietKe;
	}

	public void setChieuDaiThietKe(String chieuDaiThietKe) {
		this.chieuDaiThietKe = chieuDaiThietKe;
	}

	public String getChieuDaiLonNhat() {
		return chieuDaiLonNhat;
	}

	public void setChieuDaiLonNhat(String chieuDaiLonNhat) {
		this.chieuDaiLonNhat = chieuDaiLonNhat;
	}

	public String getChieuCaoMan() {
		return chieuCaoMan;
	}

	public void setChieuCaoMan(String chieuCaoMan) {
		this.chieuCaoMan = chieuCaoMan;
	}

	public String getChieuChim() {
		return chieuChim;
	}

	public void setChieuChim(String chieuChim) {
		this.chieuChim = chieuChim;
	}

	public String getChieuRongThietKe() {
		return chieuRongThietKe;
	}

	public void setChieuRongThietKe(String chieuRongThietKe) {
		this.chieuRongThietKe = chieuRongThietKe;
	}

	public String getChieuRongLonNhat() {
		return chieuRongLonNhat;
	}

	public void setChieuRongLonNhat(String chieuRongLonNhat) {
		this.chieuRongLonNhat = chieuRongLonNhat;
	}

	public String getManKho() {
		return manKho;
	}

	public void setManKho(String manKho) {
		this.manKho = manKho;
	}

	public String getTrongTaiToanPhan() {
		return trongTaiToanPhan;
	}

	public void setTrongTaiToanPhan(String trongTaiToanPhan) {
		this.trongTaiToanPhan = trongTaiToanPhan;
	}

	public String getSoNguoiDuocPhepCho() {
		return soNguoiDuocPhepCho;
	}

	public void setSoNguoiDuocPhepCho(String soNguoiDuocPhepCho) {
		this.soNguoiDuocPhepCho = soNguoiDuocPhepCho;
	}

	public String getSucKeoDay() {
		return sucKeoDay;
	}

	public void setSucKeoDay(String sucKeoDay) {
		this.sucKeoDay = sucKeoDay;
	}

	public String getSoLuongMayPhu() {
		return soLuongMayPhu;
	}

	public void setSoLuongMayPhu(String soLuongMayPhu) {
		this.soLuongMayPhu = soLuongMayPhu;
	}

	public String getKieuMayPhu() {
		return kieuMayPhu;
	}

	public void setKieuMayPhu(String kieuMayPhu) {
		this.kieuMayPhu = kieuMayPhu;
	}

	public String getCongSuatMayPhu() {
		return congSuatMayPhu;
	}

	public void setCongSuatMayPhu(String congSuatMayPhu) {
		this.congSuatMayPhu = congSuatMayPhu;
	}

	public String getNuocSanXuatMayPhu() {
		return nuocSanXuatMayPhu;
	}

	public void setNuocSanXuatMayPhu(String nuocSanXuatMayPhu) {
		this.nuocSanXuatMayPhu = nuocSanXuatMayPhu;
	}

	public String getGiayPhepNhapKhau() {
		return giayPhepNhapKhau;
	}

	public void setGiayPhepNhapKhau(String giayPhepNhapKhau) {
		this.giayPhepNhapKhau = giayPhepNhapKhau;
	}

	public String getCoQuanCapNhapKhau() {
		return coQuanCapNhapKhau;
	}

	public void setCoQuanCapNhapKhau(String coQuanCapNhapKhau) {
		this.coQuanCapNhapKhau = coQuanCapNhapKhau;
	}

	public String getGiayCN() {
		return giayCN;
	}

	public void setGiayCN(String giayCN) {
		this.giayCN = giayCN;
	}

	public String getCoQuanCapCN() {
		return coQuanCapCN;
	}

	public void setCoQuanCapCN(String coQuanCapCN) {
		this.coQuanCapCN = coQuanCapCN;
	}

	public String getHoaDonNopLePhi() {
		return hoaDonNopLePhi;
	}

	public void setHoaDonNopLePhi(String hoaDonNopLePhi) {
		this.hoaDonNopLePhi = hoaDonNopLePhi;
	}

	public String getHoaDonNgay() {
		return hoaDonNgay;
	}

	public void setHoaDonNgay(String hoaDonNgay) {
		this.hoaDonNgay = hoaDonNgay;
	}
	
	public String getSoLuongMayChinh() {
		return soLuongMayChinh;
	}

	public void setSoLuongMayChinh(String soLuongMayChinh) {
		this.soLuongMayChinh = soLuongMayChinh;
	}
	
	public String getKieuMayChinh() {
		return kieuMayChinh;
	}

	public void setKieuMayChinh(String kieuMayChinh) {
		this.kieuMayChinh = kieuMayChinh;
	}
	//
	public String getCongSuatMayChinh() {
		return congSuatMayChinh;
	}

	public void setCongSuatMayChinh(String congSuatMayChinh) {
		this.congSuatMayChinh = congSuatMayChinh;
	}
	//
	public String getNuocSanXuatMayChinh() {
		return nuocSanXuatMayChinh;
	}

	public void setNuocSanXuatMayChinh(String nuocSanXuatMayChinh) {
		this.nuocSanXuatMayChinh = nuocSanXuatMayChinh;
	}
	
	public String getNgayGiayPhepNhapKhau() {
		return ngayGiayPhepNhapKhau;
	}

	public void setNgayPhepNhapKhau(String ngayGiayPhepNhapKhau) {
		this.ngayGiayPhepNhapKhau = ngayGiayPhepNhapKhau;
	}
	
	public String getPhuongTienMuaLaiHayDongLai() {
		return phuongTienMuaLaiHayDongLai;
	}

	public void setPhuongTienMuaLaiHayDongLai(String phuongTienMuaLaiHayDongLai) {
		this.phuongTienMuaLaiHayDongLai = phuongTienMuaLaiHayDongLai;
	}
	//
	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	//
	public String getThoiGianMuaChon() {
		return thoiGianMuaChon;
	}

	public void setThoiGianMuaChon(String thoiGianMuaChon) {
		this.thoiGianMuaChon = thoiGianMuaChon;
	}
	//
	public String getThoiGianMuaNhap() {
		return thoiGianMuaNhap;
	}

	public void sethoiGianMuaNhap(String thoiGianMuaNhap) {
		this.thoiGianMuaNhap = thoiGianMuaNhap;
	}
	//
	public String getThoiGianNopLePhi() {
		return thoiGianNopLePhi;
	}

	public void setThoiGianNopLePhi(String thoiGianNopLePhi) {
		this.thoiGianNopLePhi = thoiGianNopLePhi;
	}

	private String thoiGianMuaNhap;
	private String thoiGianNopLePhi;
	private String phuongTienMuaLaiHayDongLai;
	private String diaChi;
	private String thoiGianMuaChon;

	private String kinhGui;
	private String tenToiLa;
	private String quocTich;
	private String gioiTinh;
	private String ngaySinh;
	private String noiCuTru;
	private String soDienThoai;
	private String email;
	private String soCMND;
	private String noiCapCMND;
	private String ngayCapCMND;
	private String nganhHoc;
	private String khoaHoc;
	private String truongHoc;
	private String soGCN;
	private String ngayCapGCN;
	private String quyetDinhSo;
	private String ngayQuyetDinh;
	private String cua;
	private String doiChieu;
	private String tinhThanhPho;
	private String ngayTao;
	private String hang;
	private String[] qtlvTuNgays;
	private String[] qtlvDenNgays;
	private String[] qtlvChucDanhs;
	private String[] qtlvNoiLamViecs;
	private String[] qtlvSoPTTNDs;
	private String[] qtlvGhiChus;
	
	private String nuocSanXuatMayChinh;
	private String congSuatMayChinh;
	private String kieuMayChinh;
	private String soLuongMayChinh;
	private String toChucCaNhan;
	private String daiDien;
	private String truSoChinh;
	private String tenPhuongTien;
	private String kyHieuThietKe;
	private String congDung;
	private String namDong;
	private String noiDong;
	private String capTau;
	private String vatLieuVo;
	private String chieuDaiThietKe;
	private String chieuDaiLonNhat;
	private String chieuCaoMan;
	private String chieuChim;
	private String chieuRongThietKe;
	private String chieuRongLonNhat;
	private String manKho;
	private String trongTaiToanPhan;
	private String soNguoiDuocPhepCho;
	private String sucKeoDay;
	private String soLuongMayPhu;
	private String kieuMayPhu;
	private String congSuatMayPhu;
	private String nuocSanXuatMayPhu;
	private String giayPhepNhapKhau;
	private String coQuanCapNhapKhau;
	private String giayCN;
	private String coQuanCapCN;
	private String hoaDonNopLePhi;
	private String hoaDonNgay;
	private String ngayGiayPhepNhapKhau;
	private int[] rowIndex;
	
	public String getLyDoCapLai() {
		return lyDoCapLai;
	}

	public void setLyDoCapLai(String lyDoCapLai) {
		this.lyDoCapLai = lyDoCapLai;
	}

	public String getThongSoCoBan() {
		return thongSoCoBan;
	}

	public void setThongSoCoBan(String thongSoCoBan) {
		this.thongSoCoBan = thongSoCoBan;
	}

	public String getTenCoQuanDangKyTruocDay() {
		return tenCoQuanDangKyTruocDay;
	}

	public void setTenCoQuanDangKyTruocDay(String tenCoQuanDangKyTruocDay) {
		this.tenCoQuanDangKyTruocDay = tenCoQuanDangKyTruocDay;
	}

	private String ngayCapPhuongTien;
	private String lyDoCapLai;
	private String thongSoCoBan;
	private String tenCoQuanDangKyTruocDay;
	private String soDangKy;
	//170
	private String phuongTienNayDuocMuaLaiHayChuyenNhuong;
	private String nguoiMuaLai;
	private String diaChiNguoiMua;
    //end 170
	//192
	private String diaChiCapLaiMoi;
	private String lyDoThayDoiDiaChi;
	//end 192
	//209
	private String lyDoXoaDangKy;
	
	//BO SUNG 160 170
	private String diaChiDangKyTruocDay;
	private String ngayDangKyTruocDay;
	//end 160 170
	
	
	public String getDiaChiDangKyTruocDay() {
		return diaChiDangKyTruocDay;
	}

	public void setDiaChiDangKyTruocDay(String diaChiDangKyTruocDay) {
		this.diaChiDangKyTruocDay = diaChiDangKyTruocDay;
	}

	public String getNgayDangKyTruocDay() {
		return ngayDangKyTruocDay;
	}

	public void setNgayDangKyTruocDay(String ngayDangKyTruocDay) {
		this.ngayDangKyTruocDay = ngayDangKyTruocDay;
	}

	public String getLyDoXoaDangKy() {
		return lyDoXoaDangKy;
	}

	public void setLyDoXoaDangKy(String lyDoXoaDangKy) {
		this.lyDoXoaDangKy = lyDoXoaDangKy;
	}

	public String getLyDoThayDoiDiaChi() {
		return lyDoThayDoiDiaChi;
	}

	public void setLyDoThayDoiDiaChi(String lyDoThayDoiDiaChi) {
		this.lyDoThayDoiDiaChi = lyDoThayDoiDiaChi;
	}

	public String getDiaChiCapLaiMoi() {
		return diaChiCapLaiMoi;
	}

	public void setDiaChiCapLaiMoi(String diaChiCapLaiMoi) {
		this.diaChiCapLaiMoi = diaChiCapLaiMoi;
	}

	public String getSoDangKy() {
		return soDangKy;
	}

	public String getPhuongTienNayDuocMuaLaiHayChuyenNhuong() {
		return phuongTienNayDuocMuaLaiHayChuyenNhuong;
	}

	public void setPhuongTienNayDuocMuaLaiHayChuyenNhuong(
			String phuongTienNayDuocMuaLaiHayChuyenNhuong) {
		this.phuongTienNayDuocMuaLaiHayChuyenNhuong = phuongTienNayDuocMuaLaiHayChuyenNhuong;
	}

	public String getNguoiMuaLai() {
		return nguoiMuaLai;
	}

	public void setNguoiMuaLai(String nguoiMuaLai) {
		this.nguoiMuaLai = nguoiMuaLai;
	}

	public String getDiaChiNguoiMua() {
		return diaChiNguoiMua;
	}

	public void setDiaChiNguoiMua(String diaChiNguoiMua) {
		this.diaChiNguoiMua = diaChiNguoiMua;
	}

	public void setSoDangKy(String soDangKy) {
		this.soDangKy = soDangKy;
	}

	public String getNgayCapPhuongTien() {
		return ngayCapPhuongTien;
	}

	public void setNgayCapPhuongTien(String ngayCapPhuongTien) {
		this.ngayCapPhuongTien = ngayCapPhuongTien;
	}

	public int[] getRowIndex() {
		return rowIndex;
	}

	public void setRowIndex(int[] rowIndex) {
		this.rowIndex = rowIndex;
	}
}
