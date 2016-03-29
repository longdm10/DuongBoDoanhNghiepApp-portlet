<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="vn.dtt.duongbo.business.DanhMucConstants"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.maudon.xml.XmlUtils"%>
<%@page import="vn.dtt.duongbo.maudon.xml.MauDonFactory"%>
<%@page import="vn.dtt.duongbo.maudon.model.DonXinCapGPLVTMVietCam"%>
<%@page import="vn.dtt.duongbo.business.nghiepvu.NghiepVuUtils"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.dao.common.model.impl.DmDataItemImpl"%>
<%@page import="vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl"%>
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
<%@page import=" vn.dtt.duongbo.dao.common.service.persistence.DmDataItemFinderImpl"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%!private static Log _log = LogFactoryUtil.getLog(DoanhNghiepAction.class);%>

<%
	_log.info("/html/hsdoanhnghiep/thongtinhoso/vietnamcampuchia/cap_giay_phep_lienvan_phuongtien_kinhdoanh_vantai_viet_cam.jsp");
	
	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	long bieuMauHoSoId = 0;
	String loaiTthc = ParamUtil.getString(request, Constants.LOAI_THU_TUC_HANH_CHINH);
	
	long idNoiDungHoSo = ParamUtil.getLong(request, Constants.ID_NOI_DUNG_HO_SO);
	
	String noiDungXmml = ParamUtil.getString(request, "noiDungXmml");
	
	TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(thuTucHanhChinhId);
	TthcThanhPhanHoSo thanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.fetchTthcThanhPhanHoSo(thanhPhanHoSoId);
	TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
	
	DnDoanhNghiep doanhNghiep = DoanhNghiepUtils.getDoanhNghiepByUserId(PortalUtil.getUserId(request));
	
	_log.info("/html/hsdoanhnghiep/thongtinhoso/vietnamcampuchia/cap_giay_phep_lienvan_phuongtien_kinhdoanh_vantai_viet_cam.jsp");
	
	TthcBieuMauHoSo bieuMauHoSo = NghiepVuUtils.getBieuMauHoSoByThanhPhanHoSoId(thanhPhanHoSoId);
	if (Validator.isNotNull(bieuMauHoSo)) {
		bieuMauHoSoId = bieuMauHoSo.getId();
	}
	_log.info("------/maBieuMauHoSo---------" + bieuMauHoSo.getMaBieuMau());
	_log.info("------/thuTucHanhChinh-------" + thuTucHanhChinh.getMaThuTuc());
	
	DonXinCapGPLVTMVietCam donLienVan = null;
	
	TthcNoidungHoSo noidungHoSo = null;
	
	if(idNoiDungHoSo > 0){
		noidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(idNoiDungHoSo);
	}
	
	if (Validator.isNotNull(noidungHoSo) && Validator.isNotNull(noidungHoSo.getNoiDungXml())) {
		
		_log.info("-----noidungHoSoID:" + noidungHoSo.getId());
		_log.info("-----noidungHoSoXML--" + noidungHoSo.getNoiDungXml());
	
		List<Object> lstObj = MauDonFactory.converXMLMessagesContentToObject(noidungHoSo.getNoiDungXml());
		if (lstObj != null && lstObj.size() > 0) {
			donLienVan = (DonXinCapGPLVTMVietCam) lstObj.get(0);
		}
	}
	
	if (donLienVan == null) { donLienVan = MauDonFactory.converXmlToObject(noiDungXmml, new DonXinCapGPLVTMVietCam()); }
	if (donLienVan == null) { donLienVan = new DonXinCapGPLVTMVietCam();}

	PortletURL backUrl = renderResponse.createRenderURL();
	backUrl.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamcampuchia/thanh_phan_ho_so.jsp");
	backUrl.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	backUrl.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	backUrl.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
	
	PortletURL xemTruocNoiDung = renderResponse.createActionURL();
	xemTruocNoiDung.setParameter(ActionRequest.ACTION_NAME, "xemTruocNoiDung");
	xemTruocNoiDung.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
	xemTruocNoiDung.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
	xemTruocNoiDung.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
	xemTruocNoiDung.setParameter(Constants.ID_BIEU_MAU_HO_SO, String.valueOf(bieuMauHoSoId));
	xemTruocNoiDung.setParameter(Constants.ID_DOANH_NGHIEP, doanhNghiep.getId() + "");
	xemTruocNoiDung.setParameter(Constants.LOAI_THU_TUC_HANH_CHINH, loaiTthc);
	xemTruocNoiDung.setParameter(Constants.PATH_MAUDON_VIEW_PDF, "/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamcampuchia/cap_giay_phep_lienvan_phuongtien_kinhdoanh_vantai_viet_cam_view.jsp");
	
	List<DmDataItem> lstTinhThanh = DanhMucConstants.getTinhThanh();
	List<DmDataItem> lstCoQuanCapPhep = DanhMucConstants.getCoQuanCapPhep(thuTucHanhChinhId+"");
	List<DmDataItem> lstBxVN = DanhMucConstants.getBenXeVN();
	List<DmDataItem> lstTinhTPLao = DanhMucConstants.getTinhTPLao();
	List<DmDataItem> lstBxeLao = DanhMucConstants.getBenXeLao();
	List<DmDataItem> lstBxeCam = DanhMucConstants.getBenXeCam();
	List<DmDataItem> lstTinhTPCam = DanhMucConstants.getTinhTPCam();

	
