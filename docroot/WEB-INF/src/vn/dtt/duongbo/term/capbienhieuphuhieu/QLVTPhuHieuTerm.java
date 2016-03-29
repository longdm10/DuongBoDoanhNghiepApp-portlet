package vn.dtt.duongbo.term.capbienhieuphuhieu;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.util.ParamUtil;

public class QLVTPhuHieuTerm {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	 public static final String ID ="id";
	 public static final String THONG_TIN_HO_SO_ID = "thongHoSoId";
     public static final String SO_LUONG_BHPH_NOP_LAI ="soLuongBHPHNopLai";
     public static final String SO_LUONG_BIEN_HIEU ="soLuongBienHieu";
     public static final String THONG_TIN_XU_LY_ID ="thongTinXuLyId";
     public static final String LOAI_PHU_HIEU ="loaiPhuHieu";
     public static final String SO_LUONG ="soLuong";
     public static final String SO_LUONG_BH_PH_NOP_LAI ="soLuongBH_PHNopLai";
     public static final String SOVB_CHAP_NHAN_TUYEN ="sovbChapNhanTuyen";
     public static final String NGAY_CAP_VB_CHAP_NHAN_TUYEN="ngayCapVBChapNhanTuyen";
     public static final String LAN_CAP ="lanCap";
     public static final String CAP_PHU_HIEU_ID ="capPhuHieuID";
     public static final String NHAN_HIEU ="nhanHieu";
     public static final String BIEN_SO ="bienSo";
     public static final String TRONG_TAI ="trongTai";
     public static final String SO_CHO_NGOI ="soChoNgoi";
     public static final String NOI_SAN_XUAT ="noiSanXuat";
     public static final String NAM_SAN_XUAT ="namSanXuat";
     public static final String MA_TUYEN_CO_DINH ="maTuyenCoDinh";
     public static final String LOAI_TUYEN ="loaiTuyen";
     public static final String HINH_THUC_SO_HUU_XE ="hinhThucSoHuuXe";
     public static final String LINH_VUC_KINH_DOANH_XE_DU_LICH ="linhVucKinhDoanhXeDuLich";
     public static final String NIEN_HAN_SU_DUNG_GIAY_DANG_KIEM ="nienHanSuDungGiayDangKiem";
     public static final String NIEN_HAN_SU_DUNG_ND86 ="nienHanSuDungND86";
     public static final String DOANH_NGHIEP_SO_HUU_THUE ="doanhNghiepSoHuuThue";
     public static final String THOI_HAN_THUE ="thoiHanThue";
     public static final String HOP_DONG_SAU_CUNG ="hopDongSauCung";
     public static final String KET_QUA_XU_LY ="ketQuaXuLy";
     public static final String SO_PHU_HIEU_DUOC_CAP ="soPhuHieuDuocCap";
     public static final String THOI_HAN_DUOC_CAP ="thoiHanDuocCapPhep";
     public static final String LOAI_PHU_HIEU_XIN_CAP ="loaiPhuHieuXinCap";
     public static final String LY_DO_KHONG_DAT ="lyDoKhongDat";
     
     public static final String GIAY_PHEP_KD_VT= "giayPhepKinhDoanhVanTai";
     public static final String NGAY_CAP_GIAY_PHEP_KD_VT= "ngayCapGiayPhepKinhDoanhVanTai";
     public static final String NOI_CAP_GIAY_PHEP_KD_VT= "noiCapGiayPhepKinhDoanhVanTai";
     public static final String NGAY_GIA_HAN_GIAY_PHEP_KD_VT= "ngayGiaHanGiayPhepKinhDoanhVanTai";
     public static final String SO_LUONG_XE_XIN_CAP= "soLuongXeXinCap";
     public static final String ID_PHUONG_TIEN = "idPhuongTien";
     public static final String MA_TUYEN= "maTuyen";
     public static final String MA_TUYENS= "maTuyens";
     
     public static final String TUYEN_TRONG_QUY_HOACH= "tuyenTrongQuyHoach";
     public static final String DON_VI= "donVi";
     public static final String CO_GIA_TRI_DEN= "coGiaTriDen";
     
     //update 20/1
   	public static final String NGUOI_NHAN_KET_QUA = "nguoiNhanKetQua";
   	public static final String THONG_TIN_TRA_KET_QUA = "thongTinTraKetQua";
   	public static final String NGAY_TRA_KET_QUA = "ngayTraKetQua";
     public static final String NGUOI_LIEN_HE_TRA_KET_QUA="nguoiLienHeTraKetQua";
     public static final String SO_DIEN_THOAI_NGUOI_LIEN_HE="soDienThoaiNguoiLienHe";
     
