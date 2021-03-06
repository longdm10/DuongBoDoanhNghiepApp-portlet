<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.duongbo.utils.CommonUtils"%>
<%@page import="vn.dtt.duongbo.maudon.xml.MauDonFactory"%>
<%@page import="vn.dtt.duongbo.maudon.model.DeNghiGiaHanGiayPhepLienVanVietLao"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
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
<%@page import="vn.dtt.duongbo.business.DanhMucConstants"%>
 <%@page import="vn.dtt.duongbo.utils.format.DateUtils"%>

<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%! private static Log _log = LogFactoryUtil.getLog(DoanhNghiepAction.class); %>
<script type="text/javascript">
var groupGiaHanType = '';
</script>
<%
	
	_log.info("/html/hsdoanhnghiep/thongtinhoso/vietnamlaos/don_de_nghi_gia_han_gplv_cho_phuong_tien_viet_laos.jsp");
	
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long idNoiDungHoSo = ParamUtil.getLong(request, Constants.ID_NOI_DUNG_HO_SO);
	
	String noiDungXmml = ParamUtil.getString(request, "noiDungXmml");
	
	_log.info("thuTucHanhChinhId----" + thuTucHanhChinhId);
	_log.info("thanhPhanHoSoId------" + thanhPhanHoSoId);
	_log.info("hoSoThuTucId---------" + hoSoThuTucId);
	
	long bieuMauHoSoId = 0;
		
	TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(thuTucHanhChinhId);
	TthcThanhPhanHoSo thanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.fetchTthcThanhPhanHoSo(thanhPhanHoSoId);
	TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
	
	DnDoanhNghiep doanhNghiep = DoanhNghiepUtils.getDoanhNghiepByUserId(PortalUtil.getUserId(request));
	
	TthcBieuMauHoSo bieuMauHoSo = NghiepVuUtils.getBieuMauHoSoByThanhPhanHoSoId(thanhPhanHoSoId);
	_log.info("------/maBieuMauHoSo---------" + bieuMauHoSo.getMaBieuMau());
	_log.info("------/thuTucHanhChinh-------" + thuTucHanhChinh.getMaThuTuc());
	
	int groupGiaHanType = 0;
	
	String loaiTthc = ParamUtil.getString(request, Constants.LOAI_THU_TUC_HANH_CHINH);
	
	DeNghiGiaHanGiayPhepLienVanVietLao donLienVan = null;
	TthcNoidungHoSo noidungHoSo = null;
	
	if(idNoiDungHoSo > 0){
		noidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(idNoiDungHoSo);
	}
	
	if (Validator.isNotNull(noidungHoSo) && Validator.isNotNull(noidungHoSo.getNoiDungXml())) {
		
		_log.info("-----noidungHoSoID:" + noidungHoSo.getId());
		_log.info("-----noidungHoSoXML--" + noidungHoSo.getNoiDungXml());
	
		List<Object> lstObj = MauDonFactory.converXMLMessagesContentToObject(noidungHoSo.getNoiDungXml());
		if (lstObj != null && lstObj.size() > 0) {
			donLienVan = (DeNghiGiaHanGiayPhepLienVanVietLao) lstObj.get(0);
			if(donLienVan.getNgayFromGiahanGplv() != null && donLienVan.getNgayFromGiahanGplv().trim().length() > 0){
				groupGiaHanType = Constants.TYPE_GIA_HAN_GPLV;
			} else if(donLienVan.getNgayFromGiahanChuyenDi() != null && donLienVan.getNgayFromGiahanChuyenDi().trim().length() > 0){
				groupGiaHanType = Constants.TYPE_GIA_HAN_CHUYEN_DI;
			}
		}
	}
	
	_log.info("--------groupGiaHanType: ---------" + groupGiaHanType);
	
	if (donLienVan == null) { donLienVan = MauDonFactory.converXmlToObject(noiDungXmml, new DeNghiGiaHanGiayPhepLienVanVietLao()); }
	
	_log.info("------donLienVan: " + donLienVan);
	
	List<DmDataItem> lstTinhThanh = DanhMucConstants.getTinhThanh();
	List<DmDataItem> lstCoQuanCapPhep = DanhMucConstants.getCoQuanCapPhep(thuTucHanhChinhId+"");
	
%>

<%
PortletURL backUrl = renderResponse.createRenderURL();
backUrl.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/thanh_phan_ho_so.jsp");
backUrl.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
backUrl.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
backUrl.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));

