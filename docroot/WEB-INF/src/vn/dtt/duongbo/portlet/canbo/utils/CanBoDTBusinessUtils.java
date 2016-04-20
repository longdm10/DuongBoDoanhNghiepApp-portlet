package vn.dtt.duongbo.portlet.canbo.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.business.KeToanBusiness;
import vn.dtt.duongbo.business.MotCuaBusiness;
import vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo;
import vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.model.MotCuaChuyenDichTrangThai;
import vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy;
import vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo;
import vn.dtt.duongbo.dao.motcua.service.MotCuaChuyenDichTrangThaiLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtQuanLyFileLocalServiceUtil;
import vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo;
import vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanHoSoLocalServiceUtil;
import vn.dtt.duongbo.maudon.xml.MauDonFactory;
import vn.dtt.duongbo.maudon.xml.XmlUtils;
import vn.dtt.duongbo.utils.CommonUtils;
import vn.dtt.duongbo.utils.config.DuongBoConfigurationManager;
import vn.dtt.duongbo.utils.document.DocumentUtils;
import vn.dtt.duongbo.utils.format.FormatData;
import vn.dtt.duongthuy.business.DTConstants;
import vn.dtt.duongthuy.business.DuongThuyUtil;
import vn.dtt.duongthuy.maudon.model.ThongBao;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadRequest;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PortalUtil;

/**
 * @author huymq
 * 
 */
public class CanBoDTBusinessUtils {
	
	private static Log _log = LogFactoryUtil.getLog(CanBoDTBusinessUtils.class);
	
