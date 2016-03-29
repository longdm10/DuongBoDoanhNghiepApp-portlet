package vn.dtt.duongbo.term.quocte;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.util.ParamUtil;

public class QLVTKhaiTacTuyen {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public static final String ID ="id";
	public static final String THONG_TIN_XU_LY_ID="thongTinXuLyId";
	public static final String LOAI_CAP_PHEP="loaiCapPhep";
	public static final String BEN_DI="benDi";
	public static final String DIEM_DI="diemDi";
	public static final String BEN_DEN="benDen";
	public static final String DIEM_DEN="diemDen";
	public static final String CU_LY_VAN_CHUYEN="cuLyVanChuyen";
	public static final String HANH_TRINH_CHAY="hanhTrinhChay";
	public static final String CUA_KHAU="cuaKhau";
	public static final String KET_QUA_DANH_GIA_GPVT="ketQuaDanhGiaGPVT";
	public static final String LY_DO_KHONG_DAT="lyDoKhongDat";
	public static final String ID_BIEU_DO_XE="idBieuDoXe";
	public static final String GIO_XUAT_BEN="gioXuatBen";
	public static final String PHU_XUAT_BEN="phuXuatBen";
	public static final String TAN_XUAT="tanXuat";
	public static final String ID_DIEM_DUNG_NGHI="idDiemDungNghi";
	public static final String KTT_QUOC_TE_ID="kttQuocTeId";
	public static final String LOAI_LUOT="loaiLuot";
	public static final String SO_THU_THU_LUOT="soThuTuLuot";
	public static final String MA_BEN="maBen";
	
	public static final String HO_TEN_NTKQ="hoTenNTKQ";
	public static final String DIEN_THOAI_NTKQ="dienThoaiNTKQ";
	public static final String SO_QPKD="soGpkd";
	public static final String NGAY_CAP_GPKD="ngayCapGpkd";
	public static final String NIEN_HAN_GPKD="nienHanGpkd";
	public static final String CO_QUAN_CAP_GPKD="coQuanCapGpkd";
	public static final String TEN_DN="tenDn";
	public static final String DIA_CHI_DN="diaChiDn";
	public static final String DIEN_THOAI_DN="dienThoaiDn";
	public static final String LY_DO_GIA_HAN="lyDoGiaHan";
	public static final String SO_GIO_DUNG_NGHI="soGioDungNghi";
	public static final String SO_PHUT_DUNG_NGHI="soPhutDungNghi";
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
    
    public static final String NGAY_HET_HAN_GPKDVT="ngayHetHanGPKDVT";
    public static final String NGAY_TANG_GIAM_TAN_XUAT_TU="ngayTangGiamTanXuatTu";
    public static final String TEN_TUYEN_DE_NGHI_TANG_GIAM_TAN_SUAT="tenTuyenDeNghiTangGiamTanSuat";
    public static final String TINH_TP_DI="tinhThanhPhoDi";
    public static final String TINH_TP_DEN="tinhThanhPhoDen";
    
    public static final String BIEN_SO="bienSo";
    public static final String NHAN_HIEU="nhanHieu";
    public static final String NAM_SX="namSanXuat";
    public static final String TEN_DANG_KY_SO_HUU="tenDangKySoHuu";
    public static final String TRONG_TAI="trongTai";
    public static final String HINH_THUC_SO_HUU="hinhThucSoHuu";
    public static final String DOANH_NGHIEP_CHO_THUE="doanhNghiepChoThue";
    
    public static final String THOI_HAN_CHO_THUE="thoiHanChoThue";
    public static final String HOP_DONG_SAU_CUNG="hopDongSauCung";
    public static final String KET_QUA_XU_LY="ketQuaXuLy";
    
    public static final String TEN_TUYEN_NGUNG_KHAI_THAC="tenTuyenNgungKhaiThac";
    public static final String NGAY_NGUNG_KHAI_THAC_TUYEN_TU="ngungKhaiThacTuyenTuNgay";
    
    public static final String ID_XU_LY_KTT_QUOC_TE="idXuLyKTTQuocTe";
    public static final String ID_PHUONG_TIEN="idPhuongTien";
    
