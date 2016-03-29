<%@page import="vn.dtt.duongbo.utils.config.DuongBoConfigurationManager"%>
<%@page import="vn.dtt.duongbo.business.MotCuaBusiness"%>
<%@page import="vn.dtt.duongbo.utils.document.DocumentUtils"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="vn.dtt.duongbo.utils.DoanhNghiepUtils"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongbo.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String xacNhanThanhToanId = ParamUtil.getString(request, Constants.ID_XACNHANTHANHTOAN);
	String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY);
	String returnURL = ParamUtil.getString(request, Constants.RETURN_URL);
	String phieuXuLyId = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY);

	TthcXacNhanThanhToan tthcXacNhanThanhToan = TthcXacNhanThanhToanLocalServiceUtil.fetchTthcXacNhanThanhToan(ConvertUtil.convertToLong(xacNhanThanhToanId));
	List<TthcXacNhanThanhToanHoSo> list = TthcXacNhanThanhToanHoSoLocalServiceUtil.findByXacNhanThanhToanId(ConvertUtil.convertToLong(xacNhanThanhToanId));
	
	PortletURL xacNhanLaiUrl = renderResponse.createRenderURL();
	xacNhanLaiUrl.setParameter("jspPage", "/html/hscanbo/thulyhs/duongbo/tongcuc/ketoan/xac_nhan_giao_dich.jsp");
	xacNhanLaiUrl.setParameter(Constants.ID_XACNHANTHANHTOAN, xacNhanThanhToanId);
	xacNhanLaiUrl.setParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
	xacNhanLaiUrl.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
	xacNhanLaiUrl.setParameter(Constants.RETURN_URL, "/html/hscanbo/thulyhs/duongbo/tongcuc/ketoan/xem_thong_tin_xac_nhan.jsp");
	
	DnDoanhNghiep dnDoanhNghiep = null;
%>


<div class="col-xs-12 form-group">
	<aui:form action="" method="" name="myForm" id="myForm">
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
			
			<div class="col-xs-12 form-group">
				<label class="col-xs-2">Cán bộ xác nhận:</label>
				<p class="col-xs-10">
					<%=(tthcXacNhanThanhToan != null) ? MotCuaBusiness.getNameByIdNguoiThamTra(tthcXacNhanThanhToan.getNguoiXacNhan()) : ""%>
				</p>
			</div>
			
			<%
			if(tthcXacNhanThanhToan!=null){
				String trangThai="";
				if(tthcXacNhanThanhToan.getTrangThaiXacNhan()==Constants.MTYT_CHUA_XAC_NHAN_THANH_TOAN){
					trangThai =	DuongBoConfigurationManager.getStrProp("chua.xac.nhan.thanh.toan", "");
				}else if(tthcXacNhanThanhToan.getTrangThaiXacNhan()==Constants.MTYT_XAC_NHAN_THANH_TOAN_HOP_LE){
					trangThai =	DuongBoConfigurationManager.getStrProp("xac.nhan.thanh.toan.hop.le", "");
				}else if(tthcXacNhanThanhToan.getTrangThaiXacNhan()==Constants.MTYT_XAC_NHAN_THANH_TOAN_KHONG_HOP_LE){
					trangThai =	DuongBoConfigurationManager.getStrProp("xac.nhan.thanh.toan.khong.hop.le", "");
				}
				%>
					<div class="col-xs-12 form-group">
						<label class="col-xs-2">Thông tin xác nhận:</label>
						<p class="col-xs-10">
							<%=trangThai%>
						</p>
					</div>
				<%
			}
			%>

			<p>
				<span class="lb_name2">Ý kiến:</span>
				<%=(tthcXacNhanThanhToan != null) ? tthcXacNhanThanhToan.getYKienXuLy() : ""%>
			</p><br/><br>
			<p>
				<span class="lb_name2">Ngày xác nhận:</span>
				<%=(tthcXacNhanThanhToan != null) ? ConvertUtil.parseDateToString3(tthcXacNhanThanhToan.getNgayXacNhan()) : ""%>
			</p><br/>
			
			<label class="col-xs-12">
				Ý kiến:
			</label>
			
			<div class="col-xs-12 form-group">
				<p><%=(tthcXacNhanThanhToan != null) ? tthcXacNhanThanhToan.getYKienXuLy() : ""%></p>
			</div>
			
			<div class="col-xs-12 form-group">
				<label class="col-xs-2">Ngày xác nhận:</label>
				<p class="col-xs-10">
					<%=(tthcXacNhanThanhToan != null) ? ConvertUtil.parseDateToString3(tthcXacNhanThanhToan.getNgayXacNhan()) : ""%>
				</p>
			</div>
			
		<%
		}
		%>
		
		<div style="text-align: center;">
			<input class="btn btn-primary" type="button" onclick=" window.location.href = '<%=returnURL %>'" value="Quay lại" />
			<%
			if(tthcXacNhanThanhToan.getTrangThaiXacNhan()==Constants.MTYT_XAC_NHAN_THANH_TOAN_KHONG_HOP_LE){
			%>
				<input class="btn btn-primary" type="button" onclick="window.location.href='<%=xacNhanLaiUrl.toString()%>'" value="Xác nhận lại" />
			<%
			}
			%>
		</div>
	</aui:form>
</div>

