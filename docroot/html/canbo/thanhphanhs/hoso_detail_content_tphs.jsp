<%@page import="vn.dtt.duongbo.dao.common.service.TthcBieuMauHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.utils.document.DocumentUtils"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.utils.DoanhNghiepUtils"%>
<%@page import="vn.dtt.duongbo.utils.config.DuongBoConfigurationManager"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoBieuMauLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo"%>
<%@page import="vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy"%>
<%@page import="java.util.Arrays"%>
<%@page import="javax.portlet.RenderResponse"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>

<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
long userId = PortalUtil.getUserId(request);
long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
String listNoiDungHoSo = ParamUtil.getString(request, "listNoiDungHoSo");
long idNoiDungHoSo = ParamUtil.getLong(request, Constants.ID_NOI_DUNG_HO_SO);
long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);

MotCuaPhieuXuLy phieuXuLy1 = MotCuaPhieuXuLyLocalServiceUtil.findByHoSoThuTucId(hoSoThuTucId).get(0);

//List can bo.
List<TthcThanhPhanHoSo> allThanhPhanHoSoCanBoTraVe = TthcThanhPhanHoSoLocalServiceUtil.findByThutucHanhChinhIdAndLoaiThanhPhan(String.valueOf(thuTucHanhChinhId), "4");

//List doanh nghiep.

List<TthcThanhPhanHoSo> allThanhPhanHoSoFromDb = TthcThanhPhanHoSoLocalServiceUtil.findByThutucHanhChinhIdAndLoaiThanhPhan(String.valueOf(thuTucHanhChinhId),"1,2,3");
List<TthcThanhPhanHoSo> allThanhPhanHoSo = null;

TthcThanhPhanHoSo thanhPhanHoSo = null;
List<TthcThanhPhanHoSoBieuMau> allThanhPhanHoSoBieuMau = null;

TthcThanhPhanHoSoBieuMau thanhPhanHoSoBieuMau = null;
List<TthcBieuMauHoSo> allBieuMauHoSo = null;

TthcBieuMauHoSo bieuMauHoSo = null;

TthcNoidungHoSo noidungHoSo = null;


if(allThanhPhanHoSoFromDb != null && allThanhPhanHoSoFromDb.size() > 0){
	allThanhPhanHoSo = new ArrayList<TthcThanhPhanHoSo>();
	for(int i=0; i < allThanhPhanHoSoFromDb.size(); i++){
// 		System.out.println("allThanhPhanHoSoFromDb.get(i)"+allThanhPhanHoSoFromDb.get(i));
		thanhPhanHoSo = allThanhPhanHoSoFromDb.get(i);
		allThanhPhanHoSo.add(thanhPhanHoSo);
	}
	thanhPhanHoSo = null;
}

if(allThanhPhanHoSoCanBoTraVe != null && allThanhPhanHoSoCanBoTraVe.size() > 0){
	TthcBieuMauHoSo bieuMauCheck = null;
	for(int i=0; i < allThanhPhanHoSoCanBoTraVe.size(); i++){
		thanhPhanHoSo = allThanhPhanHoSoCanBoTraVe.get(i);
		allThanhPhanHoSoBieuMau = TthcThanhPhanHoSoBieuMauLocalServiceUtil.findByThanhPhanHoSoId(thanhPhanHoSo.getId());
		if(allThanhPhanHoSoBieuMau != null && allThanhPhanHoSoBieuMau.size() > 0){
			for(int k=0; k < allThanhPhanHoSoBieuMau.size(); k++){
				thanhPhanHoSoBieuMau = allThanhPhanHoSoBieuMau.get(k);
				noidungHoSo = TthcNoidungHoSoLocalServiceUtil.findByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(hoSoThuTucId, thanhPhanHoSoBieuMau.getBieuMauHoSoId(), thanhPhanHoSo.getId(), Constants.NOI_DUNG_HO_SO_TRANG_THAI_ACTIVE);
				if(noidungHoSo != null){
					bieuMauCheck = TthcBieuMauHoSoLocalServiceUtil.fetchTthcBieuMauHoSo(thanhPhanHoSoBieuMau.getBieuMauHoSoId());
					System.out.println("-------thanhphanhoso:" + thanhPhanHoSo.getId() + "------mabieumau: " +bieuMauCheck.getMaBieuMau() );
					allThanhPhanHoSo.add(thanhPhanHoSo);
					break;
				}
			}
		}
	}
	thanhPhanHoSo = null;
	allThanhPhanHoSoBieuMau = null;
	thanhPhanHoSoBieuMau = null;
	noidungHoSo = null;
}

