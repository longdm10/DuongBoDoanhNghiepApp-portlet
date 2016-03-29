
package vn.dtt.duongbo.term.lienvan;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.util.ParamUtil;

public class QlvtLienVanTerm {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public static final String TYPE_TRONG_TAI = "typeTrongTai";
	public static final String ID = "id";
	public static final String THONG_TIN_HO_SO_ID = "thongHoSoId";
	public static final String ID_PHUONG_TIEN = "idPhuongTien";
	public static final String THONG_TIN_XU_LY_ID = "thongTinXuLyId";
	public static final String LOAI_CAP_PHEP = "loaiCapPhep";
	public static final String SO_GPVT = "soGpvt";
	public static final String NGAY_CAP_GPVT = "ngayCapGpvt";
	public static final String SO_CONG_VAN_CHAP_THUAN_TCD = "soCongVanChapThuanTcd";
	public static final String NGAY_CONG_VAN_CHAP_THUAN_TCD = "ngayCongVanChapThuanTCD";
	public static final String TUYEN_TU = "tuyenTu";
	public static final String TUYEN_DI = "tuyenDi";
	public static final String CU_LY = "cuLy";
	public static final String MA_BEN_DI = "maBenDi";
	public static final String MA_BEN_DEN = "maBenDen";
	public static final String MA_TINH_DI = "maTinhDi";
	public static final String MA_TINH_DEN = "maTinhDen";
	public static final String HANH_TRINH = "hanhTrinh";
	public static final String MUC_PHI = "mucPhi";
	public static final String MUC_DICH_CHUYEN_DI = "mucDichChuyenDi";
	public static final String LOAI_GIAY_PHEP_LIEN_VAN = "loaiGiayPhepLienVan";
	public static final String SO_GIAY_PHEP_LIEN_VAN = "soGiayPhepLienVan";
	public static final String NGAY_CAP_GIAY_PHEP_LIEN_VAN = "ngayCapGiayPhepLienVan";
	public static final String NGAY_HET_HAN_GIAY_PHEP_LIEN_VAN = "ngayHetHanGiayPhepLienVan";
	public static final String CO_QUAN_CAP_PHEP_LIEN_VAN = "coQuanCapPhepLienVan";
	public static final String KET_QUA_XU_LY = "ketQuaXuLy";
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
    public static final String SO_FAX_DN="soFaxDN";
    public static final String CO_QUAN_CAP_GPKDVT_QUOC_TE="coQuanCapGPKDVTQuocTe";
	
	
	public static final String MA_LOAI_HINH_VAN_TAI = "maLoaiHinhVanTai";
	public static final String CAP_GPLV_PHUONG_TIEN_ID = "capGplxPhuongTienId";
	public static final String MA_TRAM_DUNG_NGHI = "maTramDungNghi";
	public static final String NHAN_HIEU = "nhanHieu";
	public static final String BIEN_SO = "bienSo";
	public static final String SO_KHUNG = "soKhung";
	public static final String SO_MAY = "soMay";
	public static final String NAM_SX = "namSx";
	public static final String MAU_SON = "mauSon";
	public static final String TRONG_TAI = "trongTai";
	public static final String CAP_GPLV_ID = "capGplvId";
	public static final String CUA_KHAU = "cuaKhau";
	public static final String MA_CUA_KHAU = "maCuaKhau";
	public static final String XIN_CAP_PHEP_TU_NGAY = "xinCapPhepTuNgay";
	public static final String XIN_CAP_PHEP_DEN_NGAY = "xinCapPhepDenNgay";
	public static final String HINH_THUC_HOAT_DONG = "hinhThucHoatDong";
	public static final String SO_PHU_HIEU = "soPhuHieu";
	public static final String THOI_HAN_PHU_HIEU = "thoiHanPhuHieu";
	public static final String SO_NGAY_XIN_GIA_HAN = "soNgayXinhGiaHan";
	public static final String XIN_GIA_HAN_TU_NGAY = "xinGiaHanTuNgay";
	public static final String XIN_GIA_HAN_DEN_NGAY = "xinGiaHanDenNgay";
	public static final String HINH_THUC_SO_HUU = "hinhThucSoHuu";
	public static final String DOANH_NGHIEP_CHO_THUE = "doanhNghiepChoThue";
	public static final String THOI_HAN_CHO_THUE = "thoiHanThue";
	public static final String HOP_DONG_SAU_CUNG = "hopDongSauCung";
	public static final String THOI_GIAN_NHAP_CANH = "thoiGianNhapCanh";
	public static final String THOI_GIAN_KHOI_HANH = "thoiGianKhoiHanh";
	public static final String LOAI_HINH_GIA_HAN = "loaiHinhGiaHan";
	public static final String LOAI_GIAY_PHEP = "loaiGiayPhep";
	
