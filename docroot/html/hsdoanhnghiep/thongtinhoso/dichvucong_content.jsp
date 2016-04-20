<%@page import="javax.portlet.PortletURL"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongthuy.business.DuongThuyUtil"%>
<%@page import="vn.dtt.duongthuy.business.DTConstants"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%
	if (linhVucThuTuc.getCode().trim().contains(Constants.LVTT_VIET_NAM_CAMPUCHIA)) {
		thanhPhanHoSoJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamcampuchia/thanh_phan_ho_so.jsp";
	} else if (linhVucThuTuc.getCode().trim().contains(Constants.LVTT_VIET_NAM_LAO)) {
		thanhPhanHoSoJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/thanh_phan_ho_so.jsp";
	} else if (linhVucThuTuc.getCode().trim().contains(Constants.LVTT_VIET_NAM_CHINA)) {
		thanhPhanHoSoJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/thanh_phan_ho_so.jsp";
	} else if (linhVucThuTuc.getCode().trim().contains(Constants.LVTT_BIEN_HIEU)) {
		thanhPhanHoSoJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/bienhieu/thanh_phan_ho_so.jsp";
	}else if (linhVucThuTuc.getCode().trim().contains(Constants.LVTT_PHU_HIEU)) {
		thanhPhanHoSoJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/phuhieu/thanh_phan_ho_so.jsp";
	}else if (linhVucThuTuc.getCode().trim().contains(Constants.LVTT_GIAY_PHEP_KD_VT)) {
		thanhPhanHoSoJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/vantaioto/thanh_phan_ho_so.jsp";
	} else if (linhVucThuTuc.getCode().trim().startsWith(DTConstants.LINH_VUC_DT_CODE_PREFIX)) {
		thanhPhanHoSoJsp = "/html/hsdoanhnghiep/thongtinhoso/duongthuy/thanh_phan_ho_so.jsp";
	}

	//_log.info("===dichvucong_content_jsp_linhVucThuTuc.getCode(): " + linhVucThuTuc.getCode());
	%>
	<p class="outer space"><b><i class="m-symbol fa fa-plus-square-o" style="margin-right:5px"></i><%=linhVucThuTuc.getNode3()%> <%=linhVucThuTuc.getName() %></b></b></p>
	<div class="ML20 m-panel" style="background-color: #EAF1F7;">
	<%
	allThuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.findByLinhVucThuTuc(linhVucThuTuc.getCode());
	
	if (allThuTucHanhChinh == null) { allThuTucHanhChinh = new ArrayList<TthcThuTucHanhChinh>(); }
	
	List<Long> listTTHCByDoiTuongThucHien = DuongThuyUtil.getListTTHCByUserId(themeDisplay.getUserId());
	
	for (int h = 0; h < allThuTucHanhChinh.size(); h++) {
		thuTucHanhChinh = allThuTucHanhChinh.get(h);
		String thanhPhanDuLieuHoSo = null;
		
		if(listTTHCByDoiTuongThucHien.contains(thuTucHanhChinh.getId())) {
			PortletURL thanhPhanDuLieuHoSoURL = renderResponse.createRenderURL();
			thanhPhanDuLieuHoSoURL.setParameter("jspPage", thanhPhanHoSoJsp);
			thanhPhanDuLieuHoSoURL.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinh.getId()));
			
			thanhPhanDuLieuHoSo = thanhPhanDuLieuHoSoURL.toString();
		} else {
			thanhPhanDuLieuHoSo = "javascript:void(0);";
		}
	%>			
		<c:choose>
				<c:when test="<%= thuTucHanhChinh.getId() == 91 %>" >
					<p><a href="http://capphep.viwa.gov.vn/dangkyvao?uid=<%=user.getEmailAddress() %>"><%=linhVucThuTuc.getNode3() + "." + (h+1) + "."%> <%=thuTucHanhChinh.getTenThuTuc()%></a></p>
				</c:when>
				<c:when test="<%= thuTucHanhChinh.getId() == 90 %>" >
					<p><a href="http://capphep.viwa.gov.vn/dangkyroi?uid=<%=user.getEmailAddress() %>"><%=linhVucThuTuc.getNode3() + "." + (h+1) + "."%> <%=thuTucHanhChinh.getTenThuTuc()%></a></p>
				</c:when>
				<c:when test="<%= thuTucHanhChinh.getId() == 93 %>" >
					<%
					String url1 = "/group/doanh-nghiep/ho-so-vao-cang-bien";
					%>
					<p><a href="<%=url1 %>"  class="textsub list-group-item"><%=linhVucThuTuc.getNode3() + "." + (h+1) + "."%> <%=thuTucHanhChinh.getTenThuTuc()%></a></p>
				</c:when>
				<c:when test="<%= thuTucHanhChinh.getId() == 92 %>" >
					<%
					String url2 = "/group/doanh-nghiep/ho-so-roi-cang-bien";
					%>
					<p><a href="<%=url2 %>"  class="textsub list-group-item"><%=linhVucThuTuc.getNode3() + "." + (h+1) + "."%> <%=thuTucHanhChinh.getTenThuTuc()%></a></p>
				</c:when>
				<c:otherwise>
					<p><a href="<%=thanhPhanDuLieuHoSo.toString()%>"><%=linhVucThuTuc.getNode3() + "." + (h+1) + "."%> <%=thuTucHanhChinh.getTenThuTuc()%></a></p>
				</c:otherwise>
		</c:choose>
		
<%
	}
%>
	</div>
