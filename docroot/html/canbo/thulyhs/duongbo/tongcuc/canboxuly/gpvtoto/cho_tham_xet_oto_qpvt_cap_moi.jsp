<%@page import="vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo"%>
<%@page import="vn.dtt.duongbo.term.noidia.QLVTNoiDiaTerm"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
QlvtThongTinHoSo ettThongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(Long.valueOf("0"+phieuXuLyId));
QlvtThongTinXuLy ettThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+ettThongTinHoSo.getId()));
QlvtXuLyGpkdvtBangOto gpkdvtBangOto = QlvtXuLyGpkdvtBangOtoLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+ettThongTinXuLy.getId()));
%>
<div id="info">
	<aui:input type="hidden" name="inforId1" value="<%=ettThongTinHoSo.getId() %>"></aui:input>
	<aui:input type="hidden" name="inforId2" value="<%=ettThongTinXuLy.getId() %>"></aui:input>
	<aui:input type="hidden" name="inforId3" value="<%=gpkdvtBangOto.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTNoiDiaTerm.THONG_TIN_HO_SO_ID %>" value="<%=ettThongTinHoSo.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTNoiDiaTerm.THONG_TIN_XU_LY_ID %>" value="<%=ettThongTinXuLy.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTNoiDiaTerm.ID %>" value="<%=gpkdvtBangOto.getId() %>"></aui:input>
</div>
<div id="dv1">
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Thông tin người trực tiếp điều hành vận tải của Doanh nghiệp: " cssClass="textBold" inlineField="<%=true %>" >
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="1. Họ và tên:" inlineField="" >
				<aui:input type="text" name="<%=QLVTNoiDiaTerm.NGUOI_TRUC_TIEP_DIEU_HANH %>" value="<%=gpkdvtBangOto.getNguoiTrucTiepDieuHanh() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="2. Số chứng minh nhân dân hoặc hộ chiếu: " inlineField="" >
				<aui:input type="text" name="<%=QLVTNoiDiaTerm.SO_CMT_NGUOI_DIEU_HANH %>" value="<%=gpkdvtBangOto.getSoCmtNguoiDieuHanh() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Ngày cấp: " inlineField="" >
				<aui:input type="text" name="<%=QLVTNoiDiaTerm.NGAY_CAP_NGUOI_DIEU_HANH %>" value="<%=gpkdvtBangOto.getNgayCapNguoiDieuHanh()%>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Nơi cấp: " inlineField="" >
				<aui:input type="text" name="<%=QLVTNoiDiaTerm.NOI_CAP_NGUOI_DIEU_HANH %>" value="<%=gpkdvtBangOto.getNoiCapNguoiDieuHanh() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Bằng cấp: " inlineField="" >
				<aui:input type="text" name="<%=QLVTNoiDiaTerm.BANG_CAP_NGUOI_DIEU_HANH %>" value="<%=gpkdvtBangOto.getBangCapNguoiDieuHanh()%>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="3. Thời gian làm người trực tiếp điều hành vận tải của Doanh nghiệp từ:" inlineField="" >
				<aui:input type="text" name="<%=QLVTNoiDiaTerm.THOI_GIAN_BAT_DAU_DIEU_HANH %>" value="<%=gpkdvtBangOto.getThoiGianBatDauDieuHanh() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Thời gian kết thúc điều hành: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTNoiDiaTerm.THOI_GIAN_KET_THUC_DIEU_HANH %>" value="<%=gpkdvtBangOto.getThoiGianKetThucDieuHanh()%>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="4. Số giấy phép: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTNoiDiaTerm.SO_GIAY_PHEP_NGUOI_DIEU_HANH %>" value="<%=gpkdvtBangOto.getSoGiayPhepNguoiDieuHanh() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Lần cấp: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTNoiDiaTerm.LAN_CAP_NGUOI_DIEU_HANH %>" value="<%=gpkdvtBangOto.getLanCapNguoiDieuHanh() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="30">
			<aui:field-wrapper label="Ngày cấp " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTNoiDiaTerm.NGAY_CAP_CC_DIEU_HANH %>" value="<%=gpkdvtBangOto.getNgayCapCcDieuHanh() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="30">
			<aui:field-wrapper label="Thời hạn từ: " inlineField="<%=true %>" >
				<aui:input type="text" name="" value="<%=gpkdvtBangOto.getNgayCapCcDieuHanh() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="30">
			<aui:field-wrapper label="Thời hạn đến: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTNoiDiaTerm.NGAY_HET_HAN_CC_DIEU_HANH %>" value="<%=gpkdvtBangOto.getNgayHetHanCcDieuHanh() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
		
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Đánh giá người trực tiếp điều hành vận tải của Doanh nghiệp: " cssClass="textBold"  inlineField="<%=true %>" >
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
	<aui:col width="100">
		<aui:input type="radio" name="<%=QLVTNoiDiaTerm.KET_QUA_XU_LY_NGUOI_DIEU_HANH %>" value="1" label="Đạt" inlineField="<%=true %>" onClick="showHiddenDiv2(1);"></aui:input>
		<aui:input type="radio" name="<%=QLVTNoiDiaTerm.KET_QUA_XU_LY_NGUOI_DIEU_HANH %>" value="0" label="Không đạt" inlineField="<%=true %>" onClick="showHiddenDiv2(0);"></aui:input>
	</aui:col>
