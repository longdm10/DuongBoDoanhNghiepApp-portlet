
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra"%>
<%@page import="vn.dtt.form.util.FormUtil"%>
<%@page
	import="vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanLocalServiceUtil"%>
<%@page
	import="vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyPhuHieuLocalServiceUtil"%>
<%@page
	import="vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyBienHieuLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan"%>
<%@page import="vn.dtt.duongbo.term.lienvan.QlvtLienVanTerm"%>
<%@page import="vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe"%>
<%@page import="vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto"%>
<%@page
	import="vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu"%>
<%@page
	import="vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu"%>
<%@page import="vn.dtt.duongbo.maudon.model.CongVanTuChoiCapPHBH"%>
<%@page import="vn.dtt.duongbo.report.ReportBusinessUtils"%>
<%@page import="java.util.ArrayList"%>
<%@page
	import="vn.dtt.duongbo.maudon.model.CongVanYCBSHoSoDeNghiCapPHBH"%>
<%@page import="vn.dtt.duongbo.maudon.xml.MauDonFactory"%>
<%@page import="java.util.List"%>
<%@page
	import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="org.apache.commons.lang.Validate"%>
<%@page
	import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo"%>
<%@page
	import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.dtt.duongbo.report.ReportUtils"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String hoSoThuTucIdReport = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
	String thuTucHanhChinhIdReport = ParamUtil.getString(request, Constants.ID_THU_TUC_HANH_CHINH);
	TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(Long.parseLong(thuTucHanhChinhIdReport));
	String tenHoSoThuTuc ="";
	tenHoSoThuTuc = thuTucHanhChinh.getTenThuTuc();
	//List<TthcThanhPhanHoSo> lisThanhPhanHoSos = TthcThanhPhanHoSoLocalServiceUtil.findByThuTucHanhChinhId(Long.parseLong(thuTucHanhChinhIdReport));
	TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(Long.parseLong(hoSoThuTucIdReport));
	String tenDoanhNghiep ="";
	if(hoSoThuTuc!=null && hoSoThuTuc.getTenChuHoSo()!=null){
		tenDoanhNghiep = hoSoThuTuc.getTenChuHoSo();
	}
%>
<div class="row" style="margin: 30px 0">
	<p class="col-xs-4 col-xs-offset-4 text-center">
		<b>CỘNG HÒA XÃ HỘI CHỦ NGHĨA VIỆT NAM<br /> Độc lập - Tự do - Hạnh phúc
		</b>
	</p>
</div>
<h4 class="tle text-center"> CÔNG VĂN YÊU CẦU BỔ SUNG HỒ SƠ ĐỀ NGHỊ CẤP<br><%=tenHoSoThuTuc%></h4>

<div class="col-sm-12">
	<div class="text-center col-xs-12 MB20">
		<label class="textlabel col-xs-1 col-xs-offset-3">Kính gửi</label>
		<div class="col-xs-5" style="margin-top: 9px;">
			<%=tenDoanhNghiep%>
		</div>
	</div>
	<p>Căn cứ Nghị định 86/2014/NĐ-CP ban hành ngày 10/9/2014 quy định
		về kinh doanh và điều kiện kinh doanh vận tải bằng ô tô.</p>
	<p>Căn cứ Thông tư 63/2014/TT-BGTVT ban hành ngày 07/11/2014 quy
		định về tổ chức, quản lý vận tải đường bộ bằng xe ô tô và dịch vụ hỗ
		trợ vận tải đường bộ</p>
	<p>
		Phòng QLVT, PT&NL của Sở GTVT Hà Nội nhận thấy hồ sơ đề nghị cấp giấy
		phép kinh doanh của công ty
		<%=tenDoanhNghiep%>
		cần bổ sung những giấy tờ sau
	</p>
	<%
		for (QlvtNoiDungThamTra entry : FormUtil.checkList(thuTucHanhChinh.getMaThuTuc())) {
	%>
	<span class="cssCheckList css<%=entry.getCoYKien()%>"><%=entry.getTienTo()%>
		<%=entry.getMucKiemTra()%> 
		<%
	 		if (entry.getCoYKien() > 0) {
	 	%> 
	 	<input class="cssCheckListCbx css<%=entry.getCoYKien()%>"
			type="checkbox" id="<%=entry.getId()%>dat"
			name="<%=entry.getId()%>dat" value=<%=entry.getId()%>
			onchange="toggle_visibility('<%=entry.getId()%>dat1');" /> 
		<%
 			}
 		%> 
 	</span> <br />

	<div id="<%=entry.getId()%>dat1" style="display: none;">
		<aui:input type="text" placeholder="Lý do" id="<%=entry.getId() +\"lydo\"%>" name="<%=entry.getId() +\"lydo\"%>" label=" " />
	</div>
	<%
		}
	%>

</div>
