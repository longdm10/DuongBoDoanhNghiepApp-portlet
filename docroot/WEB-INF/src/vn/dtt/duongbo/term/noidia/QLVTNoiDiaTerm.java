package vn.dtt.duongbo.term.noidia;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.util.ParamUtil;

public class QLVTNoiDiaTerm {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public static final String ID = "id";
	public static final String THONG_TIN_HO_SO_ID = "thongHoSoId";
	public static final String ID_LOAI_HINH_VT = "idLoaiHinhVt";
	public static final String THONG_TIN_XU_LY_ID = "thongTinXuLyId";
	public static final String LOAI_HINH_CAP = "loaiHinhCap";
	public static final String SO_GPKD_VAN_TAI_BAN_OTO = "soGpkdVanTaiBangOto";
	public static final String NGAY_CAP_GPKD_VAN_TAI_BANG_OTO = "ngayCapGpkdVanTaiBangOto";
	public static final String CO_QUAN_CAP_GPKD_VAN_TAI_BANG_OTO = "coQuanCapGpkdVanTaiBangOto";
	public static final String NGAY_HET_HAN_GPKD_VAN_TAI_BANG_OTO = "ngayHetHanGpkdVanTaiBangOto";
	public static final String NGUOI_TRUC_TIEP_DIEU_HANH = "nguoiTrucTiepDieuHanh";
	public static final String SO_CMT_NGUOI_DIEU_HANH = "soCmtNguoiDieuHanh";
	public static final String NGAY_CAP_NGUOI_DIEU_HANH = "ngayCapNguoiDieuHanh";
	public static final String NOI_CAP_NGUOI_DIEU_HANH = "noiCapNguoiDieuHanh";
	public static final String BANG_CAP_NGUOI_DIEU_HANH = "bangCapNguoiDieuHanh";
	public static final String THOI_GIAN_BAT_DAU_DIEU_HANH = "thoiGianBatDauDieuHanh";
	public static final String THOI_GIAN_KET_THUC_DIEU_HANH = "thoiGianKetThucDieuHanh";
	public static final String SO_GIAY_PHEP_NGUOI_DIEU_HANH = "soGiayPhepNguoiDieuHanh";
	public static final String LAN_CAP_NGUOI_DIEU_HANH = "lanCapNguoiDieuHanh";
	public static final String NGAY_CAP_CC_DIEU_HANH = "ngayCapCcDieuHanh";
	public static final String NGAY_HET_HAN_CC_DIEU_HANH = "ngayHetHanCcDieuHanh";
	public static final String KET_QUA_XU_LY = "ketQuaXuLy";
	public static final String LY_DO_KHONG_DAT = "lyDoKhongDat";
	public static final String GPKD_VT_BANG_OTO_ID = "gpkdvtBangOtoId";
	public static final String MA_LOAI_HINH_HOAT_DONG = "maLoaiHinhHoatDong";
	public static final String LOAI_HINH_KINH_DOANH_CU_THE = "loaiHinhKinhDoanhCuThe";
	public static final String SO_LUONG_PHUONG_TIEN = "soLuongPhuongTien";
	public static final String THIET_BI_GIAM_SAT_HANH_TRINH = "thietBiGiamSatHanhTrinh";
	public static final String PHAM_VI_HOAT_DONG = "phamViHoatDong";
	public static final String TUYEN_TU = "tuyenTu";
	public static final String TUYEN_DEN = "tuyenDen";
	public static final String SO_CHUYEN = "soChuyen";
	public static final String MAU_SON = "mauSon";

	public static final String KET_QUA_XU_LY_LOAI_HINH  = "ketQuaXuLyLoaiHinh";
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
    //TODO bo sung them
    public static final String TEN_DN="tenDn";
    public static final String DIA_CHI_DN="diaChiDn";
    public static final String NGUOI_DAI_DIEN_DN="nguoiDaiDienDn";
    public static final String LOAI_HINH_KINH_DOANH="loaiHinhKinhDoanh";
    public static final String DIEN_THOAI_DN = "dienThoaiDn";
	public static final String SO_FAX_DN = "soFaxDN";

	//update 20/1
	public static final String NGUOI_NHAN_KET_QUA = "nguoiNhanKetQua";
	public static final String THONG_TIN_TRA_KET_QUA = "thongTinTraKetQua";
	public static final String NGAY_TRA_KET_QUA = "ngayTraKetQua";
    
