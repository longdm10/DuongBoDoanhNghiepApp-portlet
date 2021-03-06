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

import vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException;
import vn.dtt.duongbien.dao.vrcb.model.DmPortWharf;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmPortWharfImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmPortWharfModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm port wharf service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmPortWharfPersistence
 * @see DmPortWharfUtil
 * @generated
 */
public class DmPortWharfPersistenceImpl extends BasePersistenceImpl<DmPortWharf>
	implements DmPortWharfPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmPortWharfUtil} to access the dm port wharf persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmPortWharfImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmPortWharfModelImpl.ENTITY_CACHE_ENABLED,
			DmPortWharfModelImpl.FINDER_CACHE_ENABLED, DmPortWharfImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmPortWharfModelImpl.ENTITY_CACHE_ENABLED,
			DmPortWharfModelImpl.FINDER_CACHE_ENABLED, DmPortWharfImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmPortWharfModelImpl.ENTITY_CACHE_ENABLED,
			DmPortWharfModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTWHARFCODE =
		new FinderPath(DmPortWharfModelImpl.ENTITY_CACHE_ENABLED,
			DmPortWharfModelImpl.FINDER_CACHE_ENABLED, DmPortWharfImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPortWharfCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTWHARFCODE =
		new FinderPath(DmPortWharfModelImpl.ENTITY_CACHE_ENABLED,
			DmPortWharfModelImpl.FINDER_CACHE_ENABLED, DmPortWharfImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPortWharfCode",
			new String[] { String.class.getName() },
			DmPortWharfModelImpl.PORTWHARFCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTWHARFCODE = new FinderPath(DmPortWharfModelImpl.ENTITY_CACHE_ENABLED,
			DmPortWharfModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPortWharfCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dm port wharfs where portWharfCode = &#63;.
	 *
	 * @param portWharfCode the port wharf code
	 * @return the matching dm port wharfs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPortWharf> findByPortWharfCode(String portWharfCode)
		throws SystemException {
		return findByPortWharfCode(portWharfCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm port wharfs where portWharfCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortWharfModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portWharfCode the port wharf code
	 * @param start the lower bound of the range of dm port wharfs
	 * @param end the upper bound of the range of dm port wharfs (not inclusive)
	 * @return the range of matching dm port wharfs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPortWharf> findByPortWharfCode(String portWharfCode,
		int start, int end) throws SystemException {
		return findByPortWharfCode(portWharfCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm port wharfs where portWharfCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortWharfModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portWharfCode the port wharf code
	 * @param start the lower bound of the range of dm port wharfs
	 * @param end the upper bound of the range of dm port wharfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm port wharfs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPortWharf> findByPortWharfCode(String portWharfCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTWHARFCODE;
			finderArgs = new Object[] { portWharfCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTWHARFCODE;
			finderArgs = new Object[] {
					portWharfCode,
					
					start, end, orderByComparator
				};
		}

		List<DmPortWharf> list = (List<DmPortWharf>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmPortWharf dmPortWharf : list) {
				if (!Validator.equals(portWharfCode,
							dmPortWharf.getPortWharfCode())) {
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

			query.append(_SQL_SELECT_DMPORTWHARF_WHERE);

			boolean bindPortWharfCode = false;

			if (portWharfCode == null) {
				query.append(_FINDER_COLUMN_PORTWHARFCODE_PORTWHARFCODE_1);
			}
			else if (portWharfCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTWHARFCODE_PORTWHARFCODE_3);
			}
			else {
				bindPortWharfCode = true;

				query.append(_FINDER_COLUMN_PORTWHARFCODE_PORTWHARFCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmPortWharfModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPortWharfCode) {
					qPos.add(portWharfCode);
				}

				if (!pagination) {
					list = (List<DmPortWharf>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmPortWharf>(list);
				}
				else {
					list = (List<DmPortWharf>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm port wharf in the ordered set where portWharfCode = &#63;.
	 *
	 * @param portWharfCode the port wharf code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm port wharf
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException if a matching dm port wharf could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortWharf findByPortWharfCode_First(String portWharfCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortWharfException, SystemException {
		DmPortWharf dmPortWharf = fetchByPortWharfCode_First(portWharfCode,
				orderByComparator);

		if (dmPortWharf != null) {
			return dmPortWharf;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portWharfCode=");
		msg.append(portWharfCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmPortWharfException(msg.toString());
	}

	/**
	 * Returns the first dm port wharf in the ordered set where portWharfCode = &#63;.
	 *
	 * @param portWharfCode the port wharf code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm port wharf, or <code>null</code> if a matching dm port wharf could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortWharf fetchByPortWharfCode_First(String portWharfCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmPortWharf> list = findByPortWharfCode(portWharfCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm port wharf in the ordered set where portWharfCode = &#63;.
	 *
	 * @param portWharfCode the port wharf code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm port wharf
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException if a matching dm port wharf could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortWharf findByPortWharfCode_Last(String portWharfCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortWharfException, SystemException {
		DmPortWharf dmPortWharf = fetchByPortWharfCode_Last(portWharfCode,
				orderByComparator);

		if (dmPortWharf != null) {
			return dmPortWharf;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portWharfCode=");
		msg.append(portWharfCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmPortWharfException(msg.toString());
	}

	/**
	 * Returns the last dm port wharf in the ordered set where portWharfCode = &#63;.
	 *
	 * @param portWharfCode the port wharf code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm port wharf, or <code>null</code> if a matching dm port wharf could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortWharf fetchByPortWharfCode_Last(String portWharfCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPortWharfCode(portWharfCode);

		if (count == 0) {
			return null;
		}

		List<DmPortWharf> list = findByPortWharfCode(portWharfCode, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm port wharfs before and after the current dm port wharf in the ordered set where portWharfCode = &#63;.
	 *
	 * @param id the primary key of the current dm port wharf
	 * @param portWharfCode the port wharf code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm port wharf
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException if a dm port wharf with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortWharf[] findByPortWharfCode_PrevAndNext(int id,
		String portWharfCode, OrderByComparator orderByComparator)
		throws NoSuchDmPortWharfException, SystemException {
		DmPortWharf dmPortWharf = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmPortWharf[] array = new DmPortWharfImpl[3];

			array[0] = getByPortWharfCode_PrevAndNext(session, dmPortWharf,
					portWharfCode, orderByComparator, true);

			array[1] = dmPortWharf;

			array[2] = getByPortWharfCode_PrevAndNext(session, dmPortWharf,
					portWharfCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmPortWharf getByPortWharfCode_PrevAndNext(Session session,
		DmPortWharf dmPortWharf, String portWharfCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMPORTWHARF_WHERE);

		boolean bindPortWharfCode = false;

		if (portWharfCode == null) {
			query.append(_FINDER_COLUMN_PORTWHARFCODE_PORTWHARFCODE_1);
		}
		else if (portWharfCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PORTWHARFCODE_PORTWHARFCODE_3);
		}
		else {
			bindPortWharfCode = true;

			query.append(_FINDER_COLUMN_PORTWHARFCODE_PORTWHARFCODE_2);
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
			query.append(DmPortWharfModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindPortWharfCode) {
			qPos.add(portWharfCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmPortWharf);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmPortWharf> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm port wharfs where portWharfCode = &#63; from the database.
	 *
	 * @param portWharfCode the port wharf code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPortWharfCode(String portWharfCode)
		throws SystemException {
		for (DmPortWharf dmPortWharf : findByPortWharfCode(portWharfCode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmPortWharf);
		}
	}

	/**
	 * Returns the number of dm port wharfs where portWharfCode = &#63;.
	 *
	 * @param portWharfCode the port wharf code
	 * @return the number of matching dm port wharfs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPortWharfCode(String portWharfCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PORTWHARFCODE;

		Object[] finderArgs = new Object[] { portWharfCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMPORTWHARF_WHERE);

			boolean bindPortWharfCode = false;

			if (portWharfCode == null) {
				query.append(_FINDER_COLUMN_PORTWHARFCODE_PORTWHARFCODE_1);
			}
			else if (portWharfCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTWHARFCODE_PORTWHARFCODE_3);
			}
			else {
				bindPortWharfCode = true;

				query.append(_FINDER_COLUMN_PORTWHARFCODE_PORTWHARFCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPortWharfCode) {
					qPos.add(portWharfCode);
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

	private static final String _FINDER_COLUMN_PORTWHARFCODE_PORTWHARFCODE_1 = "dmPortWharf.portWharfCode IS NULL";
	private static final String _FINDER_COLUMN_PORTWHARFCODE_PORTWHARFCODE_2 = "dmPortWharf.portWharfCode = ?";
	private static final String _FINDER_COLUMN_PORTWHARFCODE_PORTWHARFCODE_3 = "(dmPortWharf.portWharfCode IS NULL OR dmPortWharf.portWharfCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTWHARFCODEANDSYNCVERSION =
		new FinderPath(DmPortWharfModelImpl.ENTITY_CACHE_ENABLED,
			DmPortWharfModelImpl.FINDER_CACHE_ENABLED, DmPortWharfImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByPortWharfCodeAndSyncVersion",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTWHARFCODEANDSYNCVERSION =
		new FinderPath(DmPortWharfModelImpl.ENTITY_CACHE_ENABLED,
			DmPortWharfModelImpl.FINDER_CACHE_ENABLED, DmPortWharfImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPortWharfCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmPortWharfModelImpl.PORTWHARFCODE_COLUMN_BITMASK |
			DmPortWharfModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTWHARFCODEANDSYNCVERSION =
		new FinderPath(DmPortWharfModelImpl.ENTITY_CACHE_ENABLED,
			DmPortWharfModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPortWharfCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the dm port wharfs where portWharfCode = &#63; and syncVersion = &#63;.
	 *
	 * @param portWharfCode the port wharf code
	 * @param syncVersion the sync version
	 * @return the matching dm port wharfs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPortWharf> findByPortWharfCodeAndSyncVersion(
		String portWharfCode, String syncVersion) throws SystemException {
		return findByPortWharfCodeAndSyncVersion(portWharfCode, syncVersion,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm port wharfs where portWharfCode = &#63; and syncVersion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortWharfModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portWharfCode the port wharf code
	 * @param syncVersion the sync version
	 * @param start the lower bound of the range of dm port wharfs
	 * @param end the upper bound of the range of dm port wharfs (not inclusive)
	 * @return the range of matching dm port wharfs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPortWharf> findByPortWharfCodeAndSyncVersion(
		String portWharfCode, String syncVersion, int start, int end)
		throws SystemException {
		return findByPortWharfCodeAndSyncVersion(portWharfCode, syncVersion,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm port wharfs where portWharfCode = &#63; and syncVersion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortWharfModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portWharfCode the port wharf code
	 * @param syncVersion the sync version
	 * @param start the lower bound of the range of dm port wharfs
	 * @param end the upper bound of the range of dm port wharfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm port wharfs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPortWharf> findByPortWharfCodeAndSyncVersion(
		String portWharfCode, String syncVersion, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTWHARFCODEANDSYNCVERSION;
			finderArgs = new Object[] { portWharfCode, syncVersion };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTWHARFCODEANDSYNCVERSION;
			finderArgs = new Object[] {
					portWharfCode, syncVersion,
					
					start, end, orderByComparator
				};
		}

		List<DmPortWharf> list = (List<DmPortWharf>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmPortWharf dmPortWharf : list) {
				if (!Validator.equals(portWharfCode,
							dmPortWharf.getPortWharfCode()) ||
						!Validator.equals(syncVersion,
							dmPortWharf.getSyncVersion())) {
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

			query.append(_SQL_SELECT_DMPORTWHARF_WHERE);

			boolean bindPortWharfCode = false;

			if (portWharfCode == null) {
				query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_PORTWHARFCODE_1);
			}
			else if (portWharfCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_PORTWHARFCODE_3);
			}
			else {
				bindPortWharfCode = true;

				query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_PORTWHARFCODE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_SYNCVERSION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmPortWharfModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPortWharfCode) {
					qPos.add(portWharfCode);
				}

				if (bindSyncVersion) {
					qPos.add(syncVersion);
				}

				if (!pagination) {
					list = (List<DmPortWharf>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmPortWharf>(list);
				}
				else {
					list = (List<DmPortWharf>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm port wharf in the ordered set where portWharfCode = &#63; and syncVersion = &#63;.
	 *
	 * @param portWharfCode the port wharf code
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm port wharf
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException if a matching dm port wharf could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortWharf findByPortWharfCodeAndSyncVersion_First(
		String portWharfCode, String syncVersion,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortWharfException, SystemException {
		DmPortWharf dmPortWharf = fetchByPortWharfCodeAndSyncVersion_First(portWharfCode,
				syncVersion, orderByComparator);

		if (dmPortWharf != null) {
			return dmPortWharf;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portWharfCode=");
		msg.append(portWharfCode);

		msg.append(", syncVersion=");
		msg.append(syncVersion);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmPortWharfException(msg.toString());
	}

	/**
	 * Returns the first dm port wharf in the ordered set where portWharfCode = &#63; and syncVersion = &#63;.
	 *
	 * @param portWharfCode the port wharf code
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm port wharf, or <code>null</code> if a matching dm port wharf could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortWharf fetchByPortWharfCodeAndSyncVersion_First(
		String portWharfCode, String syncVersion,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmPortWharf> list = findByPortWharfCodeAndSyncVersion(portWharfCode,
				syncVersion, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm port wharf in the ordered set where portWharfCode = &#63; and syncVersion = &#63;.
	 *
	 * @param portWharfCode the port wharf code
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm port wharf
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException if a matching dm port wharf could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortWharf findByPortWharfCodeAndSyncVersion_Last(
		String portWharfCode, String syncVersion,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortWharfException, SystemException {
		DmPortWharf dmPortWharf = fetchByPortWharfCodeAndSyncVersion_Last(portWharfCode,
				syncVersion, orderByComparator);

		if (dmPortWharf != null) {
			return dmPortWharf;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portWharfCode=");
		msg.append(portWharfCode);

		msg.append(", syncVersion=");
		msg.append(syncVersion);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmPortWharfException(msg.toString());
	}

	/**
	 * Returns the last dm port wharf in the ordered set where portWharfCode = &#63; and syncVersion = &#63;.
	 *
	 * @param portWharfCode the port wharf code
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm port wharf, or <code>null</code> if a matching dm port wharf could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortWharf fetchByPortWharfCodeAndSyncVersion_Last(
		String portWharfCode, String syncVersion,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPortWharfCodeAndSyncVersion(portWharfCode,
				syncVersion);

		if (count == 0) {
			return null;
		}

		List<DmPortWharf> list = findByPortWharfCodeAndSyncVersion(portWharfCode,
				syncVersion, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm port wharfs before and after the current dm port wharf in the ordered set where portWharfCode = &#63; and syncVersion = &#63;.
	 *
	 * @param id the primary key of the current dm port wharf
	 * @param portWharfCode the port wharf code
	 * @param syncVersion the sync version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm port wharf
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException if a dm port wharf with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortWharf[] findByPortWharfCodeAndSyncVersion_PrevAndNext(int id,
		String portWharfCode, String syncVersion,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortWharfException, SystemException {
		DmPortWharf dmPortWharf = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmPortWharf[] array = new DmPortWharfImpl[3];

			array[0] = getByPortWharfCodeAndSyncVersion_PrevAndNext(session,
					dmPortWharf, portWharfCode, syncVersion, orderByComparator,
					true);

			array[1] = dmPortWharf;

			array[2] = getByPortWharfCodeAndSyncVersion_PrevAndNext(session,
					dmPortWharf, portWharfCode, syncVersion, orderByComparator,
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

	protected DmPortWharf getByPortWharfCodeAndSyncVersion_PrevAndNext(
		Session session, DmPortWharf dmPortWharf, String portWharfCode,
		String syncVersion, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMPORTWHARF_WHERE);

		boolean bindPortWharfCode = false;

		if (portWharfCode == null) {
			query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_PORTWHARFCODE_1);
		}
		else if (portWharfCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_PORTWHARFCODE_3);
		}
		else {
			bindPortWharfCode = true;

			query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_PORTWHARFCODE_2);
		}

		boolean bindSyncVersion = false;

		if (syncVersion == null) {
			query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_SYNCVERSION_1);
		}
		else if (syncVersion.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_SYNCVERSION_3);
		}
		else {
			bindSyncVersion = true;

			query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_SYNCVERSION_2);
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
			query.append(DmPortWharfModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindPortWharfCode) {
			qPos.add(portWharfCode);
		}

		if (bindSyncVersion) {
			qPos.add(syncVersion);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmPortWharf);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmPortWharf> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm port wharfs where portWharfCode = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param portWharfCode the port wharf code
	 * @param syncVersion the sync version
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPortWharfCodeAndSyncVersion(String portWharfCode,
		String syncVersion) throws SystemException {
		for (DmPortWharf dmPortWharf : findByPortWharfCodeAndSyncVersion(
				portWharfCode, syncVersion, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dmPortWharf);
		}
	}

	/**
	 * Returns the number of dm port wharfs where portWharfCode = &#63; and syncVersion = &#63;.
	 *
	 * @param portWharfCode the port wharf code
	 * @param syncVersion the sync version
	 * @return the number of matching dm port wharfs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPortWharfCodeAndSyncVersion(String portWharfCode,
		String syncVersion) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PORTWHARFCODEANDSYNCVERSION;

		Object[] finderArgs = new Object[] { portWharfCode, syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMPORTWHARF_WHERE);

			boolean bindPortWharfCode = false;

			if (portWharfCode == null) {
				query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_PORTWHARFCODE_1);
			}
			else if (portWharfCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_PORTWHARFCODE_3);
			}
			else {
				bindPortWharfCode = true;

				query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_PORTWHARFCODE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPortWharfCode) {
					qPos.add(portWharfCode);
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

	private static final String _FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_PORTWHARFCODE_1 =
		"dmPortWharf.portWharfCode IS NULL AND ";
	private static final String _FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_PORTWHARFCODE_2 =
		"dmPortWharf.portWharfCode = ? AND ";
	private static final String _FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_PORTWHARFCODE_3 =
		"(dmPortWharf.portWharfCode IS NULL OR dmPortWharf.portWharfCode = '') AND ";
	private static final String _FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_SYNCVERSION_1 =
		"dmPortWharf.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_SYNCVERSION_2 =
		"dmPortWharf.syncVersion = ?";
	private static final String _FINDER_COLUMN_PORTWHARFCODEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmPortWharf.syncVersion IS NULL OR dmPortWharf.syncVersion = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTREGIONCODE =
		new FinderPath(DmPortWharfModelImpl.ENTITY_CACHE_ENABLED,
			DmPortWharfModelImpl.FINDER_CACHE_ENABLED, DmPortWharfImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPortRegionCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONCODE =
		new FinderPath(DmPortWharfModelImpl.ENTITY_CACHE_ENABLED,
			DmPortWharfModelImpl.FINDER_CACHE_ENABLED, DmPortWharfImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPortRegionCode",
			new String[] { String.class.getName() },
			DmPortWharfModelImpl.PORTREGIONCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTREGIONCODE = new FinderPath(DmPortWharfModelImpl.ENTITY_CACHE_ENABLED,
			DmPortWharfModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPortRegionCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dm port wharfs where portRegionCode = &#63;.
	 *
	 * @param portRegionCode the port region code
	 * @return the matching dm port wharfs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPortWharf> findByPortRegionCode(String portRegionCode)
		throws SystemException {
		return findByPortRegionCode(portRegionCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm port wharfs where portRegionCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortWharfModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portRegionCode the port region code
	 * @param start the lower bound of the range of dm port wharfs
	 * @param end the upper bound of the range of dm port wharfs (not inclusive)
	 * @return the range of matching dm port wharfs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPortWharf> findByPortRegionCode(String portRegionCode,
		int start, int end) throws SystemException {
		return findByPortRegionCode(portRegionCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm port wharfs where portRegionCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortWharfModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portRegionCode the port region code
	 * @param start the lower bound of the range of dm port wharfs
	 * @param end the upper bound of the range of dm port wharfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm port wharfs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPortWharf> findByPortRegionCode(String portRegionCode,
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

		List<DmPortWharf> list = (List<DmPortWharf>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmPortWharf dmPortWharf : list) {
				if (!Validator.equals(portRegionCode,
							dmPortWharf.getPortRegionCode())) {
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

			query.append(_SQL_SELECT_DMPORTWHARF_WHERE);

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
				query.append(DmPortWharfModelImpl.ORDER_BY_JPQL);
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
					list = (List<DmPortWharf>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmPortWharf>(list);
				}
				else {
					list = (List<DmPortWharf>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm port wharf in the ordered set where portRegionCode = &#63;.
	 *
	 * @param portRegionCode the port region code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm port wharf
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException if a matching dm port wharf could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortWharf findByPortRegionCode_First(String portRegionCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortWharfException, SystemException {
		DmPortWharf dmPortWharf = fetchByPortRegionCode_First(portRegionCode,
				orderByComparator);

		if (dmPortWharf != null) {
			return dmPortWharf;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portRegionCode=");
		msg.append(portRegionCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmPortWharfException(msg.toString());
	}

	/**
	 * Returns the first dm port wharf in the ordered set where portRegionCode = &#63;.
	 *
	 * @param portRegionCode the port region code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm port wharf, or <code>null</code> if a matching dm port wharf could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortWharf fetchByPortRegionCode_First(String portRegionCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmPortWharf> list = findByPortRegionCode(portRegionCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm port wharf in the ordered set where portRegionCode = &#63;.
	 *
	 * @param portRegionCode the port region code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm port wharf
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException if a matching dm port wharf could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortWharf findByPortRegionCode_Last(String portRegionCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmPortWharfException, SystemException {
		DmPortWharf dmPortWharf = fetchByPortRegionCode_Last(portRegionCode,
				orderByComparator);

		if (dmPortWharf != null) {
			return dmPortWharf;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portRegionCode=");
		msg.append(portRegionCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmPortWharfException(msg.toString());
	}

	/**
	 * Returns the last dm port wharf in the ordered set where portRegionCode = &#63;.
	 *
	 * @param portRegionCode the port region code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm port wharf, or <code>null</code> if a matching dm port wharf could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortWharf fetchByPortRegionCode_Last(String portRegionCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPortRegionCode(portRegionCode);

		if (count == 0) {
			return null;
		}

		List<DmPortWharf> list = findByPortRegionCode(portRegionCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm port wharfs before and after the current dm port wharf in the ordered set where portRegionCode = &#63;.
	 *
	 * @param id the primary key of the current dm port wharf
	 * @param portRegionCode the port region code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm port wharf
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException if a dm port wharf with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortWharf[] findByPortRegionCode_PrevAndNext(int id,
		String portRegionCode, OrderByComparator orderByComparator)
		throws NoSuchDmPortWharfException, SystemException {
		DmPortWharf dmPortWharf = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmPortWharf[] array = new DmPortWharfImpl[3];

			array[0] = getByPortRegionCode_PrevAndNext(session, dmPortWharf,
					portRegionCode, orderByComparator, true);

			array[1] = dmPortWharf;

			array[2] = getByPortRegionCode_PrevAndNext(session, dmPortWharf,
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

	protected DmPortWharf getByPortRegionCode_PrevAndNext(Session session,
		DmPortWharf dmPortWharf, String portRegionCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMPORTWHARF_WHERE);

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
			query.append(DmPortWharfModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(dmPortWharf);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmPortWharf> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm port wharfs where portRegionCode = &#63; from the database.
	 *
	 * @param portRegionCode the port region code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPortRegionCode(String portRegionCode)
		throws SystemException {
		for (DmPortWharf dmPortWharf : findByPortRegionCode(portRegionCode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmPortWharf);
		}
	}

	/**
	 * Returns the number of dm port wharfs where portRegionCode = &#63;.
	 *
	 * @param portRegionCode the port region code
	 * @return the number of matching dm port wharfs
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

			query.append(_SQL_COUNT_DMPORTWHARF_WHERE);

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

	private static final String _FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_1 = "dmPortWharf.portRegionCode IS NULL";
	private static final String _FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_2 = "dmPortWharf.portRegionCode = ?";
	private static final String _FINDER_COLUMN_PORTREGIONCODE_PORTREGIONCODE_3 = "(dmPortWharf.portRegionCode IS NULL OR dmPortWharf.portRegionCode = '')";

	public DmPortWharfPersistenceImpl() {
		setModelClass(DmPortWharf.class);
	}

	/**
	 * Caches the dm port wharf in the entity cache if it is enabled.
	 *
	 * @param dmPortWharf the dm port wharf
	 */
	@Override
	public void cacheResult(DmPortWharf dmPortWharf) {
		EntityCacheUtil.putResult(DmPortWharfModelImpl.ENTITY_CACHE_ENABLED,
			DmPortWharfImpl.class, dmPortWharf.getPrimaryKey(), dmPortWharf);

		dmPortWharf.resetOriginalValues();
	}

	/**
	 * Caches the dm port wharfs in the entity cache if it is enabled.
	 *
	 * @param dmPortWharfs the dm port wharfs
	 */
	@Override
	public void cacheResult(List<DmPortWharf> dmPortWharfs) {
		for (DmPortWharf dmPortWharf : dmPortWharfs) {
			if (EntityCacheUtil.getResult(
						DmPortWharfModelImpl.ENTITY_CACHE_ENABLED,
						DmPortWharfImpl.class, dmPortWharf.getPrimaryKey()) == null) {
				cacheResult(dmPortWharf);
			}
			else {
				dmPortWharf.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm port wharfs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmPortWharfImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmPortWharfImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm port wharf.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmPortWharf dmPortWharf) {
		EntityCacheUtil.removeResult(DmPortWharfModelImpl.ENTITY_CACHE_ENABLED,
			DmPortWharfImpl.class, dmPortWharf.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DmPortWharf> dmPortWharfs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmPortWharf dmPortWharf : dmPortWharfs) {
			EntityCacheUtil.removeResult(DmPortWharfModelImpl.ENTITY_CACHE_ENABLED,
				DmPortWharfImpl.class, dmPortWharf.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dm port wharf with the primary key. Does not add the dm port wharf to the database.
	 *
	 * @param id the primary key for the new dm port wharf
	 * @return the new dm port wharf
	 */
	@Override
	public DmPortWharf create(int id) {
		DmPortWharf dmPortWharf = new DmPortWharfImpl();

		dmPortWharf.setNew(true);
		dmPortWharf.setPrimaryKey(id);

		return dmPortWharf;
	}

	/**
	 * Removes the dm port wharf with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm port wharf
	 * @return the dm port wharf that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException if a dm port wharf with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortWharf remove(int id)
		throws NoSuchDmPortWharfException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm port wharf with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm port wharf
	 * @return the dm port wharf that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException if a dm port wharf with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortWharf remove(Serializable primaryKey)
		throws NoSuchDmPortWharfException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmPortWharf dmPortWharf = (DmPortWharf)session.get(DmPortWharfImpl.class,
					primaryKey);

			if (dmPortWharf == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmPortWharfException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmPortWharf);
		}
		catch (NoSuchDmPortWharfException nsee) {
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
	protected DmPortWharf removeImpl(DmPortWharf dmPortWharf)
		throws SystemException {
		dmPortWharf = toUnwrappedModel(dmPortWharf);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmPortWharf)) {
				dmPortWharf = (DmPortWharf)session.get(DmPortWharfImpl.class,
						dmPortWharf.getPrimaryKeyObj());
			}

			if (dmPortWharf != null) {
				session.delete(dmPortWharf);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmPortWharf != null) {
			clearCache(dmPortWharf);
		}

		return dmPortWharf;
	}

	@Override
	public DmPortWharf updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmPortWharf dmPortWharf)
		throws SystemException {
		dmPortWharf = toUnwrappedModel(dmPortWharf);

		boolean isNew = dmPortWharf.isNew();

		DmPortWharfModelImpl dmPortWharfModelImpl = (DmPortWharfModelImpl)dmPortWharf;

		Session session = null;

		try {
			session = openSession();

			if (dmPortWharf.isNew()) {
				session.save(dmPortWharf);

				dmPortWharf.setNew(false);
			}
			else {
				session.merge(dmPortWharf);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmPortWharfModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmPortWharfModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTWHARFCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmPortWharfModelImpl.getOriginalPortWharfCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTWHARFCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTWHARFCODE,
					args);

				args = new Object[] { dmPortWharfModelImpl.getPortWharfCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTWHARFCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTWHARFCODE,
					args);
			}

			if ((dmPortWharfModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTWHARFCODEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmPortWharfModelImpl.getOriginalPortWharfCode(),
						dmPortWharfModelImpl.getOriginalSyncVersion()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTWHARFCODEANDSYNCVERSION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTWHARFCODEANDSYNCVERSION,
					args);

				args = new Object[] {
						dmPortWharfModelImpl.getPortWharfCode(),
						dmPortWharfModelImpl.getSyncVersion()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTWHARFCODEANDSYNCVERSION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTWHARFCODEANDSYNCVERSION,
					args);
			}

			if ((dmPortWharfModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmPortWharfModelImpl.getOriginalPortRegionCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTREGIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONCODE,
					args);

				args = new Object[] { dmPortWharfModelImpl.getPortRegionCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTREGIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTREGIONCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmPortWharfModelImpl.ENTITY_CACHE_ENABLED,
			DmPortWharfImpl.class, dmPortWharf.getPrimaryKey(), dmPortWharf);

		return dmPortWharf;
	}

	protected DmPortWharf toUnwrappedModel(DmPortWharf dmPortWharf) {
		if (dmPortWharf instanceof DmPortWharfImpl) {
			return dmPortWharf;
		}

		DmPortWharfImpl dmPortWharfImpl = new DmPortWharfImpl();

		dmPortWharfImpl.setNew(dmPortWharf.isNew());
		dmPortWharfImpl.setPrimaryKey(dmPortWharf.getPrimaryKey());

		dmPortWharfImpl.setId(dmPortWharf.getId());
		dmPortWharfImpl.setPortWharfCode(dmPortWharf.getPortWharfCode());
		dmPortWharfImpl.setPortWharfName(dmPortWharf.getPortWharfName());
		dmPortWharfImpl.setPortWharfNameVN(dmPortWharf.getPortWharfNameVN());
		dmPortWharfImpl.setPortWharfType(dmPortWharf.getPortWharfType());
		dmPortWharfImpl.setPortCode(dmPortWharf.getPortCode());
		dmPortWharfImpl.setPortHarbourCode(dmPortWharf.getPortHarbourCode());
		dmPortWharfImpl.setPortRegionCode(dmPortWharf.getPortRegionCode());
		dmPortWharfImpl.setNote(dmPortWharf.getNote());
		dmPortWharfImpl.setIsDelete(dmPortWharf.getIsDelete());
		dmPortWharfImpl.setMarkedAsDelete(dmPortWharf.getMarkedAsDelete());
		dmPortWharfImpl.setModifiedDate(dmPortWharf.getModifiedDate());
		dmPortWharfImpl.setRequestedDate(dmPortWharf.getRequestedDate());
		dmPortWharfImpl.setSyncVersion(dmPortWharf.getSyncVersion());

		return dmPortWharfImpl;
	}

	/**
	 * Returns the dm port wharf with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm port wharf
	 * @return the dm port wharf
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException if a dm port wharf with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortWharf findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmPortWharfException, SystemException {
		DmPortWharf dmPortWharf = fetchByPrimaryKey(primaryKey);

		if (dmPortWharf == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmPortWharfException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmPortWharf;
	}

	/**
	 * Returns the dm port wharf with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException} if it could not be found.
	 *
	 * @param id the primary key of the dm port wharf
	 * @return the dm port wharf
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmPortWharfException if a dm port wharf with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortWharf findByPrimaryKey(int id)
		throws NoSuchDmPortWharfException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm port wharf with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm port wharf
	 * @return the dm port wharf, or <code>null</code> if a dm port wharf with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortWharf fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmPortWharf dmPortWharf = (DmPortWharf)EntityCacheUtil.getResult(DmPortWharfModelImpl.ENTITY_CACHE_ENABLED,
				DmPortWharfImpl.class, primaryKey);

		if (dmPortWharf == _nullDmPortWharf) {
			return null;
		}

		if (dmPortWharf == null) {
			Session session = null;

			try {
				session = openSession();

				dmPortWharf = (DmPortWharf)session.get(DmPortWharfImpl.class,
						primaryKey);

				if (dmPortWharf != null) {
					cacheResult(dmPortWharf);
				}
				else {
					EntityCacheUtil.putResult(DmPortWharfModelImpl.ENTITY_CACHE_ENABLED,
						DmPortWharfImpl.class, primaryKey, _nullDmPortWharf);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmPortWharfModelImpl.ENTITY_CACHE_ENABLED,
					DmPortWharfImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmPortWharf;
	}

	/**
	 * Returns the dm port wharf with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm port wharf
	 * @return the dm port wharf, or <code>null</code> if a dm port wharf with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmPortWharf fetchByPrimaryKey(int id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm port wharfs.
	 *
	 * @return the dm port wharfs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPortWharf> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm port wharfs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortWharfModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm port wharfs
	 * @param end the upper bound of the range of dm port wharfs (not inclusive)
	 * @return the range of dm port wharfs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPortWharf> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm port wharfs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortWharfModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm port wharfs
	 * @param end the upper bound of the range of dm port wharfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm port wharfs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmPortWharf> findAll(int start, int end,
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

		List<DmPortWharf> list = (List<DmPortWharf>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMPORTWHARF);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMPORTWHARF;

				if (pagination) {
					sql = sql.concat(DmPortWharfModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmPortWharf>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmPortWharf>(list);
				}
				else {
					list = (List<DmPortWharf>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dm port wharfs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmPortWharf dmPortWharf : findAll()) {
			remove(dmPortWharf);
		}
	}

	/**
	 * Returns the number of dm port wharfs.
	 *
	 * @return the number of dm port wharfs
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

				Query q = session.createQuery(_SQL_COUNT_DMPORTWHARF);

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
	 * Initializes the dm port wharf persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmPortWharf")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmPortWharf>> listenersList = new ArrayList<ModelListener<DmPortWharf>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmPortWharf>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmPortWharfImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMPORTWHARF = "SELECT dmPortWharf FROM DmPortWharf dmPortWharf";
	private static final String _SQL_SELECT_DMPORTWHARF_WHERE = "SELECT dmPortWharf FROM DmPortWharf dmPortWharf WHERE ";
	private static final String _SQL_COUNT_DMPORTWHARF = "SELECT COUNT(dmPortWharf) FROM DmPortWharf dmPortWharf";
	private static final String _SQL_COUNT_DMPORTWHARF_WHERE = "SELECT COUNT(dmPortWharf) FROM DmPortWharf dmPortWharf WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmPortWharf.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmPortWharf exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmPortWharf exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmPortWharfPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"portWharfCode", "portWharfName", "portWharfNameVN",
				"portWharfType", "portCode", "portHarbourCode", "portRegionCode",
				"note", "isDelete", "markedAsDelete", "modifiedDate",
				"requestedDate", "syncVersion"
			});
	private static DmPortWharf _nullDmPortWharf = new DmPortWharfImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmPortWharf> toCacheModel() {
				return _nullDmPortWharfCacheModel;
			}
		};

	private static CacheModel<DmPortWharf> _nullDmPortWharfCacheModel = new CacheModel<DmPortWharf>() {
			@Override
			public DmPortWharf toEntityModel() {
				return _nullDmPortWharf;
			}
		};
}