PortletURL xemTruocNoiDung = renderResponse.createActionURL();
xemTruocNoiDung.setParameter(ActionRequest.ACTION_NAME, "xemTruocNoiDung");
xemTruocNoiDung.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
xemTruocNoiDung.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
xemTruocNoiDung.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
xemTruocNoiDung.setParameter(Constants.ID_BIEU_MAU_HO_SO, String.valueOf(bieuMauHoSoId));
xemTruocNoiDung.setParameter(Constants.LOAI_THU_TUC_HANH_CHINH, loaiTthc);
xemTruocNoiDung.setParameter(Constants.PATH_MAUDON_VIEW_PDF, "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/don_de_nghi_gia_han_gplv_cho_phuong_tien_viet_laos_view.jsp");
%>

<aui:form action="<%=xemTruocNoiDung.toString()%>" name="myForm" id="myForm" method="POST">
<!--------------------- /html/hsdoanhnghiep/thongtinhoso/vietnamlaos/don_de_nghi_gia_han_gplv_cho_phuong_tien_viet_laos_view.jsp --------------->
<!------------------------------------- /don_de_nghi_gia_han_gplv_cho_phuong_tien_viet_laos.jsp ---------------------------------------->
<h4 class="PL15 BGT BOB font14 col-xs-12"><%=bieuMauHoSo.getTenBieuMau()%></h4>
<div class="P10 col-xs-12">
	<div class="BGT noidung">
		<div class="box900">
			<div class="col-sm-12">
				<p class="pull-left text-center">
					<b><%=doanhNghiep.getTenDoanhNghiep().toUpperCase()%></b><br>
					<b>Đề nghị cấp giấy phép</b><br>
