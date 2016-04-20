<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.duongbo.maudon.model.DKKTVTTuyenCoDinhBangOtoVietCam"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.maudon.xml.XmlUtils"%>
<%@page import="vn.dtt.duongbo.maudon.xml.MauDonFactory"%>
<%@page import="vn.dtt.duongbo.maudon.model.DKKTVTTuyenCoDinhBangOtoVietLao"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.business.DanhMucConstants"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
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

<%!private static Log _log = LogFactoryUtil.getLog(DoanhNghiepAction.class);%>

<%
	_log.info("/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/bo_sung_khai_thac_van_tai_hanh_khach_tuyen_co_dinh_viet_lao.jsp");

	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	String listNoiDungHoSo = ParamUtil.getString(request, Constants.DANH_SACH_NOI_DUNG_HO_SO);
	
	
	String noiDungXmml = ParamUtil.getString(request, "noiDungXmml");
	
	
	String tinhThanh = ParamUtil.getString(request, "tinhThanh");
	String coQuanGui = ParamUtil.getString(request, "coQuanGui");
	String thanhPhoFrom = ParamUtil.getString(request, "thanhPhoFrom");
	String thanhPhoTo = ParamUtil.getString(request, "thanhPhoTo");
	String benDi = ParamUtil.getString(request, "benDi");
	String benDen = ParamUtil.getString(request, "benDen");
	
	long bieuMauHoSoId = 0;
	
	TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(thuTucHanhChinhId);
	TthcThanhPhanHoSo thanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.fetchTthcThanhPhanHoSo(thanhPhanHoSoId);
	TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
	
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
	
	
	DKKTVTTuyenCoDinhBangOtoVietLao donLienVan =null;
	
	
	TthcNoidungHoSo noidungHoSo = null;
	
	if (hoSoThuTucId > 0) {
		noidungHoSo = TthcNoidungHoSoLocalServiceUtil.getLastByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId, thanhPhanHoSoId);
		if (Validator.isNotNull(noidungHoSo) && Validator.isNotNull(noidungHoSo.getNoiDungXml())) {
			
			_log.info("--noidungHoSo--" + noidungHoSo.getId());
			
			List<Object> lstObj = MauDonFactory.converXMLMessagesContentToObject(XmlUtils.replaceXML(noidungHoSo.getNoiDungXml()));
			
			if (lstObj != null && lstObj.size() > 0) {
				donLienVan = (DKKTVTTuyenCoDinhBangOtoVietLao) lstObj.get(0);
			}
		}
	}
	
	if (donLienVan == null) { donLienVan = MauDonFactory.converXmlToObject(noiDungXmml, new DKKTVTTuyenCoDinhBangOtoVietLao()); }
	
	String loaiTthc = ParamUtil.getString(request, Constants.LOAI_THU_TUC_HANH_CHINH);
	
	List<DmDataItem> lstTinhThanh = DanhMucConstants.getTinhThanh();
	List<DmDataItem> lstCoQuanCapPhep = DanhMucConstants.getCoQuanCapPhep(thuTucHanhChinhId+"");
	List<DmDataItem> lstBxVN = DanhMucConstants.getBenXeVN();
	List<DmDataItem> lstTinhTPLao = DanhMucConstants.getTinhTPLao();
	List<DmDataItem> lstBxeLao = DanhMucConstants.getBenXeLao();
	List<DmDataItem> lstBxeCam = DanhMucConstants.getBenXeCam();
	List<DmDataItem> lstTinhTPCam = DanhMucConstants.getTinhTPCam();
%>

<portlet:renderURL var="backUrl">
	<portlet:param name="jspPage" value="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/thanh_phan_ho_so.jsp"/>
	<portlet:param name="<%= Constants.ID_THU_TUC_HANH_CHINH%>" value="<%= String.valueOf(thuTucHanhChinhId)%>"/>
	<portlet:param name="<%= Constants.ID_HO_SO_THU_TUC%>" value="<%= String.valueOf(hoSoThuTucId)%>"/>
	<portlet:param name="<%= Constants.ID_THANH_PHAN_HO_SO%>" value="<%= String.valueOf(thanhPhanHoSoId)%>"/>
	<portlet:param name="<%= Constants.DANH_SACH_NOI_DUNG_HO_SO%>" value="<%= String.valueOf(listNoiDungHoSo)%>"/>
