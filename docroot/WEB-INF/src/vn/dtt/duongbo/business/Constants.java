package vn.dtt.duongbo.business;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.liferay.portal.kernel.util.Validator;

import vn.dtt.duongbo.dao.common.model.DmDataItem;
import vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo;
import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo;
import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau;
import vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcBieuMauHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoBieuMauLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil;

public class Constants {
	
	public static int TYPE_RADIO = 1;
	public static int TYPE_CHECKBOX = 2;
	
	public static String TRANG_THAI_HOAT_DONG = "HD";
	public static String TRANG_THAI_DUNG_HOAT_DONG = "DHD";
	public static String TRANG_THAI_CHUA_KICH_HOAT = "CKH";
	public static String TRANG_THAI_DA_XOA = "DX";
	
	
	public static int TYPE_GIA_HAN_GPLV = 1;
	public static int TYPE_GIA_HAN_CHUYEN_DI = 2;
	
	public static final int DM_LINH_VUC_TTHC = 1;
	public static final int DM_KQTHAMTRA = 102;
	public static final int ORGANIZATION_ID = 13101;
	
	public static int NOI_DUNG_HO_SO_TRANG_THAI_ACTIVE = 2;
	public static int NOI_DUNG_HO_SO_TRANG_THAI_CHUA_ACTIVE = 1;
	
	public static String ID_HO_SO_THU_TUC = "ID_HO_SO_THU_TUC";
	public static String ID_THU_TUC_HANH_CHINH = "ID_THU_TUC_HANH_CHINH";
	public static String ID_NOI_DUNG_HO_SO = "ID_NOI_DUNG_HO_SO";
	public static String ID_THANH_PHAN_HO_SO = "ID_THANH_PHAN_HO_SO";
	public static String ID_BIEU_MAU_HO_SO = "ID_BIEU_MAU_HO_SO";
	public static String ID_DOANH_NGHIEP = "ID_DOANH_NGHIEP";
	public static String ID_PHIEU_XU_LY = "ID_PHIEU_XU_LY";
	public static String ID_QUY_TRINH_THU_TUC = "ID_QUY_TRINH_THU_TUC";
	
	public static String MA_THU_TUC_HANH_CHINH = "MA_THU_TUC_HANH_CHINH";
	
	public static String ID_QLVT_THONG_TIN_HOSO = "ID_QLVT_THONGTINHOSO";
	public static String ID_QLVT_THONG_TIN_XULY = "ID_QLVT_THONGTINXULY";
	public static String ID_QLVT_YEU_CAU_BO_SUNG = "ID_QLVT_YEUCAUBOSUNG";
	public static String ID_QLVT_KIEM_TRA_HO_SO = "ID_QLVT_KIEMTRAHOSO";
	
	public static String ID_QLVT_LOAI_HINH_HOAT_DONG_TTHS = "ID_QLVT_LOAIHINHHOATDONG_TTHS";
	public static String ID_QLVT_PHUONGTIENCAPGPVT_VIETTRUNG = "ID_QLVT_PHUONGTIENCAPGPVT_VIETTRUNG";
	public static String ID_QLVT_GPLIENVAN_VT = "ID_QLVT_GPLIENVAN_VT";
	
	public static String TUYEN_HOAT_DONG_ID = "TUYEN_HOAT_DONG_ID";
	
	
	//-------------------START QUAN LY FILE-------------------
	public static String ID_QUAN_LY_FILE = "ID_QUAN_LY_FILE";
	public static String ID_FILE = "ID_FILE";
	
	public static String TEN_GIAY_TO = "TEN_GIAY_TO";
	public static String TRANG_THAI_QUAN_LY_FILE = "TRANG_THAI_QUAN_LY_FILE";
	
	public static String NGAY_CAP_PHEP_FROM = "NGAY_CAP_PHEP_FROM";
	public static String NGAY_CAP_PHEP_TO = "NGAY_CAP_PHEP_TO";
	
	public static String NGAY_HET_HAN_FROM = "NGAY_HET_HAN_FROM";
	public static String NGAY_HET_HAN_TO = "NGAY_HET_HAN_TO";
	
	public static String NGAY_TAI_FROM = "NGAY_TAI_FROM";
	public static String NGAY_TAI_TO = "NGAY_TAI_TO";
	
	public static final long QUAN_LY_FILE_CHUNG = 1;
	public static final long QUAN_LY_FILE_RIENG = 2;
	
	/**Con hieu luc*/
	public static final String QUAN_LY_FILE_TRANG_THAI_CON_HIEU_LUC = "CHL";
	/**Het hieu luc*/
	public static final String QUAN_LY_FILE_TRANG_THAI_HET_HIEU_LUC = "HHL";
	/**Dang su dung*/
	public static final String QUAN_LY_FILE_TRANG_THAI_DANG_SU_DUNG = "DSD";
	/**Khong su dung*/
	public static final String QUAN_LY_FILE_TRANG_THAI_KHONG_SU_DUNG = "KSD";
	
	public static String MA_PHAN_NHOM_QUAN_LY_FILE_GIAY_TO_RIENG = "DN_QLGT_RIENG";
	public static String MA_PHAN_NHOM_QUAN_LY_FILE_GIAY_TO_DUOC_CAP = "DN_QLGT_CAP";
	
	//-------------------END QUAN LY FILE-------------------
	
	//-------------------START LOAI THU TUC HANH CHINH-------------------
	public static final String LOAI_THU_TUC_HANH_CHINH = "LOAI_THU_TUC_HANH_CHINH";
	
	public static String LVTT_VIET_NAM_CAMPUCHIA = "DB_QLVT_VC";
	public static String LVTT_VIET_NAM_LAO = "DB_QLVT_VL";
	public static String LVTT_VIET_NAM_CHINA = "DB_QLVT_VT";
	public static String LVTT_TRONG_NUOC = "DB_QLVT_TN";
	
	public static String LVTT_BIEN_HIEU = "DB_QLVT_TN_BH";
	public static String LVTT_BIEN_HIEU_MOI = "DB_QLVT_TN_BH_MOI";
	public static String LVTT_BIEN_HIEU_LAI = "DB_QLVT_TN_BH_LAI";
	
	public static String LVTT_TN_VAN_TAI_OTO = "DB_QLVT_TN_OTO";
	public static String LVTT_TN_VAN_TAI_OTO_MOI = "DB_QLVT_TN_OTO_MOI";
	public static String LVTT_TN_VAN_TAI_OTO_LAI = "DB_QLVT_TN_OTO_LAI";
	
	public static String LVTT_PHU_HIEU = "DB_QLVT_TN_PH";
	public static String LVTT_GIAY_PHEP_KD_VT = "DB_QLVT_TN_OTO";
	
