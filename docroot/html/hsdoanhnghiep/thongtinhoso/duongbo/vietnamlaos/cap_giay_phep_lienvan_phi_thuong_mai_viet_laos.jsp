<%@page import="vn.dtt.duongbo.maudon.xml.XmlUtils"%>
<%@page import="vn.dtt.duongbo.business.nghiepvu.NghiepVuUtils"%>
<%@page import="vn.dtt.duongbo.maudon.fac.DonXinCapGPLienVanVietLaoFactory"%>
<%@page import="vn.dtt.duongbo.maudon.xml.MauDonFactory"%>
<%@page import="vn.dtt.duongbo.maudon.model.DonXinCapGPLienVanVietLao"%>
<%@page import="vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoImpl"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongbo.utils.format.DateUtils"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongbo.business.DanhMucConstants"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcBieuMauHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoBieuMauLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau"%>
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
<%@page import="vn.dtt.duongbo.utils.*"%>

<%@ include file="/html/init.jsp"%>

<%@page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%! private static Log _log = LogFactoryUtil.getLog(DoanhNghiepAction.class); %>

<%
	_log.info("/html/hsdoanhnghiep/thongtinhoso/vietnamlaos/cap_giay_phep_lienvan_phi_thuong_mai_viet_laos.jsp");
	
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long idNoiDungHoSo = ParamUtil.getLong(request, Constants.ID_NOI_DUNG_HO_SO);
	
	String noiDungXmml = ParamUtil.getString(request, "noiDungXmml");
	
	_log.info("thuTucHanhChinhId--" + thuTucHanhChinhId);
	_log.info("hoSoThuTucId-------" + hoSoThuTucId);
	_log.info("thanhPhanHoSoId----" + thanhPhanHoSoId);
	
	long bieuMauHoSoId = 0;
	
	TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(thuTucHanhChinhId);
	TthcThanhPhanHoSo thanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.fetchTthcThanhPhanHoSo(thanhPhanHoSoId);
	TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
	
	DnDoanhNghiep doanhNghiep = DoanhNghiepUtils.getDoanhNghiepByUserId(PortalUtil.getUserId(request));
	
	TthcBieuMauHoSo bieuMauHoSo = NghiepVuUtils.getBieuMauHoSoByThanhPhanHoSoId(thanhPhanHoSoId);
	_log.info("------/maBieuMauHoSo---------" + bieuMauHoSo.getMaBieuMau());
	_log.info("------/thuTucHanhChinh-------" + thuTucHanhChinh.getMaThuTuc());
	
	String loaiTthc = ParamUtil.getString(request, Constants.LOAI_THU_TUC_HANH_CHINH);
	
	
	
	DonXinCapGPLienVanVietLao donLienVan = null;
	TthcNoidungHoSo noidungHoSo = null;
	
	if(idNoiDungHoSo > 0){
		noidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(idNoiDungHoSo);
	}
	
	if (Validator.isNotNull(noidungHoSo) && Validator.isNotNull(noidungHoSo.getNoiDungXml())) {
		
		_log.info("-----noidungHoSoID:" + noidungHoSo.getId());
		_log.info("-----noidungHoSoXML--" + noidungHoSo.getNoiDungXml());
	
		List<Object> lstObj = MauDonFactory.converXMLMessagesContentToObject(noidungHoSo.getNoiDungXml());
		if (lstObj != null && lstObj.size() > 0) {
			donLienVan = (DonXinCapGPLienVanVietLao) lstObj.get(0);
		}
	}
	
	if (donLienVan == null) { donLienVan = MauDonFactory.converXmlToObject(noiDungXmml, new DonXinCapGPLienVanVietLao()); }
	if (donLienVan == null) { donLienVan = new DonXinCapGPLienVanVietLao(); }
	
	
	
	List<DmDataItem> lstMucDichChuyenDi = DanhMucConstants.getMucDichChuyenDi();
	List<DmDataItem> lstCoQuanCapPhep = DanhMucConstants.getCoQuanCapPhep(thuTucHanhChinhId+"");
	
	
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
	xemTruocNoiDung.setParameter(Constants.PATH_MAUDON_VIEW_PDF, "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/cap_giay_phep_lienvan_phi_thuong_mai_viet_laos_view.jsp");