</portlet:renderURL>

<portlet:actionURL var="xemTruocNoiDung" name="xemTruocNoiDung">
	<portlet:param name="<%= Constants.ID_THU_TUC_HANH_CHINH%>" value="<%= String.valueOf(thuTucHanhChinhId)%>"/>
	<portlet:param name="<%= Constants.ID_HO_SO_THU_TUC%>" value="<%= String.valueOf(hoSoThuTucId)%>"/>
	<portlet:param name="<%= Constants.ID_THANH_PHAN_HO_SO%>" value="<%= String.valueOf(thanhPhanHoSoId)%>"/>
	<portlet:param name="<%= Constants.ID_BIEU_MAU_HO_SO%>" value="<%= String.valueOf(bieuMauHoSoId)%>"/>
	<portlet:param name="<%= Constants.ID_DOANH_NGHIEP%>" value="<%= String.valueOf(doanhNghiep.getId())%>"/>
	<portlet:param name="<%= Constants.LOAI_THU_TUC_HANH_CHINH%>" value="<%= String.valueOf(loaiTthc)%>"/>
	<portlet:param name="<%= Constants.PATH_MAUDON_VIEW_PDF%>" value="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/dang_ki_khai_thac_van_tai_hanh_khach_tuyen_co_dinh_viet_lao_views.jsp"/>
</portlet:actionURL>

