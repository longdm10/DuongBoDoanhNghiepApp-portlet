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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.duongbien.dao.vrcb.NoSuchDmGtStatusException;
import vn.dtt.duongbien.dao.vrcb.model.DmGtStatus;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmGtStatusImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmGtStatusModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm gt status service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmGtStatusPersistence
 * @see DmGtStatusUtil
 * @generated
 */
public class DmGtStatusPersistenceImpl extends BasePersistenceImpl<DmGtStatus>
	implements DmGtStatusPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmGtStatusUtil} to access the dm gt status persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmGtStatusImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmGtStatusModelImpl.ENTITY_CACHE_ENABLED,
			DmGtStatusModelImpl.FINDER_CACHE_ENABLED, DmGtStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmGtStatusModelImpl.ENTITY_CACHE_ENABLED,
			DmGtStatusModelImpl.FINDER_CACHE_ENABLED, DmGtStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmGtStatusModelImpl.ENTITY_CACHE_ENABLED,
			DmGtStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TYPE = new FinderPath(DmGtStatusModelImpl.ENTITY_CACHE_ENABLED,
			DmGtStatusModelImpl.FINDER_CACHE_ENABLED, DmGtStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByType",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE = new FinderPath(DmGtStatusModelImpl.ENTITY_CACHE_ENABLED,
			DmGtStatusModelImpl.FINDER_CACHE_ENABLED, DmGtStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByType",
			new String[] { Integer.class.getName() },
			DmGtStatusModelImpl.TYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TYPE = new FinderPath(DmGtStatusModelImpl.ENTITY_CACHE_ENABLED,
			DmGtStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByType",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the dm gt statuses where type = &#63;.
	 *
	 * @param type the type
	 * @return the matching dm gt statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGtStatus> findByType(int type) throws SystemException {
		return findByType(type, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm gt statuses where type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param type the type
	 * @param start the lower bound of the range of dm gt statuses
	 * @param end the upper bound of the range of dm gt statuses (not inclusive)
	 * @return the range of matching dm gt statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGtStatus> findByType(int type, int start, int end)
		throws SystemException {
		return findByType(type, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm gt statuses where type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param type the type
	 * @param start the lower bound of the range of dm gt statuses
	 * @param end the upper bound of the range of dm gt statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm gt statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGtStatus> findByType(int type, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE;
			finderArgs = new Object[] { type };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TYPE;
			finderArgs = new Object[] { type, start, end, orderByComparator };
		}

		List<DmGtStatus> list = (List<DmGtStatus>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmGtStatus dmGtStatus : list) {
				if ((type != dmGtStatus.getType())) {
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

			query.append(_SQL_SELECT_DMGTSTATUS_WHERE);

			query.append(_FINDER_COLUMN_TYPE_TYPE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmGtStatusModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(type);

				if (!pagination) {
					list = (List<DmGtStatus>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmGtStatus>(list);
				}
				else {
					list = (List<DmGtStatus>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm gt status in the ordered set where type = &#63;.
	 *
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm gt status
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtStatusException if a matching dm gt status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtStatus findByType_First(int type,
		OrderByComparator orderByComparator)
		throws NoSuchDmGtStatusException, SystemException {
		DmGtStatus dmGtStatus = fetchByType_First(type, orderByComparator);

		if (dmGtStatus != null) {
			return dmGtStatus;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmGtStatusException(msg.toString());
	}

	/**
	 * Returns the first dm gt status in the ordered set where type = &#63;.
	 *
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm gt status, or <code>null</code> if a matching dm gt status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtStatus fetchByType_First(int type,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmGtStatus> list = findByType(type, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm gt status in the ordered set where type = &#63;.
	 *
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm gt status
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtStatusException if a matching dm gt status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtStatus findByType_Last(int type,
		OrderByComparator orderByComparator)
		throws NoSuchDmGtStatusException, SystemException {
		DmGtStatus dmGtStatus = fetchByType_Last(type, orderByComparator);

		if (dmGtStatus != null) {
			return dmGtStatus;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmGtStatusException(msg.toString());
	}

	/**
	 * Returns the last dm gt status in the ordered set where type = &#63;.
	 *
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm gt status, or <code>null</code> if a matching dm gt status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtStatus fetchByType_Last(int type,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByType(type);

		if (count == 0) {
			return null;
		}

		List<DmGtStatus> list = findByType(type, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm gt statuses before and after the current dm gt status in the ordered set where type = &#63;.
	 *
	 * @param id the primary key of the current dm gt status
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm gt status
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtStatusException if a dm gt status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtStatus[] findByType_PrevAndNext(long id, int type,
		OrderByComparator orderByComparator)
		throws NoSuchDmGtStatusException, SystemException {
		DmGtStatus dmGtStatus = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmGtStatus[] array = new DmGtStatusImpl[3];

			array[0] = getByType_PrevAndNext(session, dmGtStatus, type,
					orderByComparator, true);

			array[1] = dmGtStatus;

			array[2] = getByType_PrevAndNext(session, dmGtStatus, type,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmGtStatus getByType_PrevAndNext(Session session,
		DmGtStatus dmGtStatus, int type, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMGTSTATUS_WHERE);

		query.append(_FINDER_COLUMN_TYPE_TYPE_2);

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
			query.append(DmGtStatusModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(type);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmGtStatus);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmGtStatus> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm gt statuses where type = &#63; from the database.
	 *
	 * @param type the type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByType(int type) throws SystemException {
		for (DmGtStatus dmGtStatus : findByType(type, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dmGtStatus);
		}
	}

	/**
	 * Returns the number of dm gt statuses where type = &#63;.
	 *
	 * @param type the type
	 * @return the number of matching dm gt statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByType(int type) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TYPE;

		Object[] finderArgs = new Object[] { type };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMGTSTATUS_WHERE);

			query.append(_FINDER_COLUMN_TYPE_TYPE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(type);

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

	private static final String _FINDER_COLUMN_TYPE_TYPE_2 = "dmGtStatus.type = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUSCODE =
		new FinderPath(DmGtStatusModelImpl.ENTITY_CACHE_ENABLED,
			DmGtStatusModelImpl.FINDER_CACHE_ENABLED, DmGtStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStatusCode",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUSCODE =
		new FinderPath(DmGtStatusModelImpl.ENTITY_CACHE_ENABLED,
			DmGtStatusModelImpl.FINDER_CACHE_ENABLED, DmGtStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStatusCode",
			new String[] { Integer.class.getName(), Integer.class.getName() },
			DmGtStatusModelImpl.STATUSCODE_COLUMN_BITMASK |
			DmGtStatusModelImpl.TYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUSCODE = new FinderPath(DmGtStatusModelImpl.ENTITY_CACHE_ENABLED,
			DmGtStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatusCode",
			new String[] { Integer.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the dm gt statuses where statusCode = &#63; and type = &#63;.
	 *
	 * @param statusCode the status code
	 * @param type the type
	 * @return the matching dm gt statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGtStatus> findByStatusCode(int statusCode, int type)
		throws SystemException {
		return findByStatusCode(statusCode, type, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm gt statuses where statusCode = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param statusCode the status code
	 * @param type the type
	 * @param start the lower bound of the range of dm gt statuses
	 * @param end the upper bound of the range of dm gt statuses (not inclusive)
	 * @return the range of matching dm gt statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGtStatus> findByStatusCode(int statusCode, int type,
		int start, int end) throws SystemException {
		return findByStatusCode(statusCode, type, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm gt statuses where statusCode = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param statusCode the status code
	 * @param type the type
	 * @param start the lower bound of the range of dm gt statuses
	 * @param end the upper bound of the range of dm gt statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm gt statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGtStatus> findByStatusCode(int statusCode, int type,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUSCODE;
			finderArgs = new Object[] { statusCode, type };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUSCODE;
			finderArgs = new Object[] {
					statusCode, type,
					
					start, end, orderByComparator
				};
		}

		List<DmGtStatus> list = (List<DmGtStatus>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmGtStatus dmGtStatus : list) {
				if ((statusCode != dmGtStatus.getStatusCode()) ||
						(type != dmGtStatus.getType())) {
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

			query.append(_SQL_SELECT_DMGTSTATUS_WHERE);

			query.append(_FINDER_COLUMN_STATUSCODE_STATUSCODE_2);

			query.append(_FINDER_COLUMN_STATUSCODE_TYPE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmGtStatusModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(statusCode);

				qPos.add(type);

				if (!pagination) {
					list = (List<DmGtStatus>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmGtStatus>(list);
				}
				else {
					list = (List<DmGtStatus>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm gt status in the ordered set where statusCode = &#63; and type = &#63;.
	 *
	 * @param statusCode the status code
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm gt status
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtStatusException if a matching dm gt status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtStatus findByStatusCode_First(int statusCode, int type,
		OrderByComparator orderByComparator)
		throws NoSuchDmGtStatusException, SystemException {
		DmGtStatus dmGtStatus = fetchByStatusCode_First(statusCode, type,
				orderByComparator);

		if (dmGtStatus != null) {
			return dmGtStatus;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("statusCode=");
		msg.append(statusCode);

		msg.append(", type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmGtStatusException(msg.toString());
	}

	/**
	 * Returns the first dm gt status in the ordered set where statusCode = &#63; and type = &#63;.
	 *
	 * @param statusCode the status code
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm gt status, or <code>null</code> if a matching dm gt status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtStatus fetchByStatusCode_First(int statusCode, int type,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmGtStatus> list = findByStatusCode(statusCode, type, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm gt status in the ordered set where statusCode = &#63; and type = &#63;.
	 *
	 * @param statusCode the status code
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm gt status
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtStatusException if a matching dm gt status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtStatus findByStatusCode_Last(int statusCode, int type,
		OrderByComparator orderByComparator)
		throws NoSuchDmGtStatusException, SystemException {
		DmGtStatus dmGtStatus = fetchByStatusCode_Last(statusCode, type,
				orderByComparator);

		if (dmGtStatus != null) {
			return dmGtStatus;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("statusCode=");
		msg.append(statusCode);

		msg.append(", type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmGtStatusException(msg.toString());
	}

	/**
	 * Returns the last dm gt status in the ordered set where statusCode = &#63; and type = &#63;.
	 *
	 * @param statusCode the status code
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm gt status, or <code>null</code> if a matching dm gt status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtStatus fetchByStatusCode_Last(int statusCode, int type,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByStatusCode(statusCode, type);

		if (count == 0) {
			return null;
		}

		List<DmGtStatus> list = findByStatusCode(statusCode, type, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm gt statuses before and after the current dm gt status in the ordered set where statusCode = &#63; and type = &#63;.
	 *
	 * @param id the primary key of the current dm gt status
	 * @param statusCode the status code
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm gt status
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtStatusException if a dm gt status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtStatus[] findByStatusCode_PrevAndNext(long id, int statusCode,
		int type, OrderByComparator orderByComparator)
		throws NoSuchDmGtStatusException, SystemException {
		DmGtStatus dmGtStatus = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmGtStatus[] array = new DmGtStatusImpl[3];

			array[0] = getByStatusCode_PrevAndNext(session, dmGtStatus,
					statusCode, type, orderByComparator, true);

			array[1] = dmGtStatus;

			array[2] = getByStatusCode_PrevAndNext(session, dmGtStatus,
					statusCode, type, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmGtStatus getByStatusCode_PrevAndNext(Session session,
		DmGtStatus dmGtStatus, int statusCode, int type,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMGTSTATUS_WHERE);

		query.append(_FINDER_COLUMN_STATUSCODE_STATUSCODE_2);

		query.append(_FINDER_COLUMN_STATUSCODE_TYPE_2);

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
			query.append(DmGtStatusModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(statusCode);

		qPos.add(type);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmGtStatus);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmGtStatus> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm gt statuses where statusCode = &#63; and type = &#63; from the database.
	 *
	 * @param statusCode the status code
	 * @param type the type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByStatusCode(int statusCode, int type)
		throws SystemException {
		for (DmGtStatus dmGtStatus : findByStatusCode(statusCode, type,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmGtStatus);
		}
	}

	/**
	 * Returns the number of dm gt statuses where statusCode = &#63; and type = &#63;.
	 *
	 * @param statusCode the status code
	 * @param type the type
	 * @return the number of matching dm gt statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByStatusCode(int statusCode, int type)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUSCODE;

		Object[] finderArgs = new Object[] { statusCode, type };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMGTSTATUS_WHERE);

			query.append(_FINDER_COLUMN_STATUSCODE_STATUSCODE_2);

			query.append(_FINDER_COLUMN_STATUSCODE_TYPE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(statusCode);

				qPos.add(type);

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

	private static final String _FINDER_COLUMN_STATUSCODE_STATUSCODE_2 = "dmGtStatus.statusCode = ? AND ";
	private static final String _FINDER_COLUMN_STATUSCODE_TYPE_2 = "dmGtStatus.type = ?";

	public DmGtStatusPersistenceImpl() {
		setModelClass(DmGtStatus.class);
	}

	/**
	 * Caches the dm gt status in the entity cache if it is enabled.
	 *
	 * @param dmGtStatus the dm gt status
	 */
	@Override
	public void cacheResult(DmGtStatus dmGtStatus) {
		EntityCacheUtil.putResult(DmGtStatusModelImpl.ENTITY_CACHE_ENABLED,
			DmGtStatusImpl.class, dmGtStatus.getPrimaryKey(), dmGtStatus);

		dmGtStatus.resetOriginalValues();
	}

	/**
	 * Caches the dm gt statuses in the entity cache if it is enabled.
	 *
	 * @param dmGtStatuses the dm gt statuses
	 */
	@Override
	public void cacheResult(List<DmGtStatus> dmGtStatuses) {
		for (DmGtStatus dmGtStatus : dmGtStatuses) {
			if (EntityCacheUtil.getResult(
						DmGtStatusModelImpl.ENTITY_CACHE_ENABLED,
						DmGtStatusImpl.class, dmGtStatus.getPrimaryKey()) == null) {
				cacheResult(dmGtStatus);
			}
			else {
				dmGtStatus.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm gt statuses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmGtStatusImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmGtStatusImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm gt status.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmGtStatus dmGtStatus) {
		EntityCacheUtil.removeResult(DmGtStatusModelImpl.ENTITY_CACHE_ENABLED,
			DmGtStatusImpl.class, dmGtStatus.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DmGtStatus> dmGtStatuses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmGtStatus dmGtStatus : dmGtStatuses) {
			EntityCacheUtil.removeResult(DmGtStatusModelImpl.ENTITY_CACHE_ENABLED,
				DmGtStatusImpl.class, dmGtStatus.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dm gt status with the primary key. Does not add the dm gt status to the database.
	 *
	 * @param id the primary key for the new dm gt status
	 * @return the new dm gt status
	 */
	@Override
	public DmGtStatus create(long id) {
		DmGtStatus dmGtStatus = new DmGtStatusImpl();

		dmGtStatus.setNew(true);
		dmGtStatus.setPrimaryKey(id);

		return dmGtStatus;
	}

	/**
	 * Removes the dm gt status with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm gt status
	 * @return the dm gt status that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtStatusException if a dm gt status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtStatus remove(long id)
		throws NoSuchDmGtStatusException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm gt status with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm gt status
	 * @return the dm gt status that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtStatusException if a dm gt status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtStatus remove(Serializable primaryKey)
		throws NoSuchDmGtStatusException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmGtStatus dmGtStatus = (DmGtStatus)session.get(DmGtStatusImpl.class,
					primaryKey);

			if (dmGtStatus == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmGtStatusException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmGtStatus);
		}
		catch (NoSuchDmGtStatusException nsee) {
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
	protected DmGtStatus removeImpl(DmGtStatus dmGtStatus)
		throws SystemException {
		dmGtStatus = toUnwrappedModel(dmGtStatus);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmGtStatus)) {
				dmGtStatus = (DmGtStatus)session.get(DmGtStatusImpl.class,
						dmGtStatus.getPrimaryKeyObj());
			}

			if (dmGtStatus != null) {
				session.delete(dmGtStatus);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmGtStatus != null) {
			clearCache(dmGtStatus);
		}

		return dmGtStatus;
	}

	@Override
	public DmGtStatus updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmGtStatus dmGtStatus)
		throws SystemException {
		dmGtStatus = toUnwrappedModel(dmGtStatus);

		boolean isNew = dmGtStatus.isNew();

		DmGtStatusModelImpl dmGtStatusModelImpl = (DmGtStatusModelImpl)dmGtStatus;

		Session session = null;

		try {
			session = openSession();

			if (dmGtStatus.isNew()) {
				session.save(dmGtStatus);

				dmGtStatus.setNew(false);
			}
			else {
				session.merge(dmGtStatus);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmGtStatusModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmGtStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmGtStatusModelImpl.getOriginalType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TYPE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE,
					args);

				args = new Object[] { dmGtStatusModelImpl.getType() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TYPE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE,
					args);
			}

			if ((dmGtStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUSCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmGtStatusModelImpl.getOriginalStatusCode(),
						dmGtStatusModelImpl.getOriginalType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUSCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUSCODE,
					args);

				args = new Object[] {
						dmGtStatusModelImpl.getStatusCode(),
						dmGtStatusModelImpl.getType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUSCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUSCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmGtStatusModelImpl.ENTITY_CACHE_ENABLED,
			DmGtStatusImpl.class, dmGtStatus.getPrimaryKey(), dmGtStatus);

		return dmGtStatus;
	}

	protected DmGtStatus toUnwrappedModel(DmGtStatus dmGtStatus) {
		if (dmGtStatus instanceof DmGtStatusImpl) {
			return dmGtStatus;
		}

		DmGtStatusImpl dmGtStatusImpl = new DmGtStatusImpl();

		dmGtStatusImpl.setNew(dmGtStatus.isNew());
		dmGtStatusImpl.setPrimaryKey(dmGtStatus.getPrimaryKey());

		dmGtStatusImpl.setId(dmGtStatus.getId());
		dmGtStatusImpl.setStatusCode(dmGtStatus.getStatusCode());
		dmGtStatusImpl.setStatusName(dmGtStatus.getStatusName());
		dmGtStatusImpl.setType(dmGtStatus.getType());
		dmGtStatusImpl.setDescription(dmGtStatus.getDescription());
		dmGtStatusImpl.setIsDelete(dmGtStatus.getIsDelete());
		dmGtStatusImpl.setMarkedAsDelete(dmGtStatus.getMarkedAsDelete());
		dmGtStatusImpl.setModifiedDate(dmGtStatus.getModifiedDate());
		dmGtStatusImpl.setRequestedDate(dmGtStatus.getRequestedDate());
		dmGtStatusImpl.setSyncVersion(dmGtStatus.getSyncVersion());

		return dmGtStatusImpl;
	}

	/**
	 * Returns the dm gt status with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm gt status
	 * @return the dm gt status
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtStatusException if a dm gt status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtStatus findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmGtStatusException, SystemException {
		DmGtStatus dmGtStatus = fetchByPrimaryKey(primaryKey);

		if (dmGtStatus == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmGtStatusException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmGtStatus;
	}

	/**
	 * Returns the dm gt status with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmGtStatusException} if it could not be found.
	 *
	 * @param id the primary key of the dm gt status
	 * @return the dm gt status
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtStatusException if a dm gt status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtStatus findByPrimaryKey(long id)
		throws NoSuchDmGtStatusException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm gt status with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm gt status
	 * @return the dm gt status, or <code>null</code> if a dm gt status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtStatus fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmGtStatus dmGtStatus = (DmGtStatus)EntityCacheUtil.getResult(DmGtStatusModelImpl.ENTITY_CACHE_ENABLED,
				DmGtStatusImpl.class, primaryKey);

		if (dmGtStatus == _nullDmGtStatus) {
			return null;
		}

		if (dmGtStatus == null) {
			Session session = null;

			try {
				session = openSession();

				dmGtStatus = (DmGtStatus)session.get(DmGtStatusImpl.class,
						primaryKey);

				if (dmGtStatus != null) {
					cacheResult(dmGtStatus);
				}
				else {
					EntityCacheUtil.putResult(DmGtStatusModelImpl.ENTITY_CACHE_ENABLED,
						DmGtStatusImpl.class, primaryKey, _nullDmGtStatus);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmGtStatusModelImpl.ENTITY_CACHE_ENABLED,
					DmGtStatusImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmGtStatus;
	}

	/**
	 * Returns the dm gt status with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm gt status
	 * @return the dm gt status, or <code>null</code> if a dm gt status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtStatus fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm gt statuses.
	 *
	 * @return the dm gt statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGtStatus> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm gt statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm gt statuses
	 * @param end the upper bound of the range of dm gt statuses (not inclusive)
	 * @return the range of dm gt statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGtStatus> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm gt statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm gt statuses
	 * @param end the upper bound of the range of dm gt statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm gt statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGtStatus> findAll(int start, int end,
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

		List<DmGtStatus> list = (List<DmGtStatus>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMGTSTATUS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMGTSTATUS;

				if (pagination) {
					sql = sql.concat(DmGtStatusModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmGtStatus>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmGtStatus>(list);
				}
				else {
					list = (List<DmGtStatus>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dm gt statuses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmGtStatus dmGtStatus : findAll()) {
			remove(dmGtStatus);
		}
	}

	/**
	 * Returns the number of dm gt statuses.
	 *
	 * @return the number of dm gt statuses
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

				Query q = session.createQuery(_SQL_COUNT_DMGTSTATUS);

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
	 * Initializes the dm gt status persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmGtStatus")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmGtStatus>> listenersList = new ArrayList<ModelListener<DmGtStatus>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmGtStatus>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmGtStatusImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMGTSTATUS = "SELECT dmGtStatus FROM DmGtStatus dmGtStatus";
	private static final String _SQL_SELECT_DMGTSTATUS_WHERE = "SELECT dmGtStatus FROM DmGtStatus dmGtStatus WHERE ";
	private static final String _SQL_COUNT_DMGTSTATUS = "SELECT COUNT(dmGtStatus) FROM DmGtStatus dmGtStatus";
	private static final String _SQL_COUNT_DMGTSTATUS_WHERE = "SELECT COUNT(dmGtStatus) FROM DmGtStatus dmGtStatus WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmGtStatus.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmGtStatus exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmGtStatus exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmGtStatusPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"statusCode", "statusName", "type", "description", "isDelete",
				"markedAsDelete", "modifiedDate", "requestedDate", "syncVersion"
			});
	private static DmGtStatus _nullDmGtStatus = new DmGtStatusImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmGtStatus> toCacheModel() {
				return _nullDmGtStatusCacheModel;
			}
		};

	private static CacheModel<DmGtStatus> _nullDmGtStatusCacheModel = new CacheModel<DmGtStatus>() {
			@Override
			public DmGtStatus toEntityModel() {
				return _nullDmGtStatus;
			}
		};
}