	public QLVTPhuHieuTerm() {
		// TODO Auto-generated constructor stub
	}
	public QLVTPhuHieuTerm(ActionRequest actionRequest ) {
		// TODO Auto-generated constructor stub
		id = ParamUtil.getInteger(actionRequest, ID) ;
		thongHoSoId = ParamUtil.getInteger(actionRequest, THONG_TIN_HO_SO_ID);
		soLuongBHPHNopLai = ParamUtil.getInteger(actionRequest, SO_LUONG_BHPH_NOP_LAI) ;
		soLuongBienHieu = ParamUtil.getInteger(actionRequest, SO_LUONG_BIEN_HIEU) ;
		thongTinXuLyId = ParamUtil.getInteger(actionRequest, THONG_TIN_XU_LY_ID) ;
		loaiPhuHieu = ParamUtil.getString(actionRequest, LOAI_PHU_HIEU) ;
		soLuong = ParamUtil.getInteger(actionRequest, SO_LUONG) ;
		soLuongBH_PHNopLai = ParamUtil.getInteger(actionRequest, SO_LUONG_BH_PH_NOP_LAI) ;
		sovbChapNhanTuyen = ParamUtil.getString(actionRequest, SOVB_CHAP_NHAN_TUYEN) ;
		ngayCapVBChapNhanTuyen = ParamUtil.getDate(actionRequest, NGAY_CAP_VB_CHAP_NHAN_TUYEN, sdf, null) ;
		lanCap = ParamUtil.getInteger(actionRequest, LAN_CAP) ;
		capPhuHieuID = ParamUtil.getInteger(actionRequest, CAP_PHU_HIEU_ID) ;
		nhanHieu = ParamUtil.getString(actionRequest, NHAN_HIEU) ;
		bienSo =  ParamUtil.getString(actionRequest, BIEN_SO) ;
		trongTai = ParamUtil.getInteger(actionRequest, TRONG_TAI) ;
		soChoNgoi =  ParamUtil.getInteger(actionRequest, SO_CHO_NGOI) ;
		noiSanXuat =  ParamUtil.getString(actionRequest, NOI_SAN_XUAT) ;
		namSanXuat =  ParamUtil.getInteger(actionRequest, NAM_SAN_XUAT) ;
		maTuyenCoDinh = ParamUtil.getString(actionRequest, MA_TUYEN_CO_DINH) ;
		loaiTuyen =  ParamUtil.getString(actionRequest, LOAI_TUYEN) ;
		hinhThucSoHuuXe = ParamUtil.getString(actionRequest, HINH_THUC_SO_HUU_XE) ;
		linhVucKinhDoanhXeDuLich = ParamUtil.getString(actionRequest, LINH_VUC_KINH_DOANH_XE_DU_LICH) ;
		nienHanSuDungGiayDangKiem = ParamUtil.getInteger(actionRequest, NIEN_HAN_SU_DUNG_GIAY_DANG_KIEM) ;
		nienHanSuDungND86 = ParamUtil.getInteger(actionRequest, NIEN_HAN_SU_DUNG_ND86) ;
		doanhNghiepSoHuuThue = ParamUtil.getString(actionRequest, DOANH_NGHIEP_SO_HUU_THUE) ;
		thoiHanThue = ParamUtil.getDate(actionRequest, THOI_HAN_THUE, sdf, null) ;
		hopDongSauCung = ParamUtil.getInteger(actionRequest, HOP_DONG_SAU_CUNG) ;
		ketQuaXuLy = ParamUtil.getInteger(actionRequest, KET_QUA_XU_LY) ;
		soPhuHieuDuocCap = ParamUtil.getString(actionRequest, SO_PHU_HIEU_DUOC_CAP) ;
		thoiHanDuocCapPhep = ParamUtil.getDate(actionRequest, THOI_HAN_DUOC_CAP, sdf, null) ;
		loaiPhuHieuXinCap = ParamUtil.getString(actionRequest, LOAI_PHU_HIEU_XIN_CAP) ;
		lyDoKhongDat = ParamUtil.getString(actionRequest, LY_DO_KHONG_DAT) ;
		giayPhepKinhDoanhVanTai = ParamUtil.getString(actionRequest, GIAY_PHEP_KD_VT);
	    ngayCapGiayPhepKinhDoanhVanTai = ParamUtil.getDate(actionRequest, NGAY_CAP_GIAY_PHEP_KD_VT, sdf, null); 
	    noiCapGiayPhepKinhDoanhVanTai =ParamUtil.getString(actionRequest, NOI_CAP_GIAY_PHEP_KD_VT);
	    ngayGiaHanGiayPhepKinhDoanhVanTai = ParamUtil.getDate(actionRequest, NGAY_GIA_HAN_GIAY_PHEP_KD_VT, sdf, null); 
	    soLuongXeXinCap = ParamUtil.getString(actionRequest, SO_LUONG_XE_XIN_CAP);
	    maTuyen = ParamUtil.getString(actionRequest, MA_TUYEN);
	    maTuyens = ParamUtil.getParameterValues(actionRequest, MA_TUYENS);
	    idPhuongTien = ParamUtil.getInteger(actionRequest, ID_PHUONG_TIEN);
	    tuyenTrongQuyHoach = ParamUtil.getString(actionRequest, TUYEN_TRONG_QUY_HOACH);
	    donVi = ParamUtil.getString(actionRequest, DON_VI);
	    
	    coGiaTriDen = ParamUtil.getDate(actionRequest, CO_GIA_TRI_DEN,sdf, null);
}

