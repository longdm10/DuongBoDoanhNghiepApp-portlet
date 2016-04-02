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

import vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortHarbourImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortHarbourModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm history port harbour service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryPortHarbourPersistence
 * @see DmHistoryPortHarbourUtil
 * @generated
 */
public class DmHistoryPortHarbourPersistenceImpl extends BasePersistenceImpl<DmHistoryPortHarbour>
	implements DmHistoryPortHarbourPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistoryPortHarbourUtil} to access the dm history port harbour persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistoryPortHarbourImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistoryPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortHarbourModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortHarbourImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistoryPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortHarbourModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortHarbourImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistoryPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortHarbourModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTHARBOURCODE =
		new FinderPath(DmHistoryPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortHarbourModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortHarbourImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPortHarbourCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTHARBOURCODE =
		new FinderPath(DmHistoryPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortHarbourModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortHarbourImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPortHarbourCode",
			new String[] { String.class.getName() },
			DmHistoryPortHarbourModelImpl.PORTHARBOURCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTHARBOURCODE = new FinderPath(DmHistoryPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortHarbourModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPortHarbourCode", new String[] { String.class.getName() });

	/**
	 * Returns all the dm history port harbours where portHarbourCode = &#63;.
	 *
	 * @param portHarbourCode the port harbour code
	 * @return the matching dm history port harbours
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryPortHarbour> findByPortHarbourCode(
		String portHarbourCode) throws SystemException {
		return findByPortHarbourCode(portHarbourCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history port harbours where portHarbourCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portHarbourCode the port harbour code
	 * @param start the lower bound of the range of dm history port harbours
	 * @param end the upper bound of the range of dm history port harbours (not inclusive)
	 * @return the range of matching dm history port harbours
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryPortHarbour> findByPortHarbourCode(
		String portHarbourCode, int start, int end) throws SystemException {
		return findByPortHarbourCode(portHarbourCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history port harbours where portHarbourCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portHarbourCode the port harbour code
	 * @param start the lower bound of the range of dm history port harbours
	 * @param end the upper bound of the range of dm history port harbours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm history port harbours
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryPortHarbour> findByPortHarbourCode(
		String portHarbourCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTHARBOURCODE;
			finderArgs = new Object[] { portHarbourCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTHARBOURCODE;
			finderArgs = new Object[] {
					portHarbourCode,
					
					start, end, orderByComparator
				};
		}

		List<DmHistoryPortHarbour> list = (List<DmHistoryPortHarbour>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmHistoryPortHarbour dmHistoryPortHarbour : list) {
				if (!Validator.equals(portHarbourCode,
							dmHistoryPortHarbour.getPortHarbourCode())) {
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

			query.append(_SQL_SELECT_DMHISTORYPORTHARBOUR_WHERE);

			boolean bindPortHarbourCode = false;

			if (portHarbourCode == null) {
				query.append(_FINDER_COLUMN_PORTHARBOURCODE_PORTHARBOURCODE_1);
			}
			else if (portHarbourCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTHARBOURCODE_PORTHARBOURCODE_3);
			}
			else {
				bindPortHarbourCode = true;

				query.append(_FINDER_COLUMN_PORTHARBOURCODE_PORTHARBOURCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmHistoryPortHarbourModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPortHarbourCode) {
					qPos.add(portHarbourCode);
				}

				if (!pagination) {
					list = (List<DmHistoryPortHarbour>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryPortHarbour>(list);
				}
				else {
					list = (List<DmHistoryPortHarbour>)QueryUtil.list(q,
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
	 * Returns the first dm history port harbour in the ordered set where portHarbourCode = &#63;.
	 *
	 * @param portHarbourCode the port harbour code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history port harbour
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException if a matching dm history port harbour could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortHarbour findByPortHarbourCode_First(
		String portHarbourCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPortHarbourException, SystemException {
		DmHistoryPortHarbour dmHistoryPortHarbour = fetchByPortHarbourCode_First(portHarbourCode,
				orderByComparator);

		if (dmHistoryPortHarbour != null) {
			return dmHistoryPortHarbour;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portHarbourCode=");
		msg.append(portHarbourCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryPortHarbourException(msg.toString());
	}

	/**
	 * Returns the first dm history port harbour in the ordered set where portHarbourCode = &#63;.
	 *
	 * @param portHarbourCode the port harbour code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history port harbour, or <code>null</code> if a matching dm history port harbour could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortHarbour fetchByPortHarbourCode_First(
		String portHarbourCode, OrderByComparator orderByComparator)
		throws SystemException {
		List<DmHistoryPortHarbour> list = findByPortHarbourCode(portHarbourCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm history port harbour in the ordered set where portHarbourCode = &#63;.
	 *
	 * @param portHarbourCode the port harbour code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history port harbour
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException if a matching dm history port harbour could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortHarbour findByPortHarbourCode_Last(
		String portHarbourCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPortHarbourException, SystemException {
		DmHistoryPortHarbour dmHistoryPortHarbour = fetchByPortHarbourCode_Last(portHarbourCode,
				orderByComparator);

		if (dmHistoryPortHarbour != null) {
			return dmHistoryPortHarbour;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portHarbourCode=");
		msg.append(portHarbourCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryPortHarbourException(msg.toString());
	}

	/**
	 * Returns the last dm history port harbour in the ordered set where portHarbourCode = &#63;.
	 *
	 * @param portHarbourCode the port harbour code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history port harbour, or <code>null</code> if a matching dm history port harbour could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortHarbour fetchByPortHarbourCode_Last(
		String portHarbourCode, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByPortHarbourCode(portHarbourCode);

		if (count == 0) {
			return null;
		}

		List<DmHistoryPortHarbour> list = findByPortHarbourCode(portHarbourCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm history port harbours before and after the current dm history port harbour in the ordered set where portHarbourCode = &#63;.
	 *
	 * @param id the primary key of the current dm history port harbour
	 * @param portHarbourCode the port harbour code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm history port harbour
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException if a dm history port harbour with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortHarbour[] findByPortHarbourCode_PrevAndNext(int id,
		String portHarbourCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPortHarbourException, SystemException {
		DmHistoryPortHarbour dmHistoryPortHarbour = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmHistoryPortHarbour[] array = new DmHistoryPortHarbourImpl[3];

			array[0] = getByPortHarbourCode_PrevAndNext(session,
					dmHistoryPortHarbour, portHarbourCode, orderByComparator,
					true);

			array[1] = dmHistoryPortHarbour;

			array[2] = getByPortHarbourCode_PrevAndNext(session,
					dmHistoryPortHarbour, portHarbourCode, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmHistoryPortHarbour getByPortHarbourCode_PrevAndNext(
		Session session, DmHistoryPortHarbour dmHistoryPortHarbour,
		String portHarbourCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMHISTORYPORTHARBOUR_WHERE);

		boolean bindPortHarbourCode = false;

		if (portHarbourCode == null) {
			query.append(_FINDER_COLUMN_PORTHARBOURCODE_PORTHARBOURCODE_1);
		}
		else if (portHarbourCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PORTHARBOURCODE_PORTHARBOURCODE_3);
		}
		else {
			bindPortHarbourCode = true;

			query.append(_FINDER_COLUMN_PORTHARBOURCODE_PORTHARBOURCODE_2);
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
			query.append(DmHistoryPortHarbourModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindPortHarbourCode) {
			qPos.add(portHarbourCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmHistoryPortHarbour);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmHistoryPortHarbour> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm history port harbours where portHarbourCode = &#63; from the database.
	 *
	 * @param portHarbourCode the port harbour code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPortHarbourCode(String portHarbourCode)
		throws SystemException {
		for (DmHistoryPortHarbour dmHistoryPortHarbour : findByPortHarbourCode(
				portHarbourCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmHistoryPortHarbour);
		}
	}

	/**
	 * Returns the number of dm history port harbours where portHarbourCode = &#63;.
	 *
	 * @param portHarbourCode the port harbour code
	 * @return the number of matching dm history port harbours
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPortHarbourCode(String portHarbourCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PORTHARBOURCODE;

		Object[] finderArgs = new Object[] { portHarbourCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYPORTHARBOUR_WHERE);

			boolean bindPortHarbourCode = false;

			if (portHarbourCode == null) {
				query.append(_FINDER_COLUMN_PORTHARBOURCODE_PORTHARBOURCODE_1);
			}
			else if (portHarbourCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTHARBOURCODE_PORTHARBOURCODE_3);
			}
			else {
				bindPortHarbourCode = true;

				query.append(_FINDER_COLUMN_PORTHARBOURCODE_PORTHARBOURCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPortHarbourCode) {
					qPos.add(portHarbourCode);
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

	private static final String _FINDER_COLUMN_PORTHARBOURCODE_PORTHARBOURCODE_1 =
		"dmHistoryPortHarbour.portHarbourCode IS NULL";
	private static final String _FINDER_COLUMN_PORTHARBOURCODE_PORTHARBOURCODE_2 =
		"dmHistoryPortHarbour.portHarbourCode = ?";
	private static final String _FINDER_COLUMN_PORTHARBOURCODE_PORTHARBOURCODE_3 =
		"(dmHistoryPortHarbour.portHarbourCode IS NULL OR dmHistoryPortHarbour.portHarbourCode = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_PORTHARBOURCODEANDSYNCVERSION =
		new FinderPath(DmHistoryPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortHarbourModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortHarbourImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByPortHarbourCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmHistoryPortHarbourModelImpl.PORTHARBOURCODE_COLUMN_BITMASK |
			DmHistoryPortHarbourModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTHARBOURCODEANDSYNCVERSION =
		new FinderPath(DmHistoryPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortHarbourModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPortHarbourCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns the dm history port harbour where portHarbourCode = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException} if it could not be found.
	 *
	 * @param portHarbourCode the port harbour code
	 * @param syncVersion the sync version
	 * @return the matching dm history port harbour
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException if a matching dm history port harbour could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortHarbour findByPortHarbourCodeAndSyncVersion(
		String portHarbourCode, String syncVersion)
		throws NoSuchDmHistoryPortHarbourException, SystemException {
		DmHistoryPortHarbour dmHistoryPortHarbour = fetchByPortHarbourCodeAndSyncVersion(portHarbourCode,
				syncVersion);

		if (dmHistoryPortHarbour == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portHarbourCode=");
			msg.append(portHarbourCode);

			msg.append(", syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryPortHarbourException(msg.toString());
		}

		return dmHistoryPortHarbour;
	}

	/**
	 * Returns the dm history port harbour where portHarbourCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param portHarbourCode the port harbour code
	 * @param syncVersion the sync version
	 * @return the matching dm history port harbour, or <code>null</code> if a matching dm history port harbour could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortHarbour fetchByPortHarbourCodeAndSyncVersion(
		String portHarbourCode, String syncVersion) throws SystemException {
		return fetchByPortHarbourCodeAndSyncVersion(portHarbourCode,
			syncVersion, true);
	}

	/**
	 * Returns the dm history port harbour where portHarbourCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param portHarbourCode the port harbour code
	 * @param syncVersion the sync version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history port harbour, or <code>null</code> if a matching dm history port harbour could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortHarbour fetchByPortHarbourCodeAndSyncVersion(
		String portHarbourCode, String syncVersion, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { portHarbourCode, syncVersion };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PORTHARBOURCODEANDSYNCVERSION,
					finderArgs, this);
		}

		if (result instanceof DmHistoryPortHarbour) {
			DmHistoryPortHarbour dmHistoryPortHarbour = (DmHistoryPortHarbour)result;

			if (!Validator.equals(portHarbourCode,
						dmHistoryPortHarbour.getPortHarbourCode()) ||
					!Validator.equals(syncVersion,
						dmHistoryPortHarbour.getSyncVersion())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMHISTORYPORTHARBOUR_WHERE);

			boolean bindPortHarbourCode = false;

			if (portHarbourCode == null) {
				query.append(_FINDER_COLUMN_PORTHARBOURCODEANDSYNCVERSION_PORTHARBOURCODE_1);
			}
			else if (portHarbourCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTHARBOURCODEANDSYNCVERSION_PORTHARBOURCODE_3);
			}
			else {
				bindPortHarbourCode = true;

				query.append(_FINDER_COLUMN_PORTHARBOURCODEANDSYNCVERSION_PORTHARBOURCODE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_PORTHARBOURCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTHARBOURCODEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_PORTHARBOURCODEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPortHarbourCode) {
					qPos.add(portHarbourCode);
				}

				if (bindSyncVersion) {
					qPos.add(syncVersion);
				}

				List<DmHistoryPortHarbour> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTHARBOURCODEANDSYNCVERSION,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmHistoryPortHarbourPersistenceImpl.fetchByPortHarbourCodeAndSyncVersion(String, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmHistoryPortHarbour dmHistoryPortHarbour = list.get(0);

					result = dmHistoryPortHarbour;

					cacheResult(dmHistoryPortHarbour);

					if ((dmHistoryPortHarbour.getPortHarbourCode() == null) ||
							!dmHistoryPortHarbour.getPortHarbourCode()
													 .equals(portHarbourCode) ||
							(dmHistoryPortHarbour.getSyncVersion() == null) ||
							!dmHistoryPortHarbour.getSyncVersion()
													 .equals(syncVersion)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTHARBOURCODEANDSYNCVERSION,
							finderArgs, dmHistoryPortHarbour);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORTHARBOURCODEANDSYNCVERSION,
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
			return (DmHistoryPortHarbour)result;
		}
	}

	/**
	 * Removes the dm history port harbour where portHarbourCode = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param portHarbourCode the port harbour code
	 * @param syncVersion the sync version
	 * @return the dm history port harbour that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortHarbour removeByPortHarbourCodeAndSyncVersion(
		String portHarbourCode, String syncVersion)
		throws NoSuchDmHistoryPortHarbourException, SystemException {
		DmHistoryPortHarbour dmHistoryPortHarbour = findByPortHarbourCodeAndSyncVersion(portHarbourCode,
				syncVersion);

		return remove(dmHistoryPortHarbour);
	}

	/**
	 * Returns the number of dm history port harbours where portHarbourCode = &#63; and syncVersion = &#63;.
	 *
	 * @param portHarbourCode the port harbour code
	 * @param syncVersion the sync version
	 * @return the number of matching dm history port harbours
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPortHarbourCodeAndSyncVersion(String portHarbourCode,
		String syncVersion) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PORTHARBOURCODEANDSYNCVERSION;

		Object[] finderArgs = new Object[] { portHarbourCode, syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMHISTORYPORTHARBOUR_WHERE);

			boolean bindPortHarbourCode = false;

			if (portHarbourCode == null) {
				query.append(_FINDER_COLUMN_PORTHARBOURCODEANDSYNCVERSION_PORTHARBOURCODE_1);
			}
			else if (portHarbourCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTHARBOURCODEANDSYNCVERSION_PORTHARBOURCODE_3);
			}
			else {
				bindPortHarbourCode = true;

				query.append(_FINDER_COLUMN_PORTHARBOURCODEANDSYNCVERSION_PORTHARBOURCODE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_PORTHARBOURCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTHARBOURCODEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_PORTHARBOURCODEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPortHarbourCode) {
					qPos.add(portHarbourCode);
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

	private static final String _FINDER_COLUMN_PORTHARBOURCODEANDSYNCVERSION_PORTHARBOURCODE_1 =
		"dmHistoryPortHarbour.portHarbourCode IS NULL AND ";
	private static final String _FINDER_COLUMN_PORTHARBOURCODEANDSYNCVERSION_PORTHARBOURCODE_2 =
		"dmHistoryPortHarbour.portHarbourCode = ? AND ";
	private static final String _FINDER_COLUMN_PORTHARBOURCODEANDSYNCVERSION_PORTHARBOURCODE_3 =
		"(dmHistoryPortHarbour.portHarbourCode IS NULL OR dmHistoryPortHarbour.portHarbourCode = '') AND ";
	private static final String _FINDER_COLUMN_PORTHARBOURCODEANDSYNCVERSION_SYNCVERSION_1 =
		"dmHistoryPortHarbour.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_PORTHARBOURCODEANDSYNCVERSION_SYNCVERSION_2 =
		"dmHistoryPortHarbour.syncVersion = ?";
	private static final String _FINDER_COLUMN_PORTHARBOURCODEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmHistoryPortHarbour.syncVersion IS NULL OR dmHistoryPortHarbour.syncVersion = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTREGIONCODE =
		new FinderPath(DmHistoryPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortHarbourModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortHarbourImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPortRegionCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONCODE =
		new FinderPath(DmHistoryPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortHarbourModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryPortHarbourImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPortRegionCode",
			new String[] { String.class.getName() },
			DmHistoryPortHarbourModelImpl.PORTREGIONCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTREGIONCODE = new FinderPath(DmHistoryPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortHarbourModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPortRegionCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dm history port harbours where portRegionCode = &#63;.
	 *
	 * @param portRegionCode the port region code
	 * @return the matching dm history port harbours
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryPortHarbour> findByPortRegionCode(
		String portRegionCode) throws SystemException {
		return findByPortRegionCode(portRegionCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history port harbours where portRegionCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portRegionCode the port region code
	 * @param start the lower bound of the range of dm history port harbours
	 * @param end the upper bound of the range of dm history port harbours (not inclusive)
	 * @return the range of matching dm history port harbours
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryPortHarbour> findByPortRegionCode(
		String portRegionCode, int start, int end) throws SystemException {
		return findByPortRegionCode(portRegionCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history port harbours where portRegionCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portRegionCode the port region code
	 * @param start the lower bound of the range of dm history port harbours
	 * @param end the upper bound of the range of dm history port harbours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm history port harbours
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryPortHarbour> findByPortRegionCode(
		String portRegionCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONCODE;
			finderArgs = new Object[] { portRegionCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTREGIONCODE;
			finderArgs = new Object[] {
					portRegionCode,
					
					start, end, orderByComparator
				};
		}

		List<DmHistoryPortHarbour> list = (List<DmHistoryPortHarbour>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmHistoryPortHarbour dmHistoryPortHarbour : list) {
				if (!Validator.equals(portRegionCode,
							dmHistoryPortHarbour.getPortRegionCode())) {
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

			query.append(_SQL_SELECT_DMHISTORYPORTHARBOUR_WHERE);

			boolean bindPortRegionCode = false;

			if (portRegionCode == null) {
				query.append(_FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_1);
			}
			else if (portRegionCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_3);
			}
			else {
				bindPortRegionCode = true;

				query.append(_FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmHistoryPortHarbourModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPortRegionCode) {
					qPos.add(portRegionCode);
				}

				if (!pagination) {
					list = (List<DmHistoryPortHarbour>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryPortHarbour>(list);
				}
				else {
					list = (List<DmHistoryPortHarbour>)QueryUtil.list(q,
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
	 * Returns the first dm history port harbour in the ordered set where portRegionCode = &#63;.
	 *
	 * @param portRegionCode the port region code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history port harbour
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException if a matching dm history port harbour could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortHarbour findByPortRegionCode_First(
		String portRegionCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPortHarbourException, SystemException {
		DmHistoryPortHarbour dmHistoryPortHarbour = fetchByPortRegionCode_First(portRegionCode,
				orderByComparator);

		if (dmHistoryPortHarbour != null) {
			return dmHistoryPortHarbour;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portRegionCode=");
		msg.append(portRegionCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryPortHarbourException(msg.toString());
	}

	/**
	 * Returns the first dm history port harbour in the ordered set where portRegionCode = &#63;.
	 *
	 * @param portRegionCode the port region code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history port harbour, or <code>null</code> if a matching dm history port harbour could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortHarbour fetchByPortRegionCode_First(
		String portRegionCode, OrderByComparator orderByComparator)
		throws SystemException {
		List<DmHistoryPortHarbour> list = findByPortRegionCode(portRegionCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm history port harbour in the ordered set where portRegionCode = &#63;.
	 *
	 * @param portRegionCode the port region code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history port harbour
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException if a matching dm history port harbour could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortHarbour findByPortRegionCode_Last(
		String portRegionCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPortHarbourException, SystemException {
		DmHistoryPortHarbour dmHistoryPortHarbour = fetchByPortRegionCode_Last(portRegionCode,
				orderByComparator);

		if (dmHistoryPortHarbour != null) {
			return dmHistoryPortHarbour;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portRegionCode=");
		msg.append(portRegionCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryPortHarbourException(msg.toString());
	}

	/**
	 * Returns the last dm history port harbour in the ordered set where portRegionCode = &#63;.
	 *
	 * @param portRegionCode the port region code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history port harbour, or <code>null</code> if a matching dm history port harbour could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortHarbour fetchByPortRegionCode_Last(
		String portRegionCode, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByPortRegionCode(portRegionCode);

		if (count == 0) {
			return null;
		}

		List<DmHistoryPortHarbour> list = findByPortRegionCode(portRegionCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm history port harbours before and after the current dm history port harbour in the ordered set where portRegionCode = &#63;.
	 *
	 * @param id the primary key of the current dm history port harbour
	 * @param portRegionCode the port region code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm history port harbour
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException if a dm history port harbour with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortHarbour[] findByPortRegionCode_PrevAndNext(int id,
		String portRegionCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryPortHarbourException, SystemException {
		DmHistoryPortHarbour dmHistoryPortHarbour = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmHistoryPortHarbour[] array = new DmHistoryPortHarbourImpl[3];

			array[0] = getByPortRegionCode_PrevAndNext(session,
					dmHistoryPortHarbour, portRegionCode, orderByComparator,
					true);

			array[1] = dmHistoryPortHarbour;

			array[2] = getByPortRegionCode_PrevAndNext(session,
					dmHistoryPortHarbour, portRegionCode, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmHistoryPortHarbour getByPortRegionCode_PrevAndNext(
		Session session, DmHistoryPortHarbour dmHistoryPortHarbour,
		String portRegionCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMHISTORYPORTHARBOUR_WHERE);

		boolean bindPortRegionCode = false;

		if (portRegionCode == null) {
			query.append(_FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_1);
		}
		else if (portRegionCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_3);
		}
		else {
			bindPortRegionCode = true;

			query.append(_FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_2);
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
			query.append(DmHistoryPortHarbourModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindPortRegionCode) {
			qPos.add(portRegionCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmHistoryPortHarbour);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmHistoryPortHarbour> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm history port harbours where portRegionCode = &#63; from the database.
	 *
	 * @param portRegionCode the port region code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPortRegionCode(String portRegionCode)
		throws SystemException {
		for (DmHistoryPortHarbour dmHistoryPortHarbour : findByPortRegionCode(
				portRegionCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmHistoryPortHarbour);
		}
	}

	/**
	 * Returns the number of dm history port harbours where portRegionCode = &#63;.
	 *
	 * @param portRegionCode the port region code
	 * @return the number of matching dm history port harbours
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPortRegionCode(String portRegionCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PORTREGIONCODE;

		Object[] finderArgs = new Object[] { portRegionCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYPORTHARBOUR_WHERE);

			boolean bindPortRegionCode = false;

			if (portRegionCode == null) {
				query.append(_FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_1);
			}
			else if (portRegionCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_3);
			}
			else {
				bindPortRegionCode = true;

				query.append(_FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPortRegionCode) {
					qPos.add(portRegionCode);
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

	private static final String _FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_1 = "dmHistoryPortHarbour.portRegionCode IS NULL";
	private static final String _FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_2 = "dmHistoryPortHarbour.portRegionCode = ?";
	private static final String _FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_3 = "(dmHistoryPortHarbour.portRegionCode IS NULL OR dmHistoryPortHarbour.portRegionCode = '')";

	public DmHistoryPortHarbourPersistenceImpl() {
		setModelClass(DmHistoryPortHarbour.class);
	}

	/**
	 * Caches the dm history port harbour in the entity cache if it is enabled.
	 *
	 * @param dmHistoryPortHarbour the dm history port harbour
	 */
	@Override
	public void cacheResult(DmHistoryPortHarbour dmHistoryPortHarbour) {
		EntityCacheUtil.putResult(DmHistoryPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortHarbourImpl.class,
			dmHistoryPortHarbour.getPrimaryKey(), dmHistoryPortHarbour);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTHARBOURCODEANDSYNCVERSION,
			new Object[] {
				dmHistoryPortHarbour.getPortHarbourCode(),
				dmHistoryPortHarbour.getSyncVersion()
			}, dmHistoryPortHarbour);

		dmHistoryPortHarbour.resetOriginalValues();
	}

	/**
	 * Caches the dm history port harbours in the entity cache if it is enabled.
	 *
	 * @param dmHistoryPortHarbours the dm history port harbours
	 */
	@Override
	public void cacheResult(List<DmHistoryPortHarbour> dmHistoryPortHarbours) {
		for (DmHistoryPortHarbour dmHistoryPortHarbour : dmHistoryPortHarbours) {
			if (EntityCacheUtil.getResult(
						DmHistoryPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryPortHarbourImpl.class,
						dmHistoryPortHarbour.getPrimaryKey()) == null) {
				cacheResult(dmHistoryPortHarbour);
			}
			else {
				dmHistoryPortHarbour.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history port harbours.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistoryPortHarbourImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistoryPortHarbourImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history port harbour.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistoryPortHarbour dmHistoryPortHarbour) {
		EntityCacheUtil.removeResult(DmHistoryPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortHarbourImpl.class, dmHistoryPortHarbour.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmHistoryPortHarbour);
	}

	@Override
	public void clearCache(List<DmHistoryPortHarbour> dmHistoryPortHarbours) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmHistoryPortHarbour dmHistoryPortHarbour : dmHistoryPortHarbours) {
			EntityCacheUtil.removeResult(DmHistoryPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryPortHarbourImpl.class,
				dmHistoryPortHarbour.getPrimaryKey());

			clearUniqueFindersCache(dmHistoryPortHarbour);
		}
	}

	protected void cacheUniqueFindersCache(
		DmHistoryPortHarbour dmHistoryPortHarbour) {
		if (dmHistoryPortHarbour.isNew()) {
			Object[] args = new Object[] {
					dmHistoryPortHarbour.getPortHarbourCode(),
					dmHistoryPortHarbour.getSyncVersion()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PORTHARBOURCODEANDSYNCVERSION,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTHARBOURCODEANDSYNCVERSION,
				args, dmHistoryPortHarbour);
		}
		else {
			DmHistoryPortHarbourModelImpl dmHistoryPortHarbourModelImpl = (DmHistoryPortHarbourModelImpl)dmHistoryPortHarbour;

			if ((dmHistoryPortHarbourModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_PORTHARBOURCODEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryPortHarbour.getPortHarbourCode(),
						dmHistoryPortHarbour.getSyncVersion()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PORTHARBOURCODEANDSYNCVERSION,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTHARBOURCODEANDSYNCVERSION,
					args, dmHistoryPortHarbour);
			}
		}
	}

	protected void clearUniqueFindersCache(
		DmHistoryPortHarbour dmHistoryPortHarbour) {
		DmHistoryPortHarbourModelImpl dmHistoryPortHarbourModelImpl = (DmHistoryPortHarbourModelImpl)dmHistoryPortHarbour;

		Object[] args = new Object[] {
				dmHistoryPortHarbour.getPortHarbourCode(),
				dmHistoryPortHarbour.getSyncVersion()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTHARBOURCODEANDSYNCVERSION,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORTHARBOURCODEANDSYNCVERSION,
			args);

		if ((dmHistoryPortHarbourModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_PORTHARBOURCODEANDSYNCVERSION.getColumnBitmask()) != 0) {
			args = new Object[] {
					dmHistoryPortHarbourModelImpl.getOriginalPortHarbourCode(),
					dmHistoryPortHarbourModelImpl.getOriginalSyncVersion()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTHARBOURCODEANDSYNCVERSION,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORTHARBOURCODEANDSYNCVERSION,
				args);
		}
	}

	/**
	 * Creates a new dm history port harbour with the primary key. Does not add the dm history port harbour to the database.
	 *
	 * @param id the primary key for the new dm history port harbour
	 * @return the new dm history port harbour
	 */
	@Override
	public DmHistoryPortHarbour create(int id) {
		DmHistoryPortHarbour dmHistoryPortHarbour = new DmHistoryPortHarbourImpl();

		dmHistoryPortHarbour.setNew(true);
		dmHistoryPortHarbour.setPrimaryKey(id);

		return dmHistoryPortHarbour;
	}

	/**
	 * Removes the dm history port harbour with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history port harbour
	 * @return the dm history port harbour that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException if a dm history port harbour with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortHarbour remove(int id)
		throws NoSuchDmHistoryPortHarbourException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm history port harbour with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history port harbour
	 * @return the dm history port harbour that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException if a dm history port harbour with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortHarbour remove(Serializable primaryKey)
		throws NoSuchDmHistoryPortHarbourException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistoryPortHarbour dmHistoryPortHarbour = (DmHistoryPortHarbour)session.get(DmHistoryPortHarbourImpl.class,
					primaryKey);

			if (dmHistoryPortHarbour == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmHistoryPortHarbourException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmHistoryPortHarbour);
		}
		catch (NoSuchDmHistoryPortHarbourException nsee) {
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
	protected DmHistoryPortHarbour removeImpl(
		DmHistoryPortHarbour dmHistoryPortHarbour) throws SystemException {
		dmHistoryPortHarbour = toUnwrappedModel(dmHistoryPortHarbour);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmHistoryPortHarbour)) {
				dmHistoryPortHarbour = (DmHistoryPortHarbour)session.get(DmHistoryPortHarbourImpl.class,
						dmHistoryPortHarbour.getPrimaryKeyObj());
			}

			if (dmHistoryPortHarbour != null) {
				session.delete(dmHistoryPortHarbour);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmHistoryPortHarbour != null) {
			clearCache(dmHistoryPortHarbour);
		}

		return dmHistoryPortHarbour;
	}

	@Override
	public DmHistoryPortHarbour updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour dmHistoryPortHarbour)
		throws SystemException {
		dmHistoryPortHarbour = toUnwrappedModel(dmHistoryPortHarbour);

		boolean isNew = dmHistoryPortHarbour.isNew();

		DmHistoryPortHarbourModelImpl dmHistoryPortHarbourModelImpl = (DmHistoryPortHarbourModelImpl)dmHistoryPortHarbour;

		Session session = null;

		try {
			session = openSession();

			if (dmHistoryPortHarbour.isNew()) {
				session.save(dmHistoryPortHarbour);

				dmHistoryPortHarbour.setNew(false);
			}
			else {
				session.merge(dmHistoryPortHarbour);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistoryPortHarbourModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmHistoryPortHarbourModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTHARBOURCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryPortHarbourModelImpl.getOriginalPortHarbourCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTHARBOURCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTHARBOURCODE,
					args);

				args = new Object[] {
						dmHistoryPortHarbourModelImpl.getPortHarbourCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTHARBOURCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTHARBOURCODE,
					args);
			}

			if ((dmHistoryPortHarbourModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryPortHarbourModelImpl.getOriginalPortRegionCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTREGIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONCODE,
					args);

				args = new Object[] {
						dmHistoryPortHarbourModelImpl.getPortRegionCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTREGIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmHistoryPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryPortHarbourImpl.class,
			dmHistoryPortHarbour.getPrimaryKey(), dmHistoryPortHarbour);

		clearUniqueFindersCache(dmHistoryPortHarbour);
		cacheUniqueFindersCache(dmHistoryPortHarbour);

		return dmHistoryPortHarbour;
	}

	protected DmHistoryPortHarbour toUnwrappedModel(
		DmHistoryPortHarbour dmHistoryPortHarbour) {
		if (dmHistoryPortHarbour instanceof DmHistoryPortHarbourImpl) {
			return dmHistoryPortHarbour;
		}

		DmHistoryPortHarbourImpl dmHistoryPortHarbourImpl = new DmHistoryPortHarbourImpl();

		dmHistoryPortHarbourImpl.setNew(dmHistoryPortHarbour.isNew());
		dmHistoryPortHarbourImpl.setPrimaryKey(dmHistoryPortHarbour.getPrimaryKey());

		dmHistoryPortHarbourImpl.setId(dmHistoryPortHarbour.getId());
		dmHistoryPortHarbourImpl.setPortHarbourCode(dmHistoryPortHarbour.getPortHarbourCode());
		dmHistoryPortHarbourImpl.setPortHarbourName(dmHistoryPortHarbour.getPortHarbourName());
		dmHistoryPortHarbourImpl.setPortHarbourNameVN(dmHistoryPortHarbour.getPortHarbourNameVN());
		dmHistoryPortHarbourImpl.setPortHarbourType(dmHistoryPortHarbour.getPortHarbourType());
		dmHistoryPortHarbourImpl.setPortCode(dmHistoryPortHarbour.getPortCode());
		dmHistoryPortHarbourImpl.setPortRegionCode(dmHistoryPortHarbour.getPortRegionCode());
		dmHistoryPortHarbourImpl.setNote(dmHistoryPortHarbour.getNote());
		dmHistoryPortHarbourImpl.setIsDelete(dmHistoryPortHarbour.getIsDelete());
		dmHistoryPortHarbourImpl.setMarkedAsDelete(dmHistoryPortHarbour.getMarkedAsDelete());
		dmHistoryPortHarbourImpl.setModifiedDate(dmHistoryPortHarbour.getModifiedDate());
		dmHistoryPortHarbourImpl.setRequestedDate(dmHistoryPortHarbour.getRequestedDate());
		dmHistoryPortHarbourImpl.setSyncVersion(dmHistoryPortHarbour.getSyncVersion());

		return dmHistoryPortHarbourImpl;
	}

	/**
	 * Returns the dm history port harbour with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history port harbour
	 * @return the dm history port harbour
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException if a dm history port harbour with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortHarbour findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmHistoryPortHarbourException, SystemException {
		DmHistoryPortHarbour dmHistoryPortHarbour = fetchByPrimaryKey(primaryKey);

		if (dmHistoryPortHarbour == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmHistoryPortHarbourException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmHistoryPortHarbour;
	}

	/**
	 * Returns the dm history port harbour with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException} if it could not be found.
	 *
	 * @param id the primary key of the dm history port harbour
	 * @return the dm history port harbour
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException if a dm history port harbour with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortHarbour findByPrimaryKey(int id)
		throws NoSuchDmHistoryPortHarbourException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm history port harbour with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history port harbour
	 * @return the dm history port harbour, or <code>null</code> if a dm history port harbour with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortHarbour fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmHistoryPortHarbour dmHistoryPortHarbour = (DmHistoryPortHarbour)EntityCacheUtil.getResult(DmHistoryPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryPortHarbourImpl.class, primaryKey);

		if (dmHistoryPortHarbour == _nullDmHistoryPortHarbour) {
			return null;
		}

		if (dmHistoryPortHarbour == null) {
			Session session = null;

			try {
				session = openSession();

				dmHistoryPortHarbour = (DmHistoryPortHarbour)session.get(DmHistoryPortHarbourImpl.class,
						primaryKey);

				if (dmHistoryPortHarbour != null) {
					cacheResult(dmHistoryPortHarbour);
				}
				else {
					EntityCacheUtil.putResult(DmHistoryPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryPortHarbourImpl.class, primaryKey,
						_nullDmHistoryPortHarbour);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmHistoryPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
					DmHistoryPortHarbourImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmHistoryPortHarbour;
	}

	/**
	 * Returns the dm history port harbour with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history port harbour
	 * @return the dm history port harbour, or <code>null</code> if a dm history port harbour with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryPortHarbour fetchByPrimaryKey(int id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm history port harbours.
	 *
	 * @return the dm history port harbours
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryPortHarbour> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history port harbours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history port harbours
	 * @param end the upper bound of the range of dm history port harbours (not inclusive)
	 * @return the range of dm history port harbours
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryPortHarbour> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history port harbours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history port harbours
	 * @param end the upper bound of the range of dm history port harbours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history port harbours
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryPortHarbour> findAll(int start, int end,
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

		List<DmHistoryPortHarbour> list = (List<DmHistoryPortHarbour>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYPORTHARBOUR);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYPORTHARBOUR;

				if (pagination) {
					sql = sql.concat(DmHistoryPortHarbourModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmHistoryPortHarbour>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryPortHarbour>(list);
				}
				else {
					list = (List<DmHistoryPortHarbour>)QueryUtil.list(q,
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
	 * Removes all the dm history port harbours from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmHistoryPortHarbour dmHistoryPortHarbour : findAll()) {
			remove(dmHistoryPortHarbour);
		}
	}

	/**
	 * Returns the number of dm history port harbours.
	 *
	 * @return the number of dm history port harbours
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

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYPORTHARBOUR);

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
	 * Initializes the dm history port harbour persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistoryPortHarbour>> listenersList = new ArrayList<ModelListener<DmHistoryPortHarbour>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistoryPortHarbour>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmHistoryPortHarbourImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMHISTORYPORTHARBOUR = "SELECT dmHistoryPortHarbour FROM DmHistoryPortHarbour dmHistoryPortHarbour";
	private static final String _SQL_SELECT_DMHISTORYPORTHARBOUR_WHERE = "SELECT dmHistoryPortHarbour FROM DmHistoryPortHarbour dmHistoryPortHarbour WHERE ";
	private static final String _SQL_COUNT_DMHISTORYPORTHARBOUR = "SELECT COUNT(dmHistoryPortHarbour) FROM DmHistoryPortHarbour dmHistoryPortHarbour";
	private static final String _SQL_COUNT_DMHISTORYPORTHARBOUR_WHERE = "SELECT COUNT(dmHistoryPortHarbour) FROM DmHistoryPortHarbour dmHistoryPortHarbour WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistoryPortHarbour.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistoryPortHarbour exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistoryPortHarbour exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistoryPortHarbourPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"portHarbourCode", "portHarbourName", "portHarbourNameVN",
				"portHarbourType", "portCode", "portRegionCode", "note",
				"isDelete", "markedAsDelete", "modifiedDate", "requestedDate",
				"syncVersion"
			});
	private static DmHistoryPortHarbour _nullDmHistoryPortHarbour = new DmHistoryPortHarbourImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistoryPortHarbour> toCacheModel() {
				return _nullDmHistoryPortHarbourCacheModel;
			}
		};

	private static CacheModel<DmHistoryPortHarbour> _nullDmHistoryPortHarbourCacheModel =
		new CacheModel<DmHistoryPortHarbour>() {
			@Override
			public DmHistoryPortHarbour toEntityModel() {
				return _nullDmHistoryPortHarbour;
			}
		};
}