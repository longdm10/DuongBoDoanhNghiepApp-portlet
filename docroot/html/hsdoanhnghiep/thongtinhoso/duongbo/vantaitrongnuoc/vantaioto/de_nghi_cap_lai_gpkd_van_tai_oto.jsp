<%@page import="vn.dtt.duongbo.dao.common.service.QlvtLoaiHinhHoatDongDnLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.duongbo.utils.format.DateUtils"%>
<%@page import="vn.dtt.duongbo.maudon.xml.XmlUtils"%>
<%@page import="vn.dtt.duongbo.maudon.xml.MauDonFactory"%>
<%@page import="vn.dtt.duongbo.maudon.model.DeNghiCapGiayPhepKDVTBangXeOto"%>
<%@page import="vn.dtt.duongbo.business.nghiepvu.NghiepVuUtils"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcBieuMauHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoBieuMauLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo"%>
<%@page import="vn.dtt.duongbo.utils.DoanhNghiepUtils"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.duongbo.portlet.doanhnghiep.DoanhNghiepAction"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongbo.utils.*"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.business.DanhMucConstants"%>
<%@ include file="/html/init.jsp"%>
<%@page import="vn.dtt.duongbo.utils.format.FormatData"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/duongbo/vantaitrongnuoc/vantaioto/table_loai_hinh_hoat_dong.js?modified=<%=DateUtils.CURRENT_TIME_STAMP%>"></script>

<%!private static Log _log = LogFactoryUtil.getLog(DoanhNghiepAction.class);%>

<%
	_log.info("/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/vantaioto/de_nghi_cap_lai_gpkd_van_tai_oto.jsp");
	
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	long bieuMauHoSoId = 0;
	long idNoiDungHoSo = ParamUtil.getLong(request, Constants.ID_NOI_DUNG_HO_SO);
	
	_log.info("/thuTucHanhChinhId--" + thuTucHanhChinhId);
	_log.info("/hoSoThuTucId---" + hoSoThuTucId);
	_log.info("/idNoiDungHoSo--" + idNoiDungHoSo);
	
		
	String noiDungXmml = ParamUtil.getString(request, "noiDungXmml");
	
	TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(thuTucHanhChinhId);
	TthcThanhPhanHoSo thanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.fetchTthcThanhPhanHoSo(thanhPhanHoSoId);
	TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
	
	DnDoanhNghiep doanhNghiep = DoanhNghiepUtils.getDoanhNghiepByUserId(PortalUtil.getUserId(request));
	DmDataItem dmTinhDoanhNghiep = DmDataItemLocalServiceUtil.getByGroupCodeAndItemCode0(DanhMucConstants.DON_VI_HANH_CHINH, doanhNghiep.getMaTinhThanh());
	
	TthcBieuMauHoSo bieuMauHoSo = NghiepVuUtils.getBieuMauHoSoByThanhPhanHoSoId(thanhPhanHoSoId);
	if (Validator.isNotNull(bieuMauHoSo)) {
		bieuMauHoSoId = bieuMauHoSo.getId();
	}
	//GPKDVT_1; BM_111
	_log.info("------/thuTucHanhChinh--" + thuTucHanhChinh.getMaThuTuc());
	_log.info("------/maBieuMauHoSo----" + bieuMauHoSo.getMaBieuMau());
	_log.info("------/loaiTthc---------" + ParamUtil.getString(request, Constants.LOAI_THU_TUC_HANH_CHINH));
	
	
	String node_1 = "TN";

	
	DeNghiCapGiayPhepKDVTBangXeOto donLienVan = null;
	TthcNoidungHoSo noidungHoSo = null;
	
	if (idNoiDungHoSo > 0) {
		noidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(idNoiDungHoSo);
	}
	
	if (Validator.isNotNull(noidungHoSo) && Validator.isNotNull(noidungHoSo.getNoiDungXml())) {
		
		_log.info("-----noidungHoSo--Id-" + noidungHoSo.getId());
		_log.info("-----noidungHoSoXML--" + noidungHoSo.getNoiDungXml());
	
		List<Object> lstObj = MauDonFactory.converXMLMessagesContentToObject(noidungHoSo.getNoiDungXml());
		if (lstObj != null && lstObj.size() > 0) {
			donLienVan = (DeNghiCapGiayPhepKDVTBangXeOto) lstObj.get(0);
		}
	}
	
	if (donLienVan == null) { donLienVan = MauDonFactory.converXmlToObject(noiDungXmml, new DeNghiCapGiayPhepKDVTBangXeOto()); }
	if (donLienVan == null) { donLienVan = new DeNghiCapGiayPhepKDVTBangXeOto(); }
	List<String> lstKqLoaihinhkd = Validator.isNotNull(donLienVan) ? donLienVan.getLoaiHinhKDVTs() : null;
	
	List<QlvtLoaiHinhHoatDongDn> lstLoaiHinhHoatDong = null;
	if (noidungHoSo != null) {
		lstLoaiHinhHoatDong = QlvtLoaiHinhHoatDongDnLocalServiceUtil.findByNoiDungHoSoId(noidungHoSo.getId());
	}
	if (lstLoaiHinhHoatDong == null) { lstLoaiHinhHoatDong = new ArrayList<QlvtLoaiHinhHoatDongDn>();}
	
	List<DmDataItem> lstloaiHinhKDVT = DanhMucConstants.getLoaiHinhKDVT();
	List<DmDataItem> lstTinhThanh = DanhMucConstants.getTinhThanh();
	List<DmDataItem> lstCoQuanCapPhep = DanhMucConstants.getCoQuanCapPhep(thuTucHanhChinhId + "");
