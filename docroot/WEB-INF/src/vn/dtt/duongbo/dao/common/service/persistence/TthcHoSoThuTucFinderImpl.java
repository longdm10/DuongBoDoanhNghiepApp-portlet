
package vn.dtt.duongbo.dao.common.service.persistence;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucImpl;
import vn.dtt.duongbo.utils.config.DuongBoConfigurationManager;
import vn.dtt.duongbo.utils.format.FormatData;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class TthcHoSoThuTucFinderImpl extends BasePersistenceImpl<TthcHoSoThuTuc> implements TthcHoSoThuTucFinder {
	
	private Log log = LogFactoryUtil.getLog(TthcHoSoThuTucFinderImpl.class);
	
	public List<TthcHoSoThuTuc> searchQuanLyHoSo(
		String maBienNhan, String thuTucHanhChinhId, long nguoiLamThuTucId, long phanNhomHoSoId, int start, int end)
		throws SystemException {
		Session session = null;
		try {
			log.debug("==in finder searchQuanLyHoSo==");
			log.debug("==maBienNhan==" + maBienNhan + "==thuTucHanhChinhId==");
			log.debug("==nguoiLamThuTucId==" + nguoiLamThuTucId);
			log.debug("==phanNhomHoSoId==" + phanNhomHoSoId);
			
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM tthc_hosothutuc WHERE 1=1");

			if (Validator.isNotNull(maBienNhan) && maBienNhan.trim().length() > 0) {
				query.append(" AND mabiennhan = '" + maBienNhan + "'");
			}
			
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				query.append(" AND thutuchanhchinhid = " + thuTucHanhChinhId);
			}
			
			if (nguoiLamThuTucId > 0) {
				query.append(" AND nguoilamthutucid = " + nguoiLamThuTucId);
			}
			
			if (phanNhomHoSoId > 0) {
				query.append(" AND PHANNHOMHOSOID = " + phanNhomHoSoId);
			}
			
			query.append(" ORDER BY ngaytao desc ");
			
			log.debug("===searchQuanLyHoSo===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("TthcHoSoThuTuc", TthcHoSoThuTucImpl.class);
			
			return (List<TthcHoSoThuTuc>) QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<TthcHoSoThuTuc> searchQuanLyHoSoInPhanNhomHoSoDoanhNghiep(
		String linhVucThuTuc,String maBienNhan, String thuTucHanhChinhId, long nguoiLamThuTucId, String groupTrangThaiDoanhNghiepCode, int start, int end)
		throws SystemException {
		Session session = null;
		try {
			log.info("==in finder searchQuanLyHoSoInPhanNhomGroup==");
//				log.debug("==maBienNhan==" + maBienNhan + "==thuTucHanhChinhId==");
//				log.debug("==nguoiLamThuTucId==" + nguoiLamThuTucId);
//				log.debug("==phanNhomHoSoId==" + groupPhanNhomHoSoId);
			
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM tthc_hosothutuc WHERE 1=1");

			if (Validator.isNotNull(maBienNhan) && maBienNhan.trim().length() > 0) {
				query.append(" AND MASOHOSO = '" + maBienNhan + "'");
			}
			
			if (Validator.isNotNull(linhVucThuTuc) && Validator.isNull(thuTucHanhChinhId) ) {
				if(linhVucThuTuc.equalsIgnoreCase("DB_QLVT_TN")){
					thuTucHanhChinhId ="51,52,52,54,55,56,57,58,59";
				}else if(linhVucThuTuc.equalsIgnoreCase("DB_QLVT_VC")){
					thuTucHanhChinhId ="13,14,15,16,17,18,19,20,21,22,23,24,40,41,42,43,44,45";
				}else if(linhVucThuTuc.equalsIgnoreCase("DB_QLVT_VL")){
					thuTucHanhChinhId ="1,2,3,4,5,6,7,8,9,10,11,12,34,35,36,37,38,39";
				}else if(linhVucThuTuc.equalsIgnoreCase("DB_QLVT_VT")){
					thuTucHanhChinhId ="25,26,27,28,29,30,31,32,33,46,47";
				}
				query.append(" AND thutuchanhchinhid in (" + thuTucHanhChinhId + ")");
			}else if (Validator.isNotNull(linhVucThuTuc) && Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				query.append(" AND thutuchanhchinhid in (" + thuTucHanhChinhId + ")");
			}
			
			if (nguoiLamThuTucId > 0) {
				query.append(" AND nguoilamthutucid = " + nguoiLamThuTucId);
			}
			
			if (Validator.isNotNull(groupTrangThaiDoanhNghiepCode) && groupTrangThaiDoanhNghiepCode.trim().length() > 0) {
				query.append(" AND trangthaihoso in (" + groupTrangThaiDoanhNghiepCode + ")");
			}
			query.append(" ORDER BY ngaytao desc ");
			
			log.info("===searchQuanLyHoSoInPhanNhomHoSoDoanhNghiep===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("TthcHoSoThuTuc", TthcHoSoThuTucImpl.class);
			
			return (List<TthcHoSoThuTuc>) QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<TthcHoSoThuTuc> findHoSoByNguoiLamThuTucIdAndMaTrangThai(long nguoiLamThuTucId, String maTrangThai)
			throws SystemException {
			Session session = null;
			try {
				System.out.println("==in finder findHoSoByNguoiLamThuTucIdAndMaTrangThai==");
				session = openSession();
				
				StringBuilder query = new StringBuilder();
				
				query.append("SELECT * FROM tthc_hosothutuc WHERE 1=1");

				if (nguoiLamThuTucId > 0) {
					query.append(" AND nguoilamthutucid = " + nguoiLamThuTucId);
				}
				
				if (Validator.isNotNull(maTrangThai) && maTrangThai.trim().length() > 0) {
					query.append(" AND trangthaihoso in (SELECT id FROM motcua_trangthaihoso ");
					query.append(" where MATRANGTHAI in ('" + maTrangThai + "'))");
				}
				query.append(" ORDER BY ngaytao desc ");
				
				System.out.println("===findHoSoByNguoiLamThuTucIdAndMaTrangThai===" + query.toString());
				
				SQLQuery q = session.createSQLQuery(query.toString());
				q.setCacheable(false);
				q.addEntity("TthcHoSoThuTuc", TthcHoSoThuTucImpl.class);
				
				return (List<TthcHoSoThuTuc>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				
			} catch (Exception e) {
				throw new SystemException(e);
			} finally {
				closeSession(session);
			}
		}
	
	public List<TthcHoSoThuTuc> searchQuanLyHoSoInPhanNhomGroup(
			String maBienNhan, String thuTucHanhChinhId, long nguoiLamThuTucId, String groupPhanNhomHoSoId, int start, int end)
			throws SystemException {
			Session session = null;
			try {
				log.debug("==in finder searchQuanLyHoSoInPhanNhomGroup==");
//				log.debug("==maBienNhan==" + maBienNhan + "==thuTucHanhChinhId==");
//				log.debug("==nguoiLamThuTucId==" + nguoiLamThuTucId);
//				log.debug("==phanNhomHoSoId==" + groupPhanNhomHoSoId);
				
				session = openSession();
				
				StringBuilder query = new StringBuilder();
				
				query.append("SELECT * FROM tthc_hosothutuc WHERE 1=1");

				if (Validator.isNotNull(maBienNhan) && maBienNhan.trim().length() > 0) {
					query.append(" AND mabiennhan = '" + maBienNhan + "'");
				}
				
				if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
					query.append(" AND thutuchanhchinhid = " + thuTucHanhChinhId);
				}
				
				if (nguoiLamThuTucId > 0) {
					query.append(" AND nguoilamthutucid = " + nguoiLamThuTucId);
				}
				
				if (Validator.isNotNull(groupPhanNhomHoSoId) && groupPhanNhomHoSoId.trim().length() > 0) {
					query.append(" AND PHANNHOMHOSOID in (" + groupPhanNhomHoSoId + ")");
				}
				
				query.append(" ORDER BY ngaytao desc ");
				
				log.debug("===searchQuanLyHoSo===" + query.toString());
				
				SQLQuery q = session.createSQLQuery(query.toString());
				q.setCacheable(false);
				q.addEntity("TthcHoSoThuTuc", TthcHoSoThuTucImpl.class);
				
				return (List<TthcHoSoThuTuc>) QueryUtil.list(q, getDialect(), start, end);
				
			} catch (Exception e) {
				throw new SystemException(e);
			} finally {
				closeSession(session);
			}
		}

	public String maxMaBienNhan(Date date) {

		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();

			query.append("SELECT max(mabiennhan) as mabiennhan FROM tthc_hosothutuc where mabiennhan like '%" + FormatData.getYear(date) + DuongBoConfigurationManager.getStrProp("sufix.mabiennhan.mtyt", "/DB") + "%'");

			log.debug("===maxMaBienNhan===" + query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("mabiennhan", Type.STRING);
			q.setCacheable(false);

			Iterator<String> itr = q.list().iterator();

			if (itr.hasNext()) {
				String count = itr.next();
				if (count != null) {
					return count.toString();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		
		return "";
	}
	
	public String maxMaSoHoSo(String soDangKyKinhDoanh) {

		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();

			query.append("SELECT max(MASOHOSO) as mabiennhan FROM tthc_hosothutuc where MASOHOSO like '%" + soDangKyKinhDoanh + "%'");

			log.debug("===maxMaSoHoSo===" + query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("mabiennhan", Type.STRING);
			q.setCacheable(false);

			Iterator<String> itr = q.list().iterator();

			if (itr.hasNext()) {
				String count = itr.next();
				if (count != null) {
					return count.toString();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		
		return "";
	}
	
	public int countQuanLyHoSo(String maBienNhan, String thuTucHanhChinhId, long nguoiLamThuTucId, long phanNhomHoSoId)
		throws SystemException {
		
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT count(*) as total FROM tthc_hosothutuc WHERE 1=1 ");
			
			if (Validator.isNotNull(maBienNhan) && maBienNhan.trim().length() > 0) {
				query.append(" AND mabiennhan = '" + maBienNhan + "'");
			}
			
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				query.append(" AND thutuchanhchinhid = " + thuTucHanhChinhId);
			}
			
			if (nguoiLamThuTucId > 0) {
				query.append(" AND nguoilamthutucid = " + nguoiLamThuTucId);
			}
			
			if (phanNhomHoSoId > 0) {
				query.append(" AND PHANNHOMHOSOID = " + phanNhomHoSoId);
			}
			
			log.debug("===countQuanLyHoSo===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);
			
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { return count.intValue(); }
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public int countQuanLyHoSoInPhanNhomHoSoDoanhNghiep(String linhVucThuTuc,String maBienNhan, String thuTucHanhChinhId, long nguoiLamThuTucId, String groupTrangThaiDoanhNghiepCode)
			throws SystemException {
		log.debug("==in finder countQuanLyHoSoInPhanNhomGroup==");
			Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT count(*) as total FROM tthc_hosothutuc WHERE 1=1 ");
			
			if (Validator.isNotNull(maBienNhan) && maBienNhan.trim().length() > 0) {
				query.append(" AND mabiennhan = '" + maBienNhan + "'");
			}
			if (Validator.isNotNull(linhVucThuTuc) && Validator.isNull(thuTucHanhChinhId) ) {
				if(linhVucThuTuc.equalsIgnoreCase("DB_QLVT_TN")){
					thuTucHanhChinhId ="51,52,52,54,55,56,57,58,59";
				}else if(linhVucThuTuc.equalsIgnoreCase("DB_QLVT_VC")){
					thuTucHanhChinhId ="13,14,15,16,17,18,19,20,21,22,23,24,40,41,42,43,44,45";
				}else if(linhVucThuTuc.equalsIgnoreCase("DB_QLVT_VL")){
					thuTucHanhChinhId ="1,2,3,4,5,6,7,8,9,10,11,12,34,35,36,37,38,39";
				}else if(linhVucThuTuc.equalsIgnoreCase("DB_QLVT_VT")){
					thuTucHanhChinhId ="25,26,27,28,29,30,31,32,33,46,47";
				}
				query.append(" AND thutuchanhchinhid in (" + thuTucHanhChinhId + ")");
			}else if (Validator.isNotNull(linhVucThuTuc) && Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				query.append(" AND thutuchanhchinhid in (" + thuTucHanhChinhId + ")");
			}
			if (nguoiLamThuTucId > 0) {
				query.append(" AND nguoilamthutucid = " + nguoiLamThuTucId);
			}
			
			if (Validator.isNotNull(groupTrangThaiDoanhNghiepCode) && groupTrangThaiDoanhNghiepCode.trim().length() > 0) {
				query.append(" AND trangthaihoso in (" + groupTrangThaiDoanhNghiepCode + ")");
			}
			
			log.debug("===countQuanLyHoSo===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);
			
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { return count.intValue(); }
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public int countQuanLyHoSoInPhanNhomGroup(String maBienNhan, String thuTucHanhChinhId, long nguoiLamThuTucId, String groupPhanNhomHoSoId)
			throws SystemException {
		log.debug("==in finder countQuanLyHoSoInPhanNhomGroup==");
			Session session = null;
			try {
				session = openSession();
				
				StringBuilder query = new StringBuilder();
				
				query.append("SELECT count(*) as total FROM tthc_hosothutuc WHERE 1=1 ");
				
				if (Validator.isNotNull(maBienNhan) && maBienNhan.trim().length() > 0) {
					query.append(" AND mabiennhan = '" + maBienNhan + "'");
				}
				
				if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
					query.append(" AND thutuchanhchinhid = " + thuTucHanhChinhId);
				}
				
				if (nguoiLamThuTucId > 0) {
					query.append(" AND nguoilamthutucid = " + nguoiLamThuTucId);
				}
				
				if (Validator.isNotNull(groupPhanNhomHoSoId) && groupPhanNhomHoSoId.trim().length() > 0) {
					query.append(" AND PHANNHOMHOSOID in (" + groupPhanNhomHoSoId + ")");
				}
				
				log.debug("===countQuanLyHoSo===" + query.toString());
				
				SQLQuery q = session.createSQLQuery(query.toString());
				q.addScalar("total", Type.LONG);
				q.setCacheable(false);
				
				Iterator<Long> itr = q.list().iterator();
				
				if (itr.hasNext()) {
					Long count = itr.next();
					if (count != null) { return count.intValue(); }
				}
				return 0;
			} catch (Exception e) {
				throw new SystemException(e);
			} finally {
				closeSession(session);
			}
		}
	
	public int countHoSoThuTucByPhanNhomHoSoIdAndNguoiLamThuTucId(long phanNhomHoSoId, long nguoiLamThuTucId)
			throws SystemException {
			
			Session session = null;
			try {
				session = openSession();
				
				StringBuilder query = new StringBuilder();
				
				query.append("SELECT count(*) as total FROM tthc_hosothutuc WHERE 1=1 ");
				
				if (phanNhomHoSoId > 0) {
					query.append(" AND PHANNHOMHOSOID = ?");
				}
				
				if (nguoiLamThuTucId > 0) {
					query.append(" AND NGUOILAMTHUTUCID = ?");
				}
				
//				log.debug("===countHoSoThuTucByPhanNhomHoSoIdAndNguoiLamThuTucId===" + query.toString());
				
				SQLQuery q = session.createSQLQuery(query.toString());
				q.addScalar("total", Type.LONG);
				q.setCacheable(false);
				
				QueryPos qPos = QueryPos.getInstance(q);
				
				if (phanNhomHoSoId > 0) {
					qPos.add(phanNhomHoSoId);
				}
				
				if (nguoiLamThuTucId > 0) {
					qPos.add(nguoiLamThuTucId);
				}
				
				Iterator<Long> itr = q.list().iterator();
				
				if (itr.hasNext()) {
					Long count = itr.next();
					if (count != null) { return count.intValue(); }
				}
				return 0;
			} catch (Exception e) {
				throw new SystemException(e);
			} finally {
				closeSession(session);
			}
		}
	
		public int countByGroupMaTrangThaiDoanhNghiepAndNguoiLamThuTucId(String groupMaTrangThaiDoanhNghiep, long nguoiLamThuTucId)
			throws SystemException {
			
			Session session = null;
			try {
				session = openSession();
				
				StringBuilder query = new StringBuilder();
				
				query.append("SELECT count(*) as total FROM tthc_hosothutuc WHERE 1=1 ");
				
				if (Validator.isNotNull(groupMaTrangThaiDoanhNghiep) && groupMaTrangThaiDoanhNghiep.trim().length() > 0) {
					query.append(" AND trangthaihoso in (" + groupMaTrangThaiDoanhNghiep + ")");
				}
				
				if (nguoiLamThuTucId > 0) {
					query.append(" AND NGUOILAMTHUTUCID = " + nguoiLamThuTucId);
				}
				
				log.debug("===countByPhanNhomHoSoDoanhNghiepAndNguoiLamThuTucId===" + query.toString());
				
				SQLQuery q = session.createSQLQuery(query.toString());
				q.addScalar("total", Type.LONG);
				q.setCacheable(false);
				
				Iterator<Long> itr = q.list().iterator();
				
				if (itr.hasNext()) {
					Long count = itr.next();
					if (count != null) { return count.intValue(); }
				}
				return 0;
			} catch (Exception e) {
				throw new SystemException(e);
			} finally {
				closeSession(session);
			}
		}
		
		public int countByPhanNhomHoSoIdGroupAndNguoiLamThuTucId(String phanNhomHoSoIdGroup, long nguoiLamThuTucId)
			throws SystemException {
			
			Session session = null;
			try {
				session = openSession();
				
				StringBuilder query = new StringBuilder();
				
				query.append("SELECT count(*) as total FROM tthc_hosothutuc WHERE 1=1 ");
				
				if (Validator.isNotNull(phanNhomHoSoIdGroup) && phanNhomHoSoIdGroup.trim().length() > 0) {
					query.append(" AND PHANNHOMHOSOID in (" + phanNhomHoSoIdGroup + ")");
				}
				
				if (nguoiLamThuTucId > 0) {
					query.append(" AND NGUOILAMTHUTUCID = " + nguoiLamThuTucId);
				}
				
//					log.debug("===countHoSoThuTucByPhanNhomHoSoIdAndNguoiLamThuTucId===" + query.toString());
				
				SQLQuery q = session.createSQLQuery(query.toString());
				q.addScalar("total", Type.LONG);
				q.setCacheable(false);
				
				Iterator<Long> itr = q.list().iterator();
				
				if (itr.hasNext()) {
					Long count = itr.next();
					if (count != null) { return count.intValue(); }
				}
				return 0;
			} catch (Exception e) {
				throw new SystemException(e);
			} finally {
				closeSession(session);
			}
		}
	
	//TODO chua hoan thanh countHoSoChoXuLy
	public int countHoSoChoXuLy()
		throws SystemException {
		
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			
			SQLQuery sqlQuery = session.createSQLQuery(query.toString());
			sqlQuery.addScalar("total", Type.LONG);
			sqlQuery.setCacheable(false);
			
			Iterator<Long> itr = sqlQuery.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { return count.intValue(); }
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	//TODO chua hoan thanh countHoSoDangXuLy
	public int countHoSoDangXuLy()
		throws SystemException {
		
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			
			SQLQuery sqlQuery = session.createSQLQuery(query.toString());
			sqlQuery.addScalar("total", Type.LONG);
			sqlQuery.setCacheable(false);
			
			Iterator<Long> itr = sqlQuery.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { return count.intValue(); }
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	//TODO chua hoan thanh countHoSoDaXuLy
	public int countHoSoDaXuLy()
		throws SystemException {
		
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			
			SQLQuery sqlQuery = session.createSQLQuery(query.toString());
			sqlQuery.addScalar("total", Type.LONG);
			sqlQuery.setCacheable(false);
			
			Iterator<Long> itr = sqlQuery.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { return count.intValue(); }
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public int countHoSoThuTucByTrangThai(String trangThaiId) {
		
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT count(*) as total FROM tthc_hosothutuc WHERE trangthaihoso in (").append(trangThaiId).append(")");
//			System.out.println("===countHoSoThuTucByTrangThai====" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);
			
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { return count.intValue(); }
			}
		} catch (Exception e) {
			e.printStackTrace();;
		} finally {
			closeSession(session);
		}
		
		return 0;
	}
}
