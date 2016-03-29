
package vn.dtt.duongbo.business;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.util.Validator;

import vn.dtt.duongbo.dao.common.model.DmDataItem;
import vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil;

public class DanhMucConstants {
	
	public static final String DM_TUYEN_HOAT_DONG_CO_DINH = "DM_LHHD_HKTCD";
	public static final String DM_LOAI_HINH_HOAT_DONG = "DM_LHHD";
	
	/**28 DM_LOAIHINHKINHDOANH Danh mục loại hình kinh doanh*/
	public static final String DM_LOAI_HINH_KINH_DOANH = "DM_LOAIHINHKINHDOANH";
	public static final String KINH_DOANH_TUYEN_CO_DINH = "KINH_DOANH_CODE_1";
	public static final String KINH_DOANH_XE_DU_LICH = "KINH_DOANH_CODE_2";
	public static final String KINH_DOANH_XE_TAXI = "KINH_DOANH_CODE_3";
	public static final String KINH_DOANH_HANG_HOA = "KINH_DOANH_CODE_4";
	
	
	public static final String DON_VI_HANH_CHINH = "DM_DVHC";
	public static final String DM_HINH_THUC_HOAT_DONG = "DM_HTHD";
	public static final String DM_NHAN_HIEU_PHUONG_TIEN = "DM_NHANHIEU";
	public static final String DM_SONGAYGIAHAN = "DM_SONGAYGIAHAN";
	public static final String DM_LOAI_XE = "DM_LoaiXe";
	
	public static final String DM_CO_QUAN_CAP_PHEP = "DM_CQCP";
	public static final String DM_QUOC_GIA = "DM_QUOCGIA";
	public static final String DM_MUC_DICH_CHUYEN_DI = "DM_MDCD";
	public static final String DM_TUYEN_VIET_LAO = "DM_TUYENVNL";
	public static final String DM_TUYEN_VIET_CAM = "DM_TUYENVNC";
	
	public static final String DM_LOAIGIAYPHEP_VT = "DM_LOAIGIAYPHEP_VT";
	
	public static final String DM_CUAKHAU_VNLAO = "DM_CUAKHAUVNL";
	public static final String DM_CUAKHAU_VNTQ = "DM_CUAKHAUVNTQ";
	public static final String DM_CUAKHAU_VNCAM = "DM_CUAKHAUVNC";
	
	public static final String DM_TUYENHD_VNTQ = "DM_TUYENVNTQ";
	public static final String DM_TUYENHD_VN = "DM_TUYENVN";
	public static final String DM_DIEMDO_VNTQ = "DM_DIEMDUNGDO";
	public static final String DM_HIEU_XE = "DM_HIEUXE";
	
	public static final String DM_BEN_XE_VN = "DM_BENXEVN";
	public static final String DM_BEN_XE_TQ = "DM_BENXETQ";
	public static final String DM_BEN_XE_LAO = "DM_BENXE_LAO";//108 DM_BENXE_LAO Danh mục Bến xe Lào
	public static final String DM_BEN_XE_CPC = "DM_BENXE_CPC";//107 DM_BENXE_CPC Danh mục Bến xe Campuchia
	
	
	public static final String DM_LOAI_TUYEN_VN_TRUNGQUOC = "DM_LOAI_TUYEN_VN_TRUNGQUOC";
	
	public static final String DM_TINH_TP_LAO = "DM_TINHTPLAO";
//	public static final String DM_BEN_XE_CAM = "DM_BXC";
	public static final String DM_TINH_TP_CAM = "DM_TINHTPCPC";
//	public static final String DM_TINHTHANH = "DMTINHTHANH";
	public static final String DM_DON_VI_HANH_CHINH = "DM_DVHC";
	
	public static final String DM_CQCP = "DM_CQCP_NHAPKHAU";
	
	
	/**104 DM_MAUSON_PHUONGTIEN Danh mục Màu sơn phương tiện vận tải Ô tô*/
	public static final String DM_MAU_SON_PHUONG_TIEN = "DM_MAUSON_PHUONGTIEN";
	
	
	/**105 DM_PHAMVIHOATDONG Danh mục Phạm vi hoạt động*/
	public static final String DM_PHAM_VI_HOAT_DONG = "DM_PHAMVIHOATDONG";
	
