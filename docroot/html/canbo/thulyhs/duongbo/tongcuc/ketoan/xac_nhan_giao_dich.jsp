<%@page import="vn.dtt.duongbo.report.ReportFunction"%>
<%@page import="vn.dtt.duongbo.utils.document.DocumentUtils"%>
<%@page import="vn.dtt.duongbo.utils.config.DuongBoConfigurationManager"%>
<%@page import="vn.dtt.duongbo.utils.DoanhNghiepUtils"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String xacNhanThanhToanId = ParamUtil.getString(request, Constants.ID_XACNHANTHANHTOAN);
	String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY);
	String returnURL = ParamUtil.getString(request, Constants.RETURN_URL);
	String phieuXuLyId = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY);
	
	PortletURL quayLaiUrl = renderResponse.createRenderURL();
	quayLaiUrl.setParameter("jspPage", returnURL);
	quayLaiUrl.setParameter(Constants.ID_XACNHANTHANHTOAN, xacNhanThanhToanId);
	quayLaiUrl.setParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
	quayLaiUrl.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
	
	List<TthcXacNhanThanhToanHoSo> list = TthcXacNhanThanhToanHoSoLocalServiceUtil.findByXacNhanThanhToanId(ConvertUtil.convertToLong(xacNhanThanhToanId));
	TthcXacNhanThanhToan tthcXacNhanThanhToan = TthcXacNhanThanhToanLocalServiceUtil.fetchTthcXacNhanThanhToan(ConvertUtil.convertToLong(xacNhanThanhToanId));
	
	
	DnDoanhNghiep dnDoanhNghiep = null;
	
	
%>

<portlet:actionURL var="xacNhanGiaoDichKeToan" name="xacNhanGiaoDichKeToan">
	<portlet:param name="<%=Constants.THANH_PHAN_XU_LY%>" value="<%=Constants.XU_LY_TLHS%>" />
	<portlet:param name="<%=Constants.ID_XACNHANTHANHTOAN%>" value="<%=String.valueOf(xacNhanThanhToanId)%>" />
</portlet:actionURL>