%>
	<div id="u44_rtf"><p style="text-align:left;margin-bottom: 10px;"><span style="font-family:Arial;font-size:13px;font-weight:bold;font-style:normal;text-decoration:none;color:#333333;">Thông tin hồ sơ:</span></p></div>
<%

if(allThanhPhanHoSo!=null && allThanhPhanHoSo.size()>0){
	for(int i=0;i<allThanhPhanHoSo.size();i++){
		thanhPhanHoSo = allThanhPhanHoSo.get(i);
		allThanhPhanHoSoBieuMau = TthcThanhPhanHoSoBieuMauLocalServiceUtil.findByThanhPhanHoSoId(thanhPhanHoSo.getId());
		
		List<TthcNoidungHoSo> allNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.findByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId, thanhPhanHoSo.getId());
		
		TthcNoidungHoSo noiDungHoSoPdf = null;
		if(Validator.isNotNull(thanhPhanHoSo.getMauTrucTuyen()) && allNoidungHoSo != null && allNoidungHoSo.size() > 0) {
			for(int k=0; k < allNoidungHoSo.size(); k++){
				if(Validator.isNotNull(allNoidungHoSo.get(k).getNoiDungXml())) {
					noiDungHoSoPdf = allNoidungHoSo.get(k);
					break;
				}
			}
		}
		%>
				
		<div style="border-bottom: 1px solid #cccccc; margin-bottom: 10px;">
			<i class="fa MR5 fa-angle-right" style="float: left;margin-left: 10px;"></i>
			<p> 
				<%if(noiDungHoSoPdf != null){ %>
					<portlet:renderURL var="xemNoiDungHoSoURLPDF">
						<portlet:param name="jspPage" value="/html/canbo/thulyhs/duongbo/tongcuc/hoso_detail.jsp" />
						<portlet:param name="keyPDF" value="1" />
						<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC %>" value="<%=String.valueOf(hoSoThuTucId)%>" />
						<portlet:param name="<%=Constants.ID_NOI_DUNG_HO_SO %>" value="<%=String.valueOf(noiDungHoSoPdf.getId())%>" />
						<portlet:param name="<%=Constants.ID_THANH_PHAN_HO_SO %>" value="<%=String.valueOf(thanhPhanHoSo.getId())%>" />
						<portlet:param name="<%=Constants.ID_THU_TUC_HANH_CHINH %>" value="<%=String.valueOf(thuTucHanhChinhId)%>" />
						<portlet:param name="<%=Constants.ID_PHIEU_XU_LY %>" value="<%=String.valueOf(phieuXuLy1.getId())%>" />
						<portlet:param name="<%=Constants.THANH_PHAN_XU_LY %>" value="<%=Constants.XU_LY_TPHS %>" />
						<portlet:param name="myViewDetailDocument" value="1" />
						<portlet:param name="<%=Constants.ID_QUY_TRINH_THU_TUC %>" value="<%= ParamUtil.getString(request, Constants.ID_QUY_TRINH_THU_TUC) %>" />
						<portlet:param name="listNoiDungHoSo" value="<%=listNoiDungHoSo%>" />
					</portlet:renderURL>
					
					<a href="<%=xemNoiDungHoSoURLPDF.toString()%>"><strong><%=thanhPhanHoSo.getTenThanhPhan() %></strong></a> 
				<%}else{ %>
					<strong><%=thanhPhanHoSo.getTenThanhPhan() %></strong>
				<%} %>
			</p>
			<p style="clear: both;"></p>
			<% 
			if(allNoidungHoSo != null && allNoidungHoSo.size() > 0){
				for(int k=0; k < allNoidungHoSo.size(); k++){
					
					noidungHoSo = allNoidungHoSo.get(k);
					%>
					<portlet:renderURL var="xemNoiDungHoSoURL">
						<portlet:param name="jspPage" value="/html/canbo/thulyhs/duongbo/tongcuc/hoso_detail.jsp" />
						<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC %>" value="<%=String.valueOf(hoSoThuTucId)%>" />
						<portlet:param name="<%=Constants.ID_NOI_DUNG_HO_SO %>" value="<%=String.valueOf(noidungHoSo.getId())%>" />
						<portlet:param name="<%=Constants.ID_THANH_PHAN_HO_SO %>" value="<%=String.valueOf(thanhPhanHoSo.getId())%>" />
						<portlet:param name="<%=Constants.ID_THU_TUC_HANH_CHINH %>" value="<%=String.valueOf(thuTucHanhChinhId)%>" />
						<portlet:param name="<%=Constants.ID_PHIEU_XU_LY %>" value="<%=String.valueOf(phieuXuLy1.getId())%>" />
						<portlet:param name="<%=Constants.THANH_PHAN_XU_LY %>" value="<%=Constants.XU_LY_TPHS %>" />
						<portlet:param name="myViewDetailDocument" value="1" />
						<portlet:param name="<%=Constants.ID_QUY_TRINH_THU_TUC %>" value="<%= ParamUtil.getString(request, Constants.ID_QUY_TRINH_THU_TUC) %>" />
						<portlet:param name="listNoiDungHoSo" value="<%=listNoiDungHoSo%>" />
					</portlet:renderURL>
					<div class="">
					<%
					if(noidungHoSo.getTaiLieuDinhKem() > 0){
						if(noidungHoSo.getId() != idNoiDungHoSo){
						%>
							<img style="float: left; width: 15px;" src="<%=request.getContextPath() %>/img/tt_hs1.png">
							<p style="font-weight: bold; padding-left: 25px;"><i><a id="change1" class="change1" style="text-decoration: underline;color: #337ab7 !important;float: left;" href="<%=xemNoiDungHoSoURL.toString()%>"><span class="change1"><%="- " + noidungHoSo.getTenTaiLieu() %></span></a></i></p>
						<%
						}else{
						%>
							<img style="float: left; width: 15px;" src="<%=request.getContextPath() %>/img/tt_hs2.png">
							
							<%if(thanhPhanHoSo.getId()==noidungHoSo.getThanhPhanHoSoId()){ %>
								<p style="font-weight: bold; padding-left: 25px;"><i><a id="change1"  class="change1" style="text-decoration: underline;color: #337ab7 !important;float: left;" href="<%=xemNoiDungHoSoURL.toString()%>"><span class="change1"><%="- " + noidungHoSo.getTenTaiLieu() %></span></a></i></p>
							<%}else{ %>
							
							<%} %>
						<%
						}
					} else{
						%>
						<portlet:renderURL var="xemNoiDungHoSoURLPDF1">
							<portlet:param name="jspPage" value="/html/canbo/thulyhs/duongbo/tongcuc/hoso_detail.jsp" />
							<portlet:param name="keyPDF" value="1" />
							<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC %>" value="<%=String.valueOf(hoSoThuTucId)%>" />
							<portlet:param name="<%=Constants.ID_NOI_DUNG_HO_SO %>" value="<%=String.valueOf(noidungHoSo.getId())%>" />
							<portlet:param name="<%=Constants.ID_THANH_PHAN_HO_SO %>" value="<%=String.valueOf(thanhPhanHoSo.getId())%>" />
							<portlet:param name="<%=Constants.ID_THU_TUC_HANH_CHINH %>" value="<%=String.valueOf(thuTucHanhChinhId)%>" />
							<portlet:param name="<%=Constants.ID_PHIEU_XU_LY %>" value="<%=String.valueOf(phieuXuLy1.getId())%>" />
							<portlet:param name="<%=Constants.THANH_PHAN_XU_LY %>" value="<%=Constants.XU_LY_TPHS %>" />
							<portlet:param name="myViewDetailDocument" value="1" />
							<portlet:param name="<%=Constants.ID_QUY_TRINH_THU_TUC %>" value="<%= ParamUtil.getString(request, Constants.ID_QUY_TRINH_THU_TUC) %>" />
							<portlet:param name="listNoiDungHoSo" value="<%=listNoiDungHoSo%>" />
						</portlet:renderURL>
						<%
						if(noidungHoSo.getId() != idNoiDungHoSo){
						%>
							<img style="float: left; width: 15px;" src="<%=request.getContextPath() %>/img/tt_hs1.png">
							
							<%if(thanhPhanHoSo.getId()==noidungHoSo.getThanhPhanHoSoId()){ %>
								<p style="font-weight: bold; padding-left: 25px;"><i><a class="menulink2" style="text-decoration: underline;color: #337ab7 !important;float: left;" href="<%=xemNoiDungHoSoURLPDF1.toString()%>"><span><%="- " + (Validator.isNotNull(noidungHoSo.getTenTaiLieu()) ? noidungHoSo.getTenTaiLieu() : thanhPhanHoSo.getTenThanhPhan()) %></span></a></i></p>
							<%}else{ %>
							
							<%} %>
						<%
						}else{
						%>
							<img style="float: left; width: 15px;" src="<%=request.getContextPath() %>/img/tt_hs2.png" >
							
							<%if(thanhPhanHoSo.getId()==noidungHoSo.getThanhPhanHoSoId()){ %>
								<p style="font-weight: bold; padding-left: 25px;"><i><a class="menulink2" style="text-decoration: underline;color: #337ab7 !important;float: left;" href="<%=xemNoiDungHoSoURLPDF1.toString()%>"><span><%="- "+ (Validator.isNotNull(noidungHoSo.getTenTaiLieu()) ? noidungHoSo.getTenTaiLieu() : thanhPhanHoSo.getTenThanhPhan())%></span></a></i></p>
							<%}else{ %>
					
							<%} %>
						<%
						}
					}
					%>
					<p style="clear: both;"></p>
					</div>
					<%
				}
			}else {
			}
			%>
		</div>
		<%
	}
}

