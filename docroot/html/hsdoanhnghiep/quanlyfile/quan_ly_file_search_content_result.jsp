<%@page import="vn.dtt.duongbo.utils.config.DuongBoConfigurationManager"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtQuanLyFileLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepUserLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile"%>
<%@page import="vn.dtt.duongbo.utils.format.FormatData"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>

<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ include file="/html/init.jsp"%>

<%
	List<QlvtQuanLyFile> resultsQuanLyFile = null;
	int loaiGiayTo = 0;
	String tenThuTucHanhChinh = "";
	String phanNhomTrangThaiHoSoCodeGroup = "";
	
	
	PortletURL renderHoSoChoTiepNhan = renderResponse.createRenderURL();
	renderHoSoChoTiepNhan.setParameter("jspPage", "/html/hsdoanhnghiep/quanlyfile/quan_ly_file_search_content.jsp");
	
	if(maPhanNhomHoSo.trim().equalsIgnoreCase(Constants.MA_PHAN_NHOM_QUAN_LY_FILE_GIAY_TO_RIENG)){
		loaiGiayTo = 2;
	} else if(maPhanNhomHoSo.trim().equalsIgnoreCase(Constants.MA_PHAN_NHOM_QUAN_LY_FILE_GIAY_TO_DUOC_CAP)){
		loaiGiayTo = 1;
	}
	
	
	if (dateNgayCapTuNgay != null && dateNgayCapTuNgay.trim().length() > 0) {
		renderHoSoChoTiepNhan.setParameter(Constants.NGAY_CAP_PHEP_FROM, dateNgayCapTuNgay);
	}
	if (dateNgayCapDenNgay != null && dateNgayCapDenNgay.trim().length() > 0) {
		renderHoSoChoTiepNhan.setParameter(Constants.NGAY_CAP_PHEP_TO, dateNgayCapDenNgay);
	}
	
	if (dateNgayHetHanTuNgay != null && dateNgayHetHanTuNgay.trim().length() > 0) {
		renderHoSoChoTiepNhan.setParameter(Constants.NGAY_HET_HAN_FROM, dateNgayHetHanTuNgay);
	}
	if (dateNgayHetHanDenNgay != null && dateNgayHetHanDenNgay.trim().length() > 0) {
		renderHoSoChoTiepNhan.setParameter(Constants.NGAY_HET_HAN_TO, dateNgayHetHanDenNgay);
	}
	
	
	
	
	
	if (dateNgayTaiTuNgay != null && dateNgayTaiTuNgay.trim().length() > 0) {
		renderHoSoChoTiepNhan.setParameter(Constants.NGAY_TAI_FROM, dateNgayTaiTuNgay);
	}
	if (dateNgayTaiDenNgay != null && dateNgayTaiDenNgay.trim().length() > 0) {
		renderHoSoChoTiepNhan.setParameter(Constants.NGAY_TAI_TO, dateNgayTaiDenNgay);
	}
	
	if (tenGiayTo != null && tenGiayTo.trim().length() > 0) {
		renderHoSoChoTiepNhan.setParameter(Constants.TEN_GIAY_TO, tenGiayTo);
	}
	
	if (selTrangThai != null && selTrangThai.trim().length() > 0) {
		renderHoSoChoTiepNhan.setParameter(Constants.TRANG_THAI_QUAN_LY_FILE, selTrangThai);
	}

	
	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 15, renderHoSoChoTiepNhan, null, null);
	
	long longTotal = 0;
	
	if (userLoginId > 0) {
		DnDoanhNghiepUser doanhNghiepUser = DnDoanhNghiepUserLocalServiceUtil.findByUserId(userLoginId);
		long doanhNghiepId = 0;
		if(doanhNghiepUser != null){
			doanhNghiepId = doanhNghiepUser.getNguoiLamThuTucId();
		}
		resultsQuanLyFile = QlvtQuanLyFileLocalServiceUtil.searchQuanLyFile(
			doanhNghiepId, loaiGiayTo, selTrangThai, tenGiayTo,FormatData.parseStringToDateTypeDDMMYYYY(dateNgayCapTuNgay),
			FormatData.parseStringToDateTypeDDMMYYYY(dateNgayCapDenNgay),FormatData.parseStringToDateTypeDDMMYYYY(dateNgayHetHanTuNgay),
			FormatData.parseStringToDateTypeDDMMYYYY(dateNgayHetHanDenNgay),FormatData.parseStringToDateTypeDDMMYYYY(dateNgayTaiTuNgay),
			FormatData.parseStringToDateTypeDDMMYYYY(dateNgayTaiDenNgay),searchContainer.getStart(), searchContainer.getEnd());
		
		
		longTotal = QlvtQuanLyFileLocalServiceUtil.countQuanLyFile(
			doanhNghiepId, loaiGiayTo, selTrangThai, tenGiayTo, FormatData.parseStringToDateTypeDDMMYYYY(dateNgayCapTuNgay),FormatData.parseStringToDateTypeDDMMYYYY(dateNgayCapDenNgay),FormatData.parseStringToDateTypeDDMMYYYY(dateNgayHetHanTuNgay),FormatData.parseStringToDateTypeDDMMYYYY(dateNgayHetHanDenNgay),FormatData.parseStringToDateTypeDDMMYYYY(dateNgayTaiTuNgay),FormatData.parseStringToDateTypeDDMMYYYY(dateNgayTaiDenNgay));
		
		searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
		searchContainer.setResults(resultsQuanLyFile);
	}
	if (resultsQuanLyFile == null) { 
		resultsQuanLyFile = new ArrayList<QlvtQuanLyFile>(); 
	}
	
