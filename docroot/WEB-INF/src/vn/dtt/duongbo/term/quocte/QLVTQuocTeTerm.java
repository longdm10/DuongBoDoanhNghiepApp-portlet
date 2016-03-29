package vn.dtt.duongbo.term.quocte;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.util.ParamUtil;

public class QLVTQuocTeTerm {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public static final String ID = "id";
	public static final String ID_LOAI_HINH = "idLoaiHinh";
	public static final String THONG_TIN_HO_SO_ID = "thongHoSoId";
    public static final String THONG_TIN_XU_LY_ID = "thongTinXuLyId";
    public static final String LOAI_CAP_PHEP = "loaiCapPhep";
    public static final String SO_GIAP_PHEP_VAN_TAI = "soGiapPhepVanTai";
    public static final String NGAY_CAP_GIAY_PHEP_VAN_TAI= "ngayCapGiayPhepVanTai";
    public static final String CO_QUAN_CAP_GIAY_PHEP_VAN_TAI_ID = "coQuanCapGiayPhepVanTaiId";
    public static final String NGAY_HET_HAN_GIAY_PHEP_VAN_TAI = "ngayHetHanGiayPhepVanTai";
    public static final String MUC_PHI = "mucPhi";
    public static final String THONG_TIN_CAP_GPKD_VAN_TAI_ID = "thongTinCapGpkdVanTaiId";
	public static final String MA_LOAI_HINH_HOAT_DONG = "maLoaiHinhHoatDong";
	public static final String SO_LUONG_PHUONG_TIEN = "soLuongPhuongTien";
	public static final String THIET_BI_GIAM_SAT_HANH_TRINH = "thietBiGiamSatHanhTrinh";
	public static final String PHAM_VI_HOAT_DONG = "phamViHoatDong";
	public static final String SO_CHUYEN = "soChuyen";
	public static final String MAU_SON = "mauSon";
	public static final String KET_QUA_XU_LY = "ketQuaXuLy";
	public static final String KET_QUA_XU_LY_LOAI_HINH  = "ketQuaXuLyLoaiHinh";
	public static final String LY_DO_KHONG_DAT = "lyDoKhongDat";
	public static final String GPKD_LOAD_HINH_KD_ID = "gpkdLoaiHinhKdId";
	public static final String MA_TUYEN = "maTuyen";
	public static final String MA_TUYENS = "maTuyens";
	public static final String TEN_TUYEN = "tenTuyen";
	public static final String LAN_CAP_GIAY_DANG_KY_KINH_DOANH="lanCapGiayDangKyKinhDoanh";
    public static final String SO_GIAY_PHEP_KINH_DOANH_VAN_TAI_NOI_DIA="soGiayPhepKinhDoanhVanTaiNoiDia";
    public static final String NGAY_CAP_GPKDVT_NOI_DIA="ngayCapGPKDVTNoiDia";
    public static final String NGAY_GIA_HAN_GPKDVT_NOI_DIA="NgayGiaHanGPKDVTNoiDia";
    public static final String NGAY_HET_HAN_GPKDVT_NOI_DIA="NgayHetHanGPKDVTNoiDia";
    public static final String LAN_CAP_GPKDVT_NOI_KIA="lanCapGPKDVTNoiDia";
    public static final String NGAY_GIA_HAN_GIAY_DANG_KY_KINH_DOANH="ngayGiaHanGiayDangKyKinhDoanh";
    public static final String SO_GIAY_PHEP_KINH_DOANH_VAN_TAI_QUOC_TE="soGiayPhepKinhDoanhVanTaiQuocTe";
    public static final String LAN_CAP_GPKDVT_QUOC_TE="lanCapGPKDVTQuocTe";
    public static final String NGAY_CAP_GPKDVT_QUOC_TE="ngayCapGPKDVTQuocTe";
    public static final String NGAY_GIA_HAN_GPKDVT_QUOC_TE="ngayGiaHanGPKDVTQuocTe";
    public static final String NGAY_HET_HAN_GPKDVT_QUOC_TE="ngayHetHanGPKDVTQuocTe";
    public static final String NGUOI_LIEN_HE_TRA_KET_QUA="nguoiLienHeTraKetQua";
    public static final String SO_DIEN_THOAI_NGUOI_LIEN_HE="soDienThoaiNguoiLienHe";
    
    public static final String NGUOI_DAI_DIEN ="nguoiDaiDien";
    public static final String SO_CMND_OR_HO_CHIEU ="soChungMinhNhanDanOrHoChieu";
    public static final String NGAY_CAP_CMND ="ngayCapChungMinhNhanDan";
    
