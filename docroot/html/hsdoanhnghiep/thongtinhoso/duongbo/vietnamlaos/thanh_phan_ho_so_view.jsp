<%@page import="vn.dtt.duongbo.dao.thanhtoan.service.TthcHinhThucNopPhiLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.utils.DoanhNghiepUtils"%>
<%@page import="java.util.Arrays"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcBieuMauHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalService"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoBieuMauLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcLinhVucThuTucLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc"%>

<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<link rel="stylesheet" href="<%=request.getContextPath()%>/css/tipsy.css" type="text/css" media="screen" />
<link rel="stylesheet"	href="<%=request.getContextPath()%>/css/jquery.alerts.css" type="text/css" media="screen" />	
<link rel="stylesheet"	href="<%=request.getContextPath()%>/css/jquery-ui.css" type="text/css" media="screen" />

<%
long userId = PortalUtil.getUserId(request);
long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
String listNoiDungHoSo = ParamUtil.getString(request, "listNoiDungHoSo");
TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);

TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(thuTucHanhChinhId);
TthcHinhThucNopPhi hinhThucNopPhi = null;
if(!thuTucHanhChinh.getLinhVucThuTuc().trim().equalsIgnoreCase(Constants.THU_TUC_HANH_CHINH_GIAY_PHEP_NHAP_KHAU)){
	hinhThucNopPhi = TthcHinhThucNopPhiLocalServiceUtil.findByThuTucHanhChinhId(thuTucHanhChinhId);
}

long payAmount = 0;
if(hinhThucNopPhi != null){
	payAmount = hinhThucNopPhi.getPhiNopBanDau();
}
String titlePhiThamDinh = "";
long payIssue = 0;
phiPhatSinh phiPhatSinh = PhiPhatSinhLocalServiceUtil.findByMaThuTuc(thuTucHanhChinh.getMaThuTuc().trim());
if(phiPhatSinh != null){
	payIssue = Long.parseLong(phiPhatSinh.getSoTien());
}
String titlePhiPhatSinh = "";
List<TthcThanhPhanHoSo> allThanhPhanHoSoCanBoTraVe = TthcThanhPhanHoSoLocalServiceUtil.findByThutucHanhChinhIdAndLoaiThanhPhan(String.valueOf(thuTucHanhChinhId), "4");

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
		thanhPhanHoSo = allThanhPhanHoSoFromDb.get(i);
		allThanhPhanHoSo.add(thanhPhanHoSo);
	}
	thanhPhanHoSo = null;
}

if(allThanhPhanHoSoCanBoTraVe != null && allThanhPhanHoSoCanBoTraVe.size() > 0){
	MotCuaTrangThaiHoSo trangThaiHoSoCheck = MotCuaTrangThaiHoSoLocalServiceUtil.fetchMotCuaTrangThaiHoSo(Long.valueOf(hoSoThuTuc.getTrangThaiHoSo()));
	for(int i=0; i < allThanhPhanHoSoCanBoTraVe.size(); i++){
		thanhPhanHoSo = allThanhPhanHoSoCanBoTraVe.get(i);
		allThanhPhanHoSoBieuMau = TthcThanhPhanHoSoBieuMauLocalServiceUtil.findByThanhPhanHoSoId(thanhPhanHoSo.getId());
		if(allThanhPhanHoSoBieuMau != null && allThanhPhanHoSoBieuMau.size() > 0){
			for(int k=0; k < allThanhPhanHoSoBieuMau.size(); k++){
				thanhPhanHoSoBieuMau = allThanhPhanHoSoBieuMau.get(k);
				bieuMauHoSo = TthcBieuMauHoSoLocalServiceUtil.fetchTthcBieuMauHoSo(thanhPhanHoSoBieuMau.getBieuMauHoSoId());
				noidungHoSo = TthcNoidungHoSoLocalServiceUtil.findByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId, thanhPhanHoSoBieuMau.getBieuMauHoSoId(), thanhPhanHoSo.getId());
				if(noidungHoSo != null){
					if( Arrays.asList(Constants.KHONG_CAP_CHUNG_NHAN).contains(bieuMauHoSo.getMaBieuMau().trim()) ||  Arrays.asList(Constants.GIAY_CHUNG_NHAN_CODES).contains(bieuMauHoSo.getMaBieuMau().trim())){
						if(trangThaiHoSoCheck.getMaTrangThai().trim().equalsIgnoreCase(Constants.DOANH_NGHIEP_TRANG_THAI_HUY_HOAN_THANH)){
							allThanhPhanHoSo.add(thanhPhanHoSo);
							break;
						}
					} else{
						allThanhPhanHoSo.add(thanhPhanHoSo);
						break;
					}
				}
			}
		}
		
	}
	thanhPhanHoSo = null;
	allThanhPhanHoSoBieuMau = null;
	thanhPhanHoSoBieuMau = null;
	noidungHoSo = null;
}

