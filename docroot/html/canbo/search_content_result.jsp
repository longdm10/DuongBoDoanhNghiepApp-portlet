<%@page import="java.util.Date"%>
<%@page import="vn.dtt.duongbo.portlet.canbo.CanBoAction"%>
<%@page import="vn.dtt.duongbo.dao.motcua.service.MotCuaQuyTrinhThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTuc"%>
<%@page import="vn.dtt.duongbo.utils.config.DuongBoConfigurationManager"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo"%>
<%@page import="vn.dtt.duongbo.utils.DanhMucKey"%>
<%@page import="vn.dtt.duongbo.report.ReportUtils"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.duongbo.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy"%>
<%@page import="vn.dtt.duongbo.utils.CommonUtils"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongbo.utils.format.FormatData"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@ include file="/html/init.jsp"%>
<%
	String dkdkd = (String)session.getAttribute(Constants.MA_PHAN_NHOM_HO_SO);
	String liRoleSelected = StringPool.BLANK;
	for(long roleId: user.getRoleIds()){
		liRoleSelected += roleId+",";
	}
	liRoleSelected+=0;
	//-------------- Organization
	long organizationId = 0;
	// organizationId chinh la tochucquanly ma doanh nghiep nop len, 
	//hien tai ben phia daoanh nghiep dang fix cung(copy ben YT,nguyen nhan do yte chi co 1 don vi quan ly 13101)
// 	organizationId = DuongBoConfigurationManager.getLongProp("organization_id", 13101);
	if (themeDisplay.getUser().getOrganizations() != null
			&& themeDisplay.getUser().getOrganizations().size() > 0) {
		organizationId = themeDisplay.getUser().getOrganizations()
				.get(0).getOrganizationId();
	}

	long orgRootId = 1;// truy van trong bang working_unit theo orgId hien tai
	String jspPage = "";
	if (orgRootId == 1) {
		jspPage = "/html/canbo/thulyhs/duongbo/tongcuc/hoso_detail.jsp";
	}

	PortletURL portletUrl = renderResponse.createRenderURL();
	portletUrl.setParameter("mvcPath", "/html/canbo/view.jsp");
	SearchContainer searchContainer = new SearchContainer(
			renderRequest, null, null,
			SearchContainer.DEFAULT_CUR_PARAM, 6, portletUrl, null, "");
	System.out.println("idPhanNhomHoSoidPhanNhomHoSoidPhanNhomHoSo"+idPhanNhomHoSo);
	if(Validator.isNotNull(idPhanNhomHoSo) && !idPhanNhomHoSo.equals("danh_sach_dich_vu_cong")){
		idPhanNhomHoSo = TthcPhanNhomHoSoLocalServiceUtil.getByMaPhanNhom(idPhanNhomHoSo).getId()+"";
	}else{
		idPhanNhomHoSo = "12";
		dateNgayNopHoSoTuNgay = StringPool.BLANK;
		dateNgayNopHoSoDenNgay= StringPool.BLANK;
		namTxT = FormatData.getYear(new Date());
	}
	List<MotCuaPhieuXuLy> lCuaPhieuXuLies = new ArrayList<MotCuaPhieuXuLy>();
	
	List<String> lstPar = new ArrayList<String>();
	lstPar.add(ConvertUtil.parseLongToString(organizationId));
	lstPar.add(idPhanNhomHoSo);
	lstPar.add(codeLinhVucTthc);
	lstPar.add(thuTucHanhChinhId);
	lstPar.add(dateNgayNopHoSoTuNgay);//dateNgayNopHoSoTuNgay
	lstPar.add(dateNgayNopHoSoDenNgay);//dateNgayNopHoSoDenNgay
	lstPar.add(namTxT);
	lstPar.add(testSoHoSo);
	lstPar.add(textDoanhNghiep);
	lstPar.add(ConvertUtil.parseLongToString(themeDisplay.getUser().getUserId()));
	
	lCuaPhieuXuLies = MotCuaPhieuXuLyLocalServiceUtil.findMotCuaPhieuXuLy_NEW(lstPar, searchContainer.getStart(), searchContainer.getEnd());
	searchContainer.setResults(lCuaPhieuXuLies);
	searchContainer.setTotal(MotCuaPhieuXuLyLocalServiceUtil.countMotCuaPhieuXuLy_NEW(lstPar));
	
	LogFactoryUtil.getLog(CanBoAction.class).info("html/canbo/search_content_result.jsp--" + lCuaPhieuXuLies.size() +"=======totalSizetotalSize====" +searchContainer.getTotal() + "==========idPhanNhomHoSo==============="+ idPhanNhomHoSo);
	