<!-- 					<b>Số: 123/TT ??</b><br> -->
					<b>-------</b>
				</p>
				<p class="pull-right text-center"><b>CỘNG HÒA XÃ HỘI CHỦ NGHĨA VIỆT NAM<br>
					SOCIALlST REPUBLIC OF VIETNAM<br>
					Độc lập - Tự do - Hạnh phúc<br>
					Independence - Freedom - Happiness</b>
				</p>
			</div>
			
			<h3 class="tle text-center">ĐƠN ĐỀ NGHỊ<br>GIA HẠN GIẤY PHÉP LIÊN VẬN LÀO - VIỆT<br>APPLICATION FOR EXTENDING OF LAOS-VIETNAM<br>CROSS-BORDER TRANSPORT PERMIT</h3>
			<div class="text-center col-xs-12 MB20">
				<label class="textlabel col-xs-2 col-xs-offset-3" style="width: 11.1%;">Kính gửi (To)<span class="red">*</span>:</label>
				<div class="col-xs-5">
					<select class="form-control" id="coQuanGui" name="coQuanGui">
						<option value="">-- Lựa chọn cơ quan cấp phép --</option>
							<%
							for (DmDataItem item : lstCoQuanCapPhep) {
								%>
								<option value="<%=item.getCode()%>" <%=((donLienVan == null)? "" : ((donLienVan.getCoQuanGui() == null) ? "" : donLienVan.getCoQuanGui().trim())).equals(item.getCode())? "selected='selected'" : ""%>><%=item.getName()%></option>
								<%
							}
							%>
						</select>
				</div>
			</div>				
				<label class="pull-left w250">1. Tên đơn vị (hoặc cá nhân)<br>Name (organization or individual)</label><p class="textU">: <%=doanhNghiep.getTenDoanhNghiep().toUpperCase()%></p>
				<div class="clear"></div>
				
				<label class="pull-left w250">2. Địa chỉ (Address)</label>
				<div class="col-sm-10 PA0">
					<input type="text" id="diaChiDoanhNghiep" name="diaChiDoanhNghiep" style="width: 90%" value="<%=doanhNghiep.getDiaChi()%>" class="form-control">
				</div>
				<div class="clear"></div>
				<div style="height: 5px">&nbsp</div>
					
				<label class="pull-left w250">3. Số điện thoại (Tel No)</label><p><span class="pull-left">: <%=doanhNghiep.getDienThoai()%></span><span class="pull-left w250 text-center"><b>Số Fax (Fax No)</b></span>: <%=doanhNghiep.getFax()%></p>
					<div style="padding: 0 15px">
						<label class="pull-left w265">Cơ quan cấp></label>
						<p>
							:
							<%=(Validator.isNull(doanhNghiep.getCoQuanCapDkKd()) ? "" : doanhNghiep.getCoQuanCapDkKd())%></p>
						<label class="pull-left w265">Ngày cấp</label>
						<p>
							:
							<%=DateUtils.dateToString("dd/MM/yyyy", doanhNghiep.getNgayCapDkKd())%></p>
					</div>
				
				<label class="pull-left">4. Đề nghị Sở giao thông vận tải (Kindly request Provincial Transport Department of) <span class="red">*</span></label>:
				<div class="clear"></div>
				<div class="col-xs-4 MB10">
					<select class="form-control" id="soGiaoThongVanTai" name="soGiaoThongVanTai">
						<option value="">-- Lựa chọn sở GT --</option>
						<%for(DmDataItem item : lstTinhThanh) {%>
							<option value="<%=item.getCode()%>" <%=((donLienVan == null)? "" : ((donLienVan.getSoGTVT() == null) ? "" : donLienVan.getSoGTVT().trim())).equals(item.getCode())? "selected='selected'" : ""%>><%=item.getName()%></option>
						<%} %>
					</select>
				</div>
				<div class="clear"></div>
				<div style="padding:0 15px">
					
					<label>Gia hạn  Giấy phép liên vận Lào - Việt cho phương tiện vận tải sau (to extend the validity of Laos - Viet Nam Cross-Border Transport Permit(s) for the following vehicle(s)):</label>
						
					<div class="col-xs-12 Bo3 form-group">
						<label class="col-xs-6 textlabel PAl0" for="bienSoXe">- Biển số xe xin gia hạn (Registration No) <span class="red">*</span>:</label>
						<p class="col-xs-6 PAr0">
						<input type="text" class="form-control" id="bienSoXe" name="bienSoXe" value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getBiensoGiaHan())? "" : donLienVan.getBiensoGiaHan())%>"></p>
						<label class="col-xs-12 PA0">- Giấy phép liên vận Lào - Việt (Laos - Viet Nam Cross-Border Transport Permit No):</label>
						
						<div class="row">
							<div class="col-xs-3 form-group">
								<label for="soGiayPhep">Số</label>
								<br>
								<label for="soGiayPhep">(No) <span class="red">*</span>:</label>
								<input type="text" class="form-control" id="soGiayPhep" name="soGiayPhep" value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getSoGPLVVL())? "" : donLienVan.getSoGPLVVL())%>">
							</div>
							<div class="col-xs-3 form-group">
								<label for="">Ngày cấp</label>
								<br>
								<label for="">(Date of issue) <span class="red">*</span>:</label>
								<div class="input-group">
									<input type="text" class="form-control" id="ngayCapGiayPhep" name="ngayCapGiayPhep" 
											value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getNgayCapGPLVVL())? "" : donLienVan.getNgayCapGPLVVL())%>" onclick="gtCalendar('ngayCapGiayPhep')">
									<span class="input-group-addon" onclick="gtCalendar('ngayCapGiayPhep')"><i class="fa fa-calendar" onclick="gtCalendar('ngayCapGiayPhep')"></i></span>
								</div>
							</div>
							<div class="col-xs-3 form-group">
								<label for="noiCap">Nơi cấp</label>
								<br>
								<label for="noiCap">(Issuing Authority) <span class="red">*</span>:</label>
								<input type="text" class="form-control" id="noiCap" name="noiCap" value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getNoiCapGPLVVL())? "" : donLienVan.getNoiCapGPLVVL())%>">
							</div>
							<div class="col-xs-3 form-group">
								<label for="">Có giá trị đến</label>
								<br>
								<label for="">(Date of expiry) <span class="red">*</span>:</label>
								<div class="input-group">
									<input type="text" class="form-control" id="ngayCoGiaTri" name="ngayCoGiaTri" onclick="gtCalendar('ngayCoGiaTri')"
											value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getGiaTriGPLVVL())? "" : donLienVan.getGiaTriGPLVVL())%>">
									<span class="input-group-addon" onclick="gtCalendar('ngayCoGiaTri')"><i class="fa fa-calendar" onclick="gtCalendar('ngayCoGiaTri')"></i></span>
								</div>
							</div>
						</div>
						<label class="col-xs-6 PAl0" for="">- Thời gian nhập cảnh vào Việt Nam<br>(Date of entry into Viet Nam) <span class="red">*</span>:</label>
						<div class="col-xs-6 PAr0">
							<div class="input-group">
								<input type="text" class="form-control" id="thoiGianNhapCanh" name="thoiGianNhapCanh" onclick="gtCalendar('thoiGianNhapCanh')"
									value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getThoiGianNhapCanh())? "" : donLienVan.getThoiGianNhapCanh())%>">
								<span class="input-group-addon" onclick="gtCalendar('thoiGianNhapCanh')"><i class="fa fa-calendar" onclick="gtCalendar('thoiGianNhapCanh')"></i></span>
							</div>
						</div>
						<div class="clear"></div>
						<label class="col-xs-12 PA0">- Thời hạn đề nghị được gia hạn thêm (Proposed extended duration):</label>
						
						<!-- ----START---------------Gia hạn Giấy phép liên vận (Extension for)------------------------ -->
						<div class="radio MB0">
							<label>
								<input type="radio" name="groupDeNghiDuocGiaHan" value="<%=Constants.TYPE_GIA_HAN_GPLV %>" class="rad1" <%=CommonUtils.checkButtonGroupGhLaoCam(Constants.TYPE_GIA_HAN_GPLV, groupGiaHanType) %>>Gia hạn Giấy phép liên vận (Extension for) <span class="red">*</span>
							</label>
						</div>
						<div class="hid1">
							<div class="Bo3">
								<div class="form-group">
									<label class="col-xs-6" for="soNgayGiaHanGplv">số ngày <span class="red">*</span>:</label>
									<div class="col-xs-2">
										<input type="text" id="soNgayGiaHanGplv" name="soNgayGiaHanGplv" class="form-control" onchange="onChangeDateFrom()"
											value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getSoNgayGiaHan())? "" : donLienVan.getSoNgayGiaHan())%>">
									</div>
									<label class="col-xs-1 textlabel"></label>
									<div class="clear"></div>
								</div>
								<div class="col-xs-6 form-group">
									<label for="comment">Từ (From) <span class="red">*</span>:</label>
									<div class="input-group">
										<input type="text" class="form-control" id="ngayFromGiaHanGplv" name="ngayFromGiaHanGplv" onclick="gtCalendar('ngayFromGiaHanGplv')" onchange="onChangeDateFrom()"
											value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getNgayFromGiahanGplv())? "" : donLienVan.getNgayFromGiahanGplv())%>">
										<span class="input-group-addon" onclick="gtCalendar('ngayFromGiaHanGplv')"><i class="fa fa-calendar"></i></span>
									</div>
								</div>
								<div class="col-xs-6 form-group">
									<label for="comment">Đến (To) <span class="red">*</span>:</label>
									<div class="input-group">
										<input type="text" class="form-control" id="ngayToGiaHanGplv" name="ngayToGiaHanGplv"  readonly ="readonly" 
											value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getNgayToGiahanGplv())? "" : donLienVan.getNgayToGiahanGplv())%>">
