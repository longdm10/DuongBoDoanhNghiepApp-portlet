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

import vn.dtt.duongbien.dao.vrcb.NoSuchDmMaritimeException;
import vn.dtt.duongbien.dao.vrcb.model.DmMaritime;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmMaritimeImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmMaritimeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm maritime service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmMaritimePersistence
 * @see DmMaritimeUtil
 * @generated
 */
public class DmMaritimePersistenceImpl extends BasePersistenceImpl<DmMaritime>
	implements DmMaritimePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmMaritimeUtil} to access the dm maritime persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmMaritimeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmMaritimeModelImpl.FINDER_CACHE_ENABLED, DmMaritimeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmMaritimeModelImpl.FINDER_CACHE_ENABLED, DmMaritimeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmMaritimeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MARITIMECODE =
		new FinderPath(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmMaritimeModelImpl.FINDER_CACHE_ENABLED, DmMaritimeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByMaritimeCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARITIMECODE =
		new FinderPath(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmMaritimeModelImpl.FINDER_CACHE_ENABLED, DmMaritimeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMaritimeCode",
			new String[] { String.class.getName() },
			DmMaritimeModelImpl.MARITIMECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MARITIMECODE = new FinderPath(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmMaritimeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMaritimeCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dm maritimes where maritimeCode = &#63;.
	 *
	 * @param maritimeCode the maritime code
	 * @return the matching dm maritimes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmMaritime> findByMaritimeCode(String maritimeCode)
		throws SystemException {
		return findByMaritimeCode(maritimeCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm maritimes where maritimeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmMaritimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maritimeCode the maritime code
	 * @param start the lower bound of the range of dm maritimes
	 * @param end the upper bound of the range of dm maritimes (not inclusive)
	 * @return the range of matching dm maritimes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmMaritime> findByMaritimeCode(String maritimeCode, int start,
		int end) throws SystemException {
		return findByMaritimeCode(maritimeCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm maritimes where maritimeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmMaritimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maritimeCode the maritime code
	 * @param start the lower bound of the range of dm maritimes
	 * @param end the upper bound of the range of dm maritimes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm maritimes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmMaritime> findByMaritimeCode(String maritimeCode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARITIMECODE;
			finderArgs = new Object[] { maritimeCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MARITIMECODE;
			finderArgs = new Object[] {
					maritimeCode,
					
					start, end, orderByComparator
				};
		}

		List<DmMaritime> list = (List<DmMaritime>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmMaritime dmMaritime : list) {
				if (!Validator.equals(maritimeCode, dmMaritime.getMaritimeCode())) {
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

			query.append(_SQL_SELECT_DMMARITIME_WHERE);

			boolean bindMaritimeCode = false;

			if (maritimeCode == null) {
				query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_1);
			}
			else if (maritimeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_3);
			}
			else {
				bindMaritimeCode = true;

				query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmMaritimeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaritimeCode) {
					qPos.add(maritimeCode);
				}

				if (!pagination) {
					list = (List<DmMaritime>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmMaritime>(list);
				}
				else {
					list = (List<DmMaritime>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm maritime in the ordered set where maritimeCode = &#63;.
	 *
	 * @param maritimeCode the maritime code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm maritime
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmMaritimeException if a matching dm maritime could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMaritime findByMaritimeCode_First(String maritimeCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmMaritimeException, SystemException {
		DmMaritime dmMaritime = fetchByMaritimeCode_First(maritimeCode,
				orderByComparator);

		if (dmMaritime != null) {
			return dmMaritime;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maritimeCode=");
		msg.append(maritimeCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmMaritimeException(msg.toString());
	}

	/**
	 * Returns the first dm maritime in the ordered set where maritimeCode = &#63;.
	 *
	 * @param maritimeCode the maritime code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm maritime, or <code>null</code> if a matching dm maritime could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMaritime fetchByMaritimeCode_First(String maritimeCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmMaritime> list = findByMaritimeCode(maritimeCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm maritime in the ordered set where maritimeCode = &#63;.
	 *
	 * @param maritimeCode the maritime code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm maritime
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmMaritimeException if a matching dm maritime could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMaritime findByMaritimeCode_Last(String maritimeCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmMaritimeException, SystemException {
		DmMaritime dmMaritime = fetchByMaritimeCode_Last(maritimeCode,
				orderByComparator);

		if (dmMaritime != null) {
			return dmMaritime;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maritimeCode=");
		msg.append(maritimeCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmMaritimeException(msg.toString());
	}

	/**
	 * Returns the last dm maritime in the ordered set where maritimeCode = &#63;.
	 *
	 * @param maritimeCode the maritime code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm maritime, or <code>null</code> if a matching dm maritime could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMaritime fetchByMaritimeCode_Last(String maritimeCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByMaritimeCode(maritimeCode);

		if (count == 0) {
			return null;
		}

		List<DmMaritime> list = findByMaritimeCode(maritimeCode, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm maritimes before and after the current dm maritime in the ordered set where maritimeCode = &#63;.
	 *
	 * @param id the primary key of the current dm maritime
	 * @param maritimeCode the maritime code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm maritime
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmMaritimeException if a dm maritime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMaritime[] findByMaritimeCode_PrevAndNext(int id,
		String maritimeCode, OrderByComparator orderByComparator)
		throws NoSuchDmMaritimeException, SystemException {
		DmMaritime dmMaritime = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmMaritime[] array = new DmMaritimeImpl[3];

			array[0] = getByMaritimeCode_PrevAndNext(session, dmMaritime,
					maritimeCode, orderByComparator, true);

			array[1] = dmMaritime;

			array[2] = getByMaritimeCode_PrevAndNext(session, dmMaritime,
					maritimeCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmMaritime getByMaritimeCode_PrevAndNext(Session session,
		DmMaritime dmMaritime, String maritimeCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMMARITIME_WHERE);

		boolean bindMaritimeCode = false;

		if (maritimeCode == null) {
			query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_1);
		}
		else if (maritimeCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_3);
		}
		else {
			bindMaritimeCode = true;

			query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_2);
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
			query.append(DmMaritimeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindMaritimeCode) {
			qPos.add(maritimeCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmMaritime);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmMaritime> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm maritimes where maritimeCode = &#63; from the database.
	 *
	 * @param maritimeCode the maritime code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByMaritimeCode(String maritimeCode)
		throws SystemException {
		for (DmMaritime dmMaritime : findByMaritimeCode(maritimeCode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmMaritime);
		}
	}

	/**
	 * Returns the number of dm maritimes where maritimeCode = &#63;.
	 *
	 * @param maritimeCode the maritime code
	 * @return the number of matching dm maritimes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMaritimeCode(String maritimeCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MARITIMECODE;

		Object[] finderArgs = new Object[] { maritimeCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMMARITIME_WHERE);

			boolean bindMaritimeCode = false;

			if (maritimeCode == null) {
				query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_1);
			}
			else if (maritimeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_3);
			}
			else {
				bindMaritimeCode = true;

				query.append(_FINDER_COLUMN_MARITIMECODE_MARITIMECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaritimeCode) {
					qPos.add(maritimeCode);
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

	private static final String _FINDER_COLUMN_MARITIMECODE_MARITIMECODE_1 = "dmMaritime.maritimeCode IS NULL";
	private static final String _FINDER_COLUMN_MARITIMECODE_MARITIMECODE_2 = "dmMaritime.maritimeCode = ?";
	private static final String _FINDER_COLUMN_MARITIMECODE_MARITIMECODE_3 = "(dmMaritime.maritimeCode IS NULL OR dmMaritime.maritimeCode = '')";

	public DmMaritimePersistenceImpl() {
		setModelClass(DmMaritime.class);
	}

	/**
	 * Caches the dm maritime in the entity cache if it is enabled.
	 *
	 * @param dmMaritime the dm maritime
	 */
	@Override
	public void cacheResult(DmMaritime dmMaritime) {
		EntityCacheUtil.putResult(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmMaritimeImpl.class, dmMaritime.getPrimaryKey(), dmMaritime);

		dmMaritime.resetOriginalValues();
	}

	/**
	 * Caches the dm maritimes in the entity cache if it is enabled.
	 *
	 * @param dmMaritimes the dm maritimes
	 */
	@Override
	public void cacheResult(List<DmMaritime> dmMaritimes) {
		for (DmMaritime dmMaritime : dmMaritimes) {
			if (EntityCacheUtil.getResult(
						DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
						DmMaritimeImpl.class, dmMaritime.getPrimaryKey()) == null) {
				cacheResult(dmMaritime);
			}
			else {
				dmMaritime.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm maritimes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmMaritimeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmMaritimeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm maritime.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmMaritime dmMaritime) {
		EntityCacheUtil.removeResult(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmMaritimeImpl.class, dmMaritime.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DmMaritime> dmMaritimes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmMaritime dmMaritime : dmMaritimes) {
			EntityCacheUtil.removeResult(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
				DmMaritimeImpl.class, dmMaritime.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dm maritime with the primary key. Does not add the dm maritime to the database.
	 *
	 * @param id the primary key for the new dm maritime
	 * @return the new dm maritime
	 */
	@Override
	public DmMaritime create(int id) {
		DmMaritime dmMaritime = new DmMaritimeImpl();

		dmMaritime.setNew(true);
		dmMaritime.setPrimaryKey(id);

		return dmMaritime;
	}

	/**
	 * Removes the dm maritime with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm maritime
	 * @return the dm maritime that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmMaritimeException if a dm maritime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMaritime remove(int id)
		throws NoSuchDmMaritimeException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm maritime with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm maritime
	 * @return the dm maritime that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmMaritimeException if a dm maritime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMaritime remove(Serializable primaryKey)
		throws NoSuchDmMaritimeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmMaritime dmMaritime = (DmMaritime)session.get(DmMaritimeImpl.class,
					primaryKey);

			if (dmMaritime == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmMaritimeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmMaritime);
		}
		catch (NoSuchDmMaritimeException nsee) {
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
	protected DmMaritime removeImpl(DmMaritime dmMaritime)
		throws SystemException {
		dmMaritime = toUnwrappedModel(dmMaritime);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmMaritime)) {
				dmMaritime = (DmMaritime)session.get(DmMaritimeImpl.class,
						dmMaritime.getPrimaryKeyObj());
			}

			if (dmMaritime != null) {
				session.delete(dmMaritime);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmMaritime != null) {
			clearCache(dmMaritime);
		}

		return dmMaritime;
	}

	@Override
	public DmMaritime updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmMaritime dmMaritime)
		throws SystemException {
		dmMaritime = toUnwrappedModel(dmMaritime);

		boolean isNew = dmMaritime.isNew();

		DmMaritimeModelImpl dmMaritimeModelImpl = (DmMaritimeModelImpl)dmMaritime;

		Session session = null;

		try {
			session = openSession();

			if (dmMaritime.isNew()) {
				session.save(dmMaritime);

				dmMaritime.setNew(false);
			}
			else {
				session.merge(dmMaritime);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmMaritimeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmMaritimeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARITIMECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmMaritimeModelImpl.getOriginalMaritimeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MARITIMECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARITIMECODE,
					args);

				args = new Object[] { dmMaritimeModelImpl.getMaritimeCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MARITIMECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARITIMECODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
			DmMaritimeImpl.class, dmMaritime.getPrimaryKey(), dmMaritime);

		return dmMaritime;
	}

	protected DmMaritime toUnwrappedModel(DmMaritime dmMaritime) {
		if (dmMaritime instanceof DmMaritimeImpl) {
			return dmMaritime;
		}

		DmMaritimeImpl dmMaritimeImpl = new DmMaritimeImpl();

		dmMaritimeImpl.setNew(dmMaritime.isNew());
		dmMaritimeImpl.setPrimaryKey(dmMaritime.getPrimaryKey());

		dmMaritimeImpl.setId(dmMaritime.getId());
		dmMaritimeImpl.setMaritimeCode(dmMaritime.getMaritimeCode());
		dmMaritimeImpl.setMaritimeReference(dmMaritime.getMaritimeReference());
		dmMaritimeImpl.setMaritimeOrder(dmMaritime.getMaritimeOrder());
		dmMaritimeImpl.setMaritimeName(dmMaritime.getMaritimeName());
		dmMaritimeImpl.setMaritimeNameVN(dmMaritime.getMaritimeNameVN());
		dmMaritimeImpl.setAddress(dmMaritime.getAddress());
		dmMaritimeImpl.setAddressVN(dmMaritime.getAddressVN());
		dmMaritimeImpl.setStateCode(dmMaritime.getStateCode());
		dmMaritimeImpl.setCitycode(dmMaritime.getCitycode());
		dmMaritimeImpl.setIsDelete(dmMaritime.getIsDelete());
		dmMaritimeImpl.setMarkedAsDelete(dmMaritime.getMarkedAsDelete());
		dmMaritimeImpl.setModifiedDate(dmMaritime.getModifiedDate());
		dmMaritimeImpl.setRequestedDate(dmMaritime.getRequestedDate());
		dmMaritimeImpl.setSyncVersion(dmMaritime.getSyncVersion());

		return dmMaritimeImpl;
	}

	/**
	 * Returns the dm maritime with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm maritime
	 * @return the dm maritime
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmMaritimeException if a dm maritime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMaritime findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmMaritimeException, SystemException {
		DmMaritime dmMaritime = fetchByPrimaryKey(primaryKey);

		if (dmMaritime == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmMaritimeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmMaritime;
	}

	/**
	 * Returns the dm maritime with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmMaritimeException} if it could not be found.
	 *
	 * @param id the primary key of the dm maritime
	 * @return the dm maritime
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmMaritimeException if a dm maritime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMaritime findByPrimaryKey(int id)
		throws NoSuchDmMaritimeException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm maritime with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm maritime
	 * @return the dm maritime, or <code>null</code> if a dm maritime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMaritime fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmMaritime dmMaritime = (DmMaritime)EntityCacheUtil.getResult(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
				DmMaritimeImpl.class, primaryKey);

		if (dmMaritime == _nullDmMaritime) {
			return null;
		}

		if (dmMaritime == null) {
			Session session = null;

			try {
				session = openSession();

				dmMaritime = (DmMaritime)session.get(DmMaritimeImpl.class,
						primaryKey);

				if (dmMaritime != null) {
					cacheResult(dmMaritime);
				}
				else {
					EntityCacheUtil.putResult(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
						DmMaritimeImpl.class, primaryKey, _nullDmMaritime);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmMaritimeModelImpl.ENTITY_CACHE_ENABLED,
					DmMaritimeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmMaritime;
	}

	/**
	 * Returns the dm maritime with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm maritime
	 * @return the dm maritime, or <code>null</code> if a dm maritime with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMaritime fetchByPrimaryKey(int id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm maritimes.
	 *
	 * @return the dm maritimes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmMaritime> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm maritimes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmMaritimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm maritimes
	 * @param end the upper bound of the range of dm maritimes (not inclusive)
	 * @return the range of dm maritimes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmMaritime> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm maritimes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmMaritimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm maritimes
	 * @param end the upper bound of the range of dm maritimes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm maritimes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmMaritime> findAll(int start, int end,
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

		List<DmMaritime> list = (List<DmMaritime>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMMARITIME);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMMARITIME;

				if (pagination) {
					sql = sql.concat(DmMaritimeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmMaritime>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmMaritime>(list);
				}
				else {
					list = (List<DmMaritime>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dm maritimes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmMaritime dmMaritime : findAll()) {
			remove(dmMaritime);
		}
	}

	/**
	 * Returns the number of dm maritimes.
	 *
	 * @return the number of dm maritimes
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

				Query q = session.createQuery(_SQL_COUNT_DMMARITIME);

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
	 * Initializes the dm maritime persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmMaritime")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmMaritime>> listenersList = new ArrayList<ModelListener<DmMaritime>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmMaritime>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmMaritimeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMMARITIME = "SELECT dmMaritime FROM DmMaritime dmMaritime";
	private static final String _SQL_SELECT_DMMARITIME_WHERE = "SELECT dmMaritime FROM DmMaritime dmMaritime WHERE ";
	private static final String _SQL_COUNT_DMMARITIME = "SELECT COUNT(dmMaritime) FROM DmMaritime dmMaritime";
	private static final String _SQL_COUNT_DMMARITIME_WHERE = "SELECT COUNT(dmMaritime) FROM DmMaritime dmMaritime WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmMaritime.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmMaritime exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmMaritime exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmMaritimePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"maritimeCode", "maritimeReference", "maritimeOrder",
				"maritimeName", "maritimeNameVN", "address", "addressVN",
				"stateCode", "citycode", "isDelete", "markedAsDelete",
				"modifiedDate", "requestedDate", "syncVersion"
			});
	private static DmMaritime _nullDmMaritime = new DmMaritimeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmMaritime> toCacheModel() {
				return _nullDmMaritimeCacheModel;
			}
		};

	private static CacheModel<DmMaritime> _nullDmMaritimeCacheModel = new CacheModel<DmMaritime>() {
			@Override
			public DmMaritime toEntityModel() {
				return _nullDmMaritime;
			}
		};
}