	// can bo xu ly trang thái 19DVC
	public static void canBoDuyetThamXet19DVC(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException, IOException {
		
		long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
		long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
		long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
		long userId = PortalUtil.getUserId(actionRequest);
		
		String yKien = ParamUtil.getString(actionRequest, "yKien19Dvc");
		String dieuKienChuyenDich = ParamUtil.getString(actionRequest, "dkDC");
		
		dichChuyenTrangThai19DVC(userId, hoSoThuTucId, phieuXuLyId, dieuKienChuyenDich, yKien, null);
		
		actionResponse.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
		actionResponse.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC, String.valueOf(quyTrinhThuTucId));
		actionResponse.setRenderParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
		
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
	
	// can bo xu ly trang thái 19DVC
	public static void canBoDuyetThamXet19DVCPhanCong(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException, IOException {
			
		_log.info("================vao`canBoDuyetThamXet=====");
		String yKien = ParamUtil.getString(actionRequest, "yKien19Dvc");
		long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
		long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
		long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
		long userId = PortalUtil.getUserId(actionRequest);
		
		dichChuyenTrangThai19DVC(userId, hoSoThuTucId, phieuXuLyId, null, yKien, null);
		
		// Tao ma bien nhan
		VanThuBusinessUtils vanThuBusinessUtils = new VanThuBusinessUtils();
		
		vanThuBusinessUtils.updateMaBienNhanHoSoThuTuc(hoSoThuTucId);
		
		actionResponse.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
		actionResponse.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC, String.valueOf(quyTrinhThuTucId));
		actionResponse.setRenderParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
		
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
}
	
	/**
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 * @throws IOException 
	 * @throws SystemException 
	 * @throws PortalException 
	 */
	public static void traKetQua19DVC(UploadRequest request, ActionResponse actionResponse) 
			throws IOException, PortalException, SystemException {
		_log.info("================traKetQua19DVC=====");
		
		InputStream inputStream = null;
		
		try {
			String yKien = ParamUtil.getString(request, "yKien19Dvc");
			long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(request, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(request);
			long doanhNghiepId = ParamUtil.getLong(request, Constants.ID_DOANH_NGHIEP);
			
			String trangThaiHoSo = ParamUtil.getString(request, Constants.TRANG_THAI_HO_SO);
			
			long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
			long idFileDinhKem = 0;
			String tenTaiLieu = "";
			
			TthcThanhPhanHoSo thanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.fetchTthcThanhPhanHoSo(thanhPhanHoSoId);
			
			_log.info("================hoSoThuTucId=====" + hoSoThuTucId);
			_log.info("================quyTrinhThuTucId=====" + quyTrinhThuTucId);
			_log.info("================phieuXuLyId=====" + phieuXuLyId);
			_log.info("================userId=====" + userId);
			_log.info("================doanhNghiepId=====" + doanhNghiepId);
			_log.info("================thanhPhanHoSoId=====" + thanhPhanHoSoId);
			_log.info("================trangThaiHoSo=====" + trangThaiHoSo);
			
			// upload file & luu vao quan ly file
			if(thanhPhanHoSo != null) {
				tenTaiLieu = ParamUtil.getString(request, "tenTaiLieu");
				String fileName = request.getFileName("attachment");
				inputStream = request.getFileAsStream("attachment");
				
				if (Validator.isNull(tenTaiLieu)) {
					tenTaiLieu = fileName;
				}
				
				byte[] fileContent = DocumentUtils.getByteFromInputStream(inputStream);
				long userSystem = DuongBoConfigurationManager.getLongProp("DB-system-use-upload_file_system", 0);
				
				if(fileContent != null && DocumentUtils.validateFile(fileName, fileContent, null)) {
					// upload file tra ket qua
					idFileDinhKem = DocumentUtils.uploadTaiLieu(fileContent, userSystem, fileName);
				}
			}
			
			if(idFileDinhKem > 0) {
				// tao noi dung ho so va cap nhat ho so thu tuc
				
				// update noi dung ho so
				TthcNoidungHoSoLocalServiceUtil.updateNoiDungHoSo(
					userId, hoSoThuTucId, thanhPhanHoSoId, tenTaiLieu, idFileDinhKem, "", 
					thanhPhanHoSo.getLoaiThanhPhan(), Constants.NOI_DUNG_HO_SO_TRANG_THAI_ACTIVE);
				
				// update quan ly file
				long loaiFile = DuongThuyUtil.getLoaiFileByLoaiThanhPhanHoSo(thanhPhanHoSo.getLoaiThanhPhan());
				
				QlvtQuanLyFileLocalServiceUtil.updateQuanLyFile(userId,
					doanhNghiepId, tenTaiLieu, loaiFile, tenTaiLieu,
					idFileDinhKem, DTConstants.ACTIVE, tenTaiLieu);
			
				// dich chuyen trang thai
				dichChuyenTrangThai19DVC(userId, hoSoThuTucId, phieuXuLyId, null, yKien, trangThaiHoSo);
				
				actionResponse.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
				actionResponse.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC, String.valueOf(quyTrinhThuTucId));
				actionResponse.setRenderParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
			}
			
		} finally {
			if(inputStream != null) {
				inputStream.close();
			}
		}
	}
	
	/**
	 * Dich chuyen trang thai cho 19 DVC
	 * 
	 * @param userId
	 * @param hoSoThuTucId
	 * @param phieuXuLyId
	 * @param quyTrinhThuTucId
	 * @param yKien
	 * @throws PortalException
	 * @throws SystemException
	 * @throws IOException 
	 */
	public static long dichChuyenTrangThai19DVC(long userId, long hoSoThuTucId,
			long phieuXuLyId, String dieuKienChuyenDich,
			String yKien, String trangThaiHoSo) throws PortalException,
			SystemException, IOException {
		
		_log.info("===dichChuyenTrangThai19DVC==");
		_log.info("===hoSoThuTucId==" + hoSoThuTucId);
		_log.info("===phieuXuLyId==" + phieuXuLyId);
		_log.info("===userId==" + userId);
		_log.info("===yKien==" + yKien);
		
		boolean luongChinh = true;
		
		TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.getTthcHoSoThuTuc(hoSoThuTucId);
		
		MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
		
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = null;
		
		// Neu dieuKienChuyenDich la null, trong truong hop luong phu phai fix dieuKienChuyenDich
		// TRuong hop luong chinh thi lay trang thai hien tai motcuachuyendichtrangthai
		if(Validator.isNotNull(dieuKienChuyenDich)) {
			List<MotCuaChuyenDichTrangThai> listMotCuaChuyenDichTrangThai = MotCuaChuyenDichTrangThaiLocalServiceUtil.findByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId(
					dieuKienChuyenDich, phieuXuLy.getTrangThaiHienTaiId(), phieuXuLy.getQuyTrinhThuTucId());
			
			if(listMotCuaChuyenDichTrangThai != null && listMotCuaChuyenDichTrangThai.size() > 0){
				motCuaChuyenDichTrangThai = listMotCuaChuyenDichTrangThai.get(0);
			}
			
			luongChinh = false;
			_log.info("===luongPhu==");
		} else {
			List<MotCuaChuyenDichTrangThai> listMotCuaChuyenDichTrangThai = MotCuaChuyenDichTrangThaiLocalServiceUtil.findByKhoiTaoPhieuXuLy(phieuXuLy.getQuyTrinhThuTucId(), phieuXuLy.getTrangThaiHienTaiId());
			
			if(listMotCuaChuyenDichTrangThai != null && listMotCuaChuyenDichTrangThai.size() > 0){
				motCuaChuyenDichTrangThai = listMotCuaChuyenDichTrangThai.get(0);
				
				dieuKienChuyenDich = motCuaChuyenDichTrangThai.getDieuKienChuyenDich();
			}
			_log.info("===luongChinh==");
		}
		
		if(motCuaChuyenDichTrangThai == null) {
			_log.error("===KHONG_TIM_THAY_MOT_CUA_CHUYEN_DICH_TRANG_THAI==");
			
			return 0;
		} else {
		
			long phi = 0;
			
			// check gui thong bao phi, y/c bo sung
			String maTPHSThongBao = motCuaChuyenDichTrangThai.getThongBaoXuLy();
			
			if(Validator.isNotNull(maTPHSThongBao)) {
				_log.info("===maTPHSThongBao==" + maTPHSThongBao);
				
				String[] listMaThongBao = DTConstants.MA_THONG_BAO;
				String[] listMaThongBaoPhi = DTConstants.MA_THONG_BAO_PHI;
				String[] listMaThongBaoCBS = DTConstants.MA_THONG_BAO_CHO_BO_SUNG;
				
				if(ArrayUtil.contains(listMaThongBaoPhi, maTPHSThongBao)) {
					// Tao xac nhan thanh toan va thong bao phi
					
					String[] thongTinPhiLePhi = DuongThuyUtil.getThongTinPhiLePhi(hoSoThuTuc);
					
					String loaiPhi = thongTinPhiLePhi[0];
					phi = GetterUtil.getLong(thongTinPhiLePhi[1]);
					if(phi > 0) {
						KeToanBusiness.addXacNhanThanhToan(hoSoThuTuc, phi, loaiPhi, "", phieuXuLyId);
					}
				}
				
				if(ArrayUtil.contains(listMaThongBao, maTPHSThongBao)) {
					// Tao noi dung ho so tuong ung voi thanh phan ho so la thong bao
					
					TthcThanhPhanHoSo thanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.getByThuTucHanhChinhIdAndMaThanhPhan(
							hoSoThuTuc.getThuTucHanhChinhId(), maTPHSThongBao);
					
					ThongBao thongBao = new ThongBao();
					
					thongBao.setTieuDe(thanhPhanHoSo.getTenThanhPhan());
					thongBao.setNoiDung(yKien);
					thongBao.setNgayGui(FormatData.parseDateToTringDDMMYYY(new Date()));
					thongBao.setNguoiGui(String.valueOf(userId));
					thongBao.setDonViGui(String.valueOf(hoSoThuTuc.getToChucQuanLy()));
					if(phi > 0) {
						thongBao.setPhiLePhi(String.valueOf(phi));
					}
					thongBao.setNguoiNhan(hoSoThuTuc.getTenChuHoSo());
					
					String noiDungXML = MauDonFactory.convertObjectToXml(thongBao);
					
					if(noiDungXML != null) {
						noiDungXML = XmlUtils.makeNoiDungXmlStandard(noiDungXML);
					}
					
					TthcNoidungHoSoLocalServiceUtil.updateNoiDungHoSo(userId,
							hoSoThuTuc.getId(), thanhPhanHoSo.getId(), thanhPhanHoSo.getTenThanhPhan(),
						0, noiDungXML, thanhPhanHoSo.getLoaiThanhPhan(), Constants.NOI_DUNG_HO_SO_TRANG_THAI_ACTIVE);
				}
				
				if(ArrayUtil.contains(listMaThongBaoCBS, maTPHSThongBao)) {
					trangThaiHoSo = Constants.DOANH_NGHIEP_TRANG_THAI_HO_SO_CHO_BO_SUNG;
				}
			}
			
			MotCuaBusiness motCuaBusiness = new MotCuaBusiness();
			
			long dichChuyenTrangThaiPhieuXuLy =
				motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(
					phieuXuLy, dieuKienChuyenDich, userId, 0, yKien);
			
			_log.info("===motCuaChuyenDichTrangThai===" + motCuaChuyenDichTrangThai.getId());
			_log.info("===dieuKienChuyenDich===" + dieuKienChuyenDich);
			_log.info("===dichChuyenTrangThaiPhieuSuLy===" + dichChuyenTrangThaiPhieuXuLy);
			
			if(dichChuyenTrangThaiPhieuXuLy > 0){
				//TODO: FIX CUNG: quy trinh 12 dieu kien dich chuyen Xu.ly update phieu xu ly to chuc quan ly cha
				if(luongChinh && motCuaChuyenDichTrangThai.getQuyTrinhThuTucId() == 12 
						&& hoSoThuTuc.getThuTucHanhChinhId() != 80 
						&& motCuaChuyenDichTrangThai.getDieuKienChuyenDich().trim().equalsIgnoreCase("Xu.ly")){
					
					phieuXuLy.setToChucQuanLy(DuongBoConfigurationManager.getLongProp("organization_id", 0));
					phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.updateMotCuaPhieuXuLy(phieuXuLy);
				}
				
				// Set trang thai cho hosothutuc
				MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = MotCuaTrangThaiHoSoLocalServiceUtil.fetchMotCuaTrangThaiHoSo(dichChuyenTrangThaiPhieuXuLy);
				
				if(motCuaTrangThaiHoSo != null && motCuaTrangThaiHoSo.getTrangThaiKetThuc() == 1){
					trangThaiHoSo = Constants.DOANH_NGHIEP_TRANG_THAI_HO_SO_HOAN_THANH;
				}
				
				if(Validator.isNull(trangThaiHoSo)) {
					trangThaiHoSo = Constants.DOANH_NGHIEP_TRANG_THAI_HO_SO_DANG_XU_LY;	// Mac dinh la trang thai DN_DXL
				}
				
				if(phi > 0) {
					trangThaiHoSo = Constants.DOANH_NGHIEP_TRANG_THAI_HO_SO_CHO_THANH_TOAN;
				}
				
				_log.info("===trangThaiHoSo===" + hoSoThuTucId + "===" + trangThaiHoSo);
				
				hoSoThuTuc.setTrangThaiHoSo(trangThaiHoSo);
				
				//TODO: FIX CUNG: quy trinh 12 dieu kien dich chuyen Xu.ly update phieu xu ly to chuc quan ly cha
				if(luongChinh && motCuaChuyenDichTrangThai.getQuyTrinhThuTucId() == 12 
						&& hoSoThuTuc.getThuTucHanhChinhId() != 80 
						&& motCuaChuyenDichTrangThai.getDieuKienChuyenDich().trim().equalsIgnoreCase("Xu.ly")){
					
					hoSoThuTuc.setToChucQuanLy(DuongBoConfigurationManager.getLongProp("organization_id", 0));
				}
				
				TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(hoSoThuTuc);
			}
			
			return dichChuyenTrangThaiPhieuXuLy;
		}
	}
	
	/**
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 * @throws SystemException
	 * @throws PortalException
	 * @throws IOException
	 */
	public static void xacNhanGiaoDichKeToan(ActionRequest actionRequest, ActionResponse actionResponse) 
			throws SystemException, PortalException, IOException {
		
		_log.debug("======= vao Xac Nhan Giao dich ke toan=========");
		
		long userId = PortalUtil.getUserId(actionRequest);
		
		long thanhPhanXuLy = ParamUtil.getLong(actionRequest, Constants.THANH_PHAN_XU_LY);
		long xacNhanThanhToanId = ParamUtil.getLong(actionRequest, Constants.ID_XACNHANTHANHTOAN);
		
		// nghiep vu
		String yKien = ParamUtil.getString(actionRequest, "textYkien");
		String ngayXacNhan = ParamUtil.getString(actionRequest, "textNgayXacNhan");
		
		int trangThaiXacNhan = ParamUtil.getInteger(actionRequest, "xn");
		
		if (CommonUtils.checkFromDate(actionRequest)) {
			return;
		}
		
		if(trangThaiXacNhan > 0) {
			List<TthcXacNhanThanhToanHoSo> listXacNhanThanhToanHoSo = TthcXacNhanThanhToanHoSoLocalServiceUtil.findByXacNhanThanhToanId(xacNhanThanhToanId);
			
			KeToanBusiness.updateXacNhanThanhToan(userId, xacNhanThanhToanId, ngayXacNhan, StringPool.BLANK, trangThaiXacNhan, yKien);
			
			for(TthcXacNhanThanhToanHoSo xacNhanThanhToanHoSo : listXacNhanThanhToanHoSo) {
				dichChuyenTrangThai19DVC(userId, xacNhanThanhToanHoSo.getHoSoThuTucId(), xacNhanThanhToanHoSo.getPhieuXuLyId(), null, yKien, null);
			}
			
			actionResponse.setRenderParameter(Constants.ID_XACNHANTHANHTOAN, String.valueOf(xacNhanThanhToanId));
			actionResponse.setRenderParameter(Constants.THANH_PHAN_XU_LY, String.valueOf(thanhPhanXuLy));
		}
		
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
}
