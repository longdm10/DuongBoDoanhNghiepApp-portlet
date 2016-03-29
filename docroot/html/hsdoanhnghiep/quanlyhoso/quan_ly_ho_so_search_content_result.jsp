<%@page import="vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcTrangThaiHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcTrangThaiHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.utils.format.FormatData"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepUserLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ include file="/html/init.jsp"%>

<%
	List<TthcHoSoThuTuc> resultsHoSoThuTuc = null;
	TthcPhanNhomHoSo phanNhomHoSo = TthcPhanNhomHoSoLocalServiceUtil.getByMaPhanNhom(maPhanNhomHoSo);
	String tenLinhVuc = "";
	String tenThuTucHanhChinh = "";
	String phanNhomTrangThaiHoSoCodeGroup = "";
	
	if(maPhanNhomHoSo.trim().equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DANG_TAO)){
		phanNhomTrangThaiHoSoCodeGroup = "'DN_DT'";
	} else if(maPhanNhomHoSo.trim().equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_TIEP_NHAN)){
		phanNhomTrangThaiHoSoCodeGroup = "'DN_CTN'";
	} else if(maPhanNhomHoSo.trim().equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DANG_XU_LY)){
		phanNhomTrangThaiHoSoCodeGroup = "'DN_DXL'";
	} else if(maPhanNhomHoSo.trim().equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_BO_SUNG)){
		phanNhomTrangThaiHoSoCodeGroup = "'DN_CBS'";
	} else if(maPhanNhomHoSo.trim().equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_THANH_TOAN)){
		phanNhomTrangThaiHoSoCodeGroup = "'DN_CTT'";
	} else if(maPhanNhomHoSo.trim().equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DA_TRA_KET_QUA)){
		phanNhomTrangThaiHoSoCodeGroup = "'DN_HT'";
	}
	 
	PortletURL renderHoSoChoTiepNhan = renderResponse.createRenderURL();
	renderHoSoChoTiepNhan.setParameter("jspPage", "/html/hsdoanhnghiep/quanlyhoso/quan_ly_ho_so_search_content.jsp");
	renderHoSoChoTiepNhan.setParameter(Constants.CODE_LINH_VUC_THU_TUC, String.valueOf(selLinhVucThuTuc));
	renderHoSoChoTiepNhan.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	renderHoSoChoTiepNhan.setParameter(Constants.MA_BIEN_NHAN, maBienNhan);
	
	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 15, renderHoSoChoTiepNhan, null, null);
	
	long longTotal = 0;
	
	if (userLoginId > 0) {
		DnDoanhNghiepUser doanhNghiepUser = DnDoanhNghiepUserLocalServiceUtil.findByUserId(userLoginId);
		long doanhNghiepId = 0;
		if(doanhNghiepUser != null){
			doanhNghiepId = doanhNghiepUser.getNguoiLamThuTucId();
		}
		
		String trangThaiHoSo = "";
		
		if(thuTucHanhChinhId.trim().length() == 0){
			if(selLinhVucThuTuc.trim().length() >0){
				DmDataItem linhVuc1 = DmDataItemLocalServiceUtil.findByGroupIdAndCode(Constants.DM_LINH_VUC_TTHC, selLinhVucThuTuc.trim());
				if(linhVuc1 != null){
					if(allThuTucHanhChinh != null && allThuTucHanhChinh.size() > 0){
						for (TthcThuTucHanhChinh item : allThuTucHanhChinh) {
							thuTucHanhChinhId = thuTucHanhChinhId + item.getId() + ",";
						}
						thuTucHanhChinhId = thuTucHanhChinhId.substring(0, thuTucHanhChinhId.lastIndexOf(","));
					}
				}
			}
		}
		resultsHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.searchQuanLyHoSoInPhanNhomHoSoDoanhNghiep(selLinhVucThuTuc,maBienNhan, thuTucHanhChinhId, doanhNghiepId, phanNhomTrangThaiHoSoCodeGroup, searchContainer.getStart(), searchContainer.getEnd());
		longTotal = TthcHoSoThuTucLocalServiceUtil.countQuanLyHoSoInPhanNhomHoSoDoanhNghiep(selLinhVucThuTuc,maBienNhan, thuTucHanhChinhId, doanhNghiepId, phanNhomTrangThaiHoSoCodeGroup);
		
		searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
		searchContainer.setResults(resultsHoSoThuTuc);
	}
	
	
	
	if (resultsHoSoThuTuc == null) { 
		resultsHoSoThuTuc = new ArrayList<TthcHoSoThuTuc>(); 
	}
	
