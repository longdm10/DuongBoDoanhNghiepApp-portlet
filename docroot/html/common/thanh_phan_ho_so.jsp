<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="vn.dtt.duongbo.utils.document.DocumentUtils"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.utils.DoanhNghiepUtils"%>
<%@page import="vn.dtt.duongthuy.business.DuongThuyUtil"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo"%>
<%@page import="vn.dtt.duongbo.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.portlet.doanhnghiep.DoanhNghiepAction"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoBieuMauImpl"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcBieuMauHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoBieuMauLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcTrangThaiHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcTrangThaiHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.duongbo.utils.config.DuongBoConfigurationManager"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>


<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<link rel="stylesheet" href="<%=request.getContextPath()%>/css/tipsy.css" type="text/css" media="screen" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/jquery.alerts.css" type="text/css" media="screen" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/jquery-ui.css" type="text/css" media="screen" />

<%
	long userId = PortalUtil.getUserId(request);
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	String listNoiDungHoSo = ParamUtil.getString(request, "listNoiDungHoSo");
	
	String jspThanhPhanHoSo = ParamUtil.getString(request, "jspThanhPhanHoSo");
	String jspViewMauDon = ParamUtil.getString(request, "jspViewMauDon");
	boolean isView = ParamUtil.getBoolean(request, "isView", false);
	
	TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
	
	/**
	1:Đầu vào bắt buộc; 2: Đầu vào có thể bổ sung sau; 3: Đầu vào không bắt buộc; 4: Kết quả trả về
	*/
	
	List<TthcThanhPhanHoSo> allThanhPhanHoSo4 = TthcThanhPhanHoSoLocalServiceUtil.findByThutucHanhChinhIdAndLoaiThanhPhan(
			String.valueOf(thuTucHanhChinhId), String.valueOf(Constants.THANH_PHAN_HO_SO_KET_QUA_TRA_VE));
	
	List<TthcThanhPhanHoSo> allThanhPhanHoSo123 = TthcThanhPhanHoSoLocalServiceUtil.findByThutucHanhChinhIdAndLoaiThanhPhan(
			String.valueOf(thuTucHanhChinhId), Constants.THANH_PHAN_HO_SO_BAT_BUC + "," + Constants.THANH_PHAN_HO_SO_BO_XUNG + "," + Constants.THANH_PHAN_HO_SO_KHONG_BAT_BUC);
	
	List<TthcThanhPhanHoSo> allThanhPhanHoSo = new ArrayList<TthcThanhPhanHoSo>();
	TthcThanhPhanHoSo thanhPhanHoSo = null;
	
	List<TthcThanhPhanHoSoBieuMau> allThanhPhanHoSoBieuMau = null;
	TthcThanhPhanHoSoBieuMau thanhPhanHoSoBieuMau = null;
	
	List<TthcBieuMauHoSo> allBieuMauHoSo = null;
	TthcBieuMauHoSo bieuMauHoSo = null;
	
	List<TthcNoidungHoSo> allNoiDungHoSo = null;

	if(allThanhPhanHoSo123 != null && allThanhPhanHoSo123.size() > 0){
		for(TthcThanhPhanHoSo thanhPhanHoSo123 : allThanhPhanHoSo123){
			allThanhPhanHoSo.add(thanhPhanHoSo123);
		}
	}

	if(allThanhPhanHoSo4 != null && allThanhPhanHoSo4.size() > 0){
		for(TthcThanhPhanHoSo thanhPhanHoSo4 : allThanhPhanHoSo4){
			allThanhPhanHoSoBieuMau = TthcThanhPhanHoSoBieuMauLocalServiceUtil.findByThanhPhanHoSoId(thanhPhanHoSo4.getId());
			
			TthcNoidungHoSo noidungHoSoTmp = null;
			
			if(allThanhPhanHoSoBieuMau != null && allThanhPhanHoSoBieuMau.size() > 0){
				for(int k=0; k < allThanhPhanHoSoBieuMau.size(); k++){
					thanhPhanHoSoBieuMau = allThanhPhanHoSoBieuMau.get(k);
					
					bieuMauHoSo = TthcBieuMauHoSoLocalServiceUtil.fetchTthcBieuMauHoSo(thanhPhanHoSoBieuMau.getBieuMauHoSoId());
					
					noidungHoSoTmp = TthcNoidungHoSoLocalServiceUtil.findByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId, thanhPhanHoSoBieuMau.getBieuMauHoSoId(), thanhPhanHoSo4.getId());
					
					if(noidungHoSoTmp != null){
						allThanhPhanHoSo.add(thanhPhanHoSo4);
						break;
					}
				}
			} else {
				noidungHoSoTmp = TthcNoidungHoSoLocalServiceUtil.findByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId, 0, thanhPhanHoSo4.getId());
				
				if(noidungHoSoTmp != null){
					allThanhPhanHoSo.add(thanhPhanHoSo4);
					break;
				}
			}
		}
		
		thanhPhanHoSo = null;
		allThanhPhanHoSoBieuMau = null;
		thanhPhanHoSoBieuMau = null;
		allBieuMauHoSo = null;
		bieuMauHoSo = null;
	}
	
	TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(thuTucHanhChinhId);
	
	String thongTinPhiLePhi = "";
	long payAmount = 0;
	
	boolean thanhToan = false;
	
	if(hoSoThuTuc != null) {
		String[] arr_thongTinPhiLePhi = DuongThuyUtil.getThongTinPhiLePhi(hoSoThuTuc);
		thongTinPhiLePhi = GetterUtil.getString(arr_thongTinPhiLePhi[0]);
		payAmount = GetterUtil.getLong(arr_thongTinPhiLePhi[1]);
		
		TthcXacNhanThanhToan xacNhanThanhToan = TthcXacNhanThanhToanLocalServiceUtil.findByMaTuSinh(hoSoThuTuc.getMaSoHoSo());
		
		if(xacNhanThanhToan != null && xacNhanThanhToan.getTrangThaiXacNhan() != Constants.MTYT_XAC_NHAN_THANH_TOAN_HOP_LE) {
			thanhToan = true;
		}
	}

	PortletURL actionLuuNhapHoSo = renderResponse.createActionURL();
	actionLuuNhapHoSo.setParameter(ActionRequest.ACTION_NAME, "luuNhapHoSo");
	actionLuuNhapHoSo.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	actionLuuNhapHoSo.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	
	PortletURL actionNopHoSo = renderResponse.createActionURL();
	actionNopHoSo.setParameter(ActionRequest.ACTION_NAME, "nopHoSo");
	actionNopHoSo.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	actionNopHoSo.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	
	PortletURL actionUploadFileBieuMau = renderResponse.createActionURL();
	actionUploadFileBieuMau.setParameter(ActionRequest.ACTION_NAME, "upLoadFileBieuMau");
	actionUploadFileBieuMau.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	actionUploadFileBieuMau.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	actionUploadFileBieuMau.setParameter("listNoiDungHoSo", listNoiDungHoSo);
	
	PortletURL thanhPhanHoSoUrl = renderResponse.createRenderURL();
	thanhPhanHoSoUrl.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/duongthuy/thanh_phan_ho_so.jsp");
	thanhPhanHoSoUrl.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	thanhPhanHoSoUrl.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	
	PortletURL thanhToanTrucTuyenUrl = renderResponse.createRenderURL();
	thanhToanTrucTuyenUrl.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/ipay/thanh_toan_truc_tuyen.jsp");
	thanhToanTrucTuyenUrl.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	thanhToanTrucTuyenUrl.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	thanhToanTrucTuyenUrl.setParameter(Constants.VPC_AMOUNT, String.valueOf(payAmount));
	thanhToanTrucTuyenUrl.setParameter("backURL", PortalUtil.getCurrentURL(request));
	
	PortletURL thanhToanHoaDonUrl = renderResponse.createRenderURL();
	thanhToanHoaDonUrl.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/ipay/thanh_toan_hoa_don.jsp");
	thanhToanHoaDonUrl.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	thanhToanHoaDonUrl.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	thanhToanHoaDonUrl.setParameter(Constants.VPC_AMOUNT, String.valueOf(payAmount));
	thanhToanHoaDonUrl.setParameter("backURL", PortalUtil.getCurrentURL(request));
	
	String popupFormName = "";
	String radioCheck = "";
	
	if (allThanhPhanHoSo != null && allThanhPhanHoSo.size() > 0 && !isView) {
		
		for (int i = 0; i < allThanhPhanHoSo.size(); i++) {
			thanhPhanHoSo = allThanhPhanHoSo.get(i);
			allBieuMauHoSo = new ArrayList<TthcBieuMauHoSo>();
			allThanhPhanHoSoBieuMau = TthcThanhPhanHoSoBieuMauLocalServiceUtil.findByThanhPhanHoSoId(thanhPhanHoSo.getId());
			if (allThanhPhanHoSoBieuMau == null) { allThanhPhanHoSoBieuMau = new ArrayList<TthcThanhPhanHoSoBieuMau>(); }
			
			for (int k = 0; k < allThanhPhanHoSoBieuMau.size(); k++) {
				thanhPhanHoSoBieuMau = allThanhPhanHoSoBieuMau.get(k);
				bieuMauHoSo = TthcBieuMauHoSoLocalServiceUtil.fetchTthcBieuMauHoSo(thanhPhanHoSoBieuMau.getBieuMauHoSoId());
				if (bieuMauHoSo != null) {
					allBieuMauHoSo.add(bieuMauHoSo);
				}
			}
			
			popupFormName = "popupForm_" + thanhPhanHoSo.getId();
			
		%>
		
		
			<!-- Modal -->
			<div id="upLoadFile_dialog_<%=thanhPhanHoSo.getId() %>" class="modal fade" role="dialog">
				<div class="modal-dialog modal-lg">
					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<input type="button" class="close" data-dismiss="modal" value="&times;">
							<h4 class="modal-title text-center">Chọn loại văn bản</h4>
						</div>
						<form name="<%=popupFormName %>" id="<%=popupFormName%>" action="<%=actionUploadFileBieuMau %>" method="POST" enctype="multipart/form-data">
							<input type="hidden" id="<%=Constants.ID_THANH_PHAN_HO_SO %>_<%=thanhPhanHoSo.getId()%>" name="<%=Constants.ID_THANH_PHAN_HO_SO %>" value=''>
							<aui:input type="hidden" name="jspBack" value="<%= jspThanhPhanHoSo %>" />
							
							<div class="modal-body">
							<%
							if (allBieuMauHoSo.size() == 1) {
								radioCheck = "checked";
							} else {
								radioCheck = "";
							}
							%>
								<div class="col-xs-12 form-group">
								<%
								for (int k = 0; k < allBieuMauHoSo.size(); k++) {
									bieuMauHoSo = allBieuMauHoSo.get(k);
									%>
									<input type="radio" id="select_<%= thanhPhanHoSo.getId() %>_<%=k %>" name="selectRadio_<%= thanhPhanHoSo.getId() %>"
											value="<%=bieuMauHoSo.getMaBieuMau()%>" checked="<%=radioCheck %>" style="float: left; margin: 1px 10px 0 0">
									<span class="vert" style="font-size: 13.5px"><%=bieuMauHoSo.getTenBieuMau()%></span>
								<%
								}
								%>
								</div>
								
								<div class="col-xs-12 form-group">
									<label for="sel1">Tên tài liệu :</label>
									<input type="text" name="tenTaiLieu" id="tenTaiLieu_<%= thanhPhanHoSo.getId() %>" value="" class="form-control">
									<input type="file" style="position: static !important;" name="attachment" id="attachment_<%= thanhPhanHoSo.getId() %>">
								</div>
								
								<div class="progress" id="progress_bar" style="display: none;">
									<div class="progress-bar progress-bar-striped active4" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 100%"></div>
								</div>
								
								<div class="clear"></div>
							</div>
							<div class="modal-footer">
								<div class="col-xs-12">
									<input type="button" class="btn btn-primary" id="subm" onclick="summitPopupForm('<%=actionUploadFileBieuMau%>', '<%=thanhPhanHoSo.getId()%>', '<%=allBieuMauHoSo.size() %>')" value="Tải lên">
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
			<!-- End modal -->
			
			<%
		}
	}
	
	boolean canSubmit = true;
	String tenHoSoThieu = "";
	Map<Long, Boolean> mapHasDonOnline = new HashMap<Long, Boolean>();
