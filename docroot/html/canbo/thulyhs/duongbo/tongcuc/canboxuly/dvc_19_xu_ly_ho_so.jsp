<%@page import="vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalService"%>
<%@page import="vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy"%>
<%@page import="vn.dtt.duongbo.portlet.canbo.utils.VanThuBusinessUtils"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongbo.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
long idThuTucHanhChinh = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
long phieuXuLyId = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY);
long quyTrinhThuTucId = ParamUtil.getLong(request, Constants.ID_QUY_TRINH_THU_TUC);


PortletURL canBoDuyetThamXet = renderResponse.createActionURL();
canBoDuyetThamXet.setParameter(ActionRequest.ACTION_NAME, "luuYKien19DvcAction");
canBoDuyetThamXet.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
canBoDuyetThamXet.setParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
canBoDuyetThamXet.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
canBoDuyetThamXet.setParameter(Constants.ID_QUY_TRINH_THU_TUC, String.valueOf(quyTrinhThuTucId));
canBoDuyetThamXet.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(idThuTucHanhChinh));

MotCuaPhieuXuLy phieuXuLy = null;

if(Validator.isNotNull(phieuXuLyId)){
	phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.fetchMotCuaPhieuXuLy(Long.valueOf(phieuXuLyId));
}
String titleButon = "Xử lý";
if(phieuXuLy.getTrangThaiHienTaiId() == 92 
|| phieuXuLy.getTrangThaiHienTaiId() == 105
|| phieuXuLy.getTrangThaiHienTaiId() == 115
|| phieuXuLy.getTrangThaiHienTaiId() == 128
|| phieuXuLy.getTrangThaiHienTaiId() == 151){
	titleButon = "Thẩm xét hồ sơ";
}else if(phieuXuLy.getTrangThaiHienTaiId() == 93
	 || phieuXuLy.getTrangThaiHienTaiId() == 105){
	titleButon = "Lên lịch kiểm tra";
}else if(phieuXuLy.getTrangThaiHienTaiId() == 94){
	titleButon = "Gửi duyệt cấp phép";
}else if(phieuXuLy.getTrangThaiHienTaiId() == 95){
	titleButon = "Duyệt lịch kiểm tra";
}else if(phieuXuLy.getTrangThaiHienTaiId() == 96){
	titleButon = "Duyệt kết quả";
}else if(phieuXuLy.getTrangThaiHienTaiId() == 98){
	titleButon = "Phê duyệt cấp phép";
}else if(phieuXuLy.getTrangThaiHienTaiId() == 99){
	titleButon = "Trả kết quả về Doanh nghiệp";
}else if(phieuXuLy.getTrangThaiHienTaiId() == 100
		|| phieuXuLy.getTrangThaiHienTaiId() == 124
		|| phieuXuLy.getTrangThaiHienTaiId() == 135
		|| phieuXuLy.getTrangThaiHienTaiId() == 158){
	titleButon = "Xác nhận trả kết quả bản cứng";
}else if(phieuXuLy.getTrangThaiHienTaiId() == 106
		 || phieuXuLy.getTrangThaiHienTaiId() == 116
		 || phieuXuLy.getTrangThaiHienTaiId() == 129
		 || phieuXuLy.getTrangThaiHienTaiId() == 152){
	titleButon = "Gửi duyệt";
}else if(phieuXuLy.getTrangThaiHienTaiId() == 108){
	titleButon = "Duyệt";
}else if(phieuXuLy.getTrangThaiHienTaiId() == 109){
	titleButon = "Phê duyệt";
}else if(phieuXuLy.getTrangThaiHienTaiId() == 111){
	titleButon = "Trả kết quả về Doanh nghiệp";
}else if(phieuXuLy.getTrangThaiHienTaiId() == 113){
	titleButon = "Xác nhận trả bản cứng";
}else if(phieuXuLy.getTrangThaiHienTaiId() == 114){
	titleButon = "Chuyển chuyên viên xử lý";
}else if(phieuXuLy.getTrangThaiHienTaiId() == 118){
	titleButon = "Duyệt yêu cầu thành lập hội đồng thi";
}else if(phieuXuLy.getTrangThaiHienTaiId() == 119){
	titleButon = "Phê duyệt yêu cầu thành lập hội đồng thi";
}else if(phieuXuLy.getTrangThaiHienTaiId() == 120){
	titleButon = "Tạo thông báo thi";
}else if(phieuXuLy.getTrangThaiHienTaiId() == 121){
	titleButon = "Nhập kết quả đánh giá thi, kiểm tra";
}else if(phieuXuLy.getTrangThaiHienTaiId() == 122){
	titleButon = "Tải kết quả thẩm xét";
}else if(phieuXuLy.getTrangThaiHienTaiId() == 130
		|| phieuXuLy.getTrangThaiHienTaiId() == 153){
	titleButon = "Duyệt kết quả đánh giá";
}else if(phieuXuLy.getTrangThaiHienTaiId() == 131
		|| phieuXuLy.getTrangThaiHienTaiId() == 154){
	titleButon = "Phê duyệt kết quả đánh giá";
}else if(phieuXuLy.getTrangThaiHienTaiId() == 133
		|| phieuXuLy.getTrangThaiHienTaiId() == 156){
	titleButon = "Đạt yêu cầu";
}else if(phieuXuLy.getTrangThaiHienTaiId() == 134
		|| phieuXuLy.getTrangThaiHienTaiId() == 157){
	titleButon = "Trả kết quả thẩm xét";
}else if(phieuXuLy.getTrangThaiHienTaiId() == 137){
	titleButon = "Duyệt";
}else if(phieuXuLy.getTrangThaiHienTaiId() == 138){
	titleButon = "Phê duyệt";
}

