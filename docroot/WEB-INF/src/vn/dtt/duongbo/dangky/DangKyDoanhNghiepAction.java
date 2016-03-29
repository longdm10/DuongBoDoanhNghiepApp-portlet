package vn.dtt.duongbo.dangky;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import vn.dtt.duongbo.dao.common.model.DmDataItem;
import vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep;
import vn.dtt.duongbo.portlet.DuongBoAction;
import vn.dtt.duongbo.utils.CommonUtils;

public class DangKyDoanhNghiepAction extends DuongBoAction {
	private Log _log = LogFactoryUtil.getLog(DangKyDoanhNghiepAction.class);

	public void dangKyDoanhNghiep(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException {
		
		if (CommonUtils.checkFromDate(actionRequest)) {
			return;
		}
		
		List<String> errors = new ArrayList<String>();
		
		DnDoanhNghiep nguoiLamThuTuc = DangKyDoanhNghiepActionUtil.dangKyDoanhNghiep(actionRequest, actionResponse, errors);
		
		if (errors.isEmpty()) {
			if (nguoiLamThuTuc != null) {
				DangKyDoanhNghiepActionUtil.sendMailDKDoanhNghiep(nguoiLamThuTuc);
			}
			
			String backURL = ParamUtil.getString(actionRequest, "backURL");
			
			actionResponse.sendRedirect(backURL);
		} else {
			for(String error : errors) {
				SessionErrors.add(actionRequest, error);
			}
			
			actionResponse.setRenderParameter("jspPage", "/html/dangkydoanhnghiep/view.jsp");
			actionResponse.setRenderParameter("defaultTab", ParamUtil.getString(actionRequest, "defaultTab"));
			actionResponse.setRenderParameter("type", ParamUtil.getString(actionRequest, "type"));
		}
		
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	public void dangKyCongDan(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException {
		
		_log.info("--------------dangKyCongDan=======" );
		
		if (CommonUtils.checkFromDate(actionRequest)) {
			return;
		}
		
		List<String> errors = new ArrayList<String>();
		
		DangKyDoanhNghiepActionUtil.dangKyCongDan(actionRequest, actionResponse, errors);
		
		if(errors.isEmpty()) {
			String backURL = ParamUtil.getString(actionRequest, "backURL");
			
			actionResponse.sendRedirect(backURL);
		} else {
			for(String error : errors) {
				SessionErrors.add(actionRequest, error);
			}
			
			actionResponse.setRenderParameter("jspPage", "/html/dangkydoanhnghiep/view.jsp");
			actionResponse.setRenderParameter("defaultTab", ParamUtil.getString(actionRequest, "defaultTab"));
			actionResponse.setRenderParameter("type", ParamUtil.getString(actionRequest, "type"));
		}
		
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	@Override
	public void serveResource(ResourceRequest request, ResourceResponse response) throws IOException, PortletException {
		
		String type = ParamUtil.getString(request, "type");
		
		if (type.endsWith("findQuanHuyenByTinhThanh")) {
			findQuanHuyenByTinhThanh(request, response);
		} else if (type.endsWith("findPhuongXaByQuanHuyen")) {
			findPhuongXaByQuanHuyen(request, response);
		}
	}
	
	public void findQuanHuyenByTinhThanh(ResourceRequest request, ResourceResponse response) {
		try {
			
			String code = ParamUtil.getString(request, "codeTinhThanh");
			
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
			PrintWriter out = response.getWriter();
			out.print(jsonArray.toString());
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void findPhuongXaByQuanHuyen(ResourceRequest request, ResourceResponse response) {
		try {
			
			String codeTinh = ParamUtil.getString(request, "codeTinhThanh");
			
			String codeQuan = ParamUtil.getString(request, "codeQuanHuyen");
			
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
			PrintWriter out = response.getWriter();
			out.print(jsonArray.toString());
		} catch (Exception e) {
			_log.error(e);
		}
	}
}