%>
<aui:form action="<%=xemTruocNoiDung.toString()%>" name="myForm" id="myForm" method="POST">
<!------------------------------------- /thong_bao_dieu_chinh_tan_suat_tuyen_van_tai_hanh_khach_tuyen_co_dinh.jsp ---------------------------------------->
<h4 class="PL15 BGT BOB font14 col-xs-12"><%=bieuMauHoSo.getTenBieuMau()%></h4>
<div class="P10 col-xs-12">
	<div class="BGT noidung">
		<div class="box1000">
			<div class="col-sm-12">
				<p class="pull-left text-center"><b><%=doanhNghiep.getTenDoanhNghiep().toUpperCase()%><br>
					Đề nghị cấp giấy phép</b><br>
					----------
				</p>
				<p class="pull-right text-center"><b>CỘNG HÒA XÃ HỘI CHỦ NGHĨA VIỆT NAM<br>
					Độc lập - Tự do - Hạnh phúc</b><br>
					--------------------
				</p>
			</div>
			
			<%if (Constants.LVTT_VIET_NAM_LAO.equalsIgnoreCase(loaiTthc)) {%>
				<h3 class="tle text-center">ĐƠN ĐỀ NGHỊ<br>CẤP GIẤY PHÉP LIÊN VẬN VIỆT - LÀO</h3>
				
			<%} else if (Constants.LVTT_VIET_NAM_CAMPUCHIA.equalsIgnoreCase(loaiTthc)) {%>
				<h3 class="tle text-center">ĐƠN ĐỀ NGHỊ<br>CẤP GIẤY PHÉP LIÊN VẬN VIỆT - CAMPUCHIA</h3>
			<%}%>
			
			<div class="text-center col-xs-12 MB20">
				<label class="textlabel col-xs-2 col-xs-offset-3" style="width: 11.1%;">Kính gửi<span class="red">*</span>:</label>
				<div class="col-xs-5">
					<select class="form-control" id="coQuanGui" name="coQuanGui">
						<option value="">-- Chọn cơ quan cấp phép --</option>
							<%
							for (DmDataItem item : lstCoQuanCapPhep) {
								%>
								<option value="<%=item.getCode()%>" <%=(((donLienVan.getCoQuanGui() == null) ? "" : donLienVan.getCoQuanGui().trim())).equals(item.getCode())? "selected='selected'" : ""%>><%=item.getName()%></option>
								<%
								}
							%>
					</select>
				</div>
			</div>
				<label class="pull-left w250">1. Tên doanh nghiệp, HTX</label><p class="textU">: <%=doanhNghiep.getTenDoanhNghiep().toUpperCase()%></p>
				
				<label class="pull-left w250">2. Địa chỉ</label>
				<div class="col-sm-8 PA0">
					<label class="pull-left" style="height: 30px;vertical-align: middle;">: </label>
					<input type="text" id="diaChiDoanhNghiep" name="diaChiDoanhNghiep" style="width: 90%" value="<%=doanhNghiep.getDiaChi()%>" class="form-control">
				</div>
				<div class="clear"></div>
				<div style="height: 5px">&nbsp</div>
				
				<label class="pull-left w250">3. Số điện thoại</label><p><span class="pull-left">: <%=doanhNghiep.getDienThoai()%></span>
				<span class="pull-left w250 text-center"><b>Số Fax</b></span>: <%=doanhNghiep.getFax()%></p>
				<label class="pull-left">4. Giấy phép kinh doanh vận tải bằng xe ô tô (Giấy chứng nhận đăng ký kinh doanh)</label>
				<div class="clear"></div>
				<div style="padding:0 15px">
					<label class="pull-left w265">Số </label><p>: <%=(Validator.isNull(doanhNghiep.getSoDangKyKinhDoanh()) ? "" : doanhNghiep.getSoDangKyKinhDoanh())%></p>
					<label class="pull-left w265">Ngày cấp </label><p>: <%=DateUtils.dateToString("dd/MM/yyyy", doanhNghiep.getNgayCapDkKd())%></p>
				</div>
				
				<label class="pull-left">5. Đề nghị cấp Tổng cục Đường bộ Việt Nam (hoặc Sở Giao thông vận tải địa phương) cấp Giấy phép liên vận Việt - Lào cho phương tiện vận tải sau <span class="red">*</span>:</label>
				
				<div class="clear"></div>
				
				<!-- noi dung chuc nang Popup -->
				<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/table_phuong_tien_dang_ki.jsp"%>
				
				<label class="pull-left" style="margin-top:15px">6. Mục đích chuyến đi <span class="red">*</span>:</label>
				<div class="clear"></div>
				<div class="row M0">
					<div class="col-xs-12">
					<%
					String[] lstAlPhaBe = StringUtils.getAlPhaBe(lstMucDichChuyenDi.size());
					List<String> lstResultMucDichChuyenDi = Validator.isNotNull(donLienVan.getMucDichChuyenDi()) ? donLienVan.getMucDichChuyenDi() : new ArrayList<String>();
					_log.info(Validator.isNotNull(donLienVan) ? donLienVan.getMucDichChuyenDi() : new ArrayList<String>());
					
					for (int i = 0; i < lstMucDichChuyenDi.size(); i++) {%>
						<div class="radio divRadio">
							<label>
								<input type="radio" name="mucDichChuyenDi" id="mucDichChuyenDi<%=lstMucDichChuyenDi.get(i).getCode()%>"
								<%=CommonUtils.checkedCodeItemFromList(lstResultMucDichChuyenDi, lstMucDichChuyenDi.get(i).getCode())%>
								value="<%=lstMucDichChuyenDi.get(i).getCode()%>"><%=lstAlPhaBe[i]%>. <%=lstMucDichChuyenDi.get(i).getName()%>
							</label>
						</div>
					<%}%>
					</div>
				</div>
				<%
					if(Constants.TTHC_VIET_LAO_LIENVAN_PHUONGTIEN_PHITHUONGMAI_MAT_MAT.equals(thuTucHanhChinh.getMaThuTuc().trim())){
					%>
						<div class="clear"></div>
						<label class="pull-left" style="margin-top:15px">7. Lý do mất <span class="red">*</span>:</label>
						<div class="clear"></div>
						<div class="row row-eq-height col-xs-12">
							<textarea id="lyDoMat" name="lyDoMat" rows="5" style="width: 100%; margin-left: 1.4%;"><%=(Validator.isNull(donLienVan.getLyDoMat())? "" : donLienVan.getLyDoMat())%></textarea>
						</div>
				<%
					}
				%>
				
				<!-- ----------BUTTON---------------- -->
			<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/_button.jspf"%>
		</div>
	</div>
