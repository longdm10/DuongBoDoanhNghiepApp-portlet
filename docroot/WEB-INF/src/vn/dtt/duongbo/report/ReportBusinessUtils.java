package vn.dtt.duongbo.report;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo;
import vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo;
import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo;
import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau;
import vn.dtt.duongbo.dao.common.service.TthcBieuMauHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoBieuMauLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy;
import vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil;
import vn.dtt.duongbo.maudon.model.CapGiayPhepVanTaiVietTrung;
import vn.dtt.duongbo.maudon.model.ChapThuanKhaiThacTuyenVTHKCDBangOtoVietCam;
import vn.dtt.duongbo.maudon.model.CongVanTuChoiCapPHBH;
import vn.dtt.duongbo.maudon.model.CongVanYCBSHoSoDeNghiCapPHBH;
import vn.dtt.duongbo.maudon.model.DKKTVTHanhKhachDinhKyBangOtoVietTrung;
import vn.dtt.duongbo.maudon.model.DKKTVTTuyenCoDinhBangOtoVietCam;
import vn.dtt.duongbo.maudon.model.DKKTVTTuyenCoDinhBangOtoVietLao;
import vn.dtt.duongbo.maudon.model.DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich;
import vn.dtt.duongbo.maudon.model.DeNghiCapGPVTVietTrungChoXeCongVu;
import vn.dtt.duongbo.maudon.model.DeNghiCapGiayPhepKDVTBangXeOto;
import vn.dtt.duongbo.maudon.model.DeNghiCapGiayPhepVanTaiDuongBoVietCam;
import vn.dtt.duongbo.maudon.model.DeNghiCapGiayPhepVanTaiDuongBoVietLao;
import vn.dtt.duongbo.maudon.model.DeNghiCapGiayPhepVanTaiDuongBoVietTrung;
import vn.dtt.duongbo.maudon.model.DeNghiCapLaiGPVTVietTrungDoHongMat;
import vn.dtt.duongbo.maudon.model.DeNghiGiaHanGiayPhepLienVanVietCam;
import vn.dtt.duongbo.maudon.model.DeNghiGiaHanGiayPhepLienVanVietLao;
import vn.dtt.duongbo.maudon.model.DeNghiGiaHanGiayPhepVanTaiChoPTTrungQuoc;
import vn.dtt.duongbo.maudon.model.DeNghiGioiThieuXinCapGPVTLoaiDVietNam;
import vn.dtt.duongbo.maudon.model.DonXinCapGPLVTMVietCam;
import vn.dtt.duongbo.maudon.model.DonXinCapGPLVTMVietLao;
import vn.dtt.duongbo.maudon.model.DonXinCapGPLienVanVietCam;
import vn.dtt.duongbo.maudon.model.DonXinCapGPLienVanVietLao;
import vn.dtt.duongbo.maudon.model.DonXinCapGPVTLoaiDCuaPTTrungQuoc;
import vn.dtt.duongbo.maudon.model.GiayDangKyKhaiThacTuyenVietTrung;
import vn.dtt.duongbo.maudon.model.GiayDeNghiCapPhuHieuBienHieu;
import vn.dtt.duongbo.maudon.model.NgungKhaiThacTuyenVTHKCDBangOtoVietCam;
import vn.dtt.duongbo.maudon.model.NgungKhaiThacTuyenVTHKCDBangOtoVietLao;
import vn.dtt.duongbo.maudon.model.PhuHieuLienVanVietLaos;
import vn.dtt.duongbo.maudon.model.PhuHieuXe6LoaiXe;
import vn.dtt.duongbo.maudon.model.TBaoDieuChinhTanSuatXeChayTuyenCDVietCam;
import vn.dtt.duongbo.maudon.model.TBaoDieuChinhTanSuatXeChayTuyenCDVietLao;
import vn.dtt.duongbo.maudon.xml.MauDonFactory;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class ReportBusinessUtils {
	
	private static Log _log = LogFactoryUtil.getLog(ReportBusinessUtils.class);
	private static SimpleDateFormat sdfSecc =  new SimpleDateFormat("ddMMyyhhss");
	public static final String FILE_NAME_NULL = "file_name_null";
	private static HashMap<String, Object> parameters = null;
	
	public static String actionExport(String realPath, long tthc_NoiDungHoSoID) throws Exception {
		
		String resultfileName = FILE_NAME_NULL;
		
		_log.info("==tthc_NoiDungHoSoID==" + tthc_NoiDungHoSoID);
		TthcNoidungHoSo tthcNoidungHoSo = null;
		_log.debug("--------------vao actionExport----------------");
		
		if (tthc_NoiDungHoSoID > 0) {
			tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.getTthcNoidungHoSo(tthc_NoiDungHoSoID);
			TthcBieuMauHoSo tthcBieuMauHoSo = TthcBieuMauHoSoLocalServiceUtil.getTthcBieuMauHoSo(tthcNoidungHoSo.getBieuMauHoSoId());
			
			if (tthcNoidungHoSo != null) {
				
				String tenFile_Export = tthcBieuMauHoSo.getMaBieuMau() + "_" + tthcNoidungHoSo.getId() + ".pdf";
				
				String noidungXml = tthcNoidungHoSo.getNoiDungXml();
				_log.debug("--------------begin converXMLMessagesContentToObject----------------");
				List<Object> lstObject = MauDonFactory.converXMLMessagesContentToObject(noidungXml);
				_log.debug("--------------end converXMLMessagesContentToObject----------------");
				
				_log.debug((lstObject != null) ? ("lstObject==size==" + lstObject.size()) : "lstObject==null===");
				_log.debug("--------------vao actionExport----------------" + lstObject.size());
				
				for (Object object : lstObject) {
					_log.debug("--------------vao for ReportBusiness----------------");
	/*				
					if (object instanceof NhapKhauKhaoNghiem) {
						JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(NhapKhauKhaoNghiem.class.cast(object));
						parameters = new HashMap<String, Object>();
						return ReportUtils.exportFunction(realPath, ReportUtils.BAN_DK_KIEM_TRA, tthcBieuMauHoSo.getMaBieuMau() + ".jrxml",
								tenFile_Export, dataSource, parameters);
						
					}
	*/
					_log.debug("--------------ketthuc for ReportBusiness----------------");
					_log.debug("--------------tenFile_Export trong ReportBusiness----------------" + tenFile_Export);
					return tenFile_Export;
				}
			}
		}
		return resultfileName;
	}
	
	public static String actionExportMauDon(String realPath, long hoSoThuTucId, long thanhPhanHoSoId, Object obj) throws Exception {
		
		Random random = new Random();
		
		String resultfileName = FILE_NAME_NULL;
		TthcThanhPhanHoSoBieuMau thanhPhanHoSoBieuMau = null;
		TthcBieuMauHoSo bieuMauHoSo = null;
		List<TthcThanhPhanHoSoBieuMau> allThanhPhanHoSoBieuMau = TthcThanhPhanHoSoBieuMauLocalServiceUtil.findByThanhPhanHoSoId(thanhPhanHoSoId);
		
		TthcThanhPhanHoSo thanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.fetchTthcThanhPhanHoSo(thanhPhanHoSoId);
		
		if (allThanhPhanHoSoBieuMau != null && allThanhPhanHoSoBieuMau.size() > 0) {
			thanhPhanHoSoBieuMau = allThanhPhanHoSoBieuMau.get(0);
			bieuMauHoSo = TthcBieuMauHoSoLocalServiceUtil.fetchTthcBieuMauHoSo(thanhPhanHoSoBieuMau.getBieuMauHoSoId());
		}
		
		_log.info("--------------vao actionExportMauDon----------------");
		_log.info("===obj instanceof===" + obj.getClass().getName());
		
		if (bieuMauHoSo != null) {
			
			_log.info("===bieuMauHoSo===" + bieuMauHoSo.getMaBieuMau());
			
			String tenFile_Export = bieuMauHoSo.getMaBieuMau() + "_" + hoSoThuTucId + "_" + thanhPhanHoSoId + "_" + sdfSecc.format(new Date()) + random.nextInt(10) + ".pdf";
			parameters = new HashMap<String, Object>();
			
			if (obj instanceof DeNghiCapGiayPhepVanTaiDuongBoVietCam) {
				_log.info("--------------vao 1----------------");
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(DeNghiCapGiayPhepVanTaiDuongBoVietCam.class.cast(obj));
				
				
				if ("BMDB27".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) || "BMDB81".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) ||
					"BMDB82".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) || "BMDB83".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau())) {
					return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, bieuMauHoSo.getMaBieuMau().trim() + ".jrxml", tenFile_Export, dataSource, parameters);
				}
				
			} else if (obj instanceof DonXinCapGPLienVanVietCam) {
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(DonXinCapGPLienVanVietCam.class.cast(obj));
				
				if ("BMDB37".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) ||
					"BMDB94".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) || "BMDB95".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) || "BMDB96".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau())) {
					return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, "BMDB37" + ".jrxml", tenFile_Export, dataSource, parameters);
				} else {
					return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, bieuMauHoSo.getMaBieuMau().trim() + ".jrxml", tenFile_Export, dataSource, parameters);
				}
				
			} else if (obj instanceof DeNghiGiaHanGiayPhepLienVanVietCam) {
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(DeNghiGiaHanGiayPhepLienVanVietCam.class.cast(obj));
				return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, bieuMauHoSo.getMaBieuMau().trim() + ".jrxml", tenFile_Export, dataSource, parameters);
				
			}  else if (obj instanceof DeNghiCapGiayPhepVanTaiDuongBoVietLao) {
				_log.info("--obj instanceof--DeNghiCapGiayPhepVanTaiDuongBoVietLao--");
				
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(DeNghiCapGiayPhepVanTaiDuongBoVietLao.class.cast(obj));
				
				if ("BMDB1".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) || 
					"BMDB78".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) || "BMDB79".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) ||
					"BMDB80".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau())) {
						/**
						 * 2.1..2. Cấp lại giấy phép hoạt động vận tải đường bộ quốc tế Việt Nam – Lào do hết hạn///BMDB78
						 * 2.1..3. Cấp lại giấy phép hoạt động vận tải đường bộ quốc tế Việt Nam – Lào do mất mát///BMDB79
						 * 2.1..4. Cấp lại giấy phép hoạt động vận tải đường bộ quốc tế Việt Nam – Lào do hư hỏng///BMDB80
						 * */
						return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, "BMDB1" + ".jrxml", tenFile_Export, dataSource, parameters);
						
				} else if ("BMDB27".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) ||
					"BMDB81".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) || "BMDB82".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) ||
					"BMDB83".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau())) {
					
					/**
					 * 3.1..1. Cấp giấy phép hoạt động vận tải đường bộ quốc tế Việt Nam – Campuchia.
						3.1..2. Cấp lại giấy phép hoạt động vận tải đường bộ quốc tế Việt Nam – Campuchia do hết hạn
						3.1..3. Cấp lại giấy phép hoạt động vận tải đường bộ quốc tế Việt Nam – Campuchia do mất mát
						3.1..4. Cấp lại giấy phép hoạt động vận tải đường bộ quốc tế Việt Nam – Campuchia do hư hỏng
					 * */
					
					return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, "BMDB27" + ".jrxml", tenFile_Export, dataSource, parameters);
					
				} else  {
					return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, bieuMauHoSo.getMaBieuMau().trim() + ".jrxml", tenFile_Export, dataSource, parameters);
				}
			
			} else if (obj instanceof DonXinCapGPLienVanVietLao) {
				
				_log.info("--obj instanceof--DonXinCapGPLienVanVietLao--");
				
				
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(DonXinCapGPLienVanVietLao.class.cast(obj));
				
				if ("BMDB11".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) || "BMDB88".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) ||
					"BMDB89".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) || "BMDB90".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau())) {
					return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, "BMDB11" + ".jrxml", tenFile_Export, dataSource, parameters);
				} else {
					return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, bieuMauHoSo.getMaBieuMau() + ".jrxml", tenFile_Export, dataSource, parameters);
				}
				
			} else if (obj instanceof DKKTVTTuyenCoDinhBangOtoVietLao) {
				_log.info("--------------vao 2----------------");
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(DKKTVTTuyenCoDinhBangOtoVietLao.class.cast(obj));
				return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, "BMDB17" + ".jrxml", tenFile_Export, dataSource, parameters);
				
			} else if (obj instanceof NgungKhaiThacTuyenVTHKCDBangOtoVietLao) {
				_log.info("--------------vao 3----------------");
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(NgungKhaiThacTuyenVTHKCDBangOtoVietLao.class.cast(obj));
				return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, bieuMauHoSo.getMaBieuMau() + ".jrxml", tenFile_Export, dataSource, parameters);
				
			} else if (obj instanceof ChapThuanKhaiThacTuyenVTHKCDBangOtoVietCam) {
				_log.info("--------------vao 4----------------");
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(ChapThuanKhaiThacTuyenVTHKCDBangOtoVietCam.class.cast(obj));
				return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, bieuMauHoSo.getMaBieuMau() + ".jrxml", tenFile_Export, dataSource, parameters);
				

			//------------------3.3. Các thủ tục hành chính về Tuyến vận tải hành khách cố định bằng xe ô tô giữa Việt Nam và Campuchia-------------
			} else if (obj instanceof DKKTVTTuyenCoDinhBangOtoVietCam) {
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(DKKTVTTuyenCoDinhBangOtoVietCam.class.cast(obj));
				if ("BMDB42".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) || "BMDB99".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) || "BMDB99".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) ||
					"BMDB100".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau())) {
					
					_log.info("--------------vao 5----------------");
					
					//------3.3..1. Chấp thuận đăng ký khai thác tuyến vận tải hành khách cố định liên vận quốc tế giữa Việt Nam – Campuchia.
					//------3.3..2. Bổ sung phương tiện khai thác tuyến vận tải hành khách tuyến cố định Việt Nam – Campuchia.
					//------3.3..3. Thay thế phương tiện khai thác tuyến vận tải hành khách tuyến cố định Việt Nam – Campuchia.
					return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI,  "BMDB42" + ".jrxml", tenFile_Export, dataSource, parameters);
				} else {
					return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, bieuMauHoSo.getMaBieuMau() + ".jrxml", tenFile_Export, dataSource, parameters);
				}
			
			//------3.3..4. Ngừng khai thác tuyến vận tải hành khách tuyến cố định Việt Nam – Campuchia.
			//BMDB46
			} else if (obj instanceof NgungKhaiThacTuyenVTHKCDBangOtoVietCam) {
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(NgungKhaiThacTuyenVTHKCDBangOtoVietCam.class.cast(obj));
				return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, bieuMauHoSo.getMaBieuMau() + ".jrxml", tenFile_Export, dataSource, parameters);
				
			} else if (obj instanceof DonXinCapGPLVTMVietLao) {
				_log.info("--------------vao 6----------------");
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(DonXinCapGPLVTMVietLao.class.cast(obj));
				
				if ("BMDB5".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) || "BMDB85".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) ||
					"BMDB86".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) || "BMDB87".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau())) {
					return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, "BMDB5" + ".jrxml", tenFile_Export, dataSource, parameters);
				} else {
					return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, bieuMauHoSo.getMaBieuMau() + ".jrxml", tenFile_Export, dataSource, parameters);
				}
			
			} else if (obj instanceof DonXinCapGPLVTMVietCam) {
				_log.info("--------------vao 7----------------");
				
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(DonXinCapGPLVTMVietCam.class.cast(obj));
				
				if ("BMDB34".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) || "BMDB91".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) ||
					"BMDB92".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) || "BMDB93".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau())) {
					
					return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, "BMDB34" + ".jrxml", tenFile_Export, dataSource, parameters);
				} else {
					return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, bieuMauHoSo.getMaBieuMau() + ".jrxml", tenFile_Export, dataSource, parameters);
				}
			
			} else if (obj instanceof DeNghiCapGiayPhepVanTaiDuongBoVietTrung) {
				_log.info("--------------vao 8----------------");
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(DeNghiCapGiayPhepVanTaiDuongBoVietTrung.class.cast(obj));
				return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, bieuMauHoSo.getMaBieuMau() + ".jrxml", tenFile_Export, dataSource, parameters);
				
			}else if (obj instanceof DeNghiGiaHanGiayPhepLienVanVietLao) {
				_log.info("--------------vao 9----------------");
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(DeNghiGiaHanGiayPhepLienVanVietLao.class.cast(obj));
				return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, "BMDB14" + ".jrxml", tenFile_Export, dataSource, parameters);
				
			}else if (obj instanceof DeNghiCapGPVTVietTrungChoXeCongVu) {
				_log.info("--------------vao 10----------------");
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(DeNghiCapGPVTVietTrungChoXeCongVu.class.cast(obj));
				return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, "BMDB55" + ".jrxml", tenFile_Export, dataSource, parameters);
				
			}else if (obj instanceof DeNghiCapLaiGPVTVietTrungDoHongMat) {
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(DeNghiCapLaiGPVTVietTrungDoHongMat.class.cast(obj));
				return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, bieuMauHoSo.getMaBieuMau() + ".jrxml", tenFile_Export, dataSource, parameters);
				
			} else if (obj instanceof DeNghiGioiThieuXinCapGPVTLoaiDVietNam) {
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(DeNghiGioiThieuXinCapGPVTLoaiDVietNam.class.cast(obj));
				return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, bieuMauHoSo.getMaBieuMau() + ".jrxml", tenFile_Export, dataSource, parameters);
				
			} else if (obj instanceof DKKTVTHanhKhachDinhKyBangOtoVietTrung) {
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(DKKTVTHanhKhachDinhKyBangOtoVietTrung.class.cast(obj));
				return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, bieuMauHoSo.getMaBieuMau() + ".jrxml", tenFile_Export, dataSource, parameters);
				
			} else if (obj instanceof DonXinCapGPVTLoaiDCuaPTTrungQuoc) {
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(DonXinCapGPVTLoaiDCuaPTTrungQuoc.class.cast(obj));
				return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, "BMDB62" + ".jrxml", tenFile_Export, dataSource, parameters);
				
			} else if (obj instanceof DeNghiGiaHanGiayPhepVanTaiChoPTTrungQuoc) {
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(DeNghiGiaHanGiayPhepVanTaiChoPTTrungQuoc.class.cast(obj));
				return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, bieuMauHoSo.getMaBieuMau() + ".jrxml", tenFile_Export, dataSource, parameters);
				
			} else if (obj instanceof TBaoDieuChinhTanSuatXeChayTuyenCDVietLao) {
				_log.info("--------------vao 11----------------");
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(TBaoDieuChinhTanSuatXeChayTuyenCDVietLao.class.cast(obj));
				
				if ("BMDB17".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) || "BMDB97".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) ||
					"BMDB98".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau())) {
					return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, "BMDB17" + ".jrxml", tenFile_Export, dataSource, parameters);
					
				} else if ("BMDB49".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau())) {
					_log.info("------vao` BMDB49 ----||||||||||||----------------");
					return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, "BMDB49" + ".jrxml", tenFile_Export, dataSource, parameters);
					
				} else {
					return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, bieuMauHoSo.getMaBieuMau() + ".jrxml", tenFile_Export, dataSource, parameters);
				}
				
			} else if (obj instanceof DeNghiCapGiayPhepKDVTBangXeOto) {
				_log.info("--------------vao 12----------------");
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(DeNghiCapGiayPhepKDVTBangXeOto.class.cast(obj));
				return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, "BM_111" + ".jrxml", tenFile_Export, dataSource, parameters);

			}else if (obj instanceof GiayDeNghiCapPhuHieuBienHieu) {
				_log.info("------vao` GiayDeNghiCapPhuHieuBienHieu----------------");
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(GiayDeNghiCapPhuHieuBienHieu.class.cast(obj));
				return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, "BM_120" + ".jrxml", tenFile_Export, dataSource, parameters);
				
			}
			else if (obj instanceof DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich) {
				_log.info("--------------vao 13----------------");
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich.class.cast(obj));
				return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, "BM_122" + ".jrxml", tenFile_Export, dataSource, parameters);
			} else if(obj instanceof GiayDangKyKhaiThacTuyenVietTrung) {
				_log.info("--------------vao 14----------------");
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(GiayDangKyKhaiThacTuyenVietTrung.class.cast(obj));
				return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, "BMDB76" + ".jrxml", tenFile_Export, dataSource, parameters);
				
			} else if (obj instanceof TBaoDieuChinhTanSuatXeChayTuyenCDVietCam) {
				_log.info("--------------vao 16----------------");
				
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(TBaoDieuChinhTanSuatXeChayTuyenCDVietCam.class.cast(obj));
				return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, bieuMauHoSo.getMaBieuMau() + ".jrxml", tenFile_Export, dataSource, parameters);

			} else if (obj instanceof PhuHieuXe6LoaiXe) {
				_log.info("--------------vao 17----------------");
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(PhuHieuXe6LoaiXe.class.cast(obj));
				if ("BM_142".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) || "BM_141".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) ||
					"BM_140".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) || "BM_143".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) ||
					"BM_144".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) || "BM_145".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) ||
					"BM_146".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) || "BM_138".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau()) ||
					"BM_136".equalsIgnoreCase(bieuMauHoSo.getMaBieuMau())) {
					
					return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, bieuMauHoSo.getMaBieuMau() + ".jrxml", tenFile_Export, dataSource, parameters);
				} 