	public static final String DIEM_DUNG_NGHI = "diemDungNghi";
	public static final String TUYEN_HOAT_DONG = "tuyenHoatDong";
	public static final String SO_CHO_NGOI = "soChoNgoi";
	public static final String NGAY_HET_HAN_GPVT = "ngayHetHanGpvt";
	public static final String LOAI_TUYEN = "loaiTuyen";
	public static final String LAN_CAP = "lanCap";
	public static final String HO_TEN_NGUOI_TRA_KET_QUA = "hoTenNTKQ";
	public static final String DIEN_THOAI_NGUOI_TRA_KET_QUA = "dienThoaiNTKQ";
	public static final String DIA_CHI_NGUOI_TRA_KET_QUA = "diaChiNTKQ";
	
	public static final String SO_GPKD = "soGpkd";
	public static final String NGAY_CAP_GPKD = "ngayCapGpkd";
	public static final String NIEN_HAN_GPKD = "nienHanGpkd";
	public static final String CO_QUAN_CAP_GPKD = "coQuanCapGpkd";
	public static final String CO_QUAN_CAP_GPKD_BANG_OTO = "coQuanCapGpkdBangOTo";
	public static final String TEN_DN = "tenDn";
	public static final String DIA_CHI_DN = "diaChiDn";
	public static final String DIEN_THOAI_DN = "dienThoaiDn";
	public static final String LY_DO_GIA_HAN = "lyDoGiaHan";
	public static final String THOI_GIAN_HET_HAN_HOAT_DONG = "thoiGianHetHanHoatDong";
	
	//update 20/1
		public static final String NGUOI_NHAN_KET_QUA = "nguoiNhanKetQua";
		public static final String THONG_TIN_TRA_KET_QUA = "thongTinTraKetQua";
		public static final String NGAY_TRA_KET_QUA = "ngayTraKetQua";
		public static final String NGAY_CAP_LAN_DAU_GP_LV = "ngayCapLanDauGPLV";
	
	//update 29/1	
		public static final String LOAI_HANG_VAN_CHUYEN = "loaiHangVanChuyen";
		