    public static final String THONG_TIN_HO_SO_ID="thongTinHoSoId";
    public static final String MA_TUYEN ="maTuyen";
    
    
	public QLVTKhaiTacTuyen() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public QLVTKhaiTacTuyen(ActionRequest actionRequest) {
		super();
		id= ParamUtil.getLong(actionRequest, ID) ;
		thongTinXuLyId = ParamUtil.getInteger(actionRequest, THONG_TIN_XU_LY_ID) ;
		loaiCapPhep = ParamUtil.getString(actionRequest, LOAI_CAP_PHEP) ;
		benDi = ParamUtil.getString(actionRequest, BEN_DI) ;
		diemDi = ParamUtil.getString(actionRequest, DIEM_DI) ;
		benDen = ParamUtil.getString(actionRequest, BEN_DEN) ;
		diemDen =  ParamUtil.getString(actionRequest, DIEM_DEN) ;
		cuLyVanChuyen =  ParamUtil.getInteger(actionRequest, CU_LY_VAN_CHUYEN) ;
		hanhTrinhChay = ParamUtil.getString(actionRequest, HANH_TRINH_CHAY) ;
		cuaKhau =  ParamUtil.getString(actionRequest, CUA_KHAU) ;
		ketQuaDanhGiaGPVT =ParamUtil.getString(actionRequest, KET_QUA_DANH_GIA_GPVT) ;
		lyDoKhongDat = ParamUtil.getString(actionRequest, LY_DO_KHONG_DAT) ;
		idBieuDoXe = ParamUtil.getInteger(actionRequest, ID_BIEU_DO_XE) ;
		gioXuatBen = ParamUtil.getInteger(actionRequest, GIO_XUAT_BEN) ; 
		phuXuatBen = ParamUtil.getInteger(actionRequest, PHU_XUAT_BEN) ; 
		tanXuat = ParamUtil.getInteger(actionRequest, TAN_XUAT) ; 
		idDiemDungNghi =  ParamUtil.getString(actionRequest, ID_DIEM_DUNG_NGHI) ; 
		kttQuocTeId =  ParamUtil.getInteger(actionRequest, KTT_QUOC_TE_ID) ; 
		loaiLuot =  ParamUtil.getString(actionRequest, LOAI_LUOT) ; 
		soThuTuLuot = ParamUtil.getInteger(actionRequest, SO_THU_THU_LUOT) ; 
		
		
		hoTenNTKQ  = ParamUtil.getString(actionRequest, HO_TEN_NTKQ) ; 
		dienThoaiNTKQ = ParamUtil.getString(actionRequest, DIEN_THOAI_NTKQ) ; 
		soGpkd = ParamUtil.getString(actionRequest, SO_QPKD) ; 
		
		 
		ngayCapGpkd  = ParamUtil.getDate(actionRequest, NGAY_CAP_GPKD ,sdf ,null) ; 
		nienHanGpkd =  ParamUtil.getString(actionRequest, NIEN_HAN_GPKD) ; 
		
		coQuanCapGpkd = ParamUtil.getString(actionRequest, CO_QUAN_CAP_GPKD) ;
		 
		tenDn = ParamUtil.getString(actionRequest, TEN_DN) ;
		diaChiDn = ParamUtil.getString(actionRequest, DIA_CHI_DN) ;
		dienThoaiDn = ParamUtil.getString(actionRequest, DIEN_THOAI_DN) ;
		
		lyDoGiaHan = ParamUtil.getString(actionRequest, LY_DO_GIA_HAN) ;
		
		soGioDungNghi = ParamUtil.getInteger(actionRequest, SO_GIO_DUNG_NGHI) ;
		
		soPhutDungNghi  = ParamUtil.getInteger(actionRequest, SO_PHUT_DUNG_NGHI) ;
		
		
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
        
        ngayHetHanGPKDVT = ParamUtil.getDate(actionRequest, NGAY_HET_HAN_GPKDVT, sdf, null) ; 
        ngayTangGiamTanXuatTu  =ParamUtil.getDate(actionRequest, NGAY_TANG_GIAM_TAN_XUAT_TU, sdf, null) ; 
        
        tenTuyenDeNghiTangGiamTanSuat =  ParamUtil.getString(actionRequest, TEN_TUYEN_DE_NGHI_TANG_GIAM_TAN_SUAT);
        tinhThanhPhoDi  = ParamUtil.getString(actionRequest, TINH_TP_DI);
        tinhThanhPhoDi= ParamUtil.getString(actionRequest, TINH_TP_DEN);
        bienSo = ParamUtil.getString(actionRequest, BIEN_SO);
        nhanHieu = ParamUtil.getString(actionRequest, NHAN_HIEU);
        namSanXuat =  ParamUtil.getString(actionRequest, NAM_SX);
        tenDangKySoHuu = ParamUtil.getString(actionRequest, TEN_DANG_KY_SO_HUU);
        trongTai  = ParamUtil.getString(actionRequest, TRONG_TAI);
        hinhThucSoHuu  =  ParamUtil.getString(actionRequest, HINH_THUC_SO_HUU);
        doanhNghiepChoThue  = ParamUtil.getString(actionRequest, DOANH_NGHIEP_CHO_THUE);
        thoiHanChoThue = ParamUtil.getString(actionRequest, THOI_HAN_CHO_THUE);
        hopDongSauCung  = ParamUtil.getString(actionRequest, HOP_DONG_SAU_CUNG);
        ketQuaXuLy = ParamUtil.getString(actionRequest, KET_QUA_XU_LY);
        tenTuyenNgungKhaiThac =  ParamUtil.getString(actionRequest, TEN_TUYEN_NGUNG_KHAI_THAC);
        
        ngungKhaiThacTuyenTuNgay =  ParamUtil.getString(actionRequest, NGAY_NGUNG_KHAI_THAC_TUYEN_TU);
        idXuLyKTTQuocTe= ParamUtil.getString(actionRequest, ID_XU_LY_KTT_QUOC_TE);
        
        idPhuongTien = ParamUtil.getString(actionRequest, ID_PHUONG_TIEN);
        thongTinHoSoId = ParamUtil.getInteger(actionRequest, THONG_TIN_HO_SO_ID) ;
        
        maTuyen = ParamUtil.getString(actionRequest, MA_TUYEN);
	}



