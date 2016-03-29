<%@page import="vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoBieuMauImpl"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcBieuMauHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoBieuMauLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcTrangThaiHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcTrangThaiHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.duongbo.utils.config.DuongBoConfigurationManager"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>


<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<link rel="stylesheet" href="<%=request.getContextPath()%>/css/tipsy.css" type="text/css" media="screen" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/jquery.alerts.css" type="text/css" media="screen" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/jquery-ui.css" type="text/css" media="screen" />

<%
long userId = PortalUtil.getUserId(request);

long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
String listNoiDungHoSo = ParamUtil.getString(request, "listNoiDungHoSo");

List<TthcHoSoThuTuc> allHoSoThuTuc = null;
TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
TthcTrangThaiHoSo trangThaiHoSo = null;

String maTPHSBuoc2 = DuongBoConfigurationManager.getStrProp("vn.dtt.ma.thanhphanhs.buoc.2", "TPHS-5");

List<TthcThanhPhanHoSo> allThanhPhanHoSoCanBoTraVe = TthcThanhPhanHoSoLocalServiceUtil.findByThutucHanhChinhIdAndLoaiThanhPhan(String.valueOf(thuTucHanhChinhId), "4");

List<TthcThanhPhanHoSo> allThanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.findByThutucHanhChinhIdAndLoaiThanhPhan(String.valueOf(thuTucHanhChinhId),"1,2,3");
TthcThanhPhanHoSo thanhPhanHoSo = null;
List<TthcThanhPhanHoSoBieuMau> allThanhPhanHoSoBieuMau = null;
TthcThanhPhanHoSoBieuMau thanhPhanHoSoBieuMau = null;
List<TthcBieuMauHoSo> allBieuMauHoSo = null;
TthcBieuMauHoSo bieuMauHoSo = null;
List<TthcNoidungHoSo> allNoiDungHoSo = null;
TthcNoidungHoSo noidungHoSoTmp = null;
long idThanhPhanHoSoTrucTuyen = 0;
boolean daCoMauTrucTuyen = false;

String formTrucTuyen = "";
if (allThanhPhanHoSo != null && allThanhPhanHoSo.size() > 0) {
	for (int i = 0; i < allThanhPhanHoSo.size(); i++) {
		thanhPhanHoSo = allThanhPhanHoSo.get(i);
		if (thanhPhanHoSo.getMauTrucTuyen() != null && thanhPhanHoSo.getMauTrucTuyen().trim().length() > 0) {
			formTrucTuyen = thanhPhanHoSo.getMauTrucTuyen().trim();
			break;
		}
	}
	thanhPhanHoSo = null;
}


TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(thuTucHanhChinhId);

long payAmount = 0;

DmDataItem linhVuc = null;
String tenLinhVuc = "";
if (thuTucHanhChinh != null) {
	linhVuc = DmDataItemLocalServiceUtil.findByGroupIdAndItemCode(Constants.DM_LINH_VUC_TTHC, thuTucHanhChinh.getLinhVucThuTuc().trim());
	if(linhVuc != null) {
		tenLinhVuc = linhVuc.getName();
	}
}



PortletURL actionLuuNhapHoSo = renderResponse.createActionURL();
actionLuuNhapHoSo.setParameter(ActionRequest.ACTION_NAME, "luuNhapHoSo");
actionLuuNhapHoSo.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
actionLuuNhapHoSo.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));

PortletURL actionLuuHoSo = renderResponse.createActionURL();
actionLuuHoSo.setParameter(ActionRequest.ACTION_NAME, "luuHoSo");
actionLuuHoSo.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
actionLuuHoSo.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));

PortletURL actionNopHoSo = renderResponse.createActionURL();
actionNopHoSo.setParameter(ActionRequest.ACTION_NAME, "nopHoSo");
actionNopHoSo.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
actionNopHoSo.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));