	public static String DM_CODE_LOAI_HINH_DE_NGHI_CAP_MOI = "DM_LHDNC_M";
	public static String DM_CODE_LOAI_HINH_DE_NGHI_CAP_LAI = "DM_LHDNC_L";
	
	
	public static final String DM_LY_DO_CAP_LAI = "DM_LDCL";
	public static final String DM_CODE_LY_DO_CAP_LAI_HET_HAN = "DM_LDCL_HH";
	public static final String DM_CODE_LY_DO_CAP_LAI_MAT_MAT = "DM_LDCL_MM";
	public static final String DM_CODE_LY_DO_CAP_LAI_HONG = "DM_LDCL_H";
	
	
	
	public static final String DM_TINH_THANHPHO_TQ = "DM_TINHTPTQ";
	
	public static List<DmDataItem> getLyDoCapLai() {
		List<DmDataItem> lstLyDoCapLai = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_LY_DO_CAP_LAI);
		if (lstLyDoCapLai == null) {
			lstLyDoCapLai = new ArrayList<DmDataItem>();
		}
		return lstLyDoCapLai;
	}
	
	public static List<DmDataItem> getPhamViHoatDong() {
		List<DmDataItem> lst = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_PHAM_VI_HOAT_DONG);
		if (lst == null) {
			lst = new ArrayList<DmDataItem>();
		}
		return lst;
	}
	
	public static List<DmDataItem> getMauSonPhuongTien() {
		List<DmDataItem> lst = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_MAU_SON_PHUONG_TIEN);
		if (lst == null) {
			lst = new ArrayList<DmDataItem>();
		}
		return lst;
	}
	
	public static List<DmDataItem> getLoaiXe() {
		List<DmDataItem> lst = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_LOAI_XE);
		if (lst == null) {
			lst = new ArrayList<DmDataItem>();
		}
		return lst;
	}
	
	public static List<DmDataItem> getQuocGia() {
		List<DmDataItem> lst = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_QUOC_GIA);
		if (lst == null) {
			lst = new ArrayList<DmDataItem>();
		}
		return lst;
	}
	
	public static List<DmDataItem> getCuaKhauVNTQ() {
		List<DmDataItem> lst = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_CUAKHAU_VNTQ);
		if (lst == null) {
			lst = new ArrayList<DmDataItem>();
		}
		return lst;
	}
	
	public static List<DmDataItem> getNhanHieuPhuongTien() {
		List<DmDataItem> lstNhanHieu = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_NHAN_HIEU_PHUONG_TIEN);
		if (lstNhanHieu == null) {
			lstNhanHieu = new ArrayList<DmDataItem>();
		}
		return lstNhanHieu;
	}
	
	public static List<DmDataItem> getTuyenHoatDongVnTQ() {
		List<DmDataItem> lstTuyenHoatDong = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_TUYENHD_VNTQ);
		if (lstTuyenHoatDong == null) {
			lstTuyenHoatDong = new ArrayList<DmDataItem>();
		}
		return lstTuyenHoatDong;
	}
	
	
	public static List<DmDataItem> getTuyenVietNamTQ_CongVu() {
		List<DmDataItem> lstTuyenHoatDong = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_LOAI_TUYEN_VN_TRUNGQUOC);
		if (lstTuyenHoatDong == null) {
			lstTuyenHoatDong = new ArrayList<DmDataItem>();
		}
		return lstTuyenHoatDong;
	}
	
	public static List<DmDataItem> getTuyenHoatDongVN() {
		List<DmDataItem> lstTuyenHoatDong = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_TUYENHD_VN);
		if (lstTuyenHoatDong == null) {
			lstTuyenHoatDong = new ArrayList<DmDataItem>();
		}
		return lstTuyenHoatDong;
	}
	
	public static List<DmDataItem> getHinhThucHoatDong() {
		List<DmDataItem> lstHinhThucHoatDong = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_HINH_THUC_HOAT_DONG);
		if (lstHinhThucHoatDong == null) {
			lstHinhThucHoatDong = new ArrayList<DmDataItem>();
		}
		return lstHinhThucHoatDong;
	}
	
	public static List<DmDataItem> getTinhThanh() {
		List<DmDataItem> lstTinhThanh = DmDataItemLocalServiceUtil.findTinhThanh();
		if (lstTinhThanh == null) {
			lstTinhThanh = new ArrayList<DmDataItem>();
		}
		return lstTinhThanh;
	}
	
	public static List<DmDataItem> getTinhThanhVN() {
		List<DmDataItem> lstTinhThanh = DmDataItemLocalServiceUtil.findTinhThanh();
		if (lstTinhThanh == null) {
			lstTinhThanh = new ArrayList<DmDataItem>();
		}
		return lstTinhThanh;
	}
	
	public static List<DmDataItem> getTinhThanhTQ() {
		List<DmDataItem> lstTinhThanhTQ = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_TINH_THANHPHO_TQ);
		if (lstTinhThanhTQ == null) {
			lstTinhThanhTQ = new ArrayList<DmDataItem>();
		}
		return lstTinhThanhTQ;
	}
	
	public static List<DmDataItem> getCoQuanCapPhep(String idTTHC) {
		List<DmDataItem> lstCoQuanCapPhep = DmDataItemLocalServiceUtil.findByGroupCodeIdTTHC(DanhMucConstants.DM_CO_QUAN_CAP_PHEP, idTTHC);
		if (lstCoQuanCapPhep == null) {
			lstCoQuanCapPhep = new ArrayList<DmDataItem>();
		}
		return lstCoQuanCapPhep;
		
	}
	
	public static List<DmDataItem> getDiemDoVNTQ() {
		List<DmDataItem> dmDiemDung = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_DIEMDO_VNTQ);
		if (dmDiemDung == null) {
			dmDiemDung = new ArrayList<DmDataItem>();
		}
		return dmDiemDung;
	}
	
	public static List<DmDataItem> getBenXeTQ() {
		List<DmDataItem> lstBenXeTQ = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_BEN_XE_TQ);
		if (lstBenXeTQ == null) {
			lstBenXeTQ = new ArrayList<DmDataItem>();
		}
		return lstBenXeTQ;
	}
	
	public static List<DmDataItem> getSoNgayGiaHan() {
	List<DmDataItem> lstSoNgayGiaHan = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_SONGAYGIAHAN);
	if (lstSoNgayGiaHan == null) { lstSoNgayGiaHan = new ArrayList<DmDataItem>(); }
	return lstSoNgayGiaHan;
	}
	
	public static List<DmDataItem> getMucDichChuyenDi() {
		List<DmDataItem> lstMucDichChuyenDi = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_MUC_DICH_CHUYEN_DI);
		if (lstMucDichChuyenDi == null) { lstMucDichChuyenDi = new ArrayList<DmDataItem>(); }
		return lstMucDichChuyenDi;
	}
	
	public static List<DmDataItem> getBenXeVN() {
		List<DmDataItem> lstBxVN = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_BEN_XE_VN);
		if (lstBxVN == null) { lstBxVN = new ArrayList<DmDataItem>(); }
		return lstBxVN;
	}
	
	public static List<DmDataItem> getTinhTPLao() {
		List<DmDataItem> lstTinhTPLao = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_TINH_TP_LAO);
		if (lstTinhTPLao == null) { lstTinhTPLao = new ArrayList<DmDataItem>(); }
		return lstTinhTPLao;
	}
	
	public static List<DmDataItem> getBenXeLao() {
		List<DmDataItem> lstBxeLao = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_BEN_XE_LAO);
		if (lstBxeLao == null) { lstBxeLao = new ArrayList<DmDataItem>(); }
		return lstBxeLao;
	}
	
	public static List<DmDataItem> getBenXeCam() {
		List<DmDataItem> lstBxeCam = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_BEN_XE_CPC);
		if (lstBxeCam == null) { lstBxeCam = new ArrayList<DmDataItem>(); }
		return lstBxeCam;
	}
	
	public static List<DmDataItem> getTinhTPCam() {
		List<DmDataItem> lstTinhTPCam = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_TINH_TP_CAM);
		if (lstTinhTPCam == null) { lstTinhTPCam = new ArrayList<DmDataItem>(); }
		return lstTinhTPCam;
	}
	
	public static List<DmDataItem> getallLoaiHinhHoatDong() {
		List<DmDataItem> allLoaiHinhHoatDong = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_LOAI_HINH_HOAT_DONG);
		if (Validator.isNull(allLoaiHinhHoatDong)) { allLoaiHinhHoatDong = new ArrayList<DmDataItem>(); }
		return allLoaiHinhHoatDong;
	}
	
	public static List<DmDataItem> getallLoaiHinhDeNghiCap() {
		List<DmDataItem> allLoaiHinhDeNghiCap = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_CODE_LOAI_HINH_DE_NGHI_CAP_MOI);
		if (Validator.isNull(allLoaiHinhDeNghiCap)) { allLoaiHinhDeNghiCap = new ArrayList<DmDataItem>(); }
		return allLoaiHinhDeNghiCap;
	}
	
	public static List<DmDataItem> getallLyDoCapLai() {
		List<DmDataItem> allLyDoCapLai = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_LY_DO_CAP_LAI);
		if (Validator.isNull(allLyDoCapLai)) { allLyDoCapLai = new ArrayList<DmDataItem>(); }
		return allLyDoCapLai;
	}
	
	public static List<DmDataItem> getTuyenVietCam() {
		List<DmDataItem> lstTuyenVietCam = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_TUYEN_VIET_CAM);
		if (Validator.isNull(lstTuyenVietCam)) { lstTuyenVietCam = new ArrayList<DmDataItem>(); }
		return lstTuyenVietCam;
	}
	
	public static List<DmDataItem> getTuyenVietLao() {
		List<DmDataItem> lstTuyenVietLao = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_TUYEN_VIET_LAO);
		if (Validator.isNull(lstTuyenVietLao)) { lstTuyenVietLao = new ArrayList<DmDataItem>(); }
		return lstTuyenVietLao;
	}
	
	public static List<DmDataItem> getLoaiHinhKDVT() {
		List<DmDataItem> lstloaiHinhKDVT = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_LOAI_HINH_KINH_DOANH);
		if (lstloaiHinhKDVT == null) { lstloaiHinhKDVT = new ArrayList<DmDataItem>(); }
		return lstloaiHinhKDVT;
	}
	
	public static List<DmDataItem> getTuyenVietTrung() {
		List<DmDataItem> lstTuyenVietTrung = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_TUYENHD_VNTQ);
		if (lstTuyenVietTrung == null) { lstTuyenVietTrung = new ArrayList<DmDataItem>(); }
		return lstTuyenVietTrung;
	}
	
	public static List<DmDataItem> getCuaKhauVietLao() {
		List<DmDataItem> lstCuaKhauVietLao = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_CUAKHAU_VNLAO);
		if (lstCuaKhauVietLao == null) { lstCuaKhauVietLao = new ArrayList<DmDataItem>(); }
		return lstCuaKhauVietLao;
	}
	
	public static List<DmDataItem> getCuaKhauVietCam() {
		List<DmDataItem> lstCuaKhauVietLao = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_CUAKHAU_VNCAM);
		if (lstCuaKhauVietLao == null) { lstCuaKhauVietLao = new ArrayList<DmDataItem>(); }
		return lstCuaKhauVietLao;
	}
	
	public static List<DmDataItem> getTinhThanhPhoTQ() {
		List<DmDataItem> lst = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_TINH_THANHPHO_TQ);
		if (lst == null) { lst = new ArrayList<DmDataItem>(); }
		return lst;
	}
	
	public static List<DmDataItem> getTuyenCoDinh() {
		List<DmDataItem> lst = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_TUYENHD_VN);
		if (lst == null) { lst = new ArrayList<DmDataItem>(); }
		return lst;
	}
	
	public static List<DmDataItem> getLoaiHinhKinhDoanh() {
		List<DmDataItem> lst = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_LOAI_HINH_KINH_DOANH);
		if (lst == null) { lst = new ArrayList<DmDataItem>(); }
		return lst;
	}
	
	
	
}
