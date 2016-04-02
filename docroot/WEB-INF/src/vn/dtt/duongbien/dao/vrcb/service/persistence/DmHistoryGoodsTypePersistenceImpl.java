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

import vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsTypeImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsTypeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm history goods type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryGoodsTypePersistence
 * @see DmHistoryGoodsTypeUtil
 * @generated
 */
public class DmHistoryGoodsTypePersistenceImpl extends BasePersistenceImpl<DmHistoryGoodsType>
	implements DmHistoryGoodsTypePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistoryGoodsTypeUtil} to access the dm history goods type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistoryGoodsTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistoryGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsTypeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryGoodsTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistoryGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsTypeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryGoodsTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistoryGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GOODSTYPECODE =
		new FinderPath(DmHistoryGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsTypeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryGoodsTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGoodsTypeCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSTYPECODE =
		new FinderPath(DmHistoryGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsTypeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryGoodsTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGoodsTypeCode",
			new String[] { String.class.getName() },
			DmHistoryGoodsTypeModelImpl.GOODSTYPECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GOODSTYPECODE = new FinderPath(DmHistoryGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGoodsTypeCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dm history goods types where goodsTypeCode = &#63;.
	 *
	 * @param goodsTypeCode the goods type code
	 * @return the matching dm history goods types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryGoodsType> findByGoodsTypeCode(String goodsTypeCode)
		throws SystemException {
		return findByGoodsTypeCode(goodsTypeCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history goods types where goodsTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param goodsTypeCode the goods type code
	 * @param start the lower bound of the range of dm history goods types
	 * @param end the upper bound of the range of dm history goods types (not inclusive)
	 * @return the range of matching dm history goods types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryGoodsType> findByGoodsTypeCode(String goodsTypeCode,
		int start, int end) throws SystemException {
		return findByGoodsTypeCode(goodsTypeCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history goods types where goodsTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param goodsTypeCode the goods type code
	 * @param start the lower bound of the range of dm history goods types
	 * @param end the upper bound of the range of dm history goods types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm history goods types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryGoodsType> findByGoodsTypeCode(String goodsTypeCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSTYPECODE;
			finderArgs = new Object[] { goodsTypeCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GOODSTYPECODE;
			finderArgs = new Object[] {
					goodsTypeCode,
					
					start, end, orderByComparator
				};
		}

		List<DmHistoryGoodsType> list = (List<DmHistoryGoodsType>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmHistoryGoodsType dmHistoryGoodsType : list) {
				if (!Validator.equals(goodsTypeCode,
							dmHistoryGoodsType.getGoodsTypeCode())) {
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

			query.append(_SQL_SELECT_DMHISTORYGOODSTYPE_WHERE);

			boolean bindGoodsTypeCode = false;

			if (goodsTypeCode == null) {
				query.append(_FINDER_COLUMN_GOODSTYPECODE_GOODSTYPECODE_1);
			}
			else if (goodsTypeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GOODSTYPECODE_GOODSTYPECODE_3);
			}
			else {
				bindGoodsTypeCode = true;

				query.append(_FINDER_COLUMN_GOODSTYPECODE_GOODSTYPECODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmHistoryGoodsTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindGoodsTypeCode) {
					qPos.add(goodsTypeCode);
				}

				if (!pagination) {
					list = (List<DmHistoryGoodsType>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryGoodsType>(list);
				}
				else {
					list = (List<DmHistoryGoodsType>)QueryUtil.list(q,
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
	 * Returns the first dm history goods type in the ordered set where goodsTypeCode = &#63;.
	 *
	 * @param goodsTypeCode the goods type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history goods type
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException if a matching dm history goods type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoodsType findByGoodsTypeCode_First(String goodsTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryGoodsTypeException, SystemException {
		DmHistoryGoodsType dmHistoryGoodsType = fetchByGoodsTypeCode_First(goodsTypeCode,
				orderByComparator);

		if (dmHistoryGoodsType != null) {
			return dmHistoryGoodsType;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("goodsTypeCode=");
		msg.append(goodsTypeCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryGoodsTypeException(msg.toString());
	}

	/**
	 * Returns the first dm history goods type in the ordered set where goodsTypeCode = &#63;.
	 *
	 * @param goodsTypeCode the goods type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history goods type, or <code>null</code> if a matching dm history goods type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoodsType fetchByGoodsTypeCode_First(String goodsTypeCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmHistoryGoodsType> list = findByGoodsTypeCode(goodsTypeCode, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm history goods type in the ordered set where goodsTypeCode = &#63;.
	 *
	 * @param goodsTypeCode the goods type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history goods type
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException if a matching dm history goods type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoodsType findByGoodsTypeCode_Last(String goodsTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryGoodsTypeException, SystemException {
		DmHistoryGoodsType dmHistoryGoodsType = fetchByGoodsTypeCode_Last(goodsTypeCode,
				orderByComparator);

		if (dmHistoryGoodsType != null) {
			return dmHistoryGoodsType;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("goodsTypeCode=");
		msg.append(goodsTypeCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryGoodsTypeException(msg.toString());
	}

	/**
	 * Returns the last dm history goods type in the ordered set where goodsTypeCode = &#63;.
	 *
	 * @param goodsTypeCode the goods type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history goods type, or <code>null</code> if a matching dm history goods type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoodsType fetchByGoodsTypeCode_Last(String goodsTypeCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGoodsTypeCode(goodsTypeCode);

		if (count == 0) {
			return null;
		}

		List<DmHistoryGoodsType> list = findByGoodsTypeCode(goodsTypeCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm history goods types before and after the current dm history goods type in the ordered set where goodsTypeCode = &#63;.
	 *
	 * @param id the primary key of the current dm history goods type
	 * @param goodsTypeCode the goods type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm history goods type
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException if a dm history goods type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoodsType[] findByGoodsTypeCode_PrevAndNext(int id,
		String goodsTypeCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryGoodsTypeException, SystemException {
		DmHistoryGoodsType dmHistoryGoodsType = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmHistoryGoodsType[] array = new DmHistoryGoodsTypeImpl[3];

			array[0] = getByGoodsTypeCode_PrevAndNext(session,
					dmHistoryGoodsType, goodsTypeCode, orderByComparator, true);

			array[1] = dmHistoryGoodsType;

			array[2] = getByGoodsTypeCode_PrevAndNext(session,
					dmHistoryGoodsType, goodsTypeCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmHistoryGoodsType getByGoodsTypeCode_PrevAndNext(
		Session session, DmHistoryGoodsType dmHistoryGoodsType,
		String goodsTypeCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMHISTORYGOODSTYPE_WHERE);

		boolean bindGoodsTypeCode = false;

		if (goodsTypeCode == null) {
			query.append(_FINDER_COLUMN_GOODSTYPECODE_GOODSTYPECODE_1);
		}
		else if (goodsTypeCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_GOODSTYPECODE_GOODSTYPECODE_3);
		}
		else {
			bindGoodsTypeCode = true;

			query.append(_FINDER_COLUMN_GOODSTYPECODE_GOODSTYPECODE_2);
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
			query.append(DmHistoryGoodsTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindGoodsTypeCode) {
			qPos.add(goodsTypeCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmHistoryGoodsType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmHistoryGoodsType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm history goods types where goodsTypeCode = &#63; from the database.
	 *
	 * @param goodsTypeCode the goods type code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGoodsTypeCode(String goodsTypeCode)
		throws SystemException {
		for (DmHistoryGoodsType dmHistoryGoodsType : findByGoodsTypeCode(
				goodsTypeCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmHistoryGoodsType);
		}
	}

	/**
	 * Returns the number of dm history goods types where goodsTypeCode = &#63;.
	 *
	 * @param goodsTypeCode the goods type code
	 * @return the number of matching dm history goods types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGoodsTypeCode(String goodsTypeCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GOODSTYPECODE;

		Object[] finderArgs = new Object[] { goodsTypeCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYGOODSTYPE_WHERE);

			boolean bindGoodsTypeCode = false;

			if (goodsTypeCode == null) {
				query.append(_FINDER_COLUMN_GOODSTYPECODE_GOODSTYPECODE_1);
			}
			else if (goodsTypeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GOODSTYPECODE_GOODSTYPECODE_3);
			}
			else {
				bindGoodsTypeCode = true;

				query.append(_FINDER_COLUMN_GOODSTYPECODE_GOODSTYPECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindGoodsTypeCode) {
					qPos.add(goodsTypeCode);
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

	private static final String _FINDER_COLUMN_GOODSTYPECODE_GOODSTYPECODE_1 = "dmHistoryGoodsType.goodsTypeCode IS NULL";
	private static final String _FINDER_COLUMN_GOODSTYPECODE_GOODSTYPECODE_2 = "dmHistoryGoodsType.goodsTypeCode = ?";
	private static final String _FINDER_COLUMN_GOODSTYPECODE_GOODSTYPECODE_3 = "(dmHistoryGoodsType.goodsTypeCode IS NULL OR dmHistoryGoodsType.goodsTypeCode = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_GOODSTYPECODEANDSYNCVERSION =
		new FinderPath(DmHistoryGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsTypeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryGoodsTypeImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByGoodsTypeCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmHistoryGoodsTypeModelImpl.GOODSTYPECODE_COLUMN_BITMASK |
			DmHistoryGoodsTypeModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GOODSTYPECODEANDSYNCVERSION =
		new FinderPath(DmHistoryGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByGoodsTypeCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns the dm history goods type where goodsTypeCode = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException} if it could not be found.
	 *
	 * @param goodsTypeCode the goods type code
	 * @param syncVersion the sync version
	 * @return the matching dm history goods type
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException if a matching dm history goods type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoodsType findByGoodsTypeCodeAndSyncVersion(
		String goodsTypeCode, String syncVersion)
		throws NoSuchDmHistoryGoodsTypeException, SystemException {
		DmHistoryGoodsType dmHistoryGoodsType = fetchByGoodsTypeCodeAndSyncVersion(goodsTypeCode,
				syncVersion);

		if (dmHistoryGoodsType == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("goodsTypeCode=");
			msg.append(goodsTypeCode);

			msg.append(", syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryGoodsTypeException(msg.toString());
		}

		return dmHistoryGoodsType;
	}

	/**
	 * Returns the dm history goods type where goodsTypeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param goodsTypeCode the goods type code
	 * @param syncVersion the sync version
	 * @return the matching dm history goods type, or <code>null</code> if a matching dm history goods type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoodsType fetchByGoodsTypeCodeAndSyncVersion(
		String goodsTypeCode, String syncVersion) throws SystemException {
		return fetchByGoodsTypeCodeAndSyncVersion(goodsTypeCode, syncVersion,
			true);
	}

	/**
	 * Returns the dm history goods type where goodsTypeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param goodsTypeCode the goods type code
	 * @param syncVersion the sync version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history goods type, or <code>null</code> if a matching dm history goods type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoodsType fetchByGoodsTypeCodeAndSyncVersion(
		String goodsTypeCode, String syncVersion, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { goodsTypeCode, syncVersion };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_GOODSTYPECODEANDSYNCVERSION,
					finderArgs, this);
		}

		if (result instanceof DmHistoryGoodsType) {
			DmHistoryGoodsType dmHistoryGoodsType = (DmHistoryGoodsType)result;

			if (!Validator.equals(goodsTypeCode,
						dmHistoryGoodsType.getGoodsTypeCode()) ||
					!Validator.equals(syncVersion,
						dmHistoryGoodsType.getSyncVersion())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMHISTORYGOODSTYPE_WHERE);

			boolean bindGoodsTypeCode = false;

			if (goodsTypeCode == null) {
				query.append(_FINDER_COLUMN_GOODSTYPECODEANDSYNCVERSION_GOODSTYPECODE_1);
			}
			else if (goodsTypeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GOODSTYPECODEANDSYNCVERSION_GOODSTYPECODE_3);
			}
			else {
				bindGoodsTypeCode = true;

				query.append(_FINDER_COLUMN_GOODSTYPECODEANDSYNCVERSION_GOODSTYPECODE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_GOODSTYPECODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GOODSTYPECODEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_GOODSTYPECODEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindGoodsTypeCode) {
					qPos.add(goodsTypeCode);
				}

				if (bindSyncVersion) {
					qPos.add(syncVersion);
				}

				List<DmHistoryGoodsType> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODSTYPECODEANDSYNCVERSION,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmHistoryGoodsTypePersistenceImpl.fetchByGoodsTypeCodeAndSyncVersion(String, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmHistoryGoodsType dmHistoryGoodsType = list.get(0);

					result = dmHistoryGoodsType;

					cacheResult(dmHistoryGoodsType);

					if ((dmHistoryGoodsType.getGoodsTypeCode() == null) ||
							!dmHistoryGoodsType.getGoodsTypeCode()
												   .equals(goodsTypeCode) ||
							(dmHistoryGoodsType.getSyncVersion() == null) ||
							!dmHistoryGoodsType.getSyncVersion()
												   .equals(syncVersion)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODSTYPECODEANDSYNCVERSION,
							finderArgs, dmHistoryGoodsType);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GOODSTYPECODEANDSYNCVERSION,
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
			return (DmHistoryGoodsType)result;
		}
	}

	/**
	 * Removes the dm history goods type where goodsTypeCode = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param goodsTypeCode the goods type code
	 * @param syncVersion the sync version
	 * @return the dm history goods type that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoodsType removeByGoodsTypeCodeAndSyncVersion(
		String goodsTypeCode, String syncVersion)
		throws NoSuchDmHistoryGoodsTypeException, SystemException {
		DmHistoryGoodsType dmHistoryGoodsType = findByGoodsTypeCodeAndSyncVersion(goodsTypeCode,
				syncVersion);

		return remove(dmHistoryGoodsType);
	}

	/**
	 * Returns the number of dm history goods types where goodsTypeCode = &#63; and syncVersion = &#63;.
	 *
	 * @param goodsTypeCode the goods type code
	 * @param syncVersion the sync version
	 * @return the number of matching dm history goods types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGoodsTypeCodeAndSyncVersion(String goodsTypeCode,
		String syncVersion) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GOODSTYPECODEANDSYNCVERSION;

		Object[] finderArgs = new Object[] { goodsTypeCode, syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMHISTORYGOODSTYPE_WHERE);

			boolean bindGoodsTypeCode = false;

			if (goodsTypeCode == null) {
				query.append(_FINDER_COLUMN_GOODSTYPECODEANDSYNCVERSION_GOODSTYPECODE_1);
			}
			else if (goodsTypeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GOODSTYPECODEANDSYNCVERSION_GOODSTYPECODE_3);
			}
			else {
				bindGoodsTypeCode = true;

				query.append(_FINDER_COLUMN_GOODSTYPECODEANDSYNCVERSION_GOODSTYPECODE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_GOODSTYPECODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GOODSTYPECODEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_GOODSTYPECODEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindGoodsTypeCode) {
					qPos.add(goodsTypeCode);
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

	private static final String _FINDER_COLUMN_GOODSTYPECODEANDSYNCVERSION_GOODSTYPECODE_1 =
		"dmHistoryGoodsType.goodsTypeCode IS NULL AND ";
	private static final String _FINDER_COLUMN_GOODSTYPECODEANDSYNCVERSION_GOODSTYPECODE_2 =
		"dmHistoryGoodsType.goodsTypeCode = ? AND ";
	private static final String _FINDER_COLUMN_GOODSTYPECODEANDSYNCVERSION_GOODSTYPECODE_3 =
		"(dmHistoryGoodsType.goodsTypeCode IS NULL OR dmHistoryGoodsType.goodsTypeCode = '') AND ";
	private static final String _FINDER_COLUMN_GOODSTYPECODEANDSYNCVERSION_SYNCVERSION_1 =
		"dmHistoryGoodsType.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_GOODSTYPECODEANDSYNCVERSION_SYNCVERSION_2 =
		"dmHistoryGoodsType.syncVersion = ?";
	private static final String _FINDER_COLUMN_GOODSTYPECODEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmHistoryGoodsType.syncVersion IS NULL OR dmHistoryGoodsType.syncVersion = '')";

	public DmHistoryGoodsTypePersistenceImpl() {
		setModelClass(DmHistoryGoodsType.class);
	}

	/**
	 * Caches the dm history goods type in the entity cache if it is enabled.
	 *
	 * @param dmHistoryGoodsType the dm history goods type
	 */
	@Override
	public void cacheResult(DmHistoryGoodsType dmHistoryGoodsType) {
		EntityCacheUtil.putResult(DmHistoryGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsTypeImpl.class, dmHistoryGoodsType.getPrimaryKey(),
			dmHistoryGoodsType);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODSTYPECODEANDSYNCVERSION,
			new Object[] {
				dmHistoryGoodsType.getGoodsTypeCode(),
				dmHistoryGoodsType.getSyncVersion()
			}, dmHistoryGoodsType);

		dmHistoryGoodsType.resetOriginalValues();
	}

	/**
	 * Caches the dm history goods types in the entity cache if it is enabled.
	 *
	 * @param dmHistoryGoodsTypes the dm history goods types
	 */
	@Override
	public void cacheResult(List<DmHistoryGoodsType> dmHistoryGoodsTypes) {
		for (DmHistoryGoodsType dmHistoryGoodsType : dmHistoryGoodsTypes) {
			if (EntityCacheUtil.getResult(
						DmHistoryGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryGoodsTypeImpl.class,
						dmHistoryGoodsType.getPrimaryKey()) == null) {
				cacheResult(dmHistoryGoodsType);
			}
			else {
				dmHistoryGoodsType.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history goods types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistoryGoodsTypeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistoryGoodsTypeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history goods type.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistoryGoodsType dmHistoryGoodsType) {
		EntityCacheUtil.removeResult(DmHistoryGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsTypeImpl.class, dmHistoryGoodsType.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmHistoryGoodsType);
	}

	@Override
	public void clearCache(List<DmHistoryGoodsType> dmHistoryGoodsTypes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmHistoryGoodsType dmHistoryGoodsType : dmHistoryGoodsTypes) {
			EntityCacheUtil.removeResult(DmHistoryGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryGoodsTypeImpl.class, dmHistoryGoodsType.getPrimaryKey());

			clearUniqueFindersCache(dmHistoryGoodsType);
		}
	}

	protected void cacheUniqueFindersCache(
		DmHistoryGoodsType dmHistoryGoodsType) {
		if (dmHistoryGoodsType.isNew()) {
			Object[] args = new Object[] {
					dmHistoryGoodsType.getGoodsTypeCode(),
					dmHistoryGoodsType.getSyncVersion()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GOODSTYPECODEANDSYNCVERSION,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODSTYPECODEANDSYNCVERSION,
				args, dmHistoryGoodsType);
		}
		else {
			DmHistoryGoodsTypeModelImpl dmHistoryGoodsTypeModelImpl = (DmHistoryGoodsTypeModelImpl)dmHistoryGoodsType;

			if ((dmHistoryGoodsTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_GOODSTYPECODEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryGoodsType.getGoodsTypeCode(),
						dmHistoryGoodsType.getSyncVersion()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GOODSTYPECODEANDSYNCVERSION,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODSTYPECODEANDSYNCVERSION,
					args, dmHistoryGoodsType);
			}
		}
	}

	protected void clearUniqueFindersCache(
		DmHistoryGoodsType dmHistoryGoodsType) {
		DmHistoryGoodsTypeModelImpl dmHistoryGoodsTypeModelImpl = (DmHistoryGoodsTypeModelImpl)dmHistoryGoodsType;

		Object[] args = new Object[] {
				dmHistoryGoodsType.getGoodsTypeCode(),
				dmHistoryGoodsType.getSyncVersion()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GOODSTYPECODEANDSYNCVERSION,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GOODSTYPECODEANDSYNCVERSION,
			args);

		if ((dmHistoryGoodsTypeModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_GOODSTYPECODEANDSYNCVERSION.getColumnBitmask()) != 0) {
			args = new Object[] {
					dmHistoryGoodsTypeModelImpl.getOriginalGoodsTypeCode(),
					dmHistoryGoodsTypeModelImpl.getOriginalSyncVersion()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GOODSTYPECODEANDSYNCVERSION,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GOODSTYPECODEANDSYNCVERSION,
				args);
		}
	}

	/**
	 * Creates a new dm history goods type with the primary key. Does not add the dm history goods type to the database.
	 *
	 * @param id the primary key for the new dm history goods type
	 * @return the new dm history goods type
	 */
	@Override
	public DmHistoryGoodsType create(int id) {
		DmHistoryGoodsType dmHistoryGoodsType = new DmHistoryGoodsTypeImpl();

		dmHistoryGoodsType.setNew(true);
		dmHistoryGoodsType.setPrimaryKey(id);

		return dmHistoryGoodsType;
	}

	/**
	 * Removes the dm history goods type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history goods type
	 * @return the dm history goods type that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException if a dm history goods type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoodsType remove(int id)
		throws NoSuchDmHistoryGoodsTypeException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm history goods type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history goods type
	 * @return the dm history goods type that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException if a dm history goods type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoodsType remove(Serializable primaryKey)
		throws NoSuchDmHistoryGoodsTypeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistoryGoodsType dmHistoryGoodsType = (DmHistoryGoodsType)session.get(DmHistoryGoodsTypeImpl.class,
					primaryKey);

			if (dmHistoryGoodsType == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmHistoryGoodsTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmHistoryGoodsType);
		}
		catch (NoSuchDmHistoryGoodsTypeException nsee) {
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
	protected DmHistoryGoodsType removeImpl(
		DmHistoryGoodsType dmHistoryGoodsType) throws SystemException {
		dmHistoryGoodsType = toUnwrappedModel(dmHistoryGoodsType);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmHistoryGoodsType)) {
				dmHistoryGoodsType = (DmHistoryGoodsType)session.get(DmHistoryGoodsTypeImpl.class,
						dmHistoryGoodsType.getPrimaryKeyObj());
			}

			if (dmHistoryGoodsType != null) {
				session.delete(dmHistoryGoodsType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmHistoryGoodsType != null) {
			clearCache(dmHistoryGoodsType);
		}

		return dmHistoryGoodsType;
	}

	@Override
	public DmHistoryGoodsType updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType dmHistoryGoodsType)
		throws SystemException {
		dmHistoryGoodsType = toUnwrappedModel(dmHistoryGoodsType);

		boolean isNew = dmHistoryGoodsType.isNew();

		DmHistoryGoodsTypeModelImpl dmHistoryGoodsTypeModelImpl = (DmHistoryGoodsTypeModelImpl)dmHistoryGoodsType;

		Session session = null;

		try {
			session = openSession();

			if (dmHistoryGoodsType.isNew()) {
				session.save(dmHistoryGoodsType);

				dmHistoryGoodsType.setNew(false);
			}
			else {
				session.merge(dmHistoryGoodsType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistoryGoodsTypeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmHistoryGoodsTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSTYPECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryGoodsTypeModelImpl.getOriginalGoodsTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GOODSTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSTYPECODE,
					args);

				args = new Object[] {
						dmHistoryGoodsTypeModelImpl.getGoodsTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GOODSTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GOODSTYPECODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmHistoryGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryGoodsTypeImpl.class, dmHistoryGoodsType.getPrimaryKey(),
			dmHistoryGoodsType);

		clearUniqueFindersCache(dmHistoryGoodsType);
		cacheUniqueFindersCache(dmHistoryGoodsType);

		return dmHistoryGoodsType;
	}

	protected DmHistoryGoodsType toUnwrappedModel(
		DmHistoryGoodsType dmHistoryGoodsType) {
		if (dmHistoryGoodsType instanceof DmHistoryGoodsTypeImpl) {
			return dmHistoryGoodsType;
		}

		DmHistoryGoodsTypeImpl dmHistoryGoodsTypeImpl = new DmHistoryGoodsTypeImpl();

		dmHistoryGoodsTypeImpl.setNew(dmHistoryGoodsType.isNew());
		dmHistoryGoodsTypeImpl.setPrimaryKey(dmHistoryGoodsType.getPrimaryKey());

		dmHistoryGoodsTypeImpl.setId(dmHistoryGoodsType.getId());
		dmHistoryGoodsTypeImpl.setGoodsTypeCode(dmHistoryGoodsType.getGoodsTypeCode());
		dmHistoryGoodsTypeImpl.setGoodsTypeName(dmHistoryGoodsType.getGoodsTypeName());
		dmHistoryGoodsTypeImpl.setGoodsTypeNameVN(dmHistoryGoodsType.getGoodsTypeNameVN());
		dmHistoryGoodsTypeImpl.setGoodsTypeOrder(dmHistoryGoodsType.getGoodsTypeOrder());
		dmHistoryGoodsTypeImpl.setIsDelete(dmHistoryGoodsType.getIsDelete());
		dmHistoryGoodsTypeImpl.setMarkedAsDelete(dmHistoryGoodsType.getMarkedAsDelete());
		dmHistoryGoodsTypeImpl.setModifiedDate(dmHistoryGoodsType.getModifiedDate());
		dmHistoryGoodsTypeImpl.setRequestedDate(dmHistoryGoodsType.getRequestedDate());
		dmHistoryGoodsTypeImpl.setSyncVersion(dmHistoryGoodsType.getSyncVersion());

		return dmHistoryGoodsTypeImpl;
	}

	/**
	 * Returns the dm history goods type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history goods type
	 * @return the dm history goods type
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException if a dm history goods type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoodsType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmHistoryGoodsTypeException, SystemException {
		DmHistoryGoodsType dmHistoryGoodsType = fetchByPrimaryKey(primaryKey);

		if (dmHistoryGoodsType == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmHistoryGoodsTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmHistoryGoodsType;
	}

	/**
	 * Returns the dm history goods type with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException} if it could not be found.
	 *
	 * @param id the primary key of the dm history goods type
	 * @return the dm history goods type
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException if a dm history goods type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoodsType findByPrimaryKey(int id)
		throws NoSuchDmHistoryGoodsTypeException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm history goods type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history goods type
	 * @return the dm history goods type, or <code>null</code> if a dm history goods type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoodsType fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmHistoryGoodsType dmHistoryGoodsType = (DmHistoryGoodsType)EntityCacheUtil.getResult(DmHistoryGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryGoodsTypeImpl.class, primaryKey);

		if (dmHistoryGoodsType == _nullDmHistoryGoodsType) {
			return null;
		}

		if (dmHistoryGoodsType == null) {
			Session session = null;

			try {
				session = openSession();

				dmHistoryGoodsType = (DmHistoryGoodsType)session.get(DmHistoryGoodsTypeImpl.class,
						primaryKey);

				if (dmHistoryGoodsType != null) {
					cacheResult(dmHistoryGoodsType);
				}
				else {
					EntityCacheUtil.putResult(DmHistoryGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryGoodsTypeImpl.class, primaryKey,
						_nullDmHistoryGoodsType);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmHistoryGoodsTypeModelImpl.ENTITY_CACHE_ENABLED,
					DmHistoryGoodsTypeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmHistoryGoodsType;
	}

	/**
	 * Returns the dm history goods type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history goods type
	 * @return the dm history goods type, or <code>null</code> if a dm history goods type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryGoodsType fetchByPrimaryKey(int id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm history goods types.
	 *
	 * @return the dm history goods types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryGoodsType> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history goods types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history goods types
	 * @param end the upper bound of the range of dm history goods types (not inclusive)
	 * @return the range of dm history goods types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryGoodsType> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history goods types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history goods types
	 * @param end the upper bound of the range of dm history goods types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history goods types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryGoodsType> findAll(int start, int end,
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

		List<DmHistoryGoodsType> list = (List<DmHistoryGoodsType>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYGOODSTYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYGOODSTYPE;

				if (pagination) {
					sql = sql.concat(DmHistoryGoodsTypeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmHistoryGoodsType>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryGoodsType>(list);
				}
				else {
					list = (List<DmHistoryGoodsType>)QueryUtil.list(q,
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
	 * Removes all the dm history goods types from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmHistoryGoodsType dmHistoryGoodsType : findAll()) {
			remove(dmHistoryGoodsType);
		}
	}

	/**
	 * Returns the number of dm history goods types.
	 *
	 * @return the number of dm history goods types
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

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYGOODSTYPE);

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
	 * Initializes the dm history goods type persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistoryGoodsType>> listenersList = new ArrayList<ModelListener<DmHistoryGoodsType>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistoryGoodsType>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmHistoryGoodsTypeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMHISTORYGOODSTYPE = "SELECT dmHistoryGoodsType FROM DmHistoryGoodsType dmHistoryGoodsType";
	private static final String _SQL_SELECT_DMHISTORYGOODSTYPE_WHERE = "SELECT dmHistoryGoodsType FROM DmHistoryGoodsType dmHistoryGoodsType WHERE ";
	private static final String _SQL_COUNT_DMHISTORYGOODSTYPE = "SELECT COUNT(dmHistoryGoodsType) FROM DmHistoryGoodsType dmHistoryGoodsType";
	private static final String _SQL_COUNT_DMHISTORYGOODSTYPE_WHERE = "SELECT COUNT(dmHistoryGoodsType) FROM DmHistoryGoodsType dmHistoryGoodsType WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistoryGoodsType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistoryGoodsType exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistoryGoodsType exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistoryGoodsTypePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"goodsTypeCode", "goodsTypeName", "goodsTypeNameVN",
				"goodsTypeOrder", "isDelete", "markedAsDelete", "modifiedDate",
				"requestedDate", "syncVersion"
			});
	private static DmHistoryGoodsType _nullDmHistoryGoodsType = new DmHistoryGoodsTypeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistoryGoodsType> toCacheModel() {
				return _nullDmHistoryGoodsTypeCacheModel;
			}
		};

	private static CacheModel<DmHistoryGoodsType> _nullDmHistoryGoodsTypeCacheModel =
		new CacheModel<DmHistoryGoodsType>() {
			@Override
			public DmHistoryGoodsType toEntityModel() {
				return _nullDmHistoryGoodsType;
			}
		};
}