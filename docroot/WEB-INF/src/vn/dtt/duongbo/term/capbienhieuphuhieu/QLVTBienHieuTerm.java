package vn.dtt.duongbo.term.capbienhieuphuhieu;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.util.ParamUtil;

public class QLVTBienHieuTerm {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public static final String ID = "id";
	public static final String THONG_TIN_HO_SO_ID = "thongHoSoId";
	public static final String THONG_TIN_XU_LY_ID = "thongTinXuLyId";
	public static final String LINH_VUC_KINH_DOANH = "LinhVucKinhDoanh";
	public static final String LY_DO_CAP_LAI = "lyDoCapLai";
	public static final String GPKD_LUU_HANH_QUOC_TE = "gpkdLuuHanhQuocTe";
	public static final String GPKD_LUU_HANH_QUOC_TE_CQCAP = "gpkdLuuHanhQuocTeCQCAP";
	public static final String GPKD_LUU_HANH_QUOC_TE_NGAY_CAP = "gpkdLuuHanhQuocTeNgayCap";
	public static final String GPKD_LUU_HANH_QUOC_TE_NGAY_HET_HAN = "gpkdLuuHanhQuocTeNgayHetHan";
	public static final String SO_LUONG_XE = "soLuongXe";
	public static final String SO_LUONG_BHPH_NOP_LAI = "soLuongBHPHNopLai";
	public static final String LAP_CAP = "lapCap";
	
    public static final String CAP_BIEN_HIEU_ID = "capBienHieuID";
    public static final String NHAN_HIEU = "nhanHieu";
    public static final String BIEN_SO = "bienSo";
    public static final String SO_KHUNG = "soKhung";
    public static final String SO_MAY = "soMay";
    public static final String NAM_SX = "namSx";
    public static final String MAU_SON = "mauSon";
    public static final String TRONG_TAI = "trongTai";
    public static final String SO_CHO_NGOI = "soChoNgoi";
    public static final String HINH_THUC_SO_HUU_XE = "hinhThucSoHuuXe";
    public static final String LINH_VUC_KINH_DOANH_XE_DU_LINH = "linhVucKinhDoanhXeDuLich";
    public static final String NIEN_HAN_SU_DUNG_GIAY_DANG_KIEM = "nienHanSuDungGiayDangKiem";
    public static final String NIEN_HAN_SU_DUNG_ND86= "nienHanSuDungND86";
    public static final String DOANH_NGHIEP_SO_HUU_THUE = "doanhNghiepSoHuuThue";
    public static final String THOI_HAN_THUE = "thoiHanThue";
    public static final String HOP_DONG_SAU_CUNG= "hopDongSauCung";
    public static final String KET_QUA_XU_LY= "ketQuaXuLy";
    public static final String SO_PHU_HIEU_DUOC_CAP= "soPhuHieuDuocCap";
    public static final String THOI_HAN_DUOC_CAP_PHEP= "thoiHanDuocCapPhep";
    public static final String LY_DO_KHONG_DAT= "lyDoKhongDat";
    public static final String TEN_DOANH_NGHIEP= "tenDoanhNghiep";
    
    public static final String GIAY_PHEP_KD_VT= "giayPhepKinhDoanhVanTai";
    public static final String NGAY_CAP_GIAY_PHEP_KD_VT= "ngayCapGiayPhepKinhDoanhVanTai";
    public static final String NOI_CAP_GIAY_PHEP_KD_VT= "noiCapGiayPhepKinhDoanhVanTai";
    
    public static final String NGAY_GIA_HAN_GIAY_PHEP_KD_VT= "ngayGiaHanGiayPhepKinhDoanhVanTai";
    
    public static final String SO_GPDK_LU_HANH_QUOC_TE= "soGPKDLuHanhQuocTe";
    
    public static final String NOI_CAP_GPDK_LU_HANH_QUOC_TE= "noiCapGPKDLuHanhQuocTe";
    
    
    public static final String NGAY_CAP_GPDK_LU_HANH_QUOC_TE= "ngayCapGPKDLuHanhQuocTe";
    public static final String NGAY_GIA_HAN_GPDK_LU_HANH_QUOC_TE= "ngayGiaHanGPKDLuHanhQuocTe";
    public static final String SO_LUONG_XE_XIN_CAP= "soLuongXeXinCap";
    
