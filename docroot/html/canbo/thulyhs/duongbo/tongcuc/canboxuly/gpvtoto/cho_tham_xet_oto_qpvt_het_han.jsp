<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai"%>
<%@page import="vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo"%>
<%@page import="vn.dtt.duongbo.term.noidia.QLVTNoiDiaTerm"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
QlvtThongTinHoSo ettThongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(Long.valueOf("0"+phieuXuLyId));
QlvtThongTinXuLy ettThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+ettThongTinHoSo.getId()));
QlvtXuLyGpkdvtBangOto gpkdvtBangOto = QlvtXuLyGpkdvtBangOtoLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+ettThongTinXuLy.getId()));

List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> lstLoaiHinhHD = QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceUtil.findBygpkdvtBangOtoId(Integer.valueOf("0"+gpkdvtBangOto.getId()));
List<DmDataItem> lstCoQuanCapPhep = DanhMucConstants.getCoQuanCapPhep(idThuTucHanhChinh+"");
List<DmDataItem> lstldkd = DanhMucConstants.getLoaiHinhKDVT();
%>
<div id="info">
	<aui:input type="hidden" name="inforId1" value="<%=ettThongTinHoSo.getId() %>"></aui:input>
	<aui:input type="hidden" name="inforId2" value="<%=ettThongTinXuLy.getId() %>"></aui:input>
	<aui:input type="hidden" name="inforId3" value="<%=gpkdvtBangOto.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTNoiDiaTerm.THONG_TIN_HO_SO_ID %>" value="<%=ettThongTinHoSo.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTNoiDiaTerm.THONG_TIN_XU_LY_ID %>" value="<%=ettThongTinXuLy.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTNoiDiaTerm.ID %>" value="<%=gpkdvtBangOto.getId() %>"></aui:input>