	public static String LVTT_CHI_MUC = "0";
	public static String LVTT_HAS_TTHC = "1";
	//-------------------END LOAI THU TUC HANH CHINH-------------------
	
//	public static long GROUP_ID_LOAI_HINH_HOAT_DONG = 47;
//	public static long GROUP_ID_LY_DO_CAP_LAI = 49;
//	public static long GROUP_ID_LOAI_HINH_DE_NGHI_CAP = 48;
	
	public static final String[] LIST_ROLE_NO_CHECK_NGUOIXULY = {"36341", "36345", "36346"};
	
	//--------START-----------Thu tuc hanh chinh CAMPUCHIA-------------------
	
	public static final String[] TTHC_VIET_CAM_CAP_PHEP_DUONG_BO_ALL = {"DBVN-CPC1", "DBVN-CPC2", "DBVN-CPC13", "DBVN-CPC14"};
	public static String TTHC_VIET_CAM_CAP_PHEP_DUONG_BO = "DBVN-CPC1";
	public static String TTHC_VIET_CAM_CAP_LAI_DUONG_BO_HET_HAN= "DBVN-CPC2";
	public static String TTHC_VIET_CAM_CAP_LAI_DUONG_BO_MAT_MAT= "DBVN-CPC13";
	public static String TTHC_VIET_CAM_CAP_LAI_DUONG_BO_HU_HONG= "DBVN-CPC14";
	
	public static final String[] TTHC_VIET_CAM_LIENVAN_PHUONGTIEN_KINHDOANH_ALL = {"DBVN-CPC3", "DBVN-CPC4", "DBVN-CPC15", "DBVN-CPC16"};
	public static String TTHC_VIET_CAM_LIENVAN_PHUONGTIEN_KINHDOANH = "DBVN-CPC3";
	public static String TTHC_VIET_CAM_LIENVAN_PHUONGTIEN_KINHDOANH_HET_HAN= "DBVN-CPC4";
	public static String TTHC_VIET_CAM_LIENVAN_PHUONGTIEN_KINHDOANH_MAT_MAT= "DBVN-CPC15";
	public static String TTHC_VIET_CAM_LIENVAN_PHUONGTIEN_KINHDOANH_HU_HONG= "DBVN-CPC16";
	
	public static final String[] TTHC_VIET_CAM_TUYEN_ALL = {"DBVN-CPC8","DBVN-CPC9","DBVN-CPC10","DBVN-CPC11","DBVN-CPC12"};
	public static String TTHC_VIET_CAM_KHAI_THAC_TUYEN_HANH_KHACH_CO_DINH_LIEN_VAN_QUOC_TE= "DBVN-CPC8";
	public static String TTHC_VIET_CAM_BO_SUNG_KHAI_THAC_TUYEN_HANH_KHACH_CO_DINH_LIEN_VAN_QUOC_TE= "DBVN-CPC9";
	public static String TTHC_VIET_CAM_THAY_THE_KHAI_THAC_TUYEN_HANH_KHACH_CO_DINH= "DBVN-CPC10";
	public static String TTHC_VIET_CAM_NGUNG_KHAI_THAC_TUYEN_HANH_KHACH_CO_DINH= "DBVN-CPC11";
	public static String TTHC_VIET_CAM_DIEU_CHINH_KHAI_THAC_TUYEN_HANH_KHACH_CO_DINH= "DBVN-CPC12";
	public static String GIA_HAN_GPLV_PHUONGTIEN_VIET_CAM = "DBVN-CPC7";
	
	public static final String[] TTHC_VIET_CAM_LIENVAN_PHUONGTIEN_PHI_THUONGMAI_ALL = {"DBVN-CPC5", "DBVN-CPC18", "DBVN-CPC6", "DBVN-CPC17"};
	public static String TTHC_VIET_CAM_LIENVAN_PHUONGTIEN_PHITHUONGMAI = "DBVN-CPC5";
	public static String TTHC_VIET_CAM_LIENVAN_PHUONGTIEN_PHITHUONGMAI_HET_HAN= "DBVN-CPC6";
	public static String TTHC_VIET_CAM_LIENVAN_PHUONGTIEN_PHITHUONGMAI_MAT_MAT= "DBVN-CPC17";
	public static String TTHC_VIET_CAM_LIENVAN_PHUONGTIEN_PHITHUONGMAI_HU_HONG= "DBVN-CPC18";
	//---------END----------Thu tuc hanh chinh CAMPUCHIA-------------------
	
	
	
	//-------START------------Thu tuc hanh chinh CHINA-------------------
	public static String TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_LOAI_ABCEFG_LAN_DAU = "DBVN-TQ1";
	public static String TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_CONG_VU = "DBVN-TQ2";
	public static String TTHC_VIET_TQ_CAP_GIAY_GIOI_THIEU_DE_NGHI_CAP_PHEP_VAN_TAI_LOAI_D = "DBVN-TQ3";
	public static String TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_LOAI_D = "DBVN-TQ4";
	public static String TTHC_VIET_TQ_CAP_GPVT_LOAI_B_C_F_G_lAN_THU_HAI_TRO_DI_TRONG_NAM = "DBVN-TQ5";
	public static String TTHC_VIET_TQ_CAP_LAI_GPVT_A_E_HET_HAN = "DBVN-TQ6";
	public static String TTHC_VIET_TQ_GIA_HAN_GIAY_PHEP_THOI_GIAN_LUU_HANH = "DBVN-TQ7";
	public static String TTHC_VIET_TQ_DANG_KY_KHAI_THAC_TUYEN = "DBVN-TQ8";
	public static String TTHC_VIET_TQ_BO_SUNG_THAY_THE_PHUONG_TIEN_KHAI_THAC_TUYEN = "DBVN-TQ9";
	public static String TTHC_VIET_TQ_CAP_LAI_GPVT_LOAI_B_C_F_G_DO_HET_HAN = "DBVN-TQ10";
	public static String TTHC_VIET_TQ_CAP_LAI_GPVT_A_D_E_HONG_MAT = "DBVN-TQ11";
	
	//-------END------------Thu tuc hanh chinh CHINA-------------------
	
	// thu tuc hanh chinh oto================
	public static String TTHC_OTO_CAP_MOI= "GPKDVT_1";
	public static String TTHC_OTO_CAP_LAI_THAYDOINOIDUNG= "GPKDVT_2";
	public static String TTHC_OTO_CAP_LAI_HETHAN= "GPKDVT_3";
	public static String TTHC_OTO_CAP_LAI_MATMATHUHONG= "GPKDVT_4";
	
