<%@page import="vn.dtt.duongbo.utils.DoanhNghiepUtils"%>
<%@page import="vn.dtt.duongbo.utils.config.DuongBoConfigurationManager"%>
<%@page import="vn.dtt.duongbo.utils.format.FormatData"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.utils.DanhMucKey"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.duongbo.utils.format.ConvertUtil"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>

<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@ include file="/html/init.jsp"%>

<%
	HttpSession httpSession = null;
	
	try {
		httpSession = PortalUtil.getHttpServletRequest(renderRequest).getSession();
	} catch (Exception es) { }
	
	String trangThaiXacNhanThanhToan = Constants.MTYT_CHUA_XAC_NHAN_THANH_TOAN+ "";
	
	if (httpSession != null) {
		Object obj = httpSession.getAttribute(Constants.MA_PHAN_NHOM_HO_SO);
		if (obj != null) {
			if (obj.toString().equalsIgnoreCase("KT_GDCXN")) {
				trangThaiXacNhanThanhToan = Constants.MTYT_CHUA_XAC_NHAN_THANH_TOAN + "";
			} else if (obj.toString().equalsIgnoreCase("KT_GDDXN")) {
				trangThaiXacNhanThanhToan = Constants.MTYT_XAC_NHAN_THANH_TOAN_HOP_LE + "," +  Constants.MTYT_XAC_NHAN_THANH_TOAN_KHONG_HOP_LE;
			}
		}
	}
	
	String dateNgayNopHoSoTuNgay = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_FROM);
	String dateNgayNopHoSoDenNgay = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_TO);
	String textDoanhNghiep = ParamUtil.getString(request, Constants.DOANH_NGHIEP);
	String year = ParamUtil.getString(request, Constants.NAM_NHAP);

	int selLoaiThanhToan = ParamUtil.getInteger(request, Constants.LOAI_THANH_TOAN);
	String maGiaoDich = ParamUtil.getString(request, Constants.MA_GIAO_DICH);
	String selTrangThai = ParamUtil.getString(request, Constants.LOAI_TRANG_THAI);
	
	String selLoaiThanhToanObj = "";
	
	if(selLoaiThanhToan > 0) {
		selLoaiThanhToanObj = String.valueOf(selLoaiThanhToan);
	}
	
	List<Integer> listLoaiThanhToan = new ArrayList<Integer>();
	listLoaiThanhToan.add(Constants.MTYT_HINH_THUC_THANH_TOAN_CHUYEN_KHOAN);
	listLoaiThanhToan.add(Constants.MTYT_HINH_THUC_THANH_TOAN_KEY_PAD);
	listLoaiThanhToan.add(Constants.MTYT_HINH_THUC_THANH_TOAN_TRUC_TIEP);
	
	List<String> listTrangThai = new ArrayList<String>();
	listTrangThai.add(Constants.MTYT_XAC_NHAN_THANH_TOAN_HOP_LE+"");
	listTrangThai.add(Constants.MTYT_XAC_NHAN_THANH_TOAN_KHONG_HOP_LE+"");
	
	long organizationId = 0;
	if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
		organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();
	}
	
	PortletURL portletUrl = renderResponse.createRenderURL();
	
	if (dateNgayNopHoSoTuNgay != null && dateNgayNopHoSoTuNgay.trim().length() > 0) {
		portletUrl.setParameter(Constants.NGAY_NOP_HO_SO_FROM, dateNgayNopHoSoTuNgay);
	}
	if (dateNgayNopHoSoDenNgay != null && dateNgayNopHoSoDenNgay.trim().length() > 0) {
		portletUrl.setParameter(Constants.NGAY_NOP_HO_SO_TO, dateNgayNopHoSoDenNgay);
	}
	if (textDoanhNghiep != null && textDoanhNghiep.trim().length() > 0) {
		portletUrl.setParameter(Constants.DOANH_NGHIEP, textDoanhNghiep);
	}
	
	if (selLoaiThanhToan > 0) {
		portletUrl.setParameter(Constants.LOAI_THANH_TOAN, String.valueOf(selLoaiThanhToan));
	}

	if (maGiaoDich != null && maGiaoDich.trim().length() > 0) {
		portletUrl.setParameter(Constants.MA_GIAO_DICH, maGiaoDich);
	}
	if (selTrangThai != null && selTrangThai.trim().length() > 0) {
		portletUrl.setParameter(Constants.LOAI_TRANG_THAI, selTrangThai);
	}
	
	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 20, portletUrl, null, "");
	
	List<TthcXacNhanThanhToan> lstXacNhanThanhToan = TthcXacNhanThanhToanLocalServiceUtil.findTthcXacNhanThanhToan(String.valueOf(maGiaoDich),null,selLoaiThanhToanObj,organizationId, trangThaiXacNhanThanhToan, selTrangThai, FormatData.parseStringToDateTypeDDMMYYYY(dateNgayNopHoSoTuNgay), FormatData.parseStringToDateTypeDDMMYYYY(dateNgayNopHoSoDenNgay), textDoanhNghiep, ConvertUtil.convertToInt(year), searchContainer.getStart(), searchContainer.getEnd());
	int total = TthcXacNhanThanhToanLocalServiceUtil.countTthcXacNhanThanhToan(maGiaoDich,null,selLoaiThanhToanObj,organizationId, trangThaiXacNhanThanhToan, selTrangThai, FormatData.parseStringToDateTypeDDMMYYYY(dateNgayNopHoSoTuNgay), FormatData.parseStringToDateTypeDDMMYYYY(dateNgayNopHoSoDenNgay), textDoanhNghiep, ConvertUtil.convertToInt(year));
	
	searchContainer.setResults(lstXacNhanThanhToan);
	searchContainer.setTotal(total);
	