</div>
<aui:row>
	<aui:column columnWidth="50">
		<aui:row>
			<aui:col width="100">
				<aui:field-wrapper cssClass="textCenter" label="Thông tin của lần cấp phép trước" inlineField="<%=true %>" inlineLabel="true">
				</aui:field-wrapper>
				<aui:field-wrapper cssClass="fix30" label="1. Tên đơn vị:" inlineField="<%=true %>" inlineLabel="true">
					<%=ettThongTinHoSo.getTenDn()%>
				</aui:field-wrapper>
				<aui:field-wrapper cssClass="fix30" label="2. Địa chỉ:" inlineField="<%=true %>" inlineLabel="true">
					<%=ettThongTinHoSo.getDiaChiDn()%>
				</aui:field-wrapper>
				<aui:field-wrapper cssClass="fix30" label="3. Số GPKD vận tải:" inlineField="<%=true %>" inlineLabel="true">
				</aui:field-wrapper>
				<aui:field-wrapper cssClass="fix30" label="4. Cấp lần thứ" inlineField="<%=true %>" inlineLabel="true">
					<%=HtmlUtil.escape(ettThongTinHoSo.getLanCapGiayDangKyKinhDoanh()+"")%>
				</aui:field-wrapper>
				<aui:row>
					<aui:col width="50">
						<aui:field-wrapper label="5. Cấp lần đầu:" inlineField="<%=true %>" inlineLabel="true">
						Số: <%=ettThongTinHoSo.getSoDkkd()%>
						</aui:field-wrapper>
					</aui:col>
					<aui:col width="50">
						<aui:field-wrapper cssClass="fix30" label="Ngày cấp:" inlineField="<%=true %>" inlineLabel="true">
							<%=ettThongTinHoSo.getNgayCapDkkd()%>
						</aui:field-wrapper>
					</aui:col>
				</aui:row>
				<aui:field-wrapper  cssClass="pad15" label="<span class='hidden'>5. </span>Nơi cấp:" inlineField="<%=true %>" inlineLabel="true">
					<%=HtmlUtil.escape(ettThongTinHoSo.getCoQuanCapDkkd()) %>
				</aui:field-wrapper>
				<aui:field-wrapper  cssClass="pad15" label="<span class='hidden'>5. </span>Giá trị đến ngày:" inlineField="<%=true %>" inlineLabel="true">
					<%=HtmlUtil.escape(Validator.isNotNull(ettThongTinHoSo.getNgayHetHanDkkd())?ettThongTinHoSo.getNgayHetHanDkkd().toString():StringPool.BLANK) %>
				</aui:field-wrapper>
				<aui:field-wrapper label="6. Loại hình kinh doanh:" inlineField="<%=true %>" inlineLabel="true">
					<%
							for(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai loaiHinh :lstLoaiHinhHD){
						%>
							<%=HtmlUtil.escape(DmDataItemLocalServiceUtil.findByGroupIdAndCode(Constants.GROUP_LOAI_HINH_HOAT_DONG, loaiHinh.getMaLoaiHinhHoatDong()).getName()) %>
						<%} %>
				</aui:field-wrapper>
				<aui:field-wrapper label="7. Phương án kinh doanh vận tải:" inlineField="<%=true %>" inlineLabel="true">
				</aui:field-wrapper>
				<aui:field-wrapper  cssClass="pad15" label="<span class='hidden'>7. </span>Màu sơn:" inlineField="<%=true %>" inlineLabel="true">
					<%=HtmlUtil.escape(ettThongTinHoSo.getNguoiLienHeTraKetQua()) %>
				</aui:field-wrapper>
				<aui:field-wrapper  cssClass="pad15" label="<span class='hidden'>7. </span>Số lượng phương tiện:" inlineField="<%=true %>" inlineLabel="true">
				</aui:field-wrapper>
				<aui:field-wrapper  cssClass="pad15" label="<span class='hidden'>7. </span>Thiết bị giám sát hành trình:" inlineField="<%=true %>" inlineLabel="true">
				</aui:field-wrapper>
			</aui:col>
		</aui:row>
	</aui:column>
	<aui:column columnWidth="50" cssClass="borderLeft">
		<aui:row>
			<aui:col width="100">
				<aui:field-wrapper cssClass="textCenter" label="Thông tin đề nghị thay đổi" inlineField="<%=true %>" inlineLabel="true">
				</aui:field-wrapper>
				<aui:field-wrapper cssClass="pad15 top6" label="" inlineField="<%=true %>" inlineLabel="true">
					<aui:input placeholder="Tên doanh nghiệp, HTX" name="<%=QLVTNoiDiaTerm.TEN_DN %>" value="<%=ettThongTinHoSo.getTenDn() %>" label=""></aui:input>
				</aui:field-wrapper>
				<aui:field-wrapper cssClass="pad15 top6" label="" inlineField="<%=true %>" inlineLabel="true">
					<aui:input placeholder="Địa chỉ" name="<%=QLVTNoiDiaTerm.DIA_CHI_DN%>" value="<%=ettThongTinHoSo.getDiaChiDn()%>" label=""></aui:input>
				</aui:field-wrapper>
				<aui:field-wrapper cssClass="pad15 fix30" label="" inlineField="<%=true %>" inlineLabel="true">
					<aui:input placeholder="Số chứng nhận ĐKKD" label="" name="<%=QLVTNoiDiaTerm.SO_GPKD_VAN_TAI_BAN_OTO%>" value="<%=ettThongTinHoSo.getSoDkkd() %>"></aui:input>
				</aui:field-wrapper>
				<aui:field-wrapper cssClass="pad15 fix30" label="" inlineField="<%=true %>" inlineLabel="true">
					<aui:input placeholder="Giá trị đến ngày" label="" name="<%=QLVTNoiDiaTerm.LAN_CAP_GPKDVT_NOI_KIA%>" value="<%=HtmlUtil.escape(ettThongTinHoSo.getLanCapGiayDangKyKinhDoanh()+\"\")%>"></aui:input>
				</aui:field-wrapper>
				<aui:row cssClass="padTop9">
					<aui:col width="50">
						<aui:field-wrapper cssClass="pad15" label="5. Cấp lần đầu:" inlineField="<%=true %>" inlineLabel="true">
						Số: <%=ettThongTinHoSo.getSoDkkd()%>
						</aui:field-wrapper>
					</aui:col>
					<aui:col width="50">
						<aui:field-wrapper cssClass="fix30 padTop9" label="Ngày cấp:" inlineField="<%=true %>" inlineLabel="true">
							<%=ettThongTinHoSo.getNgayCapDkkd()%>
						</aui:field-wrapper>
					</aui:col>
				</aui:row>
				<aui:field-wrapper  cssClass="pad15 padTop9" label="" inlineField="<%=true %>" inlineLabel="true">
					<aui:select cssClass="fixWidth" name="sel1" label="">
						<%
							for (DmDataItem item : lstCoQuanCapPhep) {
						%>
						<aui:option value="<%=item.getCode()%>" ><%=item.getName()%></aui:option>
						<%
							}
						%>
					</aui:select>
				</aui:field-wrapper>
				<aui:field-wrapper  cssClass="pad15 " label="" inlineField="<%=true %>" inlineLabel="true">
					<aui:input placeholder="Giá trị đến ngày" label="" name="<%=QLVTNoiDiaTerm.NGAY_HET_HAN_GPKD_VAN_TAI_BANG_OTO %>"></aui:input>
				</aui:field-wrapper>
				<aui:field-wrapper  cssClass="pad15" label="" inlineField="<%=true %>" inlineLabel="true">
					<aui:select cssClass="fixWidth" name="<%=QLVTNoiDiaTerm.LOAI_HINH_KINH_DOANH %>" label="">
						<%
							for(DmDataItem ett: lstldkd){
						%>
							<aui:option value="<%=ett.getCode() %>"><%=HtmlUtil.escape(ett.getName()) %></aui:option>
						<%} %>
					</aui:select>
				</aui:field-wrapper>
				<aui:field-wrapper cssClass="pad15 padTop9" label="7. Phương án kinh doanh vận tải:" inlineField="<%=true %>" inlineLabel="true">
				</aui:field-wrapper>
				<aui:field-wrapper  cssClass="pad15 padTop9" label="" inlineField="<%=true %>" inlineLabel="true">
					<aui:input placeholder="Màu sơn" label="" name="<%=QLVTNoiDiaTerm.NGUOI_DAI_DIEN_DN %>"></aui:input>
				</aui:field-wrapper>
				<aui:field-wrapper  cssClass="pad15" label="" inlineField="<%=true %>" inlineLabel="true">
					<aui:input placeholder="Số lượng phương tiện" name=""></aui:input>
				</aui:field-wrapper>
				<aui:field-wrapper  cssClass="pad15" label="" inlineField="<%=true %>" inlineLabel="true">
					<aui:select cssClass="fixWidth" name="<%=QLVTNoiDiaTerm.THIET_BI_GIAM_SAT_HANH_TRINH %>" label="">
						<%
							for (Map.Entry<String,String> entry : FormUtil.cbxThietBiGiamSatHanhTrinh().entrySet()) {
						%>
							<option value="<%=entry.getKey()%>"><%=HtmlUtil.escape(entry.getValue())%></option>
						<% }%>
					</aui:select>	
				</aui:field-wrapper>
			</aui:col>
		</aui:row>
	</aui:column>