	//---------------------------- Thu tuc hanh chinh LAOS----------------------------
	public static final String[] TTHC_VIET_LAO_CAP_PHEP_DUONG_BO_ALL = {"DBVN_L1", "DBVN_L2", "DBVN_L13", "DBVN_L14"};
	public static String TTHC_VIET_LAO_CAP_PHEP_DUONG_BO = "DBVN_L1";
	public static String TTHC_VIET_LAO_CAP_LAI_DUONG_BO_HET_HAN= "DBVN_L2";
	public static String TTHC_VIET_LAO_CAP_LAI_DUONG_BO_MAT_MAT= "DBVN_L13";
	public static String TTHC_VIET_LAO_CAP_LAI_DUONG_BO_HU_HONG= "DBVN_L14";
	
	public static final String[] TTHC_VIET_LAO_LIENVAN_PHUONGTIEN_KINHDOANH_ALL = {"DBVN_L3", "DBVN_L4", "DBVN_L15", "DBVN_L16"};
	public static String TTHC_VIET_LAO_LIENVAN_PHUONGTIEN_KINHDOANH = "DBVN_L3";
	public static String TTHC_VIET_LAO_LIENVAN_PHUONGTIEN_KINHDOANH_HET_HAN= "DBVN_L4";
	public static String TTHC_VIET_LAO_LIENVAN_PHUONGTIEN_KINHDOANH_MAT_MAT= "DBVN_L15";
	public static String TTHC_VIET_LAO_LIENVAN_PHUONGTIEN_KINHDOANH_HU_HONG= "DBVN_L16";
	
	public static final String[] TTHC_VIET_LAO_LIENVAN_PHUONGTIEN_PHI_THUONGMAI_ALL = {"DBVN_L5", "DBVN_L6", "DBVN_L17", "DBVN_L18"};
	public static String TTHC_VIET_LAO_LIENVAN_PHUONGTIEN_PHITHUONGMAI = "DBVN_L5";
	public static String TTHC_VIET_LAO_LIENVAN_PHUONGTIEN_PHITHUONGMAI_HET_HAN= "DBVN_L6";
	public static String TTHC_VIET_LAO_LIENVAN_PHUONGTIEN_PHITHUONGMAI_MAT_MAT= "DBVN_L17";
	public static String TTHC_VIET_LAO_LIENVAN_PHUONGTIEN_PHITHUONGMAI_HU_HONG= "DBVN_L18";
	
	
	public static final String[] TTHC_VIET_LAO_TUYEN_LIEN_VAN_ALL = {"DBVN_L8", "DBVN_L9", "DBVN_L10", "DBVN_L11","DBVN_L12"};
	public static String TTHC_VIET_LAO_KHAI_THAC_TUYEN_HANH_KHACH_CO_DINH_LIEN_VAN_QUOC_TE = "DBVN_L8";
	public static String TTHC_VIET_LAO_BO_SUNG_PHUONNG_TIEN_KHAI_THAC_TUYEN_CO_DINH_VAN_TAI = "DBVN_L9";
	public static String TTHC_VIET_LAO_THAY_THE_PHUONG_TIEN_KHAI_THAC_TUYEN_CO_DINH_VAN_TAI = "DBVN_L10";
	public static String TTHC_VIET_LAO_NGUNG_KHAI_THAC_TUYEN_CO_DINH_VAN_TAI = "DBVN_L11";
	public static String TTHC_VIET_LAO_DIEU_CHINH_TAN_SUAT_VAN_TAI_HANH_KHACH_CO_DINH = "DBVN_L12";
	
	public static String GIA_HAN_GPLV_PHUONGTIEN_VIET_LAO = "DBVN_L7";
	//---------------------------- end LAOS---------------------------- 
	
	public static final String[] TTHC_VANTAI_TRONGNUOC_VAN_TAI_OTO_ALL = {"GPKDVT_1", "GPKDVT_2", "GPKDVT_3", "GPKDVT_4"};
	public static String TTHC_VANTAI_TRONGNUOC_VAN_TAI_OTO = "GPKDVT_1";
	public static String TTHC_CAP_LAI_VANTAI_TRONGNUOC_VAN_TAI_OTO_THAY_DOI_ND = "GPKDVT_2";
	public static String TTHC_CAP_LAI_VANTAI_TRONGNUOC_VAN_TAI_OTO_HET_HAN = "GPKDVT_3";
	public static String TTHC_CAP_LAI_VANTAI_TRONGNUOC_VAN_TAI_OTO_MAT_HONG = "GPKDVT_4";
	
	public static final String[] TTHC_VANTAI_TRONGNUOC_BIEN_HIEU_ALL = {"BH_1", "BH_2"};
	public static String TTHC_VANTAI_TRONGNUOC_BIEN_HIEU = "BH_1";
	public static String TTHC_VANTAI_TRONGNUOC_BIEN_HIEU_LAI = "BH_2";
	
	
	
	public static final String[] TTHC_CAP_PHU_HIEU_ALL = {"PH_1", "PH_2", "PH_3", "PH_4"};
	public static final String[] TTHC_CAP_BIEN_HIEU_ALL = {"BH_1", "BH_2"};
	
	public static String CAP_PHU_HIEU_XE_NOI_BO = "PH_1";
	public static String CAP_PHU_HIEU_XE_TRUNG_CHUYEN = "PH_2";
	public static String CAP_PHU_HIEU_TAXI_BUYT_TUYEN_CO_DINH_HOP_DONG = "PH_3";
	public static String CAP_PHU_HIEU_XE_CONTENO_XETAI = "PH_4";
	
	
	
	public static String CODE_LINH_VUC_THU_TUC = "CODE_LINH_VUC_THU_TUC";
	public static String MA_BIEN_NHAN = "MA_BIEN_NHAN";
	
	public static final int THANH_PHAN_HO_SO_BAT_BUC = 1;
	public static final int THANH_PHAN_HO_SO_BO_XUNG = 2;
	public static final int THANH_PHAN_HO_SO_KHONG_BAT_BUC = 3;
	public static final int THANH_PHAN_HO_SO_KET_QUA_TRA_VE = 4;
	
	//------------- Phan nhom ho so TREN MENU DOANH NGHIEP
	public static final String DOANH_NGHIEP_PHAN_NHOM_HO_SO_DANG_TAO = "DN_HSDT";
	public static final int DOANH_NGHIEP_PHAN_NHOM_HO_SO_DANG_TAO_ID = 16;
	
	public static final String DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_TIEP_NHAN = "DN_HSCTN";
	public static final int DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_TIEP_NHAN_ID = 17;
	