//				else {
//					return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, bieuMauHoSo.getMaBieuMau() + ".jrxml", tenFile_Export, dataSource, parameters);
//				}
			}else if (obj instanceof PhuHieuLienVanVietLaos) {
				_log.info("--------------vao 18----------------");
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(PhuHieuLienVanVietLaos.class.cast(obj));
				return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, "BM26" + ".jrxml", tenFile_Export, dataSource, parameters);
				
			}else if(obj instanceof CongVanTuChoiCapPHBH) {
				_log.info("--------------vao 19----------------");
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(CongVanTuChoiCapPHBH.class.cast(obj));
				return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, "BM_148" + ".jrxml", tenFile_Export, dataSource, parameters);
				
			}
			else if(obj instanceof CongVanYCBSHoSoDeNghiCapPHBH) {
				_log.info("--------------vao 20----------------");
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(CongVanYCBSHoSoDeNghiCapPHBH.class.cast(obj));
				return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, "BM_147" + ".jrxml", tenFile_Export, dataSource, parameters);
				
			} else if(obj instanceof CapGiayPhepVanTaiVietTrung) {
				_log.info("--------------vao 21----------------");
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(CapGiayPhepVanTaiVietTrung.class.cast(obj));
				return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, "BM_151" + ".jrxml", tenFile_Export, dataSource, parameters);
				
			}  else {
				_log.info("===pathTemplate===/duongthuy/" + thanhPhanHoSo.getMaThanhPhan() + ".jrxml");
				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(obj);
				return ReportUtils.exportFunction(realPath, "duongthuy", thanhPhanHoSo.getMaThanhPhan() + ".jrxml", tenFile_Export, dataSource, parameters);
			}
			
			
			
			_log.info("------tenFile_Export trong ReportBusiness-------" + tenFile_Export);
			return tenFile_Export;
		}
		return resultfileName;
	}