<div class="col-xs-12 form-group">
	<aui:form action="<%=xacNhanGiaoDichKeToan.toString()%>" method="post" name="myForm" id="myForm">
		<h3>Danh sách hồ sơ trong lần giao dịch</h3>
		
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr class="fl" style="background-color: #f9f9f9">
					<th width="5%">STT</th>
					<th width="45%">Tên thủ tục</th>
					<th width="15%">Mã số hồ sơ</th>
					<th width="15%">Mã tiếp nhận</th>
					<th width="15%">Số tiền</th>
				</tr>
			</thead>
			<tbody>
			<%
				int index = 1;
				TthcHoSoThuTuc hosoThuTuc = null;
				for (TthcXacNhanThanhToanHoSo thanhToanHoSo : list) {
					try {
						hosoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(thanhToanHoSo.getHoSoThuTucId());
					} catch (Exception es) {
						
					}
					
					if (hosoThuTuc != null) {
						if (dnDoanhNghiep == null) {
							dnDoanhNghiep = DnDoanhNghiepLocalServiceUtil.fetchDnDoanhNghiep(hosoThuTuc.getNguoiLamThuTucId());
						}
						TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(hosoThuTuc.getThuTucHanhChinhId());
				%>				
					<tr>
						<td><%=index++%></td>
						<td class="sp"><%=(thuTucHanhChinh != null) ? thuTucHanhChinh.getTenThuTuc() : ""%></td>
						<td class="sp"><%=(hosoThuTuc != null) ? hosoThuTuc.getMaSoHoSo() : ""%></td>
						<td class="sp"><%=(hosoThuTuc != null) ? hosoThuTuc.getMaBienNhan() : ""%></td>
						<td class="sp"><%=DoanhNghiepUtils.getMoney((int)thanhToanHoSo.getSoTien()+"")%></td>
					</tr>
				<%
					}
				}
				%>
			</tbody>
		</table>
	
		<h3>Xác nhận thông tin nộp phí thẩm xét</h3>
		
		<%
		if (dnDoanhNghiep != null) {
			String loaiPhi = "";
			
			if(tthcXacNhanThanhToan!=null){
				if(tthcXacNhanThanhToan.getLoaiPhi().trim().equals(Constants.PHI_THAM_DINH_CODE)){
					loaiPhi = DuongBoConfigurationManager.getStrProp("loai.phi.tham.dinh", "");
				}
			}
		%>
			<div class="col-xs-12 form-group">
				<label class="col-xs-2">Tên doanh nghiệp:</label>
				<p class="col-xs-10">
					<%=dnDoanhNghiep.getTenDoanhNghiep()%>
				</p>
			</div>
			
			<div class="col-xs-12 form-group">
				<label class="col-xs-2">Địa chỉ:</label>
				<p class="col-xs-10">
					<%=dnDoanhNghiep.getDiaChi() %>
				</p>
			</div>
			
			<div class="col-xs-12 form-group">
				<label class="col-xs-2">Ngày nộp:</label>
				<p class="col-xs-10">
					<%=(tthcXacNhanThanhToan!=null) ? ConvertUtil.parseDateToString3(tthcXacNhanThanhToan.getNgayTao()) :"" %>
				</p>
			</div>
			
			<div class="col-xs-12 form-group">
				<label class="col-xs-2">Số tiền:</label>
				<p class="col-xs-10">
					<%=(tthcXacNhanThanhToan != null) ? DoanhNghiepUtils.getMoney(String.valueOf(tthcXacNhanThanhToan.getSoTien())) : ""%>
					
					<%
					if (tthcXacNhanThanhToan.getTaiLieuDinhKem() > 0) {
					%>
					/<a style="color:blue" href="<%=DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(tthcXacNhanThanhToan.getTaiLieuDinhKem())%>">Hóa đơn</a>
					<%
					}
					%>
				</p>
			</div>
			
			<label class="col-xs-12">
				Thông tin xác nhận:<font color="red">*</font>
			</label>
			
			<div class="col-xs-12 form-group">
				<div class="col-xs-3">
					<input type="radio" name="<portlet:namespace/>xn" value="<%=Constants.MTYT_XAC_NHAN_THANH_TOAN_HOP_LE%>" id="<%=Constants.MTYT_XAC_NHAN_THANH_TOAN_HOP_LE%>">
					<label for="<%=Constants.MTYT_XAC_NHAN_THANH_TOAN_HOP_LE%>">Xác nhận hợp lệ</label>
				</div>
				
				<div class="col-xs-3">
					<input type="radio" name="<portlet:namespace/>xn" value="<%=Constants.MTYT_XAC_NHAN_THANH_TOAN_KHONG_HOP_LE%>" id="<%=Constants.MTYT_XAC_NHAN_THANH_TOAN_KHONG_HOP_LE%>">
					<label for="<%=Constants.MTYT_XAC_NHAN_THANH_TOAN_KHONG_HOP_LE%>">Xác nhận không hợp lệ</label>
				</div>
			</div>
			
			<label class="col-xs-12">
				Ý kiến:<font color="red">*</font>
			</label>
			
			<div class="col-xs-12 form-group">
				<textarea class="form-control" style="width:100%" rows="3" id="<portlet:namespace/>textYkien" name="<portlet:namespace/>textYkien"></textarea>
			</div>
			
			<label class="col-xs-12">
				Ngày xác nhận:<font color="red">*</font>
			</label>
			
			<div class="col-xs-12 form-group">
				<input class="form-control" type="text" readonly="readonly"
					id="textNgayXacNhan" name="<portlet:namespace/>textNgayXacNhan" value="<%=ReportFunction.parseDateVN2()%>" >
			</div>
		<%
		}
		%>
		
		<p><i>Ghi chú: Những trường thông tin có dấu "<span class="red">*</span>" là bắt buộc</i></p>
		
		<div style="text-align: center;">
			<input class="btn btn-primary" type="button"  onclick="summitForm('<%=xacNhanGiaoDichKeToan%>')" value="Xác nhận" />
			<input class="btn btn-primary" type="button" onclick=" window.location.href = '<%=returnURL %>'" value="Quay lại" />
		</div>
		
	</aui:form>
</div>

<script type="text/javascript">
function summitForm(url) {
	var ngayXacNhan = document.getElementById("textNgayXacNhan").value;
	var xacNhan = "";
	
	var radios = document.getElementsByName('<portlet:namespace/>xn');
	for (var i = 0, length = radios.length; i < length; i++) {
		if (radios[i].checked) {
			xacNhan=radios[i].value;
			break;
		}
	}
	
	var yKien = document.getElementById("<portlet:namespace/>textYkien").value;
	if (yKien == "") {
		alert("Chưa nhập ý kiến");
		return false;
	}
	
	if (xacNhan == "") {
		alert("Chưa chọn thông tin xác nhận");
		return false;
	}

	if (ngayXacNhan == "") {
		alert("Ngày xác nhận không được để trống");
		return false;
	}
	
	document.getElementById('<portlet:namespace />myForm').action = url;
	document.getElementById('<portlet:namespace />myForm').submit();
}
</script>