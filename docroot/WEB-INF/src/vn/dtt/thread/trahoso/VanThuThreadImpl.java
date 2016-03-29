package vn.dtt.thread.trahoso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.hpsf.Thumbnail;

import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTienTuyen;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyBienHieuLocalServiceUtil;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyBienHieuPhuongTienLocalServiceUtil;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyPhuHieuLocalServiceUtil;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyPhuHieuPhuongTienLocalServiceUtil;
import vn.dtt.duongbo.dao.common.model.DmDataItem;
import vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo;
import vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo;
import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo;
import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau;
import vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcBieuMauHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoBieuMauLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanLoaiHinhVanTai;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy;
import vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy;
import vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo;
import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit;
import vn.dtt.duongbo.dao.motcua.service.MotCuaPhanCongXuLyLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtWorkingUnitLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil;
import vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto;
import vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai;
import vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceUtil;
import vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyGpkdvtQuocTeLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTeLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil;
import vn.dtt.duongbo.maudon.model.CapGiayPhepVanTaiVietTrung;
import vn.dtt.duongbo.maudon.model.DKKTVTTuyenCoDinhBangOtoVietLao;
import vn.dtt.duongbo.maudon.model.DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich;
import vn.dtt.duongbo.maudon.model.DeNghiCapGPVTVietTrungChoXeCongVu;
import vn.dtt.duongbo.maudon.model.DeNghiCapGiayPhepKDVTBangXeOto;
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
import vn.dtt.duongbo.maudon.model.NgungKhaiThacTuyenVTHKCDBangOtoVietLao;
import vn.dtt.duongbo.maudon.model.TBaoDieuChinhTanSuatXeChayTuyenCDVietLao;
import vn.dtt.duongbo.maudon.xml.MauDonFactory;
import vn.dtt.duongbo.utils.format.FormatData;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.Organization;
import com.liferay.portal.service.ServiceContext;
import com.mysql.jdbc.jdbc2.optional.SuspendableXAConnection;


public class VanThuThreadImpl implements  MessageListener {

	
	@Override
	public void receive(Message message) throws MessageListenerException {
	       try {
	            doReceive(message);
	        }
	        catch (Exception e) {
	            log.error("Unable to process message " + message, e);
	        }
		
	}
	  protected void doReceive(Message message) {
		log.info("*****************process send doReceive TIEP NHAN HO SO**************************");
		log.info("*****************ABCCCC**************************");
		  ServiceContext context = (ServiceContext)message.get ("context");
			try {
				long dichChuyenTrangThaiPhieuSuLy = message.getLong("dichChuyenTrangThaiPhieuSuLy");
				long phieuXuLyId = message.getLong("phieuXuLyId");
				long hoSoThuTucId = message.getLong("hoSoThuTucId");
				long idThuTucHanhChinh = message.getLong("idThuTucHanhChinh");
				QlvtThongTinHoSo thongTinHoSo = (QlvtThongTinHoSo) message.get("thongTinHoSo");
				QlvtThongTinXuLy thongTinXuLy = (QlvtThongTinXuLy) message.get("addThongTinXuLy");
				processTiepNhanVanThu(idThuTucHanhChinh,hoSoThuTucId,thongTinHoSo,thongTinXuLy);
			} catch (Exception e) {
				log.error(e);
			}
	}
	  private String makeNoiDungXmlStandard(String noiDungXml) {
			StringBuilder builder = new StringBuilder();
			builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			builder.append("<Envelope>");
			builder.append("<Header>");
			builder.append("</Header>");
			builder.append("<Body>");
			builder.append("<Content>");
			builder.append(noiDungXml);
			builder.append("</Content>");
			builder.append("</Body>");
			builder.append("</Envelope>");
			
			return builder.toString();
		}
		
