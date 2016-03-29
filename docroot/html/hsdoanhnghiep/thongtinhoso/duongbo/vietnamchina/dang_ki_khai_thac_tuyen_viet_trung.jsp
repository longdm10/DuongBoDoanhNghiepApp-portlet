<%@page import="java.util.Arrays"%>
<%@page import="vn.dtt.duongbo.utils.CheckCssUtils"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="vn.dtt.duongbo.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.duongbo.maudon.model.GiayDangKyKhaiThacTuyenVietTrung"%>
<%@page import="vn.dtt.duongbo.maudon.xml.MauDonFactory"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.duongbo.business.DanhMucConstants"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
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
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<link rel="stylesheet" href="<%=request.getContextPath()%>/css/tipsy.css" type="text/css" media="screen" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/jquery.alerts.css" type="text/css" media="screen" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/jquery-ui.css" type="text/css" media="screen" />

<%! private static Log _log = LogFactoryUtil.getLog(DoanhNghiepAction.class); %>

<%
	_log.info("/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/dang_ki_khai_thac_tuyen_viet_trung.jsp");
	
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	String listNoiDungHoSo = ParamUtil.getString(request, Constants.DANH_SACH_NOI_DUNG_HO_SO);
	
	_log.info("thuTucHanhChinhId--" + thuTucHanhChinhId);
	_log.info("hoSoThuTucId-------" + hoSoThuTucId);
	_log.info("thanhPhanHoSoId----" + thanhPhanHoSoId);
	
	
	String noiDungXmml = ParamUtil.getString(request, "noiDungXmml");
	
	String thanhPhoDi = ParamUtil.getString(request, "thanhPhoDi");
	String thanhPhoDen = ParamUtil.getString(request, "thanhPhoDen");
	
	
	
	long bieuMauHoSoId = 0;
	
	
	
	TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(thuTucHanhChinhId);
	TthcThanhPhanHoSo thanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.fetchTthcThanhPhanHoSo(thanhPhanHoSoId);
	TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
	long idNoiDungHoSo = ParamUtil.getLong(request, Constants.ID_NOI_DUNG_HO_SO);
	
	long userId = PortalUtil.getUserId(request);
	DnDoanhNghiep doanhNghiep = DoanhNghiepUtils.getDoanhNghiepByUserId(userId);
	
	TthcBieuMauHoSo bieuMauHoSo = null;
	List<TthcThanhPhanHoSoBieuMau> allThanhPhanHoSoBieuMau = TthcThanhPhanHoSoBieuMauLocalServiceUtil.findByThanhPhanHoSoId(thanhPhanHoSoId);
	if (allThanhPhanHoSoBieuMau != null && allThanhPhanHoSoBieuMau.size() > 0) {
		bieuMauHoSo = TthcBieuMauHoSoLocalServiceUtil.fetchTthcBieuMauHoSo(allThanhPhanHoSoBieuMau.get(0).getBieuMauHoSoId());
		if (bieuMauHoSo != null) {
			bieuMauHoSoId = bieuMauHoSo.getId();
		}
	}
	_log.info("------/maBieuMauHoSo---------" + bieuMauHoSo.getMaBieuMau());
	_log.info("------/thuTucHanhChinh-------" + thuTucHanhChinh.getMaThuTuc());
	
	GiayDangKyKhaiThacTuyenVietTrung donLienVan = null;
	TthcNoidungHoSo noidungHoSo = null;
	if(idNoiDungHoSo > 0){
		noidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(idNoiDungHoSo);
	}
	
	if (Validator.isNotNull(noidungHoSo) && Validator.isNotNull(noidungHoSo.getNoiDungXml())) {
		
		_log.info("dang_ki_khai_thac_tuyen_viet_trung--noidungHoSo--" + noidungHoSo.getId());
	
		List<Object> lstObj = MauDonFactory.converXMLMessagesContentToObject(noidungHoSo.getNoiDungXml());
		if (lstObj != null && lstObj.size() > 0) {
			donLienVan = (GiayDangKyKhaiThacTuyenVietTrung) lstObj.get(0);
		}
	}
	if (donLienVan == null) { donLienVan = MauDonFactory.converXmlToObject(noiDungXmml, new GiayDangKyKhaiThacTuyenVietTrung()); }
	if (donLienVan == null) { donLienVan = new GiayDangKyKhaiThacTuyenVietTrung(); }
	
	List<DmDataItem> lstTinhThanh = DanhMucConstants.getTinhThanh();
	
	PortletURL backUrl = renderResponse.createRenderURL();
	backUrl.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/thanh_phan_ho_so.jsp");
	backUrl.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	backUrl.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	backUrl.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
	backUrl.setParameter(Constants.DANH_SACH_NOI_DUNG_HO_SO, listNoiDungHoSo);
	
	
	PortletURL xemTruocNoiDung = renderResponse.createActionURL();
	xemTruocNoiDung.setParameter(ActionRequest.ACTION_NAME, "xemTruocNoiDung");
	xemTruocNoiDung.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	xemTruocNoiDung.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	xemTruocNoiDung.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
	xemTruocNoiDung.setParameter(Constants.ID_BIEU_MAU_HO_SO, String.valueOf(bieuMauHoSoId));
	xemTruocNoiDung.setParameter(Constants.DANH_SACH_NOI_DUNG_HO_SO, listNoiDungHoSo);
	xemTruocNoiDung.setParameter(Constants.PATH_MAUDON_VIEW_PDF, "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/dang_ki_khai_thac_tuyen_viet_trung_view.jsp");
	
	List<DmDataItem> lstCoQuanCapPhep = DanhMucConstants.getCoQuanCapPhep(thuTucHanhChinhId+"");
	List<DmDataItem> dmDiemDung = DanhMucConstants.getDiemDoVNTQ();
	List<DmDataItem> lstBenXeVN = DanhMucConstants.getBenXeVN();
	List<DmDataItem> lstBenXeTQ = DanhMucConstants.getBenXeTQ();
	List<DmDataItem> lstTinhThanhPhoTQ = DanhMucConstants.getTinhThanhPhoTQ();
	List<DmDataItem> dmCoQuanCapPhep = DanhMucConstants.getCoQuanCapPhep(thuTucHanhChinhId+"");