%>
<liferay-portlet:renderURL varImpl="searchURL">
	<portlet:param name="jspPage" value="/html/canbo/search_content_ketoan.jsp" />
</liferay-portlet:renderURL>

	
<aui:form action="<%=searchURL%>" name="myForm" id="myForm" method="get">
	<liferay-portlet:renderURLParams varImpl="searchURL" />
	
	<div class="col-xs-12 form-group">
		<label class="col-xs-2" for="sel1">Tổ chức/Cá nhân :</label>
		<div class="col-xs-10">
			<input type="text" class="form-control" name='<%= renderResponse.getNamespace() + Constants.DOANH_NGHIEP %>' value="<%=HtmlUtil.escape(textDoanhNghiep)%>">
		</div>
	</div>
	
	<div class="clear"></div>
	
	<div class="col-xs-12 form-group">
		<label class="col-xs-2">Mã giao dịch :</label>
		
		<div class="col-xs-2">
			<input type="text" class="form-control" name='<%= renderResponse.getNamespace() + Constants.MA_GIAO_DICH %>' value="<%=HtmlUtil.escape(maGiaoDich)%>">
		</div>
		
		<div class="col-xs-4">
			<label class="col-xs-6">Ngày giao dịch :</label>
			<div class="col-xs-6 input-group">
				<input type="text" class="form-control" 
					id='<%= renderResponse.getNamespace() + Constants.NGAY_NOP_HO_SO_FROM %>' 
					name='<%= renderResponse.getNamespace() + Constants.NGAY_NOP_HO_SO_FROM %>'
					onclick="gtCalendar('<%= renderResponse.getNamespace() + Constants.NGAY_NOP_HO_SO_FROM %>')" value="<%= HtmlUtil.escape(dateNgayNopHoSoTuNgay) %>" >
				<span class="input-group-addon ctrl-input-calendar" onclick="gtCalendar('<%= renderResponse.getNamespace() + Constants.NGAY_NOP_HO_SO_FROM %>')"><i class="fa fa-calendar"></i></span>
			</div>
		</div>
		<div class="col-xs-4">
			<label class="col-xs-6">Đến ngày :</label>
			<div class="col-xs-6 input-group">
				<input type="text" class="form-control" 
					id='<%= renderResponse.getNamespace() + Constants.NGAY_NOP_HO_SO_TO %>' 
					name='<%= renderResponse.getNamespace() + Constants.NGAY_NOP_HO_SO_TO %>'
					onclick="gtCalendar('<%= renderResponse.getNamespace() + Constants.NGAY_NOP_HO_SO_TO %>')" value="<%= HtmlUtil.escape(dateNgayNopHoSoDenNgay) %>">
				<span class="input-group-addon ctrl-input-calendar" onclick="gtCalendar('<%= renderResponse.getNamespace() + Constants.NGAY_NOP_HO_SO_TO %>')"><i class="fa fa-calendar"></i></span>
			</div>
		</div>
	</div>
	
	<div class="clear"></div>
	
	<div class="col-xs-12 form-group">
		<label class="col-xs-2" for="sel1">Hình thức thanh toán :</label>
		<div class="col-xs-10">
			<select name='<%= renderResponse.getNamespace() + Constants.LOAI_THANH_TOAN %>' class="form-control">
				<option value="-1">-- Chọn hình thức thanh toán --</option>
					<%
					for(int loaiThanhToan : listLoaiThanhToan){
						String tenThanhToan = "";
						
						if(loaiThanhToan == Constants.MTYT_HINH_THUC_THANH_TOAN_TRUC_TIEP){
							tenThanhToan = "Thanh toán trực tiếp";						
						}
						else if(loaiThanhToan == Constants.MTYT_HINH_THUC_THANH_TOAN_CHUYEN_KHOAN){
							tenThanhToan = "Thanh toán chuyển khoản";
						}else if(loaiThanhToan == Constants.MTYT_HINH_THUC_THANH_TOAN_KEY_PAD){
							tenThanhToan = "Thanh toán keypay";
						}
						%>
						<option value="<%=loaiThanhToan%>" <%=loaiThanhToan == selLoaiThanhToan ? "selected='selected'" : ""%> ><%=tenThanhToan %></option>
						<%
					}
					%>
			</select>
		</div>
	</div>
	
	<div class="clear"></div>
	
	<div class="col-xs-offset-2 col-xs-10 form-group">
		<div class="col-xs-12">
			<input type="submit" value="Tìm kiếm" class="btn btn-primary">
		</div>
	</div>
	
	<div class="clear"></div>