	//update 21/1
	public static final String TEN_NGUOI_DIEU_HANH = "tenNguoiDieuHanh";
	public static final String LY_DO_KHONG_DAT_NGUOI_DIEU_HANH = "lyDoKhongDatNguoiDieuHanh";
	public static final String KET_QUA_XU_LY_NGUOI_DIEU_HANH = "ketQuaXuLyNguoiDieuHanh";
	
	public QLVTNoiDiaTerm() {
		// TODO Auto-generated constructor stub
	}

	public QLVTNoiDiaTerm(ActionRequest actionRequest) {
		// TODO Auto-generated constructor stub
		id= ParamUtil.getLong(actionRequest, ID);
		thongHoSoId= ParamUtil.getInteger(actionRequest, THONG_TIN_HO_SO_ID);
		thongTinXuLyId= ParamUtil.getInteger(actionRequest, THONG_TIN_XU_LY_ID);
		loaiHinhCap= ParamUtil.getString(actionRequest, LOAI_HINH_CAP);
		soGpkdVanTaiBangOto= ParamUtil.getString(actionRequest, SO_GPKD_VAN_TAI_BAN_OTO);
		ngayCapGpkdVanTaiBangOto= ParamUtil.getDate(actionRequest, NGAY_CAP_GPKD_VAN_TAI_BANG_OTO, sdf, null);
		coQuanCapGpkdVanTaiBangOto= ParamUtil.getString(actionRequest, CO_QUAN_CAP_GPKD_VAN_TAI_BANG_OTO);
		ngayHetHanGpkdVanTaiBangOto= ParamUtil.getDate(actionRequest, NGAY_HET_HAN_GPKD_VAN_TAI_BANG_OTO, sdf, null);
		nguoiTrucTiepDieuHanh= ParamUtil.getString(actionRequest, NGUOI_TRUC_TIEP_DIEU_HANH);
		soCmtNguoiDieuHanh= ParamUtil.getString(actionRequest, SO_CMT_NGUOI_DIEU_HANH);
		ngayCapNguoiDieuHanh= ParamUtil.getDate(actionRequest, NGAY_CAP_NGUOI_DIEU_HANH, sdf, null);
		noiCapNguoiDieuHanh= ParamUtil.getString(actionRequest, NOI_CAP_NGUOI_DIEU_HANH);
		bangCapNguoiDieuHanh= ParamUtil.getString(actionRequest, BANG_CAP_NGUOI_DIEU_HANH);
		thoiGianBatDauDieuHanh= ParamUtil.getDate(actionRequest, THOI_GIAN_BAT_DAU_DIEU_HANH, sdf, null);
		thoiGianKetThucDieuHanh= ParamUtil.getDate(actionRequest, THOI_GIAN_KET_THUC_DIEU_HANH, sdf, null);
		soGiayPhepNguoiDieuHanh= ParamUtil.getString(actionRequest, SO_GIAY_PHEP_NGUOI_DIEU_HANH);
		lanCapNguoiDieuHanh= ParamUtil.getInteger(actionRequest, LAN_CAP_NGUOI_DIEU_HANH);
		ngayCapCcDieuHanh= ParamUtil.getDate(actionRequest, NGAY_CAP_CC_DIEU_HANH, sdf, null);
		ngayHetHanCcDieuHanh= ParamUtil.getDate(actionRequest, NGAY_HET_HAN_CC_DIEU_HANH, sdf, null);
		ketQuaXuLy= ParamUtil.getString(actionRequest, KET_QUA_XU_LY);
	
		gpkdvtBangOtoId= ParamUtil.getInteger(actionRequest, GPKD_VT_BANG_OTO_ID);
		maLoaiHinhHoatDong= ParamUtil.getString(actionRequest, MA_LOAI_HINH_HOAT_DONG);
		loaiHinhKinhDoanhCuThe= ParamUtil.getString(actionRequest, LOAI_HINH_KINH_DOANH_CU_THE);
		soLuongPhuongTien= ParamUtil.getInteger(actionRequest, SO_LUONG_PHUONG_TIEN);
		thietBiGiamSatHanhTrinh= ParamUtil.getLong(actionRequest, THIET_BI_GIAM_SAT_HANH_TRINH);
		phamViHoatDong= ParamUtil.getString(actionRequest, PHAM_VI_HOAT_DONG);
		tuyenTu= ParamUtil.getString(actionRequest, TUYEN_TU);
		tuyenDen= ParamUtil.getString(actionRequest, TUYEN_DEN);
		soChuyen= ParamUtil.getInteger(actionRequest, SO_CHUYEN);
		mauSon= ParamUtil.getString(actionRequest, MAU_SON);
		
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
        ketQuaXuLyLoaiHinh = ParamUtil.getString(actionRequest, KET_QUA_XU_LY_LOAI_HINH);
        tenDn= ParamUtil.getString(actionRequest, TEN_DN);
        diaChiDn = ParamUtil.getString(actionRequest, DIA_CHI_DN);
        idLoaiHinhVt = ParamUtil.getInteger(actionRequest, ID_LOAI_HINH_VT);
        loaiHinhKinhDoanh = ParamUtil.getString(actionRequest, LOAI_HINH_KINH_DOANH);
        maTuyen = ParamUtil.getString(actionRequest, MA_TUYEN);
        maTuyens = ParamUtil.getString(actionRequest, MA_TUYENS);
        
        if(ketQuaXuLy.equalsIgnoreCase("0")){
        	lyDoKhongDat= ParamUtil.getString(actionRequest, LY_DO_KHONG_DAT);
        }
        soFaxDN =ParamUtil.getString(actionRequest, SO_FAX_DN);
        dienThoaiDn = ParamUtil.getString(actionRequest, DIEN_THOAI_DN);
        
        ngayTraKetQua = ParamUtil.getDate(actionRequest, NGAY_TRA_KET_QUA, sdf, null); 
        nguoiNhanKetQua = ParamUtil.getString(actionRequest, NGUOI_NHAN_KET_QUA);
        thongTinTraKetQua = ParamUtil.getString(actionRequest, THONG_TIN_TRA_KET_QUA);
        tenNguoiDieuHanh = ParamUtil.getString(actionRequest, TEN_NGUOI_DIEU_HANH);
        lyDoKhongDatNguoiDieuHanh = ParamUtil.getString(actionRequest, LY_DO_KHONG_DAT_NGUOI_DIEU_HANH);
        ketQuaXuLyNguoiDieuHanh = ParamUtil.getString(actionRequest, KET_QUA_XU_LY_NGUOI_DIEU_HANH);
	}
	private int thongHoSoId;
	private long id;
    private int thongTinXuLyId;
	private String loaiHinhCap;
	private String soGpkdVanTaiBangOto;
	private Date ngayCapGpkdVanTaiBangOto;
	private String coQuanCapGpkdVanTaiBangOto;
	private Date ngayHetHanGpkdVanTaiBangOto;
	private String nguoiTrucTiepDieuHanh;
	private String soCmtNguoiDieuHanh;
	private Date ngayCapNguoiDieuHanh;
	private String noiCapNguoiDieuHanh;
	private String bangCapNguoiDieuHanh;
	private Date thoiGianBatDauDieuHanh;
	private Date thoiGianKetThucDieuHanh;
	private String soGiayPhepNguoiDieuHanh;
	private int lanCapNguoiDieuHanh;
	private Date ngayCapCcDieuHanh;
	private Date ngayHetHanCcDieuHanh;
	private String ketQuaXuLy;
	private String lyDoKhongDat;
	private int gpkdvtBangOtoId;
	private String maLoaiHinhHoatDong;
	private String loaiHinhKinhDoanhCuThe;
	private int soLuongPhuongTien;
	private long thietBiGiamSatHanhTrinh;
	private String phamViHoatDong;
	private String tuyenTu;
	private String tuyenDen;
	private int soChuyen;
	private String mauSon;

