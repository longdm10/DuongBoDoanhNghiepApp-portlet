<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongbo.utils.document.DocumentUtils"%>
<%@page import="vn.dtt.duongbo.utils.format.FormatData"%>
<%@page import="vn.dtt.duongbo.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.duongbo.dao.motcua.service.MotCuaDienBienHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
	<%
	String phieuXuLyIdTienTrinh = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY);
	List<MotCuaDienBienHoSo> liMotCuaDienBienHoSos = MotCuaDienBienHoSoLocalServiceUtil.findMotCuaDienBienHoSo(ConvertUtil.convertToLong(phieuXuLyIdTienTrinh));
	%>
		<table class="table table-striped table-bordered table-hover">
	         <tbody>
	             <tr >
	                 <td width="25%">Các bước</td>
	                 <td width="20%">Ghi chú</td>
	                 <td width="15%">Ngày bắt đầu</td>
	                 <td width="15%">Ngày kết thúc</td>
	                 <td width="15%">Cán bộ thụ lý</td>
	                 <td width="10%">Tài liệu đính kèm</td>
	             </tr>
	             <% 
	             if(liMotCuaDienBienHoSos!=null&&liMotCuaDienBienHoSos.size()>0){
	             try {
	            	 for (MotCuaDienBienHoSo motCuaDienBienHoSo : liMotCuaDienBienHoSos) {
	                	 %>
	                	 <tr>
	    	                 <td class="sp"><%=Validator.isNotNull(motCuaDienBienHoSo)?motCuaDienBienHoSo.getHanhDongXuLy():"" %></td>
	    	                 <td class="sp"><%=Validator.isNotNull(motCuaDienBienHoSo)?motCuaDienBienHoSo.getGhiChu():"" %></td>
	    	                 <td><%=Validator.isNotNull(motCuaDienBienHoSo)?FormatData.parseDateToTringType3(motCuaDienBienHoSo.getNgayXuLy()):"" %></td>
	    	                 <td><%=Validator.isNotNull(motCuaDienBienHoSo)?FormatData.parseDateToTringType3(motCuaDienBienHoSo.getNgayXuLy()) :"" %></td>
	    	                 <td class="sp"><%=Validator.isNotNull(motCuaDienBienHoSo)?UserLocalServiceUtil.fetchUser(motCuaDienBienHoSo.getNguoiXuLy()).getFullName():"" %></td>
	    	                 <td><a style="text-decoration: underline;color: blue;" href="<%=(motCuaDienBienHoSo.getTaiLieuDinhKem()!=0)?DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(motCuaDienBienHoSo.getTaiLieuDinhKem()):"" %>"><%=(motCuaDienBienHoSo.getTaiLieuDinhKem()!=0)?"Tài liệu":"" %></a></td>
	    	             </tr>
	                	 <%
	                 }
	             } catch (Exception es) {
	            	 es.printStackTrace();
	             }
	             }
	         		%>
	         			
	         </tbody>
		</table>	
	<%if(liMotCuaDienBienHoSos==null||liMotCuaDienBienHoSos.size()<=0){ %>
		<h5>Không tìm thấy diễn biễn hồ sơ</h5>
	<%} %>
	