%>
	<div class="hienthi" id="divNoiDung" style="height:auto;width:100%;border:1px solid black;margin-top: 20px;float: left;margin-bottom: 20px;">
		
		<%@ include file="/html/canbo/thanhphanhs/view_thong_tin_mau_don.jsp"%>
	</div>
	
	<input style="width: 10%;"  type="hidden" value="<%=idNoiDungHoSo %>" id="truongId"/>

<%
	TthcXacNhanThanhToanHoSo xacNhanThanhToanHoSo =null;
	List<TthcXacNhanThanhToanHoSo> listxacNhanThanhToanHoSos = new ArrayList<TthcXacNhanThanhToanHoSo>();// TthcXacNhanThanhToanHoSoLocalServiceUtil.findByHoSoThuTucId(hoSoThuTucId);
	TthcXacNhanThanhToan xacNhanThanhToan = null;
	List<TthcXacNhanThanhToan> listxacNhanThanhToan = null;
	long idXacNhanTHanhToan =0;
	String hinhThucTHanhToan ="";
	String loaiPhi ="";
	String trangThai="";
	
	int countXacNhanThanhToan=0;
	if(listxacNhanThanhToanHoSos!=null && listxacNhanThanhToanHoSos.size()>0){
		countXacNhanThanhToan=listxacNhanThanhToanHoSos.size();
		
		%>
		<div id="u45_rtf"><p style="text-align:left;margin-top: 10px;"><span style="font-family:Arial;font-size:13px;font-weight:bold;font-style:normal;text-decoration:none;color:#333333;">Thông tin thanh toán:</span></p></div>
		<%
		
		for(int i=0;i<countXacNhanThanhToan;i++){
			xacNhanThanhToanHoSo = listxacNhanThanhToanHoSos.get(i);
			if(xacNhanThanhToanHoSo!=null){
				idXacNhanTHanhToan = xacNhanThanhToanHoSo.getXacNhanThanhToanId();
				xacNhanThanhToan = TthcXacNhanThanhToanLocalServiceUtil.fetchTthcXacNhanThanhToan(idXacNhanTHanhToan);
				
				if(xacNhanThanhToan!=null){
					
					if(xacNhanThanhToan.getHinhThucThanhToan()==Constants.MTYT_HINH_THUC_THANH_TOAN_CHUYEN_KHOAN){
						hinhThucTHanhToan = DuongBoConfigurationManager.getStrProp("vn.dtt.hinh.thuc.thanh.toan.2", "");
						
						
					}else if(xacNhanThanhToan.getHinhThucThanhToan()==Constants.MTYT_HINH_THUC_THANH_TOAN_KEY_PAD){
						hinhThucTHanhToan =  DuongBoConfigurationManager.getStrProp("vn.dtt.hinh.thuc.thanh.toan.3", "");
					}
					
					if(xacNhanThanhToan.getLoaiPhi().trim().equals(Constants.PHI_THAM_DINH_CODE)){
            			loaiPhi = DuongBoConfigurationManager.getStrProp("loai.phi.tham.dinh", "");
            			
            		}else if(xacNhanThanhToan.getLoaiPhi().trim().equalsIgnoreCase(Constants.PHI_PHAT_SINH_CODE)){
            			loaiPhi = DuongBoConfigurationManager.getStrProp("loai.phi.phat.sinh", "");
						}
					
					

					
					if(xacNhanThanhToan.getTrangThaiXacNhan()==Constants.MTYT_CHUA_XAC_NHAN_THANH_TOAN){
						trangThai = DuongBoConfigurationManager.getStrProp("chua.xac.nhan.thanh.toan", "");
						
						%>
						<div style="margin: 15px 0;">
							<img  src="<%=request.getContextPath() %>/img/tt_hs7.png"><a onclick="viewHoaDonThanhToan('<%=i %>')" href="#"><%=hinhThucTHanhToan %> <%=loaiPhi %> (<i><a onclick="viewHoaDonThanhToan('<%=i %>')" href="#" style="color:blue;text-decoration: underline;"><%=trangThai %></a></i>)<br></a>
						</div>
						<%
						
					}else if(xacNhanThanhToan.getTrangThaiXacNhan()==Constants.MTYT_XAC_NHAN_THANH_TOAN_HOP_LE){
						trangThai = DuongBoConfigurationManager.getStrProp("xac.nhan.thanh.toan.hop.le", "");
						
						%>
						<div style="margin: 15px 0;">
							<img  src="<%=request.getContextPath() %>/img/tt_hs4.png"><a onclick="viewHoaDonThanhToan('<%=i %>')" href="#"><%=hinhThucTHanhToan %> <%=loaiPhi %> (<i><a onclick="viewHoaDonThanhToan('<%=i %>')" href="#" style="color:blue;text-decoration: underline;"><%=trangThai %></a></i>)<br></a>
						</div>
						<%
					}else if(xacNhanThanhToan.getTrangThaiXacNhan()==Constants.MTYT_XAC_NHAN_THANH_TOAN_KHONG_HOP_LE){
						trangThai = DuongBoConfigurationManager.getStrProp("xac.nhan.thanh.toan.khong.hop.le", "");
						
						%>
						<div style="margin: 15px 0;">
							<img  src="<%=request.getContextPath() %>/img/tt_hs6.png"><a onclick="viewHoaDonThanhToan('<%=i %>')" href="#"><%=hinhThucTHanhToan %> <%=loaiPhi %> (<i><a onclick="viewHoaDonThanhToan('<%=i %>')" href="#" style="color:blue;text-decoration: underline;"><%=trangThai %></a></i>)<br></a>
						</div>
						<%
					}
				}
					
				
					
			}
		}
		
		
	}
