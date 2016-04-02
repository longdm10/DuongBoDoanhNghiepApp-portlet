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

import vn.dtt.duongbien.dao.vrcb.NoSuchDmShipTypeException;
import vn.dtt.duongbien.dao.vrcb.model.DmShipType;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmShipTypeImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmShipTypeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm ship type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmShipTypePersistence
 * @see DmShipTypeUtil
 * @generated
 */
public class DmShipTypePersistenceImpl extends BasePersistenceImpl<DmShipType>
	implements DmShipTypePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmShipTypeUtil} to access the dm ship type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmShipTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmShipTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmShipTypeModelImpl.FINDER_CACHE_ENABLED, DmShipTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmShipTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmShipTypeModelImpl.FINDER_CACHE_ENABLED, DmShipTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmShipTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmShipTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SHIPTYPECODE =
		new FinderPath(DmShipTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmShipTypeModelImpl.FINDER_CACHE_ENABLED, DmShipTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByShipTypeCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPTYPECODE =
		new FinderPath(DmShipTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmShipTypeModelImpl.FINDER_CACHE_ENABLED, DmShipTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByShipTypeCode",
			new String[] { String.class.getName() },
			DmShipTypeModelImpl.SHIPTYPECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SHIPTYPECODE = new FinderPath(DmShipTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmShipTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByShipTypeCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dm ship types where shipTypeCode = &#63;.
	 *
	 * @param shipTypeCode the ship type code
	 * @return the matching dm ship types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmShipType> findByShipTypeCode(String shipTypeCode)
		throws SystemException {
		return findByShipTypeCode(shipTypeCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm ship types where shipTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmShipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param shipTypeCode the ship type code
	 * @param start the lower bound of the range of dm ship types
	 * @param end the upper bound of the range of dm ship types (not inclusive)
	 * @return the range of matching dm ship types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmShipType> findByShipTypeCode(String shipTypeCode, int start,
		int end) throws SystemException {
		return findByShipTypeCode(shipTypeCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm ship types where shipTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmShipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param shipTypeCode the ship type code
	 * @param start the lower bound of the range of dm ship types
	 * @param end the upper bound of the range of dm ship types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm ship types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmShipType> findByShipTypeCode(String shipTypeCode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPTYPECODE;
			finderArgs = new Object[] { shipTypeCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SHIPTYPECODE;
			finderArgs = new Object[] {
					shipTypeCode,
					
					start, end, orderByComparator
				};
		}

		List<DmShipType> list = (List<DmShipType>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmShipType dmShipType : list) {
				if (!Validator.equals(shipTypeCode, dmShipType.getShipTypeCode())) {
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

			query.append(_SQL_SELECT_DMSHIPTYPE_WHERE);

			boolean bindShipTypeCode = false;

			if (shipTypeCode == null) {
				query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_1);
			}
			else if (shipTypeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_3);
			}
			else {
				bindShipTypeCode = true;

				query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmShipTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindShipTypeCode) {
					qPos.add(shipTypeCode);
				}

				if (!pagination) {
					list = (List<DmShipType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmShipType>(list);
				}
				else {
					list = (List<DmShipType>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm ship type in the ordered set where shipTypeCode = &#63;.
	 *
	 * @param shipTypeCode the ship type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm ship type
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmShipTypeException if a matching dm ship type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmShipType findByShipTypeCode_First(String shipTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmShipTypeException, SystemException {
		DmShipType dmShipType = fetchByShipTypeCode_First(shipTypeCode,
				orderByComparator);

		if (dmShipType != null) {
			return dmShipType;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("shipTypeCode=");
		msg.append(shipTypeCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmShipTypeException(msg.toString());
	}

	/**
	 * Returns the first dm ship type in the ordered set where shipTypeCode = &#63;.
	 *
	 * @param shipTypeCode the ship type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm ship type, or <code>null</code> if a matching dm ship type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmShipType fetchByShipTypeCode_First(String shipTypeCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmShipType> list = findByShipTypeCode(shipTypeCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm ship type in the ordered set where shipTypeCode = &#63;.
	 *
	 * @param shipTypeCode the ship type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm ship type
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmShipTypeException if a matching dm ship type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmShipType findByShipTypeCode_Last(String shipTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmShipTypeException, SystemException {
		DmShipType dmShipType = fetchByShipTypeCode_Last(shipTypeCode,
				orderByComparator);

		if (dmShipType != null) {
			return dmShipType;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("shipTypeCode=");
		msg.append(shipTypeCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmShipTypeException(msg.toString());
	}

	/**
	 * Returns the last dm ship type in the ordered set where shipTypeCode = &#63;.
	 *
	 * @param shipTypeCode the ship type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm ship type, or <code>null</code> if a matching dm ship type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmShipType fetchByShipTypeCode_Last(String shipTypeCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByShipTypeCode(shipTypeCode);

		if (count == 0) {
			return null;
		}

		List<DmShipType> list = findByShipTypeCode(shipTypeCode, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm ship types before and after the current dm ship type in the ordered set where shipTypeCode = &#63;.
	 *
	 * @param id the primary key of the current dm ship type
	 * @param shipTypeCode the ship type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm ship type
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmShipTypeException if a dm ship type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmShipType[] findByShipTypeCode_PrevAndNext(int id,
		String shipTypeCode, OrderByComparator orderByComparator)
		throws NoSuchDmShipTypeException, SystemException {
		DmShipType dmShipType = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmShipType[] array = new DmShipTypeImpl[3];

			array[0] = getByShipTypeCode_PrevAndNext(session, dmShipType,
					shipTypeCode, orderByComparator, true);

			array[1] = dmShipType;

			array[2] = getByShipTypeCode_PrevAndNext(session, dmShipType,
					shipTypeCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmShipType getByShipTypeCode_PrevAndNext(Session session,
		DmShipType dmShipType, String shipTypeCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMSHIPTYPE_WHERE);

		boolean bindShipTypeCode = false;

		if (shipTypeCode == null) {
			query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_1);
		}
		else if (shipTypeCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_3);
		}
		else {
			bindShipTypeCode = true;

			query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_2);
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
			query.append(DmShipTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindShipTypeCode) {
			qPos.add(shipTypeCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmShipType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmShipType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm ship types where shipTypeCode = &#63; from the database.
	 *
	 * @param shipTypeCode the ship type code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByShipTypeCode(String shipTypeCode)
		throws SystemException {
		for (DmShipType dmShipType : findByShipTypeCode(shipTypeCode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmShipType);
		}
	}

	/**
	 * Returns the number of dm ship types where shipTypeCode = &#63;.
	 *
	 * @param shipTypeCode the ship type code
	 * @return the number of matching dm ship types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByShipTypeCode(String shipTypeCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SHIPTYPECODE;

		Object[] finderArgs = new Object[] { shipTypeCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMSHIPTYPE_WHERE);

			boolean bindShipTypeCode = false;

			if (shipTypeCode == null) {
				query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_1);
			}
			else if (shipTypeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_3);
			}
			else {
				bindShipTypeCode = true;

				query.append(_FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindShipTypeCode) {
					qPos.add(shipTypeCode);
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

	private static final String _FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_1 = "dmShipType.shipTypeCode IS NULL";
	private static final String _FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_2 = "dmShipType.shipTypeCode = ?";
	private static final String _FINDER_COLUMN_SHIPTYPECODE_SHIPTYPECODE_3 = "(dmShipType.shipTypeCode IS NULL OR dmShipType.shipTypeCode = '')";

	public DmShipTypePersistenceImpl() {
		setModelClass(DmShipType.class);
	}

	/**
	 * Caches the dm ship type in the entity cache if it is enabled.
	 *
	 * @param dmShipType the dm ship type
	 */
	@Override
	public void cacheResult(DmShipType dmShipType) {
		EntityCacheUtil.putResult(DmShipTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmShipTypeImpl.class, dmShipType.getPrimaryKey(), dmShipType);

		dmShipType.resetOriginalValues();
	}

	/**
	 * Caches the dm ship types in the entity cache if it is enabled.
	 *
	 * @param dmShipTypes the dm ship types
	 */
	@Override
	public void cacheResult(List<DmShipType> dmShipTypes) {
		for (DmShipType dmShipType : dmShipTypes) {
			if (EntityCacheUtil.getResult(
						DmShipTypeModelImpl.ENTITY_CACHE_ENABLED,
						DmShipTypeImpl.class, dmShipType.getPrimaryKey()) == null) {
				cacheResult(dmShipType);
			}
			else {
				dmShipType.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm ship types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmShipTypeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmShipTypeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm ship type.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmShipType dmShipType) {
		EntityCacheUtil.removeResult(DmShipTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmShipTypeImpl.class, dmShipType.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DmShipType> dmShipTypes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmShipType dmShipType : dmShipTypes) {
			EntityCacheUtil.removeResult(DmShipTypeModelImpl.ENTITY_CACHE_ENABLED,
				DmShipTypeImpl.class, dmShipType.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dm ship type with the primary key. Does not add the dm ship type to the database.
	 *
	 * @param id the primary key for the new dm ship type
	 * @return the new dm ship type
	 */
	@Override
	public DmShipType create(int id) {
		DmShipType dmShipType = new DmShipTypeImpl();

		dmShipType.setNew(true);
		dmShipType.setPrimaryKey(id);

		return dmShipType;
	}

	/**
	 * Removes the dm ship type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm ship type
	 * @return the dm ship type that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmShipTypeException if a dm ship type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmShipType remove(int id)
		throws NoSuchDmShipTypeException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm ship type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm ship type
	 * @return the dm ship type that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmShipTypeException if a dm ship type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmShipType remove(Serializable primaryKey)
		throws NoSuchDmShipTypeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmShipType dmShipType = (DmShipType)session.get(DmShipTypeImpl.class,
					primaryKey);

			if (dmShipType == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmShipTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmShipType);
		}
		catch (NoSuchDmShipTypeException nsee) {
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
	protected DmShipType removeImpl(DmShipType dmShipType)
		throws SystemException {
		dmShipType = toUnwrappedModel(dmShipType);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmShipType)) {
				dmShipType = (DmShipType)session.get(DmShipTypeImpl.class,
						dmShipType.getPrimaryKeyObj());
			}

			if (dmShipType != null) {
				session.delete(dmShipType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmShipType != null) {
			clearCache(dmShipType);
		}

		return dmShipType;
	}

	@Override
	public DmShipType updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmShipType dmShipType)
		throws SystemException {
		dmShipType = toUnwrappedModel(dmShipType);

		boolean isNew = dmShipType.isNew();

		DmShipTypeModelImpl dmShipTypeModelImpl = (DmShipTypeModelImpl)dmShipType;

		Session session = null;

		try {
			session = openSession();

			if (dmShipType.isNew()) {
				session.save(dmShipType);

				dmShipType.setNew(false);
			}
			else {
				session.merge(dmShipType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmShipTypeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmShipTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPTYPECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmShipTypeModelImpl.getOriginalShipTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SHIPTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPTYPECODE,
					args);

				args = new Object[] { dmShipTypeModelImpl.getShipTypeCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SHIPTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SHIPTYPECODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmShipTypeModelImpl.ENTITY_CACHE_ENABLED,
			DmShipTypeImpl.class, dmShipType.getPrimaryKey(), dmShipType);

		return dmShipType;
	}

	protected DmShipType toUnwrappedModel(DmShipType dmShipType) {
		if (dmShipType instanceof DmShipTypeImpl) {
			return dmShipType;
		}

		DmShipTypeImpl dmShipTypeImpl = new DmShipTypeImpl();

		dmShipTypeImpl.setNew(dmShipType.isNew());
		dmShipTypeImpl.setPrimaryKey(dmShipType.getPrimaryKey());

		dmShipTypeImpl.setId(dmShipType.getId());
		dmShipTypeImpl.setShipTypeCode(dmShipType.getShipTypeCode());
		dmShipTypeImpl.setShipTypeName(dmShipType.getShipTypeName());
		dmShipTypeImpl.setShipTypeNameVN(dmShipType.getShipTypeNameVN());
		dmShipTypeImpl.setShipTypeOrder(dmShipType.getShipTypeOrder());
		dmShipTypeImpl.setIsDelete(dmShipType.getIsDelete());
		dmShipTypeImpl.setMarkedAsDelete(dmShipType.getMarkedAsDelete());
		dmShipTypeImpl.setModifiedDate(dmShipType.getModifiedDate());
		dmShipTypeImpl.setRequestedDate(dmShipType.getRequestedDate());
		dmShipTypeImpl.setSyncVersion(dmShipType.getSyncVersion());

		return dmShipTypeImpl;
	}

	/**
	 * Returns the dm ship type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm ship type
	 * @return the dm ship type
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmShipTypeException if a dm ship type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmShipType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmShipTypeException, SystemException {
		DmShipType dmShipType = fetchByPrimaryKey(primaryKey);

		if (dmShipType == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmShipTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmShipType;
	}

	/**
	 * Returns the dm ship type with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmShipTypeException} if it could not be found.
	 *
	 * @param id the primary key of the dm ship type
	 * @return the dm ship type
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmShipTypeException if a dm ship type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmShipType findByPrimaryKey(int id)
		throws NoSuchDmShipTypeException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm ship type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm ship type
	 * @return the dm ship type, or <code>null</code> if a dm ship type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmShipType fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmShipType dmShipType = (DmShipType)EntityCacheUtil.getResult(DmShipTypeModelImpl.ENTITY_CACHE_ENABLED,
				DmShipTypeImpl.class, primaryKey);

		if (dmShipType == _nullDmShipType) {
			return null;
		}

		if (dmShipType == null) {
			Session session = null;

			try {
				session = openSession();

				dmShipType = (DmShipType)session.get(DmShipTypeImpl.class,
						primaryKey);

				if (dmShipType != null) {
					cacheResult(dmShipType);
				}
				else {
					EntityCacheUtil.putResult(DmShipTypeModelImpl.ENTITY_CACHE_ENABLED,
						DmShipTypeImpl.class, primaryKey, _nullDmShipType);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmShipTypeModelImpl.ENTITY_CACHE_ENABLED,
					DmShipTypeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmShipType;
	}

	/**
	 * Returns the dm ship type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm ship type
	 * @return the dm ship type, or <code>null</code> if a dm ship type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmShipType fetchByPrimaryKey(int id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm ship types.
	 *
	 * @return the dm ship types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmShipType> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm ship types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmShipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm ship types
	 * @param end the upper bound of the range of dm ship types (not inclusive)
	 * @return the range of dm ship types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmShipType> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm ship types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmShipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm ship types
	 * @param end the upper bound of the range of dm ship types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm ship types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmShipType> findAll(int start, int end,
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

		List<DmShipType> list = (List<DmShipType>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMSHIPTYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMSHIPTYPE;

				if (pagination) {
					sql = sql.concat(DmShipTypeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmShipType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmShipType>(list);
				}
				else {
					list = (List<DmShipType>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dm ship types from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmShipType dmShipType : findAll()) {
			remove(dmShipType);
		}
	}

	/**
	 * Returns the number of dm ship types.
	 *
	 * @return the number of dm ship types
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

				Query q = session.createQuery(_SQL_COUNT_DMSHIPTYPE);

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
	 * Initializes the dm ship type persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmShipType")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmShipType>> listenersList = new ArrayList<ModelListener<DmShipType>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmShipType>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmShipTypeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMSHIPTYPE = "SELECT dmShipType FROM DmShipType dmShipType";
	private static final String _SQL_SELECT_DMSHIPTYPE_WHERE = "SELECT dmShipType FROM DmShipType dmShipType WHERE ";
	private static final String _SQL_COUNT_DMSHIPTYPE = "SELECT COUNT(dmShipType) FROM DmShipType dmShipType";
	private static final String _SQL_COUNT_DMSHIPTYPE_WHERE = "SELECT COUNT(dmShipType) FROM DmShipType dmShipType WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmShipType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmShipType exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmShipType exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmShipTypePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"shipTypeCode", "shipTypeName", "shipTypeNameVN",
				"shipTypeOrder", "isDelete", "markedAsDelete", "modifiedDate",
				"requestedDate", "syncVersion"
			});
	private static DmShipType _nullDmShipType = new DmShipTypeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmShipType> toCacheModel() {
				return _nullDmShipTypeCacheModel;
			}
		};

	private static CacheModel<DmShipType> _nullDmShipTypeCacheModel = new CacheModel<DmShipType>() {
			@Override
			public DmShipType toEntityModel() {
				return _nullDmShipType;
			}
		};
}