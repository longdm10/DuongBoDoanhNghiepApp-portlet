<%@page import="vn.dtt.duongbo.portlet.menu.MenuConfiguration"%>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="com.liferay.portal.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Layout"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>

<%@ include file="/html/init.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String portletResource = ParamUtil.getString(request, "portletResource"); 
PortletPreferences resourcePrefs = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource);

String url_doanh_nghiep = resourcePrefs.getValue(MenuConfiguration.TRANG_GOI_CLICK_DOANH_NGHIEP, "");
String phanNhomHoSo = resourcePrefs.getValue(MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_DANG_KIEM_VIEN, "");
String url_can_bo = resourcePrefs.getValue(MenuConfiguration.TRANG_GOI_CLICK_CAN_BO, "");

String url_tra_cuu = resourcePrefs.getValue(MenuConfiguration.TRANG_GOI_CLICK_TRA_CUU, "");
String url_thong_ke = resourcePrefs.getValue(MenuConfiguration.TRANG_GOI_CLICK_THONG_KE, "");

String menu = resourcePrefs.getValue(MenuConfiguration.TRANG_MENU_CAN_BO, "");
%>
<form action="<liferay-portlet:actionURL portletConfiguration="true" />" method="post" name="<portlet:namespace />fm">
    <table>
        <tr>
            <td><liferay-ui:message key="vn.gt.dk.menu.config.tranggoitrangkhiclickmenudoanhnghiep"/></td>
            <td>
                <input id = "<portlet:namespace /><%=MenuConfiguration.TRANG_GOI_CLICK_DOANH_NGHIEP%>" name="<portlet:namespace /><%=MenuConfiguration.TRANG_GOI_CLICK_DOANH_NGHIEP%>" value="<%=url_doanh_nghiep%>"/>
            </td>
        </tr>
        <tr>
            <td><liferay-ui:message key="vn.gt.dk.menu.config.tranggoitrangkhiclickmenucanbo"/></td>
            <td>
                <input id = "<portlet:namespace /><%=MenuConfiguration.TRANG_GOI_CLICK_CAN_BO%>" name="<portlet:namespace /><%=MenuConfiguration.TRANG_GOI_CLICK_CAN_BO%>" value="<%=url_can_bo%>"/>
            </td>
        </tr>
        
        <tr>
            <td>Thống kê</td>
            <td>
                <input id = "<portlet:namespace /><%=MenuConfiguration.TRANG_GOI_CLICK_THONG_KE%>" name="<portlet:namespace /><%=MenuConfiguration.TRANG_GOI_CLICK_THONG_KE%>" value="<%=url_thong_ke%>"/>
            </td>
        </tr>
        <tr>
            <td>Tra cứu</td>
            <td>
                <input id = "<portlet:namespace /><%=MenuConfiguration.TRANG_GOI_CLICK_TRA_CUU%>" name="<portlet:namespace /><%=MenuConfiguration.TRANG_GOI_CLICK_TRA_CUU%>" value="<%=url_tra_cuu%>"/>
            </td>
        </tr>
        
        <tr>
            <td><liferay-ui:message key="vn.gt.dk.menu.config.phannhomhosokhiclickmenuquanlynhomdangkiemvien"/></td>
            <td>
                <input id = "<portlet:namespace /><%=MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_DANG_KIEM_VIEN%>" name="<portlet:namespace /><%=MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_DANG_KIEM_VIEN%>" value="<%=phanNhomHoSo%>"/>
            </td>
        </tr>
        
        <tr>
            <td>Loại menu</td>
            <td>
				<select name="<portlet:namespace /><%=MenuConfiguration.TRANG_MENU_CAN_BO %>" id = "<portlet:namespace /><%=MenuConfiguration.TRANG_MENU_CAN_BO %>">
					<option value="<%=MenuConfiguration.TRANG_MENU_CAN_BO%>"  <%= (MenuConfiguration.TRANG_MENU_CAN_BO.compareToIgnoreCase(menu) == 0) ? "selected" : "" %> >
				         Menu cán bộ
					</option>
					<option value="<%=MenuConfiguration.TRANG_MENU_DOANH_NGHIEP%>"  <%= (MenuConfiguration.TRANG_MENU_DOANH_NGHIEP.compareToIgnoreCase(menu) == 0) ? "selected" : "" %> >
				         Menu doanh nghiệp
					</option>
                </select>
            </td>
        </tr>
        
        <tr>
            <td colspan="2">
                <input type="submit" value="Ghi lại"/> 
            </td>
        </tr>
    </table>
</form>