%>
<div style="clear: both"></div>

<!-- Thành phần hồ sơ -->
<!-- html/canbo/search_content_result.jsp -->
<div class="col-xs-12">

	<table class="table table-striped table-bordered table-hover">
		<tr>
			<th>STT</th>
			<th>Mã số hồ sơ</th>
			<th>Nhóm TTHC</th>
			<th>Tên TTHC</th>
			<th>Tên tổ chức/cá nhân</th>
			<th>Ngày nộp</th>
			<th>Ngày hẹn trả</th>
			<th width="70px">Thao tác</th>
		</tr>
		<%
			int index = 1;
			TthcHoSoThuTuc tthcHoSoThuTuc = null;
			TthcThuTucHanhChinh tthcThuTucHanhChinh = null;
			DmDataItem loaiThuTuc = null;
			DmDataItem ketQua = null;
			String ketQuaXuLy = "";
			for (MotCuaPhieuXuLy motCuaPhieuXuLy : lCuaPhieuXuLies) {
				
				tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil
						.getTthcHoSoThuTuc(motCuaPhieuXuLy.getHoSoThuTucId());
				tthcThuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil
						.fetchTthcThuTucHanhChinh(tthcHoSoThuTuc
								.getThuTucHanhChinhId());
				if (tthcThuTucHanhChinh != null) {
					loaiThuTuc = null;//DmDataItemLocalServiceUtil.findByDataGroupIdAndCode(Long.parseLong(DanhMucKey.DM_LINH_VUC_TTHC), tthcThuTucHanhChinh.getLinhVucThuTuc());
				}
				PortletURL viewHoSoUrl = renderResponse.createRenderURL();
				viewHoSoUrl.setParameter("jspPage", jspPage);
				viewHoSoUrl.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(motCuaPhieuXuLy.getHoSoThuTucId()));
				viewHoSoUrl.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TPHS);
				viewHoSoUrl.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(tthcHoSoThuTuc.getThuTucHanhChinhId()));
				viewHoSoUrl.setParameter(Constants.MA_THU_TUC_HANH_CHINH, tthcThuTucHanhChinh.getMaThuTuc());
				viewHoSoUrl.setParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(motCuaPhieuXuLy.getId()));
				viewHoSoUrl.setParameter(Constants.ID_QUY_TRINH_THU_TUC, StringUtil.valueOf(motCuaPhieuXuLy .getQuyTrinhThuTucId()));
		%>
		<tr>
			<td><%=(index++) + searchContainer.getStart()%></td>
			<td style="text-align: left; padding: 10px;"><%=Validator.isNotNull(tthcHoSoThuTuc)?tthcHoSoThuTuc.getMaSoHoSo():StringPool.BLANK %></td>
			<td class="sp"><%=Validator.isNotNull(MotCuaQuyTrinhThuTucLocalServiceUtil.fetchMotCuaQuyTrinhThuTuc(motCuaPhieuXuLy.getQuyTrinhThuTucId()))?MotCuaQuyTrinhThuTucLocalServiceUtil.fetchMotCuaQuyTrinhThuTuc(motCuaPhieuXuLy.getQuyTrinhThuTucId()).getTenQuyTrinh():StringPool.BLANK%></td>
			<td>
				<%
					TthcThuTucHanhChinh ettTthc = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(tthcHoSoThuTuc.getThuTucHanhChinhId());
				%>
				<%=ettTthc.getTenThuTuc() %>
			</td>
			<td><%=Validator.isNotNull(tthcHoSoThuTuc) ? tthcHoSoThuTuc
						.getTenChuHoSo() : StringPool.BLANK%></td>
			<td><%=FormatData.parseDateToTringDDMMYYY(tthcHoSoThuTuc.getNgayGuiHoSo()) %></td>
			<td><%=FormatData.parseDateToTringDDMMYYY(tthcHoSoThuTuc.getNgayHenTra()) %></td>

			<td><a href="<%=viewHoSoUrl.toString()%>"><img
					src="<%=request.getContextPath()%>/img/s1.png" class="tabimg"></a>
			</td>
		</tr>
		<%
			}
		%>

	</table>
</div>
<liferay-ui:search-paginator searchContainer="<%=searchContainer%>" />
<div class="clear"></div>
<%
	if (searchContainer.getTotal() == 0) {
%>
<h5 style="margin-left: 15px;">Không có hồ sơ nào tìm thấy</h5>

<%
	}
%>