PortletURL actionNopHoSoBoSung = renderResponse.createActionURL();
actionNopHoSoBoSung.setParameter(ActionRequest.ACTION_NAME, "nopHoSoBoSung");
actionNopHoSoBoSung.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
actionNopHoSoBoSung.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));


PortletURL actionHuyHoSoNhap = renderResponse.createActionURL();
actionHuyHoSoNhap.setParameter(ActionRequest.ACTION_NAME, "huyHoSoNhap");
actionHuyHoSoNhap.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
actionHuyHoSoNhap.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
actionHuyHoSoNhap.setParameter("listNoiDungHoSo", listNoiDungHoSo);

PortletURL actionUploadFileBieuMau = renderResponse.createActionURL();
actionUploadFileBieuMau.setParameter(ActionRequest.ACTION_NAME, "upLoadFileBieuMau");
actionUploadFileBieuMau.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
actionUploadFileBieuMau.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
actionUploadFileBieuMau.setParameter("listNoiDungHoSo", listNoiDungHoSo);

PortletURL thanhPhanHoSoUrl = renderResponse.createRenderURL();
thanhPhanHoSoUrl.setParameter("jspPage", "/html/canbo/thulyhs/duongbo/thongtinhoso/vantaitrongnuoc/phuhieu/thanh_phan_ho_so.jsp");
thanhPhanHoSoUrl.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
thanhPhanHoSoUrl.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));

/*
PortletURL thanhToanTrucTuyenUrl = renderResponse.createRenderURL();
thanhToanTrucTuyenUrl.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/ipay/thanh_toan_truc_tuyen.jsp");
thanhToanTrucTuyenUrl.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
thanhToanTrucTuyenUrl.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
thanhToanTrucTuyenUrl.setParameter("listNoiDungHoSo", listNoiDungHoSo);
thanhToanTrucTuyenUrl.setParameter(Constants.VPC_AMOUNT, String.valueOf(payAmount));

PortletURL thanhToanHoaDonUrl = renderResponse.createRenderURL();
thanhToanHoaDonUrl.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/ipay/thanh_toan_hoa_don.jsp");
thanhToanHoaDonUrl.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
thanhToanHoaDonUrl.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
thanhToanHoaDonUrl.setParameter("listNoiDungHoSo", listNoiDungHoSo);
thanhToanHoaDonUrl.setParameter(Constants.VPC_AMOUNT, String.valueOf(payAmount));
*/
PortletURL backUrl = renderResponse.createRenderURL();
backUrl.setParameter("jspPage", "/html/hsdoanhnghiep/view.jsp");

String popupFormName = "";
String radioCheck = "";
boolean isDatDieuKienBuoc2 = false; 

