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

import vn.dtt.duongbien.dao.vrcb.NoSuchDmGoodsException;
import vn.dtt.duongbien.dao.vrcb.model.DmGoods;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmGoodsImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmGoodsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm goods service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmGoodsPersistence
 * @see DmGoodsUtil
 * @generated
 */
public class DmGoodsPersistenceImpl extends BasePersistenceImpl<DmGoods>
	implements DmGoodsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmGoodsUtil} to access the dm goods persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmGoodsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsModelImpl.FINDER_CACHE_ENABLED, DmGoodsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsModelImpl.FINDER_CACHE_ENABLED, DmGoodsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GOODSITEMCODE =
		new FinderPath(DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsModelImpl.FINDER_CACHE_ENABLED, DmGoodsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGoodsItemCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSITEMCODE =
		new FinderPath(DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsModelImpl.FINDER_CACHE_ENABLED, DmGoodsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGoodsItemCode",
			new String[] { String.class.getName() },
			DmGoodsModelImpl.GOODSITEMCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GOODSITEMCODE = new FinderPath(DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGoodsItemCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dm goodses where goodsItemCode = &#63;.
	 *
	 * @param goodsItemCode the goods item code
	 * @return the matching dm goodses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGoods> findByGoodsItemCode(String goodsItemCode)
		throws SystemException {
		return findByGoodsItemCode(goodsItemCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm goodses where goodsItemCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGoodsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param goodsItemCode the goods item code
	 * @param start the lower bound of the range of dm goodses
	 * @param end the upper bound of the range of dm goodses (not inclusive)
	 * @return the range of matching dm goodses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGoods> findByGoodsItemCode(String goodsItemCode, int start,
		int end) throws SystemException {
		return findByGoodsItemCode(goodsItemCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm goodses where goodsItemCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGoodsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param goodsItemCode the goods item code
	 * @param start the lower bound of the range of dm goodses
	 * @param end the upper bound of the range of dm goodses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm goodses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGoods> findByGoodsItemCode(String goodsItemCode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
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

		List<DmGoods> list = (List<DmGoods>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmGoods dmGoods : list) {
				if (!Validator.equals(goodsItemCode, dmGoods.getGoodsItemCode())) {
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

			query.append(_SQL_SELECT_DMGOODS_WHERE);

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
				query.append(DmGoodsModelImpl.ORDER_BY_JPQL);
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
					list = (List<DmGoods>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmGoods>(list);
				}
				else {
					list = (List<DmGoods>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first dm goods in the ordered set where goodsItemCode = &#63;.
	 *
	 * @param goodsItemCode the goods item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm goods
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGoodsException if a matching dm goods could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGoods findByGoodsItemCode_First(String goodsItemCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmGoodsException, SystemException {
		DmGoods dmGoods = fetchByGoodsItemCode_First(goodsItemCode,
				orderByComparator);

		if (dmGoods != null) {
			return dmGoods;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("goodsItemCode=");
		msg.append(goodsItemCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmGoodsException(msg.toString());
	}

	/**
	 * Returns the first dm goods in the ordered set where goodsItemCode = &#63;.
	 *
	 * @param goodsItemCode the goods item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm goods, or <code>null</code> if a matching dm goods could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGoods fetchByGoodsItemCode_First(String goodsItemCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmGoods> list = findByGoodsItemCode(goodsItemCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm goods in the ordered set where goodsItemCode = &#63;.
	 *
	 * @param goodsItemCode the goods item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm goods
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGoodsException if a matching dm goods could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGoods findByGoodsItemCode_Last(String goodsItemCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmGoodsException, SystemException {
		DmGoods dmGoods = fetchByGoodsItemCode_Last(goodsItemCode,
				orderByComparator);

		if (dmGoods != null) {
			return dmGoods;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("goodsItemCode=");
		msg.append(goodsItemCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmGoodsException(msg.toString());
	}

	/**
	 * Returns the last dm goods in the ordered set where goodsItemCode = &#63;.
	 *
	 * @param goodsItemCode the goods item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm goods, or <code>null</code> if a matching dm goods could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGoods fetchByGoodsItemCode_Last(String goodsItemCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGoodsItemCode(goodsItemCode);

		if (count == 0) {
			return null;
		}

		List<DmGoods> list = findByGoodsItemCode(goodsItemCode, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm goodses before and after the current dm goods in the ordered set where goodsItemCode = &#63;.
	 *
	 * @param id the primary key of the current dm goods
	 * @param goodsItemCode the goods item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm goods
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGoodsException if a dm goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGoods[] findByGoodsItemCode_PrevAndNext(int id,
		String goodsItemCode, OrderByComparator orderByComparator)
		throws NoSuchDmGoodsException, SystemException {
		DmGoods dmGoods = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmGoods[] array = new DmGoodsImpl[3];

			array[0] = getByGoodsItemCode_PrevAndNext(session, dmGoods,
					goodsItemCode, orderByComparator, true);

			array[1] = dmGoods;

			array[2] = getByGoodsItemCode_PrevAndNext(session, dmGoods,
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

	protected DmGoods getByGoodsItemCode_PrevAndNext(Session session,
		DmGoods dmGoods, String goodsItemCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMGOODS_WHERE);

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
			query.append(DmGoodsModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(dmGoods);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmGoods> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm goodses where goodsItemCode = &#63; from the database.
	 *
	 * @param goodsItemCode the goods item code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGoodsItemCode(String goodsItemCode)
		throws SystemException {
		for (DmGoods dmGoods : findByGoodsItemCode(goodsItemCode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmGoods);
		}
	}

	/**
	 * Returns the number of dm goodses where goodsItemCode = &#63;.
	 *
	 * @param goodsItemCode the goods item code
	 * @return the number of matching dm goodses
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

			query.append(_SQL_COUNT_DMGOODS_WHERE);

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

	private static final String _FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_1 = "dmGoods.goodsItemCode IS NULL";
	private static final String _FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_2 = "dmGoods.goodsItemCode = ?";
	private static final String _FINDER_COLUMN_GOODSITEMCODE_GOODSITEMCODE_3 = "(dmGoods.goodsItemCode IS NULL OR dmGoods.goodsItemCode = '')";

	public DmGoodsPersistenceImpl() {
		setModelClass(DmGoods.class);
	}

	/**
	 * Caches the dm goods in the entity cache if it is enabled.
	 *
	 * @param dmGoods the dm goods
	 */
	@Override
	public void cacheResult(DmGoods dmGoods) {
		EntityCacheUtil.putResult(DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsImpl.class, dmGoods.getPrimaryKey(), dmGoods);

		dmGoods.resetOriginalValues();
	}

	/**
	 * Caches the dm goodses in the entity cache if it is enabled.
	 *
	 * @param dmGoodses the dm goodses
	 */
	@Override
	public void cacheResult(List<DmGoods> dmGoodses) {
		for (DmGoods dmGoods : dmGoodses) {
			if (EntityCacheUtil.getResult(
						DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
						DmGoodsImpl.class, dmGoods.getPrimaryKey()) == null) {
				cacheResult(dmGoods);
			}
			else {
				dmGoods.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm goodses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmGoodsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmGoodsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm goods.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmGoods dmGoods) {
		EntityCacheUtil.removeResult(DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsImpl.class, dmGoods.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DmGoods> dmGoodses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmGoods dmGoods : dmGoodses) {
			EntityCacheUtil.removeResult(DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
				DmGoodsImpl.class, dmGoods.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dm goods with the primary key. Does not add the dm goods to the database.
	 *
	 * @param id the primary key for the new dm goods
	 * @return the new dm goods
	 */
	@Override
	public DmGoods create(int id) {
		DmGoods dmGoods = new DmGoodsImpl();

		dmGoods.setNew(true);
		dmGoods.setPrimaryKey(id);

		return dmGoods;
	}

	/**
	 * Removes the dm goods with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm goods
	 * @return the dm goods that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGoodsException if a dm goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGoods remove(int id)
		throws NoSuchDmGoodsException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm goods with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm goods
	 * @return the dm goods that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGoodsException if a dm goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGoods remove(Serializable primaryKey)
		throws NoSuchDmGoodsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmGoods dmGoods = (DmGoods)session.get(DmGoodsImpl.class, primaryKey);

			if (dmGoods == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmGoodsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmGoods);
		}
		catch (NoSuchDmGoodsException nsee) {
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
	protected DmGoods removeImpl(DmGoods dmGoods) throws SystemException {
		dmGoods = toUnwrappedModel(dmGoods);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmGoods)) {
				dmGoods = (DmGoods)session.get(DmGoodsImpl.class,
						dmGoods.getPrimaryKeyObj());
			}

			if (dmGoods != null) {
				session.delete(dmGoods);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmGoods != null) {
			clearCache(dmGoods);
		}

		return dmGoods;
	}

	@Override
	public DmGoods updateImpl(vn.dtt.duongbien.dao.vrcb.model.DmGoods dmGoods)
		throws SystemException {
		dmGoods = toUnwrappedModel(dmGoods);

		boolean isNew = dmGoods.isNew();

		DmGoodsModelImpl dmGoodsModelImpl = (DmGoodsModelImpl)dmGoods;

		Session session = null;

		try {
			session = openSession();

			if (dmGoods.isNew()) {
				session.save(dmGoods);

				dmGoods.setNew(false);
			}
			else {
				session.merge(dmGoods);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmGoodsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmGoodsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSITEMCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmGoodsModelImpl.getOriginalGoodsItemCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GOODSITEMCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSITEMCODE,
					args);

				args = new Object[] { dmGoodsModelImpl.getGoodsItemCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GOODSITEMCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSITEMCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
			DmGoodsImpl.class, dmGoods.getPrimaryKey(), dmGoods);

		return dmGoods;
	}

	protected DmGoods toUnwrappedModel(DmGoods dmGoods) {
		if (dmGoods instanceof DmGoodsImpl) {
			return dmGoods;
		}

		DmGoodsImpl dmGoodsImpl = new DmGoodsImpl();

		dmGoodsImpl.setNew(dmGoods.isNew());
		dmGoodsImpl.setPrimaryKey(dmGoods.getPrimaryKey());

		dmGoodsImpl.setId(dmGoods.getId());
		dmGoodsImpl.setGoodsItemCode(dmGoods.getGoodsItemCode());
		dmGoodsImpl.setGoodsItemName(dmGoods.getGoodsItemName());
		dmGoodsImpl.setGoodsItemNameVN(dmGoods.getGoodsItemNameVN());
		dmGoodsImpl.setGoodsItemOrder(dmGoods.getGoodsItemOrder());
		dmGoodsImpl.setIsDelete(dmGoods.getIsDelete());
		dmGoodsImpl.setMarkedAsDelete(dmGoods.getMarkedAsDelete());
		dmGoodsImpl.setModifiedDate(dmGoods.getModifiedDate());
		dmGoodsImpl.setRequestedDate(dmGoods.getRequestedDate());
		dmGoodsImpl.setSyncVersion(dmGoods.getSyncVersion());

		return dmGoodsImpl;
	}

	/**
	 * Returns the dm goods with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm goods
	 * @return the dm goods
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGoodsException if a dm goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGoods findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmGoodsException, SystemException {
		DmGoods dmGoods = fetchByPrimaryKey(primaryKey);

		if (dmGoods == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmGoodsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmGoods;
	}

	/**
	 * Returns the dm goods with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmGoodsException} if it could not be found.
	 *
	 * @param id the primary key of the dm goods
	 * @return the dm goods
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGoodsException if a dm goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGoods findByPrimaryKey(int id)
		throws NoSuchDmGoodsException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm goods with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm goods
	 * @return the dm goods, or <code>null</code> if a dm goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGoods fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmGoods dmGoods = (DmGoods)EntityCacheUtil.getResult(DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
				DmGoodsImpl.class, primaryKey);

		if (dmGoods == _nullDmGoods) {
			return null;
		}

		if (dmGoods == null) {
			Session session = null;

			try {
				session = openSession();

				dmGoods = (DmGoods)session.get(DmGoodsImpl.class, primaryKey);

				if (dmGoods != null) {
					cacheResult(dmGoods);
				}
				else {
					EntityCacheUtil.putResult(DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
						DmGoodsImpl.class, primaryKey, _nullDmGoods);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmGoodsModelImpl.ENTITY_CACHE_ENABLED,
					DmGoodsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmGoods;
	}

	/**
	 * Returns the dm goods with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm goods
	 * @return the dm goods, or <code>null</code> if a dm goods with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGoods fetchByPrimaryKey(int id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm goodses.
	 *
	 * @return the dm goodses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGoods> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm goodses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGoodsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm goodses
	 * @param end the upper bound of the range of dm goodses (not inclusive)
	 * @return the range of dm goodses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGoods> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm goodses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGoodsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm goodses
	 * @param end the upper bound of the range of dm goodses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm goodses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGoods> findAll(int start, int end,
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

		List<DmGoods> list = (List<DmGoods>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMGOODS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMGOODS;

				if (pagination) {
					sql = sql.concat(DmGoodsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmGoods>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmGoods>(list);
				}
				else {
					list = (List<DmGoods>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the dm goodses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmGoods dmGoods : findAll()) {
			remove(dmGoods);
		}
	}

	/**
	 * Returns the number of dm goodses.
	 *
	 * @return the number of dm goodses
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

				Query q = session.createQuery(_SQL_COUNT_DMGOODS);

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
	 * Initializes the dm goods persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmGoods")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmGoods>> listenersList = new ArrayList<ModelListener<DmGoods>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmGoods>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmGoodsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMGOODS = "SELECT dmGoods FROM DmGoods dmGoods";
	private static final String _SQL_SELECT_DMGOODS_WHERE = "SELECT dmGoods FROM DmGoods dmGoods WHERE ";
	private static final String _SQL_COUNT_DMGOODS = "SELECT COUNT(dmGoods) FROM DmGoods dmGoods";
	private static final String _SQL_COUNT_DMGOODS_WHERE = "SELECT COUNT(dmGoods) FROM DmGoods dmGoods WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmGoods.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmGoods exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmGoods exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmGoodsPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"goodsItemCode", "goodsItemName", "goodsItemNameVN",
				"goodsItemOrder", "isDelete", "markedAsDelete", "modifiedDate",
				"requestedDate", "syncVersion"
			});
	private static DmGoods _nullDmGoods = new DmGoodsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmGoods> toCacheModel() {
				return _nullDmGoodsCacheModel;
			}
		};

	private static CacheModel<DmGoods> _nullDmGoodsCacheModel = new CacheModel<DmGoods>() {
			@Override
			public DmGoods toEntityModel() {
				return _nullDmGoods;
			}
		};
}