MotCuaTrangThaiHoSo trangThaiHoSo = null;
boolean turnOnBoSungSau = false;
if(hoSoThuTuc != null){
	trangThaiHoSo = MotCuaTrangThaiHoSoLocalServiceUtil.fetchMotCuaTrangThaiHoSo(Long.parseLong(hoSoThuTuc.getTrangThaiHoSo()));
	if(trangThaiHoSo != null){
		if(trangThaiHoSo.getMaTrangThai().trim().equalsIgnoreCase(Constants.DOANH_NGHIEP_TRANG_THAI_CHO_KHAO_NGHIEM)){
			turnOnBoSungSau = true;
		}
	}
	if(!turnOnBoSungSau){
		if(allThanhPhanHoSoFromDb != null && allThanhPhanHoSoFromDb.size() > 0){
			for(int i=0; i < allThanhPhanHoSoFromDb.size(); i++){
				thanhPhanHoSo = allThanhPhanHoSoFromDb.get(i);
				if(thanhPhanHoSo.getLoaiThanhPhan() == Constants.THANH_PHAN_HO_SO_BO_XUNG){
					turnOnBoSungSau = false;
					allThanhPhanHoSoBieuMau = TthcThanhPhanHoSoBieuMauLocalServiceUtil.findByThanhPhanHoSoId(thanhPhanHoSo.getId());
					if(allThanhPhanHoSoBieuMau != null && allThanhPhanHoSoBieuMau.size() > 0){
						for(int k=0; k < allThanhPhanHoSoBieuMau.size(); k++){
							thanhPhanHoSoBieuMau = allThanhPhanHoSoBieuMau.get(k);
							noidungHoSo = TthcNoidungHoSoLocalServiceUtil.findByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId, thanhPhanHoSoBieuMau.getBieuMauHoSoId(), thanhPhanHoSo.getId());
							if(noidungHoSo != null){
								turnOnBoSungSau = true;
								break;
							}
						}
					}
				}
			}
		}
		thanhPhanHoSo = null;
		allThanhPhanHoSoBieuMau = null;
		thanhPhanHoSoBieuMau = null;
		noidungHoSo = null;
	}
}



DmDataItem linhVuc = null;
String tenLinhVuc = "";
if(thuTucHanhChinh != null){
	linhVuc = DmDataItemLocalServiceUtil.getByGroupCodeAndItemCode0(Constants.LINH_VUC_THU_TUC_HANH_CHINH_CODE, thuTucHanhChinh.getLinhVucThuTuc().trim());
	if(linhVuc != null)
		tenLinhVuc = linhVuc.getName();
}


PortletURL backUrl = renderResponse.createRenderURL();
backUrl.setParameter("jspPage", "/html/hsdoanhnghiep/view.jsp");



%>

