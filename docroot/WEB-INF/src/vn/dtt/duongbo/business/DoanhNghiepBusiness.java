
package vn.dtt.duongbo.business;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import vn.dtt.duongbo.dao.common.model.DmDataItem;
import vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn;
import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapBienHieu;
import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu;
import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam;
import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLao;
import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung;
import vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo;
import vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo;
import vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo;
import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau;
import vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh;
import vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucImpl;
import vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoImpl;
import vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.QlvtLoaiHinhHoatDongDnLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.QlvtPhuongTienCapBienHieuLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.QlvtPhuongTienCapPhuHieuLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietCamLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietLaoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietTrungLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcBieuMauHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoBieuMauLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil;
import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep;
import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser;
import vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil;
import vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepUserLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.model.MotCuaChuyenDichTrangThai;
import vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy;
import vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC;
import vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo;
import vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyImpl;
import vn.dtt.duongbo.dao.motcua.service.MotCuaChuyenDichTrangThaiLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaQuyTrinhThuTucTTHCLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan;
import vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanLocalServiceUtil;
import vn.dtt.duongbo.utils.CommonUtils;
import vn.dtt.duongbo.utils.config.DuongBoConfigurationManager;
import vn.dtt.duongbo.utils.document.DocumentUtils;
import vn.dtt.duongbo.utils.format.ConvertUtil;
import vn.dtt.duongthuy.business.DuongThuyUtil;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PortalUtil;

import vn.dtt.duongbo.ipay.KeyPayUtils;

public class DoanhNghiepBusiness {
	
	private Log _log = LogFactoryUtil.getLog(DoanhNghiepBusiness.class);
	
	public void upLoadFileBieuMau(ActionRequest actionRequest, ActionResponse httpReq) {
		_log.info("vao action------->>>--------upLoadFileBieuMau");
		
		UploadPortletRequest request = PortalUtil.getUploadPortletRequest(actionRequest);
		long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
		long idThuTucHanhChinh = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
		long idThanhPhanHoSo = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
		String listNoiDungHoSo = ParamUtil.getString(request, Constants.DANH_SACH_NOI_DUNG_HO_SO);
		
		String jspBack = ParamUtil.getString(request, "jspBack");
		
		try {
			String maBieuMau = ParamUtil.getString(request, "selectRadio_" + idThanhPhanHoSo);
			String tenTaiLieu = ParamUtil.getString(request, "tenTaiLieu");
			InputStream inputStream = request.getFileAsStream("attachment");
			// upload file
			String fileNameUpload = String.valueOf(request.getFileName("attachment"));
			_log.info("--upLoadFileBieuMau---fileNameUpload-----" + fileNameUpload);
			_log.info("--upLoadFileBieuMau---idHoSoThuTuc-------" + idHoSoThuTuc);
			_log.info("--upLoadFileBieuMau---idThuTucHanhChinh--" + idThuTucHanhChinh);
			_log.info("--upLoadFileBieuMau---idThanhPhanHoSo----" + idThanhPhanHoSo);
			_log.info("--upLoadFileBieuMau---maBieuMau----------" + maBieuMau);
			_log.info("--upLoadFileBieuMau---tenTaiLieu---------" + tenTaiLieu);
			_log.info("--upLoadFileBieuMau---inputStream--------" + inputStream);
			
			TthcBieuMauHoSo bieuMauHoSo = TthcBieuMauHoSoLocalServiceUtil.findByMaBieuMau(maBieuMau);
			
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
					_log.info("---upLoadFileBieuMau-------idFileDinhKem: " + idFileDinhKem);
					long userId = 0;
					long doanhNghiepId = 0;
					long organizationId = DuongBoConfigurationManager.getLongProp("organization_id", 0);
					userId = PortalUtil.getUserId(request);
					DnDoanhNghiepUser doanhNghiepUser = DnDoanhNghiepUserLocalServiceUtil.findByUserId(userId);
					if (doanhNghiepUser != null) {
						doanhNghiepId = doanhNghiepUser.getNguoiLamThuTucId();
					}
					
					List<TthcNoidungHoSo> allTthcNoidungHoSo = new ArrayList<TthcNoidungHoSo>();
					
					TthcNoidungHoSo noidungHoSo = new TthcNoidungHoSoImpl();
					noidungHoSo.setTaiLieuDinhKem(idFileDinhKem);
					noidungHoSo.setTenTaiLieu(tenTaiLieu);
					noidungHoSo.setThanhPhanHoSoId(idThanhPhanHoSo);
					noidungHoSo.setNguoiTao(PortalUtil.getUserId(actionRequest));
					noidungHoSo.setNgayTao(new Date());
					noidungHoSo.setNgayGuiNhan(new Date());
					
					if (bieuMauHoSo != null) {
						noidungHoSo.setBieuMauHoSoId(bieuMauHoSo.getId());
					}
					allTthcNoidungHoSo.add(noidungHoSo);
					
					Map<String, String> mapKetQua =
						xuLyHoSoNhap(idHoSoThuTuc, Constants.DOANH_NGHIEP_TRANG_THAI_HO_SO_LUU_NHAP, 1, listNoiDungHoSo, allTthcNoidungHoSo, idThuTucHanhChinh, userId, doanhNghiepId, organizationId);
					
					_log.info("--upLoadFileBieuMau--listNoiDungHoSo , noiDungHoSoId==" + mapKetQua.get(Constants.DANH_SACH_NOI_DUNG_HO_SO));
					_log.info("--upLoadFileBieuMau--hoSoId in action : " + mapKetQua.get("hoSoThuTucId"));
					_log.info("--upLoadFileBieuMau--listNoiDungHs in action : " + mapKetQua.get(Constants.DANH_SACH_NOI_DUNG_HO_SO));
					
					idHoSoThuTuc = ConvertUtil.convertToLong(mapKetQua.get("hoSoThuTucId"));
					listNoiDungHoSo = mapKetQua.get(Constants.DANH_SACH_NOI_DUNG_HO_SO);
				} else {
					for(String error : errors) {
						_log.info(error);
						SessionErrors.add(actionRequest, error);
					}
				}
			}
			
			TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(idThuTucHanhChinh);
			_log.info("---luuNoiDungHoSo--thuTucHanhChinh---" + ((thuTucHanhChinh != null) ? thuTucHanhChinh.getLinhVucThuTuc() : "--NULL--"));
			
			
			if (thuTucHanhChinh != null && thuTucHanhChinh.getLinhVucThuTuc().trim().contains(Constants.LVTT_VIET_NAM_CAMPUCHIA)) {
				jspBack = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamcampuchia/thanh_phan_ho_so.jsp";
				
			} else if (thuTucHanhChinh != null && thuTucHanhChinh.getLinhVucThuTuc().trim().contains(Constants.LVTT_VIET_NAM_LAO)) {
				jspBack = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/thanh_phan_ho_so.jsp";
				
			} else if (thuTucHanhChinh != null && thuTucHanhChinh.getLinhVucThuTuc().trim().contains(Constants.LVTT_VIET_NAM_CHINA)) {
				jspBack = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/thanh_phan_ho_so.jsp";
				
			} else if (thuTucHanhChinh != null && thuTucHanhChinh.getLinhVucThuTuc().trim().contains(Constants.LVTT_PHU_HIEU)) {
				jspBack = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/phuhieu/thanh_phan_ho_so.jsp";

			}else if (thuTucHanhChinh.getLinhVucThuTuc().trim().contains(Constants.LVTT_BIEN_HIEU) || 
					thuTucHanhChinh.getLinhVucThuTuc().trim().contains(Constants.LVTT_BIEN_HIEU_MOI) ||
					thuTucHanhChinh.getLinhVucThuTuc().trim().contains(Constants.LVTT_BIEN_HIEU_LAI)) {
					
				jspBack = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/bienhieu/thanh_phan_ho_so.jsp";
				
			} else if (thuTucHanhChinh != null && thuTucHanhChinh.getLinhVucThuTuc().trim().contains(Constants.LVTT_TN_VAN_TAI_OTO) ||
						thuTucHanhChinh != null && thuTucHanhChinh.getLinhVucThuTuc().trim().contains(Constants.LVTT_TN_VAN_TAI_OTO_MOI) ||
					thuTucHanhChinh != null && thuTucHanhChinh.getLinhVucThuTuc().trim().contains(Constants.LVTT_TN_VAN_TAI_OTO_LAI)) {
				
				jspBack = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/vantaioto/thanh_phan_ho_so.jsp";
			}
			
			
			SessionMessages.add(actionRequest, Constants.THAO_TAC_THANH_CONG);
			
		} catch (Exception e) {
			_log.error(e);
			SessionMessages.add(actionRequest, Constants.THAO_TAC_THAT_BAI);
		}
		_log.info("---------------jspBack: " + jspBack);
		
		httpReq.setRenderParameter("jspPage", jspBack);
		httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(idHoSoThuTuc));
		httpReq.setRenderParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(idThuTucHanhChinh));
		httpReq.setRenderParameter(Constants.DANH_SACH_NOI_DUNG_HO_SO, listNoiDungHoSo);
		