    public static final String NOI_CAP_CMND ="noiCapChungMinhNhanDan";
    public static final String BANG_CAP ="bangCap";
    
    public static final String SO_GIAY_PHEP_CUA_NGUOI_DIEU_HANH ="soGiayPhepCuaNguoiDieuHanh";
    public static final String LAN_CAP_GIAY_PHEP_CUA_NGUOI_DIEU_HANH ="lanCapGiayPhepCuaNguoiDieuHanh";
    public static final String NGAY_CAP_GIAY_PHEP_CUA_NGUOI_DIEU_HANH ="ngayCapGiayPhepCuaNguoiDieuHanh";
    
    public static final String THOI_GIAN_DIEU_HANH_TRUC_TIEP_DN_TU ="thoiGianDieuHanhTrucTiepDnTu";
    public static final String THOI_GIAN_DIEU_HANH_TRUC_TIEP_DN_DEN ="thoiGianDieuHanhTrucTiepDnDen";
    
    public static final String THOI_HAN_CAP_KINH_DOANH_VT_Tu ="thoiHanCapGiayKinhDoanhVanTaiTu";
    public static final String THOI_HAN_CAP_KINH_DOANH_VT_Den ="thoiHanCapGiayKinhDoanhVanTaiDen";
    
    
    public static final String KET_QUA_DANH_GIA_NGUOI_DIEU_HANH_VAN_TAI = "ketQuaDanhGiaNguoiDieuHanhVanTai";
    
    public static final String TEN_DN = "tenDn";
	public static final String DIA_CHI_DN = "diaChiDn";
	public static final String DIEN_THOAI_DN = "dienThoaiDn";
	public static final String SO_FAX_DN = "soFaxDN";
	
	//update 20/1
	public static final String NGUOI_NHAN_KET_QUA = "nguoiNhanKetQua";
	public static final String THONG_TIN_TRA_KET_QUA = "thongTinTraKetQua";
	public static final String NGAY_TRA_KET_QUA = "ngayTraKetQua";
	
	//update 26/1
	public static final String CAP_LAN_DAU = "capLanDau";
	
	public static final String NGAY_CAP_GIAY_PHEP_KDVT_LAN_DAU = "ngayCapGiayPhepKinhDoanhVTLanDau";
	public static final String NGAY_GIA_HAN_GIAY_PHEP_KDVT_LAN_DAU = "ngayGiaHanGiayPhepKinhDoanhVTLanDau";
	public static final String NOI_CAP_GIAY_PHEP_KDVT_LAN_DAU = "noiCapGiayPhepKinhDoanhVTLanDau";
	
	public static final String LOAI_HINH_KINH_DOANH = "loaiHinhKinhDoanh";
	
