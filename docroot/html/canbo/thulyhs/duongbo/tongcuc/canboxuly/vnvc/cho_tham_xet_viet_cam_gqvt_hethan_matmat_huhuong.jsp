<%@page import="vn.dtt.duongbo.term.quocte.QLVTQuocTeTerm"%>
<%@page import="vn.dtt.duongbo.dao.quocte.service.QlvtXuLyGpkdvtQuocTeLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
QlvtThongTinHoSo ettThongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(Long.valueOf("0"+phieuXuLyId));
QlvtThongTinXuLy ettThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+ettThongTinHoSo.getId()));
QlvtXuLyGpkdvtQuocTe gpkdvtQuocTe = QlvtXuLyGpkdvtQuocTeLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+ettThongTinXuLy.getId()));
%>
<div id="info">
	<aui:input type="hidden" name="inforId1" value="<%=ettThongTinHoSo.getId() %>"></aui:input>
	<aui:input type="hidden" name="inforId2" value="<%=ettThongTinXuLy.getId() %>"></aui:input>
	<aui:input type="hidden" name="inforId3" value="<%=gpkdvtQuocTe.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTQuocTeTerm.THONG_TIN_HO_SO_ID %>" value="<%=ettThongTinHoSo.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTQuocTeTerm.THONG_TIN_XU_LY_ID %>" value="<%=ettThongTinXuLy.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTQuocTeTerm.ID %>" value="<%=gpkdvtQuocTe.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTQuocTeTerm.MA_TUYEN %>" value=""></aui:input>
	<aui:input type="hidden" name="<%=QLVTQuocTeTerm.MA_TUYENS %>" value=""></aui:input>
</div>
<!-- canboxuly/cho_tham_xet_viet_lao_gqvt_hethan_matmat_huhuong.jsp -->

<div id="dv1">
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Thông tin của lần cấp phép trước" cssClass="textBold" inlineField="<%=true %>" >
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="1. Tên đơn vị: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.NGUOI_DAI_DIEN %>" value="<%=ettThongTinHoSo.getDaiDienDn() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="2. Địa chỉ: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.DIA_CHI_DN %>" value="<%=ettThongTinHoSo.getDaiDienDn() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="3. Số GPKD vận tải: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.SO_GIAP_PHEP_VAN_TAI %>" value="<%=ettThongTinHoSo.getSoGiayPhepKinhDoanhVanTaiNoiDia() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="4. Cấp lần thứ: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.LAN_CAP_GIAY_DANG_KY_KINH_DOANH %>" value="<%=ettThongTinHoSo.getLanCapGiayDangKyKinhDoanh() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="5. Cấp lần đầu:" cssClass="textBold" inlineField="<%=true %>" >
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Số " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.LAN_CAP_GIAY_DANG_KY_KINH_DOANH %>" value="<%=ettThongTinHoSo.getLanCapGiayDangKyKinhDoanh() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		
		<aui:col width="50">
			<aui:field-wrapper label="Ngày cấp:" inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.NGAY_CAP_GIAY_PHEP_KDVT_LAN_DAU %>" value="<%=ettThongTinHoSo.getNgayCapDkkd() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Nơi cấp: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.NOI_CAP_GIAY_PHEP_KDVT_LAN_DAU %>" value="" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		
		<aui:col width="50">
			<aui:field-wrapper label="Giá trị đến ngày:" inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.NGAY_GIA_HAN_GIAY_PHEP_KDVT_LAN_DAU %>" value="" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Loại hình kinh doanh: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.LOAI_HINH_KINH_DOANH %>" value="" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	
		<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="6. Người đại diện hợp pháp của Doanh nghiệp:" cssClass="textBold" inlineField="<%=true %>" >
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Họ và tên: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.NGUOI_DAI_DIEN %>" value="" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		
		<aui:col width="50">
			<aui:field-wrapper label="Số CMND (Hộ chiếu): " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.SO_CMND_OR_HO_CHIEU %>" value="" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Ngày cấp: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.NGAY_CAP_CMND %>" value="" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		
		<aui:col width="50">
			<aui:field-wrapper label="Nơi cấp: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.NOI_CAP_CMND %>" value="" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Thông tin đề nghị thay đổi" cssClass="textBold" inlineField="<%=true %>" >
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	
	
