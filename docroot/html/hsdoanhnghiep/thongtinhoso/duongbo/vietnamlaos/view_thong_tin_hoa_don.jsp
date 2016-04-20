<%@page import="vn.dtt.duongbo.portlet.doanhnghiep.DoanhNghiepAction"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.duongbo.report.ReportBusinessUtils"%>
<%@page import="vn.dtt.duongbo.report.ReportUtils"%>
<%@page import="vn.dtt.duongbo.maudon.xml.MauDonFactory"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongbo.utils.document.DocumentUtils"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.dtt.duongbo.utils.DoanhNghiepUtils"%>
<%@page pageEncoding="UTF-8"%>
<%@ include file="/html/init.jsp"%>

<%
	LogFactoryUtil.getLog(DoanhNghiepAction.class).info("---duongbo/vietnamlaos/view_thong_tin_hoa_don.jsp");
	
	long idNoiDungHoSo = ParamUtil.getLong(request, Constants.ID_NOI_DUNG_HO_SO);
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	long xacNhanThanhToanId = ParamUtil.getLong(request, Constants.ID_XACNHANTHANHTOAN);
	
	String listNoiDungHoSo = ParamUtil.getString(request, "listNoiDungHoSo");
	String backUrl = ParamUtil.getString(request, "backUrl");
	
	LogFactoryUtil.getLog(DoanhNghiepAction.class).info("---duongbo/vietnamlaos/view_thong_tin_hoa_don.jsp----backUrl: " + backUrl);
	LogFactoryUtil.getLog(DoanhNghiepAction.class).info("---duongbo/vietnamlaos/view_thong_tin_hoa_don.jsp----hoSoThuTucId: " + hoSoThuTucId);
	LogFactoryUtil.getLog(DoanhNghiepAction.class).info("---duongbo/vietnamlaos/view_thong_tin_hoa_don.jsp----idNoiDungHoSo: " + idNoiDungHoSo);
	LogFactoryUtil.getLog(DoanhNghiepAction.class).info("---duongbo/vietnamlaos/view_thong_tin_hoa_don.jsp----xacNhanThanhToanId: " + xacNhanThanhToanId);
	
	//long idNoiDungHoSo = 1;
	String tenFileExport = "defaultPDF.pdfs";
	
	
	TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
	TthcXacNhanThanhToan xacNhanThanhToan = null;
	xacNhanThanhToan = TthcXacNhanThanhToanLocalServiceUtil.fetchTthcXacNhanThanhToan(xacNhanThanhToanId);
	
	String fileName = "";
	String urlFileDowLoad = "";
	String urlFile = "";
	
	if(xacNhanThanhToan != null){

		LogFactoryUtil.getLog(DoanhNghiepAction.class).info("---duongbo/vietnamlaos/view_thong_tin_hoa_don.jsp----idFileView: " + xacNhanThanhToan.getTaiLieuDinhKem());
		
		if(xacNhanThanhToan.getTaiLieuDinhKem() > 0){
			urlFile = DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(xacNhanThanhToan.getTaiLieuDinhKem());
		}
		
		LogFactoryUtil.getLog(DoanhNghiepAction.class).info("---duongbo/vietnamlaos/view_thong_tin_hoa_don.jsp----urlFile: " + urlFile);
		
		
		if(urlFile.contains(".pdfs")){
			urlFileDowLoad = urlFile.replace(".pdfs", ".pdf");
		} else if(urlFile.contains(".doc")){
			urlFileDowLoad="https://docs.google.com/viewer?url="+PortalUtil.getPortalURL(request)+urlFile+"&embedded=true";
		} else{
			urlFileDowLoad = urlFile;
		}
	}
	
	PortletURL actionBack = renderResponse.createRenderURL();
	actionBack.setParameter("jspPage", backUrl);
	actionBack.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	actionBack.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	actionBack.setParameter("listNoiDungHoSo", String.valueOf(listNoiDungHoSo));
	
	if (xacNhanThanhToan != null) {
		String hinhThucTHanhToan2="";
		String loaiPhi2="";
		String trangThai2="";
		if(xacNhanThanhToan.getHinhThucThanhToan()==Constants.MTYT_HINH_THUC_THANH_TOAN_CHUYEN_KHOAN){
			hinhThucTHanhToan2 ="Thanh toán chuyển khoản";
		}else if(xacNhanThanhToan.getHinhThucThanhToan()==Constants.MTYT_HINH_THUC_THANH_TOAN_KEY_PAD){
			hinhThucTHanhToan2 ="Thanh toán thanh toán keypay";
		}
		
		if(xacNhanThanhToan.getLoaiPhi().trim().equals(Constants.PHI_THAM_DINH_CODE)){
			loaiPhi2 = "Phí thẩm định";
		}else if(xacNhanThanhToan.getLoaiPhi().trim().equalsIgnoreCase(Constants.PHI_PHAT_SINH_CODE)){
			loaiPhi2 ="Phí phát sinh";}
		
		if(xacNhanThanhToan.getTrangThaiXacNhan()==Constants.MTYT_CHUA_XAC_NHAN_THANH_TOAN){
			trangThai2 ="chưa xác nhận thanh toán";
		}else if(xacNhanThanhToan.getTrangThaiXacNhan()==Constants.MTYT_XAC_NHAN_THANH_TOAN_HOP_LE){
			trangThai2 ="xác nhận thanh toán hợp lệ";
		}else if(xacNhanThanhToan.getTrangThaiXacNhan()==Constants.MTYT_XAC_NHAN_THANH_TOAN_KHONG_HOP_LE){
			trangThai2 ="xác nhận thanh toán không hợp lệ";
		}
		
%>

<style>
	  .dong{
	  	 height: 30px;
	  }
</style>

<!-- html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/view_thong_tin_hoa_don.jsp -->

<section class="right" style="padding: 1px;">
<div class="main_chuanbihs" style="  margin: 5px;background-color: white;border: 1px solid rgb(176, 176, 175);padding: 10px;">	
<div style="  border: 1px solid rgb(199, 195, 195);height: auto;padding: 15px;margin-bottom: 25px;" > 
	<p style="text-align: left;">
		<span style="font-family: Arial; font-size: 13px; font-weight: bold; font-style: normal; text-decoration: none; color: #333333;">Thông tin xác nhận:</span>
	</p>
	<table style="width:100%;">
		<tr class="dong">
			<td>Mã giao dịch: </td>
			<td><%=(xacNhanThanhToan.getMaTuSinh()==null)?"":xacNhanThanhToan.getMaTuSinh() %></td>
		</tr>
		<tr class="dong">
			<td>Trạng thái: </td>
			<td><%=trangThai2 %></td>
		</tr>
		<tr class="dong">
			<td>Số tiền: </td>
			<td><%=(xacNhanThanhToan.getSoTien()+""==null)?"":DoanhNghiepUtils.getMoney(String.valueOf(xacNhanThanhToan.getSoTien())) %></td>
		</tr>
		
		<tr class="dong">
			<td>Loại phí: </td>
			<td><%=loaiPhi2 %></td>
		</tr>
		
		<tr class="dong">
			<td style="width:20%;">Hình thức thanh toán: </td>
			<td><%=hinhThucTHanhToan2 %></td>
		</tr>
		<tr class="dong">
			<td>Thông tin xác nhận: </td>
			<%
				if(xacNhanThanhToan!=null){
					if(xacNhanThanhToan.getHinhThucThanhToan()==Constants.MTYT_HINH_THUC_THANH_TOAN_CHUYEN_KHOAN){
						 if (xacNhanThanhToan.getTaiLieuDinhKem() > 0) {
					            %>
					            <td><%=xacNhanThanhToan.getThongTinXacNhan() %>/<a style="color:blue" href="<%=DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(xacNhanThanhToan.getTaiLieuDinhKem())%>">Hóa đơn</a></p></td>
					            <%
					            }
					}else if(xacNhanThanhToan.getHinhThucThanhToan()==Constants.MTYT_HINH_THUC_THANH_TOAN_KEY_PAD){
						//truc tuyen keypay
						%>
						<td><%=xacNhanThanhToan.getMaTuSinh() %>/<a href="#">-----</a></td>
						<%
					}
				}
			%>
		</tr>
		<tr class="dong">
			<td>Người xác nhận: </td>
			<td><%=(xacNhanThanhToan.getNguoiXacNhan()+""==null)?"":xacNhanThanhToan.getNguoiXacNhan() %></td>
		</tr>
		<tr class="dong">
			<td>Ngày xác nhận: </td>
			<td><%=(xacNhanThanhToan.getNgayXacNhan()==null)?"":xacNhanThanhToan.getNgayXacNhan() %></td>
		</tr>
		
		<tr class="dong">
			<td>Ý kiến: </td>
			<td><%=(xacNhanThanhToan.getYKienXuLy()==null)?"":xacNhanThanhToan.getYKienXuLy() %></td>
			
		</tr>
			
	</table>
	
	</div>
	
	
	
	<%
	if(xacNhanThanhToan.getHinhThucThanhToan() == Constants.THANH_TOAN_CHUYEN_KHOAN){
		%>
			<div align="center">
			<OBJECT data="<%=urlFileDowLoad%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0"
				type="text/html" TITLE="Báo cáo" 
				WIDTH="100%" HEIGHT="770px"
				style="background: white; min-height: 100%;" >
					<a href="<%=urlFileDowLoad%>">Tai file xuong</a> 
			</object>
			</div>
		<%	
		}else if(xacNhanThanhToan.getHinhThucThanhToan() == Constants.THANH_TOAN_KEYPAY){
			%>
				<div align="center"></div>
			<%
			}
	%>
</div>
</section>

<%}%>
<div class="btns_chuanbihs" style="margin: 5px 0px 40px 0px;">
	<button style="margin: 15px 0px 15px 5px;" class="button4" type="button" onclick="window.location.href='<%=actionBack.toString()%>'">Quay lại</button>
</div>