	  private void processTiepNhanVanThu(long idThuTucHanhChinh, long hoSoThuTucId,QlvtThongTinHoSo thongTinHoSo,QlvtThongTinXuLy addThongTinXuLy) throws SystemException, ClassNotFoundException {
			// TODO Auto-generated method stub
			TthcThanhPhanHoSo ettThanhPhanMauDon = TthcThanhPhanHoSoLocalServiceUtil.findByThuTucHanhChinhIdMauDonOnline(idThuTucHanhChinh);
			List<TthcThanhPhanHoSoBieuMau> listTTHSBM = TthcThanhPhanHoSoBieuMauLocalServiceUtil.findByThanhPhanHoSoId(ettThanhPhanMauDon.getId());
			TthcThanhPhanHoSoBieuMau ettThanhPhanHoSoBieuMau = null;
			TthcBieuMauHoSo ettBMHS = null;
			if(listTTHSBM.size()>0){
				ettThanhPhanHoSoBieuMau = listTTHSBM.get(0);
				ettBMHS = TthcBieuMauHoSoLocalServiceUtil.fetchTthcBieuMauHoSo(ettThanhPhanHoSoBieuMau.getBieuMauHoSoId());
			}
			log.info(idThuTucHanhChinh + "-- ettThanhPhanMauDon.getId()--");
//			List<TthcNoidungHoSo> listNoiDungHS = TthcNoidungHoSoLocalServiceUtil.findByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId, ettThanhPhanMauDon.getId());
			log.info(hoSoThuTucId + "-- hoSoThuTucId--");
			log.info(ettThanhPhanMauDon.getId() + "-- ettThanhPhanMauDon.getId() --");
			TthcNoidungHoSo ettNoiDungHS = TthcNoidungHoSoLocalServiceUtil.fetchByHoSoThuTucDonOnline(hoSoThuTucId, ettThanhPhanMauDon.getId());
//			if(listNoiDungHS.size() > 0){
//				ettNoiDungHS = TthcNoidungHoSoLocalServiceUtil.findByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId, ettThanhPhanMauDon.getId()).get(0);
//			}
			List<Object> allMauDon = MauDonFactory.converXMLMessagesContentToObject(ettNoiDungHS.getNoiDungXml());
			Object obj = allMauDon.size()>0?allMauDon.get(0):null;
			if(idThuTucHanhChinh == 1){
				vanThuProcessNghiepVuQuyTrinh1(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 2){
				vanThuProcessNghiepVuQuyTrinh1(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 3){
				vanThuProcessNghiepVuQuyTrinh3(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 4){
				vanThuProcessNghiepVuQuyTrinh3(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 5){
				vanThuProcessNghiepVuQuyTrinh3(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 6){
				vanThuProcessNghiepVuQuyTrinh3(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 7){
				vanThuProcessNghiepVuQuyTrinh3(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 8){
				vanThuProcessNghiepVuQuyTrinh8(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 9){
				vanThuProcessNghiepVuQuyTrinh8(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 10){
				vanThuProcessNghiepVuQuyTrinh8(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 11){
				vanThuProcessNghiepVuQuyTrinh8(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 12){
				vanThuProcessNghiepVuQuyTrinh8(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 13){
				vanThuProcessNghiepVuQuyTrinh2(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 14){
				vanThuProcessNghiepVuQuyTrinh2(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 15){
				vanThuProcessNghiepVuQuyTrinh4(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 16){
				vanThuProcessNghiepVuQuyTrinh4(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 17){
				vanThuProcessNghiepVuQuyTrinh4(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 18){
				vanThuProcessNghiepVuQuyTrinh4(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 19){
				vanThuProcessNghiepVuQuyTrinh4(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 20){
				vanThuProcessNghiepVuQuyTrinh9(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 21){
				vanThuProcessNghiepVuQuyTrinh9(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 22){
				vanThuProcessNghiepVuQuyTrinh9(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 23){
				vanThuProcessNghiepVuQuyTrinh9(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 24){
				vanThuProcessNghiepVuQuyTrinh9(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 25){
				vanThuProcessNghiepVuQuyTrinh5(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 26){
				vanThuProcessNghiepVuQuyTrinh5(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 27){
				vanThuProcessNghiepVuQuyTrinh5(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 28){
				vanThuProcessNghiepVuQuyTrinh5(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 29){
				vanThuProcessNghiepVuQuyTrinh5(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 30){
				vanThuProcessNghiepVuQuyTrinh5(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 31){
				vanThuProcessNghiepVuQuyTrinh5(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 32){
				vanThuProcessNghiepVuQuyTrinh5(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 33){
				vanThuProcessNghiepVuQuyTrinh5(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 34){
				vanThuProcessNghiepVuQuyTrinh1(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 35){
				vanThuProcessNghiepVuQuyTrinh1(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 36){
				vanThuProcessNghiepVuQuyTrinh3(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 37){
				vanThuProcessNghiepVuQuyTrinh3(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 38){
				vanThuProcessNghiepVuQuyTrinh3(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 39){
				vanThuProcessNghiepVuQuyTrinh3(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 40){
				vanThuProcessNghiepVuQuyTrinh2(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 41){
				vanThuProcessNghiepVuQuyTrinh2(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 42){
				vanThuProcessNghiepVuQuyTrinh4(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 43){
				vanThuProcessNghiepVuQuyTrinh4(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 44){
				vanThuProcessNghiepVuQuyTrinh4(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 45){
				vanThuProcessNghiepVuQuyTrinh4(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 46){
				vanThuProcessNghiepVuQuyTrinh5(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 47){
				vanThuProcessNghiepVuQuyTrinh5(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 51){
				vanThuProcessNghiepVuQuyTrinh7(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 52){
				vanThuProcessNghiepVuQuyTrinh7(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 53){
				vanThuProcessNghiepVuQuyTrinh7(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 54){
				vanThuProcessNghiepVuQuyTrinh7(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 55){
				vanThuProcessNghiepVuQuyTrinh6(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 56){
				vanThuProcessNghiepVuQuyTrinh6(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 57){
				vanThuProcessNghiepVuQuyTrinh6(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 58){
				vanThuProcessNghiepVuQuyTrinh6(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}else if(idThuTucHanhChinh == 59){
				vanThuProcessNghiepVuQuyTrinh6(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
			}
			
		}
		
		public void vanThuProcessNghiepVuQuyTrinh1(Object obj,long idThuTucHanhChinh, long hoSoThuTucId,QlvtThongTinHoSo thongTinHoSo,QlvtThongTinXuLy addThongTinXuLy) {
			log.info("----- Cấp giấy phép vận tải đường bộ quốc tế Việt Nam - Lào -----");
			DeNghiCapGiayPhepVanTaiDuongBoVietLao objCast = (DeNghiCapGiayPhepVanTaiDuongBoVietLao)obj;
			List<String> listLoaiHinh = objCast.getLoaiHinhHoatDongs();
			QlvtXuLyGpkdvtQuocTe ettQuocTe = null;
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai ettLoaiHinhVanTai = null;
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen ettLoaiHinhVanTaiTuyen = null;
			int id = -1;
			try {
				id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpkdvtQuocTe.class.getName());
				ettQuocTe = QlvtXuLyGpkdvtQuocTeLocalServiceUtil.createQlvtXuLyGpkdvtQuocTe(id);
				ettQuocTe.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
				ettQuocTe.setLoaiCapPhep(objCast.getLoaiHinhDeNghiCap());
				ettQuocTe.setNgayCapGiayPhepVanTai(Validator.isNotNull(objCast.getNgayCapGiayPhepKinhDoanh())?sdf.parse(objCast.getNgayCapGiayPhepKinhDoanh()):null);
				ettQuocTe.setCoQuanCapGiayPhepVanTaiId(objCast.getCoQuanCapGiayPhepKinhDoanh());
				ettQuocTe = QlvtXuLyGpkdvtQuocTeLocalServiceUtil.updateQlvtXuLyGpkdvtQuocTe(ettQuocTe);
				if(Validator.isNotNull(ettQuocTe) && listLoaiHinh.size() > 0){
					for (String loaiHinh : listLoaiHinh) {
						id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.class.getName());
						ettLoaiHinhVanTai = QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiLocalServiceUtil.createQlvtXuLyGpkdvtQuocTeLoaiHinhVanTai(id);
						ettLoaiHinhVanTai.setThongTinCapGpkdVanTaiId((int)ettQuocTe.getId());
						ettLoaiHinhVanTai.setMaLoaiHinhHoatDong(loaiHinh);
						QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiLocalServiceUtil.updateQlvtXuLyGpkdvtQuocTeLoaiHinhVanTai(ettLoaiHinhVanTai);
					}
				}
				
				//UPDATE THONGTINHOSO
				thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void vanThuProcessNghiepVuQuyTrinh2(Object obj,long idThuTucHanhChinh, long hoSoThuTucId,QlvtThongTinHoSo thongTinHoSo,QlvtThongTinXuLy addThongTinXuLy) {
			log.info("----- Cấp giấy phép vận tải đường bộ quốc tế Việt Nam - Campuchia -----");
			DeNghiCapGiayPhepVanTaiDuongBoVietLao objCast = (DeNghiCapGiayPhepVanTaiDuongBoVietLao)obj;
			List<String> listLoaiHinh = objCast.getLoaiHinhHoatDongs();
			QlvtXuLyGpkdvtQuocTe ettQuocTe = null;
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai ettLoaiHinhVanTai = null;
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen ettLoaiHinhVanTaiTuyen = null;
			int id = -1;
			try {
				id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpkdvtQuocTe.class.getName());
				ettQuocTe = QlvtXuLyGpkdvtQuocTeLocalServiceUtil.createQlvtXuLyGpkdvtQuocTe(id);
				ettQuocTe.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
				ettQuocTe.setLoaiCapPhep(objCast.getLoaiHinhDeNghiCap());
				ettQuocTe.setNgayCapGiayPhepVanTai(Validator.isNotNull(objCast.getNgayCapGiayPhepKinhDoanh())?sdf.parse(objCast.getNgayCapGiayPhepKinhDoanh()):null);
				ettQuocTe.setCoQuanCapGiayPhepVanTaiId(objCast.getCoQuanCapGiayPhepKinhDoanh());
				ettQuocTe = QlvtXuLyGpkdvtQuocTeLocalServiceUtil.updateQlvtXuLyGpkdvtQuocTe(ettQuocTe);
				if(Validator.isNotNull(ettQuocTe) && listLoaiHinh.size() > 0){
					for (String loaiHinh : listLoaiHinh) {
						id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.class.getName());
						ettLoaiHinhVanTai = QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiLocalServiceUtil.createQlvtXuLyGpkdvtQuocTeLoaiHinhVanTai(id);
						ettLoaiHinhVanTai.setThongTinCapGpkdVanTaiId((int)ettQuocTe.getId());
						ettLoaiHinhVanTai.setMaLoaiHinhHoatDong(loaiHinh);
						QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiLocalServiceUtil.updateQlvtXuLyGpkdvtQuocTeLoaiHinhVanTai(ettLoaiHinhVanTai);
					}
				}
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void vanThuProcessNghiepVuQuyTrinh3(Object obj,long idThuTucHanhChinh, long hoSoThuTucId,QlvtThongTinHoSo thongTinHoSo,QlvtThongTinXuLy addThongTinXuLy) {
			log.info("----- Cấp giấy phép liên vận Việt Nam - Lào -----");
			
			QlvtXuLyGpLienVan qlvtXuLyGpLienVan = null;
			QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai = null;
			QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien = null;
			QlvtXuLyGpLienVanPhuongTienTramDungNghi QlvtXuLyGpLienVanPhuongTienTramDungNghi = null;
			int id = -1;
			try {
				log.info("----- obj.getClass().getName() -----"+obj.getClass().getName());
				if(obj.getClass().getName().contains(".DonXinCapGPLVTMVietLao")){
					DonXinCapGPLVTMVietLao objCast = (DonXinCapGPLVTMVietLao)obj;
					List<DonXinCapGPLVTMVietLao.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
					id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVan.class.getName());
					qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.createQlvtXuLyGpLienVan(id);
					qlvtXuLyGpLienVan.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
					//TODO
//					qlvtXuLyGpLienVan.setLoaiCapPhep(objCast.get);
					qlvtXuLyGpLienVan.setSoGpvt(objCast.getSoGPVanTai());
					qlvtXuLyGpLienVan.setNgayCapGpvt(Validator.isNotNull(objCast.getNgayCapGPVanTai())?sdf.parse(objCast.getNgayCapGPVanTai()):null);
					qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
					if(Validator.isNotNull(qlvtXuLyGpLienVan) && listPhuongTien.size() > 0){
						for (DonXinCapGPLVTMVietLao.DanhSachXe danhSachXe : listPhuongTien) {
							id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTien.class.getName());
							qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTien(id);
							qlvtXuLyGpLienVanPhuongTien.setCapGplvId(Integer.valueOf("0"+qlvtXuLyGpLienVan.getId()));
							qlvtXuLyGpLienVanPhuongTien.setBienSo(danhSachXe.getBienSoXe());
							qlvtXuLyGpLienVanPhuongTien.setHinhThucHoatDong(danhSachXe.getHinhThucHoatDong());
							qlvtXuLyGpLienVanPhuongTien.setMauSon(danhSachXe.getMauSon());
							qlvtXuLyGpLienVanPhuongTien.setSoKhung(danhSachXe.getSoKhung());
							qlvtXuLyGpLienVanPhuongTien.setSoMay(danhSachXe.getSoMay());
							qlvtXuLyGpLienVanPhuongTien.setNhanHieu(danhSachXe.getNhanHieu());
							//TODO danhSachXe.getThoiGianDeNghiCapPhep() danhSachXe.getTuyenHoatDong()
							qlvtXuLyGpLienVanPhuongTien.setTrongTai(Integer.valueOf("0"+danhSachXe.getTrongTai()));
							qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTien(qlvtXuLyGpLienVanPhuongTien);
							
						}
					}
				} else if(obj.getClass().getName().contains(".DonXinCapGPLienVanVietLao")){
					DonXinCapGPLienVanVietLao objCast = (DonXinCapGPLienVanVietLao)obj;
					List<DonXinCapGPLienVanVietLao.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
					id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVan.class.getName());
					qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.createQlvtXuLyGpLienVan(id);
					qlvtXuLyGpLienVan.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
					qlvtXuLyGpLienVan.setSoGpvt(objCast.getSoGPDKKD());
					qlvtXuLyGpLienVan.setMucDichChuyenDi(objCast.getMucDichChuyenDi().get(0));
					qlvtXuLyGpLienVan.setNgayCapGpvt(Validator.isNotNull(objCast.getNgayCapGPDKKD())?sdf.parse(objCast.getNgayCapGPDKKD()):null);
					qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
					if(Validator.isNotNull(qlvtXuLyGpLienVan) && listPhuongTien.size() > 0){
						for (DonXinCapGPLienVanVietLao.DanhSachXe danhSachXe : listPhuongTien) {
							id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTien.class.getName());
							qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTien(id);
							qlvtXuLyGpLienVanPhuongTien.setCapGplvId(Integer.valueOf("0"+qlvtXuLyGpLienVan.getId()));
							qlvtXuLyGpLienVanPhuongTien.setBienSo(danhSachXe.getBienSoXe());
							qlvtXuLyGpLienVanPhuongTien.setHinhThucHoatDong(danhSachXe.getHinhThucHoatDong());
							qlvtXuLyGpLienVanPhuongTien.setNhanHieu(danhSachXe.getNhanHieu());
							qlvtXuLyGpLienVanPhuongTien.setMauSon(danhSachXe.getMauSon());
							qlvtXuLyGpLienVanPhuongTien.setSoKhung(danhSachXe.getSoKhung());
							qlvtXuLyGpLienVanPhuongTien.setSoMay(danhSachXe.getSoMay());
							//TODO danhSachXe.getThoiGianDeNghiCapPhep() danhSachXe.getTuyenHoatDong()
							qlvtXuLyGpLienVanPhuongTien.setTrongTai(Integer.valueOf("0"+danhSachXe.getTrongTai()));
							qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTien(qlvtXuLyGpLienVanPhuongTien);
							
						}
					
					}
				}else if(obj.getClass().getName().contains(".DeNghiGiaHanGiayPhepLienVanVietLao")){
					DeNghiGiaHanGiayPhepLienVanVietLao objCast = (DeNghiGiaHanGiayPhepLienVanVietLao)obj;
					id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVan.class.getName());
					qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.createQlvtXuLyGpLienVan(id);
					qlvtXuLyGpLienVan.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
					qlvtXuLyGpLienVan.setSoGpvt(objCast.getSoGPLVVL());
					qlvtXuLyGpLienVan.setNgayCapGpvt(Validator.isNotNull(objCast.getNgayCapGiayPhep())?sdf.parse(objCast.getNgayCapGiayPhep()):null);
					qlvtXuLyGpLienVan.setCoQuanCapPhepLienVan(objCast.getCoQuanCapGiayPhep());
					qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
					
					//UPDATE THONGTINHOSO
					thongTinHoSo.setCoQuanCapDkkd(objCast.getCoQuanCapGiayPhep());
					String govAID = objCast.getCoQuanGui();
					OEPUserMgtWorkingUnit ettEOP = OEPUserMgtWorkingUnitLocalServiceUtil.getByGovAgentId(govAID);
					thongTinHoSo.setCoQuanGiaiQuyet(Long.valueOf(ettEOP.getOrganizationId()));
					thongTinHoSo.setDienThoaiDn(objCast.getDienThoai());
					thongTinHoSo.setDiaChiDn(objCast.getDiaChi());
					thongTinHoSo.setNgayGiaHanGiayDangKyKinhDoanh(Validator.isNotNull(objCast.getNgayFromGiahanGplv())?sdf.parse(objCast.getNgayFromGiahanGplv()):null);
					thongTinHoSo.setLyDoCapLai(objCast.getLydoGiaHan());
					thongTinHoSo.setSoFaxDn(objCast.getFax());
					thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
					
				}
			} catch (Exception e) {
					// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void vanThuProcessNghiepVuQuyTrinh4(Object obj,long idThuTucHanhChinh, long hoSoThuTucId,QlvtThongTinHoSo thongTinHoSo,QlvtThongTinXuLy addThongTinXuLy) {
			log.info("----- Cấp giấy phép liên vận Việt Nam - Campuchia -----");
			QlvtXuLyGpLienVan qlvtXuLyGpLienVan = null;
			QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai = null;
			QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien = null;
			QlvtXuLyGpLienVanPhuongTienTramDungNghi QlvtXuLyGpLienVanPhuongTienTramDungNghi = null;
			int id = -1;
			try {
				log.info("----- obj.getClass().getName() -----"+obj.getClass().getName());
				if(obj.getClass().getName().contains(".DonXinCapGPLVTMVietCam")){
					log.info("----- Cấp giấy phép liên vận Việt Nam - Campuchia 1-----");
					DonXinCapGPLVTMVietCam objCast = (DonXinCapGPLVTMVietCam)obj;
					List<DonXinCapGPLVTMVietCam.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
					id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVan.class.getName());
					qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.createQlvtXuLyGpLienVan(id);
					qlvtXuLyGpLienVan.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
					//TODO
//					qlvtXuLyGpLienVan.setLoaiCapPhep(objCast.get);
					qlvtXuLyGpLienVan.setSoGpvt(objCast.getSoGPVanTai());
					qlvtXuLyGpLienVan.setNgayCapGpvt(Validator.isNotNull(objCast.getNgayCapGPVanTai())?sdf.parse(objCast.getNgayCapGPVanTai()):null);
					qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
					if(Validator.isNotNull(qlvtXuLyGpLienVan) && listPhuongTien.size() > 0){
						for (DonXinCapGPLVTMVietCam.DanhSachXe danhSachXe : listPhuongTien) {
							id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTien.class.getName());
							qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTien(id);
							qlvtXuLyGpLienVanPhuongTien.setCapGplvId(Integer.valueOf("0"+qlvtXuLyGpLienVan.getId()));
							qlvtXuLyGpLienVanPhuongTien.setBienSo(danhSachXe.getBienSoXe());
							qlvtXuLyGpLienVanPhuongTien.setHinhThucHoatDong(danhSachXe.getHinhThucHoatDong());
							qlvtXuLyGpLienVanPhuongTien.setNhanHieu(danhSachXe.getNhanHieu());
							//TODO danhSachXe.getThoiGianDeNghiCapPhep() danhSachXe.getTuyenHoatDong()
							qlvtXuLyGpLienVanPhuongTien.setTrongTai(Integer.valueOf("0"+danhSachXe.getTrongTai()));
							qlvtXuLyGpLienVanPhuongTien.setSoKhung(danhSachXe.getSoKhung());
							qlvtXuLyGpLienVanPhuongTien.setSoMay(danhSachXe.getSoMay());
							qlvtXuLyGpLienVanPhuongTien.setDoanhNghiepChoThue(thongTinHoSo.getTenDn());
							qlvtXuLyGpLienVanPhuongTien.setThoiHanChoThue(FormatData.parseStringToDateTypeDDMMYYYY(danhSachXe.getThoiGianDeNghi()));
							qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTien(qlvtXuLyGpLienVanPhuongTien);
						}
					}
				} else if(obj.getClass().getName().contains(".DonXinCapGPLienVanVietCam")){
					log.info("----- Cấp giấy phép liên vận Việt Nam - Campuchia 2-----");
					DonXinCapGPLienVanVietCam objCast = (DonXinCapGPLienVanVietCam)obj;
					List<DonXinCapGPLienVanVietCam.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
					id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVan.class.getName());
					qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.createQlvtXuLyGpLienVan(id);
					qlvtXuLyGpLienVan.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
					qlvtXuLyGpLienVan.setSoGpvt(objCast.getSoGPDKKD());
					qlvtXuLyGpLienVan.setNgayCapGpvt(Validator.isNotNull(objCast.getNgayCapGPDKKD())?sdf.parse(objCast.getNgayCapGPDKKD()):null);
					qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
					if(Validator.isNotNull(qlvtXuLyGpLienVan) && listPhuongTien.size() > 0){
						for (DonXinCapGPLienVanVietCam.DanhSachXe danhSachXe : listPhuongTien) {
							id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTien.class.getName());
							qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTien(id);
							qlvtXuLyGpLienVanPhuongTien.setCapGplvId(Integer.valueOf("0"+qlvtXuLyGpLienVan.getId()));
							qlvtXuLyGpLienVanPhuongTien.setBienSo(danhSachXe.getBienSoXe());
							qlvtXuLyGpLienVanPhuongTien.setHinhThucHoatDong(danhSachXe.getHinhThucHoatDong());
							qlvtXuLyGpLienVanPhuongTien.setNhanHieu(danhSachXe.getNhanHieu());
							//TODO danhSachXe.getThoiGianDeNghiCapPhep() danhSachXe.getTuyenHoatDong()
							qlvtXuLyGpLienVanPhuongTien.setThoiHanChoThue(FormatData.parseStringToDateTypeDDMMYYYY(danhSachXe.getThoiGianDeNghi()));
							qlvtXuLyGpLienVanPhuongTien.setTrongTai(Integer.valueOf("0"+danhSachXe.getTrongTai()));
							qlvtXuLyGpLienVanPhuongTien.setSoKhung(danhSachXe.getSoKhung());
							qlvtXuLyGpLienVanPhuongTien.setSoMay(danhSachXe.getSoMay());
							qlvtXuLyGpLienVanPhuongTien.setDoanhNghiepChoThue(thongTinHoSo.getTenDn());
							qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTien(qlvtXuLyGpLienVanPhuongTien);
						}
					
					}
				}else if(obj.getClass().getName().contains(".DeNghiGiaHanGiayPhepLienVanVietCam")){
					log.info("----- Cấp giấy phép liên vận Việt Nam - Campuchia 3-----");
					DeNghiGiaHanGiayPhepLienVanVietCam objCast = (DeNghiGiaHanGiayPhepLienVanVietCam)obj;
					id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVan.class.getName());
					qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.createQlvtXuLyGpLienVan(id);
					qlvtXuLyGpLienVan.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
					qlvtXuLyGpLienVan.setSoGpvt(objCast.getSoGPLVVL());
					qlvtXuLyGpLienVan.setNgayCapGpvt(Validator.isNotNull(objCast.getNgayCapGiayPhep())?sdf.parse(objCast.getNgayCapGiayPhep()):null);
					qlvtXuLyGpLienVan.setCoQuanCapPhepLienVan(objCast.getCoQuanCapGiayPhep());
					qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
					
					//UPDATE THONGTINHOSO
					thongTinHoSo.setCoQuanCapDkkd(objCast.getCoQuanCapGiayPhep());
					thongTinHoSo.setCoQuanGiaiQuyet(Long.valueOf(objCast.getCoQuanGui()));
					thongTinHoSo.setDienThoaiDn(objCast.getDienThoai());
					thongTinHoSo.setDiaChiDn(objCast.getDiaChi());
					thongTinHoSo.setNgayGiaHanGiayDangKyKinhDoanh(Validator.isNotNull(objCast.getNgayFromGiahanGplv())?sdf.parse(objCast.getNgayFromGiahanGplv()):null);
					thongTinHoSo.setLyDoCapLai(objCast.getLydoGiaHan());
					thongTinHoSo.setSoFaxDn(objCast.getFax());
					thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
					
				}
			} catch (Exception e) {
					// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}
		public void vanThuProcessNghiepVuQuyTrinh5(Object obj,long idThuTucHanhChinh, long hoSoThuTucId,QlvtThongTinHoSo thongTinHoSo,QlvtThongTinXuLy addThongTinXuLy) {
			log.info("----- Cấp giấy phép vận tải Việt Nam - Trung Quốc, Chấp thuận, bổ sung, thay thế phương tiện khai thác tuyến Việt Nam - Trung Quốc -----");
			QlvtXuLyGpLienVan qlvtXuLyGpLienVan = null;
			QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai = null;
			QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien = null;
			QlvtXuLyGpLienVanPhuongTienTramDungNghi QlvtXuLyGpLienVanPhuongTienTramDungNghi = null;
			int id = -1;
			try {
				log.info("----- obj.getClass().getName() -----"+obj.getClass().getName());
				if(obj.getClass().getName().contains(".DeNghiCapGiayPhepVanTaiDuongBoVietTrung")){
					log.info("-----vao1 DeNghiCapGiayPhepVanTaiDuongBoVietTrung--------");
					
					DeNghiCapGiayPhepVanTaiDuongBoVietTrung objCast = (DeNghiCapGiayPhepVanTaiDuongBoVietTrung)obj;
					List<DeNghiCapGiayPhepVanTaiDuongBoVietTrung.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
					id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVan.class.getName());
					qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.createQlvtXuLyGpLienVan(id);
					qlvtXuLyGpLienVan.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
					//TODO
//					qlvtXuLyGpLienVan.setLoaiCapPhep(objCast.get);
					qlvtXuLyGpLienVan.setSoGpvt(objCast.getSoGiayPhepVanTai());
					qlvtXuLyGpLienVan.setNgayCapGpvt(Validator.isNotNull(objCast.getNgayCapGiayPhepVanTai())?sdf.parse(objCast.getNgayCapGiayPhepVanTai()):null);
					qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
					if(Validator.isNotNull(qlvtXuLyGpLienVan) && listPhuongTien.size() > 0){
						for (DeNghiCapGiayPhepVanTaiDuongBoVietTrung.DanhSachXe danhSachXe : listPhuongTien) {
							id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTien.class.getName());
							qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTien(id);
							qlvtXuLyGpLienVanPhuongTien.setCapGplvId(Integer.valueOf("0"+qlvtXuLyGpLienVan.getId()));
							qlvtXuLyGpLienVanPhuongTien.setBienSo(danhSachXe.getBienKiemSoat());
							qlvtXuLyGpLienVanPhuongTien.setHinhThucHoatDong(danhSachXe.getHinhThucHoatDong());
							qlvtXuLyGpLienVanPhuongTien.setNhanHieu(danhSachXe.getNhanHieu());
							//TODO danhSachXe.getThoiGianDeNghiCapPhep() danhSachXe.getTuyenHoatDong()
							qlvtXuLyGpLienVanPhuongTien.setTrongTai(Integer.valueOf("0"+danhSachXe.getTrongTai()));
							
							String strThoiGianCapPhep= danhSachXe.getThoiGianDeNghiCapPhep();
							String strThoiGianTu = strThoiGianCapPhep.substring(0, 10);
							String strThoiGianDen = strThoiGianCapPhep.substring(13);
							
							log.info("-----------strThoiGianTu: " + strThoiGianTu);
							log.info("-----------strThoiGianDen: " + strThoiGianDen);
							
							qlvtXuLyGpLienVanPhuongTien.setXinCapPhepTuNgay(FormatData.parseStringToDateTypeDDMMYYYY(strThoiGianTu));
							qlvtXuLyGpLienVanPhuongTien.setXinCapPhepDenNgay(FormatData.parseStringToDateTypeDDMMYYYY(strThoiGianDen));
							
							
							qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTien(qlvtXuLyGpLienVanPhuongTien);
							List<String> listDiemDungNghis = danhSachXe.getDiemDungNghis();
							for (String string : listDiemDungNghis) {
								id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTienTramDungNghi.class.getName());
								QlvtXuLyGpLienVanPhuongTienTramDungNghi = QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTienTramDungNghi(id);
								QlvtXuLyGpLienVanPhuongTienTramDungNghi.setCapGplxPhuongTienId(Integer.valueOf("0"+qlvtXuLyGpLienVanPhuongTien.getId()));
								QlvtXuLyGpLienVanPhuongTienTramDungNghi.setMaTramDungNghi(string);
								QlvtXuLyGpLienVanPhuongTienTramDungNghi = QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTienTramDungNghi(QlvtXuLyGpLienVanPhuongTienTramDungNghi);
							}
						}
					}
					//UPDATE THONG TIN HO SO
					thongTinHoSo.setNguoiLienHeTraKetQua(objCast.getNguoiLienHeTraKqCapPhep());
					thongTinHoSo.setSoDienThoaiNguoiLienHe(objCast.getDienThoaiNguoiTraKqCapPhep());
					thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
					
				}else if(obj.getClass().getName().contains(".DeNghiCapGPVTVietTrungChoXeCongVu")){
					log.info("-----vao2 DeNghiCapGPVTVietTrungChoXeCongVu--------");
					
					DeNghiCapGPVTVietTrungChoXeCongVu objCast = (DeNghiCapGPVTVietTrungChoXeCongVu)obj;
					List<DeNghiCapGPVTVietTrungChoXeCongVu.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
					id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVan.class.getName());
					qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.createQlvtXuLyGpLienVan(id);
					qlvtXuLyGpLienVan.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
					//TODO
//					qlvtXuLyGpLienVan.setLoaiCapPhep(objCast.get);
//					objCast.get
//					qlvtXuLyGpLienVan.setSoGpvt(objCast.getSoGiayPhepVanTai());
//					qlvtXuLyGpLienVan.setNgayCapGpvt(Validator.isNotNull(objCast.getNgayCapGiayPhepVanTai())?sdf.parse(objCast.getNgayCapGiayPhepVanTai()):null);
					qlvtXuLyGpLienVan.setMucDichChuyenDi(objCast.getMucDichCapPhep());
					qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
					if(Validator.isNotNull(qlvtXuLyGpLienVan) && listPhuongTien.size() > 0){
						for (DeNghiCapGPVTVietTrungChoXeCongVu.DanhSachXe danhSachXe : listPhuongTien) {
							id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTien.class.getName());
							qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTien(id);
							qlvtXuLyGpLienVanPhuongTien.setCapGplvId(Integer.valueOf("0"+qlvtXuLyGpLienVan.getId()));
							qlvtXuLyGpLienVanPhuongTien.setBienSo(danhSachXe.getBienKiemSoat());
							qlvtXuLyGpLienVanPhuongTien.setCuaKhau(danhSachXe.getCuaKhau());
							qlvtXuLyGpLienVanPhuongTien.setMaCuaKhau(danhSachXe.getCuaKhau());
							qlvtXuLyGpLienVanPhuongTien.setNhanHieu(danhSachXe.getNhanHieu());
							//TODO danhSachXe.getThoiGianDeNghiCapPhep() danhSachXe.getTuyenHoatDong()
							qlvtXuLyGpLienVanPhuongTien.setTrongTai(Integer.valueOf("0"+danhSachXe.getTrongTai()));
							String strThoiGianCapPhep= danhSachXe.getThoiGianDeNghiCapPhep();
							String strThoiGianTu = strThoiGianCapPhep.substring(0, 10);
							String strThoiGianDen = strThoiGianCapPhep.substring(13);
							log.info("-----------strThoiGianTu: " + strThoiGianTu);
							log.info("-----------strThoiGianDen: " + strThoiGianDen);
							qlvtXuLyGpLienVanPhuongTien.setXinCapPhepTuNgay(FormatData.parseStringToDateTypeDDMMYYYY(strThoiGianTu));
							qlvtXuLyGpLienVanPhuongTien.setXinCapPhepDenNgay(FormatData.parseStringToDateTypeDDMMYYYY(strThoiGianDen));
							qlvtXuLyGpLienVanPhuongTien.setDoanhNghiepChoThue(thongTinHoSo.getTenDn());
							qlvtXuLyGpLienVanPhuongTien.setLoaiTuyen(danhSachXe.getTuyenHoatDong());
							
							qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTien(qlvtXuLyGpLienVanPhuongTien);
							
						}
					}
					
					//UPDATE THONG TIN HO SO
				
					thongTinHoSo.setNguoiLienHeTraKetQua(objCast.getNguoiLienHeTraKqCapPhep());
					thongTinHoSo.setSoDienThoaiNguoiLienHe(objCast.getDienThoaiNguoiTraKqCapPhep());
					thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
					
				}else if(obj.getClass().getName().contains(".DeNghiGioiThieuXinCapGPVTLoaiDVietNam")){
					log.info("-----vao3 DeNghiGioiThieuXinCapGPVTLoaiDVietNam--------");
					
					DeNghiGioiThieuXinCapGPVTLoaiDVietNam objCast = (DeNghiGioiThieuXinCapGPVTLoaiDVietNam)obj;
					List<DeNghiGioiThieuXinCapGPVTLoaiDVietNam.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
					id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVan.class.getName());
					qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.createQlvtXuLyGpLienVan(id);
					qlvtXuLyGpLienVan.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
					//TODO
//					qlvtXuLyGpLienVan.setLoaiCapPhep(objCast.get);
					qlvtXuLyGpLienVan.setSoGpvt(objCast.getSoGiayPhepVC());
					qlvtXuLyGpLienVan.setCoQuanCapPhepLienVan(objCast.getNoiCapGiayPhepVC());
					qlvtXuLyGpLienVan.setNgayCapGpvt(Validator.isNotNull(objCast.getNgayCapGiayPhepVC())?sdf.parse(objCast.getNgayCapGiayPhepVC()):null);
					qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
					if(Validator.isNotNull(qlvtXuLyGpLienVan) && listPhuongTien.size() > 0){
						for (DeNghiGioiThieuXinCapGPVTLoaiDVietNam.DanhSachXe danhSachXe : listPhuongTien) {
							id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTien.class.getName());
							qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTien(id);
							qlvtXuLyGpLienVanPhuongTien.setCapGplvId(Integer.valueOf("0"+qlvtXuLyGpLienVan.getId()));
							qlvtXuLyGpLienVanPhuongTien.setBienSo(danhSachXe.getBienKiemSoat());
							qlvtXuLyGpLienVanPhuongTien.setNhanHieu(danhSachXe.getNhanHieu());
							qlvtXuLyGpLienVanPhuongTien.setSoKhung(danhSachXe.getSoKhung());
							qlvtXuLyGpLienVanPhuongTien.setMauSon(danhSachXe.getMauSon());
							qlvtXuLyGpLienVanPhuongTien.setSoMay(danhSachXe.getSoMay());
							//TODO danhSachXe.getThoiGianDeNghiCapPhep() danhSachXe.getTuyenHoatDong()
							String strThoiGianCapPhep= danhSachXe.getThoiGianCapPhep();
							String strThoiGianTu = strThoiGianCapPhep.substring(0, 10);
							String strThoiGianDen = strThoiGianCapPhep.substring(13);

							log.info("-----------strThoiGianTu: " + strThoiGianTu);
							log.info("-----------strThoiGianDen: " + strThoiGianDen);
							
							qlvtXuLyGpLienVanPhuongTien.setXinCapPhepTuNgay(FormatData.parseStringToDateTypeDDMMYYYY(strThoiGianTu));
							qlvtXuLyGpLienVanPhuongTien.setXinCapPhepDenNgay(FormatData.parseStringToDateTypeDDMMYYYY(strThoiGianDen));
							
							qlvtXuLyGpLienVanPhuongTien.setTrongTai(Integer.valueOf("0"+danhSachXe.getTrongTai()));
							qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTien(qlvtXuLyGpLienVanPhuongTien);
							List<String> listDiemDungNghis = danhSachXe.getDiemDungNghis();
							for (String string : listDiemDungNghis) {
								id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTienTramDungNghi.class.getName());
								QlvtXuLyGpLienVanPhuongTienTramDungNghi = QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTienTramDungNghi(id);
								QlvtXuLyGpLienVanPhuongTienTramDungNghi.setCapGplxPhuongTienId(Integer.valueOf("0"+qlvtXuLyGpLienVanPhuongTien.getId()));
								QlvtXuLyGpLienVanPhuongTienTramDungNghi.setMaTramDungNghi(string);
								QlvtXuLyGpLienVanPhuongTienTramDungNghi = QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTienTramDungNghi(QlvtXuLyGpLienVanPhuongTienTramDungNghi);
							}
						}
					}
					//UPDATE THONG TIN HO SO
					thongTinHoSo.setDiaChiNguoiLienHeTraKetQua(objCast.getDiaChiNguoiLienHeTraKqCapPhep());
					thongTinHoSo.setSoDienThoaiNguoiLienHe(objCast.getDienThoaiNguoiTraKqCapPhep());
					thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
				}else if(obj.getClass().getName().contains(".DonXinCapGPVTLoaiDCuaPTTrungQuoc")){
					log.info("-----vao4 DonXinCapGPVTLoaiDCuaPTTrungQuoc--------");
					
					DonXinCapGPVTLoaiDCuaPTTrungQuoc objCast = (DonXinCapGPVTLoaiDCuaPTTrungQuoc)obj;
					List<DonXinCapGPVTLoaiDCuaPTTrungQuoc.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
					id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVan.class.getName());
					qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.createQlvtXuLyGpLienVan(id);
					qlvtXuLyGpLienVan.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
					//TODO
//					qlvtXuLyGpLienVan.setLoaiCapPhep(objCast.get);
					qlvtXuLyGpLienVan.setSoGpvt(objCast.getSoGiayPhepVCTQ());
					qlvtXuLyGpLienVan.setCoQuanCapPhepLienVan(objCast.getNoiCapGiayPhepVCTQ());
					qlvtXuLyGpLienVan.setNgayCapGpvt(Validator.isNotNull(objCast.getNgayCapGiayPhepVCTQ())?sdf.parse(objCast.getNgayCapGiayPhepVCTQ()):null);
					qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
					if(Validator.isNotNull(qlvtXuLyGpLienVan) && listPhuongTien.size() > 0){
						for (DonXinCapGPVTLoaiDCuaPTTrungQuoc.DanhSachXe danhSachXe : listPhuongTien) {
							id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTien.class.getName());
							qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTien(id);
							qlvtXuLyGpLienVanPhuongTien.setCapGplvId(Integer.valueOf("0"+qlvtXuLyGpLienVan.getId()));
							qlvtXuLyGpLienVanPhuongTien.setBienSo(danhSachXe.getBienKiemSoat());
							qlvtXuLyGpLienVanPhuongTien.setNhanHieu(danhSachXe.getNhanHieu());
							qlvtXuLyGpLienVanPhuongTien.setSoKhung(danhSachXe.getSoKhung());
							qlvtXuLyGpLienVanPhuongTien.setMauSon(danhSachXe.getMauSon());
							qlvtXuLyGpLienVanPhuongTien.setSoMay(danhSachXe.getSoMay());
							//TODO danhSachXe.getThoiGianDeNghiCapPhep() danhSachXe.getTuyenHoatDong()
							qlvtXuLyGpLienVanPhuongTien.setLoaiHangVanChuyen(danhSachXe.getLoaiHangVanChuyen());
							qlvtXuLyGpLienVanPhuongTien.setTrongTai(Integer.valueOf("0"+danhSachXe.getTrongTai()));
							String strThoiGianCapPhep= danhSachXe.getThoiGianCapPhep();
							String strThoiGianTu = strThoiGianCapPhep.substring(0, 10);
							String strThoiGianDen = strThoiGianCapPhep.substring(13);
							qlvtXuLyGpLienVanPhuongTien.setXinCapPhepTuNgay(FormatData.parseStringToDateTypeDDMMYYYY(strThoiGianTu));
							qlvtXuLyGpLienVanPhuongTien.setXinCapPhepDenNgay(FormatData.parseStringToDateTypeDDMMYYYY(strThoiGianDen));
							qlvtXuLyGpLienVanPhuongTien.setHanhTrinh(danhSachXe.getHanhTrinhDeNghi());
							qlvtXuLyGpLienVanPhuongTien.setThoiGianKhoiHanh(FormatData.parseStringToDateTypeDDMMYYYY(danhSachXe.getThoiGianKhoiHanh()));
							qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTien(qlvtXuLyGpLienVanPhuongTien);
							List<String> listDiemDungNghis = danhSachXe.getDiemDungNghis();
							for (String string : listDiemDungNghis) {
								id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTienTramDungNghi.class.getName());
								QlvtXuLyGpLienVanPhuongTienTramDungNghi = QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTienTramDungNghi(id);
								QlvtXuLyGpLienVanPhuongTienTramDungNghi.setCapGplxPhuongTienId(Integer.valueOf("0"+qlvtXuLyGpLienVanPhuongTien.getId()));
								QlvtXuLyGpLienVanPhuongTienTramDungNghi.setMaTramDungNghi(string);
								QlvtXuLyGpLienVanPhuongTienTramDungNghi = QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTienTramDungNghi(QlvtXuLyGpLienVanPhuongTienTramDungNghi);
							}
						}
					}
					//UPDATE THONG TIN HO SO
					thongTinHoSo.setNguoiLienHeTraKetQua(objCast.getNguoiLienHeTraKqCapPhep());
					thongTinHoSo.setSoDienThoaiNguoiLienHe(objCast.getDienThoaiNguoiTraKqCapPhep());
					thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
				}else if(obj.getClass().getName().contains(".DeNghiGiaHanGiayPhepVanTaiChoPTTrungQuoc")){
					log.info("-----vao5 DeNghiGiaHanGiayPhepVanTaiChoPTTrungQuoc--------");
					
					DeNghiGiaHanGiayPhepVanTaiChoPTTrungQuoc objCast = (DeNghiGiaHanGiayPhepVanTaiChoPTTrungQuoc)obj;
					id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVan.class.getName());
					qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.createQlvtXuLyGpLienVan(id);
					qlvtXuLyGpLienVan.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
					//TODO
//					qlvtXuLyGpLienVan.setLoaiCapPhep(objCast.get);
					qlvtXuLyGpLienVan.setLoaiGiayPhepLienVan(objCast.getLoaiGiayPhepVT());
					qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
					
					//UPDATE THONG TIN HO SO
					
				}else if(obj.getClass().getName().contains(".DeNghiCapLaiGPVTVietTrungDoHongMat")){
					log.info("-----vao6 DeNghiCapLaiGPVTVietTrungDoHongMat--------");
					
					DeNghiCapLaiGPVTVietTrungDoHongMat objCast = (DeNghiCapLaiGPVTVietTrungDoHongMat)obj;
					List<DeNghiCapLaiGPVTVietTrungDoHongMat.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
					id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVan.class.getName());
					qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.createQlvtXuLyGpLienVan(id);
					qlvtXuLyGpLienVan.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
					//TODO
//					qlvtXuLyGpLienVan.setLoaiCapPhep(objCast.get);
					qlvtXuLyGpLienVan.setSoGpvt(objCast.getSoGiayPhepVanTai());
					qlvtXuLyGpLienVan.setCoQuanCapPhepLienVan(objCast.getNoiCapGiayPhepVanTai());
					qlvtXuLyGpLienVan.setNgayCapGpvt(Validator.isNotNull(objCast.getNgayCapGiayPhepVanTai())?sdf.parse(objCast.getNgayCapGiayPhepVanTai()):null);
					qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
					if(Validator.isNotNull(qlvtXuLyGpLienVan) && listPhuongTien.size() > 0){
						for (DeNghiCapLaiGPVTVietTrungDoHongMat.DanhSachXe danhSachXe : listPhuongTien) {
							id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTien.class.getName());
							qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTien(id);
							qlvtXuLyGpLienVanPhuongTien.setCapGplvId(Integer.valueOf("0"+qlvtXuLyGpLienVan.getId()));
							qlvtXuLyGpLienVanPhuongTien.setBienSo(danhSachXe.getBienKiemSoat());
							qlvtXuLyGpLienVanPhuongTien.setNhanHieu(danhSachXe.getNhanHieu());
							//TODO danhSachXe.getThoiGianDeNghiCapPhep() danhSachXe.getTuyenHoatDong()
							qlvtXuLyGpLienVanPhuongTien.setTrongTai(Integer.valueOf("0"+danhSachXe.getTrongTai()));
							String strThoiGianCapPhep= danhSachXe.getThoiGianDeNghiCapPhep();
							String strThoiGianTu = strThoiGianCapPhep.substring(0, 10);
							String strThoiGianDen = strThoiGianCapPhep.substring(13);
							

							log.info("-----------strThoiGianTu: " + strThoiGianTu);
							log.info("-----------strThoiGianDen: " + strThoiGianDen);
							
							qlvtXuLyGpLienVanPhuongTien.setXinCapPhepTuNgay(FormatData.parseStringToDateTypeDDMMYYYY(strThoiGianTu));
							qlvtXuLyGpLienVanPhuongTien.setXinCapPhepDenNgay(FormatData.parseStringToDateTypeDDMMYYYY(strThoiGianDen));
							
							qlvtXuLyGpLienVanPhuongTien.setSoGiayPhepLienVanPhuongTien(danhSachXe.getSoGiayPhepVTMat());
							
							qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTien(qlvtXuLyGpLienVanPhuongTien);
							List<String> listDiemDungNghis = danhSachXe.getDiemDungNghis();
							for (String string : listDiemDungNghis) {
								id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTienTramDungNghi.class.getName());
								QlvtXuLyGpLienVanPhuongTienTramDungNghi = QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTienTramDungNghi(id);
								QlvtXuLyGpLienVanPhuongTienTramDungNghi.setCapGplxPhuongTienId(Integer.valueOf("0"+qlvtXuLyGpLienVanPhuongTien.getId()));
								QlvtXuLyGpLienVanPhuongTienTramDungNghi.setMaTramDungNghi(string);
								QlvtXuLyGpLienVanPhuongTienTramDungNghi = QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTienTramDungNghi(QlvtXuLyGpLienVanPhuongTienTramDungNghi);
							}
						}
					}
					
					//UPDATE THONG TIN HO SO
					thongTinHoSo.setNguoiLienHeTraKetQua(objCast.getNguoiLienHeTraKqCapPhep());
					thongTinHoSo.setSoDienThoaiNguoiLienHe(objCast.getDienThoaiNguoiTraKqCapPhep());
					thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
					
				}else if(obj.getClass().getName().contains(".GiayDangKyKhaiThacTuyenVietTrung")){
					log.info("-----vao7 GiayDangKyKhaiThacTuyenVietTrung--------");
					GiayDangKyKhaiThacTuyenVietTrung objCast = (GiayDangKyKhaiThacTuyenVietTrung)obj;
					List<GiayDangKyKhaiThacTuyenVietTrung.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
					id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVan.class.getName());
					qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.createQlvtXuLyGpLienVan(id);
					qlvtXuLyGpLienVan.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
					//TODO
//					qlvtXuLyGpLienVan.setLoaiCapPhep(objCast.get);
					qlvtXuLyGpLienVan.setSoGpvt(objCast.getSoGiayPhepVanTai());
					qlvtXuLyGpLienVan.setCoQuanCapPhepLienVan(objCast.getNoiCapGiayPhepVanTai());
					qlvtXuLyGpLienVan.setNgayCapGpvt(Validator.isNotNull(objCast.getNgayCapGiayPhepVantai())?sdf.parse(objCast.getNgayCapGiayPhepVantai()):null);
					qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
					if(Validator.isNotNull(qlvtXuLyGpLienVan) && listPhuongTien.size() > 0){
						for (GiayDangKyKhaiThacTuyenVietTrung.DanhSachXe danhSachXe : listPhuongTien) {
							id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTien.class.getName());
							qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTien(id);
							qlvtXuLyGpLienVanPhuongTien.setCapGplvId(Integer.valueOf("0"+qlvtXuLyGpLienVan.getId()));
							qlvtXuLyGpLienVanPhuongTien.setBienSo(danhSachXe.getBienKiemSoat());
							//TODO danhSachXe.getThoiGianDeNghiCapPhep() danhSachXe.getTuyenHoatDong()
							qlvtXuLyGpLienVanPhuongTien.setCuaKhau(danhSachXe.getCuaKhau());
							qlvtXuLyGpLienVanPhuongTien.setMaCuaKhau(danhSachXe.getCuaKhau());
							
							qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTien(qlvtXuLyGpLienVanPhuongTien);
						}
					}
					//UPDATE THONG TIN HO SO
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void vanThuProcessNghiepVuQuyTrinh6(Object obj,long idThuTucHanhChinh, long hoSoThuTucId,QlvtThongTinHoSo thongTinHoSo,QlvtThongTinXuLy addThongTinXuLy) {
			log.info("----- Cấp phù hiệu, biển hiệu -----"+obj.getClass().getName());
			QLVTXuLyBienHieu ettXLBienHieu = null;
			QLVTXuLyBienHieuPhuongTien ettXLBienHieuPhuongTien = null;
			QLVTXuLyPhuHieu ettXLPhuHieu = null;
			QLVTXuLyPhuHieuPhuongTien ettXLPhuHieuPhuongTien = null;
			QLVTXuLyPhuHieuPhuongTienTuyen ettXLPhuHieuPhuongTienTuyen = null;
			int id = -1;
			try {
				if(obj.getClass().getName().contains(".DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich")){
					DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich objCast = (DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich)obj;
					List<DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
					id = (int) CounterLocalServiceUtil.increment(QLVTXuLyBienHieu.class.getName());
					ettXLBienHieu = QLVTXuLyBienHieuLocalServiceUtil.createQLVTXuLyBienHieu(id);
					ettXLBienHieu.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
					String strLv = "";
					if(Validator.isNotNull(objCast.getLinhVucKinhDoanhs())){
						for(String str: objCast.getLinhVucKinhDoanhs()){
							strLv += str+",";
						}
					}
					if(strLv.length()<=0){
						strLv +=",";
					}
					strLv = strLv.substring(0,strLv.lastIndexOf(",")-1);
					ettXLBienHieu.setLinhVucKinhDoanh(strLv);
					ettXLBienHieu.setSoLuongXe(objCast.getSoXeDeNghi());
					ettXLBienHieu.setGpkdLuuHanhQuocTe(objCast.getSoGPLH());
					ettXLBienHieu.setGpkdLuuHanhQuocTeCQCAP(objCast.getNoiCapGPLH());
					ettXLBienHieu.setGpkdLuuHanhQuocTeNgayCap(Validator.isNotNull(objCast.getNgayCapGPLH())?sdf.parse(objCast.getNgayCapGPLH()):null);
					ettXLBienHieu = QLVTXuLyBienHieuLocalServiceUtil.updateQLVTXuLyBienHieu(ettXLBienHieu);
					if(Validator.isNotNull(ettXLBienHieu) && listPhuongTien.size() > 0){
						for (DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich.DanhSachXe danhSachXe : listPhuongTien) {
							id = (int) CounterLocalServiceUtil.increment(QLVTXuLyBienHieuPhuongTien.class.getName());
							ettXLBienHieuPhuongTien = QLVTXuLyBienHieuPhuongTienLocalServiceUtil.createQLVTXuLyBienHieuPhuongTien(id);
							ettXLBienHieuPhuongTien.setCapBienHieuID(ettXLBienHieu.getId());
							ettXLBienHieuPhuongTien.setNhanHieu(danhSachXe.getTenHieu());
							ettXLBienHieuPhuongTien.setBienSo(danhSachXe.getBienSoXe());
							ettXLBienHieuPhuongTien.setSoKhung(danhSachXe.getSoKhung());
							ettXLBienHieuPhuongTien.setNamSx(Validator.isNotNull(danhSachXe.getNamSX())?Integer.valueOf(danhSachXe.getNamSX()):0);
							ettXLBienHieuPhuongTien.setMauSon(danhSachXe.getMauSon());
							ettXLBienHieuPhuongTien.setSoChoNgoi(Validator.isNotNull(danhSachXe.getSoCho())?Integer.valueOf(danhSachXe.getSoCho()):0);
							ettXLBienHieuPhuongTien.setSoMay(danhSachXe.getSoMay());
							ettXLBienHieuPhuongTien = QLVTXuLyBienHieuPhuongTienLocalServiceUtil.updateQLVTXuLyBienHieuPhuongTien(ettXLBienHieuPhuongTien);
						}
					}
				}else{
					GiayDeNghiCapPhuHieuBienHieu objCast = (GiayDeNghiCapPhuHieuBienHieu)obj;
					List<GiayDeNghiCapPhuHieuBienHieu.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
					id = (int) CounterLocalServiceUtil.increment(QLVTXuLyPhuHieu.class.getName());
					ettXLPhuHieu = QLVTXuLyPhuHieuLocalServiceUtil.createQLVTXuLyPhuHieu(id);
					ettXLPhuHieu.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
					ettXLPhuHieu.setSoLuong(Integer.valueOf(""+objCast.getSoLuongDeNghiCap()));
					ettXLPhuHieu.setSoLuongBH_PHNopLai(Integer.valueOf("0"+objCast.getSoLuongNopLai()));
					ettXLPhuHieu.setSoLuongBHPHNopLai(Integer.valueOf("0"+objCast.getSoLuongNopLai()));
					ettXLPhuHieu = QLVTXuLyPhuHieuLocalServiceUtil.updateQLVTXuLyPhuHieu(ettXLPhuHieu);
					if(Validator.isNotNull(ettXLPhuHieu) && listPhuongTien.size() > 0){
						for (GiayDeNghiCapPhuHieuBienHieu.DanhSachXe danhSachXe : listPhuongTien) {
							id = (int) CounterLocalServiceUtil.increment(QLVTXuLyPhuHieuPhuongTien.class.getName());
							ettXLPhuHieuPhuongTien = QLVTXuLyPhuHieuPhuongTienLocalServiceUtil.createQLVTXuLyPhuHieuPhuongTien(id);
							ettXLPhuHieuPhuongTien.setCapPhuHieuID(ettXLPhuHieu.getId());
							ettXLPhuHieuPhuongTien.setNhanHieu(danhSachXe.getNhanHieu());
							ettXLPhuHieuPhuongTien.setBienSo(danhSachXe.getBienSoXe());
							ettXLPhuHieuPhuongTien.setNamSanXuat(Validator.isNotNull(danhSachXe.getNamSX())?Integer.valueOf(danhSachXe.getNamSX()):0);
							ettXLPhuHieuPhuongTien.setTrongTai(Validator.isNotNull(danhSachXe.getSucChua())?Integer.valueOf(danhSachXe.getSucChua()):0);
							ettXLPhuHieuPhuongTien.setNoiSanXuat(danhSachXe.getNuocSX());
							ettXLPhuHieuPhuongTien.setMaTuyenCoDinh(danhSachXe.getTuyenCD());
							ettXLPhuHieuPhuongTien = QLVTXuLyPhuHieuPhuongTienLocalServiceUtil.updateQLVTXuLyPhuHieuPhuongTien(ettXLPhuHieuPhuongTien);
						}
					}
				}
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void vanThuProcessNghiepVuQuyTrinh7(Object obj,long idThuTucHanhChinh, long hoSoThuTucId,QlvtThongTinHoSo thongTinHoSo,QlvtThongTinXuLy addThongTinXuLy) {
			log.info("----- Cấp giấy phép kinh doanh vận tải bằng ô tô -----");
			
			QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto = null;
			QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai = null;
			
			int id = -1;
			try {
				log.info("----- obj.getClass().getName() -----"+obj.getClass().getName());
					DeNghiCapGiayPhepKDVTBangXeOto objCast = (DeNghiCapGiayPhepKDVTBangXeOto)obj;
				//	List<DeNghiCapGiayPhepKDVTBangXeOto.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
					id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpkdvtBangOto.class.getName());
					qlvtXuLyGpkdvtBangOto = QlvtXuLyGpkdvtBangOtoLocalServiceUtil.createQlvtXuLyGpkdvtBangOto(id);
					qlvtXuLyGpkdvtBangOto.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
					//TODO
//					qlvtXuLyGpLienVan.setLoaiCapPhep(objCast.get);
					qlvtXuLyGpkdvtBangOto.setCoQuanCapGpkdVanTaiBangOto(objCast.getCoQuanGui());
					qlvtXuLyGpkdvtBangOto.setSoGpkdVanTaiBangOto(objCast.getSoGiayPhepKinhDoanh());
					qlvtXuLyGpkdvtBangOto.setNgayCapGpkdVanTaiBangOto(Validator.isNotNull(objCast.getNgayCapGiayPhepKinhDoanh())?sdf.parse(objCast.getNgayCapGiayPhepKinhDoanh()):null);
					List<String> listPhuongTien = objCast.getLoaiHinhKDVTs();
					//qlvtXuLyGpkdvtBangOto.setNgayCapGpvt(Validator.isNotNull(objCast.getNgayCapGiayPhepKinhDoanh()())?sdf.parse(objCast.getNgayCapGPVanTai()):null);
					qlvtXuLyGpkdvtBangOto = QlvtXuLyGpkdvtBangOtoLocalServiceUtil.updateQlvtXuLyGpkdvtBangOto(qlvtXuLyGpkdvtBangOto);
					if(Validator.isNotNull(qlvtXuLyGpkdvtBangOto) && listPhuongTien.size() > 0){
						for (String loaihinhhoatdong : listPhuongTien) {
							id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.class.getName());
							qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai = QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceUtil.createQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(id);
							qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setGpkdvtBangOtoId(Integer.valueOf("0"+qlvtXuLyGpkdvtBangOto.getId()));
							qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setMaLoaiHinhHoatDong(loaihinhhoatdong);
//							qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setHinhThucHoatDong(danhSachXe.getHinhThucHoatDong());
//							qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setNhanHieu(danhSachXe.getNhanHieu());
							//TODO danhSachXe.getThoiGianDeNghiCapPhep() danhSachXe.getTuyenHoatDong()
							qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai = QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceUtil.updateQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai);
							
						}
					}
			} catch (Exception e) {
					// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		public void vanThuProcessNghiepVuQuyTrinh8(Object obj,long idThuTucHanhChinh, long hoSoThuTucId,QlvtThongTinHoSo thongTinHoSo,QlvtThongTinXuLy addThongTinXuLy) {
			log.info("----- Chấp thuận khai thác tuyến, bổ sung, thay thế phương tiện khai thác tuyến Việt Nam - Lào, Việt Nam - Campuchia -----");
			QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe = null;
			QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien = null;
			QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe = null;
			QlvtXuLyKTTQuocTeDiemDungNghi  qlvtXuLyKTTQuocTeDiemDungNghi = null;
			int id = -1;
			try {
				if(obj.getClass().getName().contains(".DKKTVTTuyenCoDinhBangOtoVietLao")){
					DKKTVTTuyenCoDinhBangOtoVietLao objCast = (DKKTVTTuyenCoDinhBangOtoVietLao)obj;
					List<DKKTVTTuyenCoDinhBangOtoVietLao.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
					id = (int) CounterLocalServiceUtil.increment(QlvtXuLyKTTQuocTe.class.getName());
					qlvtXuLyKTTQuocTe = QlvtXuLyKTTQuocTeLocalServiceUtil.createQlvtXuLyKTTQuocTe(id);
					qlvtXuLyKTTQuocTe.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
					qlvtXuLyKTTQuocTe.setBenDen(objCast.getBenDen());
					qlvtXuLyKTTQuocTe.setBenDi(objCast.getBenDi());
					qlvtXuLyKTTQuocTe.setCuaKhau(objCast.getCuaKhauDen());
					qlvtXuLyKTTQuocTe.setDiemDen(objCast.getTinhTPDen());
					qlvtXuLyKTTQuocTe.setDiemDi(objCast.getTinhTPDi());
					qlvtXuLyKTTQuocTe.setCuLyVanChuyen(Integer.valueOf(objCast.getCuLy()));
					qlvtXuLyKTTQuocTe.setHanhTrinhChay(objCast.getHanhTrinh());
					//TODO
					qlvtXuLyKTTQuocTe = QlvtXuLyKTTQuocTeLocalServiceUtil.updateQlvtXuLyKTTQuocTe(qlvtXuLyKTTQuocTe);
					if(Validator.isNotNull(qlvtXuLyKTTQuocTe) && listPhuongTien.size() > 0){
						log.info("---------------qlvtXuLyKTTQuocTe + listPhuongTien.size():"+listPhuongTien.size());
						for (DKKTVTTuyenCoDinhBangOtoVietLao.DanhSachXe danhSachXe : listPhuongTien) {
							id = (int) CounterLocalServiceUtil.increment(QlvtXuLyKTTQuocTePhuongTien.class.getName());
							qlvtXuLyKTTQuocTePhuongTien = QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil.createQlvtXuLyKTTQuocTePhuongTien(id);
							qlvtXuLyKTTQuocTePhuongTien.setCapPhepKTTQuocTeID(Integer.valueOf("0"+qlvtXuLyKTTQuocTe.getId()));
							qlvtXuLyKTTQuocTePhuongTien.setBienSo(danhSachXe.getBienKiemSoat());
							qlvtXuLyKTTQuocTePhuongTien.setNhanHieu(danhSachXe.getLoaiXe());
							qlvtXuLyKTTQuocTePhuongTien.setTrongTai(Integer.valueOf("0"+danhSachXe.getSoGhe()));
							qlvtXuLyKTTQuocTePhuongTien.setNamSx(Integer.valueOf("0"+danhSachXe.getNamSx()));
							log.info("---------------updateeeeeeeeeeeeeeeeeeeeeeeee------------------");
							qlvtXuLyKTTQuocTePhuongTien.setTenDangKySoHuu(danhSachXe.getTenDangKy());
							qlvtXuLyKTTQuocTePhuongTien.setKttQuocTeID(qlvtXuLyKTTQuocTe.getId());
							qlvtXuLyKTTQuocTePhuongTien = QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil.updateQlvtXuLyKTTQuocTePhuongTien(qlvtXuLyKTTQuocTePhuongTien);
						}
					}
					log.info("---------------END------------------");
					//update QlvtThongTinHoSo
					thongTinHoSo.setSoDkkd(objCast.getSoGiayPhepVanTai());
					thongTinHoSo.setNgayCapDkkd(vn.dtt.duongbo.utils.format.FormatData.parseStringToDateTypeDDMMYYYY(objCast.getNgayCapGiayPhepVantai()));
					thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
					
				}else if(obj.getClass().getName().contains(".TBaoDieuChinhTanSuatXeChayTuyenCDVietLao")){
					
					log.info("---------------TBaoDieuChinhTanSuatXeChayTuyenCDVietLao------------------");
					TBaoDieuChinhTanSuatXeChayTuyenCDVietLao objCast = (TBaoDieuChinhTanSuatXeChayTuyenCDVietLao)obj;
					List<TBaoDieuChinhTanSuatXeChayTuyenCDVietLao.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
					id = (int) CounterLocalServiceUtil.increment(QlvtXuLyKTTQuocTe.class.getName());
					qlvtXuLyKTTQuocTe = QlvtXuLyKTTQuocTeLocalServiceUtil.createQlvtXuLyKTTQuocTe(id);
					qlvtXuLyKTTQuocTe.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
					qlvtXuLyKTTQuocTe = QlvtXuLyKTTQuocTeLocalServiceUtil.updateQlvtXuLyKTTQuocTe(qlvtXuLyKTTQuocTe);
					if(Validator.isNotNull(qlvtXuLyKTTQuocTe) && listPhuongTien.size() > 0){
						for (TBaoDieuChinhTanSuatXeChayTuyenCDVietLao.DanhSachXe danhSachXe : listPhuongTien) {
							id = (int) CounterLocalServiceUtil.increment(QlvtXuLyKTTQuocTePhuongTien.class.getName());
							qlvtXuLyKTTQuocTePhuongTien = QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil.createQlvtXuLyKTTQuocTePhuongTien(id);
							qlvtXuLyKTTQuocTePhuongTien.setCapPhepKTTQuocTeID(Integer.valueOf("0"+qlvtXuLyKTTQuocTe.getId()));
							qlvtXuLyKTTQuocTePhuongTien.setBienSo(danhSachXe.getBienSoXe());
							qlvtXuLyKTTQuocTePhuongTien.setNhanHieu(danhSachXe.getNhanHieu());
							qlvtXuLyKTTQuocTePhuongTien.setTrongTai(Integer.valueOf("0"+danhSachXe.getTrongTai()));
							qlvtXuLyKTTQuocTePhuongTien.setNamSx(Integer.valueOf("0"+danhSachXe.getNamSX()));
							qlvtXuLyKTTQuocTePhuongTien.setKttQuocTeID(qlvtXuLyKTTQuocTe.getId());
							qlvtXuLyKTTQuocTePhuongTien.setTenDangKySoHuu(danhSachXe.getTenDK());
							qlvtXuLyKTTQuocTePhuongTien = QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil.updateQlvtXuLyKTTQuocTePhuongTien(qlvtXuLyKTTQuocTePhuongTien);
						}
					}
					//update QlvtThongTinHoSo
					thongTinHoSo.setSoDkkd(objCast.getSoGiayPhepVanTai());
					thongTinHoSo.setNgayCapDkkd(vn.dtt.duongbo.utils.format.FormatData.parseStringToDateTypeDDMMYYYY(objCast.getNgayCapGiayPhepVantai()));
					thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
				}
				
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		public void vanThuProcessNghiepVuQuyTrinh9(Object obj,long idThuTucHanhChinh, long hoSoThuTucId,QlvtThongTinHoSo thongTinHoSo,QlvtThongTinXuLy addThongTinXuLy) {
			log.info("----- Ngừng khai thác tuyến, điều chỉnh tần suất chạy xe trên tuyến Việt Nam - Lào, Việt Nam - Campuchia -----");
			QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe = null;
			QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien = null;
			QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe = null;
			QlvtXuLyKTTQuocTeDiemDungNghi  qlvtXuLyKTTQuocTeDiemDungNghi = null;
			int id = -1;
			try {
				if(obj.getClass().getName().contains(".NgungKhaiThacTuyenVTHKCDBangOtoVietLao")){
					NgungKhaiThacTuyenVTHKCDBangOtoVietLao objCast = (NgungKhaiThacTuyenVTHKCDBangOtoVietLao)obj;
					id = (int) CounterLocalServiceUtil.increment(QlvtXuLyKTTQuocTe.class.getName());
					qlvtXuLyKTTQuocTe = QlvtXuLyKTTQuocTeLocalServiceUtil.createQlvtXuLyKTTQuocTe(id);
					qlvtXuLyKTTQuocTe.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
					//TODO
					qlvtXuLyKTTQuocTe = QlvtXuLyKTTQuocTeLocalServiceUtil.updateQlvtXuLyKTTQuocTe(qlvtXuLyKTTQuocTe);
				
					//update QlvtThongTinHoSo
					thongTinHoSo.setSoDkkd(objCast.getSoGiayPhepVanTai());
					thongTinHoSo.setNgayCapDkkd(vn.dtt.duongbo.utils.format.FormatData.parseStringToDateTypeDDMMYYYY(objCast.getNgayCapGiayPhepVantai()));
					thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
				}
				
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	  

	private static Log log =   LogFactoryUtil.getLog(VanThuThreadImpl.class);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
}
