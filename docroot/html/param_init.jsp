<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="vn.dtt.duongbo.portlet.canbo.CanBoAction"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="vn.dtt.duongbo.business.DanhMucConstants"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="vn.dtt.form.util.FormUtil"%>
<%@page import="java.util.Map"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	String idThuTucHanhChinh = ParamUtil.getString(request, Constants.ID_THU_TUC_HANH_CHINH);
	String hoSoThuTucId = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
	String phieuXuLyId = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY);
	String quyTrinhThuTucId = ParamUtil.getString(request, Constants.ID_QUY_TRINH_THU_TUC);
	String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY);
	String canBoXuLyId = ParamUtil.getString(request, "canBoXuLyId");
	String maThuTucHanhChinh = ParamUtil.getString(request, Constants.MA_THU_TUC_HANH_CHINH);
	String orgId = ParamUtil.getString(request, "organizationId");
	String keyKetQuaThamTra = ParamUtil.getString(request, "keyKetQuaThamTra");
	LogFactoryUtil.getLog(CanBoAction.class).info("--//***********************Current URL***********************//--" + this.getClass().getName().substring(this.getClass().getName().indexOf("html"), this.getClass().getName().lastIndexOf(".")+1) + this.getClass().getSimpleName().replaceAll("_", ".").replaceAll("005f", StringPool.BLANK));
%>
<portlet:actionURL var="chuyenDich_chuyenXuLyURL" name="chuyenDich_chuyenXuLy" />
<liferay-portlet:renderURL var="reTurnHomeURL" >
<liferay-portlet:param name="mvcPath" value="/html/canbo/view.jsp"/>
</liferay-portlet:renderURL>
<%!
	private Log _log = LogFactoryUtil.getLog(this.getClass().getName().substring(this.getClass().getName().indexOf("html"), this.getClass().getName().lastIndexOf(".")+1) + this.getClass().getSimpleName().replaceAll("_", ".").replaceAll("005f", StringPool.BLANK));
%>