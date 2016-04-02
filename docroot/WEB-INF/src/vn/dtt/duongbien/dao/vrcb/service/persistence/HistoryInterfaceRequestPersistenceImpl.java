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

import vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException;
import vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest;
import vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the history interface request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see HistoryInterfaceRequestPersistence
 * @see HistoryInterfaceRequestUtil
 * @generated
 */
public class HistoryInterfaceRequestPersistenceImpl extends BasePersistenceImpl<HistoryInterfaceRequest>
	implements HistoryInterfaceRequestPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link HistoryInterfaceRequestUtil} to access the history interface request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = HistoryInterfaceRequestImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(HistoryInterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestModelImpl.FINDER_CACHE_ENABLED,
			HistoryInterfaceRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(HistoryInterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestModelImpl.FINDER_CACHE_ENABLED,
			HistoryInterfaceRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(HistoryInterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_REQUESTCODE = new FinderPath(HistoryInterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestModelImpl.FINDER_CACHE_ENABLED,
			HistoryInterfaceRequestImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByRequestCode", new String[] { String.class.getName() },
			HistoryInterfaceRequestModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(HistoryInterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });

	/**
	 * Returns the history interface request where requestCode = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException} if it could not be found.
	 *
	 * @param requestCode the request code
	 * @return the matching history interface request
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a matching history interface request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequest findByRequestCode(String requestCode)
		throws NoSuchHistoryInterfaceRequestException, SystemException {
		HistoryInterfaceRequest historyInterfaceRequest = fetchByRequestCode(requestCode);

		if (historyInterfaceRequest == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchHistoryInterfaceRequestException(msg.toString());
		}

		return historyInterfaceRequest;
	}

	/**
	 * Returns the history interface request where requestCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param requestCode the request code
	 * @return the matching history interface request, or <code>null</code> if a matching history interface request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequest fetchByRequestCode(String requestCode)
		throws SystemException {
		return fetchByRequestCode(requestCode, true);
	}

	/**
	 * Returns the history interface request where requestCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param requestCode the request code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching history interface request, or <code>null</code> if a matching history interface request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequest fetchByRequestCode(String requestCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
					finderArgs, this);
		}

		if (result instanceof HistoryInterfaceRequest) {
			HistoryInterfaceRequest historyInterfaceRequest = (HistoryInterfaceRequest)result;

			if (!Validator.equals(requestCode,
						historyInterfaceRequest.getRequestCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_HISTORYINTERFACEREQUEST_WHERE);

			boolean bindRequestCode = false;

			if (requestCode == null) {
				query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1);
			}
			else if (requestCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3);
			}
			else {
				bindRequestCode = true;

				query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRequestCode) {
					qPos.add(requestCode);
				}

				List<HistoryInterfaceRequest> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"HistoryInterfaceRequestPersistenceImpl.fetchByRequestCode(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					HistoryInterfaceRequest historyInterfaceRequest = list.get(0);

					result = historyInterfaceRequest;

					cacheResult(historyInterfaceRequest);

					if ((historyInterfaceRequest.getRequestCode() == null) ||
							!historyInterfaceRequest.getRequestCode()
														.equals(requestCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
							finderArgs, historyInterfaceRequest);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
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
			return (HistoryInterfaceRequest)result;
		}
	}

	/**
	 * Removes the history interface request where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @return the history interface request that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequest removeByRequestCode(String requestCode)
		throws NoSuchHistoryInterfaceRequestException, SystemException {
		HistoryInterfaceRequest historyInterfaceRequest = findByRequestCode(requestCode);

		return remove(historyInterfaceRequest);
	}

	/**
	 * Returns the number of history interface requests where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching history interface requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRequestCode(String requestCode) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REQUESTCODE;

		Object[] finderArgs = new Object[] { requestCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_HISTORYINTERFACEREQUEST_WHERE);

			boolean bindRequestCode = false;

			if (requestCode == null) {
				query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1);
			}
			else if (requestCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3);
			}
			else {
				bindRequestCode = true;

				query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRequestCode) {
					qPos.add(requestCode);
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

	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "historyInterfaceRequest.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "historyInterfaceRequest.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(historyInterfaceRequest.requestCode IS NULL OR historyInterfaceRequest.requestCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONCODE =
		new FinderPath(HistoryInterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestModelImpl.FINDER_CACHE_ENABLED,
			HistoryInterfaceRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOrganizationCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONCODE =
		new FinderPath(HistoryInterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestModelImpl.FINDER_CACHE_ENABLED,
			HistoryInterfaceRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByOrganizationCode", new String[] { String.class.getName() },
			HistoryInterfaceRequestModelImpl.ORGANIZATIONCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORGANIZATIONCODE = new FinderPath(HistoryInterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByOrganizationCode", new String[] { String.class.getName() });

	/**
	 * Returns all the history interface requests where organizationCode = &#63;.
	 *
	 * @param organizationCode the organization code
	 * @return the matching history interface requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryInterfaceRequest> findByOrganizationCode(
		String organizationCode) throws SystemException {
		return findByOrganizationCode(organizationCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the history interface requests where organizationCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationCode the organization code
	 * @param start the lower bound of the range of history interface requests
	 * @param end the upper bound of the range of history interface requests (not inclusive)
	 * @return the range of matching history interface requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryInterfaceRequest> findByOrganizationCode(
		String organizationCode, int start, int end) throws SystemException {
		return findByOrganizationCode(organizationCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the history interface requests where organizationCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationCode the organization code
	 * @param start the lower bound of the range of history interface requests
	 * @param end the upper bound of the range of history interface requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching history interface requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryInterfaceRequest> findByOrganizationCode(
		String organizationCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONCODE;
			finderArgs = new Object[] { organizationCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONCODE;
			finderArgs = new Object[] {
					organizationCode,
					
					start, end, orderByComparator
				};
		}

		List<HistoryInterfaceRequest> list = (List<HistoryInterfaceRequest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (HistoryInterfaceRequest historyInterfaceRequest : list) {
				if (!Validator.equals(organizationCode,
							historyInterfaceRequest.getOrganizationCode())) {
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

			query.append(_SQL_SELECT_HISTORYINTERFACEREQUEST_WHERE);

			boolean bindOrganizationCode = false;

			if (organizationCode == null) {
				query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_1);
			}
			else if (organizationCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_3);
			}
			else {
				bindOrganizationCode = true;

				query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(HistoryInterfaceRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindOrganizationCode) {
					qPos.add(organizationCode);
				}

				if (!pagination) {
					list = (List<HistoryInterfaceRequest>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<HistoryInterfaceRequest>(list);
				}
				else {
					list = (List<HistoryInterfaceRequest>)QueryUtil.list(q,
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
	 * Returns the first history interface request in the ordered set where organizationCode = &#63;.
	 *
	 * @param organizationCode the organization code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching history interface request
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a matching history interface request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequest findByOrganizationCode_First(
		String organizationCode, OrderByComparator orderByComparator)
		throws NoSuchHistoryInterfaceRequestException, SystemException {
		HistoryInterfaceRequest historyInterfaceRequest = fetchByOrganizationCode_First(organizationCode,
				orderByComparator);

		if (historyInterfaceRequest != null) {
			return historyInterfaceRequest;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationCode=");
		msg.append(organizationCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHistoryInterfaceRequestException(msg.toString());
	}

	/**
	 * Returns the first history interface request in the ordered set where organizationCode = &#63;.
	 *
	 * @param organizationCode the organization code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching history interface request, or <code>null</code> if a matching history interface request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequest fetchByOrganizationCode_First(
		String organizationCode, OrderByComparator orderByComparator)
		throws SystemException {
		List<HistoryInterfaceRequest> list = findByOrganizationCode(organizationCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last history interface request in the ordered set where organizationCode = &#63;.
	 *
	 * @param organizationCode the organization code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching history interface request
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a matching history interface request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequest findByOrganizationCode_Last(
		String organizationCode, OrderByComparator orderByComparator)
		throws NoSuchHistoryInterfaceRequestException, SystemException {
		HistoryInterfaceRequest historyInterfaceRequest = fetchByOrganizationCode_Last(organizationCode,
				orderByComparator);

		if (historyInterfaceRequest != null) {
			return historyInterfaceRequest;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationCode=");
		msg.append(organizationCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHistoryInterfaceRequestException(msg.toString());
	}

	/**
	 * Returns the last history interface request in the ordered set where organizationCode = &#63;.
	 *
	 * @param organizationCode the organization code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching history interface request, or <code>null</code> if a matching history interface request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequest fetchByOrganizationCode_Last(
		String organizationCode, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByOrganizationCode(organizationCode);

		if (count == 0) {
			return null;
		}

		List<HistoryInterfaceRequest> list = findByOrganizationCode(organizationCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the history interface requests before and after the current history interface request in the ordered set where organizationCode = &#63;.
	 *
	 * @param id the primary key of the current history interface request
	 * @param organizationCode the organization code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next history interface request
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a history interface request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequest[] findByOrganizationCode_PrevAndNext(
		long id, String organizationCode, OrderByComparator orderByComparator)
		throws NoSuchHistoryInterfaceRequestException, SystemException {
		HistoryInterfaceRequest historyInterfaceRequest = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			HistoryInterfaceRequest[] array = new HistoryInterfaceRequestImpl[3];

			array[0] = getByOrganizationCode_PrevAndNext(session,
					historyInterfaceRequest, organizationCode,
					orderByComparator, true);

			array[1] = historyInterfaceRequest;

			array[2] = getByOrganizationCode_PrevAndNext(session,
					historyInterfaceRequest, organizationCode,
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

	protected HistoryInterfaceRequest getByOrganizationCode_PrevAndNext(
		Session session, HistoryInterfaceRequest historyInterfaceRequest,
		String organizationCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_HISTORYINTERFACEREQUEST_WHERE);

		boolean bindOrganizationCode = false;

		if (organizationCode == null) {
			query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_1);
		}
		else if (organizationCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_3);
		}
		else {
			bindOrganizationCode = true;

			query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_2);
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
			query.append(HistoryInterfaceRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindOrganizationCode) {
			qPos.add(organizationCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(historyInterfaceRequest);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<HistoryInterfaceRequest> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the history interface requests where organizationCode = &#63; from the database.
	 *
	 * @param organizationCode the organization code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByOrganizationCode(String organizationCode)
		throws SystemException {
		for (HistoryInterfaceRequest historyInterfaceRequest : findByOrganizationCode(
				organizationCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(historyInterfaceRequest);
		}
	}

	/**
	 * Returns the number of history interface requests where organizationCode = &#63;.
	 *
	 * @param organizationCode the organization code
	 * @return the number of matching history interface requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByOrganizationCode(String organizationCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ORGANIZATIONCODE;

		Object[] finderArgs = new Object[] { organizationCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_HISTORYINTERFACEREQUEST_WHERE);

			boolean bindOrganizationCode = false;

			if (organizationCode == null) {
				query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_1);
			}
			else if (organizationCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_3);
			}
			else {
				bindOrganizationCode = true;

				query.append(_FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindOrganizationCode) {
					qPos.add(organizationCode);
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

	private static final String _FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_1 =
		"historyInterfaceRequest.organizationCode IS NULL";
	private static final String _FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_2 =
		"historyInterfaceRequest.organizationCode = ?";
	private static final String _FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_3 =
		"(historyInterfaceRequest.organizationCode IS NULL OR historyInterfaceRequest.organizationCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCCODE = new FinderPath(HistoryInterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestModelImpl.FINDER_CACHE_ENABLED,
			HistoryInterfaceRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLocCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCCODE =
		new FinderPath(HistoryInterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestModelImpl.FINDER_CACHE_ENABLED,
			HistoryInterfaceRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLocCode",
			new String[] { String.class.getName() },
			HistoryInterfaceRequestModelImpl.LOCCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOCCODE = new FinderPath(HistoryInterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLocCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the history interface requests where locCode = &#63;.
	 *
	 * @param locCode the loc code
	 * @return the matching history interface requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryInterfaceRequest> findByLocCode(String locCode)
		throws SystemException {
		return findByLocCode(locCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the history interface requests where locCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param locCode the loc code
	 * @param start the lower bound of the range of history interface requests
	 * @param end the upper bound of the range of history interface requests (not inclusive)
	 * @return the range of matching history interface requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryInterfaceRequest> findByLocCode(String locCode,
		int start, int end) throws SystemException {
		return findByLocCode(locCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the history interface requests where locCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param locCode the loc code
	 * @param start the lower bound of the range of history interface requests
	 * @param end the upper bound of the range of history interface requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching history interface requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryInterfaceRequest> findByLocCode(String locCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCCODE;
			finderArgs = new Object[] { locCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCCODE;
			finderArgs = new Object[] { locCode, start, end, orderByComparator };
		}

		List<HistoryInterfaceRequest> list = (List<HistoryInterfaceRequest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (HistoryInterfaceRequest historyInterfaceRequest : list) {
				if (!Validator.equals(locCode,
							historyInterfaceRequest.getLocCode())) {
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

			query.append(_SQL_SELECT_HISTORYINTERFACEREQUEST_WHERE);

			boolean bindLocCode = false;

			if (locCode == null) {
				query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_1);
			}
			else if (locCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_3);
			}
			else {
				bindLocCode = true;

				query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(HistoryInterfaceRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLocCode) {
					qPos.add(locCode);
				}

				if (!pagination) {
					list = (List<HistoryInterfaceRequest>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<HistoryInterfaceRequest>(list);
				}
				else {
					list = (List<HistoryInterfaceRequest>)QueryUtil.list(q,
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
	 * Returns the first history interface request in the ordered set where locCode = &#63;.
	 *
	 * @param locCode the loc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching history interface request
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a matching history interface request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequest findByLocCode_First(String locCode,
		OrderByComparator orderByComparator)
		throws NoSuchHistoryInterfaceRequestException, SystemException {
		HistoryInterfaceRequest historyInterfaceRequest = fetchByLocCode_First(locCode,
				orderByComparator);

		if (historyInterfaceRequest != null) {
			return historyInterfaceRequest;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("locCode=");
		msg.append(locCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHistoryInterfaceRequestException(msg.toString());
	}

	/**
	 * Returns the first history interface request in the ordered set where locCode = &#63;.
	 *
	 * @param locCode the loc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching history interface request, or <code>null</code> if a matching history interface request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequest fetchByLocCode_First(String locCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<HistoryInterfaceRequest> list = findByLocCode(locCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last history interface request in the ordered set where locCode = &#63;.
	 *
	 * @param locCode the loc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching history interface request
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a matching history interface request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequest findByLocCode_Last(String locCode,
		OrderByComparator orderByComparator)
		throws NoSuchHistoryInterfaceRequestException, SystemException {
		HistoryInterfaceRequest historyInterfaceRequest = fetchByLocCode_Last(locCode,
				orderByComparator);

		if (historyInterfaceRequest != null) {
			return historyInterfaceRequest;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("locCode=");
		msg.append(locCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHistoryInterfaceRequestException(msg.toString());
	}

	/**
	 * Returns the last history interface request in the ordered set where locCode = &#63;.
	 *
	 * @param locCode the loc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching history interface request, or <code>null</code> if a matching history interface request could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequest fetchByLocCode_Last(String locCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByLocCode(locCode);

		if (count == 0) {
			return null;
		}

		List<HistoryInterfaceRequest> list = findByLocCode(locCode, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the history interface requests before and after the current history interface request in the ordered set where locCode = &#63;.
	 *
	 * @param id the primary key of the current history interface request
	 * @param locCode the loc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next history interface request
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a history interface request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequest[] findByLocCode_PrevAndNext(long id,
		String locCode, OrderByComparator orderByComparator)
		throws NoSuchHistoryInterfaceRequestException, SystemException {
		HistoryInterfaceRequest historyInterfaceRequest = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			HistoryInterfaceRequest[] array = new HistoryInterfaceRequestImpl[3];

			array[0] = getByLocCode_PrevAndNext(session,
					historyInterfaceRequest, locCode, orderByComparator, true);

			array[1] = historyInterfaceRequest;

			array[2] = getByLocCode_PrevAndNext(session,
					historyInterfaceRequest, locCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected HistoryInterfaceRequest getByLocCode_PrevAndNext(
		Session session, HistoryInterfaceRequest historyInterfaceRequest,
		String locCode, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_HISTORYINTERFACEREQUEST_WHERE);

		boolean bindLocCode = false;

		if (locCode == null) {
			query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_1);
		}
		else if (locCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_3);
		}
		else {
			bindLocCode = true;

			query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_2);
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
			query.append(HistoryInterfaceRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindLocCode) {
			qPos.add(locCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(historyInterfaceRequest);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<HistoryInterfaceRequest> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the history interface requests where locCode = &#63; from the database.
	 *
	 * @param locCode the loc code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByLocCode(String locCode) throws SystemException {
		for (HistoryInterfaceRequest historyInterfaceRequest : findByLocCode(
				locCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(historyInterfaceRequest);
		}
	}

	/**
	 * Returns the number of history interface requests where locCode = &#63;.
	 *
	 * @param locCode the loc code
	 * @return the number of matching history interface requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByLocCode(String locCode) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOCCODE;

		Object[] finderArgs = new Object[] { locCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_HISTORYINTERFACEREQUEST_WHERE);

			boolean bindLocCode = false;

			if (locCode == null) {
				query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_1);
			}
			else if (locCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_3);
			}
			else {
				bindLocCode = true;

				query.append(_FINDER_COLUMN_LOCCODE_LOCCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLocCode) {
					qPos.add(locCode);
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

	private static final String _FINDER_COLUMN_LOCCODE_LOCCODE_1 = "historyInterfaceRequest.locCode IS NULL";
	private static final String _FINDER_COLUMN_LOCCODE_LOCCODE_2 = "historyInterfaceRequest.locCode = ?";
	private static final String _FINDER_COLUMN_LOCCODE_LOCCODE_3 = "(historyInterfaceRequest.locCode IS NULL OR historyInterfaceRequest.locCode = '')";

	public HistoryInterfaceRequestPersistenceImpl() {
		setModelClass(HistoryInterfaceRequest.class);
	}

	/**
	 * Caches the history interface request in the entity cache if it is enabled.
	 *
	 * @param historyInterfaceRequest the history interface request
	 */
	@Override
	public void cacheResult(HistoryInterfaceRequest historyInterfaceRequest) {
		EntityCacheUtil.putResult(HistoryInterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestImpl.class,
			historyInterfaceRequest.getPrimaryKey(), historyInterfaceRequest);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
			new Object[] { historyInterfaceRequest.getRequestCode() },
			historyInterfaceRequest);

		historyInterfaceRequest.resetOriginalValues();
	}

	/**
	 * Caches the history interface requests in the entity cache if it is enabled.
	 *
	 * @param historyInterfaceRequests the history interface requests
	 */
	@Override
	public void cacheResult(
		List<HistoryInterfaceRequest> historyInterfaceRequests) {
		for (HistoryInterfaceRequest historyInterfaceRequest : historyInterfaceRequests) {
			if (EntityCacheUtil.getResult(
						HistoryInterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
						HistoryInterfaceRequestImpl.class,
						historyInterfaceRequest.getPrimaryKey()) == null) {
				cacheResult(historyInterfaceRequest);
			}
			else {
				historyInterfaceRequest.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all history interface requests.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(HistoryInterfaceRequestImpl.class.getName());
		}

		EntityCacheUtil.clearCache(HistoryInterfaceRequestImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the history interface request.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(HistoryInterfaceRequest historyInterfaceRequest) {
		EntityCacheUtil.removeResult(HistoryInterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestImpl.class,
			historyInterfaceRequest.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(historyInterfaceRequest);
	}

	@Override
	public void clearCache(
		List<HistoryInterfaceRequest> historyInterfaceRequests) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (HistoryInterfaceRequest historyInterfaceRequest : historyInterfaceRequests) {
			EntityCacheUtil.removeResult(HistoryInterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
				HistoryInterfaceRequestImpl.class,
				historyInterfaceRequest.getPrimaryKey());

			clearUniqueFindersCache(historyInterfaceRequest);
		}
	}

	protected void cacheUniqueFindersCache(
		HistoryInterfaceRequest historyInterfaceRequest) {
		if (historyInterfaceRequest.isNew()) {
			Object[] args = new Object[] {
					historyInterfaceRequest.getRequestCode()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REQUESTCODE, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE, args,
				historyInterfaceRequest);
		}
		else {
			HistoryInterfaceRequestModelImpl historyInterfaceRequestModelImpl = (HistoryInterfaceRequestModelImpl)historyInterfaceRequest;

			if ((historyInterfaceRequestModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						historyInterfaceRequest.getRequestCode()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
					args, historyInterfaceRequest);
			}
		}
	}

	protected void clearUniqueFindersCache(
		HistoryInterfaceRequest historyInterfaceRequest) {
		HistoryInterfaceRequestModelImpl historyInterfaceRequestModelImpl = (HistoryInterfaceRequestModelImpl)historyInterfaceRequest;

		Object[] args = new Object[] { historyInterfaceRequest.getRequestCode() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTCODE, args);

		if ((historyInterfaceRequestModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_REQUESTCODE.getColumnBitmask()) != 0) {
			args = new Object[] {
					historyInterfaceRequestModelImpl.getOriginalRequestCode()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTCODE, args);
		}
	}

	/**
	 * Creates a new history interface request with the primary key. Does not add the history interface request to the database.
	 *
	 * @param id the primary key for the new history interface request
	 * @return the new history interface request
	 */
	@Override
	public HistoryInterfaceRequest create(long id) {
		HistoryInterfaceRequest historyInterfaceRequest = new HistoryInterfaceRequestImpl();

		historyInterfaceRequest.setNew(true);
		historyInterfaceRequest.setPrimaryKey(id);

		return historyInterfaceRequest;
	}

	/**
	 * Removes the history interface request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the history interface request
	 * @return the history interface request that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a history interface request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequest remove(long id)
		throws NoSuchHistoryInterfaceRequestException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the history interface request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the history interface request
	 * @return the history interface request that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a history interface request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequest remove(Serializable primaryKey)
		throws NoSuchHistoryInterfaceRequestException, SystemException {
		Session session = null;

		try {
			session = openSession();

			HistoryInterfaceRequest historyInterfaceRequest = (HistoryInterfaceRequest)session.get(HistoryInterfaceRequestImpl.class,
					primaryKey);

			if (historyInterfaceRequest == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHistoryInterfaceRequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(historyInterfaceRequest);
		}
		catch (NoSuchHistoryInterfaceRequestException nsee) {
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
	protected HistoryInterfaceRequest removeImpl(
		HistoryInterfaceRequest historyInterfaceRequest)
		throws SystemException {
		historyInterfaceRequest = toUnwrappedModel(historyInterfaceRequest);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(historyInterfaceRequest)) {
				historyInterfaceRequest = (HistoryInterfaceRequest)session.get(HistoryInterfaceRequestImpl.class,
						historyInterfaceRequest.getPrimaryKeyObj());
			}

			if (historyInterfaceRequest != null) {
				session.delete(historyInterfaceRequest);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (historyInterfaceRequest != null) {
			clearCache(historyInterfaceRequest);
		}

		return historyInterfaceRequest;
	}

	@Override
	public HistoryInterfaceRequest updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest historyInterfaceRequest)
		throws SystemException {
		historyInterfaceRequest = toUnwrappedModel(historyInterfaceRequest);

		boolean isNew = historyInterfaceRequest.isNew();

		HistoryInterfaceRequestModelImpl historyInterfaceRequestModelImpl = (HistoryInterfaceRequestModelImpl)historyInterfaceRequest;

		Session session = null;

		try {
			session = openSession();

			if (historyInterfaceRequest.isNew()) {
				session.save(historyInterfaceRequest);

				historyInterfaceRequest.setNew(false);
			}
			else {
				session.merge(historyInterfaceRequest);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !HistoryInterfaceRequestModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((historyInterfaceRequestModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						historyInterfaceRequestModelImpl.getOriginalOrganizationCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONCODE,
					args);

				args = new Object[] {
						historyInterfaceRequestModelImpl.getOrganizationCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONCODE,
					args);
			}

			if ((historyInterfaceRequestModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						historyInterfaceRequestModelImpl.getOriginalLocCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCCODE,
					args);

				args = new Object[] {
						historyInterfaceRequestModelImpl.getLocCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(HistoryInterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestImpl.class,
			historyInterfaceRequest.getPrimaryKey(), historyInterfaceRequest);

		clearUniqueFindersCache(historyInterfaceRequest);
		cacheUniqueFindersCache(historyInterfaceRequest);

		return historyInterfaceRequest;
	}

	protected HistoryInterfaceRequest toUnwrappedModel(
		HistoryInterfaceRequest historyInterfaceRequest) {
		if (historyInterfaceRequest instanceof HistoryInterfaceRequestImpl) {
			return historyInterfaceRequest;
		}

		HistoryInterfaceRequestImpl historyInterfaceRequestImpl = new HistoryInterfaceRequestImpl();

		historyInterfaceRequestImpl.setNew(historyInterfaceRequest.isNew());
		historyInterfaceRequestImpl.setPrimaryKey(historyInterfaceRequest.getPrimaryKey());

		historyInterfaceRequestImpl.setId(historyInterfaceRequest.getId());
		historyInterfaceRequestImpl.setRequestCode(historyInterfaceRequest.getRequestCode());
		historyInterfaceRequestImpl.setOrganizationCode(historyInterfaceRequest.getOrganizationCode());
		historyInterfaceRequestImpl.setLocCode(historyInterfaceRequest.getLocCode());
		historyInterfaceRequestImpl.setRequestDate(historyInterfaceRequest.getRequestDate());
		historyInterfaceRequestImpl.setRequestedDate(historyInterfaceRequest.getRequestedDate());
		historyInterfaceRequestImpl.setRequestDirection(historyInterfaceRequest.getRequestDirection());
		historyInterfaceRequestImpl.setRequestState(historyInterfaceRequest.getRequestState());
		historyInterfaceRequestImpl.setRequestResponseTime(historyInterfaceRequest.getRequestResponseTime());
		historyInterfaceRequestImpl.setDocumentType(historyInterfaceRequest.getDocumentType());
		historyInterfaceRequestImpl.setBusinessType(historyInterfaceRequest.getBusinessType());
		historyInterfaceRequestImpl.setFunctionType(historyInterfaceRequest.getFunctionType());
		historyInterfaceRequestImpl.setRequestContent(historyInterfaceRequest.getRequestContent());
		historyInterfaceRequestImpl.setSenderName(historyInterfaceRequest.getSenderName());
		historyInterfaceRequestImpl.setRequestVersion(historyInterfaceRequest.getRequestVersion());
		historyInterfaceRequestImpl.setSenderIdentify(historyInterfaceRequest.getSenderIdentify());
		historyInterfaceRequestImpl.setReceiverName(historyInterfaceRequest.getReceiverName());
		historyInterfaceRequestImpl.setSendingDate(historyInterfaceRequest.getSendingDate());
		historyInterfaceRequestImpl.setReceiverIdentify(historyInterfaceRequest.getReceiverIdentify());
		historyInterfaceRequestImpl.setRemarks(historyInterfaceRequest.getRemarks());

		return historyInterfaceRequestImpl;
	}

	/**
	 * Returns the history interface request with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the history interface request
	 * @return the history interface request
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a history interface request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequest findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHistoryInterfaceRequestException, SystemException {
		HistoryInterfaceRequest historyInterfaceRequest = fetchByPrimaryKey(primaryKey);

		if (historyInterfaceRequest == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHistoryInterfaceRequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return historyInterfaceRequest;
	}

	/**
	 * Returns the history interface request with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException} if it could not be found.
	 *
	 * @param id the primary key of the history interface request
	 * @return the history interface request
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a history interface request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequest findByPrimaryKey(long id)
		throws NoSuchHistoryInterfaceRequestException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the history interface request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the history interface request
	 * @return the history interface request, or <code>null</code> if a history interface request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequest fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		HistoryInterfaceRequest historyInterfaceRequest = (HistoryInterfaceRequest)EntityCacheUtil.getResult(HistoryInterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
				HistoryInterfaceRequestImpl.class, primaryKey);

		if (historyInterfaceRequest == _nullHistoryInterfaceRequest) {
			return null;
		}

		if (historyInterfaceRequest == null) {
			Session session = null;

			try {
				session = openSession();

				historyInterfaceRequest = (HistoryInterfaceRequest)session.get(HistoryInterfaceRequestImpl.class,
						primaryKey);

				if (historyInterfaceRequest != null) {
					cacheResult(historyInterfaceRequest);
				}
				else {
					EntityCacheUtil.putResult(HistoryInterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
						HistoryInterfaceRequestImpl.class, primaryKey,
						_nullHistoryInterfaceRequest);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(HistoryInterfaceRequestModelImpl.ENTITY_CACHE_ENABLED,
					HistoryInterfaceRequestImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return historyInterfaceRequest;
	}

	/**
	 * Returns the history interface request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the history interface request
	 * @return the history interface request, or <code>null</code> if a history interface request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequest fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the history interface requests.
	 *
	 * @return the history interface requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryInterfaceRequest> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the history interface requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of history interface requests
	 * @param end the upper bound of the range of history interface requests (not inclusive)
	 * @return the range of history interface requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryInterfaceRequest> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the history interface requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of history interface requests
	 * @param end the upper bound of the range of history interface requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of history interface requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryInterfaceRequest> findAll(int start, int end,
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

		List<HistoryInterfaceRequest> list = (List<HistoryInterfaceRequest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_HISTORYINTERFACEREQUEST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_HISTORYINTERFACEREQUEST;

				if (pagination) {
					sql = sql.concat(HistoryInterfaceRequestModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<HistoryInterfaceRequest>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<HistoryInterfaceRequest>(list);
				}
				else {
					list = (List<HistoryInterfaceRequest>)QueryUtil.list(q,
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
	 * Removes all the history interface requests from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (HistoryInterfaceRequest historyInterfaceRequest : findAll()) {
			remove(historyInterfaceRequest);
		}
	}

	/**
	 * Returns the number of history interface requests.
	 *
	 * @return the number of history interface requests
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

				Query q = session.createQuery(_SQL_COUNT_HISTORYINTERFACEREQUEST);

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
	 * Initializes the history interface request persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<HistoryInterfaceRequest>> listenersList = new ArrayList<ModelListener<HistoryInterfaceRequest>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<HistoryInterfaceRequest>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(HistoryInterfaceRequestImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_HISTORYINTERFACEREQUEST = "SELECT historyInterfaceRequest FROM HistoryInterfaceRequest historyInterfaceRequest";
	private static final String _SQL_SELECT_HISTORYINTERFACEREQUEST_WHERE = "SELECT historyInterfaceRequest FROM HistoryInterfaceRequest historyInterfaceRequest WHERE ";
	private static final String _SQL_COUNT_HISTORYINTERFACEREQUEST = "SELECT COUNT(historyInterfaceRequest) FROM HistoryInterfaceRequest historyInterfaceRequest";
	private static final String _SQL_COUNT_HISTORYINTERFACEREQUEST_WHERE = "SELECT COUNT(historyInterfaceRequest) FROM HistoryInterfaceRequest historyInterfaceRequest WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "historyInterfaceRequest.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No HistoryInterfaceRequest exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No HistoryInterfaceRequest exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(HistoryInterfaceRequestPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "organizationCode", "locCode",
				"requestDate", "requestedDate", "requestDirection",
				"requestState", "requestResponseTime", "documentType",
				"businessType", "functionType", "requestContent", "senderName",
				"requestVersion", "senderIdentify", "receiverName",
				"sendingDate", "receiverIdentify", "remarks"
			});
	private static HistoryInterfaceRequest _nullHistoryInterfaceRequest = new HistoryInterfaceRequestImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<HistoryInterfaceRequest> toCacheModel() {
				return _nullHistoryInterfaceRequestCacheModel;
			}
		};

	private static CacheModel<HistoryInterfaceRequest> _nullHistoryInterfaceRequestCacheModel =
		new CacheModel<HistoryInterfaceRequest>() {
			@Override
			public HistoryInterfaceRequest toEntityModel() {
				return _nullHistoryInterfaceRequest;
			}
		};
}