	public static final String DOANH_NGHIEP_PHAN_NHOM_HO_SO_DANG_XU_LY = "DN_HSDXL";
	public static final int DOANH_NGHIEP_PHAN_NHOM_HO_SO_DANG_XU_LY_ID = 18;
	
	public static final String DOANH_NGHIEP_PHAN_NHOM_HO_SO_DA_TRA_KET_QUA = "DN_HSTKQ";
	public static final int DOANH_NGHIEP_PHAN_NHOM_HO_SO_DA_TRA_KET_QUA_ID = 19;
	
	public static final String DOANH_NGHIEP_PHAN_NHOM_DN_QLGT_RIENG = "DN_QLGT_RIENG";
	public static final int DOANH_NGHIEP_PHAN_NHOM_DN_QLGT_RIENG_ID = 20;

	public static final String DOANH_NGHIEP_PHAN_NHOM_DN_QLGT_CAP = "DN_QLGT_CAP";
	public static final int DOANH_NGHIEP_PHAN_NHOM_DN_QLGT_CAP_ID = 21;
	
	public static final String DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_BO_SUNG = "DN_HSCBS";
	public static final int DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_BO_SUNG_ID = 34;
	
	public static final String DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_THANH_TOAN = "DN_HSCTT";
	public static final int DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_THANH_TOAN_ID = 35;
	//------------- Phan nhom ho so TREN MENU DOANH NGHIEP
	
	public static final String DOANH_NGHIEP_TRANG_THAI_HO_SO_LUU_NHAP = "DN_DT";
	public static final String DOANH_NGHIEP_TRANG_THAI_HO_SO_CHO_TIEP_NHAN = "DN_CTN";
	public static final String DOANH_NGHIEP_TRANG_THAI_HO_SO_DANG_XU_LY = "DN_DXL";
	public static final String DOANH_NGHIEP_TRANG_THAI_HO_SO_CHO_BO_SUNG = "DN_CBS";
	public static final String DOANH_NGHIEP_TRANG_THAI_HO_SO_CHO_THANH_TOAN = "DN_CTT";
	public static final String DOANH_NGHIEP_TRANG_THAI_HO_SO_HOAN_THANH = "DN_HT";
	
	public static final String CAN_BO_TRANG_THAI_HO_SO_CHO_TIEP_NHAN = "HSCTN";
	
	
	public static final String RETURN_URL = "RETURN_URL";
	public static final String MA_PHAN_NHOM_HO_SO = "ma_phan_nhom_hoso";
	public static final String MA_PHAN_NHOM_DOANH_NGHIEP = "ma_phan_nhom_doanh_nghiep";
	public static final String TRANG_THAI_HO_SO = "trang_thai_ho_so";
	public static final String THANH_PHAN_XU_LY = "thanh_phan_xu_ly";
	public static final String XU_LY_TLHS = "xu_ly_tlhs";
	public static final String XU_LY_TPHS = "xu_ly_tphs";
	public static final String XU_LY_TT = "xu_ly_tt";
	public static final String JSP_PAGE = "JSP_PAGE";
	public static final String VIEW_PDF = "view_pdf";
	
	public static String LOAI_MENU = "LOAI_MENU";
	public static String DANH_SACH_DICH_VU_CONG = "danh_sach_dich_vu_cong";
	public static String DANH_SACH_NOI_DUNG_HO_SO = "DANH_SACH_NOI_DUNG_HO_SO";
	
	public static final String MA_PHAN_NHOM_QLTT_CA_NHAN = "MA_PHAN_NHOM_QLTT_CA_NHAN";
	
	
	
//	Trang thai	
	public static int TAO_MOI = 0;
	public static int CHO_TIEP_NHAN = 1;
	public static int XEM_XET_TIEP_NHAN = 2;
	public static int YEU_CAU_SUA_DOI_BO_XUNG = 3;
	public static int XEM_XET_VI_PHAM = 4;
	public static int DA_BO_XUNG_CHO_TIEP_NHAN = 5;
	public static int DA_XAC_NHAN_DKKT = 6;

	public static int XAC_NHAN_KE_HOACH = 7;
	
	public static int PHIEU_XU_LY_PHU_NHAN_DE_NGHI_KIEM_TRA = 8;
	
	public static int PHIEU_XU_LY_PHU_PHAN_CONG_KIEM_TRA = 9;	
	public static int PHIEU_XU_LY_PHU_PHAN_CONG_DKV= 10;
	
	public static int PHIEU_XU_LY_PHU_XEM_XET_THU_NGHIEM= 12;
	
	public static int PHIEU_XU_LY_PHU_PHAN_CONG_DON_VI_KIEM_TRA= 14;
	
	//public static int PHIEU_XU_LY_PHU_PHAN_CONG_DKV= 10;
	
	public static final int LOAIPHANNHOM_HO_SO = 11;
	public static final int LOAIPHANNHOM_GIAY_TO = 12;
	public static final int LOAIPHANNHOM_THONG_TIN = 13;
	
	public static final int LOAIPHANNHOM_CAN_BO_HO_SO = 1;
	public static final int LOAIPHANNHOM_CAN_BO_TRA_CUU = 2;
	public static final int LOAIPHANNHOM_CAN_BO_BAO_CAO = 3;
	public static final int LOAIPHANNHOM_CAN_BO_TIEP_NHAN_TRUC_TIEP = 6;
	public static final String PATH_MAUDON_VIEW_PDF = "path_maudon_view_pdf";
	public static final String LST_OBJECT_PHUONG_TIEN = "objectPhuongTien";
	
	
	///test khung
	public static String SO_HO_SO = "soHoSo";
	public static String NGAY_NOP_HO_SO_FROM = "ngayNopHsFrom";
	public static String NGAY_NOP_HO_SO_TO = "ngayNopHsTo";
	public static String NGAY_HEN_TRA_FROM = "ngayHenTraHsFrom";
	public static String NGAY_HEN_TRA_TO = "ngayHenTraHsTo";
	public static String DOANH_NGHIEP = "doanhNghiep";

	
	public static String PHI_THAM_DINH_CODE = "PTD";
	public static String PHI_PHAT_SINH_CODE = "PPS";
	public static String LINH_VUC_THU_TUC_HANH_CHINH_CODE = "5";
	
	public static String MTYT_KeTOAN = "XAC_NHAN_THANH_TOAN";
	public static final int MTYT_XAC_NHAN_THANH_TOAN_KHONG_HOP_LE = 1;
	public static final int MTYT_XAC_NHAN_THANH_TOAN_HOP_LE = 2;
	public static final int MTYT_CHUA_XAC_NHAN_THANH_TOAN = 0;
	