%>


<aui:form action="<%=xemTruocNoiDung.toString()%>" name="myForm" id="myForm" method="POST">
	<!------------------------------------- /thong_bao_dieu_chinh_tan_suat_tuyen_van_tai_hanh_khach_tuyen_co_dinh.jsp ---------------------------------------->
	<h4 class="PL15 BGT BOB font14 col-xs-12"><%=bieuMauHoSo.getTenBieuMau()%></h4>
	<div class="P10 col-xs-12">
		<div class="BGT noidung">
			<div class="box1000">
				<div class="col-sm-12">
					<p class="pull-left text-center">
						<b><%=doanhNghiep.getTenDoanhNghiep().toUpperCase()%><br> Đề nghị cấp giấy phép
						</b><br> ----------
					</p>
					<p class="pull-right text-center">
						<b>CỘNG HÒA XÃ HỘI CHỦ NGHĨA VIỆT NAM<br> Độc lập - Tự do - Hạnh phúc
						</b><br> --------------------
					</p>
				</div>

				<h3 class="tle text-center">
					ĐƠN ĐỀ NGHỊ<br>CẤP GIẤY PHÉP LIÊN VẬN VIỆT - CAMPUCHIA<br>CHO PHƯƠNG TIỆN KINH DOANH VẬN TẢI
				</h3>
				
				<div class="text-center col-xs-12 MB20">
					<label class="textlabel col-xs-2 col-xs-offset-3" style="width: 9.1%;">Kính gửi:</label>
					<div class="col-xs-5">
						<select class="form-control" id="coQuanGui" name="coQuanGui">
							<option value="">-- Chọn cơ quan cấp phép --</option>
							<%for (DmDataItem item : lstCoQuanCapPhep) {
								%>
								<option value="<%=item.getCode()%>" <%=(((donLienVan.getCoQuanGui() == null) ? "" : donLienVan.getCoQuanGui().trim())).equals(item.getCode())? "selected='selected'" : ""%>><%=item.getName()%></option>
								<%
								}
							%>
						</select>
					</div>
				</div>
					<label class="pull-left w250">1. Tên doanh nghiệp, HTX</label>
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
					<label class="pull-left">4. Giấy phép kinh doanh vận tải bằng xe ô tô (Giấy chứng nhận đăng ký kinh doanh)</label>
					<div class="clear"></div>
					<div style="padding: 0 15px">
						<label class="pull-left w265">Số <span class="red">*</span></label>
						<p> : <%=(Validator.isNull(doanhNghiep.getSoDangKyKinhDoanh()) ? "" : doanhNghiep.getSoDangKyKinhDoanh())%></p>
						<label class="pull-left w265">Ngày cấp <span class="red">*</span></label>
						<p> : <%=DateUtils.dateToString("dd/MM/yyyy", doanhNghiep.getNgayCapDkKd())%></p>
					</div>
					
					<label class="pull-left">5. Đề nghị cấp Tổng cục Đường bộ Việt Nam (hoặc Sở Giao thông vận tải địa phương) cấp Giấy phép liên vận Việt -
						Campuchia cho phương tiện vận tải sau <span class="red">*</span>:
					</label>

					<div class="clear"></div>

					<!-- noi dung chuc nang Popup -->
					<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamcampuchia/table_phuong_tien_dang_ki.jsp"%>

					<div style="height: 10px;"></div>
					<div class="col-xs-6 form-group">
						<label for="bienKiemSoat">Đối với phương tiện thay thế: Ghi rõ phương tiện Biển kiểm soát<span class="red">*</span>:
						</label>
					</div>

					<div class="col-xs-3 form-group">
						<input type="text" class="form-control" id="bienKiemSoat" name="bienKiemSoat" value="<%=(donLienVan.getBienKiemSoat() != null) ? donLienVan.getBienKiemSoat():"" %>" >
					</div>
					<div class="col-xs-6 form-group">
						<label for="bienKiemSoatThayThe">thay thế phương tiện Biển kiểm soát</label>
					</div>

					<div class="col-xs-3 form-group">
						<input type="text" class="form-control" id="bienKiemSoatThayThe" name="bienKiemSoatThayThe" value="<%=(donLienVan.getBienKiemSoatThayThe() != null) ? donLienVan.getBienKiemSoatThayThe():"" %>" >
					</div>
					<div class="col-xs-3 form-group"></div>
					<div class="col-xs-12 form-group" style="padding-left: 0px;">
						<label class="pull-left" style="margin-top: 15px">6. Loại hình kinh doanh vận tải <span class="red">*</span>:
						</label>
					</div>
					<div class="clear"></div>
					<div class="row M0">

						<div class="col-xs-12" id="">
							<%
							String node_1 = "TN,VC";
							List<DmDataItem> lstLoaiHinhDoanhVanTai = DmDataItemLocalServiceUtil.findByGroupCodeAndNode1(DanhMucConstants.DM_LOAI_HINH_HOAT_DONG, node_1);
							String[] lstAlPhaBe = StringUtils.getAlPhaBe(lstLoaiHinhDoanhVanTai.size());
							List<String> lstKqLoaihinhkd = Validator.isNotNull(donLienVan) ? donLienVan.getLoaiHinhKDVanTai() : null;
							for (int i = 0; i < lstLoaiHinhDoanhVanTai.size(); i++) {
								%>
								<div class="radio divRadio">
									<label> <input type="checkbox" id="loaiHinhKinhDoanhVanTai_<%=lstLoaiHinhDoanhVanTai.get(i).getCode()%>" name="loaiHinhKinhDoanhVanTai"
										<%=CommonUtils.checkedCodeItemFromList(lstKqLoaihinhkd, lstLoaiHinhDoanhVanTai.get(i).getCode())%>
										value="<%=lstLoaiHinhDoanhVanTai.get(i).getCode()%>">&nbsp<%=lstAlPhaBe[i]%>. <%=lstLoaiHinhDoanhVanTai.get(i).getName()%>
									</label>
								</div>
								<%
							}
							%>
						</div>



						<label class="col-xs-12 MB20">Ghi chú: Đối với phương tiện vận chuyển hành khách theo tuyến cố định bổ sung thêm các thông tin sau:</label>
						<div>
							<div class="col-xs-3 form-group">
								<label for="tuyenDiCuaKhau">Tuyến đi <span class="red">*</span>: </label>
								<select class="form-control" id="tuyenDiCuaKhau" name="tuyenDiCuaKhau">
									<option value="">-- Lựa chọn Cửa khẩu --</option>
									<%for (DmDataItem item : lstCuaKhau) {
										%>
										<option value="<%=item.getCode()%>" <%=(((donLienVan.getTuyenDi() == null) ? "" : donLienVan.getTuyenDi().trim())).equals(item.getCode())? "selected='selected'" : ""%>><%=item.getName()%></option>
										<%
									}%>
								</select>
							</div>
							
							<div class="col-xs-3 form-group">
								<label class="invisible">Nothing</label> <select class="form-control" id="tuyenDenCuaKhau" name="tuyenDenCuaKhau">
								<option value="-1">-- Lựa chọn Tỉnh --</option>
								<%
									for (DmDataItem item : lstTinhThanh) {
								%>
								<option value="<%=item.getCode()%>" <%=(((donLienVan.getTuyenDen() == null) ? "" : donLienVan.getTuyenDen().trim())).equals(item.getCode())? "selected='selected'" : ""%>><%=item.getName()%></option>
								<%
									}
								%>
							</select>
							</div>
							<div class="col-xs-3 form-group">
								<label class="MB10 invisible">Nothing</label> <br> <label for="sel1">và ngược lại</label>
							</div>
							<div class="col-xs-3 form-group">
								<label for="culyVanChuyen">Cự ly vận chuyển <span class="red">*</span>:
								</label>
								<div class="clear"></div>
								<p class="col-xs-6 PAl0">
									<input type="text" class="form-control" id="culyVanChuyen" name="culyVanChuyen" value="<%=(donLienVan.getCuLy() != null) ? donLienVan.getCuLy():""%>">
								</p>
								<label class="textlabel">km</label>
							</div>
						</div>
						<div>
							<div class="col-xs-3 form-group">
								<label for="selBenXeDi">Bến đi</label> <br> <label for="selBenXeDi">Bến xe <span class="red">*</span>:
								</label> <select class="form-control" id="selBenXeDi" name="selBenXeDi">
								<option value="">-- Lựa chọn Bến đi --</option>
								<%
									for (DmDataItem item : lstBxVN) {
									%>
									<option value="<%=item.getCode()%>" <%=(((donLienVan.getBenXedi() == null) ? "" : donLienVan.getBenXedi().trim())).equals(item.getCode())? "selected='selected'" : ""%>><%=item.getName()%></option>
									<%
									}
								%>
							</select>
							</div>
							<div class="col-xs-3 form-group">
								<label class="invisible">Nothing</label> <br> <label for="selBenXeDiThuocTinh">thuộc tỉnh (Việt Nam) <span class="red">*</span>:
								</label> <select class="form-control" id="selBenXeDiThuocTinh" name="selBenXeDiThuocTinh">
								<option value="">-- Lựa chọn Tỉnh --</option>
								<%
									for (DmDataItem item : lstTinhThanh) {
								%>
								<option value="<%=item.getCode()%>" <%=(((donLienVan.getTinhBenDi() == null) ? "" : donLienVan.getTinhBenDi().trim())).equals(item.getCode())? "selected='selected'" : ""%>><%=item.getName()%></option>
								<%
									}
								%>
								</select>
							</div>
							<div class="col-xs-3 form-group">
								<label for="selBenXeDen">Bến đến</label> <br> <label for="selBenXeDen">Bến đến <span class="red">*</span>:
								</label> <select class="form-control" id="selBenXeDen" name="selBenXeDen">
									<option value="">-- Lựa chọn Bến đến --</option>
									<% 
										for (DmDataItem item : lstBxeCam) {
											%> 
											<option value="<%=item.getCode()%>" <%=(((donLienVan.getBenXeDen() == null) ? "" : donLienVan.getBenXeDen().trim())).equals(item.getCode())? "selected='selected'" : ""%>><%=item.getName()%></option>
									<%
										}
									%> 
								</select>
							</div>
							<div class="col-xs-3 form-group">
								<label class="invisible">Nothing</label> <br> <label for="selBenXeDenThuocTinh">thuộc tỉnh <span class="red">*</span>:
								</label> <select class="form-control" id="selBenXeDenThuocTinh" name="selBenXeDenThuocTinh">
									<option value="">-- Lựa chọn Tỉnh --</option>
									<% 
									for (DmDataItem item : lstTinhTPCam) {
										%> 
										<option value="<%=item.getCode()%>" <%=(((donLienVan.getTinhBenDen() == null) ? "" : donLienVan.getTinhBenDen().trim())).equals(item.getCode())? "selected='selected'" : ""%>><%=item.getName()%></option>
										<%
									}
									%> 
								</select>
							</div>
						</div>
						<div class="clear"></div>
						<label class="col-xs-12" for="hanhTrinhTuyenDuong">Hành trình tuyến đường <span class="red">*</span>: </label>
						<div class="clear"></div>
						<div class="row row-eq-height col-xs-12">
							<textarea id="hanhTrinhTuyenDuong" name="hanhTrinhTuyenDuong" rows="5" style="width: 100%; margin-left: 1.4%;"><%=donLienVan.getHanhTrinh()!=null?donLienVan.getHanhTrinh():"" %></textarea>
						</div>
						<label class="col-xs-12" style="margin-top: 15px">Đã được Tổng cục Đường bộ Việt Nam chấp thuận khai thác tuyến tại công văn</label>
						<div class="row M0">
							<div class="col-xs-12">
								<label class="col-xs-2 textlabel" for="soCapGiayPhep">Số <span class="red">*</span>:
								</label>
								<p class="col-xs-10">
									<input type="text" id="soCapGiayPhep" name="soCapGiayPhep" class="form-control" value="<%=donLienVan.getSoGPVanTai() != null ? donLienVan.getSoGPVanTai():"" %>" >
								</p>
							</div>
							<div class="col-xs-12">
								<label class="col-xs-2 textlabel" for="ngayCapGiayPhep" onclick="gtCalendar('ngayCapGiayPhep')">Ngày cấp <span class="red">*</span>:
								</label>
								<div class="col-xs-10">
									<div class="input-group">
										<input type="text" class="form-control" id="ngayCapGiayPhep" name="ngayCapGiayPhep" onclick="gtCalendar('ngayCapGiayPhep')" value="<%=donLienVan.getNgayCapGPVanTai() != null ? donLienVan.getNgayCapGPVanTai():"" %>"> <span
											class="input-group-addon" onclick="gtCalendar('ngayCapGiayPhep')"><i class="fa fa-calendar"></i></span>
									</div>
								</div>
							</div>
						</div>
						<%
						if(Constants.TTHC_VIET_CAM_LIENVAN_PHUONGTIEN_KINHDOANH_MAT_MAT.equals(thuTucHanhChinh.getMaThuTuc().trim())){
						%>
							<div class="clear"></div>
							<label class="col-xs-12" for="lyDoMat">Lý do mất <span class="red">*</span>:
							</label>
							<div class="clear"></div>
							<div class="row row-eq-height col-xs-12">
								<textarea id="lyDoMat" name="lyDoMat" rows="5" style="width: 100%; margin-left: 1.4%;"><%=(Validator.isNull(donLienVan.getLyDoMat())? "" : donLienVan.getLyDoMat())%></textarea>
							</div>
						<%
						}
						%>
					</div>
					
				<!-- ----------BUTTON---------------- -->
				<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamcampuchia/_button.jspf"%>
			</div>
		</div>
	</div>