%>
<aui:form action="<%=actionLuuNhapHoSo.toString()%>" name="myForm" id="myForm" method="POST">
<h4 class="PL15 BGT BOB font14 col-xs-12">Thành phần hồ sơ</h4>
<div class="P10 col-xs-12">
	<div class="BGT noidung">
		<div class="col-xs-12">
			<!-- Hướng dẫn -->
			<div role="alert" class="alert alert-warning">
				<h5 style="margin-top: -10px;">Hướng dẫn sử dụng dịch vụ công</h5>
				<p class="nortex" style="margin-top: -15px;">
					<br>Đăng ký lưu hành chính thức: <strong><%=thuTucHanhChinh.getTenThuTuc()%></strong>
					<br>
					<br><a href="#" style="float: right; margin-top: -25px;">Xem video hướng dẫn</a>
				</p>
			</div>
			
			<%
				String errorFileExtensions = "Chỉ tải lên file có đuôi mở rộng là " + StringUtil.merge(DocumentUtils.DEFAULT_FILE_EXTENSIONS, StringPool.COMMA);
				String errorFileMaxSize = "Chỉ tải lên file có dung lượng nhỏ hơn " + DocumentUtils.DEFAULT_MAX_SIZE / 1024 + " kb";
			%>
			<liferay-ui:error key="<%= DocumentUtils.ERROR_FILE_INVALID_EXTENSION %>" message="<%= errorFileExtensions %>" />
			<liferay-ui:error key="<%= DocumentUtils.ERROR_FILE_MAX_SIZE %>" message="<%= errorFileMaxSize %>" />
			

			<!-- Thành phần hồ sơ -->
			
			<table class="table table-striped table-bordered table-hover">
				<tbody>
					<tr>
						<th>STT</th>
						<th></th>
						<th width="50%">Thành phần hồ sơ</th>
						<th width="30%">Ghi chú</th>
						<th>Thao tác</th>
					</tr>
					
					<%
					if (allThanhPhanHoSo != null && allThanhPhanHoSo.size() > 0) {
						String srcImage = "";
						String srcImageEdit = request.getContextPath() + "/img/nhap-don.png";
						String srcImageUpload = request.getContextPath() + "/img/upload.png";
						String srcImageUploadUpdate = request.getContextPath() + "/img/i11.png";
						String srcImageUploadReplace = request.getContextPath() + "/img/i12.png";
						
						for (int i = 0; i < allThanhPhanHoSo.size(); i++) {
							thanhPhanHoSo = allThanhPhanHoSo.get(i);
							
							allNoiDungHoSo = TthcNoidungHoSoLocalServiceUtil.findByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId, thanhPhanHoSo.getId());
							
							long thanhPhanHoSoId = thanhPhanHoSo.getId();
							
							TthcNoidungHoSo noidungHoSo = null;
							long noiDungHoSoId = 0;
							if (allNoiDungHoSo != null && allNoiDungHoSo.size() > 0) {
								noidungHoSo = allNoiDungHoSo.get(0);
								noiDungHoSoId = noidungHoSo.getId();
							}
							
							if (thanhPhanHoSo.getLoaiThanhPhan() == Constants.THANH_PHAN_HO_SO_BO_XUNG) {
								if (Validator.isNotNull(thanhPhanHoSo.getMauTrucTuyen())) {
									srcImage = request.getContextPath() + "/img/i5.png";
								} else {
									srcImage = request.getContextPath() + "/img/i7.png";
								}
							} else {
								if (Validator.isNotNull(thanhPhanHoSo.getMauTrucTuyen())) {
									srcImage = request.getContextPath() + "/img/i6.png";
								} else {
									srcImage = request.getContextPath() + "/img/i8.png";
								}
							}
							
							if (noidungHoSo != null) {
								srcImage = request.getContextPath() + "/img/icon_finish.png";
							}
							
							boolean isRequired = false;
							if (thanhPhanHoSo.getLoaiThanhPhan() == Constants.THANH_PHAN_HO_SO_BAT_BUC) {
								isRequired = true;
								if(noidungHoSo == null) {
									canSubmit = false;
									tenHoSoThieu = thanhPhanHoSo.getTenThanhPhan();
								}
							}
							
							if(Validator.isNotNull(thanhPhanHoSo.getMauTrucTuyen())) {
								if(noidungHoSo != null) {
									mapHasDonOnline.put(thanhPhanHoSo.getId(), Boolean.TRUE);
								} else {
									mapHasDonOnline.put(thanhPhanHoSo.getId(), Boolean.FALSE);
								}
							}
							
							%>
							<tr>
								<td class="text-center"><%=i + 1%></td>
								<td class="text-center"><img src="<%=srcImage %>"></td>
								<td class="sp" style="word-wrap: break-word;" id='<%=thanhPhanHoSo.getMaThanhPhan() %>'>
									<%
									PortletURL editDonOnlineURL = renderResponse.createRenderURL();
									editDonOnlineURL.setParameter("jspPage", thanhPhanHoSo.getMauTrucTuyen());
									editDonOnlineURL.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
									editDonOnlineURL.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
									editDonOnlineURL.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
									editDonOnlineURL.setParameter(Constants.ID_NOI_DUNG_HO_SO, String.valueOf(noiDungHoSoId));
									
									%>
									
									<% // View thanh phan ho so. Neu la don thi hien thi link edit don %>
									<c:choose>
										<c:when test="<%= Validator.isNotNull(thanhPhanHoSo.getMauTrucTuyen()) %>">
											<a href="<%= editDonOnlineURL.toString() %>"><%=thanhPhanHoSo.getTenThanhPhan() %> <%=(isRequired ? "<span class='red'>*</span>" : "") %></a>
										</c:when>
										
										<c:otherwise>
											<%=thanhPhanHoSo.getTenThanhPhan() %> <%=(isRequired ? "<span class='red'>*</span>" : "") %>
										</c:otherwise>
									</c:choose>
									
									<% // View file dinh kem. Neu thanh phan ho so chi co file, khong co don thi hien thi link de xoa file %>
									<c:if test="<%= allNoiDungHoSo != null && allNoiDungHoSo.size() > 0 %>">
										<%
										for (TthcNoidungHoSo noiDungHoSoFor : allNoiDungHoSo) {
											PortletURL viewFileURL = null;
											
											viewFileURL = renderResponse.createRenderURL();
											viewFileURL.setParameter("jspPage", jspViewMauDon);
											viewFileURL.setParameter("jspBack", jspThanhPhanHoSo);
											viewFileURL.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
											viewFileURL.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
											viewFileURL.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
											viewFileURL.setParameter(Constants.ID_NOI_DUNG_HO_SO, String.valueOf(noiDungHoSoFor.getId()));
											viewFileURL.setParameter("isView", String.valueOf(isView));
											viewFileURL.setParameter("is_view", String.valueOf(isView));
										%>
										<c:if test="<%= Validator.isNotNull(noiDungHoSoFor.getTenTaiLieu()) %>">
											<br/>
											<a href="<%=viewFileURL.toString()%>" title="Xem nội dung giấy tờ">
												<span style="font-family:Arial;font-size:13px;font-weight:normal;font-style:italic;text-decoration:underline;color:#0000FF;">
													- <%= noiDungHoSoFor.getTenTaiLieu() %>
												</span>
											</a>
										</c:if>
										
										<c:if test="<%= !isView && Validator.isNull(thanhPhanHoSo.getMauTrucTuyen()) && thanhPhanHoSo.getLoaiThanhPhan() != Constants.THANH_PHAN_HO_SO_KET_QUA_TRA_VE %>">
											<%
											PortletURL xoaNoiDungHoSoURL = renderResponse.createActionURL();
											xoaNoiDungHoSoURL.setParameter(ActionRequest.ACTION_NAME, "xoaNoiDungHoSo");
											xoaNoiDungHoSoURL.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
											xoaNoiDungHoSoURL.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
											xoaNoiDungHoSoURL.setParameter("jspBack", jspThanhPhanHoSo);
											xoaNoiDungHoSoURL.setParameter(Constants.ID_NOI_DUNG_HO_SO, String.valueOf(noiDungHoSoFor.getId()));
											%>
											&nbsp; &nbsp; <img onclick='removeNoiDungHoSo("<%= xoaNoiDungHoSoURL.toString() %>")' src='<%= request.getContextPath()+"/img/icon_remove.png" %>'/>
										</c:if>
										<% } %>
									</c:if>
								</td>
								<td class="sp">
									<%= thanhPhanHoSo.getGhiChu() %>
								</td>
								<td>
									<c:if test="<%= !isView %>">
										<c:if test="<%= Validator.isNotNull(thanhPhanHoSo.getMauTrucTuyen()) %>">
											<a href="<%=editDonOnlineURL.toString() %>" title="Nhập thông tin">
												<img class="tabimg" src="<%=srcImageEdit%>">
											</a>
										</c:if>
										
										<a href="#" onclick="uploadFilePopup('<%=thanhPhanHoSo.getId()%>', <%=GetterUtil.getBoolean(mapHasDonOnline.get(thanhPhanHoSo.getId()), true) %>)" title="Tải giấy tờ lên">
											<img src="<%= srcImageUpload%>">
										</a>
										
										<c:if test="<%= Validator.isNull(thanhPhanHoSo.getMauTrucTuyen()) %>">
											<a title="Chọn từ giấy tờ riêng"><img class="tabimg" src="<%= srcImageUploadUpdate%>"></a>
											<a title="Chọn từ giấy tờ được cấp"><img src="<%= srcImageUploadReplace%>"></a>
										</c:if>
									</c:if>
									
								</td>
							</tr>
							<%
						}
					}
					%>
				</tbody>
			</table>
			
			<div id="messageDialog" style="display: none;">
				<div style="margin: 20px 0; border: 1px solid #999; padding: 10px 10px 5px">
					<p>Hồ sơ còn thiếu thông tin <%=tenHoSoThieu %></p><br>
				</div>
				<div class="btns_chuanbihs" style="margin-left: 45%">
					<input class="button4" style="margin-left: 0" type="button" value="OK" onclick="window.location.href='<%=thanhPhanHoSoUrl.toString()%>'">
				</div>
			</div>
		</div>
		
		<div class="col-xs-12 form-group">
			<p><i>Ghi chú: Những trường thông tin có dấu "<span class="red">*</span>" là bắt buộc</i></p>
		</div>
		
		<div class="col-xs-12">
			<% if(canSubmit && !isView ) { %>
				<input type="button" class="btn btn-primary" onclick="summitForm('<%=actionNopHoSo%>')" value="Nộp hồ sơ"/>
			<% } else if(!isView){ %>
				<input type="button" class="btn btn-primary" onclick="func_ShowMessage();" value="Nộp hồ sơ"/>
			<% } %>
		</div>
		<div class="clear"></div>
		
		<% // BEGIN: thanh toan %>
	
		<%
		if(thanhToan){
		%>
		<div class="col-xs-12">
			<div class="bot_hs" style="border:1px solid #dddddd; padding: 25px;">
		
				<img class="lisths1" src="<%=request.getContextPath() %>/img/list.png">
				
				<p class="spectex">Thông tin về phí, lệ phí:</p>
				
				<div class="col-xs-12 MB10">
					<p class="spectex2" style="margin-left: 36px !important;">- <%=thongTinPhiLePhi %>: 
						<span class="bold2"><%=DoanhNghiepUtils.getMoney(String.valueOf(payAmount)) %></span>
					</p>
				</div>
				
				<img class="lisths1" src="<%=request.getContextPath() %>/img/list.png">
				
				<p class="spectex" >Hướng dẫn nộp phí, lệ phí:</p>

				<div class="col-xs-12 MB10">
					<div class="col-xs-8">
						<p class="spectex2" style="margin-left: 20px !important;">
							<span class="bold3">- Cách 1:</span> Doanh nghiệp thanh toán trực tuyến thông qua dịch vụ thanh toán trực tuyến
						</p>
					</div>
					
					<div class="col-xs-4">
						<input type="button" class="btn btn-primary" style="float:right;" value="Thanh toán trực tuyến" onclick="window.location.href='<%=thanhToanTrucTuyenUrl.toString()%>'">
					</div>
					<div class="clear"></div>
				</div>
				<div class="clear"></div>
				<div class="col-xs-12 MB10">
					<div class="col-xs-8">
						<p class="spectex2" style="margin-left: 20px !important;">
							<span class="bold3">- Cách 2:</span> Doanh nghiệp chuyển khoản ngân hàng theo thông tin:
						</p>
					</div>
					
					<div class="col-xs-4">
						<input type="button" class="btn btn-primary" style="float:right;" value="Tải biên lai hoặc phiếu ủy nhiệm chi" onclick="window.location.href='<%=thanhToanHoaDonUrl.toString()%>'">
					</div>
					<div class="clear"></div>
					
					<div class="spectex3">
						<p style="margin-left:10%;">Tên chủ tài khoản: <span class="bold3">Cục Đường thủy nội địa - Bộ giao thông vận tải </span></p>
						<p style="margin-left:10%;">Số tài khoản: <span class="bold3">3511.0.1104195</span></p>
						<p style="margin-left:10%;">Tại: <span class="bold3">Kho bạc nhà nước quận Ba Đình - TP. Hà Nội</span></p>
					</div>
					
					<div class="clear"></div>
				</div>
			
				<div class="clear"></div>
			</div>
		</div>
		<%
		}
		%>
		
		<% // END: thanh toan %>
		
	</div><!----end noidung------->