%>

<!-- /html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/vantaioto/de_nghi_cap_lai_gpkd_van_tai_oto_view.js -->

<portlet:renderURL var="backUrl">
	<portlet:param name="jspPage" value="/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/vantaioto/thanh_phan_ho_so.jsp"/>
	<portlet:param name="<%=Constants.ID_THU_TUC_HANH_CHINH %>" value="<%=String.valueOf(thuTucHanhChinhId)%>"/>
	<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC %>" value="<%=String.valueOf(hoSoThuTucId) %>"/>
	<portlet:param name="<%=Constants.ID_THANH_PHAN_HO_SO %>" value="<%=String.valueOf(thanhPhanHoSoId) %>"/>
</portlet:renderURL>

<portlet:actionURL var="xemTruocNoiDung" name="xemTruocNoiDung">
	<portlet:param name="<%=Constants.ID_THU_TUC_HANH_CHINH%>" value="<%=String.valueOf(thuTucHanhChinhId)%>"/>
	<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC%>" value="<%=String.valueOf(hoSoThuTucId)%>"/>
	<portlet:param name="<%=Constants.ID_THANH_PHAN_HO_SO%>" value="<%=String.valueOf(thanhPhanHoSoId)%>"/>
	<portlet:param name="<%=Constants.ID_BIEU_MAU_HO_SO%>" value="<%=String.valueOf(bieuMauHoSoId)%>"/>
	<portlet:param name="<%=Constants.LOAI_THU_TUC_HANH_CHINH%>" value="<%=ParamUtil.getString(request, Constants.LOAI_THU_TUC_HANH_CHINH)%>"/>
	<portlet:param name="<%=Constants.PATH_MAUDON_VIEW_PDF%>" value="/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/vantaioto/de_nghi_cap_lai_gpkd_van_tai_oto_view.jsp"/>
</portlet:actionURL>