</aui:row>
<div id="divDat10" style="display: none;margin-left: 20%;">
	
</div>
<div id="divKoDat10"style="display: none;margin-left: 20%;">
	<aui:input type="textarea" name="<%=QLVTNoiDiaTerm.LY_DO_KHONG_DAT %>" cssClass="myTextArea" label=""></aui:input>
</div>
	<br>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Thông tin giấy chứng nhận đăng ký kinh doanh: " cssClass="textBold"  inlineField="<%=true %>" >
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
		<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="1. Số giấy CNKD:" inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTNoiDiaTerm.SO_GPKD_VAN_TAI_BAN_OTO %>" value="<%=ettThongTinHoSo.getSoDkkd() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Ngày cấp: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTNoiDiaTerm.NGAY_CAP_GPKD_VAN_TAI_BANG_OTO %>" value="<%=ettThongTinHoSo.getNgayCapGPKDVTNoiDia() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
		<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Nơi cấp:" inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTNoiDiaTerm.CO_QUAN_CAP_GPKD_VAN_TAI_BANG_OTO %>" value="<%=ettThongTinHoSo.getCoQuanCapDkkd() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Đánh giá Giấy chứng nhận đăng ký kinh doanh: " cssClass="textBold"  inlineField="<%=true %>" >
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
	<aui:col width="100">
		<aui:input type="radio" name="<%=QLVTNoiDiaTerm.KET_QUA_XU_LY %>" value="1" label="Đạt" inlineField="<%=true %>" onClick="showHiddenDiv1(1);"></aui:input>
		<aui:input type="radio" name="<%=QLVTNoiDiaTerm.KET_QUA_XU_LY %>" value="0" label="Không đạt" inlineField="<%=true %>" onClick="showHiddenDiv1(0);"></aui:input>
	</aui:col>
</aui:row>
<div id="divDat0" style="display: none;margin-left: 20%;">
	
</div>
<div id="divKoDat0"style="display: none;margin-left: 20%;">
	<aui:input type="textarea" name="<%=QLVTNoiDiaTerm.LY_DO_KHONG_DAT %>" cssClass="myTextArea" label=""></aui:input>
</div>

</div>

<div style="width: 350px; float: left;">
	<liferay-util:include page="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/gpvtoto/cho_tham_xet_oto_qpvt_cap_moi_dv2.jsp" servletContext="<%=this.getServletContext() %>">
		<liferay-util:param name="xuLyPhuHieuId" value="<%=String.valueOf(gpkdvtBangOto.getId()) %>" />
	</liferay-util:include>
	<span id="group-success-block"></span>