</div>
</aui:form>



<script type="text/javascript">
	function func_ShowMessage() {
		$('#messageDialog').dialog({
			title : 'Tình trạng Hồ sơ',
			resizable : false,
			modal : true,
			width : '500px',
			closeOnEscape : false,
			open : function() {
				jQuery('.ui-widget-overlay').bind('click', function() {
					$('#messageDialog').dialog('close');
				});
			}
		});
	}
	function func_uploadFile(idThanhPhanHoSo) {
		$('#upLoadFile_dialog_' + idThanhPhanHoSo).modal('show');
	}
	
	function uploadFilePopup(idThanhPhanHoSo, hasDonOnline) {
		if(!hasDonOnline){
			alert("Chưa nhập mẫu trực tuyến");
			return false;
		} else{
			$('#ID_THANH_PHAN_HO_SO_' + idThanhPhanHoSo).val(idThanhPhanHoSo);
			func_uploadFile(idThanhPhanHoSo);
		}
	}

	function func_close_dialog(idThanhPhanHoSo) {
		$('#upLoadFile_dialog_'+ idThanhPhanHoSo).dialog('close');
	}

	function summitForm(url) {
		if(confirm("Bạn có chắc chắn muốn nộp hồ sơ không ?")) {
			document.getElementById('<portlet:namespace />myForm').action = url;
			document.getElementById('<portlet:namespace />myForm').submit();
		}
	}
	
	function removeNoiDungHoSo(url) {
		if(confirm("Bạn có chắc chắn muốn xóa hồ sơ không ?")) {
			document.getElementById('<portlet:namespace />myForm').action = url;
			document.getElementById('<portlet:namespace />myForm').submit();
		}
	}

	function summitPopupForm(url, thanhPhanHoSoId, bieuMauCount) {
		var fileUpl = document.getElementById("attachment_" + thanhPhanHoSoId).value;
		var fileInput = document.getElementById("attachment_" + thanhPhanHoSoId);
		var tenTaiLieu = document.getElementById("tenTaiLieu_" + thanhPhanHoSoId).value;
		var maxSize = 10485760;
		
		var booleanNoCheck = false;
		if(bieuMauCount > 0) {
			for(i = 0;i<bieuMauCount;i++) {
				if($('#select_' + thanhPhanHoSoId + '_' + i).is(":checked")) {
					booleanNoCheck = true;
					break;
				}
			}
		} else {
			booleanNoCheck = true;
		}

		if(tenTaiLieu.trim().length > 255){
			alert(" Tên tài liệu quá dài");
			return false;
		}
		
		if(!booleanNoCheck){
			alert(" Chưa chọn loại biểu mẫu");
			return;
		} else{
			
			var valid_extensions = /(<%= StringUtil.merge(DocumentUtils.DEFAULT_FILE_EXTENSIONS, "|") %>)$/i;
			
			if(fileUpl == ''){
				
				alert("Chưa chọn tệp tải lên");
				$('.progress').hide();
				
				return;
			} else if(!valid_extensions.test(fileUpl)) { 
				alert('Tên tài liệu không đúng định dạng. Chỉ cho phép tên tài liệu có đuôi mở rộng <%= StringUtil.merge(DocumentUtils.DEFAULT_FILE_EXTENSIONS, ",") %>');
				$('.progress').hide();
				return;
			} else {
				
				if(fileInput.files[0].size >= maxSize){
					alert("Dung lượng file lớn hơn 20Mb");
					$('.progress').hide();
					return;
				} else{
					$('.progress').show();
					$('#popupForm_' + thanhPhanHoSoId).action = url;
					$('#popupForm_' + thanhPhanHoSoId).submit();
				}
				
			}
			
		}
	}

