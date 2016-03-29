<%@page import="com.liferay.portal.service.OrganizationLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Organization"%>
<%@page import="java.util.Calendar"%>
<%@page import="vn.dtt.duongbo.utils.format.FormatData"%>
<%@page import="vn.dtt.duongbo.utils.format.ConvertUtil"%>
<%@page import="javax.portlet.ResourceURL"%>
<%@page import="vn.dtt.duongbo.utils.document.DocumentUtils"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.duongbo.maudon.xml.MauDonFactory"%>
<%@page import="vn.dtt.duongbo.utils.format.DateUtils"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongbo.maudon.model.DeNghiCapGiayPhepVanTaiDuongBoVietLao"%>
<%@page import="vn.dtt.duongbo.utils.DoanhNghiepUtils"%>
<%@page import="vn.dtt.duongbo.business.nghiepvu.NghiepVuUtils"%>
<%@page import="vn.dtt.duongbo.dao.common.model.impl.TthcBieuMauHoSoImpl"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepImpl"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo"%>
<%@page import="vn.dtt.duongbo.report.ReportBusinessUtils"%>
<%@page import="vn.dtt.duongbo.report.ReportUtils"%>
<%@ include file="init.jsp"%>
<%! private static Log _log = LogFactoryUtil.getLog("html_hsdoanhnghiep_thongtinhoso_duongthuy_thanh_phan_ho_so_view_jsp"); %>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	boolean isView = ParamUtil.getBoolean(request, "isView", false);
	boolean is_view = ParamUtil.getBoolean(request, "is_view", false);
	String jspBack = ParamUtil.getString(request, "jspBack");
	String maDonVi = ParamUtil.getString(request, DTConstants.MA_DON_VI);
	
	if(Validator.isNull(noiDungXML) && noiDungHoSo != null) {
		noiDungXML = noiDungHoSo.getNoiDungXml();
	}

	PortletURL actionKySo = renderResponse.createActionURL();
	actionKySo.setParameter(ActionRequest.ACTION_NAME, "kySo");
	actionKySo.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	actionKySo.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	actionKySo.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));

	PortletURL backURL = renderResponse.createRenderURL();
	
	if(Validator.isNotNull(jspBack)) {
		backURL.setParameter("jspPage", jspBack);
	} else {
		backURL.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/duongthuy/" + thanhPhanHoSo.getMaThanhPhan() + ".jsp");
	}
	backURL.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	backURL.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
	backURL.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	backURL.setParameter("noiDungXML", noiDungXML);
	backURL.setParameter("isView", String.valueOf(isView));
	
	String urlFile = StringPool.BLANK;
	ThongBao thongBao = null;
	
	if(noiDungHoSo != null && noiDungHoSo.getTaiLieuDinhKem() > 0) {
		urlFile = DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(noiDungHoSo.getTaiLieuDinhKem());
	} else if (Validator.isNotNull(noiDungXML)) {
		
		if(thanhPhanHoSo.getLoaiThanhPhan() == 4) {	
			// Trong truong hop la thanh phan ho so tra ket qua hoac yeu cau bo sung thi noidungxml chua text thong bao, 
			// trong truong hop nay khong phai la don 
			thongBao = (ThongBao) DonOnline.getDonOnline(noiDungXML);
		} else {
			String tenFileExport = "defaultPDF.pdf";
			
			String realPath = ReportUtils.getTemplateReportFilePath(request);
	
			String fileName = ReportBusinessUtils.actionExportMauDon(realPath, hoSoThuTucId, thanhPhanHoSoId, DonOnline.getDonOnline(noiDungXML));
			
			if (fileName.equalsIgnoreCase(ReportBusinessUtils.FILE_NAME_NULL) == false) {
				tenFileExport = fileName;
			}
			
			urlFile = request.getContextPath() + "/export/" + tenFileExport;
		}
	}
%>