<!-- 										<span class="input-group-addon" onclick="gtCalendar('ngayToGiaHanGplv')"><i class="fa fa-calendar"></i></span> -->
										<span class="input-group-addon"><i class="fa fa-calendar"></i></span>

									</div>
								</div>
								<div class="clear"></div>
							</div>
						</div>
						<!-- ----END---------------Gia hạn Giấy phép liên vận (Extension for)------------------------ -->
						
						<!-- ----START---------------Gia hạn chuyến đi (Extension for Journey)------------------------ -->
						<div class="radio MT0 MB0">
							<label>
								<input type="radio" name="groupDeNghiDuocGiaHan" value="<%=Constants.TYPE_GIA_HAN_CHUYEN_DI %>" class="rad2" <%=CommonUtils.checkButtonGroupGhLaoCam(Constants.TYPE_GIA_HAN_CHUYEN_DI, groupGiaHanType) %>>Gia hạn chuyến đi (Extension for Journey) <span class="red">*</span>
							</label>
						</div>
						<div class="hid2">
							<div class="Bo3">
								<div class="form-group">
									<label class="col-xs-6">số ngày <span class="red">*</span>:</label>
									<div class="col-xs-2">
										<input type="text" class="form-control" id="soNgayGiaHanChuyenDi" name="soNgayGiaHanChuyenDi" onchange="onChangeDateFrom()"
											value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getSoNgayGiaHanCD())? "" : donLienVan.getSoNgayGiaHanCD())%>">
									</div>
									<label class="col-xs-1 textlabel"></label>
									<div class="clear"></div>
								</div>
								<div class="col-xs-6 form-group">
									<label for="comment">Từ (From) <span class="red">*</span>:</label>
									<div class="input-group">
										
										<input type="text" class="form-control" id="ngayFromGiaHanChuyenDi" name="ngayFromGiaHanChuyenDi" onchange="onChangeDateFrom()" onclick="gtCalendar('ngayFromGiaHanChuyenDi')"
											value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getNgayFromGiahanChuyenDi())? "" : donLienVan.getNgayFromGiahanChuyenDi())%>">
										<span class="input-group-addon" onclick="gtCalendar('ngayFromGiaHanChuyenDi')"><i class="fa fa-calendar"></i></span>
									</div>
								</div>
								<div class="col-xs-6 form-group">
									<label for="comment">Đến (To) <span class="red">*</span>:</label>
									<div class="input-group">
										<input type="text" class="form-control" id="ngayToGiaHanChuyenDi" name="ngayToGiaHanChuyenDi" readonly ="readonly"
											value="<%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getNgayToGiahanChuyenDi())? "" : donLienVan.getNgayToGiahanChuyenDi())%>">
