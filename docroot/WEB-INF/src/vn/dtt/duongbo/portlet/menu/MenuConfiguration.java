/**
 * 
 */

package vn.dtt.duongbo.portlet.menu;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import vn.dtt.duongbo.business.Constants;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portlet.PortletPreferencesFactoryUtil;

/**
 * @author win_64
 *
 */
public class MenuConfiguration implements ConfigurationAction {
	
	public static final String PHAN_NHOM_HO_SO_SETTING_DANG_KIEM_VIEN = "PHAN_NHOM_HO_SO_SETTING_DANG_KIEM_VIEN";
	
	public static final String TRANG_GOI_CLICK_THONG_TIN_DOANH_NGHIEP = "TRANG_GOI_CLICK_THONG_TIN_DOANH_NGHIEP";
	public static final String TRANG_GOI_CLICK_QUAN_LY_TAI_KHOAN_PHU = "TRANG_GOI_CLICK_QUAN_LY_TAI_KHOAN_PHU";
	
	public static final String TRANG_GOI_CLICK_CAN_BO = "TRANG_GOI_CLICK_CAN_BO";
	public static final String TRANG_GOI_CLICK_DOANH_NGHIEP = "TRANG_GOI_CLICK_DOANH_NGHIEP";
	public static final String TRANG_MENU_DOANH_NGHIEP = "TRANG_MENU_DOANH_NGHIEP";
	public static final String TRANG_MENU_CAN_BO = "TRANG_MENU_CAN_BO";
	public static final String TRANG_MENU_DUONG_BIEN = "TRANG_MENU_DUONG_BIEN";
	
	public static final String TRANG_GOI_CLICK_TRA_CUU = "TRANG_GOI_CLICK_TRA_CUU";
	public static final String TRANG_GOI_CLICK_THONG_KE = "TRANG_GOI_CLICK_THONG_KE";
	
	
	private Log _log = LogFactoryUtil.getLog(MenuConfiguration.class);
	
	@Override
	public void processAction(PortletConfig portletConfig, ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {
		
		_log.info("--processAction--");
		
		String portletResource = ParamUtil.getString(actionRequest, "portletResource");
		PortletPreferences prefs = PortletPreferencesFactoryUtil.getPortletSetup(actionRequest, portletResource);
		String valueJsp = ParamUtil.getString(actionRequest, Constants.RETURN_URL, "");
		
		String url_dang_kiem_vien = ParamUtil.getString(actionRequest, MenuConfiguration.TRANG_GOI_CLICK_CAN_BO, "");
		String phanNhomHoSo = ParamUtil.getString(actionRequest, MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_DANG_KIEM_VIEN, "");
		String trangGoiTraCuuDangKiemVien = ParamUtil.getString(actionRequest, MenuConfiguration.TRANG_GOI_CLICK_DOANH_NGHIEP, "");
		String menu = ParamUtil.getString(actionRequest, MenuConfiguration.TRANG_MENU_CAN_BO, "");
		
		String url_tra_cuu = ParamUtil.getString(actionRequest, MenuConfiguration.TRANG_GOI_CLICK_TRA_CUU, "");
		String url_thong_ke = ParamUtil.getString(actionRequest, MenuConfiguration.TRANG_GOI_CLICK_THONG_KE, "");
		
		prefs.setValue(Constants.RETURN_URL, valueJsp);
		prefs.setValue(MenuConfiguration.TRANG_GOI_CLICK_CAN_BO, url_dang_kiem_vien);
		prefs.setValue(MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_DANG_KIEM_VIEN, phanNhomHoSo);
		prefs.setValue(MenuConfiguration.TRANG_GOI_CLICK_DOANH_NGHIEP, trangGoiTraCuuDangKiemVien);
		prefs.setValue(MenuConfiguration.TRANG_MENU_CAN_BO, menu);
		prefs.setValue(MenuConfiguration.TRANG_GOI_CLICK_TRA_CUU, url_tra_cuu);
		prefs.setValue(MenuConfiguration.TRANG_GOI_CLICK_THONG_KE, url_thong_ke);
		prefs.store();
	}
	
	@Override
	public String render(PortletConfig arg0, RenderRequest request, RenderResponse response) throws Exception {
		return "/html/menu/config.jsp";
	}
}
