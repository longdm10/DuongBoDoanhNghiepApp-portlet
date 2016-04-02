/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.dtt.duongbien.dao.vrcb.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm history goods service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryGoodsPersistence
 * @see DmHistoryGoodsUtil
 * @generated
 */
public class DmHistoryGoodsPersistenceImpl extends BasePersistenceImpl<DmHistoryGoods>
	implements DmHistoryGoodsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistoryGoodsUtil} to access the dm history goods persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistoryGoodsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryGoodsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryGoodsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GOODSITEMCODE =
		new FinderPath(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryGoodsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByGoodsItemCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSITEMCODE =
		new FinderPath(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryGoodsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGoodsItemCode",
			new String[] { String.class.getName() },
			DmHistoryGoodsModelImpl.GOODSITEMCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GOODSITEMCODE = new FinderPath(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGoodsItemCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dm history goodses where goodsItemCode = &#63;.
	 *
	 * @param goodsItemCode the goods item code
	 * @return the matching dm history goodses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryGoods> findByGoodsItemCode(String goodsItemCode)
		throws SystemException {
		return findByGoodsItemCode(goodsItemCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history goodses where goodsItemCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param goodsItemCode the goods item code
	 * @param start the lower bound of the range of dm history goodses
	 * @param end the upper bound of the range of dm history goodses (not inclusive)
	 * @return the range of matching dm history goodses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryGoods> findByGoodsItemCode(String goodsItemCode,
		int start, int end) throws SystemException {
		return findByGoodsItemCode(goodsItemCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history goodses where goodsItemCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param goodsItemCode the goods item code
	 * @param start the lower bound of the range of dm history goodses
	 * @param end the upper bound of the range of dm history goodses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm history goodses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryGoods> findByGoodsItemCode(String goodsItemCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSITEMCODE;
			finderArgs = new Object[] { goodsItemCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GOODSITEMCODE;
			finderArgs = new Object[] {
					goodsItemCode,
					
					start, end, orderByComparator
				};
		}

		List<DmHistoryGoods> list = (List<DmHistoryGoods>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmHistoryGoods dmHistoryGoods : list) {
				if (!Validator.equals(goodsItemCode,
							dmHistoryGoods.getGoodsItemCode())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_DMHISTORYGOODS_WHERE);

			boolean bindGoodsItemCode = false;

			if (goodsItemCode == null) {
				query.append(_FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_1);
			}
			else if (goodsItemCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_3);
			}
			else {
				bindGoodsItemCode = true;

				query.append(_FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmHistoryGoodsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindGoodsItemCode) {
					qPos.add(goodsItemCode);
				}

				if (!pagination) {
					list = (List<DmHistoryGoods>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryGoods>(list);
				}
				else {
					list = (List<DmHistoryGoods>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first dm history goods in the ordered set where goodsItemCode = &#63;.
	 *
	 * @param goodsItemCode the goods item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history goods
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException if a matching dm history goods could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoods findByGoodsItemCode_First(String goodsItemCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryGoodsException, SystemException {
		DmHistoryGoods dmHistoryGoods = fetchByGoodsItemCode_First(goodsItemCode,
				orderByComparator);

		if (dmHistoryGoods != null) {
			return dmHistoryGoods;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("goodsItemCode=");
		msg.append(goodsItemCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryGoodsException(msg.toString());
	}

	/**
	 * Returns the first dm history goods in the ordered set where goodsItemCode = &#63;.
	 *
	 * @param goodsItemCode the goods item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history goods, or <code>null</code> if a matching dm history goods could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoods fetchByGoodsItemCode_First(String goodsItemCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmHistoryGoods> list = findByGoodsItemCode(goodsItemCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm history goods in the ordered set where goodsItemCode = &#63;.
	 *
	 * @param goodsItemCode the goods item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history goods
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException if a matching dm history goods could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoods findByGoodsItemCode_Last(String goodsItemCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryGoodsException, SystemException {
		DmHistoryGoods dmHistoryGoods = fetchByGoodsItemCode_Last(goodsItemCode,
				orderByComparator);

		if (dmHistoryGoods != null) {
			return dmHistoryGoods;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("goodsItemCode=");
		msg.append(goodsItemCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryGoodsException(msg.toString());
	}

	/**
	 * Returns the last dm history goods in the ordered set where goodsItemCode = &#63;.
	 *
	 * @param goodsItemCode the goods item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history goods, or <code>null</code> if a matching dm history goods could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoods fetchByGoodsItemCode_Last(String goodsItemCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGoodsItemCode(goodsItemCode);

		if (count == 0) {
			return null;
		}

		List<DmHistoryGoods> list = findByGoodsItemCode(goodsItemCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm history goodses before and after the current dm history goods in the ordered set where goodsItemCode = &#63;.
	 *
	 * @param id the primary key of the current dm history goods
	 * @param goodsItemCode the goods item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm history goods
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException if a dm history goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoods[] findByGoodsItemCode_PrevAndNext(int id,
		String goodsItemCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryGoodsException, SystemException {
		DmHistoryGoods dmHistoryGoods = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmHistoryGoods[] array = new DmHistoryGoodsImpl[3];

			array[0] = getByGoodsItemCode_PrevAndNext(session, dmHistoryGoods,
					goodsItemCode, orderByComparator, true);

			array[1] = dmHistoryGoods;

			array[2] = getByGoodsItemCode_PrevAndNext(session, dmHistoryGoods,
					goodsItemCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmHistoryGoods getByGoodsItemCode_PrevAndNext(Session session,
		DmHistoryGoods dmHistoryGoods, String goodsItemCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMHISTORYGOODS_WHERE);

		boolean bindGoodsItemCode = false;

		if (goodsItemCode == null) {
			query.append(_FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_1);
		}
		else if (goodsItemCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_3);
		}
		else {
			bindGoodsItemCode = true;

			query.append(_FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(DmHistoryGoodsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindGoodsItemCode) {
			qPos.add(goodsItemCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmHistoryGoods);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmHistoryGoods> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm history goodses where goodsItemCode = &#63; from the database.
	 *
	 * @param goodsItemCode the goods item code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGoodsItemCode(String goodsItemCode)
		throws SystemException {
		for (DmHistoryGoods dmHistoryGoods : findByGoodsItemCode(
				goodsItemCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmHistoryGoods);
		}
	}

	/**
	 * Returns the number of dm history goodses where goodsItemCode = &#63;.
	 *
	 * @param goodsItemCode the goods item code
	 * @return the number of matching dm history goodses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGoodsItemCode(String goodsItemCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GOODSITEMCODE;

		Object[] finderArgs = new Object[] { goodsItemCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYGOODS_WHERE);

			boolean bindGoodsItemCode = false;

			if (goodsItemCode == null) {
				query.append(_FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_1);
			}
			else if (goodsItemCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_3);
			}
			else {
				bindGoodsItemCode = true;

				query.append(_FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindGoodsItemCode) {
					qPos.add(goodsItemCode);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_1 = "dmHistoryGoods.goodsItemCode IS NULL";
	private static final String _FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_2 = "dmHistoryGoods.goodsItemCode = ?";
	private static final String _FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_3 = "(dmHistoryGoods.goodsItemCode IS NULL OR dmHistoryGoods.goodsItemCode = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_GOODSITEMCODEANDSYNCVERSION =
		new FinderPath(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryGoodsImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByGoodsItemCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmHistoryGoodsModelImpl.GOODSITEMCODE_COLUMN_BITMASK |
			DmHistoryGoodsModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GOODSITEMCODEANDSYNCVERSION =
		new FinderPath(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByGoodsItemCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns the dm history goods where goodsItemCode = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException} if it could not be found.
	 *
	 * @param goodsItemCode the goods item code
	 * @param syncVersion the sync version
	 * @return the matching dm history goods
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException if a matching dm history goods could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoods findByGoodsItemCodeAndSyncVersion(
		String goodsItemCode, String syncVersion)
		throws NoSuchDmHistoryGoodsException, SystemException {
		DmHistoryGoods dmHistoryGoods = fetchByGoodsItemCodeAndSyncVersion(goodsItemCode,
				syncVersion);

		if (dmHistoryGoods == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("goodsItemCode=");
			msg.append(goodsItemCode);

			msg.append(", syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryGoodsException(msg.toString());
		}

		return dmHistoryGoods;
	}

	/**
	 * Returns the dm history goods where goodsItemCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param goodsItemCode the goods item code
	 * @param syncVersion the sync version
	 * @return the matching dm history goods, or <code>null</code> if a matching dm history goods could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoods fetchByGoodsItemCodeAndSyncVersion(
		String goodsItemCode, String syncVersion) throws SystemException {
		return fetchByGoodsItemCodeAndSyncVersion(goodsItemCode, syncVersion,
			true);
	}

	/**
	 * Returns the dm history goods where goodsItemCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param goodsItemCode the goods item code
	 * @param syncVersion the sync version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history goods, or <code>null</code> if a matching dm history goods could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoods fetchByGoodsItemCodeAndSyncVersion(
		String goodsItemCode, String syncVersion, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { goodsItemCode, syncVersion };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_GOODSITEMCODEANDSYNCVERSION,
					finderArgs, this);
		}

		if (result instanceof DmHistoryGoods) {
			DmHistoryGoods dmHistoryGoods = (DmHistoryGoods)result;

			if (!Validator.equals(goodsItemCode,
						dmHistoryGoods.getGoodsItemCode()) ||
					!Validator.equals(syncVersion,
						dmHistoryGoods.getSyncVersion())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMHISTORYGOODS_WHERE);

			boolean bindGoodsItemCode = false;

			if (goodsItemCode == null) {
				query.append(_FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_GOODSITEMCODE_1);
			}
			else if (goodsItemCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_GOODSITEMCODE_3);
			}
			else {
				bindGoodsItemCode = true;

				query.append(_FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_GOODSITEMCODE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindGoodsItemCode) {
					qPos.add(goodsItemCode);
				}

				if (bindSyncVersion) {
					qPos.add(syncVersion);
				}

				List<DmHistoryGoods> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODSITEMCODEANDSYNCVERSION,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmHistoryGoodsPersistenceImpl.fetchByGoodsItemCodeAndSyncVersion(String, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmHistoryGoods dmHistoryGoods = list.get(0);

					result = dmHistoryGoods;

					cacheResult(dmHistoryGoods);

					if ((dmHistoryGoods.getGoodsItemCode() == null) ||
							!dmHistoryGoods.getGoodsItemCode()
											   .equals(goodsItemCode) ||
							(dmHistoryGoods.getSyncVersion() == null) ||
							!dmHistoryGoods.getSyncVersion().equals(syncVersion)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODSITEMCODEANDSYNCVERSION,
							finderArgs, dmHistoryGoods);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GOODSITEMCODEANDSYNCVERSION,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (DmHistoryGoods)result;
		}
	}

	/**
	 * Removes the dm history goods where goodsItemCode = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param goodsItemCode the goods item code
	 * @param syncVersion the sync version
	 * @return the dm history goods that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoods removeByGoodsItemCodeAndSyncVersion(
		String goodsItemCode, String syncVersion)
		throws NoSuchDmHistoryGoodsException, SystemException {
		DmHistoryGoods dmHistoryGoods = findByGoodsItemCodeAndSyncVersion(goodsItemCode,
				syncVersion);

		return remove(dmHistoryGoods);
	}

	/**
	 * Returns the number of dm history goodses where goodsItemCode = &#63; and syncVersion = &#63;.
	 *
	 * @param goodsItemCode the goods item code
	 * @param syncVersion the sync version
	 * @return the number of matching dm history goodses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGoodsItemCodeAndSyncVersion(String goodsItemCode,
		String syncVersion) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GOODSITEMCODEANDSYNCVERSION;

		Object[] finderArgs = new Object[] { goodsItemCode, syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMHISTORYGOODS_WHERE);

			boolean bindGoodsItemCode = false;

			if (goodsItemCode == null) {
				query.append(_FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_GOODSITEMCODE_1);
			}
			else if (goodsItemCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_GOODSITEMCODE_3);
			}
			else {
				bindGoodsItemCode = true;

				query.append(_FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_GOODSITEMCODE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindGoodsItemCode) {
					qPos.add(goodsItemCode);
				}

				if (bindSyncVersion) {
					qPos.add(syncVersion);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_GOODSITEMCODE_1 =
		"dmHistoryGoods.goodsItemCode IS NULL AND ";
	private static final String _FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_GOODSITEMCODE_2 =
		"dmHistoryGoods.goodsItemCode = ? AND ";
	private static final String _FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_GOODSITEMCODE_3 =
		"(dmHistoryGoods.goodsItemCode IS NULL OR dmHistoryGoods.goodsItemCode = '') AND ";
	private static final String _FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_SYNCVERSION_1 =
		"dmHistoryGoods.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_SYNCVERSION_2 =
		"dmHistoryGoods.syncVersion = ?";
	private static final String _FINDER_COLUMN_GOODSITEMCODEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmHistoryGoods.syncVersion IS NULL OR dmHistoryGoods.syncVersion = '')";

	public DmHistoryGoodsPersistenceImpl() {
		setModelClass(DmHistoryGoods.class);
	}

	/**
	 * Caches the dm history goods in the entity cache if it is enabled.
	 *
	 * @param dmHistoryGoods the dm history goods
	 */
	@Override
	public void cacheResult(DmHistoryGoods dmHistoryGoods) {
		EntityCacheUtil.putResult(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsImpl.class, dmHistoryGoods.getPrimaryKey(),
			dmHistoryGoods);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODSITEMCODEANDSYNCVERSION,
			new Object[] {
				dmHistoryGoods.getGoodsItemCode(),
				dmHistoryGoods.getSyncVersion()
			}, dmHistoryGoods);

		dmHistoryGoods.resetOriginalValues();
	}

	/**
	 * Caches the dm history goodses in the entity cache if it is enabled.
	 *
	 * @param dmHistoryGoodses the dm history goodses
	 */
	@Override
	public void cacheResult(List<DmHistoryGoods> dmHistoryGoodses) {
		for (DmHistoryGoods dmHistoryGoods : dmHistoryGoodses) {
			if (EntityCacheUtil.getResult(
						DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryGoodsImpl.class, dmHistoryGoods.getPrimaryKey()) == null) {
				cacheResult(dmHistoryGoods);
			}
			else {
				dmHistoryGoods.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history goodses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistoryGoodsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistoryGoodsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history goods.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistoryGoods dmHistoryGoods) {
		EntityCacheUtil.removeResult(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsImpl.class, dmHistoryGoods.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmHistoryGoods);
	}

	@Override
	public void clearCache(List<DmHistoryGoods> dmHistoryGoodses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmHistoryGoods dmHistoryGoods : dmHistoryGoodses) {
			EntityCacheUtil.removeResult(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryGoodsImpl.class, dmHistoryGoods.getPrimaryKey());

			clearUniqueFindersCache(dmHistoryGoods);
		}
	}

	protected void cacheUniqueFindersCache(DmHistoryGoods dmHistoryGoods) {
		if (dmHistoryGoods.isNew()) {
			Object[] args = new Object[] {
					dmHistoryGoods.getGoodsItemCode(),
					dmHistoryGoods.getSyncVersion()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GOODSITEMCODEANDSYNCVERSION,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODSITEMCODEANDSYNCVERSION,
				args, dmHistoryGoods);
		}
		else {
			DmHistoryGoodsModelImpl dmHistoryGoodsModelImpl = (DmHistoryGoodsModelImpl)dmHistoryGoods;

			if ((dmHistoryGoodsModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_GOODSITEMCODEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryGoods.getGoodsItemCode(),
						dmHistoryGoods.getSyncVersion()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GOODSITEMCODEANDSYNCVERSION,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODSITEMCODEANDSYNCVERSION,
					args, dmHistoryGoods);
			}
		}
	}

	protected void clearUniqueFindersCache(DmHistoryGoods dmHistoryGoods) {
		DmHistoryGoodsModelImpl dmHistoryGoodsModelImpl = (DmHistoryGoodsModelImpl)dmHistoryGoods;

		Object[] args = new Object[] {
				dmHistoryGoods.getGoodsItemCode(),
				dmHistoryGoods.getSyncVersion()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GOODSITEMCODEANDSYNCVERSION,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GOODSITEMCODEANDSYNCVERSION,
			args);

		if ((dmHistoryGoodsModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_GOODSITEMCODEANDSYNCVERSION.getColumnBitmask()) != 0) {
			args = new Object[] {
					dmHistoryGoodsModelImpl.getOriginalGoodsItemCode(),
					dmHistoryGoodsModelImpl.getOriginalSyncVersion()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GOODSITEMCODEANDSYNCVERSION,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GOODSITEMCODEANDSYNCVERSION,
				args);
		}
	}

	/**
	 * Creates a new dm history goods with the primary key. Does not add the dm history goods to the database.
	 *
	 * @param id the primary key for the new dm history goods
	 * @return the new dm history goods
	 */
	@Override
	public DmHistoryGoods create(int id) {
		DmHistoryGoods dmHistoryGoods = new DmHistoryGoodsImpl();

		dmHistoryGoods.setNew(true);
		dmHistoryGoods.setPrimaryKey(id);

		return dmHistoryGoods;
	}

	/**
	 * Removes the dm history goods with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history goods
	 * @return the dm history goods that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException if a dm history goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoods remove(int id)
		throws NoSuchDmHistoryGoodsException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm history goods with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history goods
	 * @return the dm history goods that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException if a dm history goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoods remove(Serializable primaryKey)
		throws NoSuchDmHistoryGoodsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistoryGoods dmHistoryGoods = (DmHistoryGoods)session.get(DmHistoryGoodsImpl.class,
					primaryKey);

			if (dmHistoryGoods == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmHistoryGoodsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmHistoryGoods);
		}
		catch (NoSuchDmHistoryGoodsException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected DmHistoryGoods removeImpl(DmHistoryGoods dmHistoryGoods)
		throws SystemException {
		dmHistoryGoods = toUnwrappedModel(dmHistoryGoods);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmHistoryGoods)) {
				dmHistoryGoods = (DmHistoryGoods)session.get(DmHistoryGoodsImpl.class,
						dmHistoryGoods.getPrimaryKeyObj());
			}

			if (dmHistoryGoods != null) {
				session.delete(dmHistoryGoods);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmHistoryGoods != null) {
			clearCache(dmHistoryGoods);
		}

		return dmHistoryGoods;
	}

	@Override
	public DmHistoryGoods updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods dmHistoryGoods)
		throws SystemException {
		dmHistoryGoods = toUnwrappedModel(dmHistoryGoods);

		boolean isNew = dmHistoryGoods.isNew();

		DmHistoryGoodsModelImpl dmHistoryGoodsModelImpl = (DmHistoryGoodsModelImpl)dmHistoryGoods;

		Session session = null;

		try {
			session = openSession();

			if (dmHistoryGoods.isNew()) {
				session.save(dmHistoryGoods);

				dmHistoryGoods.setNew(false);
			}
			else {
				session.merge(dmHistoryGoods);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistoryGoodsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmHistoryGoodsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSITEMCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryGoodsModelImpl.getOriginalGoodsItemCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GOODSITEMCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSITEMCODE,
					args);

				args = new Object[] { dmHistoryGoodsModelImpl.getGoodsItemCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GOODSITEMCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSITEMCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsImpl.class, dmHistoryGoods.getPrimaryKey(),
			dmHistoryGoods);

		clearUniqueFindersCache(dmHistoryGoods);
		cacheUniqueFindersCache(dmHistoryGoods);

		return dmHistoryGoods;
	}

	protected DmHistoryGoods toUnwrappedModel(DmHistoryGoods dmHistoryGoods) {
		if (dmHistoryGoods instanceof DmHistoryGoodsImpl) {
			return dmHistoryGoods;
		}

		DmHistoryGoodsImpl dmHistoryGoodsImpl = new DmHistoryGoodsImpl();

		dmHistoryGoodsImpl.setNew(dmHistoryGoods.isNew());
		dmHistoryGoodsImpl.setPrimaryKey(dmHistoryGoods.getPrimaryKey());

		dmHistoryGoodsImpl.setId(dmHistoryGoods.getId());
		dmHistoryGoodsImpl.setGoodsItemCode(dmHistoryGoods.getGoodsItemCode());
		dmHistoryGoodsImpl.setGoodsItemName(dmHistoryGoods.getGoodsItemName());
		dmHistoryGoodsImpl.setGoodsItemNameVN(dmHistoryGoods.getGoodsItemNameVN());
		dmHistoryGoodsImpl.setGoodsItemOrder(dmHistoryGoods.getGoodsItemOrder());
		dmHistoryGoodsImpl.setIsDelete(dmHistoryGoods.getIsDelete());
		dmHistoryGoodsImpl.setMarkedAsDelete(dmHistoryGoods.getMarkedAsDelete());
		dmHistoryGoodsImpl.setModifiedDate(dmHistoryGoods.getModifiedDate());
		dmHistoryGoodsImpl.setRequestedDate(dmHistoryGoods.getRequestedDate());
		dmHistoryGoodsImpl.setSyncVersion(dmHistoryGoods.getSyncVersion());

		return dmHistoryGoodsImpl;
	}

	/**
	 * Returns the dm history goods with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history goods
	 * @return the dm history goods
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException if a dm history goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoods findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmHistoryGoodsException, SystemException {
		DmHistoryGoods dmHistoryGoods = fetchByPrimaryKey(primaryKey);

		if (dmHistoryGoods == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmHistoryGoodsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmHistoryGoods;
	}

	/**
	 * Returns the dm history goods with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException} if it could not be found.
	 *
	 * @param id the primary key of the dm history goods
	 * @return the dm history goods
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsException if a dm history goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoods findByPrimaryKey(int id)
		throws NoSuchDmHistoryGoodsException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm history goods with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history goods
	 * @return the dm history goods, or <code>null</code> if a dm history goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoods fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmHistoryGoods dmHistoryGoods = (DmHistoryGoods)EntityCacheUtil.getResult(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryGoodsImpl.class, primaryKey);

		if (dmHistoryGoods == _nullDmHistoryGoods) {
			return null;
		}

		if (dmHistoryGoods == null) {
			Session session = null;

			try {
				session = openSession();

				dmHistoryGoods = (DmHistoryGoods)session.get(DmHistoryGoodsImpl.class,
						primaryKey);

				if (dmHistoryGoods != null) {
					cacheResult(dmHistoryGoods);
				}
				else {
					EntityCacheUtil.putResult(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryGoodsImpl.class, primaryKey,
						_nullDmHistoryGoods);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmHistoryGoodsModelImpl.ENTITY_CACHE_ENABLED,
					DmHistoryGoodsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmHistoryGoods;
	}

	/**
	 * Returns the dm history goods with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history goods
	 * @return the dm history goods, or <code>null</code> if a dm history goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoods fetchByPrimaryKey(int id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm history goodses.
	 *
	 * @return the dm history goodses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryGoods> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history goodses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history goodses
	 * @param end the upper bound of the range of dm history goodses (not inclusive)
	 * @return the range of dm history goodses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryGoods> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history goodses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history goodses
	 * @param end the upper bound of the range of dm history goodses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history goodses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryGoods> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<DmHistoryGoods> list = (List<DmHistoryGoods>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYGOODS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYGOODS;

				if (pagination) {
					sql = sql.concat(DmHistoryGoodsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmHistoryGoods>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryGoods>(list);
				}
				else {
					list = (List<DmHistoryGoods>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the dm history goodses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmHistoryGoods dmHistoryGoods : findAll()) {
			remove(dmHistoryGoods);
		}
	}

	/**
	 * Returns the number of dm history goodses.
	 *
	 * @return the number of dm history goodses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYGOODS);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the dm history goods persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistoryGoods>> listenersList = new ArrayList<ModelListener<DmHistoryGoods>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistoryGoods>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(DmHistoryGoodsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMHISTORYGOODS = "SELECT dmHistoryGoods FROM DmHistoryGoods dmHistoryGoods";
	private static final String _SQL_SELECT_DMHISTORYGOODS_WHERE = "SELECT dmHistoryGoods FROM DmHistoryGoods dmHistoryGoods WHERE ";
	private static final String _SQL_COUNT_DMHISTORYGOODS = "SELECT COUNT(dmHistoryGoods) FROM DmHistoryGoods dmHistoryGoods";
	private static final String _SQL_COUNT_DMHISTORYGOODS_WHERE = "SELECT COUNT(dmHistoryGoods) FROM DmHistoryGoods dmHistoryGoods WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistoryGoods.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistoryGoods exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistoryGoods exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistoryGoodsPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"goodsItemCode", "goodsItemName", "goodsItemNameVN",
				"goodsItemOrder", "isDelete", "markedAsDelete", "modifiedDate",
				"requestedDate", "syncVersion"
			});
	private static DmHistoryGoods _nullDmHistoryGoods = new DmHistoryGoodsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistoryGoods> toCacheModel() {
				return _nullDmHistoryGoodsCacheModel;
			}
		};

	private static CacheModel<DmHistoryGoods> _nullDmHistoryGoodsCacheModel = new CacheModel<DmHistoryGoods>() {
			@Override
			public DmHistoryGoods toEntityModel() {
				return _nullDmHistoryGoods;
			}
		};
}