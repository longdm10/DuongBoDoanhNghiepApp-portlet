<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanTuyenLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen"%>
<%@page import="vn.dtt.duongbo.utils.CheckCssUtils"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@page import="vn.dtt.form.util.FormUtil"%>
<%@page import="vn.dtt.duongbo.business.DanhMucConstants"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienImpl"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien"%>
<%@page import="vn.dtt.duongbo.term.lienvan.QlvtLienVanTerm"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucImpl"%>
<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanLocalServiceUtil"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	
	String col1 = ParamUtil.getString(request, "col1");
	String col2 = ParamUtil.getString(request, "col2");
	String tq2 = ParamUtil.getString(request, "tq2");
	

	String xuLyPhuHieuId = ParamUtil.getString(request, "xuLyPhuHieuId");
	QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien = new QlvtXuLyGpLienVanPhuongTienImpl();
	qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.fetchQlvtXuLyGpLienVanPhuongTien(Long.valueOf("0"+col1));
	
	List<DmDataItem> listLoaiHinhKDVT = DanhMucConstants.getallLoaiHinhHoatDong();
	List<DmDataItem> listCuaKhauVietLao = DanhMucConstants.getCuaKhauVietLao();
	List<DmDataItem> listTuyenVietCam = DanhMucConstants.getTuyenVietCam();
	List<DmDataItem> listBenXeVietCam = DanhMucConstants.getBenXeCam();
	
	
	List<DmDataItem> listTinhThanh = DmDataItemLocalServiceUtil.findTinhThanh();
	
	
	
	
%>
<aui:input type="hidden" name="<%=QlvtLienVanTerm.ID_PHUONG_TIEN %>" value="<%=qlvtXuLyGpLienVanPhuongTien.getId() %>"></aui:input>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Biển số xe:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QlvtLienVanTerm.BIEN_SO %>" value="<%=qlvtXuLyGpLienVanPhuongTien.getBienSo() %>" label="">

			</aui:input>
			<%=HtmlUtil.escape("") %>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<!-- Nhãn hiệu trọng tải start -->
<aui:row>
	<aui:col width="50">
		<aui:field-wrapper label="Nhãn hiệu phương tiện:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QlvtLienVanTerm.NHAN_HIEU %>" value="<%=qlvtXuLyGpLienVanPhuongTien.getNhanHieu() %>" label="">

			</aui:input>
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="50">
		<aui:field-wrapper label="Năm sản xuất:" inlineField="<%=true %>" >
			<aui:select type="text" name="<%=QlvtLienVanTerm.NAM_SX %>" label=" ">
				<%for (String year : FormUtil.cbxYear()) {
				%>
				<option value="<%=year%>"><%=HtmlUtil.escape(year)%></option>
				<% }%>
			</aui:select>
		</aui:field-wrapper>
	</aui:col>
</aui:row>


<!-- Trọng tải màu sơn start -->
<aui:row>
	<aui:col width="50">
		<aui:field-wrapper label="Trọng tải:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QlvtLienVanTerm.TRONG_TAI %>" value="<%=qlvtXuLyGpLienVanPhuongTien.getTrongTai()%>" label="">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="50">
		<aui:field-wrapper label="Màu sơn:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QlvtLienVanTerm.MAU_SON %>" value="<%=qlvtXuLyGpLienVanPhuongTien.getMauSon()%>" label="">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:field-wrapper label="Số khung:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QlvtLienVanTerm.SO_KHUNG %>" value="<%=qlvtXuLyGpLienVanPhuongTien.getSoKhung()%>" label="">
			
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="50">
		<aui:field-wrapper label="Số máy:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QlvtLienVanTerm.SO_MAY %>" value="<%=qlvtXuLyGpLienVanPhuongTien.getSoMay()%>" label="">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Loại hình kinh doanh:" inlineField="<%=true %>" >
			<select id="<%=QlvtLienVanTerm.HINH_THUC_HOAT_DONG %>" name="<%=QlvtLienVanTerm.HINH_THUC_HOAT_DONG %>" class="form-control">
				<%for (DmDataItem item : listLoaiHinhKDVT) {
					%>
					<option value="<%=item.getCode()%>"><%=item.getName()%></option>
					<%
				}%>
				</select>
		</aui:field-wrapper>
	</aui:col>
	
	
</aui:row>

