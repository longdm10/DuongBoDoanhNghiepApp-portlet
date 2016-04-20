/**
 * 
 */
package vn.dtt.duongbo.portlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh;
import vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * @author Administrator
 *
 */
public class DuongBoAction extends MVCPortlet {
	
	 private Log log = LogFactoryUtil.getLog(DuongBoAction.class);

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws IOException, PortletException {
		
		String type = ParamUtil.getString(resourceRequest, "type");
		
		if (type.endsWith("findThuTucHanhChinhByCodeLinhVucThuTuc")) {
			findThuTucHanhChinhByCodeLinhVucThuTuc(resourceRequest, resourceResponse);
		}
	}
	
	//call ajax tim kiem thuTucHanhChinh theo code linh vuc thu tuc
	public void findThuTucHanhChinhByCodeLinhVucThuTuc(ResourceRequest request, ResourceResponse response) {
		try {
			
			String code = ParamUtil.getString(request, "codeLinhVucThuTuc");
			log.info("findThuTucHanhChinhByCodeLinhVucThuTuc==" + code);
			
			JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
			JSONObject obj = null;
			
			List<TthcThuTucHanhChinh> lstLinhVucThuTuc = TthcThuTucHanhChinhLocalServiceUtil.findByLinhVucThuTuc(code);
			if (lstLinhVucThuTuc != null && lstLinhVucThuTuc.size() > 0) {
				for (TthcThuTucHanhChinh tthc : lstLinhVucThuTuc) {
					obj = JSONFactoryUtil.createJSONObject();
					obj.put("id", tthc.getId());
					obj.put("name", tthc.getTenThuTuc());
					obj.put("ma", tthc.getMaThuTuc());
					jsonArray.put(obj);
				}
			}
			PrintWriter out = response.getWriter();
			log.info(jsonArray.toString());
			out.print(jsonArray.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