</div>
<div id="dv3">

</div>
<aui:script use="aui-io-request,aui-node">
		var A = AUI();
		AUI().use(
				  'aui-datepicker',
				  function(A) {
				    new A.DatePicker(
				      {
				    	trigger: '#<portlet:namespace /><%=QLVTNoiDiaTerm.NGAY_CAP_GPKD_VAN_TAI_BANG_OTO  %>',
				        mask: '%d/%m/%Y',
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
		    	trigger: '#<portlet:namespace /><%=QLVTNoiDiaTerm.NGAY_CAP_NGUOI_DIEU_HANH %>',
		        mask: '%d/%m/%Y',
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
				    	trigger: '#<portlet:namespace /><%=QLVTNoiDiaTerm.NGAY_CAP_CC_DIEU_HANH  %>',
				        mask: '%d/%m/%Y',
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
				    	trigger: '#<portlet:namespace /><%=QLVTNoiDiaTerm.NGAY_HET_HAN_CC_DIEU_HANH  %>',
				        mask: '%d/%m/%Y',
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
				    	trigger: '#<portlet:namespace /><%=QLVTNoiDiaTerm.THOI_GIAN_BAT_DAU_DIEU_HANH  %>',
				        mask: '%d/%m/%Y',
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
				    	trigger: '#<portlet:namespace /><%=QLVTNoiDiaTerm.THOI_GIAN_KET_THUC_DIEU_HANH  %>',
				        mask: '%d/%m/%Y',
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
	AUI().one('#<portlet:namespace /><%=QLVTNoiDiaTerm.THOI_GIAN_BAT_DAU_DIEU_HANH %>').val('<%=Validator.isNotNull(gpkdvtBangOto.getThoiGianBatDauDieuHanh())?sdf.format(gpkdvtBangOto.getThoiGianBatDauDieuHanh()):StringPool.BLANK %>');
	AUI().one('#<portlet:namespace /><%=QLVTNoiDiaTerm.THOI_GIAN_KET_THUC_DIEU_HANH %>').val('<%=Validator.isNotNull(gpkdvtBangOto.getThoiGianKetThucDieuHanh())?sdf.format(gpkdvtBangOto.getThoiGianKetThucDieuHanh()):StringPool.BLANK %>');
	AUI().one('#<portlet:namespace /><%=QLVTNoiDiaTerm.NGAY_HET_HAN_CC_DIEU_HANH %>').val('<%=Validator.isNotNull(gpkdvtBangOto.getNgayHetHanCcDieuHanh())?sdf.format(gpkdvtBangOto.getNgayHetHanCcDieuHanh()):StringPool.BLANK %>');
	AUI().one('#<portlet:namespace /><%=QLVTNoiDiaTerm.NGAY_CAP_CC_DIEU_HANH %>').val('<%=Validator.isNotNull(gpkdvtBangOto.getNgayCapCcDieuHanh())?sdf.format(gpkdvtBangOto.getNgayCapCcDieuHanh()):StringPool.BLANK %>');
	AUI().one('#<portlet:namespace /><%=QLVTNoiDiaTerm.NGAY_CAP_GPKD_VAN_TAI_BANG_OTO %>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayCapGPKDVTNoiDia())?sdf.format(ettThongTinHoSo.getNgayCapGPKDVTNoiDia()):StringPool.BLANK %>');
	AUI().one('#<portlet:namespace /><%=QLVTNoiDiaTerm.NGAY_CAP_NGUOI_DIEU_HANH %>').val('<%=Validator.isNotNull(gpkdvtBangOto.getNgayCapNguoiDieuHanh())?sdf.format(gpkdvtBangOto.getNgayCapNguoiDieuHanh()):StringPool.BLANK %>');
</aui:script>