%>

<div class="col-xs-12">
	<table class="table table-striped table-bordered table-hover">
	<tbody>
		<tr>
			<!-- noi dung header -->
			<% if (pnDoanhNghiep.getMaPhanNhom().equals(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DANG_TAO)) { %>
				<th width="5%">STT</th>
				<th width="30%">Tên nhóm dịch vụ công</th>
				<th width="30%">Tên dịch vụ công</th>
				<th width="">Mã hồ sơ</th>
				<th width="15%">Thời điểm tạo hồ sơ</th>
				<th width="6.6%">Thao tác</th>
				
				
			<%} else if (pnDoanhNghiep.getMaPhanNhom().equals(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_TIEP_NHAN)) { %>
			
				<th width="5%">STT</th>
				<th width="30%">Tên nhóm dịch vụ công</th>
				<th width="30%">Tên dịch vụ công</th>
				<th width="">Mã hồ sơ</th>
				<th width="15%">Thời điểm tạo hồ sơ</th>
				<th width="6.6%">Thao tác</th>
					
			<% } else if (pnDoanhNghiep.getMaPhanNhom().equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DANG_XU_LY)
					|| pnDoanhNghiep.getMaPhanNhom().equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_BO_SUNG)
					|| pnDoanhNghiep.getMaPhanNhom().equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_THANH_TOAN)) { %>
				<th width="5%">STT</th>
				<th width="18%">Tên nhóm thủ tục</th>
				<th width="18%">Tên thủ tục</th>
				<th width="13%">Mã tiếp nhận hồ sơ</th>
				<th >Mã biên nhận</th>
				<th width="13%">Ngày nộp hồ sơ</th>
				<th width="13%">Ngày hẹn trả lời</th>
				<th width="10%">Trạng thái</th>
				<th width="6.6%">Thao tác</th>
				
			<% } else if (pnDoanhNghiep.getMaPhanNhom().equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DA_TRA_KET_QUA)) { %>
			
				<th width="5%">STT</th>
				<th width="25%">Tên nhóm thủ tục</th>
				<th width="21%">Tên thủ tục</th>
				<th width="">Thông tin kết quả</th>
				<th width="13%">Mã tiếp nhận hồ sơ</th>
				<th width="13%">Ngày nộp hồ sơ</th>
				<th width="13%">Ngày hẹn trả lời</th>
				<th width="6.6%">Thao tác</th>
				
			<% } %>
		</tr>
		
		<!-- noi dung content -->
		<%
		int countRow = 1;
		long thuTucHanhChinhIdInItem = 0;
		DmDataItem linhVuc = null;
		
		TthcThuTucHanhChinh thuTucHanhChinh = null;
		TthcTrangThaiHoSo trangThaiHoSo = null;
		TthcThanhPhanHoSo thanhPhanHoSo = null;
		
		String thanhPhanHoSoViewJsp = "";
		String thanhPhanHoSoJsp = "";
		String thanhPhanHoSoXuLyJsp = "";
		
		for (TthcHoSoThuTuc item : resultsHoSoThuTuc) {
			thuTucHanhChinhIdInItem = item.getThuTucHanhChinhId();
			thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(thuTucHanhChinhIdInItem);
			
			if (thuTucHanhChinh != null) {
				tenThuTucHanhChinh = thuTucHanhChinh.getTenThuTuc();
				linhVuc = DmDataItemLocalServiceUtil.findByGroupIdAndItemCode(Constants.DM_LINH_VUC_TTHC, thuTucHanhChinh.getLinhVucThuTuc().trim());
				
				if (linhVuc != null) {
					tenLinhVuc = linhVuc.getName();
					thanhPhanHoSoJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamcampuchia/thanh_phan_ho_so.jsp";
					thanhPhanHoSoViewJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamcampuchia/thanh_phan_ho_so_view.jsp";
					thanhPhanHoSoXuLyJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamcampuchia/thanh_phan_ho_so_xu_ly.jsp";
					
// 					if (linhVuc.getCode().trim().contains(Constants.LVTT_VIET_NAM_CAMPUCHIA)) {
// 						thanhPhanHoSoJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamcampuchia/thanh_phan_ho_so.jsp";
// 						thanhPhanHoSoViewJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamcampuchia/thanh_phan_ho_so_view.jsp";
// 						thanhPhanHoSoXuLyJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamcampuchia/thanh_phan_ho_so_xu_ly.jsp";
						
// 					} else if (linhVuc.getCode().trim().contains(Constants.LVTT_VIET_NAM_LAO)) {
// 						thanhPhanHoSoJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/thanh_phan_ho_so.jsp";
// 						thanhPhanHoSoViewJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/thanh_phan_ho_so_view.jsp";
// 						thanhPhanHoSoXuLyJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/thanh_phan_ho_so_xu_ly.jsp";
						
// 					} else if (linhVuc.getCode().trim().contains(Constants.LVTT_VIET_NAM_CHINA)) {
// 						thanhPhanHoSoJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/thanh_phan_ho_so.jsp";
// 						thanhPhanHoSoViewJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/thanh_phan_ho_so_view.jsp";
// 						thanhPhanHoSoXuLyJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/thanh_phan_ho_so_xu_ly.jsp";
// 					} else if (linhVuc.getCode().trim().contains(Constants.LVTT_BIEN_HIEU)) {
// 						thanhPhanHoSoJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/bienhieu/thanh_phan_ho_so.jsp";
// 						thanhPhanHoSoViewJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/bienhieu/thanh_phan_ho_so_view.jsp";
// 						thanhPhanHoSoXuLyJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/bienhieu/thanh_phan_ho_so_xu_ly.jsp";
// 					} else if (linhVuc.getCode().trim().contains(Constants.LVTT_PHU_HIEU)) {
// 						thanhPhanHoSoJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/phuhieu/thanh_phan_ho_so.jsp";
// 						thanhPhanHoSoViewJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/phuhieu/thanh_phan_ho_so_view.jsp";
// 						thanhPhanHoSoXuLyJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/phuhieu/thanh_phan_ho_so_xu_ly.jsp";
// 					} else if (linhVuc.getCode().trim().contains(Constants.LVTT_TN_VAN_TAI_OTO)) {
// 						thanhPhanHoSoJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/vantaioto/thanh_phan_ho_so.jsp";
// 						thanhPhanHoSoViewJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/vantaioto/thanh_phan_ho_so_view.jsp";
// 						thanhPhanHoSoXuLyJsp = "/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/vantaioto/thanh_phan_ho_so_xu_ly.jsp";
// 					} else {
// 						//TODO: DUONG THUY 
// 						thanhPhanHoSoJsp = "/html/hsdoanhnghiep/thongtinhoso/duongthuy/thanh_phan_ho_so.jsp";
// 						thanhPhanHoSoViewJsp = "/html/hsdoanhnghiep/thongtinhoso/duongthuy/thanh_phan_ho_so.jsp";
// 						thanhPhanHoSoXuLyJsp = "/html/hsdoanhnghiep/thongtinhoso/duongthuy/thanh_phan_ho_so.jsp";
// 					}
					
				}
			}
			
			PortletURL xemHoSoUrl = renderResponse.createRenderURL();
			xemHoSoUrl.setParameter("jspPage", thanhPhanHoSoViewJsp);
			xemHoSoUrl.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhIdInItem));
			xemHoSoUrl.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(item.getId()));
			xemHoSoUrl.setParameter(Constants.CODE_LINH_VUC_THU_TUC, selLinhVucThuTuc);
			xemHoSoUrl.setParameter(Constants.MA_BIEN_NHAN, maBienNhan);
			
			boolean isView = false;
			
			if(maPhanNhomHoSo.equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DANG_XU_LY) 
					|| maPhanNhomHoSo.equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_TIEP_NHAN)
					|| maPhanNhomHoSo.equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DA_TRA_KET_QUA)
					|| maPhanNhomHoSo.equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_THANH_TOAN)){
				isView = true;
			}
			
			xemHoSoUrl.setParameter("isView", String.valueOf(isView));
			
			if (pnDoanhNghiep.getMaPhanNhom().equals(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DANG_TAO)) {
				PortletURL suaHoSoUrl = renderResponse.createRenderURL();
				suaHoSoUrl.setParameter("jspPage", thanhPhanHoSoJsp);
				suaHoSoUrl.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhIdInItem));
				suaHoSoUrl.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(item.getId()));
				suaHoSoUrl.setParameter(Constants.CODE_LINH_VUC_THU_TUC, selLinhVucThuTuc);
				suaHoSoUrl.setParameter(Constants.MA_BIEN_NHAN, maBienNhan);
				
				PortletURL actionHuyHoSoNhap = renderResponse.createActionURL();
				actionHuyHoSoNhap.setParameter(ActionRequest.ACTION_NAME, "xoaHoSo");
				actionHuyHoSoNhap.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhIdInItem));
				actionHuyHoSoNhap.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(item.getId()));
				actionHuyHoSoNhap.setParameter(Constants.CODE_LINH_VUC_THU_TUC, String.valueOf(selLinhVucThuTuc));
				actionHuyHoSoNhap.setParameter(Constants.MA_BIEN_NHAN, maBienNhan);
				%>
			
				<tr>
					<td class="text-center"><%=countRow + searchContainer.getStart()%></td>
					<td><%=tenLinhVuc %></td>
					<td><%=tenThuTucHanhChinh %></td>
					<td><%=item.getMaSoHoSo() %></td>
					<td class="text-center"><%=FormatData.parseDateToStringType9(item.getNgayTao())%></td>
					<td class="text-center">
						<a class="mauTT" href="<%=suaHoSoUrl.toString()%>"><i class="fa3 fa fa-pencil" title="Sửa hồ sơ"></i></a>
						<a class="mauTT" href="#" onClick='showDialog("<%=actionHuyHoSoNhap.toString()%>")'><i class="fa3 fa fa-trash-o" title="Xóa hồ sơ"></i></a>
					</td>
				</tr>
				
				
			<% } else if (pnDoanhNghiep.getMaPhanNhom().equals(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_TIEP_NHAN)) { %>
				
				<tr>
					<td class="text-center"><%=countRow + searchContainer.getStart()%></td>
					<td><%=tenLinhVuc%></td>
					<td><%=tenThuTucHanhChinh%></td>
					<td class="text-center"><%=item.getMaSoHoSo() %></td>
					<td class="text-center"><%=FormatData.parseDateToStringType9(item.getNgayGuiHoSo())%></td>
					<td class="text-center">
						<a class="mauTT" href="<%=xemHoSoUrl.toString()%>"><i class="fa3 fa fa-pencil" title="Xem hồ sơ"></i></a>
					</td>
				</tr>
				
			<% } else if (pnDoanhNghiep.getMaPhanNhom().equals(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DANG_XU_LY)
					|| pnDoanhNghiep.getMaPhanNhom().equals(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_BO_SUNG)
					|| pnDoanhNghiep.getMaPhanNhom().equals(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_THANH_TOAN)) {
				
				trangThaiHoSo = TthcTrangThaiHoSoLocalServiceUtil.fetchByMaTrangThai(item.getTrangThaiHoSo());
				
				PortletURL suaHoSoBuoc2Url = renderResponse.createRenderURL();
				suaHoSoBuoc2Url.setParameter("jspPage", thanhPhanHoSoXuLyJsp);
				suaHoSoBuoc2Url.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhIdInItem));
				suaHoSoBuoc2Url.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(item.getId()));
				suaHoSoBuoc2Url.setParameter(Constants.CODE_LINH_VUC_THU_TUC, selLinhVucThuTuc);
				suaHoSoBuoc2Url.setParameter(Constants.MA_BIEN_NHAN, maBienNhan);
				
				if(trangThaiHoSo.getMaTrangThai().equalsIgnoreCase(Constants.DOANH_NGHIEP_TRANG_THAI_HO_SO_CHO_BO_SUNG)) {
					suaHoSoBuoc2Url.setParameter("isView", Boolean.FALSE.toString());
				} else {
					suaHoSoBuoc2Url.setParameter("isView", Boolean.TRUE.toString());
				}
				
				%>
				
				<tr>
					<td class="text-center"><%=countRow + searchContainer.getStart()%></td>
					<td><%=tenLinhVuc%></td>
					<td><%=tenThuTucHanhChinh%></td>
					<td class="text-center"><%=item.getMaSoHoSo()%></td>
					<td class="text-center"><%=item.getMaBienNhan()%></td>
					<td class="text-center"><%=FormatData.parseDateToStringType9(item.getNgayGuiHoSo())%></td>
					<td class="text-center"><%=FormatData.parseDateToStringType9(item.getNgayHenTra())%></td>
					<td class="text-center"><%=(trangThaiHoSo != null)? trangThaiHoSo.getTenTrangThai() : ""%></td>
					<td class="text-center">
						<a class="mauTT" href="<%=suaHoSoBuoc2Url.toString()%>"><i class="fa3 fa fa-pencil" title="Xem hồ sơ"></i></a>
					</td>
				</tr>
				
			<% } else if (pnDoanhNghiep.getMaPhanNhom().equals(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DA_TRA_KET_QUA)) {
				thanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.getByThuTucHanhChinhIdAndMaThanhPhan((thuTucHanhChinh != null) ? thuTucHanhChinh.getId() : 0L, item.getThongBaoXuLy());
			%>
			
				<tr>
					<td class="text-center"><%=countRow + searchContainer.getStart()%></td>
					<td><%=tenLinhVuc %></td>
					<td><%=tenThuTucHanhChinh %></td>
					<td><%=(thanhPhanHoSo != null) ? thanhPhanHoSo.getTenThanhPhan() : ""%></td>
					<td class="text-center"><%=item.getMaBienNhan()%></td>
					<td class="text-center"><%=FormatData.parseDateToStringType9(item.getNgayGuiHoSo())%></td>
					<td class="text-center"><%=FormatData.parseDateToStringType9(item.getNgayTraKetQua())%></td>
					<td class="text-center">
						<a class="mauTT" href="<%=xemHoSoUrl.toString()%>"><i class="fa3 fa fa-pencil" title="Xem hồ sơ"></i></a>
					</td>
				</tr>
			<% }
			
			countRow++;
		}
	%>
		
	</tbody>
	</table>
	
	