	private int idPhuongTien;
	private int id;
	private int thongHoSoId;
    private int soLuongBHPHNopLai;
    private int soLuongBienHieu;
    private int thongTinXuLyId;
    private String loaiPhuHieu;
    private int soLuong;
    private int soLuongBH_PHNopLai;
    private String sovbChapNhanTuyen;
    private Date ngayCapVBChapNhanTuyen;
    private int lanCap;
    private int capPhuHieuID;
    private String nhanHieu;
    private String bienSo;
    private int trongTai;
    private int soChoNgoi;
    private String noiSanXuat;
    private int namSanXuat;
    private String maTuyenCoDinh;
    private String loaiTuyen;
    private String hinhThucSoHuuXe;
    private String linhVucKinhDoanhXeDuLich;
    private int nienHanSuDungGiayDangKiem;
    private int nienHanSuDungND86;
    private String doanhNghiepSoHuuThue;
    private Date thoiHanThue;
    private int hopDongSauCung;
    private int ketQuaXuLy;
    private String soPhuHieuDuocCap;
    private Date thoiHanDuocCapPhep;
    private String loaiPhuHieuXinCap;
    private String lyDoKhongDat;
    private String giayPhepKinhDoanhVanTai;
    private Date ngayCapGiayPhepKinhDoanhVanTai;
    private String noiCapGiayPhepKinhDoanhVanTai;
    private Date ngayGiaHanGiayPhepKinhDoanhVanTai;
    private String soLuongXeXinCap;
    
    private String maTuyen; 
    private String[] maTuyens;
    private String  tuyenTrongQuyHoach;
    private String  donVi;
    
    private Date coGiaTriDen;
    
	private String nguoiNhanKetQua;
    private String thongTinTraKetQua;
    private Date ngayTraKetQua;
    private String nguoiLienHeTraKetQua;
    private String soDienThoaiNguoiLienHe;

