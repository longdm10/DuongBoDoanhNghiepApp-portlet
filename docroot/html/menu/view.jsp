<%@page import="vn.dtt.duongbo.portlet.menu.MenuAction"%>
<%@page import="vn.dtt.duongbo.portlet.menu.MenuConfiguration"%>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="java.util.List"%>
<%@ include file="/html/init.jsp"%>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java"%>
<%
	PortletPreferences resourcePrefsMenu = PortletPreferencesFactoryUtil.getPortletSetup(renderRequest);

Map<String,String> c=resourcePrefsMenu.getMap();

for(c.getKeys()){
	System.out.println("==========================================================> " + a);
}
	

	String menu = resourcePrefsMenu.getValue(MenuConfiguration.TRANG_MENU_CAN_BO, "");
	
	System.out.println("==========================================================> " + menu);
	
	LogFactoryUtil.getLog(MenuAction.class).info("==menu in menu/view.jsp==" + menu);
	
	if (MenuConfiguration.TRANG_MENU_DOANH_NGHIEP.compareToIgnoreCase(menu) == 0) {
		%>
		<jsp:include page="/html/menu/doanh_nghiep.jsp"></jsp:include>
		<%
	}else if (MenuConfiguration.TRANG_MENU_DUONG_BIEN.compareToIgnoreCase(menu) == 0) {
		%>
		<jsp:include page="/html/menudb/duong_bien.jsp"></jsp:include>
		<%
	}
%>