%>
<aui:form action="<%=actionLuuNhapHoSo.toString()%>" name="myForm" id="myForm" method="POST">
<h4 class="PL15 BGT BOB font14 col-xs-12">Thành phần hồ sơ</h4>
<div class="P10 col-xs-12">
	<div class="BGT noidung">
		<div class="col-xs-12">
			<!-- Thành phần hồ sơ -->
			<table class="table table-striped table-bordered table-hover">
				<tbody>
					<tr>
						<th width="4%">STT</th>
						<th width="6%"></th>
						<th width="59%">Thành phần hồ sơ</th>
						<th width="31%">Ghi chú</th>
					</tr>
					
					<%
					if (allThanhPhanHoSo != null && allThanhPhanHoSo.size() > 0) {
						String srcImage = "";
						String srcImageThaoTacEditUpload = "";
						String srcImageThaoTacEditUploadUpdate = "";
						String srcImageThaoTacEditUploadReplace = "";
						
						boolean isRequired = false;
						for (int i = 0; i < allThanhPhanHoSo.size(); i++) {
							thanhPhanHoSo = allThanhPhanHoSo.get(i);
							allNoiDungHoSo = TthcNoidungHoSoLocalServiceUtil.findByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId, thanhPhanHoSo.getId());
							
							if (thanhPhanHoSo.getLoaiThanhPhan() == Constants.THANH_PHAN_HO_SO_BO_XUNG) {
								isRequired = false;
								if (thanhPhanHoSo.getMauTrucTuyen() != null && thanhPhanHoSo.getMauTrucTuyen().trim().length() > 0) {
									srcImage = request.getContextPath() + "/img/i5.png";
									srcImageThaoTacEditUpload = request.getContextPath() + "/img/nhap-don.png";
									srcImageThaoTacEditUploadUpdate = request.getContextPath() + "/img/upload.png";
								} else {
									srcImage = request.getContextPath() + "/img/i7.png";
									srcImageThaoTacEditUpload = request.getContextPath() + "/img/upload.png";
									srcImageThaoTacEditUploadUpdate = request.getContextPath() + "/img/i11.png";
									srcImageThaoTacEditUploadReplace = request.getContextPath() + "/img/i12.png";
								}
							} else {
								if (thanhPhanHoSo.getLoaiThanhPhan() == Constants.THANH_PHAN_HO_SO_BAT_BUC) {
									isRequired = true;
								} else {
									isRequired = false;
								}
								if (thanhPhanHoSo.getMauTrucTuyen() != null && thanhPhanHoSo.getMauTrucTuyen().trim().length() > 0) {
									idThanhPhanHoSoTrucTuyen = thanhPhanHoSo.getId();
									srcImage = request.getContextPath() + "/img/i6.png";
									srcImageThaoTacEditUpload = request.getContextPath() + "/img/nhap-don.png";
									srcImageThaoTacEditUploadUpdate = request.getContextPath() + "/img/upload.png";
									
								} else {
									srcImage = request.getContextPath() + "/img/i8.png";
									srcImageThaoTacEditUpload = request.getContextPath() + "/img/upload.png";
									srcImageThaoTacEditUploadUpdate = request.getContextPath() + "/img/i11.png";
									srcImageThaoTacEditUploadReplace = request.getContextPath() + "/img/i12.png";
								}
								if (allNoiDungHoSo != null && allNoiDungHoSo.size() > 0) {
									srcImage = request.getContextPath() + "/img/icon_finish.png";
								}
							}
							
							%>
							<tr>
								<td class="text-center"><%=i + 1%></td>
								<td class="text-center"><a><img src="<%=srcImage %>"></a></td>
								<%
								String tagLinkString = "";
								
								if (thanhPhanHoSo.getMauTrucTuyen() != null && thanhPhanHoSo.getMauTrucTuyen().trim().length() > 0) {
									%>
									<td class="sp" style="word-wrap: break-word;">
										<%
										if (allNoiDungHoSo != null && allNoiDungHoSo.size() > 0) {
											noidungHoSoTmp = allNoiDungHoSo.get(0);
											PortletURL xemNoidungFileDinhKem = renderResponse.createRenderURL();
											xemNoidungFileDinhKem.setParameter("jspPage", "/html/canbo/thulyhs/duongbo/thongtinhoso/vantaitrongnuoc/phuhieu/view_thong_tin_mau_don.jsp");
											xemNoidungFileDinhKem.setParameter("backUrl", "/html/canbo/thulyhs/duongbo/thongtinhoso/vantaitrongnuoc/phuhieu/thanh_phan_ho_so_view.jsp");
											xemNoidungFileDinhKem.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
											xemNoidungFileDinhKem.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
											xemNoidungFileDinhKem.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSo.getId()));
											xemNoidungFileDinhKem.setParameter("listNoiDungHoSo", listNoiDungHoSo);
											xemNoidungFileDinhKem.setParameter(Constants.ID_NOI_DUNG_HO_SO, String.valueOf(noidungHoSoTmp.getId()));
											tagLinkString = "<br><a href='"+xemNoidungFileDinhKem.toString()+"' title='Xem nội dung giấy tờ'>" + "<span style='font-family:Arial;font-size:13px;font-weight:normal;font-style:italic;text-decoration:underline;color:#0000FF;'>" + "-" + noidungHoSoTmp.getTenTaiLieu() + "</span>" + "</a>";
											if (noidungHoSoTmp.getTaiLieuDinhKem() > 0) {
												%>
												<a href="<%=xemNoidungFileDinhKem.toString()%>" title="Xem nội dung giấy tờ"><%=thanhPhanHoSo.getTenThanhPhan() %> <%=((isRequired) ? "<span class='red'>*</span>" : "") %></a><br />
												<%=tagLinkString %>
											<%
											} else {
											%>
												<a href="<%=xemNoidungFileDinhKem.toString()%>" title="Xem nội dung giấy tờ"><%=thanhPhanHoSo.getTenThanhPhan() %> <%=((isRequired) ? "<span class='red'>*</span>" : "") %></a><br />
											<%
											}
										} else {
											%>
											<%=thanhPhanHoSo.getTenThanhPhan() %> <span class='red'>*</span>
											<%
										}
										%>
									</td>
									<td class="sp"></td>
								<%
								} else {
									if (allNoiDungHoSo != null && allNoiDungHoSo.size() > 0) {
										for (int k = 0; k < allNoiDungHoSo.size(); k++) {
											PortletURL xemNoidungFileDinhKem = renderResponse.createRenderURL();
											xemNoidungFileDinhKem.setParameter("jspPage", "/html/canbo/thulyhs/duongbo/thongtinhoso/vantaitrongnuoc/phuhieu/view_thong_tin_mau_don.jsp");
											xemNoidungFileDinhKem.setParameter("backUrl", "/html/canbo/thulyhs/duongbo/thongtinhoso/vantaitrongnuoc/phuhieu/thanh_phan_ho_so_view.jsp");
											xemNoidungFileDinhKem.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
											xemNoidungFileDinhKem.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
											xemNoidungFileDinhKem.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSo.getId()));
											xemNoidungFileDinhKem.setParameter("listNoiDungHoSo", listNoiDungHoSo);
											noidungHoSoTmp = allNoiDungHoSo.get(k);
											xemNoidungFileDinhKem.setParameter(Constants.ID_NOI_DUNG_HO_SO, String.valueOf(noidungHoSoTmp.getId()));
											tagLinkString = tagLinkString + "<br><a href='"+xemNoidungFileDinhKem.toString()+"' title='Xem nội dung giấy tờ'>" + "<span style='font-family:Arial;font-size:13px;font-weight:normal;font-style:italic;text-decoration:underline;color:#0000FF;'>" + "-" + noidungHoSoTmp.getTenTaiLieu() + "</span>" + "</a>";
										}
									}
									if (thanhPhanHoSo.getLoaiThanhPhan() != 4) {
										
									%>
									<td class="sp" style="word-wrap: break-word;"><%=thanhPhanHoSo.getTenThanhPhan() + ((isRequired) ? "<span class='red'>*</span>" : "") + ((allNoiDungHoSo != null && allNoiDungHoSo.size() > 0) ? (tagLinkString) : "")%></td>
									<td class="sp" style="word-wrap: break-word;"></td>
									<%	
									} else {
									%>
										<td class="sp"><%=thanhPhanHoSo.getTenThanhPhan() + ((isRequired) ? "<span class='red'>*</span>" : "") + ((allNoiDungHoSo != null && allNoiDungHoSo.size() > 0) ? (tagLinkString) : "")%></td>
										<td class="sp"></td>
									<%}
								}
								%>
							</tr>
							<%
						}
					}
					%>
				</tbody>
			</table>
			
		</div>
		<div class="col-xs-12">
			<button class="btn btn-primary" type="button" onclick="summitForm('<%=backUrl.toString()%>')">Quay lại</button>
		</div>
		<div class="clear"></div>
	</div><!----end noidung------->