//		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
//		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	public void xoaHoSo(ActionRequest request, ActionResponse httpReq) {
		
		_log.debug("=================> action xoaHoSo");
		
		long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
		String linhVucthuTuc = ParamUtil.getString(request, Constants.CODE_LINH_VUC_THU_TUC);
		String maBienNhan = ParamUtil.getString(request, Constants.MA_BIEN_NHAN);
		
		try {
			List<TthcNoidungHoSo> allNoiDungHoSo = TthcNoidungHoSoLocalServiceUtil.findByHoSoThuTucId(idHoSoThuTuc);
			TthcNoidungHoSo noiDungHoSo = null;
			for (int i = 0; i < allNoiDungHoSo.size(); i++) {
				noiDungHoSo = allNoiDungHoSo.get(i);
				TthcNoidungHoSoLocalServiceUtil.deleteTthcNoidungHoSo(noiDungHoSo);
			}
			TthcHoSoThuTucLocalServiceUtil.deleteTthcHoSoThuTuc(idHoSoThuTuc);
			
		} catch (Exception e) {
			e.printStackTrace();
			_log.error(e);
		}
		
		httpReq.setRenderParameter("jspPage", "/html/hsdoanhnghiep/quanlyhoso/quan_ly_ho_so_search_content.jsp");
		httpReq.setRenderParameter(Constants.CODE_LINH_VUC_THU_TUC, linhVucthuTuc);
	//	httpReq.setRenderParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(idThuTucHanhChinh));
		httpReq.setRenderParameter(Constants.MA_BIEN_NHAN, maBienNhan);
		SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
		
	public void xoaNoiDungHoSo(ActionRequest request, ActionResponse httpReq) {
		
		_log.debug("=================> action xoaNoiDungHoSo");
		
		long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
		long idThuTucHanhChinh = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
		long idNoiDungHoSo = ParamUtil.getLong(request, Constants.ID_NOI_DUNG_HO_SO);
		String linhVucthuTuc = ParamUtil.getString(request, Constants.CODE_LINH_VUC_THU_TUC);
		String maBienNhan = ParamUtil.getString(request, Constants.MA_BIEN_NHAN);
		String jspBack = ParamUtil.getString(request, "jspBack");
		
		try {
			TthcNoidungHoSo noiDungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(idNoiDungHoSo);
			if(noiDungHoSo != null) {
				TthcNoidungHoSoLocalServiceUtil.deleteTthcNoidungHoSo(noiDungHoSo);
			}
		
			TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(idThuTucHanhChinh);
			DmDataItem linhVucThuTuc = DmDataItemLocalServiceUtil.findByGroupIdAndItemCode(Constants.DM_LINH_VUC_TTHC, thuTucHanhChinh.getLinhVucThuTuc().trim());
			
			if (linhVucThuTuc.getCode().trim().contains(Constants.LVTT_VIET_NAM_CAMPUCHIA)) {
				jspBack = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamcampuchia/thanh_phan_ho_so.jsp";
				
			} else if (linhVucThuTuc.getCode().trim().contains(Constants.LVTT_VIET_NAM_LAO)) {
				jspBack = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/thanh_phan_ho_so.jsp";
				
			} else if (linhVucThuTuc.getCode().trim().contains(Constants.LVTT_VIET_NAM_CHINA)) {
				jspBack = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/thanh_phan_ho_so.jsp";
				
//			} else if (linhVucThuTuc.getCode().trim().contains(Constants.LVTT_TRONG_NUOC)) {
//				jspBack = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/thanh_phan_ho_so.jsp";
				
			} else if (linhVucThuTuc.getCode().trim().contains(Constants.LVTT_PHU_HIEU)) {
				jspBack = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/phuhieu/thanh_phan_ho_so.jsp";
				
			}else if (linhVucThuTuc.getCode().trim().contains(Constants.LVTT_BIEN_HIEU) ||
						linhVucThuTuc.getCode().trim().contains(Constants.LVTT_BIEN_HIEU_MOI) ||
					linhVucThuTuc.getCode().trim().contains(Constants.LVTT_BIEN_HIEU_LAI)) {
				
				jspBack = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/bienhieu/thanh_phan_ho_so.jsp";
				
			} else if (linhVucThuTuc.getCode().trim().contains(Constants.LVTT_TN_VAN_TAI_OTO_MOI) ||
						linhVucThuTuc.getCode().trim().contains(Constants.LVTT_TN_VAN_TAI_OTO_LAI) || 
						linhVucThuTuc.getCode().trim().contains(Constants.LVTT_TN_VAN_TAI_OTO)) {
				jspBack = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/vantaioto/thanh_phan_ho_so.jsp";
			}
			
			httpReq.setRenderParameter("jspPage", jspBack);
			httpReq.setRenderParameter(Constants.CODE_LINH_VUC_THU_TUC, linhVucthuTuc);
			httpReq.setRenderParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(idThuTucHanhChinh));
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(idHoSoThuTuc));
			httpReq.setRenderParameter(Constants.MA_BIEN_NHAN, maBienNhan);
		} catch (Exception e) {
			_log.error(e);
		}
		SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	public Map<String, String> xuLyHoSoNhap(
		long hoSoThuTucId, String trangThaiHoSo, long phanNhomHoSoId, String listNoiDungHoSo, List<TthcNoidungHoSo> noidungHoSos, long idThuTucHanhChinh, long userId,
		long doanhNghiepId, long organizationId) {
		
		long id = 0;
		Map<String, String> mapHoSo = new HashMap<String, String>();
		try {
			TthcHoSoThuTuc hoSoThuTuc = null;
			if (hoSoThuTucId > 0) {
				hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
				id = hoSoThuTucId;
			} else {
				hoSoThuTuc = taoHoSo(idThuTucHanhChinh, userId, doanhNghiepId, organizationId, trangThaiHoSo, phanNhomHoSoId);
				id = hoSoThuTuc.getId();
			}
			mapHoSo.put("hoSoThuTucId", String.valueOf(id));
			
			_log.info("===hoSoThuTucId===" + id);
			
			if (noidungHoSos != null && noidungHoSos.size() > 0) {
				_log.info("---noidungHoSos--size--" + noidungHoSos.size());
				int size = noidungHoSos.size();
				TthcNoidungHoSo noidungHoSoAfterUpdate = null;
				
				for (int i = 0; i < size; i++) {
					
					TthcNoidungHoSo noidungHoSoParam = noidungHoSos.get(i);
					TthcNoidungHoSo noidungHoSoDataBase = TthcNoidungHoSoLocalServiceUtil.findByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
							id, noidungHoSoParam.getBieuMauHoSoId(), noidungHoSoParam.getThanhPhanHoSoId());
					
					_log.info("===noidungHoSoParam--BieuMauHoSoId=====" + noidungHoSoParam.getBieuMauHoSoId());
					_log.info("===noidungHoSoParam--ThanhPhanHoSoId===" + noidungHoSoParam.getThanhPhanHoSoId());
					_log.info("===noidungHoSoParam--ThanhPhanHoSoId===" + noidungHoSoParam.getId());
					_log.info("===noidungHoSoParam--getNoiDungXml===" + noidungHoSoParam.getNoiDungXml());
					if (noidungHoSoDataBase != null && noidungHoSoDataBase.getNoiDungXml() != null && noidungHoSoDataBase.getNoiDungXml().trim().length() > 0) {
						_log.info("===noidungHoSoId in DataBase===" + noidungHoSoDataBase.getId());
						
						//update lai noiDungSo moi, truyen xuong
						if(Validator.isNotNull(noidungHoSoParam.getNoiDungXml()))noidungHoSoDataBase.setNoiDungXml(noidungHoSoParam.getNoiDungXml());
						if(Validator.isNull(noidungHoSoParam.getNoiDungXml()))noidungHoSoDataBase.setTenTaiLieu(noidungHoSoParam.getTenTaiLieu());
						if(Validator.isNull(noidungHoSoParam.getNoiDungXml()))noidungHoSoDataBase.setTaiLieuDinhKem(noidungHoSoParam.getTaiLieuDinhKem());
						noidungHoSoAfterUpdate = TthcNoidungHoSoLocalServiceUtil.updateTthcNoidungHoSo(noidungHoSoDataBase);
						listNoiDungHoSo = listNoiDungHoSo + "," + noidungHoSoAfterUpdate.getId();
						
					} else {
						long idNoiDungHoSo = CounterLocalServiceUtil.increment(TthcNoidungHoSo.class.getName());
//						noidungHoSoParam.setId(idNoiDungHoSo);
						TthcNoidungHoSo noidungHoSoCHK = TthcNoidungHoSoLocalServiceUtil.findByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(noidungHoSoParam.getHoSoThuTucId(), noidungHoSoParam.getBieuMauHoSoId(), noidungHoSoParam.getThanhPhanHoSoId());
						if(Validator.isNull(noidungHoSoCHK)){
							noidungHoSoCHK = TthcNoidungHoSoLocalServiceUtil.createTthcNoidungHoSo(idNoiDungHoSo);
						}
						noidungHoSoCHK.setHoSoThuTucId(id);
						noidungHoSoCHK.setThanhPhanHoSoId(noidungHoSoParam.getThanhPhanHoSoId());
						noidungHoSoCHK.setTenTaiLieu(noidungHoSoParam.getTenTaiLieu());
						noidungHoSoCHK.setTaiLieuDinhKem(noidungHoSoParam.getTaiLieuDinhKem());
						noidungHoSoCHK.setNoiDungXml(noidungHoSoParam.getNoiDungXml());
						noidungHoSoCHK.setBieuMauHoSoId(noidungHoSoParam.getBieuMauHoSoId());
						noidungHoSoCHK.setTrangThai(Constants.NOI_DUNG_HO_SO_TRANG_THAI_ACTIVE);
						noidungHoSoCHK.setNgayTao(new Date());
						noidungHoSoCHK.setNguoiTao(userId);
						noidungHoSoAfterUpdate = TthcNoidungHoSoLocalServiceUtil.updateTthcNoidungHoSo(noidungHoSoCHK);
						listNoiDungHoSo = listNoiDungHoSo + "," + noidungHoSoAfterUpdate.getId();
					}
				}
			}
			mapHoSo.put(Constants.DANH_SACH_NOI_DUNG_HO_SO, listNoiDungHoSo);
			
		} catch (Exception e) {
			_log.error(e);
		}
		_log.info("--hoSoThuTucId--" + id);
		return mapHoSo;
	}
	
	public TthcHoSoThuTuc taoHoSo(long idThuTucHanhChinh, long userId, long doanhNghiepId, long organizationId, String trangThaiHoSo, long phanNhomHoSoId) {
		TthcHoSoThuTuc tthcHoSoThuTuc = null;
		try {
			_log.info("doanhNghiepId: " + doanhNghiepId);
			DnDoanhNghiep doanhNghiep = DnDoanhNghiepLocalServiceUtil.fetchDnDoanhNghiep(doanhNghiepId);
			long id = CounterLocalServiceUtil.increment(TthcHoSoThuTuc.class.getName());
			tthcHoSoThuTuc = new TthcHoSoThuTucImpl();
			tthcHoSoThuTuc.setId(id);
			
			tthcHoSoThuTuc.setNguoiTao(userId);
			tthcHoSoThuTuc.setMaSoHoSo(String.valueOf(id));
			tthcHoSoThuTuc.setNguoiLamThuTucId(doanhNghiepId);
			tthcHoSoThuTuc.setThuTucHanhChinhId(idThuTucHanhChinh);
			tthcHoSoThuTuc.setTrangThaiHoSo(trangThaiHoSo);
			tthcHoSoThuTuc.setPhanNhomHoSoId(phanNhomHoSoId);
			tthcHoSoThuTuc.setNgayTao(new Date());
			tthcHoSoThuTuc.setNgayGuiHoSo(new Date());
			tthcHoSoThuTuc.setToChucQuanLy(organizationId);
			_log.info("-----thong tin tthcHoSoThuTuc--------------");
			_log.info("-----setThuTucHanhChinhId: " + tthcHoSoThuTuc.getThuTucHanhChinhId());
			_log.info("-----hosoID: " + tthcHoSoThuTuc.getId());
			if (doanhNghiep != null) {
				tthcHoSoThuTuc.setMaSoChuHoSo(doanhNghiep.getMaSoDoanhNghiep());
				tthcHoSoThuTuc.setMaTinhThanh(doanhNghiep.getMaTinhThanh());
				tthcHoSoThuTuc.setMaQuanHuyen(doanhNghiep.getMaQuanHuyen());
				tthcHoSoThuTuc.setMaPhuongXa(doanhNghiep.getMaPhuongXa());
				tthcHoSoThuTuc.setTenChuHoSo(doanhNghiep.getTenDoanhNghiep());
				tthcHoSoThuTuc.setDiaChiChuHoSo(doanhNghiep.getDiaChi());
			}
			
			//tthcNoidungHoSo.set
			TthcHoSoThuTucLocalServiceUtil.addTthcHoSoThuTuc(tthcHoSoThuTuc);
			
		} catch (Exception e) {
			_log.error(e);
		}
		return tthcHoSoThuTuc;
	}
	
	public void xemTruocNoiDung(ActionRequest request, ActionResponse httpReq) {
		_log.info("=================> action xemTruocNoiDung");
		
		long idThuTucHanhChinh = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
		long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
		long idThanhPhanHoSo = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
		
		try {
			TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(idThuTucHanhChinh);
			if (thuTucHanhChinh != null) {
				
				_log.info("=================thuTucHanhChinh=code==" + thuTucHanhChinh.getMaThuTuc());
				
				httpReq.setRenderParameter("jspPage", ParamUtil.getString(request, Constants.PATH_MAUDON_VIEW_PDF));
				httpReq.setRenderParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(idThanhPhanHoSo));
				httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(idHoSoThuTuc));
				httpReq.setRenderParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(idThuTucHanhChinh));
				httpReq.setRenderParameter(Constants.ID_BIEU_MAU_HO_SO, ParamUtil.getString(request, Constants.ID_BIEU_MAU_HO_SO));
				httpReq.setRenderParameter(Constants.ID_DOANH_NGHIEP, ParamUtil.getString(request, Constants.ID_DOANH_NGHIEP).trim());
				httpReq.setRenderParameter("coQuanGui", ParamUtil.getString(request, "coQuanGui"));
				httpReq.setRenderParameter("diaChiDoanhNghiep", ParamUtil.getString(request, "diaChiDoanhNghiep"));
				httpReq.setRenderParameter(Constants.LOAI_THU_TUC_HANH_CHINH, ParamUtil.getString(request, Constants.LOAI_THU_TUC_HANH_CHINH));
				
				
				/** --------------------------------------------------VIETNAM-CAMPUCHIA--------------------------------------------------*/
				if (Arrays.asList(Constants.TTHC_VIET_CAM_CAP_PHEP_DUONG_BO_ALL).contains(thuTucHanhChinh.getMaThuTuc().trim())) {
					httpReq.setRenderParameter("maLoaiHinhDeNghiCap", ParamUtil.getString(request, "maLoaiHinhDeNghiCap"));
					httpReq.setRenderParameter("loaiHinhHoatDong", ParamUtil.getParameterValues(request, "loaiHinhHoatDong", new String[] {}));
					httpReq.setRenderParameter("lyDoCapLai", ParamUtil.getParameterValues(request, "lyDoCapLai", new String[] {}));
					httpReq.setRenderParameter("noiDungLyDoCapLais", ParamUtil.getString(request, "noiDungLyDoCapLais"));
					
				} else if (Arrays.asList(Constants.TTHC_VIET_CAM_LIENVAN_PHUONGTIEN_KINHDOANH_ALL).contains(thuTucHanhChinh.getMaThuTuc().trim())) {
					_log.info("==================== TTHC_VIET_CAM_LIENVAN_PHUONGTIEN_KINHDOANH_ALL========" +thuTucHanhChinh.getMaThuTuc().trim());
					httpReq.setRenderParameter("tuyenDiCuaKhau", ParamUtil.getString(request, "tuyenDiCuaKhau"));
					httpReq.setRenderParameter("tuyenDiTinhThanh", ParamUtil.getString(request, "tuyenDiTinhThanh"));
					httpReq.setRenderParameter("culyVanChuyen", ParamUtil.getString(request, "culyVanChuyen"));
					httpReq.setRenderParameter("selBenXeDi", ParamUtil.getString(request, "selBenXeDi"));
					httpReq.setRenderParameter("selBenXeDiThuocTinh", ParamUtil.getString(request, "selBenXeDiThuocTinh"));
					httpReq.setRenderParameter("selBenXeDen", ParamUtil.getString(request, "selBenXeDen"));
					httpReq.setRenderParameter("selBenXeDenThuocTinh", ParamUtil.getString(request, "selBenXeDenThuocTinh"));
					httpReq.setRenderParameter("hanhTrinhTuyenDuong", ParamUtil.getString(request, "hanhTrinhTuyenDuong"));
					httpReq.setRenderParameter("soCapGiayPhep", ParamUtil.getString(request, "soCapGiayPhep"));
					httpReq.setRenderParameter("ngayCapGiayPhep", ParamUtil.getString(request, "ngayCapGiayPhep"));
					httpReq.setRenderParameter("lyDoMat", ParamUtil.getString(request, "lyDoMat"));
					
					///CAP PHEP CHO PHUONG TIEN KINH DOANH VAN TAI VIET CAM
					httpReq.setRenderParameter("loaiHinhKinhDoanhVanTai", ParamUtil.getParameterValues(request, "loaiHinhKinhDoanhVanTai", new String[]{}));
					httpReq.setRenderParameter("objectPhuongTien", ParamUtil.getParameterValues(request, "objectPhuongTien", new String[]{}));
					
					httpReq.setRenderParameter("bienKiemSoat", ParamUtil.getString(request, "bienKiemSoat"));
					httpReq.setRenderParameter("bienKiemSoatThayThe", ParamUtil.getString(request, "bienKiemSoatThayThe"));
					
				} else if (Arrays.asList(Constants.TTHC_VIET_CAM_LIENVAN_PHUONGTIEN_PHI_THUONGMAI_ALL).contains(thuTucHanhChinh.getMaThuTuc().trim())) {
					
					httpReq.setRenderParameter("mucDichChuyenDi", ParamUtil.getParameterValues(request, "mucDichChuyenDi", new String[] {}));
					httpReq.setRenderParameter("objectPhuongTien", ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {}));
					httpReq.setRenderParameter("lyDoMat", ParamUtil.getString(request, "lyDoMat"));
				} else if ((Constants.GIA_HAN_GPLV_PHUONGTIEN_VIET_CAM).equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
					_log.info("==================== vào DBVN-CPC7========");
					
					httpReq.setRenderParameter("soGiaoThongVanTai", ParamUtil.getString(request, "soGiaoThongVanTai"));
					httpReq.setRenderParameter("groupDeNghiDuocGiaHan", ParamUtil.getString(request, "groupDeNghiDuocGiaHan"));
					httpReq.setRenderParameter("soGiayPhep", ParamUtil.getString(request, "soGiayPhep"));
					httpReq.setRenderParameter("ngayCapGiayPhep", ParamUtil.getString(request, "ngayCapGiayPhep"));
					httpReq.setRenderParameter("noiCap", ParamUtil.getString(request, "noiCap"));
					httpReq.setRenderParameter("ngayCoGiaTri", ParamUtil.getString(request, "ngayCoGiaTri"));
					httpReq.setRenderParameter("thoiGianNhapCanh", ParamUtil.getString(request, "thoiGianNhapCanh"));
					httpReq.setRenderParameter("soNgayGiaHanGplv", ParamUtil.getString(request, "soNgayGiaHanGplv"));
					httpReq.setRenderParameter("lyDoDeNghiGiaHan", ParamUtil.getString(request, "lyDoDeNghiGiaHan"));
					httpReq.setRenderParameter("diaChiThanhPho", ParamUtil.getString(request, "diaChiThanhPho"));
					httpReq.setRenderParameter("bienSoXe", ParamUtil.getString(request, "bienSoXe"));
					httpReq.setRenderParameter("ngayFromGiaHanGplv", ParamUtil.getString(request, "ngayFromGiaHanGplv"));
					httpReq.setRenderParameter("ngayToGiaHanGplv", ParamUtil.getString(request, "ngayToGiaHanGplv"));
					httpReq.setRenderParameter("ngayFromGiaHanChuyenDi", ParamUtil.getString(request, "ngayFromGiaHanChuyenDi"));
					httpReq.setRenderParameter("ngayToGiaHanChuyenDi", ParamUtil.getString(request, "ngayToGiaHanChuyenDi"));
					
					///TUYEN --VIET _ CAMPUCHIA
				}else if ((Constants.TTHC_VIET_CAM_KHAI_THAC_TUYEN_HANH_KHACH_CO_DINH_LIEN_VAN_QUOC_TE).equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())
						|| (Constants.TTHC_VIET_CAM_BO_SUNG_KHAI_THAC_TUYEN_HANH_KHACH_CO_DINH_LIEN_VAN_QUOC_TE).equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())||
						Constants.TTHC_VIET_CAM_THAY_THE_KHAI_THAC_TUYEN_HANH_KHACH_CO_DINH.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
					_log.info("==========vao`==========CAM == ======"+thuTucHanhChinh.getMaThuTuc().trim());

					httpReq.setRenderParameter("tinhThanh", ParamUtil.getString(request, "tinhThanh"));
					httpReq.setRenderParameter("objectPhuongTien", ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {}));
					httpReq.setRenderParameter("SoGPVT", ParamUtil.getString(request, "SoGPVT"));
					httpReq.setRenderParameter("ngayCapGiayPhep", ParamUtil.getString(request, "ngayCapGiayPhep"));
					httpReq.setRenderParameter("thanhPhoFrom", ParamUtil.getString(request, "thanhPhoFrom"));
					httpReq.setRenderParameter("thanhPhoTo", ParamUtil.getString(request, "thanhPhoTo"));
					httpReq.setRenderParameter("benDi", ParamUtil.getString(request, "benDi"));
					httpReq.setRenderParameter("benDen", ParamUtil.getString(request, "benDen"));
					httpReq.setRenderParameter("cuLy", ParamUtil.getString(request, "cuLy"));
					httpReq.setRenderParameter("hanhTrinh", ParamUtil.getString(request, "hanhTrinh"));
					
				}else if ((Constants.TTHC_VIET_CAM_NGUNG_KHAI_THAC_TUYEN_HANH_KHACH_CO_DINH).equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
					_log.info("==========vao` TTHC_VIET_CAM_NGUNG_KHAI_THAC_TUYEN_HANH_KHACH_CO_DINH========== == ======"+thuTucHanhChinh.getMaThuTuc().trim());
					httpReq.setRenderParameter("tinhThanh", ParamUtil.getString(request, "tinhThanh"));
					httpReq.setRenderParameter("ngayNgungKhaiThac", ParamUtil.getString(request, "ngayNgungKhaiThac"));
					httpReq.setRenderParameter("tuyenNgungKhaiThac", ParamUtil.getString(request, "tuyenNgungKhaiThac"));
					
				}else if ((Constants.TTHC_VIET_CAM_DIEU_CHINH_KHAI_THAC_TUYEN_HANH_KHACH_CO_DINH).equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
					_log.info("==========vao` TTHC_VIET_CAM_DIEU_CHINH_KHAI_THAC_TUYEN_HANH_KHACH_CO_DINH========== == ======"+thuTucHanhChinh.getMaThuTuc().trim());
					
					httpReq.setRenderParameter("objectPhuongTien", ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {}));
					httpReq.setRenderParameter("tinhThanh", ParamUtil.getString(request, "tinhThanh"));
					httpReq.setRenderParameter("soGiayPhepVanTai", ParamUtil.getString(request, "soGiayPhepVanTai"));
					httpReq.setRenderParameter("ngayCapGiayPhepVantai", ParamUtil.getString(request, "ngayCapGiayPhepVantai"));
					httpReq.setRenderParameter("tuNgay", ParamUtil.getString(request, "tuNgay"));
					httpReq.setRenderParameter("tuyen", ParamUtil.getString(request, "tuyen"));
					httpReq.setRenderParameter("xeTangGiam", ParamUtil.getString(request, "xeTangGiam"));
					
					
				}
				
				
				
				
				/** --------------------------------------------------VIETNAM-LAO--------------------------------------------------*/
				/** --------------------------------------------------
				 * 	'Cấp giấy phép hoạt động vận tải đường bộ quốc tế Việt Nam – Lào'
				 * "DBVN_L1", "DBVN_L2", "DBVN_L13", "DBVN_L14"
				 * 
				 * ------------------------------*/
				else if (Arrays.asList(Constants.TTHC_VIET_LAO_CAP_PHEP_DUONG_BO_ALL).contains(thuTucHanhChinh.getMaThuTuc().trim())) {
					_log.info("-------TTHC_VIET_LAO_CAP_PHEP_DUONG_BO_ALL------------");
					
					httpReq.setRenderParameter("maLoaiHinhDeNghiCap", ParamUtil.getString(request, "maLoaiHinhDeNghiCap"));
					httpReq.setRenderParameter("loaiHinhHoatDong", ParamUtil.getParameterValues(request, "loaiHinhHoatDong", new String[] {}));
					httpReq.setRenderParameter("lyDoCapLai", ParamUtil.getParameterValues(request, "lyDoCapLai", new String[] {}));
					//httpReq.setRenderParameter("noiDungLyDoCapLais", ParamUtil.getParameterValues(request, "noiDungLyDoCapLais", new String[] {}));
					httpReq.setRenderParameter("noiDungLyDoCapLais", ParamUtil.getString(request, "noiDungLyDoCapLais"));
					
				}
				
				else if (Arrays.asList(Constants.TTHC_VIET_LAO_LIENVAN_PHUONGTIEN_KINHDOANH_ALL).contains(thuTucHanhChinh.getMaThuTuc().trim())) {
					_log.info("-------TTHC_VIET_LAO_LIENVAN_PHUONGTIEN_KINHDOANH_ALL------------");
					
					httpReq.setRenderParameter("tuyenDiCuaKhau", ParamUtil.getString(request, "tuyenDiCuaKhau"));
					httpReq.setRenderParameter("tuyenDiTinhThanh", ParamUtil.getString(request, "tuyenDiTinhThanh"));
					httpReq.setRenderParameter("culyVanChuyen", ParamUtil.getString(request, "culyVanChuyen"));
					httpReq.setRenderParameter("lyDoMat", ParamUtil.getString(request, "lyDoMat"));
					
					httpReq.setRenderParameter("selBenXeDi", ParamUtil.getString(request, "selBenXeDi"));
					httpReq.setRenderParameter("selBenXeDiThuocTinh", ParamUtil.getString(request, "selBenXeDiThuocTinh"));
					httpReq.setRenderParameter("selBenXeDen", ParamUtil.getString(request, "selBenXeDen"));
					httpReq.setRenderParameter("selBenXeDenThuocTinh", ParamUtil.getString(request, "selBenXeDenThuocTinh"));
					httpReq.setRenderParameter("hanhTrinhTuyenDuong", ParamUtil.getString(request, "hanhTrinhTuyenDuong"));
					httpReq.setRenderParameter("soCapGiayPhep", ParamUtil.getString(request, "soCapGiayPhep"));
					httpReq.setRenderParameter("ngayCapGiayPhep", ParamUtil.getString(request, "ngayCapGiayPhep"));
					
					///CAP PHEP CHO PHUONG TIEN KINH DOANH VAN TAI VIET LAO
					httpReq.setRenderParameter("loaiHinhKinhDoanhVanTai", ParamUtil.getParameterValues(request, "loaiHinhKinhDoanhVanTai", new String[]{}));
					httpReq.setRenderParameter("objectPhuongTien", ParamUtil.getParameterValues(request, "objectPhuongTien", new String[]{}));
					
				}
				
				else if (Arrays.asList(Constants.TTHC_VIET_LAO_LIENVAN_PHUONGTIEN_PHI_THUONGMAI_ALL).contains(thuTucHanhChinh.getMaThuTuc().trim())) {
					_log.info("-------lien TTHC_VIET_LAO_LIENVAN_PHUONGTIEN_PHI_THUONGMAI_ALL all----");
					
					
					
					httpReq.setRenderParameter("mucDichChuyenDi", ParamUtil.getParameterValues(request, "mucDichChuyenDi", new String[] {}));
					httpReq.setRenderParameter("objectPhuongTien", ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {}));
					httpReq.setRenderParameter("lyDoMat", ParamUtil.getString(request, "lyDoMat"));
				}
				
				else if ((Constants.GIA_HAN_GPLV_PHUONGTIEN_VIET_LAO).equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
					_log.info("==================== GIA_HAN_GPLV_PHUONGTIEN_VIET_LAO========");
					_log.info("===================ngayToGiaHanGplv: " + ParamUtil.getString(request, "ngayToGiaHanGplv"));

					httpReq.setRenderParameter("soGiayPhep", ParamUtil.getString(request, "soGiayPhep"));
					httpReq.setRenderParameter("ngayCapGiayPhep", ParamUtil.getString(request, "ngayCapGiayPhep"));
					httpReq.setRenderParameter("noiCap", ParamUtil.getString(request, "noiCap"));
					httpReq.setRenderParameter("ngayCoGiaTri", ParamUtil.getString(request, "ngayCoGiaTri"));
					httpReq.setRenderParameter("thoiGianNhapCanh", ParamUtil.getString(request, "thoiGianNhapCanh"));
					httpReq.setRenderParameter("soNgayGiaHanGplv", ParamUtil.getString(request, "soNgayGiaHanGplv"));
					httpReq.setRenderParameter("lyDoDeNghiGiaHan", ParamUtil.getString(request, "lyDoDeNghiGiaHan"));
					httpReq.setRenderParameter("soGiaoThongVanTai", ParamUtil.getString(request, "soGiaoThongVanTai"));
					httpReq.setRenderParameter("groupDeNghiDuocGiaHan", ParamUtil.getString(request, "groupDeNghiDuocGiaHan"));
					httpReq.setRenderParameter("bienSoXe", ParamUtil.getString(request, "bienSoXe"));
					httpReq.setRenderParameter("ngayFromGiaHanGplv", ParamUtil.getString(request, "ngayFromGiaHanGplv"));
					httpReq.setRenderParameter("ngayToGiaHanGplv", ParamUtil.getString(request, "ngayToGiaHanGplv"));
					httpReq.setRenderParameter("ngayFromGiaHanChuyenDi", ParamUtil.getString(request, "ngayFromGiaHanChuyenDi"));
					httpReq.setRenderParameter("ngayToGiaHanChuyenDi", ParamUtil.getString(request, "ngayToGiaHanChuyenDi"));
					httpReq.setRenderParameter("soGiaoThongVanTai", ParamUtil.getString(request, "soGiaoThongVanTai"));
				}

				/** -------------------------------Chấp thuận đăng ký khai thác tuyến vận tải hành khách cố định liên vận quốc tế giữa Việt Nam - Lào.-------------------'*/
				else if (("DBVN_L8").equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())||
						("DBVN_L9").equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim()) ||
						("DBVN_L10").equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim()) ) {
					_log.info("==================== VAO` DAY DBVN_L8 || DBVN_L9 ||10 -========");
					_log.info("==================== Chấp thuận đăng ký khai thác tuyến vận tải hành khách cố định liên vận quốc tế giữa Việt Nam - Lào.-========");
					
					httpReq.setRenderParameter("SoGPVT", ParamUtil.getString(request, "SoGPVT"));
					httpReq.setRenderParameter("ngayCapGiayPhep", ParamUtil.getString(request, "ngayCapGiayPhep"));
					httpReq.setRenderParameter("thanhPhoFrom", ParamUtil.getString(request, "thanhPhoFrom"));
					httpReq.setRenderParameter("thanhPhoTo", ParamUtil.getString(request, "thanhPhoTo"));
					httpReq.setRenderParameter("benDi", ParamUtil.getString(request, "benDi"));
					httpReq.setRenderParameter("benDen", ParamUtil.getString(request, "benDen"));
					httpReq.setRenderParameter("cuLy", ParamUtil.getString(request, "cuLy"));
					httpReq.setRenderParameter("hanhTrinh", ParamUtil.getString(request, "hanhTrinh"));
					httpReq.setRenderParameter("tinhThanh", ParamUtil.getString(request, "tinhThanh"));
					httpReq.setRenderParameter("objectPhuongTien", ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {}));
				}
				/** ------------------------------Ngừng khai thác tuyến vận tải hành khách tuyến cố định Việt – Lào.*/
				else if (("DBVN_L11").equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
					httpReq.setRenderParameter("tuyenNgungKhaiThac", ParamUtil.getString(request, "tuyenNgungKhaiThac"));
					httpReq.setRenderParameter("ngayNgungKhaiThac", ParamUtil.getString(request, "ngayNgungKhaiThac"));
					httpReq.setRenderParameter("tinhThanh", ParamUtil.getString(request, "tinhThanh"));
					httpReq.setRenderParameter("coQuanGui", ParamUtil.getString(request, "coQuanGui"));
				
				}
				/** ------------------------------Đơn đề nghị điều chỉnh tần suất xe chạy trên tuyến Việt - Lào.*/
				else if (("DBVN_L12").equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
					
					httpReq.setRenderParameter("objectPhuongTien", ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {}));
					httpReq.setRenderParameter("tinhThanh", ParamUtil.getString(request, "tinhThanh"));
					httpReq.setRenderParameter("soGiayPhepVanTai", ParamUtil.getString(request, "soGiayPhepVanTai"));
					httpReq.setRenderParameter("ngayCapGiayPhepVantai", ParamUtil.getString(request, "ngayCapGiayPhepVantai"));
					httpReq.setRenderParameter("tuNgay", ParamUtil.getString(request, "tuNgay"));
					httpReq.setRenderParameter("tuyen", ParamUtil.getString(request, "tuyen"));
					httpReq.setRenderParameter("xeTangGiam", ParamUtil.getString(request, "xeTangGiam"));

				}
				
				/** --------------------------------------------------VIETNAM-TRUNGQUOC--------------------------------------------------*/
					/**dang_ki_khai_thac_tuyen_viet_trung_views*/
				 else if (Constants.TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_LOAI_ABCEFG_LAN_DAU.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim()) ||
						Constants.TTHC_VIET_TQ_CAP_LAI_GPVT_A_E_HET_HAN.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim()) ||
						Constants.TTHC_VIET_TQ_CAP_LAI_GPVT_A_D_E_HONG_MAT.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
					
					_log.info("VIETNAM-TRUNGQUOC--VIEW_PDF--" + ParamUtil.getString(request, Constants.PATH_MAUDON_VIEW_PDF));
					
					httpReq.setRenderParameter("soGiayKdvt", ParamUtil.getString(request, "soGiayKdvt"));
					httpReq.setRenderParameter("ngayCapKdvt", ParamUtil.getString(request, "ngayCapKdvt"));
					httpReq.setRenderParameter("coQuanCapKdvt", ParamUtil.getString(request, "coQuanCapKdvt"));
					
					httpReq.setRenderParameter("objectPhuongTien", ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {}));
					httpReq.setRenderParameter("hoTenNguoiLienHeTrakq", ParamUtil.getString(request, "hoTenNguoiLienHeTrakq"));
					httpReq.setRenderParameter("sdtNguoiLienHeTrakq", ParamUtil.getString(request, "sdtNguoiLienHeTrakq"));
					
				} else if (Constants.TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_CONG_VU.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())){
					
					_log.info("VIETNAM-TRUNGQUOC--" + ParamUtil.getString(request, Constants.PATH_MAUDON_VIEW_PDF));
					httpReq.setRenderParameter("objectPhuongTien", ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {}));
					httpReq.setRenderParameter("hoTenNguoiLienHeTrakq", ParamUtil.getString(request, "hoTenNguoiLienHeTrakq"));
					httpReq.setRenderParameter("sdtNguoiLienHeTrakq", ParamUtil.getString(request, "sdtNguoiLienHeTrakq"));
					httpReq.setRenderParameter("mucDichCapPhep", ParamUtil.getString(request, "mucDichCapPhep"));
					
				} else if (Constants.TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_LOAI_D.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim()) ||
							Constants.TTHC_VIET_TQ_CAP_GIAY_GIOI_THIEU_DE_NGHI_CAP_PHEP_VAN_TAI_LOAI_D.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())){
					
					_log.info("VIETNAM-TRUNGQUOC--" + ParamUtil.getString(request, Constants.PATH_MAUDON_VIEW_PDF));
					_log.info("--------------------------------------soGiayPhepVCVN action xem truoc---" + ParamUtil.getString(request, "soGiayPhepVCVN"));
					_log.info("--------------------------------------hoTenNguoiLienHeTrakq action xem truoc---" + ParamUtil.getString(request, "hoTenNguoiLienHeTrakq"));
					httpReq.setRenderParameter("objectPhuongTien", ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {}));
					httpReq.setRenderParameter("diaChiNguoiLienHeTrakq", ParamUtil.getString(request, "diaChiNguoiLienHeTrakq"));
					httpReq.setRenderParameter("hoTenNguoiLienHeTrakq", ParamUtil.getString(request, "hoTenNguoiLienHeTrakq"));
					httpReq.setRenderParameter("sdtNguoiLienHeTrakq", ParamUtil.getString(request, "sdtNguoiLienHeTrakq"));
					httpReq.setRenderParameter("soGiayPhepVCVN", ParamUtil.getString(request, "soGiayPhepVCVN"));
					httpReq.setRenderParameter("noiCapGiayPhepVCVN", ParamUtil.getString(request, "noiCapGiayPhepVCVN"));
					httpReq.setRenderParameter("ngayCapGiayPhepVCVN", ParamUtil.getString(request, "ngayCapGiayPhepVCVN"));
					httpReq.setRenderParameter("soGiayPhepVCTQ", ParamUtil.getString(request, "soGiayPhepVCTQ"));
					httpReq.setRenderParameter("noiCapGiayPhepVCTQ", ParamUtil.getString(request, "noiCapGiayPhepVCTQ"));
					httpReq.setRenderParameter("ngayCapGiayPhepVCTQ", ParamUtil.getString(request, "ngayCapGiayPhepVCTQ"));
				} else if (Constants.TTHC_VIET_TQ_GIA_HAN_GIAY_PHEP_THOI_GIAN_LUU_HANH.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())){
					
					httpReq.setRenderParameter("loaiGiayPhep", ParamUtil.getString(request, "loaiGiayPhep"));
					httpReq.setRenderParameter("ngayCapPhep", ParamUtil.getString(request, "ngayCapPhep"));
					httpReq.setRenderParameter("coQuanCapPhep", ParamUtil.getString(request, "coQuanCapPhep"));
					httpReq.setRenderParameter("thoiGianHetHoatDong", ParamUtil.getString(request, "thoiGianHetHoatDong"));
					httpReq.setRenderParameter("lyDoXinGiaHan", ParamUtil.getString(request, "lyDoXinGiaHan"));
					httpReq.setRenderParameter("soNgaySuCo", ParamUtil.getString(request, "soNgaySuCo"));
					httpReq.setRenderParameter("thoiGianKhacPhucSuCoFrom", ParamUtil.getString(request, "thoiGianKhacPhucSuCoFrom"));
					httpReq.setRenderParameter("thoiGianKhacPhucSuCoTo", ParamUtil.getString(request, "thoiGianKhacPhucSuCoTo"));
					
				}
				
				/** --------------------------------------------------VAN TAI TRONG NUOC - VAN TAI O TO--------------------------------------------------*/
				else if (Arrays.asList(Constants.TTHC_VANTAI_TRONGNUOC_VAN_TAI_OTO_ALL).contains(thuTucHanhChinh.getMaThuTuc().trim())) {
					_log.info("-------TTHC_VANTAI_TRONGNUOC_VAN_TAI_OTO_ALL----");
					
					httpReq.setRenderParameter("noiDungLyDoCapLai", ParamUtil.getString(request, "noiDungLyDoCapLai"));
					httpReq.setRenderParameter("dataLoaiHinhKdvt", ParamUtil.getParameterValues(request, "dataLoaiHinhKdvt", new String[] {}));
					httpReq.setRenderParameter("lyDoCapLai", ParamUtil.getParameterValues(request, "lyDoCapLai", new String[] {}));
					httpReq.setRenderParameter("objectLoaiHinhHoatDong", ParamUtil.getParameterValues(request, "objectLoaiHinhHoatDong", new String[]{}));
					
				} else if (Arrays.asList(Constants.TTHC_CAP_PHU_HIEU_ALL).contains(thuTucHanhChinh.getMaThuTuc().trim())) {
					_log.info("-------TTHC_CAP_PHU_HIEU_ALL----");
					httpReq.setRenderParameter("objectPhuongTien", ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {}));
					httpReq.setRenderParameter("soLuongBHPHNopLai", ParamUtil.getString(request, "soLuongBHPHNopLai"));
					httpReq.setRenderParameter("soLuongDeNghiCap", ParamUtil.getString(request, "soLuongDeNghiCap"));
					
				} else if (Arrays.asList(Constants.TTHC_CAP_BIEN_HIEU_ALL).contains(thuTucHanhChinh.getMaThuTuc().trim())) {
					_log.info("-------TTHC_CAP_BIEN_HIEU_ALL----");
					
					httpReq.setRenderParameter("doNguoiCap", ParamUtil.getString(request, "doNguoiCap"));
					httpReq.setRenderParameter("objectPhuongTien", ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {}));
					httpReq.setRenderParameter("linhVucKinhDoanh", ParamUtil.getParameterValues(request, "linhVucKinhDoanh", new String[] {}));
					httpReq.setRenderParameter("tinhThanh", ParamUtil.getString(request, "tinhThanh"));
					httpReq.setRenderParameter("soGiayPhepKinhDoanh", ParamUtil.getString(request, "soGiayPhepKinhDoanh"));
					httpReq.setRenderParameter("ngayCap", ParamUtil.getString(request, "ngayCap"));