public static String actionExportMauDonDanhSachDon(String realPath, String maBM, String phieuXuLyId) throws Exception {
	parameters = new HashMap<String, Object>();
		Random rd = new Random();
		String tenFile_Export = sdfSecc.format(new Date()) +rd.nextInt(10) + "_" + maBM + ".pdf";
		_log.info("--------------vao actionExportMauDon----------------");
		
		
//		QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(Long.valueOf("0"+phieuXuLyId));
//		QlvtThongTinXuLy qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+thongTinHoSo.getId()));
		MotCuaPhieuXuLy motCuaPhieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.fetchMotCuaPhieuXuLy(Long.valueOf("0"+phieuXuLyId));
		TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(motCuaPhieuXuLy.getHoSoThuTucId());
		TthcThanhPhanHoSo tthcThanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.findByThuTucHanhChinhIdMauDonOnline(tthcHoSoThuTuc.getThuTucHanhChinhId());
		TthcNoidungHoSo tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchByHoSoThuTucDonOnline(tthcHoSoThuTuc.getId(), tthcThanhPhanHoSo.getId());
		String ketQuaXml = tthcNoidungHoSo.getNoiDungXml();
		_log.info("--------------vao actionExportMauDon----------------"+ketQuaXml);
		List<Object> listObject=  MauDonFactory.converXMLMessagesContentToObject(ketQuaXml);
		JRBeanCollectionDataSource dataSource = null;
		for(Object obj : listObject){
			if (obj instanceof DeNghiCapGiayPhepVanTaiDuongBoVietCam) {
				_log.info("--------------vao 1----------------");
				 dataSource = ObjectExportToReportUtils.exportBieuMau(DeNghiCapGiayPhepVanTaiDuongBoVietCam.class.cast(obj));
				
				
			} else if (obj instanceof DonXinCapGPLienVanVietCam) {
				 dataSource = ObjectExportToReportUtils.exportBieuMau(DonXinCapGPLienVanVietCam.class.cast(obj));
				
			} else if (obj instanceof DeNghiGiaHanGiayPhepLienVanVietCam) {
				 dataSource = ObjectExportToReportUtils.exportBieuMau(DeNghiGiaHanGiayPhepLienVanVietCam.class.cast(obj));
				
			}  else if (obj instanceof DeNghiCapGiayPhepVanTaiDuongBoVietLao) {
				_log.info("--obj instanceof--DeNghiCapGiayPhepVanTaiDuongBoVietLao--");
				
				 dataSource = ObjectExportToReportUtils.exportBieuMau(DeNghiCapGiayPhepVanTaiDuongBoVietLao.class.cast(obj));
				
			} else if (obj instanceof DonXinCapGPLienVanVietLao) {
				
				_log.info("--obj instanceof--DonXinCapGPLienVanVietLao--");
				
				
				 dataSource = ObjectExportToReportUtils.exportBieuMau(DonXinCapGPLienVanVietLao.class.cast(obj));
				
			} else if (obj instanceof DKKTVTTuyenCoDinhBangOtoVietLao) {
				_log.info("--------------vao 2----------------");
				 dataSource = ObjectExportToReportUtils.exportBieuMau(DKKTVTTuyenCoDinhBangOtoVietLao.class.cast(obj));
				
			} else if (obj instanceof NgungKhaiThacTuyenVTHKCDBangOtoVietLao) {
				_log.info("--------------vao 3----------------");
				 dataSource = ObjectExportToReportUtils.exportBieuMau(NgungKhaiThacTuyenVTHKCDBangOtoVietLao.class.cast(obj));
				
			} else if (obj instanceof ChapThuanKhaiThacTuyenVTHKCDBangOtoVietCam) {
				_log.info("--------------vao 4----------------");
				 dataSource = ObjectExportToReportUtils.exportBieuMau(ChapThuanKhaiThacTuyenVTHKCDBangOtoVietCam.class.cast(obj));
				
			} else if (obj instanceof DKKTVTTuyenCoDinhBangOtoVietCam) {
				_log.info("--------------vao 5----------------");
				 dataSource = ObjectExportToReportUtils.exportBieuMau(DKKTVTTuyenCoDinhBangOtoVietCam.class.cast(obj));
			
			} else if (obj instanceof DonXinCapGPLVTMVietLao) {
				_log.info("--------------vao 6----------------");
				DonXinCapGPLVTMVietLao objCast = (DonXinCapGPLVTMVietLao)obj;
//				 dataSource = ObjectExportToReportUtils.exportBieuMau(DonXinCapGPLVTMVietLao.class.cast(obj));
			
			} else if (obj instanceof DonXinCapGPLVTMVietCam) {
				_log.info("--------------vao 7----------------");
//				 dataSource = ObjectExportToReportUtils.exportBieuMau(DonXinCapGPLVTMVietCam.class.cast(obj));
			
			} else if (obj instanceof DeNghiCapGiayPhepVanTaiDuongBoVietTrung) {
				_log.info("--------------vao 8----------------");
				 dataSource = ObjectExportToReportUtils.exportBieuMau(DeNghiCapGiayPhepVanTaiDuongBoVietTrung.class.cast(obj));
				
			}else if (obj instanceof DeNghiGiaHanGiayPhepLienVanVietLao) {
				_log.info("--------------vao 9----------------");
				 dataSource = ObjectExportToReportUtils.exportBieuMau(DeNghiGiaHanGiayPhepLienVanVietLao.class.cast(obj));
				
			}else if (obj instanceof DeNghiCapGPVTVietTrungChoXeCongVu) {
				_log.info("--------------vao 10----------------");
				 dataSource = ObjectExportToReportUtils.exportBieuMau(DeNghiCapGPVTVietTrungChoXeCongVu.class.cast(obj));
				
			}else if (obj instanceof DeNghiCapLaiGPVTVietTrungDoHongMat) {
				 dataSource = ObjectExportToReportUtils.exportBieuMau(DeNghiCapLaiGPVTVietTrungDoHongMat.class.cast(obj));
				
			} else if (obj instanceof DeNghiGioiThieuXinCapGPVTLoaiDVietNam) {
				 dataSource = ObjectExportToReportUtils.exportBieuMau(DeNghiGioiThieuXinCapGPVTLoaiDVietNam.class.cast(obj));
				
			} else if (obj instanceof DKKTVTHanhKhachDinhKyBangOtoVietTrung) {
				 dataSource = ObjectExportToReportUtils.exportBieuMau(DKKTVTHanhKhachDinhKyBangOtoVietTrung.class.cast(obj));
				
			} else if (obj instanceof DonXinCapGPVTLoaiDCuaPTTrungQuoc) {
				 dataSource = ObjectExportToReportUtils.exportBieuMau(DonXinCapGPVTLoaiDCuaPTTrungQuoc.class.cast(obj));
				
			} else if (obj instanceof DeNghiGiaHanGiayPhepVanTaiChoPTTrungQuoc) {
				 dataSource = ObjectExportToReportUtils.exportBieuMau(DeNghiGiaHanGiayPhepVanTaiChoPTTrungQuoc.class.cast(obj));
				
			} else if (obj instanceof TBaoDieuChinhTanSuatXeChayTuyenCDVietLao) {
				_log.info("--------------vao 11----------------");
				 dataSource = ObjectExportToReportUtils.exportBieuMau(TBaoDieuChinhTanSuatXeChayTuyenCDVietLao.class.cast(obj));
				
			} else if (obj instanceof DeNghiCapGiayPhepKDVTBangXeOto) {
				_log.info("--------------vao 12----------------");
				 dataSource = ObjectExportToReportUtils.exportBieuMau(DeNghiCapGiayPhepKDVTBangXeOto.class.cast(obj));

			}else if (obj instanceof GiayDeNghiCapPhuHieuBienHieu) {
				_log.info("------vao` GiayDeNghiCapPhuHieuBienHieu----------------");
				 dataSource = ObjectExportToReportUtils.exportBieuMau(GiayDeNghiCapPhuHieuBienHieu.class.cast(obj));
				
			}
			else if (obj instanceof DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich) {
				_log.info("--------------vao 13----------------");
				 dataSource = ObjectExportToReportUtils.exportBieuMau(DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich.class.cast(obj));
			} else if(obj instanceof GiayDangKyKhaiThacTuyenVietTrung) {
				_log.info("--------------vao 14----------------");
				 dataSource = ObjectExportToReportUtils.exportBieuMau(GiayDangKyKhaiThacTuyenVietTrung.class.cast(obj));
			}else if(obj instanceof TBaoDieuChinhTanSuatXeChayTuyenCDVietCam) {
				_log.info("--------------vao 16----------------");
				 dataSource = ObjectExportToReportUtils.exportBieuMau(TBaoDieuChinhTanSuatXeChayTuyenCDVietCam.class.cast(obj));
				
			}else if (obj instanceof PhuHieuXe6LoaiXe) {
				_log.info("--------------vao 17----------------");
				 dataSource = ObjectExportToReportUtils.exportBieuMau(PhuHieuXe6LoaiXe.class.cast(obj));
			}else if (obj instanceof PhuHieuLienVanVietLaos) {
				_log.info("--------------vao 18----------------");
				 dataSource = ObjectExportToReportUtils.exportBieuMau(PhuHieuLienVanVietLaos.class.cast(obj));
				
			}else if(obj instanceof CongVanTuChoiCapPHBH) {
				_log.info("--------------vao 19----------------");
				 dataSource = ObjectExportToReportUtils.exportBieuMau(CongVanTuChoiCapPHBH.class.cast(obj));
				
			}
			else if(obj instanceof CongVanYCBSHoSoDeNghiCapPHBH) {
				_log.info("--------------vao 20----------------");
				 dataSource = ObjectExportToReportUtils.exportBieuMau(CongVanYCBSHoSoDeNghiCapPHBH.class.cast(obj));
				
			} else if(obj instanceof CapGiayPhepVanTaiVietTrung) {
				_log.info("--------------vao 21----------------");
				 dataSource = ObjectExportToReportUtils.exportBieuMau(CapGiayPhepVanTaiVietTrung.class.cast(obj));
				
			} 
		 }
		return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, Constants.PDF_MAPPING.get(maBM)  + ".jrxml", tenFile_Export, dataSource, parameters);