</div>
</aui:form>



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
		$('#upLoadFile_dialog_' + idThanhPhanHoSo).modal('show');
		/**
		$('#upLoadFile_dialog_' + idThanhPhanHoSo).dialog({
			title : 'Tải biểu mẫu',
			resizable : false,
			modal : true,
			width : '700px',
			closeOnEscape : false,
			open : function() {
				jQuery('.ui-widget-overlay').bind('click', function() {
					$('#upLoadFile_dialog_'+ idThanhPhanHoSo).dialog('close');
				});
			}
		});
		*/
	}
	
	function uploadFilePopup(idThanhPhanHoSo) {
		var idTrucTuyen = <%=idThanhPhanHoSoTrucTuyen%>;
		var daCoTrucTuyen = <%=daCoMauTrucTuyen%>;
		if((idTrucTuyen == idThanhPhanHoSo) && (!daCoTrucTuyen)){
			alert("Chưa nhập mẫu trực tuyến");
			return false;
		} else{
			
			$('#ID_THANH_PHAN_HO_SO_' + idThanhPhanHoSo).val(idThanhPhanHoSo);
			func_uploadFile(idThanhPhanHoSo);
		}
	}

	function func_close_dialog(idThanhPhanHoSo) {
		$('#upLoadFile_dialog_'+ idThanhPhanHoSo).dialog('close');
	}

	function summitForm(url) {
		document.getElementById('<portlet:namespace />myForm').action = url;
		document.getElementById('<portlet:namespace />myForm').submit();
	}

	

	function summitPopupForm(url, thanhPhanHoSoId, bieuMauCount) {
		var fileUpl = document.getElementById("attachment_" + thanhPhanHoSoId).value;
		var fileInput = document.getElementById("attachment_" + thanhPhanHoSoId);
		var tenTaiLieu = document.getElementById("tenTaiLieu_" + thanhPhanHoSoId).value;
		var maxSize = 10485760;
		
		var booleanNoCheck = false;
		for(i = 0;i<bieuMauCount;i++) {
			if($('#select_' + thanhPhanHoSoId + '_' + i).is(":checked")) {
				booleanNoCheck = true;
//				alert(booleanNoCheck + thanhPhanHoSoId);
//				$('#ID_THANH_PHAN_HO_SO').val($('#select_' + thanhPhanHoSoId + '_' + i).val());
				break;
			}
		}

		if(tenTaiLieu.trim().length > 255){
			alert(" Tên tài liệu quá dài");
			return false;
		}
		
		if(!booleanNoCheck){
			alert(" Chưa chọn loại biểu mẫu");
			return;
		} else{
			
			if(fileUpl == ''){
				
				alert("Chưa chọn tệp tải lên");
				$('.progress').hide();
				
				return;
			} else{
				if(fileInput.files[0].size >= maxSize){
					alert("Dung lượng file lớn hơn 20Mb");
					$('.progress').hide();
					return;
				} else{
				    $('.progress').show();
					$('#popupForm_' + thanhPhanHoSoId).action = url;
//					alert(url);
//					alert('#popupForm_' + thanhPhanHoSoId);
//					document.getElementById('<portlet:namespace />popupForm_' + thanhPhanHoSoId).action = url;
					$('#popupForm_' + thanhPhanHoSoId).submit();
//					alert("end submit form");
				}
				
			}
			
		}
	}