</aui:row>
<aui:row>
	<aui:col width="100" >
		<aui:field-wrapper label="8. Lý do xin cấp lại:" inlineField="<%=true %>" inlineLabel="true">
					<aui:input name="<%=QLVTNoiDiaTerm.LY_DO_KHONG_DAT%>" value="<%=ettThongTinHoSo.getLyDoCapLai() %>" label="">
						<aui:validator  name="required "  errorMessage="Lý do xin cấp lại không được để trống"/>
					</aui:input>
				</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:input type="radio" name="<%=QLVTNoiDiaTerm.KET_QUA_XU_LY %>" value="1" label="Đạt" inlineField="<%=true %>" onClick="showHiddenDiv1(1);"></aui:input>
		<aui:input type="radio" name="<%=QLVTNoiDiaTerm.KET_QUA_XU_LY %>" value="0" label="Không đạt" inlineField="<%=true %>" onClick="showHiddenDiv1(0);"></aui:input>
	</aui:col>
</aui:row>
<div id="divDat0" style="display: none;margin-left: 20%;">
	
</div>
<div id="divKoDat0"style="display: none;margin-left: 20%;">
	<aui:input type="textarea" name="" cssClass="myTextArea"></aui:input>
</div>

<style>
.borderLeft{
	border-left: 1px solid lightgray;
}
 .fix30 .control-label{
	width: 40% !important;
}
.pad15{
	padding-left: 15px !important;
}
.top6{
	margin-top: -6px !important;
}
.aui .hidden {
    display: initial !important;
}
.textCenter{
text-align: center;
}
.control-group.control-group-inline.field-wrapper {
    padding-top: 18px !important;
}
.padTop9{
margin-top: -9px !important;
}
</style>

<aui:script use="aui-io-request,aui-node">
	AUI().use(
			  'aui-datepicker',
			  function(A) {
			    new A.DatePicker(
			      {
			    	trigger: '#<portlet:namespace /><%=QLVTNoiDiaTerm.NGAY_HET_HAN_GPKD_VAN_TAI_BANG_OTO%>',
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
	AUI().one('#<portlet:namespace /><%=QLVTNoiDiaTerm.NGAY_HET_HAN_GPKD_VAN_TAI_BANG_OTO %>').val('<%=Validator.isNotNull(gpkdvtBangOto.getNgayHetHanGpkdVanTaiBangOto())?sdf.format(gpkdvtBangOto.getNgayHetHanGpkdVanTaiBangOto()):StringPool.BLANK %>');
</aui:script>