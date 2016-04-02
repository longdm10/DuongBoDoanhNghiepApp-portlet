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

import vn.dtt.duongbien.dao.vrcb.NoSuchDmRepresentativeException;
import vn.dtt.duongbien.dao.vrcb.model.DmRepresentative;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmRepresentativeImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmRepresentativeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm representative service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmRepresentativePersistence
 * @see DmRepresentativeUtil
 * @generated
 */
public class DmRepresentativePersistenceImpl extends BasePersistenceImpl<DmRepresentative>
	implements DmRepresentativePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmRepresentativeUtil} to access the dm representative persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmRepresentativeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmRepresentativeModelImpl.FINDER_CACHE_ENABLED,
			DmRepresentativeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmRepresentativeModelImpl.FINDER_CACHE_ENABLED,
			DmRepresentativeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmRepresentativeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_REPCODE = new FinderPath(DmRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmRepresentativeModelImpl.FINDER_CACHE_ENABLED,
			DmRepresentativeImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByRepCode", new String[] { String.class.getName() },
			DmRepresentativeModelImpl.REPCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REPCODE = new FinderPath(DmRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmRepresentativeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRepCode",
			new String[] { String.class.getName() });

	/**
	 * Returns the dm representative where repCode = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmRepresentativeException} if it could not be found.
	 *
	 * @param repCode the rep code
	 * @return the matching dm representative
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmRepresentativeException if a matching dm representative could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmRepresentative findByRepCode(String repCode)
		throws NoSuchDmRepresentativeException, SystemException {
		DmRepresentative dmRepresentative = fetchByRepCode(repCode);

		if (dmRepresentative == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("repCode=");
			msg.append(repCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmRepresentativeException(msg.toString());
		}

		return dmRepresentative;
	}

	/**
	 * Returns the dm representative where repCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param repCode the rep code
	 * @return the matching dm representative, or <code>null</code> if a matching dm representative could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmRepresentative fetchByRepCode(String repCode)
		throws SystemException {
		return fetchByRepCode(repCode, true);
	}

	/**
	 * Returns the dm representative where repCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param repCode the rep code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm representative, or <code>null</code> if a matching dm representative could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmRepresentative fetchByRepCode(String repCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { repCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REPCODE,
					finderArgs, this);
		}

		if (result instanceof DmRepresentative) {
			DmRepresentative dmRepresentative = (DmRepresentative)result;

			if (!Validator.equals(repCode, dmRepresentative.getRepCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DMREPRESENTATIVE_WHERE);

			boolean bindRepCode = false;

			if (repCode == null) {
				query.append(_FINDER_COLUMN_REPCODE_REPCODE_1);
			}
			else if (repCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REPCODE_REPCODE_3);
			}
			else {
				bindRepCode = true;

				query.append(_FINDER_COLUMN_REPCODE_REPCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRepCode) {
					qPos.add(repCode);
				}

				List<DmRepresentative> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPCODE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmRepresentativePersistenceImpl.fetchByRepCode(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmRepresentative dmRepresentative = list.get(0);

					result = dmRepresentative;

					cacheResult(dmRepresentative);

					if ((dmRepresentative.getRepCode() == null) ||
							!dmRepresentative.getRepCode().equals(repCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPCODE,
							finderArgs, dmRepresentative);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPCODE,
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
			return (DmRepresentative)result;
		}
	}

	/**
	 * Removes the dm representative where repCode = &#63; from the database.
	 *
	 * @param repCode the rep code
	 * @return the dm representative that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmRepresentative removeByRepCode(String repCode)
		throws NoSuchDmRepresentativeException, SystemException {
		DmRepresentative dmRepresentative = findByRepCode(repCode);

		return remove(dmRepresentative);
	}

	/**
	 * Returns the number of dm representatives where repCode = &#63;.
	 *
	 * @param repCode the rep code
	 * @return the number of matching dm representatives
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRepCode(String repCode) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REPCODE;

		Object[] finderArgs = new Object[] { repCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMREPRESENTATIVE_WHERE);

			boolean bindRepCode = false;

			if (repCode == null) {
				query.append(_FINDER_COLUMN_REPCODE_REPCODE_1);
			}
			else if (repCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REPCODE_REPCODE_3);
			}
			else {
				bindRepCode = true;

				query.append(_FINDER_COLUMN_REPCODE_REPCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRepCode) {
					qPos.add(repCode);
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

	private static final String _FINDER_COLUMN_REPCODE_REPCODE_1 = "dmRepresentative.repCode IS NULL";
	private static final String _FINDER_COLUMN_REPCODE_REPCODE_2 = "dmRepresentative.repCode = ?";
	private static final String _FINDER_COLUMN_REPCODE_REPCODE_3 = "(dmRepresentative.repCode IS NULL OR dmRepresentative.repCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MARITIMECODE =
		new FinderPath(DmRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmRepresentativeModelImpl.FINDER_CACHE_ENABLED,
			DmRepresentativeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByMaritimeCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARITIMECODE =
		new FinderPath(DmRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmRepresentativeModelImpl.FINDER_CACHE_ENABLED,
			DmRepresentativeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMaritimeCode",
			new String[] { String.class.getName() },
			DmRepresentativeModelImpl.MARITIMECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MARITIMECODE = new FinderPath(DmRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmRepresentativeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMaritimeCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dm representatives where maritimeCode = &#63;.
	 *
	 * @param maritimeCode the maritime code
	 * @return the matching dm representatives
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmRepresentative> findByMaritimeCode(String maritimeCode)
		throws SystemException {
		return findByMaritimeCode(maritimeCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm representatives where maritimeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmRepresentativeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maritimeCode the maritime code
	 * @param start the lower bound of the range of dm representatives
	 * @param end the upper bound of the range of dm representatives (not inclusive)
	 * @return the range of matching dm representatives
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmRepresentative> findByMaritimeCode(String maritimeCode,
		int start, int end) throws SystemException {
		return findByMaritimeCode(maritimeCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm representatives where maritimeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmRepresentativeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maritimeCode the maritime code
	 * @param start the lower bound of the range of dm representatives
	 * @param end the upper bound of the range of dm representatives (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm representatives
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmRepresentative> findByMaritimeCode(String maritimeCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
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

		List<DmRepresentative> list = (List<DmRepresentative>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmRepresentative dmRepresentative : list) {
				if (!Validator.equals(maritimeCode,
							dmRepresentative.getMaritimeCode())) {
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

			query.append(_SQL_SELECT_DMREPRESENTATIVE_WHERE);

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
				query.append(DmRepresentativeModelImpl.ORDER_BY_JPQL);
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
					list = (List<DmRepresentative>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmRepresentative>(list);
				}
				else {
					list = (List<DmRepresentative>)QueryUtil.list(q,
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
	 * Returns the first dm representative in the ordered set where maritimeCode = &#63;.
	 *
	 * @param maritimeCode the maritime code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm representative
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmRepresentativeException if a matching dm representative could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmRepresentative findByMaritimeCode_First(String maritimeCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmRepresentativeException, SystemException {
		DmRepresentative dmRepresentative = fetchByMaritimeCode_First(maritimeCode,
				orderByComparator);

		if (dmRepresentative != null) {
			return dmRepresentative;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maritimeCode=");
		msg.append(maritimeCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmRepresentativeException(msg.toString());
	}

	/**
	 * Returns the first dm representative in the ordered set where maritimeCode = &#63;.
	 *
	 * @param maritimeCode the maritime code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm representative, or <code>null</code> if a matching dm representative could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmRepresentative fetchByMaritimeCode_First(String maritimeCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmRepresentative> list = findByMaritimeCode(maritimeCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm representative in the ordered set where maritimeCode = &#63;.
	 *
	 * @param maritimeCode the maritime code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm representative
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmRepresentativeException if a matching dm representative could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmRepresentative findByMaritimeCode_Last(String maritimeCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmRepresentativeException, SystemException {
		DmRepresentative dmRepresentative = fetchByMaritimeCode_Last(maritimeCode,
				orderByComparator);

		if (dmRepresentative != null) {
			return dmRepresentative;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maritimeCode=");
		msg.append(maritimeCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmRepresentativeException(msg.toString());
	}

	/**
	 * Returns the last dm representative in the ordered set where maritimeCode = &#63;.
	 *
	 * @param maritimeCode the maritime code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm representative, or <code>null</code> if a matching dm representative could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmRepresentative fetchByMaritimeCode_Last(String maritimeCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByMaritimeCode(maritimeCode);

		if (count == 0) {
			return null;
		}

		List<DmRepresentative> list = findByMaritimeCode(maritimeCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm representatives before and after the current dm representative in the ordered set where maritimeCode = &#63;.
	 *
	 * @param id the primary key of the current dm representative
	 * @param maritimeCode the maritime code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm representative
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmRepresentativeException if a dm representative with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmRepresentative[] findByMaritimeCode_PrevAndNext(int id,
		String maritimeCode, OrderByComparator orderByComparator)
		throws NoSuchDmRepresentativeException, SystemException {
		DmRepresentative dmRepresentative = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmRepresentative[] array = new DmRepresentativeImpl[3];

			array[0] = getByMaritimeCode_PrevAndNext(session, dmRepresentative,
					maritimeCode, orderByComparator, true);

			array[1] = dmRepresentative;

			array[2] = getByMaritimeCode_PrevAndNext(session, dmRepresentative,
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

	protected DmRepresentative getByMaritimeCode_PrevAndNext(Session session,
		DmRepresentative dmRepresentative, String maritimeCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMREPRESENTATIVE_WHERE);

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
			query.append(DmRepresentativeModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(dmRepresentative);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmRepresentative> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm representatives where maritimeCode = &#63; from the database.
	 *
	 * @param maritimeCode the maritime code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByMaritimeCode(String maritimeCode)
		throws SystemException {
		for (DmRepresentative dmRepresentative : findByMaritimeCode(
				maritimeCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmRepresentative);
		}
	}

	/**
	 * Returns the number of dm representatives where maritimeCode = &#63;.
	 *
	 * @param maritimeCode the maritime code
	 * @return the number of matching dm representatives
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

			query.append(_SQL_COUNT_DMREPRESENTATIVE_WHERE);

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

	private static final String _FINDER_COLUMN_MARITIMECODE_MARITIMECODE_1 = "dmRepresentative.maritimeCode IS NULL";
	private static final String _FINDER_COLUMN_MARITIMECODE_MARITIMECODE_2 = "dmRepresentative.maritimeCode = ?";
	private static final String _FINDER_COLUMN_MARITIMECODE_MARITIMECODE_3 = "(dmRepresentative.maritimeCode IS NULL OR dmRepresentative.maritimeCode = '')";

	public DmRepresentativePersistenceImpl() {
		setModelClass(DmRepresentative.class);
	}

	/**
	 * Caches the dm representative in the entity cache if it is enabled.
	 *
	 * @param dmRepresentative the dm representative
	 */
	@Override
	public void cacheResult(DmRepresentative dmRepresentative) {
		EntityCacheUtil.putResult(DmRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmRepresentativeImpl.class, dmRepresentative.getPrimaryKey(),
			dmRepresentative);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPCODE,
			new Object[] { dmRepresentative.getRepCode() }, dmRepresentative);

		dmRepresentative.resetOriginalValues();
	}

	/**
	 * Caches the dm representatives in the entity cache if it is enabled.
	 *
	 * @param dmRepresentatives the dm representatives
	 */
	@Override
	public void cacheResult(List<DmRepresentative> dmRepresentatives) {
		for (DmRepresentative dmRepresentative : dmRepresentatives) {
			if (EntityCacheUtil.getResult(
						DmRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
						DmRepresentativeImpl.class,
						dmRepresentative.getPrimaryKey()) == null) {
				cacheResult(dmRepresentative);
			}
			else {
				dmRepresentative.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm representatives.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmRepresentativeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmRepresentativeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm representative.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmRepresentative dmRepresentative) {
		EntityCacheUtil.removeResult(DmRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmRepresentativeImpl.class, dmRepresentative.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmRepresentative);
	}

	@Override
	public void clearCache(List<DmRepresentative> dmRepresentatives) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmRepresentative dmRepresentative : dmRepresentatives) {
			EntityCacheUtil.removeResult(DmRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
				DmRepresentativeImpl.class, dmRepresentative.getPrimaryKey());

			clearUniqueFindersCache(dmRepresentative);
		}
	}

	protected void cacheUniqueFindersCache(DmRepresentative dmRepresentative) {
		if (dmRepresentative.isNew()) {
			Object[] args = new Object[] { dmRepresentative.getRepCode() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REPCODE, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPCODE, args,
				dmRepresentative);
		}
		else {
			DmRepresentativeModelImpl dmRepresentativeModelImpl = (DmRepresentativeModelImpl)dmRepresentative;

			if ((dmRepresentativeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_REPCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { dmRepresentative.getRepCode() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REPCODE, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPCODE, args,
					dmRepresentative);
			}
		}
	}

	protected void clearUniqueFindersCache(DmRepresentative dmRepresentative) {
		DmRepresentativeModelImpl dmRepresentativeModelImpl = (DmRepresentativeModelImpl)dmRepresentative;

		Object[] args = new Object[] { dmRepresentative.getRepCode() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REPCODE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPCODE, args);

		if ((dmRepresentativeModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_REPCODE.getColumnBitmask()) != 0) {
			args = new Object[] { dmRepresentativeModelImpl.getOriginalRepCode() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REPCODE, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPCODE, args);
		}
	}

	/**
	 * Creates a new dm representative with the primary key. Does not add the dm representative to the database.
	 *
	 * @param id the primary key for the new dm representative
	 * @return the new dm representative
	 */
	@Override
	public DmRepresentative create(int id) {
		DmRepresentative dmRepresentative = new DmRepresentativeImpl();

		dmRepresentative.setNew(true);
		dmRepresentative.setPrimaryKey(id);

		return dmRepresentative;
	}

	/**
	 * Removes the dm representative with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm representative
	 * @return the dm representative that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmRepresentativeException if a dm representative with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmRepresentative remove(int id)
		throws NoSuchDmRepresentativeException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm representative with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm representative
	 * @return the dm representative that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmRepresentativeException if a dm representative with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmRepresentative remove(Serializable primaryKey)
		throws NoSuchDmRepresentativeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmRepresentative dmRepresentative = (DmRepresentative)session.get(DmRepresentativeImpl.class,
					primaryKey);

			if (dmRepresentative == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmRepresentativeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmRepresentative);
		}
		catch (NoSuchDmRepresentativeException nsee) {
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
	protected DmRepresentative removeImpl(DmRepresentative dmRepresentative)
		throws SystemException {
		dmRepresentative = toUnwrappedModel(dmRepresentative);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmRepresentative)) {
				dmRepresentative = (DmRepresentative)session.get(DmRepresentativeImpl.class,
						dmRepresentative.getPrimaryKeyObj());
			}

			if (dmRepresentative != null) {
				session.delete(dmRepresentative);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmRepresentative != null) {
			clearCache(dmRepresentative);
		}

		return dmRepresentative;
	}

	@Override
	public DmRepresentative updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmRepresentative dmRepresentative)
		throws SystemException {
		dmRepresentative = toUnwrappedModel(dmRepresentative);

		boolean isNew = dmRepresentative.isNew();

		DmRepresentativeModelImpl dmRepresentativeModelImpl = (DmRepresentativeModelImpl)dmRepresentative;

		Session session = null;

		try {
			session = openSession();

			if (dmRepresentative.isNew()) {
				session.save(dmRepresentative);

				dmRepresentative.setNew(false);
			}
			else {
				session.merge(dmRepresentative);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmRepresentativeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmRepresentativeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARITIMECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmRepresentativeModelImpl.getOriginalMaritimeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MARITIMECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARITIMECODE,
					args);

				args = new Object[] { dmRepresentativeModelImpl.getMaritimeCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MARITIMECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARITIMECODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
			DmRepresentativeImpl.class, dmRepresentative.getPrimaryKey(),
			dmRepresentative);

		clearUniqueFindersCache(dmRepresentative);
		cacheUniqueFindersCache(dmRepresentative);

		return dmRepresentative;
	}

	protected DmRepresentative toUnwrappedModel(
		DmRepresentative dmRepresentative) {
		if (dmRepresentative instanceof DmRepresentativeImpl) {
			return dmRepresentative;
		}

		DmRepresentativeImpl dmRepresentativeImpl = new DmRepresentativeImpl();

		dmRepresentativeImpl.setNew(dmRepresentative.isNew());
		dmRepresentativeImpl.setPrimaryKey(dmRepresentative.getPrimaryKey());

		dmRepresentativeImpl.setId(dmRepresentative.getId());
		dmRepresentativeImpl.setRepCode(dmRepresentative.getRepCode());
		dmRepresentativeImpl.setRepName(dmRepresentative.getRepName());
		dmRepresentativeImpl.setRepNameVN(dmRepresentative.getRepNameVN());
		dmRepresentativeImpl.setRepOrder(dmRepresentative.getRepOrder());
		dmRepresentativeImpl.setMaritimeCode(dmRepresentative.getMaritimeCode());
		dmRepresentativeImpl.setIsDelete(dmRepresentative.getIsDelete());
		dmRepresentativeImpl.setMarkedAsDelete(dmRepresentative.getMarkedAsDelete());
		dmRepresentativeImpl.setModifiedDate(dmRepresentative.getModifiedDate());
		dmRepresentativeImpl.setRequestedDate(dmRepresentative.getRequestedDate());
		dmRepresentativeImpl.setSyncVersion(dmRepresentative.getSyncVersion());

		return dmRepresentativeImpl;
	}

	/**
	 * Returns the dm representative with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm representative
	 * @return the dm representative
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmRepresentativeException if a dm representative with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmRepresentative findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmRepresentativeException, SystemException {
		DmRepresentative dmRepresentative = fetchByPrimaryKey(primaryKey);

		if (dmRepresentative == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmRepresentativeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmRepresentative;
	}

	/**
	 * Returns the dm representative with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmRepresentativeException} if it could not be found.
	 *
	 * @param id the primary key of the dm representative
	 * @return the dm representative
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmRepresentativeException if a dm representative with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmRepresentative findByPrimaryKey(int id)
		throws NoSuchDmRepresentativeException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm representative with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm representative
	 * @return the dm representative, or <code>null</code> if a dm representative with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmRepresentative fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmRepresentative dmRepresentative = (DmRepresentative)EntityCacheUtil.getResult(DmRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
				DmRepresentativeImpl.class, primaryKey);

		if (dmRepresentative == _nullDmRepresentative) {
			return null;
		}

		if (dmRepresentative == null) {
			Session session = null;

			try {
				session = openSession();

				dmRepresentative = (DmRepresentative)session.get(DmRepresentativeImpl.class,
						primaryKey);

				if (dmRepresentative != null) {
					cacheResult(dmRepresentative);
				}
				else {
					EntityCacheUtil.putResult(DmRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
						DmRepresentativeImpl.class, primaryKey,
						_nullDmRepresentative);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmRepresentativeModelImpl.ENTITY_CACHE_ENABLED,
					DmRepresentativeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmRepresentative;
	}

	/**
	 * Returns the dm representative with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm representative
	 * @return the dm representative, or <code>null</code> if a dm representative with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmRepresentative fetchByPrimaryKey(int id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm representatives.
	 *
	 * @return the dm representatives
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmRepresentative> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm representatives.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmRepresentativeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm representatives
	 * @param end the upper bound of the range of dm representatives (not inclusive)
	 * @return the range of dm representatives
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmRepresentative> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm representatives.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmRepresentativeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm representatives
	 * @param end the upper bound of the range of dm representatives (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm representatives
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmRepresentative> findAll(int start, int end,
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

		List<DmRepresentative> list = (List<DmRepresentative>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMREPRESENTATIVE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMREPRESENTATIVE;

				if (pagination) {
					sql = sql.concat(DmRepresentativeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmRepresentative>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmRepresentative>(list);
				}
				else {
					list = (List<DmRepresentative>)QueryUtil.list(q,
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
	 * Removes all the dm representatives from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmRepresentative dmRepresentative : findAll()) {
			remove(dmRepresentative);
		}
	}

	/**
	 * Returns the number of dm representatives.
	 *
	 * @return the number of dm representatives
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

				Query q = session.createQuery(_SQL_COUNT_DMREPRESENTATIVE);

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
	 * Initializes the dm representative persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmRepresentative")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmRepresentative>> listenersList = new ArrayList<ModelListener<DmRepresentative>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmRepresentative>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmRepresentativeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMREPRESENTATIVE = "SELECT dmRepresentative FROM DmRepresentative dmRepresentative";
	private static final String _SQL_SELECT_DMREPRESENTATIVE_WHERE = "SELECT dmRepresentative FROM DmRepresentative dmRepresentative WHERE ";
	private static final String _SQL_COUNT_DMREPRESENTATIVE = "SELECT COUNT(dmRepresentative) FROM DmRepresentative dmRepresentative";
	private static final String _SQL_COUNT_DMREPRESENTATIVE_WHERE = "SELECT COUNT(dmRepresentative) FROM DmRepresentative dmRepresentative WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmRepresentative.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmRepresentative exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmRepresentative exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmRepresentativePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"repCode", "repName", "repNameVN", "repOrder", "maritimeCode",
				"isDelete", "markedAsDelete", "modifiedDate", "requestedDate",
				"syncVersion"
			});
	private static DmRepresentative _nullDmRepresentative = new DmRepresentativeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmRepresentative> toCacheModel() {
				return _nullDmRepresentativeCacheModel;
			}
		};

	private static CacheModel<DmRepresentative> _nullDmRepresentativeCacheModel = new CacheModel<DmRepresentative>() {
			@Override
			public DmRepresentative toEntityModel() {
				return _nullDmRepresentative;
			}
		};
}