	public QlvtLienVanTerm(ActionRequest actionRequest) {
		id = ParamUtil.getInteger(actionRequest, ID);
		thongHoSoId= ParamUtil.getInteger(actionRequest, THONG_TIN_HO_SO_ID);
		idPhuongTien = ParamUtil.getInteger(actionRequest, ID_PHUONG_TIEN);
		thongTinXuLyId = ParamUtil.getInteger(actionRequest, THONG_TIN_XU_LY_ID);
		loaiCapPhep = ParamUtil.getString(actionRequest, LOAI_CAP_PHEP);
		soFaxDN = ParamUtil.getString(actionRequest, SO_FAX_DN);
		coQuanCapGPKDVTQuocTe = ParamUtil.getString(actionRequest, CO_QUAN_CAP_GPKDVT_QUOC_TE);
		
		
		soCongVanChapThuanTcd = ParamUtil.getString(actionRequest, SO_CONG_VAN_CHAP_THUAN_TCD);
		ngayCongVanChapThuanTCD = ParamUtil.getDate(actionRequest, NGAY_CONG_VAN_CHAP_THUAN_TCD, sdf, null);
		tuyenTu = ParamUtil.getString(actionRequest, TUYEN_TU);
		tuyenDi = ParamUtil.getString(actionRequest, TUYEN_DI);
		cuLy = ParamUtil.getString(actionRequest, CU_LY);
		maBenDi = ParamUtil.getString(actionRequest, MA_BEN_DI);
		maBenDen = ParamUtil.getString(actionRequest, MA_BEN_DEN);
		maTinhDi = ParamUtil.getString(actionRequest, MA_TINH_DI);
		maTinhDen = ParamUtil.getString(actionRequest, MA_TINH_DEN);
		
		mucPhi = ParamUtil.getString(actionRequest, MUC_PHI);
		mucDichChuyenDi = ParamUtil.getString(actionRequest, MUC_DICH_CHUYEN_DI);
		loaiGiayPhepLienVan = ParamUtil.getString(actionRequest, LOAI_GIAY_PHEP_LIEN_VAN);
		soGiayPhepLienVan = ParamUtil.getString(actionRequest, SO_GIAY_PHEP_LIEN_VAN);
		ngayCapGiayPhepLienVan = ParamUtil.getDate(actionRequest, NGAY_CAP_GIAY_PHEP_LIEN_VAN, sdf, null);
		ngayHetHanGiayPhepLienVan = ParamUtil.getDate(actionRequest, NGAY_HET_HAN_GIAY_PHEP_LIEN_VAN, sdf, null);
		coQuanCapPhepLienVan = ParamUtil.getString(actionRequest, CO_QUAN_CAP_PHEP_LIEN_VAN);
		ketQuaXuLy = ParamUtil.getString(actionRequest, KET_QUA_XU_LY);
	
		
		xinCapPhepTuNgay = ParamUtil.getDate(actionRequest, XIN_CAP_PHEP_TU_NGAY, sdf, null);
		xinCapPhepDenNgay = ParamUtil.getDate(actionRequest, XIN_CAP_PHEP_DEN_NGAY, sdf, null);
		thoiHanPhuHieu = ParamUtil.getDate(actionRequest, THOI_HAN_PHU_HIEU, sdf, null);
		xinGiaHanTuNgay = ParamUtil.getDate(actionRequest, XIN_GIA_HAN_TU_NGAY, sdf, null);
		xinGiaHanDenNgay = ParamUtil.getDate(actionRequest, XIN_GIA_HAN_DEN_NGAY, sdf, null);
		thoiGianNhapCanh = ParamUtil.getDate(actionRequest, THOI_GIAN_NHAP_CANH, sdf, null);
		thoiGianKhoiHanh = ParamUtil.getDate(actionRequest, THOI_GIAN_KHOI_HANH, sdf, null);
		thoiHanChoThue = ParamUtil.getDate(actionRequest, THOI_HAN_CHO_THUE, sdf, null);
		
		
		capGplvId = ParamUtil.getInteger(actionRequest, CAP_GPLV_ID);
		nhanHieu = ParamUtil.getString(actionRequest, NHAN_HIEU);
		bienSo = ParamUtil.getString(actionRequest, BIEN_SO);
		soKhung = ParamUtil.getString(actionRequest, SO_KHUNG);
		soMay = ParamUtil.getString(actionRequest, SO_MAY);
		namSx = ParamUtil.getInteger(actionRequest, NAM_SX);
		mauSon = ParamUtil.getString(actionRequest, MAU_SON);
		
		
		cuaKhau = ParamUtil.getString(actionRequest, CUA_KHAU);
		maCuaKhau = ParamUtil.getString(actionRequest, MA_CUA_KHAU);
		hinhThucHoatDong = ParamUtil.getString(actionRequest, HINH_THUC_HOAT_DONG);
		soPhuHieu = ParamUtil.getString(actionRequest, SO_PHU_HIEU);
		soNgayXinhGiaHan = ParamUtil.getInteger(actionRequest, SO_NGAY_XIN_GIA_HAN);
		hinhThucSoHuu = ParamUtil.getString(actionRequest, HINH_THUC_SO_HUU);
		hopDongSauCung = ParamUtil.getLong(actionRequest, HOP_DONG_SAU_CUNG);
		doanhNghiepChoThue = ParamUtil.getString(actionRequest, DOANH_NGHIEP_CHO_THUE);
		loaiHinhGiaHan = ParamUtil.getString(actionRequest, LOAI_HINH_GIA_HAN);
		
		
		tuyenHoatDong = ParamUtil.getString(actionRequest, TUYEN_HOAT_DONG);
		diemDungNghi = ParamUtil.getString(actionRequest, DIEM_DUNG_NGHI);
		
		loaiTuyen = ParamUtil.getString(actionRequest, LOAI_TUYEN);
		lanCap = ParamUtil.getString(actionRequest, LAN_CAP);
		hoTenNTKQ = ParamUtil.getString(actionRequest, HO_TEN_NGUOI_TRA_KET_QUA);
		dienThoaiNTKQ = ParamUtil.getString(actionRequest, DIEN_THOAI_NGUOI_TRA_KET_QUA);
		
		soGpkd = ParamUtil.getString(actionRequest, SO_GPKD);
		ngayCapGpkd = ParamUtil.getDate(actionRequest, NGAY_CAP_GPKD, sdf, null);
		nienHanGpkd = ParamUtil.getString(actionRequest, NIEN_HAN_GPKD);
		coQuanCapGpkd = ParamUtil.getString(actionRequest, CO_QUAN_CAP_GPKD);
		tenDn = ParamUtil.getString(actionRequest, TEN_DN);
		diaChiDn = ParamUtil.getString(actionRequest, DIA_CHI_DN);
		dienThoaiDn = ParamUtil.getString(actionRequest, DIEN_THOAI_DN);
		lyDoGiaHan = ParamUtil.getString(actionRequest, LY_DO_GIA_HAN);
		
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
		thoiGianHetHanHoatDong = ParamUtil.getDate(actionRequest, THOI_GIAN_HET_HAN_HOAT_DONG, sdf, null) ; 
		maTuyen	= ParamUtil.getString(actionRequest, MA_TUYEN) ;
		tenTuyen	= ParamUtil.getString(actionRequest, TEN_TUYEN) ;
		
		thoiHanThue =ParamUtil.getDate(actionRequest, THOI_HAN_CHO_THUE, sdf, null) ; ;
		
		coQuanCapGpkdBangOTo =  ParamUtil.getString(actionRequest, CO_QUAN_CAP_GPKD_BANG_OTO) ;
		diaChiNTKQ =ParamUtil.getString(actionRequest, DIA_CHI_NGUOI_TRA_KET_QUA) ;
		
		 ngayTraKetQua = ParamUtil.getDate(actionRequest, NGAY_TRA_KET_QUA, sdf, null); 
	        nguoiNhanKetQua = ParamUtil.getString(actionRequest, NGUOI_NHAN_KET_QUA);
	        thongTinTraKetQua = ParamUtil.getString(actionRequest, THONG_TIN_TRA_KET_QUA);
		
	        ngayCapLanDauGPLV = ParamUtil.getDate(actionRequest, NGAY_CAP_LAN_DAU_GP_LV, sdf, null); 
	        
	        
		typeTrongTai = ParamUtil.getInteger(actionRequest, TYPE_TRONG_TAI);
		loaiHangVanChuyen = ParamUtil.getString(actionRequest, LOAI_HANG_VAN_CHUYEN);
		if(typeTrongTai == 0){
			soChoNgoi = ParamUtil.getString(actionRequest, TRONG_TAI);
		}else{
			trongTai = ParamUtil.getInteger(actionRequest, TRONG_TAI);
		}
		
		if(ketQuaXuLy.equalsIgnoreCase("0")){
			lyDoKhongDat = ParamUtil.getString(actionRequest, LY_DO_KHONG_DAT);
		}else {
			loaiGiayPhep = ParamUtil.getString(actionRequest, LOAI_GIAY_PHEP);
			soGpvt = ParamUtil.getString(actionRequest, SO_GPVT);
			ngayCapGpvt = ParamUtil.getDate(actionRequest, NGAY_CAP_GPVT, sdf, null);
			ngayHetHanGpvt = ParamUtil.getDate(actionRequest, NGAY_HET_HAN_GPVT, sdf, null);
			hanhTrinh = ParamUtil.getString(actionRequest, HANH_TRINH);
		}
						
	}
	private int thongHoSoId;
	private int idPhuongTien;
	private int typeTrongTai;
	private Date xinCapPhepTuNgay;
	private Date xinCapPhepDenNgay;
	private Date thoiHanPhuHieu;
	private Date xinGiaHanTuNgay;
	private Date xinGiaHanDenNgay;
	private Date thoiGianNhapCanh;
	private Date thoiGianKhoiHanh;
	private Date thoiHanChoThue;
	private Date thoiGianHetHanHoatDong;
	