<h4 class="PL15 BGT BOB font14 col-xs-12"><%=bieuMauHoSo != null ? bieuMauHoSo.getTenBieuMau() : ""%></h4>
<div class="P10 col-xs-12">
	<div class="BGT noidung">
		<div class="col-xs-12">
			<!-- Hướng dẫn -->
			<div role="alert" class="alert alert-warning">
				<h5 style="margin-top: -10px;">Xem trước nội dung</h5>
			</div>
			<c:choose>
				<c:when test="<%= thongBao == null %>" >
					<div>
						<div align="center">
							<OBJECT data="<%=urlFile%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0"
								type="text/html" TITLE="Báo cáo" 
								WIDTH="100%" HEIGHT="770px"
								style="background: white; min-height: 100%;" >
									<a href="<%=urlFile%>"><i>Tải file xuống</i></a> 
							</object>
						</div>
					</div>
				</c:when>
				<c:otherwise>
					<div class="P10 col-xs-12">
						<div class="BGT noidung">
							<%
							String tenDonViGui = "";
							
							long donViGuiId = GetterUtil.getLong(thongBao.getDonViGui());
							
							if(donViGuiId > 0) {
								Organization org = null;
								
								try {
									org = OrganizationLocalServiceUtil.getOrganization(donViGuiId);
								} catch(Exception e) {
									_log.error(e);
								}
								
								if(org != null) {
									tenDonViGui = org.getName();
								}
							}
							
							Date ngayGui = FormatData.parseStringToDate(thongBao.getNgayGui());
							if(ngayGui == null) {
								ngayGui = new Date();
							}
							Calendar cal = Calendar.getInstance();
							cal.setTime(ngayGui);
							%>
							<!-- Start ... -->
							<div class="box1000">
								<div class="col-xs-4 pull-right text-center">
									<p>Hà Nội, ngày <%= cal.get(Calendar.DAY_OF_MONTH) %> tháng <%= cal.get(Calendar.MONTH) + 1 %> năm <%= cal.get(Calendar.YEAR) %></p>
								</div>
								<div class="col-xs-12 text-center">
									<h4><%= thongBao.getTieuDe() %></h4>
									<p><b>Kính gửi:</b> <%= GetterUtil.getString(thongBao.getNguoiNhan()) %></p>
								</div>
								<div class="col-xs-12">
									<p><%= tenDonViGui %> đã nhận được hồ sơ cho <strong><%= thuTucHanhChinh.getTenThuTuc() %></strong>. Sau khi xem xét <%= tenDonViGui %> có ý kiến như sau:</p>
									<div class="col-xs-12">
										<c:if test="<%= Validator.isNotNull(thongBao.getNoiDung()) %>">
											<p>- <%= thongBao.getNoiDung() %></p>
										</c:if>
										<c:if test="<%= Validator.isNotNull(thongBao.getPhiLePhi()) %>">
											<p>- Phí/Lệ phí cần nộp: <%= DoanhNghiepUtils.getMoney(thongBao.getPhiLePhi()) %></p>
										</c:if>
										<c:if test="<%= Validator.isNotNull(thongBao.getNgayHenTra()) %>">
											<p>- Ngày hẹn trả, nhận kết quả: <%= thongBao.getNgayHenTra() %></p>
										</c:if>
									</div>
									<p><%= tenDonViGui %> kính báo để Quý tổ chức/cá nhân biết, thực hiện.</p>
								</div>
								<div class="col-xs-4 pull-right text-center">
									<p><%= tenDonViGui %></p>
								</div>
							</div>
						</div>
					</div>
				</c:otherwise>
			</c:choose>
		</div>
		
		<div class="col-xs-12">
			<aui:form name="myForm" method="POST" action="<%=actionLuuNoiDungHoSo %>">
				
				<aui:input type="hidden" name="noiDungXML" value="<%= noiDungXML %>" />
				<aui:input type="hidden" name="<%= DTConstants.MA_DON_VI %>" value="<%= maDonVi %>" />
				
				<c:if test="<%= !is_view %>">
					<input type="button" class="btn btn-primary" onclick="summitForm('<%=actionLuuNoiDungHoSo%>')" value="Lưu lại" />
					<input type="button" class="btn btn-primary" onclick="summitForm('<%=actionLuuNoiDungHoSo%>')" value="Ký số" />
					
					<script type="text/javascript">
						function summitForm(url) {
							document.getElementById('<portlet:namespace />myForm').action = url;
							document.getElementById('<portlet:namespace />myForm').submit();
						}
					</script>
				</c:if>
				
				<input type="button" class="btn btn-primary" onclick="location.href='<%= backURL.toString() %>'" value="Quay lại" />
			</aui:form>
		</div>
	</div>
</div>