	public String getNguoiNhanKetQua() {
		return nguoiNhanKetQua;
	}
	public void setNguoiNhanKetQua(String nguoiNhanKetQua) {
		this.nguoiNhanKetQua = nguoiNhanKetQua;
	}
	public String getThongTinTraKetQua() {
		return thongTinTraKetQua;
	}
	public void setThongTinTraKetQua(String thongTinTraKetQua) {
		this.thongTinTraKetQua = thongTinTraKetQua;
	}
	public Date getNgayTraKetQua() {
		return ngayTraKetQua;
	}
	public void setNgayTraKetQua(Date ngayTraKetQua) {
		this.ngayTraKetQua = ngayTraKetQua;
	}
	public String getNguoiLienHeTraKetQua() {
		return nguoiLienHeTraKetQua;
	}
	public void setNguoiLienHeTraKetQua(String nguoiLienHeTraKetQua) {
		this.nguoiLienHeTraKetQua = nguoiLienHeTraKetQua;
	}
	public String getSoDienThoaiNguoiLienHe() {
		return soDienThoaiNguoiLienHe;
	}
	public void setSoDienThoaiNguoiLienHe(String soDienThoaiNguoiLienHe) {
		this.soDienThoaiNguoiLienHe = soDienThoaiNguoiLienHe;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSoLuongBHPHNopLai() {
		return soLuongBHPHNopLai;
	}
	public void setSoLuongBHPHNopLai(int soLuongBHPHNopLai) {
		this.soLuongBHPHNopLai = soLuongBHPHNopLai;
	}
	public int getSoLuongBienHieu() {
		return soLuongBienHieu;
	}
	public void setSoLuongBienHieu(int soLuongBienHieu) {
		this.soLuongBienHieu = soLuongBienHieu;
	}
	public int getThongTinXuLyId() {
		return thongTinXuLyId;
	}
	public void setThongTinXuLyId(int thongTinXuLyId) {
		this.thongTinXuLyId = thongTinXuLyId;
	}
	public String getLoaiPhuHieu() {
		return loaiPhuHieu;
	}
	public void setLoaiPhuHieu(String loaiPhuHieu) {
		this.loaiPhuHieu = loaiPhuHieu;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getSoLuongBH_PHNopLai() {
		return soLuongBH_PHNopLai;
	}
	public void setSoLuongBH_PHNopLai(int soLuongBH_PHNopLai) {
		this.soLuongBH_PHNopLai = soLuongBH_PHNopLai;
	}
	public String getSovbChapNhanTuyen() {
		return sovbChapNhanTuyen;
	}
	public void setSovbChapNhanTuyen(String sovbChapNhanTuyen) {
		this.sovbChapNhanTuyen = sovbChapNhanTuyen;
	}
	public Date getNgayCapVBChapNhanTuyen() {
		return ngayCapVBChapNhanTuyen;
	}
	public void setNgayCapVBChapNhanTuyen(Date ngayCapVBChapNhanTuyen) {
		this.ngayCapVBChapNhanTuyen = ngayCapVBChapNhanTuyen;
	}
	public int getLanCap() {
		return lanCap;
	}
	public void setLanCap(int lanCap) {
		this.lanCap = lanCap;
	}
	public int getCapPhuHieuID() {
		return capPhuHieuID;
	}
	public void setCapPhuHieuID(int capPhuHieuID) {
		this.capPhuHieuID = capPhuHieuID;
	}
	public String getNhanHieu() {
		return nhanHieu;
	}
	public void setNhanHieu(String nhanHieu) {
		this.nhanHieu = nhanHieu;
	}
	public String getBienSo() {
		return bienSo;
	}
	public void setBienSo(String bienSo) {
		this.bienSo = bienSo;
	}
	public int getTrongTai() {
		return trongTai;
	}
	public void setTrongTai(int trongTai) {
		this.trongTai = trongTai;
	}
	public int getSoChoNgoi() {
		return soChoNgoi;
	}
	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}
	public String getNoiSanXuat() {
		return noiSanXuat;
	}
	public void setNoiSanXuat(String noiSanXuat) {
		this.noiSanXuat = noiSanXuat;
	}
	public int getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	public String getMaTuyenCoDinh() {
		return maTuyenCoDinh;
	}
	public void setMaTuyenCoDinh(String maTuyenCoDinh) {
		this.maTuyenCoDinh = maTuyenCoDinh;
	}
	public String getLoaiTuyen() {
		return loaiTuyen;
	}
	public void setLoaiTuyen(String loaiTuyen) {
		this.loaiTuyen = loaiTuyen;
	}
	public String getHinhThucSoHuuXe() {
		return hinhThucSoHuuXe;
	}
	public void setHinhThucSoHuuXe(String hinhThucSoHuuXe) {
		this.hinhThucSoHuuXe = hinhThucSoHuuXe;
	}
	public String getLinhVucKinhDoanhXeDuLich() {
		return linhVucKinhDoanhXeDuLich;
	}
	public void setLinhVucKinhDoanhXeDuLich(String linhVucKinhDoanhXeDuLich) {
		this.linhVucKinhDoanhXeDuLich = linhVucKinhDoanhXeDuLich;
	}
	public int getNienHanSuDungGiayDangKiem() {
		return nienHanSuDungGiayDangKiem;
	}
	public void setNienHanSuDungGiayDangKiem(int nienHanSuDungGiayDangKiem) {
		this.nienHanSuDungGiayDangKiem = nienHanSuDungGiayDangKiem;
	}
	public int getNienHanSuDungND86() {
		return nienHanSuDungND86;
	}
	public void setNienHanSuDungND86(int nienHanSuDungND86) {
		this.nienHanSuDungND86 = nienHanSuDungND86;
	}
	public String getDoanhNghiepSoHuuThue() {
		return doanhNghiepSoHuuThue;
	}
	public void setDoanhNghiepSoHuuThue(String doanhNghiepSoHuuThue) {
		this.doanhNghiepSoHuuThue = doanhNghiepSoHuuThue;
	}
	public Date getThoiHanThue() {
		return thoiHanThue;
	}
	public void setThoiHanThue(Date thoiHanThue) {
		this.thoiHanThue = thoiHanThue;
	}
	public int getHopDongSauCung() {
		return hopDongSauCung;
	}
	public void setHopDongSauCung(int hopDongSauCung) {
		this.hopDongSauCung = hopDongSauCung;
	}
	public int getKetQuaXuLy() {
		return ketQuaXuLy;
	}
	public void setKetQuaXuLy(int ketQuaXuLy) {
		this.ketQuaXuLy = ketQuaXuLy;
	}
	public String getSoPhuHieuDuocCap() {
		return soPhuHieuDuocCap;
	}
	public void setSoPhuHieuDuocCap(String soPhuHieuDuocCap) {
		this.soPhuHieuDuocCap = soPhuHieuDuocCap;
	}
	public Date getThoiHanDuocCapPhep() {
		return thoiHanDuocCapPhep;
	}
	public void setThoiHanDuocCapPhep(Date thoiHanDuocCapPhep) {
		this.thoiHanDuocCapPhep = thoiHanDuocCapPhep;
	}
	public String getLoaiPhuHieuXinCap() {
		return loaiPhuHieuXinCap;
	}
	public void setLoaiPhuHieuXinCap(String loaiPhuHieuXinCap) {
		this.loaiPhuHieuXinCap = loaiPhuHieuXinCap;
	}
	public String getLyDoKhongDat() {
		return lyDoKhongDat;
	}
	public void setLyDoKhongDat(String lyDoKhongDat) {
		this.lyDoKhongDat = lyDoKhongDat;
	}
	public String getGiayPhepKinhDoanhVanTai() {
		return giayPhepKinhDoanhVanTai;
	}
	public void setGiayPhepKinhDoanhVanTai(String giayPhepKinhDoanhVanTai) {
		this.giayPhepKinhDoanhVanTai = giayPhepKinhDoanhVanTai;
	}
	public Date getNgayCapGiayPhepKinhDoanhVanTai() {
		return ngayCapGiayPhepKinhDoanhVanTai;
	}
	public void setNgayCapGiayPhepKinhDoanhVanTai(
			Date ngayCapGiayPhepKinhDoanhVanTai) {
		this.ngayCapGiayPhepKinhDoanhVanTai = ngayCapGiayPhepKinhDoanhVanTai;
	}
	public String getNoiCapGiayPhepKinhDoanhVanTai() {
		return noiCapGiayPhepKinhDoanhVanTai;
	}
	public void setNoiCapGiayPhepKinhDoanhVanTai(
			String noiCapGiayPhepKinhDoanhVanTai) {
		this.noiCapGiayPhepKinhDoanhVanTai = noiCapGiayPhepKinhDoanhVanTai;
	}
	public Date getNgayGiaHanGiayPhepKinhDoanhVanTai() {
		return ngayGiaHanGiayPhepKinhDoanhVanTai;
	}
	public void setNgayGiaHanGiayPhepKinhDoanhVanTai(
			Date ngayGiaHanGiayPhepKinhDoanhVanTai) {
		this.ngayGiaHanGiayPhepKinhDoanhVanTai = ngayGiaHanGiayPhepKinhDoanhVanTai;
	}
	public String getSoLuongXeXinCap() {
		return soLuongXeXinCap;
	}
	public void setSoLuongXeXinCap(String soLuongXeXinCap) {
		this.soLuongXeXinCap = soLuongXeXinCap;
	}
	public String getMaTuyen() {
		return maTuyen;
	}
	public void setMaTuyen(String maTuyen) {
		this.maTuyen = maTuyen;
	}
	public String[] getMaTuyens() {
		return maTuyens;
	}
	public void setMaTuyens(String[] maTuyens) {
		this.maTuyens = maTuyens;
	}
	public int getThongHoSoId() {
		return thongHoSoId;
	}
	public void setThongHoSoId(int thongHoSoId) {
		this.thongHoSoId = thongHoSoId;
	}
	public String getTuyenTrongQuyHoach() {
		return tuyenTrongQuyHoach;
	}
	public void setTuyenTrongQuyHoach(String tuyenTrongQuyHoach) {
		this.tuyenTrongQuyHoach = tuyenTrongQuyHoach;
	}
	public String getDonVi() {
		return donVi;
	}
	public void setDonVi(String donVi) {
		this.donVi = donVi;
	}
	public Date getCoGiaTriDen() {
		return coGiaTriDen;
	}
	public void setCoGiaTriDen(Date coGiaTriDen) {
		this.coGiaTriDen = coGiaTriDen;
	}
	public int getIdPhuongTien() {
		return idPhuongTien;
	}
	public void setIdPhuongTien(int idPhuongTien) {
		this.idPhuongTien = idPhuongTien;
	}
}