    public static final String SO_A= "soA";
    public static final String SO_B= "soB";
    public static final String DON_VI= "donVi";
    public static final String BIEN_SO_DAT= "bienSoDat";
    public static final String CO_GIA_TRI_DEN= "coGiaTriDen";
    
    public static final String ID_PHUONG_TIEN = "idPhuongTien";
    
    
    public static final String HINH_THUC_SO_HUU = "hinhThucSoHuu";
    
  //update 20/1
  	public static final String NGUOI_NHAN_KET_QUA = "nguoiNhanKetQua";
  	public static final String THONG_TIN_TRA_KET_QUA = "thongTinTraKetQua";
  	public static final String NGAY_TRA_KET_QUA = "ngayTraKetQua";
    public static final String NGUOI_LIEN_HE_TRA_KET_QUA="nguoiLienHeTraKetQua";
    public static final String SO_DIEN_THOAI_NGUOI_LIEN_HE="soDienThoaiNguoiLienHe";
    
    
	public QLVTBienHieuTerm() {
		// TODO Auto-generated constructor stub
	}
	public QLVTBienHieuTerm(ActionRequest actionRequest ) {
		// TODO Auto-generated constructor stub
		id = ParamUtil.getInteger(actionRequest, ID);
		thongHoSoId = ParamUtil.getInteger(actionRequest, THONG_TIN_HO_SO_ID);
		thongTinXuLyId = ParamUtil.getInteger(actionRequest, THONG_TIN_XU_LY_ID);
		LinhVucKinhDoanh = ParamUtil.getString(actionRequest, LINH_VUC_KINH_DOANH);
		lyDoCapLai = ParamUtil.getString(actionRequest, LY_DO_CAP_LAI);
		gpkdLuuHanhQuocTe = ParamUtil.getString(actionRequest, GPKD_LUU_HANH_QUOC_TE);
		gpkdLuuHanhQuocTeCQCAP = ParamUtil.getString(actionRequest, GPKD_LUU_HANH_QUOC_TE_CQCAP);
		gpkdLuuHanhQuocTeNgayCap = ParamUtil.getDate(actionRequest, GPKD_LUU_HANH_QUOC_TE_NGAY_CAP, sdf, null);
		gpkdLuuHanhQuocTeNgayHetHan = ParamUtil.getDate(actionRequest, GPKD_LUU_HANH_QUOC_TE_NGAY_HET_HAN, sdf, null);
		soLuongXe = ParamUtil.getString(actionRequest, SO_LUONG_XE);
		soLuongBHPHNopLai = ParamUtil.getInteger(actionRequest, SO_LUONG_BHPH_NOP_LAI);
		lapCap = ParamUtil.getInteger(actionRequest, LAP_CAP);
	    capBienHieuID = ParamUtil.getInteger(actionRequest, CAP_BIEN_HIEU_ID);
	    nhanHieu = ParamUtil.getString(actionRequest, NHAN_HIEU);
	    bienSo = ParamUtil.getString(actionRequest, BIEN_SO);
	    soKhung = ParamUtil.getString(actionRequest, SO_KHUNG);
	    soMay = ParamUtil.getString(actionRequest, SO_MAY);
	    namSx = ParamUtil.getInteger(actionRequest, NAM_SX);
	    mauSon = ParamUtil.getString(actionRequest, MAU_SON);
	    trongTai = ParamUtil.getString(actionRequest, TRONG_TAI);
	    soChoNgoi = ParamUtil.getInteger(actionRequest, SO_CHO_NGOI);
	    hinhThucSoHuuXe = ParamUtil.getString(actionRequest, HINH_THUC_SO_HUU_XE);
	    linhVucKinhDoanhXeDuLich = ParamUtil.getString(actionRequest, LINH_VUC_KINH_DOANH_XE_DU_LINH);
	    nienHanSuDungGiayDangKiem = ParamUtil.getInteger(actionRequest, NIEN_HAN_SU_DUNG_GIAY_DANG_KIEM);
	    nienHanSuDungND86 = ParamUtil.getInteger(actionRequest, NIEN_HAN_SU_DUNG_ND86);
	    doanhNghiepSoHuuThue = ParamUtil.getString(actionRequest, DOANH_NGHIEP_SO_HUU_THUE);
	    thoiHanThue = ParamUtil.getDate(actionRequest, THOI_HAN_THUE, sdf, null);
	    hopDongSauCung = ParamUtil.getInteger(actionRequest, HOP_DONG_SAU_CUNG);
	    ketQuaXuLy = ParamUtil.getInteger(actionRequest, KET_QUA_XU_LY);
	    soPhuHieuDuocCap = ParamUtil.getString(actionRequest, SO_PHU_HIEU_DUOC_CAP);
	    thoiHanDuocCapPhep = ParamUtil.getDate(actionRequest, THOI_HAN_DUOC_CAP_PHEP, sdf, null);

	    tenDoanhNghiep = ParamUtil.getString(actionRequest, TEN_DOANH_NGHIEP);
	    giayPhepKinhDoanhVanTai = ParamUtil.getString(actionRequest, GIAY_PHEP_KD_VT);
	    ngayCapGiayPhepKinhDoanhVanTai = ParamUtil.getDate(actionRequest, NGAY_CAP_GIAY_PHEP_KD_VT, sdf, null); 
	    noiCapGiayPhepKinhDoanhVanTai =ParamUtil.getString(actionRequest, NOI_CAP_GIAY_PHEP_KD_VT);
	    ngayGiaHanGiayPhepKinhDoanhVanTai = ParamUtil.getDate(actionRequest, NGAY_GIA_HAN_GIAY_PHEP_KD_VT, sdf, null); 
	    soGPKDLuHanhQuocTe = ParamUtil.getString(actionRequest, SO_GPDK_LU_HANH_QUOC_TE);
	    noiCapGPKDLuHanhQuocTe = ParamUtil.getString(actionRequest, NOI_CAP_GPDK_LU_HANH_QUOC_TE);
	    ngayCapGPKDLuHanhQuocTe = ParamUtil.getDate(actionRequest, NGAY_CAP_GPDK_LU_HANH_QUOC_TE, sdf, null); 
	    ngayGiaHanGPKDLuHanhQuocTe  = ParamUtil.getDate(actionRequest, NGAY_GIA_HAN_GPDK_LU_HANH_QUOC_TE, sdf, null); 
	    soLuongXeXinCap = ParamUtil.getString(actionRequest, SO_LUONG_XE_XIN_CAP);
	    idPhuongTien = ParamUtil.getString(actionRequest, ID_PHUONG_TIEN);
	    
	    nguoiLienHeTraKetQua = ParamUtil.getString(actionRequest, NGUOI_LIEN_HE_TRA_KET_QUA)  ;
        soDienThoaiNguoiLienHe= ParamUtil.getString(actionRequest, SO_DIEN_THOAI_NGUOI_LIEN_HE)  ;
        ngayTraKetQua = ParamUtil.getDate(actionRequest, NGAY_TRA_KET_QUA, sdf, null); 
        nguoiNhanKetQua = ParamUtil.getString(actionRequest, NGUOI_NHAN_KET_QUA);
        thongTinTraKetQua = ParamUtil.getString(actionRequest, THONG_TIN_TRA_KET_QUA);
	    
	    if(ketQuaXuLy==1){
	    	lyDoKhongDat = null;
	    	soA = ParamUtil.getString(actionRequest, SO_A);
		    soB = ParamUtil.getString(actionRequest, SO_B);
		    donVi = ParamUtil.getString(actionRequest, DON_VI);
		    bienSoDat = ParamUtil.getString(actionRequest, BIEN_SO_DAT);
		    coGiaTriDen = ParamUtil.getDate(actionRequest, CO_GIA_TRI_DEN, sdf, null); 
	    }else{
		    lyDoKhongDat = ParamUtil.getString(actionRequest, LY_DO_KHONG_DAT);
	    }
	    
	    hinhThucSoHuu = ParamUtil.getString(actionRequest, HINH_THUC_SO_HUU);
	}

