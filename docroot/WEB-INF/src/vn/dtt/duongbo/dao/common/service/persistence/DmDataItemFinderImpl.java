package vn.dtt.duongbo.dao.common.service.persistence;
import java.util.ArrayList;
import java.util.List;

import vn.dtt.duongbo.dao.common.model.DmDataItem;
import vn.dtt.duongbo.dao.common.model.impl.DmDataItemImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;


public class DmDataItemFinderImpl extends BasePersistenceImpl<DmDataItem> implements DmDataItemFinder {
	
	private Log log = LogFactoryUtil.getLog(DmDataItemFinderImpl.class);
	
	public List<DmDataItem> findByGroupCodeIdTTHC(String dmDataGroupCode, String idTTHC) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT item.* FROM dm_dataitem item  left join tthc_donvithuchien dvth on item.code = dvth.MADONVI inner join dm_datagroup goup on item.datagroupid = goup.id where goup.code = ? and dvth.THUTUCHANHCHINHID = ? ");
		//	query.append("ORDER BY CONVERT('name' USING utf8) COLLATE utf8_polish_ci");
			query.append("ORDER BY item.name");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DmDataItem", DmDataItemImpl.class);
			
			log.info("=========findByDmDataGroupCode===" + query.toString() );
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(dmDataGroupCode);
			qPos.add(idTTHC);
			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		
		return null;
	}
	
	public List<DmDataItem> findByGroupCode(String dmDataGroupCode) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT item.* FROM dm_dataitem item inner join dm_datagroup goup on item.datagroupid = goup.id where goup.code = ? ");
			query.append(" AND item.status = 1 ");
			query.append(" ORDER BY item.order_, item.name ");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DmDataItem", DmDataItemImpl.class);
			
			log.debug("=========findByDmDataGroupCode===" + query.toString() );
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(dmDataGroupCode);
			
			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		
		return null;
	}
	
	public List<DmDataItem> findByGroupCodeAndNode1(String dmDataGroupCode, String node_1) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT item.* FROM dm_dataitem item inner join dm_datagroup goup on item.datagroupid = goup.id where ");
			query.append("goup.code = ? and ");
			query.append("item.node_1 like ?");
			
			query.append("ORDER BY CONVERT('name' USING utf8) COLLATE utf8_polish_ci");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DmDataItem", DmDataItemImpl.class);
			
			log.debug("=========findByDmDataGroupCode===" + query.toString() );
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(dmDataGroupCode);
			qPos.add("%" + node_1 + "%");
			
			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		
		return null;
	}
	
	public List<DmDataItem> findByArrayId(String arrayId) {
		Session session = null;
		try {
			session = openSession();
			if (arrayId != null && arrayId.length() > 0) {
				StringBuilder query = new StringBuilder();
				query.append("SELECT item.* FROM dm_dataitem item where item.id in (" + arrayId + ") ");
				
				
				query.append("ORDER BY CONVERT('name' USING utf8) COLLATE utf8_polish_ci");
				
				SQLQuery q = session.createSQLQuery(query.toString());
				q.setCacheable(false);
				q.addEntity("DmDataItem", DmDataItemImpl.class);
				
				log.debug("=========findByArrayId===" + query.toString() );
				
				QueryPos qPos = QueryPos.getInstance(q);
//				qPos.add(arrayId);
				
				return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	public List<DmDataItem> findByArrayCode(String arrayCode) {
		Session session = null;
		try {
			session = openSession();
			if (arrayCode != null && arrayCode.length() > 0) {
				StringBuilder query = new StringBuilder();
				query.append("SELECT item.* FROM dm_dataitem item where item.code in (" + arrayCode + ") ");
				
				query.append("ORDER BY CONVERT('name' USING utf8) COLLATE utf8_polish_ci");
				
				SQLQuery q = session.createSQLQuery(query.toString());
				q.setCacheable(false);
				q.addEntity("DmDataItem", DmDataItemImpl.class);
				
				log.debug("=========findByArrayCode===" + query.toString() );
				
				QueryPos qPos = QueryPos.getInstance(q);
//				qPos.add(arrayId);
				
				return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	public List<DmDataItem> findByGroupId(long dataGroupId) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT item.* FROM dm_dataitem item inner join dm_datagroup goup on item.datagroupid = goup.id where goup.id = ? ");
			
			query.append("ORDER BY item.order_, item.name");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DmDataItem", DmDataItemImpl.class);
			
			log.debug("=========findByDmDataGroupCode===" + query.toString() );
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(dataGroupId);
			
			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		
		return null;
	}
	
	public List<DmDataItem> findByGroupIdAndChaCode(long dataGroupId, String chaCode) {
			Session session = null;
			try {
				session = openSession();
				StringBuilder query = new StringBuilder();
				query.append("SELECT item.* FROM dm_dataitem item inner join dm_datagroup goup on item.datagroupid = goup.id where goup.id = " + dataGroupId);
				if (Validator.isNotNull(chaCode) && chaCode.trim().length() > 0) {
					query.append(" AND item.node_1 = '" + chaCode.trim() + "'");
				} else {
					query.append(" AND (item.node_1 is null or item.node_1 = '')");
				}
				
				query.append("ORDER BY CONVERT('name' USING utf8) COLLATE utf8_polish_ci");
				
//				log.info("===findByGroupIdAndChaCode===" + query.toString());
				
				SQLQuery q = session.createSQLQuery(query.toString());
				q.setCacheable(false);
				q.addEntity("DmDataItem", DmDataItemImpl.class);
				
				return (List<DmDataItem>) QueryUtil.list(q, getDialect(),  QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				closeSession(session);
			}
			return null;
		}
	
	public List<DmDataItem> findTinhThanh() {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT item.* FROM dm_dataitem item inner join dm_datagroup goup on item.datagroupid = goup.id where ");
			query.append("goup.code = 'DM_DVHC' and item.level = 1");
//			query.append(" and NODE_1 is not null");
//			query.append(" and ((NODE_2 is null) or (NODE_2 is not null and (trim(NODE_2) = '')))");
//			query.append(" and ((NODE_3 is null) or (NODE_3 is not null and (trim(NODE_3) = '')))");
//			query.append(" and ((NODE_4 is null) or (NODE_4 is not null and (trim(NODE_4) = '')))");
		//	query.append(" ORDER BY CONVERT('name' USING utf8) COLLATE utf8_polish_ci");
			
			query.append(" ORDER BY item.name");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DmDataItem", DmDataItemImpl.class);
			
			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		
		return null;
	}
	
	public List<DmDataItem> findQuanHuyenByMaTinhThanh(String maTinhThanh) {
		Session session = null;
		try {
			if(maTinhThanh != null && maTinhThanh.trim().length() > 0){
				session = openSession();
				StringBuilder query = new StringBuilder();
//				query.append("SELECT * FROM dm_dataitem where datagroupid in ");
//				query.append(" (SELECT id FROM dm_datagroup where code = '1')");
				query.append("SELECT item.* FROM dm_dataitem item inner join dm_datagroup goup on item.datagroupid = goup.id where goup.code = 'DM_DVHC' ");
				query.append(" and NODE_1 ='" + maTinhThanh.trim() + "'");
				query.append(" and NODE_2 is not null");
				query.append(" and ((NODE_3 is null) or (NODE_3 is not null and (trim(NODE_3) = '')))");
				query.append(" and ((NODE_4 is null) or (NODE_4 is not null and (trim(NODE_4) = '')))");
				
				query.append(" ORDER BY CONVERT('name' USING utf8) COLLATE utf8_polish_ci");
				
				SQLQuery q = session.createSQLQuery(query.toString());
				q.setCacheable(false);
				q.addEntity("DmDataItem", DmDataItemImpl.class);
				
				log.info("=========findQuanHuyenByMaTinhThanh===" + query.toString() );
				
				return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		
		return null;
	}
	
	public List<DmDataItem> findPhuongXaByMaTinhThanMaQuanHuyen(String maTinhThanh, String maQuanHuyen) {
		Session session = null;
		try {
			if((maTinhThanh != null && maTinhThanh.trim().length() > 0) && (maQuanHuyen != null && maQuanHuyen.trim().length() > 0)){
				session = openSession();
				StringBuilder query = new StringBuilder();
//				query.append("SELECT * FROM dm_dataitem where datagroupid in ");
//				query.append(" (SELECT id FROM dm_datagroup where code = '1')");
				query.append("SELECT item.* FROM dm_dataitem item inner join dm_datagroup goup on item.datagroupid = goup.id where goup.code = 'DM_DVHC' ");
				query.append(" and NODE_1 ='" + maTinhThanh.trim() + "'");
				query.append(" and NODE_2 ='" + maQuanHuyen.trim() + "'");
				query.append(" and NODE_3 is not null");
				query.append(" and ((NODE_4 is null) or (NODE_4 is not null and (trim(NODE_4) = '')))");
				
				query.append(" ORDER BY CONVERT('name' USING utf8) COLLATE utf8_polish_ci");
				
				SQLQuery q = session.createSQLQuery(query.toString());
				q.setCacheable(false);
				q.addEntity("DmDataItem", DmDataItemImpl.class);
				
				log.info("=========findPhuongXaByMaTinhThanMaQuanHuyen===" + query.toString() );
				
				return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		
		return null;
	}
	
	public List<DmDataItem> findByGroupCodeAndLevel(String groupCode, int level) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT item.* FROM dm_dataitem item inner join dm_datagroup goup on item.datagroupid = goup.id where ");
			query.append("goup.code = ? and ");
			query.append("item.level = ? ");
			
			query.append("ORDER BY CONVERT('name' USING utf8) COLLATE utf8_polish_ci");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DmDataItem", DmDataItemImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(groupCode);
			qPos.add(level);

			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<DmDataItem>();
	}
	
//	public List<DmDataItem> findByDataGroupCodeNameAndDataItemAlterName(String groupCode, String alterName) {
//		Session session = null;
//		try {
//			session = openSession();
//			StringBuilder query = new StringBuilder();
//			query.append("SELECT * FROM dm_dataitem d where altername = ? and datagroupid in (SELECT id FROM dm_datagroup where code = ?) ");
//			query.append(" ORDER BY CONVERT('name' USING utf8) COLLATE utf8_polish_ci");
//			
//			query.append("SELECT item.* FROM dm_dataitem item inner join dm_datagroup goup on item.datagroupid = goup.id where ");
//			query.append("goup.code = ? and ");
//			query.append("level = ? ");
//			query.append(" ORDER BY CONVERT('name' USING utf8) COLLATE utf8_polish_ci");
//			
//			SQLQuery q = session.createSQLQuery(query.toString());
//			q.setCacheable(false);
//			q.addEntity("DmDataItem", DmDataItemImpl.class);
//			
//			QueryPos qPos = QueryPos.getInstance(q);
//			qPos.add(alterName);
//			qPos.add(groupName);
//			
//			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			closeSession(session);
//		}
//		
//		return new ArrayList<DmDataItem>();
//	}
	

	
	public List<DmDataItem> findByGroupIdAndLevel(long groupId, int level) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
//			query.append("SELECT * FROM dm_dataitem d where datagroupid = ? and Level = ? ");
			query.append("SELECT item.* FROM dm_dataitem item inner join dm_datagroup goup on item.datagroupid = goup.id where ");
			query.append("goup.id = ? and ");
			query.append("item.Level = ? ");
			
			query.append("ORDER BY CONVERT('name' USING utf8) COLLATE utf8_polish_ci");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DmDataItem", DmDataItemImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(groupId);
			qPos.add(level);

			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<DmDataItem>();
	}
	
	public List<DmDataItem> findByGroupCodeAndItemCode0(String groupCode, String code_0) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
//			query.append("SELECT * FROM dm_dataitem d where code = ? and datagroupid in (SELECT id FROM dm_datagroup where code = ?) ");
			query.append("SELECT item.* FROM dm_dataitem item inner join dm_datagroup goup on item.datagroupid = goup.id where ");
			query.append("goup.code = ? and ");
			query.append("item.code_0 = ? ");
			
			query.append(" ORDER BY CONVERT('name' USING utf8) COLLATE utf8_polish_ci");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DmDataItem", DmDataItemImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(groupCode);
			qPos.add(code_0);
			
			
			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<DmDataItem>();
	}

	
	
	
	public DmDataItem findByGroupIdAndItemCode(long groupId, String code) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
//			query.append("SELECT * FROM dm_dataitem d where code = ? and datagroupid in (SELECT id FROM dm_datagroup where id = ?) ");
			
			query.append("SELECT item.* FROM dm_dataitem item inner join dm_datagroup goup on item.datagroupid = goup.id where ");
			query.append("item.code = ? and ");
			query.append("goup.id = ? ");
			
			query.append("ORDER BY CONVERT('name' USING utf8) COLLATE utf8_polish_ci");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DmDataItem", DmDataItemImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(code);
			qPos.add(groupId);
			
			log.debug("=========findByDataGroupIdAndDataItemCode===" + query.toString() );
			List<DmDataItem> lst = (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			if (lst != null && lst.size() > 0) {
				return lst.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		
		return null;
	}
	
	public DmDataItem getByGroupCodeAndItemCode0(String groupCode, String code) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
//			query.append("SELECT * FROM dm_dataitem d where code = ? and datagroupid in (SELECT id FROM dm_datagroup where code = ?) ");
			query.append("SELECT item.* FROM dm_dataitem item inner join dm_datagroup goup on item.datagroupid = goup.id where ");
			query.append("goup.code = ? and ");
			query.append("item.code = ? ");
			
			query.append(" ORDER BY CONVERT('name' USING utf8) COLLATE utf8_polish_ci");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DmDataItem", DmDataItemImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(groupCode);
			qPos.add(code);
			
			List<DmDataItem> lst = (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			if (lst != null && lst.size() > 0) {
				return lst.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		
		return null;
	}
	
//	public DmDataItem getByDmDataGroupCodeNameAndCode0AndLevel(String dmDataGroupCodeName, String code_0, int level) {
//		Session session = null;
//		try {
//			session = openSession();
//			StringBuilder query = new StringBuilder();
//			query.append("SELECT * FROM dm_dataitem d ");
//			query.append("where code = ? and level = ? and datagroupid in (SELECT id FROM dm_datagroup where code = ?) ");
//			query.append(" ORDER BY CONVERT('name' USING utf8) COLLATE utf8_polish_ci");
//			SQLQuery q = session.createSQLQuery(query.toString());
//			q.setCacheable(false);
//			q.addEntity("DmDataItem", DmDataItemImpl.class);
//			
//			QueryPos qPos = QueryPos.getInstance(q);
//			qPos.add(code_0);
//			qPos.add(level);
//			qPos.add(dmDataGroupCodeName);
//			
//			List<DmDataItem> lst = (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
//			if (lst != null && lst.size() > 0) {
//				return lst.get(0);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			closeSession(session);
//		}
//		return null;
//	}

}