</div>




<div class="row MB5">
	<div class="col-xs-6 BOR">
		<h5 class="text-center"><b>Thông tin của lần cấp phép trước</b></h5>
		<div class="">
			<div class="row"><p class="linH30 pull-left col-xs-4">1. Tên đơn vị:</p><label class="col-xs-8">Công ty TNHH....</label></div>
			<div class="BOB1"></div>
			<div class="row"><p class="linH30 pull-left col-xs-4">2. Địa chỉ:</p><label class="col-xs-8">Hà Nội</label></div>
			<div class="BOB1"></div>
			<div class="row"><p class="linH30 pull-left col-xs-4">3. Số GPKD vận tải:</p><label class="col-xs-8">728738273</label></div>
			<div class="BOB1"></div>
			<div class="row"><p class="linH30 pull-left col-xs-4">4. Cấp lần thứ:</p><label class="col-xs-8">1</label></div>
			<div class="BOB1"></div>
			<div class="row">
				<p class="linH30 pull-left col-xs-4">5. Cấp lần đầu:</p>
				<p class="linH30 pull-left col-xs-1">Số:</p>
				<label class="col-xs-2">17282873</label>
				<p class="linH30 pull-left col-xs-2">Ngày cấp:</p>
				<label class="col-xs-3">17/2/8/2015</label>
			</div>
			<div class="BOB1"></div>
			<div class="row">
				<p class="linH30 pull-left col-xs-offset-4 col-xs-4">Nơi cấp:</p>
				<label class="col-xs-4">Sở GTVT Hà Nội</label>
			</div>
			<div class="col-xs-offset-4 BOB1"></div>
			<div class="row">
				<p class="linH30 pull-left col-xs-offset-4 col-xs-4">Giá trị đến ngày:</p>
				<label class="col-xs-4">19/5/2016</label>
			</div>
			<div class="col-xs-offset-4 BOB1"></div>
			<div class="row">
				<p class="linH30 pull-left col-xs-offset-4 col-xs-4">Loại hình kinh doanh:</p>
				<label class="col-xs-4">Xe tải</label>
			</div>
			<div class="col-xs-offset-4 BOB1"></div>
			<div class="row"><p class="linH30 col-xs-12">6. Người đại diện hợp pháp của Doanh nghiệp:</p></div>
			<div class="BOB1"></div>
			<div class="row">
				<p class="linH30 pull-left col-xs-offset-4 col-xs-4">Họ và tên:</p>
				<label class="col-xs-4">NGUYỄN VĂN A</label>
			</div>
			<div class="col-xs-offset-4 BOB1"></div>
			<div class="row">
				<p class="linH30 pull-left col-xs-offset-4 col-xs-4">Số CMND (Hộ chiếu):</p>
				<label class="col-xs-4">25698423</label>
			</div>
			<div class="col-xs-offset-4 BOB1"></div>
			<div class="row">
				<p class="linH30 pull-left col-xs-offset-4 col-xs-4">Ngày cấp:</p>
				<label class="col-xs-4">25/9/2010</label>
			</div>
			<div class="col-xs-offset-4 BOB1"></div>
			<div class="row">
				<p class="linH30 pull-left col-xs-offset-4 col-xs-4">Nơi cấp:</p>
				<label class="col-xs-4">Công an Hải Dương</label>
			</div>
			<div class="col-xs-offset-4 BOB1"></div>
		</div>
	</div>
	<div class="col-xs-6">
		<h5 class="text-center"><b>Thông tin đề nghị thay đổi</b></h5>
		<div class="PA5 row">
			<div class="MB5 col-xs-12"><input type="text" placeholder="Công ty TNHH...." class="form-control"></div>
		</div>
		<div class="PA5 row">
			<div class="MB5 col-xs-12"><input type="text" placeholder="Hải Dương" class="form-control"></div>
		</div>
		<div class="PA5 row">
			<div class="MB5 col-xs-12"><input type="text" placeholder="728738273" class="form-control"></div>
		</div>
		<div class="PA5 row">
			<div class="MB5 col-xs-12"><input type="text" placeholder="1" class="form-control"></div>
		</div>
		<div class="PA5 row">
			<label class="col-xs-2">Số:</label>
			<div class="col-xs-4"><input type="text" placeholder="125698" class="form-control"></div>
			<label class="col-xs-2">Ngày cấp:</label>
			<div class="col-xs-4">
				<div class="input-group">
					<input type="text" class="form-control">
					<span class="input-group-addon"><i class="fa fa-calendar"></i></span>
				</div>
			</div>
		</div>
		<div class="PA5 row">
			<div class="MB5 col-xs-12">
				<select id="sel1" class="form-control">
					<option>Sở GTVT Hà Nội</option>
					<option>2</option>
					<option>3</option>
					<option>4</option>
				</select>
			</div>
		</div>
		<div class="PA5 row">
			<div class="MB5 col-xs-4">
				<div class="input-group">
					<input type="text" class="form-control">
					<span class="input-group-addon"><i class="fa fa-calendar"></i></span>
				</div>
			</div>
		</div>
		<div class="PA5 row">
			<div class="MB5 col-xs-12">
				<select id="sel1" class="form-control">
					<option>Xe tải</option>
					<option>2</option>
					<option>3</option>
					<option>4</option>
				</select>
			</div>
		</div>
		<div class="PA5 H30 row"></div>
		<div class="PA5 row">
			<div class="MB5 col-xs-12"><input type="text" placeholder="NGUYỄN VĂN A" class="form-control"></div>
		</div>
		<div class="PA5 row">
			<div class="MB5 col-xs-12"><input type="text" placeholder="25698347" class="form-control"></div>
		</div>
		<div class="PA5 row">
			<div class="MB5 col-xs-4">
				<div class="input-group">
					<input type="text" class="form-control">
					<span class="input-group-addon"><i class="fa fa-calendar"></i></span>
				</div>
			</div>
		</div>
		<div class="PA5 row">
			<div class="MB5 col-xs-12"><input type="text" placeholder="Công an Hải Dương" class="form-control"></div>
		</div>
	</div>