	private long id;
	private int thongTinXuLyId;
	private String loaiCapPhep;
	private String benDi;
	private String diemDi;
	private String benDen;
	private String diemDen;
	private int cuLyVanChuyen;
	private String hanhTrinhChay;
	private String cuaKhau;
	private String ketQuaDanhGiaGPVT;
	private String lyDoKhongDat;
	private long idBieuDoXe;
	private int gioXuatBen;
	private int phuXuatBen;
	private int tanXuat;
	private String idDiemDungNghi;
	private int kttQuocTeId;
	private String loaiLuot;
	private int soThuTuLuot;
	private String maBen;
	
	private String hoTenNTKQ;
	private String dienThoaiNTKQ;
	private String soGpkd;
	private Date ngayCapGpkd;
	private String nienHanGpkd;
	private String coQuanCapGpkd;
	private String tenDn;
	private String diaChiDn;
	private String dienThoaiDn;
	private String lyDoGiaHan;
	private int soGioDungNghi;
	private int soPhutDungNghi;
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
    
    private Date ngayHetHanGPKDVT; 
    private Date  ngayTangGiamTanXuatTu;
    
    private String  tenTuyenDeNghiTangGiamTanSuat;
    private String  tinhThanhPhoDi;
    private String  tinhThanhPhoDen;
    private String  bienSo;
    private String  nhanHieu; 
    private String  namSanXuat; 
    private String  tenDangKySoHuu; 
    private String  trongTai; 
    private String  hinhThucSoHuu; 
    private String  doanhNghiepChoThue; 
    private String  thoiHanChoThue;
    private String  hopDongSauCung;
    private String  ketQuaXuLy;
    private String  tenTuyenNgungKhaiThac;
    private String  ngungKhaiThacTuyenTuNgay;
    private String  idXuLyKTTQuocTe;
    private String  idPhuongTien;
    private int thongTinHoSoId;
    
