package vn.dtt.thread.trahoso;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.hpsf.Thumbnail;

import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyBienHieuLocalService;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyBienHieuLocalServiceUtil;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyBienHieuPhuongTienLocalService;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyBienHieuPhuongTienLocalServiceUtil;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyPhuHieuLocalServiceUtil;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyPhuHieuPhuongTienLocalServiceUtil;
import vn.dtt.duongbo.dao.common.model.DmDataItem;
import vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo;
import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo;
import vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh;
import vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalService;
import vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.model.MotCuaChuyenDichTrangThai;
import vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy;
import vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy;
import vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo;
import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit;
import vn.dtt.duongbo.dao.motcua.service.MotCuaChuyenDichTrangThaiLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaPhanCongXuLyLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtWorkingUnitLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil;
import vn.dtt.duongbo.maudon.model.CapGiayPhepVanTaiVietTrung;
import vn.dtt.duongbo.maudon.model.CongVanTuChoiCapPHBH;
import vn.dtt.duongbo.maudon.model.CongVanYCBSHoSoDeNghiCapPHBH;
import vn.dtt.duongbo.maudon.model.PhuHieuLienVanVietLaos;
import vn.dtt.duongbo.maudon.model.PhuHieuXe6LoaiXe;
import vn.dtt.duongbo.maudon.xml.MauDonFactory;
import vn.dtt.duongbo.portlet.BienHieuPortlet;
import vn.dtt.duongbo.report.ReportBusinessUtils;
import vn.dtt.duongbo.report.ReportUtils;

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