<aui:form action="<%=xemTruocNoiDung.toString()%>" name="myForm" id="myForm" method="POST">
	<h4 class="PL15 BGT BOB font14 col-xs-12"><%=thuTucHanhChinh.getTenThuTuc()%></h4>
	<div class="P10 col-xs-12">
		<div class="BGT noidung">
			<div class="box1000">
				<div class="col-sm-12">
					<p class="pull-left text-center">
						<b><%=doanhNghiep.getTenDoanhNghiep().toUpperCase()%></b><br>
						<b>-------</b>
					</p>
					<p class="pull-right text-center">
					
					<div class="text-center col-xs-5 MB20 pull-right PA0">
						<p >
							<b>CỘNG HÒA XÃ HỘI CHỦ NGHĨA VIỆT NAM</b><br>
							<b>Độc lập - Tự do - Hạnh phúc</b><br> ---------------
						</p>
						<div class="col-xs-6 PA0">
							<select class="form-control" id="tinhThanh" name="tinhThanh">
								<option value="<%=(dmTinhDoanhNghiep != null) ? dmTinhDoanhNghiep.getCode() : ""%>"><%=(dmTinhDoanhNghiep != null) ? dmTinhDoanhNghiep.getName() : ""%></option> 
							</select>
						</div>
						<div>
							<p style="text-align: right;line-height: 30px;">
								<span style="font-family: Arial">, <%=DateUtils.getCurrentDate(new Date()) %></span>
							</p>
						</div>
					</div>
				</div>
				<h3 class="tle text-center">GIẤY ĐỀ NGHỊ CẤP<br>GIẤY PHÉP KINH DOANH VẬN TẢI BẰNG XE Ô TÔ</h3>
				
				<div class="col-sm-12">
					<div class="text-center col-xs-12 MB20">
						<label class="textlabel col-xs-2 col-xs-offset-3" style="width: 9.1%;">Kính gửi:</label>
						<div class="col-xs-5">
							<select class="form-control" id="coQuanGui" name="coQuanGui">
								<option value="">-- Chọn cơ quan cấp phép --</option>
								<%for (DmDataItem item : lstCoQuanCapPhep) {
									%>
									<option value="<%=item.getCode()%>" <%=(((donLienVan.getCoQuanGui() == null) ? "" : donLienVan.getCoQuanGui().trim())).equals(item.getCode())? "selected='selected'" : ""%>><%=item.getName()%></option>
									<%
								}%>
							</select>
						</div>
					</div>
					<label class="pull-left w250">1. Tên đơn vị kinh doanh vận tải</label>
					<p class="textU">: <%=doanhNghiep.getTenDoanhNghiep().toUpperCase()%></p>
					
					<label class="pull-left w250">2. Tên giao dịch quốc tế (nếu có)</label>
					<p class="textU">: <%=doanhNghiep.getTenTiengAnh()%></p>
					
					<label class="pull-left w250">3. Địa chỉ trụ sở</label>
					<div class="col-sm-8 PA0">
						<label class="pull-left" style="height: 30px;vertical-align: middle;">: </label>
						<input type="text" id="diaChiDoanhNghiep" name="diaChiDoanhNghiep" style="width: 90%" value="<%=doanhNghiep.getDiaChi()%>" class="form-control">
					</div>
					<div class="clear"></div>
					<div style="height: 5px">&nbsp</div>
					
					<label class="pull-left w250">4. Số điện thoại (Fax)</label>
					<p class="">: <%=doanhNghiep.getDienThoai()%></p>
					
					<label class="pull-left">5. Giấy chứng nhận đăng ký kinh doanh (hoặc đăng ký doanh nghiệp)</label>
					<div class="clear"></div>
					<div style="padding: 0 15px">
						<label class="pull-left w265">Số <span class="red">*</span></label>
						<p>: <%=(Validator.isNull(doanhNghiep.getSoDangKyKinhDoanh()) ? "" : doanhNghiep.getSoDangKyKinhDoanh())%></p>
						
						<label class="pull-left w265">Ngày cấp <span class="red">*</span></label>
						<p>: <%=(Validator.isNull(doanhNghiep.getNgayCapDkKd()) ? "" : FormatData.parseDateToTringDDMMYYY(doanhNghiep.getNgayCapDkKd()))%></p>
						
						<label class="pull-left w265">Cơ quan cấp <span class="red">*</span></label>
						<p>: <%=(Validator.isNull(doanhNghiep.getCoQuanCapDkKd()) ? "" : doanhNghiep.getCoQuanCapDkKd())%></p>
					</div>
					
					<label class="pull-left w250">6. Họ và tên người đại diện hợp pháp<font color="red">*</font></label>
					<p><span class="">: <%=doanhNghiep.getNguoiDaiDien()%></span></p>
					
					<div class="clear"></div>
					<div class="col-xs-12 form-group" style="padding-left: 0px;">
						<label class="pull-left" style="margin-top: 15px">7. Loại hình kinh doanh vận tải <span class="red">*</span>
						</label>
					</div>
					<div class="clear"></div>
					<div class="row M0">
						
						<div class="col-xs-6" id="divloaiHinhHoatDong">
							<table class="table table-striped table-bordered table-hover">
							<tr>
								<td><label>STT</label></td>
								<td><label>Loại hình kinh doanh</label></td>
								<td><label>Trạng thái</label></td>
								<td><label>Bỏ chọn</label></td>
								
							</tr>
							<%
							String[] lstAlPhaBe = StringUtils.getAlPhaBe(lstloaiHinhKDVT.size());
							
							int index = 0;
							
							PortletURL showLoaiHinh = renderResponse.createRenderURL();
							showLoaiHinh.setWindowState(LiferayWindowState.EXCLUSIVE);
							showLoaiHinh.setParameter("mvcPath", "/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/vantaioto/_loaihinhkinhdoanh.jsp");
							
							for (DmDataItem item : lstloaiHinhKDVT) {
								showLoaiHinh.setParameter("MA_LOAIHINH_KINHDOANH", item.getCode());
								showLoaiHinh.setParameter("DATA_GROUP_ID", item.getDataGroupId() + "");
								showLoaiHinh.setParameter("STT_LOAI_HINH", index + "");
								%>
								<tr>
									<td><label style="font-weight: normal;"><%=index + 1%></label></td>
									<td onclick="loadLoaiHinhKinhDoanh('<%=showLoaiHinh %>', '<%=index%>')"><label style="font-weight: normal;"><%=item.getName()%></label></td>
									<td>
										<input type="checkbox" class="" id="loaiHinhKdvt_<%=item.getCode()%>" name="loaiHinhKdvt"
											<%=CommonUtils.checkedCodeItemFromList(lstKqLoaihinhkd, item.getCode())%>
											disabled="disabled"
											value="<%=item.getCode()%>">
										
										<input type="checkbox" id="dataLoaiHinhKdvt_<%=item.getCode()%>" name="dataLoaiHinhKdvt"
											<%=CommonUtils.checkedCodeItemFromList(lstKqLoaihinhkd, item.getCode())%>
											hidden="hidden"
											value="<%=item.getCode()%>">
									</td>
									<td>
										<a onclick="iconXoaLoaiHinhHoatDong(<%=index%>, '<%=item.getCode()%>')" id="bochon_<%=item.getCode()%>"
											<%=CheckCssUtils.hiddenItem(lstKqLoaihinhkd, item.getCode())%>
											title="Bỏ chọn">
											<i class="fa3 fa fa-trash-o"></i>
										</a>
									</td>
								</tr>
								<%
								index = index + 1;
							}
							%>
							</table>
							<!-- bang luu tru noi dung loai hinh hoat dong -->
							<table id="tblLoaiHinhHoatDong" hidden="true">
								<tr>
									<td><label>bangObject</label></td>
								</tr>
								<%
								index = 0;
								String stt = "";
								
								//-------------------------TRUONG HOP XEM LAI TU DataBase----------------------
								if (noiDungXmml.length() == 0) {
									for (QlvtLoaiHinhHoatDongDn loaiHinh : lstLoaiHinhHoatDong) {
										if ("KINH_DOANH_CODE_1".equalsIgnoreCase(loaiHinh.getMaLoaiHinhHoatDong())) {
											//Vận tải hành khách bằng ô tô theo tuyến cố định
											stt = "1";
											
										} else if ("KINH_DOANH_CODE_2".equalsIgnoreCase(loaiHinh.getMaLoaiHinhHoatDong())) {
											//Vận tải hành khách bằng xe du lịch
											stt = "2";
											
										} else if ("KINH_DOANH_CODE_3".equalsIgnoreCase(loaiHinh.getMaLoaiHinhHoatDong())) {
											//Vận tải hành khách bằng xe taxi
											stt = "3";
											
										} else if ("KINH_DOANH_CODE_4".equalsIgnoreCase(loaiHinh.getMaLoaiHinhHoatDong())) {
											//Vận tải hàng hóa
											stt = "0";
										}
										
										%>
										<tr class="trTbl<%=index%>">
											<td>
												<input type="hidden" id="indexRow" name="indexRow" value="<%=index%>">
												<input type="hidden" id="objectLoaiHinhHoatDong<%=index%>" class="objectLoaiHinhHoatDong" name="objectLoaiHinhHoatDong" value="<%=CommonUtils.passLoaiHinhHoatDongDn(loaiHinh) + stt + ";"%>">
											</td>
										</tr>
										<%
										index = index + 1;
									}
								}
								
								//-------------------------TRUONG HOP XEM LAI TU noiDungXml----------------------
								if (lstLoaiHinhHoatDong.size() == 0) {
									String[] lstObjectLoaiHinhHoatDong = ParamUtil.getParameterValues(request, "objectLoaiHinhHoatDong", new String[]{});
									for (String valLoaiHinhHoatDong : lstObjectLoaiHinhHoatDong) {
										String[] loaiHinhHoatDong = valLoaiHinhHoatDong.split(";");
										if ("KINH_DOANH_CODE_1".equalsIgnoreCase(loaiHinhHoatDong[3])) {
											//Vận tải hành khách bằng ô tô theo tuyến cố định
											stt = "1";
											
										} else if ("KINH_DOANH_CODE_2".equalsIgnoreCase(loaiHinhHoatDong[3])) {
											//Vận tải hành khách bằng xe du lịch
											stt = "2";
											
										} else if ("KINH_DOANH_CODE_3".equalsIgnoreCase(loaiHinhHoatDong[3])) {
											//Vận tải hành khách bằng xe taxi
											stt = "3";
											
										} else if ("KINH_DOANH_CODE_4".equalsIgnoreCase(loaiHinhHoatDong[3])) {
											//Vận tải hàng hóa
											stt = "0";
										}
										%>
										<tr class="trTbl<%=index%>">
											<td>
												<input type="hidden" id="indexRow" name="indexRow" value="<%=index%>">
												<input type="hidden" id="objectLoaiHinhHoatDong<%=index%>" class="objectLoaiHinhHoatDong" name="objectLoaiHinhHoatDong" value="<%=valLoaiHinhHoatDong + stt + ";"%>">
											</td>
										</tr>
										<%
										index = index + 1;
									}
								}
								%>
							</table>
						</div>
						<div class="col-sm-6" id="divDetailLoaiHinhHoatDong">
						</div>
					</div>
					
					<!-- ---------------------- -->
					<div class="clear"></div>
					<div class="col-xs-12 form-group" style="padding-left: 0px;">
						<label class="pull-left" style="margin-top: 15px">8. Lý do xin cấp lại<span class="red">*</span>
						</label>
					</div>
					<div class="clear"></div>
					<div class="row M0">
						<textarea id="noiDungLyDoCapLai" name="noiDungLyDoCapLai" class="form-control" rows="3" cols="180" ><%=(donLienVan.getNoiDungLyDoCapLai() != null ? donLienVan.getNoiDungLyDoCapLai() : "") %></textarea>
					
						
						<div class="col-xs-12 form-group" style="padding-left: 0px;">
							<p>Đơn vị kinh doanh vận tải cam kết những nội dung đăng ký đúng với thực tế của đơn vị.</p>
							<!-- ----------BUTTON---------------- -->
							<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vantaitrongnuoc/vantaioto/_button.jspf"%>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</aui:form>