	public QLVTQuocTeTerm() {
		// TODO Auto-generated constructor stub
	}
	public QLVTQuocTeTerm(ActionRequest actionRequest ) {
		// TODO Auto-generated constructor stub
		id = ParamUtil.getLong(actionRequest, ID) ;
		thongHoSoId= ParamUtil.getInteger(actionRequest, THONG_TIN_HO_SO_ID);
		idLoaiHinh = ParamUtil.getLong(actionRequest, ID_LOAI_HINH) ;
		thongTinXuLyId = ParamUtil.getInteger(actionRequest, THONG_TIN_XU_LY_ID) ;
		loaiCapPhep = ParamUtil.getString(actionRequest, LOAI_CAP_PHEP) ;
		soGiapPhepVanTai = ParamUtil.getString(actionRequest, SO_GIAP_PHEP_VAN_TAI) ;
		ngayCapGiayPhepVanTai  = ParamUtil.getDate(actionRequest, NGAY_CAP_GIAY_PHEP_VAN_TAI, sdf, null) ;
		coQuanCapGiayPhepVanTaiId = ParamUtil.getString(actionRequest, CO_QUAN_CAP_GIAY_PHEP_VAN_TAI_ID) ;
		ngayHetHanGiayPhepVanTai = ParamUtil.getDate(actionRequest, NGAY_HET_HAN_GIAY_PHEP_VAN_TAI, sdf, null) ;
		mucPhi= ParamUtil.getString(actionRequest, MUC_PHI) ;
		thongTinCapGpkdVanTaiId   = ParamUtil.getInteger(actionRequest, THONG_TIN_CAP_GPKD_VAN_TAI_ID) ;
		maLoaiHinhHoatDong = ParamUtil.getString(actionRequest, MA_LOAI_HINH_HOAT_DONG) ;
		soLuongPhuongTien	= ParamUtil.getInteger(actionRequest, SO_LUONG_PHUONG_TIEN) ;
		thietBiGiamSatHanhTrinh =	ParamUtil.getLong(actionRequest, THIET_BI_GIAM_SAT_HANH_TRINH) ;
		phamViHoatDong = ParamUtil.getString(actionRequest, PHAM_VI_HOAT_DONG) ;
		soChuyen= ParamUtil.getInteger(actionRequest, SO_CHUYEN) ;
		mauSon= ParamUtil.getString(actionRequest, MAU_SON) ;
		ketQuaXuLy	= ParamUtil.getString(actionRequest, KET_QUA_XU_LY) ;
		ketQuaXuLyLoaiHinh	= ParamUtil.getString(actionRequest, KET_QUA_XU_LY_LOAI_HINH) ;
		if(ketQuaXuLyLoaiHinh.equals("0")){
			lyDoKhongDat = ParamUtil.getString(actionRequest, LY_DO_KHONG_DAT) ;
		}
		
		gpkdLoaiHinhKdId= ParamUtil.getInteger(actionRequest, GPKD_LOAD_HINH_KD_ID) ;
		maTuyen	= ParamUtil.getString(actionRequest, MA_TUYEN) ;
		tenTuyen	= ParamUtil.getString(actionRequest, TEN_TUYEN) ;
		
		lanCapGiayDangKyKinhDoanh= ParamUtil.getInteger(actionRequest, LAN_CAP_GIAY_DANG_KY_KINH_DOANH) ;
        soGiayPhepKinhDoanhVanTaiNoiDia= ParamUtil.getString(actionRequest, SO_GIAY_PHEP_KINH_DOANH_VAN_TAI_NOI_DIA)  ;
       ngayCapGPKDVTNoiDia = ParamUtil.getDate(actionRequest, NGAY_CAP_GPKDVT_NOI_DIA, sdf, null) ; 
       NgayGiaHanGPKDVTNoiDia = ParamUtil.getDate(actionRequest, NGAY_GIA_HAN_GPKDVT_NOI_DIA, sdf, null) ;
       NgayHetHanGPKDVTNoiDia = ParamUtil.getDate(actionRequest, NGAY_HET_HAN_GPKDVT_NOI_DIA, sdf, null) ; 
       lanCapGPKDVTNoiDia = ParamUtil.getInteger(actionRequest, LAN_CAP_GPKDVT_NOI_KIA) ; 
       ngayGiaHanGiayDangKyKinhDoanh = ParamUtil.getDate(actionRequest, NGAY_GIA_HAN_GIAY_DANG_KY_KINH_DOANH, sdf, null) ; 
       soGiayPhepKinhDoanhVanTaiQuocTe = ParamUtil.getString(actionRequest, SO_GIAY_PHEP_KINH_DOANH_VAN_TAI_QUOC_TE)  ;
        lanCapGPKDVTQuocTe = ParamUtil.getInteger(actionRequest, LAN_CAP_GPKDVT_QUOC_TE) ; 
       ngayCapGPKDVTQuocTe = ParamUtil.getDate(actionRequest, NGAY_CAP_GPKDVT_QUOC_TE, sdf, null) ; ;
       ngayGiaHanGPKDVTQuocTe = ParamUtil.getDate(actionRequest, NGAY_GIA_HAN_GPKDVT_QUOC_TE, sdf, null) ; 
       ngayHetHanGPKDVTQuocTe = ParamUtil.getDate(actionRequest, NGAY_HET_HAN_GPKDVT_QUOC_TE, sdf, null) ; 
        nguoiLienHeTraKetQua = ParamUtil.getString(actionRequest, NGUOI_LIEN_HE_TRA_KET_QUA)  ;
        soDienThoaiNguoiLienHe= ParamUtil.getString(actionRequest, SO_DIEN_THOAI_NGUOI_LIEN_HE)  ;
        maTuyens = ParamUtil.getParameterValues(actionRequest, MA_TUYENS);
        
        nguoiDaiDien = ParamUtil.getString(actionRequest, NGUOI_DAI_DIEN);
        soChungMinhNhanDanOrHoChieu = ParamUtil.getString(actionRequest, SO_CMND_OR_HO_CHIEU);
        ngayCapChungMinhNhanDan =ParamUtil.getString(actionRequest, NGAY_CAP_CMND);
        noiCapChungMinhNhanDan = ParamUtil.getString(actionRequest, NOI_CAP_CMND);
        bangCap = ParamUtil.getString(actionRequest, BANG_CAP);
        soGiayPhepCuaNguoiDieuHanh = ParamUtil.getString(actionRequest, SO_GIAY_PHEP_CUA_NGUOI_DIEU_HANH);
        lanCapGiayPhepCuaNguoiDieuHanh = ParamUtil.getString(actionRequest, LAN_CAP_GIAY_PHEP_CUA_NGUOI_DIEU_HANH);
        ngayCapGiayPhepCuaNguoiDieuHanh = ParamUtil.getString(actionRequest, NGAY_CAP_GIAY_PHEP_CUA_NGUOI_DIEU_HANH);
        
        thoiGianDieuHanhTrucTiepDnTu = ParamUtil.getString(actionRequest, THOI_GIAN_DIEU_HANH_TRUC_TIEP_DN_TU);
        thoiGianDieuHanhTrucTiepDnDen =  ParamUtil.getString(actionRequest, THOI_GIAN_DIEU_HANH_TRUC_TIEP_DN_DEN);
        
        thoiHanCapGiayKinhDoanhVanTaiTu = ParamUtil.getString(actionRequest, THOI_HAN_CAP_KINH_DOANH_VT_Tu);
        thoiHanCapGiayKinhDoanhVanTaiDen = ParamUtil.getString(actionRequest, THOI_HAN_CAP_KINH_DOANH_VT_Den);
        ketQuaDanhGiaNguoiDieuHanhVanTai =ParamUtil.getString(actionRequest, KET_QUA_DANH_GIA_NGUOI_DIEU_HANH_VAN_TAI);
        
        tenDn = ParamUtil.getString(actionRequest, TEN_DN);
        diaChiDn = ParamUtil.getString(actionRequest, DIA_CHI_DN);
        soFaxDN =ParamUtil.getString(actionRequest, SO_FAX_DN);
        dienThoaiDn = ParamUtil.getString(actionRequest, DIEN_THOAI_DN);
        
        ngayTraKetQua = ParamUtil.getDate(actionRequest, NGAY_TRA_KET_QUA, sdf, null); 
        nguoiNhanKetQua = ParamUtil.getString(actionRequest, NGUOI_NHAN_KET_QUA);
        thongTinTraKetQua = ParamUtil.getString(actionRequest, THONG_TIN_TRA_KET_QUA);
        
        capLanDau =  ParamUtil.getString(actionRequest, CAP_LAN_DAU);
        
        
        ngayCapGiayPhepKinhDoanhVTLanDau = ParamUtil.getDate(actionRequest, NGAY_CAP_GIAY_PHEP_KDVT_LAN_DAU, sdf, null);
        ngayGiaHanGiayPhepKinhDoanhVTLanDau = ParamUtil.getDate(actionRequest, NGAY_GIA_HAN_GIAY_PHEP_KDVT_LAN_DAU, sdf, null); 
        noiCapGiayPhepKinhDoanhVTLanDau =  ParamUtil.getString(actionRequest, NOI_CAP_GIAY_PHEP_KDVT_LAN_DAU);
        loaiHinhKinhDoanh = ParamUtil.getString(actionRequest, LOAI_HINH_KINH_DOANH);
        
	}
	private String nguoiNhanKetQua;
    private String thongTinTraKetQua;
    private Date ngayTraKetQua;
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
	private int thongHoSoId;
	private long idLoaiHinh;
	private String ketQuaXuLyLoaiHinh;
	private long id;
    private int thongTinXuLyId;
    private String loaiCapPhep;
    private String soGiapPhepVanTai;
    private Date ngayCapGiayPhepVanTai;
    private String coQuanCapGiayPhepVanTaiId;
    private Date ngayHetHanGiayPhepVanTai;
    private String mucPhi;
    private int thongTinCapGpkdVanTaiId;
	private String maLoaiHinhHoatDong;
	private int soLuongPhuongTien;
	private long thietBiGiamSatHanhTrinh;
	private String phamViHoatDong;
	private int soChuyen;
	private String mauSon;
	private String ketQuaXuLy;
	private String lyDoKhongDat;
	private int gpkdLoaiHinhKdId;
	private String maTuyen;
	private String tenTuyen;
	private String[] maTuyens;
	private int lanCapGiayDangKyKinhDoanh;
    private String soGiayPhepKinhDoanhVanTaiNoiDia;
    private Date ngayCapGPKDVTNoiDia;
    private Date NgayGiaHanGPKDVTNoiDia;
    private Date NgayHetHanGPKDVTNoiDia;
    private int lanCapGPKDVTNoiDia;
    private Date ngayGiaHanGiayDangKyKinhDoanh;
    private String soGiayPhepKinhDoanhVanTaiQuocTe;
    private int lanCapGPKDVTQuocTe;
    private Date ngayCapGPKDVTQuocTe;
    private Date ngayGiaHanGPKDVTQuocTe;
    private Date ngayHetHanGPKDVTQuocTe;
    private String nguoiLienHeTraKetQua;
    private String soDienThoaiNguoiLienHe;
    private String nguoiDaiDien;
    private String soChungMinhNhanDanOrHoChieu;
    private String ngayCapChungMinhNhanDan;
    private String noiCapChungMinhNhanDan;
    private String bangCap;
    private String thoiGianDieuHanhTrucTiepDnTu;
    private String thoiGianDieuHanhTrucTiepDnDen;
    