%>
<style>
	.m-table {}
	.m-table th, .m-table td {vertical-align: middle !important}
</style>

<div class="col-xs-12">
	<%
	if (maPhanNhomHoSo.trim().equalsIgnoreCase(Constants.MA_PHAN_NHOM_QUAN_LY_FILE_GIAY_TO_RIENG)) {
		%>
		<table class="table table-striped table-bordered table-hover">
			<tbody>
				<tr class="fl">
					<td width="3%">STT</td>
					<td width="10%">Tên giấy tờ</td>
					<td width="10%">Thông tin giấy tờ</td>
					<td width="10%">Ngày tải</td>
					<td width="10%">Tình trạng</td>
					<td width="7%">Thao tác</td>
				</tr>
			<%
			int countRow = 1;
			for (QlvtQuanLyFile item : resultsQuanLyFile) {
				String tenLoaiFile = "";
				if (item.getLoaiFile() == Constants.QUAN_LY_FILE_CHUNG) {
					tenLoaiFile = DuongBoConfigurationManager.getStrProp("giay.to.duoc.cap", "");
					
				} else if(item.getLoaiFile() == Constants.QUAN_LY_FILE_RIENG) {
					tenLoaiFile = DuongBoConfigurationManager.getStrProp("giay.to.rieng", "");
				} 
				
				String tenTrangThai="";
				if (item.getTrangThai().equalsIgnoreCase(Constants.QUAN_LY_FILE_TRANG_THAI_DANG_SU_DUNG)) {
					tenTrangThai =  DuongBoConfigurationManager.getStrProp("giay.to.rieng.trang.thai.dang.su.dung", "");
					
				} else if(item.getTrangThai().equalsIgnoreCase(Constants.QUAN_LY_FILE_TRANG_THAI_KHONG_SU_DUNG)) {
					tenTrangThai =	 DuongBoConfigurationManager.getStrProp("giay.to.rieng.trang.thai.khong.su.dung", "");
				} 
				
				
				PortletURL taiTaiLieuUrl = renderResponse.createRenderURL();
				taiTaiLieuUrl.setParameter("jspPage", "/html/hsdoanhnghiep/quanlyfile/thong_tin_file_export.jsp");
				taiTaiLieuUrl.setParameter(Constants.ID_QUAN_LY_FILE, String.valueOf(item.getId()));
				taiTaiLieuUrl.setParameter(Constants.ID_FILE, String.valueOf(item.getIdFile()));
				
				PortletURL actionNgungSuDungTaiLieu = renderResponse.createActionURL();
				actionNgungSuDungTaiLieu.setParameter(ActionRequest.ACTION_NAME, "ngungSuDungTaiLieu");
				actionNgungSuDungTaiLieu.setParameter(Constants.ID_QUAN_LY_FILE, String.valueOf(item.getId()));
				actionNgungSuDungTaiLieu.setParameter(Constants.ID_FILE, String.valueOf(item.getIdFile()));
				actionNgungSuDungTaiLieu.setParameter(Constants.ID_DOANH_NGHIEP, String.valueOf(item.getDoanhNghiepId()));
				%>
				<tr>
					<td><%=(countRow++) +  searchContainer.getStart()%></td>
					<td style="text-align: left !important;padding:5px;"><%=item.getTenFile() %></td>
					<td style="text-align: left !important;padding:5px;"><%=item.getThongTinFile() %></td>
					<td><%=FormatData.parseDateToTringType3(item.getNgayTai()) %></td>
					<td style="text-align: left !important;padding:5px;"><%=tenTrangThai %></td>
					
					<%
					if(item.getTrangThai().equalsIgnoreCase(Constants.QUAN_LY_FILE_TRANG_THAI_DANG_SU_DUNG)){
						%>
							<td style="text-align: center;">
								<a href="<%=taiTaiLieuUrl.toString()%>"><img class="tabimg2" src="<%=request.getContextPath()%>/img/i20.png" title="Tải tài liệu"></a>
								<a href="#" onClick='showAction("<%= actionNgungSuDungTaiLieu.toString() %>")' ><img style="width: 17px;" class="tabimg2" src="<%=request.getContextPath()%>/img/pause.png" title="Ngừng sử dụng tài liệu/Tái sử dụng tài liệu"></a>
							</td>
						
						<%
						
					} else if(item.getTrangThai().equalsIgnoreCase(Constants.QUAN_LY_FILE_TRANG_THAI_KHONG_SU_DUNG)){
						%>
							<td style="text-align: center;">
								<a href="#" onClick='showAction("<%= actionNgungSuDungTaiLieu.toString() %>")' ><img style="width: 17px; class="tabimg2" src="<%=request.getContextPath()%>/img/play.png" title="Ngừng sử dụng tài liệu/Tái sử dụng tài liệu"></a>
							</td>
							
						<%
					} 
					%>
				</tr>
				<%
			}
			countRow++;
			%>
			</tbody>
		</table>
		<%
	} else if(maPhanNhomHoSo.trim().equalsIgnoreCase(Constants.MA_PHAN_NHOM_QUAN_LY_FILE_GIAY_TO_DUOC_CAP)) {
		%>
		<table class="table table-striped table-bordered table-hover">
			<tbody>
				<tr class="fl">
					<td width="3%">STT</td>
					<td width="10%">Tên file</td>
					<td width="15%">Thông tin file</td>
					<td width="10%">Ngày cấp</td>
					<td width="10%">Ngày hết hạn</td>
					<td width="10%">Trạng thái</td>
					<td width="7%">Thao tác</td>
				</tr>
				<%
				int countRow = 1;
				for (QlvtQuanLyFile item : resultsQuanLyFile) {
					String tenLoaiFile = "";
					if (item.getLoaiFile() == Constants.QUAN_LY_FILE_CHUNG) {
						tenLoaiFile = DuongBoConfigurationManager.getStrProp("giay.to.duoc.cap", "");
						
					} else if(item.getLoaiFile() == Constants.QUAN_LY_FILE_RIENG) {
						tenLoaiFile = DuongBoConfigurationManager.getStrProp("giay.to.rieng", "");
					}
					
					String tenTrangThai="";
					if(item.getTrangThai().equalsIgnoreCase(Constants.QUAN_LY_FILE_TRANG_THAI_CON_HIEU_LUC)){
						tenTrangThai = DuongBoConfigurationManager.getStrProp("giay.to.chung.trang.thai.con.hieu.luc", "");
						
					} else if(item.getTrangThai().equalsIgnoreCase(Constants.QUAN_LY_FILE_TRANG_THAI_HET_HIEU_LUC)) {
						tenTrangThai = DuongBoConfigurationManager.getStrProp("giay.to.chung.trang.thai.het.hieu.luc", "");
					} 
					
					PortletURL taiTaiLieuUrl = renderResponse.createRenderURL();
					taiTaiLieuUrl.setParameter("jspPage", "/html/hsdoanhnghiep/quanlyfile/thong_tin_file_export.jsp");
					taiTaiLieuUrl.setParameter(Constants.ID_QUAN_LY_FILE, String.valueOf(item.getId()));
					taiTaiLieuUrl.setParameter(Constants.ID_FILE, String.valueOf(item.getIdFile()));
					

					PortletURL actionXoaFile = renderResponse.createActionURL();
					actionXoaFile.setParameter(ActionRequest.ACTION_NAME, "xoaFile");
					actionXoaFile.setParameter(Constants.ID_QUAN_LY_FILE, String.valueOf(item.getId()));
				
				%>
				<tr>
					<td><%=(countRow++) +  searchContainer.getStart()%></td>
					<td style="text-align: left !important;padding:5px;"><%=item.getTenFile() %></td>
					<td style="text-align: left !important;padding:5px;"><%=item.getThongTinFile() %></td>
					<td><%=FormatData.parseDateToTringType3(item.getNgayCap()) %></td>
					<td><%=FormatData.parseDateToTringType3(item.getNgayHetHan()) %></td>
					<td style="text-align: left !important;padding:5px;"><%=tenTrangThai%></td>
					<td style="text-align: center;">
						<a href="<%=taiTaiLieuUrl.toString()%>"><img class="tabimg2" src="<%=request.getContextPath()%>/img/i20.png" title="Tải tài liệu"></a>
					</td>
				</tr>
				
				<%
				}
			countRow++;
			%>
			</tbody>
		</table>
	<%
	}
	if( longTotal == 0) {
		%>
		<p style="font-weight: bold;">Không có hồ sơ nào tìm thấy</p>
		<%
	}
	%>
	<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
</div>

<aui:script>
function showDialog(deleteURL) {
    var r = confirm("B\u1EA1n c\u00F3 mu\u1ED1n xo\u00E1 b\u1EA3n ghi n\u00E0y?");
    if (r == true) {
         window.location.href = deleteURL;
    } else {
    	return;
    }
}

function showAction(deleteURL) {
	console.log('vao showAction');
	window.location.href = deleteURL;
}
</aui:script>