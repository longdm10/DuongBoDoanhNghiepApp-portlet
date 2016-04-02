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

import vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException;
import vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmPortHarbourImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmPortHarbourModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm port harbour service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmPortHarbourPersistence
 * @see DmPortHarbourUtil
 * @generated
 */
public class DmPortHarbourPersistenceImpl extends BasePersistenceImpl<DmPortHarbour>
	implements DmPortHarbourPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmPortHarbourUtil} to access the dm port harbour persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmPortHarbourImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
			DmPortHarbourModelImpl.FINDER_CACHE_ENABLED,
			DmPortHarbourImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
			DmPortHarbourModelImpl.FINDER_CACHE_ENABLED,
			DmPortHarbourImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
			DmPortHarbourModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTHARBOURCODE =
		new FinderPath(DmPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
			DmPortHarbourModelImpl.FINDER_CACHE_ENABLED,
			DmPortHarbourImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByPortHarbourCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTHARBOURCODE =
		new FinderPath(DmPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
			DmPortHarbourModelImpl.FINDER_CACHE_ENABLED,
			DmPortHarbourImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPortHarbourCode", new String[] { String.class.getName() },
			DmPortHarbourModelImpl.PORTHARBOURCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTHARBOURCODE = new FinderPath(DmPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
			DmPortHarbourModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPortHarbourCode", new String[] { String.class.getName() });

	/**
	 * Returns all the dm port harbours where portHarbourCode = &#63;.
	 *
	 * @param portHarbourCode the port harbour code
	 * @return the matching dm port harbours
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPortHarbour> findByPortHarbourCode(String portHarbourCode)
		throws SystemException {
		return findByPortHarbourCode(portHarbourCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm port harbours where portHarbourCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portHarbourCode the port harbour code
	 * @param start the lower bound of the range of dm port harbours
	 * @param end the upper bound of the range of dm port harbours (not inclusive)
	 * @return the range of matching dm port harbours
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPortHarbour> findByPortHarbourCode(String portHarbourCode,
		int start, int end) throws SystemException {
		return findByPortHarbourCode(portHarbourCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm port harbours where portHarbourCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portHarbourCode the port harbour code
	 * @param start the lower bound of the range of dm port harbours
	 * @param end the upper bound of the range of dm port harbours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm port harbours
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPortHarbour> findByPortHarbourCode(String portHarbourCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
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

		List<DmPortHarbour> list = (List<DmPortHarbour>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmPortHarbour dmPortHarbour : list) {
				if (!Validator.equals(portHarbourCode,
							dmPortHarbour.getPortHarbourCode())) {
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

			query.append(_SQL_SELECT_DMPORTHARBOUR_WHERE);

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
				query.append(DmPortHarbourModelImpl.ORDER_BY_JPQL);
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
					list = (List<DmPortHarbour>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmPortHarbour>(list);
				}
				else {
					list = (List<DmPortHarbour>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm port harbour in the ordered set where portHarbourCode = &#63;.
	 *
	 * @param portHarbourCode the port harbour code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm port harbour
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException if a matching dm port harbour could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortHarbour findByPortHarbourCode_First(String portHarbourCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortHarbourException, SystemException {
		DmPortHarbour dmPortHarbour = fetchByPortHarbourCode_First(portHarbourCode,
				orderByComparator);

		if (dmPortHarbour != null) {
			return dmPortHarbour;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portHarbourCode=");
		msg.append(portHarbourCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmPortHarbourException(msg.toString());
	}

	/**
	 * Returns the first dm port harbour in the ordered set where portHarbourCode = &#63;.
	 *
	 * @param portHarbourCode the port harbour code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm port harbour, or <code>null</code> if a matching dm port harbour could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortHarbour fetchByPortHarbourCode_First(String portHarbourCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmPortHarbour> list = findByPortHarbourCode(portHarbourCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm port harbour in the ordered set where portHarbourCode = &#63;.
	 *
	 * @param portHarbourCode the port harbour code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm port harbour
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException if a matching dm port harbour could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortHarbour findByPortHarbourCode_Last(String portHarbourCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortHarbourException, SystemException {
		DmPortHarbour dmPortHarbour = fetchByPortHarbourCode_Last(portHarbourCode,
				orderByComparator);

		if (dmPortHarbour != null) {
			return dmPortHarbour;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portHarbourCode=");
		msg.append(portHarbourCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmPortHarbourException(msg.toString());
	}

	/**
	 * Returns the last dm port harbour in the ordered set where portHarbourCode = &#63;.
	 *
	 * @param portHarbourCode the port harbour code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm port harbour, or <code>null</code> if a matching dm port harbour could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortHarbour fetchByPortHarbourCode_Last(String portHarbourCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPortHarbourCode(portHarbourCode);

		if (count == 0) {
			return null;
		}

		List<DmPortHarbour> list = findByPortHarbourCode(portHarbourCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm port harbours before and after the current dm port harbour in the ordered set where portHarbourCode = &#63;.
	 *
	 * @param id the primary key of the current dm port harbour
	 * @param portHarbourCode the port harbour code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm port harbour
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException if a dm port harbour with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortHarbour[] findByPortHarbourCode_PrevAndNext(int id,
		String portHarbourCode, OrderByComparator orderByComparator)
		throws NoSuchDmPortHarbourException, SystemException {
		DmPortHarbour dmPortHarbour = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmPortHarbour[] array = new DmPortHarbourImpl[3];

			array[0] = getByPortHarbourCode_PrevAndNext(session, dmPortHarbour,
					portHarbourCode, orderByComparator, true);

			array[1] = dmPortHarbour;

			array[2] = getByPortHarbourCode_PrevAndNext(session, dmPortHarbour,
					portHarbourCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmPortHarbour getByPortHarbourCode_PrevAndNext(Session session,
		DmPortHarbour dmPortHarbour, String portHarbourCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMPORTHARBOUR_WHERE);

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
			query.append(DmPortHarbourModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(dmPortHarbour);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmPortHarbour> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm port harbours where portHarbourCode = &#63; from the database.
	 *
	 * @param portHarbourCode the port harbour code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPortHarbourCode(String portHarbourCode)
		throws SystemException {
		for (DmPortHarbour dmPortHarbour : findByPortHarbourCode(
				portHarbourCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmPortHarbour);
		}
	}

	/**
	 * Returns the number of dm port harbours where portHarbourCode = &#63;.
	 *
	 * @param portHarbourCode the port harbour code
	 * @return the number of matching dm port harbours
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

			query.append(_SQL_COUNT_DMPORTHARBOUR_WHERE);

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
		"dmPortHarbour.portHarbourCode IS NULL";
	private static final String _FINDER_COLUMN_PORTHARBOURCODE_PORTHARBOURCODE_2 =
		"dmPortHarbour.portHarbourCode = ?";
	private static final String _FINDER_COLUMN_PORTHARBOURCODE_PORTHARBOURCODE_3 =
		"(dmPortHarbour.portHarbourCode IS NULL OR dmPortHarbour.portHarbourCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTREGIONCODE =
		new FinderPath(DmPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
			DmPortHarbourModelImpl.FINDER_CACHE_ENABLED,
			DmPortHarbourImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByPortRegionCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONCODE =
		new FinderPath(DmPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
			DmPortHarbourModelImpl.FINDER_CACHE_ENABLED,
			DmPortHarbourImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPortRegionCode", new String[] { String.class.getName() },
			DmPortHarbourModelImpl.PORTREGIONCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTREGIONCODE = new FinderPath(DmPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
			DmPortHarbourModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPortRegionCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dm port harbours where portRegionCode = &#63;.
	 *
	 * @param portRegionCode the port region code
	 * @return the matching dm port harbours
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPortHarbour> findByPortRegionCode(String portRegionCode)
		throws SystemException {
		return findByPortRegionCode(portRegionCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm port harbours where portRegionCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portRegionCode the port region code
	 * @param start the lower bound of the range of dm port harbours
	 * @param end the upper bound of the range of dm port harbours (not inclusive)
	 * @return the range of matching dm port harbours
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPortHarbour> findByPortRegionCode(String portRegionCode,
		int start, int end) throws SystemException {
		return findByPortRegionCode(portRegionCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm port harbours where portRegionCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portRegionCode the port region code
	 * @param start the lower bound of the range of dm port harbours
	 * @param end the upper bound of the range of dm port harbours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm port harbours
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPortHarbour> findByPortRegionCode(String portRegionCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
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

		List<DmPortHarbour> list = (List<DmPortHarbour>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmPortHarbour dmPortHarbour : list) {
				if (!Validator.equals(portRegionCode,
							dmPortHarbour.getPortRegionCode())) {
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

			query.append(_SQL_SELECT_DMPORTHARBOUR_WHERE);

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
				query.append(DmPortHarbourModelImpl.ORDER_BY_JPQL);
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
					list = (List<DmPortHarbour>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmPortHarbour>(list);
				}
				else {
					list = (List<DmPortHarbour>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm port harbour in the ordered set where portRegionCode = &#63;.
	 *
	 * @param portRegionCode the port region code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm port harbour
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException if a matching dm port harbour could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortHarbour findByPortRegionCode_First(String portRegionCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortHarbourException, SystemException {
		DmPortHarbour dmPortHarbour = fetchByPortRegionCode_First(portRegionCode,
				orderByComparator);

		if (dmPortHarbour != null) {
			return dmPortHarbour;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portRegionCode=");
		msg.append(portRegionCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmPortHarbourException(msg.toString());
	}

	/**
	 * Returns the first dm port harbour in the ordered set where portRegionCode = &#63;.
	 *
	 * @param portRegionCode the port region code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm port harbour, or <code>null</code> if a matching dm port harbour could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortHarbour fetchByPortRegionCode_First(String portRegionCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmPortHarbour> list = findByPortRegionCode(portRegionCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm port harbour in the ordered set where portRegionCode = &#63;.
	 *
	 * @param portRegionCode the port region code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm port harbour
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException if a matching dm port harbour could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortHarbour findByPortRegionCode_Last(String portRegionCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortHarbourException, SystemException {
		DmPortHarbour dmPortHarbour = fetchByPortRegionCode_Last(portRegionCode,
				orderByComparator);

		if (dmPortHarbour != null) {
			return dmPortHarbour;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portRegionCode=");
		msg.append(portRegionCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmPortHarbourException(msg.toString());
	}

	/**
	 * Returns the last dm port harbour in the ordered set where portRegionCode = &#63;.
	 *
	 * @param portRegionCode the port region code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm port harbour, or <code>null</code> if a matching dm port harbour could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortHarbour fetchByPortRegionCode_Last(String portRegionCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPortRegionCode(portRegionCode);

		if (count == 0) {
			return null;
		}

		List<DmPortHarbour> list = findByPortRegionCode(portRegionCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm port harbours before and after the current dm port harbour in the ordered set where portRegionCode = &#63;.
	 *
	 * @param id the primary key of the current dm port harbour
	 * @param portRegionCode the port region code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm port harbour
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException if a dm port harbour with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortHarbour[] findByPortRegionCode_PrevAndNext(int id,
		String portRegionCode, OrderByComparator orderByComparator)
		throws NoSuchDmPortHarbourException, SystemException {
		DmPortHarbour dmPortHarbour = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmPortHarbour[] array = new DmPortHarbourImpl[3];

			array[0] = getByPortRegionCode_PrevAndNext(session, dmPortHarbour,
					portRegionCode, orderByComparator, true);

			array[1] = dmPortHarbour;

			array[2] = getByPortRegionCode_PrevAndNext(session, dmPortHarbour,
					portRegionCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmPortHarbour getByPortRegionCode_PrevAndNext(Session session,
		DmPortHarbour dmPortHarbour, String portRegionCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMPORTHARBOUR_WHERE);

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
			query.append(DmPortHarbourModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(dmPortHarbour);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmPortHarbour> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm port harbours where portRegionCode = &#63; from the database.
	 *
	 * @param portRegionCode the port region code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPortRegionCode(String portRegionCode)
		throws SystemException {
		for (DmPortHarbour dmPortHarbour : findByPortRegionCode(
				portRegionCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmPortHarbour);
		}
	}

	/**
	 * Returns the number of dm port harbours where portRegionCode = &#63;.
	 *
	 * @param portRegionCode the port region code
	 * @return the number of matching dm port harbours
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

			query.append(_SQL_COUNT_DMPORTHARBOUR_WHERE);

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

	private static final String _FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_1 = "dmPortHarbour.portRegionCode IS NULL";
	private static final String _FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_2 = "dmPortHarbour.portRegionCode = ?";
	private static final String _FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_3 = "(dmPortHarbour.portRegionCode IS NULL OR dmPortHarbour.portRegionCode = '')";

	public DmPortHarbourPersistenceImpl() {
		setModelClass(DmPortHarbour.class);
	}

	/**
	 * Caches the dm port harbour in the entity cache if it is enabled.
	 *
	 * @param dmPortHarbour the dm port harbour
	 */
	@Override
	public void cacheResult(DmPortHarbour dmPortHarbour) {
		EntityCacheUtil.putResult(DmPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
			DmPortHarbourImpl.class, dmPortHarbour.getPrimaryKey(),
			dmPortHarbour);

		dmPortHarbour.resetOriginalValues();
	}

	/**
	 * Caches the dm port harbours in the entity cache if it is enabled.
	 *
	 * @param dmPortHarbours the dm port harbours
	 */
	@Override
	public void cacheResult(List<DmPortHarbour> dmPortHarbours) {
		for (DmPortHarbour dmPortHarbour : dmPortHarbours) {
			if (EntityCacheUtil.getResult(
						DmPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
						DmPortHarbourImpl.class, dmPortHarbour.getPrimaryKey()) == null) {
				cacheResult(dmPortHarbour);
			}
			else {
				dmPortHarbour.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm port harbours.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmPortHarbourImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmPortHarbourImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm port harbour.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmPortHarbour dmPortHarbour) {
		EntityCacheUtil.removeResult(DmPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
			DmPortHarbourImpl.class, dmPortHarbour.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DmPortHarbour> dmPortHarbours) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmPortHarbour dmPortHarbour : dmPortHarbours) {
			EntityCacheUtil.removeResult(DmPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
				DmPortHarbourImpl.class, dmPortHarbour.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dm port harbour with the primary key. Does not add the dm port harbour to the database.
	 *
	 * @param id the primary key for the new dm port harbour
	 * @return the new dm port harbour
	 */
	@Override
	public DmPortHarbour create(int id) {
		DmPortHarbour dmPortHarbour = new DmPortHarbourImpl();

		dmPortHarbour.setNew(true);
		dmPortHarbour.setPrimaryKey(id);

		return dmPortHarbour;
	}

	/**
	 * Removes the dm port harbour with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm port harbour
	 * @return the dm port harbour that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException if a dm port harbour with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortHarbour remove(int id)
		throws NoSuchDmPortHarbourException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm port harbour with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm port harbour
	 * @return the dm port harbour that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException if a dm port harbour with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortHarbour remove(Serializable primaryKey)
		throws NoSuchDmPortHarbourException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmPortHarbour dmPortHarbour = (DmPortHarbour)session.get(DmPortHarbourImpl.class,
					primaryKey);

			if (dmPortHarbour == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmPortHarbourException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmPortHarbour);
		}
		catch (NoSuchDmPortHarbourException nsee) {
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
	protected DmPortHarbour removeImpl(DmPortHarbour dmPortHarbour)
		throws SystemException {
		dmPortHarbour = toUnwrappedModel(dmPortHarbour);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmPortHarbour)) {
				dmPortHarbour = (DmPortHarbour)session.get(DmPortHarbourImpl.class,
						dmPortHarbour.getPrimaryKeyObj());
			}

			if (dmPortHarbour != null) {
				session.delete(dmPortHarbour);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmPortHarbour != null) {
			clearCache(dmPortHarbour);
		}

		return dmPortHarbour;
	}

	@Override
	public DmPortHarbour updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour dmPortHarbour)
		throws SystemException {
		dmPortHarbour = toUnwrappedModel(dmPortHarbour);

		boolean isNew = dmPortHarbour.isNew();

		DmPortHarbourModelImpl dmPortHarbourModelImpl = (DmPortHarbourModelImpl)dmPortHarbour;

		Session session = null;

		try {
			session = openSession();

			if (dmPortHarbour.isNew()) {
				session.save(dmPortHarbour);

				dmPortHarbour.setNew(false);
			}
			else {
				session.merge(dmPortHarbour);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmPortHarbourModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmPortHarbourModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTHARBOURCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmPortHarbourModelImpl.getOriginalPortHarbourCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTHARBOURCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTHARBOURCODE,
					args);

				args = new Object[] { dmPortHarbourModelImpl.getPortHarbourCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTHARBOURCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTHARBOURCODE,
					args);
			}

			if ((dmPortHarbourModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmPortHarbourModelImpl.getOriginalPortRegionCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTREGIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONCODE,
					args);

				args = new Object[] { dmPortHarbourModelImpl.getPortRegionCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTREGIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
			DmPortHarbourImpl.class, dmPortHarbour.getPrimaryKey(),
			dmPortHarbour);

		return dmPortHarbour;
	}

	protected DmPortHarbour toUnwrappedModel(DmPortHarbour dmPortHarbour) {
		if (dmPortHarbour instanceof DmPortHarbourImpl) {
			return dmPortHarbour;
		}

		DmPortHarbourImpl dmPortHarbourImpl = new DmPortHarbourImpl();

		dmPortHarbourImpl.setNew(dmPortHarbour.isNew());
		dmPortHarbourImpl.setPrimaryKey(dmPortHarbour.getPrimaryKey());

		dmPortHarbourImpl.setId(dmPortHarbour.getId());
		dmPortHarbourImpl.setPortHarbourCode(dmPortHarbour.getPortHarbourCode());
		dmPortHarbourImpl.setPortHarbourName(dmPortHarbour.getPortHarbourName());
		dmPortHarbourImpl.setPortHarbourNameVN(dmPortHarbour.getPortHarbourNameVN());
		dmPortHarbourImpl.setPortHarbourType(dmPortHarbour.getPortHarbourType());
		dmPortHarbourImpl.setPortCode(dmPortHarbour.getPortCode());
		dmPortHarbourImpl.setPortRegionCode(dmPortHarbour.getPortRegionCode());
		dmPortHarbourImpl.setNote(dmPortHarbour.getNote());
		dmPortHarbourImpl.setIsDelete(dmPortHarbour.getIsDelete());
		dmPortHarbourImpl.setMarkedAsDelete(dmPortHarbour.getMarkedAsDelete());
		dmPortHarbourImpl.setModifiedDate(dmPortHarbour.getModifiedDate());
		dmPortHarbourImpl.setRequestedDate(dmPortHarbour.getRequestedDate());
		dmPortHarbourImpl.setSyncVersion(dmPortHarbour.getSyncVersion());

		return dmPortHarbourImpl;
	}

	/**
	 * Returns the dm port harbour with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm port harbour
	 * @return the dm port harbour
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException if a dm port harbour with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortHarbour findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmPortHarbourException, SystemException {
		DmPortHarbour dmPortHarbour = fetchByPrimaryKey(primaryKey);

		if (dmPortHarbour == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmPortHarbourException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmPortHarbour;
	}

	/**
	 * Returns the dm port harbour with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException} if it could not be found.
	 *
	 * @param id the primary key of the dm port harbour
	 * @return the dm port harbour
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortHarbourException if a dm port harbour with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortHarbour findByPrimaryKey(int id)
		throws NoSuchDmPortHarbourException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm port harbour with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm port harbour
	 * @return the dm port harbour, or <code>null</code> if a dm port harbour with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortHarbour fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmPortHarbour dmPortHarbour = (DmPortHarbour)EntityCacheUtil.getResult(DmPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
				DmPortHarbourImpl.class, primaryKey);

		if (dmPortHarbour == _nullDmPortHarbour) {
			return null;
		}

		if (dmPortHarbour == null) {
			Session session = null;

			try {
				session = openSession();

				dmPortHarbour = (DmPortHarbour)session.get(DmPortHarbourImpl.class,
						primaryKey);

				if (dmPortHarbour != null) {
					cacheResult(dmPortHarbour);
				}
				else {
					EntityCacheUtil.putResult(DmPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
						DmPortHarbourImpl.class, primaryKey, _nullDmPortHarbour);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmPortHarbourModelImpl.ENTITY_CACHE_ENABLED,
					DmPortHarbourImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmPortHarbour;
	}

	/**
	 * Returns the dm port harbour with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm port harbour
	 * @return the dm port harbour, or <code>null</code> if a dm port harbour with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortHarbour fetchByPrimaryKey(int id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm port harbours.
	 *
	 * @return the dm port harbours
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPortHarbour> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm port harbours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm port harbours
	 * @param end the upper bound of the range of dm port harbours (not inclusive)
	 * @return the range of dm port harbours
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPortHarbour> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm port harbours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm port harbours
	 * @param end the upper bound of the range of dm port harbours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm port harbours
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPortHarbour> findAll(int start, int end,
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

		List<DmPortHarbour> list = (List<DmPortHarbour>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMPORTHARBOUR);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMPORTHARBOUR;

				if (pagination) {
					sql = sql.concat(DmPortHarbourModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmPortHarbour>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmPortHarbour>(list);
				}
				else {
					list = (List<DmPortHarbour>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dm port harbours from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmPortHarbour dmPortHarbour : findAll()) {
			remove(dmPortHarbour);
		}
	}

	/**
	 * Returns the number of dm port harbours.
	 *
	 * @return the number of dm port harbours
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

				Query q = session.createQuery(_SQL_COUNT_DMPORTHARBOUR);

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
	 * Initializes the dm port harbour persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmPortHarbour>> listenersList = new ArrayList<ModelListener<DmPortHarbour>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmPortHarbour>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmPortHarbourImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMPORTHARBOUR = "SELECT dmPortHarbour FROM DmPortHarbour dmPortHarbour";
	private static final String _SQL_SELECT_DMPORTHARBOUR_WHERE = "SELECT dmPortHarbour FROM DmPortHarbour dmPortHarbour WHERE ";
	private static final String _SQL_COUNT_DMPORTHARBOUR = "SELECT COUNT(dmPortHarbour) FROM DmPortHarbour dmPortHarbour";
	private static final String _SQL_COUNT_DMPORTHARBOUR_WHERE = "SELECT COUNT(dmPortHarbour) FROM DmPortHarbour dmPortHarbour WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmPortHarbour.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmPortHarbour exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmPortHarbour exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmPortHarbourPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"portHarbourCode", "portHarbourName", "portHarbourNameVN",
				"portHarbourType", "portCode", "portRegionCode", "note",
				"isDelete", "markedAsDelete", "modifiedDate", "requestedDate",
				"syncVersion"
			});
	private static DmPortHarbour _nullDmPortHarbour = new DmPortHarbourImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmPortHarbour> toCacheModel() {
				return _nullDmPortHarbourCacheModel;
			}
		};

	private static CacheModel<DmPortHarbour> _nullDmPortHarbourCacheModel = new CacheModel<DmPortHarbour>() {
			@Override
			public DmPortHarbour toEntityModel() {
				return _nullDmPortHarbour;
			}
		};
}