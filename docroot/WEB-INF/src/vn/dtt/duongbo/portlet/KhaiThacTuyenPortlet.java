package vn.dtt.duongbo.portlet;

import java.io.IOException;

import javax.persistence.criteria.CriteriaBuilder.In;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.ProcessAction;

import vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien;
import vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeBieuDoXeImpl;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTeBieuDoXeLocalService;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTeBieuDoXeLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTeDiemDungNghiLocalService;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTeDiemDungNghiLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTeLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil;
import vn.dtt.duongbo.portlet.canbo.utils.CanBoBusinessUtils;
import vn.dtt.duongbo.term.quocte.QLVTKhaiTacTuyen;
import vn.dtt.form.util.FormUtil;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class KhaiThacTuyenPortlet {
	public static Log _log = LogFactoryUtil.getLog(KhaiThacTuyenPortlet.class);
	public static QLVTKhaiTacTuyen term = null;
	//nội địa ô tô
	public static void ktt_choThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTKhaiTacTuyen(actionRequest);
		_log.debug("-ktt_choThamXet-----dung cho cho` tham xet!!!--");
		ktt_ThongTinHoSo(actionRequest, httpReq);
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void ktt_dangThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTKhaiTacTuyen(actionRequest);
		_log.debug("-ktt_dangThamXet-----dung cho cho` tham xet!!!--");
		ktt_ThongTinHoSo(actionRequest, httpReq);
		//send json message
		FormUtil.customResponse(actionRequest,httpReq, FormUtil.bodyTextNoiDia(term.getId()));
}
	public static void ktt_CD(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTKhaiTacTuyen(actionRequest);
		_log.debug("-ktt_CD-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void ktt_CDDYCBS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTKhaiTacTuyen(actionRequest);
		_log.debug("-ktt_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void ktt_CTKQ(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTKhaiTacTuyen(actionRequest);
		_log.debug("-ktt_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void ktt_CDDTCCP(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTKhaiTacTuyen(actionRequest);
		_log.debug("-ktt_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void ktt_HTHS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTKhaiTacTuyen(actionRequest);
		_log.debug("-ktt_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void ktt_HHS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTKhaiTacTuyen(actionRequest);
		_log.debug("-ktt_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void ktt_xemTruocNoiDung(ActionRequest actionRequest, ActionResponse httpReq) {
		// TODO Auto-generated method stub
		_log.debug("-ktt_xemTruocNoiDung-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.xemTruocNoiDungCongVan(actionRequest, httpReq);
	}	
	public static void ktt_guiDuyet(ActionRequest actionRequest, ActionResponse httpReq) throws SystemException {
		// TODO Auto-generated method stub
		_log.debug("-ktt_guiDuyet-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		// TODO
		FormUtil.guiDuyetProcess(actionRequest, httpReq);
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest,httpReq);
	}	
	public static void ktt_luuThongTinThamXet(ActionRequest actionRequest, ActionResponse actionResponse) {
		_log.info("-------------------ktt_luuThongTinThamXet--------------------------");
		try {
			long idReturn = FormUtil.processKTTQuocTeInsert(actionRequest, actionResponse);
			//term = new QLVTKhaiTacTuyen(actionRequest);
			//long idReturn = FormUtil.gPQuocTeInsertProcess(actionRequest, actionResponse);
			FormUtil.customResponse(actionRequest,actionResponse, FormUtil.bodyTextKTT(idReturn));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//private
	public static void ktt_ThongTinHoSo(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, SystemException {
		QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(term.getThongTinXuLyId());
		//end, thieu se bo sung sau
		// TODO
		thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
		_log.info("thongTinHoSo.getId()"+thongTinHoSo.getId());
		//them vao qlvtXuLyGpLienVanPhuongTien
	}
	
	
    public static void addBieuDoXe(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException,  SystemException {
        String rowIndexes = actionRequest.getParameter("rowIndexes");
        _log.info("::::::::::::::::rowIndexes:::::::::::::::::::::::" + rowIndexes); 
        String[] indexOfRows = rowIndexes.split(",");
        _log.info("::::::::::::::::indexOfRows.length:::::::::::::::::::::::"+ indexOfRows.length);
        QlvtXuLyKTTQuocTeBieuDoXe  ettKTTQuocTeBieuDoXe = null;
       long id=-1;
        for (int i = 0; i < indexOfRows.length; i++) {
            String luotDiVe = (actionRequest.getParameter("luotDiVe"+ indexOfRows[i])).trim();
            String benXe = (actionRequest.getParameter("benXe"+ indexOfRows[i])).trim();
            String gioXuatBen = actionRequest.getParameter("gioXuatBen"+ indexOfRows[i]);
            String phutXuatBen = actionRequest.getParameter("phutXuatBen"+ indexOfRows[i]);
            String tanXuat = actionRequest.getParameter("tanXuat"+ indexOfRows[i]);
            
            _log.info("::::::::::::luotDiVe::::::::::::::" + luotDiVe);
            _log.info("::::::::::::benXe::::::::::::::" + benXe);
            _log.info("::::::::::::gioXuatBen::::::::::::::" + gioXuatBen);
            _log.info("::::::::::::phutXuatBen::::::::::::::" + phutXuatBen);
            _log.info("::::::::::::tanXuat::::::::::::::" + tanXuat);
            
            id = (int) CounterLocalServiceUtil.increment(QlvtXuLyKTTQuocTeBieuDoXe.class.getName());
            ettKTTQuocTeBieuDoXe = QlvtXuLyKTTQuocTeBieuDoXeLocalServiceUtil.createQlvtXuLyKTTQuocTeBieuDoXe(id);
            ettKTTQuocTeBieuDoXe.setLoaiLuot(luotDiVe);
            ettKTTQuocTeBieuDoXe.setMaBen(benXe);
            ettKTTQuocTeBieuDoXe.setSoThuTuLuot(i+1);
            ettKTTQuocTeBieuDoXe.setGioXuatBen(Integer.valueOf(gioXuatBen));
            ettKTTQuocTeBieuDoXe.setPhuXuatBen(Integer.valueOf(gioXuatBen));
            ettKTTQuocTeBieuDoXe.setKttQuocTeId(1);
            ettKTTQuocTeBieuDoXe.setTanXuat(Integer.valueOf(tanXuat));
            ettKTTQuocTeBieuDoXe = QlvtXuLyKTTQuocTeBieuDoXeLocalServiceUtil.updateQlvtXuLyKTTQuocTeBieuDoXe(ettKTTQuocTeBieuDoXe);
          
        }
    }
	
    public static void addDiemDungNghi(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException,  SystemException {
        String rowIndexes = actionRequest.getParameter("rowIndexes");
        _log.info("::::::::::::::::rowIndexes:::::::::::::::::::::::" + rowIndexes); 
        String[] indexOfRows = rowIndexes.split(",");
        _log.info("::::::::::::::::indexOfRows.length:::::::::::::::::::::::"+ indexOfRows.length);
        QlvtXuLyKTTQuocTeDiemDungNghi ettXuLyKTTQuocTeDiemDungNghi =null;
        long id=-1;
        
        for (int i = 0; i < indexOfRows.length; i++) {
            String luotDiVe = (actionRequest.getParameter("luotDiVe"+ indexOfRows[i])).trim();
            String diemDungNghi = (actionRequest.getParameter("diemDungNghi"+ indexOfRows[i])).trim();
            String gio = actionRequest.getParameter("gio"+ indexOfRows[i]);
            String phut = actionRequest.getParameter("phut"+ indexOfRows[i]);
            _log.info("::::::::::::luotDiVe::::::::::::::" + luotDiVe);
            _log.info("::::::::::::diemDungNghi::::::::::::::" + diemDungNghi);
            _log.info("::::::::::::gio::::::::::::::" + gio);
            _log.info("::::::::::::phut::::::::::::::" + phut);
            id = (int) CounterLocalServiceUtil.increment(QlvtXuLyKTTQuocTeDiemDungNghi.class.getName());
            ettXuLyKTTQuocTeDiemDungNghi = QlvtXuLyKTTQuocTeDiemDungNghiLocalServiceUtil.createQlvtXuLyKTTQuocTeDiemDungNghi(id);
            ettXuLyKTTQuocTeDiemDungNghi.setLoaiLuot(luotDiVe);
            ettXuLyKTTQuocTeDiemDungNghi.setMaBen(diemDungNghi);
            ettXuLyKTTQuocTeDiemDungNghi.setSoThuTuLuot(i+1);
            ettXuLyKTTQuocTeDiemDungNghi.setSoGioDungNghi(Integer.valueOf(gio));
            ettXuLyKTTQuocTeDiemDungNghi.setSoPhutDungNghi(Integer.valueOf(phut));
            ettXuLyKTTQuocTeDiemDungNghi.setKttQuocTeId(1);
            ettXuLyKTTQuocTeDiemDungNghi = QlvtXuLyKTTQuocTeDiemDungNghiLocalServiceUtil.updateQlvtXuLyKTTQuocTeDiemDungNghi(ettXuLyKTTQuocTeDiemDungNghi);
        }
    }
	
}