<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Cửa khẩu xuất - nhập:" inlineField="<%=true %>" >
			<select id="<%=QlvtLienVanTerm.CUA_KHAU %>" name="<%=QlvtLienVanTerm.CUA_KHAU %>" class="form-control">
				<%for (DmDataItem item : listCuaKhauVietLao) {
					%>
					<option value="<%=item.getCode()%>" ><%=item.getName()%></option>
					<%
				}%>
			</select>
		</aui:field-wrapper>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="30">
		<aui:field-wrapper label="Tuyến (*):" inlineField="<%=true %>" >
			<select id="<%=QlvtLienVanTerm.TUYEN_TU %>" name="<%=QlvtLienVanTerm.TUYEN_TU %>" class="form-control">
				<%for (DmDataItem item : listTuyenVietCam) {
					%>
					<option value="<%=item.getCode()%>" ><%=item.getName()%></option>
					<%
				}%>
			</select>
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="30">
		<aui:field-wrapper label="đi (*):" inlineField="<%=true %>" >
			<select id="<%=QlvtLienVanTerm.TUYEN_DI %>" name="<%=QlvtLienVanTerm.TUYEN_DI %>" class="form-control">
				<%for (DmDataItem item : listTuyenVietCam) {
					%>
					<option value="<%=item.getCode()%>" ><%=item.getName()%></option>
					<%
				}%>
			</select>
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="30">
		<aui:field-wrapper label="Cự ly vận chuyển (*):" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QlvtLienVanTerm.CU_LY %>" value="" label="">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:field-wrapper label="Bến đi (*):" inlineField="<%=true %>" >
			<select id="<%=QlvtLienVanTerm.MA_BEN_DI %>" name="<%=QlvtLienVanTerm.MA_BEN_DI %>" class="form-control">
				<%for (DmDataItem item : listBenXeVietCam) {
					%>
					<option value="<%=item.getCode()%>" ><%=item.getName()%></option>
					<%
				}%>
			</select>
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="50">
		<aui:field-wrapper label="Bến đến (*):" inlineField="<%=true %>" >
			<select id="<%=QlvtLienVanTerm.MA_BEN_DEN %>" name="<%=QlvtLienVanTerm.MA_BEN_DEN %>" class="form-control">
				<%for (DmDataItem item : listBenXeVietCam) {
					%>
					<option value="<%=item.getCode()%>" ><%=item.getName()%></option>
					<%
				}%>
			</select>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="50">
		<aui:field-wrapper label="thuộc tỉnh (Việt Nam):" inlineField="<%=true %>" >
			<select id="<%=QlvtLienVanTerm.MA_TINH_DI %>" name="<%=QlvtLienVanTerm.MA_TINH_DI %>" class="form-control">
				<%for (DmDataItem item : listTinhThanh) {
					%>
					<option value="<%=item.getCode()%>" ><%=item.getName()%></option>
					<%
				}%>
			</select>
		</aui:field-wrapper>
	</aui:col>
	
	<aui:col width="50">
		<aui:field-wrapper label="thuộc tỉnh:" inlineField="<%=true %>" >
			<select id="<%=QlvtLienVanTerm.MA_TINH_DEN %>" name="<%=QlvtLienVanTerm.MA_TINH_DEN %>" class="form-control">
				<%for (DmDataItem item : listTinhThanh) {
					%>
					<option value="<%=item.getCode()%>" ><%=item.getName()%></option>
					<%
				}%>
			</select>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Hành trình tuyến đường:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QlvtLienVanTerm.HANH_TRINH %>" value="" label="">
			
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Đã được Tổng cục Đường bộ Việt Nam chấp thuận khai thác tuyến tại công văn" inlineField="<%=true %>" >
		</aui:field-wrapper>
	</aui:col>
</aui:row>


<aui:row>
	<aui:col width="50">
		<aui:field-wrapper label="Số:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QlvtLienVanTerm.SO_GPVT %>" value="" label="">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
	
	<aui:col width="50">
		<aui:field-wrapper label="Ngày cấp:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QlvtLienVanTerm.NGAY_CAP_GPVT %>" value="" label="">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>


<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Xe thuê/ sở hữu:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QlvtLienVanTerm.HINH_THUC_SO_HUU %>" label="">
			<%
				for (Map.Entry<String,String> entry : FormUtil.cbxXeThueXeSoHuu().entrySet()) {
			%>
				<option value="<%=entry.getKey()%>"><%=HtmlUtil.escape(entry.getValue())%></option>
			<% }%>
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Doanh nghiệp cho thuê:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QlvtLienVanTerm.DOANH_NGHIEP_CHO_THUE %>" value="<%=qlvtXuLyGpLienVanPhuongTien.getDoanhNghiepChoThue()%>" label="">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:field-wrapper label="Thời gian thuê:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QlvtLienVanTerm.THOI_HAN_CHO_THUE %>" value="<%=qlvtXuLyGpLienVanPhuongTien.getThoiHanChoThue()%>" label="">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
	
	<aui:col width="50">
		<aui:field-wrapper label="Hợp đồng sau cùng" inlineField="<%=true %>" >
			<aui:select type="text" name="<%=QlvtLienVanTerm.HOP_DONG_SAU_CUNG %>" label="">
			<%
				for (Map.Entry<String,String> entry : FormUtil.cbxHopDongSauCung().entrySet()) {
			%>
				<option value="<%=entry.getKey()%>"><%=HtmlUtil.escape(entry.getValue())%></option>
			<% }%>
			</aui:select>
		</aui:field-wrapper>
	</aui:col>
