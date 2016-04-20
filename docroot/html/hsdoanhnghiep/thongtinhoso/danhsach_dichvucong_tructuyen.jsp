<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="vn.dtt.duongbo.portlet.doanhnghiep.DoanhNghiepAction"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.utils.StringUtils"%>
<%@page import="java.util.List"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%! private static Log _log = LogFactoryUtil.getLog(DoanhNghiepAction.class); %>

<%
	_log.info("----in html/hsdoanhnghiep/thongtinhoso/danhsach_dichvucong_tructuyen.jsp");
	//String hoSoThuTucId = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
	
	List<DmDataItem> allLinhVucThuTucMuc0 = DmDataItemLocalServiceUtil.findByGroupIdAndChaCode(Constants.DM_LINH_VUC_TTHC,null);
	if (allLinhVucThuTucMuc0 == null) {
		allLinhVucThuTucMuc0 = new ArrayList<DmDataItem>();
	}
	List<DmDataItem> allLinhVucThuTucMuc1 = null;
	List<DmDataItem> allLinhVucThuTucMuc2 = null;
	List<DmDataItem> allLinhVucThuTucMuc3 = null;
	List<DmDataItem> allLinhVucThuTucMuc4 = null;
	List<DmDataItem> allLinhVucThuTucMuc5 = null;
	
	List<TthcThuTucHanhChinh> allThuTucHanhChinh = null;
	TthcThuTucHanhChinh thuTucHanhChinh = null;
	DmDataItem linhVucThuTuc = null;
	String thanhPhanHoSoJsp = "";
