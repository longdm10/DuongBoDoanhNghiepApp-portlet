<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.dtt.duongbo.business.DanhMucConstants"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="java.util.List"%>

<%@ include file="/html/init.jsp"%>
<%@page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	List<DmDataItem> lstPhamVihd = DanhMucConstants.getPhamViHoatDong();
	List<DmDataItem> lstMauSon = DanhMucConstants.getMauSonPhuongTien();
	String maLoaiHinhKinhDoanh = ParamUtil.getString(request, "MA_LOAIHINH_KINHDOANH");
	long idDataGroup = ParamUtil.getLong(request, "DATA_GROUP_ID");
	String sttLoaiHinh = ParamUtil.getString(request, "STT_LOAI_HINH");
%>

<input type="hidden" name="MA_LOAIHINH_KINHDOANH" id="MA_LOAIHINH_KINHDOANH" value="<%=maLoaiHinhKinhDoanh%>">
<input type="hidden" name="DATA_GROUP_ID" id="DATA_GROUP_ID" value="<%=String.valueOf(idDataGroup)%>">
<input type="hidden" name="STT_LOAI_HINH" id="STT_LOAI_HINH" value="<%=String.valueOf(sttLoaiHinh)%>">
<!-- -------TITLE--------- -->
<%
if (DanhMucConstants.KINH_DOANH_TUYEN_CO_DINH.equalsIgnoreCase(maLoaiHinhKinhDoanh)) {
	%>
	<p class="textU">Tuyến cố định, xe buýt</p>
	<%
} else if (DanhMucConstants.KINH_DOANH_XE_DU_LICH.equalsIgnoreCase(maLoaiHinhKinhDoanh)) {
	%>
	<p class="textU">Xe hợp đồng, xe du lịch</p>
	<%
} else if (DanhMucConstants.KINH_DOANH_HANG_HOA.equalsIgnoreCase(maLoaiHinhKinhDoanh)) {
	%>
	<p class="textU">Xe vận tải hàng hóa</p>
	<%
} else if (DanhMucConstants.KINH_DOANH_XE_TAXI.equalsIgnoreCase(maLoaiHinhKinhDoanh)) {
	%>
	<p class="textU">Xe taxi</p>
	<%
}
%>

<!-- -------CONTENT--------- -->
<%
if (DanhMucConstants.KINH_DOANH_TUYEN_CO_DINH.equalsIgnoreCase(maLoaiHinhKinhDoanh) ||
	DanhMucConstants.KINH_DOANH_XE_DU_LICH.equalsIgnoreCase(maLoaiHinhKinhDoanh) ||
	DanhMucConstants.KINH_DOANH_HANG_HOA.equalsIgnoreCase(maLoaiHinhKinhDoanh)) {
	%>
	<label class="pull-left w250">Phạm vi hoạt động :</label>
	<p class="textU">
		<select name="phamVihd" id="phamVihd" class="form-control">
			<%for (DmDataItem item : lstPhamVihd) {%>
				<option value="<%=item.getCode()%>"><%=item.getName()%></option>
			<%} %>
		</select>
	</p>
	<%
} else if (DanhMucConstants.KINH_DOANH_XE_TAXI.equalsIgnoreCase(maLoaiHinhKinhDoanh)) {
	%>
	<label class="pull-left w250">Màu sơn :</label>
	<p class="textU">
		<select name="mauSon" id="mauSon" class="form-control">
			<%for (DmDataItem item : lstMauSon) {%>
				<option value="<%=item.getCode()%>"><%=item.getName()%></option>
			<%} %>
		</select>
	</p>
	<%
}
%>

<!-- --------COMMON-------- -->
<label class="pull-left w250">Số lượng phương tiện <span class="red">*</span> :</label>
<p class="textU"><input type="text" name="soLgPhuongTien" id="soLgPhuongTien" class="form-control" value=""></p>

<label class="pull-left w250">Thiết bị giám sát hành trình :</label>
<p class="textU">
	<select name="giamSatHanhTrinh" id="giamSatHanhTrinh" class="form-control">
		<option value="1">Có</option>
		<option value="0">Không</option>
	</select>
</p>

<button class="btn btn-primary" type="button" onclick="btnClickLuuLoaiHinhHoatDong();">Lưu</button>


<aui:script use="aui-io-request,aui-node">
	var A = AUI();
	AUI().ready(function(A){
		var sttLoaiHinh = $('#STT_LOAI_HINH').val();
		console.log('-loaihinhkinhdoanh.jsp--', sttLoaiHinh);
		checkExistLoaiHinhHoatDong(sttLoaiHinh);
	});
</aui:script>