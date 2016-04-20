package vn.dtt.duongbo.dao.thanhtoan.service.persistence;


import java.util.ArrayList;
import java.util.List;

import vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay;
import vn.dtt.duongbo.dao.thanhtoan.model.impl.ThanhToanKeyPayImpl;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class ThanhToanKeyPayFinderImpl extends BasePersistenceImpl<ThanhToanKeyPay> implements ThanhToanKeyPayFinder {

	private Log _log = LogFactoryUtil.getLog(ThanhToanKeyPayFinderImpl.class);
	
	public List<ThanhToanKeyPay> findByGoodCode(String goodCode) {
		Session session = null;
		try {
			if (goodCode != null && goodCode.trim().length() > 0) {
				session = openSession();
				StringBuilder query = new StringBuilder();

				query.append("SELECT * FROM log_thanhtoankeypay WHERE goodcode = '" + goodCode.trim() + "'");
				String sql = query.toString();
				_log.debug("=========ThanhToanKeyPayFinderImpl========" + sql);
				SQLQuery q = session.createSQLQuery(sql);
				q.setCacheable(false);
				q.addEntity("ThanhToanKeyPay",ThanhToanKeyPayImpl.class);

				return (List<ThanhToanKeyPay>) QueryUtil.list(q, getDialect(),  0, 100);
			}
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<ThanhToanKeyPay>();
	}
	
	public ThanhToanKeyPay findByGoodCodeAndMerchantCodeAndMerchantTransIdAndLoaiMessage(String goodCode, String merchantCode, String merchantTransId, int loaiMessage) {
		Session session = null;
		List<ThanhToanKeyPay> allThanhToanKeyPay = null;
		try {
				session = openSession();
				StringBuilder query = new StringBuilder();

				query.append("SELECT * FROM log_thanhtoankeypay WHERE 1 = 1 "); 
				
				if (goodCode != null && goodCode.trim().length() > 0) {
					query.append(" and goodcode = '" + goodCode.trim() + "'");
				}
				if (merchantCode != null && merchantCode.trim().length() > 0) {
					query.append(" and merchantCode = '" + merchantCode.trim() + "'");
				}
				if (merchantTransId != null && merchantTransId.trim().length() > 0) {
					query.append(" and merchantTransId = '" + merchantTransId.trim() + "'");
				}
				if (loaiMessage > 0) {
					query.append(" and loaiMessage = " + loaiMessage);
				}
				String sql = query.toString();
				_log.debug("=========ThanhToanKeyPayFinderImpl========" + sql);
				SQLQuery q = session.createSQLQuery(sql);
				q.setCacheable(false);
				q.addEntity("ThanhToanKeyPay",ThanhToanKeyPayImpl.class);

				allThanhToanKeyPay = (List<ThanhToanKeyPay>) QueryUtil.list(q, getDialect(),  0, 100);
				if(allThanhToanKeyPay != null && allThanhToanKeyPay.size() > 0){
					return allThanhToanKeyPay.get(0);
				}
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return null;
	}
}
