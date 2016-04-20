<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="com.liferay.portal.service.OrganizationLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Organization"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.duongbo.utils.format.FormatData"%>
<%@page import="java.util.Calendar"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="vn.dtt.duongthuy.maudon.DonOnline"%>
<%@page import="vn.dtt.duongthuy.maudon.model.ThongBao"%>
<%@page import="vn.dtt.duongbo.utils.DoanhNghiepUtils"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalService"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo"%>
<%@page import="vn.dtt.duongbo.utils.document.DocumentUtils"%>
<%@page import="vn.dtt.duongbo.maudon.xml.MauDonFactory"%>
<%@page import="vn.dtt.duongbo.report.ReportUtils"%>
<%@page import="vn.dtt.duongbo.report.ReportBusinessUtils"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page pageEncoding="UTF-8"%>
<%@ include file="/html/init.jsp"%>

<%
String keyPDF = ParamUtil.getString(request, "keyPDF");
TthcThuTucHanhChinh thuTucHanhChinhTmp = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(thuTucHanhChinhId);
	
TthcNoidungHoSo noidungHoSoXML = null;
TthcThanhPhanHoSo ett = TthcThanhPhanHoSoLocalServiceUtil.fetchTthcThanhPhanHoSo(thanhPhanHoSoId);
if(Validator.isNotNull(ett) && Validator.isNotNull(ett.getMauTrucTuyen())){
	noidungHoSoXML = TthcNoidungHoSoLocalServiceUtil.findByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId, thanhPhanHoSoId).get(0);
}

if(Validator.isNotNull(noidungHoSoXML) && Validator.isNotNull(keyPDF)){
	idNoiDungHoSo = noidungHoSoXML.getId();
}
	String tenFileExport = "defaultPDF.pdfs";
	
	ThongBao thongBao = null;
	TthcNoidungHoSo tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(idNoiDungHoSo);
	//System.out.println("-------in idNoiDungHoSo"+idNoiDungHoSo);
	String fileName = "";
	String urlFileDowLoad = "";
	String urlFile = "";
	if(tthcNoidungHoSo != null){
		if(((Validator.isNotNull(ett) && Validator.isNull(ett.getMauTrucTuyen())) || Validator.isNull(keyPDF)) && (tthcNoidungHoSo.getTaiLieuDinhKem() > 0)){
			urlFile = DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(tthcNoidungHoSo.getTaiLieuDinhKem());
		} else{
			if(tthcNoidungHoSo.getNoiDungXml() != null && tthcNoidungHoSo.getNoiDungXml().trim().length() > 0){
				//System.out.println("1------ett.getLoaiThanhPhan(): "+ett.getLoaiThanhPhan()+"//"+tthcNoidungHoSo.getNoiDungXml());
				if(ett.getLoaiThanhPhan() == 4){
					thongBao = (ThongBao) DonOnline.getDonOnline(tthcNoidungHoSo.getNoiDungXml());
					//System.out.println("------thongBao: "+thongBao);
				}else{
					//System.out.println("-------getNoiDungXml ton tai");
					
					List<Object> allMauDon = MauDonFactory.converXMLMessagesContentToObject(tthcNoidungHoSo.getNoiDungXml());
					if(allMauDon != null && allMauDon.size()>0){
						String realPath = ReportUtils.getTemplateReportFilePath(request);

						fileName = ReportBusinessUtils.actionExportMauDon(realPath, hoSoThuTucId, thanhPhanHoSoId, allMauDon.get(0));
						//System.out.println("-------in thanhPhanHoSoId"+thanhPhanHoSoId);
						if (fileName.equalsIgnoreCase(ReportBusinessUtils.FILE_NAME_NULL) == false) {
							tenFileExport = fileName;
						}
						//System.out.println("==report_export.jsp======tenFileExport===" + tenFileExport);
						//
						
						urlFile = request.getContextPath() + "/export/" + tenFileExport;
					}
				}
			}
		}		
		
		//System.out.println("UrlFile====" + urlFile);
		
		if(urlFile.contains(".pdfs")){
			urlFileDowLoad = urlFile.replace(".pdfs", ".pdf");
		} else if(urlFile.contains(".doc")){
			urlFileDowLoad="https://docs.google.com/viewer?url="+PortalUtil.getPortalURL(request)+urlFile+"&embedded=true";
		} else{
			urlFileDowLoad = urlFile;
		}
	}
	
	
%>
<%
	if (tthcNoidungHoSo != null) {
%>
<div align="center" id="reportView2">
	<c:choose>
		<c:when test="<%= thongBao == null %>" >
			<%if(Validator.isNull(noidungHoSoXML) && Validator.isNotNull(keyPDF)){ %>
				<object 
					type="text/html" TITLE="Báo cáo" 
					WIDTH="100%" HEIGHT="770px"
					style="background: white; min-height: 100%;" >
				</object>
				<%}else{%>
				<object data="<%=urlFileDowLoad%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0"
					type="text/html" TITLE="Báo cáo" 
					WIDTH="100%" HEIGHT="770px"
					style="background: white; min-height: 100%;" >
						<a href="<%=urlFileDowLoad%>">Tải file xuống</a> 
				</object>
			<%} %>
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
							<label>Cộng hòa xã hội chủ nghĩa Việt Nam</label>
							<label>Độc lập - Tự do - Hạnh phúc</label>
							<p>Hà Nội, ngày <%= cal.get(Calendar.DAY_OF_MONTH) %> tháng <%= cal.get(Calendar.MONTH) + 1 %> năm <%= cal.get(Calendar.YEAR) %></p>
						</div>
						<div class="col-xs-12 text-center">
							<h4><%= thongBao.getTieuDe() %></h4>
							<p><b>Kính gửi:</b> <%= GetterUtil.getString(thongBao.getNguoiNhan()) %></p>
						</div>
						<div class="col-xs-12">
							<p><%= tenDonViGui %> đã nhận được hồ sơ cho <strong><%= thuTucHanhChinhTmp.getTenThuTuc() %></strong>. Sau khi xem xét <%= tenDonViGui %> có ý kiến như sau:</p>
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
							<p><i>(Đã ký)</i></p>
						</div>
					</div>
				</div>
			</div>
		</c:otherwise>
	</c:choose>
</div>
<%} %>