<!-- 										<span class="input-group-addon" onclick="gtCalendar('ngayToGiaHanChuyenDi')"><i class="fa fa-calendar" ></i></span> -->
										<span class="input-group-addon"><i class="fa fa-calendar" ></i></span>
									</div>
								</div>
								<div class="clear"></div>
							</div>
						</div>
						<!-- ----END---------------Gia hạn chuyến đi (Extension for Journey)------------------------ -->
					</div>
				</div>
				<label class="pull-left" for="lyDoDeNghiGiaHan">5. Lý do đề nghị gia hạn (The reasons for extension) <span class="red">*</span>:</label>
				<div class="clear"></div>
				<div class="col-xs-12">
					<textarea class="form-control MB10" rows="5" id="lyDoDeNghiGiaHan" name="lyDoDeNghiGiaHan"><%=Validator.isNull(donLienVan)? "" : (Validator.isNull(donLienVan.getLydoGiaHan())? "" : donLienVan.getLydoGiaHan())%></textarea>
					
				<label class="pull-left">6. Chúng tôi xin cam kết (We commit):</label>
				<div class="clear"></div>
				<ol>
					<li>Chịu trách nhiệm hoàn toàn về sự trung thực và sự chính xác của nội dung Giấy đăng ký khai thác vận tải hành khách liên vận quốc tế bằng xe ô tô theo tuyến cố định.</li>
					<li>Chấp hành nghiêm chỉnh mọi quy định của pháp luật Việt Nam cũng như những quy định ghi trong Nghị định thư thực hiện Hiệp định tạo điều kiện thuận lợi cho phương tiện cơ giới đường bộ qua lại biên giới giữa Việt Nam và Lào.</li>
				</ol>
			</div>
			
			<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/_button.jspf"%>
		</div>
	</div>
</div>