%>
	
	<%
	if(listxacNhanThanhToanHoSos!=null && listxacNhanThanhToanHoSos.size()>0){
		for(int j=0;j<countXacNhanThanhToan;j++){
			xacNhanThanhToanHoSo = listxacNhanThanhToanHoSos.get(j);
			if(xacNhanThanhToanHoSo!=null){
				idXacNhanTHanhToan = xacNhanThanhToanHoSo.getXacNhanThanhToanId();
				xacNhanThanhToan = TthcXacNhanThanhToanLocalServiceUtil.fetchTthcXacNhanThanhToan(idXacNhanTHanhToan);
				
				if(xacNhanThanhToan!=null){
					if(xacNhanThanhToan.getHinhThucThanhToan()==Constants.MTYT_HINH_THUC_THANH_TOAN_CHUYEN_KHOAN){
						hinhThucTHanhToan =DuongBoConfigurationManager.getStrProp("vn.dtt.hinh.thuc.thanh.toan.2", "");
					}else if(xacNhanThanhToan.getHinhThucThanhToan()==Constants.MTYT_HINH_THUC_THANH_TOAN_KEY_PAD){
						hinhThucTHanhToan =DuongBoConfigurationManager.getStrProp("vn.dtt.hinh.thuc.thanh.toan.3", "");
					}
					
					if(xacNhanThanhToan.getLoaiPhi().trim().equals(Constants.PHI_THAM_DINH_CODE)){
            			loaiPhi = DuongBoConfigurationManager.getStrProp("loai.phi.tham.dinh", "");
            		}else if(xacNhanThanhToan.getLoaiPhi().trim().equalsIgnoreCase(Constants.PHI_PHAT_SINH_CODE)){
						loaiPhi = DuongBoConfigurationManager.getStrProp("loai.phi.phat.sinh", "");
					}
					
					if(xacNhanThanhToan.getTrangThaiXacNhan()==Constants.MTYT_CHUA_XAC_NHAN_THANH_TOAN){
						trangThai =	DuongBoConfigurationManager.getStrProp("chua.xac.nhan.thanh.toan", "");
					}else if(xacNhanThanhToan.getTrangThaiXacNhan()==Constants.MTYT_XAC_NHAN_THANH_TOAN_HOP_LE){
						trangThai = DuongBoConfigurationManager.getStrProp("xac.nhan.thanh.toan.hop.le", "");
					}else if(xacNhanThanhToan.getTrangThaiXacNhan()==Constants.MTYT_XAC_NHAN_THANH_TOAN_KHONG_HOP_LE){
						trangThai =	DuongBoConfigurationManager.getStrProp("xac.nhan.thanh.toan.khong.hop.le", "");
					}
				}
				%>
				<style>
					  .dong{
					  	 height: 30px;
					  }
				</style>
			
					
					<%
						if(xacNhanThanhToan!=null){
							%>
						
				<div style="  border: 1px solid rgb(199, 195, 195);height: auto;padding: 15px;margin-bottom: 20px;margin-top: 10px;display:none;" id="thongTinPhieu_<%=j %>" > 
					<p style="text-align: left;">
						<span style="font-family: Arial; font-size: 13px; font-weight: bold; font-style: normal; text-decoration: none; color: #333333;">Thông tin xác nhận:</span>
					</p>
							
							
							<table style="width:100%;">
								<tr class="dong">
									<td>Mã giao dịch: </td>
									<td><%=(xacNhanThanhToan.getMaTuSinh()==null)?"":xacNhanThanhToan.getMaTuSinh() %></td>
								</tr>
						<tr class="dong">
							<td>Trạng thái: </td>
							<td><%=(trangThai==null)?"":trangThai %></td>
							
						</tr>
						<tr class="dong">
							<td>Số tiền: </td>
							<td><%=(xacNhanThanhToan.getSoTien()+""==null)?"":DoanhNghiepUtils.getMoney(String.valueOf(xacNhanThanhToan.getSoTien())) %></td>
						</tr>
						
						<tr class="dong">
							<td>Loại phí: </td>
							<td><%=(loaiPhi==null)?"":loaiPhi %></td>
							
						</tr>
						
						<tr class="dong">
							<td style="width:20%;">Hình thức thanh toán: </td>
							<td><%=(hinhThucTHanhToan==null)?"":hinhThucTHanhToan %></td>
						</tr>
						<tr class="dong">
							<td>Thông tin xác nhận: </td>
							<%
								if(xacNhanThanhToan!=null){
									if(xacNhanThanhToan.getHinhThucThanhToan()==Constants.MTYT_HINH_THUC_THANH_TOAN_CHUYEN_KHOAN){
										 if (xacNhanThanhToan.getTaiLieuDinhKem() > 0) {
									            %>
									            <td><%=xacNhanThanhToan.getThongTinXacNhan() %>/<a style="color:blue" href="<%=DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(xacNhanThanhToan.getTaiLieuDinhKem())%>">Hóa đơn</a></p></td>
									            <%
									            }
									}else if(xacNhanThanhToan.getHinhThucThanhToan()==Constants.MTYT_HINH_THUC_THANH_TOAN_KEY_PAD){
										//truc tuyen keypay
										%>
										<td><%=xacNhanThanhToan.getMaTuSinh() %>/<a href="#">-----</a></td>
										<%
									}
								}
							%>
						</tr>
						<tr class="dong">
							<td>Người xác nhận: </td>
							<td><%=(xacNhanThanhToan.getNguoiXacNhan()+""==null)?"":xacNhanThanhToan.getNguoiXacNhan() %></td>
						</tr>
						<tr class="dong">
							<td>Ngày xác nhận: </td>
							<td><%=(xacNhanThanhToan.getNgayXacNhan()==null)?"":xacNhanThanhToan.getNgayXacNhan() %></td>
						</tr>
						
						<tr class="dong">
							<td>Ý kiến: </td>
							<td><%=(xacNhanThanhToan.getYKienXuLy()==null)?"":xacNhanThanhToan.getYKienXuLy() %></td>
							
						</tr>
						
					</table>
							<%
						}
					
					%>
					<h3>Danh sách hồ sơ trong lần giao dịch</h3>
			        <table style="width: 100%;" class="table">
			            <tr class="fl">
			                <td width="5%">STT</td>
			                <td width="45%">Tên thủ tục</td>
			                <td width="15%">Mã số hồ sơ</td>
			                <td width="15%">Mã tiếp nhận</td>
			                <td width="15%">Số tiền</td>
			            </tr>
			            <%
						int index = 1;
			            TthcHoSoThuTuc hosoThuTuc = null;
			            dnDoanhNghiep = null;
						for (TthcXacNhanThanhToanHoSo thanhToanHoSo : listxacNhanThanhToanHoSos) {
							try {
								hosoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(thanhToanHoSo.getHoSoThuTucId());
							} catch (Exception es) {
								es.printStackTrace();
							}
							
							if (hosoThuTuc != null) {
								if (dnDoanhNghiep == null) {
									dnDoanhNghiep = DnDoanhNghiepLocalServiceUtil.fetchDnDoanhNghiep(hosoThuTuc.getNguoiLamThuTucId());
								}
								TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(hosoThuTuc.getThuTucHanhChinhId());
						%>				
				            <tr>
				                <td><%=index++%></td>
								<td class="sp"><%=(thuTucHanhChinh != null) ? thuTucHanhChinh.getTenThuTuc() : ""%></td>
								<td class="sp"><%=(hosoThuTuc != null) ? hosoThuTuc.getMaSoHoSo() : ""%></td>
								<td class="sp"><%=(hosoThuTuc != null) ? hosoThuTuc.getMaBienNhan() : ""%></td>
								<td class="sp"><%=DoanhNghiepUtils.getMoney((int)thanhToanHoSo.getSoTien()+"")%></td>
				            </tr>
			            <%
							}
						}
			            %>
			        </table>
				</div>
		<%
		}
		}
	}
		
	%> 
	<input type="hidden" value="<%=countXacNhanThanhToan%>" id="abcID"/>

<script>

function refreshPdfDiv2(){
	var myDiv3 = document.getElementById('reportView2').innerHTML;
	var myDiv4 = document.getElementById('reportView2');
	myDiv4.innerHTML = myDiv3; 

}

var soThongTinPhieu=<%=countXacNhanThanhToan%>;
function viewHoaDonThanhToan(id) {
	if (soThongTinPhieu>0){
		for (var i=0;i<soThongTinPhieu;i++){
			document.getElementById("thongTinPhieu_"+i).style.display = 'none';
		}
		document.getElementById("thongTinPhieu_"+id).style.display = '';
	}
}
</script>