/*
	function func_uploadFileNormal() {
		$("#upLoadFileNormal_dialog").dialog({
			title : 'Upload file',
			resizable : false,
			modal : true,
			width : '500px',

			closeOnEscape : false,
			open : function() {
				jQuery('.ui-widget-overlay').bind('click', function() {
					$('#upLoadFileNormal_dialog').dialog('close');
				});
			}
		});
	}

	function func_uploadFileWithLoaiBieuMau() {
		$("#upLoadFileWithLoaiBieuMau_dialog").dialog({
			title : 'Upload file',
			resizable : false,
			modal : true,
			width : '500px',

			closeOnEscape : false,
			open : function() {
				jQuery('.ui-widget-overlay').bind('click', function() {
					$('#upLoadFileWithLoaiBieuMau_dialog').dialog('close');
				});
			}
		});
	}

	function uploadFilePopup(isNornal, idThanhPhanHoSo) {
		document.getElementById('ID_THANH_PHAN_HO_SO').value=idThanhPhanHoSo;
		if (isNornal == 'true') {
			func_uploadFileNormal();
		} else if (isHide == 'true') {
			func_uploadFileWithLoaiBieuMau();
		}
	}
	*/
	
	
	/*	
	function summitForm(url, idThanhPhanHoSo) {
		document.getElementById('<portlet:namespace />myForm').action = url;
		var thanhPhanHoSoVar = document.createElement('input');
		thanhPhanHoSoVar.type = 'hidden';
		thanhPhanHoSoVar.name = '<portlet:namespace />ID_THANH_PHAN_HO_SO';
		thanhPhanHoSoVar.value = idThanhPhanHoSo;
		document.getElementById('<portlet:namespace />myForm').appendChild(thanhPhanHoSoVar);
		document.getElementById('<portlet:namespace />myForm').submit();
	}
*/
</script>
<style>
.spectex2 {
	margin-top: -10px;
}

