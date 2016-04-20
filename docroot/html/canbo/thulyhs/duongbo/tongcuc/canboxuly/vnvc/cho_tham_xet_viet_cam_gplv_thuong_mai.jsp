<%@page import="java.util.Arrays"%>
<%@page import="vn.dtt.duongbo.term.lienvan.QlvtLienVanTerm"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy"%>
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
	<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvc/header_moi.jspf"%>
<%}else{ %>
	<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvc/header_lai.jspf"%>
<%} %>
</div>
<div style="width: 350px; float: left;">
	<liferay-util:include page="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvc/cho_tham_xet_viet_cam_gplv_cap_moi_dv2.jsp" servletContext="<%=this.getServletContext() %>">
		<liferay-util:param name="xuLyPhuHieuId" value="<%=String.valueOf(gpkdvtLienVan.getId()) %>" />
		<liferay-util:param name="tq2" value="thuongmai" />
	</liferay-util:include>
	<span id="group-success-block"></span>
</div>


<div id="dv3">

</div>
<aui:script>
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
        trigger: '#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_CAP_LAN_DAU_GP_LV %>',
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
AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_CAP_GIAY_PHEP_LIEN_VAN%>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayCapDkkd())?sdf.format(ettThongTinHoSo.getNgayCapDkkd()):StringPool.BLANK %>');
AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_CAP_GPKD%>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayCapDkkd())?sdf.format(ettThongTinHoSo.getNgayCapDkkd()):StringPool.BLANK %>');
AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_HET_HAN_GPVT%>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayHetHanDkkd())?sdf.format(ettThongTinHoSo.getNgayHetHanDkkd()):StringPool.BLANK %>');
AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_CAP_GIAY_PHEP_LIEN_VAN%>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayHetHanDkkd())?sdf.format(ettThongTinHoSo.getNgayHetHanDkkd()):StringPool.BLANK %>');
AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_HET_HAN_GIAY_PHEP_LIEN_VAN%>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayHetHanDkkd())?sdf.format(ettThongTinHoSo.getNgayHetHanDkkd()):StringPool.BLANK %>');
AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_CAP_LAN_DAU_GP_LV%>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayHetHanDkkd())?sdf.format(ettThongTinHoSo.getNgayHetHanDkkd()):StringPool.BLANK %>');
</aui:script>  