<section class="right">
	<div class="box" style="margin-top: 5px;float: left;margin-bottom: 20px;">
			<aui:form action="" name="myForm" id="myForm" method="POST">
				<div class="main_chuanbihs">
				
					<img class="lisths1" src="<%=request.getContextPath()%>/img/list.png"><p class="spectex">Thành phần hồ sơ</p>
					
					<table class="table" style="table-layout: fixed;word-wrap: break-word;">
						<tbody>
							<tr class="fl">
								<td width="4%">STT</td>
								<td width="6%"></td>
								<td width="59%">Tên thành phần hồ sơ</td>
								<td width="31%">Lưu ý</td>
							</tr>
			<%	if(allThanhPhanHoSo != null && allThanhPhanHoSo.size() > 0){
				String  srcImage = "";
				String  srcImageThaoTacEditUpload = "";
				String  srcImageThaoTacEditUploadUpdate = "";
				String  srcImageThaoTacEditUploadReplace = "";
				
				boolean isRequired = false;
				for(int i=0; i < allThanhPhanHoSo.size(); i++){
					thanhPhanHoSo = allThanhPhanHoSo.get(i);
					allThanhPhanHoSoBieuMau = TthcThanhPhanHoSoBieuMauLocalServiceUtil.findByThanhPhanHoSoId(thanhPhanHoSo.getId());
					if(allThanhPhanHoSoBieuMau != null && allThanhPhanHoSoBieuMau.size()>0){
						for(int k=0; k < allThanhPhanHoSoBieuMau.size(); k++){
							thanhPhanHoSoBieuMau = allThanhPhanHoSoBieuMau.get(k);
							noidungHoSo = TthcNoidungHoSoLocalServiceUtil.findByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId, thanhPhanHoSoBieuMau.getBieuMauHoSoId(), thanhPhanHoSo.getId());
							if(noidungHoSo != null){
								break;
							}
						}
					}
					if((thanhPhanHoSo.getLoaiThanhPhan() == Constants.THANH_PHAN_HO_SO_BO_XUNG) && (!turnOnBoSungSau)){
						isRequired = false;
						if(thanhPhanHoSo.getMauTrucTuyen() != null && thanhPhanHoSo.getMauTrucTuyen().trim().length() > 0){
							srcImage = request.getContextPath() + "/img/i5.png";
							srcImageThaoTacEditUpload = request.getContextPath() + "/img/i9.png";
							srcImageThaoTacEditUploadUpdate = request.getContextPath() + "/img/i10.png";
						} else{
							srcImage = request.getContextPath() + "/img/i7.png";
							srcImageThaoTacEditUpload = request.getContextPath() + "/img/i10.png";
							srcImageThaoTacEditUploadUpdate = request.getContextPath() + "/img/i11.png";
							srcImageThaoTacEditUploadReplace = request.getContextPath() + "/img/i12.png";
						}
					} else{
						if((thanhPhanHoSo.getLoaiThanhPhan() == Constants.THANH_PHAN_HO_SO_BAT_BUC) || ((thanhPhanHoSo.getLoaiThanhPhan() == Constants.THANH_PHAN_HO_SO_BO_XUNG) && (turnOnBoSungSau))){
							isRequired = true;
						} else{
							isRequired = false;
						}
						if(thanhPhanHoSo.getMauTrucTuyen() != null && thanhPhanHoSo.getMauTrucTuyen().trim().length() > 0){
							srcImage = request.getContextPath() + "/img/i6.png";
							srcImageThaoTacEditUpload = request.getContextPath() + "/img/i9.png";
							srcImageThaoTacEditUploadUpdate = request.getContextPath() + "/img/i10.png";
			
						} else{
							srcImage = request.getContextPath() + "/img/i8.png";
							srcImageThaoTacEditUpload = request.getContextPath() + "/img/i10.png";
							srcImageThaoTacEditUploadUpdate = request.getContextPath() + "/img/i11.png";
							srcImageThaoTacEditUploadReplace = request.getContextPath() + "/img/i12.png";
						}
						if(noidungHoSo != null){
							srcImage = request.getContextPath() + "/img/icon_finish.png";
						}
					}
					
					PortletURL xemNoidungFileDinhKem = renderResponse.createRenderURL();
					xemNoidungFileDinhKem.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/view_thong_tin_mau_don.jsp");
					xemNoidungFileDinhKem.setParameter("backUrl", "/html/hsdoanhnghiep/thongtinhoso/thanh_phan_ho_so_view.jsp");
					xemNoidungFileDinhKem.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
					xemNoidungFileDinhKem.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
					xemNoidungFileDinhKem.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSo.getId()));
					xemNoidungFileDinhKem.setParameter("listNoiDungHoSo", listNoiDungHoSo);
					if(noidungHoSo != null){
						xemNoidungFileDinhKem.setParameter(Constants.ID_NOI_DUNG_HO_SO, String.valueOf(noidungHoSo.getId()));
					}
			%>		
					<tr>
						<td><%=i + 1%></td>
						<td><a><img src="<%= srcImage%>"></a></td>
						
						<%
						String tagLinkString = "";
						if(noidungHoSo != null){
							xemNoidungFileDinhKem.setParameter(Constants.ID_NOI_DUNG_HO_SO, String.valueOf(noidungHoSo.getId()));
							tagLinkString = "<br>  <a href='"+xemNoidungFileDinhKem.toString()+"' title='Xem nội dung giấy tờ'>" + "<span style='font-family:Arial;font-size:13px;font-weight:normal;font-style:italic;text-decoration:underline;color:#0000FF;'>" + "-" + noidungHoSo.getTenTaiLieu() + "</span>" + "</a>";
						}
						if(thanhPhanHoSo.getMauTrucTuyen() != null && thanhPhanHoSo.getMauTrucTuyen().trim().length() > 0){
							
						%>
						
						<td class="sp" style="word-wrap: break-word;">
						<% if (noidungHoSo!=null){
							if(noidungHoSo.getTaiLieuDinhKem()>0){
								%>
								<a href="<%=xemNoidungFileDinhKem.toString()%>" title="Xem nội dung giấy tờ"><%=thanhPhanHoSo.getTenThanhPhan() %> 
										<%=((isRequired) ? "<span class='red'>*</span>" : "") %> </a><br/>
										<%=tagLinkString %>
								<%
							}else{
								%>
								<a href="<%=xemNoidungFileDinhKem.toString()%>" title="Xem nội dung giấy tờ"><%=thanhPhanHoSo.getTenThanhPhan() %> 
										<%=((isRequired) ? "<span class='red'>*</span>" : "") %> </a><br/>
								<%
							}
							} 
							else {%>
							<%=thanhPhanHoSo.getTenThanhPhan() %> <span class='red'>*</span>
						<%} %>
						</td>
						<td class="sp" style="word-wrap: break-word;"></td>
						<%} else {
							if(noidungHoSo != null){
								tagLinkString = "<br>  <a href='"+xemNoidungFileDinhKem.toString()+"' title='Xem nội dung giấy tờ'>" + "<span style='font-family:Arial;font-size:13px;font-weight:normal;font-style:italic;text-decoration:underline;color:#0000FF;'>" + "-" + noidungHoSo.getTenTaiLieu() + "</span>" + "</a>";
							}
						%>
						
						<td class="sp" style="word-wrap: break-word;"><%=thanhPhanHoSo.getTenThanhPhan() + ((isRequired) ? "<span class='red'>*</span>" : "") + ((noidungHoSo == null) ? "" : (tagLinkString))%></td>
						<td class="sp"></td>
						<%	
						}
						%>
					</tr>
			<%
				}
			}
			%>
				</tbody>
			</table>
			
		
			
		
			
			<%
			TthcXacNhanThanhToanHoSo xacNhanThanhToanHoSo = null;
			TthcXacNhanThanhToan xacNhanThamDinh = null;
			TthcXacNhanThanhToan xacNhanKhaoNghiem = null;
			List<TthcXacNhanThanhToanHoSo> allXacNhanThanhToanHoSo = TthcXacNhanThanhToanHoSoLocalServiceUtil.findByHoSoThuTucId(hoSoThuTucId);
			if(allXacNhanThanhToanHoSo != null && allXacNhanThanhToanHoSo.size() > 0){
				for(int i=0; i < allXacNhanThanhToanHoSo.size(); i++){
					xacNhanThanhToanHoSo = allXacNhanThanhToanHoSo.get(i);
					TthcXacNhanThanhToan xacNhanThanhToan = TthcXacNhanThanhToanLocalServiceUtil.fetchTthcXacNhanThanhToan(xacNhanThanhToanHoSo.getXacNhanThanhToanId());
					if(xacNhanThanhToan != null ){
						if(xacNhanThanhToan.getLoaiPhi().trim().equalsIgnoreCase(Constants.PHI_THAM_DINH_CODE)){
							if(xacNhanThanhToan.getTrangThaiXacNhan() == Constants.MTYT_CHUA_XAC_NHAN_THANH_TOAN){
								titlePhiThamDinh = "Đã nộp phí, chờ xác nhận";
							} else if(xacNhanThanhToan.getTrangThaiXacNhan() == Constants.MTYT_XAC_NHAN_THANH_TOAN_HOP_LE){
								titlePhiThamDinh = "Đã xác nhận nộp phí";
							} 
							xacNhanThamDinh = xacNhanThanhToan;
							
						} else if(xacNhanThanhToan.getLoaiPhi().trim().equalsIgnoreCase(Constants.PHI_PHAT_SINH_CODE)){
							if(xacNhanThanhToan.getTrangThaiXacNhan() == Constants.MTYT_CHUA_XAC_NHAN_THANH_TOAN){
								titlePhiPhatSinh = "Đã nộp phí, chờ xác nhận";
							} else if(xacNhanThanhToan.getTrangThaiXacNhan() == Constants.MTYT_XAC_NHAN_THANH_TOAN_HOP_LE){
								titlePhiPhatSinh = "Đã xác nhận nộp phí";
							} else {
								titlePhiPhatSinh = "Nộp khi bổ sung kết quả khảo nghiệm";
							}
							xacNhanKhaoNghiem = xacNhanThanhToan;
						}
					}
				}
				
			}
			%>
			<img class="lisths1" src="<%=request.getContextPath() %>/img/list.png"><p class="spectex">Thông tin về phí, lệ phí:</p><br>
						<p class="spectex2" style="margin-left:5%;">- Phí thẩm định cho phép khảo nghiệm: <span class="bold2"><%=DoanhNghiepUtils.getMoney(String.valueOf(payAmount)) %></span><span class="bi"><%=titlePhiThamDinh %></span></p><br>
						<p class="spectex2" style="margin-left:5%;margin-top: -10px;">- Phí thẩm định <%=tenLinhVuc%>: <span class="bold2"><%=DoanhNghiepUtils.getMoney(String.valueOf(payIssue)) %></span><span class="oi"><%=titlePhiPhatSinh %> </span></p><br><br>
			<%
			PortletURL xemNoidungHoaDon = renderResponse.createRenderURL();
			xemNoidungHoaDon.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/view_thong_tin_hoa_don.jsp");
			xemNoidungHoaDon.setParameter("backUrl", "/html/hsdoanhnghiep/thongtinhoso/thanh_phan_ho_so_view.jsp");
			xemNoidungHoaDon.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
			xemNoidungHoaDon.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
			xemNoidungHoaDon.setParameter("listNoiDungHoSo", listNoiDungHoSo);
			
			if(xacNhanThamDinh != null){
				xemNoidungHoaDon.setParameter(Constants.ID_XACNHANTHANHTOAN, String.valueOf(xacNhanThamDinh.getId()));
				
				if(xacNhanThamDinh.getHinhThucThanhToan() == Constants.THANH_TOAN_CHUYEN_KHOAN){
			%>
					<p><a style="float: right;margin-top: -120px;margin-right: 100px;text-decoration: underline;" href="<%=xemNoidungHoaDon%>">Xem hóa đơn</a></p>
			<%	
				}else if(xacNhanThamDinh.getHinhThucThanhToan() == Constants.THANH_TOAN_KEYPAY){
					%>
					<p><a style="float: right;margin-top: -120px;margin-right: 100px;text-decoration: underline;" href="<%=xemNoidungHoaDon%>">Xem thông tin phí</a></p>
					<%
				}
			}
			if(xacNhanKhaoNghiem != null){
				xemNoidungHoaDon.setParameter(Constants.ID_XACNHANTHANHTOAN, String.valueOf(xacNhanKhaoNghiem.getId()));
				if(xacNhanKhaoNghiem.getHinhThucThanhToan() == Constants.THANH_TOAN_CHUYEN_KHOAN){
			%>
					<p><a style="float: right;margin-top: -70px;margin-right: 100px;text-decoration: underline;" href="<%=xemNoidungHoaDon%>">Xem hóa đơn</a></p>
			<%	
				}else if(xacNhanThamDinh.getHinhThucThanhToan() == Constants.THANH_TOAN_KEYPAY){
					%>
					<p><a style="float: right;margin-top: -120px;margin-right: 100px;text-decoration: underline;" href="<%=xemNoidungHoaDon%>">Xem thông tin phí</a></p>
					<%
				}
			}
			%>
						
					<img class="lisths1" style="margin-top:-15px;" src="<%=request.getContextPath() %>/img/list.png"><p class="spectex"  style="margin-top:-15px;">Hướng dẫn nộp phí, lệ phí:</p><br>
					<p class="spectex2" style="margin-left:5%;"><span class="bold3">- Cách 1:</span> Doanh nghiệp thanh toán trực tuyến thông qua dịch vụ thanh toán trực tuyến</p>
					<p class="spectex2" style="margin-left:5%;"><span class="bold3">- Cách 2:</span> Doanh nghiệp chuyển khoản ngân hàng theo thông tin:</p><br>
				
				
					<div style="margin-top: -15px;">
						<p style="margin-left:10%;">Tên chủ tài khoản: <span class="bold3">Cục quản lý môi trường Y tế </span><br><p>
						<p style="margin-left:10%;">Số tài khoản: <span class="bold3">3511.0.1104195</span><br></p>
						<p style="margin-left:10%;">Tại: <span class="bold3">Kho bạc nhà nước quận Ba Đình- TP. hà Nội</span><br></p>
					</div>
				</div>
				<div class="btns_chuanbihs">
					<input class="button4" type="button" onclick="window.location.href='<%=backUrl.toString()%>'" value="Quay lại">
				</div>
			
			</aui:form>
	</div>
	<p style="clear:both;"></p>