//					httpReq.setRenderParameter("linhVucKinhDoanh", ParamUtil.getString(request, "linhVucKinhDoanh"));
					httpReq.setRenderParameter("soXeDeNghiCapBH", ParamUtil.getString(request, "soXeDeNghiCapBH"));
					httpReq.setRenderParameter("tenQuocTe", ParamUtil.getString(request, "tenQuocTe"));
					
				} else if (Constants.TTHC_VIET_TQ_DANG_KY_KHAI_THAC_TUYEN.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim()) ||
					Constants.TTHC_VIET_TQ_BO_SUNG_THAY_THE_PHUONG_TIEN_KHAI_THAC_TUYEN.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
					
					_log.info("------TTHC_VIET_TQ_DANG_KY_KHAI_THAC_TUYEN----TTHC_VIET_TQ_BO_SUNG_THAY_THE_PHUONG_TIEN_KHAI_THAC_TUYEN--");
					
					httpReq.setRenderParameter("objectPhuongTien", ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {}));
					httpReq.setRenderParameter("listDiemDungNghi", ParamUtil.getString(request, "listDiemDungNghi"));
					httpReq.setRenderParameter("tinhThanh", ParamUtil.getString(request, "tinhThanh"));
					httpReq.setRenderParameter("ngayLamDon", ParamUtil.getString(request, "ngayLamDon"));
					httpReq.setRenderParameter("thanhPhoDi", ParamUtil.getString(request, "thanhPhoDi"));
					httpReq.setRenderParameter("thanhPhoDen", ParamUtil.getString(request, "thanhPhoDen"));
					httpReq.setRenderParameter("benDi", ParamUtil.getString(request, "benDi"));
					httpReq.setRenderParameter("benDen", ParamUtil.getString(request, "benDen"));
					httpReq.setRenderParameter("cuLyVanChuyen", ParamUtil.getString(request, "cuLyVanChuyen"));
					httpReq.setRenderParameter("hanhTrinhChayXe", ParamUtil.getString(request, "hanhTrinhChayXe"));
					httpReq.setRenderParameter("listDiemDungNghi", ParamUtil.getString(request, "listDiemDungNghi"));
				}
				
				/** --------------------------------------------------PHU HIEU--------------------------------------------------*/
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);

		}
	
	public void luuNoiDungHoSo(ActionRequest request, ActionResponse httpReq) {
		
		_log.info("=================> action luuNoiDungHoSo==============");
		
		long idThuTucHanhChinh = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
		long idThanhPhanHoSo = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
		long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
		long userId = PortalUtil.getUserId(request);
		long doanhNghiepId = 0;
		
		String coQuanGui = ParamUtil.getString(request, "coQuanGui");
		String listNoiDungHoSo = ParamUtil.getString(request, Constants.DANH_SACH_NOI_DUNG_HO_SO);
		DnDoanhNghiepUser doanhNghiepUser = null;
		String noiDungXml = "";
		//luu ho so set lai orgid
		_log.info("---luuNoiDungHoSo--coQuanGui---MA------" + coQuanGui);
		_log.info("---luuNoiDungHoSo--idThuTucHanhChinh---" + idThuTucHanhChinh);
		
		try {
			long organizationId = DuongThuyUtil.getOrganizationIdByTTHC_DV(idThuTucHanhChinh, coQuanGui);
			
			_log.info("---luuNoiDungHoSo--coQuanGui---ID--" + organizationId);
			/*long organizationId = 0;
			if(user.getOrganizations().size() > 0){
				organizationId = user.getOrganizations().get(0).getOrganizationId();
			}*/
			doanhNghiepUser = DnDoanhNghiepUserLocalServiceUtil.findByUserId(userId);
			if (doanhNghiepUser != null) {
				doanhNghiepId = doanhNghiepUser.getNguoiLamThuTucId();
			}
			
			TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(idThuTucHanhChinh);
			_log.info("---luuNoiDungHoSo--thuTucHanhChinh---" + ((thuTucHanhChinh != null) ? thuTucHanhChinh.getLinhVucThuTuc() : "--NULL--"));
			
			noiDungXml = ParamUtil.getString(request, "noiDungXmml");
			
			_log.info("---luuNoiDungHoSo--noiDungXml--" + noiDungXml);
			
			TthcBieuMauHoSo bieuMauHoSo = null;
			List<TthcThanhPhanHoSoBieuMau> allThanhPhanHoSoBieuMau = TthcThanhPhanHoSoBieuMauLocalServiceUtil.findByThanhPhanHoSoId(idThanhPhanHoSo);
			if (allThanhPhanHoSoBieuMau != null && allThanhPhanHoSoBieuMau.size() > 0) {
				bieuMauHoSo = TthcBieuMauHoSoLocalServiceUtil.fetchTthcBieuMauHoSo(allThanhPhanHoSoBieuMau.get(0).getBieuMauHoSoId());
			}
			
			List<TthcNoidungHoSo> allNoidungHoSo = new ArrayList<TthcNoidungHoSo>();
			TthcNoidungHoSo noidungHoSo = new TthcNoidungHoSoImpl();
			
			if (bieuMauHoSo != null) {
				noidungHoSo.setBieuMauHoSoId(bieuMauHoSo.getId());
			}
			
			noidungHoSo.setThanhPhanHoSoId(idThanhPhanHoSo);
			noiDungXml = makeNoiDungXmlStandard(noiDungXml);
			
			_log.info("---luuNoiDungHoSo--noiDungXml sau khi build chuan--" + noiDungXml);
			
			noidungHoSo.setNoiDungXml(noiDungXml);
			noidungHoSo.setHoSoThuTucId(idHoSoThuTuc);
			if (doanhNghiepUser != null) {
				noidungHoSo.setNguoiTao(doanhNghiepUser.getUserId());
			}
			
			allNoidungHoSo.add(noidungHoSo);
			
			Map<String, String> mapKetQua =
				xuLyHoSoNhap(
					idHoSoThuTuc, Constants.DOANH_NGHIEP_TRANG_THAI_HO_SO_LUU_NHAP, Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DANG_TAO_ID, listNoiDungHoSo, allNoidungHoSo,
					idThuTucHanhChinh, userId, doanhNghiepId, organizationId);
			
			_log.info("---luuNoiDungHoSo--listNoiDungHoSo , noiDungHoSoId==" + mapKetQua.get(Constants.DANH_SACH_NOI_DUNG_HO_SO));
			_log.info("---luuNoiDungHoSo--hoSoId---" + mapKetQua.get("hoSoThuTucId"));
			_log.info("---luuNoiDungHoSo--listNoiDungHs---" + mapKetQua.get(Constants.DANH_SACH_NOI_DUNG_HO_SO));
			
			idHoSoThuTuc = ConvertUtil.convertToLong(mapKetQua.get("hoSoThuTucId"));
			listNoiDungHoSo = mapKetQua.get(Constants.DANH_SACH_NOI_DUNG_HO_SO);
			
			long idNoiDungHoSo = ConvertUtil.convertToLong(mapKetQua.get(Constants.DANH_SACH_NOI_DUNG_HO_SO).split(",")[1]);
			
			if (thuTucHanhChinh != null) {
				/**----START--------insert PHUONG TIEN LAO */
				if (Arrays.asList(Constants.TTHC_VIET_LAO_LIENVAN_PHUONGTIEN_PHI_THUONGMAI_ALL).contains(thuTucHanhChinh.getMaThuTuc().trim())) {
					String[] parameterPhuongTiens = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {});
					crudQlvtPhuongTienDangKyVietLao(parameterPhuongTiens, idNoiDungHoSo, idHoSoThuTuc);
					
				} else if (Arrays.asList(Constants.TTHC_VIET_LAO_LIENVAN_PHUONGTIEN_KINHDOANH_ALL).contains(thuTucHanhChinh.getMaThuTuc().trim())) {
					String[] parameterPhuongTiens = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {});
					crudQlvtPhuongTienDangKyVietLao(parameterPhuongTiens, idNoiDungHoSo, idHoSoThuTuc);
					
				} else if (Constants.TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_LOAI_ABCEFG_LAN_DAU.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
					String[] parameterPhuongTiens = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {});
					crudQlvtPhuongTienDangKyVietTrung(parameterPhuongTiens, idNoiDungHoSo, idHoSoThuTuc);
					
				} else if (Constants.TTHC_VIET_TQ_CAP_LAI_GPVT_A_E_HET_HAN.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
					String[] parameterPhuongTiens = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {});
					crudQlvtPhuongTienDangKyVietTrung(parameterPhuongTiens, idNoiDungHoSo, idHoSoThuTuc);
					
				} else if (Constants.TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_CONG_VU.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
					String[] parameterPhuongTiens = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {});
					crudQlvtPhuongTienDangKyVietTrung(parameterPhuongTiens, idNoiDungHoSo, idHoSoThuTuc);
				} else if (Constants.TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_LOAI_D.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
					String[] parameterPhuongTiens = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {});
					crudQlvtPhuongTienDangKyVietTrung(parameterPhuongTiens, idNoiDungHoSo, idHoSoThuTuc);
				} else if (Constants.TTHC_VIET_TQ_CAP_GIAY_GIOI_THIEU_DE_NGHI_CAP_PHEP_VAN_TAI_LOAI_D.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
					String[] parameterPhuongTiens = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {});
					crudQlvtPhuongTienDangKyVietTrung(parameterPhuongTiens, idNoiDungHoSo, idHoSoThuTuc);
					
				} else if (Constants.TTHC_VIET_TQ_CAP_LAI_GPVT_A_D_E_HONG_MAT.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
					String[] parameterPhuongTiens = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {});
					crudQlvtPhuongTienDangKyVietTrung(parameterPhuongTiens, idNoiDungHoSo, idHoSoThuTuc);
					
				} else if (Constants.TTHC_VIET_TQ_DANG_KY_KHAI_THAC_TUYEN.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
					_log.info("=======TTHC_VIET_TQ_DANG_KY_KHAI_THAC_TUYEN========" + thuTucHanhChinh.getMaThuTuc().trim());
					String[] parameterPhuongTiens = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {});
					_log.info("=======TTHC_VIET_TQ_DANG_KY_KHAI_THAC_TUYEN========" + parameterPhuongTiens);
					
					crudQlvtPhuongTienDangKyVietTrung(parameterPhuongTiens, idNoiDungHoSo, idHoSoThuTuc);
				} else if (Constants.TTHC_VIET_TQ_BO_SUNG_THAY_THE_PHUONG_TIEN_KHAI_THAC_TUYEN.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
					String[] parameterPhuongTiens = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {});
					crudQlvtPhuongTienDangKyVietTrung(parameterPhuongTiens, idNoiDungHoSo, idHoSoThuTuc);
					
				
				
					
				} else if (Arrays.asList(Constants.TTHC_VIET_CAM_TUYEN_ALL).contains(thuTucHanhChinh.getMaThuTuc().trim())) {
					_log.info("vao`======TTHC_VIET_CAM_TUYEN_ALL================" + thuTucHanhChinh.getMaThuTuc());
					String[] parameterPhuongTiens = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {});
					_log.info("vao`======parameterPhuongTiens================" + parameterPhuongTiens);
					crudQlvtPhuongTienDangKyVietCam(parameterPhuongTiens, idNoiDungHoSo, idHoSoThuTuc);
					
				} else if (Arrays.asList(Constants.TTHC_VIET_LAO_TUYEN_LIEN_VAN_ALL).contains(thuTucHanhChinh.getMaThuTuc().trim())) {
					_log.info("vao`======TTHC_VIET_LAO_TUYEN_LIEN_VAN_ALL================" + thuTucHanhChinh.getMaThuTuc());
					String[] parameterPhuongTiens = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {});
					_log.info("vao`======parameterPhuongTiens================" + parameterPhuongTiens);
					crudQlvtPhuongTienDangKyVietLao(parameterPhuongTiens, idNoiDungHoSo, idHoSoThuTuc);
					
				} else if (Arrays.asList(Constants.TTHC_VIET_CAM_LIENVAN_PHUONGTIEN_KINHDOANH_ALL).contains(thuTucHanhChinh.getMaThuTuc().trim()) ||
					Arrays.asList(Constants.TTHC_VIET_CAM_LIENVAN_PHUONGTIEN_PHI_THUONGMAI_ALL).contains(thuTucHanhChinh.getMaThuTuc().trim())) {
					String[] parameterPhuongTiens = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {});
					crudQlvtPhuongTienDangKyVietCam(parameterPhuongTiens, idNoiDungHoSo, idHoSoThuTuc);
					
					
				// ---------------- Các thủ tục hành chính về cấp phù hiệu
				} else if (Arrays.asList(Constants.TTHC_CAP_PHU_HIEU_ALL).contains(thuTucHanhChinh.getMaThuTuc().trim())) {
					_log.info("======TTHC_CAP_PHU_HIEU_ALL=====MaThuTuc===" + thuTucHanhChinh.getMaThuTuc());
					String[] parameterPhuongTiens = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {});
					crudQlvtPhuongTienCapPhuHieu(parameterPhuongTiens, idNoiDungHoSo, idHoSoThuTuc);
				
				// ----------------Các thủ tục hành chính về cấp biển hiệu
				} else if (Arrays.asList(Constants.TTHC_CAP_BIEN_HIEU_ALL).contains(thuTucHanhChinh.getMaThuTuc().trim())) {
					_log.info("======TTHC_CAP_BIEN_HIEU_ALL================" + thuTucHanhChinh.getMaThuTuc());
					
					String[] parameterPhuongTiens = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[] {});
					crudQlvtPhuongTienCapBienHieu(parameterPhuongTiens, idNoiDungHoSo, idHoSoThuTuc);
				}
				//------------------- Các thủ tục hành chính về Giấy phép kinh doanh vận tải bằng xe ô tô
				else if (Arrays.asList(Constants.TTHC_VANTAI_TRONGNUOC_VAN_TAI_OTO_ALL).contains(thuTucHanhChinh.getMaThuTuc().trim())) {
					_log.info("======TTHC_VANTAI_TRONGNUOC_VAN_TAI_OTO_ALL================" + thuTucHanhChinh.getMaThuTuc());
					
					String[] parameterLoaiHinhHoatDongs = ParamUtil.getParameterValues(request, "objectLoaiHinhHoatDong", new String[] {});
					crudQlvtLoaiHinhHoatDong(parameterLoaiHinhHoatDongs, idNoiDungHoSo, idHoSoThuTuc);
				}
				
				
			}
			String jspBack = "";
			
			if (thuTucHanhChinh != null) {
				if (thuTucHanhChinh.getLinhVucThuTuc().trim().contains(Constants.LVTT_VIET_NAM_CAMPUCHIA)) {
					jspBack = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamcampuchia/thanh_phan_ho_so.jsp";
					
				} else if (thuTucHanhChinh.getLinhVucThuTuc().trim().contains(Constants.LVTT_VIET_NAM_LAO)) {
					jspBack = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/thanh_phan_ho_so.jsp";
					
				} else if (thuTucHanhChinh.getLinhVucThuTuc().trim().contains(Constants.LVTT_VIET_NAM_CHINA)) {
					jspBack = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/thanh_phan_ho_so.jsp";
					
				} else if (thuTucHanhChinh.getLinhVucThuTuc().trim().contains(Constants.LVTT_PHU_HIEU)) {
					jspBack = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/phuhieu/thanh_phan_ho_so.jsp";

				}else if (thuTucHanhChinh.getLinhVucThuTuc().trim().contains(Constants.LVTT_BIEN_HIEU) ||
						thuTucHanhChinh.getLinhVucThuTuc().trim().contains(Constants.LVTT_BIEN_HIEU_MOI) ||
						thuTucHanhChinh.getLinhVucThuTuc().trim().contains(Constants.LVTT_BIEN_HIEU_LAI)) {

					jspBack = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/bienhieu/thanh_phan_ho_so.jsp";
				} else if (thuTucHanhChinh.getLinhVucThuTuc().trim().contains(Constants.LVTT_TN_VAN_TAI_OTO) ||
							thuTucHanhChinh.getLinhVucThuTuc().trim().contains(Constants.LVTT_TN_VAN_TAI_OTO_MOI) ||
							thuTucHanhChinh.getLinhVucThuTuc().trim().contains(Constants.LVTT_TN_VAN_TAI_OTO_LAI)) {
					
					jspBack = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/vantaioto/thanh_phan_ho_so.jsp";
				}
				
			}
			
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(idHoSoThuTuc));
			
			httpReq.setRenderParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(idThuTucHanhChinh));
			httpReq.setRenderParameter(Constants.DANH_SACH_NOI_DUNG_HO_SO, listNoiDungHoSo);
			_log.info("=========NoiDungXML TRUYEN DI===" + noiDungXml);
			httpReq.setRenderParameter(noiDungXml, noiDungXml);
			httpReq.setRenderParameter("jspPage", jspBack);
			
			SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	
	

	public void nopHoSo(ActionRequest request, ActionResponse httpReq) {
		_log.info("=================> action nopHoSo");
		
		long idThuTucHanhChinh = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
		long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
		DnDoanhNghiepUser doanhNghiepUser = null;
		long userId = 0;
		long doanhNghiepId = 0;
		long organizationId = 0;
		try {
			userId = PortalUtil.getUserId(request);
			organizationId = DuongBoConfigurationManager.getLongProp("organization_id", 0);
			doanhNghiepUser = DnDoanhNghiepUserLocalServiceUtil.findByUserId(userId);
			if (doanhNghiepUser != null) {
				doanhNghiepId = doanhNghiepUser.getNguoiLamThuTucId();
			}
			idHoSoThuTuc =xuLyHoSo( Constants.DOANH_NGHIEP_TRANG_THAI_HO_SO_CHO_TIEP_NHAN, Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_TIEP_NHAN, idHoSoThuTuc, 
									null, idThuTucHanhChinh, userId, doanhNghiepId, organizationId);
			//tao phieu xu ly
			TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(idHoSoThuTuc);
			if(Validator.isNotNull(hoSoThuTuc)){
				taoPhieuXuLy(hoSoThuTuc);
			}
			SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public long xuLyHoSo(
		String trangThaiHoSo, String maPhanNhomHoSo, long hoSoThuTucId, List<TthcNoidungHoSo> noidungHoSos, long idThuTucHanhChinh, long userId, long doanhNghiepId,
		long organizationId) {
		long id = 0;
		try {
			_log.info("-----------vao bussiness method: xuLyHoSo");
			TthcHoSoThuTuc hoSoThuTuc = null;
			TthcPhanNhomHoSo phanNhomHoSo = TthcPhanNhomHoSoLocalServiceUtil.findByMaPhanNhom(maPhanNhomHoSo.trim());
			if (phanNhomHoSo != null) {
				if (hoSoThuTucId > 0) {
					hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
					
					if(hoSoThuTuc.getTrangThaiHoSo().equalsIgnoreCase(Constants.DOANH_NGHIEP_TRANG_THAI_HO_SO_LUU_NHAP)) {
						hoSoThuTuc.setTrangThaiHoSo(Constants.DOANH_NGHIEP_TRANG_THAI_HO_SO_CHO_TIEP_NHAN);
					} else if(hoSoThuTuc.getTrangThaiHoSo().equalsIgnoreCase(Constants.DOANH_NGHIEP_TRANG_THAI_HO_SO_CHO_BO_SUNG)) {
						_log.info("-----------vao bussiness method: xuLyHoSo");
						hoSoThuTuc.setTrangThaiHoSo(Constants.DOANH_NGHIEP_TRANG_THAI_HO_SO_DANG_XU_LY);
						// Chuyen dich trang thai sang Xy.ly cua Can bo
						MotCuaBusiness motCuaBusiness = new MotCuaBusiness();
						MotCuaPhieuXuLy phieuXuLy = null;
						if(MotCuaPhieuXuLyLocalServiceUtil.findByHoSoThuTucId(hoSoThuTucId).size()>0){
							phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.findByHoSoThuTucId(hoSoThuTucId).get(0);
							List<MotCuaChuyenDichTrangThai> listEttDKDC = MotCuaChuyenDichTrangThaiLocalServiceUtil.findByKhoiTaoPhieuXuLy(phieuXuLy.getQuyTrinhThuTucId(), phieuXuLy.getTrangThaiHienTaiId());
							MotCuaChuyenDichTrangThai ettDKDC = null;
							if(listEttDKDC.size()>0){
								ettDKDC = listEttDKDC.get(0);
							}
							long dichChuyenTrangThaiPhieuSuLy =
									motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(
										phieuXuLy, Validator.isNotNull(ettDKDC)?ettDKDC.getDieuKienChuyenDich():StringPool.BLANK, userId, phieuXuLy.getQuyTrinhThuTucId(), StringPool.BLANK);
							phieuXuLy.setTrangThaiHienTaiId(dichChuyenTrangThaiPhieuSuLy);
							_log.info("===BO_SUNG_HO_SO===dichChuyenTrangThaiPhieuSuLy===" + listEttDKDC.size() + "===" + ettDKDC + "===dichChuyenTrangThaiPhieuSuLy===" + dichChuyenTrangThaiPhieuSuLy);
							MotCuaPhieuXuLyLocalServiceUtil.updateMotCuaPhieuXuLy(phieuXuLy);
						}
					}
					
					_log.info("===hoSoThuTuc===" + hoSoThuTuc.getId());
					_log.info("===TRANG_THAI_HO_SO===" + hoSoThuTuc.getTrangThaiHoSo());
					
					hoSoThuTuc.setPhanNhomHoSoId(phanNhomHoSo.getId());

					TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(hoSoThuTuc);
					id = hoSoThuTucId;
				} else {
					hoSoThuTuc = taoHoSo(idThuTucHanhChinh, userId, doanhNghiepId, organizationId, trangThaiHoSo, phanNhomHoSo.getId());
					id = hoSoThuTuc.getId();
				}
				//NghiepVuUtils.sendHoSoCanBo(hoSoThuTuc);
			}
			
		} catch (Exception e) {
			_log.error(e);
		}
		_log.info("hoSoThuTucId  " + id);
		return id;
	}
	
	public void luuNhapHoSo(ActionRequest request, ActionResponse httpReq) {
		_log.info("=================> action luuNhapHoSo");
		
		SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	private boolean crudQlvtPhuongTienDangKyVietLao(String[] parameterPhuongTiens, long idNoiDungHoSo, long idHoSoThuTuc) {
		try {
						
			if (parameterPhuongTiens.length > 0) {
				List<Long> lstIdPhuongTien = QlvtPhuongTienDangKyVietLaoLocalServiceUtil.findIdByNoiDungHoSoId(idNoiDungHoSo);
				if (lstIdPhuongTien == null) { lstIdPhuongTien = new ArrayList<Long>(); }
				
				for (String s : parameterPhuongTiens) {
					QlvtPhuongTienDangKyVietLao phuongTien = CommonUtils.passToPhuongTienVietLao(s);
					if (phuongTien != null) {
						phuongTien.setNoiDungHoSoId(idNoiDungHoSo);
						phuongTien.setHoSoThuTucId(idHoSoThuTuc);
						
						if (phuongTien.getId() != 0) {
							
							//remove nhung phuong tien update, nhung phuong tien con lai se bi delete
							if (lstIdPhuongTien.contains(phuongTien.getId())) {
								lstIdPhuongTien.remove(phuongTien.getId());
							}
							
							QlvtPhuongTienDangKyVietLaoLocalServiceUtil.updateQlvtPhuongTienDangKyVietLao(phuongTien);
						} else {
							phuongTien.setId(CounterLocalServiceUtil.increment(QlvtPhuongTienDangKyVietLao.class.getName()));
							QlvtPhuongTienDangKyVietLaoLocalServiceUtil.addQlvtPhuongTienDangKyVietLao(phuongTien);
						}
						
						
					}
				}
				
				//delete nhung phuong tien thua
				for (Long idLong : lstIdPhuongTien) {
					QlvtPhuongTienDangKyVietLaoLocalServiceUtil.deleteQlvtPhuongTienDangKyVietLao(idLong);
				}
				return true;
				
			} else {
				//delete toan bo huong tien
				boolean deleteAllByNoiDungHoSoId = QlvtPhuongTienDangKyVietLaoLocalServiceUtil.deleteAllByNoiDungHoSoId(idNoiDungHoSo);
				_log.info("---delete All By NoiDungHoSoId--" + deleteAllByNoiDungHoSoId);
			}
		} catch (Exception e) {
			_log.error(e);
			
		}
		return false;
	}
	
	private boolean crudQlvtPhuongTienDangKyVietCam(String[] parameterPhuongTiens, long idNoiDungHoSo, long idHoSoThuTuc) {
try {
			
			_log.info("vao`============crudQlvtPhuongTienDangKyVietCam===========");
			if (parameterPhuongTiens.length > 0) {
				_log.info("vao`============crudQlvtPhuongTienDangKyVietCam==========="+idNoiDungHoSo);
				List<Long> lstIdPhuongTien = QlvtPhuongTienDangKyVietCamLocalServiceUtil.findIdByNoiDungHoSoId(idNoiDungHoSo);
				if (lstIdPhuongTien == null) { lstIdPhuongTien = new ArrayList<Long>(); }
				
				for (String s : parameterPhuongTiens) {
					QlvtPhuongTienDangKyVietCam phuongTien = CommonUtils.passToPhuongTienVietCam2(s);
					if (phuongTien != null) {
						phuongTien.setNoiDungHoSoId(idNoiDungHoSo);
						phuongTien.setHoSoThuTucId(idHoSoThuTuc);
						if (phuongTien.getId() != 0) {
							
							//remove nhung phuong tien update, nhung phuong tien con lai se bi delete
							if (lstIdPhuongTien.contains(phuongTien.getId())) {
								lstIdPhuongTien.remove(phuongTien.getId());
							}
							_log.info("vao`============updateeee===========");
							QlvtPhuongTienDangKyVietCamLocalServiceUtil.updateQlvtPhuongTienDangKyVietCam(phuongTien);
						} else {
							
							_log.info("vao`============addd===========");
							phuongTien.setId(CounterLocalServiceUtil.increment(QlvtPhuongTienDangKyVietCam.class.getName()));
							QlvtPhuongTienDangKyVietCamLocalServiceUtil.addQlvtPhuongTienDangKyVietCam(phuongTien);
						}
						
						
					}
				}
				
				//delete nhung phuong tien thua
				for (Long idLong : lstIdPhuongTien) {
					QlvtPhuongTienDangKyVietCamLocalServiceUtil.deleteQlvtPhuongTienDangKyVietCam(idLong);
				}
				return true;
				
			} else {
				//delete toan bo huong tien
				boolean deleteAllByNoiDungHoSoId = QlvtPhuongTienDangKyVietCamLocalServiceUtil.deleteAllByNoiDungHoSoId(idNoiDungHoSo);
				_log.info("---delete All By NoiDungHoSoId--" + deleteAllByNoiDungHoSoId);
			}
		} catch (Exception e) {
			_log.error(e);
			
		}
		return false;
	}
	
	private boolean crudQlvtPhuongTienDangKyVietTrung(String[] parameterPhuongTiens, long idNoiDungHoSo, long idHoSoThuTuc) {
		try {
			_log.info("vao`============crudQlvtPhuongTienDangKyVietTrung===========");
			if (parameterPhuongTiens.length > 0) {
				_log.info("vao`============crudQlvtPhuongTienDangKyVietTrung===========" + idNoiDungHoSo);
				List<Long> lstIdPhuongTien = QlvtPhuongTienDangKyVietTrungLocalServiceUtil.findIdByNoiDungHoSoId(idNoiDungHoSo);
				if (lstIdPhuongTien == null) {
					lstIdPhuongTien = new ArrayList<Long>();
				}
				
				for (String s : parameterPhuongTiens) {
					QlvtPhuongTienDangKyVietTrung phuongTien = CommonUtils.passToPhuongTienVietTrung(s);
					if (phuongTien != null) {
						phuongTien.setNoiDungHoSoId(idNoiDungHoSo);
						phuongTien.setHoSoThuTucId(idHoSoThuTuc);
						if (phuongTien.getDiemDungDoDangKy() != null && phuongTien.getDiemDungDoDangKy().trim().length() > 0) {
							phuongTien.setDiemDungDoDangKy(phuongTien.getDiemDungDoDangKy().replace("#", ","));
						}
						
						if (phuongTien.getId() != 0) {
							
							//remove nhung phuong tien update, nhung phuong tien con lai se bi delete
							if (lstIdPhuongTien.contains(phuongTien.getId())) {
								lstIdPhuongTien.remove(phuongTien.getId());
							}
							
							QlvtPhuongTienDangKyVietTrungLocalServiceUtil.updateQlvtPhuongTienDangKyVietTrung(phuongTien);
						} else {
							phuongTien.setId(CounterLocalServiceUtil.increment(QlvtPhuongTienDangKyVietTrung.class.getName()));
							QlvtPhuongTienDangKyVietTrungLocalServiceUtil.addQlvtPhuongTienDangKyVietTrung(phuongTien);
						}
						
					}
				}
				
				//delete nhung phuong tien thua
				if (lstIdPhuongTien.size() > 0) {
					for (Long idLong : lstIdPhuongTien) {
						QlvtPhuongTienDangKyVietTrungLocalServiceUtil.deleteQlvtPhuongTienDangKyVietTrung(idLong);
					}
				}
				return true;
				
			} else {
				//delete toan bo huong tien
				boolean deleteAllByNoiDungHoSoId = QlvtPhuongTienDangKyVietTrungLocalServiceUtil.deleteAllByNoiDungHoSoId(idNoiDungHoSo);
				_log.info("---delete All By NoiDungHoSoId--" + deleteAllByNoiDungHoSoId);
			}
		} catch (Exception e) {
			_log.error(e);
			
		}
		return false;
	}
	
	private boolean crudQlvtPhuongTienCapPhuHieu(String[] parameterPhuongTiens, long idNoiDungHoSo, long idHoSoThuTuc) {
		try {
			if (parameterPhuongTiens.length > 0) {
				List<Long> lstIdPhuongTien = QlvtPhuongTienCapPhuHieuLocalServiceUtil.findIdNoiDungHoSoId(idNoiDungHoSo);
				if (lstIdPhuongTien == null) { lstIdPhuongTien = new ArrayList<Long>(); }
				
				for (String s : parameterPhuongTiens) {
					QlvtPhuongTienCapPhuHieu phuongTien = CommonUtils.passToPhuongTienPhuHieu(s);
					if (phuongTien != null) {
						phuongTien.setNoiDungHoSoId(idNoiDungHoSo);
						phuongTien.setHoSoThuTucId(idHoSoThuTuc);
						
						if (phuongTien.getId() != 0) {
							
							//remove nhung phuong tien update, nhung phuong tien con lai se bi delete
							if (lstIdPhuongTien.contains(phuongTien.getId())) {
								lstIdPhuongTien.remove(phuongTien.getId());
							}
							QlvtPhuongTienCapPhuHieuLocalServiceUtil.updateQlvtPhuongTienCapPhuHieu(phuongTien);
						} else {
							phuongTien.setId(CounterLocalServiceUtil.increment(QlvtPhuongTienDangKyVietTrung.class.getName()));
							QlvtPhuongTienCapPhuHieuLocalServiceUtil.addQlvtPhuongTienCapPhuHieu(phuongTien);
						}
						
						
					}
				}
				
				//delete nhung phuong tien thua
				for (Long idLong : lstIdPhuongTien) {
					QlvtPhuongTienDangKyVietTrungLocalServiceUtil.deleteQlvtPhuongTienDangKyVietTrung(idLong);
				}
				return true;
				
			} else {
				//delete toan bo huong tien
				boolean deleteAllByNoiDungHoSoId = QlvtPhuongTienDangKyVietTrungLocalServiceUtil.deleteAllByNoiDungHoSoId(idNoiDungHoSo);
				_log.info("---delete All By NoiDungHoSoId--" + deleteAllByNoiDungHoSoId);
			}
		} catch (Exception e) {
			_log.error(e);
			
		}
		return false;
	}
	
	
	
	
	
	private boolean crudQlvtPhuongTienCapBienHieu(String[] parameterPhuongTiens, long idNoiDungHoSo, long idHoSoThuTuc) {
		try {
			if (parameterPhuongTiens.length > 0) {
				
				_log.info("========vao`  crudQlvtPhuongTienCapBienHieu====");
				
				
				List<Long> lstIdPhuongTien = QlvtPhuongTienCapBienHieuLocalServiceUtil.findIdNoiDungHoSoId(idNoiDungHoSo);
				if (lstIdPhuongTien == null) { lstIdPhuongTien = new ArrayList<Long>(); }
				
				for (String s : parameterPhuongTiens) {
					QlvtPhuongTienCapBienHieu phuongTien = CommonUtils.passToPhuongTienBienHieu(s);
					if (phuongTien != null) {
						phuongTien.setNoiDungHoSoId(idNoiDungHoSo);
						phuongTien.setHoSoThuTucId(idHoSoThuTuc);
						if (phuongTien.getId() != 0) {
							//remove nhung phuong tien update, nhung phuong tien con lai se bi delete
							if (lstIdPhuongTien.contains(phuongTien.getId())) {
								lstIdPhuongTien.remove(phuongTien.getId());
							}
							QlvtPhuongTienCapBienHieuLocalServiceUtil.updateQlvtPhuongTienCapBienHieu(phuongTien);
						} else {
							phuongTien.setId(CounterLocalServiceUtil.increment(QlvtPhuongTienDangKyVietTrung.class.getName()));
							QlvtPhuongTienCapBienHieuLocalServiceUtil.addQlvtPhuongTienCapBienHieu(phuongTien);
						}
						
						
					}
				}
				
				//delete nhung phuong tien thua
				for (Long idLong : lstIdPhuongTien) {
					QlvtPhuongTienDangKyVietTrungLocalServiceUtil.deleteQlvtPhuongTienDangKyVietTrung(idLong);
				}
				return true;
				
			} else {
				//delete toan bo huong tien
				boolean deleteAllByNoiDungHoSoId = QlvtPhuongTienDangKyVietTrungLocalServiceUtil.deleteAllByNoiDungHoSoId(idNoiDungHoSo);
				_log.info("---delete All By NoiDungHoSoId--" + deleteAllByNoiDungHoSoId);
			}
		} catch (Exception e) {
			_log.error(e);
			
		}
		return false;
	}
	
	private boolean crudQlvtLoaiHinhHoatDong(String[] parameterLoaiHinhHoatDongs, long idNoiDungHoSo, long idHoSoThuTuc) {
		try {
			if (parameterLoaiHinhHoatDongs.length > 0) {
				
				_log.info("========vao`  crudQlvtLoaiHinhHoatDong====");
				
				
				List<Long> lstIdLoaiHinh = QlvtLoaiHinhHoatDongDnLocalServiceUtil.findIdNoiDungHoSoId(idNoiDungHoSo);
				if (lstIdLoaiHinh == null) { lstIdLoaiHinh = new ArrayList<Long>(); }
				_log.info("--lstIdLoaiHinh--before--size--" + lstIdLoaiHinh.size());
				
				for (String s : parameterLoaiHinhHoatDongs) {
					QlvtLoaiHinhHoatDongDn loaiHinh = CommonUtils.passToLoaiHinhHoatDong(s);
					if (loaiHinh != null) {
						loaiHinh.setNoiDungHoSoId(idNoiDungHoSo);
						loaiHinh.setHoSoThuTucId(idHoSoThuTuc);
						if (loaiHinh.getId() != 0) {
							//remove nhung phuong tien update, nhung phuong tien con lai se bi delete
							if (lstIdLoaiHinh.contains(loaiHinh.getId())) {
								lstIdLoaiHinh.remove(loaiHinh.getId());
							}
							QlvtLoaiHinhHoatDongDnLocalServiceUtil.updateQlvtLoaiHinhHoatDongDn(loaiHinh);
						} else {
							loaiHinh.setId(CounterLocalServiceUtil.increment(QlvtLoaiHinhHoatDongDn.class.getName()));
							QlvtLoaiHinhHoatDongDnLocalServiceUtil.addQlvtLoaiHinhHoatDongDn(loaiHinh);
						}
						
						
					}
				}
				
				_log.info("--lstIdLoaiHinh--after--size--" + lstIdLoaiHinh.size());
				System.out.print(lstIdLoaiHinh);
				//delete nhung phuong tien thua
				for (Long idLong : lstIdLoaiHinh) {
					QlvtLoaiHinhHoatDongDnLocalServiceUtil.deleteQlvtLoaiHinhHoatDongDn(idLong);
				}
				return true;
				
			} else {
				//delete toan bo huong tien
				boolean deleteAllByNoiDungHoSoId = QlvtLoaiHinhHoatDongDnLocalServiceUtil.deleteAllByNoiDungHoSoId(idNoiDungHoSo);
				_log.info("---delete All By NoiDungHoSoId--" + deleteAllByNoiDungHoSoId);
				return true;
			}
		} catch (Exception e) {
			_log.error(e);
			
		}
		return false;
		
	}
	
	private String makeNoiDungXmlStandard(String noiDungXml) {
		StringBuilder builder = new StringBuilder();
		builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		builder.append("<Envelope>");
		builder.append("<Header>");
		builder.append("</Header>");
		builder.append("<Body>");
		builder.append("<Content>");
		builder.append(noiDungXml);
		builder.append("</Content>");
		builder.append("</Body>");
		builder.append("</Envelope>");
		
		return builder.toString();
	}
	
	//copy
	public void taoPhieuXuLy(TthcHoSoThuTuc hoSoThuTuc) {
		try {
			_log.info("do tao phieu "+hoSoThuTuc.getId());
			MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC = MotCuaQuyTrinhThuTucTTHCLocalServiceUtil.findByThuTucHanhChinhID(hoSoThuTuc.getThuTucHanhChinhId()).get(0);
			_log.info("------------------motCuaQuyTrinhThuTucTTHC:"+motCuaQuyTrinhThuTucTTHC.getQuyTrinhThuTucId());
			_log.info("------------------hoSoThuTuc.getPhanNhomHoSoId():"+hoSoThuTuc.getPhanNhomHoSoId());
			MotCuaTrangThaiHoSo trangThaiHoSoBanDau = MotCuaTrangThaiHoSoLocalServiceUtil.findByQuyTrinhThuTucIdAndSoThuTu(motCuaQuyTrinhThuTucTTHC.getQuyTrinhThuTucId(), 1);
			_log.info("------------------trangThaiHoSoBanDau:"+trangThaiHoSoBanDau.getId());
			if (motCuaQuyTrinhThuTucTTHC != null && hoSoThuTuc.getPhanNhomHoSoId() == Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_TIEP_NHAN_ID) {
				MotCuaPhieuXuLy motCuaPhieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.findByHoSoThuTucIdAndQuyTrinhThuTucId(hoSoThuTuc.getId(), motCuaQuyTrinhThuTucTTHC.getQuyTrinhThuTucId());
				if (motCuaPhieuXuLy == null) {
					motCuaPhieuXuLy = new MotCuaPhieuXuLyImpl();
					MotCuaChuyenDichTrangThai ettDKDC = MotCuaChuyenDichTrangThaiLocalServiceUtil.fetchByTrangThaiNguonNull(motCuaQuyTrinhThuTucTTHC.getQuyTrinhThuTucId(), DuongBoConfigurationManager.getStrProp("dkdc.19DVC.nhan.ho.so", "Nhan.ho.so"));
					Long idMotCuaPhieuXuLy = CounterLocalServiceUtil.increment(MotCuaPhieuXuLy.class.getName());
					motCuaPhieuXuLy.setId(idMotCuaPhieuXuLy);
					motCuaPhieuXuLy.setHoSoThuTucId(hoSoThuTuc.getId());
					motCuaPhieuXuLy.setSoThuTu(0);
					motCuaPhieuXuLy.setTrangThaiHienTaiId(trangThaiHoSoBanDau.getId());
					motCuaPhieuXuLy.setQuyTrinhThuTucId(motCuaQuyTrinhThuTucTTHC.getQuyTrinhThuTucId());
					motCuaPhieuXuLy.setToChucQuanLy(hoSoThuTuc.getToChucQuanLy());
					motCuaPhieuXuLy.setPhanNhomHoSoId(ettDKDC.getPhanNhomHoSoId());
					
					MotCuaPhieuXuLyLocalServiceUtil.addMotCuaPhieuXuLy(motCuaPhieuXuLy);
				}
			}
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void thanhToanHSByUploadBill(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
		
		_log.info("vao action thanhToanHSByUploadBill");
		UploadPortletRequest request = PortalUtil.getUploadPortletRequest(actionRequest);
		
		long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
		long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
		String soHoaDon = ParamUtil.getString(request, "soHoaDon");
		
		try {
			TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.getTthcHoSoThuTuc(hoSoThuTucId);
			
			InputStream inputStream = request.getFileAsStream("attachment");
			String fileNameUpload = String.valueOf(request.getFileName("attachment"));
			
			_log.info("hoSoThuTucId: " + hoSoThuTucId);
			_log.info("thuTucHanhChinhId: " + thuTucHanhChinhId);
			_log.info("fileNameUpload: " + fileNameUpload);

			if (inputStream != null) {
				byte[] fileContent = DocumentUtils.getByteFromInputStream(inputStream);
				
				long userSystem = DuongBoConfigurationManager.getLongProp("DB-system-use-upload_file_system", 0);
				
				long idFileDinhKem = DocumentUtils.uploadTaiLieu(fileContent, userSystem, fileNameUpload);
				
				TthcXacNhanThanhToan xacNhanThanhToan = TthcXacNhanThanhToanLocalServiceUtil.findByMaTuSinh(hoSoThuTuc.getMaSoHoSo());
				
				KeyPayUtils.xacNhanThanhToanHoSo(xacNhanThanhToan.getId(), soHoaDon, idFileDinhKem, Constants.THANH_TOAN_CHUYEN_KHOAN);
			}
			
			_log.info("end business");
		} catch (Exception e) {
			_log.error(e);
		}
/*		httpReq.setRenderParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/thanh_phan_ho_so.jsp");
		httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(idHoSoThuTuc));
		httpReq.setRenderParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(idThuTucHanhChinh));
*/
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
	
	//upadte cong dan
	public void updateCongDan(ActionRequest actionRequest, ActionResponse actionResponse) {
		try{
			long nguoiLamThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_DOANH_NGHIEP);
			
			String maSoCongDan = ParamUtil.getString(actionRequest, "maSoCongDan");
			String gioiTinh = ParamUtil.getString(actionRequest, "gioiTinh");
			String quocTich = ParamUtil.getString(actionRequest, "quocTich");
			String tenCongDan = ParamUtil.getString(actionRequest, "tenCongDan");
			//String textCapNgay = ParamUtil.getString(request, "textCapNgay");
			//String coQuanCap = ParamUtil.getString(request, "coQuanCap");
			String soDienThoai = ParamUtil.getString(actionRequest, "soDienThoai");
			//String email = ParamUtil.getString(request, "email");
			String diaChi =ParamUtil.getString(actionRequest, "diaChi");
			
			DnDoanhNghiep dnDoanhNghiep = DnDoanhNghiepLocalServiceUtil.getDnDoanhNghiep(nguoiLamThuTucId);
			
			if(dnDoanhNghiep != null){
				dnDoanhNghiep.setTenCongDan(tenCongDan);
				dnDoanhNghiep.setMaSoCongDan(maSoCongDan);
				dnDoanhNghiep.setGioiTinh(gioiTinh);
				dnDoanhNghiep.setQuocTich(quocTich);
				dnDoanhNghiep.setDiaChi(diaChi);
				//dnDoanhNghiep.setEmail(email);
				dnDoanhNghiep.setDienThoai(soDienThoai);
				//dnDoanhNghiep.setNoiCapCMND(coQuanCap);
				//dnDoanhNghiep.setNgayCapCMND(FormatData.parseStringToDate(textCapNgay));
				dnDoanhNghiep = DnDoanhNghiepLocalServiceUtil.updateDnDoanhNghiep(dnDoanhNghiep);
			}
		
		} catch(Exception e){
			_log.error(e);
		}
		
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
	
}