.aui p {
	margin: 0 0 0;
}

.ui-dialog {
	top: 20% !important;
}

.custom-file-input::-webkit-file-upload-button {
	visibility: hidden;
}

.custom-file-input::before {
	content: 'Upload';
	display: inline-block;
	background: #4376ca;
	border: none;
	border-radius: 3px;
	padding: 5px 12px;
	outline: none;
	white-space: nowrap;
	-webkit-user-select: none;
	cursor: pointer;
	font-weight: 700;
	font-size: 10pt;
	color: white;
}

@-webkit-keyframes progress-bar-stripes {
    from {
        background-position:40px 0 !important
    }
    to {
        background-position:0 0 !important
    }
}
@-o-keyframes progress-bar-stripes {
    from {
        background-position:40px 0 !important
    }
    to {
        background-position:0 0 !important
    }
}
@keyframes progress-bar-stripes {
    from {
        background-position:40px 0 !important
    }
    to {
        background-position:0 0 !important
    }
}
.progress {
    height:20px !important;
    margin:10px 0 15px 20px !important;
    overflow:hidden !important;
    background-color:#f5f5f5 !important;
    border-radius:4px !important;
    -webkit-box-shadow:inset 0 1px 2px rgba(0, 0, 0, .1) !important;
    box-shadow:inset 0 1px 2px rgba(0, 0, 0, .1) !important
}
.progress-bar {
    float:left !important;
    width:0;
    height:100% !important;
    font-size:12px !important;
    line-height:20px !important;
    color:#fff !important;
    text-align:center !important;
    background-color:#337ab7 !important;
    -webkit-box-shadow:inset 0 -1px 0 rgba(0, 0, 0, .15) !important;
    box-shadow:inset 0 -1px 0 rgba(0, 0, 0, .15) !important;
    -webkit-transition:width .6s ease !important;
    -o-transition:width .6s ease !important;
    transition:width .6s ease !important
}
.progress-bar-striped, .progress-striped .progress-bar {
    background-image:-webkit-linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent) !important;
    background-image:-o-linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent) !important;
    background-image:linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent) !important;
    -webkit-background-size:40px 40px !important;
    background-size:40px 40px !important
}
.progress-bar.active4, .progress.active4 .progress-bar {
    -webkit-animation:progress-bar-stripes 2s linear infinite !important;
    -o-animation:progress-bar-stripes 2s linear infinite !important;
    animation:progress-bar-stripes 2s linear infinite !important
}
</style>
