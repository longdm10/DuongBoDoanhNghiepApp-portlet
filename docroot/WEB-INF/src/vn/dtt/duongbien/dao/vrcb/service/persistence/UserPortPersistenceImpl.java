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

import vn.dtt.duongbien.dao.vrcb.NoSuchUserPortException;
import vn.dtt.duongbien.dao.vrcb.model.UserPort;
import vn.dtt.duongbien.dao.vrcb.model.impl.UserPortImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.UserPortModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the user port service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see UserPortPersistence
 * @see UserPortUtil
 * @generated
 */
public class UserPortPersistenceImpl extends BasePersistenceImpl<UserPort>
	implements UserPortPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UserPortUtil} to access the user port persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UserPortImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserPortModelImpl.ENTITY_CACHE_ENABLED,
			UserPortModelImpl.FINDER_CACHE_ENABLED, UserPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserPortModelImpl.ENTITY_CACHE_ENABLED,
			UserPortModelImpl.FINDER_CACHE_ENABLED, UserPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserPortModelImpl.ENTITY_CACHE_ENABLED,
			UserPortModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTCODE = new FinderPath(UserPortModelImpl.ENTITY_CACHE_ENABLED,
			UserPortModelImpl.FINDER_CACHE_ENABLED, UserPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPortCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE =
		new FinderPath(UserPortModelImpl.ENTITY_CACHE_ENABLED,
			UserPortModelImpl.FINDER_CACHE_ENABLED, UserPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPortCode",
			new String[] { String.class.getName() },
			UserPortModelImpl.PORTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTCODE = new FinderPath(UserPortModelImpl.ENTITY_CACHE_ENABLED,
			UserPortModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPortCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the user ports where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @return the matching user ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserPort> findByPortCode(String portCode)
		throws SystemException {
		return findByPortCode(portCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the user ports where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.UserPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portCode the port code
	 * @param start the lower bound of the range of user ports
	 * @param end the upper bound of the range of user ports (not inclusive)
	 * @return the range of matching user ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserPort> findByPortCode(String portCode, int start, int end)
		throws SystemException {
		return findByPortCode(portCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user ports where portCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.UserPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portCode the port code
	 * @param start the lower bound of the range of user ports
	 * @param end the upper bound of the range of user ports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserPort> findByPortCode(String portCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE;
			finderArgs = new Object[] { portCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTCODE;
			finderArgs = new Object[] { portCode, start, end, orderByComparator };
		}

		List<UserPort> list = (List<UserPort>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (UserPort userPort : list) {
				if (!Validator.equals(portCode, userPort.getPortCode())) {
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

			query.append(_SQL_SELECT_USERPORT_WHERE);

			boolean bindPortCode = false;

			if (portCode == null) {
				query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_1);
			}
			else if (portCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_3);
			}
			else {
				bindPortCode = true;

				query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UserPortModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPortCode) {
					qPos.add(portCode);
				}

				if (!pagination) {
					list = (List<UserPort>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserPort>(list);
				}
				else {
					list = (List<UserPort>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first user port in the ordered set where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user port
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchUserPortException if a matching user port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserPort findByPortCode_First(String portCode,
		OrderByComparator orderByComparator)
		throws NoSuchUserPortException, SystemException {
		UserPort userPort = fetchByPortCode_First(portCode, orderByComparator);

		if (userPort != null) {
			return userPort;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portCode=");
		msg.append(portCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserPortException(msg.toString());
	}

	/**
	 * Returns the first user port in the ordered set where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user port, or <code>null</code> if a matching user port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserPort fetchByPortCode_First(String portCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<UserPort> list = findByPortCode(portCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user port in the ordered set where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user port
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchUserPortException if a matching user port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserPort findByPortCode_Last(String portCode,
		OrderByComparator orderByComparator)
		throws NoSuchUserPortException, SystemException {
		UserPort userPort = fetchByPortCode_Last(portCode, orderByComparator);

		if (userPort != null) {
			return userPort;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portCode=");
		msg.append(portCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserPortException(msg.toString());
	}

	/**
	 * Returns the last user port in the ordered set where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user port, or <code>null</code> if a matching user port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserPort fetchByPortCode_Last(String portCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPortCode(portCode);

		if (count == 0) {
			return null;
		}

		List<UserPort> list = findByPortCode(portCode, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the user ports before and after the current user port in the ordered set where portCode = &#63;.
	 *
	 * @param id the primary key of the current user port
	 * @param portCode the port code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user port
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchUserPortException if a user port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserPort[] findByPortCode_PrevAndNext(long id, String portCode,
		OrderByComparator orderByComparator)
		throws NoSuchUserPortException, SystemException {
		UserPort userPort = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			UserPort[] array = new UserPortImpl[3];

			array[0] = getByPortCode_PrevAndNext(session, userPort, portCode,
					orderByComparator, true);

			array[1] = userPort;

			array[2] = getByPortCode_PrevAndNext(session, userPort, portCode,
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

	protected UserPort getByPortCode_PrevAndNext(Session session,
		UserPort userPort, String portCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERPORT_WHERE);

		boolean bindPortCode = false;

		if (portCode == null) {
			query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_1);
		}
		else if (portCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_3);
		}
		else {
			bindPortCode = true;

			query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_2);
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
			query.append(UserPortModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindPortCode) {
			qPos.add(portCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userPort);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserPort> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user ports where portCode = &#63; from the database.
	 *
	 * @param portCode the port code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPortCode(String portCode) throws SystemException {
		for (UserPort userPort : findByPortCode(portCode, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(userPort);
		}
	}

	/**
	 * Returns the number of user ports where portCode = &#63;.
	 *
	 * @param portCode the port code
	 * @return the number of matching user ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPortCode(String portCode) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PORTCODE;

		Object[] finderArgs = new Object[] { portCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_USERPORT_WHERE);

			boolean bindPortCode = false;

			if (portCode == null) {
				query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_1);
			}
			else if (portCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_3);
			}
			else {
				bindPortCode = true;

				query.append(_FINDER_COLUMN_PORTCODE_PORTCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPortCode) {
					qPos.add(portCode);
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

	private static final String _FINDER_COLUMN_PORTCODE_PORTCODE_1 = "userPort.portCode IS NULL";
	private static final String _FINDER_COLUMN_PORTCODE_PORTCODE_2 = "userPort.portCode = ?";
	private static final String _FINDER_COLUMN_PORTCODE_PORTCODE_3 = "(userPort.portCode IS NULL OR userPort.portCode = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_USERID = new FinderPath(UserPortModelImpl.ENTITY_CACHE_ENABLED,
			UserPortModelImpl.FINDER_CACHE_ENABLED, UserPortImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUserId",
			new String[] { Long.class.getName() },
			UserPortModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(UserPortModelImpl.ENTITY_CACHE_ENABLED,
			UserPortModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the user port where userId = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchUserPortException} if it could not be found.
	 *
	 * @param userId the user ID
	 * @return the matching user port
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchUserPortException if a matching user port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserPort findByUserId(long userId)
		throws NoSuchUserPortException, SystemException {
		UserPort userPort = fetchByUserId(userId);

		if (userPort == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchUserPortException(msg.toString());
		}

		return userPort;
	}

	/**
	 * Returns the user port where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user ID
	 * @return the matching user port, or <code>null</code> if a matching user port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserPort fetchByUserId(long userId) throws SystemException {
		return fetchByUserId(userId, true);
	}

	/**
	 * Returns the user port where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userId the user ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching user port, or <code>null</code> if a matching user port could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserPort fetchByUserId(long userId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { userId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_USERID,
					finderArgs, this);
		}

		if (result instanceof UserPort) {
			UserPort userPort = (UserPort)result;

			if ((userId != userPort.getUserId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_USERPORT_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				List<UserPort> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"UserPortPersistenceImpl.fetchByUserId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					UserPort userPort = list.get(0);

					result = userPort;

					cacheResult(userPort);

					if ((userPort.getUserId() != userId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
							finderArgs, userPort);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID,
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
			return (UserPort)result;
		}
	}

	/**
	 * Removes the user port where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @return the user port that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserPort removeByUserId(long userId)
		throws NoSuchUserPortException, SystemException {
		UserPort userPort = findByUserId(userId);

		return remove(userPort);
	}

	/**
	 * Returns the number of user ports where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching user ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUserId(long userId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_USERPORT_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "userPort.userId = ?";

	public UserPortPersistenceImpl() {
		setModelClass(UserPort.class);
	}

	/**
	 * Caches the user port in the entity cache if it is enabled.
	 *
	 * @param userPort the user port
	 */
	@Override
	public void cacheResult(UserPort userPort) {
		EntityCacheUtil.putResult(UserPortModelImpl.ENTITY_CACHE_ENABLED,
			UserPortImpl.class, userPort.getPrimaryKey(), userPort);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
			new Object[] { userPort.getUserId() }, userPort);

		userPort.resetOriginalValues();
	}

	/**
	 * Caches the user ports in the entity cache if it is enabled.
	 *
	 * @param userPorts the user ports
	 */
	@Override
	public void cacheResult(List<UserPort> userPorts) {
		for (UserPort userPort : userPorts) {
			if (EntityCacheUtil.getResult(
						UserPortModelImpl.ENTITY_CACHE_ENABLED,
						UserPortImpl.class, userPort.getPrimaryKey()) == null) {
				cacheResult(userPort);
			}
			else {
				userPort.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all user ports.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UserPortImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UserPortImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user port.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserPort userPort) {
		EntityCacheUtil.removeResult(UserPortModelImpl.ENTITY_CACHE_ENABLED,
			UserPortImpl.class, userPort.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(userPort);
	}

	@Override
	public void clearCache(List<UserPort> userPorts) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UserPort userPort : userPorts) {
			EntityCacheUtil.removeResult(UserPortModelImpl.ENTITY_CACHE_ENABLED,
				UserPortImpl.class, userPort.getPrimaryKey());

			clearUniqueFindersCache(userPort);
		}
	}

	protected void cacheUniqueFindersCache(UserPort userPort) {
		if (userPort.isNew()) {
			Object[] args = new Object[] { userPort.getUserId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_USERID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID, args,
				userPort);
		}
		else {
			UserPortModelImpl userPortModelImpl = (UserPortModelImpl)userPort;

			if ((userPortModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { userPort.getUserId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_USERID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID, args,
					userPort);
			}
		}
	}

	protected void clearUniqueFindersCache(UserPort userPort) {
		UserPortModelImpl userPortModelImpl = (UserPortModelImpl)userPort;

		Object[] args = new Object[] { userPort.getUserId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID, args);

		if ((userPortModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_USERID.getColumnBitmask()) != 0) {
			args = new Object[] { userPortModelImpl.getOriginalUserId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID, args);
		}
	}

	/**
	 * Creates a new user port with the primary key. Does not add the user port to the database.
	 *
	 * @param id the primary key for the new user port
	 * @return the new user port
	 */
	@Override
	public UserPort create(long id) {
		UserPort userPort = new UserPortImpl();

		userPort.setNew(true);
		userPort.setPrimaryKey(id);

		return userPort;
	}

	/**
	 * Removes the user port with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the user port
	 * @return the user port that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchUserPortException if a user port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserPort remove(long id)
		throws NoSuchUserPortException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the user port with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user port
	 * @return the user port that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchUserPortException if a user port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserPort remove(Serializable primaryKey)
		throws NoSuchUserPortException, SystemException {
		Session session = null;

		try {
			session = openSession();

			UserPort userPort = (UserPort)session.get(UserPortImpl.class,
					primaryKey);

			if (userPort == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUserPortException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(userPort);
		}
		catch (NoSuchUserPortException nsee) {
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
	protected UserPort removeImpl(UserPort userPort) throws SystemException {
		userPort = toUnwrappedModel(userPort);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(userPort)) {
				userPort = (UserPort)session.get(UserPortImpl.class,
						userPort.getPrimaryKeyObj());
			}

			if (userPort != null) {
				session.delete(userPort);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (userPort != null) {
			clearCache(userPort);
		}

		return userPort;
	}

	@Override
	public UserPort updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.UserPort userPort)
		throws SystemException {
		userPort = toUnwrappedModel(userPort);

		boolean isNew = userPort.isNew();

		UserPortModelImpl userPortModelImpl = (UserPortModelImpl)userPort;

		Session session = null;

		try {
			session = openSession();

			if (userPort.isNew()) {
				session.save(userPort);

				userPort.setNew(false);
			}
			else {
				session.merge(userPort);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !UserPortModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((userPortModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userPortModelImpl.getOriginalPortCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE,
					args);

				args = new Object[] { userPortModelImpl.getPortCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(UserPortModelImpl.ENTITY_CACHE_ENABLED,
			UserPortImpl.class, userPort.getPrimaryKey(), userPort);

		clearUniqueFindersCache(userPort);
		cacheUniqueFindersCache(userPort);

		return userPort;
	}

	protected UserPort toUnwrappedModel(UserPort userPort) {
		if (userPort instanceof UserPortImpl) {
			return userPort;
		}

		UserPortImpl userPortImpl = new UserPortImpl();

		userPortImpl.setNew(userPort.isNew());
		userPortImpl.setPrimaryKey(userPort.getPrimaryKey());

		userPortImpl.setId(userPort.getId());
		userPortImpl.setPortCode(userPort.getPortCode());
		userPortImpl.setUserId(userPort.getUserId());
		userPortImpl.setCreateDate(userPort.getCreateDate());
		userPortImpl.setStatus(userPort.getStatus());

		return userPortImpl;
	}

	/**
	 * Returns the user port with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the user port
	 * @return the user port
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchUserPortException if a user port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserPort findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUserPortException, SystemException {
		UserPort userPort = fetchByPrimaryKey(primaryKey);

		if (userPort == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUserPortException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return userPort;
	}

	/**
	 * Returns the user port with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchUserPortException} if it could not be found.
	 *
	 * @param id the primary key of the user port
	 * @return the user port
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchUserPortException if a user port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserPort findByPrimaryKey(long id)
		throws NoSuchUserPortException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the user port with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user port
	 * @return the user port, or <code>null</code> if a user port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserPort fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		UserPort userPort = (UserPort)EntityCacheUtil.getResult(UserPortModelImpl.ENTITY_CACHE_ENABLED,
				UserPortImpl.class, primaryKey);

		if (userPort == _nullUserPort) {
			return null;
		}

		if (userPort == null) {
			Session session = null;

			try {
				session = openSession();

				userPort = (UserPort)session.get(UserPortImpl.class, primaryKey);

				if (userPort != null) {
					cacheResult(userPort);
				}
				else {
					EntityCacheUtil.putResult(UserPortModelImpl.ENTITY_CACHE_ENABLED,
						UserPortImpl.class, primaryKey, _nullUserPort);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(UserPortModelImpl.ENTITY_CACHE_ENABLED,
					UserPortImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return userPort;
	}

	/**
	 * Returns the user port with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the user port
	 * @return the user port, or <code>null</code> if a user port with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserPort fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the user ports.
	 *
	 * @return the user ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserPort> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user ports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.UserPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user ports
	 * @param end the upper bound of the range of user ports (not inclusive)
	 * @return the range of user ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserPort> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the user ports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.UserPortModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user ports
	 * @param end the upper bound of the range of user ports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user ports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserPort> findAll(int start, int end,
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

		List<UserPort> list = (List<UserPort>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USERPORT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERPORT;

				if (pagination) {
					sql = sql.concat(UserPortModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UserPort>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserPort>(list);
				}
				else {
					list = (List<UserPort>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the user ports from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (UserPort userPort : findAll()) {
			remove(userPort);
		}
	}

	/**
	 * Returns the number of user ports.
	 *
	 * @return the number of user ports
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

				Query q = session.createQuery(_SQL_COUNT_USERPORT);

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
	 * Initializes the user port persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.UserPort")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<UserPort>> listenersList = new ArrayList<ModelListener<UserPort>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<UserPort>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(UserPortImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_USERPORT = "SELECT userPort FROM UserPort userPort";
	private static final String _SQL_SELECT_USERPORT_WHERE = "SELECT userPort FROM UserPort userPort WHERE ";
	private static final String _SQL_COUNT_USERPORT = "SELECT COUNT(userPort) FROM UserPort userPort";
	private static final String _SQL_COUNT_USERPORT_WHERE = "SELECT COUNT(userPort) FROM UserPort userPort WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "userPort.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserPort exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No UserPort exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UserPortPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"portCode", "userId", "createDate"
			});
	private static UserPort _nullUserPort = new UserPortImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<UserPort> toCacheModel() {
				return _nullUserPortCacheModel;
			}
		};

	private static CacheModel<UserPort> _nullUserPortCacheModel = new CacheModel<UserPort>() {
			@Override
			public UserPort toEntityModel() {
				return _nullUserPort;
			}
		};
}