	private long idLoaiHinh;
	private String ketQuaXuLyLoaiHinh;
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
    private String tenDn;
    private String diaChiDn;
    private int idLoaiHinhVt;
    private String loaiHinhKinhDoanh;
    private String maTuyen;
    private String maTuyens;
    private String soFaxDN;
    private String dienThoaiDn;
    
    private String tenNguoiDieuHanh;
    private String ketQuaXuLyNguoiDieuHanh;
    private String lyDoKhongDatNguoiDieuHanh;
    
    public String getKetQuaXuLyNguoiDieuHanh() {
		return ketQuaXuLyNguoiDieuHanh;
	}

	public void setKetQuaXuLyNguoiDieuHanh(String ketQuaXuLyNguoiDieuHanh) {
		this.ketQuaXuLyNguoiDieuHanh = ketQuaXuLyNguoiDieuHanh;
	}

	public String getLyDoKhongDatNguoiDieuHanh() {
		return lyDoKhongDatNguoiDieuHanh;
	}

	public void setLyDoKhongDatNguoiDieuHanh(String lyDoKhongDatNguoiDieuHanh) {
		this.lyDoKhongDatNguoiDieuHanh = lyDoKhongDatNguoiDieuHanh;
	}

	public String getTenNguoiDieuHanh() {
		return tenNguoiDieuHanh;
	}