</aui:form>
<portlet:resourceURL var="updateContentURL" ></portlet:resourceURL>
<script type="text/javascript">

	function isDate(str) {    
	  var parms = str.split(/[\.\-\/]/);
	  var yyyy = parseInt(parms[2],10);
	  var mm   = parseInt(parms[1],10);
	  var dd   = parseInt(parms[0],10);
	  var date = new Date(yyyy,mm-1,dd,0,0,0,0);
	  return mm === (date.getMonth()+1) && dd === date.getDate() && yyyy === date.getFullYear();
	}

	function summitForm(url) {

		 var coQuanGui = document.getElementById("coQuanGui").value;
		 var soGiaoThongVanTai = document.getElementById("soGiaoThongVanTai").value;
		 
		 var lyDoDeNghiGiaHan = document.getElementById("lyDoDeNghiGiaHan").value;
		 var bienSoXe = document.getElementById("bienSoXe").value;
		 var soGiayPhep = document.getElementById("soGiayPhep").value;
		 var ngayCapGiayPhep = document.getElementById("ngayCapGiayPhep").value;
		 var noiCap = document.getElementById("noiCap").value;
		 var ngayCoGiaTri = document.getElementById("ngayCoGiaTri").value;
		 var thoiGianNhapCanh = document.getElementById("thoiGianNhapCanh").value;
        if (coQuanGui == "") {
			alert("Chọn cơ quan cấp phép");
			return false;
		}
        if (soGiaoThongVanTai == "") {
			alert("Chọn sở giao thông vận tải");
			return false;
		}
        if (bienSoXe == "") {
			alert("Biển số xe xin gia hạn không được để trống");
			return false;
		}
        if (soGiayPhep == "") {
			alert("Số giấy phép không được để trống");
			return false;
		}
		var kiemTrasoGiayPhep = isNaN(soGiayPhep);
		if(kiemTrasoGiayPhep == true){
			alert("Số giấy phép phải để dạng số");
			return false;
		}
		
		if(ngayCapGiayPhep ==""){
			alert("Ngày cấp phép không được bỏ trống");
			return false;
		}
		if(isDate(ngayCapGiayPhep) == false){
			alert("ngày cấp không đúng định dạng");
			return false;
		}
		ngayss = new Date;
		if(ngayCapGiayPhep.valueOf() > ngayss.valueOf()){
			alert("Ngày chọn phải nhỏ hơn ngày hiện tại");
			return false;
		}
		if(noiCap ==""){
			alert("Nơi cấp không được bỏ trống");
			return false;
		}
		if(ngayCoGiaTri == ""){
			alert("Ngày có giá trị không được bỏ trống");
			return false;
		}
		if(isDate(ngayCoGiaTri) == false){
			alert("ngày có giá trị không đúng định dạng");
			return false;
		}
		
		if( new Date(ngayCapGiayPhep).getTime() >= new Date(ngayCoGiaTri).getTime()){
			alert("ngày có giá trị phải lớn hơn ngày cấp giấy phép")
			return false;
		}
		if(thoiGianNhapCanh == ""){
			alert("Thời gian nhập cảnh không được bỏ trống!");
			return false;
		}
		if(isDate(thoiGianNhapCanh) == false){
			alert("Thời gian nhập cảnh không đúng định dạng");
			return false;
		}
		
		var soNgay = '';
		var ngayFrom = '';
		var NgayTo = '';
		if(groupGiaHanType == '1'){
			soNgay = document.getElementById("soNgayGiaHanGplv").value;
			ngayFrom = document.getElementById("ngayFromGiaHanGplv").value;
			ngayTo = document.getElementById("ngayToGiaHanGplv");
		} else if(groupGiaHanType == '2'){
			soNgay = document.getElementById("soNgayGiaHanChuyenDi").value;
			ngayFrom = document.getElementById("ngayFromGiaHanChuyenDi").value;
			ngayTo = document.getElementById("ngayToGiaHanChuyenDi");
		} 

		var kiemTraTF = isNaN(soNgay);

		if (soNgay == "") {
			alert("Số ngày không được để trống");
			return false;
		}

		if (kiemTraTF == true) {
			alert("Số ngày phải để ở định dạng số");
			if(groupGiaHanType == '1'){
				document.getElementById("soNgayGiaHanGplv").value = '';
			} else if(groupGiaHanType == '2'){
				document.getElementById("soNgayGiaHanChuyenDi").value = '';
			} 
			return false;
		} else {
			if (soNgay > 10) {
				alert("Số ngày phải nhỏ hơn 10");
				return false;
			}
		}
		if(ngayFrom.trim().length = 0) {
			alert("Từ ngày không được bỏ trống");
			return false;
		}
		if(isDate(ngayFrom) == false){
			alert("ngày đi không đúng định dạng")
			return false;
		}
	

	/* 	ngayss = new Date;
		if(ngayFrom.valueOf() > ngayss.valueOf()){
			alert("Ngày chọn phải nhỏ hơn ngày hiện tại")
		}
		if(ngayFrom.valueOf() > ngayTo.valueOf()){
			alert("ngày đến phải lớn hơn ngày xuất phát")
		} */
		if(groupGiaHanType == '1'){
			document.getElementById("soNgayGiaHanChuyenDi").value = '';
			document.getElementById("ngayFromGiaHanChuyenDi").value = '';
			document.getElementById("ngayToGiaHanChuyenDi").value = '';
		} else if(groupGiaHanType == '2'){
			document.getElementById("soNgayGiaHanGplv").value = '';
			document.getElementById("ngayFromGiaHanGplv").value = '';
			document.getElementById("ngayToGiaHanGplv").value = '';
		} 


		 if (lyDoDeNghiGiaHan == "") {
				alert("Lý do đề nghị gia hạn không được để trống");
				return false;
			}

		  /*   Regex reg = new Regex("^(((0?[1-9]|[12]\d|3[01])[\.\-\/](0?[13578]|1[02])[\.\-\/]((1[6-9]|[2-9]\d)?\d{2}|\d))|((0?[1-9]|[12]\d|30)[\.\-\/](0?[13456789]|1[012])[\.\-\/]((1[6-9]|[2-9]\d)?\d{2}|\d))|((0?[1-9]|1\d|2[0-8])[\.\-\/]0?2[\.\-\/]((1[6-9]|[2-9]\d)?\d{2}|\d))|(29[\.\-\/]0?2[\.\-\/]((1[6-9]|[2-9]\d)?(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00)|00|[048])))$");
	        if (reg.IsMatch(ngay) == false) {
	            //khong fai datetime      
	            Label1.Text = "InCorrect !!";
	        }
	        else {
	            //la kieu datetime
	            Label1.Text = "Correct !!";
	        } */
	
		
		document.getElementById('<portlet:namespace />myForm').action = url;
		document.getElementById('<portlet:namespace />myForm').submit();
	}

	$('.Bo3').find('input[class="rad1"]').on('click', function (e) {
		groupGiaHanType = '1';
		this.expand = !this.expand;
		$('.big2').addClass('hid2');
		$('.big2').removeClass('big2');
		$(this).closest('.Bo3').find('.hid1, .big1').toggleClass('hid1 big1');
	});

	$('.Bo3').find('input[class="rad2"]').on('click', function (e) {
		groupGiaHanType = '2';
		this.expand = !this.expand;
		$('.big1').addClass('hid1');
		$('.big1').removeClass('big1');
		$(this).closest('.Bo3').find('.hid2, .big2').toggleClass('hid2 big2');
	});

	$(document).ready(function() {
		
		groupGiaHanType = <%=groupGiaHanType%>;
		if(groupGiaHanType == '1'){
			$('.box800').find('.hid1').addClass('big1');
			$('.box800').find('.hid1').removeClass('hid1');
		} else if(groupGiaHanType == '2'){
			$('.box800').find('.hid2').addClass('big2');
			$('.box800').find('.hid2').removeClass('hid2');
		} 
		
	});

	
	function onChangeDateFrom() {
		var soNgay = '';
		var ngayFrom = '';
		if(groupGiaHanType == '1'){
			soNgay = document.getElementById("soNgayGiaHanGplv").value;
			ngayFrom = document.getElementById("ngayFromGiaHanGplv").value;
		} else if(groupGiaHanType == '2'){
			soNgay = document.getElementById("soNgayGiaHanChuyenDi").value;
			ngayFrom = document.getElementById("ngayFromGiaHanChuyenDi").value;
		} 

		var kiemTraTF = isNaN(soNgay);

		if (soNgay == "") {
			alert("Số ngày không được để trống");
			return false;
		}

		if (kiemTraTF == true) {
			alert("Số ngày phải để ở định dạng số");
			if(groupGiaHanType == '1'){
				document.getElementById("soNgayGiaHanGplv").value = '';
			} else if(groupGiaHanType == '2'){
				document.getElementById("soNgayGiaHanChuyenDi").value = '';
			} 
			return false;
		} else {
			if (soNgay > 10) {
				alert("Số ngày phải nhỏ hơn 10");
				return false;
			}
		}
		if(ngayFrom.trim().length = 0) {
			alert("Từ ngày không được bỏ trống");
			return false;
		} else {
			
			$.ajax({
				url: '<%=updateContentURL%>',
				dataType : "json",
				data : {
					dateCount : soNgay,
					dateFrom : ngayFrom,
					type: 'plusDay'
				},
				type : "get",
				success : function(data) {
					$.each(data, function(idx, obj) {
						
						if(groupGiaHanType == '1'){
							document.getElementById("ngayToGiaHanGplv").value = obj.value;
						} else if(groupGiaHanType == '2'){
							document.getElementById("ngayToGiaHanChuyenDi").value = obj.value;
						} 
					});
				},
				beforeSend : function(data) {
					console.log("(1)==onChangeDateFrom==beforeSend==" + data);
				},
				complete : function(data) {
					console.log("(3)==onChangeDateFrom==complete==" + data);
				},
				error : function(data) {
					console.log("(2)==onChangeDateFrom==error==" + data);
				}
			});
		}
	}
	
</script>