<portlet:actionURL var="luuLoaiHinhKinhDoanhVanTaiURL" name="luuLoaiHinhKinhDoanhVanTai">
	<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC%>" value="<%=StringUtil.valueOf(hoSoThuTucId)%>"/>
</portlet:actionURL>


<portlet:resourceURL var="updateContentURL"></portlet:resourceURL>
<script type="text/javascript">
	var A = AUI();
	
	function loadLoaiHinhKinhDoanh(url, sttLoaiHinh) {
		$('#divDetailLoaiHinhHoatDong').load(url);
	}

	///ban vao row, check da nham loai hinh kinh doan chua
	function checkExistLoaiHinhHoatDong(sttLoaiHinh) {
		console.log('--checkExistLoaiHinhHoatDong--', sttLoaiHinh);
		
		var lstLoaiHinhHoatDong = tblLoaiHinhHoatDong.getLstLoaiHinhHoatDong();
		lstLoaiHinhHoatDong.forEach(function(item, i) {
			console.log('item 300', item);
			if (item.stt === sttLoaiHinh) {
				console.log('item 302', item, 'sttLoaiHinh', sttLoaiHinh);
				pushDataPopup(i, item)
			}
		});
	}

	Liferay.provide(window,'submitLoaiHinhKdForm',
	function() {
		var A = AUI();
		//var errorBlock=A.one('#group-error-block');
		A.io.request('<%=luuLoaiHinhKinhDoanhVanTaiURL %>',{
			method: 'POST',
			form: { id: '<portlet:namespace />myForm' },
			on: {
				success: function(data){
 					console.log("success " + this.get('responseData'));
 					var response = JSON.stringify(eval("(" + this.get('responseData') + ")"));
 					console.log(response.bodyText);
 					
 					if (response !== undefined && response.length > 0) {
 						$("#loaiHinhKdvt_" + response).prop('checked', true);
 					}
 					
 					//errorBlock.set("innerHTML","");
 					//var errorMessageNode = A.Node.create('<div class="portlet-msg-error">No group exist with this name.</div>');
				//	errorMessageNode.appendTo(errorBlock);
				}
			}
		});
	});


	var idTenThuongMai = "";
	idTenThuongMai = "#textTenThuongMai";

	jQuery(document).ready(function($) {
		$(idTenThuongMai).keypad({
			keypadOnly : false,
			layout : _specChar,
			prompt : _promptTitle
		});
	});

	function summitForm(url) {
		var tinhThanh = document.getElementById("tinhThanh").value;
		var coQuanGui = document.getElementById("coQuanGui").value;
		var noiDungLyDoCapLai = $('#noiDungLyDoCapLai').val();
		
		if (tinhThanh=="") { alert("Chọn Tỉnh/Thành Phố "); return false; }
		if (coQuanGui=="") { alert("Chọn cơ quan gửi "); return false; }
		if (noiDungLyDoCapLai=="") { alert("Lý do xin cấp lại không được để trống"); return false; }
		
		

		var radio_check_val = "";
		for (var i = 0; i < document.getElementsByName('dataLoaiHinhKdvt').length; i++) {
			if (document.getElementsByName('dataLoaiHinhKdvt')[i].checked) {
				radio_check_val = document.getElementsByName('dataLoaiHinhKdvt')[i].value;
            }

        }
        if (radio_check_val === "") {
            alert("Chọn loại hình kinh doanh vận tải");
			return false;
        }
		
		document.getElementById('<portlet:namespace />myForm').action = url;
		document.getElementById('<portlet:namespace />myForm').submit();
	}


	function myFunction() {
		var x = document.getElementById("textFax").value;
		var soLuong = x.length;
		if (soLuong < 10) {
			alert("Fax lớn hơn 10 kí tự");
			return false;
		}
		if (soLuong > 15) {
			alert("Fax nhỏ hơn 15 kí tự");
			return false;
		}
	}

	function myFunction2() {
		var x = document.getElementById("textFaxDVDK").value;
		var soLuong = x.length;
		if (soLuong < 10) {
			alert("Fax lớn hơn 10 kí tự");
			return false;
		}
		if (soLuong > 15) {
			alert("Fax nhỏ hơn 15 kí tự");
			return false;
		}
	}
</script>

<style>

.table-hover>tbody>tr:hover {
	background-color: hsla(53, 100%, 41%, 0.36);
}

.aui p {
	margin: 10px 0 0px;
}

.title_right {
	border-bottom: none;;
}

.box {
	border: none;
	margin: 0px;
	padding: 0px;
	background-color: white;
}

.Bo2 {
	border: solid 1px #ccc;
	border-radius: 6px;
	padding: 15px;
	height: 150px;
}
</style>