%>

<!-- /html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/dang_ki_khai_thac_tuyen_viet_trung.jsp -->


<aui:form action="<%=xemTruocNoiDung.toString()%>" name="myForm" id="myForm" method="POST">

<h4 class="PL15 BGT BOB font14 col-xs-12"><%=bieuMauHoSo.getTenBieuMau()%></h4>
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
						<b>CỘNG HÒA XÃ HỘI CHỦ NGHĨA VIỆT NAM</b><br> <b>Độc lập - Tự do - Hạnh phúc</b><br> ---------------
					</p>
						<div class="col-xs-6 PA0">
							<select class="form-control" id="tinhThanh" name="tinhThanh">
							<%DmDataItem dmTinhDoanhNghiep = DmDataItemLocalServiceUtil.getByGroupCodeAndItemCode0(DanhMucConstants.DON_VI_HANH_CHINH, doanhNghiep.getMaTinhThanh());%>
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
			<h3 class="tle text-center">GIẤY ĐĂNG KÝ KHAI THÁC TUYẾN VẬN TẢI HÀNH KHÁCH<br>ĐỊNH KỲ GIỮA VIỆT NAM VÀ TRUNG QUỐC</h3>
			<div class="col-sm-12">
				<div class="text-center col-xs-12 MB20">
				<label class="textlabel col-xs-2 col-xs-offset-3" style="width: 9.1%;">Kính gửi:</label>
				
					<div class="col-xs-5">
						<select class="form-control" id="coQuanGui" name="coQuanGui">
						<option value="">-- Lựa chọn cơ quan cấp phép --</option>
							<%
							for(DmDataItem item : dmCoQuanCapPhep){
								%>
								<option value="<%=item.getCode()%>" <%=((donLienVan == null)? "" : ((donLienVan.getCoQuanGui() == null) ? "" : donLienVan.getCoQuanGui().trim())).equals(item.getCode())? "selected='selected'" : ""%>><%=item.getName()%></option>
								<%
							}
							%>
						</select>
					</div>
				</div>
			
				<label class="pull-left w250">1. Tên doanh nghiệp, hợp tác xã</label><p class="textU">: <%=doanhNghiep.getTenDoanhNghiep().toUpperCase()%></p>
				
				<label class="pull-left w250">2. Địa chỉ</label>
				<div class="col-sm-8 PA0">
					<label class="pull-left" style="height: 30px;vertical-align: middle;">: </label>
					<input type="text" id="diaChiDoanhNghiep" name="diaChiDoanhNghiep" style="width: 90%" value="<%=doanhNghiep.getDiaChi()%>" class="form-control">
				</div>
				<div class="clear"></div>
				<div style="height: 5px">&nbsp</div>
				
				<label class="pull-left w250">3. Số điện thoại</label><p><span class="pull-left">: <%=doanhNghiep.getDienThoai()%></span>
				<span class="pull-left w250 text-center"><b>Số Fax</b></span>: <%=doanhNghiep.getFax()%></p>
				<label class="pull-left">4. Giấy phép kinh doanh vận tải bằng xe ô tô:</label>
				<div class="clear"></div>
				<div style="padding:0 15px">
					<label class="pull-left w265">Số <span class="red">*</span></label><p>: <%=(Validator.isNull(doanhNghiep.getSoGpkdVanTaiBangOto()) ? "" : doanhNghiep.getSoGpkdVanTaiBangOto())%></p>
					<label class="pull-left w265">Ngày cấp <span class="red">*</span></label><p>: <%=DateUtils.dateToString("dd/MM/yyyy", doanhNghiep.getNgayCapGpkdVanTaiBangOto())%></p>
					<label class="pull-left w265">Cơ quan cấp <span class="red">*</span></label><p>: <%=(Validator.isNull(doanhNghiep.getCoQuanCapGpkdVanTaiBangOto()) ? "" : doanhNghiep.getCoQuanCapGpkdVanTaiBangOto())%></p>
				</div>
				
				<label class="pull-left">5. Đăng ký khai thác vận tải hành khách định kỳ giữa Việt Nam và Trung Quốc như sau:</label>
				<div class="clear"></div>
				<div class="row M0">
					<div class="col-xs-3 form-group">
						<label for="thanhPhoDi">Tỉnh/ thành phố đi <span class="red">*</span>:</label>
						<select class="form-control" id="thanhPhoDi" name="thanhPhoDi">
							<option value="">-- Chọn tỉnh/thành phố --</option>
							<%for (DmDataItem item : lstTinhThanh) {
								%>
								<option value="<%=item.getCode()%>" <%=((donLienVan == null)? "" : ((donLienVan.getTinhTPDi() == null) ? "" : donLienVan.getTinhTPDi().trim())).equals(item.getCode())? "selected='selected'" : ""%>><%=item.getName()%></option>
								<%
							}
							%>
						</select>
					</div>
					<div class="col-xs-3 form-group">
						<label for="thanhPhoDen">Tỉnh/ thành phố đến <span class="red">*</span>:</label>
						<select class="form-control" id="thanhPhoDen" name="thanhPhoDen">
						<option value="">-- Chọn tỉnh/thành phố --</option>
							<%for (DmDataItem item : lstTinhThanhPhoTQ) {
								%>
								<option value="<%=item.getCode()%>" <%=((donLienVan == null)? "" : ((donLienVan.getTinhTPDen() == null) ? "" : donLienVan.getTinhTPDen().trim())).equals(item.getCode())? "selected='selected'" : ""%>><%=item.getName()%></option>
								<%
							}
							%>
						</select>
					</div>
					<div class="col-xs-3 form-group">
						<label for="benDi">Bến đi <span class="red">*</span>:</label>
						
						<select class="form-control" id="benDi" name="benDi">
						<option value="">-- Chọn bến --</option>
							<%for (DmDataItem item : lstBenXeVN) {
								%>
								<option value="<%=item.getCode()%>" <%=((donLienVan == null)? "" : ((donLienVan.getBenDi() == null) ? "" : donLienVan.getBenDi().trim())).equals(item.getCode())? "selected='selected'" : ""%>><%=item.getName()%></option>
								<%
							}
							%>
						</select>
					</div>
					<div class="col-xs-3 form-group">
						<label for="benDen">Bến đến <span class="red">*</span>:</label>
						<select class="form-control" id="benDen" name="benDen">
						<option value="">-- Chọn bến --</option>
							<%for (DmDataItem item : lstBenXeTQ) {
								%>
								<option value="<%=item.getCode()%>" <%=((donLienVan == null)? "" : ((donLienVan.getBenDen() == null) ? "" : donLienVan.getBenDen().trim())).equals(item.getCode())? "selected='selected'" : ""%>><%=item.getName()%></option>
								<%
							}
							%>
						</select>
					</div>
				</div>
				<div class="row M0">
					<div class="col-xs-3 form-group">
						<label for="cuLyVanChuyen">Cự ly vận chuyển <span class="red">*</span>:</label>
						<div class="col-xs-10 PAl0">
							<input type="text" class="form-control pull-left" name="cuLyVanChuyen" id="cuLyVanChuyen" value="<%=(donLienVan.getCuLy() != null) ? donLienVan.getCuLy() : ""%>" >
						</div>
						<span class="pull-left textlabel">km</span>
					</div>
					<div class="col-xs-9 form-group">
						<label for="hanhTrinhChayXe">Hành trình chạy xe <span class="red">*</span>:</label>
						<input type="text" class="form-control" name="hanhTrinhChayXe" id="hanhTrinhChayXe" value="<%=(donLienVan.getHanhTrinh() != null) ? donLienVan.getHanhTrinh() : ""%>" >
					</div>
				</div>
				
				<div class="col-xs-12 MB10"><b>Điểm dừng nghỉ trên đường</b> <span class="red">*</span>:</div>
				<div class="clear"></div>
				<div class="col-xs-12 PA0">
					<div class="" style="width:45%; float:left">
					<input type="hidden" name="listDiemDungNghi"  id="listDiemDungNghi" value="<%=(donLienVan.getDiemDungDo() != null) ? donLienVan.getDiemDungDo() : ""%>">
						<select id="select_diem_dung_left" name="select_diem_dung_left" class="form-control" multiple="" size="8">
							<%
							String[] lstDiemDungDo =  (donLienVan.getDiemDungDo() != null) ? donLienVan.getDiemDungDo().split(",") : new String[]{};
							List<String> codeDiemDungDos = Arrays.asList(lstDiemDungDo);
							
							for(DmDataItem item : dmDiemDung) {
								
								if (!CheckCssUtils.isExist(codeDiemDungDos, item.getCode())) {
									%>
									<option value="<%=item.getCode()%>"><%=item.getName()%></option>
									<%
								}
							}%>
						</select>
					</div>
					<div class="" style="width:10%; float:left; text-align:center">
						<input type="button" style="margin-top: 40px;" class="text-center" value=">>" onclick="moveOptions('select_diem_dung_left','select_diem_dung_right');">
						<br>
						<input type="button" style="margin-top: 10px;" class="text-center" value="<<" onclick="moveOptions('select_diem_dung_right','select_diem_dung_left');">
					</div>
					<div class="" style="width:45%; float:left">
						<select id="select_diem_dung_right" name="select_diem_dung_right" class="form-control" multiple="" size="8">
							<%
							for(DmDataItem item : dmDiemDung) {
								if (CheckCssUtils.isExist(codeDiemDungDos, item.getCode())) {
									%>
									<option value="<%=item.getCode()%>"><%=item.getName()%></option>
									<%
								}
							}
							%>
						</select>
					</div>
				</div>
				
				
				<label class="pull-left">6. Danh sách xe:</label>
				<div class="clear"></div>
				
				<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/table_phuong_tien_dang_ki.jsp"%>
				
				<label class="pull-left" style="margin-top:15px">7. Doanh nghiệp, hợp tác xã cam kết:</label>
				<div class="clear"></div>
				<ol type="a">
					<li>Chịu trách nhiệm hoàn toàn về sự trung thực và sự chính xác của nội dung Giấy đăng ký khai thác vận tải định kỳ giữa Việt Nam và Trung Quốc;</li>
					<li>Chấp hành nghiêm chỉnh mọi quy định của pháp luật Việt Nam cũng như những quy định ghi trong Hiệp định, Nghị định thư sửa đổi Hiệp định và Nghị định thư thực hiện Hiệp định vận tải đường bộ Việt - Trung.</li>
				</ol>
			</div>
			
			<!-- ----------BUTTON---------------- -->
			<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamchina/_button.jspf"%>
			
		</div>
	</div>