	private String tuyenHoatDong;
	private String coQuanCapGPKDVTQuocTe;
	private String soFaxDN;
	private String diemDungNghi;
	private String soChoNgoi;
	private Date ngayHetHanGpvt;
	private String lanCap;
	private String loaiTuyen;
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
    private String[] maTuyens;
	private String maTuyen;
	private String tenTuyen;
	private int trongTai;
	private int soNgayXinhGiaHan;
	private int capGplvId;
	private int namSx;
	
	private long hopDongSauCung;
	
	private String nhanHieu;
	private String bienSo;
	private String soKhung;
	private String soMay;
	private String mauSon;
	private String hinhThucSoHuu;
	private String doanhNghiepChoThue;
	private String loaiHinhGiaHan;
	private String loaiGiayPhep;
	private String soPhuHieu;
	private String hinhThucHoatDong;
	private String cuaKhau;
	private String maCuaKhau;
	
	private int id;
	private int thongTinXuLyId;
	private String loaiCapPhep;
	private String soGpvt;
	private Date ngayCapGpvt;
	private String soCongVanChapThuanTcd;
	private Date ngayCongVanChapThuanTCD;
	private String tuyenTu;
	private String tuyenDi;
	private String cuLy;
	private String maBenDi;
	private String maBenDen;
	private String maTinhDi;
	private String maTinhDen;
	private String hanhTrinh;
	private String mucPhi;
	private String mucDichChuyenDi;
	private String loaiGiayPhepLienVan;
	private String soGiayPhepLienVan;
	private Date ngayCapGiayPhepLienVan;
	private Date ngayHetHanGiayPhepLienVan;
	private String coQuanCapPhepLienVan;
	private String ketQuaXuLy;
	private String lyDoKhongDat;
	