</script>
<style>
.spectex2 {
	margin-top: -10px;
}

.aui p {
	margin: 0 0 0;
}

.ui-dialog {
	top: 20% !important;
}

.custom-file-input::-webkit-file-upload-button {
	visibility: hidden;
}

.custom-file-input::before {
	content: 'Upload';
	display: inline-block;
	background: #4376ca;
	border: none;
	border-radius: 3px;
	padding: 5px 12px;
	outline: none;
	white-space: nowrap;
	-webkit-user-select: none;
	cursor: pointer;
	font-weight: 700;
	font-size: 10pt;
	color: white;
}

@-webkit-keyframes progress-bar-stripes {
    from {
        background-position:40px 0 !important
    }
    to {
        background-position:0 0 !important
    }
}
@-o-keyframes progress-bar-stripes {
    from {
        background-position:40px 0 !important
    }
    to {
        background-position:0 0 !important
    }
}
@keyframes progress-bar-stripes {
    from {
        background-position:40px 0 !important
    }
    to {
        background-position:0 0 !important
    }
}
.progress {
    height:20px !important;
    margin:10px 0 15px 20px !important;
    overflow:hidden !important;
    background-color:#f5f5f5 !important;
    border-radius:4px !important;
    -webkit-box-shadow:inset 0 1px 2px rgba(0, 0, 0, .1) !important;
    box-shadow:inset 0 1px 2px rgba(0, 0, 0, .1) !important
}
.progress-bar {
    float:left !important;
    width:0;
    height:100% !important;
    font-size:12px !important;
    line-height:20px !important;
    color:#fff !important;
    text-align:center !important;
    background-color:#337ab7 !important;
    -webkit-box-shadow:inset 0 -1px 0 rgba(0, 0, 0, .15) !important;
    box-shadow:inset 0 -1px 0 rgba(0, 0, 0, .15) !important;
    -webkit-transition:width .6s ease !important;
    -o-transition:width .6s ease !important;
    transition:width .6s ease !important
}
.progress-bar-striped, .progress-striped .progress-bar {
    background-image:-webkit-linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent) !important;
    background-image:-o-linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent) !important;
    background-image:linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent) !important;
    -webkit-background-size:40px 40px !important;
    background-size:40px 40px !important
}
.progress-bar.active4, .progress.active4 .progress-bar {
    -webkit-animation:progress-bar-stripes 2s linear infinite !important;
    -o-animation:progress-bar-stripes 2s linear infinite !important;
    animation:progress-bar-stripes 2s linear infinite !important
}

.lisths1 {
    float: left;
    margin-right: 8px;
    margin-top: 3px;
}
.spectex {
    font-size: 13px;
    font-weight: bold;
}
.spectex3 {
    line-height: 22px;
    margin-left: 95px;
}
.bold3 {
    font-size: 12px;
    font-weight: bold;
}
</style>