    private String   maTuyen;
    
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
	public String getBenDi() {
		return benDi;
	}
	public void setBenDi(String benDi) {
		this.benDi = benDi;
	}
	public String getDiemDi() {
		return diemDi;
	}
	public void setDiemDi(String diemDi) {
		this.diemDi = diemDi;
	}
	public String getBenDen() {
		return benDen;
	}
	public void setBenDen(String benDen) {
		this.benDen = benDen;
	}
	public String getDiemDen() {
		return diemDen;
	}
	public void setDiemDen(String diemDen) {
		this.diemDen = diemDen;
	}
	public int getCuLyVanChuyen() {
		return cuLyVanChuyen;
	}
	public void setCuLyVanChuyen(int cuLyVanChuyen) {
		this.cuLyVanChuyen = cuLyVanChuyen;
	}
	public String getHanhTrinhChay() {
		return hanhTrinhChay;
	}
	public void setHanhTrinhChay(String hanhTrinhChay) {
		this.hanhTrinhChay = hanhTrinhChay;
	}
	public String getCuaKhau() {
		return cuaKhau;
	}
	public void setCuaKhau(String cuaKhau) {
		this.cuaKhau = cuaKhau;
	}
	public String getKetQuaDanhGiaGPVT() {
		return ketQuaDanhGiaGPVT;
	}
	public void setKetQuaDanhGiaGPVT(String ketQuaDanhGiaGPVT) {
		this.ketQuaDanhGiaGPVT = ketQuaDanhGiaGPVT;
	}
	public String getLyDoKhongDat() {
		return lyDoKhongDat;
	}
	public void setLyDoKhongDat(String lyDoKhongDat) {
		this.lyDoKhongDat = lyDoKhongDat;
	}
	public long getIdBieuDoXe() {
		return idBieuDoXe;
	}
	public void setIdBieuDoXe(long idBieuDoXe) {
		this.idBieuDoXe = idBieuDoXe;
	}
	public int getGioXuatBen() {
		return gioXuatBen;
	}
	public void setGioXuatBen(int gioXuatBen) {
		this.gioXuatBen = gioXuatBen;
	}
	public int getPhuXuatBen() {
		return phuXuatBen;
	}
	public void setPhuXuatBen(int phuXuatBen) {
		this.phuXuatBen = phuXuatBen;
	}
	public int getTanXuat() {
		return tanXuat;
	}
	public void setTanXuat(int tanXuat) {
		this.tanXuat = tanXuat;
	}
	public String getIdDiemDungNghi() {
		return idDiemDungNghi;
	}
	public void setIdDiemDungNghi(String idDiemDungNghi) {
		this.idDiemDungNghi = idDiemDungNghi;
	}
	public int getKttQuocTeId() {
		return kttQuocTeId;
	}
	public void setKttQuocTeId(int kttQuocTeId) {
		this.kttQuocTeId = kttQuocTeId;
	}
	public String getLoaiLuot() {
		return loaiLuot;
	}
	public void setLoaiLuot(String loaiLuot) {
		this.loaiLuot = loaiLuot;
	}
	public int getSoThuTuLuot() {
		return soThuTuLuot;
	}
	public void setSoThuTuLuot(int soThuTuLuot) {
		this.soThuTuLuot = soThuTuLuot;
	}
	public String getMaBen() {
		return maBen;
	}
	public void setMaBen(String maBen) {
		this.maBen = maBen;
	}
	public String getHoTenNTKQ() {
		return hoTenNTKQ;
	}
	public void setHoTenNTKQ(String hoTenNTKQ) {
		this.hoTenNTKQ = hoTenNTKQ;
	}
	public String getDienThoaiNTKQ() {
		return dienThoaiNTKQ;
	}
	public void setDienThoaiNTKQ(String dienThoaiNTKQ) {
		this.dienThoaiNTKQ = dienThoaiNTKQ;
	}
	public String getSoGpkd() {
		return soGpkd;
	}
	public void setSoGpkd(String soGpkd) {
		this.soGpkd = soGpkd;
	}
	public Date getNgayCapGpkd() {
		return ngayCapGpkd;
	}
	public void setNgayCapGpkd(Date ngayCapGpkd) {
		this.ngayCapGpkd = ngayCapGpkd;
	}
	public String getNienHanGpkd() {
		return nienHanGpkd;
	}
	public void setNienHanGpkd(String nienHanGpkd) {
		this.nienHanGpkd = nienHanGpkd;
	}
	public String getCoQuanCapGpkd() {
		return coQuanCapGpkd;
	}
	public void setCoQuanCapGpkd(String coQuanCapGpkd) {
		this.coQuanCapGpkd = coQuanCapGpkd;
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
	public String getDienThoaiDn() {
		return dienThoaiDn;
	}
	public void setDienThoaiDn(String dienThoaiDn) {
		this.dienThoaiDn = dienThoaiDn;
	}
	public String getLyDoGiaHan() {
		return lyDoGiaHan;
	}
	public void setLyDoGiaHan(String lyDoGiaHan) {
		this.lyDoGiaHan = lyDoGiaHan;
	}
	public int getSoGioDungNghi() {
		return soGioDungNghi;
	}
	public void setSoGioDungNghi(int soGioDungNghi) {
		this.soGioDungNghi = soGioDungNghi;
	}
	public int getSoPhutDungNghi() {
		return soPhutDungNghi;
	}
	public void setSoPhutDungNghi(int soPhutDungNghi) {
		this.soPhutDungNghi = soPhutDungNghi;
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



	public Date getNgayHetHanGPKDVT() {
		return ngayHetHanGPKDVT;
	}



	public void setNgayHetHanGPKDVT(Date ngayHetHanGPKDVT) {
		this.ngayHetHanGPKDVT = ngayHetHanGPKDVT;
	}



	public Date getNgayTangGiamTanXuatTu() {
		return ngayTangGiamTanXuatTu;
	}



	public void setNgayTangGiamTanXuatTu(Date ngayTangGiamTanXuatTu) {
		this.ngayTangGiamTanXuatTu = ngayTangGiamTanXuatTu;
	}



	public String getTenTuyenDeNghiTangGiamTanSuat() {
		return tenTuyenDeNghiTangGiamTanSuat;
	}



	public void setTenTuyenDeNghiTangGiamTanSuat(
			String tenTuyenDeNghiTangGiamTanSuat) {
		this.tenTuyenDeNghiTangGiamTanSuat = tenTuyenDeNghiTangGiamTanSuat;
	}



	public String getTinhThanhPhoDi() {
		return tinhThanhPhoDi;
	}



	public void setTinhThanhPhoDi(String tinhThanhPhoDi) {
		this.tinhThanhPhoDi = tinhThanhPhoDi;
	}



	public String getTinhThanhPhoDen() {
		return tinhThanhPhoDen;
	}



	public void setTinhThanhPhoDen(String tinhThanhPhoDen) {
		this.tinhThanhPhoDen = tinhThanhPhoDen;
	}



	public String getBienSo() {
		return bienSo;
	}



	public void setBienSo(String bienSo) {
		this.bienSo = bienSo;
	}



	public String getNhanHieu() {
		return nhanHieu;
	}



	public void setNhanHieu(String nhanHieu) {
		this.nhanHieu = nhanHieu;
	}



	public String getNamSanXuat() {
		return namSanXuat;
	}



	public void setNamSanXuat(String namSanXuat) {
		this.namSanXuat = namSanXuat;
	}



	public String getTenDangKySoHuu() {
		return tenDangKySoHuu;
	}



	public void setTenDangKySoHuu(String tenDangKySoHuu) {
		this.tenDangKySoHuu = tenDangKySoHuu;
	}



	public String getTrongTai() {
		return trongTai;
	}



	public void setTrongTai(String trongTai) {
		this.trongTai = trongTai;
	}



	public String getHinhThucSoHuu() {
		return hinhThucSoHuu;
	}



	public void setHinhThucSoHuu(String hinhThucSoHuu) {
		this.hinhThucSoHuu = hinhThucSoHuu;
	}



	public String getDoanhNghiepChoThue() {
		return doanhNghiepChoThue;
	}



	public void setDoanhNghiepChoThue(String doanhNghiepChoThue) {
		this.doanhNghiepChoThue = doanhNghiepChoThue;
	}



	public String getThoiHanChoThue() {
		return thoiHanChoThue;
	}



	public void setThoiHanChoThue(String thoiHanChoThue) {
		this.thoiHanChoThue = thoiHanChoThue;
	}



	public String getHopDongSauCung() {
		return hopDongSauCung;
	}



	public void setHopDongSauCung(String hopDongSauCung) {
		this.hopDongSauCung = hopDongSauCung;
	}



	public String getKetQuaXuLy() {
		return ketQuaXuLy;
	}



	public void setKetQuaXuLy(String ketQuaXuLy) {
		this.ketQuaXuLy = ketQuaXuLy;
	}



	public String getTenTuyenNgungKhaiThac() {
		return tenTuyenNgungKhaiThac;
	}



	public void setTenTuyenNgungKhaiThac(String tenTuyenNgungKhaiThac) {
		this.tenTuyenNgungKhaiThac = tenTuyenNgungKhaiThac;
	}



	public String getNgungKhaiThacTuyenTuNgay() {
		return ngungKhaiThacTuyenTuNgay;
	}



	public void setNgungKhaiThacTuyenTuNgay(String ngungKhaiThacTuyenTuNgay) {
		this.ngungKhaiThacTuyenTuNgay = ngungKhaiThacTuyenTuNgay;
	}



	public String getIdXuLyKTTQuocTe() {
		return idXuLyKTTQuocTe;
	}



	public void setIdXuLyKTTQuocTe(String idXuLyKTTQuocTe) {
		this.idXuLyKTTQuocTe = idXuLyKTTQuocTe;
	}



	public String getIdPhuongTien() {
		return idPhuongTien;
	}



	public void setIdPhuongTien(String idPhuongTien) {
		this.idPhuongTien = idPhuongTien;
	}



	public int getThongTinHoSoId() {
		return thongTinHoSoId;
	}



	public void setThongTinHoSoId(int thongTinHoSoId) {
		this.thongTinHoSoId = thongTinHoSoId;
	}



	public String getMaTuyen() {
		return maTuyen;
	}



	public void setMaTuyen(String maTuyen) {
		this.maTuyen = maTuyen;
	}
}