public class HSTraDoanhNghiepThreadImpl implements  MessageListener {

	
	public void receive(Message message) throws MessageListenerException {
	       try {
	            doReceive(message);
	        }
	        catch (Exception e) {
	            _log.error("Unable to process message " + message, e);
	        }
		
	}
	  protected void doReceive(Message message) {
		_log.info("*****************process send doanh nghiep***************************");
		  ServiceContext context = (ServiceContext)message.get ("context");
			try {
				long userId = (Long)message.get("userId");
				long dichChuyenTrangThaiPhieuSuLy = message.getLong("dichChuyenTrangThaiPhieuSuLy");
				long phieuXuLyId = message.getLong("phieuXuLyId");
				long hoSoThuTucId = message.getLong("hoSoThuTucId");
				long quyTrinhThuTucId = message.getLong("quyTrinhThuTucId");
				long idThuTucHanhChinh = message.getLong("idThuTucHanhChinh");
				String tenTaiLieu = message.getString("tenTaiLieu");
				long idTaiLieu = message.getLong("idTaiLieu");
				long trangThaiHienTaiFixed = message.getLong("trangThaiHienTaiFixed");
				String keyDichChuyen = message.getString("keyDichChuyen");
				String userIdXuLy = message.getString("userIdXuLy");
				String filePath = message.getString("filePath");
				MotCuaChuyenDichTrangThai trangThai = MotCuaChuyenDichTrangThaiLocalServiceUtil.fetchByF_DieuKienChuyenDich_TrangThaiNguonId_QuyTrinhThuTucId(quyTrinhThuTucId, trangThaiHienTaiFixed, keyDichChuyen);
				MotCuaTrangThaiHoSo ettRTDoanhNghiepNoiDungHoSoHienTai = MotCuaTrangThaiHoSoLocalServiceUtil.fetchMotCuaTrangThaiHoSo(trangThaiHienTaiFixed);
				MotCuaPhieuXuLy phieu = MotCuaPhieuXuLyLocalServiceUtil.fetchMotCuaPhieuXuLy(phieuXuLyId);
//				MotCuaTrangThaiHoSo ettRTDoanhNghiepNoiDungHoSoHienTai = MotCuaTrangThaiHoSoLocalServiceUtil.fetchMotCuaTrangThaiHoSo(phieu.getTrangThaiHienTaiId());
				//cập nhật người xử lý, tổ chức quản lý khi chuyển dịch trạng thái
				if(Validator.isNotNull(trangThai) && trangThai.getChuyenXuLy() != 1){
					if(trangThai.getChuyenXuLy() ==0){
						MotCuaPhanCongXuLy ettPhanCong = MotCuaPhanCongXuLyLocalServiceUtil.fetchByF_UNI_PhieuXuLyId(phieuXuLyId);
						TthcHoSoThuTuc ettHsTT = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
						phieu.setNguoiXuLy(0);
						phieu.setToChucQuanLy(ettPhanCong.getToChucXetDuyet());
						ettHsTT.setToChucQuanLy(ettPhanCong.getToChucXetDuyet());
						MotCuaPhieuXuLyLocalServiceUtil.updateMotCuaPhieuXuLy(phieu);
						TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(ettHsTT);
					}else if(trangThai.getChuyenXuLy() ==2 && Validator.isNotNull(userIdXuLy)){
						phieu.setNguoiXuLy(Long.valueOf("0"+userIdXuLy));
					}else if(trangThai.getChuyenXuLy() ==3){
						//get userId from phan cong xu ly
						MotCuaPhanCongXuLy ettPC = MotCuaPhanCongXuLyLocalServiceUtil.fetchByF_UNI_PhieuXuLyId(phieuXuLyId);
						if(Validator.isNotNull(ettPC))phieu.setNguoiXuLy(ettPC.getNguoiXuLy());
					}
					
					phieu = MotCuaPhieuXuLyLocalServiceUtil.updateMotCuaPhieuXuLy(phieu);
				}
				//cập nhật kết quả xử lý từ dataitem lấy node1
				TthcNoidungHoSo tthcNoidungHoSo = null;
				QlvtThongTinHoSo ettHSTT = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(phieuXuLyId);
				QlvtThongTinXuLy ettXuLY = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(ettHSTT.getId());
				DmDataItem dataItemTPHS = DmDataItemLocalServiceUtil.findByGroupIdAndCode(Constants.DM_KQTHAMTRA, ettXuLY.getKetQuaXuLy());
				if(Validator.isNotNull(ettXuLY) && Validator.isNotNull(dataItemTPHS))ettXuLY.setKetQuaXuLy(dataItemTPHS.getNode1());
				//CB_CD
				_log.info("***************88888ettRTDoanhNghiepNoiDungHoSoHienTai: "+ettRTDoanhNghiepNoiDungHoSoHienTai);
				//trong trường hợp trạng thái là CB_CD cập nhật tổ chức quản lý của phiếu + hồ sơ thủ tục
				if(Validator.isNotNull(ettRTDoanhNghiepNoiDungHoSoHienTai) && ettRTDoanhNghiepNoiDungHoSoHienTai.getMaTrangThai().equalsIgnoreCase("CB_CD")){
					OEPUserMgtWorkingUnit orgOEP = OEPUserMgtWorkingUnitLocalServiceUtil.fetchByF_organizationId(phieu.getToChucQuanLy()+"");
					_log.info("***************orgOEP: "+orgOEP);
					if(Validator.isNotNull(orgOEP)){
						MotCuaPhanCongXuLy ettPhanCong = MotCuaPhanCongXuLyLocalServiceUtil.fetchByF_UNI_PhieuXuLyId(phieuXuLyId);
						TthcHoSoThuTuc ettHsTT = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
						MotCuaTrangThaiHoSo ettTrangThaiDich = MotCuaTrangThaiHoSoLocalServiceUtil.fetchMotCuaTrangThaiHoSo(dichChuyenTrangThaiPhieuSuLy);
						if(ettTrangThaiDich.getMaTrangThai().equalsIgnoreCase("CB_CPD") && !keyDichChuyen.equalsIgnoreCase("Yeu.cau.tham.xet.lai")){
							_log.info("-----------------1");
							
							phieu.setNguoiXuLy(userId);
							phieu.setToChucQuanLy(ettPhanCong.getToChucXetDuyet());
							ettHsTT.setToChucQuanLy(ettPhanCong.getToChucXetDuyet());
						}else if(orgOEP.getIsRoot() != 1 && (ettXuLY.getKetQuaXuLy().equalsIgnoreCase("CVYCBS") || ettXuLY.getKetQuaXuLy().equalsIgnoreCase("CVTCCGP")) && !keyDichChuyen.equalsIgnoreCase("Yeu.cau.tham.xet.lai")){
							_log.info("-----------------23232");
							phieu.setNguoiXuLy(userId);
							phieu.setToChucQuanLy(ettPhanCong.getToChucXetDuyet());
							ettHsTT.setToChucQuanLy(ettPhanCong.getToChucXetDuyet());
						}
						MotCuaPhieuXuLyLocalServiceUtil.updateMotCuaPhieuXuLy(phieu);
						TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(ettHsTT);
					}
				}
				//trong trường hợp trạng thái là CB_CPD cập nhật tổ chức quản lý của phiếu + hồ sơ thủ tục
				if(Validator.isNotNull(ettRTDoanhNghiepNoiDungHoSoHienTai) && ettRTDoanhNghiepNoiDungHoSoHienTai.getMaTrangThai().equalsIgnoreCase("CB_CPD")){
					OEPUserMgtWorkingUnit orgOEP = OEPUserMgtWorkingUnitLocalServiceUtil.fetchByF_organizationId(phieu.getToChucQuanLy()+"");
					_log.info("***************orgOEP: "+orgOEP);
					if(Validator.isNotNull(orgOEP)){
						MotCuaPhanCongXuLy ettPhanCong = MotCuaPhanCongXuLyLocalServiceUtil.fetchByF_UNI_PhieuXuLyId(phieuXuLyId);
						TthcHoSoThuTuc ettHsTT = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
						if(orgOEP.getIsRoot() == 1){
							phieu.setNguoiXuLy(userId);
							phieu.setToChucQuanLy(ettPhanCong.getToChucXuLy());
							ettHsTT.setToChucQuanLy(ettPhanCong.getToChucXuLy());
						}
						MotCuaPhieuXuLyLocalServiceUtil.updateMotCuaPhieuXuLy(phieu);
						TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(ettHsTT);
					}
				}
				//trong trường hợp trạng thái là CB_CTKQ 
				if(ettRTDoanhNghiepNoiDungHoSoHienTai.getMaTrangThai().equals("CB_CTKQ")){
//					long idND = CounterLocalServiceUtil.increment(TthcNoidungHoSo.class.getName());
					
					if(quyTrinhThuTucId == 6){
						String[] tenTaiLieuFms = (String[]) message.get("tenTaiLieuFms");
						String[] idFileFms = (String[]) message.get("idFileFms");
						String[] idPTFm = (String[]) message.get("idPTFm");
						TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(idThuTucHanhChinh);
						
						if(Validator.isNotNull(thuTucHanhChinh)){
							if(thuTucHanhChinh.getMaThuTuc().contains("BH")){
							//BIEN HIEU	
								QLVTXuLyBienHieu ettBienHieu = 	QLVTXuLyBienHieuLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+ettXuLY.getId()));
								if(Validator.isNotNull(ettBienHieu)){
									List<QLVTXuLyBienHieuPhuongTien> listPT = QLVTXuLyBienHieuPhuongTienLocalServiceUtil.findBycapPhuHieuID(Integer.valueOf("0"+ettBienHieu.getId()));
									
									PhuHieuXe6LoaiXe mauDon = new PhuHieuXe6LoaiXe();
									String ketQuaxml = MauDonFactory.convertObjectToXml(mauDon);
									ketQuaxml = makeNoiDungXmlStandard(ketQuaxml);
									
									for (QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien : listPT) {
										if(Validator.isNotNull(qlvtXuLyBienHieuPhuongTien.getKetQuaXuLy())){
											long idND = CounterLocalServiceUtil.increment(QLVTXuLyBienHieuPhuongTien.class.getName());
											TthcThanhPhanHoSo ettTP = TthcThanhPhanHoSoLocalServiceUtil.fetchByF_thuTucHanhChinhId_maThanhPhan(idThuTucHanhChinh, qlvtXuLyBienHieuPhuongTien.getKetQuaXuLy());
											tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.createTthcNoidungHoSo(idND);
											int ik =0;
											int point =0;
											for (String string : idPTFm) {
												if(string.equalsIgnoreCase(qlvtXuLyBienHieuPhuongTien.getId()+"")){
													point =ik;
													break;
												}
												ik++;
											}
											tthcNoidungHoSo.setHoSoThuTucId(hoSoThuTucId);
											if(Validator.isNotNull(ettTP))tthcNoidungHoSo.setThanhPhanHoSoId(ettTP.getId());
											tthcNoidungHoSo.setTenTaiLieu(tenTaiLieuFms[point]);
											tthcNoidungHoSo.setTaiLieuDinhKem(Long.valueOf("0"+idPTFm[point]));
											tthcNoidungHoSo.setBieuMauHoSoId(0);
											tthcNoidungHoSo.setLoaiTaiLieu(0);
											tthcNoidungHoSo.setNgayTao(new Date());
											tthcNoidungHoSo.setTrangThai(2);
											tthcNoidungHoSo.setNguoiTao(userId);
											tthcNoidungHoSo.setNoiDungXml(ketQuaxml);
											TthcNoidungHoSoLocalServiceUtil.updateTthcNoidungHoSo(tthcNoidungHoSo);	
										}
									}
									
								}
								
							}else{
							//PHU HIEU
								QLVTXuLyPhuHieu  ettPhuHieu = 	QLVTXuLyPhuHieuLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+ettXuLY.getId()));
								if(Validator.isNotNull(ettPhuHieu)){
									List<QLVTXuLyPhuHieuPhuongTien> listPT = QLVTXuLyPhuHieuPhuongTienLocalServiceUtil.findBycapPhuHieuID(Integer.valueOf("0"+ettPhuHieu.getId()));
									PhuHieuLienVanVietLaos mauDon = new PhuHieuLienVanVietLaos();
									String ketQuaxml = MauDonFactory.convertObjectToXml(mauDon);
									ketQuaxml = makeNoiDungXmlStandard(ketQuaxml);
									
									for (QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien : listPT) {
										if(Validator.isNotNull(qlvtXuLyPhuHieuPhuongTien.getKetQuaXuLy())){
											long idND = CounterLocalServiceUtil.increment(QLVTXuLyBienHieuPhuongTien.class.getName());
											TthcThanhPhanHoSo ettTP = TthcThanhPhanHoSoLocalServiceUtil.fetchByF_thuTucHanhChinhId_maThanhPhan(idThuTucHanhChinh, qlvtXuLyPhuHieuPhuongTien.getLoaiPhuHieuXinCap());
											tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.createTthcNoidungHoSo(idND);
											tthcNoidungHoSo.setHoSoThuTucId(hoSoThuTucId);
											int ik =0;
											int point =0;
											for (String string : idPTFm) {
												if(string.equalsIgnoreCase(qlvtXuLyPhuHieuPhuongTien.getId()+"")){
													point =ik;
													break;
												}
												ik++;
											}
											if(Validator.isNotNull(ettTP))tthcNoidungHoSo.setThanhPhanHoSoId(ettTP.getId());
											tthcNoidungHoSo.setTenTaiLieu(tenTaiLieuFms[point]);
											tthcNoidungHoSo.setTaiLieuDinhKem(Long.valueOf("0"+idPTFm[point]));
											tthcNoidungHoSo.setBieuMauHoSoId(0);
											tthcNoidungHoSo.setLoaiTaiLieu(0);
											tthcNoidungHoSo.setNgayTao(new Date());
											tthcNoidungHoSo.setTrangThai(2);
											tthcNoidungHoSo.setNguoiTao(userId);
											tthcNoidungHoSo.setNoiDungXml(ketQuaxml);
											TthcNoidungHoSoLocalServiceUtil.updateTthcNoidungHoSo(tthcNoidungHoSo);	
										}
									}
								}
								
							}
							
						}
						
					}else if(quyTrinhThuTucId == 5 || quyTrinhThuTucId == 4 || quyTrinhThuTucId == 3){
						String[] tenTaiLieuFms = (String[]) message.get("tenTaiLieuFms");
						String[] idFileFms = (String[]) message.get("idFileFms");
						String[] idPTFm = (String[]) message.get("idPTFm");
						
						QlvtXuLyGpLienVan ettLV = QlvtXuLyGpLienVanLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+ettXuLY.getId()));
						if(Validator.isNotNull(ettLV)){
							List<QlvtXuLyGpLienVanPhuongTien> listPT = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.findBycapGplvId(Integer.valueOf("0"+ettLV.getId()));
							CapGiayPhepVanTaiVietTrung mauDon = new CapGiayPhepVanTaiVietTrung();
							String ketQuaxml = MauDonFactory.convertObjectToXml(mauDon);
							ketQuaxml = makeNoiDungXmlStandard(ketQuaxml);
							for (QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien : listPT) {
								if(Validator.isNotNull(qlvtXuLyGpLienVanPhuongTien.getLoaiGiayPhep())){
									int ik =0;
									int point =0;
									for (String string : idPTFm) {
										if(string.equalsIgnoreCase(qlvtXuLyGpLienVanPhuongTien.getId()+"")){
											point =ik;
											break;
										}
										ik++;
									}
									long idND = CounterLocalServiceUtil.increment(TthcNoidungHoSo.class.getName());
									TthcThanhPhanHoSo ettTP = TthcThanhPhanHoSoLocalServiceUtil.fetchByF_thuTucHanhChinhId_maThanhPhan(idThuTucHanhChinh, qlvtXuLyGpLienVanPhuongTien.getLoaiGiayPhep());
									tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.createTthcNoidungHoSo(idND);
									tthcNoidungHoSo.setHoSoThuTucId(hoSoThuTucId);
									if(Validator.isNotNull(ettTP))tthcNoidungHoSo.setThanhPhanHoSoId(ettTP.getId());
									tthcNoidungHoSo.setTenTaiLieu(tenTaiLieuFms[point]);
									tthcNoidungHoSo.setTaiLieuDinhKem(Long.valueOf("0"+idFileFms[point]));
									tthcNoidungHoSo.setBieuMauHoSoId(0);
									tthcNoidungHoSo.setLoaiTaiLieu(0);
									tthcNoidungHoSo.setNgayTao(new Date());
									tthcNoidungHoSo.setTrangThai(2);
									tthcNoidungHoSo.setNguoiTao(userId);
									tthcNoidungHoSo.setNoiDungXml(qlvtXuLyGpLienVanPhuongTien.getId()+"");
									TthcNoidungHoSoLocalServiceUtil.updateTthcNoidungHoSo(tthcNoidungHoSo);	
								}
							}
						}
					}else{
						TthcThanhPhanHoSo ettTP = TthcThanhPhanHoSoLocalServiceUtil.fetchByF_thuTucHanhChinhId_maThanhPhan(idThuTucHanhChinh, ettXuLY.getKetQuaXuLy());
						long idND = CounterLocalServiceUtil.increment(TthcNoidungHoSo.class.getName());
						tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.createTthcNoidungHoSo(idND);
						tthcNoidungHoSo.setHoSoThuTucId(hoSoThuTucId);
						if(Validator.isNotNull(ettTP))tthcNoidungHoSo.setThanhPhanHoSoId(ettTP.getId());
						tthcNoidungHoSo.setTenTaiLieu(tenTaiLieu);
						tthcNoidungHoSo.setTaiLieuDinhKem(idTaiLieu);
						tthcNoidungHoSo.setBieuMauHoSoId(0);
						tthcNoidungHoSo.setLoaiTaiLieu(0);
						tthcNoidungHoSo.setNgayTao(new Date());
						tthcNoidungHoSo.setTrangThai(2);
						tthcNoidungHoSo.setNguoiTao(userId);
						tthcNoidungHoSo.setNoiDungXml(3+"");
						TthcNoidungHoSoLocalServiceUtil.updateTthcNoidungHoSo(tthcNoidungHoSo);	
						TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
						tthcHoSoThuTuc.setThongBaoXuLy(ettXuLY.getKetQuaXuLy());
						TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);
					}
					
				}else if(ettRTDoanhNghiepNoiDungHoSoHienTai.getMaTrangThai().equals("CB_CDDYCBS")){
					//CVYCBS -- 
					String fileName ="";
					CongVanYCBSHoSoDeNghiCapPHBH obs = (CongVanYCBSHoSoDeNghiCapPHBH) MauDonFactory.converXMLMessagesContentToObject(ettXuLY.getKetQuaThamDinhXML());
					fileName = ReportBusinessUtils.actionExportMauDonDanhSachDonFake(filePath,"CVYCBS", String.valueOf(phieuXuLyId),obs);
					long idFile = 0;
				    filePath = filePath + "export/" + fileName;
				    idFile = ReportUtils.uploadFileBieuMauByPath(filePath, fileName);
					TthcThanhPhanHoSo ettTP = TthcThanhPhanHoSoLocalServiceUtil.fetchByF_thuTucHanhChinhId_maThanhPhan(idThuTucHanhChinh, "CVYCBS");
					long idND = CounterLocalServiceUtil.increment(TthcNoidungHoSo.class.getName());
					tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.createTthcNoidungHoSo(idND);
					tthcNoidungHoSo.setHoSoThuTucId(hoSoThuTucId);
					if(Validator.isNotNull(ettTP))tthcNoidungHoSo.setThanhPhanHoSoId(ettTP.getId());
					tthcNoidungHoSo.setTenTaiLieu(fileName);
					tthcNoidungHoSo.setTaiLieuDinhKem(idFile);
					tthcNoidungHoSo.setBieuMauHoSoId(0);
					tthcNoidungHoSo.setLoaiTaiLieu(0);
					tthcNoidungHoSo.setNgayTao(new Date());
					tthcNoidungHoSo.setTrangThai(2);
					tthcNoidungHoSo.setNguoiTao(userId);
					tthcNoidungHoSo.setNoiDungXml(1+"");
					TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
					tthcHoSoThuTuc.setThongBaoXuLy("CVYCBS");
					TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);
				}else if(ettRTDoanhNghiepNoiDungHoSoHienTai.getMaTrangThai().equals("CB_CDDTCCP")){
					String fileName ="";
					CongVanTuChoiCapPHBH obs = (CongVanTuChoiCapPHBH) MauDonFactory.converXMLMessagesContentToObject(ettXuLY.getKetQuaThamDinhXML());
					fileName = ReportBusinessUtils.actionExportMauDonDanhSachDonFake(filePath,"CVTCCGP", String.valueOf(phieuXuLyId),obs);
					long idFile = 0;
				    filePath = filePath + "export/" + fileName;
				    idFile = ReportUtils.uploadFileBieuMauByPath(filePath, fileName);
					TthcThanhPhanHoSo ettTP = TthcThanhPhanHoSoLocalServiceUtil.fetchByF_thuTucHanhChinhId_maThanhPhan(idThuTucHanhChinh, "CVTCCGP");
					long idND = CounterLocalServiceUtil.increment(TthcNoidungHoSo.class.getName());
					tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.createTthcNoidungHoSo(idND);
					tthcNoidungHoSo.setHoSoThuTucId(hoSoThuTucId);
					if(Validator.isNotNull(ettTP))tthcNoidungHoSo.setThanhPhanHoSoId(ettTP.getId());
					tthcNoidungHoSo.setTenTaiLieu(fileName);
					tthcNoidungHoSo.setTaiLieuDinhKem(idFile);
					tthcNoidungHoSo.setBieuMauHoSoId(0);
					tthcNoidungHoSo.setLoaiTaiLieu(0);
					tthcNoidungHoSo.setNgayTao(new Date());
					tthcNoidungHoSo.setTrangThai(2);
					tthcNoidungHoSo.setNguoiTao(userId);
					tthcNoidungHoSo.setNoiDungXml(2+"");
					TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
					tthcHoSoThuTuc.setThongBaoXuLy("CVTCCGP");
					TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);
				}
				if(Validator.isNotNull(tthcNoidungHoSo))TthcNoidungHoSoLocalServiceUtil.updateTthcNoidungHoSo(tthcNoidungHoSo);				
			} catch (Exception e) {
				_log.error(e);
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
		

	private static Log _log =   LogFactoryUtil.getLog(HSTraDoanhNghiepThreadImpl.class);
}