	public void setTenNguoiDieuHanh(String tenNguoiDieuHanh) {
		this.tenNguoiDieuHanh = tenNguoiDieuHanh;
	}
	public String getNguoiNhanKetQua() {
		return nguoiNhanKetQua;
	}

	public void setNguoiNhanKetQua(String nguoiNhanKetQua) {
		this.nguoiNhanKetQua = nguoiNhanKetQua;
	}

	public String getthongTinTraKetQua() {
		return thongTinTraKetQua;
	}

	public void setthongTinTraKetQua(String thongTinTraKetQua) {
		this.thongTinTraKetQua = thongTinTraKetQua;
	}
	private String nguoiNhanKetQua;
    private String thongTinTraKetQua;
    private Date ngayTraKetQua;
	

	public Date getNgayTraKetQua() {
		return ngayTraKetQua;
	}

	public void setNgayTraKetQua(Date ngayTraKetQua) {
		this.ngayTraKetQua = ngayTraKetQua;
	}

	public String getLoaiHinhKinhDoanh() {
		return loaiHinhKinhDoanh;
	}

	public String getMaTuyen() {
		return maTuyen;
	}

	public void setMaTuyen(String maTuyen) {
		this.maTuyen = maTuyen;
	}

	public String getMaTuyens() {
		return maTuyens;
	}

	public void setMaTuyens(String maTuyens) {
		this.maTuyens = maTuyens;
	}

	public void setLoaiHinhKinhDoanh(String loaiHinhKinhDoanh) {
		this.loaiHinhKinhDoanh = loaiHinhKinhDoanh;
	}

	public int getIdLoaiHinhVt() {
		return idLoaiHinhVt;
	}

	public void setIdLoaiHinhVt(int idLoaiHinhVt) {
		this.idLoaiHinhVt = idLoaiHinhVt;
	}

	public String getDiaChiDn() {
		return diaChiDn;
	}

	public void setDiaChiDn(String diaChiDn) {
		this.diaChiDn = diaChiDn;
	}

	public String getTenDn() {
		return tenDn;
	}

	public void setTenDn(String tenDn) {
		this.tenDn = tenDn;
	}

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

	public String getLoaiHinhCap() {
		return loaiHinhCap;
	}

	public void setLoaiHinhCap(String loaiHinhCap) {
		this.loaiHinhCap = loaiHinhCap;
	}

	public String getSoGpkdVanTaiBangOto() {
		return soGpkdVanTaiBangOto;
	}

	public void setSoGpkdVanTaiBangOto(String soGpkdVanTaiBangOto) {
		this.soGpkdVanTaiBangOto = soGpkdVanTaiBangOto;
	}

	public Date getNgayCapGpkdVanTaiBangOto() {
		return ngayCapGpkdVanTaiBangOto;
	}

	public void setNgayCapGpkdVanTaiBangOto(Date ngayCapGpkdVanTaiBangOto) {
		this.ngayCapGpkdVanTaiBangOto = ngayCapGpkdVanTaiBangOto;
	}

	public String getCoQuanCapGpkdVanTaiBangOto() {
		return coQuanCapGpkdVanTaiBangOto;
	}

	public void setCoQuanCapGpkdVanTaiBangOto(String coQuanCapGpkdVanTaiBangOto) {
		this.coQuanCapGpkdVanTaiBangOto = coQuanCapGpkdVanTaiBangOto;
	}

	public Date getNgayHetHanGpkdVanTaiBangOto() {
		return ngayHetHanGpkdVanTaiBangOto;
	}

	public void setNgayHatHanGpkdVanTaiBangOto(Date ngayHetHanGpkdVanTaiBangOto) {
		this.ngayHetHanGpkdVanTaiBangOto = ngayHetHanGpkdVanTaiBangOto;
	}

	public String getNguoiTrucTiepDieuHanh() {
		return nguoiTrucTiepDieuHanh;
	}

	public void setNguoiTrucTiepDieuHanh(String nguoiTrucTiepDieuHanh) {
		this.nguoiTrucTiepDieuHanh = nguoiTrucTiepDieuHanh;
	}

	public String getSoCmtNguoiDieuHanh() {
		return soCmtNguoiDieuHanh;
	}

