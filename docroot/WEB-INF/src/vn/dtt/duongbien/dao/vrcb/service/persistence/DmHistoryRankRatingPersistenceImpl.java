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

import vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryRankRatingException;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryRankRating;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryRankRatingImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryRankRatingModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm history rank rating service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryRankRatingPersistence
 * @see DmHistoryRankRatingUtil
 * @generated
 */
public class DmHistoryRankRatingPersistenceImpl extends BasePersistenceImpl<DmHistoryRankRating>
	implements DmHistoryRankRatingPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistoryRankRatingUtil} to access the dm history rank rating persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistoryRankRatingImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRankRatingModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryRankRatingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRankRatingModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryRankRatingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRankRatingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_RANKCODE = new FinderPath(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRankRatingModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryRankRatingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRankCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RANKCODE =
		new FinderPath(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRankRatingModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryRankRatingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRankCode",
			new String[] { String.class.getName() },
			DmHistoryRankRatingModelImpl.RANKCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_RANKCODE = new FinderPath(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRankRatingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRankCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dm history rank ratings where rankCode = &#63;.
	 *
	 * @param rankCode the rank code
	 * @return the matching dm history rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryRankRating> findByRankCode(String rankCode)
		throws SystemException {
		return findByRankCode(rankCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the dm history rank ratings where rankCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryRankRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param rankCode the rank code
	 * @param start the lower bound of the range of dm history rank ratings
	 * @param end the upper bound of the range of dm history rank ratings (not inclusive)
	 * @return the range of matching dm history rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryRankRating> findByRankCode(String rankCode, int start,
		int end) throws SystemException {
		return findByRankCode(rankCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history rank ratings where rankCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryRankRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param rankCode the rank code
	 * @param start the lower bound of the range of dm history rank ratings
	 * @param end the upper bound of the range of dm history rank ratings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm history rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryRankRating> findByRankCode(String rankCode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RANKCODE;
			finderArgs = new Object[] { rankCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_RANKCODE;
			finderArgs = new Object[] { rankCode, start, end, orderByComparator };
		}

		List<DmHistoryRankRating> list = (List<DmHistoryRankRating>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmHistoryRankRating dmHistoryRankRating : list) {
				if (!Validator.equals(rankCode,
							dmHistoryRankRating.getRankCode())) {
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

			query.append(_SQL_SELECT_DMHISTORYRANKRATING_WHERE);

			boolean bindRankCode = false;

			if (rankCode == null) {
				query.append(_FINDER_COLUMN_RANKCODE_RANKCODE_1);
			}
			else if (rankCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_RANKCODE_RANKCODE_3);
			}
			else {
				bindRankCode = true;

				query.append(_FINDER_COLUMN_RANKCODE_RANKCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmHistoryRankRatingModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRankCode) {
					qPos.add(rankCode);
				}

				if (!pagination) {
					list = (List<DmHistoryRankRating>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryRankRating>(list);
				}
				else {
					list = (List<DmHistoryRankRating>)QueryUtil.list(q,
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
	 * Returns the first dm history rank rating in the ordered set where rankCode = &#63;.
	 *
	 * @param rankCode the rank code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history rank rating
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryRankRatingException if a matching dm history rank rating could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRankRating findByRankCode_First(String rankCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryRankRatingException, SystemException {
		DmHistoryRankRating dmHistoryRankRating = fetchByRankCode_First(rankCode,
				orderByComparator);

		if (dmHistoryRankRating != null) {
			return dmHistoryRankRating;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("rankCode=");
		msg.append(rankCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryRankRatingException(msg.toString());
	}

	/**
	 * Returns the first dm history rank rating in the ordered set where rankCode = &#63;.
	 *
	 * @param rankCode the rank code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history rank rating, or <code>null</code> if a matching dm history rank rating could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRankRating fetchByRankCode_First(String rankCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmHistoryRankRating> list = findByRankCode(rankCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm history rank rating in the ordered set where rankCode = &#63;.
	 *
	 * @param rankCode the rank code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history rank rating
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryRankRatingException if a matching dm history rank rating could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRankRating findByRankCode_Last(String rankCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryRankRatingException, SystemException {
		DmHistoryRankRating dmHistoryRankRating = fetchByRankCode_Last(rankCode,
				orderByComparator);

		if (dmHistoryRankRating != null) {
			return dmHistoryRankRating;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("rankCode=");
		msg.append(rankCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryRankRatingException(msg.toString());
	}

	/**
	 * Returns the last dm history rank rating in the ordered set where rankCode = &#63;.
	 *
	 * @param rankCode the rank code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history rank rating, or <code>null</code> if a matching dm history rank rating could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRankRating fetchByRankCode_Last(String rankCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByRankCode(rankCode);

		if (count == 0) {
			return null;
		}

		List<DmHistoryRankRating> list = findByRankCode(rankCode, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm history rank ratings before and after the current dm history rank rating in the ordered set where rankCode = &#63;.
	 *
	 * @param id the primary key of the current dm history rank rating
	 * @param rankCode the rank code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm history rank rating
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryRankRatingException if a dm history rank rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRankRating[] findByRankCode_PrevAndNext(int id,
		String rankCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryRankRatingException, SystemException {
		DmHistoryRankRating dmHistoryRankRating = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmHistoryRankRating[] array = new DmHistoryRankRatingImpl[3];

			array[0] = getByRankCode_PrevAndNext(session, dmHistoryRankRating,
					rankCode, orderByComparator, true);

			array[1] = dmHistoryRankRating;

			array[2] = getByRankCode_PrevAndNext(session, dmHistoryRankRating,
					rankCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmHistoryRankRating getByRankCode_PrevAndNext(Session session,
		DmHistoryRankRating dmHistoryRankRating, String rankCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMHISTORYRANKRATING_WHERE);

		boolean bindRankCode = false;

		if (rankCode == null) {
			query.append(_FINDER_COLUMN_RANKCODE_RANKCODE_1);
		}
		else if (rankCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_RANKCODE_RANKCODE_3);
		}
		else {
			bindRankCode = true;

			query.append(_FINDER_COLUMN_RANKCODE_RANKCODE_2);
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
			query.append(DmHistoryRankRatingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindRankCode) {
			qPos.add(rankCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmHistoryRankRating);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmHistoryRankRating> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm history rank ratings where rankCode = &#63; from the database.
	 *
	 * @param rankCode the rank code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRankCode(String rankCode) throws SystemException {
		for (DmHistoryRankRating dmHistoryRankRating : findByRankCode(
				rankCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmHistoryRankRating);
		}
	}

	/**
	 * Returns the number of dm history rank ratings where rankCode = &#63;.
	 *
	 * @param rankCode the rank code
	 * @return the number of matching dm history rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRankCode(String rankCode) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_RANKCODE;

		Object[] finderArgs = new Object[] { rankCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYRANKRATING_WHERE);

			boolean bindRankCode = false;

			if (rankCode == null) {
				query.append(_FINDER_COLUMN_RANKCODE_RANKCODE_1);
			}
			else if (rankCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_RANKCODE_RANKCODE_3);
			}
			else {
				bindRankCode = true;

				query.append(_FINDER_COLUMN_RANKCODE_RANKCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRankCode) {
					qPos.add(rankCode);
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

	private static final String _FINDER_COLUMN_RANKCODE_RANKCODE_1 = "dmHistoryRankRating.rankCode IS NULL";
	private static final String _FINDER_COLUMN_RANKCODE_RANKCODE_2 = "dmHistoryRankRating.rankCode = ?";
	private static final String _FINDER_COLUMN_RANKCODE_RANKCODE_3 = "(dmHistoryRankRating.rankCode IS NULL OR dmHistoryRankRating.rankCode = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_RANKCODEANDSYNCVERSION = new FinderPath(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRankRatingModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryRankRatingImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByRankCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmHistoryRankRatingModelImpl.RANKCODE_COLUMN_BITMASK |
			DmHistoryRankRatingModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_RANKCODEANDSYNCVERSION = new FinderPath(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRankRatingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRankCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns the dm history rank rating where rankCode = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryRankRatingException} if it could not be found.
	 *
	 * @param rankCode the rank code
	 * @param syncVersion the sync version
	 * @return the matching dm history rank rating
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryRankRatingException if a matching dm history rank rating could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRankRating findByRankCodeAndSyncVersion(String rankCode,
		String syncVersion)
		throws NoSuchDmHistoryRankRatingException, SystemException {
		DmHistoryRankRating dmHistoryRankRating = fetchByRankCodeAndSyncVersion(rankCode,
				syncVersion);

		if (dmHistoryRankRating == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("rankCode=");
			msg.append(rankCode);

			msg.append(", syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryRankRatingException(msg.toString());
		}

		return dmHistoryRankRating;
	}

	/**
	 * Returns the dm history rank rating where rankCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param rankCode the rank code
	 * @param syncVersion the sync version
	 * @return the matching dm history rank rating, or <code>null</code> if a matching dm history rank rating could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRankRating fetchByRankCodeAndSyncVersion(String rankCode,
		String syncVersion) throws SystemException {
		return fetchByRankCodeAndSyncVersion(rankCode, syncVersion, true);
	}

	/**
	 * Returns the dm history rank rating where rankCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param rankCode the rank code
	 * @param syncVersion the sync version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history rank rating, or <code>null</code> if a matching dm history rank rating could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRankRating fetchByRankCodeAndSyncVersion(String rankCode,
		String syncVersion, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { rankCode, syncVersion };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_RANKCODEANDSYNCVERSION,
					finderArgs, this);
		}

		if (result instanceof DmHistoryRankRating) {
			DmHistoryRankRating dmHistoryRankRating = (DmHistoryRankRating)result;

			if (!Validator.equals(rankCode, dmHistoryRankRating.getRankCode()) ||
					!Validator.equals(syncVersion,
						dmHistoryRankRating.getSyncVersion())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMHISTORYRANKRATING_WHERE);

			boolean bindRankCode = false;

			if (rankCode == null) {
				query.append(_FINDER_COLUMN_RANKCODEANDSYNCVERSION_RANKCODE_1);
			}
			else if (rankCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_RANKCODEANDSYNCVERSION_RANKCODE_3);
			}
			else {
				bindRankCode = true;

				query.append(_FINDER_COLUMN_RANKCODEANDSYNCVERSION_RANKCODE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_RANKCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_RANKCODEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_RANKCODEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRankCode) {
					qPos.add(rankCode);
				}

				if (bindSyncVersion) {
					qPos.add(syncVersion);
				}

				List<DmHistoryRankRating> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RANKCODEANDSYNCVERSION,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmHistoryRankRatingPersistenceImpl.fetchByRankCodeAndSyncVersion(String, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmHistoryRankRating dmHistoryRankRating = list.get(0);

					result = dmHistoryRankRating;

					cacheResult(dmHistoryRankRating);

					if ((dmHistoryRankRating.getRankCode() == null) ||
							!dmHistoryRankRating.getRankCode().equals(rankCode) ||
							(dmHistoryRankRating.getSyncVersion() == null) ||
							!dmHistoryRankRating.getSyncVersion()
													.equals(syncVersion)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RANKCODEANDSYNCVERSION,
							finderArgs, dmHistoryRankRating);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_RANKCODEANDSYNCVERSION,
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
			return (DmHistoryRankRating)result;
		}
	}

	/**
	 * Removes the dm history rank rating where rankCode = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param rankCode the rank code
	 * @param syncVersion the sync version
	 * @return the dm history rank rating that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRankRating removeByRankCodeAndSyncVersion(String rankCode,
		String syncVersion)
		throws NoSuchDmHistoryRankRatingException, SystemException {
		DmHistoryRankRating dmHistoryRankRating = findByRankCodeAndSyncVersion(rankCode,
				syncVersion);

		return remove(dmHistoryRankRating);
	}

	/**
	 * Returns the number of dm history rank ratings where rankCode = &#63; and syncVersion = &#63;.
	 *
	 * @param rankCode the rank code
	 * @param syncVersion the sync version
	 * @return the number of matching dm history rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRankCodeAndSyncVersion(String rankCode, String syncVersion)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_RANKCODEANDSYNCVERSION;

		Object[] finderArgs = new Object[] { rankCode, syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMHISTORYRANKRATING_WHERE);

			boolean bindRankCode = false;

			if (rankCode == null) {
				query.append(_FINDER_COLUMN_RANKCODEANDSYNCVERSION_RANKCODE_1);
			}
			else if (rankCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_RANKCODEANDSYNCVERSION_RANKCODE_3);
			}
			else {
				bindRankCode = true;

				query.append(_FINDER_COLUMN_RANKCODEANDSYNCVERSION_RANKCODE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_RANKCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_RANKCODEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_RANKCODEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRankCode) {
					qPos.add(rankCode);
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

	private static final String _FINDER_COLUMN_RANKCODEANDSYNCVERSION_RANKCODE_1 =
		"dmHistoryRankRating.rankCode IS NULL AND ";
	private static final String _FINDER_COLUMN_RANKCODEANDSYNCVERSION_RANKCODE_2 =
		"dmHistoryRankRating.rankCode = ? AND ";
	private static final String _FINDER_COLUMN_RANKCODEANDSYNCVERSION_RANKCODE_3 =
		"(dmHistoryRankRating.rankCode IS NULL OR dmHistoryRankRating.rankCode = '') AND ";
	private static final String _FINDER_COLUMN_RANKCODEANDSYNCVERSION_SYNCVERSION_1 =
		"dmHistoryRankRating.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_RANKCODEANDSYNCVERSION_SYNCVERSION_2 =
		"dmHistoryRankRating.syncVersion = ?";
	private static final String _FINDER_COLUMN_RANKCODEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmHistoryRankRating.syncVersion IS NULL OR dmHistoryRankRating.syncVersion = '')";

	public DmHistoryRankRatingPersistenceImpl() {
		setModelClass(DmHistoryRankRating.class);
	}

	/**
	 * Caches the dm history rank rating in the entity cache if it is enabled.
	 *
	 * @param dmHistoryRankRating the dm history rank rating
	 */
	@Override
	public void cacheResult(DmHistoryRankRating dmHistoryRankRating) {
		EntityCacheUtil.putResult(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRankRatingImpl.class, dmHistoryRankRating.getPrimaryKey(),
			dmHistoryRankRating);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RANKCODEANDSYNCVERSION,
			new Object[] {
				dmHistoryRankRating.getRankCode(),
				dmHistoryRankRating.getSyncVersion()
			}, dmHistoryRankRating);

		dmHistoryRankRating.resetOriginalValues();
	}

	/**
	 * Caches the dm history rank ratings in the entity cache if it is enabled.
	 *
	 * @param dmHistoryRankRatings the dm history rank ratings
	 */
	@Override
	public void cacheResult(List<DmHistoryRankRating> dmHistoryRankRatings) {
		for (DmHistoryRankRating dmHistoryRankRating : dmHistoryRankRatings) {
			if (EntityCacheUtil.getResult(
						DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryRankRatingImpl.class,
						dmHistoryRankRating.getPrimaryKey()) == null) {
				cacheResult(dmHistoryRankRating);
			}
			else {
				dmHistoryRankRating.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history rank ratings.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistoryRankRatingImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistoryRankRatingImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history rank rating.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistoryRankRating dmHistoryRankRating) {
		EntityCacheUtil.removeResult(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRankRatingImpl.class, dmHistoryRankRating.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmHistoryRankRating);
	}

	@Override
	public void clearCache(List<DmHistoryRankRating> dmHistoryRankRatings) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmHistoryRankRating dmHistoryRankRating : dmHistoryRankRatings) {
			EntityCacheUtil.removeResult(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryRankRatingImpl.class,
				dmHistoryRankRating.getPrimaryKey());

			clearUniqueFindersCache(dmHistoryRankRating);
		}
	}

	protected void cacheUniqueFindersCache(
		DmHistoryRankRating dmHistoryRankRating) {
		if (dmHistoryRankRating.isNew()) {
			Object[] args = new Object[] {
					dmHistoryRankRating.getRankCode(),
					dmHistoryRankRating.getSyncVersion()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_RANKCODEANDSYNCVERSION,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RANKCODEANDSYNCVERSION,
				args, dmHistoryRankRating);
		}
		else {
			DmHistoryRankRatingModelImpl dmHistoryRankRatingModelImpl = (DmHistoryRankRatingModelImpl)dmHistoryRankRating;

			if ((dmHistoryRankRatingModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_RANKCODEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryRankRating.getRankCode(),
						dmHistoryRankRating.getSyncVersion()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_RANKCODEANDSYNCVERSION,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RANKCODEANDSYNCVERSION,
					args, dmHistoryRankRating);
			}
		}
	}

	protected void clearUniqueFindersCache(
		DmHistoryRankRating dmHistoryRankRating) {
		DmHistoryRankRatingModelImpl dmHistoryRankRatingModelImpl = (DmHistoryRankRatingModelImpl)dmHistoryRankRating;

		Object[] args = new Object[] {
				dmHistoryRankRating.getRankCode(),
				dmHistoryRankRating.getSyncVersion()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RANKCODEANDSYNCVERSION,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_RANKCODEANDSYNCVERSION,
			args);

		if ((dmHistoryRankRatingModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_RANKCODEANDSYNCVERSION.getColumnBitmask()) != 0) {
			args = new Object[] {
					dmHistoryRankRatingModelImpl.getOriginalRankCode(),
					dmHistoryRankRatingModelImpl.getOriginalSyncVersion()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RANKCODEANDSYNCVERSION,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_RANKCODEANDSYNCVERSION,
				args);
		}
	}

	/**
	 * Creates a new dm history rank rating with the primary key. Does not add the dm history rank rating to the database.
	 *
	 * @param id the primary key for the new dm history rank rating
	 * @return the new dm history rank rating
	 */
	@Override
	public DmHistoryRankRating create(int id) {
		DmHistoryRankRating dmHistoryRankRating = new DmHistoryRankRatingImpl();

		dmHistoryRankRating.setNew(true);
		dmHistoryRankRating.setPrimaryKey(id);

		return dmHistoryRankRating;
	}

	/**
	 * Removes the dm history rank rating with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history rank rating
	 * @return the dm history rank rating that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryRankRatingException if a dm history rank rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRankRating remove(int id)
		throws NoSuchDmHistoryRankRatingException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm history rank rating with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history rank rating
	 * @return the dm history rank rating that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryRankRatingException if a dm history rank rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRankRating remove(Serializable primaryKey)
		throws NoSuchDmHistoryRankRatingException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistoryRankRating dmHistoryRankRating = (DmHistoryRankRating)session.get(DmHistoryRankRatingImpl.class,
					primaryKey);

			if (dmHistoryRankRating == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmHistoryRankRatingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmHistoryRankRating);
		}
		catch (NoSuchDmHistoryRankRatingException nsee) {
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
	protected DmHistoryRankRating removeImpl(
		DmHistoryRankRating dmHistoryRankRating) throws SystemException {
		dmHistoryRankRating = toUnwrappedModel(dmHistoryRankRating);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmHistoryRankRating)) {
				dmHistoryRankRating = (DmHistoryRankRating)session.get(DmHistoryRankRatingImpl.class,
						dmHistoryRankRating.getPrimaryKeyObj());
			}

			if (dmHistoryRankRating != null) {
				session.delete(dmHistoryRankRating);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmHistoryRankRating != null) {
			clearCache(dmHistoryRankRating);
		}

		return dmHistoryRankRating;
	}

	@Override
	public DmHistoryRankRating updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryRankRating dmHistoryRankRating)
		throws SystemException {
		dmHistoryRankRating = toUnwrappedModel(dmHistoryRankRating);

		boolean isNew = dmHistoryRankRating.isNew();

		DmHistoryRankRatingModelImpl dmHistoryRankRatingModelImpl = (DmHistoryRankRatingModelImpl)dmHistoryRankRating;

		Session session = null;

		try {
			session = openSession();

			if (dmHistoryRankRating.isNew()) {
				session.save(dmHistoryRankRating);

				dmHistoryRankRating.setNew(false);
			}
			else {
				session.merge(dmHistoryRankRating);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistoryRankRatingModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmHistoryRankRatingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RANKCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryRankRatingModelImpl.getOriginalRankCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RANKCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RANKCODE,
					args);

				args = new Object[] { dmHistoryRankRatingModelImpl.getRankCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RANKCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RANKCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryRankRatingImpl.class, dmHistoryRankRating.getPrimaryKey(),
			dmHistoryRankRating);

		clearUniqueFindersCache(dmHistoryRankRating);
		cacheUniqueFindersCache(dmHistoryRankRating);

		return dmHistoryRankRating;
	}

	protected DmHistoryRankRating toUnwrappedModel(
		DmHistoryRankRating dmHistoryRankRating) {
		if (dmHistoryRankRating instanceof DmHistoryRankRatingImpl) {
			return dmHistoryRankRating;
		}

		DmHistoryRankRatingImpl dmHistoryRankRatingImpl = new DmHistoryRankRatingImpl();

		dmHistoryRankRatingImpl.setNew(dmHistoryRankRating.isNew());
		dmHistoryRankRatingImpl.setPrimaryKey(dmHistoryRankRating.getPrimaryKey());

		dmHistoryRankRatingImpl.setId(dmHistoryRankRating.getId());
		dmHistoryRankRatingImpl.setRankCode(dmHistoryRankRating.getRankCode());
		dmHistoryRankRatingImpl.setRankName(dmHistoryRankRating.getRankName());
		dmHistoryRankRatingImpl.setRankNameVN(dmHistoryRankRating.getRankNameVN());
		dmHistoryRankRatingImpl.setRankOrder(dmHistoryRankRating.getRankOrder());
		dmHistoryRankRatingImpl.setIsDelete(dmHistoryRankRating.getIsDelete());
		dmHistoryRankRatingImpl.setMarkedAsDelete(dmHistoryRankRating.getMarkedAsDelete());
		dmHistoryRankRatingImpl.setModifiedDate(dmHistoryRankRating.getModifiedDate());
		dmHistoryRankRatingImpl.setRequestedDate(dmHistoryRankRating.getRequestedDate());
		dmHistoryRankRatingImpl.setSyncVersion(dmHistoryRankRating.getSyncVersion());

		return dmHistoryRankRatingImpl;
	}

	/**
	 * Returns the dm history rank rating with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history rank rating
	 * @return the dm history rank rating
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryRankRatingException if a dm history rank rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRankRating findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmHistoryRankRatingException, SystemException {
		DmHistoryRankRating dmHistoryRankRating = fetchByPrimaryKey(primaryKey);

		if (dmHistoryRankRating == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmHistoryRankRatingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmHistoryRankRating;
	}

	/**
	 * Returns the dm history rank rating with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryRankRatingException} if it could not be found.
	 *
	 * @param id the primary key of the dm history rank rating
	 * @return the dm history rank rating
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryRankRatingException if a dm history rank rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRankRating findByPrimaryKey(int id)
		throws NoSuchDmHistoryRankRatingException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm history rank rating with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history rank rating
	 * @return the dm history rank rating, or <code>null</code> if a dm history rank rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRankRating fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmHistoryRankRating dmHistoryRankRating = (DmHistoryRankRating)EntityCacheUtil.getResult(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryRankRatingImpl.class, primaryKey);

		if (dmHistoryRankRating == _nullDmHistoryRankRating) {
			return null;
		}

		if (dmHistoryRankRating == null) {
			Session session = null;

			try {
				session = openSession();

				dmHistoryRankRating = (DmHistoryRankRating)session.get(DmHistoryRankRatingImpl.class,
						primaryKey);

				if (dmHistoryRankRating != null) {
					cacheResult(dmHistoryRankRating);
				}
				else {
					EntityCacheUtil.putResult(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryRankRatingImpl.class, primaryKey,
						_nullDmHistoryRankRating);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmHistoryRankRatingModelImpl.ENTITY_CACHE_ENABLED,
					DmHistoryRankRatingImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmHistoryRankRating;
	}

	/**
	 * Returns the dm history rank rating with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history rank rating
	 * @return the dm history rank rating, or <code>null</code> if a dm history rank rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryRankRating fetchByPrimaryKey(int id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm history rank ratings.
	 *
	 * @return the dm history rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryRankRating> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history rank ratings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryRankRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history rank ratings
	 * @param end the upper bound of the range of dm history rank ratings (not inclusive)
	 * @return the range of dm history rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryRankRating> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history rank ratings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryRankRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history rank ratings
	 * @param end the upper bound of the range of dm history rank ratings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history rank ratings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryRankRating> findAll(int start, int end,
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

		List<DmHistoryRankRating> list = (List<DmHistoryRankRating>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYRANKRATING);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYRANKRATING;

				if (pagination) {
					sql = sql.concat(DmHistoryRankRatingModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmHistoryRankRating>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryRankRating>(list);
				}
				else {
					list = (List<DmHistoryRankRating>)QueryUtil.list(q,
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
	 * Removes all the dm history rank ratings from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmHistoryRankRating dmHistoryRankRating : findAll()) {
			remove(dmHistoryRankRating);
		}
	}

	/**
	 * Returns the number of dm history rank ratings.
	 *
	 * @return the number of dm history rank ratings
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

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYRANKRATING);

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
	 * Initializes the dm history rank rating persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmHistoryRankRating")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistoryRankRating>> listenersList = new ArrayList<ModelListener<DmHistoryRankRating>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistoryRankRating>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmHistoryRankRatingImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMHISTORYRANKRATING = "SELECT dmHistoryRankRating FROM DmHistoryRankRating dmHistoryRankRating";
	private static final String _SQL_SELECT_DMHISTORYRANKRATING_WHERE = "SELECT dmHistoryRankRating FROM DmHistoryRankRating dmHistoryRankRating WHERE ";
	private static final String _SQL_COUNT_DMHISTORYRANKRATING = "SELECT COUNT(dmHistoryRankRating) FROM DmHistoryRankRating dmHistoryRankRating";
	private static final String _SQL_COUNT_DMHISTORYRANKRATING_WHERE = "SELECT COUNT(dmHistoryRankRating) FROM DmHistoryRankRating dmHistoryRankRating WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistoryRankRating.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistoryRankRating exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistoryRankRating exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistoryRankRatingPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"rankCode", "rankName", "rankNameVN", "rankOrder", "isDelete",
				"markedAsDelete", "modifiedDate", "requestedDate", "syncVersion"
			});
	private static DmHistoryRankRating _nullDmHistoryRankRating = new DmHistoryRankRatingImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistoryRankRating> toCacheModel() {
				return _nullDmHistoryRankRatingCacheModel;
			}
		};

	private static CacheModel<DmHistoryRankRating> _nullDmHistoryRankRatingCacheModel =
		new CacheModel<DmHistoryRankRating>() {
			@Override
			public DmHistoryRankRating toEntityModel() {
				return _nullDmHistoryRankRating;
			}
		};
}