	public static final int MTYT_HINH_THUC_THANH_TOAN_TRUC_TIEP = 1;
	public static final int MTYT_HINH_THUC_THANH_TOAN_CHUYEN_KHOAN = 2;
	public static final int MTYT_HINH_THUC_THANH_TOAN_KEY_PAD = 3;
	
	
	public static final int IS_MASTER_ACCOUNT = 2;
	public static final int IS_NOT_MASTER_ACCOUNT = 1;
	
	///test khung
		
//		For thanh toan ipay
		public static String VPC_AMOUNT = "VPC_AMOUNT";
		public static String CHUA_CO_KET_QUA = "CHUA_CO_KET_QUA";
		public static int THANH_TOAN_TRUC_TIEP = 1;
		public static int THANH_TOAN_CHUYEN_KHOAN = 2;
		public static int THANH_TOAN_KEYPAY = 3;
		public static String DANH_SACH_HO_SO_THU_TUC = "lisHoSoThuTuc";
		
		
		public static String MA_THU_TUC = "mathutuc";
		public static String LOAI_THU_TUC = "loaiThuTuc";
		public static String TEN_THU_TUC = "tenThuTuc";
		
		public static String BIEU_MAU_HO_SO_ID = "bieumauhosoid";
		public static String THU_TU_HIEN_THI = "thutuhienthi";
		public static String LOAI_THANH_PHAN = "loaithanhphan";
		public static String MAU_TRUC_TUYEN = "mautructuyen";
		public static String SO_TAI_LIEU_DINHKEM = "sotailieudinhkem";
		
		public static String SO_CHUNG_CHI = "so_chung_chi";
		public static String SO_HO_SO_ORDER = "soHoSoOrder";
		
		public static String NAM_NHAP = "namNhap";
		public static String LOAD_DATABASE_MOTCUA = "LOAD_DATABASE_MOTCUA";
		
		public static String QUAN_HUYEN = "quan_huyen";
		public static String TINH_THANH = "tinh_thanh";
		public static String DAT_NUOC = "dat_nuoc";
		
		public static String CO_QUAN_QLTT_ID = "coquanqlttid";
		public static String LINH_VUC_THU_TUC_ID = "linhvucthutucid";
		
		public static String ID_XACNHANTHANHTOAN = "ID_XACNHANTHANHTOAN";
		
		public static String TTHC_NOIDUNGHOSO_ID = "TTHC_NOIDUNGHOSO_ID";
		
		
		public static String TEN_FILE = "TEN_FILE";
		

		public static String MAPHANNHOMHOSO = "MAPHANNHOMHOSO";
		
		public static String ID_PHAN_NHOM_HO_SO = "ID_PHAN_NHOM_HO_SO";
		
		//Tra cuu
		
		public static String THU_TUC_HANH_CHINH_LUU_HANH_CHINH_THUC = "DKLHCT";
		public static String THU_TUC_HANH_CHINH_LUU_HANH_BO_XUNG = "DKLHBS";
		public static String THU_TUC_HANH_CHINH_LUU_HANH_LAI = "DKLHL";
		public static String THU_TUC_HANH_CHINH_GIAY_PHEP_NHAP_KHAU = "GPNK";
		
		
		public static String MA_PHAN_NHOM_THONG_TIN_DN = "TTDN";
		public static String MA_PHAN_NHOM_QL_TAI_KHOAN_PHU = "TKP";
		
		public static String NHAP_KHAU_KHAO_NGHIEM = "NKKN";
		public static String NHAP_KHAU_MUC_DICH_DAC_THU = "NKDT";
		
		public static String MTYT_VANTHU = "MTYT_VANTHU";
		public static String MTYT_QUANTRI = "MTYT_QUANTRI";
		public static String MTYT_LANHDAOCUC = "MTYT_LANHDAOCUC";
		public static String MTYT_PHO_CT = "MTYT_PHO_CT";
		public static String MTYT_LANHDAOPHONG = "MTYT_LANHDAOPHONG";
		public static String MTYT_CANBOXULY = "MTYT_CANBOXULY";
		
		public static final int XLHS_CO_Y_KIEN = 1;
		public static final int XLHS_KHONG_CO_Y_KIEN = 2;
		
		public static final int XLHS_DAT = 1;
		public static final int XLHS_KHONG_DAT = 2;
		
		public static final int NOIDUNGTHAMTRA_BUOCXULY_TRUOCKHAOSAT = 1;
		public static final int NOIDUNGTHAMTRA_BUOCXULY_SAUKHAOSAT = 2;
		
		public static final int THONGTINDANGKY_DATHAMTRA_CHUACOPHIEU = 0;
		public static final int THONGTINDANGKY_DATHAMTRA_DACOPHIEU = 1;
		
		
		
		// For creat model tu XuLyHoSoPdf
		public static String CHO_PHEP_KHAO_NGHIEM_LUU_HANH_LAI = "CPKNLHL";
		public static String CHO_PHEP_KHAO_NGHIEM_LUU_HANH_BO_SUNG = "CPKNLHBS";
		public static String CHO_PHEP_KHAO_NGHIEM_LUU_HANH_CHINH_THUC = "CPKNLHCT";
		public static String VAN_BAN_KHONG_DONG_Y_LUU_HANH_BO_SUNG = "KDYLHBS";
		public static String VAN_BAN_YEU_CAU_BO_SUNG_LUU_HANH_LAI = "YCBSLHL";
		public static String VAN_BAN_YEU_CAU_BO_SUNG_LUU_HANH_CHINH_THUC = "YCBSLHCT";
		public static String CHO_PHEP_NHAP_KHAU_MUC_DICH_DAC_THU = "GPNKDT";
		public static String CHO_PHEP_NHAP_KHAU_KHAO_NGHIEM = "GPNKKNKN";
		public static String GIAY_CHUNG_NHAN_DANG_KY_LUU_HANH = "GCNDKLH";
		
		public static String KEY_WORDS = "KEY_WORDS";
		public static String TEN_THUONG_MAI_HOA_CHAT = "TEN_THUONG_MAI_HOA_CHAT";
		public static final String DIEU_KIEN_DICH_CHUYEN = "DIEU_KIEN_DICH_CHUYEN";
		
		public static final int BUOC_XU_LY_B1 = 1;
		public static final int BUOC_XU_LY_B2 = 2;
		
		public static final int LOAIPHANNHOM_TRA_CUU = 2;
		public static final int LOAIPHANNHOM_THONG_KE = 3;
		public static final int LOAIPHANNHOM_QUAN_LY = 4;
		public static final int LOAIPHANNHOM_UY_QUYEN = 5;
		
		public static String LOAI_TRA_CUU = "LOAI_TRA_CUU";
		
