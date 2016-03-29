
package vn.dtt.duongbo.dao.nghiepvu.service.persistence;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile;
import vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtQuanLyFileImpl;
import vn.dtt.duongbo.utils.format.DateUtils;
import vn.dtt.duongbo.utils.format.FormatData;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class QlvtQuanLyFileFinderImpl extends BasePersistenceImpl<QlvtQuanLyFile> implements QlvtQuanLyFileFinder {
	
	private Log log = LogFactoryUtil.getLog(QlvtQuanLyFileFinderImpl.class);
	
	public List<QlvtQuanLyFile> searchQuanLyFile(
		long doanhNghiepId, long loaiFile, String trangThai, String tenGiayTo, Date fromNgayCP, Date toNgayCP, Date fromNgayHH, Date toNgayHH, Date fromNgayTai,
		Date toNgayTai, int start, int end)
		throws SystemException {
		Session session = null;
		try {
			log.info("==in finder searchQuanLyFile==");
			log.info("==maBienNhan==" + doanhNghiepId + "==doanhNghiepId==" + loaiFile);
			
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM nghiepvu_quanlyfile WHERE 1=1");
			
			if (doanhNghiepId > 0) {
				query.append(" AND doanhnghiepid = " + doanhNghiepId);
			}
			if (Validator.isNotNull(trangThai) && trangThai.trim().length() > 0) {
				query.append(" AND trangthai like '%").append(trangThai.trim()).append("%' ");
			}
			
			if (Validator.isNotNull(tenGiayTo) && tenGiayTo.trim().length() > 0) {
				query.append(" AND TENFILE like '%").append(tenGiayTo.trim()).append("%' ");
				log.info("===searchQuanLyFile TENFILE===" + tenGiayTo);
			}
			
			if (loaiFile > 0) {
				query.append(" AND LOAIFILE = " + loaiFile);
			}
			
			if (Validator.isNotNull(fromNgayCP)) {
				query.append(" AND NGAYCAP >=  '").append(FormatData.parseDateToTring(fromNgayCP)).append("'");
			}
			if (Validator.isNotNull(toNgayCP)) {
				query.append(" AND NGAYCAP <=  '").append(DateUtils.getEndOfDate(toNgayCP)).append("'");
			}
			
			if (Validator.isNotNull(fromNgayHH)) {
				query.append(" AND NGAYHETHAN >=  '").append(FormatData.parseDateToTring(fromNgayHH)).append("'");
			}
			
			if (Validator.isNotNull(toNgayHH)) {
				query.append(" AND NGAYHETHAN <=  '").append(DateUtils.getEndOfDate(toNgayHH)).append("'");
			}
			
			if (Validator.isNotNull(fromNgayTai)) {
				query.append(" AND NGAYTAI >=  '").append(FormatData.parseDateToTring(fromNgayTai)).append("'");
			}
			
			if (Validator.isNotNull(toNgayTai)) {
				query.append(" AND NGAYTAI <=  '").append(DateUtils.getEndOfDate(toNgayTai)).append("'");
			}
			
			query.append(" ORDER BY ngaytai desc ");
			
			log.info("===searchQuanLyFile===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("QlvtQuanLyFile", QlvtQuanLyFileImpl.class);
			
			return (List<QlvtQuanLyFile>) QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public int countQuanLyFile(
		long doanhNghiepId, long loaiFile, String trangThai, String tenGiayTo, Date fromNgayCP, Date toNgayCP, Date fromNgayHH, Date toNgayHH, Date fromNgayTai,
		Date toNgayTai)
		throws SystemException {
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT count(*) as total FROM nghiepvu_quanlyfile WHERE 1=1 ");
			
			if (doanhNghiepId > 0) {
				query.append(" AND doanhnghiepid = " + doanhNghiepId);
			}
			if (Validator.isNotNull(trangThai) && trangThai.trim().length() > 0) {
				query.append(" AND trangthai like '%").append(trangThai.trim()).append("%' ");
			}
			
			if (Validator.isNotNull(tenGiayTo) && tenGiayTo.trim().length() > 0) {
				query.append(" AND TENFILE like '%").append(tenGiayTo.trim()).append("%' ");
			}
			
			if (loaiFile > 0) {
				query.append(" AND LOAIFILE = " + loaiFile);
			}
			
			if (Validator.isNotNull(fromNgayCP)) {
				query.append(" AND NGAYCAP >=  '").append(FormatData.parseDateToTring(fromNgayCP)).append("'");
			}
			if (Validator.isNotNull(toNgayCP)) {
				query.append(" AND NGAYCAP <=  '").append(DateUtils.getEndOfDate(toNgayCP)).append("'");
			}
			
			if (Validator.isNotNull(fromNgayHH)) {
				query.append(" AND NGAYHETHAN >=  '").append(FormatData.parseDateToTring(fromNgayHH)).append("'");
			}
			
			if (Validator.isNotNull(toNgayHH)) {
				query.append(" AND NGAYHETHAN <=  '").append(DateUtils.getEndOfDate(toNgayHH)).append("'");
			}
			
			if (Validator.isNotNull(fromNgayTai)) {
				query.append(" AND NGAYTAI >=  '").append(FormatData.parseDateToTring(fromNgayTai)).append("'");
			}
			
			if (Validator.isNotNull(toNgayTai)) {
				query.append(" AND NGAYTAI <=  '").append(DateUtils.getEndOfDate(toNgayTai)).append("'");
			}
			
			log.debug("===countQuanLyFile===" + query.toString());
			
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
	
}