%>
<h4 class="PL15 BGT BOB font14 col-xs-12">Danh sách dịch vụ công trực tuyến</h4>
<div class="P10 col-xs-12">
	<div class="BGT noidung">
		<div class="col-xs-12 m-panel p-active">
		<%
		for (int i = 0; i < allLinhVucThuTucMuc0.size(); i++) {
			linhVucThuTuc = allLinhVucThuTucMuc0.get(i);
		//	_log.info("----linhVucThuTuc: " + linhVucThuTuc.getCode() + "-----------:" + linhVucThuTuc.getName());
			if(linhVucThuTuc.getNode2() != null && linhVucThuTuc.getNode2().trim().equals(Constants.LVTT_HAS_TTHC)){
		%>
				<!-- noi dung chuc nang thutuchanhchinh -->
				<%@ include file="/html/hsdoanhnghiep/thongtinhoso/dichvucong_content.jsp"%>
		<%
			} else if(linhVucThuTuc.getNode2() != null && linhVucThuTuc.getNode2().trim().equals(Constants.LVTT_CHI_MUC)){
				%>
				<h5 class="outer"><i class="m-symbol fa fa-plus-square-o" style="margin-right:5px"></i><b><%=linhVucThuTuc.getNode3()%> <%=linhVucThuTuc.getName() %></b></h5>
				<div class="ML20 m-panel" >
				<%
				allLinhVucThuTucMuc1 = DmDataItemLocalServiceUtil.findByGroupIdAndChaCode(Constants.DM_LINH_VUC_TTHC, linhVucThuTuc.getCode());
				//_log.info("===allLinhVucThuTucMuc1==="+Constants.DM_LINH_VUC_TTHC + "===" + linhVucThuTuc.getCode() + "===" + allLinhVucThuTucMuc1.size());
				if(allLinhVucThuTucMuc1 != null && allLinhVucThuTucMuc1.size() > 0){
					for (int j = 0; j < allLinhVucThuTucMuc1.size(); j++) {
						linhVucThuTuc = allLinhVucThuTucMuc1.get(j);
				//		_log.info("----linhVucThuTuc1: " + linhVucThuTuc.getCode() + "--: " + linhVucThuTuc.getNode2() + " ------:" + linhVucThuTuc.getName());
						if(linhVucThuTuc.getNode2() != null && linhVucThuTuc.getNode2().trim().equals(Constants.LVTT_HAS_TTHC)){
							//_log.info("----sao lai vao TTHC---------------");
							%>
									<!-- noi dung chuc nang thutuchanhchinh -->
									<%@ include file="/html/hsdoanhnghiep/thongtinhoso/dichvucong_content.jsp"%>
							<%
						} else if(linhVucThuTuc.getNode2() != null && linhVucThuTuc.getNode2().trim().equals(Constants.LVTT_CHI_MUC)){
							%>
							<p class="outer"><b><i class="m-symbol fa fa-plus-square-o" style="margin-right:5px"></i><%=linhVucThuTuc.getNode3()%> <%=linhVucThuTuc.getName() %></b></b></p>
							<div class="ML20 m-panel" >
							<%
							allLinhVucThuTucMuc2 = DmDataItemLocalServiceUtil.findByGroupIdAndChaCode(Constants.DM_LINH_VUC_TTHC, linhVucThuTuc.getCode());
							if(allLinhVucThuTucMuc2 != null && allLinhVucThuTucMuc2.size() > 0){
								for (int k = 0; k < allLinhVucThuTucMuc2.size(); k++) {
									linhVucThuTuc = allLinhVucThuTucMuc2.get(k);
			//						_log.info("----linhVucThuTuc2: " + linhVucThuTuc.getName());
									if(linhVucThuTuc.getNode2() != null && linhVucThuTuc.getNode2().trim().equals(Constants.LVTT_HAS_TTHC)){
										%>
												<!-- noi dung chuc nang thutuchanhchinh -->
												<%@ include file="/html/hsdoanhnghiep/thongtinhoso/dichvucong_content.jsp"%>
										<%
									} else if(linhVucThuTuc.getNode2() != null && linhVucThuTuc.getNode2().trim().equals(Constants.LVTT_CHI_MUC)){
										%>
										<p class="outer"><b><i class="m-symbol fa fa-plus-square-o" style="margin-right:5px"></i><%=linhVucThuTuc.getNode3()%> <%=linhVucThuTuc.getName() %></b></b></p>
										<div class="ML20 m-panel">
										<%
										allLinhVucThuTucMuc3 = DmDataItemLocalServiceUtil.findByGroupIdAndChaCode(Constants.DM_LINH_VUC_TTHC, linhVucThuTuc.getCode());
										if(allLinhVucThuTucMuc3 != null && allLinhVucThuTucMuc3.size() > 0){
											for (int m = 0; m < allLinhVucThuTucMuc3.size(); m++) {
												linhVucThuTuc = allLinhVucThuTucMuc3.get(m);
												if(linhVucThuTuc.getNode2() != null && linhVucThuTuc.getNode2().trim().equals(Constants.LVTT_HAS_TTHC)){
													%>
															<!-- noi dung chuc nang thutuchanhchinh -->
															<%@ include file="/html/hsdoanhnghiep/thongtinhoso/dichvucong_content.jsp"%>
													<%
												} else if(linhVucThuTuc.getNode2() != null && linhVucThuTuc.getNode2().trim().equals(Constants.LVTT_CHI_MUC)){
													%>
													<p class="outer"><b><i class="m-symbol fa fa-plus-square-o" style="margin-right:5px"></i><%=linhVucThuTuc.getNode3()%> <%=linhVucThuTuc.getName() %></b></b></p>
													<div class="ML20 m-panel">
													<%
													allLinhVucThuTucMuc4 = DmDataItemLocalServiceUtil.findByGroupIdAndChaCode(Constants.DM_LINH_VUC_TTHC, linhVucThuTuc.getCode());
													if(allLinhVucThuTucMuc4 != null && allLinhVucThuTucMuc4.size() > 0){
														for (int n = 0; n < allLinhVucThuTucMuc4.size(); n++) {
															linhVucThuTuc = allLinhVucThuTucMuc4.get(n);
															if(linhVucThuTuc.getNode2() != null && linhVucThuTuc.getNode2().trim().equals(Constants.LVTT_HAS_TTHC)){
																%>
																		<!-- noi dung chuc nang thutuchanhchinh -->
																		<%@ include file="/html/hsdoanhnghiep/thongtinhoso/dichvucong_content.jsp"%>
																<%
															} else if(linhVucThuTuc.getNode2() != null && linhVucThuTuc.getNode2().trim().equals(Constants.LVTT_CHI_MUC)){
																%>
																	<p class="outer"><b><i class="m-symbol fa fa-plus-square-o" style="margin-right:5px"></i><%=linhVucThuTuc.getNode3()%> <%=linhVucThuTuc.getName() %></b></b></p>
																	<div class="ML20 m-panel">
																<%
																allLinhVucThuTucMuc5 = DmDataItemLocalServiceUtil.findByGroupIdAndChaCode(Constants.DM_LINH_VUC_TTHC, linhVucThuTuc.getCode());
																if(allLinhVucThuTucMuc5 != null && allLinhVucThuTucMuc5.size() > 0){
																	for (int l = 0; l < allLinhVucThuTucMuc5.size(); l++) {
																		linhVucThuTuc = allLinhVucThuTucMuc5.get(l);
																		if(linhVucThuTuc.getNode2() != null && linhVucThuTuc.getNode2().trim().equals(Constants.LVTT_HAS_TTHC)){
																			%>
																				<!-- noi dung chuc nang thutuchanhchinh -->
																				<%@ include file="/html/hsdoanhnghiep/thongtinhoso/dichvucong_content.jsp"%>
																			<%
																		} 
																	}
																}
																%>
																</div>
																<%
															}
														}
													}
													%>
													</div>
													<%
													
												}
											}
										}
										%>
										</div>
										<%
										
									}
								}
							}
							%>
							</div>
							<%
							
						}
					}
				}
				%>
				</div>
				<%
				
			}
		}
		%>
		</div>
	</div><!----end noidung------->
</div>

<script type="text/javascript">
	$(function()   {
	    $(".m-symbol").click(function(e) {
	        e.preventDefault();
	        //$(this).next('div.m-panel').toggle();
	        $(this).closest('.outer').next('div.m-panel').toggle();
	    });
	});

	$('.m-symbol').click(function() {
	    $(this).toggleClass('fa-minus-square-o');
	    $(this).toggleClass('fa-plus-square-o');
	});
</script>

