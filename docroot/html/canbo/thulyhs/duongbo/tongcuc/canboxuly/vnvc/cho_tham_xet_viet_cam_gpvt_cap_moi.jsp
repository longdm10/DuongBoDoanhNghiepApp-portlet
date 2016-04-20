<%@page import="vn.dtt.duongbo.term.quocte.QLVTQuocTeTerm"%>
<%@page import="vn.dtt.duongbo.dao.quocte.service.QlvtXuLyGpkdvtQuocTeLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%

QlvtThongTinHoSo ettThongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(Long.valueOf("0"+phieuXuLyId));
QlvtThongTinXuLy ettThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+ettThongTinHoSo.getId()));
QlvtXuLyGpkdvtQuocTe gpkdvtQuocTe = QlvtXuLyGpkdvtQuocTeLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+ettThongTinXuLy.getId()));
%>
<div id="info">
	<aui:input type="hidden" name="inforId1" value="<%=ettThongTinHoSo.getId() %>"></aui:input>
	<aui:input type="hidden" name="inforId2" value="<%=ettThongTinXuLy.getId() %>"></aui:input>
	<aui:input type="hidden" name="inforId3" value="<%=gpkdvtQuocTe.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTQuocTeTerm.THONG_TIN_HO_SO_ID %>" value="<%=ettThongTinHoSo.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTQuocTeTerm.THONG_TIN_XU_LY_ID %>" value="<%=ettThongTinXuLy.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTQuocTeTerm.ID %>" value="<%=gpkdvtQuocTe.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTQuocTeTerm.MA_TUYEN %>" value=""></aui:input>
	<aui:input type="hidden" name="<%=QLVTQuocTeTerm.MA_TUYENS %>" value=""></aui:input>
</div>
<div id="dv1">
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Thông tin người trực tiếp điều hành vận tải của Doanh nghiệp:" cssClass="textBold" inlineField="<%=true %>" >
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="1. Họ và tên: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.NGUOI_DAI_DIEN %>" value="<%=ettThongTinHoSo.getDaiDienDn() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Số CMND (hoặc Hộ chiếu): " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.SO_CMND_OR_HO_CHIEU %>" value="" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Ngày cấp: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.NGAY_CAP_CMND %>" value="" label="">

				</aui:input>  
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Nơi cấp " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.NOI_CAP_CMND %>" value="<%=ettThongTinHoSo.getLanCapGiayDangKyKinhDoanh() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Bằng cấp: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.BANG_CAP %>" value="<%=ettThongTinHoSo.getNgayCapDkkd() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="3 .Thời gian làm người trực tiếp điều hành vận tải của Doanh nghiệp từ: "  inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.THOI_GIAN_DIEU_HANH_TRUC_TIEP_DN_TU %>" value="" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Đến "  inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.THOI_GIAN_DIEU_HANH_TRUC_TIEP_DN_DEN %>" value="" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="4 .Số giấy phép "  inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.SO_GIAY_PHEP_CUA_NGUOI_DIEU_HANH %>" value="" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Cấp lần: "  inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.LAN_CAP_GIAY_PHEP_CUA_NGUOI_DIEU_HANH %>" value="" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="30">
			<aui:field-wrapper label="Ngày cấp"  inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.NGAY_CAP_GIAY_PHEP_CUA_NGUOI_DIEU_HANH %>" value="" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="30">
			<aui:field-wrapper label="Thời hạn từ "  inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.THOI_HAN_CAP_KINH_DOANH_VT_Tu %>" value="" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="30">
			<aui:field-wrapper label="Thời hạn đến "  inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.THOI_HAN_CAP_KINH_DOANH_VT_Den %>" value="" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<a href="#">Kiểm tra người điều hành</a>
	
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Đánh giá người trực tiếp điều hành vận tải của Doanh nghiệp:" cssClass="textBold" inlineField="<%=true %>" >
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
	<aui:col width="100">
		<aui:input type="radio" name="<%=QLVTQuocTeTerm.KET_QUA_DANH_GIA_NGUOI_DIEU_HANH_VAN_TAI %>" value="1" label="Đạt" inlineField="<%=true %>" ></aui:input>
		<aui:input type="radio" name="<%=QLVTQuocTeTerm.KET_QUA_DANH_GIA_NGUOI_DIEU_HANH_VAN_TAI %>" value="0" label="Không đạt" inlineField="<%=true %>" ></aui:input>
	</aui:col>
	
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Thông tin Giấy phép kinh doanh vận tải bằng xe ô tô:" cssClass="textBold" inlineField="<%=true %>" >
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Số: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.SO_GIAP_PHEP_VAN_TAI %>" value="<%=ettThongTinHoSo.getSoDkkd() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Ngày cấp: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.NGAY_CAP_GIAY_PHEP_VAN_TAI %>" value="<%=ettThongTinHoSo.getNgayCapDkkd() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Cơ quan cấp: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.CO_QUAN_CAP_GIAY_PHEP_VAN_TAI_ID %>" value="<%=ettThongTinHoSo.getCoQuanCapDkkd() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Niên hạn: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.NGAY_HET_HAN_GIAY_PHEP_VAN_TAI %>" value="<%=ettThongTinHoSo.getNgayHetHanDkkd() %>" label="">

				</aui:input>  
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Cấp lần: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.LAN_CAP_GIAY_DANG_KY_KINH_DOANH %>" value="<%=ettThongTinHoSo.getLanCapGiayDangKyKinhDoanh() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Ngày cấp lần đầu: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.NGAY_CAP_GIAY_PHEP_VAN_TAI %>" value="<%=ettThongTinHoSo.getNgayCapDkkd() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>

	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Đánh giá Giấy phép kinh doanh vận tải bằng xe ô tô:" cssClass="textBold" inlineField="<%=true %>" >
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:col width="100">
		<aui:input type="radio" name="<%=QLVTQuocTeTerm.KET_QUA_DANH_GIA_NGUOI_DIEU_HANH_VAN_TAI %>" value="1" label="Đạt" inlineField="<%=true %>" ></aui:input>
		<aui:input type="radio" name="<%=QLVTQuocTeTerm.KET_QUA_DANH_GIA_NGUOI_DIEU_HANH_VAN_TAI %>" value="0" label="Không đạt" inlineField="<%=true %>" onClick="showHiddenDiv1(0);" ></aui:input>
	</aui:col>
	
	<div id="divKoDat"style="display: none;margin-left: 20%;">
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Lý do" inlineField="<%=true %>" >
				<aui:input type="textarea" name="<%=QLVTQuocTeTerm.LY_DO_KHONG_DAT %>" value="<%=gpkdvtQuocTe.getLyDoKhongDat() %>" cssClass="myTextArea">
				</aui:input>
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
</div>
	
