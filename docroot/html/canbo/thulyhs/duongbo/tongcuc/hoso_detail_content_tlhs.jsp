<%@page import="vn.dtt.duongbo.portlet.canbo.CanBoAction"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongbo.utils.CommonUtils"%>
<%@page import="vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo"%>
<%@page import="vn.dtt.duongbo.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan"%>
<%@page import="vn.dtt.duongbo.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String xacNhanThanhToanId = ParamUtil.getString(request, "1123sad");
	String phieuXuLyId = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY);
	String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY);
	String jspPage = "/html/canbo/thulyhs/duongbo/tongcuc/";
	
	MotCuaPhieuXuLy motCuaPhieuXuLy = null;
	if (ConvertUtil.convertToLong(xacNhanThanhToanId) > 0) {
		TthcXacNhanThanhToan tXacNhanThanhToan = TthcXacNhanThanhToanLocalServiceUtil.fetchTthcXacNhanThanhToan(ConvertUtil.convertToLong(xacNhanThanhToanId));
		
		if (tXacNhanThanhToan != null) {
			if (tXacNhanThanhToan.getTrangThaiXacNhan() == Constants.MTYT_CHUA_XAC_NHAN_THANH_TOAN) {
				jspPage = jspPage + "/ketoan/xac_nhan_giao_dich.jsp";
			} else if (tXacNhanThanhToan.getTrangThaiXacNhan() == Constants.MTYT_CHUA_XAC_NHAN_THANH_TOAN) {
				jspPage = jspPage + "/ketoan/xem_thong_tin_xac_nhan.jsp";
			}
		}
	} else {
		motCuaPhieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.fetchMotCuaPhieuXuLy(ConvertUtil.convertToLong(phieuXuLyId));
	}
%>


<!-- -------/tongcuc/hoso_detail_content_tlhs.jsp---------------- -->

<div id="tabs-2" aria-labelledby="ui-id-2" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" style="display: block;" aria-hidden="false">
	<%
	try {
		if (motCuaPhieuXuLy != null) {
			MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = MotCuaTrangThaiHoSoLocalServiceUtil.findMotCuaTrangThaiHoSoById(motCuaPhieuXuLy.getTrangThaiHienTaiId());
			if (motCuaTrangThaiHoSo != null) {
				System.out.println("--hoso_detail_content_tlhs.jsp--phieuXuLyId--id--" + phieuXuLyId);
				if (1==1/*CommonUtils.checkRole(themeDisplay, motCuaTrangThaiHoSo)*/) {
					jspPage = jspPage + motCuaTrangThaiHoSo.getFormXuLy();
					%>
						<jsp:include page="<%=jspPage %>"></jsp:include>
					<%
				}
			}
		} else {
			%>
				<jsp:include page="<%=jspPage %>"></jsp:include>
			<%
		}
	} catch (Exception es) {
	}
	%>
</div>
