package vn.dtt.duongbo.portlet.canbo;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.servlet.http.HttpServletResponse;

import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyBienHieuPhuongTienLocalServiceUtil;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyPhuHieuPhuongTienLocalServiceUtil;
import vn.dtt.duongbo.dao.common.model.DmDataItem;
import vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpLienVan;
import vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe;
import vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv;
import vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoGiayPhepVanTai;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanLoaiHinhVanTai;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGpLienVanImpl;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGpkdvtDuongboQuocTeImpl;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoCapPhepGplvImpl;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoGiayPhepVanTaiImpl;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanLoaiHinhVanTaiLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanTuyenLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.model.MotCuaChuyenDichTrangThai;
import vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy;
import vn.dtt.duongbo.dao.motcua.service.MotCuaChuyenDichTrangThaiLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil;
import vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto;
import vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai;
import vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceUtil;
import vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTeLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil;
import vn.dtt.duongbo.portlet.BienHieuPortlet;
import vn.dtt.duongbo.portlet.KhaiThacTuyenPortlet;
import vn.dtt.duongbo.portlet.LienVanPortlet;
import vn.dtt.duongbo.portlet.NoiDiaPortlet;
import vn.dtt.duongbo.portlet.PhuHieuPortlet;
import vn.dtt.duongbo.portlet.QuocTePortlet;
import vn.dtt.duongbo.portlet.canbo.utils.CanBoBusinessUtils;
import vn.dtt.duongbo.portlet.canbo.utils.CanBoDTBusinessUtils;
import vn.dtt.duongbo.portlet.canbo.utils.TruongPhongBusinessUtils;
import vn.dtt.duongbo.portlet.canbo.utils.VanThuBusinessUtils;
import vn.dtt.duongbo.term.capbienhieuphuhieu.QLVTBienHieuTerm;
import vn.dtt.duongbo.term.capbienhieuphuhieu.QLVTPhuHieuTerm;
import vn.dtt.duongbo.term.lienvan.QlvtLienVanTerm;
import vn.dtt.duongbo.term.noidia.QLVTNoiDiaTerm;
import vn.dtt.duongbo.term.quocte.QLVTKhaiTacTuyen;
import vn.dtt.duongbo.term.quocte.QLVTQuocTeTerm;
import vn.dtt.duongbo.utils.CommonUtils;
import vn.dtt.duongbo.utils.config.DuongBoConfigurationManager;
import vn.dtt.duongbo.utils.document.DocumentUtils;
import vn.dtt.form.util.FormUtil;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class CanBoAction extends MVCPortlet {

	private Log log = LogFactoryUtil.getLog(CanBoAction.class);

	public void addItemAjaxCall(ActionRequest actionRequest,
			ActionResponse actionResponse) {
		String itemName = ParamUtil.getString(actionRequest, "itemName");
		log.info("Item Submitted: " + itemName);
		JSONObject jsonMessageObject = JSONFactoryUtil.createJSONObject();
		jsonMessageObject.put("status", Boolean.FALSE);
		HttpServletResponse httpResponse = PortalUtil
				.getHttpServletResponse(actionResponse);
		httpResponse.setContentType("text");

		try {
			String tenTaiLieu = "";
			String idFile = "";
			ServiceContext serviceContext = ServiceContextFactory
					.getInstance(actionRequest);
			JSONObject payloadJSON = JSONFactoryUtil.createJSONObject();
			payloadJSON.put("tenTaiLieu", tenTaiLieu);
			payloadJSON.put("idFile", idFile);
			httpResponse.getWriter().print(payloadJSON.toString());
			httpResponse.flushBuffer();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	
	
	
	
	

	public void addBienHieuAjaxCall(ActionRequest actionRequest,
			ActionResponse actionResponse) {
		log.info("-------------------addBienHieuAjaxCall--------------------------");
		try {
			//UPDATE
			
		
			QLVTBienHieuTerm term = new QLVTBienHieuTerm(actionRequest);
			QLVTXuLyBienHieu qlvtXuLyBienHieu = null;
			log.info("-------------------addBienHieuAjaxCall--------------------------term.getId()" + term.getId());
			//qlvtXuLyBienHieu = QLVTXuLyBienHieuLocalServiceUtil.fetchQLVTXuLyBienHieu(term.getThongTinXuLyId());
			//UPDATE
			//qlvtXuLyBienHieu.setLyDoCapLai(term.getLyDoCapLai());
			//qlvtXuLyBienHieu.setGpkdLuuHanhQuocTe(term.getGpkdLuuHanhQuocTe());
			//QLVTXuLyBienHieuLocalServiceUtil.updateQLVTXuLyBienHieu(qlvtXuLyBienHieu);
		
			QLVTXuLyBienHieuPhuongTien ettPhuongTien = QLVTXuLyBienHieuPhuongTienLocalServiceUtil.fetchQLVTXuLyBienHieuPhuongTien(Integer.valueOf(term.getId()));
			
			//UPDATE
			log.info("-------------------ettPhuongTien--------------------------"+term.getLyDoKhongDat());
			log.info("-------------------term.getLyDoKhongDat()--------------------------"+term.getLyDoKhongDat());
			log.info("-------------------term.getKetQuaXuLy()-------------------------"+term.getKetQuaXuLy());
			log.info("-------------------term.getThoiHanThue()-------------------------"+term.getThoiHanThue());
			ettPhuongTien.setHinhThucSoHuuXe(term.getHinhThucSoHuuXe());
			ettPhuongTien.setHopDongSauCung(term.getHopDongSauCung());
			ettPhuongTien.setKetQuaXuLy(String.valueOf(term.getKetQuaXuLy()));
			ettPhuongTien.setLinhVucKinhDoanhXeDuLich(term.getLinhVucKinhDoanh());
			ettPhuongTien.setLyDoKhongDat(term.getLyDoKhongDat());
			ettPhuongTien.setNamSx(term.getNamSx());
			ettPhuongTien.setMauSon(term.getMauSon());
			ettPhuongTien.setNhanHieu(term.getNhanHieu());
			ettPhuongTien.setNienHanSuDungGiayDangKiem(term.getNienHanSuDungGiayDangKiem());
			ettPhuongTien.setNienHanSuDungND86(term.getNienHanSuDungND86());
			ettPhuongTien.setSoChoNgoi(Integer.valueOf("0"+term.getTrongTai()));
			ettPhuongTien.setSoPhuHieuDuocCap(term.getSoPhuHieuDuocCap());
			ettPhuongTien.setThoiHanDuocCapPhep(term.getThoiHanDuocCapPhep());
			ettPhuongTien.setThoiHanThue(term.getThoiHanThue());
			ettPhuongTien.setDoanhNghiepSoHuuThue(term.getDoanhNghiepSoHuuThue());
			ettPhuongTien.setSoKhung(term.getSoKhung());
			ettPhuongTien.setTrongTai(Long.valueOf("0"+term.getTrongTai()));
			ettPhuongTien = QLVTXuLyBienHieuPhuongTienLocalServiceUtil.updateQLVTXuLyBienHieuPhuongTien(ettPhuongTien);
			
			customResponse(actionResponse, FormUtil.bodyTextBienHieu(ettPhuongTien.getCapBienHieuID()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

	public void addPhuHieuAjaxCall(ActionRequest actionRequest,
			ActionResponse actionResponse) {
		log.info("-------------------addPhuHieuAjaxCall--------------------------");
		try {
			QLVTPhuHieuTerm term = new QLVTPhuHieuTerm(actionRequest);
			QLVTXuLyPhuHieu qlvtXuLyPhuHieu = null;
			QLVTXuLyPhuHieuPhuongTien ettPhuongTien = QLVTXuLyPhuHieuPhuongTienLocalServiceUtil.fetchQLVTXuLyPhuHieuPhuongTien(Integer.valueOf(term.getId()));
			ettPhuongTien.setHinhThucSoHuuXe(term.getHinhThucSoHuuXe());
			ettPhuongTien.setHopDongSauCung(term.getHopDongSauCung());
			ettPhuongTien.setKetQuaXuLy(String.valueOf(term.getKetQuaXuLy()));
			ettPhuongTien.setLinhVucKinhDoanhXeDuLich(term.getLoaiPhuHieuXinCap());
			ettPhuongTien.setLyDoKhongDat(term.getLyDoKhongDat());
			ettPhuongTien.setNamSanXuat(term.getNamSanXuat());
			ettPhuongTien.setNhanHieu(term.getNhanHieu());
			ettPhuongTien.setNienHanSuDungGiayDangKiem(term.getNienHanSuDungGiayDangKiem());
			ettPhuongTien.setNienHanSuDungND86(term.getNienHanSuDungND86());
			ettPhuongTien.setSoChoNgoi(Integer.valueOf("0"+term.getTrongTai()));
			ettPhuongTien.setSoPhuHieuDuocCap(term.getSoPhuHieuDuocCap());
			ettPhuongTien.setThoiHanDuocCapPhep(term.getThoiHanDuocCapPhep());
			ettPhuongTien.setThoiHanThue(term.getThoiHanThue());
			ettPhuongTien.setDoanhNghiepSoHuuThue(term.getDoanhNghiepSoHuuThue());
			ettPhuongTien.setSoChoNgoi(Integer.valueOf("0"+term.getTrongTai()));
			ettPhuongTien.setLoaiTuyen(term.getMaTuyen());
			ettPhuongTien.setSoPhuHieuDuocCap(term.getSoPhuHieuDuocCap());
			ettPhuongTien.setLoaiPhuHieuXinCap(term.getLoaiPhuHieuXinCap());
			
			
			ettPhuongTien = QLVTXuLyPhuHieuPhuongTienLocalServiceUtil.updateQLVTXuLyPhuHieuPhuongTien(ettPhuongTien);
			
			customResponse(actionResponse, FormUtil.bodyTextPhuHieu(ettPhuongTien.getCapPhuHieuID()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

	// ------------------VAN THU -----------------------
	public void xacNhanKetQua(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
			canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Má»™t cá»­a xÃ¡c nháº­n cho GPVT Viá»‡t trung- GiangVuong
	public void xacNhanKetQuaGPVTVietTrung(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			VanThuBusinessUtils vanThuBusinessUtils = new VanThuBusinessUtils();
			vanThuBusinessUtils.motcuaXacNhanKetQuaGPVTVietTrung(actionRequest,
					httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void vanThuTiepNhanHoSo(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			VanThuBusinessUtils vanThuBusinessUtils = new VanThuBusinessUtils();
			vanThuBusinessUtils.vanThuTiepNhanHoSo(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void vanThuTraKetQua(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			VanThuBusinessUtils vanThuBusinessUtils = new VanThuBusinessUtils();
			vanThuBusinessUtils.vanThuTraKetQua(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// VÄƒn thÆ° tráº£ káº¿t quáº£ GPVT Viá»‡t Trung

	public void vanThuTraKetQuaBoSungGPVTVietTrung(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			VanThuBusinessUtils vanThuBusinessUtils = new VanThuBusinessUtils();
			vanThuBusinessUtils.vanThuTraKetQuaGPVTVietTrung(actionRequest,
					httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void vanThuTraKetQuaTuChoiGPVTVietTrung(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			// TODO
			long phieuXuLyId = ParamUtil.getLong(actionRequest,
					Constants.ID_PHIEU_XU_LY);
			QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil
					.fetchByphieuXuLyId(phieuXuLyId);
			int userId = (int) PortalUtil.getUserId(actionRequest);
			if (thongTinHoSo != null) {
				QlvtThongTinXuLy qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil
						.fetchBythongTinHoSoId(Integer.valueOf("0"
								+ thongTinHoSo.getId()));
				qlvtThongTinXuLy.setNguoiTraKetQua(userId);
				qlvtThongTinXuLy.setThoiGianTraKetQua(new Date());
				qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil
						.updateQlvtThongTinXuLy(qlvtThongTinXuLy);
			}
			CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
			canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest,
					httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void vanThuTraKetQuaBoSungVietLao(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			VanThuBusinessUtils vanThuBusinessUtils = new VanThuBusinessUtils();
			vanThuBusinessUtils.vanThuTraKetQuaBoSungVietLao(actionRequest,
					httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----START---------------CHUYEN VIEN (CAN BO)---------------

	public void traKetQua(ActionRequest actionRequest, ActionResponse httpReq)
			throws IOException {
		try {
			log.info("traKetQuatraKetQua");
			CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
			canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// CÃ¡n bá»™ tráº£ káº¿t quáº£ GPVT Viá»‡t Trung - GiangVuong
	public void canBoTraKetQuaGPVTVietTrung(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
			try {
				
				log.info("----------canBoTraKetQua  Gpvt VietTrung----------");
				//common
				long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
				long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
				long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
				long thuTucHanhChinhId = ParamUtil.getLong(actionRequest, Constants.ID_THU_TUC_HANH_CHINH);
				String maThuTucHanhChinh = ParamUtil.getString(actionRequest, Constants.MA_THU_TUC_HANH_CHINH);
				long userId = PortalUtil.getUserId(actionRequest);
				
				
				
				
				
				//business
				QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(phieuXuLyId);
				
				QlvtThongTinXuLy thongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(thongTinHoSo.getId());
				
				QlvtXuLyGpLienVan gpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+thongTinXuLy.getId()));
				
				List<QlvtXuLyGpLienVanLoaiHinhVanTai> findBygpLienVanId = QlvtXuLyGpLienVanLoaiHinhVanTaiLocalServiceUtil.findBygpLienVanId(gpLienVan.getId());
				List<QlvtXuLyGpLienVanPhuongTien> findBycapGplvId = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.findBycapGplvId(Integer.valueOf("0"+gpLienVan.getId()));
				
				HashMap<Long, List<QlvtXuLyGpLienVanPhuongTienTramDungNghi>> mapTramDungNghi = new HashMap<Long, List<QlvtXuLyGpLienVanPhuongTienTramDungNghi>>();
				
				List<QlvtXuLyGpLienVanPhuongTienTramDungNghi> findBycapGplxPhuongTienId = new ArrayList<QlvtXuLyGpLienVanPhuongTienTramDungNghi>();
				for (QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien : findBycapGplvId) {
					findBycapGplxPhuongTienId = QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil.findBycapGplxPhuongTienId(qlvtXuLyGpLienVanPhuongTien.getId());
					mapTramDungNghi.put(qlvtXuLyGpLienVanPhuongTien.getId(), findBycapGplxPhuongTienId);
				}
				
				
				//Access
				
				long idDuongboQuocTeImpl = CounterLocalServiceUtil.increment(QlvtCapPhepGpkdvtDuongboQuocTeImpl.class.getName());
				QlvtCapPhepGpkdvtDuongboQuocTe duongboQuocTeImpl = new QlvtCapPhepGpkdvtDuongboQuocTeImpl();
				duongboQuocTeImpl.setId(idDuongboQuocTeImpl);
//				duongboQuocTeImpl.setGpKinhDoanhVanTaiOtoId(gpKinhDoanhVanTaiOtoId);
//				duongboQuocTeImpl.setSoGpvtQuocTe(soGpvtQuocTe);
				duongboQuocTeImpl.setCoQuanCapLanDauId(thongTinHoSo.getCoQuanGiaiQuyet());
				duongboQuocTeImpl.setNgayCapGpvt(thongTinXuLy.getThoiGianCapPhep());
				duongboQuocTeImpl.setCoQuanCapGpvtId(thongTinHoSo.getCoQuanGiaiQuyet());
				duongboQuocTeImpl.setNgayGiaHan(thongTinHoSo.getNgayCapGPKDVTQuocTe());
				duongboQuocTeImpl.setNgayHetHan(thongTinHoSo.getNgayHetHanDkkd());
//				duongboQuocTeImpl.setLanGiaHan(lanGiaHan);
//				duongboQuocTeImpl.setFileId(fileId);
//				duongboQuocTeImpl.setTrangThai(trangThai);
				
				QlvtCapPhepGpLienVan qlvtCapPhepGpLienVanImpl = new QlvtCapPhepGpLienVanImpl();
				long idQlvtCapPhepGpLienVanImpl = CounterLocalServiceUtil.increment(QlvtCapPhepGpLienVanImpl.class.getName());
				qlvtCapPhepGpLienVanImpl.setId(idQlvtCapPhepGpLienVanImpl);
//				qlvtCapPhepGpLienVanImpl.setGpkdvtVietLaoId(gpkdvtVietLaoId);
				qlvtCapPhepGpLienVanImpl.setLoaiCapPhep(gpLienVan.getLoaiCapPhep());
				qlvtCapPhepGpLienVanImpl.setLoaiGiayPhepLienVan(gpLienVan.getLoaiGiayPhepLienVan());
				qlvtCapPhepGpLienVanImpl.setSoGiayPhepLienVan(gpLienVan.getSoGiayPhepLienVan());
//				qlvtCapPhepGpLienVanImpl.setNgayCapGplv(ngayCapGplv);
//				qlvtCapPhepGpLienVanImpl.setNgayHetHanGplv(ngayHetHanGplv);
//				qlvtCapPhepGpLienVanImpl.setCoQuanCpLienVan(coQuanCpLienVan);
//				qlvtCapPhepGpLienVanImpl.setSoCongVanChapThuanTCD(soCongVanChapThuanTCD);
//				qlvtCapPhepGpLienVanImpl.setNgayCongVanChapThuanTCD(ngayCongVanChapThuanTCD);
//				qlvtCapPhepGpLienVanImpl.setTuyenTu(tuyenTu);
//				qlvtCapPhepGpLienVanImpl.setTuyenDi(tuyenDi);
//				qlvtCapPhepGpLienVanImpl.setCuLy(cuLy);
//				qlvtCapPhepGpLienVanImpl.setMaBenDi(maBenDi);
//				qlvtCapPhepGpLienVanImpl.setMaBenDen(maBenDen);
//				qlvtCapPhepGpLienVanImpl.setMaTinhDi(maTinhDi);
//				qlvtCapPhepGpLienVanImpl.setMaTinhDen(maTinhDen);
//				qlvtCapPhepGpLienVanImpl.setHanhTrinh(hanhTrinh);
//				qlvtCapPhepGpLienVanImpl.setMucPhi(mucPhi);
//				qlvtCapPhepGpLienVanImpl.setMucDichChuyenDi(mucDichChuyenDi);
//				qlvtCapPhepGpLienVanImpl.setFileId(fileId);
//				qlvtCapPhepGpLienVanImpl.setTrangThai(trangThai);
				
				
				QlvtThongTinHoSoCapPhepGplv thongTinHoSoCapPhepGplvImpl = new QlvtThongTinHoSoCapPhepGplvImpl();
				thongTinHoSoCapPhepGplvImpl.setThongtinhosoId(thongTinHoSo.getId());
				thongTinHoSoCapPhepGplvImpl.setCapphepGplienvanId(idQlvtCapPhepGpLienVanImpl);
				
				QlvtThongTinHoSoGiayPhepVanTai thongTinHoSoGiayPhepVanTaiImpl = new QlvtThongTinHoSoGiayPhepVanTaiImpl();
				thongTinHoSoGiayPhepVanTaiImpl.setThongtinhosoId(thongTinHoSo.getId());
				thongTinHoSoGiayPhepVanTaiImpl.setCapphepGpkdvtId(idDuongboQuocTeImpl);
				
				
				
				//if successfull --> chuyen dich trang thai
				// business

				CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
				canBoBusinessUtils.canBoTraKetQuaGPVTVietTrung(actionRequest,
						httpReq);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

	public void chuyenXuLyChoCanBoKhac(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			log.info("---chuyenXuLyChoCanBoKhac");
			CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
			// update id nguoi xu ly
			long phieuXuLyId = ParamUtil.getLong(actionRequest,
					Constants.ID_PHIEU_XU_LY);
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil
					.getMotCuaPhieuXuLy(phieuXuLyId);
			long userId = ParamUtil.getLong(actionRequest, "empId");
			phieuXuLy.setNguoiXuLy(userId);
			MotCuaPhieuXuLyLocalServiceUtil.updateMotCuaPhieuXuLy(phieuXuLy);

			canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest,
					httpReq);
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e);
		}
	}

	// biá»ƒn hiá»‡u phÃ¹ hiá»‡u
	public void canBoDuyetThamXet(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
			// xu ly nghiep vu
			canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest,
					httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void giayPhep_vietLao_choThamXet(ActionRequest actionRequest,
		ActionResponse httpReq) throws IOException {
	try {
		log.info("**********giayPhep_vietLao_choThamXet******giayPhep_vietLao_choThamXet***");
		
		QuocTePortlet.quocTe_vietLao_choThamXet(actionRequest, httpReq);
		//qlvtThongTinHoSo.setDiaChiDn(term.g)
		//TODO
		QLVTQuocTeTerm termQuocTe = new QLVTQuocTeTerm(actionRequest);
		QLVTKhaiTacTuyen termKTTuyen = new QLVTKhaiTacTuyen(actionRequest);
		//QlvtThongTinHoSo qlvtThongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchQlvtThongTinHoSo(termQuocTe.getId());
		QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe = null;
		qlvtXuLyKTTQuocTe = QlvtXuLyKTTQuocTeLocalServiceUtil.fetchBythongTinXuLyId(termKTTuyen.getThongTinXuLyId());
		QlvtXuLyKTTQuocTeLocalServiceUtil.updateQlvtXuLyKTTQuocTe(qlvtXuLyKTTQuocTe);
		
		quocTe_ThongTinHoSo(actionRequest, httpReq, termQuocTe);
		
		qlvtXuLyKTTQuocTe.setBenDi(termKTTuyen.getBenDen());
		qlvtXuLyKTTQuocTe.setBenDen(termKTTuyen.getBenDen());
		qlvtXuLyKTTQuocTe.setDiemDen(termKTTuyen.getDiemDen());
		qlvtXuLyKTTQuocTe.setDiemDi(termKTTuyen.getDiemDi());
		qlvtXuLyKTTQuocTe.setHanhTrinhChay(termKTTuyen.getHanhTrinhChay());
		qlvtXuLyKTTQuocTe.setCuLyVanChuyen(termKTTuyen.getCuLyVanChuyen());
		qlvtXuLyKTTQuocTe.setCuaKhau(termKTTuyen.getCuaKhau());
		
		//TODO
	} catch (Exception e) {
		e.printStackTrace();
		log.error(e);
	}
}
	// giay phep van tai Viet--Lao
	public void canBoDuyetThamXetVietLao(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			log.info("**********canBoDuyetThamXetVietLao******canBoDuyetThamXetVietLao***");
			CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
			QLVTQuocTeTerm term = new QLVTQuocTeTerm(actionRequest);
			QlvtThongTinHoSo qlvtThongTinHoSo = QlvtThongTinHoSoLocalServiceUtil
					.fetchQlvtThongTinHoSo(term.getId());
			
			quocTe_ThongTinHoSo(actionRequest, httpReq, term);;
			qlvtThongTinHoSo.setLanCapGiayDangKyKinhDoanh(term
					.getLanCapGiayDangKyKinhDoanh());
			qlvtThongTinHoSo.setNgayCapDkkd(term.getNgayCapGiayPhepVanTai());
	
			//qlvtThongTinHoSo.setDiaChiDn(term.g)
			//TODO
			qlvtThongTinHoSo.setCoQuanCapDkkd(term.getCoQuanCapGiayPhepVanTaiId());
			//qlvtThongTinHoSo.setCoQuanGiaiQuyet(term.get)
			
			qlvtThongTinHoSo.setLanCapGPKDVTQuocTe(term.getLanCapGPKDVTQuocTe());
			qlvtThongTinHoSo.setLanCapGPKDVTNoiDia(term.getLanCapGPKDVTNoiDia());
			qlvtThongTinHoSo.setLanCapGiayDangKyKinhDoanh(term.getLanCapGiayDangKyKinhDoanh());
			qlvtThongTinHoSo.setLyDoCapLai(term.getLyDoKhongDat());
			qlvtThongTinHoSo.setNgayHetHanDkkd(term.getNgayHetHanGiayPhepVanTai());
			qlvtThongTinHoSo.setNgayCapGPKDVTNoiDia(term.getNgayCapGPKDVTNoiDia());
			qlvtThongTinHoSo.setNgayCapGPKDVTQuocTe(term.getNgayCapGPKDVTQuocTe());
			qlvtThongTinHoSo.setNgayGiaHanGiayDangKyKinhDoanh(term.getNgayGiaHanGiayDangKyKinhDoanh());
			qlvtThongTinHoSo.setNgayGiaHanGPKDVTNoiDia(term.getNgayGiaHanGPKDVTNoiDia());
			qlvtThongTinHoSo.setNgayGiaHanGPKDVTQuocTe(term.getNgayGiaHanGPKDVTQuocTe());
			
			
			QlvtThongTinHoSoLocalServiceUtil
					.updateQlvtThongTinHoSo(qlvtThongTinHoSo);
			canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest,
					httpReq);
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e);
		}
	}

	public void canBoLoaiHinhHoatDongVietLao(ActionRequest actionRequest,
			ActionResponse actionResponse) {
		try {
			// Xu ly nghiep vu
			log.info("---canBoLoaiHinhHoatDongVietLao----");
			QLVTQuocTeTerm term = new QLVTQuocTeTerm(actionRequest);
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai = QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiLocalServiceUtil
					.fetchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTai(term
							.getIdLoaiHinh());
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setKetQuaXuLy(term
					.getKetQuaXuLyLoaiHinh());
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setLyDoKhongDat(term
					.getLyDoKhongDat());
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setSoChuyen(term.getSoChuyen());
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setThietBiGiamSatHanhTrinh(term
					.getThietBiGiamSatHanhTrinh());
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setSoLuongPhuongTien(term
					.getSoLuongPhuongTien());
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai = QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiLocalServiceUtil
					.updateQlvtXuLyGpkdvtQuocTeLoaiHinhVanTai(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai);

			List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> listDel = QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenLocalServiceUtil
					.findBygpkdLoaiHinhKdId(Integer
							.valueOf(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getId()
									+ ""));
			for (QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen : listDel) {
				QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenLocalServiceUtil
						.deleteQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen);
			}
			long id = -1;
			String[] maTuyens = term.getMaTuyens();
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen = null;
			for (String string : maTuyens) {
				id = CounterLocalServiceUtil
						.increment(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.class
								.getName());
				qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen = QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenLocalServiceUtil
						.createQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen(id);
				qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen
						.setGpkdLoaiHinhKdId(Integer
								.valueOf(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai
										.getId() + ""));
				qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.setMaTuyen(string);
				qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen
						.setTenTuyen(DmDataItemLocalServiceUtil
								.findByGroupIdAndCode(
										Constants.GROUP_ID_DM_TUYEN_VIET_LAO,
										string).getName());
				qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen = QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenLocalServiceUtil
						.updateQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen);
			}

			// respone
			customResponse(actionResponse, FormUtil.bodyTextQuocTe(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getThongTinCapGpkdVanTaiId()));
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}
//===================luu thong tin loai hinh hoat dong thu tuc cap giay phep kinh doanh OTO=====================
	public void canBoLoaiHinhHoatDongOto(ActionRequest actionRequest,
			ActionResponse actionResponse) {
			long idReturn = processLoaiHinhHoatDongOtoInsert(actionRequest, actionResponse);
			// respone
			customResponse(actionResponse,FormUtil.bodyTextNoiDia(idReturn));
	}
	private long processLoaiHinhHoatDongOtoInsert(ActionRequest actionRequest,ActionResponse httpReq) {
		
		log.info("-----------------------processKTTQuocTeInsert---------------------");
		// TODO Auto-generated method stub
		long idReturn = 0;
		try {

			QLVTNoiDiaTerm term = new QLVTNoiDiaTerm(actionRequest);
			QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtbangotoLoaiHinhVanTai = QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceUtil.fetchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(term.getIdLoaiHinhVt());
			
			qlvtXuLyGpkdvtbangotoLoaiHinhVanTai.setKetQuaXuLy(term.getKetQuaXuLyLoaiHinh());
			qlvtXuLyGpkdvtbangotoLoaiHinhVanTai.setMauSon(term.getMauSon());
			qlvtXuLyGpkdvtbangotoLoaiHinhVanTai.setPhamViHoatDong(term.getPhamViHoatDong());
			qlvtXuLyGpkdvtbangotoLoaiHinhVanTai.setSoLuongPhuongTien(term.getSoLuongPhuongTien());
			qlvtXuLyGpkdvtbangotoLoaiHinhVanTai.setThietBiGiamSatHanhTrinh(term.getThietBiGiamSatHanhTrinh());
			qlvtXuLyGpkdvtbangotoLoaiHinhVanTai.setTuyenDen(term.getMaTuyen());
			qlvtXuLyGpkdvtbangotoLoaiHinhVanTai.setTuyenDen(term.getMaTuyens());
			
			//TODO them thong tin can thiet vao day!!!
			qlvtXuLyGpkdvtbangotoLoaiHinhVanTai = QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceUtil.updateQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(qlvtXuLyGpkdvtbangotoLoaiHinhVanTai);
			idReturn = qlvtXuLyGpkdvtbangotoLoaiHinhVanTai.getGpkdvtBangOtoId();
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
		}
		return idReturn;
	}
	

	// -------------------------giay phep viet trung------dung cho dang tham xet-------------------
	
	
	public void canBoDuyetThamXetVietTrung(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		// luu thong tin xu ly

		QlvtLienVanTerm term = new QlvtLienVanTerm(actionRequest);
		long phieuXuLyId = ParamUtil.getLong(actionRequest,
				Constants.ID_PHIEU_XU_LY);

		log.info("-canBoDuyetThamXetVietTrung------dung cho cho` tham xet!!!--");
		try {
			lienVan_ThongTinHoSo(actionRequest, httpReq, term);
			QlvtXuLyGpLienVan qlvtGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+term.getThongTinXuLyId()));
			
			qlvtGpLienVan.setNgayHetHanGiayPhepLienVan(term.getNgayHetHanGiayPhepLienVan());
			qlvtGpLienVan.setLoaiGiayPhepLienVan(term.getLoaiGiayPhepLienVan());
			qlvtGpLienVan.setMucDichChuyenDi(term.getMucDichChuyenDi());
			
			qlvtGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtGpLienVan);
			
			CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
			// xá»­ lÃ½ nghiá»‡p vá»¥ OK --> chuyá»ƒn dá»‹ch tráº¡ng thÃ¡i
			canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest,
					httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void canBoPhuongTienCapGpvtVietTrung(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			log.info("---canBoPhuongTienCapGpvtVietTrung----");
			long idReturn = processGPlienVanInsert(actionRequest, httpReq);
			customResponse(httpReq,FormUtil.bodyTextLienVan(idReturn));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void canBoPhuongTienCapGpKTTQuocTe(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			log.info("---canBoPhuongTienCapGpKTTQuocTe----");
			long idReturn = processKTTQuocTeInsert(actionRequest, httpReq);
			customResponse(httpReq,FormUtil.bodyTextQuocTe(idReturn));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	


	// -------------------------giay phep oto-------------------------
		public void canBoDuyetThamXetoto(ActionRequest actionRequest,
				ActionResponse httpReq) throws IOException {
			// luu thong tin xu ly

			QLVTNoiDiaTerm term = new QLVTNoiDiaTerm(actionRequest);
			long phieuXuLyId = ParamUtil.getLong(actionRequest,
					Constants.ID_PHIEU_XU_LY);

			try {
				QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil
						.fetchByphieuXuLyId(phieuXuLyId);
				//1
				thongTinHoSo.setSoGiayPhepKinhDoanhVanTaiNoiDia(term.getSoGpkdVanTaiBangOto());
				thongTinHoSo.setNgayCapGPKDVTNoiDia(term.getNgayCapGpkdVanTaiBangOto());
				thongTinHoSo.setCoQuanCapDkkd(term.getCoQuanCapGpkdVanTaiBangOto());
				thongTinHoSo.setNgayHetHanGPKDVTNoiDia(term
						.getNgayHetHanGpkdVanTaiBangOto());
				thongTinHoSo.setLanCapGPKDVTNoiDia(term.getLanCapGPKDVTNoiDia());
				thongTinHoSo.setLanCapGiayDangKyKinhDoanh(term.getLanCapGiayDangKyKinhDoanh());
				thongTinHoSo.setNguoiLienHeTraKetQua(term.getNguoiLienHeTraKetQua());
				thongTinHoSo.setSoDienThoaiNguoiLienHe(term.getSoDienThoaiNguoiLienHe());
				//end, thieu se bo sung sau
				// TODO
				QlvtThongTinHoSoLocalServiceUtil
						.updateQlvtThongTinHoSo(thongTinHoSo);
				QlvtThongTinXuLy qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(thongTinHoSo.getId());
				QlvtXuLyGpkdvtBangOto qlvtoBangOto = QlvtXuLyGpkdvtBangOtoLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+qlvtThongTinXuLy.getId()));
				qlvtoBangOto.setKetQuaXuLy(term.getKetQuaXuLy());
				qlvtoBangOto.setLyDoKhongDat(term.getLyDoKhongDat());
				QlvtXuLyGpkdvtBangOtoLocalServiceUtil.updateQlvtXuLyGpkdvtBangOto(qlvtoBangOto);
				CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
				// xá»­ lÃ½ nghiá»‡p vá»¥ OK --> chuyá»ƒn dá»‹ch tráº¡ng thÃ¡i
				canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest,
						httpReq);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	

	public void guiTruongPhongDuyet(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
			canBoBusinessUtils.guiTruongPhongDuyet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// CÃ¡i nÃ y gá»­i trÆ°á»Ÿng phÃ²ng duyá»‡t cho GPTVT Viá»‡t Trung - GiangVuong
	public void guiTruongPhongDuyetGPVTVietTrung(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
			// TODO
			long phieuXuLyId = ParamUtil.getLong(actionRequest,
					Constants.ID_PHIEU_XU_LY);
			QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil
					.fetchByphieuXuLyId(phieuXuLyId);
			String keyKetQuaThamTra = ParamUtil.getString(actionRequest,
					"keyKetQuaThamTra");
			int userId = (int) PortalUtil.getUserId(actionRequest);
			if (thongTinHoSo != null) {
				QlvtThongTinXuLy qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil
						.fetchBythongTinHoSoId(Integer.valueOf("0"
								+ thongTinHoSo.getId()));
				qlvtThongTinXuLy.setKetQuaXuLy(keyKetQuaThamTra);
				qlvtThongTinXuLy.setCanBoXuLy(userId);
				qlvtThongTinXuLy.setThoiGianXuLy(new Date());
				qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil
						.updateQlvtThongTinXuLy(qlvtThongTinXuLy);
			}
			canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest,
					httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// --------------VIET LAO --------------
	public void guiTruongPhongDuyetVietLao(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
			// TODO
			long phieuXuLyId = ParamUtil.getLong(actionRequest,
					Constants.ID_PHIEU_XU_LY);
			QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil
					.fetchByphieuXuLyId(phieuXuLyId);
			String keyKetQuaThamTra = ParamUtil.getString(actionRequest,
					"keyKetQuaThamTra");
			int userId = (int) PortalUtil.getUserId(actionRequest);
			if (thongTinHoSo != null) {
				QlvtThongTinXuLy qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil
						.fetchBythongTinHoSoId(Integer.valueOf("0"
								+ thongTinHoSo.getId()));
				qlvtThongTinXuLy.setKetQuaXuLy(keyKetQuaThamTra);
				qlvtThongTinXuLy.setCanBoXuLy(userId);
				qlvtThongTinXuLy.setThoiGianXuLy(new Date());
				qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil
						.updateQlvtThongTinXuLy(qlvtThongTinXuLy);
			}
			canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest,
					httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void luuKetQuaThamXet(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
			canBoBusinessUtils.luuKetQuaThamXet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// CÃ¡i nÃ y lÆ°u káº¿t quáº£ tháº©m xÃ©t cho GPVT Viá»‡t Trung - GiangVuong

	public void luuKetQuaThamXetGPVTVietTrung(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
			canBoBusinessUtils.luuKetQuaThamXetGPVTVietTrung(actionRequest,
					httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void luuKetQuaThamXetVietLao(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
			canBoBusinessUtils.luuKetQuaThamXetVietLao(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// -----END---------------CHUYEN VIEN (CAN BO)---------------

	// -----START---------------LANH DAO CUC (TRUONG PHONG)-------------------
	public void duyetCapPhep(ActionRequest actionRequest, ActionResponse httpReq)
			throws IOException {
		try {
			TruongPhongBusinessUtils truongPhongBusinessUtils = new TruongPhongBusinessUtils();
			truongPhongBusinessUtils.duyetCapPhep(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// CÃ¡i nÃ y duyá»‡t cáº¥p phÃ©p cho GPVT Viá»‡t Trung - GiangVuong
	public void duyetCapPhepGPVTVietTrung(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			TruongPhongBusinessUtils truongPhongBusinessUtils = new TruongPhongBusinessUtils();
			truongPhongBusinessUtils.duyetCapPhepGPVTVietTrung(actionRequest,
					httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void duyetCapPhepVietLao(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			TruongPhongBusinessUtils truongPhongBusinessUtils = new TruongPhongBusinessUtils();
			truongPhongBusinessUtils
					.duyetCapPhepVietLao(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void duyetBoSung(ActionRequest actionRequest, ActionResponse httpReq)
			throws IOException {
		try {
			TruongPhongBusinessUtils truongPhongBusinessUtils = new TruongPhongBusinessUtils();
			truongPhongBusinessUtils.duyetBoSung(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// CÃ¡i nÃ y duyá»‡t bá»• sung cho GPVT Viá»‡t Trung - GiangVuong
	public void truongPhongDuyetCongVanVietTrung(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			log.info("truongPhongDuyetCongVanVietTrung");
			String keyDichChuyen = ParamUtil.getString(actionRequest, "keyDichChuyen");
			log.info("truongPhongDuyetCongVanVietTrung"+keyDichChuyen);
			TruongPhongBusinessUtils truongPhongBusinessUtils = new TruongPhongBusinessUtils();
			// TODO
			long phieuXuLyId = ParamUtil.getLong(actionRequest,
					Constants.ID_PHIEU_XU_LY);
			QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil
					.fetchByphieuXuLyId(phieuXuLyId);
			int userId = (int) PortalUtil.getUserId(actionRequest);
			if (thongTinHoSo != null) {
				QlvtThongTinXuLy qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil
						.fetchBythongTinHoSoId(Integer.valueOf("0"
								+ thongTinHoSo.getId()));
				qlvtThongTinXuLy.setLanhDaoDuyet(userId);
				qlvtThongTinXuLy.setThoiGianDuyet(new Date());
				qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil
						.updateQlvtThongTinXuLy(qlvtThongTinXuLy);
			}
			CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
			canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest,
					httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void duyetBoSungVietLao(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			TruongPhongBusinessUtils truongPhongBusinessUtils = new TruongPhongBusinessUtils();
			truongPhongBusinessUtils.duyetBoSungVietLao(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void duyetTuChoi(ActionRequest actionRequest, ActionResponse httpReq)
			throws IOException {
		try {
			TruongPhongBusinessUtils truongPhongBusinessUtils = new TruongPhongBusinessUtils();
			truongPhongBusinessUtils.duyetTuChoi(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// CÃ¡i nÃ y lÃ  Duyá»‡t tá»« chá»‘i cho GPVT Viá»‡t Trung
	public void duyetTuChoiGPVTVietTrung(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			TruongPhongBusinessUtils truongPhongBusinessUtils = new TruongPhongBusinessUtils();
			truongPhongBusinessUtils.duyetTuChoiGPVTVietTrung(actionRequest,
					httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void duyetTuChoiVietLao(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			TruongPhongBusinessUtils truongPhongBusinessUtils = new TruongPhongBusinessUtils();
			truongPhongBusinessUtils.duyetTuChoiVietLao(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void yeuCauThamXetLai(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			TruongPhongBusinessUtils truongPhongBusinessUtils = new TruongPhongBusinessUtils();
			truongPhongBusinessUtils.yeuCauThamXetLai(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// cÃ¡i nÃ y yÃªu cáº§m tháº©m xÃ©t láº¡i cho GPVT Viá»‡t trung
	public void ThamXetLaiGPVTVietTrung(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			TruongPhongBusinessUtils truongPhongBusinessUtils = new TruongPhongBusinessUtils();
			truongPhongBusinessUtils.yeuCauThamXetLaiGPVTVietTrung(
					actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void yeuCauThamXetLaiVietLao(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			TruongPhongBusinessUtils truongPhongBusinessUtils = new TruongPhongBusinessUtils();
			truongPhongBusinessUtils.yeuCauThamXetLaiVietLao(actionRequest,
					httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void xemTruocNoiDungThamXetVietTrung(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
			canBoBusinessUtils.xemTruocNoiDungThamXetVietTrung(actionRequest,
					httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Luu y kien 19DVC action - Luong chinh
	 * 
	 * @param actionRequest
	 * @param httpReq
	 * @throws IOException
	 */
	public void luuYKien19DvcAction(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			// TODO:
			// Check thong bao xu ly co null hay khong
			// Neu Co gia tri thi tao noi dung ho so theo thanh phan ho so
			// Kiem tra noi dung ho so co phi hay khong. Neu co phi thi tao xac
			// nhan thanh toan

			CanBoDTBusinessUtils.canBoDuyetThamXet19DVC(actionRequest, httpReq);
		} catch (Exception e) {
			log.error(e);
		}
	}

	// luu y kien 19 dá»‹ch vá»¥ cÃ´ng
	public void luuYKien19DvcPhanCongAction(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		try {
			CanBoDTBusinessUtils.canBoDuyetThamXet19DVCPhanCong(actionRequest,
					httpReq);
		} catch (Exception e) {
			log.error(e);
		}
	}

	/**
	 * Tra ket qua 19 dic vu cong duong thuy
	 * 
	 * @param actionRequest
	 * @param httpReq
	 * @throws IOException
	 */
	public void traKetQua19DvcAction(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {

		try {
			UploadPortletRequest uploadRequest = PortalUtil
					.getUploadPortletRequest(actionRequest);

			CanBoDTBusinessUtils.traKetQua19DVC(uploadRequest, actionResponse);

			PortletConfig portletConfig = (PortletConfig) actionRequest
					.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName()
					+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		} catch (Exception e) {
			log.error(e);
		}
	}


	// ketoan
	public void xacNhanGiaoDichKeToan(ActionRequest actionRequest,
			ActionResponse httpReq) {
		try {
			CanBoDTBusinessUtils.xacNhanGiaoDichKeToan(actionRequest, httpReq);
		} catch (Exception e) {
			log.error(e);
		}
	}

	public void luuThongTinXuLyThamXetVietTrung(ActionRequest actionRequest,
			ActionResponse httpReq) {
		log.info("luuThongTinXuLyThamXet viet trung---------");
		// TODO
		try {
			QlvtLienVanTerm term = new QlvtLienVanTerm(actionRequest);
			lienVan_ThongTinHoSo(actionRequest,httpReq,term);
			QlvtXuLyGpLienVan qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.fetchQlvtXuLyGpLienVan(term.getId());
			qlvtXuLyGpLienVan.setMucDichChuyenDi(term.getMucDichChuyenDi());
			//TODO
			QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
			
			customResponse(httpReq,FormUtil.bodyTextLienVan(term.getCapGplvId()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void luuThongTinXuLyThamXetOto(ActionRequest actionRequest,
			ActionResponse httpReq) {
		log.info("luuThongTinXuLyThamXetOto ---------");
		// TODO luu thong tin xu ly form to nhat otooo 
		//TODO van tai noi dia

		try {
			log.info("---luuThongTinXuLyThamXetOtosss----");
			long idReturn = processVTNoiDiaInsert(actionRequest, httpReq);
			customResponse(httpReq,FormUtil.bodyTextLienVan(idReturn));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

	public void giayPhep_vietLao_dangThamXet(ActionRequest actionRequest,
			ActionResponse httpReq) {
		log.info("giayPhep_vietLao_dangThamXet VietLao---------");
		// TODO
		try {
			log.info("---canBoPhuongTienCapGpvtVietTrung----");
			LienVanPortlet.lienVan_vietLao_dangThamXet(actionRequest, httpReq);
			//TODO
			QLVTQuocTeTerm termQuocTe = new QLVTQuocTeTerm(actionRequest);
			QLVTKhaiTacTuyen termKTTuyen = new QLVTKhaiTacTuyen(actionRequest);
			//QlvtThongTinHoSo qlvtThongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchQlvtThongTinHoSo(termQuocTe.getId());
			QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe = null;
			qlvtXuLyKTTQuocTe = QlvtXuLyKTTQuocTeLocalServiceUtil.fetchBythongTinXuLyId(termKTTuyen.getThongTinXuLyId());
			QlvtXuLyKTTQuocTeLocalServiceUtil.updateQlvtXuLyKTTQuocTe(qlvtXuLyKTTQuocTe);
			
			quocTe_ThongTinHoSo(actionRequest, httpReq, termQuocTe);
			
			qlvtXuLyKTTQuocTe.setBenDi(termKTTuyen.getBenDen());
			qlvtXuLyKTTQuocTe.setBenDen(termKTTuyen.getBenDen());
			qlvtXuLyKTTQuocTe.setDiemDen(termKTTuyen.getDiemDen());
			qlvtXuLyKTTQuocTe.setDiemDi(termKTTuyen.getDiemDi());
			qlvtXuLyKTTQuocTe.setHanhTrinhChay(termKTTuyen.getHanhTrinhChay());
			qlvtXuLyKTTQuocTe.setCuLyVanChuyen(termKTTuyen.getCuLyVanChuyen());
			qlvtXuLyKTTQuocTe.setCuaKhau(termKTTuyen.getCuaKhau());
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	private long processGPlienVanInsert(ActionRequest actionRequest,
			ActionResponse httpReq) {
		// TODO Auto-generated method stub
		long idReturn = 0;
		try {
			QlvtLienVanTerm term = new QlvtLienVanTerm(actionRequest);

			QlvtXuLyGpLienVan giaypheplienvan = null;
			giaypheplienvan = QlvtXuLyGpLienVanLocalServiceUtil
					.fetchQlvtXuLyGpLienVan(term.getId());
			giaypheplienvan.setSoGpvt(term.getSoGpvt());
			giaypheplienvan.setNgayCapGpvt(new Date());

			giaypheplienvan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(giaypheplienvan);
			QlvtXuLyGpLienVanPhuongTien lienVanPhuongTien = null;
			lienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.fetchQlvtXuLyGpLienVanPhuongTien(term.getIdPhuongTien());

			lienVanPhuongTien.setCapGplvId(giaypheplienvan.getId());
//			lienVanPhuongTien.setBienSo(term.getBienSo());
			lienVanPhuongTien.setTrongTai(term.getTrongTai());
			lienVanPhuongTien.setNamSx(term.getNamSx());
			lienVanPhuongTien.setNhanHieu(term.getNhanHieu());
			lienVanPhuongTien.setSoKhung(term.getSoKhung());
			lienVanPhuongTien.setSoMay(term.getSoMay());
			lienVanPhuongTien.setMauSon(term.getMauSon());

			lienVanPhuongTien.setCuaKhau(term.getCuaKhau());
			lienVanPhuongTien.setMaCuaKhau(term.getMaCuaKhau());

			lienVanPhuongTien.setXinCapPhepTuNgay(term.getXinCapPhepTuNgay());
			lienVanPhuongTien.setXinCapPhepDenNgay(term.getXinCapPhepDenNgay());

			lienVanPhuongTien.setHinhThucHoatDong(term.getHinhThucHoatDong());
			lienVanPhuongTien.setSoPhuHieu(term.getSoPhuHieu());

			lienVanPhuongTien.setThoiHanPhuHieu(term.getThoiHanPhuHieu());

			lienVanPhuongTien.setSoNgayXinhGiaHan(term.getSoNgayXinhGiaHan());
			lienVanPhuongTien.setXinGiaHanTuNgay(term.getXinGiaHanTuNgay());
			lienVanPhuongTien.setXinGiaHanDenNgay(term.getXinGiaHanDenNgay());

			lienVanPhuongTien.setHinhThucSoHuu(term.getHinhThucSoHuu());
			lienVanPhuongTien.setDoanhNghiepChoThue(term
					.getDoanhNghiepChoThue());

			lienVanPhuongTien.setThoiHanChoThue(term.getThoiHanChoThue());
			lienVanPhuongTien.setHopDongSauCung(term.getHopDongSauCung());
			lienVanPhuongTien.setThoiGianNhapCanh(term.getThoiGianNhapCanh());
			lienVanPhuongTien.setThoiGianKhoiHanh(term.getThoiGianKhoiHanh());

			lienVanPhuongTien.setLoaiHinhGiaHan(term.getLoaiHinhGiaHan());
			lienVanPhuongTien.setLoaiGiayPhep(term.getLoaiGiayPhep());
			lienVanPhuongTien.setKetQuaXuLy(term.getKetQuaXuLy());
			lienVanPhuongTien.setLyDoKhongDat(term.getLyDoKhongDat());
			lienVanPhuongTien.setHopDongSauCung(term.getHopDongSauCung());
			QlvtXuLyGpLienVanPhuongTienLocalServiceUtil
					.updateQlvtXuLyGpLienVanPhuongTien(lienVanPhuongTien);

			String[] paramDiemDungNghis = ParamUtil.getParameterValues(
					actionRequest, "diemDungNghi", new String[] {});

			long idtuyenhoatdong = ParamUtil.getLong(actionRequest,
					Constants.TUYEN_HOAT_DONG_ID);
			// long loaiHinhKinhDoanhVT = ParamUtil.getLong(actionRequest,
			// Constants.);

			long id = -1;
			// String[] maTuyens = term.getMaTuyens();
			QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen = null;
			id = CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanTuyen.class
					.getName());
			qlvtXuLyGpLienVanTuyen = QlvtXuLyGpLienVanTuyenLocalServiceUtil
					.createQlvtXuLyGpLienVanTuyen(id);
			qlvtXuLyGpLienVanTuyen.setGpLienVanPhuongTienId(lienVanPhuongTien
					.getId());
			qlvtXuLyGpLienVanTuyen.setMaTuyen(term.getMaTuyen());
			if (idtuyenhoatdong > 0) {
				DmDataItem dmitem = DmDataItemLocalServiceUtil
						.fetchDmDataItem(idtuyenhoatdong);
				qlvtXuLyGpLienVanTuyen.setTenTuyen(dmitem.getName());
			}

			if (term.getHinhThucHoatDong() != null) {
				List<DmDataItem> dmitem = DmDataItemLocalServiceUtil
						.findByGroupCode(term.getHinhThucHoatDong());
				// qlvtXuLyGpLienVanTuyen.setH(dmitem.get(0).getName());
			}
			QlvtXuLyGpLienVanTuyenLocalServiceUtil
					.updateQlvtXuLyGpLienVanTuyen(qlvtXuLyGpLienVanTuyen);
			idReturn = giaypheplienvan.getId();
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
		}
		return idReturn;
	}
	
	public void luuKetQuaThamXetKTTQuocTeVietLao(ActionRequest actionRequest,
			ActionResponse httpReq) {
		log.info("luuKetQuaThamXetKTTQuocTeVietLao VietLao---------");
		// TODO
		try {
			log.info("---luuKetQuaThamXetKTTQuocTeVietLao----");
			long idReturn = processKTTQuocTeInsert(actionRequest, httpReq);
			customResponse(httpReq,FormUtil.bodyTextLienVan(idReturn));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private long processVTNoiDiaInsert(ActionRequest actionRequest,ActionResponse httpReq) {
		
		log.info("-----------------------processVTNoiDiaInsert--------dung cho oto-------------");
		// TODO Auto-generated method stub 
		long idReturn = 0;
		try {
			QLVTNoiDiaTerm term = new QLVTNoiDiaTerm(actionRequest);
			QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto = null;
			qlvtXuLyGpkdvtBangOto = QlvtXuLyGpkdvtBangOtoLocalServiceUtil.fetchQlvtXuLyGpkdvtBangOto(term.getId());
			//set thong tin vào day
			QlvtXuLyGpkdvtBangOtoLocalServiceUtil.updateQlvtXuLyGpkdvtBangOto(qlvtXuLyGpkdvtBangOto);
			QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai = null;
			qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai = QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceUtil.fetchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(Long.valueOf(term.getIdLoaiHinhVt()));
			qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setMaLoaiHinhHoatDong(term.getMaLoaiHinhHoatDong());
			//them thong tin
			QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceUtil.updateQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
		}
		return idReturn;
	}
	
	
		private long processKTTQuocTeInsert(ActionRequest actionRequest,ActionResponse httpReq) {
		
		log.info("-----------------------processKTTQuocTeInsert---------------------");
		// TODO Auto-generated method stub
		long idReturn = 0;
		try {
			QLVTKhaiTacTuyen term = new QLVTKhaiTacTuyen(actionRequest);
			QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe = null;
			qlvtXuLyKTTQuocTe = QlvtXuLyKTTQuocTeLocalServiceUtil.fetchQlvtXuLyKTTQuocTe(Long.valueOf(term.getIdXuLyKTTQuocTe()));
			QlvtXuLyKTTQuocTeLocalServiceUtil.updateQlvtXuLyKTTQuocTe(qlvtXuLyKTTQuocTe);
			QlvtXuLyKTTQuocTePhuongTien kttQuocTePhuongTien = null;
			kttQuocTePhuongTien = QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil.fetchQlvtXuLyKTTQuocTePhuongTien(Long.valueOf(term.getIdPhuongTien()));
			kttQuocTePhuongTien.setCapPhepKTTQuocTeID(qlvtXuLyKTTQuocTe.getId());
			kttQuocTePhuongTien.setCuaKhau(qlvtXuLyKTTQuocTe.getCuaKhau());
			kttQuocTePhuongTien = QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil.updateQlvtXuLyKTTQuocTePhuongTien(kttQuocTePhuongTien);
			idReturn = kttQuocTePhuongTien.getCapPhepKTTQuocTeID();
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
		}
		return idReturn;
		}
	
	
	private void customResponse(ActionResponse httpReq, String bodyText) {
		// TODO Auto-generated method stub
		// respone
					JSONObject jsonMessageObject = JSONFactoryUtil.createJSONObject();
					jsonMessageObject.put("status", Boolean.FALSE);
					HttpServletResponse httpResponse = PortalUtil
							.getHttpServletResponse(httpReq);
					httpResponse.setContentType("text");

					try {

						JSONObject payloadJSON = JSONFactoryUtil.createJSONObject();
						payloadJSON.put("bodyText",
								bodyText);
						httpResponse.getWriter().print(payloadJSON.toString());
						httpResponse.flushBuffer();
					} catch (IOException e) {
						e.printStackTrace();
					}
	}
	
	
	public void lienVan_ThongTinHoSo(ActionRequest actionRequest,
			ActionResponse httpReq, QlvtLienVanTerm term ) throws IOException {
		// luu thong tin hoso

		
		long phieuXuLyId = ParamUtil.getLong(actionRequest,
				Constants.ID_PHIEU_XU_LY);

		try {
			QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil
					.fetchByphieuXuLyId(phieuXuLyId);
			//1
			thongTinHoSo.setSoGiayPhepKinhDoanhVanTaiNoiDia(term.getSoGiayPhepKinhDoanhVanTaiNoiDia());
			thongTinHoSo.setNgayCapGPKDVTNoiDia(term.getNgayCapGPKDVTNoiDia());
			thongTinHoSo.setCoQuanCapGPKDVTNoiDia(term.getCoQuanCapPhepLienVan());
			thongTinHoSo.setNgayHetHanGPKDVTNoiDia(term.getNgayHetHanGPKDVTNoiDia());
			thongTinHoSo.setLanCapGPKDVTNoiDia(term.getLanCapGPKDVTNoiDia());
			//2
			thongTinHoSo.setSoDkkd(term.getSoGpkd());
			thongTinHoSo.setNgayCapDkkd(term.getNgayCapGpkd());
			thongTinHoSo.setLanCapGiayDangKyKinhDoanh(term.getLanCapGiayDangKyKinhDoanh());
			thongTinHoSo.setCoQuanCapDkkd(term.getCoQuanCapGpkd());
			thongTinHoSo.setNgayHetHanDkkd(term.getNgayHetHanGPKDVTNoiDia());
			thongTinHoSo.setLanCapGPKDVTNoiDia(term.getLanCapGPKDVTNoiDia());
			//3
			thongTinHoSo.setNguoiLienHeTraKetQua(term.getHoTenNTKQ());
			thongTinHoSo.setSoDienThoaiNguoiLienHe(term.getDienThoaiNTKQ());
			thongTinHoSo.setTenDn(term.getTenDn());
			thongTinHoSo.setDiaChiDn(term.getDiaChiDn());
			thongTinHoSo.setLyDoCapLai(term.getLyDoGiaHan());
			
			//end, thieu se bo sung sau
			// TODO
			thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil
					.updateQlvtThongTinHoSo(thongTinHoSo);
			log.info("thongTinHoSo.getId()"+thongTinHoSo.getId());
			//them vao qlvtXuLyGpLienVanPhuongTien
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void quocTe_ThongTinHoSo(ActionRequest actionRequest,
			ActionResponse httpReq, QLVTQuocTeTerm term ) throws IOException {
		// luu thong tin hoso

		
		long phieuXuLyId = ParamUtil.getLong(actionRequest,
				Constants.ID_PHIEU_XU_LY);

		try {
			QlvtThongTinHoSo qlvtThongTinHoSo = QlvtThongTinHoSoLocalServiceUtil
					.fetchByphieuXuLyId(phieuXuLyId);
			
			// TODO
			qlvtThongTinHoSo.setCoQuanCapDkkd(term.getCoQuanCapGiayPhepVanTaiId());
			//qlvtThongTinHoSo.setCoQuanGiaiQuyet(term.get)
			
			qlvtThongTinHoSo.setLanCapGPKDVTQuocTe(term.getLanCapGPKDVTQuocTe());
			qlvtThongTinHoSo.setLanCapGPKDVTNoiDia(term.getLanCapGPKDVTNoiDia());
			qlvtThongTinHoSo.setLanCapGiayDangKyKinhDoanh(term.getLanCapGiayDangKyKinhDoanh());
			qlvtThongTinHoSo.setLyDoCapLai(term.getLyDoKhongDat());
			qlvtThongTinHoSo.setNgayHetHanDkkd(term.getNgayHetHanGiayPhepVanTai());
			qlvtThongTinHoSo.setNgayCapGPKDVTNoiDia(term.getNgayCapGPKDVTNoiDia());
			qlvtThongTinHoSo.setNgayCapGPKDVTQuocTe(term.getNgayCapGPKDVTQuocTe());
			qlvtThongTinHoSo.setNgayGiaHanGiayDangKyKinhDoanh(term.getNgayGiaHanGiayDangKyKinhDoanh());
			qlvtThongTinHoSo.setNgayGiaHanGPKDVTNoiDia(term.getNgayGiaHanGPKDVTNoiDia());
			qlvtThongTinHoSo.setNgayGiaHanGPKDVTQuocTe(term.getNgayGiaHanGPKDVTQuocTe());
			qlvtThongTinHoSo.setLyDoCapLai(term.getLyDoKhongDat());
			qlvtThongTinHoSo.setSoGiayPhepKinhDoanhVanTaiQuocTe(term.getSoGiayPhepKinhDoanhVanTaiQuocTe());
			qlvtThongTinHoSo.setNgayCapGPKDVTQuocTe(term.getNgayCapGPKDVTQuocTe());
			
			
			qlvtThongTinHoSo.setSoDienThoaiNguoiLienHe(term.getSoDienThoaiNguoiLienHe());
			qlvtThongTinHoSo.setNguoiLienHeTraKetQua(term.getNguoiLienHeTraKetQua());
			qlvtThongTinHoSo.setNgayHetHanGPKDVTNoiDia(term.getNgayHetHanGPKDVTNoiDia());
			qlvtThongTinHoSo.setNgayHetHanGPKDVTQuocTe(term.getNgayHetHanGPKDVTQuocTe());
			qlvtThongTinHoSo.setNgayHetHanGPKDVTQuocTe(term.getNgayHetHanGPKDVTQuocTe());
			
			qlvtThongTinHoSo.setTenDn(term.getTenDn());
			qlvtThongTinHoSo.setDiaChiDn(term.getDiaChiDn());
			qlvtThongTinHoSo.setDienThoaiDn(term.getDienThoaiDn());
			qlvtThongTinHoSo.setSoFaxDn(term.getSoFaxDN());
			
			QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(qlvtThongTinHoSo);
			qlvtThongTinHoSo = QlvtThongTinHoSoLocalServiceUtil
					.updateQlvtThongTinHoSo(qlvtThongTinHoSo);
			log.info("thongTinHoSo.getId()"+qlvtThongTinHoSo.getId());
			//them vao qlvtXuLyGpLienVanPhuongTien
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//binhth Bien hieu
	public void bienHieu_oTo_choThamXet(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************bienHieu_oTo_choThamXet*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			BienHieuPortlet.bienHieu_oTo_choThamXet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void bienHieu_oTo_dangThamXet(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************bienHieu_oTo_dangThamXet*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			BienHieuPortlet.bienHieu_oTo_dangThamXet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void bienHieu_oTo_CD(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************bienHieu_oTo_CD*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			BienHieuPortlet.bienHieu_oTo_CD(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void bienHieu_oTo_CDDYCBS(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************bienHieu_oTo_CDDYCBS*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			BienHieuPortlet.bienHieu_oTo_CDDYCBS(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void bienHieu_oTo_CTKQ(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************bienHieu_oTo_CTKQ*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			BienHieuPortlet.bienHieu_oTo_CTKQ(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			ajax_CTKQ(httpReq,"0");
		}
	}
	public void bienHieu_oTo_CDDTCCP(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************bienHieu_oTo_CDDTCCP*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			BienHieuPortlet.bienHieu_oTo_CDDTCCP(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void bienHieu_oTo_HTHS(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************bienHieu_oTo_HTHS*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			BienHieuPortlet.bienHieu_oTo_HTHS(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void bienHieu_oTo_HHS(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************bienHieu_oTo_HHS*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			BienHieuPortlet.bienHieu_oTo_HHS(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void bienHieu_oTo_luuThongTinThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
		log.info("*************************bienHieu_oTo_luuThongTinThamXet*************************");
		try {
			BienHieuPortlet.bienHieu_oTo_luuThongTinThamXet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void bienHieu_oTo_xemTruocNoiDung(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			BienHieuPortlet.bienHieu_oTo_xemTruocNoiDung(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void bienHieu_oTo_guiDuyet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			BienHieuPortlet.bienHieu_oTo_guiDuyet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//binhth phu hieu
	public void phuHieu_oTo_choThamXet(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************phuHieu_oTo_choThamXet*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			PhuHieuPortlet.phuHieu_oTo_choThamXet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void phuHieu_oTo_dangThamXet(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************phuHieu_oTo_dangThamXet*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			PhuHieuPortlet.phuHieu_oTo_dangThamXet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void phuHieu_oTo_CD(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************phuHieu_oTo_CD*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			PhuHieuPortlet.phuHieu_oTo_CD(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void phuHieu_oTo_CDDYCBS(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************phuHieu_oTo_CDDYCBS*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			PhuHieuPortlet.phuHieu_oTo_CDDYCBS(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void phuHieu_oTo_CTKQ(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************phuHieu_oTo_CTKQ*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			PhuHieuPortlet.phuHieu_oTo_CTKQ(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			ajax_CTKQ(httpReq,"0");
		}
	}
	public void phuHieu_oTo_CDDTCCP(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************phuHieu_oTo_CDDTCCP*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			PhuHieuPortlet.phuHieu_oTo_CDDTCCP(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void phuHieu_oTo_HTHS(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************phuHieu_oTo_HTHS*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			PhuHieuPortlet.phuHieu_oTo_HTHS(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void phuHieu_oTo_HHS(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************phuHieu_oTo_HHS*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			PhuHieuPortlet.phuHieu_oTo_HHS(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void phuHieu_oTo_luuThongTinThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
		log.info("*************************phuHieu_oTo_luuThongTinThamXet*************************");
		try {
			PhuHieuPortlet.phuHieu_oTo_luuThongTinThamXet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void phuHieu_oTo_xemTruocNoiDung(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
		try {
			if (CommonUtils.checkFromDate(actionRequest)) {
				return;
			}
			PhuHieuPortlet.phuHieu_oTo_xemTruocNoiDung(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void phuHieu_oTo_guiDuyet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			PhuHieuPortlet.phuHieu_oTo_guiDuyet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//binhth viet trung
	public void lienVan_vietTrung_choThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietTrung_choThamXet*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietTrung_choThamXet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lienVan_vietTrung_dangThamXet(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietTrung_dangThamXet*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietTrung_dangThamXet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lienVan_vietTrung_CD(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietTrung_CD*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietTrung_CD(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lienVan_vietTrung_CDDYCBS(ActionRequest actionRequest,
				ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietTrung_CDDYCBS*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietTrung_CDDYCBS(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lienVan_vietTrung_CTKQ(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietTrung_CTKQ*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietTrung_CTKQ(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			ajax_CTKQ(httpReq,"0");
		}
	}
	public void lienVan_vietTrung_CDDTCCP(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietTrung_CDDTCCP*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietTrung_CDDTCCP(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lienVan_vietTrung_HTHS(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietTrung_HTHS*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietTrung_HTHS(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lienVan_vietTrung_HHS(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietTrung_HHS*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietTrung_HHS(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lienVan_vietTrung_luuThongTinThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietTrung_luuThongTinThamXet*************************");
		try {
			LienVanPortlet.lienVan_vietTrung_luuThongTinThamXet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lienVan_vietTrung_xemTruocNoiDung(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
		try {
			if (CommonUtils.checkFromDate(actionRequest)) {
				return;
			}
			LienVanPortlet.lienVan_vietTrung_xemTruocNoiDung(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lienVan_vietTrung_guiDuyet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietTrung_guiDuyet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
		//binhth viet lao
	public void lienVan_vietLao_choThamXet(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietLao_choThamXet*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietLao_choThamXet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lienVan_vietLao_dangThamXet(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietLao_dangThamXet*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietLao_dangThamXet(actionRequest, httpReq);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	public void lienVan_vietLao_CD(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietLao_CD*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietLao_CD(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lienVan_vietLao_CDDYCBS(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietLao_CDDYCBS*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietLao_CDDYCBS(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lienVan_vietLao_CTKQ(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietLao_CTKQ*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietLao_CTKQ(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			ajax_CTKQ(httpReq,"0");
		}
	}
	public void lienVan_vietLao_CDDTCCP(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietLao_CDDTCCP*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietLao_CDDTCCP(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lienVan_vietLao_HTHS(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietLao_HTHS*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietLao_HTHS(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lienVan_vietLao_HHS(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietLao_HHS*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietLao_HHS(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lienVan_vietLao_luuThongTinThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietLao_luuThongTinThamXet*************************");
		try {
			LienVanPortlet.lienVan_vietLao_luuThongTinThamXet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lienVan_vietLao_xemTruocNoiDung(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
		try {
			if (CommonUtils.checkFromDate(actionRequest)) {
				return;
			}
			LienVanPortlet.lienVan_vietLao_xemTruocNoiDung(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lienVan_vietLao_guiDuyet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietLao_guiDuyet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//binhth viet cam
	public void lienVan_vietCam_choThamXet(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietCam_choThamXet*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietCam_choThamXet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lienVan_vietCam_dangThamXet(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietCam_dangThamXet*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietCam_dangThamXet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lienVan_vietCam_CD(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietCam_CD*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietCam_CD(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lienVan_vietCam_CDDYCBS(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietCam_CDDYCBS*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietCam_CDDYCBS(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lienVan_vietCam_CTKQ(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietCam_CTKQ*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietCam_CTKQ(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			ajax_CTKQ(httpReq,"0");
		}
	}
	public void lienVan_vietCam_CDDTCCP(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietCam_CDDTCCP*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietCam_CDDTCCP(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lienVan_vietCam_HTHS(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietCam_HTHS*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietCam_HTHS(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lienVan_vietCam_HHS(ActionRequest actionRequest,
		ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietCam_HHS*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietCam_HHS(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lienVan_vietCam_luuThongTinThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
		log.info("*************************lienVan_vietCam_luuThongTinThamXet*************************");
		try {
			LienVanPortlet.lienVan_vietCam_luuThongTinThamXet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lienVan_vietCam_xemTruocNoiDung(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
		try {
			if (CommonUtils.checkFromDate(actionRequest)) {
				return;
			}
			LienVanPortlet.lienVan_vietCam_xemTruocNoiDung(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lienVan_vietCam_guiDuyet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			LienVanPortlet.lienVan_vietCam_guiDuyet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//viet lao 
	public void quocTe_vietLao_choThamXet(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************quocTe_vietLao_choThamXet*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			QuocTePortlet.quocTe_vietLao_choThamXet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void quocTe_vietLao_dangThamXet(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************quocTe_vietLao_dangThamXet*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			QuocTePortlet.quocTe_vietLao_dangThamXet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void quocTe_vietLao_CD(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************quocTe_vietLao_CD*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			QuocTePortlet.quocTe_vietLao_CD(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void quocTe_vietLao_CPD(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************quocTe_vietLao_CPD*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			QuocTePortlet.quocTe_vietLao_CPD(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void quocTe_vietLao_CDDYCBS(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************quocTe_vietLao_CDDYCBS*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			QuocTePortlet.quocTe_vietLao_CDDYCBS(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void quocTe_vietLao_CTKQ(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************quocTe_vietLao_CTKQ*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			QuocTePortlet.quocTe_vietLao_CTKQ(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			ajax_CTKQ(httpReq,"0");
		}
	}
	public void quocTe_vietLao_CDDTCCP(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************quocTe_vietLao_CDDTCCP*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			QuocTePortlet.quocTe_vietLao_CDDTCCP(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void quocTe_vietLao_HTHS(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************quocTe_vietLao_HTHS*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			QuocTePortlet.quocTe_vietLao_HTHS(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void quocTe_vietLao_HHS(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************quocTe_vietLao_HHS*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			QuocTePortlet.quocTe_vietLao_HHS(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void quocTe_vietLao_luuThongTinThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
		log.info("*************************quocTe_vietLao_luuThongTinThamXet*************************");
		try {
			QuocTePortlet.quocTe_vietLao_luuThongTinThamXet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void quocTe_vietLao_xemTruocNoiDung(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
		try {
			if (CommonUtils.checkFromDate(actionRequest)) {
				return;
			}
			QuocTePortlet.quocTe_vietLao_xemTruocNoiDung(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void quocTe_vietLao_guiDuyet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			QuocTePortlet.quocTe_vietLao_guiDuyet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//viet cam
	public void quocTe_vietCam_choThamXet(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************quocTe_vietCam_choThamXet*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			QuocTePortlet.quocTe_vietCam_choThamXet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void quocTe_vietCam_dangThamXet(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************quocTe_vietCam_dangThamXet*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			QuocTePortlet.quocTe_vietCam_dangThamXet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void quocTe_vietCam_CD(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************quocTe_vietCam_CD*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			QuocTePortlet.quocTe_vietCam_CD(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void quocTe_vietCam_CPD(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************quocTe_vietCam_CPD*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			QuocTePortlet.quocTe_vietCam_CPD(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void quocTe_vietCam_CDDYCBS(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************quocTe_vietCam_CDDYCBS*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			QuocTePortlet.quocTe_vietCam_CDDYCBS(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void quocTe_vietCam_CTKQ(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************quocTe_vietCam_CTKQ*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			QuocTePortlet.quocTe_vietCam_CTKQ(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			ajax_CTKQ(httpReq,"0");
		}
	}
	public void quocTe_vietCam_CDDTCCP(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************quocTe_vietCam_CDDTCCP*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			QuocTePortlet.quocTe_vietCam_CDDTCCP(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void quocTe_vietCam_HTHS(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************quocTe_vietCam_HTHS*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			QuocTePortlet.quocTe_vietCam_HTHS(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void quocTe_vietCam_HHS(ActionRequest actionRequest,
			ActionResponse httpReq) throws IOException {
		log.info("*************************quocTe_vietCam_HHS*************************");
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			QuocTePortlet.quocTe_vietCam_HHS(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void quocTe_vietCam_luuThongTinThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
		log.info("*************************quocTe_vietCam_luuThongTinThamXet*************************");
		try {
			QuocTePortlet.quocTe_vietCam_luuThongTinThamXet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void quocTe_vietCam_xemTruocNoiDung(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
		try {
			if (CommonUtils.checkFromDate(actionRequest)) {
				return;
			}
			QuocTePortlet.quocTe_vietCam_xemTruocNoiDung(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void quocTe_vietCam_guiDuyet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
		try {
//			if (CommonUtils.checkFromDate(actionRequest)) {
//				return;
//			}
			QuocTePortlet.quocTe_vietCam_guiDuyet(actionRequest, httpReq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//binhth ktt
		public void ktt_choThamXet(ActionRequest actionRequest,
				ActionResponse httpReq) throws IOException {
			log.info("*************************ktt_choThamXet*************************");
			try {
//				if (CommonUtils.checkFromDate(actionRequest)) {
//					return;
//				}
				KhaiThacTuyenPortlet.ktt_choThamXet(actionRequest, httpReq);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void ktt_dangThamXet(ActionRequest actionRequest,
				ActionResponse httpReq) throws IOException {
			log.info("*************************ktt_dangThamXet*************************");
			try {
//				if (CommonUtils.checkFromDate(actionRequest)) {
//					return;
//				}
				KhaiThacTuyenPortlet.ktt_dangThamXet(actionRequest, httpReq);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void ktt_CD(ActionRequest actionRequest,
				ActionResponse httpReq) throws IOException {
			log.info("*************************ktt_CD*************************");
			try {
//				if (CommonUtils.checkFromDate(actionRequest)) {
//					return;
//				}
				KhaiThacTuyenPortlet.ktt_CD(actionRequest, httpReq);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void ktt_CDDYCBS(ActionRequest actionRequest,
				ActionResponse httpReq) throws IOException {
			log.info("*************************ktt_CDDYCBS*************************");
			try {
//				if (CommonUtils.checkFromDate(actionRequest)) {
//					return;
//				}
				KhaiThacTuyenPortlet.ktt_CDDYCBS(actionRequest, httpReq);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void ktt_CTKQ(ActionRequest actionRequest,
				ActionResponse httpReq) throws IOException {
			log.info("*************************ktt_CTKQ*************************");
			try {
//				if (CommonUtils.checkFromDate(actionRequest)) {
//					return;
//				}
				KhaiThacTuyenPortlet.ktt_CTKQ(actionRequest, httpReq);
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				ajax_CTKQ(httpReq,"0");
			}
		}
		public void ktt_CDDTCCP(ActionRequest actionRequest,
				ActionResponse httpReq) throws IOException {
			log.info("*************************ktt_CDDTCCP*************************");
			try {
//				if (CommonUtils.checkFromDate(actionRequest)) {
//					return;
//				}
				KhaiThacTuyenPortlet.ktt_CDDTCCP(actionRequest, httpReq);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void ktt_HTHS(ActionRequest actionRequest,
				ActionResponse httpReq) throws IOException {
			log.info("*************************ktt_HTHS*************************");
			try {
//				if (CommonUtils.checkFromDate(actionRequest)) {
//					return;
//				}
				KhaiThacTuyenPortlet.ktt_HTHS(actionRequest, httpReq);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void ktt_HHS(ActionRequest actionRequest,
				ActionResponse httpReq) throws IOException {
			log.info("*************************ktt_HHS*************************");
			try {
//				if (CommonUtils.checkFromDate(actionRequest)) {
//					return;
//				}
				KhaiThacTuyenPortlet.ktt_HHS(actionRequest, httpReq);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void ktt_luuThongTinThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
			log.info("*************************ktt_luuThongTinThamXet*************************");
			try {
				KhaiThacTuyenPortlet.ktt_luuThongTinThamXet(actionRequest, httpReq);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void ktt_xemTruocNoiDung(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
			try {
				if (CommonUtils.checkFromDate(actionRequest)) {
					return;
				}
				KhaiThacTuyenPortlet.ktt_xemTruocNoiDung(actionRequest, httpReq);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void ktt_guiDuyet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
			try {
//				if (CommonUtils.checkFromDate(actionRequest)) {
//					return;
//				}
				KhaiThacTuyenPortlet.ktt_guiDuyet(actionRequest, httpReq);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void addBieuDoXe(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
			try {
//				
//				if (CommonUtils.checkFromDate(actionRequest)) {
//					return;
//				}
				KhaiThacTuyenPortlet.addBieuDoXe(actionRequest, httpReq);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void addDiemDungNghi(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
			try {
//				if (CommonUtils.checkFromDate(actionRequest)) {
//					return;
//				}
				log.info(ParamUtil.getString(actionRequest, "dkm")+"*************************************");
				KhaiThacTuyenPortlet.addDiemDungNghi(actionRequest, httpReq);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//binhth ktt
		public void noiDia_oTo_choThamXet(ActionRequest actionRequest,
				ActionResponse httpReq) throws IOException {
			log.info("*************************noiDia_oTo_choThamXet*************************");
			try {
//				if (CommonUtils.checkFromDate(actionRequest)) {
//					return;
//				}
				NoiDiaPortlet.noiDia_oTo_choThamXet(actionRequest, httpReq);
				log.info("*************************done*************************");
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				ajax_CTKQ(httpReq, "1");
			}
		}
		public void noiDia_oTo_dangThamXet(ActionRequest actionRequest,
				ActionResponse httpReq) throws IOException {
			log.info("*************************noiDia_oTo_dangThamXet*************************");
			try {
//				if (CommonUtils.checkFromDate(actionRequest)) {
//					return;
//				}
				NoiDiaPortlet.noiDia_oTo_dangThamXet(actionRequest, httpReq);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void noiDia_oTo_CD(ActionRequest actionRequest,
				ActionResponse httpReq) throws IOException {
			log.info("*************************noiDia_oTo_CD*************************");
			try {
//				if (CommonUtils.checkFromDate(actionRequest)) {
//					return;
//				}
				NoiDiaPortlet.noiDia_oTo_CD(actionRequest, httpReq);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void noiDia_oTo_CDDYCBS(ActionRequest actionRequest,
				ActionResponse httpReq) throws IOException {
			log.info("*************************noiDia_oTo_CDDYCBS*************************");
			try {
//				if (CommonUtils.checkFromDate(actionRequest)) {
//					return;
//				}
				NoiDiaPortlet.noiDia_oTo_CDDYCBS(actionRequest, httpReq);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void noiDia_oTo_CTKQ(ActionRequest actionRequest,
				ActionResponse httpReq) throws IOException {
			log.info("*************************noiDia_oTo_CTKQ*************************");
			try {
//				if (CommonUtils.checkFromDate(actionRequest)) {
//					return;
//				}
				NoiDiaPortlet.noiDia_oTo_CTKQ(actionRequest, httpReq);
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				ajax_CTKQ(httpReq,"0");
			}
				
		}
		public void noiDia_oTo_CDDTCCP(ActionRequest actionRequest,
				ActionResponse httpReq) throws IOException {
			log.info("*************************noiDia_oTo_CDDTCCP*************************");
			try {
//				if (CommonUtils.checkFromDate(actionRequest)) {
//					return;
//				}
				NoiDiaPortlet.noiDia_oTo_CDDTCCP(actionRequest, httpReq);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void noiDia_oTo_HTHS(ActionRequest actionRequest,
				ActionResponse httpReq) throws IOException {
			log.info("*************************noiDia_oTo_HTHS*************************");
			try {
//				if (CommonUtils.checkFromDate(actionRequest)) {
//					return;
//				}
				NoiDiaPortlet.noiDia_oTo_HTHS(actionRequest, httpReq);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void noiDia_oTo_HHS(ActionRequest actionRequest,
				ActionResponse httpReq) throws IOException {
			log.info("*************************noiDia_oTo_HHS*************************");
			try {
//				if (CommonUtils.checkFromDate(actionRequest)) {
//					return;
//				}
				NoiDiaPortlet.noiDia_oTo_HHS(actionRequest, httpReq);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void noiDia_oTo_luuThongTinThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
			log.info("*************************noiDia_oTo_luuThongTinThamXet*************************");
			try {
				NoiDiaPortlet.noiDia_oTo_luuThongTinThamXet(actionRequest, httpReq);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void noiDia_oTo_xemTruocNoiDung(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
			try {
				log.info("*************************noiDia_oTo_xemTruocNoiDung*************************");
				if (CommonUtils.checkFromDate(actionRequest)) {
					return;
				}
				NoiDiaPortlet.noiDia_oTo_xemTruocNoiDung(actionRequest, httpReq);
				log.info("*************************done*************************");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void noiDia_oTo_guiDuyet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
			try {
				log.info("*************************noiDia_oTo_guiDuyet*************************");
//				if (CommonUtils.checkFromDate(actionRequest)) {
//					return;
//				}
				NoiDiaPortlet.noiDia_oTo_guiDuyet(actionRequest, httpReq);
				log.info("*************************done*************************");
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				ajax_CTKQ(httpReq, "1");
			}
		}
		
		//UPLOAD---------------
		public void upLoadFileBieuMau(ActionRequest actionRequest, ActionResponse httpReq) {
			log.info("--------upLoadFileBieuMau---------------------");
			
			UploadPortletRequest request = PortalUtil.getUploadPortletRequest(actionRequest);
			String tenTaiLieu = ParamUtil.getString(request, "tenTaiLieu");
			String fm = ParamUtil.getString(request, "fm");
			log.info("--------fm---------------------"+fm);
			String idFile = "";
			try {
				
				InputStream inputStream = request.getFileAsStream("attachment");
				// upload file
				String fileNameUpload = String.valueOf(request.getFileName("attachment"));
				log.info("--upLoadFileBieuMau---fileNameUpload-----" + fileNameUpload);
				log.info("--upLoadFileBieuMau---inputStream--------" + inputStream);
				log.info("--tenTaiLieu--------" + tenTaiLieu);
				if (Validator.isNull(tenTaiLieu)) {
					tenTaiLieu = request.getFileName("attachment");
				}else{
					tenTaiLieu +=  request.getFileName("attachment").substring(request.getFileName("attachment").lastIndexOf("."));
				}
				List<String> errors = new ArrayList<String>();
				if (inputStream != null) {
					byte[] fileContent = DocumentUtils.getByteFromInputStream(inputStream);
					if(DocumentUtils.validateFile(tenTaiLieu, fileContent, errors)) {
						long userSystem = DuongBoConfigurationManager.getLongProp("DB-system-use-upload_file_system", 0);
						long idFileDinhKem = DocumentUtils.uploadTaiLieu(fileContent, userSystem, fileNameUpload);
						log.info("---upLoadFileBieuMau-------idFileDinhKem: " + idFileDinhKem);
						idFile = idFileDinhKem+"";
					} else {
						for(String error : errors) {
							log.info(error);
							SessionErrors.add(actionRequest, error);
						}
					}
					
				}
				
			} catch (Exception e) {
				log.error(e);
			}finally{
				try {
				HttpServletResponse httpResponse = PortalUtil.getHttpServletResponse(httpReq);
				httpResponse.setContentType("text");
				
					ServiceContext serviceContext = ServiceContextFactory
							.getInstance(actionRequest);
				
				JSONObject payloadJSON = JSONFactoryUtil.createJSONObject();
				payloadJSON.put("tenTaiLieu", tenTaiLieu);
				payloadJSON.put("idFile", idFile);
				httpResponse.getWriter().print(payloadJSON.toString());
				httpResponse.flushBuffer();
				log.info("OK???");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		}
		
		private void ajax_CTKQ(ActionResponse httpReq,String par) {
			try {
				HttpServletResponse httpResponse = PortalUtil.getHttpServletResponse(httpReq);
				httpResponse.setContentType("text");
				JSONObject payloadJSON = JSONFactoryUtil.createJSONObject();
				payloadJSON.put("chuyenXuLy", par);
				httpResponse.getWriter().print(payloadJSON.toString());
				httpResponse.flushBuffer();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		public void chuyenDich_chuyenXuLy(ActionRequest actionRequest, ActionResponse actionResponse) {
			String chuyenXuLy = "1";
			try {
//				if (CommonUtils.checkFromDate(actionRequest)) {
//					return;
//				}
				log.info("***********************************************chuyenDich_chuyenXuLy");
				long idQuyTrinh = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
				long idPhieuXuLy = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
				String keyDichChuyen = ParamUtil.getString(actionRequest, "keyDichChuyen");
				log.info("***********************************************idQuyTrinh"+idQuyTrinh);
				
				log.info("***********************************************keyDichChuyen"+keyDichChuyen);
				log.info("***********************************************idPhieuXuLy"+idPhieuXuLy);
				MotCuaPhieuXuLy phieuXl = MotCuaPhieuXuLyLocalServiceUtil.fetchMotCuaPhieuXuLy(idPhieuXuLy);
				log.info("***********************************************phieuXl.getTrangThaiHienTaiId()"+phieuXl);
				MotCuaChuyenDichTrangThai trangThai = MotCuaChuyenDichTrangThaiLocalServiceUtil.fetchByF_DieuKienChuyenDich_TrangThaiNguonId_QuyTrinhThuTucId(idQuyTrinh, phieuXl.getTrangThaiHienTaiId(), keyDichChuyen);
				log.info("***********************************************phieuXl.trangThai()"+trangThai);
				if(Validator.isNotNull(trangThai))chuyenXuLy = trangThai.getChuyenXuLy()+"";
			} catch (Exception e) {
				// TODO: handle exception
			}finally{
				ajax_CTKQ(actionResponse, chuyenXuLy);
			}
		}
//		public void testAjax2(ActionRequest actionRequest, ActionResponse actionResponse) {
//			try {
//				log.info("***********************************************testAjax2");
//				actionResponse.sendRedirect("http://google.com.vn");
//			} catch (Exception e) {
//				// TODO: handle exception
//			}finally{
//				ajax_CTKQ(actionResponse, "3");
//			}
//		}
}	