		public static String LOAI_TRA_CUU_GPDKLH = "LOAI_TRA_CUU_GPDKLH";
		public static String LOAI_TRA_CUU_GPNK = "LOAI_TRA_CUU_GPNK";
		
		
		//
		public static String LOAI_THANH_TOAN = "loai_thanh_toan";
		public static String LOAI_GIAO_DICH = "loai_giao_dich";
		public static String MA_GIAO_DICH = "ma_giao_dich";
		public static String LOAI_TRANG_THAI = "loai_trang_thai";
		
		
		//HoaChat 
		public static String HOA_CHAT_DIET_KHUAN = "HCDK";
		public static String HOA_CHAT_DIET_CON_TRUNG = "HCDCT";
		public static String HOA_CHAT_TAY_RUA = "HCTR";
		
		
		public static final int TRANG_THAI_CON_HIEU_LUC = 1;
		public static final int TRANG_THAI_HET_HIEU_LUC = 2;
		public static final int TRANG_THAI_KHONG_SU_DUNG = 3;
		
		
		public static final int TRANG_THAI_DANG_UY_QUYEN = 1;
		public static final int TRANG_THAI_HUY_UY_QUYEN = 2;
		public static final int KEYPAY_RESPONSE = 1;
		public static final int KEYPAY_IPN_RECEIVER = 0;
		public static int KEYPAY_NORMAL_RECEIVER = 1;
		
		public static final String KEYPAY_REQUEST = null;
		
		
		public static String QUAN_TRI_DOANH_NGHIEP = "QUAN_TRI_DOANH_NGHIEP";
		
		public static String LOAI_NGUOI_LAM_THU_TUC_DN = "1";
		public static String LOAI_NGUOI_LAM_THU_TUC_CD = "2";
			
		public static int GROUP_ID_LY_DO_CAP_LAI = 49;
		public static int GROUP_LOAI_HINH_HOAT_DONG = 28;
		public static int GROUP_ID_LOAI_HINH_HOAT_DONG = 47;
		public static int GROUP_ID_LOAI_HINH_DE_NGHI_CAP = 48;
		public static int GROUP_ID_DM_TUYEN_VIET_LAO = 58;
		public static int GROUP_ID_DM_TUYEN_OTO = 17;
		
		public static int GROUP_ID_DM_TUYEN_VIET_CAM = 59;
		public static int GROUP_ID_DM_TUYEN_VIET_TRUNG = 60;
		
		
		public static String[] VN_VL_LIENVAN_CAP_MOI = new String[] {"DBVN_L3","DBVN_L5"};
		public static String[] VN_VL_LIENVAN_CAP_LAI = new String[] {"DBVN_L15","DBVN_L16","DBVN_L17","DBVN_L18","DBVN_L4","DBVN_L6"};
		public static final Set<String> h = Collections.singleton("a");
		public static final String[] VIET_LAO_LIEN_VAN_THUONG_MAI = new String[] {"DBVN_L3", "DBVN_L4", "DBVN_L15", "DBVN_L16"};
		public static final String[] VIET_LAO_LIEN_VAN_PHI_THUONG_MAI = new String[] {"DBVN_L5", "DBVN_L6", "DBVN_L17", "DBVN_L18"};
		public static String VIET_LAO_LIEN_VAN_PHI_GIA_HAn = "DBVN_L7";
		public static final Map<String, String> PDF_MAPPING = new HashMap<String, String>();
		
		
		public static String THAO_TAC_THANH_CONG = "THAO_TAC_THANH_CONG";
		public static String THAO_TAC_THAT_BAI = "THAO_TAC_THAT_BAI";
		
