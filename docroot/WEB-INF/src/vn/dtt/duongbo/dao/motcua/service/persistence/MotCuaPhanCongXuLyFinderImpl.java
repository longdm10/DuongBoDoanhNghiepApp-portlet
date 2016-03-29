package vn.dtt.duongbo.dao.motcua.service.persistence;

import vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy;
import vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhanCongXuLyImpl;

import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class MotCuaPhanCongXuLyFinderImpl extends BasePersistenceImpl<MotCuaPhanCongXuLy> implements MotCuaPhanCongXuLyFinder {

	private Log log = LogFactoryUtil.getLog(MotCuaPhanCongXuLyFinderImpl.class);

	public MotCuaPhanCongXuLy findMotCuaPhanCongXuLyByPhieuXuLyId(long idPhieuXuLy) {
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			query.append("SELECT * FROM motcua_phancongxuly where PHIEUXULYID='"+idPhieuXuLy+"' order by ngayphancong DESC LIMIT 1");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("MotCuaPhanCongXuLy", MotCuaPhanCongXuLyImpl.class);
			log.debug("query========findMotCuaPhanCongXuLyByPhieuXuLyId"+query);
			return (MotCuaPhanCongXuLy)q.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	public int updateMotCuaPhanCongXuLy(long idNguoiPhanCong, long idNguoiDuocUyQuyen) {
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			query.append("update motcua_phancongxuly set nguoiduocuyquyen = " + idNguoiDuocUyQuyen + " where nguoiphancong = " + idNguoiPhanCong);
			SQLQuery q = session.createSQLQuery(query.toString());
			log.debug("========updateMotCuaPhanCongXuLy============"+query.toString());
			return q.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return 0;
	}
}