</aui:row>




<aui:row>
	<aui:col width="100">
		<aui:input type="radio" name="<%=QlvtLienVanTerm.KET_QUA_XU_LY %>" value="1" label="Đạt" inlineField="<%=true %>" onClick="showHiddenDiv(1);"></aui:input>
		<aui:input type="radio" name="<%=QlvtLienVanTerm.KET_QUA_XU_LY %>" value="0" label="Không đạt" inlineField="<%=true %>" onClick="showHiddenDiv(0);"></aui:input>
	</aui:col>
</aui:row>



<div id="divDat" style="display: none;margin-left: 20%;">
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Số phù hiệu liên vận Việt - Cam: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%= QlvtLienVanTerm.SO_PHU_HIEU %>" value="<%=qlvtXuLyGpLienVanPhuongTien.getSoPhuHieu()%>" label="">
					
				</aui:input>
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Có giá trị đến:" inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.NGAY_HET_HAN_GPVT %>" value="" label="">
					
				</aui:input>
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Phí cấp giấy phép liên vận Việt - Cam" inlineField="<%=true %>" >
				<aui:input type="text" name="" value="" label="">
				</aui:input>
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
</div>

<div id="divKoDat"style="display: none;margin-left: 20%;">
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Lý do" inlineField="<%=true %>" >
				<aui:input label=" " type="textarea" name="<%=QlvtLienVanTerm.LY_DO_KHONG_DAT %>" value="<%=qlvtXuLyGpLienVanPhuongTien.getLyDoKhongDat()%>" cssClass="myTextArea">
				</aui:input>
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
</div>
<aui:button-row cssClass="myButtonTop">
	<aui:button cssClass="btn btn-primary" value="Lưu" onClick="submitItemForm();"></aui:button>
</aui:button-row>
<portlet:renderURL var="dv1Page" windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
	<portlet:param name="mvcPath" value="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvc/cho_tham_xet_viet_cam_gplv_cap_moi_dv2.jsp"/>
	<liferay-util:param name="xuLyPhuHieuId" value="<%=xuLyPhuHieuId %>" />
	<liferay-util:param name="col2" value="<%=col2 %>" />
	<liferay-util:param name="tq2" value="thuongmai" />
	
</portlet:renderURL>
<portlet:actionURL var="addItemURL" name="lienVan_vietCam_luuThongTinThamXet" />
<aui:script use="aui-io-request,aui-node">
var A = AUI();

	Liferay.provide(window,'submitItemForm',
		function() {
		var A = AUI();
		var errorBlock=A.one('#group-success-block');
		A.io.request('<%=addItemURL %>',{
			method: 'POST',
			form: { id: '<portlet:namespace />fm' },
			on: {
					success: function(){
					var json = JSON.parse(this.get('responseData'));
  					errorBlock.set("innerHTML","");
  					loadMyPageDv2('<%=dv1Page %>'+'&<portlet:namespace/>xuLyPhuHieuId='+A.one("#<portlet:namespace/>inforId3").val());
  					var errorMessageNode = A.Node.create(json.bodyText);
					errorMessageNode.appendTo(errorBlock);
					
					}
			}
		});
	});

	AUI().use(
			  'aui-datepicker',
			  function(A) {
			    new A.DatePicker(
			      {
			    	trigger: '#<portlet:namespace /><%=QlvtLienVanTerm.THOI_HAN_CHO_THUE %>',
			        mask: '%m/%d/%Y',
			        popover: {
			          zIndex: 1
			        },
			        on: {
			          selectionChange: function(event) {
			            console.log(event.newSelection)
			          }
			        }
			      }
			    );
			  }
			);

	AUI().use(
			  'aui-datepicker',
			  function(A) {
			    new A.DatePicker(
			      {
			    	trigger: '#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_HET_HAN_GPVT %>',
			        mask: '%m/%d/%Y',
			        popover: {
			          zIndex: 1
			        },
			        on: {
			          selectionChange: function(event) {
			            console.log(event.newSelection)
			          }
			        }
			      }
			    );
			  }
			);

</aui:script>
<aui:script use="aui-io-request,aui-node">
	AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.THOI_HAN_CHO_THUE %>').val('<%=Validator.isNotNull(qlvtXuLyGpLienVanPhuongTien.getThoiHanChoThue())?sdf.format(qlvtXuLyGpLienVanPhuongTien.getThoiHanChoThue()):StringPool.BLANK %>');
	AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_HET_HAN_GPVT%>').val('<%=Validator.isNotNull(qlvtXuLyGpLienVanPhuongTien.getThoiHanChoThue())?sdf.format(qlvtXuLyGpLienVanPhuongTien.getThoiHanChoThue()):StringPool.BLANK %>');
</aui:script>