//		_log.info("===obj instanceof===" + obj.getClass().getName());
//			 if(obj instanceof CapGiayPhepVanTaiVietTrung) {
//				_log.info("--------------vao 21----------------");
//				JRBeanCollectionDataSource dataSource = ObjectExportToReportUtils.exportBieuMau(CapGiayPhepVanTaiVietTrung.class.cast(obj));
//				_log.info("--------------dataSource 21----------------"+dataSource);
//				return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, maBM + ".jrxml", tenFile_Export, dataSource, parameters);
//				
//			} 
			
	}
public static String actionExportMauDonDanhSachDonFake(String realPath, String maBM, String phieuXuLyId, Object obj) throws Exception {
	parameters = new HashMap<String, Object>();
		Random rd = new Random();
		String tenFile_Export = sdfSecc.format(new Date()) +rd.nextInt(10) + "_" + maBM + ".pdf";
		_log.debug("--------------vao actionExportMauDon----------------");
		
		
//		QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(Long.valueOf("0"+phieuXuLyId));
//		QlvtThongTinXuLy qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+thongTinHoSo.getId()));
//		MotCuaPhieuXuLy motCuaPhieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.fetchMotCuaPhieuXuLy(Long.valueOf("0"+phieuXuLyId));
//		TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(motCuaPhieuXuLy.getHoSoThuTucId());
//		TthcThanhPhanHoSo tthcThanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.findByThuTucHanhChinhIdMauDonOnline(tthcHoSoThuTuc.getThuTucHanhChinhId());
//		TthcNoidungHoSo tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchByHoSoThuTucDonOnline(tthcHoSoThuTuc.getId(), tthcThanhPhanHoSo.getId());
//		String ketQuaXml = tthcNoidungHoSo.getNoiDungXml();
		_log.debug("--------------vao actionExportMauDon----------------"+MauDonFactory.convertObjectToXml(obj));
		
		JRBeanCollectionDataSource dataSource = null;
//		Class<?> clazz = Class.forName(obj.getClass().getName());
		dataSource = ObjectExportToReportUtils.exportBieuMau(obj);
		
		return ReportUtils.exportFunction(realPath, ReportConstant.VAN_BAN_DE_NGHI, Constants.PDF_MAPPING.get(maBM)  + ".jrxml", tenFile_Export, dataSource, parameters);
			
	}
}