		static {
			//query ket qua tham tra + dataitem + thanh phan ho so
			List<DmDataItem> dmData = new ArrayList<DmDataItem>();//50, 102, 
			dmData.addAll(new ArrayList<DmDataItem>(DmDataItemLocalServiceUtil.findByGroupId(50)));
			dmData.addAll(new ArrayList<DmDataItem>(DmDataItemLocalServiceUtil.findByGroupId(102)));
			dmData.addAll(new ArrayList<DmDataItem>(DmDataItemLocalServiceUtil.findByGroupId(110)));
			dmData.addAll(new ArrayList<DmDataItem>(DmDataItemLocalServiceUtil.findByGroupId(111)));
			try {
				for (DmDataItem dmDataItem : dmData) {
					String node1 = Validator.isNotNull(dmDataItem.getNode1())?dmDataItem.getNode1():dmDataItem.getCode();
					TthcThanhPhanHoSo ttTP = null;
					for(int i=0; i < 60; i++ ){
							if(Validator.isNotNull(node1)){
//							System.out.println("TthcThanhPhanHoSoLocalServiceUtil.fetchByF_thuTucHanhChinhId_maThanhPhan(i, node1);"+i+"//"+node1);
							ttTP = TthcThanhPhanHoSoLocalServiceUtil.fetchByF_thuTucHanhChinhId_maThanhPhan(i, node1);
						}
						if(Validator.isNotNull(ttTP) && TthcThanhPhanHoSoBieuMauLocalServiceUtil.findByThanhPhanHoSoId(ttTP.getId()).size() > 0){
	//						ttTP
							TthcThanhPhanHoSoBieuMau ettTPBM = TthcThanhPhanHoSoBieuMauLocalServiceUtil.findByThanhPhanHoSoId(ttTP.getId()).get(0);
							TthcBieuMauHoSo ettBMHS = TthcBieuMauHoSoLocalServiceUtil.fetchTthcBieuMauHoSo(ettTPBM.getBieuMauHoSoId());
							PDF_MAPPING.put(Validator.isNotNull(dmDataItem.getNode1())?dmDataItem.getNode1():dmDataItem.getCode(), ettBMHS.getMaBieuMau());
						}
						
					}
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			 Set<String> mySet = new HashSet<String>();

			 for (Iterator itr = PDF_MAPPING.entrySet().iterator(); itr.hasNext();)
			 {
				 Map.Entry<String, String> entrySet = (Map.Entry) itr.next();

				 String value = entrySet.getKey();

				 if (!mySet.add(value))
				 {
					 itr.remove();               
				 }
			 }
			 System.out.println("Final Map : " + PDF_MAPPING);
//			PDF_MAPPING.put("DM_GIAHANGPLV", "BMDB14");// --> gia hạn Việt lào
//			PDF_MAPPING.put("GPLV_VT_GIA_HAN", "BMDB73");// --> gia hạn Việt TRUNG
//			PDF_MAPPING.put("GPLV_VC_GIA_HAN", "BMDB41");// --> gia hạn Việt CAM
//			
//			PDF_MAPPING.put("GPLV_VL", "BM08");// dmdataitem id = 13005  -------- PhuHieuLienVanVietLaos.xsd
//			PDF_MAPPING.put("GPDB_VL", "BMDB1");// dmdataitem id =  13000   -------- DeNghiCapGiayPhepVanTaiDuongBoVietLao.xsd
//			PDF_MAPPING.put("CVYCBS", "BM_147");// dmdataitem id =  13002   -------- CongVanYCBSHoSoDeNghiCapPHBH.xsd
//			PDF_MAPPING.put("CVTCCGP", "BM_148");// dmdataitem id =  13003   -------- CongVanTuChoiCapPHBH.xsd
//			
//			PDF_MAPPING.put("GPVT_VT_LANDAU", "BMDB51");// dmdataitem id =  13006  -------- DeNghiCapGiayPhepVanTaiDuongBoVietTrung.xsd
//			PDF_MAPPING.put("GPVT_VT_XECONGVU", "BMDB55");// dmdataitem id =  13007  -------- DeNghiCapGPVTVietTrungChoXeCongVu.xsd
//			PDF_MAPPING.put("GGT_VT_D", "BMDB60");// dmdataitem id =  13008 chưa có Biểu mẫu    -------- nếu có chắc dùng cái này DeNghiGioiThieuXinCapGPVTLoaiDVietNam.xsd
//			PDF_MAPPING.put("GPVT_VT_D", "BM_GPVT_D");// dmdataitem id =  13036   -------- DonXinCapGPVTLoaiDCuaPTTrungQuoc.xsd
//			
//			PDF_MAPPING.put("GPVT_VT_LANHAI", "BMDB1");// dmdataitem id =  13009???? không thấy biểu mẫu  -------- nếu có thì giống DeNghiCapGiayPhepVanTaiDuongBoVietTrung.xsd
//			PDF_MAPPING.put("GPVT_VT_AE_HETHAN", "BMDB84");// dmdataitem id =  13010   --------
//			PDF_MAPPING.put("GPVT_VT_GIAHAN", "BMDB73");// dmdataitem id =  13011 đơn gia hạn   -------- DeNghiGiaHanGiayPhepVanTaiChoPTTrungQuoc.xsd
//			PDF_MAPPING.put("GPDB_VL_MATMAT", "BMDB79");// dmdataitem id =  13012   -------- DeNghiCapGiayPhepVanTaiDuongBoVietLao.xsd
//			PDF_MAPPING.put("GPDB_VL_HUHONG", "BMDB80");// dmdataitem id =  13013   -------- DeNghiCapGiayPhepVanTaiDuongBoVietLao.xsd
//			PDF_MAPPING.put("GPDB_VC_MATMAT", "BMDB82");// dmdataitem id =  13018    -------- DeNghiCapGiayPhepVanTaiDuongBoVietCam.xsd
//			PDF_MAPPING.put("GPLV_VL_TM_HUHONG", "BMDB87");// dmdataitem id =  13015  -------- DonXinCapGPLVTMVietLao.xsd
//			
//			PDF_MAPPING.put("GPLV_VL_TM_MATMAT", "BMDB86");// dmdataitem id =  13014   -------- DonXinCapGPLVTMVietLao.xsd
//			PDF_MAPPING.put("GPLV_VL_PTM_MATMAT", "BMDB89");// dmdataitem id =  13016   -------- DonXinCapGPLienVanVietLao.xsd
//			PDF_MAPPING.put("GPDB_VC_HUHONG", "BMDB83");// dmdataitem id =  13019   -------- DeNghiCapGiayPhepVanTaiDuongBoVietCam.xsd
//			
//			PDF_MAPPING.put("GPLV_VC_TM_MATMAT", "BMDB92");// dmdataitem id =  13020   --------  DonXinCapGPLVTMVietCam.xsd
//			PDF_MAPPING.put("GPLV_VC_TM_HUHONG", "BMDB93");// dmdataitem id =  13021   --------  DonXinCapGPLVTMVietCam.xsd
//			PDF_MAPPING.put("GPLV_VC_PTM_MATMAT", "BMDB95");// dmdataitem id =  13022   -------- DonXinCapGPLienVanVietCam.xsd
//			PDF_MAPPING.put("GPLV_VC_PTM_HUHONG", "BMDB96");// dmdataitem id =  13023   -------- DonXinCapGPLienVanVietCam.xsd
//			
//			PDF_MAPPING.put("GPKDVT_DB_MOI", "BM_111");// dmdataitem id =  13024   -------- DeNghiCapGiayPhepKDVTBangXeOto.xsd (1)
//			PDF_MAPPING.put("GPKDVT_DB_THAYDOI", "BMDB89");// dmdataitem id =  13025 không thấy biểu mẫu   --------  nếu có thì giống (1)
//			PDF_MAPPING.put("GPKDVT_DB_HETHAN", "BMDB83");// dmdataitem id =  13026 không thấy biểu mẫu   -------- nếu có thì giống (1)
//			PDF_MAPPING.put("GPKDVT_DB_HUHONG", "BMDB86");// dmdataitem id =  13014 không thấy biểu mẫu   -------- nếu có thì giống (1)
//			
//			PDF_MAPPING.put("PH_NOIBO", "BM_120");// dmdataitem id =  13029  -------- PhuHieuXe6LoaiXe.xsd
//			PDF_MAPPING.put("GPVT_VT_A", "BM_150");
//			PDF_MAPPING.put("GPVT_VT_B", "BM_151");
//			PDF_MAPPING.put("GPVT_VT_C", "BM_152");
//			PDF_MAPPING.put("GPVT_VT_D", "BM_153");
//			PDF_MAPPING.put("GPVT_VT_E", "BM_154");
//			PDF_MAPPING.put("GPVT_VT_F", "BM_155");
//			PDF_MAPPING.put("GPVT_VT_G", "BM_156");
//			
//			PDF_MAPPING.put("NOIDIA", "BM_155");
//			PDF_MAPPING.put("BIENGIOI", "BM_151");
//			
//			PDF_MAPPING.put("GPLV_VC", "BMDB39");
//			PDF_MAPPING.put("CT_KTT", "BM21");
//			
//			
//			
//			//bhph
//			PDF_MAPPING.put("BM_136", "BM_136");
//			PDF_MAPPING.put("BM_137", "BM_137");
//			PDF_MAPPING.put("BM_138", "BM_138");
//			PDF_MAPPING.put("BM_140", "BM_140");
//			PDF_MAPPING.put("BM_141", "BM_141");
//			PDF_MAPPING.put("BM_142", "BM_142");
//			PDF_MAPPING.put("BM_143", "BM_143");
//			PDF_MAPPING.put("BM_144", "BM_144");
//			PDF_MAPPING.put("BM_145", "BM_145");
//			PDF_MAPPING.put("BM_146", "BM_146");
//			PDF_MAPPING.put("GPDB_VC", "BMDB1");
			 
			 
	    }
	    public static final Map<String, String> PDF_MAPPING_XSD = new HashMap<String, String>();
	    static {
//	    	PDF_MAPPING_XSD.put("BM08", "GiayPhepLienVanVietLao");//DeNghiGiaHanGiayPhepLienVanVietLao
//	    	PDF_MAPPING_XSD.put("BMDB14", "DeNghiGiaHanGiayPhepLienVanVietLao");//DeNghiGiaHanGiayPhepLienVanVietLao
//	    	PDF_MAPPING_XSD.put("BMDB86", "DonXinCapGPLVTMVietLao");//GiayPhepLienVanVietLao
//	    	PDF_MAPPING_XSD.put("BMDB51", "DeNghiCapGiayPhepVanTaiDuongBoVietTrung");
//	    	PDF_MAPPING_XSD.put("BMDB87", "DonXinCapGPLVTMVietLao");
//	        PDF_MAPPING_XSD.put("BMDB89", "DonXinCapGPLienVanVietLao");
//	        PDF_MAPPING_XSD.put("BM_150", "CapGiayPhepVanTaiVietTrung");
//	        PDF_MAPPING_XSD.put("BM_151", "CapGiayPhepVanTaiVietTrung");
//	        PDF_MAPPING_XSD.put("BM_152", "CapGiayPhepVanTaiVietTrung");
//	        PDF_MAPPING_XSD.put("BM_153", "CapGiayPhepVanTaiVietTrung");
//	        PDF_MAPPING_XSD.put("BM_154", "CapGiayPhepVanTaiVietTrung");
//	        PDF_MAPPING_XSD.put("BM_155", "CapGiayPhepVanTaiVietTrung");
//	        PDF_MAPPING_XSD.put("BM_156", "CapGiayPhepVanTaiVietTrung");
//	        PDF_MAPPING_XSD.put("BM_111", "DeNghiCapGiayPhepKDVTBangXeOto");
//	        
//	        PDF_MAPPING_XSD.put("BMDB39", "GiayPhepLienVanVietCamPhiThuongMai");
//	        PDF_MAPPING_XSD.put("BMDB92", "DonXinCapGPLVTMVietCam");
//	        PDF_MAPPING_XSD.put("BMDB93", "DonXinCapGPLVTMVietCam");
//	        PDF_MAPPING_XSD.put("BMDB95", "DonXinCapGPLienVanVietCam");
//	        PDF_MAPPING_XSD.put("BMDB96", "DonXinCapGPLienVanVietCam");
//	        PDF_MAPPING_XSD.put("BMDB41", "DeNghiGiaHanGiayPhepLienVanVietCam");
//	        PDF_MAPPING_XSD.put("BMDB73", "DeNghiGiaHanGiayPhepVanTaiChoPTTrungQuoc");
//	        //bhph
//	        PDF_MAPPING_XSD.put("BM_136", "PhuHieuXe6LoaiXe");
//	        PDF_MAPPING_XSD.put("BM_137", "PhuHieuLienVanVietLaos");
//	        PDF_MAPPING_XSD.put("BM_138", "PhuHieuXe6LoaiXe");
//	        PDF_MAPPING_XSD.put("BM_140", "PhuHieuXe6LoaiXe");
//	        PDF_MAPPING_XSD.put("BM_141", "PhuHieuXe6LoaiXe");
//			PDF_MAPPING_XSD.put("BM_142", "PhuHieuXe6LoaiXe");
//			PDF_MAPPING_XSD.put("BM_143", "PhuHieuXe6LoaiXe");
//			PDF_MAPPING_XSD.put("BM_144", "PhuHieuXe6LoaiXe");
//			PDF_MAPPING_XSD.put("BM_145", "PhuHieuXe6LoaiXe");
//			PDF_MAPPING_XSD.put("BM_146", "PhuHieuXe6LoaiXe");
//			PDF_MAPPING_XSD.put("BM_147", "CongVanYCBSHoSoDeNghiCapPHBH");
//			PDF_MAPPING_XSD.put("BM_148", "CongVanTuChoiCapPHBH");
//			PDF_MAPPING_XSD.put("BMDB1", "DeNghiCapGiayPhepVanTaiDuongBoVietLao");
//			PDF_MAPPING_XSD.put("BMDB79", "DeNghiCapGiayPhepVanTaiDuongBoVietLao");
//			PDF_MAPPING_XSD.put("BMDB80", "DeNghiCapGiayPhepVanTaiDuongBoVietLao");
//			PDF_MAPPING_XSD.put("BMDB82", "DeNghiCapGiayPhepVanTaiDuongBoVietCam");
//			PDF_MAPPING_XSD.put("BMDB83", "DeNghiCapGiayPhepVanTaiDuongBoVietCam");
//			PDF_MAPPING_XSD.put("BM21", "ChapThuanKhaiThacTuyenVTHKCDBangOtoVietCam");cvxxxxxxxxxxxxxxxxv     cccccv
			PDF_MAPPING_XSD.put("BMDB4", "GiayPhepVanTaiDuongBoQuocTeVietLao");
			PDF_MAPPING_XSD.put("BMDB9", "GiayPhepLienVanVietLao");
			PDF_MAPPING_XSD.put("BMDB33", "GiayPhepVanTaiDuongBoQuocTeVietLao");
			PDF_MAPPING_XSD.put("BM_137", "PhuHieuXe6LoaiXe");
			PDF_MAPPING_XSD.put("BMDB39", "GiayPhepLienVanVietCamThuongMai");
			PDF_MAPPING_XSD.put("BM_135", "GiayPhepKinhDoanhVanTaiBangOto");
			PDF_MAPPING_XSD.put("BMDB50", " ");
			PDF_MAPPING_XSD.put("BM_147", "CongVanYCBSHoSoDeNghiCapPHBH");
			PDF_MAPPING_XSD.put("BM_138", "PhuHieuXe6LoaiXe");
			PDF_MAPPING_XSD.put("BM_148", "CongVanTuChoiCapPHBH");
			PDF_MAPPING_XSD.put("BMDB45", " ");
			PDF_MAPPING_XSD.put("BMDB48", " ");
			PDF_MAPPING_XSD.put("BM_136", "PhuHieuXe6LoaiXe");
			PDF_MAPPING_XSD.put("BMDB76", "GiayDangKyKhaiThacTuyenVietTrung");
		}
			
}