</div>

<div class="row">
	<p class="linH30 pull-left col-xs-2">7. Lý do xin cấp lại:<span class="red">*</span></p>
	<div class="MB5 col-xs-10">
		<input type="text" placeholder="Thay đổi địa chỉ doanh nghiệp" class="form-control">
	</div>
</div>

<div class="row">
	<div class="col-xs-12"><label class="linH30">Đánh giá lý do đề nghị cấp lại GPKD vận tải của Doanh nghiệp:</label></div>
</div>
<div id="dv1">
<aui:row>
	<aui:col width="100">
		<aui:input type="radio" name="1" value="1" label="Đạt" inlineField="<%=true %>" onClick="showHiddenDiv(1);"></aui:input>
		<aui:input type="radio" name="1" value="0" label="Không đạt" inlineField="<%=true %>" onClick="showHiddenDiv(0);"></aui:input>
	</aui:col>
</aui:row>
<div id="divDat" style="display: none;margin-left: 20%;">
	
</div>
<div id="divKoDat"style="display: none;margin-left: 20%;">
	<aui:input type="textarea" name="" cssClass="myTextArea"></aui:input>
</div>

</div>
<div style="width: 350px; float: left;">
	<liferay-util:include page="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/cho_tham_xet_viet_lao_qpvt_cap_moi_dv2.jsp" servletContext="<%=this.getServletContext() %>">
		<liferay-util:param name="xuLyPhuHieuId" value="<%=String.valueOf(gpkdvtQuocTe.getId()) %>" />
	</liferay-util:include>
</div>
<div id="dv3">

</div>
