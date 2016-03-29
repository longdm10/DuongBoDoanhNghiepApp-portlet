package vn.dtt.duongbo.dao.motcua.service.persistence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy;
import vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyImpl;
import vn.dtt.duongbo.utils.CommonUtils;
import vn.dtt.duongbo.utils.format.DateUtils;
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
import com.liferay.portal.model.User;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class MotCuaPhieuXuLyFinderImpl extends
		BasePersistenceImpl<MotCuaPhieuXuLy> implements MotCuaPhieuXuLyFinder {

	private Log log = LogFactoryUtil.getLog(MotCuaPhieuXuLyFinderImpl.class);

	public int countMotCuaPhieuXuLyByTrangThai(String trangThaiId) {

		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();

			query.append(
					"SELECT count(*) as total FROM motcua_phieuxuly WHERE trangthaihientaiid in (")
					.append(trangThaiId).append(")");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			log.debug("====countMotCuaPhieuXuLyByTrangThai======="
					+ query.toString());

			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.intValue();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			;
		} finally {
			closeSession(session);
		}

		return 0;
	}

	public List<MotCuaPhieuXuLy> searhMotCuaPhieuXuLy(long thuTucHanhChinhId,
			String maSoHoSo, String ngayGuiHoSoFrom, String ngayGuiHoSoTo,
			int start, int end) {
		Session session = null;
		try {
			session = openSession();

			StringBuilder hoSoThuTuc = new StringBuilder();
			hoSoThuTuc.append("select id from tthc_hosothutuc where 1=1 ");
			if (thuTucHanhChinhId > 0) {
				hoSoThuTuc.append("thutuchanhchinhid = ? ");
			}

			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				hoSoThuTuc.append("masohoso = ? ");
			}

			if (Validator.isNotNull(ngayGuiHoSoFrom)
					&& ngayGuiHoSoFrom.trim().length() > 0) {
				Date dateFrom = FormatData
						.parseDateShort3StringToDate(ngayGuiHoSoFrom.trim());
				ngayGuiHoSoFrom = FormatData.parseDateToTring(dateFrom);
				hoSoThuTuc.append(" AND (ngayguihoso >= '" + ngayGuiHoSoFrom
						+ "' OR ngayguihoso IS NULL)");
			}

			if (Validator.isNotNull(ngayGuiHoSoTo)
					&& ngayGuiHoSoTo.trim().length() > 0) {
				Date dateTo = FormatData
						.parseDateShort3StringToDate(ngayGuiHoSoTo.trim());
				ngayGuiHoSoTo = FormatData.parseDateToTring(dateTo);
				hoSoThuTuc.append(" AND (ngayguihoso <= '" + ngayGuiHoSoTo
						+ "' OR ngayguihoso IS NULL)");
			}

			StringBuilder query = new StringBuilder();
			query.append("select * from motcua_phieuxuly where 1=1 ");
			query.append("hosothutucid in (" + hoSoThuTuc.toString() + ")");
			query.append("");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("MotCuaPhieuXuLy", MotCuaPhieuXuLyImpl.class);

			log.debug("====searhMotCuaPhieuXuLy=======" + query.toString());

			QueryPos qPos = QueryPos.getInstance(q);

			if (thuTucHanhChinhId > 0) {
				qPos.add(thuTucHanhChinhId);
			}

			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				qPos.add(maSoHoSo.trim());
			}

			return (List<MotCuaPhieuXuLy>) QueryUtil.list(q, getDialect(),
					start, end);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return new ArrayList<MotCuaPhieuXuLy>();
	}

	public int countMotCuaPhieuXuLy(long thuTucHanhChinhId, String maSoHoSo,
			String ngayGuiHoSoFrom, String ngayGuiHoSoTo)
			throws SystemException {

		Session session = null;
		try {
			session = openSession();

			StringBuilder hoSoThuTuc = new StringBuilder();
			hoSoThuTuc.append("select id from tthc_hosothutuc where 1=1 ");
			if (thuTucHanhChinhId > 0) {
				hoSoThuTuc.append("thutuchanhchinhid = ? ");
			}

			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				hoSoThuTuc.append("masohoso = ? ");
			}

			if (Validator.isNotNull(ngayGuiHoSoFrom)
					&& ngayGuiHoSoFrom.trim().length() > 0) {
				Date dateFrom = FormatData
						.parseDateShort3StringToDate(ngayGuiHoSoFrom.trim());
				ngayGuiHoSoFrom = FormatData.parseDateToTring(dateFrom);
				hoSoThuTuc.append(" AND (ngayguihoso >= '" + ngayGuiHoSoFrom
						+ "' OR ngayguihoso IS NULL)");
			}

			if (Validator.isNotNull(ngayGuiHoSoTo)
					&& ngayGuiHoSoTo.trim().length() > 0) {
				Date dateTo = FormatData
						.parseDateShort3StringToDate(ngayGuiHoSoTo.trim());
				ngayGuiHoSoTo = FormatData.parseDateToTring(dateTo);
				hoSoThuTuc.append(" AND (ngayguihoso <= '" + ngayGuiHoSoTo
						+ "' OR ngayguihoso IS NULL)");
			}

			StringBuilder query = new StringBuilder();
			query.append("SELECT count(*) as total FROM tthc_hosothutuc WHERE 1=1 ");
			query.append("hosothutucid in (" + hoSoThuTuc.toString() + ")");
			query.append("");

			log.debug("====countMotCuaPhieuXuLy=======" + query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			QueryPos qPos = QueryPos.getInstance(q);

			if (thuTucHanhChinhId > 0) {
				qPos.add(thuTucHanhChinhId);
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				qPos.add(maSoHoSo.trim());
			}

			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.intValue();
				}
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List<MotCuaPhieuXuLy> findMotCuaPhieuXuLy(long phanNhomHoSo,
			long ogrId, String maSoBienNhan, Date nopTuNgay, Date nopDenNgay,
			Date henTraTuNgay, Date henTraDenNgay, String doanhNghiep,
			String linhVucThuTucHanhChinh, long idThuTucHanhChinh, long userId,
			String role, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("select * from motcua_phieuxuly  where 1 = 1 ")
					.append(" and TOCHUCQUANLY = ").append(ogrId);
			if (phanNhomHoSo != 11) {
				query.append(" and PHANNHOMHOSOID = ").append(phanNhomHoSo);
			}
			if (linhVucThuTucHanhChinh != null
					&& linhVucThuTucHanhChinh.trim().length() > 0) {
				query.append(" and QUYTRINHTHUTUCID = ").append(
						linhVucThuTucHanhChinh);
			}

			String sql = CommonUtils.checkPermissionAssign(userId, role);

			if (sql != null && sql.trim().length() > 0) {
				query.append(sql);
			}
			log.info("====sql=======" + sql.toString());

			StringBuilder query2 = new StringBuilder(
					"SELECT id FROM tthc_hosothutuc where TOCHUCQUANLY = ")
					.append(ogrId);
			if (idThuTucHanhChinh > 0) {
				query2.append(" and THUTUCHANHCHINHID = ").append(
						idThuTucHanhChinh);
			}

			if (Validator.isNotNull(nopTuNgay)) {
				query2.append(" AND NGAYGUIHOSO >=  '")
						.append(FormatData.parseDateToTring(nopTuNgay))
						.append("'");
			}

			if (Validator.isNotNull(nopDenNgay)) {
				query2.append(" AND NGAYGUIHOSO <=  '")
						.append(FormatData.parseDateToTring(nopDenNgay))
						.append("'");
			}

			if (Validator.isNotNull(henTraTuNgay)) {
				query2.append(" AND NGAYHENTRA >=  '")
						.append(FormatData.parseDateToTring(henTraTuNgay))
						.append("'");
			}

			if (Validator.isNotNull(henTraDenNgay)) {
				query2.append(" AND NGAYHENTRA <=  '")
						.append(FormatData.parseDateToTring(henTraDenNgay))
						.append("'");
			}

			if (Validator.isNotNull(maSoBienNhan)
					&& maSoBienNhan.trim().length() > 0) {
				if (phanNhomHoSo != 2) {
					query2.append(" AND MABIENNHAN like  ").append(
							"'%" + maSoBienNhan.trim() + "%'");
				} else {
					query2.append(" AND MASOHOSO like  ").append(
							"'%" + maSoBienNhan.trim() + "%'");
				}
			}
			if (Validator.isNotNull(doanhNghiep)
					&& doanhNghiep.trim().length() > 0) {
				query2.append(" AND TENCHUHOSO like  ").append(
						"'%" + doanhNghiep.trim() + "%'");
			}

			query.append(" and HOSOTHUTUCID in (").append(query2.toString())
					.append(")");

			log.info("====findMotCuaPhieuXuLy=======" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("MotCuaPhieuXuLy", MotCuaPhieuXuLyImpl.class);
			q.setCacheable(false);

			return (List<MotCuaPhieuXuLy>) QueryUtil.list(q, getDialect(),
					start, end);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return new ArrayList<MotCuaPhieuXuLy>();
	}

	public List<MotCuaPhieuXuLy> findMotCuaPhieuXuLyByUserId(long phanNhomHoSo,
			long ogrId, String maSoBienNhan, Date nopTuNgay, Date nopDenNgay,
			Date henTraTuNgay, Date henTraDenNgay, String doanhNghiep,
			String linhVucThuTucHanhChinh, long idThuTucHanhChinh, long userId,
			int start, int end) {
		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();
			query.append("select * from motcua_phieuxuly  where id in (SELECT distinct phieuxulyid FROM motcua_dienbienhoso where nguoixuly = "
					+ userId + " ) ");

			StringBuilder query2 = new StringBuilder(
					"SELECT id FROM tthc_hosothutuc where TOCHUCQUANLY = ")
					.append(ogrId);
			if (linhVucThuTucHanhChinh != null
					&& linhVucThuTucHanhChinh.trim().length() > 0) {
				query2.append(" and THUTUCHANHCHINHID = ").append(
						idThuTucHanhChinh);
			}

			if (Validator.isNotNull(nopTuNgay)) {
				query2.append(" AND NGAYGUIHOSO >=  '")
						.append(FormatData.parseDateToTring(nopTuNgay))
						.append("'");
			}

			if (Validator.isNotNull(nopDenNgay)) {
				query2.append(" AND NGAYGUIHOSO <=  '")
						.append(FormatData.parseDateToTring(nopDenNgay))
						.append("'");
			}

			if (Validator.isNotNull(henTraTuNgay)) {
				query2.append(" AND NGAYHENTRA >=  '")
						.append(FormatData.parseDateToTring(henTraTuNgay))
						.append("'");
			}

			if (Validator.isNotNull(henTraDenNgay)) {
				query2.append(" AND NGAYHENTRA <=  '")
						.append(FormatData.parseDateToTring(henTraDenNgay))
						.append("'");
			}

			if (Validator.isNotNull(maSoBienNhan)
					&& maSoBienNhan.trim().length() > 0) {
				if (phanNhomHoSo != 2) {
					query2.append(" AND MABIENNHAN like  ").append(
							"'%" + maSoBienNhan.trim() + "%'");
				} else {
					query2.append(" AND MASOHOSO like  ").append(
							"'%" + maSoBienNhan.trim() + "%'");
				}
			}
			if (Validator.isNotNull(doanhNghiep)
					&& doanhNghiep.trim().length() > 0) {
				query2.append(" AND TENCHUHOSO like  ").append(
						"'%" + doanhNghiep.trim() + "%'");
			}

			query.append(" and HOSOTHUTUCID in (").append(query2.toString())
					.append(")");

			log.debug("====findMotCuaPhieuXuLyByUserId======="
					+ query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("MotCuaPhieuXuLy", MotCuaPhieuXuLyImpl.class);
			q.setCacheable(false);

			return (List<MotCuaPhieuXuLy>) QueryUtil.list(q, getDialect(),
					start, end);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return new ArrayList<MotCuaPhieuXuLy>();
	}

	public List<MotCuaPhieuXuLy> findMotCuaPhieuXuLyByUserId_TC01(
			long phanNhomHoSo, long ogrId, String maSoBienNhan, Date nopTuNgay,
			Date nopDenNgay, Date henTraTuNgay, Date henTraDenNgay,
			String doanhNghiep, String linhVucThuTucHanhChinh,
			long idThuTucHanhChinh, long userId, int start, int end) {
		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();
			query.append("select * from motcua_phieuxuly  where id in (SELECT distinct phieuxulyid FROM motcua_dienbienhoso where nguoixuly = "
					+ userId + " ) ");

			StringBuilder query2 = new StringBuilder(
					"SELECT id FROM tthc_hosothutuc where TOCHUCQUANLY = ")
					.append(ogrId);
			if (linhVucThuTucHanhChinh != null
					&& linhVucThuTucHanhChinh.trim().length() > 0) {
				query2.append(" and THUTUCHANHCHINHID = ").append(
						idThuTucHanhChinh);
			}
			query2.append(" AND TRANGTHAIHIENTAIID NOT IN (10,24)");
			if (Validator.isNotNull(nopTuNgay)) {
				query2.append(" AND NGAYGUIHOSO >=  '")
						.append(FormatData.parseDateToTring(nopTuNgay))
						.append("'");
			}

			if (Validator.isNotNull(nopDenNgay)) {
				query2.append(" AND NGAYGUIHOSO <=  '")
						.append(FormatData.parseDateToTring(nopDenNgay))
						.append("'");
			}

			if (Validator.isNotNull(henTraTuNgay)) {
				query2.append(" AND NGAYHENTRA >=  '")
						.append(FormatData.parseDateToTring(henTraTuNgay))
						.append("'");
			}

			if (Validator.isNotNull(henTraDenNgay)) {
				query2.append(" AND NGAYHENTRA <=  '")
						.append(FormatData.parseDateToTring(henTraDenNgay))
						.append("'");
			}

			if (Validator.isNotNull(maSoBienNhan)
					&& maSoBienNhan.trim().length() > 0) {
				if (phanNhomHoSo != 2) {
					query2.append(" AND MABIENNHAN like  ").append(
							"'%" + maSoBienNhan.trim() + "%'");
				} else {
					query2.append(" AND MASOHOSO like  ").append(
							"'%" + maSoBienNhan.trim() + "%'");
				}
			}
			if (Validator.isNotNull(doanhNghiep)
					&& doanhNghiep.trim().length() > 0) {
				query2.append(" AND TENCHUHOSO like  ").append(
						"'%" + doanhNghiep.trim() + "%'");
			}

			query.append(" and HOSOTHUTUCID in (").append(query2.toString())
					.append(")");

			log.info("====findMotCuaPhieuXuLyByUserId_TC01======="
					+ query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("MotCuaPhieuXuLy", MotCuaPhieuXuLyImpl.class);
			q.setCacheable(false);

			return (List<MotCuaPhieuXuLy>) QueryUtil.list(q, getDialect(),
					start, end);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return new ArrayList<MotCuaPhieuXuLy>();
	}

	public int countMotCuaPhieuXuLyByUserId(long phanNhomHoSo, long ogrId,
			String maSoBienNhan, Date nopTuNgay, Date nopDenNgay,
			Date henTraTuNgay, Date henTraDenNgay, String doanhNghiep,
			String linhVucThuTucHanhChinh, long idThuTucHanhChinh, long userId) {
		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();
			query.append("select count(*) as total from motcua_phieuxuly  where id in (SELECT distinct phieuxulyid FROM motcua_dienbienhoso where nguoixuly = "
					+ userId + " ) ");

			StringBuilder query2 = new StringBuilder(
					"SELECT id FROM tthc_hosothutuc where TOCHUCQUANLY = ")
					.append(ogrId);
			if (linhVucThuTucHanhChinh != null
					&& linhVucThuTucHanhChinh.trim().length() > 0) {
				query2.append(" and THUTUCHANHCHINHID = ").append(
						idThuTucHanhChinh);
			}

			if (Validator.isNotNull(nopTuNgay)) {
				query2.append(" AND NGAYGUIHOSO >=  '")
						.append(FormatData.parseDateToTring(nopTuNgay))
						.append("'");
			}

			if (Validator.isNotNull(nopDenNgay)) {
				query2.append(" AND NGAYGUIHOSO <=  '")
						.append(FormatData.parseDateToTring(nopDenNgay))
						.append("'");
			}

			if (Validator.isNotNull(henTraTuNgay)) {
				query2.append(" AND NGAYHENTRA >=  '")
						.append(FormatData.parseDateToTring(henTraTuNgay))
						.append("'");
			}

			if (Validator.isNotNull(henTraDenNgay)) {
				query2.append(" AND NGAYHENTRA <=  '")
						.append(FormatData.parseDateToTring(henTraDenNgay))
						.append("'");
			}

			if (Validator.isNotNull(maSoBienNhan)
					&& maSoBienNhan.trim().length() > 0) {
				if (phanNhomHoSo != 2) {
					query2.append(" AND MABIENNHAN like  ").append(
							"'%" + maSoBienNhan.trim() + "%'");
				} else {
					query2.append(" AND MASOHOSO like  ").append(
							"'%" + maSoBienNhan.trim() + "%'");
				}
			}

			if (Validator.isNotNull(doanhNghiep)
					&& doanhNghiep.trim().length() > 0) {
				query2.append(" AND TENCHUHOSO like  ").append(
						"'%" + doanhNghiep.trim() + "%'");
			}

			query.append(" and HOSOTHUTUCID in (").append(query2.toString())
					.append(")");

			log.debug("====countMotCuaPhieuXuLyByUserId======="
					+ query.toString());

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
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return 0;
	}

	public int countMotCuaPhieuXuLyByUserId_TC01(long phanNhomHoSo, long ogrId,
			String maSoBienNhan, Date nopTuNgay, Date nopDenNgay,
			Date henTraTuNgay, Date henTraDenNgay, String doanhNghiep,
			String linhVucThuTucHanhChinh, long idThuTucHanhChinh, long userId) {
		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();
			query.append("select count(*) as total from motcua_phieuxuly  where id in (SELECT distinct phieuxulyid FROM motcua_dienbienhoso where nguoixuly = "
					+ userId + " ) ");

			StringBuilder query2 = new StringBuilder(
					"SELECT id FROM tthc_hosothutuc where TOCHUCQUANLY = ")
					.append(ogrId);
			if (linhVucThuTucHanhChinh != null
					&& linhVucThuTucHanhChinh.trim().length() > 0) {
				query2.append(" and THUTUCHANHCHINHID = ").append(
						idThuTucHanhChinh);
			}

			query2.append(" AND TRANGTHAIHIENTAIID NOT IN (10,24)");

			if (Validator.isNotNull(nopTuNgay)) {
				query2.append(" AND NGAYGUIHOSO >=  '")
						.append(FormatData.parseDateToTring(nopTuNgay))
						.append("'");
			}

			if (Validator.isNotNull(nopDenNgay)) {
				query2.append(" AND NGAYGUIHOSO <=  '")
						.append(FormatData.parseDateToTring(nopDenNgay))
						.append("'");
			}

			if (Validator.isNotNull(henTraTuNgay)) {
				query2.append(" AND NGAYHENTRA >=  '")
						.append(FormatData.parseDateToTring(henTraTuNgay))
						.append("'");
			}

			if (Validator.isNotNull(henTraDenNgay)) {
				query2.append(" AND NGAYHENTRA <=  '")
						.append(FormatData.parseDateToTring(henTraDenNgay))
						.append("'");
			}

			if (Validator.isNotNull(maSoBienNhan)
					&& maSoBienNhan.trim().length() > 0) {
				if (phanNhomHoSo != 2) {
					query2.append(" AND MABIENNHAN like  ").append(
							"'%" + maSoBienNhan.trim() + "%'");
				} else {
					query2.append(" AND MASOHOSO like  ").append(
							"'%" + maSoBienNhan.trim() + "%'");
				}
			}

			if (Validator.isNotNull(doanhNghiep)
					&& doanhNghiep.trim().length() > 0) {
				query2.append(" AND TENCHUHOSO like  ").append(
						"'%" + doanhNghiep.trim() + "%'");
			}

			query.append(" and HOSOTHUTUCID in (").append(query2.toString())
					.append(")");

			log.debug("====countMotCuaPhieuXuLyByUserId======="
					+ query.toString());

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
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return 0;
	}

	public List<MotCuaPhieuXuLy> findMotCuaPhieuXuLyByUserId2(
			long phanNhomHoSo, long ogrId, String maSoBienNhan, Date nopTuNgay,
			Date nopDenNgay, Date henTraTuNgay, Date henTraDenNgay,
			String doanhNghiep, String linhVucThuTucHanhChinh,
			long idThuTucHanhChinh, long userId, int start, int end) {
		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();
			query.append("select * from motcua_phieuxuly  where id in (SELECT distinct phieuxulyid FROM motcua_dienbienhoso where nguoixuly = "
					+ userId + " ) ");

			StringBuilder query2 = new StringBuilder(
					"SELECT id FROM tthc_hosothutuc where TOCHUCQUANLY = ")
					.append(ogrId);
			if (linhVucThuTucHanhChinh != null
					&& linhVucThuTucHanhChinh.trim().length() > 0) {
				query2.append(" and THUTUCHANHCHINHID = ").append(
						idThuTucHanhChinh);
			}
			query2.append(" AND TRANGTHAIHIENTAIID IN (10,24)");
			if (Validator.isNotNull(nopTuNgay)) {
				query2.append(" AND NGAYGUIHOSO >=  '")
						.append(FormatData.parseDateToTring(nopTuNgay))
						.append("'");
			}

			if (Validator.isNotNull(nopDenNgay)) {
				query2.append(" AND NGAYGUIHOSO <=  '")
						.append(FormatData.parseDateToTring(nopDenNgay))
						.append("'");
			}

			if (Validator.isNotNull(henTraTuNgay)) {
				query2.append(" AND NGAYHENTRA >=  '")
						.append(FormatData.parseDateToTring(henTraTuNgay))
						.append("'");
			}

			if (Validator.isNotNull(henTraDenNgay)) {
				query2.append(" AND NGAYHENTRA <=  '")
						.append(FormatData.parseDateToTring(henTraDenNgay))
						.append("'");
			}

			if (Validator.isNotNull(maSoBienNhan)
					&& maSoBienNhan.trim().length() > 0) {
				if (phanNhomHoSo != 2) {
					query2.append(" AND MABIENNHAN like  ").append(
							"'%" + maSoBienNhan.trim() + "%'");
				} else {
					query2.append(" AND MASOHOSO like  ").append(
							"'%" + maSoBienNhan.trim() + "%'");
				}
			}
			if (Validator.isNotNull(doanhNghiep)
					&& doanhNghiep.trim().length() > 0) {
				query2.append(" AND TENCHUHOSO like  ").append(
						"'%" + doanhNghiep.trim() + "%'");
			}

			query.append(" and HOSOTHUTUCID in (").append(query2.toString())
					.append(")");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("MotCuaPhieuXuLy", MotCuaPhieuXuLyImpl.class);
			q.setCacheable(false);

			log.debug("==========findMotCuaPhieuXuLyByUserId2============"
					+ query.toString());

			return (List<MotCuaPhieuXuLy>) QueryUtil.list(q, getDialect(),
					start, end);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return new ArrayList<MotCuaPhieuXuLy>();
	}

	public List<MotCuaPhieuXuLy> findMotCuaPhieuXuLyDoneByOrgid(long ogrId) {
		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();
			query.append("select * from motcua_phieuxuly  where 1 = 1");
			query.append(" AND TOCHUCQUANLY = " + ogrId);
			query.append(" AND TRANGTHAIHIENTAIID IN (10,24)");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("MotCuaPhieuXuLy", MotCuaPhieuXuLyImpl.class);
			q.setCacheable(false);

			log.debug("==========findMotCuaPhieuXuLyDoneByOrgid============"
					+ query.toString());

			return (List<MotCuaPhieuXuLy>) QueryUtil.list(q, getDialect(),
					QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return new ArrayList<MotCuaPhieuXuLy>();
	}

	public int countMotCuaPhieuXuLyByUserId2(long phanNhomHoSo, long ogrId,
			String maSoBienNhan, Date nopTuNgay, Date nopDenNgay,
			Date henTraTuNgay, Date henTraDenNgay, String doanhNghiep,
			String linhVucThuTucHanhChinh, long idThuTucHanhChinh, long userId) {
		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();
			query.append("select count(*) as total from motcua_phieuxuly  where id in (SELECT distinct phieuxulyid FROM motcua_dienbienhoso where nguoixuly = "
					+ userId + " ) ");

			StringBuilder query2 = new StringBuilder(
					"SELECT id FROM tthc_hosothutuc where TOCHUCQUANLY = ")
					.append(ogrId);
			if (linhVucThuTucHanhChinh != null
					&& linhVucThuTucHanhChinh.trim().length() > 0) {
				query2.append(" and THUTUCHANHCHINHID = ").append(
						idThuTucHanhChinh);
			}
			query2.append(" AND TRANGTHAIHIENTAIID IN (10,24)");
			if (Validator.isNotNull(nopTuNgay)) {
				query2.append(" AND NGAYGUIHOSO >=  '")
						.append(FormatData.parseDateToTring(nopTuNgay))
						.append("'");
			}

			if (Validator.isNotNull(nopDenNgay)) {
				query2.append(" AND NGAYGUIHOSO <=  '")
						.append(FormatData.parseDateToTring(nopDenNgay))
						.append("'");
			}

			if (Validator.isNotNull(henTraTuNgay)) {
				query2.append(" AND NGAYHENTRA >=  '")
						.append(FormatData.parseDateToTring(henTraTuNgay))
						.append("'");
			}

			if (Validator.isNotNull(henTraDenNgay)) {
				query2.append(" AND NGAYHENTRA <=  '")
						.append(FormatData.parseDateToTring(henTraDenNgay))
						.append("'");
			}

			if (Validator.isNotNull(maSoBienNhan)
					&& maSoBienNhan.trim().length() > 0) {
				if (phanNhomHoSo != 2) {
					query2.append(" AND MABIENNHAN like  ").append(
							"'%" + maSoBienNhan.trim() + "%'");
				} else {
					query2.append(" AND MASOHOSO like  ").append(
							"'%" + maSoBienNhan.trim() + "%'");
				}
			}

			if (Validator.isNotNull(doanhNghiep)
					&& doanhNghiep.trim().length() > 0) {
				query2.append(" AND TENCHUHOSO like  ").append(
						"'%" + doanhNghiep.trim() + "%'");
			}

			query.append(" and HOSOTHUTUCID in (").append(query2.toString())
					.append(")");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			log.debug("==========countMotCuaPhieuXuLyByUserId2============"
					+ query.toString());

			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.intValue();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return 0;
	}

	public List<Object> getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc(
			long ogrId, Date nopTuNgay, Date nopDenNgay,
			long idThuTucHanhChinh, long userId, String trangThaiIds) {
		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder(
					"select count(THUTUCHANHCHINHID) as 'total', THUTUCHANHCHINHID, nguoixuly from ");
			query.append("(  select p.id, p.nguoixuly, t.THUTUCHANHCHINHID from ");
			query.append(" ( select m.id, m.hosothutucid, d.nguoixuly from motcua_phieuxuly m inner join ");
			query.append(" (SELECT  distinct nguoixuly, phieuxulyid FROM motcua_dienbienhoso) d ");
			query.append(" on m.id = d.phieuxulyid ");
			if (trangThaiIds != null && trangThaiIds.trim().length() > 0) {
				query.append(" where m.trangthaihientaiid in (" + trangThaiIds
						+ ") ");
			}
			query.append(" ) p inner join tthc_hosothutuc t on p.hosothutucid = t.id ");
			query.append(" where t.TOCHUCQUANLY = " + ogrId);

			if (Validator.isNotNull(nopTuNgay)) {
				query.append(" AND NGAYGUIHOSO >=  '")
						.append(FormatData.parseDateToTring(nopTuNgay))
						.append("'");
			}

			if (Validator.isNotNull(nopDenNgay)) {
				query.append(" AND NGAYHENTRA <=  '")
						.append(FormatData.parseDateToTring(nopDenNgay))
						.append("'");
			}

			if (idThuTucHanhChinh > 0 && userId > 0) {
				query.append(" and t.THUTUCHANHCHINHID = " + idThuTucHanhChinh
						+ " and p.nguoixuly = " + userId
						+ " ) a group by a.nguoixuly ");
			} else if (idThuTucHanhChinh > 0 && userId <= 0) {
				query.append(" and t.THUTUCHANHCHINHID = " + idThuTucHanhChinh
						+ " ) a group by a.nguoixuly ");
			} else if (idThuTucHanhChinh <= 0 && userId > 0) {
				query.append(" and p.nguoixuly = " + userId
						+ " ) a group by a.THUTUCHANHCHINHID ");
			} else {
				query.append(" ) a group by a.THUTUCHANHCHINHID ");
			}

			log.debug(trangThaiIds
					+ "====trangThaiIdstrangThaiIds=========getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc============"
					+ query.toString());
			log.debug(trangThaiIds
					+ "====trangThaiIdstrangThaiIds=========getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc============"
					+ query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());

			return q.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return new ArrayList();
	}

	public List<Object> getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc2(
			long ogrId, Date nopTuNgay, Date nopDenNgay,
			long idThuTucHanhChinh, long userId, String trangThaiIds) {
		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder(
					"select count(THUTUCHANHCHINHID) as 'total', THUTUCHANHCHINHID, nguoixuly from ");
			query.append("(  select p.id, p.nguoixuly, t.THUTUCHANHCHINHID from ");
			query.append(" ( select m.id, m.hosothutucid, d.nguoixuly from motcua_phieuxuly m inner join ");
			query.append(" (SELECT  distinct nguoixuly, phieuxulyid FROM motcua_phancongxuly) d ");
			query.append(" on m.id = d.phieuxulyid ");
			if (trangThaiIds != null && trangThaiIds.trim().length() > 0) {
				query.append(" where m.trangthaihientaiid in (" + trangThaiIds
						+ ") ");
			}
			query.append(" ) p inner join tthc_hosothutuc t on p.hosothutucid = t.id ");
			query.append(" where t.TOCHUCQUANLY = " + ogrId);

			if (Validator.isNotNull(nopTuNgay)) {
				query.append(" AND NGAYGUIHOSO >=  '")
						.append(FormatData.parseDateToTring(nopTuNgay))
						.append("'");
			}

			if (Validator.isNotNull(nopDenNgay)) {
				query.append(" AND NGAYHENTRA <=  '")
						.append(FormatData.parseDateToTring(nopDenNgay))
						.append("'");
			}

			if (idThuTucHanhChinh > 0 && userId > 0) {
				query.append(" and t.THUTUCHANHCHINHID = " + idThuTucHanhChinh
						+ " and p.nguoixuly = " + userId
						+ " ) a group by a.nguoixuly ");
			} else if (idThuTucHanhChinh > 0 && userId <= 0) {
				query.append(" and t.THUTUCHANHCHINHID = " + idThuTucHanhChinh
						+ " ) a group by a.nguoixuly ");
			} else if (idThuTucHanhChinh <= 0 && userId > 0) {
				query.append(" and p.nguoixuly = " + userId
						+ " ) a group by a.THUTUCHANHCHINHID ");
			} else {
				query.append(" ) a group by a.THUTUCHANHCHINHID ");
			}

			log.debug(trangThaiIds
					+ "====trangThaiIdstrangThaiIds=========getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc2============"
					+ query.toString());
			log.debug(trangThaiIds
					+ "====trangThaiIdstrangThaiIds=========getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc2============"
					+ query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());

			return q.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return new ArrayList();
	}

	public List<Object> getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc3(
			long ogrId, Date nopTuNgay, Date nopDenNgay,
			long idThuTucHanhChinh, long userId, String trangThaiIds) {
		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder(
					"select count(THUTUCHANHCHINHID) as 'total', THUTUCHANHCHINHID, nguoixuly from ");
			query.append("(  select p.id, p.nguoixuly, t.THUTUCHANHCHINHID from ");
			query.append(" ( select m.id, m.hosothutucid, d.nguoixuly from motcua_phieuxuly m inner join ");
			query.append(" (SELECT  distinct nguoixuly, phieuxulyid FROM motcua_phancongxuly) d ");
			query.append(" on m.id = d.phieuxulyid ");
			if (trangThaiIds != null && trangThaiIds.trim().length() > 0) {
				query.append(" where m.trangthaihientaiid in (" + trangThaiIds
						+ ") ");
			}
			query.append(" ) p inner join tthc_hosothutuc t on p.hosothutucid = t.id ");
			query.append(" where t.TOCHUCQUANLY = " + ogrId);

			if (Validator.isNotNull(nopTuNgay)) {
				query.append(" AND NGAYGUIHOSO >=  '")
						.append(FormatData.parseDateToTring(nopTuNgay))
						.append("'");
			}

			if (Validator.isNotNull(nopDenNgay)) {
				query.append(" AND NGAYHENTRA <=  '")
						.append(FormatData.parseDateToTring(nopDenNgay))
						.append("'");
			}

			if (idThuTucHanhChinh > 0 && userId > 0) {
				query.append(" and t.THUTUCHANHCHINHID in(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16) and p.nguoixuly = "
						+ userId + " ) a group by a.nguoixuly ");
			} else if (idThuTucHanhChinh > 0 && userId <= 0) {
				query.append(" and t.THUTUCHANHCHINHID  in(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16) ) a group by a.nguoixuly ");
			} else if (idThuTucHanhChinh > 0 && userId > 0) {
				query.append(" and p.nguoixuly = " + userId
						+ " ) a group by a.THUTUCHANHCHINHID ");
			} else {
				query.append(" ) a group by a.THUTUCHANHCHINHID ");
			}

			log.debug(trangThaiIds
					+ "====trangThaiIdstrangThaiIds=========getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc2============"
					+ query.toString());
			log.debug(trangThaiIds
					+ "====trangThaiIdstrangThaiIds=========getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc2============"
					+ query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());

			return q.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return new ArrayList();
	}

	public List<Object> getMotCuaPhieuXuLyByOrgs(long ogrId) {
		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder(
					"select p.id, t.THUTUCHANHCHINHID, p.nguoixuly from  ( select m.id, m.hosothutucid, d.nguoixuly ");
			query.append(" from motcua_phieuxuly m inner join  (SELECT  distinct nguoixuly, ");
			query.append(" phieuxulyid FROM motcua_dienbienhoso) d  on m.id = d.phieuxulyid  ) p inner join ");
			query.append(" tthc_hosothutuc t on t.id=p.hosothutucid ");
			query.append(" where t.TOCHUCQUANLY = ").append(ogrId)
					.append(" group by p.nguoixuly, t.THUTUCHANHCHINHID");

			log.debug("====getMotCuaPhieuXuLyByOrgs=======" + query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());

			return q.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return new ArrayList();
	}

	public List<Object> getMotCuaPhieuXuLyByOrgs2(long ogrId) {
		Session session = null;
		try {
			session = openSession();
			List<User> allCanBos = CommonUtils.findUserByRoleName2(10157,
					Constants.CAP_PHU_HIEU_XE_NOI_BO);
			StringBuilder query = new StringBuilder(
					"select p.id , t.THUTUCHANHCHINHID, p.nguoixuly from ");

			query.append(" ( ");
			query.append(" select distinct m.id, m.hosothutucid, d.nguoixuly  from  motcua_phieuxuly m ");
			query.append(" join  (SELECT  distinct nguoixuly,  phieuxulyid FROM motcua_dienbienhoso) d  on m.id = d.phieuxulyid ");
			query.append(" union all ");
			query.append(" select distinct m.id, m.hosothutucid, c.nguoixuly  from  motcua_phieuxuly m ");
			query.append(" join  (SELECT  distinct nguoixuly,  phieuxulyid FROM motcua_phancongxuly) c  on m.id = c.phieuxulyid ");

			query.append(" ) p");
			query.append(" inner join  tthc_hosothutuc t on t.id=p.hosothutucid ");
			query.append(" where t.TOCHUCQUANLY = '" + ogrId + "'");
			String idCanBo = "";
			if (allCanBos != null && allCanBos.size() > 0) {
				for (User user : allCanBos) {
					log.debug("====user.getUserId();=======" + user.getUserId());
					idCanBo = idCanBo + ",'" + user.getUserId() + "'";

				}
				if (idCanBo.trim().length() > 0) {
					idCanBo = idCanBo.substring(1);
				}
				log.debug("idCanBo" + idCanBo);
			}
			query.append(" and nguoixuly in (").append(idCanBo).append(")");
			query.append(" group by p.nguoixuly, t.THUTUCHANHCHINHID");
			log.debug("====getMotCuaPhieuXuLyByOrgs2=======" + query.toString());
			log.debug("====getMotCuaPhieuXuLyByOrgs2=======" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			return q.list();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return new ArrayList();
	}

	public List<Object> getMotCuaPhieuXuLyByTrangThaiAndUserId(long ogrId,
			Date nopTuNgay, Date nopDenNgay, long idThuTucHanhChinh,
			long userId, String trangThaiIds) {
		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder(
					"select count(THUTUCHANHCHINHID) as 'total', THUTUCHANHCHINHID from ( ");
			query.append(" select m.id, t.THUTUCHANHCHINHID from motcua_phieuxuly m inner join tthc_hosothutuc t ");
			query.append(" on m.hosothutucid = t.id ");
			if (userId > 0) {
				query.append(" where m.id in (SELECT distinct phieuxulyid FROM motcua_dienbienhoso where nguoixuly = "
						+ userId + " ) ");
			} else {
				query.append(" where 1=1 ");
			}
			if (ogrId > 0) {
				query.append(" and t.TOCHUCQUANLY = " + ogrId);
			}
			if (trangThaiIds.trim().length() > 0) {
				query.append(" and m.trangthaihientaiid in (" + trangThaiIds
						+ ") ");
			}
			if (idThuTucHanhChinh > 0) {
				query.append(" and t.THUTUCHANHCHINHID = " + idThuTucHanhChinh);
			}
			query.append(" ) a group by a.THUTUCHANHCHINHID	");

			// if (Validator.isNotNull(nopTuNgay)) {
			// query2.append(" AND NGAYGUIHOSO >=  '").append(FormatData.parseDateToTring(nopTuNgay)).append("'");
			// }
			//
			// if (Validator.isNotNull(nopDenNgay)) {
			// query2.append(" AND NGAYGUIHOSO <=  '").append(FormatData.parseDateToTring(nopDenNgay)).append("'");
			// }

			log.debug(trangThaiIds
					+ "====trangThaiIdstrangThaiIds======getMotCuaPhieuXuLyByTrangThaiAndUserId============"
					+ query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());

			return q.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return new ArrayList();
	}

	public List<Object> getMotCuaPhieuXuLyVanThuByOrgs(long ogrId) {
		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder(
					"select distinct t.THUTUCHANHCHINHID from motcua_phieuxuly m inner join tthc_hosothutuc t on t.id=m.hosothutucid where t.TOCHUCQUANLY = ")
					.append(ogrId);

			SQLQuery q = session.createSQLQuery(query.toString());

			log.debug("====getMotCuaPhieuXuLyVanThuByOrgs======="
					+ query.toString());

			return q.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return new ArrayList();
	}

	public int countMotCuaPhieuXuLyByTrangThaiVanThu(long ogrId,
			long idThuTucHanhChinh, String trangThaiIds) {
		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();
			query.append("select count(m.id) as total from motcua_phieuxuly m inner join tthc_hosothutuc t on t.id=m.hosothutucid ");
			query.append(" where t.TOCHUCQUANLY = " + ogrId
					+ " and m.trangthaihientaiid in (" + trangThaiIds
					+ ") and t.THUTUCHANHCHINHID= " + idThuTucHanhChinh);

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			log.debug("====countMotCuaPhieuXuLyByTrangThaiVanThu======="
					+ query.toString());

			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.intValue();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return 0;
	}

	public int countMotCuaPhieuXuLyByTrangThaiAndUserId(long ogrId,
			Date nopTuNgay, Date nopDenNgay, long idThuTucHanhChinh,
			long userId, String trangThaiIds) {
		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();
			query.append("select count(*) as total from motcua_phieuxuly  where id in (SELECT distinct phieuxulyid FROM motcua_phancongxuly where nguoixuly = "
					+ userId + " ) ");

			StringBuilder query2 = new StringBuilder(
					"SELECT id FROM tthc_hosothutuc where TOCHUCQUANLY = ")
					.append(ogrId);
			if (idThuTucHanhChinh > 0) {
				query2.append(" and THUTUCHANHCHINHID = ").append(
						idThuTucHanhChinh);
			}

			if (Validator.isNotNull(nopTuNgay)) {
				query2.append(" AND NGAYGUIHOSO >=  '")
						.append(FormatData.parseDateToTring(nopTuNgay))
						.append("'");
			}

			if (Validator.isNotNull(nopDenNgay)) {
				query2.append(" AND NGAYGUIHOSO <=  '")
						.append(FormatData.parseDateToTring(nopDenNgay))
						.append("'");
			}

			query.append(" and trangthaihientaiid in (").append(trangThaiIds)
					.append(") ");
			query.append(" and HOSOTHUTUCID in (").append(query2.toString())
					.append(") ");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			log.debug("====countMotCuaPhieuXuLyByTrangThaiAndUserId======="
					+ query.toString());
			log.debug("==========countMotCuaPhieuXuLyByTrangThaiAndUserId====="
					+ query.toString());
			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.intValue();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return 0;
	}

	public int countMotCuaPhieuXuLyByTrangThaiAndUserId2(long ogrId,
			Date nopTuNgay, Date nopDenNgay, long idThuTucHanhChinh,
			long userId, String trangThaiIds) {
		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();
			query.append("select count(*) as total from motcua_phieuxuly  where id in (SELECT distinct phieuxulyid FROM motcua_dienbienhoso where nguoixuly = "
					+ userId
					+ " and HANHDONGXULY not in(select HANHDONGXULY from motcua_chuyendichtrangthai where id in(4,25))    )  ");

			StringBuilder query2 = new StringBuilder(
					"SELECT id FROM tthc_hosothutuc where TOCHUCQUANLY = ")
					.append(ogrId);
			if (idThuTucHanhChinh > 0) {
				query2.append(" and THUTUCHANHCHINHID = ").append(
						idThuTucHanhChinh);
			}

			if (Validator.isNotNull(nopTuNgay)) {
				query2.append(" AND NGAYGUIHOSO >=  '")
						.append(FormatData.parseDateToTring(nopTuNgay))
						.append("'");
			}

			if (Validator.isNotNull(nopDenNgay)) {
				query2.append(" AND NGAYGUIHOSO <=  '")
						.append(FormatData.parseDateToTring(nopDenNgay))
						.append("'");
			}

			query.append(" and trangthaihientaiid in (").append(trangThaiIds)
					.append(") ");
			query.append(" and HOSOTHUTUCID in (").append(query2.toString())
					.append(") ");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			log.debug("====countMotCuaPhieuXuLyByTrangThaiAndUserId======="
					+ query.toString());
			log.debug("==========countMotCuaPhieuXuLyByTrangThaiAndUserId====="
					+ query.toString());
			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.intValue();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return 0;
	}

	public int countMotCuaPhieuXuLy(long phanNhomHoSo, long ogrId,
			String maSoBienNhan, Date nopTuNgay, Date nopDenNgay,
			Date henTraTuNgay, Date henTraDenNgay, String doanhNghiep,
			String linhVucThuTucHanhChinh, long idThuTucHanhChinh, long userId,
			String role) {
		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();
			query.append(
					"select count(*) as total from motcua_phieuxuly where 1 = 1 ")
					.append(" and TOCHUCQUANLY = ").append(ogrId);
			if (phanNhomHoSo != 0) {
				query.append(" and PHANNHOMHOSOID = ").append(phanNhomHoSo);
			}
			String sql = CommonUtils.checkPermissionAssign(userId, role);
			if (linhVucThuTucHanhChinh != null
					&& linhVucThuTucHanhChinh.trim().length() > 0) {
				query.append(" and QUYTRINHTHUTUCID = ").append(
						linhVucThuTucHanhChinh);
			}
			if (sql != null && sql.trim().length() > 0) {
				query.append(sql);
			}

			StringBuilder query2 = new StringBuilder(
					"SELECT id FROM tthc_hosothutuc where TOCHUCQUANLY = ")
					.append(ogrId);
			if (idThuTucHanhChinh > 0) {
				query2.append(" and THUTUCHANHCHINHID = ").append(
						idThuTucHanhChinh);
			}

			if (Validator.isNotNull(nopTuNgay)) {
				query2.append(" AND NGAYGUIHOSO >=  '")
						.append(FormatData.parseDateToTring(nopTuNgay))
						.append("'");
			}

			if (Validator.isNotNull(nopDenNgay)) {
				query2.append(" AND NGAYGUIHOSO <=  '")
						.append(FormatData.parseDateToTring(nopDenNgay))
						.append("'");
			}

			if (Validator.isNotNull(henTraTuNgay)) {
				query2.append(" AND NGAYHENTRA >=  '")
						.append(FormatData.parseDateToTring(henTraTuNgay))
						.append("'");
			}

			if (Validator.isNotNull(henTraDenNgay)) {
				query2.append(" AND NGAYHENTRA <=  '")
						.append(FormatData.parseDateToTring(henTraDenNgay))
						.append("'");
			}

			if (Validator.isNotNull(maSoBienNhan)
					&& maSoBienNhan.trim().length() > 0) {
				if (phanNhomHoSo != 2) {
					query2.append(" AND MABIENNHAN like  ").append(
							"'%" + maSoBienNhan.trim() + "%'");
				} else {
					query2.append(" AND MASOHOSO like  ").append(
							"'%" + maSoBienNhan.trim() + "%'");
				}
			}

			if (Validator.isNotNull(doanhNghiep)
					&& doanhNghiep.trim().length() > 0) {
				query2.append(" AND TENCHUHOSO like  ").append(
						"'%" + doanhNghiep.trim() + "%'");
			}

			query.append(" and HOSOTHUTUCID in (").append(query2.toString())
					.append(")");

			log.info("=============countMotCuaPhieuXuLy=========="
					+ query.toString());

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
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return 0;
	}

	public List<MotCuaPhieuXuLy> findMotCuaPhieuXuLyTrangThai(
			long phanNhomHoSo, long ogrId, String maSoBienNhan, Date nopTuNgay,
			Date nopDenNgay, Date henTraTuNgay, Date henTraDenNgay,
			String doanhNghiep, String linhVucThuTucHanhChinh,
			long idThuTucHanhChinh, long trangThaiHienTaiId, int start, int end) {
		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();
			if (trangThaiHienTaiId > 0) {
				query.append(
						"select * from motcua_phieuxuly  where trangthaihientaiid = ")
						.append(trangThaiHienTaiId);
			} else {
				query.append("select * from motcua_phieuxuly  where 1 = 1 ");
			}

			if (phanNhomHoSo > 0) {
				query.append("and PHANNHOMHOSOID = ").append(phanNhomHoSo);
			}
			StringBuilder query2 = new StringBuilder(
					"SELECT id FROM tthc_hosothutuc where TOCHUCQUANLY = ")
					.append(ogrId);
			if (linhVucThuTucHanhChinh != null
					&& linhVucThuTucHanhChinh.trim().length() > 0) {
				query2.append(" and THUTUCHANHCHINHID = ").append(
						idThuTucHanhChinh);
			}

			if (Validator.isNotNull(nopTuNgay)) {
				query2.append(" AND NGAYGUIHOSO >=  '")
						.append(FormatData.parseDateToTring(nopTuNgay))
						.append("'");
			}

			if (Validator.isNotNull(nopDenNgay)) {
				query2.append(" AND NGAYGUIHOSO <=  '")
						.append(FormatData.parseDateToTring(nopDenNgay))
						.append("'");
			}

			if (Validator.isNotNull(henTraTuNgay)) {
				query2.append(" AND NGAYHENTRA >=  '")
						.append(FormatData.parseDateToTring(henTraTuNgay))
						.append("'");
			}

			if (Validator.isNotNull(henTraDenNgay)) {
				query2.append(" AND NGAYHENTRA <=  '")
						.append(FormatData.parseDateToTring(henTraDenNgay))
						.append("'");
			}

			if (Validator.isNotNull(maSoBienNhan)
					&& maSoBienNhan.trim().length() > 0) {
				if (phanNhomHoSo != 2) {
					query2.append(" AND MABIENNHAN like  ").append(
							"'%" + maSoBienNhan.trim() + "%'");
				} else {
					query2.append(" AND MASOHOSO like  ").append(
							"'%" + maSoBienNhan.trim() + "%'");
				}
			}
			if (Validator.isNotNull(doanhNghiep)
					&& doanhNghiep.trim().length() > 0) {
				query2.append(" AND TENCHUHOSO like  ").append(
						"'%" + doanhNghiep.trim() + "%'");
			}

			query.append(" and HOSOTHUTUCID in (").append(query2.toString())
					.append(")");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("MotCuaPhieuXuLy", MotCuaPhieuXuLyImpl.class);
			q.setCacheable(false);

			log.info("====findMotCuaPhieuXuLyTrangThai======="
					+ query.toString());

			return (List<MotCuaPhieuXuLy>) QueryUtil.list(q, getDialect(),
					start, end);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return new ArrayList<MotCuaPhieuXuLy>();
	}

	public int countMotCuaPhieuXuLyTrangThai(long phanNhomHoSo, long ogrId,
			String maSoBienNhan, Date nopTuNgay, Date nopDenNgay,
			Date henTraTuNgay, Date henTraDenNgay, String doanhNghiep,
			String linhVucThuTucHanhChinh, long idThuTucHanhChinh,
			long trangThaiHienTaiId) {
		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();
			if (trangThaiHienTaiId > 0) {
				query.append(
						"select count(*) as total from motcua_phieuxuly  where trangthaihientaiid = ")
						.append(trangThaiHienTaiId);
			} else {
				query.append("select count(*) as total from motcua_phieuxuly  where 1 = 1 ");
			}

			if (phanNhomHoSo > 0) {
				query.append("and PHANNHOMHOSOID = ").append(phanNhomHoSo);
			}

			StringBuilder query2 = new StringBuilder(
					"SELECT id FROM tthc_hosothutuc where TOCHUCQUANLY = ")
					.append(ogrId);
			if (linhVucThuTucHanhChinh != null
					&& linhVucThuTucHanhChinh.trim().length() > 0) {
				query2.append(" and THUTUCHANHCHINHID = ").append(
						idThuTucHanhChinh);
			}

			if (Validator.isNotNull(nopTuNgay)) {
				query2.append(" AND NGAYGUIHOSO >=  '")
						.append(FormatData.parseDateToTring(nopTuNgay))
						.append("'");
			}

			if (Validator.isNotNull(nopDenNgay)) {
				query2.append(" AND NGAYGUIHOSO <=  '")
						.append(FormatData.parseDateToTring(nopDenNgay))
						.append("'");
			}

			if (Validator.isNotNull(henTraTuNgay)) {
				query2.append(" AND NGAYHENTRA >=  '")
						.append(FormatData.parseDateToTring(henTraTuNgay))
						.append("'");
			}

			if (Validator.isNotNull(henTraDenNgay)) {
				query2.append(" AND NGAYHENTRA <=  '")
						.append(FormatData.parseDateToTring(henTraDenNgay))
						.append("'");
			}

			if (Validator.isNotNull(maSoBienNhan)
					&& maSoBienNhan.trim().length() > 0) {
				if (phanNhomHoSo != 2) {
					query2.append(" AND MABIENNHAN like  ").append(
							"'%" + maSoBienNhan.trim() + "%'");
				} else {
					query2.append(" AND MASOHOSO like  ").append(
							"'%" + maSoBienNhan.trim() + "%'");
				}
			}

			if (Validator.isNotNull(doanhNghiep)
					&& doanhNghiep.trim().length() > 0) {
				query2.append(" AND TENCHUHOSO like  ").append(
						"'%" + doanhNghiep.trim() + "%'");
			}

			query.append(" and HOSOTHUTUCID in (").append(query2.toString())
					.append(")");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			log.debug("====countMotCuaPhieuXuLyTrangThai======="
					+ query.toString());
			log.debug("====countMotCuaPhieuXuLyTrangThai======="
					+ query.toString());

			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.intValue();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return 0;
	}

	public int countMotCuaPhieuXuLyByPhanNhomHoSo(long phanNhomHoSo,
			long ogrId, long userId, String role) throws SystemException {
		Session session = null;
		String[] listRole = null;
		boolean noCheckNguoiXuLy = false;
		if (role != null && role.trim().length() > 0) {
			listRole = role.split(",");
		}
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();
			query.append(
					"select count(*) as total from motcua_phieuxuly  where PHANNHOMHOSOID = ")
					.append(phanNhomHoSo).append(" and TOCHUCQUANLY = ")
					.append(ogrId);
			if (listRole != null && listRole.length > 0) {
				for (int i = 0; i < listRole.length; i++) {
					String roleId = listRole[i];
					if (Arrays.asList(Constants.LIST_ROLE_NO_CHECK_NGUOIXULY)
							.contains(roleId)) {
						noCheckNguoiXuLy = true;
						break;
					}
				}
			}

			if (!noCheckNguoiXuLy) {
				// fix tam cho duong thuy
				String sql = " and (nguoixuly = " + userId
						+ " or nguoixuly = 0 or nguoixuly is null )";
				query.append(sql);
			}

			log.info("====countMotCuaPhieuXuLyByPhanNhomHoSo====111==="
					+ query.toString());

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
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public int layHoSoDaXuLyOrDangXuLy(long userId, String trangThai, Date date) {
		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();
			query.append(" select count(*) as total from (SELECT p.id, ph.nguoixuly, ph.ngayphancong FROM motcua_phieuxuly p inner join ");
			query.append(
					" motcua_phancongxuly ph on p.id = ph.phieuxulyid where p.trangthaihientaiid in (")
					.append(trangThai).append(") and ph.nguoixuly = ")
					.append(userId);
			if (date != null) {
				Date startDate = DateUtils.getMinDayOfMonth(date, 0, 0, 0);
				Date endDate = DateUtils.getMaxDayOfMonth(date, 23, 59, 59);
				query.append(" and ph.ngayphancong >= '")
						.append(FormatData.parseDateToTring(startDate))
						.append("' and ph.ngayphancong <= '")
						.append(FormatData.parseDateToTring(endDate))
						.append("'");
			}
			query.append(") t ");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			log.debug("====layHoSoDaXuLyOrDangXuLy=======" + query.toString());

			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.intValue();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return 0;
	}

	// TODO UPDATE 21/1
	public List<MotCuaPhieuXuLy> findMotCuaPhieuXuLy_NEW(List<String> lstPar, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("select a.* from motcua_phieuxuly a left join tthc_phannhomhoso b on a.PHANNHOMHOSOID = b.ID left JOIN tthc_hosothutuc c on a.HOSOTHUTUCID = c.ID where 1 =1  ");
			//to chuc quan ly----0
			//phan nhom ho so id----1
			//nhom thu tuc ---- 2
			//ten thu tuc hanh chinh ---- 3
			//ngay nop ---- 4
			//den ngay ---- 5
			//nam ---- 6
			//ma so ho so ---- 7
			//doanh nghiep LIKE ---- 8	
			//ma phan nhom ho so ---- 9
			//nguoi xu ly -----10
			if(lstPar.size()>=1 && Validator.isNotNull(lstPar.get(0)))
				query.append(" and c.TOCHUCQUANLY = ").append(lstPar.get(0));
			if(lstPar.size()>=2 && Validator.isNotNull(lstPar.get(1)) && !lstPar.get(1).equals("11"))
				query.append(" and a.PHANNHOMHOSOID = ").append(lstPar.get(1));
			if(lstPar.size()>=3 && Validator.isNotNull(lstPar.get(2)))
				query.append(" and a.QUYTRINHTHUTUCID = ").append(lstPar.get(2));
			if(lstPar.size()>=4 && Validator.isNotNull(lstPar.get(3)))
				query.append(" and c.THUTUCHANHCHINHID = ").append(lstPar.get(3));
		
			if(lstPar.size()>=6 && Validator.isNotNull(lstPar.get(4)) && Validator.isNotNull(lstPar.get(5))) {
				query.append(" and c.NGAYGUIHOSO between '" + FormatData.parseDateToTringYYYYMMDD(FormatData.parseStringToDateTypeDDMMYYYY(lstPar.get(4))) + " 0:0:0' and '" + FormatData.parseDateToTringYYYYMMDD(FormatData.parseStringToDateTypeDDMMYYYY(lstPar.get(5))) + " 23:59:59' ");
			}
			
			if(lstPar.size()>=5 && Validator.isNotNull(lstPar.get(4)))
				query.append(" and c.NGAYGUIHOSO between '" + FormatData.parseDateToTringYYYYMMDD(FormatData.parseStringToDateTypeDDMMYYYY(lstPar.get(4))) + " 0:0:0' and '" + FormatData.parseDateToTringYYYYMMDD(FormatData.parseStringToDateTypeDDMMYYYY(lstPar.get(4))) + " 23:59:59' ");
			if(lstPar.size()>=6 && Validator.isNotNull(lstPar.get(5)))
				query.append(" and c.NGAYGUIHOSO between '" + FormatData.parseDateToTringYYYYMMDD(FormatData.parseStringToDateTypeDDMMYYYY(lstPar.get(5))) + " 0:0:0' and '" + FormatData.parseDateToTringYYYYMMDD(FormatData.parseStringToDateTypeDDMMYYYY(lstPar.get(5))) + " 23:59:59' ");
			
			
			if(lstPar.size()>=7 && Validator.isNotNull(lstPar.get(6)))
				query.append(" and EXTRACT(YEAR FROM c.NGAYGUIHOSO) = ").append(lstPar.get(6));
		
			if(lstPar.size()>=8 && Validator.isNotNull(lstPar.get(7))){
//				if(lstPar.get(1).equalsIgnoreCase("2")){
					query.append(" AND ( ");
					query.append(" c.MABIENNHAN like ").append("'%" + lstPar.get(7).trim() + "%'");
//				} else {
					query.append(" OR c.MASOHOSO like  ").append("'%" + lstPar.get(7).trim() + "%'");
//				}
					query.append(" ) ");
			}
			if(lstPar.size()>=9  && Validator.isNotNull(lstPar.get(8)))query.append(" and c.TENCHUHOSO like '%").append(lstPar.get(8)).append("%'");
//			if(lstPar.size() >=10 && Validator.isNotNull(lstPar.get(9))){
//				String sql = " and (a.nguoixuly = " + lstPar.get(9) + " or a.nguoixuly = 0 or a.nguoixuly is null )";
//				query.append(sql);
//			}

			query.append(" order by c.NGAYGUIHOSO desc ");
			log.info("====findMotCuaPhieuXuLy_NEW=======" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("MotCuaPhieuXuLy", MotCuaPhieuXuLyImpl.class);
			q.setCacheable(false);

			return (List<MotCuaPhieuXuLy>) QueryUtil.list(q, getDialect(),
					start, end);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return new ArrayList<MotCuaPhieuXuLy>();
	}
	
	public int countMotCuaPhieuXuLy_NEW(List<String> lstPar) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("select  COUNT(*) as total from motcua_phieuxuly a left join tthc_phannhomhoso b on a.PHANNHOMHOSOID = b.ID left JOIN tthc_hosothutuc c on a.HOSOTHUTUCID = c.ID where 1 =1  ");
			//to chuc quan ly----0
			//phan nhom ho so id----1
			//nhom thu tuc ---- 2
			//ten thu tuc hanh chinh ---- 3
			//ngay nop ---- 4
			//den ngay ---- 5
			//nam ---- 6
			//ma so ho so ---- 7
			//doanh nghiep LIKE ---- 8	
			//ma phan nhom ho so ---- 9
			//nguoi xu ly -----10
			if(lstPar.size()>=1 && Validator.isNotNull(lstPar.get(0)))
				query.append(" and c.TOCHUCQUANLY = ").append(lstPar.get(0));
			if(lstPar.size()>=2 && Validator.isNotNull(lstPar.get(1))  && !lstPar.get(1).equals("11"))
				query.append(" and a.PHANNHOMHOSOID = ").append(lstPar.get(1));
			if(lstPar.size()>=3 && Validator.isNotNull(lstPar.get(2)))
				query.append(" and a.QUYTRINHTHUTUCID = ").append(lstPar.get(2));
			if(lstPar.size()>=4 && Validator.isNotNull(lstPar.get(3)))
				query.append(" and c.THUTUCHANHCHINHID = ").append(lstPar.get(3));
		
			if(lstPar.size()>=6 && Validator.isNotNull(lstPar.get(4)) && Validator.isNotNull(lstPar.get(5))) {
				query.append(" and c.NGAYGUIHOSO between '" + FormatData.parseDateToTringYYYYMMDD(FormatData.parseStringToDateTypeDDMMYYYY(lstPar.get(4))) + " 0:0:0' and '" + FormatData.parseDateToTringYYYYMMDD(FormatData.parseStringToDateTypeDDMMYYYY(lstPar.get(5))) + " 23:59:59' ");
			}
			
			if(lstPar.size()>=5 && Validator.isNotNull(lstPar.get(4)))
				query.append(" and c.NGAYGUIHOSO between '" + FormatData.parseDateToTringYYYYMMDD(FormatData.parseStringToDateTypeDDMMYYYY(lstPar.get(4))) + " 0:0:0' and '" + FormatData.parseDateToTringYYYYMMDD(FormatData.parseStringToDateTypeDDMMYYYY(lstPar.get(4))) + " 23:59:59' ");
			if(lstPar.size()>=6 && Validator.isNotNull(lstPar.get(5)))
				query.append(" and c.NGAYGUIHOSO between '" + FormatData.parseDateToTringYYYYMMDD(FormatData.parseStringToDateTypeDDMMYYYY(lstPar.get(5))) + " 0:0:0' and '" + FormatData.parseDateToTringYYYYMMDD(FormatData.parseStringToDateTypeDDMMYYYY(lstPar.get(5))) + " 23:59:59' ");
			
			
			if(lstPar.size()>=7 && Validator.isNotNull(lstPar.get(6)))
				query.append(" and EXTRACT(YEAR FROM c.NGAYGUIHOSO) = ").append(lstPar.get(6));
		
			if(lstPar.size()>=8 && Validator.isNotNull(lstPar.get(7))){
//				if(lstPar.get(1).equalsIgnoreCase("2")){
					query.append(" AND ( ");
					query.append(" c.MABIENNHAN like ").append("'%" + lstPar.get(7).trim() + "%'");
//				} else {
					query.append(" OR c.MASOHOSO like  ").append("'%" + lstPar.get(7).trim() + "%'");
//				}
					query.append(" ) ");
			}
			if(lstPar.size()>=9  && Validator.isNotNull(lstPar.get(8)))query.append(" and c.TENCHUHOSO like '%").append(lstPar.get(8)).append("%'");
//			if(lstPar.size() >=10 && Validator.isNotNull(lstPar.get(9))){
//				String sql = " and (a.nguoixuly = " + lstPar.get(9) + " or a.nguoixuly = 0 or a.nguoixuly is null )";
//				query.append(sql);
//			}

			log.info("=============countMotCuaPhieuXuLy_NEW=========="
					+ query.toString());
					
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
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return 0;
	}
//
//	public int countMotCuaPhieuXuLy_NEW(List<String> lstCount) {
//		Session session = null;
//		try {
//			session = openSession();
//
//			StringBuilder query = new StringBuilder();
//			query.append("select COUNT(*) as total from motcua_phieuxuly a left join tthc_phannhomhoso b on a.PHANNHOMHOSOID = b.ID left JOIN tthc_hosothutuc c on a.HOSOTHUTUCID = c.ID where 1 =1 ");
//
//					//to chuc quan ly----0
//					//phan nhom ho so id----1
//					//nhom thu tuc ---- 2
//					//ten thu tuc hanh chinh ---- 3
//					//ngay nop ---- 4
//					//den ngay ---- 5
//					//nam ---- 6
//					//ma so ho so ---- 7
//					//doanh nghiep LIKE ---- 8	
//					//ma phan nhom ho so ---- 9
//					// nguoi xu ly -----10
////					log.info(lstCount.get(0)+"//"+(lstCount.size()==1 && Validator.isNotNull(lstCount.get(0))));
////					log.info(lstCount.get(1)+"//"+(lstCount.size()==1 && Validator.isNotNull(lstCount.get(1))));
////					log.info(lstCount.get(2)+"//"+(lstCount.size()==1 && Validator.isNotNull(lstCount.get(2))));
////					log.info(lstCount.get(3)+"//"+(lstCount.size()==1 && Validator.isNotNull(lstCount.get(3))));
////					log.info(lstCount.get(4)+"//"+(lstCount.size()==1 && Validator.isNotNull(lstCount.get(4))));
////					log.info(lstCount.get(5)+"//"+(lstCount.size()==1 && Validator.isNotNull(lstCount.get(5))));
////					log.info(lstCount.get(6)+"//"+(lstCount.size()==1 && Validator.isNotNull(lstCount.get(6))));
////					log.info(lstCount.get(7)+"//"+(lstCount.size()==1 && Validator.isNotNull(lstCount.get(7))));
////					log.info(lstCount.get(8)+"//"+(lstCount.size()==1 && Validator.isNotNull(lstCount.get(8))));
////					log.info(lstCount.get(9)+"//"+(lstCount.size()==1 && Validator.isNotNull(lstCount.get(9))));
//					if(lstCount.size()>=1 && Validator.isNotNull(lstCount.get(0)))query.append(" and c.TOCHUCQUANLY = ").append(lstCount.get(0));
//					if(lstCount.size()>=2 && Validator.isNotNull(lstCount.get(1)))query.append(" and a.PHANNHOMHOSOID = ").append(lstCount.get(1));
//					if(lstCount.size()>=3 && Validator.isNotNull(lstCount.get(2)))query.append(" and a.QUYTRINHTHUTUCID = ").append(lstCount.get(2));
//					if(lstCount.size()>=4 && Validator.isNotNull(lstCount.get(3)))query.append(" and c.THUTUCHANHCHINHID = ").append(lstCount.get(3));
//					if(lstCount.size()>=5 && Validator.isNotNull(lstCount.get(4)))query.append(" and STR_TO_DATE(c.NGAYGUIHOSO , '%m/%d/%Y') = ").append(lstCount.get(4));
//					if(lstCount.size()>=6 && Validator.isNotNull(lstCount.get(5)))query.append(" and STR_TO_DATE(c.NGAYHENTRA, '%m/%d/%Y') = ").append(lstCount.get(5));
//					if(lstCount.size()>=7 && Validator.isNotNull(lstCount.get(6)))query.append(" and STR_TO_DATE(c.NGAYHENTRA, '%m/%d/%Y') = ").append(lstCount.get(6));
//					if(lstCount.size()>=8 && Validator.isNotNull(lstCount.get(7))){
////						if(lstPar.get(1).equalsIgnoreCase("2")){
//							query.append(" AND ( ");
//							query.append(" c.MABIENNHAN like ").append("'%" + lstCount.get(7).trim() + "%'");
////						} else {
//							query.append(" OR c.MASOHOSO like  ").append("'%" + lstCount.get(7).trim() + "%'");
////						}
//							query.append(" ) ");
//					}
//					if(lstCount.size()>=9  && Validator.isNotNull(lstCount.get(8)))query.append(" and c.TENCHUHOSO = ").append(lstCount.get(8));
////					if(lstCount.size() >=10 && Validator.isNotNull(lstCount.get(9))){
////						String sql = " and (a.nguoixuly = " + lstCount.get(9) + " or a.nguoixuly = 0 or a.nguoixuly is null )";
////						query.append(sql);
////						}
//
//			log.info("=============countMotCuaPhieuXuLy=========="
//					+ query.toString());
//
//			SQLQuery q = session.createSQLQuery(query.toString());
//			q.addScalar("total", Type.LONG);
//			q.setCacheable(false);
//
//			Iterator<Long> itr = q.list().iterator();
//
//			if (itr.hasNext()) {
//				Long count = itr.next();
//				if (count != null) {
//					return count.intValue();
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			closeSession(session);
//		}
//
//		return 0;
//	}
}
