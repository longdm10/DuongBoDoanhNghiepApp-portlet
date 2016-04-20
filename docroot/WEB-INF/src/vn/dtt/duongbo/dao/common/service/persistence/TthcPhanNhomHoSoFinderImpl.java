
package vn.dtt.duongbo.dao.common.service.persistence;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo;
import vn.dtt.duongbo.dao.common.model.impl.TthcPhanNhomHoSoImpl;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class TthcPhanNhomHoSoFinderImpl extends BasePersistenceImpl<TthcPhanNhomHoSo> implements TthcPhanNhomHoSoFinder {
	
	private Log _log = LogFactoryUtil.getLog(TthcPhanNhomHoSoFinderImpl.class);
	
	public List<TthcPhanNhomHoSo> findTthcPhanNhomHoSoByVaTroXuLy(String vaiTroXuLy) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM tthc_phannhomhoso where id in (SELECT phannhomhosoid FROM tthc_phannhomhoso_vaitro where vaitroxuly in (" +
				vaiTroXuLy + ") ) ORDER BY sothutu ASC ");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("TthcPhanNhomHoSo", TthcPhanNhomHoSoImpl.class);
//			System.out.println("=========findTthcPhanNhomHoSoByVaTroXuLy===" + query.toString());
			
			return (List<TthcPhanNhomHoSo>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return new ArrayList<TthcPhanNhomHoSo>();
	}
	
	public List<TthcPhanNhomHoSo> findTthcPhanNhomHoSoByVaTroXuLy(String vaiTroXuLy, int loaiPhanNhom) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			if (vaiTroXuLy != null && vaiTroXuLy.trim().length() > 0) {
				query.append("SELECT * FROM tthc_phannhomhoso where LOAIPHANNHOM = " + loaiPhanNhom + " and id in (SELECT phannhomhosoid FROM tthc_phannhomhoso_vaitro where vaitroxuly in (" +
						vaiTroXuLy + ") ) ORDER BY sothutu ASC ");
			} else {
				query.append("SELECT * FROM tthc_phannhomhoso where LOAIPHANNHOM = " + loaiPhanNhom + " ORDER BY sothutu ASC ");
			}
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("TthcPhanNhomHoSo", TthcPhanNhomHoSoImpl.class);
			
			return (List<TthcPhanNhomHoSo>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return new ArrayList<TthcPhanNhomHoSo>();
	}
	
	public List<TthcPhanNhomHoSo> findByDoanhNghiep() {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT * FROM tthc_phannhomhoso where MAPHANNHOM like 'DN%' order by SOTHUTU");
			
			_log.info(query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("TthcPhanNhomHoSo", TthcPhanNhomHoSoImpl.class);
			
			return (List<TthcPhanNhomHoSo>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			_log.error(e);
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return new ArrayList<TthcPhanNhomHoSo>();
	}
}
