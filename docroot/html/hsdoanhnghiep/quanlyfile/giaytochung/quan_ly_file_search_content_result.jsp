<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ include file="/html/init.jsp"%>

<%
	List<QuanLyFile> resultsQuanLyFile = null;
	int loaiGiayTo = 0;
	String tenThuTucHanhChinh = "";
	String phanNhomTrangThaiHoSoCodeGroup = "";
	
	String listNoiDungHoSo = ParamUtil.getString(request, "listNoiDungHoSo");
	
	PortletURL renderHoSoChoTiepNhan = renderResponse.createRenderURL();
	renderHoSoChoTiepNhan.setParameter("jspPage", "/html/hsdoanhnghiep/quanlyfile/giaytochung/quan_ly_file_search_content.jsp");
	
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
		resultsQuanLyFile = QuanLyFileLocalServiceUtil.searchQuanLyFile(doanhNghiepId, 1, selTrangThai, tenGiayTo,FormatData.parseStringToDateTypeDDMMYYYY(dateNgayCapTuNgay),FormatData.parseStringToDateTypeDDMMYYYY(dateNgayCapDenNgay),FormatData.parseStringToDateTypeDDMMYYYY(dateNgayHetHanTuNgay),FormatData.parseStringToDateTypeDDMMYYYY(dateNgayHetHanDenNgay),FormatData.parseStringToDateTypeDDMMYYYY(dateNgayTaiTuNgay),FormatData.parseStringToDateTypeDDMMYYYY(dateNgayTaiDenNgay),searchContainer.getStart(), searchContainer.getEnd());
		
		
		longTotal = QuanLyFileLocalServiceUtil.countQuanLyFile(doanhNghiepId, 1, selTrangThai, tenGiayTo, FormatData.parseStringToDateTypeDDMMYYYY(dateNgayCapTuNgay),FormatData.parseStringToDateTypeDDMMYYYY(dateNgayCapDenNgay),FormatData.parseStringToDateTypeDDMMYYYY(dateNgayHetHanTuNgay),FormatData.parseStringToDateTypeDDMMYYYY(dateNgayHetHanDenNgay),FormatData.parseStringToDateTypeDDMMYYYY(dateNgayTaiTuNgay),FormatData.parseStringToDateTypeDDMMYYYY(dateNgayTaiDenNgay));
		
		searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
		searchContainer.setResults(resultsQuanLyFile);
	}
	if (resultsQuanLyFile == null) { 
		resultsQuanLyFile = new ArrayList<QuanLyFile>(); 
	}
	
%>
<div style = "clear:both"></div>
<div class="result">
	
		<!-- noi dung content -->
	
				<table class="table">
					<tbody>
					<!-- noi dung header -->
					<tr class="fl">
						<td width="3%">STT</td>
						<td width="10%">Tên giấy tờ</td>
						<td width="15%">Giấy tờ của thủ tục</td>
						<td width="10%">Ngày cấp</td>
						<td width="10%">Xem giấy tờ</td>
						<td width="10%">Trạng thái</td>
						<td width="7%">Thao tác</td>
					</tr>

				<%
				int countRow = 1;
				for (QuanLyFile item : resultsQuanLyFile) {
					String tenLoaiFile = "";
					if(item.getLoaiFile() == Constants.QUAN_LY_FILE_CHUNG){
						tenLoaiFile = YTeConfigurationManager.getStrProp("giay.to.duoc.cap", "");
					} else if(item.getLoaiFile() == Constants.QUAN_LY_FILE_RIENG){
						tenLoaiFile = YTeConfigurationManager.getStrProp("giay.to.rieng", "");
					} 
					String tenTrangThai="";
					if(item.getTrangThai().equalsIgnoreCase(Constants.QUAN_LY_FILE_TRANG_THAI_CON_HIEU_LUC)){
						tenTrangThai = YTeConfigurationManager.getStrProp("giay.to.chung.trang.thai.con.hieu.luc", "");
					} else if(item.getTrangThai().equalsIgnoreCase(Constants.QUAN_LY_FILE_TRANG_THAI_HET_HIEU_LUC)){
						tenTrangThai = YTeConfigurationManager.getStrProp("giay.to.chung.trang.thai.het.hieu.luc", "");
					} 
					
					PortletURL taiTaiLieuUrl = renderResponse.createRenderURL();
					taiTaiLieuUrl.setParameter("jspPage", "/html/hsdoanhnghiep/quanlyfile/thong_tin_file_export.jsp");
					taiTaiLieuUrl.setParameter(Constants.ID_QUAN_LY_FILE, String.valueOf(item.getId()));
					taiTaiLieuUrl.setParameter(Constants.ID_FILE, String.valueOf(item.getIdFile()));
					
					
					PortletURL chonTaiLieuAction = renderResponse.createActionURL();
					chonTaiLieuAction.setParameter(ActionRequest.ACTION_NAME, "chonGiayToTuQuanLyFile");
					chonTaiLieuAction.setParameter(Constants.ID_FILE, String.valueOf(item.getIdFile()));
					chonTaiLieuAction.setParameter(Constants.TEN_FILE, String.valueOf(item.getTenFile()));
					chonTaiLieuAction.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
					chonTaiLieuAction.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
					chonTaiLieuAction.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
					chonTaiLieuAction.setParameter("listNoiDungHoSo", listNoiDungHoSo);
				
				%>
				<tr>
					<td><%=(countRow++) +  searchContainer.getStart()%></td>
					<td style="text-align: left !important;padding:5px;"><%=item.getTenFile() %></td>
					<td style="text-align: left !important;padding:5px;"><%=item.getThongTinFile() %></td>
					<td><%=FormatData.parseDateToTringType3(item.getNgayCap()) %></td>
					<td style="text-align: center;">
						<a href="<%=taiTaiLieuUrl.toString()%>"><i style="color:blue;">Xem giấy tờ</i></a>
					</td>
					<td style="text-align: left !important;padding:5px;"><%=tenTrangThai%></td>
					
					
					<%
						if(item.getTrangThai().equalsIgnoreCase(Constants.QUAN_LY_FILE_TRANG_THAI_CON_HIEU_LUC)){
							%>
								<td style="text-align: center;">
									<a href="<%=chonTaiLieuAction.toString()%>"><img class="tabimg2" src="/yte-home-theme/images/i20.png" title="Chọn tài liệu"></a>
								</td>
							
							<%
						} else if(item.getTrangThai().equalsIgnoreCase(Constants.QUAN_LY_FILE_TRANG_THAI_HET_HIEU_LUC)){
							%>
							<td style="text-align: center;">
							<img class="tabimg2" src="/yte-home-theme/images/i13.png" title="Không chọn được tài liệu này">
							</td>
							
							<%
						}else{
							%>
							<td style="text-align: center;">
							--
							</td>
							
							<%
						}
					%>
					
					
					
					
				</tr>
				
				<%
			}
			
		%>
			</tbody>
			</table>
		<%
		if(longTotal==0){
			%>
			<p style="font-weight: bold;">Không có hồ sơ nào tìm thấy</p>
			
			<%
		}
	%>
	<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
</div>

<aui:script>
function showDialog(deleteURL)
{
    var r=confirm("B\u1EA1n c\u00F3 mu\u1ED1n xo\u00E1 b\u1EA3n ghi n\u00E0y?");
    if (r==true)
    {
         window.location.href = deleteURL;
    }else{
    	return;
    }
}

function showAction(deleteURL)
{	alert('vao showAction');
   window.location.href = deleteURL;
}
</aui:script>