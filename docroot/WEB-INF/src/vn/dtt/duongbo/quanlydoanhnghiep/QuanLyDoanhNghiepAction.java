package vn.dtt.duongbo.quanlydoanhnghiep;

import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import vn.dtt.duongbo.dangky.DangKyDoanhNghiepActionUtil;
import vn.dtt.duongbo.dangky.DangKyMessageErrors;
import vn.dtt.duongbo.dao.common.model.DmDataItem;
import vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep;
import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser;
import vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil;
import vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepUserLocalServiceUtil;
import vn.dtt.duongbo.portlet.DuongBoAction;
import vn.dtt.duongbo.utils.CommonUtils;
import vn.dtt.duongbo.utils.duongbo.UserDuongBo;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;

import vn.dtt.duongbo.business.Constants;

public class QuanLyDoanhNghiepAction extends DuongBoAction {

	private static Log _log = LogFactoryUtil.getLog(QuanLyDoanhNghiepAction.class);
	
	public void updateCongDan(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException {
		
		if (CommonUtils.checkFromDate(actionRequest)) {
			return;
		}
		
		long nguoiLamThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_DOANH_NGHIEP);
		
		List<String> errors = new ArrayList<String>();
		
		if(nguoiLamThuTucId > 0) {
			DangKyDoanhNghiepActionUtil.updateCongDan(actionRequest, actionResponse, errors);
		} else {
			DangKyDoanhNghiepActionUtil.dangKyCongDan(actionRequest, actionResponse, errors);
		}
		
		if(errors.isEmpty()) {
			
			String backURL = ParamUtil.getString(actionRequest, "backURL");
			
			actionResponse.sendRedirect(backURL);
		} else {
			for(String error : errors) {
				SessionErrors.add(actionRequest, error);
			}
			
			actionResponse.setRenderParameter("jspPage", "/html/quanlydoanhnghiep/edit_congdan.jsp");
		}
		
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	public void updateDoanhNghiep(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException {
		
		if (CommonUtils.checkFromDate(actionRequest)) {
			return;
		}
		
		long nguoiLamThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_DOANH_NGHIEP);
		
		List<String> errors = new ArrayList<String>();
		
		DnDoanhNghiep nguoiLamThuTuc = null;
		
		if(nguoiLamThuTucId > 0) {
			nguoiLamThuTuc = DangKyDoanhNghiepActionUtil.updateDoanhNghiep(actionRequest, actionResponse, errors);
		} else {
			nguoiLamThuTuc = DangKyDoanhNghiepActionUtil.dangKyDoanhNghiep(actionRequest, actionResponse, errors);
		}
		
		if(errors.isEmpty()) {
			if(nguoiLamThuTuc != null) {
				try{
					DangKyDoanhNghiepActionUtil.kichHoatDoanhNghiep(actionRequest, actionResponse);
				} catch(Exception e){
					SessionErrors.add(actionRequest, DangKyMessageErrors.ERROR_ACTIVE);
					_log.error(e);
				}
			}
			
			String backURL = ParamUtil.getString(actionRequest, "backURL");
			
			actionResponse.sendRedirect(backURL);
		} else {
			for(String error : errors) {
				SessionErrors.add(actionRequest, error);
			}
			
			actionResponse.setRenderParameter("jspPage", "/html/quanlydoanhnghiep/edit_doanhnghiep.jsp");
		}
		
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	public void kichHoatDoanhNghiep(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException {
		if (CommonUtils.checkFromDate(actionRequest)) {
			return;
		}
		
		try{
			DangKyDoanhNghiepActionUtil.kichHoatDoanhNghiep(actionRequest, actionResponse);
		} catch(Exception e){
			SessionErrors.add(actionRequest, DangKyMessageErrors.ERROR_ACTIVE);
			_log.error(e);
		}
		
		String backURL = ParamUtil.getString(actionRequest, "backURL");
		
		actionResponse.sendRedirect(backURL);
		
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	public void dungHoatDong(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException {
		try {
			UserDuongBo userUtil = new UserDuongBo();
			DnDoanhNghiepUser dnDoanhNghiepUser = null;
			long nguoiLamThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_DOANH_NGHIEP);
			List<DnDoanhNghiepUser> alldnDoanhNghiepUser = DnDoanhNghiepUserLocalServiceUtil.findByDnNguoiLamThuTucUserID(nguoiLamThuTucId);
			
			if(alldnDoanhNghiepUser!=null && alldnDoanhNghiepUser.size()>0){
				for(int i=0; i< alldnDoanhNghiepUser.size(); i++){
					dnDoanhNghiepUser = alldnDoanhNghiepUser.get(i);
					dnDoanhNghiepUser.getUserId();
					userUtil.blockUser(dnDoanhNghiepUser.getUserId());
					dnDoanhNghiepUser.setTinhTrangHoatDong(Constants.TRANG_THAI_DUNG_HOAT_DONG);
					
					DnDoanhNghiepUserLocalServiceUtil.updateDnDoanhNghiepUser(dnDoanhNghiepUser);
					
					DangKyDoanhNghiepActionUtil.sendMailInActiveDoanhNghiep(dnDoanhNghiepUser.getNguoiLamThuTucId());
				}
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		String backURL = ParamUtil.getString(actionRequest, "backURL");
		
		actionResponse.sendRedirect(backURL);
		
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	public void kickHoatLai(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException {
		try {
			UserDuongBo userUtil = new UserDuongBo();
			DnDoanhNghiepUser dnDoanhNghiepUser = null;
			long nguoiLamThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_DOANH_NGHIEP);
			List<DnDoanhNghiepUser> alldnDoanhNghiepUser = DnDoanhNghiepUserLocalServiceUtil.findByDnNguoiLamThuTucUserID(nguoiLamThuTucId);
			
			if(alldnDoanhNghiepUser!=null && alldnDoanhNghiepUser.size()>0){
				for(int i=0;i<alldnDoanhNghiepUser.size();i++){
					dnDoanhNghiepUser = alldnDoanhNghiepUser.get(i);
					
					dnDoanhNghiepUser.getUserId();
					userUtil.activeUser(dnDoanhNghiepUser.getUserId());
					
					dnDoanhNghiepUser.setTinhTrangHoatDong(Constants.TRANG_THAI_HOAT_DONG);
					
					DnDoanhNghiepUserLocalServiceUtil.updateDnDoanhNghiepUser(dnDoanhNghiepUser);
					
					DangKyDoanhNghiepActionUtil.sendMailActiveDoanhNghiep(dnDoanhNghiepUser.getNguoiLamThuTucId());
				}
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		String backURL = ParamUtil.getString(actionRequest, "backURL");
		
		actionResponse.sendRedirect(backURL);
		
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	public void xoaDoanhNghiep(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException {
		try{
			long nguoiLamThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_DOANH_NGHIEP);
			
			UserDuongBo userUtil = new UserDuongBo();
			
			List<DnDoanhNghiepUser> listNguoiLamThuTucUser = DnDoanhNghiepUserLocalServiceUtil.findByDnNguoiLamThuTucUserID(nguoiLamThuTucId);
			
			if(listNguoiLamThuTucUser != null && listNguoiLamThuTucUser.size() > 0){
				for(DnDoanhNghiepUser nguoiLamThuTucUser : listNguoiLamThuTucUser) {
					userUtil.deletePortalUser(nguoiLamThuTucUser.getUserId());
					
					nguoiLamThuTucUser.setTinhTrangHoatDong(Constants.TRANG_THAI_DA_XOA);
					
					DnDoanhNghiepUserLocalServiceUtil.updateDnDoanhNghiepUser(nguoiLamThuTucUser);
				}
			} else {
				// Da tao tk doanh nghiep nhung Chua kich hoat
				
				DnDoanhNghiepLocalServiceUtil.deleteDnDoanhNghiep(nguoiLamThuTucId);
			}
		} catch(Exception e){
			_log.error(e);
		}
		
		String backURL = ParamUtil.getString(actionRequest, "backURL");
		
		actionResponse.sendRedirect(backURL);
		
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	public void updatePassword(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException {
		try {
			long nguoiLamThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_DOANH_NGHIEP);
			String matKhau = ParamUtil.getString(actionRequest, "matKhau");
			UserDuongBo userUtil = new UserDuongBo();
			
			List<DnDoanhNghiepUser> alldnDoanhNghiepUser = DnDoanhNghiepUserLocalServiceUtil.findByDnNguoiLamThuTucUserID(nguoiLamThuTucId);
			
			if(alldnDoanhNghiepUser!=null){
				userUtil.updatePass(alldnDoanhNghiepUser.get(0).getUserId(), matKhau);
			}
			
		} catch (Exception e) {
			_log.error(e);
		}
		
		String backURL = ParamUtil.getString(actionRequest, "backURL");
		
		actionResponse.sendRedirect(backURL);
		
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	@Override
	public void serveResource(ResourceRequest actionRequest, ResourceResponse actionResponse) throws IOException, PortletException {
		
		String type = ParamUtil.getString(actionRequest, "type");
		
		if (type.endsWith("findQuanHuyenByTinhThanh")) {
			findQuanHuyenByTinhThanh(actionRequest, actionResponse);
		} else if (type.endsWith("findPhuongXaByQuanHuyen")) {
			findPhuongXaByQuanHuyen(actionRequest, actionResponse);
		}
		
	}
	
	public void findQuanHuyenByTinhThanh(ResourceRequest actionRequest, ResourceResponse actionResponse) {
		try {
			
			String code = ParamUtil.getString(actionRequest, "codeTinhThanh");
			
			JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
			JSONObject obj = null;
			
			List<DmDataItem> lstQuanHuyen = DmDataItemLocalServiceUtil.findQuanHuyenByMaTinhThanh(code);
			if (lstQuanHuyen != null && lstQuanHuyen.size() > 0) {
				for (DmDataItem quanHuyen : lstQuanHuyen) {
					obj = JSONFactoryUtil.createJSONObject();
					obj.put("code", quanHuyen.getCode());
					obj.put("name", quanHuyen.getName());
					jsonArray.put(obj);
				}
			}
			PrintWriter out = actionResponse.getWriter();
			out.print(jsonArray.toString());
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void findPhuongXaByQuanHuyen(ResourceRequest actionRequest, ResourceResponse actionResponse) {
		try {
			
			String codeTinh = ParamUtil.getString(actionRequest, "codeTinhThanh");
			String codeQuan = ParamUtil.getString(actionRequest, "codeQuanHuyen");
			
			JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
			JSONObject obj = null;
			
			List<DmDataItem> lstPhuongXa = DmDataItemLocalServiceUtil.findPhuongXaByMaTinhThanMaQuanHuyen(codeTinh, codeQuan);
			if (lstPhuongXa != null && lstPhuongXa.size() > 0) {
				for (DmDataItem quanHuyen : lstPhuongXa) {
					obj = JSONFactoryUtil.createJSONObject();
					obj.put("code", quanHuyen.getCode());
					obj.put("name", quanHuyen.getName());
					jsonArray.put(obj);
				}
			}
			PrintWriter out = actionResponse.getWriter();
			out.print(jsonArray.toString());
		} catch (Exception e) {
			_log.error(e);
		}
	}
}