%>

<div class="TabbedPanelsContent">
	<div style="margin-top: 20px;">
		<aui:form method="POST" action="<%= canBoDuyetThamXet %>" name="myForm" id="myForm">
			<aui:input type="hidden" name="dkDC" value=""/>
			
			<div class="col-xs-12 textlabel">Ý kiến: <span class="red">*</span></div>
			
			<div class="col-xs-12 form-group">
				<textarea class="form-control" class="myTTTare" id="<portlet:namespace/>yKien19Dvc" name="<portlet:namespace/>yKien19Dvc"></textarea>
			</div>
			
			<div class="col-xs-12 form-group">
				<p><i>Ghi chú: Những trường thông tin có dấu "<span class="red">*</span>" là bắt buộc</i></p>
			</div>
			
			<div class="col-xs-12 form-group" style="text-align: center;">
				<input class="button btn btn-primary btn-sm" type="button" value="<%=titleButon.toString() %>" onclick="chuyenXuLy('')"/>
				
				<%if(phieuXuLy.getTrangThaiHienTaiId() == 95){ 
				%>
					<input  class="button btn btn-primary btn-sm" type="button" value="Duyệt yêu cầu bổ sung tài liệu hồ sơ, gửi văn thư" onclick="chuyenXuLy('Duyet.yeu.cau.bo.sung')"/>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Duyệt yêu cầu bổ sung, trả trực tiếp cho Doanh nghiệp" onclick="chuyenXuLy('Duyet.YCBS.Tra.DN')"/>
				<%}else if(phieuXuLy.getTrangThaiHienTaiId() == 96){ 
				%>
					<input  class="button btn btn-primary btn-sm" type="button" value="Yêu cầu thẩm xét lại" onclick="chuyenXuLy('Tu.choi.duyet.giay.chung.nhan')"/>
				<%}else if(phieuXuLy.getTrangThaiHienTaiId() == 97){ 
				%>
					<input  class="button btn btn-primary btn-sm" type="button" value="Hủy hồ sơ" onclick="chuyenXuLy('Huy.ho.so')"/>
				<%}else if(phieuXuLy.getTrangThaiHienTaiId() == 98){ %>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Phê duyệt yêu cầu từ chối cấp giấy chứng nhận" onclick="chuyenXuLy('Phe.duyet.tu.choi.cap.giay.chung.nhan')"/>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Lãnh đạo yêu cầu thẩm xét lại" onclick="chuyenXuLy('Tu.choi.phe.duyet.cap.giay.chung.nhan')"/>
				<%}else if(phieuXuLy.getTrangThaiHienTaiId() == 99){ %>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Trả kết quả từ chối yêu cầu cấp giấy chứng nhận" onclick="chuyenXuLy('Tra.ket.qua.tu.choi')"/>
				<%}else if(phieuXuLy.getTrangThaiHienTaiId() == 108){ %>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Duyệt yêu cầu bổ sung hồ sơ" onclick="chuyenXuLy('Duyet.yeu.cau.bo.sung')"/>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Yêu cầu thẩm xét lại" onclick="chuyenXuLy('Khong.duyet.giay.chung.nhan')"/>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Duyệt yêu cầu bổ sung, trả trực tiếp cho Doanh nghiệp" onclick="chuyenXuLy('Duyet.YCBS.Tra.DN')"/>
				<%}else if(phieuXuLy.getTrangThaiHienTaiId() == 109){ %>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Yêu cầu thẩm xét lại" onclick="chuyenXuLy('Khong.phe.duyet.giay.chung.nhan')"/>
				<%}else if(phieuXuLy.getTrangThaiHienTaiId() == 115){ %>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Yêu cầu bổ sung hồ sơ" onclick="chuyenXuLy('Duyet.YCBS.Tra.DN')"/>
				<%}else if(phieuXuLy.getTrangThaiHienTaiId() == 118){ %>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Yêu cầu thẩm xét lại" onclick="chuyenXuLy('Khong.duyet.thanh.lap.hoi.dong')"/>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Duyệt thông báo từ chối cấp giấy chứng nhận" onclick="chuyenXuLy('Duyet.thong.bao.tu.choi')"/>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Duyệt yêu cầu bổ sung, trả trực tiếp cho Doanh nghiệp" onclick="chuyenXuLy('Duyet.YCBS.Tra.DN')"/>
				<%}else if(phieuXuLy.getTrangThaiHienTaiId() == 119){ %>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Lãnh đạo yêu cầu thẩm xét lại" onclick="chuyenXuLy('Khong.phe.duyet.thanh.lap.hoi.dong')"/>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Phê duyệt yêu cầu cấp giấy chứng nhận" onclick="chuyenXuLy('Phe.duyet.giay.chung.nhan')"/>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Không phê duyệt yêu cầu cấp giấy chứng nhận" onclick="chuyenXuLy('Khong.phe.duyet.giay.chung.nhan')"/>
				<%}else if(phieuXuLy.getTrangThaiHienTaiId() == 121){ %>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Tạo thông báo từ chối yêu cầu cấp giấy chứng nhận" onclick="chuyenXuLy('Tao.thong.bao.tu.choi')"/>
				<%}else if(phieuXuLy.getTrangThaiHienTaiId() == 122){ %>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Trả thông báo từ cối cấp giấy chứng nhận về Doanh nghiệp" onclick="chuyenXuLy('Tai.thong.bao.tu.choi')"/>
				<%}else if(phieuXuLy.getTrangThaiHienTaiId() == 129 || phieuXuLy.getTrangThaiHienTaiId() == 152){ %>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Lập giấy chứng nhận" onclick="chuyenXuLy('Lap.giay.chung.nhan')"/>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Yêu cầu bổ sung hồ sơ" onclick="chuyenXuLy('Yeu.cau.bo.sung')"/>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Lập lịch hẹn" onclick="chuyenXuLy('Lap.lich.hen')"/>
				<%}else if(phieuXuLy.getTrangThaiHienTaiId() == 130 || phieuXuLy.getTrangThaiHienTaiId() == 153){ %>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Duyệt yêu cầu từ chối cấp giấy chứng nhận" onclick="chuyenXuLy('Duyet.tu.choi')"/>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Duyệt lịch hẹn" onclick="chuyenXuLy('Hen.lai.lich')"/>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Duyệt yêu cầu bổ sung hồ sơ" onclick="chuyenXuLy('Duyet.bo.sung.ho.so')"/>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Yêu cầu thẩm xét lại" onclick="chuyenXuLy('Khong.duyet.giay.chung.nhan')"/>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Duyệt yêu cầu bổ sung, trả trực tiếp cho Doanh nghiệp" onclick="chuyenXuLy('Duyet.YCBS.Tra.DN')"/>
				<%}else if(phieuXuLy.getTrangThaiHienTaiId() == 131 || phieuXuLy.getTrangThaiHienTaiId() == 154){ %>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Yêu cầu thẩm xét lại" onclick="chuyenXuLy('Khong.duyet.cap.giay.chung.nhan')"/>
				<%}else if(phieuXuLy.getTrangThaiHienTaiId() == 133 || phieuXuLy.getTrangThaiHienTaiId() == 156){ %>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Không đạt yêu cầu" onclick="chuyenXuLy('Khong.dat')"/>
				<%}else if(phieuXuLy.getTrangThaiHienTaiId() == 137 || phieuXuLy.getTrangThaiHienTaiId() == 138){ %>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Yêu cầu thẩm xét lại" onclick="chuyenXuLy('Yeu.cau.tham.xet.lai')"/>
				<%}else if(phieuXuLy.getTrangThaiHienTaiId() == 92){ %>
					
					<input  class="button btn btn-primary btn-sm" type="button" value="Lưu kết quả thẩm xét" onclick="chuyenXuLy('Luu.ket.qua')"/>
				<%} %>
			</div>
		</aui:form>
	</div>
</div>
<style>
.myTTTare{
	width: 100% !important;
}

.btn {
	margin-bottom: 10px;
	margin-right: 5px;
}
</style>
<script type="text/javascript">
	function chuyenXuLy(dieuKienDichChuyen) {
		var yKien = document.getElementById('<portlet:namespace />yKien19Dvc').value;
		
		if(yKien == '') {
			alert('Nhập ý kiến xử lý !');
		} else {
			document.getElementById('<portlet:namespace />dkDC').value = dieuKienDichChuyen;
			document.getElementById('<portlet:namespace />myForm').submit();
		}
	}
</script>