
<%@page import="vn.dtt.duongbo.utils.format.DateUtils"%>
<%@page import="vn.dtt.duongbo.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.duongbo.business.MotCuaBusiness"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepImpl"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucImpl"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
long lHoSoThuTucIdInFor = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(lHoSoThuTucIdInFor);
DnDoanhNghiep dnDoanhNghiep = DnDoanhNghiepLocalServiceUtil.fetchDnDoanhNghiep(tthcHoSoThuTuc.getNguoiLamThuTucId());
String phieuXuLyIdInFor = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY);
%>
<p class="col-xs-12">
		<span class="col-xs-2" for="sel1">Tên thủ tục:</span> <b
			class="col-xs-10"> <%
 	if (Validator.isNotNull(tthcHoSoThuTuc)) {
 		long thuTucHanhChinhID = 0;
 		thuTucHanhChinhID = tthcHoSoThuTuc.getThuTucHanhChinhId();
 		TthcThuTucHanhChinh thuTucHanhChinh = null;
 		thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(thuTucHanhChinhID);
 %>
			<%=Validator.isNotNull(thuTucHanhChinh)?thuTucHanhChinh.getTenThuTuc():StringPool.BLANK%>
 <%
 	}
 %>
		</b>
	</p>
	<p class="col-xs-12">
		<span class="col-xs-2" for="sel1">Mã số biên nhận:</span> <b
			class="col-xs-2"><%=(tthcHoSoThuTuc.getMaBienNhan() == null) ? ""
					: tthcHoSoThuTuc.getMaBienNhan()%></b>
		<span class="col-xs-2" for="sel1">Tên doanh nghiệp:</span> <b
			class="col-xs-6"><%=dnDoanhNghiep.getTenDoanhNghiep()%></b>
	</p>
	<p class="col-xs-12">
		<span class="col-xs-2" for="sel1">Ngày nộp:</span> <b class="col-xs-2"><%=(tthcHoSoThuTuc.getNgayGuiHoSo() == null) ? ""
					: DateUtils.dateToString("dd/MM/yyyy HH:mm",
							tthcHoSoThuTuc.getNgayGuiHoSo())%></b>
		<span class="col-xs-2" for="sel1">Địa chỉ:</span> <b class="col-xs-6"><%=(dnDoanhNghiep.getDiaChi() == null) ? "" : dnDoanhNghiep
					.getDiaChi()%></b>
	</p>
	<p class="col-xs-12">
		<span class="col-xs-2" for="sel1">Trạng thái:</span> <b
			class="red col-xs-2"> <span style="font-weight: normal;"><%=MotCuaBusiness.getTrangThaiByPhieuXuLy(ConvertUtil.convertToLong(phieuXuLyIdInFor)) %></span>
		</b>
	</p>