<aui:form action="<%=xemTruocNoiDung.toString()%>" name="myForm" id="myForm" method="POST">

	<!------------------------------------- /van_ban_thong_bao_ngung_khai_thac_tuyen_co_dinh_viet_laos.jsp ---------------------------------------->
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
				
				<h3 class="tle text-center">
					GIẤY ĐĂNG KÝ KHAI THÁC<br>TUYẾN VẬN TẢI HÀNH KHÁCH TUYẾN CỐ ĐỊNH BẰNG XE Ô TÔ<br>GIỮA VIỆT NAM VÀ LÀO
				</h3>
				<div class="col-sm-12">
					<div class="text-center col-xs-12 MB20">
						<label class="textlabel col-xs-2 col-xs-offset-3" style="width: 11.1%;">Kính gửi<span class="red">*</span>:</label>
						<div class="col-xs-5">
							<select class="form-control" id="coQuanGui" name="coQuanGui">
								<option value="">-- Chọn cơ quan cấp phép --</option>
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
					<label class="pull-left w250">1. Tên doanh nghiệp, hợp tác xã</label>
					<p class="textU">: <%=doanhNghiep.getTenDoanhNghiep().toUpperCase()%></p>
						
					<label class="pull-left w250">2. Địa chỉ</label>
					<div class="col-sm-8 PA0">
						<label class="pull-left" style="height: 30px;vertical-align: middle;">: </label>
						<input type="text" id="diaChiDoanhNghiep" name="diaChiDoanhNghiep" style="width: 90%" value="<%=doanhNghiep.getDiaChi()%>" class="form-control">
					</div>
					<div class="clear"></div>
					<div style="height: 5px">&nbsp</div>
						
						
					<label class="pull-left w250">3. Số điện thoại</label>
					<p>
						<span class="pull-left">: <%=doanhNghiep.getDienThoai()%></span> <span class="pull-left w250 text-center"><b>Số Fax</b></span>:
						<%=doanhNghiep.getFax()%></p>
				<label class="pull-left">4. Giấy phép vận tải đường bộ quốc tế Việt Nam - Campuchia do Tổng cục Đường bộ Việt Nam cấp:</label>
					<div class="clear"></div>
					<div style="padding: 0 15px; margin-bottom: 15px">
						<div class="col-xs-6">
							<label class="pull-left w265">Số </label> 
							<input type="text" class="form-control" id="SoGPVT" name="SoGPVT" value="<%=donLienVan!=null?donLienVan.getSoGiayPhepVanTai():""%>"> 
						</div>
						<div class="col-xs-6">
							<label class="pull-left w265">Ngày cấp </label>
							<div class="col-xs-12 PA0">
								<div class="input-group">
									<input type="text" class="form-control" id="ngayCapGiayPhep" name="ngayCapGiayPhep" onclick="gtCalendar('ngayCapGiayPhep')" value="<%=(donLienVan!=null)?donLienVan.getNgayCapGiayPhepVantai():""%>"> <span
										class="input-group-addon" onclick="gtCalendar('ngayCapGiayPhep')"><i class="fa fa-calendar"></i></span>
								</div>
							</div>
						</div>
					</div>
					<label class="pull-left">5. Đăng ký khai thác tuyến vận tải hành khách tuyến cố định bằng xe ô tô giữa Việt Nam và Lào như sau:</label>
					
					<div class="clear"></div>
					<div class="row M0">
						<div class="col-xs-3 form-group">
							<label for="thanhPhoFrom">Tỉnh/ thành phố đi <span class="red">*</span>:
							</label> <select class="form-control" id="thanhPhoFrom" name="thanhPhoFrom">
								<option value="">-- Chọn Tỉnh đi --</option>
								<%
									for (DmDataItem item : lstTinhThanh) {
								%>
								
								<option value="<%=item.getCode()%>" <%=((donLienVan == null)? "" : ((donLienVan.getTinhTPDi() == null) ? "" : donLienVan.getTinhTPDi().trim())).equals(item.getCode())? "selected='selected'" : ""%>><%=item.getName()%></option>
								<%
									}
								%>
							</select>
						</div>
						<div class="col-xs-3 form-group">
							<label for="thanhPhoTo">Tỉnh/ thành phố đến <span class="red">*</span>:
							</label> <select class="form-control" id="thanhPhoTo" name="thanhPhoTo">
								<option value="">-- Chọn Tỉnh đến --</option>
								<%
								for (DmDataItem item : lstTinhTPLao) {
								%>
								<option value="<%=item.getCode()%>" <%=((donLienVan == null)? "" : ((donLienVan.getTinhTPDen() == null) ? "" : donLienVan.getTinhTPDen().trim())).equals(item.getCode())? "selected='selected'" : ""%>><%=item.getName()%></option>
								<%
									}
								%>
							</select>
						</div>
						<div class="col-xs-3 form-group">
							<label for="benDi">Bến đi <span class="red">*</span>:
							</label> <select class="form-control" id="benDi" name="benDi">
								<option value="">-- Chọn Bến đi --</option>
								<%
									for (DmDataItem item : lstBxVN) {
								%>
								
								<option value="<%=item.getCode()%>" <%=((donLienVan == null)? "" : ((donLienVan.getBenDi() == null) ? "" : donLienVan.getBenDi().trim())).equals(item.getCode())? "selected='selected'" : ""%>><%=item.getName()%></option>
								<%
									}
								%>
							</select>
						</div>
						<div class="col-xs-3 form-group">
							<label for="benDen">Bến đến <span class="red">*</span>:
							</label> <select class="form-control" id="benDen" name="benDen">
								<option value="">-- Chọn Bến đến --</option>
								<%
									for (DmDataItem item : lstBxeLao) {
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
							<label for="sel1">Cự ly vận chuyển <span class="red">*</span>:
							</label>
							<div class="col-xs-10 PAl0">
								<input type="text" class="form-control pull-left" id="cuLy" name="cuLy" value="<%=(donLienVan!=null)?donLienVan.getCuLy():""%>" >
							</div>
							<span class="pull-left textlabel">km</span>
						</div>
						<div class="col-xs-9 form-group">
							<label for="sel1">Hành trình chạy xe <span class="red">*</span>:
							</label> <input type="text" class="form-control" id="hanhTrinh" name="hanhTrinh" value="<%=(donLienVan!=null)?donLienVan.getHanhTrinh():""%>">
						</div>
					</div>
					<label class="pull-left">6. Danh sách xe:</label>
					<div class="clear"></div>
					
					<!-- noi dung chuc nang Popup -->
					<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/table_phuong_tien_dang_ki.jsp"%>
					</div>

					<label class="pull-left" style="margin-top: 15px">7. Doanh nghiệp, hợp tác xã cam kết:</label>
					<div class="clear"></div>
					<ol type="a">
						<li>Chịu trách nhiệm hoàn toàn về sự trung thực và sự chính xác của nội dung Giấy đăng ký khai thác tuyến vận tải hành khách cố định bằng xe ô tô giữa Việt Nam và Campuchia.</li>
						<li>Chấp hành nghiêm chỉnh mọi quy định của pháp luật Việt Nam cũng như những quy định ghi trong Hiệp định và Nghị định thư thực hiện Hiệp định vận tải đường bộ giữa Việt Nam và Campuchia</li>
					</ol>
					
					<!-- ----------BUTTON---------------- -->
					<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/_button.jspf"%>
					
				</div>
			</div>
		</div>
</aui:form>

<portlet:renderURL var="selectTenThanhPho" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/hsdoanhnghiep/thongtinhoso/duongbo/_select_benxe.jsp"/>
</portlet:renderURL>

<portlet:resourceURL var="updateContentURL"></portlet:resourceURL>
<script type="text/javascript">

	AUI().ready(function(A) {
		//----viet nam----
		var thanhPhoFrom = $("select#thanhPhoFrom");
		
		thanhPhoFrom.on('change', function(){
			var codeThanhPhoDi = thanhPhoFrom.val();
			selectTinhThanhPho(codeThanhPhoDi, '<%=DanhMucConstants.DM_BEN_XE_VN%>', 'benDi');
		});
	
		//----Trung Quoc----
		var thanhPhoTo = $("select#thanhPhoTo");
		thanhPhoTo.on('change', function(){
			var codeThanhPhoDen = thanhPhoTo.val();
			selectTinhThanhPho(codeThanhPhoDen, '<%=DanhMucConstants.DM_BEN_XE_LAO%>', 'benDen');
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
		var SoGPVT = $('#SoGPVT').val();
		if (SoGPVT == "") { alert("Số giấy phép vận tải đường bộ không được để trống"); return false; }
		
		var ngayCapGiayPhep = $('#ngayCapGiayPhep').val();
		if (ngayCapGiayPhep == "") { alert("Ngày giấy phép vận tải đường bộ không được để trống"); return false; }
		
		var thanhPhoFrom = $('#thanhPhoFrom').val();
		if (thanhPhoFrom == "") { alert("Chọn tỉnh đi đăng ký khai thác tuyến "); return false; }
		
		var thanhPhoTo = $('#thanhPhoTo').val();
		if (thanhPhoTo == "") { alert("Chọn tỉnh đến đăng ký khai thác tuyến "); return false; }

		var benDi = $('#benDi').val();
		if (benDi == "") {
			alert("Chọn bến đi đăng ký khai thác tuyến ");
			return false;
		}

		var benDen = document.getElementById("benDen").value;
		if (benDen == "") {
			alert("Chọn bến đến đăng ký khai thác tuyến ");
			return false;
		}

		
		var coQuanGui = document.getElementById("coQuanGui").value;
		var cuLy = document.getElementById("cuLy").value;
		var hanhTrinh = document.getElementById("hanhTrinh").value;

		if (tinhThanh == "") {
			alert("Lựa chọn tỉnh thành");
			return false;
		}
			
		if (coQuanGui == "") {
			alert("Lựa chọn cơ quan cấp phép");
			return false;
		}
		
		if (cuLy == "") {
			alert("Cự ly vận chuyển không được để trống ");
			return false;
		}
		if(!isNormalInteger(cuLy)){
			alert("cự ly vận chuyển phải là dạng số!");
			return false;
		}
		if (hanhTrinh == "") {
			alert("Hành trình vận chuyển không được để trống ");
			return false;
		}
		
		document.getElementById('<portlet:namespace />myForm').action = url;
		document.getElementById('<portlet:namespace />myForm').submit();
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


<style>
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
	.row-eq-height {
    display: -webkit-box;
    display: -webkit-flex;
    display: -ms-flexbox;
    display: flex;
	}
	.Bo2{
		border:solid 1px #ccc;
		border-radius:6px;
		padding:15px;
		height:150px;
	}
	.striped {background-color: #f9f9f9}
</style>