</div>
</aui:form>



<script type="text/javascript">
	

    function summitForm(url) {
        var radio_check_val = "";

        var coQuanGui = document.getElementById("coQuanGui").value;

        if (coQuanGui == "") {
			alert("Chọn cơ quan cấp phép");
			return false;
		}

        if (tblPhuongTienDangKi.getSizeLstPhuongTien() === 0) {
        	alert("Phương tiện vận tải chưa có!");
			return false;
        }
		
        
        for (var i = 0; i < document.getElementsByName('mucDichChuyenDi').length; i++) {
            if (document.getElementsByName('mucDichChuyenDi')[i].checked) {
                radio_check_val = document.getElementsByName('mucDichChuyenDi')[i].value;
            }

        }
        if (radio_check_val === "")
        {
            alert("Chọn mục đích chuyến đi");
			return false;
        }

        


        if ($('#lyDoMat').val() === "")
        {
            alert("Lý do mất không được để trống");
			return false;
        }
        
        document.getElementById('<portlet:namespace />myForm').action = url;
		document.getElementById('<portlet:namespace />myForm').submit();
    }
		
	
	function summitForm2(url) {
		document.getElementById('<portlet:namespace />myForm').action = url;
		document.getElementById('<portlet:namespace />myForm').submit();
	}

	
</script>