</section>
<script type="text/javascript">
	function func_ShowMessage() {
		$('#messageDialog').dialog({
			title : 'Tình trạng Hồ sơ',
			resizable : false,
			modal : true,
			width : '500px',
			closeOnEscape : false,
			open : function() {
				jQuery('.ui-widget-overlay').bind('click', function() {
					$('#messageDialog').dialog('close');
				});
			}
		});
	}
	function func_uploadFile(idThanhPhanHoSo) {
		$('#upLoadFile_dialog_' + idThanhPhanHoSo).dialog({
			title : 'Upload file',
			resizable : false,
			modal : true,
			width : '1000px',
			closeOnEscape : false,
			open : function() {
				jQuery('.ui-widget-overlay').bind('click', function() {
					$('#upLoadFile_dialog_'+ idThanhPhanHoSo).dialog('close');
				});
			}
		});
	}
	
	function func_close_dialog(idThanhPhanHoSo) {
		$('#upLoadFile_dialog_'+ idThanhPhanHoSo).dialog('close');
	}

	function summitForm(url) {
		document.getElementById('<portlet:namespace />myForm').action = url;
		document.getElementById('<portlet:namespace />myForm').submit();
	}

	function summitPopupForm(url, thanhPhanHoSoId, bieuMauCount) {
		var booleanNoCheck = false;
		for(i = 0;i<bieuMauCount;i++) {
			if($('#select_' + thanhPhanHoSoId + '_' + i).is(":checked")) {
				booleanNoCheck = booleanNoCheck || true;
//				alert(booleanNoCheck + thanhPhanHoSoId);
//				$('#ID_THANH_PHAN_HO_SO').val($('#select_' + thanhPhanHoSoId + '_' + i).val());
				break;
			}
		}
		if(!booleanNoCheck){
//			alert(" chua chon loai bieu mau");
			return;
		} else{
//			alert("bat dau submit form");
			$('#popupForm_' + thanhPhanHoSoId).action = url;
//			alert(url);
//			alert('#popupForm_' + thanhPhanHoSoId);
//			document.getElementById('<portlet:namespace />popupForm_' + thanhPhanHoSoId).action = url;
			$('#popupForm_' + thanhPhanHoSoId).submit();
//			alert("end submit form");
		}
	}

</script>
<style>
.ui-dialog {
  top: 20% !important;
}
</style>