    private String tenDn;
    private String diaChiDn;
    private String soFaxDN;
    private String dienThoaiDn;
    
    private String thoiHanCapGiayKinhDoanhVanTaiTu;
    private String thoiHanCapGiayKinhDoanhVanTaiDen;
    
    private String ketQuaDanhGiaNguoiDieuHanhVanTai;
    private String soGiayPhepCuaNguoiDieuHanh;
    private String lanCapGiayPhepCuaNguoiDieuHanh;
    private String ngayCapGiayPhepCuaNguoiDieuHanh;
    
    private String capLanDau;
    private Date ngayCapGiayPhepKinhDoanhVTLanDau;
    private Date ngayGiaHanGiayPhepKinhDoanhVTLanDau;
    private String noiCapGiayPhepKinhDoanhVTLanDau;
    private String loaiHinhKinhDoanh;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getThongTinXuLyId() {
		return thongTinXuLyId;
	}
	public void setThongTinXuLyId(int thongTinXuLyId) {
		this.thongTinXuLyId = thongTinXuLyId;
	}
	public String getLoaiCapPhep() {
		return loaiCapPhep;
	}
	public void setLoaiCapPhep(String loaiCapPhep) {
		this.loaiCapPhep = loaiCapPhep;
	}
	public String getSoGiapPhepVanTai() {
		return soGiapPhepVanTai;
	}
	public void setSoGiapPhepVanTai(String soGiapPhepVanTai) {
		this.soGiapPhepVanTai = soGiapPhepVanTai;
	}
	public Date getNgayCapGiayPhepVanTai() {
		return ngayCapGiayPhepVanTai;
	}
	public void setNgayCapGiayPhepVanTai(Date ngayCapGiayPhepVanTai) {
		this.ngayCapGiayPhepVanTai = ngayCapGiayPhepVanTai;
	}
	public String getCoQuanCapGiayPhepVanTaiId() {
		return coQuanCapGiayPhepVanTaiId;
	}
	public void setCoQuanCapGiayPhepVanTaiId(String coQuanCapGiayPhepVanTaiId) {
		this.coQuanCapGiayPhepVanTaiId = coQuanCapGiayPhepVanTaiId;
	}
	public Date getNgayHetHanGiayPhepVanTai() {
		return ngayHetHanGiayPhepVanTai;
	}
	public void setNgayHetHanGiayPhepVanTai(Date ngayHetHanGiayPhepVanTai) {
		this.ngayHetHanGiayPhepVanTai = ngayHetHanGiayPhepVanTai;
	}
	public String getMucPhi() {
		return mucPhi;
	}
	public void setMucPhi(String mucPhi) {
		this.mucPhi = mucPhi;
	}
	public int getThongTinCapGpkdVanTaiId() {
		return thongTinCapGpkdVanTaiId;
	}
	public void setThongTinCapGpkdVanTaiId(int thongTinCapGpkdVanTaiId) {
		this.thongTinCapGpkdVanTaiId = thongTinCapGpkdVanTaiId;
	}
	public String getMaLoaiHinhHoatDong() {
		return maLoaiHinhHoatDong;
	}
	public void setMaLoaiHinhHoatDong(String maLoaiHinhHoatDong) {
		this.maLoaiHinhHoatDong = maLoaiHinhHoatDong;
	}
	public int getSoLuongPhuongTien() {
		return soLuongPhuongTien;
	}
	public void setSoLuongPhuongTien(int soLuongPhuongTien) {
		this.soLuongPhuongTien = soLuongPhuongTien;
	}
	public long getThietBiGiamSatHanhTrinh() {
		return thietBiGiamSatHanhTrinh;
	}
	public void setThietBiGiamSatHanhTrinh(long thietBiGiamSatHanhTrinh) {
		this.thietBiGiamSatHanhTrinh = thietBiGiamSatHanhTrinh;
	}
	public String getPhamViHoatDong() {
		return phamViHoatDong;
	}
	public void setPhamViHoatDong(String phamViHoatDong) {
		this.phamViHoatDong = phamViHoatDong;
	}
	public int getSoChuyen() {
		return soChuyen;
	}
	public void setSoChuyen(int soChuyen) {
		this.soChuyen = soChuyen;
	}
	public String getMauSon() {
		return mauSon;
	}
	public void setMauSon(String mauSon) {
		this.mauSon = mauSon;
	}
	public String getKetQuaXuLy() {
		return ketQuaXuLy;
	}
	public void setKetQuaXuLy(String ketQuaXuLy) {
		this.ketQuaXuLy = ketQuaXuLy;
	}
	public String getLyDoKhongDat() {
		return lyDoKhongDat;
	}
	public void setLyDoKhongDat(String lyDoKhongDat) {
		this.lyDoKhongDat = lyDoKhongDat;
	}
	public int getGpkdLoaiHinhKdId() {
		return gpkdLoaiHinhKdId;
	}
	public void setGpkdLoaiHinhKdId(int gpkdLoaiHinhKdId) {
		this.gpkdLoaiHinhKdId = gpkdLoaiHinhKdId;
	}
	public String getMaTuyen() {
		return maTuyen;
	}
	public void setMaTuyen(String maTuyen) {
		this.maTuyen = maTuyen;
	}
	public String getTenTuyen() {
		return tenTuyen;
	}
	public void setTenTuyen(String tenTuyen) {
		this.tenTuyen = tenTuyen;
	}
	public int getLanCapGiayDangKyKinhDoanh() {
		return lanCapGiayDangKyKinhDoanh;
	}
	public void setLanCapGiayDangKyKinhDoanh(int lanCapGiayDangKyKinhDoanh) {
		this.lanCapGiayDangKyKinhDoanh = lanCapGiayDangKyKinhDoanh;
	}
	public String getSoGiayPhepKinhDoanhVanTaiNoiDia() {
		return soGiayPhepKinhDoanhVanTaiNoiDia;
	}
	public void setSoGiayPhepKinhDoanhVanTaiNoiDia(
			String soGiayPhepKinhDoanhVanTaiNoiDia) {
		this.soGiayPhepKinhDoanhVanTaiNoiDia = soGiayPhepKinhDoanhVanTaiNoiDia;
	}
	public Date getNgayCapGPKDVTNoiDia() {
		return ngayCapGPKDVTNoiDia;
	}
	public void setNgayCapGPKDVTNoiDia(Date ngayCapGPKDVTNoiDia) {
		this.ngayCapGPKDVTNoiDia = ngayCapGPKDVTNoiDia;
	}
	public Date getNgayGiaHanGPKDVTNoiDia() {
		return NgayGiaHanGPKDVTNoiDia;
	}
	public void setNgayGiaHanGPKDVTNoiDia(Date ngayGiaHanGPKDVTNoiDia) {
		NgayGiaHanGPKDVTNoiDia = ngayGiaHanGPKDVTNoiDia;
	}
	public Date getNgayHetHanGPKDVTNoiDia() {
		return NgayHetHanGPKDVTNoiDia;
	}
	public void setNgayHetHanGPKDVTNoiDia(Date ngayHetHanGPKDVTNoiDia) {
		NgayHetHanGPKDVTNoiDia = ngayHetHanGPKDVTNoiDia;
	}
	public int getLanCapGPKDVTNoiDia() {
		return lanCapGPKDVTNoiDia;
	}
	public void setLanCapGPKDVTNoiDia(int lanCapGPKDVTNoiDia) {
		this.lanCapGPKDVTNoiDia = lanCapGPKDVTNoiDia;
	}
	public Date getNgayGiaHanGiayDangKyKinhDoanh() {
		return ngayGiaHanGiayDangKyKinhDoanh;
	}
	public void setNgayGiaHanGiayDangKyKinhDoanh(Date ngayGiaHanGiayDangKyKinhDoanh) {
		this.ngayGiaHanGiayDangKyKinhDoanh = ngayGiaHanGiayDangKyKinhDoanh;
	}
	public String getSoGiayPhepKinhDoanhVanTaiQuocTe() {
		return soGiayPhepKinhDoanhVanTaiQuocTe;
	}
	public void setSoGiayPhepKinhDoanhVanTaiQuocTe(
			String soGiayPhepKinhDoanhVanTaiQuocTe) {
		this.soGiayPhepKinhDoanhVanTaiQuocTe = soGiayPhepKinhDoanhVanTaiQuocTe;
	}
	public int getLanCapGPKDVTQuocTe() {
		return lanCapGPKDVTQuocTe;
	}
	public void setLanCapGPKDVTQuocTe(int lanCapGPKDVTQuocTe) {
		this.lanCapGPKDVTQuocTe = lanCapGPKDVTQuocTe;
	}
	public Date getNgayCapGPKDVTQuocTe() {
		return ngayCapGPKDVTQuocTe;
	}
	public void setNgayCapGPKDVTQuocTe(Date ngayCapGPKDVTQuocTe) {
		this.ngayCapGPKDVTQuocTe = ngayCapGPKDVTQuocTe;
	}
	public Date getNgayGiaHanGPKDVTQuocTe() {
		return ngayGiaHanGPKDVTQuocTe;
	}
	public void setNgayGiaHanGPKDVTQuocTe(Date ngayGiaHanGPKDVTQuocTe) {
		this.ngayGiaHanGPKDVTQuocTe = ngayGiaHanGPKDVTQuocTe;
	}
	public Date getNgayHetHanGPKDVTQuocTe() {
		return ngayHetHanGPKDVTQuocTe;
	}
	public void setNgayHetHanGPKDVTQuocTe(Date ngayHetHanGPKDVTQuocTe) {
		this.ngayHetHanGPKDVTQuocTe = ngayHetHanGPKDVTQuocTe;
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
	public long getIdLoaiHinh() {
		return idLoaiHinh;
	}
	public void setIdLoaiHinh(long idLoaiHinh) {
		this.idLoaiHinh = idLoaiHinh;
	}
	public String getKetQuaXuLyLoaiHinh() {
		return ketQuaXuLyLoaiHinh;
	}
	public void setKetQuaXuLyLoaiHinh(String ketQuaXuLyLoaiHinh) {
		this.ketQuaXuLyLoaiHinh = ketQuaXuLyLoaiHinh;
	}
	public String[] getMaTuyens() {
		return maTuyens;
	}
	public void setMaTuyens(String[] maTuyens) {
		this.maTuyens = maTuyens;
	}
	public String getNguoiDaiDien() {
		return nguoiDaiDien;
	}
	public void setNguoiDaiDien(String nguoiDaiDien) {
		this.nguoiDaiDien = nguoiDaiDien;
	}
	public String getSoChungMinhNhanDanOrHoChieu() {
		return soChungMinhNhanDanOrHoChieu;
	}
	public void setSoChungMinhNhanDanOrHoChieu(String soChungMinhNhanDanOrHoChieu) {
		this.soChungMinhNhanDanOrHoChieu = soChungMinhNhanDanOrHoChieu;
	}
	public String getNgayCapChungMinhNhanDan() {
		return ngayCapChungMinhNhanDan;
	}
	public void setNgayCapChungMinhNhanDan(String ngayCapChungMinhNhanDan) {
		this.ngayCapChungMinhNhanDan = ngayCapChungMinhNhanDan;
	}
	public String getNoiCapChungMinhNhanDan() {
		return noiCapChungMinhNhanDan;
	}
	public void setNoiCapChungMinhNhanDan(String noiCapChungMinhNhanDan) {
		this.noiCapChungMinhNhanDan = noiCapChungMinhNhanDan;
	}
	public String getBangCap() {
		return bangCap;
	}
	public void setBangCap(String bangCap) {
		this.bangCap = bangCap;
	}
	public String getThoiGianDieuHanhTrucTiepDnTu() {
		return thoiGianDieuHanhTrucTiepDnTu;
	}
	public void setThoiGianDieuHanhTrucTiepDnTu(String thoiGianDieuHanhTrucTiepDnTu) {
		this.thoiGianDieuHanhTrucTiepDnTu = thoiGianDieuHanhTrucTiepDnTu;
	}
	public String getThoiGianDieuHanhTrucTiepDnDen() {
		return thoiGianDieuHanhTrucTiepDnDen;
	}
	public void setThoiGianDieuHanhTrucTiepDnDen(
			String thoiGianDieuHanhTrucTiepDnDen) {
		this.thoiGianDieuHanhTrucTiepDnDen = thoiGianDieuHanhTrucTiepDnDen;
	}
	public String getThoiHanCapGiayKinhDoanhVanTaiTu() {
		return thoiHanCapGiayKinhDoanhVanTaiTu;
	}
	public void setThoiHanCapGiayKinhDoanhVanTaiTu(
			String thoiHanCapGiayKinhDoanhVanTaiTu) {
		this.thoiHanCapGiayKinhDoanhVanTaiTu = thoiHanCapGiayKinhDoanhVanTaiTu;
	}
	public String getThoiHanCapGiayKinhDoanhVanTaiDen() {
		return thoiHanCapGiayKinhDoanhVanTaiDen;
	}
	public void setThoiHanCapGiayKinhDoanhVanTaiDen(
			String thoiHanCapGiayKinhDoanhVanTaiDen) {
		this.thoiHanCapGiayKinhDoanhVanTaiDen = thoiHanCapGiayKinhDoanhVanTaiDen;
	}
	public String getKetQuaDanhGiaNguoiDieuHanhVanTai() {
		return ketQuaDanhGiaNguoiDieuHanhVanTai;
	}
	public void setKetQuaDanhGiaNguoiDieuHanhVanTai(
			String ketQuaDanhGiaNguoiDieuHanhVanTai) {
		this.ketQuaDanhGiaNguoiDieuHanhVanTai = ketQuaDanhGiaNguoiDieuHanhVanTai;
	}
	public String getSoGiayPhepCuaNguoiDieuHanh() {
		return soGiayPhepCuaNguoiDieuHanh;
	}
	public void setSoGiayPhepCuaNguoiDieuHanh(String soGiayPhepCuaNguoiDieuHanh) {
		this.soGiayPhepCuaNguoiDieuHanh = soGiayPhepCuaNguoiDieuHanh;
	}
	public String getLanCapGiayPhepCuaNguoiDieuHanh() {
		return lanCapGiayPhepCuaNguoiDieuHanh;
	}
	public void setLanCapGiayPhepCuaNguoiDieuHanh(
			String lanCapGiayPhepCuaNguoiDieuHanh) {
		this.lanCapGiayPhepCuaNguoiDieuHanh = lanCapGiayPhepCuaNguoiDieuHanh;
	}
	public String getNgayCapGiayPhepCuaNguoiDieuHanh() {
		return ngayCapGiayPhepCuaNguoiDieuHanh;
	}
	public void setNgayCapGiayPhepCuaNguoiDieuHanh(
			String ngayCapGiayPhepCuaNguoiDieuHanh) {
		this.ngayCapGiayPhepCuaNguoiDieuHanh = ngayCapGiayPhepCuaNguoiDieuHanh;
	}
	
	public String getTenDn() {
		return tenDn;
	}
	
	public void setTenDn(String tenDn) {
		this.tenDn = tenDn;
	}
	
	public String getDiaChiDn() {
		return diaChiDn;
	}
	
	public void setDiaChiDn(String diaChiDn) {
		this.diaChiDn = diaChiDn;
	}
	
	public String getSoFaxDN() {
		return soFaxDN;
	}
	
	public void setSoFaxDN(String soFaxDN) {
		this.soFaxDN = soFaxDN;
	}
	
	public String getDienThoaiDn() {
		return dienThoaiDn;
	}
	
	public void setDienThoaiDn(String dienThoaiDn) {
		this.dienThoaiDn = dienThoaiDn;
	}
	public int getThongHoSoId() {
		return thongHoSoId;
	}
	public void setThongHoSoId(int thongHoSoId) {
		this.thongHoSoId = thongHoSoId;
	}
	public String getCapLanDau() {
		return capLanDau;
	}
	public void setCapLanDau(String capLanDau) {
		this.capLanDau = capLanDau;
	}
	public Date getNgayCapGiayPhepKinhDoanhVTLanDau() {
		return ngayCapGiayPhepKinhDoanhVTLanDau;
	}
	public void setNgayCapGiayPhepKinhDoanhVTLanDau(
			Date ngayCapGiayPhepKinhDoanhVTLanDau) {
		this.ngayCapGiayPhepKinhDoanhVTLanDau = ngayCapGiayPhepKinhDoanhVTLanDau;
	}
	public Date getNgayGiaHanGiayPhepKinhDoanhVTLanDau() {
		return ngayGiaHanGiayPhepKinhDoanhVTLanDau;
	}
	public void setNgayGiaHanGiayPhepKinhDoanhVTLanDau(
			Date ngayGiaHanGiayPhepKinhDoanhVTLanDau) {
		this.ngayGiaHanGiayPhepKinhDoanhVTLanDau = ngayGiaHanGiayPhepKinhDoanhVTLanDau;
	}
	public String getNoiCapGiayPhepKinhDoanhVTLanDau() {
		return noiCapGiayPhepKinhDoanhVTLanDau;
	}
	public void setNoiCapGiayPhepKinhDoanhVTLanDau(
			String noiCapGiayPhepKinhDoanhVTLanDau) {
		this.noiCapGiayPhepKinhDoanhVTLanDau = noiCapGiayPhepKinhDoanhVTLanDau;
	}
	public String getLoaiHinhKinhDoanh() {
		return loaiHinhKinhDoanh;
	}
	public void setLoaiHinhKinhDoanh(String loaiHinhKinhDoanh) {
		this.loaiHinhKinhDoanh = loaiHinhKinhDoanh;
	}
}