</div>

<%
if (longTotal == 0) {
	%>
	<div class="col-xs-12">
		<p style="float:left; line-height:32px">Không có hồ sơ nào tìm thấy</p>
		<ul class="pagination pull-right" style="margin:0">
			<li></li>
			<li></li>
		</ul>
	</div>
<%
}
%>

<!-- 
<div class="col-xs-12">
	<p style="float:left; line-height:32px">Tổng số hồ sơ: <b>6</b></p>
	<ul class="pagination pull-right" style="margin:0">
		<li><a href=""><i class="fa fa-angle-double-left fa-lg"></i></a></li>
		<li><a href=""><i class="fa fa-angle-left fa-lg"></i></a></li>
		<li class="active"><a href="">1</a></li>
		<li><a href="">2</a></li>
		<li><a href="">3</a></li>
		<li><a href="">4</a></li>
		<li><a href="">5</a></li>
		<li><a href=""><i class="fa fa-angle-right fa-lg"></i></a></li>
		<li><a href=""><i class="fa fa-angle-double-right fa-lg"></i></a></li>
	</ul>
</div>
 -->
<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />

<aui:script>
	function showDialog(deleteURL) {
		var r = confirm("B\u1EA1n c\u00F3 mu\u1ED1n xo\u00E1 b\u1EA3n ghi n\u00E0y?");
		if (r == true) {
			window.location.href = deleteURL;
		} else {
			return;
		}
	}
</aui:script>