</aui:row>
<div id="divDat0" style="display: none;margin-left: 20%;">
	
</div>
<div id="divKoDat0"style="display: none;margin-left: 20%;">
	<aui:input type="textarea" name="" cssClass="myTextArea"></aui:input>
</div>

</div>
<div style="width: 350px; float: left;">
	<liferay-util:include page="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvc/cho_tham_xet_viet_cam_qpvt_cap_moi_dv2.jsp" servletContext="<%=this.getServletContext() %>">
		<liferay-util:param name="xuLyPhuHieuId" value="<%=String.valueOf(gpkdvtQuocTe.getId()) %>" />
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
        trigger: '#<portlet:namespace /><%=QLVTQuocTeTerm.NGAY_CAP_GIAY_PHEP_VAN_TAI %>',
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
        trigger: '#<portlet:namespace /><%=QLVTQuocTeTerm.NGAY_CAP_CMND %>',
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
        trigger: '#<portlet:namespace /><%=QLVTQuocTeTerm.THOI_GIAN_DIEU_HANH_TRUC_TIEP_DN_TU %>',
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
        trigger: '#<portlet:namespace /><%=QLVTQuocTeTerm.THOI_GIAN_DIEU_HANH_TRUC_TIEP_DN_DEN %>',
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
        trigger: '#<portlet:namespace /><%=QLVTQuocTeTerm.NGAY_CAP_GIAY_PHEP_CUA_NGUOI_DIEU_HANH %>',
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
AUI().one('#<portlet:namespace /><%=QLVTQuocTeTerm.NGAY_CAP_GIAY_PHEP_VAN_TAI%>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayCapDkkd())?sdf.format(ettThongTinHoSo.getNgayCapDkkd()):StringPool.BLANK %>');
</aui:script>  