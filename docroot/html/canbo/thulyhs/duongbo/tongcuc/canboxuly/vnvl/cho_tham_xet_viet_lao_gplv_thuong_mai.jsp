<%@page import="vn.dtt.duongbo.term.lienvan.QlvtLienVanTerm"%>
<%@page import="java.util.Arrays"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	QlvtThongTinHoSo ettThongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(Long.valueOf("0"+phieuXuLyId));
	QlvtThongTinXuLy ettThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+ettThongTinHoSo.getId()));
	QlvtXuLyGpLienVan gpkdvtLienVan = QlvtXuLyGpLienVanLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+ettThongTinXuLy.getId()));
	String headerInforCapMoi= "";
	if (Constants.VN_VL_LIENVAN_CAP_MOI.toString().contains(maThuTucHanhChinh)) {
		headerInforCapMoi = "moi";
	} else{
		headerInforCapMoi = "lai";
	}
	
%>

<div id="info">
	<aui:input type="hidden" name="inforId1" value="<%=ettThongTinHoSo.getId() %>"></aui:input>
	<aui:input type="hidden" name="inforId2" value="<%=ettThongTinXuLy.getId() %>"></aui:input>
	<aui:input type="hidden" name="inforId3" value="<%=gpkdvtLienVan.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QlvtLienVanTerm.THONG_TIN_HO_SO_ID %>" value="<%=ettThongTinHoSo.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QlvtLienVanTerm.THONG_TIN_XU_LY_ID %>" value="<%=ettThongTinXuLy.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QlvtLienVanTerm.ID %>" value="<%=gpkdvtLienVan.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QlvtLienVanTerm.MA_TUYEN %>" value=""></aui:input>
	<aui:input type="hidden" name="<%=QlvtLienVanTerm.MA_TUYENS %>" value=""></aui:input>
</div>

<div style="display: block;overflow: hidden;">
<%if(headerInforCapMoi.equals("moi")){ %>
	<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/header_moi.jspf"%>
<%}else{ %>
	<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/header_lai.jspf"%>
<%} %>
</div>
<div style="width: 350px; float: left;">
	<liferay-util:include page="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/cho_tham_xet_viet_lao_gplv_cap_moi_dv2.jsp" servletContext="<%=this.getServletContext() %>">
		<liferay-util:param name="xuLyPhuHieuId" value="<%=String.valueOf(gpkdvtLienVan.getId()) %>" />
		<liferay-util:param name="tq2" value="thuongmai" />
	</liferay-util:include>
	<span id="group-success-block"></span>
</div>


<div id="dv3">

</div>
<script type="text/javascript">
	
	function showHiddenDiv1(type) {
		if(type == 1){
			$('#divDat0').css("display", "block");
			$('#divKoDat0').css("display", "none");
		}else {
			$('#divDat0').css("display", "none");
			$('#divKoDat0').css("display", "block");
		}
		
	}
	function showHiddenDiv(type) {
		if(type == 1){
			$('#divDat').css("display", "block");
			$('#divKoDat').css("display", "none");
		}else {
			$('#divDat').css("display", "none");
			$('#divKoDat').css("display", "block");
		}
		
	}
</script>
<aui:script use="aui-io-request,aui-node">
var A = AUI();
AUI().use(
		  'aui-datepicker',
		  function(A) {
		    new A.DatePicker(
		      {
		        trigger: '#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_CAP_GPKD %>',
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
AUI().use(
		  'aui-datepicker',
		  function(A) {
		    new A.DatePicker(
		      {
		        trigger: '#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_HET_HAN_GPVT %>',
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
		
		AUI().use(
		  'aui-datepicker',
		  function(A) {
		    new A.DatePicker(
		      {
		        trigger: '#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_HET_HAN_GIAY_PHEP_LIEN_VAN %>',
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
		AUI().use(
				  'aui-datepicker',
				  function(A) {
				    new A.DatePicker(
				      {
				        trigger: '#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_CAP_LAN_DAU_GP_LV%>',
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
		
			AUI().use(
		  'aui-datepicker',
		  function(A) {
		    new A.DatePicker(
		      {
		        trigger: '#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_CAP_GIAY_PHEP_LIEN_VAN %>',
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
AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_CAP_GIAY_PHEP_LIEN_VAN%>').val('<%=Validator.isNotNull(gpkdvtLienVan.getNgayCapGiayPhepLienVan())?sdf.format(gpkdvtLienVan.getNgayCapGiayPhepLienVan()):StringPool.BLANK %>');
AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_CAP_LAN_DAU_GP_LV%>').val('<%=Validator.isNotNull(gpkdvtLienVan.getNgayCapGiayPhepLienVan_LanDau())?sdf.format(gpkdvtLienVan.getNgayCapGiayPhepLienVan_LanDau()):StringPool.BLANK %>');
AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_HET_HAN_GIAY_PHEP_LIEN_VAN%>').val('<%=Validator.isNotNull(gpkdvtLienVan.getNgayHetHanGiayPhepLienVan())?sdf.format(gpkdvtLienVan.getNgayHetHanGiayPhepLienVan()):StringPool.BLANK %>');
AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_CAP_GPKD%>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayCapDkkd())?sdf.format(ettThongTinHoSo.getNgayCapDkkd()):StringPool.BLANK %>');
AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_HET_HAN_GPVT%>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayHetHanDkkd())?sdf.format(ettThongTinHoSo.getNgayHetHanDkkd()):StringPool.BLANK %>');
</aui:script>   