</aui:form>

<div class="col-xs-12">
	<table class="table table-striped table-bordered table-hover">
		<tbody>
		<%
		if (trangThaiXacNhanThanhToan.contains(String.valueOf(Constants.MTYT_CHUA_XAC_NHAN_THANH_TOAN))) {
		%>
			<tr >
				<th width="4%">STT</th>
				<th width="19%">Mã giao dịch</th>
				<th width="22%">Tổ chức, cá nhân nộp hố sơ</th>
				<th width="15%">Hình thức thanh toán</th>
				<th width="12%">Ngày giao dịch</th>
				<th width="10%">Số tiền</th>
			</tr>
		<%} else {
		%>
		<tr>
				<th width="4%">STT</th>
				<th width="9%">Mã giao dịch</th>
				<th width="19%">Tổ chức, cá nhân nộp hố sơ</th>
				<th width="10%">Hình thức thanh toán</th>
				<th width="10%">Ngày giao dịch</th>
				<th width="10%">Ngày xác nhận</th>
				<th width="10%">Số tiền</th>
				<th width="10%">Trạng thái</th>
			</tr>
		<%
		}
		%>
		<%
		int index = 1;
		String tenLoaiPhi = "";
		String trangThaiGiaoDich = "";
		String hinhThucThanhToan="";
		for (TthcXacNhanThanhToan xacNhanThanhToan : lstXacNhanThanhToan) {

			if(Constants.MTYT_XAC_NHAN_THANH_TOAN_HOP_LE == xacNhanThanhToan.getTrangThaiXacNhan()){
				trangThaiGiaoDich = DuongBoConfigurationManager.getStrProp("xac.nhan.thanh.toan.hop.le", "");
			} else if(Constants.MTYT_XAC_NHAN_THANH_TOAN_KHONG_HOP_LE == xacNhanThanhToan.getTrangThaiXacNhan()){
				trangThaiGiaoDich = DuongBoConfigurationManager.getStrProp("xac.nhan.thanh.toan.khong.hop.le", "");
			} else if(Constants.MTYT_CHUA_XAC_NHAN_THANH_TOAN == xacNhanThanhToan.getTrangThaiXacNhan()){
				trangThaiGiaoDich = DuongBoConfigurationManager.getStrProp("chua.xac.nhan.thanh.toan", "");
			}
			
			if(Constants.MTYT_HINH_THUC_THANH_TOAN_TRUC_TIEP == xacNhanThanhToan.getHinhThucThanhToan()){
				hinhThucThanhToan = DuongBoConfigurationManager.getStrProp("vn.dtt.hinh.thuc.thanh.toan.1", "Thanh toán trực tiếp");
			} else if(Constants.MTYT_HINH_THUC_THANH_TOAN_CHUYEN_KHOAN == xacNhanThanhToan.getHinhThucThanhToan()){
				hinhThucThanhToan = DuongBoConfigurationManager.getStrProp("vn.dtt.hinh.thuc.thanh.toan.2", "Thanh toán chuyển khoản");
			} else if(Constants.MTYT_HINH_THUC_THANH_TOAN_KEY_PAD == xacNhanThanhToan.getHinhThucThanhToan()){
				hinhThucThanhToan = DuongBoConfigurationManager.getStrProp("vn.dtt.hinh.thuc.thanh.toan.3", "Thanh toán keypay");
			}
			
			PortletURL viewHoSoUrl = renderResponse.createRenderURL();
			viewHoSoUrl.setParameter("jspPage", "/html/canbo/thulyhs/duongbo/tongcuc/hoso_detail_ketoan.jsp");
			viewHoSoUrl.setParameter(Constants.ID_XACNHANTHANHTOAN, String.valueOf(xacNhanThanhToan.getId()));
			viewHoSoUrl.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TPHS);
			viewHoSoUrl.setParameter(Constants.RETURN_URL, themeDisplay.getURLCurrent());
			
			if (trangThaiXacNhanThanhToan.contains(String.valueOf(Constants.MTYT_CHUA_XAC_NHAN_THANH_TOAN))) {
		%>
			<tr>
				<td><%= (index++) +  searchContainer.getStart() %></td>
				<td style="padding: 10px;text-align: left;"><a style="color: blue;" href="<%=viewHoSoUrl.toString()%>"><%=xacNhanThanhToan.getMaTuSinh() %></a></td>
				<td class="sp"><%=Validator.isNotNull(xacNhanThanhToan) ? xacNhanThanhToan.getTenDoanhNghiep() : ""%></td>
				<td class="sp"><%=hinhThucThanhToan %></td>
				<td><%=FormatData.parseDateToTringType3(xacNhanThanhToan.getNgayTao()) %></td>
				<td><%=DoanhNghiepUtils.getMoney(String.valueOf(xacNhanThanhToan.getSoTien()))%></td>
			</tr>
		<%
			} else {
		%>
			<tr>
				<td><%= (index++) +  searchContainer.getStart() %></td>
				<td style="padding: 10px;text-align: left;"><a style="color: blue;" href="<%=viewHoSoUrl.toString()%>"><%=xacNhanThanhToan.getMaTuSinh() %></a></td>
				<td class="sp"><%=Validator.isNotNull(xacNhanThanhToan) ? xacNhanThanhToan.getTenDoanhNghiep() : ""%></td>
				<td class="sp"><%=hinhThucThanhToan%></td>
				<td><%=FormatData.parseDateToTringType3(xacNhanThanhToan.getNgayTao()) %></td>
				<td><%=FormatData.parseDateToTringType3(xacNhanThanhToan.getNgayXacNhan()) %></td>
				<td><%=DoanhNghiepUtils.getMoney(String.valueOf(xacNhanThanhToan.getSoTien()))%></td>
				<td class="sp"><%=trangThaiGiaoDich %></td>
			</tr>
		<%}
		}
		%>
	</tbody>
	</table>
	
	<%
		if(total==0){
			%>
			<h1>Không có hồ sơ nào tìm thấy</h1>
			
			<%
		}
	%>
	<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
</div>