</aui:form>

<portlet:renderURL var="selectTenThanhPho" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/hsdoanhnghiep/thongtinhoso/duongbo/_select_benxe.jsp"/>
</portlet:renderURL>


<script type="text/javascript">

AUI().ready(function(A) {
	//----viet nam----
	var thanhPhoFrom = $("select#selBenXeDiThuocTinh");
	thanhPhoFrom.on('change', function(){
		var codeThanhPhoDi = thanhPhoFrom.val();
		selectTinhThanhPho(codeThanhPhoDi, '<%=DanhMucConstants.DM_BEN_XE_VN%>', 'selBenXeDi');
	});

	//----cam bu chia----
	var thanhPhoTo = $("select#selBenXeDenThuocTinh");
	thanhPhoTo.on('change', function(){
		var codeThanhPhoDen = thanhPhoTo.val();
		selectTinhThanhPho(codeThanhPhoDen, '<%=DanhMucConstants.DM_BEN_XE_CPC%>', 'selBenXeDen');
	});

	var loaiHinhKd = $('#loaiHinhKinhDoanhVanTai_DM_LHHD_HKTCD');
	loaiHinhKd.on('click', function(){
		checkLoaiHinhKinhDoanh();
	});
});

var A = AUI();
AUI().ready(function(A){
	checkLoaiHinhKinhDoanh();
});