	private int id;
	private int thongHoSoId;
	private int thongTinXuLyId;
	private String LinhVucKinhDoanh;
	private String lyDoCapLai;
	private String gpkdLuuHanhQuocTe;
	private String gpkdLuuHanhQuocTeCQCAP;
	private Date gpkdLuuHanhQuocTeNgayCap;
	private Date gpkdLuuHanhQuocTeNgayHetHan;
	private String soLuongXe;
	private int soLuongBHPHNopLai;
	private int lapCap;
	
    private int capBienHieuID;
    private String nhanHieu;
    private String bienSo;
    private String soKhung;
    private String soMay;
    private int namSx;
    private String mauSon;
    private String trongTai;
    private int soChoNgoi;
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
    private String lyDoKhongDat;
    private String tenDoanhNghiep;
    private String giayPhepKinhDoanhVanTai;
    private Date ngayCapGiayPhepKinhDoanhVanTai;
    private String noiCapGiayPhepKinhDoanhVanTai;
    private Date ngayGiaHanGiayPhepKinhDoanhVanTai;
    private String soGPKDLuHanhQuocTe;
    private String noiCapGPKDLuHanhQuocTe; 
    private Date  ngayCapGPKDLuHanhQuocTe;
    private Date ngayGiaHanGPKDLuHanhQuocTe;
    private String soLuongXeXinCap;
    private String donVi;
    private String bienSoDat;
    private Date coGiaTriDen;
    private String   idPhuongTien;
    
