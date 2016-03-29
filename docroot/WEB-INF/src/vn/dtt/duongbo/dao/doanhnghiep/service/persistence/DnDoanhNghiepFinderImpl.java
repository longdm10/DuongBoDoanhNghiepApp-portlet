package vn.dtt.duongbo.dao.doanhnghiep.service.persistence;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep;
import vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepImpl;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

/**
 * @author win_64
 *
 */
public class DnDoanhNghiepFinderImpl extends BasePersistenceImpl<DnDoanhNghiep> implements DnDoanhNghiepFinder {

	private static Log _log = LogFactoryUtil.getLog(DnDoanhNghiepFinderImpl.class);
	
	public int countBySoDkdk(String soDangKyKinhDoanh) {
		Session session = null;
		
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT count(*) as total FROM dn_nguoilamthutuc WHERE SODANGKYKINHDOANH ='"+soDangKyKinhDoanh+"' ");
			_log.debug("=========countBySoDkdk========" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);
			Iterator<Long> itr = q.list().iterator();
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { 
					return count.intValue(); 
				}
			}
			return 0;
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return 0;
	
	}
	
	
	public int countBySoEmail(String email) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT count(*) as total FROM dn_nguoilamthutuc WHERE email ='"+email+"' ");
			_log.debug("=========countBySoEmail========" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);
			Iterator<Long> itr = q.list().iterator();
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { 
					return count.intValue(); 
				}
			}
			return 0;
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return 0;
	
	}
	
	public int countByMaSoDoanhNghiep(String maSoDoanhNghiep) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT count(*) as total FROM dn_nguoilamthutuc WHERE MASODOANHNGHIEP ='"+maSoDoanhNghiep+"' ");
			_log.debug("=========countByMaSoDoanhNghiep========" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);
			Iterator<Long> itr = q.list().iterator();
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { 
					return count.intValue(); 
				}
			}
			return 0;
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		return 0;
	}
	

	public int countByTenDoanhNghiep(String tenDoanhNghiep) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT count(*) as total FROM dn_nguoilamthutuc WHERE TENDOANHNGHIEP ='"+tenDoanhNghiep+"' ");
			_log.debug("=========countByTenDoanhNghiep========" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);
			Iterator<Long> itr = q.list().iterator();
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { 
					return count.intValue(); 
				}
			}
			return 0;
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		return 0;
	}
	
	public List<DnDoanhNghiep> findBySDK_TDN_TCD_TT_L(String soDangKy, String tenDoanhNghiep, String tenCongDan, String trangThai, String loaiNguoiLamThuTuc, int start, int end) {
		Session session = null;
		
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();

			query.append("SELECT DN_NGUOILAMTHUTUC.* FROM DN_NGUOILAMTHUTUC LEFT JOIN DN_NGUOILAMTHUTUC_USER ON DN_NGUOILAMTHUTUC.ID=DN_NGUOILAMTHUTUC_USER.NGUOILAMTHUTUCID WHERE 1=1");
			
			if (Validator.isNotNull(soDangKy)) {
				query.append(" AND ( DN_NGUOILAMTHUTUC.SODANGKYKINHDOANH LIKE '%").append(soDangKy).append("%' ");
				query.append(" OR DN_NGUOILAMTHUTUC.MASODOANHNGHIEP LIKE '%").append(soDangKy).append("%' ) ");
			}
			
			if(Validator.isNotNull(tenDoanhNghiep)){
				query.append(" AND DN_NGUOILAMTHUTUC.TENDOANHNGHIEP LIKE '%").append(tenDoanhNghiep).append("%' ");
			}
			
			if(Validator.isNotNull(tenCongDan)){
				query.append(" AND DN_NGUOILAMTHUTUC.TENCONGDAN LIKE '%").append(tenCongDan).append("%' ");
			}
			
			// truong hop trang thai la empty thi khong tim kiem
			if(trangThai == null){
				query.append(" AND DN_NGUOILAMTHUTUC_USER.TINHTRANGHOATDONG IS NULL ");
			} else if(Validator.isNotNull(trangThai)){
				query.append(" AND DN_NGUOILAMTHUTUC_USER.TINHTRANGHOATDONG ='").append(trangThai).append("' ");
			}
			
			query.append(" AND (DN_NGUOILAMTHUTUC_USER.TINHTRANGHOATDONG IS NULL OR DN_NGUOILAMTHUTUC_USER.TINHTRANGHOATDONG <> '").append(Constants.TRANG_THAI_DA_XOA).append("') ");
			
			query.append(" AND DN_NGUOILAMTHUTUC.LOAINGUOILAMTHUTUC = '").append(loaiNguoiLamThuTuc).append("' ");
			
			query.append(" ORDER BY DN_NGUOILAMTHUTUC.NGAYDANGKI DESC, DN_NGUOILAMTHUTUC.TENDOANHNGHIEP ASC ");
			
			_log.debug("===findBySDK_TDN_TCD_TT_L===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DnDoanhNghiep",DnDoanhNghiepImpl.class);

			return (List<DnDoanhNghiep>) QueryUtil.list(q, getDialect(), start, end);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<DnDoanhNghiep>();
	}
	
	public int countBySDK_TDN_TCD_TT_L(String soDangKy, String tenDoanhNghiep, String tenCongDan, String trangThai, String loaiNguoiLamThuTuc) {
		
		Session session = null;
		
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();

			query.append("SELECT COUNT(*) AS TOTAL FROM DN_NGUOILAMTHUTUC LEFT JOIN DN_NGUOILAMTHUTUC_USER ON DN_NGUOILAMTHUTUC.ID=DN_NGUOILAMTHUTUC_USER.NGUOILAMTHUTUCID WHERE 1=1");
			
			if (Validator.isNotNull(soDangKy)) {
				query.append(" AND ( DN_NGUOILAMTHUTUC.SODANGKYKINHDOANH LIKE '%").append(soDangKy).append("%' ");
				query.append(" OR DN_NGUOILAMTHUTUC.MASODOANHNGHIEP LIKE '%").append(soDangKy).append("%' ) ");
			}
			
			if(Validator.isNotNull(tenDoanhNghiep)){
				query.append(" AND DN_NGUOILAMTHUTUC.TENDOANHNGHIEP LIKE '%").append(tenDoanhNghiep).append("%' ");
			}
			
			if(Validator.isNotNull(tenCongDan)){
				query.append(" AND DN_NGUOILAMTHUTUC.TENCONGDAN LIKE '%").append(tenCongDan).append("%' ");
			}
			
			// truong hop trang thai la empty thi khong tim kiem
			if(trangThai == null){
				query.append(" AND DN_NGUOILAMTHUTUC_USER.TINHTRANGHOATDONG IS NULL ");
			} else if(Validator.isNotNull(trangThai)){
				query.append(" AND DN_NGUOILAMTHUTUC_USER.TINHTRANGHOATDONG ='").append(trangThai).append("' ");
			}
			
			query.append(" AND (DN_NGUOILAMTHUTUC_USER.TINHTRANGHOATDONG IS NULL OR DN_NGUOILAMTHUTUC_USER.TINHTRANGHOATDONG <> '").append(Constants.TRANG_THAI_DA_XOA).append("') ");
			
			query.append(" AND DN_NGUOILAMTHUTUC.LOAINGUOILAMTHUTUC = '").append(loaiNguoiLamThuTuc).append("' ");
			
			_log.debug("===countBySDK_TDN_TCD_TT_L===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("TOTAL", Type.LONG);
			q.setCacheable(false);
			
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { return count.intValue(); }
			}
			
			return 0;
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return 0;
	}
	
}