function checkLoaiHinhKinhDoanh() {
	if ($("#loaiHinhKinhDoanhVanTai_DM_LHHD_HKTCD").is(':checked')) {
		$("#tuyenDiCuaKhau").prop('disabled', false);
		$("#tuyenDenCuaKhau").prop('disabled', false);
		$("#culyVanChuyen").prop('disabled', false);
		
		$("#selBenXeDi").prop('disabled', false);
		$("#selBenXeDiThuocTinh").prop('disabled', false);
		
		$("#selBenXeDen").prop('disabled', false);
		$("#selBenXeDenThuocTinh").prop('disabled', false);
		
		$("#hanhTrinhTuyenDuong").prop('disabled', false);

		$("#soCapGiayPhep").prop('disabled', false);
		$("#ngayCapGiayPhep").prop('disabled', false);
		
	} else {
		$("#tuyenDiCuaKhau").prop('disabled', true);
		$("#tuyenDenCuaKhau").prop('disabled', true);
		$("#culyVanChuyen").prop('disabled', true);
		
		$("#selBenXeDi").prop('disabled', true);
		$("#selBenXeDiThuocTinh").prop('disabled', true);
		
		$("#selBenXeDen").prop('disabled', true);
		$("#selBenXeDenThuocTinh").prop('disabled', true);
		
		$("#hanhTrinhTuyenDuong").prop('disabled', true);

		$("#soCapGiayPhep").prop('disabled', true);
		$("#ngayCapGiayPhep").prop('disabled', true);
	}
}

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


	function summitForm(url) {
		 	var coQuanGui = document.getElementById("coQuanGui").value;
		 	var bienKiemSoat = document.getElementById("bienKiemSoat").value;
	       

	        if (coQuanGui == "") {
				alert("Chọn cơ quan cấp phép");
				return false;
			}
	        if (bienKiemSoat == "") {
				alert("Biển kiểm soát không được để trống");
				return false;
			}

			
	        var radio_check_val = "";
	        for (var i = 0; i < document.getElementsByName('loaiHinhKinhDoanhVanTai').length; i++) {
	            if (document.getElementsByName('loaiHinhKinhDoanhVanTai')[i].checked) {
	                radio_check_val = document.getElementsByName('loaiHinhKinhDoanhVanTai')[i].value;
	            }
	        }
	        if (radio_check_val === "")
	        {
	            alert("Chọn loại hình kinh doanh vận tải");
				return false;
	        }
	        
	        if (tblPhuongTienDangKi.getSizeLstPhuongTien() === 0) {
	        	alert("Phương tiện vận tải chưa có!");
				return false;
	        }
	       

	        if ($("#loaiHinhKinhDoanhVanTai_DM_LHHD_HKTCD").is(':checked')) {
				var tuyenDiCuaKhau = document.getElementById("tuyenDiCuaKhau").value;
		        if (tuyenDiCuaKhau == "") { alert("Chọn tuyến đi cửa khẩu"); return false; }

		        var tuyenDenCuaKhau = document.getElementById("tuyenDenCuaKhau").value;
		        if (tuyenDenCuaKhau == "") { alert("Chọn tỉnh tuyến đi cửa khẩu"); return false; }

		        var culyVanChuyen = document.getElementById("culyVanChuyen").value;
		        if (culyVanChuyen == "") { alert("Cự ly vận chuyển không được để trống"); return false; }
		        var checkculy = NaN(culyVanChuyen);
		        if(checkculy = true){
		        	alert("Cự ly phải là dạng số");
		        	return false;
		        }

		        var selBenXeDiThuocTinh = document.getElementById("selBenXeDiThuocTinh").value;
		        if (selBenXeDiThuocTinh == "") { alert("Chọn bến xe đi thuộc tỉnh"); return false; }

		        var selBenXeDi = document.getElementById("selBenXeDi").value;
		        if (selBenXeDi == "") { alert("Chọn bến xe đi"); return false; }

		        var selBenXeDenThuocTinh = document.getElementById("selBenXeDenThuocTinh").value;
		        if (selBenXeDenThuocTinh == "") { alert("Chọn bến xe đến thuộc tỉnh"); return false; }
		        
		        var selBenXeDen = document.getElementById("selBenXeDen").value;
		        if (selBenXeDen == "") { alert("Chọn bến xe đến"); return false; }

		        var hanhTrinhTuyenDuong = document.getElementById("hanhTrinhTuyenDuong").value;
		        if (hanhTrinhTuyenDuong == "") { alert("Hành trình tuyến đường không được để trống"); return false; }

		        var soCapGiayPhep = document.getElementById("soCapGiayPhep").value;
		        var ngayCapGiayPhep = document.getElementById("ngayCapGiayPhep").value;

		        if (soCapGiayPhep == "") {
					alert("Số giấy cấp phép không được để trống");
					return false;
				}
		        if (ngayCapGiayPhep == "") {
					alert("Ngày cấp phép không được để trống");
					return false;
				}
	        }

	    		document.getElementById('<portlet:namespace />myForm').action = url;
		document.getElementById('<portlet:namespace />myForm').submit();
	}


	function summitForm2(url) {
		document.getElementById('<portlet:namespace />myForm').action = url;
		document.getElementById('<portlet:namespace />myForm').submit();
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