    private String  hinhThucSoHuu;
    private String  soA;
    private String soB;
    
    
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
	public int getThongTinXuLyId() {
		return thongTinXuLyId;
	}
	public void setThongTinXuLyId(int thongTinXuLyId) {
		this.thongTinXuLyId = thongTinXuLyId;
	}
	public String getLinhVucKinhDoanh() {
		return LinhVucKinhDoanh;
	}
	public void setLinhVucKinhDoanh(String linhVucKinhDoanh) {
		LinhVucKinhDoanh = linhVucKinhDoanh;
	}
	public String getLyDoCapLai() {
		return lyDoCapLai;
	}
	public void setLyDoCapLai(String lyDoCapLai) {
		this.lyDoCapLai = lyDoCapLai;
	}
	public String getGpkdLuuHanhQuocTe() {
		return gpkdLuuHanhQuocTe;
	}
	public void setGpkdLuuHanhQuocTe(String gpkdLuuHanhQuocTe) {
		this.gpkdLuuHanhQuocTe = gpkdLuuHanhQuocTe;
	}
	public String getGpkdLuuHanhQuocTeCQCAP() {
		return gpkdLuuHanhQuocTeCQCAP;
	}
	public void setGpkdLuuHanhQuocTeCQCAP(String gpkdLuuHanhQuocTeCQCAP) {
		this.gpkdLuuHanhQuocTeCQCAP = gpkdLuuHanhQuocTeCQCAP;
	}
	public Date getGpkdLuuHanhQuocTeNgayCap() {
		return gpkdLuuHanhQuocTeNgayCap;
	}
	public void setGpkdLuuHanhQuocTeNgayCap(Date gpkdLuuHanhQuocTeNgayCap) {
		this.gpkdLuuHanhQuocTeNgayCap = gpkdLuuHanhQuocTeNgayCap;
	}
	public Date getGpkdLuuHanhQuocTeNgayHetHan() {
		return gpkdLuuHanhQuocTeNgayHetHan;
	}
	public void setGpkdLuuHanhQuocTeNgayHetHan(Date gpkdLuuHanhQuocTeNgayHetHan) {
		this.gpkdLuuHanhQuocTeNgayHetHan = gpkdLuuHanhQuocTeNgayHetHan;
	}
	public String getSoLuongXe() {
		return soLuongXe;
	}
	public void setSoLuongXe(String soLuongXe) {
		this.soLuongXe = soLuongXe;
	}
	public int getSoLuongBHPHNopLai() {
		return soLuongBHPHNopLai;
	}
	public void setSoLuongBHPHNopLai(int soLuongBHPHNopLai) {
		this.soLuongBHPHNopLai = soLuongBHPHNopLai;
	}
	public int getLapCap() {
		return lapCap;
	}
	public void setLapCap(int lapCap) {
		this.lapCap = lapCap;
	}
	public int getCapBienHieuID() {
		return capBienHieuID;
	}
	public void setCapBienHieuID(int capBienHieuID) {
		this.capBienHieuID = capBienHieuID;
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
	public int getNamSx() {
		return namSx;
	}
	public void setNamSx(int namSx) {
		this.namSx = namSx;
	}
	public String getMauSon() {
		return mauSon;
	}
	public void setMauSon(String mauSon) {
		this.mauSon = mauSon;
	}
	public String getTrongTai() {
		return trongTai;
	}
	public void setTrongTai(String trongTai) {
		this.trongTai = trongTai;
	}
	public int getSoChoNgoi() {
		return soChoNgoi;
	}
	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
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
	public String getLyDoKhongDat() {
		return lyDoKhongDat;
	}
	public void setLyDoKhongDat(String lyDoKhongDat) {
		this.lyDoKhongDat = lyDoKhongDat;
	}
	public String getTenDoanhNghiep() {
		return tenDoanhNghiep;
	}
	public void setTenDoanhNghiep(String tenDoanhNghiep) {
		this.tenDoanhNghiep = tenDoanhNghiep;
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
	public String getSoGPKDLuHanhQuocTe() {
		return soGPKDLuHanhQuocTe;
	}
	public void setSoGPKDLuHanhQuocTe(String soGPKDLuHanhQuocTe) {
		this.soGPKDLuHanhQuocTe = soGPKDLuHanhQuocTe;
	}
	public String getNoiCapGPKDLuHanhQuocTe() {
		return noiCapGPKDLuHanhQuocTe;
	}
	public void setNoiCapGPKDLuHanhQuocTe(String noiCapGPKDLuHanhQuocTe) {
		this.noiCapGPKDLuHanhQuocTe = noiCapGPKDLuHanhQuocTe;
	}
	public Date getNgayCapGPKDLuHanhQuocTe() {
		return ngayCapGPKDLuHanhQuocTe;
	}
	public void setNgayCapGPKDLuHanhQuocTe(Date ngayCapGPKDLuHanhQuocTe) {
		this.ngayCapGPKDLuHanhQuocTe = ngayCapGPKDLuHanhQuocTe;
	}
	public Date getNgayGiaHanGPKDLuHanhQuocTe() {
		return ngayGiaHanGPKDLuHanhQuocTe;
	}
	public void setNgayGiaHanGPKDLuHanhQuocTe(Date ngayGiaHanGPKDLuHanhQuocTe) {
		this.ngayGiaHanGPKDLuHanhQuocTe = ngayGiaHanGPKDLuHanhQuocTe;
	}
	public String getSoLuongXeXinCap() {
		return soLuongXeXinCap;
	}
	public void setSoLuongXeXinCap(String soLuongXeXinCap) {
		this.soLuongXeXinCap = soLuongXeXinCap;
	}
	public String getDonVi() {
		return donVi;
	}
	public void setDonVi(String donVi) {
		this.donVi = donVi;
	}
	public String getBienSoDat() {
		return bienSoDat;
	}
	public void setBienSoDat(String bienSoDat) {
		this.bienSoDat = bienSoDat;
	}
	public Date getCoGiaTriDen() {
		return coGiaTriDen;
	}
	public void setCoGiaTriDen(Date coGiaTriDen) {
		this.coGiaTriDen = coGiaTriDen;
	}
	public String getIdPhuongTien() {
		return idPhuongTien;
	}
	public void setIdPhuongTien(String idPhuongTien) {
		this.idPhuongTien = idPhuongTien;
	}
	public String getHinhThucSoHuu() {
		return hinhThucSoHuu;
	}
	public void setHinhThucSoHuu(String hinhThucSoHuu) {
		this.hinhThucSoHuu = hinhThucSoHuu;
	}
	public String getSoA() {
		return soA;
	}
	public void setSoA(String soA) {
		this.soA = soA;
	}
	public String getSoB() {
		return soB;
	}
	public void setSoB(String soB) {
		this.soB = soB;
	}
	public int getThongHoSoId() {
		return thongHoSoId;
	}
	public void setThongHoSoId(int thongHoSoId) {
		this.thongHoSoId = thongHoSoId;
	}
}