	public void setSoCmtNguoiDieuHanh(String soCmtNguoiDieuHanh) {
		this.soCmtNguoiDieuHanh = soCmtNguoiDieuHanh;
	}

	public Date getNgayCapNguoiDieuHanh() {
		return ngayCapNguoiDieuHanh;
	}

	public void setNgayCapNguoiDieuHanh(Date ngayCapNguoiDieuHanh) {
		this.ngayCapNguoiDieuHanh = ngayCapNguoiDieuHanh;
	}

	public String getNoiCapNguoiDieuHanh() {
		return noiCapNguoiDieuHanh;
	}

	public void setNoiCapNguoiDieuHanh(String noiCapNguoiDieuHanh) {
		this.noiCapNguoiDieuHanh = noiCapNguoiDieuHanh;
	}

	public String getBangCapNguoiDieuHanh() {
		return bangCapNguoiDieuHanh;
	}

	public void setBangCapNguoiDieuHanh(String bangCapNguoiDieuHanh) {
		this.bangCapNguoiDieuHanh = bangCapNguoiDieuHanh;
	}

	public Date getThoiGianBatDauDieuHanh() {
		return thoiGianBatDauDieuHanh;
	}

	public void setThoiGianBatDauDieuHanh(Date thoiGianBatDauDieuHanh) {
		this.thoiGianBatDauDieuHanh = thoiGianBatDauDieuHanh;
	}

	public Date getThoiGianKetThucDieuHanh() {
		return thoiGianKetThucDieuHanh;
	}

	public void setThoiGianKetThucDieuHanh(Date thoiGianKetThucDieuHanh) {
		this.thoiGianKetThucDieuHanh = thoiGianKetThucDieuHanh;
	}

	public String getSoGiayPhepNguoiDieuHanh() {
		return soGiayPhepNguoiDieuHanh;
	}

	public void setSoGiayPhepNguoiDieuHanh(String soGiayPhepNguoiDieuHanh) {
		this.soGiayPhepNguoiDieuHanh = soGiayPhepNguoiDieuHanh;
	}

	public int getLanCapNguoiDieuHanh() {
		return lanCapNguoiDieuHanh;
	}

	public void setLanCapNguoiDieuHanh(int lanCapNguoiDieuHanh) {
		this.lanCapNguoiDieuHanh = lanCapNguoiDieuHanh;
	}

	public Date getNgayCapCcDieuHanh() {
		return ngayCapCcDieuHanh;
	}

	public void setNgayCapCcDieuHanh(Date ngayCapCcDieuHanh) {
		this.ngayCapCcDieuHanh = ngayCapCcDieuHanh;
	}

	public Date getNgayHetHanCcDieuHanh() {
		return ngayHetHanCcDieuHanh;
	}

	public void setNgayHetHanCcDieuHanh(Date ngayHetHanCcDieuHanh) {
		this.ngayHetHanCcDieuHanh = ngayHetHanCcDieuHanh;
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

	public int getGpkdvtBangOtoId() {
		return gpkdvtBangOtoId;
	}

	public void setGpkdvtBangOtoId(int gpkdvtBangOtoId) {
		this.gpkdvtBangOtoId = gpkdvtBangOtoId;
	}

	public String getMaLoaiHinhHoatDong() {
		return maLoaiHinhHoatDong;
	}

	public void setMaLoaiHinhHoatDong(String maLoaiHinhHoatDong) {
		this.maLoaiHinhHoatDong = maLoaiHinhHoatDong;
	}

	public String getLoaiHinhKinhDoanhCuThe() {
		return loaiHinhKinhDoanhCuThe;
	}

	public void setLoaiHinhKinhDoanhCuThe(String loaiHinhKinhDoanhCuThe) {
		this.loaiHinhKinhDoanhCuThe = loaiHinhKinhDoanhCuThe;
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

	public String getTuyenTu() {
		return tuyenTu;
	}

	public void setTuyenTu(String tuyenTu) {
		this.tuyenTu = tuyenTu;
	}

	public String getTuyenDen() {
		return tuyenDen;
	}

	public void setTuyenDen(String tuyenDen) {
		this.tuyenDen = tuyenDen;
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

	public void setNgayHetHanGpkdVanTaiBangOto(Date ngayHetHanGpkdVanTaiBangOto) {
		this.ngayHetHanGpkdVanTaiBangOto = ngayHetHanGpkdVanTaiBangOto;
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
}