	private String nguoiNhanKetQua;
    private String thongTinTraKetQua;
    private Date ngayTraKetQua;
	
    
    private String  coQuanCapGpkdBangOTo; 
    private Date  thoiHanThue; 
    private Date ngayCapLanDauGPLV;
    
    
    private String  diaChiNTKQ; 
    private String  loaiHangVanChuyen; 
	
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

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getThongTinXuLyId() {
		return thongTinXuLyId;
	}
	
	public void setThongTinXuLyId(int thongTinXuLyId) {
		this.thongTinXuLyId = thongTinXuLyId;
	}
	
	public Date getXinCapPhepTuNgay() {
		return xinCapPhepTuNgay;
	}
	
	public void setXinCapPhepTuNgay(Date xinCapPhepTuNgay) {
		this.xinCapPhepTuNgay = xinCapPhepTuNgay;
	}
	
	public Date getXinCapPhepDenNgay() {
		return xinCapPhepDenNgay;
	}
	
	public void setXinCapPhepDenNgay(Date xinCapPhepDenNgay) {
		this.xinCapPhepDenNgay = xinCapPhepDenNgay;
	}
	
	public Date getThoiHanPhuHieu() {
		return thoiHanPhuHieu;
	}
	
	public void setThoiHanPhuHieu(Date thoiHanPhuHieu) {
		this.thoiHanPhuHieu = thoiHanPhuHieu;
	}
	
	public Date getXinGiaHanTuNgay() {
		return xinGiaHanTuNgay;
	}
	
	public void setXinGiaHanTuNgay(Date xinGiaHanTuNgay) {
		this.xinGiaHanTuNgay = xinGiaHanTuNgay;
	}
	
	public Date getXinGiaHanDenNgay() {
		return xinGiaHanDenNgay;
	}
	
	public void setXinGiaHanDenNgay(Date xinGiaHanDenNgay) {
		this.xinGiaHanDenNgay = xinGiaHanDenNgay;
	}
	
	public Date getThoiGianNhapCanh() {
		return thoiGianNhapCanh;
	}
	
	public void setThoiGianNhapCanh(Date thoiGianNhapCanh) {
		this.thoiGianNhapCanh = thoiGianNhapCanh;
	}
	
	public Date getThoiGianKhoiHanh() {
		return thoiGianKhoiHanh;
	}
	