</div>
</aui:form>

<portlet:renderURL var="selectTenThanhPho" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/hsdoanhnghiep/thongtinhoso/duongbo/_select_benxe.jsp"/>
</portlet:renderURL>

<portlet:resourceURL var="updateContentURL" ></portlet:resourceURL>
<script type="text/javascript">

	AUI().ready(function(A){
		//----viet nam----
		var thanhPhoDi = $("select#thanhPhoDi");
		
		thanhPhoDi.on('change', function(){
			var codeThanhPhoDi = thanhPhoDi.val();
			selectTinhThanhPho(codeThanhPhoDi, '<%=DanhMucConstants.DM_BEN_XE_VN%>', 'benDi');
		});
	
		//----Trung Quoc----
		var thanhPhoDen = $("select#thanhPhoDen");
		thanhPhoDen.on('change', function(){
			var codeThanhPhoDen = thanhPhoDen.val();
			selectTinhThanhPho(codeThanhPhoDen, '<%=DanhMucConstants.DM_BEN_XE_TQ%>', 'benDen');
		});
	});

	function selectTinhThanhPho(codeThanhPho, danhMucConstantBenXe, idSelectBenXe){
		AUI().use('aui-base','aui-io-request', function(A){

			//aui ajax call to get updated content
			A.io.request('<%= selectTenThanhPho %>',
			{
				dataType: 'text/html',
				method: 'GET',
				data: { 
					"<portlet:namespace />codeTinhThanhPho": codeThanhPho,
					"<portlet:namespace />danhMucConstantBenXe": danhMucConstantBenXe
				},
				on: {
					success: function() {
						var domSelectBenXe = A.one("#" + idSelectBenXe);
						domSelectBenXe.set("innerHTML", this.get('responseData'));
					} 
				}
			});
		});	
	}
	
	var idTenThuongMai = "" ;
	idTenThuongMai = "#textTenThuongMai";
	
	
	jQuery(document).ready(function($) {
		$(idTenThuongMai).keypad({keypadOnly: false, layout: _specChar, prompt: _promptTitle});
	});

	
	function summitForm(url) {
		var tinhThanh = document.getElementById("tinhThanh").value;
		var coQuanGui = document.getElementById("coQuanGui").value;
		var thanhPhoDi = document.getElementById("thanhPhoDi").value;
		var thanhPhoDen = document.getElementById("thanhPhoDen").value;
		var benDi = document.getElementById("benDi").value;
		var benDen = document.getElementById("benDen").value;
		var cuLyVanChuyen = document.getElementById("cuLyVanChuyen").value;
		
		var hanhTrinhChayXe = document.getElementById("hanhTrinhChayXe").value;

		if (tinhThanh == "") {
			alert("Chọn Tỉnh/Thành Phố");
			return false;
		}
		if (coQuanGui == "") {
			alert("Chọn cơ quan cấp phép");
			return false;
		}
		
		if (thanhPhoDi == "") {
			alert("Chọn thành phố đi!");
			return false;
		}
		if (thanhPhoDen == "") {
			alert("Chọn thành phố đến");
			return false;
		}

		if (cuLyVanChuyen == "") {
			alert("Cự ly vận chuyển không được để trống");
			return false;
		}
	        if(!isNormalInteger(cuLyVanChuyen)){
	        	alert("Cự ly phải là dạng số");
	        	return false;
	        }

		if (hanhTrinhChayXe == "") {
			alert("Hành trình xe chạy không được để trống");
			return false;
		}
		
		document.getElementById('<portlet:namespace />myForm').action = url;
		document.getElementById('<portlet:namespace />myForm').submit();
	}

	function moveOptions(fromId,toId){
		$("#"+fromId+" option").each(function() {
			if(this.selected){			
				$('#'+toId).append($('<option>', { 
			        value: this.value,
			        text : this.text 
			    }));
				
				$(this).remove();
			}
		});
		getDanhSachDiemDungNghi();
	}
	function getDanhSachDiemDungNghi() {

		var idcn = "";
		$("#select_diem_dung_right option").each(function() {
			idcn = idcn + "," + this.value;
		});
		if (idcn.length > 1)
		{
			idcn = idcn.substring(1);
		}
		document.getElementById("listDiemDungNghi").value = idcn;
		
	}
	function openDialog(idThanhPhanHoSo) {
		$('#' + idThanhPhanHoSo).modal('show');
		//$('#upLoadFile_dialog_' + idThanhPhanHoSo).modal('show');
	}

	function closeDialog(idThanhPhanHoSo) {
		//$('#' + idThanhPhanHoSo).modal('hide');
		/**$('#upLoadFile_dialog_'+ idThanhPhanHoSo).dialog('close');*/
		//$('#upLoadFile_dialog_'+ idThanhPhanHoSo).modal('hide');
	}
	
</script>


