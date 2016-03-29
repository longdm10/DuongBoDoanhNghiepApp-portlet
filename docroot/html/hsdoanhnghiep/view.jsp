<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@ include file="/html/init.jsp"%>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java"%>

<%! private static Log _log = LogFactoryUtil.getLog("html_hsdoanhnghiep_view_jsp"); %>

<%

	String maPhanNhom = "";
	
	HttpSession httpSession = null;
	try {
		httpSession = PortalUtil.getHttpServletRequest(renderRequest).getSession();
	} catch (Exception es) {}
	
	
	if (httpSession != null) {
		Object obj = httpSession.getAttribute(Constants.MA_PHAN_NHOM_HO_SO);
		if (obj != null) {
			_log.info("===maPhanNhom in Session trong hsdoanhnghiep/view.jsp===" + obj.toString());
			maPhanNhom = obj.toString();
		} else {
			maPhanNhom = "";
		}
	}
	
	_log.info("===hsdoanhnghiep/view===maPhanNhom===" + maPhanNhom);
%>
<article class="PA0">
	<div class="PA0 col-xs-12">
	<%if (maPhanNhom.equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DANG_TAO)
			|| maPhanNhom.equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_TIEP_NHAN)
			|| maPhanNhom.equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DANG_XU_LY)
			|| maPhanNhom.equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_BO_SUNG)
			|| maPhanNhom.equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_THANH_TOAN)
			|| maPhanNhom.equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DA_TRA_KET_QUA)) {%>
		<jsp:include page="/html/hsdoanhnghiep/quanlyhoso/quan_ly_ho_so_search_content.jsp"></jsp:include>
		
	<%} else if (maPhanNhom.equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_DN_QLGT_RIENG) ||
				maPhanNhom.equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_DN_QLGT_CAP)) {%>
		<jsp:include page="/html/hsdoanhnghiep/quanlyfile/quan_ly_file_search_content.jsp"></jsp:include>
		
	<%} else if (maPhanNhom.equalsIgnoreCase(Constants.MA_PHAN_NHOM_QLTT_CA_NHAN)) {%>
		<jsp:include page="/html/hsdoanhnghiep/quanlythongtincanhan/view.jsp"></jsp:include>
		
	<%} else {%>
		<jsp:include page="/html/hsdoanhnghiep/thongtinhoso/danhsach_dichvucong_tructuyen.jsp"></jsp:include>
	<%}%>
	</div>
</article>