	public void setThoiGianKhoiHanh(Date thoiGianKhoiHanh) {
		this.thoiGianKhoiHanh = thoiGianKhoiHanh;
	}
	
	public Date getThoiHanChoThue() {
		return thoiHanChoThue;
	}
	
	public void setThoiHanChoThue(Date thoiHanChoThue) {
		this.thoiHanChoThue = thoiHanChoThue;
	}
	
	public int getTrongTai() {
		return trongTai;
	}
	
	public void setTrongTai(int trongTai) {
		this.trongTai = trongTai;
	}
	
	public int getSoNgayXinhGiaHan() {
		return soNgayXinhGiaHan;
	}
	
	public void setSoNgayXinhGiaHan(int soNgayXinhGiaHan) {
		this.soNgayXinhGiaHan = soNgayXinhGiaHan;
	}
	
	public int getCapGplvId() {
		return capGplvId;
	}
	
	public void setCapGplvId(int capGplvId) {
		this.capGplvId = capGplvId;
	}
	
	public int getNamSx() {
		return namSx;
	}
	
	public void setNamSx(int namSx) {
		this.namSx = namSx;
	}
	
	public long getHopDongSauCung() {
		return hopDongSauCung;
	}
	
	public void setHopDongSauCung(long hopDongSauCung) {
		this.hopDongSauCung = hopDongSauCung;
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
	
	public String getSoKhung() {
		return soKhung;
	}
	
	public void setSoKhung(String soKhung) {
		this.soKhung = soKhung;
	}
	
	public String getSoMay() {
		return soMay;
	}
	
	public void setSoMay(String soMay) {
		this.soMay = soMay;
	}
	
	public String getMauSon() {
		return mauSon;
	}
	
	public void setMauSon(String mauSon) {
		this.mauSon = mauSon;
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
	
	public String getLoaiHinhGiaHan() {
		return loaiHinhGiaHan;
	}
	
	public void setLoaiHinhGiaHan(String loaiHinhGiaHan) {
		this.loaiHinhGiaHan = loaiHinhGiaHan;
	}
	
	public String getLoaiGiayPhep() {
		return loaiGiayPhep;
	}
	
	public void setLoaiGiayPhep(String loaiGiayPhep) {
		this.loaiGiayPhep = loaiGiayPhep;
	}
	
	public String getSoPhuHieu() {
		return soPhuHieu;
	}
	
	public void setSoPhuHieu(String soPhuHieu) {
		this.soPhuHieu = soPhuHieu;
	}
	
	public String getHinhThucHoatDong() {
		return hinhThucHoatDong;
	}
	
	public void setHinhThucHoatDong(String hinhThucHoatDong) {
		this.hinhThucHoatDong = hinhThucHoatDong;
	}
	
	public String getCuaKhau() {
		return cuaKhau;
	}
	
	public void setCuaKhau(String cuaKhau) {
		this.cuaKhau = cuaKhau;
	}
	
	public String getMaCuaKhau() {
		return maCuaKhau;
	}
	
	public void setMaCuaKhau(String maCuaKhau) {
		this.maCuaKhau = maCuaKhau;
	}
	
	public String getLoaiCapPhep() {
		return loaiCapPhep;
	}
	
	public void setLoaiCapPhep(String loaiCapPhep) {
		this.loaiCapPhep = loaiCapPhep;
	}
	
	public String getSoGpvt() {
		return soGpvt;
	}
	
	public void setSoGpvt(String soGpvt) {
		this.soGpvt = soGpvt;
	}
	
	public Date getNgayCapGpvt() {
		return ngayCapGpvt;
	}
	
	public void setNgayCapGpvt(Date ngayCapGpvt) {
		this.ngayCapGpvt = ngayCapGpvt;
	}
	
	public String getSoCongVanChapThuanTcd() {
		return soCongVanChapThuanTcd;
	}
	
	public void setSoCongVanChapThuanTcd(String soCongVanChapThuanTcd) {
		this.soCongVanChapThuanTcd = soCongVanChapThuanTcd;
	}
	
	public Date getNgayCongVanChapThuanTCD() {
		return ngayCongVanChapThuanTCD;
	}
	
	public void setNgayCongVanChapThuanTCD(Date ngayCongVanChapThuanTCD) {
		this.ngayCongVanChapThuanTCD = ngayCongVanChapThuanTCD;
	}
	
	public String getTuyenTu() {
		return tuyenTu;
	}
	
	public void setTuyenTu(String tuyenTu) {
		this.tuyenTu = tuyenTu;
	}
	
	public String getTuyenDi() {
		return tuyenDi;
	}
	
	public void setTuyenDi(String tuyenDi) {
		this.tuyenDi = tuyenDi;
	}
	
	public String getCuLy() {
		return cuLy;
	}
	
	public void setCuLy(String cuLy) {
		this.cuLy = cuLy;
	}
	
	public String getMaBenDi() {
		return maBenDi;
	}
	
	public void setMaBenDi(String maBenDi) {
		this.maBenDi = maBenDi;
	}
	
	public String getMaBenDen() {
		return maBenDen;
	}
	
	public void setMaBenDen(String maBenDen) {
		this.maBenDen = maBenDen;
	}
	
	public String getMaTinhDi() {
		return maTinhDi;
	}
	
	public void setMaTinhDi(String maTinhDi) {
		this.maTinhDi = maTinhDi;
	}
	
	public String getMaTinhDen() {
		return maTinhDen;
	}
	
	public void setMaTinhDen(String maTinhDen) {
		this.maTinhDen = maTinhDen;
	}
	
	public String getHanhTrinh() {
		return hanhTrinh;
	}
	
	public void setHanhTrinh(String hanhTrinh) {
		this.hanhTrinh = hanhTrinh;
	}
	
	public String getMucPhi() {
		return mucPhi;
	}
	
	public void setMucPhi(String mucPhi) {
		this.mucPhi = mucPhi;
	}
	
	public String getMucDichChuyenDi() {
		return mucDichChuyenDi;
	}
	
	public void setMucDichChuyenDi(String mucDichChuyenDi) {
		this.mucDichChuyenDi = mucDichChuyenDi;
	}
	
	public String getLoaiGiayPhepLienVan() {
		return loaiGiayPhepLienVan;
	}
	
	public void setLoaiGiayPhepLienVan(String loaiGiayPhepLienVan) {
		this.loaiGiayPhepLienVan = loaiGiayPhepLienVan;
	}
	
	public String getSoGiayPhepLienVan() {
		return soGiayPhepLienVan;
	}
	
	public void setSoGiayPhepLienVan(String soGiayPhepLienVan) {
		this.soGiayPhepLienVan = soGiayPhepLienVan;
	}
	
	public Date getNgayCapGiayPhepLienVan() {
		return ngayCapGiayPhepLienVan;
	}
	
	public void setNgayCapGiayPhepLienVan(Date ngayCapGiayPhepLienVan) {
		this.ngayCapGiayPhepLienVan = ngayCapGiayPhepLienVan;
	}
	
	public Date getNgayHetHanGiayPhepLienVan() {
		return ngayHetHanGiayPhepLienVan;
	}
	
	public void setNgayHetHanGiayPhepLienVan(Date ngayHetHanGiayPhepLienVan) {
		this.ngayHetHanGiayPhepLienVan = ngayHetHanGiayPhepLienVan;
	}
	
	public String getCoQuanCapPhepLienVan() {
		return coQuanCapPhepLienVan;
	}
	
	public void setCoQuanCapPhepLienVan(String coQuanCapPhepLienVan) {
		this.coQuanCapPhepLienVan = coQuanCapPhepLienVan;
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

	
	public int getTypeTrongTai() {
		return typeTrongTai;
	}

	
	public void setTypeTrongTai(int typeTrongTai) {
		this.typeTrongTai = typeTrongTai;
	}

	
	public String getTuyenHoatDong() {
		return tuyenHoatDong;
	}

	
	public void setTuyenHoatDong(String tuyenHoatDong) {
		this.tuyenHoatDong = tuyenHoatDong;
	}

	
	public String getDiemDungNghi() {
		return diemDungNghi;
	}

	
	public void setDiemDungNghi(String diemDungNghi) {
		this.diemDungNghi = diemDungNghi;
	}

	
	public String getSoChoNgoi() {
		return soChoNgoi;
	}

	
	public void setSoChoNgoi(String soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}

	
	public Date getNgayHetHanGpvt() {
		return ngayHetHanGpvt;
	}

	
	public void setNgayHetHanGpvt(Date ngayHetHanGpvt) {
		this.ngayHetHanGpvt = ngayHetHanGpvt;
	}

	
	public String getLoaiTuyen() {
		return loaiTuyen;
	}

	
	public void setLoaiTuyen(String loaiTuyen) {
		this.loaiTuyen = loaiTuyen;
	}

	
	public String getLanCap() {
		return lanCap;
	}

	
	public void setLanCap(String lanCap) {
		this.lanCap = lanCap;
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

	
	public int getLanCapGiayDangKyKinhDoanh() {
		return lanCapGiayDangKyKinhDoanh;
	}

	
	public void setLanCapGiayDangKyKinhDoanh(int lanCapGiayDangKyKinhDoanh) {
		this.lanCapGiayDangKyKinhDoanh = lanCapGiayDangKyKinhDoanh;
	}

	
	public String getSoGiayPhepKinhDoanhVanTaiNoiDia() {
		return soGiayPhepKinhDoanhVanTaiNoiDia;
	}

	
	public void setSoGiayPhepKinhDoanhVanTaiNoiDia(String soGiayPhepKinhDoanhVanTaiNoiDia) {
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

	
	public void setSoGiayPhepKinhDoanhVanTaiQuocTe(String soGiayPhepKinhDoanhVanTaiQuocTe) {
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

	
	public String[] getMaTuyens() {
		return maTuyens;
	}

	
	public void setMaTuyens(String[] maTuyens) {
		this.maTuyens = maTuyens;
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

	
	public Date getThoiGianHetHanHoatDong() {
		return thoiGianHetHanHoatDong;
	}

	
	public void setThoiGianHetHanHoatDong(Date thoiGianHetHanHoatDong) {
		this.thoiGianHetHanHoatDong = thoiGianHetHanHoatDong;
	}

	public int getIdPhuongTien() {
		return idPhuongTien;
	}

	public void setIdPhuongTien(int idPhuongTien) {
		this.idPhuongTien = idPhuongTien;
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

	
	public String getSoFaxDN() {
		return soFaxDN;
	}

	
	public void setSoFaxDN(String soFaxDN) {
		this.soFaxDN = soFaxDN;
	}

	
	public String getCoQuanCapGPKDVTQuocTe() {
		return coQuanCapGPKDVTQuocTe;
	}

	
	public void setCoQuanCapGPKDVTQuocTe(String coQuanCapGPKDVTQuocTe) {
		this.coQuanCapGPKDVTQuocTe = coQuanCapGPKDVTQuocTe;
	}

	public int getThongHoSoId() {
		return thongHoSoId;
	}

	public void setThongHoSoId(int thongHoSoId) {
		this.thongHoSoId = thongHoSoId;
	}

	public String getCoQuanCapGpkdBangOTo() {
		return coQuanCapGpkdBangOTo;
	}

	public void setCoQuanCapGpkdBangOTo(String coQuanCapGpkdBangOTo) {
		this.coQuanCapGpkdBangOTo = coQuanCapGpkdBangOTo;
	}

	public Date getThoiHanThue() {
		return thoiHanThue;
	}

	public void setThoiHanThue(Date thoiHanThue) {
		this.thoiHanThue = thoiHanThue;
	}

	public Date getNgayCapLanDauGPLV() {
		return ngayCapLanDauGPLV;
	}

	public void setNgayCapLanDauGPLV(Date ngayCapLanDauGPLV) {
		this.ngayCapLanDauGPLV = ngayCapLanDauGPLV;
	}

	public String getDiaChiNTKQ() {
		return diaChiNTKQ;
	}

	public void setDiaChiNTKQ(String diaChiNTKQ) {
		this.diaChiNTKQ = diaChiNTKQ;
	}

	public String getLoaiHangVanChuyen() {
		return loaiHangVanChuyen;
	}

	public void setLoaiHangVanChuyen(String loaiHangVanChuyen) {
		this.loaiHangVanChuyen = loaiHangVanChuyen;
	}

	
}
