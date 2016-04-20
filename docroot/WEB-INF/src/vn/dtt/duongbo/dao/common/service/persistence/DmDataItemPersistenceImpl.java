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

package vn.dtt.duongbo.dao.common.service.persistence;

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

import vn.dtt.duongbo.dao.common.NoSuchDmDataItemException;
import vn.dtt.duongbo.dao.common.model.DmDataItem;
import vn.dtt.duongbo.dao.common.model.impl.DmDataItemImpl;
import vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm data item service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmDataItemPersistence
 * @see DmDataItemUtil
 * @generated
 */
public class DmDataItemPersistenceImpl extends BasePersistenceImpl<DmDataItem>
	implements DmDataItemPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmDataItemUtil} to access the dm data item persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmDataItemImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DATAGROUPIDANDLEVEL =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDataGroupIdAndLevel",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDLEVEL =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDataGroupIdAndLevel",
			new String[] { Long.class.getName(), Integer.class.getName() },
			DmDataItemModelImpl.DATAGROUPID_COLUMN_BITMASK |
			DmDataItemModelImpl.LEVEL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DATAGROUPIDANDLEVEL = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDataGroupIdAndLevel",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the dm data items where dataGroupId = &#63; and level = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param level the level
	 * @return the matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByDataGroupIdAndLevel(long dataGroupId,
		int level) throws SystemException {
		return findByDataGroupIdAndLevel(dataGroupId, level, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm data items where dataGroupId = &#63; and level = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dataGroupId the data group ID
	 * @param level the level
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @return the range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByDataGroupIdAndLevel(long dataGroupId,
		int level, int start, int end) throws SystemException {
		return findByDataGroupIdAndLevel(dataGroupId, level, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm data items where dataGroupId = &#63; and level = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dataGroupId the data group ID
	 * @param level the level
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByDataGroupIdAndLevel(long dataGroupId,
		int level, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDLEVEL;
			finderArgs = new Object[] { dataGroupId, level };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DATAGROUPIDANDLEVEL;
			finderArgs = new Object[] {
					dataGroupId, level,
					
					start, end, orderByComparator
				};
		}

		List<DmDataItem> list = (List<DmDataItem>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmDataItem dmDataItem : list) {
				if ((dataGroupId != dmDataItem.getDataGroupId()) ||
						(level != dmDataItem.getLevel())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVEL_DATAGROUPID_2);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVEL_LEVEL_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dataGroupId);

				qPos.add(level);

				if (!pagination) {
					list = (List<DmDataItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmDataItem>(list);
				}
				else {
					list = (List<DmDataItem>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm data item in the ordered set where dataGroupId = &#63; and level = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param level the level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item
	 * @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByDataGroupIdAndLevel_First(long dataGroupId,
		int level, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByDataGroupIdAndLevel_First(dataGroupId,
				level, orderByComparator);

		if (dmDataItem != null) {
			return dmDataItem;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dataGroupId=");
		msg.append(dataGroupId);

		msg.append(", level=");
		msg.append(level);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmDataItemException(msg.toString());
	}

	/**
	 * Returns the first dm data item in the ordered set where dataGroupId = &#63; and level = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param level the level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByDataGroupIdAndLevel_First(long dataGroupId,
		int level, OrderByComparator orderByComparator)
		throws SystemException {
		List<DmDataItem> list = findByDataGroupIdAndLevel(dataGroupId, level,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm data item in the ordered set where dataGroupId = &#63; and level = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param level the level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item
	 * @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByDataGroupIdAndLevel_Last(long dataGroupId,
		int level, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByDataGroupIdAndLevel_Last(dataGroupId,
				level, orderByComparator);

		if (dmDataItem != null) {
			return dmDataItem;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dataGroupId=");
		msg.append(dataGroupId);

		msg.append(", level=");
		msg.append(level);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmDataItemException(msg.toString());
	}

	/**
	 * Returns the last dm data item in the ordered set where dataGroupId = &#63; and level = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param level the level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByDataGroupIdAndLevel_Last(long dataGroupId,
		int level, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByDataGroupIdAndLevel(dataGroupId, level);

		if (count == 0) {
			return null;
		}

		List<DmDataItem> list = findByDataGroupIdAndLevel(dataGroupId, level,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm data items before and after the current dm data item in the ordered set where dataGroupId = &#63; and level = &#63;.
	 *
	 * @param id the primary key of the current dm data item
	 * @param dataGroupId the data group ID
	 * @param level the level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm data item
	 * @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem[] findByDataGroupIdAndLevel_PrevAndNext(long id,
		long dataGroupId, int level, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmDataItem[] array = new DmDataItemImpl[3];

			array[0] = getByDataGroupIdAndLevel_PrevAndNext(session,
					dmDataItem, dataGroupId, level, orderByComparator, true);

			array[1] = dmDataItem;

			array[2] = getByDataGroupIdAndLevel_PrevAndNext(session,
					dmDataItem, dataGroupId, level, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmDataItem getByDataGroupIdAndLevel_PrevAndNext(Session session,
		DmDataItem dmDataItem, long dataGroupId, int level,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMDATAITEM_WHERE);

		query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVEL_DATAGROUPID_2);

		query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVEL_LEVEL_2);

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
			query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dataGroupId);

		qPos.add(level);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmDataItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmDataItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm data items where dataGroupId = &#63; and level = &#63; from the database.
	 *
	 * @param dataGroupId the data group ID
	 * @param level the level
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDataGroupIdAndLevel(long dataGroupId, int level)
		throws SystemException {
		for (DmDataItem dmDataItem : findByDataGroupIdAndLevel(dataGroupId,
				level, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmDataItem);
		}
	}

	/**
	 * Returns the number of dm data items where dataGroupId = &#63; and level = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param level the level
	 * @return the number of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDataGroupIdAndLevel(long dataGroupId, int level)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DATAGROUPIDANDLEVEL;

		Object[] finderArgs = new Object[] { dataGroupId, level };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVEL_DATAGROUPID_2);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVEL_LEVEL_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dataGroupId);

				qPos.add(level);

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

	private static final String _FINDER_COLUMN_DATAGROUPIDANDLEVEL_DATAGROUPID_2 =
		"dmDataItem.dataGroupId = ? AND ";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDLEVEL_LEVEL_2 = "dmDataItem.level = ? AND  dmDataItem.status = 1 ";
	public static final FinderPath FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODE = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByDataGroupIdAndCode",
			new String[] { Long.class.getName(), String.class.getName() },
			DmDataItemModelImpl.DATAGROUPID_COLUMN_BITMASK |
			DmDataItemModelImpl.CODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DATAGROUPIDANDCODE = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDataGroupIdAndCode",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the dm data item where dataGroupId = &#63; and code = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchDmDataItemException} if it could not be found.
	 *
	 * @param dataGroupId the data group ID
	 * @param code the code
	 * @return the matching dm data item
	 * @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByDataGroupIdAndCode(long dataGroupId, String code)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByDataGroupIdAndCode(dataGroupId, code);

		if (dmDataItem == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("dataGroupId=");
			msg.append(dataGroupId);

			msg.append(", code=");
			msg.append(code);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmDataItemException(msg.toString());
		}

		return dmDataItem;
	}

	/**
	 * Returns the dm data item where dataGroupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param dataGroupId the data group ID
	 * @param code the code
	 * @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByDataGroupIdAndCode(long dataGroupId, String code)
		throws SystemException {
		return fetchByDataGroupIdAndCode(dataGroupId, code, true);
	}

	/**
	 * Returns the dm data item where dataGroupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param dataGroupId the data group ID
	 * @param code the code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByDataGroupIdAndCode(long dataGroupId, String code,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { dataGroupId, code };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODE,
					finderArgs, this);
		}

		if (result instanceof DmDataItem) {
			DmDataItem dmDataItem = (DmDataItem)result;

			if ((dataGroupId != dmDataItem.getDataGroupId()) ||
					!Validator.equals(code, dmDataItem.getCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE_DATAGROUPID_2);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE_CODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dataGroupId);

				if (bindCode) {
					qPos.add(code);
				}

				List<DmDataItem> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmDataItemPersistenceImpl.fetchByDataGroupIdAndCode(long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmDataItem dmDataItem = list.get(0);

					result = dmDataItem;

					cacheResult(dmDataItem);

					if ((dmDataItem.getDataGroupId() != dataGroupId) ||
							(dmDataItem.getCode() == null) ||
							!dmDataItem.getCode().equals(code)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODE,
							finderArgs, dmDataItem);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODE,
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
			return (DmDataItem)result;
		}
	}

	/**
	 * Removes the dm data item where dataGroupId = &#63; and code = &#63; from the database.
	 *
	 * @param dataGroupId the data group ID
	 * @param code the code
	 * @return the dm data item that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem removeByDataGroupIdAndCode(long dataGroupId, String code)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = findByDataGroupIdAndCode(dataGroupId, code);

		return remove(dmDataItem);
	}

	/**
	 * Returns the number of dm data items where dataGroupId = &#63; and code = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param code the code
	 * @return the number of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDataGroupIdAndCode(long dataGroupId, String code)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DATAGROUPIDANDCODE;

		Object[] finderArgs = new Object[] { dataGroupId, code };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE_DATAGROUPID_2);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE_CODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dataGroupId);

				if (bindCode) {
					qPos.add(code);
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

	private static final String _FINDER_COLUMN_DATAGROUPIDANDCODE_DATAGROUPID_2 = "dmDataItem.dataGroupId = ? AND ";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDCODE_CODE_1 = "dmDataItem.code IS NULL AND  dmDataItem.status = 1 ";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDCODE_CODE_2 = "dmDataItem.code = ? AND  dmDataItem.status = 1 ";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDCODE_CODE_3 = "(dmDataItem.code IS NULL OR dmDataItem.code = '') AND  dmDataItem.status = 1 ";
	public static final FinderPath FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODESTATUS =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByDataGroupIdAndCodeStatus",
			new String[] { Long.class.getName(), String.class.getName() },
			DmDataItemModelImpl.DATAGROUPID_COLUMN_BITMASK |
			DmDataItemModelImpl.CODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DATAGROUPIDANDCODESTATUS =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDataGroupIdAndCodeStatus",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the dm data item where dataGroupId = &#63; and code = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchDmDataItemException} if it could not be found.
	 *
	 * @param dataGroupId the data group ID
	 * @param code the code
	 * @return the matching dm data item
	 * @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByDataGroupIdAndCodeStatus(long dataGroupId,
		String code) throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByDataGroupIdAndCodeStatus(dataGroupId,
				code);

		if (dmDataItem == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("dataGroupId=");
			msg.append(dataGroupId);

			msg.append(", code=");
			msg.append(code);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmDataItemException(msg.toString());
		}

		return dmDataItem;
	}

	/**
	 * Returns the dm data item where dataGroupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param dataGroupId the data group ID
	 * @param code the code
	 * @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByDataGroupIdAndCodeStatus(long dataGroupId,
		String code) throws SystemException {
		return fetchByDataGroupIdAndCodeStatus(dataGroupId, code, true);
	}

	/**
	 * Returns the dm data item where dataGroupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param dataGroupId the data group ID
	 * @param code the code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByDataGroupIdAndCodeStatus(long dataGroupId,
		String code, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { dataGroupId, code };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODESTATUS,
					finderArgs, this);
		}

		if (result instanceof DmDataItem) {
			DmDataItem dmDataItem = (DmDataItem)result;

			if ((dataGroupId != dmDataItem.getDataGroupId()) ||
					!Validator.equals(code, dmDataItem.getCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDCODESTATUS_DATAGROUPID_2);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDCODESTATUS_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDCODESTATUS_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_DATAGROUPIDANDCODESTATUS_CODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dataGroupId);

				if (bindCode) {
					qPos.add(code);
				}

				List<DmDataItem> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODESTATUS,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmDataItemPersistenceImpl.fetchByDataGroupIdAndCodeStatus(long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmDataItem dmDataItem = list.get(0);

					result = dmDataItem;

					cacheResult(dmDataItem);

					if ((dmDataItem.getDataGroupId() != dataGroupId) ||
							(dmDataItem.getCode() == null) ||
							!dmDataItem.getCode().equals(code)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODESTATUS,
							finderArgs, dmDataItem);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODESTATUS,
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
			return (DmDataItem)result;
		}
	}

	/**
	 * Removes the dm data item where dataGroupId = &#63; and code = &#63; from the database.
	 *
	 * @param dataGroupId the data group ID
	 * @param code the code
	 * @return the dm data item that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem removeByDataGroupIdAndCodeStatus(long dataGroupId,
		String code) throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = findByDataGroupIdAndCodeStatus(dataGroupId, code);

		return remove(dmDataItem);
	}

	/**
	 * Returns the number of dm data items where dataGroupId = &#63; and code = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param code the code
	 * @return the number of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDataGroupIdAndCodeStatus(long dataGroupId, String code)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DATAGROUPIDANDCODESTATUS;

		Object[] finderArgs = new Object[] { dataGroupId, code };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDCODESTATUS_DATAGROUPID_2);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDCODESTATUS_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDCODESTATUS_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_DATAGROUPIDANDCODESTATUS_CODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dataGroupId);

				if (bindCode) {
					qPos.add(code);
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

	private static final String _FINDER_COLUMN_DATAGROUPIDANDCODESTATUS_DATAGROUPID_2 =
		"dmDataItem.dataGroupId = ? AND ";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDCODESTATUS_CODE_1 = "dmDataItem.code IS NULL AND  dmDataItem.status = 1 or dmDataItem.status = 0";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDCODESTATUS_CODE_2 = "dmDataItem.code = ? AND  dmDataItem.status = 1 or dmDataItem.status = 0";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDCODESTATUS_CODE_3 = "(dmDataItem.code IS NULL OR dmDataItem.code = '') AND  dmDataItem.status = 1 or dmDataItem.status = 0";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CODEANDSTATUS =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCodeAndStatus",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODEANDSTATUS =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCodeAndStatus",
			new String[] { String.class.getName(), Integer.class.getName() },
			DmDataItemModelImpl.CODE_COLUMN_BITMASK |
			DmDataItemModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CODEANDSTATUS = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCodeAndStatus",
			new String[] { String.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the dm data items where code = &#63; and status = &#63;.
	 *
	 * @param code the code
	 * @param status the status
	 * @return the matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByCodeAndStatus(String code, int status)
		throws SystemException {
		return findByCodeAndStatus(code, status, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm data items where code = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param code the code
	 * @param status the status
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @return the range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByCodeAndStatus(String code, int status,
		int start, int end) throws SystemException {
		return findByCodeAndStatus(code, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm data items where code = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param code the code
	 * @param status the status
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByCodeAndStatus(String code, int status,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODEANDSTATUS;
			finderArgs = new Object[] { code, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CODEANDSTATUS;
			finderArgs = new Object[] {
					code, status,
					
					start, end, orderByComparator
				};
		}

		List<DmDataItem> list = (List<DmDataItem>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmDataItem dmDataItem : list) {
				if (!Validator.equals(code, dmDataItem.getCode()) ||
						(status != dmDataItem.getStatus())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_DMDATAITEM_WHERE);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_CODEANDSTATUS_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODEANDSTATUS_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_CODEANDSTATUS_CODE_2);
			}

			query.append(_FINDER_COLUMN_CODEANDSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(code);
				}

				qPos.add(status);

				if (!pagination) {
					list = (List<DmDataItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmDataItem>(list);
				}
				else {
					list = (List<DmDataItem>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm data item in the ordered set where code = &#63; and status = &#63;.
	 *
	 * @param code the code
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item
	 * @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByCodeAndStatus_First(String code, int status,
		OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByCodeAndStatus_First(code, status,
				orderByComparator);

		if (dmDataItem != null) {
			return dmDataItem;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("code=");
		msg.append(code);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmDataItemException(msg.toString());
	}

	/**
	 * Returns the first dm data item in the ordered set where code = &#63; and status = &#63;.
	 *
	 * @param code the code
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByCodeAndStatus_First(String code, int status,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmDataItem> list = findByCodeAndStatus(code, status, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm data item in the ordered set where code = &#63; and status = &#63;.
	 *
	 * @param code the code
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item
	 * @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByCodeAndStatus_Last(String code, int status,
		OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByCodeAndStatus_Last(code, status,
				orderByComparator);

		if (dmDataItem != null) {
			return dmDataItem;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("code=");
		msg.append(code);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmDataItemException(msg.toString());
	}

	/**
	 * Returns the last dm data item in the ordered set where code = &#63; and status = &#63;.
	 *
	 * @param code the code
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByCodeAndStatus_Last(String code, int status,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCodeAndStatus(code, status);

		if (count == 0) {
			return null;
		}

		List<DmDataItem> list = findByCodeAndStatus(code, status, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm data items before and after the current dm data item in the ordered set where code = &#63; and status = &#63;.
	 *
	 * @param id the primary key of the current dm data item
	 * @param code the code
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm data item
	 * @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem[] findByCodeAndStatus_PrevAndNext(long id, String code,
		int status, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmDataItem[] array = new DmDataItemImpl[3];

			array[0] = getByCodeAndStatus_PrevAndNext(session, dmDataItem,
					code, status, orderByComparator, true);

			array[1] = dmDataItem;

			array[2] = getByCodeAndStatus_PrevAndNext(session, dmDataItem,
					code, status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmDataItem getByCodeAndStatus_PrevAndNext(Session session,
		DmDataItem dmDataItem, String code, int status,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMDATAITEM_WHERE);

		boolean bindCode = false;

		if (code == null) {
			query.append(_FINDER_COLUMN_CODEANDSTATUS_CODE_1);
		}
		else if (code.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CODEANDSTATUS_CODE_3);
		}
		else {
			bindCode = true;

			query.append(_FINDER_COLUMN_CODEANDSTATUS_CODE_2);
		}

		query.append(_FINDER_COLUMN_CODEANDSTATUS_STATUS_2);

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
			query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCode) {
			qPos.add(code);
		}

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmDataItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmDataItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm data items where code = &#63; and status = &#63; from the database.
	 *
	 * @param code the code
	 * @param status the status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCodeAndStatus(String code, int status)
		throws SystemException {
		for (DmDataItem dmDataItem : findByCodeAndStatus(code, status,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmDataItem);
		}
	}

	/**
	 * Returns the number of dm data items where code = &#63; and status = &#63;.
	 *
	 * @param code the code
	 * @param status the status
	 * @return the number of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCodeAndStatus(String code, int status)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CODEANDSTATUS;

		Object[] finderArgs = new Object[] { code, status };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMDATAITEM_WHERE);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_CODEANDSTATUS_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODEANDSTATUS_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_CODEANDSTATUS_CODE_2);
			}

			query.append(_FINDER_COLUMN_CODEANDSTATUS_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(code);
				}

				qPos.add(status);

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

	private static final String _FINDER_COLUMN_CODEANDSTATUS_CODE_1 = "dmDataItem.code IS NULL AND ";
	private static final String _FINDER_COLUMN_CODEANDSTATUS_CODE_2 = "dmDataItem.code = ? AND ";
	private static final String _FINDER_COLUMN_CODEANDSTATUS_CODE_3 = "(dmDataItem.code IS NULL OR dmDataItem.code = '') AND ";
	private static final String _FINDER_COLUMN_CODEANDSTATUS_STATUS_2 = "dmDataItem.status = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DATAGROUPID =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBydataGroupId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPID =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBydataGroupId",
			new String[] { Long.class.getName(), Integer.class.getName() },
			DmDataItemModelImpl.DATAGROUPID_COLUMN_BITMASK |
			DmDataItemModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DATAGROUPID = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBydataGroupId",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the dm data items where dataGroupId = &#63; and status = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param status the status
	 * @return the matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findBydataGroupId(long dataGroupId, int status)
		throws SystemException {
		return findBydataGroupId(dataGroupId, status, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm data items where dataGroupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dataGroupId the data group ID
	 * @param status the status
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @return the range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findBydataGroupId(long dataGroupId, int status,
		int start, int end) throws SystemException {
		return findBydataGroupId(dataGroupId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm data items where dataGroupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dataGroupId the data group ID
	 * @param status the status
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findBydataGroupId(long dataGroupId, int status,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPID;
			finderArgs = new Object[] { dataGroupId, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DATAGROUPID;
			finderArgs = new Object[] {
					dataGroupId, status,
					
					start, end, orderByComparator
				};
		}

		List<DmDataItem> list = (List<DmDataItem>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmDataItem dmDataItem : list) {
				if ((dataGroupId != dmDataItem.getDataGroupId()) ||
						(status != dmDataItem.getStatus())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPID_DATAGROUPID_2);

			query.append(_FINDER_COLUMN_DATAGROUPID_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dataGroupId);

				qPos.add(status);

				if (!pagination) {
					list = (List<DmDataItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmDataItem>(list);
				}
				else {
					list = (List<DmDataItem>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm data item in the ordered set where dataGroupId = &#63; and status = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item
	 * @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findBydataGroupId_First(long dataGroupId, int status,
		OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchBydataGroupId_First(dataGroupId, status,
				orderByComparator);

		if (dmDataItem != null) {
			return dmDataItem;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dataGroupId=");
		msg.append(dataGroupId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmDataItemException(msg.toString());
	}

	/**
	 * Returns the first dm data item in the ordered set where dataGroupId = &#63; and status = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchBydataGroupId_First(long dataGroupId, int status,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmDataItem> list = findBydataGroupId(dataGroupId, status, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm data item in the ordered set where dataGroupId = &#63; and status = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item
	 * @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findBydataGroupId_Last(long dataGroupId, int status,
		OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchBydataGroupId_Last(dataGroupId, status,
				orderByComparator);

		if (dmDataItem != null) {
			return dmDataItem;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dataGroupId=");
		msg.append(dataGroupId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmDataItemException(msg.toString());
	}

	/**
	 * Returns the last dm data item in the ordered set where dataGroupId = &#63; and status = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchBydataGroupId_Last(long dataGroupId, int status,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBydataGroupId(dataGroupId, status);

		if (count == 0) {
			return null;
		}

		List<DmDataItem> list = findBydataGroupId(dataGroupId, status,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm data items before and after the current dm data item in the ordered set where dataGroupId = &#63; and status = &#63;.
	 *
	 * @param id the primary key of the current dm data item
	 * @param dataGroupId the data group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm data item
	 * @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem[] findBydataGroupId_PrevAndNext(long id,
		long dataGroupId, int status, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmDataItem[] array = new DmDataItemImpl[3];

			array[0] = getBydataGroupId_PrevAndNext(session, dmDataItem,
					dataGroupId, status, orderByComparator, true);

			array[1] = dmDataItem;

			array[2] = getBydataGroupId_PrevAndNext(session, dmDataItem,
					dataGroupId, status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmDataItem getBydataGroupId_PrevAndNext(Session session,
		DmDataItem dmDataItem, long dataGroupId, int status,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMDATAITEM_WHERE);

		query.append(_FINDER_COLUMN_DATAGROUPID_DATAGROUPID_2);

		query.append(_FINDER_COLUMN_DATAGROUPID_STATUS_2);

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
			query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dataGroupId);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmDataItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmDataItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm data items where dataGroupId = &#63; and status = &#63; from the database.
	 *
	 * @param dataGroupId the data group ID
	 * @param status the status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBydataGroupId(long dataGroupId, int status)
		throws SystemException {
		for (DmDataItem dmDataItem : findBydataGroupId(dataGroupId, status,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmDataItem);
		}
	}

	/**
	 * Returns the number of dm data items where dataGroupId = &#63; and status = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param status the status
	 * @return the number of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBydataGroupId(long dataGroupId, int status)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DATAGROUPID;

		Object[] finderArgs = new Object[] { dataGroupId, status };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPID_DATAGROUPID_2);

			query.append(_FINDER_COLUMN_DATAGROUPID_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dataGroupId);

				qPos.add(status);

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

	private static final String _FINDER_COLUMN_DATAGROUPID_DATAGROUPID_2 = "dmDataItem.dataGroupId = ? AND ";
	private static final String _FINDER_COLUMN_DATAGROUPID_STATUS_2 = "dmDataItem.status = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_CODE = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByCode",
			new String[] { String.class.getName() },
			DmDataItemModelImpl.CODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CODE = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCode",
			new String[] { String.class.getName() });

	/**
	 * Returns the dm data item where code = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchDmDataItemException} if it could not be found.
	 *
	 * @param code the code
	 * @return the matching dm data item
	 * @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByCode(String code)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByCode(code);

		if (dmDataItem == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("code=");
			msg.append(code);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmDataItemException(msg.toString());
		}

		return dmDataItem;
	}

	/**
	 * Returns the dm data item where code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param code the code
	 * @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByCode(String code) throws SystemException {
		return fetchByCode(code, true);
	}

	/**
	 * Returns the dm data item where code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param code the code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByCode(String code, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { code };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CODE,
					finderArgs, this);
		}

		if (result instanceof DmDataItem) {
			DmDataItem dmDataItem = (DmDataItem)result;

			if (!Validator.equals(code, dmDataItem.getCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DMDATAITEM_WHERE);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_CODE_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODE_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_CODE_CODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(code);
				}

				List<DmDataItem> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmDataItemPersistenceImpl.fetchByCode(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmDataItem dmDataItem = list.get(0);

					result = dmDataItem;

					cacheResult(dmDataItem);

					if ((dmDataItem.getCode() == null) ||
							!dmDataItem.getCode().equals(code)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE,
							finderArgs, dmDataItem);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODE,
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
			return (DmDataItem)result;
		}
	}

	/**
	 * Removes the dm data item where code = &#63; from the database.
	 *
	 * @param code the code
	 * @return the dm data item that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem removeByCode(String code)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = findByCode(code);

		return remove(dmDataItem);
	}

	/**
	 * Returns the number of dm data items where code = &#63;.
	 *
	 * @param code the code
	 * @return the number of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCode(String code) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CODE;

		Object[] finderArgs = new Object[] { code };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMDATAITEM_WHERE);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_CODE_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODE_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_CODE_CODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(code);
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

	private static final String _FINDER_COLUMN_CODE_CODE_1 = "dmDataItem.code IS NULL AND  dmDataItem.status = 1 ";
	private static final String _FINDER_COLUMN_CODE_CODE_2 = "dmDataItem.code = ? AND  dmDataItem.status = 1 ";
	private static final String _FINDER_COLUMN_CODE_CODE_3 = "(dmDataItem.code IS NULL OR dmDataItem.code = '') AND  dmDataItem.status = 1 ";
	public static final FinderPath FINDER_PATH_FETCH_BY_CODEANDNOSTATUS = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByCodeAndNoStatus",
			new String[] { String.class.getName() },
			DmDataItemModelImpl.CODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CODEANDNOSTATUS = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCodeAndNoStatus", new String[] { String.class.getName() });

	/**
	 * Returns the dm data item where code = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchDmDataItemException} if it could not be found.
	 *
	 * @param code the code
	 * @return the matching dm data item
	 * @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByCodeAndNoStatus(String code)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByCodeAndNoStatus(code);

		if (dmDataItem == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("code=");
			msg.append(code);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmDataItemException(msg.toString());
		}

		return dmDataItem;
	}

	/**
	 * Returns the dm data item where code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param code the code
	 * @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByCodeAndNoStatus(String code)
		throws SystemException {
		return fetchByCodeAndNoStatus(code, true);
	}

	/**
	 * Returns the dm data item where code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param code the code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByCodeAndNoStatus(String code,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { code };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CODEANDNOSTATUS,
					finderArgs, this);
		}

		if (result instanceof DmDataItem) {
			DmDataItem dmDataItem = (DmDataItem)result;

			if (!Validator.equals(code, dmDataItem.getCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DMDATAITEM_WHERE);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_CODEANDNOSTATUS_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODEANDNOSTATUS_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_CODEANDNOSTATUS_CODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(code);
				}

				List<DmDataItem> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODEANDNOSTATUS,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmDataItemPersistenceImpl.fetchByCodeAndNoStatus(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmDataItem dmDataItem = list.get(0);

					result = dmDataItem;

					cacheResult(dmDataItem);

					if ((dmDataItem.getCode() == null) ||
							!dmDataItem.getCode().equals(code)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODEANDNOSTATUS,
							finderArgs, dmDataItem);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODEANDNOSTATUS,
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
			return (DmDataItem)result;
		}
	}

	/**
	 * Removes the dm data item where code = &#63; from the database.
	 *
	 * @param code the code
	 * @return the dm data item that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem removeByCodeAndNoStatus(String code)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = findByCodeAndNoStatus(code);

		return remove(dmDataItem);
	}

	/**
	 * Returns the number of dm data items where code = &#63;.
	 *
	 * @param code the code
	 * @return the number of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCodeAndNoStatus(String code) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CODEANDNOSTATUS;

		Object[] finderArgs = new Object[] { code };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMDATAITEM_WHERE);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_CODEANDNOSTATUS_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODEANDNOSTATUS_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_CODEANDNOSTATUS_CODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(code);
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

	private static final String _FINDER_COLUMN_CODEANDNOSTATUS_CODE_1 = "dmDataItem.code IS NULL";
	private static final String _FINDER_COLUMN_CODEANDNOSTATUS_CODE_2 = "dmDataItem.code = ?";
	private static final String _FINDER_COLUMN_CODEANDNOSTATUS_CODE_3 = "(dmDataItem.code IS NULL OR dmDataItem.code = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CODEANDLEVEL =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCodeAndLevel",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODEANDLEVEL =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCodeAndLevel",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			DmDataItemModelImpl.CODE_COLUMN_BITMASK |
			DmDataItemModelImpl.LEVEL_COLUMN_BITMASK |
			DmDataItemModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CODEANDLEVEL = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCodeAndLevel",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the dm data items where code = &#63; and level = &#63; and status = &#63;.
	 *
	 * @param code the code
	 * @param level the level
	 * @param status the status
	 * @return the matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByCodeAndLevel(String code, int level,
		int status) throws SystemException {
		return findByCodeAndLevel(code, level, status, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm data items where code = &#63; and level = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param code the code
	 * @param level the level
	 * @param status the status
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @return the range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByCodeAndLevel(String code, int level,
		int status, int start, int end) throws SystemException {
		return findByCodeAndLevel(code, level, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm data items where code = &#63; and level = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param code the code
	 * @param level the level
	 * @param status the status
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByCodeAndLevel(String code, int level,
		int status, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODEANDLEVEL;
			finderArgs = new Object[] { code, level, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CODEANDLEVEL;
			finderArgs = new Object[] {
					code, level, status,
					
					start, end, orderByComparator
				};
		}

		List<DmDataItem> list = (List<DmDataItem>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmDataItem dmDataItem : list) {
				if (!Validator.equals(code, dmDataItem.getCode()) ||
						(level != dmDataItem.getLevel()) ||
						(status != dmDataItem.getStatus())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_DMDATAITEM_WHERE);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_CODEANDLEVEL_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODEANDLEVEL_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_CODEANDLEVEL_CODE_2);
			}

			query.append(_FINDER_COLUMN_CODEANDLEVEL_LEVEL_2);

			query.append(_FINDER_COLUMN_CODEANDLEVEL_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(code);
				}

				qPos.add(level);

				qPos.add(status);

				if (!pagination) {
					list = (List<DmDataItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmDataItem>(list);
				}
				else {
					list = (List<DmDataItem>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm data item in the ordered set where code = &#63; and level = &#63; and status = &#63;.
	 *
	 * @param code the code
	 * @param level the level
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item
	 * @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByCodeAndLevel_First(String code, int level,
		int status, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByCodeAndLevel_First(code, level, status,
				orderByComparator);

		if (dmDataItem != null) {
			return dmDataItem;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("code=");
		msg.append(code);

		msg.append(", level=");
		msg.append(level);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmDataItemException(msg.toString());
	}

	/**
	 * Returns the first dm data item in the ordered set where code = &#63; and level = &#63; and status = &#63;.
	 *
	 * @param code the code
	 * @param level the level
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByCodeAndLevel_First(String code, int level,
		int status, OrderByComparator orderByComparator)
		throws SystemException {
		List<DmDataItem> list = findByCodeAndLevel(code, level, status, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm data item in the ordered set where code = &#63; and level = &#63; and status = &#63;.
	 *
	 * @param code the code
	 * @param level the level
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item
	 * @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByCodeAndLevel_Last(String code, int level,
		int status, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByCodeAndLevel_Last(code, level, status,
				orderByComparator);

		if (dmDataItem != null) {
			return dmDataItem;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("code=");
		msg.append(code);

		msg.append(", level=");
		msg.append(level);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmDataItemException(msg.toString());
	}

	/**
	 * Returns the last dm data item in the ordered set where code = &#63; and level = &#63; and status = &#63;.
	 *
	 * @param code the code
	 * @param level the level
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByCodeAndLevel_Last(String code, int level,
		int status, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByCodeAndLevel(code, level, status);

		if (count == 0) {
			return null;
		}

		List<DmDataItem> list = findByCodeAndLevel(code, level, status,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm data items before and after the current dm data item in the ordered set where code = &#63; and level = &#63; and status = &#63;.
	 *
	 * @param id the primary key of the current dm data item
	 * @param code the code
	 * @param level the level
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm data item
	 * @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem[] findByCodeAndLevel_PrevAndNext(long id, String code,
		int level, int status, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmDataItem[] array = new DmDataItemImpl[3];

			array[0] = getByCodeAndLevel_PrevAndNext(session, dmDataItem, code,
					level, status, orderByComparator, true);

			array[1] = dmDataItem;

			array[2] = getByCodeAndLevel_PrevAndNext(session, dmDataItem, code,
					level, status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmDataItem getByCodeAndLevel_PrevAndNext(Session session,
		DmDataItem dmDataItem, String code, int level, int status,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMDATAITEM_WHERE);

		boolean bindCode = false;

		if (code == null) {
			query.append(_FINDER_COLUMN_CODEANDLEVEL_CODE_1);
		}
		else if (code.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CODEANDLEVEL_CODE_3);
		}
		else {
			bindCode = true;

			query.append(_FINDER_COLUMN_CODEANDLEVEL_CODE_2);
		}

		query.append(_FINDER_COLUMN_CODEANDLEVEL_LEVEL_2);

		query.append(_FINDER_COLUMN_CODEANDLEVEL_STATUS_2);

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
			query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCode) {
			qPos.add(code);
		}

		qPos.add(level);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmDataItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmDataItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm data items where code = &#63; and level = &#63; and status = &#63; from the database.
	 *
	 * @param code the code
	 * @param level the level
	 * @param status the status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCodeAndLevel(String code, int level, int status)
		throws SystemException {
		for (DmDataItem dmDataItem : findByCodeAndLevel(code, level, status,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmDataItem);
		}
	}

	/**
	 * Returns the number of dm data items where code = &#63; and level = &#63; and status = &#63;.
	 *
	 * @param code the code
	 * @param level the level
	 * @param status the status
	 * @return the number of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCodeAndLevel(String code, int level, int status)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CODEANDLEVEL;

		Object[] finderArgs = new Object[] { code, level, status };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DMDATAITEM_WHERE);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_CODEANDLEVEL_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODEANDLEVEL_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_CODEANDLEVEL_CODE_2);
			}

			query.append(_FINDER_COLUMN_CODEANDLEVEL_LEVEL_2);

			query.append(_FINDER_COLUMN_CODEANDLEVEL_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(code);
				}

				qPos.add(level);

				qPos.add(status);

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

	private static final String _FINDER_COLUMN_CODEANDLEVEL_CODE_1 = "dmDataItem.code IS NULL AND ";
	private static final String _FINDER_COLUMN_CODEANDLEVEL_CODE_2 = "dmDataItem.code = ? AND ";
	private static final String _FINDER_COLUMN_CODEANDLEVEL_CODE_3 = "(dmDataItem.code IS NULL OR dmDataItem.code = '') AND ";
	private static final String _FINDER_COLUMN_CODEANDLEVEL_LEVEL_2 = "dmDataItem.level = ? AND ";
	private static final String _FINDER_COLUMN_CODEANDLEVEL_STATUS_2 = "dmDataItem.status = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CODEANDNODE1 =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCodeAndNode1",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODEANDNODE1 =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCodeAndNode1",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName()
			},
			DmDataItemModelImpl.CODE_COLUMN_BITMASK |
			DmDataItemModelImpl.NODE1_COLUMN_BITMASK |
			DmDataItemModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CODEANDNODE1 = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCodeAndNode1",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the dm data items where code = &#63; and node1 = &#63; and status = &#63;.
	 *
	 * @param code the code
	 * @param node1 the node1
	 * @param status the status
	 * @return the matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByCodeAndNode1(String code, String node1,
		int status) throws SystemException {
		return findByCodeAndNode1(code, node1, status, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm data items where code = &#63; and node1 = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param code the code
	 * @param node1 the node1
	 * @param status the status
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @return the range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByCodeAndNode1(String code, String node1,
		int status, int start, int end) throws SystemException {
		return findByCodeAndNode1(code, node1, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm data items where code = &#63; and node1 = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param code the code
	 * @param node1 the node1
	 * @param status the status
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByCodeAndNode1(String code, String node1,
		int status, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODEANDNODE1;
			finderArgs = new Object[] { code, node1, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CODEANDNODE1;
			finderArgs = new Object[] {
					code, node1, status,
					
					start, end, orderByComparator
				};
		}

		List<DmDataItem> list = (List<DmDataItem>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmDataItem dmDataItem : list) {
				if (!Validator.equals(code, dmDataItem.getCode()) ||
						!Validator.equals(node1, dmDataItem.getNode1()) ||
						(status != dmDataItem.getStatus())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_DMDATAITEM_WHERE);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_CODEANDNODE1_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODEANDNODE1_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_CODEANDNODE1_CODE_2);
			}

			boolean bindNode1 = false;

			if (node1 == null) {
				query.append(_FINDER_COLUMN_CODEANDNODE1_NODE1_1);
			}
			else if (node1.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODEANDNODE1_NODE1_3);
			}
			else {
				bindNode1 = true;

				query.append(_FINDER_COLUMN_CODEANDNODE1_NODE1_2);
			}

			query.append(_FINDER_COLUMN_CODEANDNODE1_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(code);
				}

				if (bindNode1) {
					qPos.add(node1);
				}

				qPos.add(status);

				if (!pagination) {
					list = (List<DmDataItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmDataItem>(list);
				}
				else {
					list = (List<DmDataItem>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm data item in the ordered set where code = &#63; and node1 = &#63; and status = &#63;.
	 *
	 * @param code the code
	 * @param node1 the node1
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item
	 * @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByCodeAndNode1_First(String code, String node1,
		int status, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByCodeAndNode1_First(code, node1, status,
				orderByComparator);

		if (dmDataItem != null) {
			return dmDataItem;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("code=");
		msg.append(code);

		msg.append(", node1=");
		msg.append(node1);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmDataItemException(msg.toString());
	}

	/**
	 * Returns the first dm data item in the ordered set where code = &#63; and node1 = &#63; and status = &#63;.
	 *
	 * @param code the code
	 * @param node1 the node1
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByCodeAndNode1_First(String code, String node1,
		int status, OrderByComparator orderByComparator)
		throws SystemException {
		List<DmDataItem> list = findByCodeAndNode1(code, node1, status, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm data item in the ordered set where code = &#63; and node1 = &#63; and status = &#63;.
	 *
	 * @param code the code
	 * @param node1 the node1
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item
	 * @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByCodeAndNode1_Last(String code, String node1,
		int status, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByCodeAndNode1_Last(code, node1, status,
				orderByComparator);

		if (dmDataItem != null) {
			return dmDataItem;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("code=");
		msg.append(code);

		msg.append(", node1=");
		msg.append(node1);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmDataItemException(msg.toString());
	}

	/**
	 * Returns the last dm data item in the ordered set where code = &#63; and node1 = &#63; and status = &#63;.
	 *
	 * @param code the code
	 * @param node1 the node1
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByCodeAndNode1_Last(String code, String node1,
		int status, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByCodeAndNode1(code, node1, status);

		if (count == 0) {
			return null;
		}

		List<DmDataItem> list = findByCodeAndNode1(code, node1, status,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm data items before and after the current dm data item in the ordered set where code = &#63; and node1 = &#63; and status = &#63;.
	 *
	 * @param id the primary key of the current dm data item
	 * @param code the code
	 * @param node1 the node1
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm data item
	 * @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem[] findByCodeAndNode1_PrevAndNext(long id, String code,
		String node1, int status, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmDataItem[] array = new DmDataItemImpl[3];

			array[0] = getByCodeAndNode1_PrevAndNext(session, dmDataItem, code,
					node1, status, orderByComparator, true);

			array[1] = dmDataItem;

			array[2] = getByCodeAndNode1_PrevAndNext(session, dmDataItem, code,
					node1, status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmDataItem getByCodeAndNode1_PrevAndNext(Session session,
		DmDataItem dmDataItem, String code, String node1, int status,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMDATAITEM_WHERE);

		boolean bindCode = false;

		if (code == null) {
			query.append(_FINDER_COLUMN_CODEANDNODE1_CODE_1);
		}
		else if (code.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CODEANDNODE1_CODE_3);
		}
		else {
			bindCode = true;

			query.append(_FINDER_COLUMN_CODEANDNODE1_CODE_2);
		}

		boolean bindNode1 = false;

		if (node1 == null) {
			query.append(_FINDER_COLUMN_CODEANDNODE1_NODE1_1);
		}
		else if (node1.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CODEANDNODE1_NODE1_3);
		}
		else {
			bindNode1 = true;

			query.append(_FINDER_COLUMN_CODEANDNODE1_NODE1_2);
		}

		query.append(_FINDER_COLUMN_CODEANDNODE1_STATUS_2);

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
			query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCode) {
			qPos.add(code);
		}

		if (bindNode1) {
			qPos.add(node1);
		}

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmDataItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmDataItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm data items where code = &#63; and node1 = &#63; and status = &#63; from the database.
	 *
	 * @param code the code
	 * @param node1 the node1
	 * @param status the status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCodeAndNode1(String code, String node1, int status)
		throws SystemException {
		for (DmDataItem dmDataItem : findByCodeAndNode1(code, node1, status,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmDataItem);
		}
	}

	/**
	 * Returns the number of dm data items where code = &#63; and node1 = &#63; and status = &#63;.
	 *
	 * @param code the code
	 * @param node1 the node1
	 * @param status the status
	 * @return the number of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCodeAndNode1(String code, String node1, int status)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CODEANDNODE1;

		Object[] finderArgs = new Object[] { code, node1, status };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DMDATAITEM_WHERE);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_CODEANDNODE1_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODEANDNODE1_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_CODEANDNODE1_CODE_2);
			}

			boolean bindNode1 = false;

			if (node1 == null) {
				query.append(_FINDER_COLUMN_CODEANDNODE1_NODE1_1);
			}
			else if (node1.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODEANDNODE1_NODE1_3);
			}
			else {
				bindNode1 = true;

				query.append(_FINDER_COLUMN_CODEANDNODE1_NODE1_2);
			}

			query.append(_FINDER_COLUMN_CODEANDNODE1_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(code);
				}

				if (bindNode1) {
					qPos.add(node1);
				}

				qPos.add(status);

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

	private static final String _FINDER_COLUMN_CODEANDNODE1_CODE_1 = "dmDataItem.code IS NULL AND ";
	private static final String _FINDER_COLUMN_CODEANDNODE1_CODE_2 = "dmDataItem.code = ? AND ";
	private static final String _FINDER_COLUMN_CODEANDNODE1_CODE_3 = "(dmDataItem.code IS NULL OR dmDataItem.code = '') AND ";
	private static final String _FINDER_COLUMN_CODEANDNODE1_NODE1_1 = "dmDataItem.node1 IS NULL AND ";
	private static final String _FINDER_COLUMN_CODEANDNODE1_NODE1_2 = "dmDataItem.node1 = ? AND ";
	private static final String _FINDER_COLUMN_CODEANDNODE1_NODE1_3 = "(dmDataItem.node1 IS NULL OR dmDataItem.node1 = '') AND ";
	private static final String _FINDER_COLUMN_CODEANDNODE1_STATUS_2 = "dmDataItem.status = ?";

	public DmDataItemPersistenceImpl() {
		setModelClass(DmDataItem.class);
	}

	/**
	 * Caches the dm data item in the entity cache if it is enabled.
	 *
	 * @param dmDataItem the dm data item
	 */
	@Override
	public void cacheResult(DmDataItem dmDataItem) {
		EntityCacheUtil.putResult(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemImpl.class, dmDataItem.getPrimaryKey(), dmDataItem);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODE,
			new Object[] { dmDataItem.getDataGroupId(), dmDataItem.getCode() },
			dmDataItem);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODESTATUS,
			new Object[] { dmDataItem.getDataGroupId(), dmDataItem.getCode() },
			dmDataItem);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE,
			new Object[] { dmDataItem.getCode() }, dmDataItem);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODEANDNOSTATUS,
			new Object[] { dmDataItem.getCode() }, dmDataItem);

		dmDataItem.resetOriginalValues();
	}

	/**
	 * Caches the dm data items in the entity cache if it is enabled.
	 *
	 * @param dmDataItems the dm data items
	 */
	@Override
	public void cacheResult(List<DmDataItem> dmDataItems) {
		for (DmDataItem dmDataItem : dmDataItems) {
			if (EntityCacheUtil.getResult(
						DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
						DmDataItemImpl.class, dmDataItem.getPrimaryKey()) == null) {
				cacheResult(dmDataItem);
			}
			else {
				dmDataItem.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm data items.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmDataItemImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmDataItemImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm data item.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmDataItem dmDataItem) {
		EntityCacheUtil.removeResult(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemImpl.class, dmDataItem.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmDataItem);
	}

	@Override
	public void clearCache(List<DmDataItem> dmDataItems) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmDataItem dmDataItem : dmDataItems) {
			EntityCacheUtil.removeResult(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
				DmDataItemImpl.class, dmDataItem.getPrimaryKey());

			clearUniqueFindersCache(dmDataItem);
		}
	}

	protected void cacheUniqueFindersCache(DmDataItem dmDataItem) {
		if (dmDataItem.isNew()) {
			Object[] args = new Object[] {
					dmDataItem.getDataGroupId(), dmDataItem.getCode()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDCODE,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODE,
				args, dmDataItem);

			args = new Object[] {
					dmDataItem.getDataGroupId(), dmDataItem.getCode()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDCODESTATUS,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODESTATUS,
				args, dmDataItem);

			args = new Object[] { dmDataItem.getCode() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CODE, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE, args,
				dmDataItem);

			args = new Object[] { dmDataItem.getCode() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CODEANDNOSTATUS,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODEANDNOSTATUS,
				args, dmDataItem);
		}
		else {
			DmDataItemModelImpl dmDataItemModelImpl = (DmDataItemModelImpl)dmDataItem;

			if ((dmDataItemModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmDataItem.getDataGroupId(), dmDataItem.getCode()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDCODE,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODE,
					args, dmDataItem);
			}

			if ((dmDataItemModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODESTATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmDataItem.getDataGroupId(), dmDataItem.getCode()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDCODESTATUS,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODESTATUS,
					args, dmDataItem);
			}

			if ((dmDataItemModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { dmDataItem.getCode() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CODE, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE, args,
					dmDataItem);
			}

			if ((dmDataItemModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CODEANDNOSTATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { dmDataItem.getCode() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CODEANDNOSTATUS,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODEANDNOSTATUS,
					args, dmDataItem);
			}
		}
	}

	protected void clearUniqueFindersCache(DmDataItem dmDataItem) {
		DmDataItemModelImpl dmDataItemModelImpl = (DmDataItemModelImpl)dmDataItem;

		Object[] args = new Object[] {
				dmDataItem.getDataGroupId(), dmDataItem.getCode()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDCODE,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODE,
			args);

		if ((dmDataItemModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODE.getColumnBitmask()) != 0) {
			args = new Object[] {
					dmDataItemModelImpl.getOriginalDataGroupId(),
					dmDataItemModelImpl.getOriginalCode()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDCODE,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODE,
				args);
		}

		args = new Object[] { dmDataItem.getDataGroupId(), dmDataItem.getCode() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDCODESTATUS,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODESTATUS,
			args);

		if ((dmDataItemModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODESTATUS.getColumnBitmask()) != 0) {
			args = new Object[] {
					dmDataItemModelImpl.getOriginalDataGroupId(),
					dmDataItemModelImpl.getOriginalCode()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDCODESTATUS,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DATAGROUPIDANDCODESTATUS,
				args);
		}

		args = new Object[] { dmDataItem.getCode() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODE, args);

		if ((dmDataItemModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CODE.getColumnBitmask()) != 0) {
			args = new Object[] { dmDataItemModelImpl.getOriginalCode() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODE, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODE, args);
		}

		args = new Object[] { dmDataItem.getCode() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODEANDNOSTATUS, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODEANDNOSTATUS, args);

		if ((dmDataItemModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CODEANDNOSTATUS.getColumnBitmask()) != 0) {
			args = new Object[] { dmDataItemModelImpl.getOriginalCode() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODEANDNOSTATUS,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODEANDNOSTATUS,
				args);
		}
	}

	/**
	 * Creates a new dm data item with the primary key. Does not add the dm data item to the database.
	 *
	 * @param id the primary key for the new dm data item
	 * @return the new dm data item
	 */
	@Override
	public DmDataItem create(long id) {
		DmDataItem dmDataItem = new DmDataItemImpl();

		dmDataItem.setNew(true);
		dmDataItem.setPrimaryKey(id);

		return dmDataItem;
	}

	/**
	 * Removes the dm data item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm data item
	 * @return the dm data item that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem remove(long id)
		throws NoSuchDmDataItemException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm data item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm data item
	 * @return the dm data item that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem remove(Serializable primaryKey)
		throws NoSuchDmDataItemException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmDataItem dmDataItem = (DmDataItem)session.get(DmDataItemImpl.class,
					primaryKey);

			if (dmDataItem == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmDataItemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmDataItem);
		}
		catch (NoSuchDmDataItemException nsee) {
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
	protected DmDataItem removeImpl(DmDataItem dmDataItem)
		throws SystemException {
		dmDataItem = toUnwrappedModel(dmDataItem);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmDataItem)) {
				dmDataItem = (DmDataItem)session.get(DmDataItemImpl.class,
						dmDataItem.getPrimaryKeyObj());
			}

			if (dmDataItem != null) {
				session.delete(dmDataItem);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmDataItem != null) {
			clearCache(dmDataItem);
		}

		return dmDataItem;
	}

	@Override
	public DmDataItem updateImpl(
		vn.dtt.duongbo.dao.common.model.DmDataItem dmDataItem)
		throws SystemException {
		dmDataItem = toUnwrappedModel(dmDataItem);

		boolean isNew = dmDataItem.isNew();

		DmDataItemModelImpl dmDataItemModelImpl = (DmDataItemModelImpl)dmDataItem;

		Session session = null;

		try {
			session = openSession();

			if (dmDataItem.isNew()) {
				session.save(dmDataItem);

				dmDataItem.setNew(false);
			}
			else {
				session.merge(dmDataItem);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmDataItemModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmDataItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDLEVEL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmDataItemModelImpl.getOriginalDataGroupId(),
						dmDataItemModelImpl.getOriginalLevel()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDLEVEL,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDLEVEL,
					args);

				args = new Object[] {
						dmDataItemModelImpl.getDataGroupId(),
						dmDataItemModelImpl.getLevel()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDLEVEL,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDLEVEL,
					args);
			}

			if ((dmDataItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODEANDSTATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmDataItemModelImpl.getOriginalCode(),
						dmDataItemModelImpl.getOriginalStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODEANDSTATUS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODEANDSTATUS,
					args);

				args = new Object[] {
						dmDataItemModelImpl.getCode(),
						dmDataItemModelImpl.getStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODEANDSTATUS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODEANDSTATUS,
					args);
			}

			if ((dmDataItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmDataItemModelImpl.getOriginalDataGroupId(),
						dmDataItemModelImpl.getOriginalStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPID,
					args);

				args = new Object[] {
						dmDataItemModelImpl.getDataGroupId(),
						dmDataItemModelImpl.getStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPID,
					args);
			}

			if ((dmDataItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODEANDLEVEL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmDataItemModelImpl.getOriginalCode(),
						dmDataItemModelImpl.getOriginalLevel(),
						dmDataItemModelImpl.getOriginalStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODEANDLEVEL,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODEANDLEVEL,
					args);

				args = new Object[] {
						dmDataItemModelImpl.getCode(),
						dmDataItemModelImpl.getLevel(),
						dmDataItemModelImpl.getStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODEANDLEVEL,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODEANDLEVEL,
					args);
			}

			if ((dmDataItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODEANDNODE1.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmDataItemModelImpl.getOriginalCode(),
						dmDataItemModelImpl.getOriginalNode1(),
						dmDataItemModelImpl.getOriginalStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODEANDNODE1,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODEANDNODE1,
					args);

				args = new Object[] {
						dmDataItemModelImpl.getCode(),
						dmDataItemModelImpl.getNode1(),
						dmDataItemModelImpl.getStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODEANDNODE1,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODEANDNODE1,
					args);
			}
		}

		EntityCacheUtil.putResult(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemImpl.class, dmDataItem.getPrimaryKey(), dmDataItem);

		clearUniqueFindersCache(dmDataItem);
		cacheUniqueFindersCache(dmDataItem);

		return dmDataItem;
	}

	protected DmDataItem toUnwrappedModel(DmDataItem dmDataItem) {
		if (dmDataItem instanceof DmDataItemImpl) {
			return dmDataItem;
		}

		DmDataItemImpl dmDataItemImpl = new DmDataItemImpl();

		dmDataItemImpl.setNew(dmDataItem.isNew());
		dmDataItemImpl.setPrimaryKey(dmDataItem.getPrimaryKey());

		dmDataItemImpl.setId(dmDataItem.getId());
		dmDataItemImpl.setDataGroupId(dmDataItem.getDataGroupId());
		dmDataItemImpl.setCode(dmDataItem.getCode());
		dmDataItemImpl.setNode1(dmDataItem.getNode1());
		dmDataItemImpl.setNode2(dmDataItem.getNode2());
		dmDataItemImpl.setNode3(dmDataItem.getNode3());
		dmDataItemImpl.setNode4(dmDataItem.getNode4());
		dmDataItemImpl.setLevel(dmDataItem.getLevel());
		dmDataItemImpl.setName(dmDataItem.getName());
		dmDataItemImpl.setDescription(dmDataItem.getDescription());
		dmDataItemImpl.setValidatedFrom(dmDataItem.getValidatedFrom());
		dmDataItemImpl.setValidatedTo(dmDataItem.getValidatedTo());
		dmDataItemImpl.setStatus(dmDataItem.getStatus());
		dmDataItemImpl.setOrder(dmDataItem.getOrder());

		return dmDataItemImpl;
	}

	/**
	 * Returns the dm data item with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm data item
	 * @return the dm data item
	 * @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByPrimaryKey(primaryKey);

		if (dmDataItem == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmDataItemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmDataItem;
	}

	/**
	 * Returns the dm data item with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchDmDataItemException} if it could not be found.
	 *
	 * @param id the primary key of the dm data item
	 * @return the dm data item
	 * @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByPrimaryKey(long id)
		throws NoSuchDmDataItemException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm data item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm data item
	 * @return the dm data item, or <code>null</code> if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmDataItem dmDataItem = (DmDataItem)EntityCacheUtil.getResult(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
				DmDataItemImpl.class, primaryKey);

		if (dmDataItem == _nullDmDataItem) {
			return null;
		}

		if (dmDataItem == null) {
			Session session = null;

			try {
				session = openSession();

				dmDataItem = (DmDataItem)session.get(DmDataItemImpl.class,
						primaryKey);

				if (dmDataItem != null) {
					cacheResult(dmDataItem);
				}
				else {
					EntityCacheUtil.putResult(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
						DmDataItemImpl.class, primaryKey, _nullDmDataItem);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
					DmDataItemImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmDataItem;
	}

	/**
	 * Returns the dm data item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm data item
	 * @return the dm data item, or <code>null</code> if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm data items.
	 *
	 * @return the dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm data items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @return the range of dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm data items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findAll(int start, int end,
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

		List<DmDataItem> list = (List<DmDataItem>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMDATAITEM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMDATAITEM;

				if (pagination) {
					sql = sql.concat(DmDataItemModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmDataItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmDataItem>(list);
				}
				else {
					list = (List<DmDataItem>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dm data items from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmDataItem dmDataItem : findAll()) {
			remove(dmDataItem);
		}
	}

	/**
	 * Returns the number of dm data items.
	 *
	 * @return the number of dm data items
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

				Query q = session.createQuery(_SQL_COUNT_DMDATAITEM);

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
	 * Initializes the dm data item persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.common.model.DmDataItem")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmDataItem>> listenersList = new ArrayList<ModelListener<DmDataItem>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmDataItem>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmDataItemImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMDATAITEM = "SELECT dmDataItem FROM DmDataItem dmDataItem";
	private static final String _SQL_SELECT_DMDATAITEM_WHERE = "SELECT dmDataItem FROM DmDataItem dmDataItem WHERE ";
	private static final String _SQL_COUNT_DMDATAITEM = "SELECT COUNT(dmDataItem) FROM DmDataItem dmDataItem";
	private static final String _SQL_COUNT_DMDATAITEM_WHERE = "SELECT COUNT(dmDataItem) FROM DmDataItem dmDataItem WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmDataItem.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmDataItem exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmDataItem exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmDataItemPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"dataGroupId", "node1", "node2", "node3", "node4",
				"validatedFrom", "validatedTo", "order"
			});
	private static DmDataItem _nullDmDataItem = new DmDataItemImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmDataItem> toCacheModel() {
				return _nullDmDataItemCacheModel;
			}
		};

	private static CacheModel<DmDataItem> _nullDmDataItemCacheModel = new CacheModel<DmDataItem>() {
			@Override
			public DmDataItem toEntityModel() {
				return _nullDmDataItem;
			}
		};
}