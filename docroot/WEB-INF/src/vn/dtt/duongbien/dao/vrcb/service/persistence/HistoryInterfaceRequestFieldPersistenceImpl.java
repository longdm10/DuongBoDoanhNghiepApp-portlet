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

import vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestFieldException;
import vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequestField;
import vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestFieldImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestFieldModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the history interface request field service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see HistoryInterfaceRequestFieldPersistence
 * @see HistoryInterfaceRequestFieldUtil
 * @generated
 */
public class HistoryInterfaceRequestFieldPersistenceImpl
	extends BasePersistenceImpl<HistoryInterfaceRequestField>
	implements HistoryInterfaceRequestFieldPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link HistoryInterfaceRequestFieldUtil} to access the history interface request field persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = HistoryInterfaceRequestFieldImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(HistoryInterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestFieldModelImpl.FINDER_CACHE_ENABLED,
			HistoryInterfaceRequestFieldImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(HistoryInterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestFieldModelImpl.FINDER_CACHE_ENABLED,
			HistoryInterfaceRequestFieldImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(HistoryInterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestFieldModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_REQUESTCODE = new FinderPath(HistoryInterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestFieldModelImpl.FINDER_CACHE_ENABLED,
			HistoryInterfaceRequestFieldImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByRequestCode", new String[] { String.class.getName() },
			HistoryInterfaceRequestFieldModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(HistoryInterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestFieldModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRequestCode", new String[] { String.class.getName() });

	/**
	 * Returns the history interface request field where requestCode = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestFieldException} if it could not be found.
	 *
	 * @param requestCode the request code
	 * @return the matching history interface request field
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestFieldException if a matching history interface request field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequestField findByRequestCode(String requestCode)
		throws NoSuchHistoryInterfaceRequestFieldException, SystemException {
		HistoryInterfaceRequestField historyInterfaceRequestField = fetchByRequestCode(requestCode);

		if (historyInterfaceRequestField == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchHistoryInterfaceRequestFieldException(msg.toString());
		}

		return historyInterfaceRequestField;
	}

	/**
	 * Returns the history interface request field where requestCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param requestCode the request code
	 * @return the matching history interface request field, or <code>null</code> if a matching history interface request field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequestField fetchByRequestCode(String requestCode)
		throws SystemException {
		return fetchByRequestCode(requestCode, true);
	}

	/**
	 * Returns the history interface request field where requestCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param requestCode the request code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching history interface request field, or <code>null</code> if a matching history interface request field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequestField fetchByRequestCode(String requestCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
					finderArgs, this);
		}

		if (result instanceof HistoryInterfaceRequestField) {
			HistoryInterfaceRequestField historyInterfaceRequestField = (HistoryInterfaceRequestField)result;

			if (!Validator.equals(requestCode,
						historyInterfaceRequestField.getRequestCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_HISTORYINTERFACEREQUESTFIELD_WHERE);

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

				List<HistoryInterfaceRequestField> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"HistoryInterfaceRequestFieldPersistenceImpl.fetchByRequestCode(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					HistoryInterfaceRequestField historyInterfaceRequestField = list.get(0);

					result = historyInterfaceRequestField;

					cacheResult(historyInterfaceRequestField);

					if ((historyInterfaceRequestField.getRequestCode() == null) ||
							!historyInterfaceRequestField.getRequestCode()
															 .equals(requestCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
							finderArgs, historyInterfaceRequestField);
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
			return (HistoryInterfaceRequestField)result;
		}
	}

	/**
	 * Removes the history interface request field where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @return the history interface request field that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequestField removeByRequestCode(String requestCode)
		throws NoSuchHistoryInterfaceRequestFieldException, SystemException {
		HistoryInterfaceRequestField historyInterfaceRequestField = findByRequestCode(requestCode);

		return remove(historyInterfaceRequestField);
	}

	/**
	 * Returns the number of history interface request fields where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching history interface request fields
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

			query.append(_SQL_COUNT_HISTORYINTERFACEREQUESTFIELD_WHERE);

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

	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "historyInterfaceRequestField.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "historyInterfaceRequestField.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(historyInterfaceRequestField.requestCode IS NULL OR historyInterfaceRequestField.requestCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONCODE =
		new FinderPath(HistoryInterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestFieldModelImpl.FINDER_CACHE_ENABLED,
			HistoryInterfaceRequestFieldImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOrganizationCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONCODE =
		new FinderPath(HistoryInterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestFieldModelImpl.FINDER_CACHE_ENABLED,
			HistoryInterfaceRequestFieldImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByOrganizationCode", new String[] { String.class.getName() },
			HistoryInterfaceRequestFieldModelImpl.ORGANIZATIONCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORGANIZATIONCODE = new FinderPath(HistoryInterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestFieldModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByOrganizationCode", new String[] { String.class.getName() });

	/**
	 * Returns all the history interface request fields where organizationCode = &#63;.
	 *
	 * @param organizationCode the organization code
	 * @return the matching history interface request fields
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryInterfaceRequestField> findByOrganizationCode(
		String organizationCode) throws SystemException {
		return findByOrganizationCode(organizationCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the history interface request fields where organizationCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationCode the organization code
	 * @param start the lower bound of the range of history interface request fields
	 * @param end the upper bound of the range of history interface request fields (not inclusive)
	 * @return the range of matching history interface request fields
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryInterfaceRequestField> findByOrganizationCode(
		String organizationCode, int start, int end) throws SystemException {
		return findByOrganizationCode(organizationCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the history interface request fields where organizationCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationCode the organization code
	 * @param start the lower bound of the range of history interface request fields
	 * @param end the upper bound of the range of history interface request fields (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching history interface request fields
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryInterfaceRequestField> findByOrganizationCode(
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

		List<HistoryInterfaceRequestField> list = (List<HistoryInterfaceRequestField>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (HistoryInterfaceRequestField historyInterfaceRequestField : list) {
				if (!Validator.equals(organizationCode,
							historyInterfaceRequestField.getOrganizationCode())) {
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

			query.append(_SQL_SELECT_HISTORYINTERFACEREQUESTFIELD_WHERE);

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
				query.append(HistoryInterfaceRequestFieldModelImpl.ORDER_BY_JPQL);
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
					list = (List<HistoryInterfaceRequestField>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<HistoryInterfaceRequestField>(list);
				}
				else {
					list = (List<HistoryInterfaceRequestField>)QueryUtil.list(q,
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
	 * Returns the first history interface request field in the ordered set where organizationCode = &#63;.
	 *
	 * @param organizationCode the organization code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching history interface request field
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestFieldException if a matching history interface request field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequestField findByOrganizationCode_First(
		String organizationCode, OrderByComparator orderByComparator)
		throws NoSuchHistoryInterfaceRequestFieldException, SystemException {
		HistoryInterfaceRequestField historyInterfaceRequestField = fetchByOrganizationCode_First(organizationCode,
				orderByComparator);

		if (historyInterfaceRequestField != null) {
			return historyInterfaceRequestField;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationCode=");
		msg.append(organizationCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHistoryInterfaceRequestFieldException(msg.toString());
	}

	/**
	 * Returns the first history interface request field in the ordered set where organizationCode = &#63;.
	 *
	 * @param organizationCode the organization code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching history interface request field, or <code>null</code> if a matching history interface request field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequestField fetchByOrganizationCode_First(
		String organizationCode, OrderByComparator orderByComparator)
		throws SystemException {
		List<HistoryInterfaceRequestField> list = findByOrganizationCode(organizationCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last history interface request field in the ordered set where organizationCode = &#63;.
	 *
	 * @param organizationCode the organization code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching history interface request field
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestFieldException if a matching history interface request field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequestField findByOrganizationCode_Last(
		String organizationCode, OrderByComparator orderByComparator)
		throws NoSuchHistoryInterfaceRequestFieldException, SystemException {
		HistoryInterfaceRequestField historyInterfaceRequestField = fetchByOrganizationCode_Last(organizationCode,
				orderByComparator);

		if (historyInterfaceRequestField != null) {
			return historyInterfaceRequestField;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationCode=");
		msg.append(organizationCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHistoryInterfaceRequestFieldException(msg.toString());
	}

	/**
	 * Returns the last history interface request field in the ordered set where organizationCode = &#63;.
	 *
	 * @param organizationCode the organization code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching history interface request field, or <code>null</code> if a matching history interface request field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequestField fetchByOrganizationCode_Last(
		String organizationCode, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByOrganizationCode(organizationCode);

		if (count == 0) {
			return null;
		}

		List<HistoryInterfaceRequestField> list = findByOrganizationCode(organizationCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the history interface request fields before and after the current history interface request field in the ordered set where organizationCode = &#63;.
	 *
	 * @param id the primary key of the current history interface request field
	 * @param organizationCode the organization code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next history interface request field
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestFieldException if a history interface request field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequestField[] findByOrganizationCode_PrevAndNext(
		long id, String organizationCode, OrderByComparator orderByComparator)
		throws NoSuchHistoryInterfaceRequestFieldException, SystemException {
		HistoryInterfaceRequestField historyInterfaceRequestField = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			HistoryInterfaceRequestField[] array = new HistoryInterfaceRequestFieldImpl[3];

			array[0] = getByOrganizationCode_PrevAndNext(session,
					historyInterfaceRequestField, organizationCode,
					orderByComparator, true);

			array[1] = historyInterfaceRequestField;

			array[2] = getByOrganizationCode_PrevAndNext(session,
					historyInterfaceRequestField, organizationCode,
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

	protected HistoryInterfaceRequestField getByOrganizationCode_PrevAndNext(
		Session session,
		HistoryInterfaceRequestField historyInterfaceRequestField,
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

		query.append(_SQL_SELECT_HISTORYINTERFACEREQUESTFIELD_WHERE);

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
			query.append(HistoryInterfaceRequestFieldModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(historyInterfaceRequestField);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<HistoryInterfaceRequestField> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the history interface request fields where organizationCode = &#63; from the database.
	 *
	 * @param organizationCode the organization code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByOrganizationCode(String organizationCode)
		throws SystemException {
		for (HistoryInterfaceRequestField historyInterfaceRequestField : findByOrganizationCode(
				organizationCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(historyInterfaceRequestField);
		}
	}

	/**
	 * Returns the number of history interface request fields where organizationCode = &#63;.
	 *
	 * @param organizationCode the organization code
	 * @return the number of matching history interface request fields
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

			query.append(_SQL_COUNT_HISTORYINTERFACEREQUESTFIELD_WHERE);

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
		"historyInterfaceRequestField.organizationCode IS NULL";
	private static final String _FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_2 =
		"historyInterfaceRequestField.organizationCode = ?";
	private static final String _FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_3 =
		"(historyInterfaceRequestField.organizationCode IS NULL OR historyInterfaceRequestField.organizationCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCCODE = new FinderPath(HistoryInterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestFieldModelImpl.FINDER_CACHE_ENABLED,
			HistoryInterfaceRequestFieldImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLocCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCCODE =
		new FinderPath(HistoryInterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestFieldModelImpl.FINDER_CACHE_ENABLED,
			HistoryInterfaceRequestFieldImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLocCode",
			new String[] { String.class.getName() },
			HistoryInterfaceRequestFieldModelImpl.LOCCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOCCODE = new FinderPath(HistoryInterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestFieldModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByLocCode", new String[] { String.class.getName() });

	/**
	 * Returns all the history interface request fields where locCode = &#63;.
	 *
	 * @param locCode the loc code
	 * @return the matching history interface request fields
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryInterfaceRequestField> findByLocCode(String locCode)
		throws SystemException {
		return findByLocCode(locCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the history interface request fields where locCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param locCode the loc code
	 * @param start the lower bound of the range of history interface request fields
	 * @param end the upper bound of the range of history interface request fields (not inclusive)
	 * @return the range of matching history interface request fields
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryInterfaceRequestField> findByLocCode(String locCode,
		int start, int end) throws SystemException {
		return findByLocCode(locCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the history interface request fields where locCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param locCode the loc code
	 * @param start the lower bound of the range of history interface request fields
	 * @param end the upper bound of the range of history interface request fields (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching history interface request fields
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryInterfaceRequestField> findByLocCode(String locCode,
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

		List<HistoryInterfaceRequestField> list = (List<HistoryInterfaceRequestField>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (HistoryInterfaceRequestField historyInterfaceRequestField : list) {
				if (!Validator.equals(locCode,
							historyInterfaceRequestField.getLocCode())) {
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

			query.append(_SQL_SELECT_HISTORYINTERFACEREQUESTFIELD_WHERE);

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
				query.append(HistoryInterfaceRequestFieldModelImpl.ORDER_BY_JPQL);
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
					list = (List<HistoryInterfaceRequestField>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<HistoryInterfaceRequestField>(list);
				}
				else {
					list = (List<HistoryInterfaceRequestField>)QueryUtil.list(q,
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
	 * Returns the first history interface request field in the ordered set where locCode = &#63;.
	 *
	 * @param locCode the loc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching history interface request field
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestFieldException if a matching history interface request field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequestField findByLocCode_First(String locCode,
		OrderByComparator orderByComparator)
		throws NoSuchHistoryInterfaceRequestFieldException, SystemException {
		HistoryInterfaceRequestField historyInterfaceRequestField = fetchByLocCode_First(locCode,
				orderByComparator);

		if (historyInterfaceRequestField != null) {
			return historyInterfaceRequestField;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("locCode=");
		msg.append(locCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHistoryInterfaceRequestFieldException(msg.toString());
	}

	/**
	 * Returns the first history interface request field in the ordered set where locCode = &#63;.
	 *
	 * @param locCode the loc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching history interface request field, or <code>null</code> if a matching history interface request field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequestField fetchByLocCode_First(String locCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<HistoryInterfaceRequestField> list = findByLocCode(locCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last history interface request field in the ordered set where locCode = &#63;.
	 *
	 * @param locCode the loc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching history interface request field
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestFieldException if a matching history interface request field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequestField findByLocCode_Last(String locCode,
		OrderByComparator orderByComparator)
		throws NoSuchHistoryInterfaceRequestFieldException, SystemException {
		HistoryInterfaceRequestField historyInterfaceRequestField = fetchByLocCode_Last(locCode,
				orderByComparator);

		if (historyInterfaceRequestField != null) {
			return historyInterfaceRequestField;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("locCode=");
		msg.append(locCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHistoryInterfaceRequestFieldException(msg.toString());
	}

	/**
	 * Returns the last history interface request field in the ordered set where locCode = &#63;.
	 *
	 * @param locCode the loc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching history interface request field, or <code>null</code> if a matching history interface request field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequestField fetchByLocCode_Last(String locCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByLocCode(locCode);

		if (count == 0) {
			return null;
		}

		List<HistoryInterfaceRequestField> list = findByLocCode(locCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the history interface request fields before and after the current history interface request field in the ordered set where locCode = &#63;.
	 *
	 * @param id the primary key of the current history interface request field
	 * @param locCode the loc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next history interface request field
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestFieldException if a history interface request field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequestField[] findByLocCode_PrevAndNext(long id,
		String locCode, OrderByComparator orderByComparator)
		throws NoSuchHistoryInterfaceRequestFieldException, SystemException {
		HistoryInterfaceRequestField historyInterfaceRequestField = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			HistoryInterfaceRequestField[] array = new HistoryInterfaceRequestFieldImpl[3];

			array[0] = getByLocCode_PrevAndNext(session,
					historyInterfaceRequestField, locCode, orderByComparator,
					true);

			array[1] = historyInterfaceRequestField;

			array[2] = getByLocCode_PrevAndNext(session,
					historyInterfaceRequestField, locCode, orderByComparator,
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

	protected HistoryInterfaceRequestField getByLocCode_PrevAndNext(
		Session session,
		HistoryInterfaceRequestField historyInterfaceRequestField,
		String locCode, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_HISTORYINTERFACEREQUESTFIELD_WHERE);

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
			query.append(HistoryInterfaceRequestFieldModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(historyInterfaceRequestField);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<HistoryInterfaceRequestField> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the history interface request fields where locCode = &#63; from the database.
	 *
	 * @param locCode the loc code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByLocCode(String locCode) throws SystemException {
		for (HistoryInterfaceRequestField historyInterfaceRequestField : findByLocCode(
				locCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(historyInterfaceRequestField);
		}
	}

	/**
	 * Returns the number of history interface request fields where locCode = &#63;.
	 *
	 * @param locCode the loc code
	 * @return the number of matching history interface request fields
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

			query.append(_SQL_COUNT_HISTORYINTERFACEREQUESTFIELD_WHERE);

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

	private static final String _FINDER_COLUMN_LOCCODE_LOCCODE_1 = "historyInterfaceRequestField.locCode IS NULL";
	private static final String _FINDER_COLUMN_LOCCODE_LOCCODE_2 = "historyInterfaceRequestField.locCode = ?";
	private static final String _FINDER_COLUMN_LOCCODE_LOCCODE_3 = "(historyInterfaceRequestField.locCode IS NULL OR historyInterfaceRequestField.locCode = '')";

	public HistoryInterfaceRequestFieldPersistenceImpl() {
		setModelClass(HistoryInterfaceRequestField.class);
	}

	/**
	 * Caches the history interface request field in the entity cache if it is enabled.
	 *
	 * @param historyInterfaceRequestField the history interface request field
	 */
	@Override
	public void cacheResult(
		HistoryInterfaceRequestField historyInterfaceRequestField) {
		EntityCacheUtil.putResult(HistoryInterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestFieldImpl.class,
			historyInterfaceRequestField.getPrimaryKey(),
			historyInterfaceRequestField);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
			new Object[] { historyInterfaceRequestField.getRequestCode() },
			historyInterfaceRequestField);

		historyInterfaceRequestField.resetOriginalValues();
	}

	/**
	 * Caches the history interface request fields in the entity cache if it is enabled.
	 *
	 * @param historyInterfaceRequestFields the history interface request fields
	 */
	@Override
	public void cacheResult(
		List<HistoryInterfaceRequestField> historyInterfaceRequestFields) {
		for (HistoryInterfaceRequestField historyInterfaceRequestField : historyInterfaceRequestFields) {
			if (EntityCacheUtil.getResult(
						HistoryInterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
						HistoryInterfaceRequestFieldImpl.class,
						historyInterfaceRequestField.getPrimaryKey()) == null) {
				cacheResult(historyInterfaceRequestField);
			}
			else {
				historyInterfaceRequestField.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all history interface request fields.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(HistoryInterfaceRequestFieldImpl.class.getName());
		}

		EntityCacheUtil.clearCache(HistoryInterfaceRequestFieldImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the history interface request field.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		HistoryInterfaceRequestField historyInterfaceRequestField) {
		EntityCacheUtil.removeResult(HistoryInterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestFieldImpl.class,
			historyInterfaceRequestField.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(historyInterfaceRequestField);
	}

	@Override
	public void clearCache(
		List<HistoryInterfaceRequestField> historyInterfaceRequestFields) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (HistoryInterfaceRequestField historyInterfaceRequestField : historyInterfaceRequestFields) {
			EntityCacheUtil.removeResult(HistoryInterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
				HistoryInterfaceRequestFieldImpl.class,
				historyInterfaceRequestField.getPrimaryKey());

			clearUniqueFindersCache(historyInterfaceRequestField);
		}
	}

	protected void cacheUniqueFindersCache(
		HistoryInterfaceRequestField historyInterfaceRequestField) {
		if (historyInterfaceRequestField.isNew()) {
			Object[] args = new Object[] {
					historyInterfaceRequestField.getRequestCode()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REQUESTCODE, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE, args,
				historyInterfaceRequestField);
		}
		else {
			HistoryInterfaceRequestFieldModelImpl historyInterfaceRequestFieldModelImpl =
				(HistoryInterfaceRequestFieldModelImpl)historyInterfaceRequestField;

			if ((historyInterfaceRequestFieldModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						historyInterfaceRequestField.getRequestCode()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
					args, historyInterfaceRequestField);
			}
		}
	}

	protected void clearUniqueFindersCache(
		HistoryInterfaceRequestField historyInterfaceRequestField) {
		HistoryInterfaceRequestFieldModelImpl historyInterfaceRequestFieldModelImpl =
			(HistoryInterfaceRequestFieldModelImpl)historyInterfaceRequestField;

		Object[] args = new Object[] {
				historyInterfaceRequestField.getRequestCode()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTCODE, args);

		if ((historyInterfaceRequestFieldModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_REQUESTCODE.getColumnBitmask()) != 0) {
			args = new Object[] {
					historyInterfaceRequestFieldModelImpl.getOriginalRequestCode()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTCODE, args);
		}
	}

	/**
	 * Creates a new history interface request field with the primary key. Does not add the history interface request field to the database.
	 *
	 * @param id the primary key for the new history interface request field
	 * @return the new history interface request field
	 */
	@Override
	public HistoryInterfaceRequestField create(long id) {
		HistoryInterfaceRequestField historyInterfaceRequestField = new HistoryInterfaceRequestFieldImpl();

		historyInterfaceRequestField.setNew(true);
		historyInterfaceRequestField.setPrimaryKey(id);

		return historyInterfaceRequestField;
	}

	/**
	 * Removes the history interface request field with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the history interface request field
	 * @return the history interface request field that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestFieldException if a history interface request field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequestField remove(long id)
		throws NoSuchHistoryInterfaceRequestFieldException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the history interface request field with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the history interface request field
	 * @return the history interface request field that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestFieldException if a history interface request field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequestField remove(Serializable primaryKey)
		throws NoSuchHistoryInterfaceRequestFieldException, SystemException {
		Session session = null;

		try {
			session = openSession();

			HistoryInterfaceRequestField historyInterfaceRequestField = (HistoryInterfaceRequestField)session.get(HistoryInterfaceRequestFieldImpl.class,
					primaryKey);

			if (historyInterfaceRequestField == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHistoryInterfaceRequestFieldException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(historyInterfaceRequestField);
		}
		catch (NoSuchHistoryInterfaceRequestFieldException nsee) {
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
	protected HistoryInterfaceRequestField removeImpl(
		HistoryInterfaceRequestField historyInterfaceRequestField)
		throws SystemException {
		historyInterfaceRequestField = toUnwrappedModel(historyInterfaceRequestField);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(historyInterfaceRequestField)) {
				historyInterfaceRequestField = (HistoryInterfaceRequestField)session.get(HistoryInterfaceRequestFieldImpl.class,
						historyInterfaceRequestField.getPrimaryKeyObj());
			}

			if (historyInterfaceRequestField != null) {
				session.delete(historyInterfaceRequestField);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (historyInterfaceRequestField != null) {
			clearCache(historyInterfaceRequestField);
		}

		return historyInterfaceRequestField;
	}

	@Override
	public HistoryInterfaceRequestField updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequestField historyInterfaceRequestField)
		throws SystemException {
		historyInterfaceRequestField = toUnwrappedModel(historyInterfaceRequestField);

		boolean isNew = historyInterfaceRequestField.isNew();

		HistoryInterfaceRequestFieldModelImpl historyInterfaceRequestFieldModelImpl =
			(HistoryInterfaceRequestFieldModelImpl)historyInterfaceRequestField;

		Session session = null;

		try {
			session = openSession();

			if (historyInterfaceRequestField.isNew()) {
				session.save(historyInterfaceRequestField);

				historyInterfaceRequestField.setNew(false);
			}
			else {
				session.merge(historyInterfaceRequestField);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew ||
				!HistoryInterfaceRequestFieldModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((historyInterfaceRequestFieldModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						historyInterfaceRequestFieldModelImpl.getOriginalOrganizationCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONCODE,
					args);

				args = new Object[] {
						historyInterfaceRequestFieldModelImpl.getOrganizationCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONCODE,
					args);
			}

			if ((historyInterfaceRequestFieldModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						historyInterfaceRequestFieldModelImpl.getOriginalLocCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCCODE,
					args);

				args = new Object[] {
						historyInterfaceRequestFieldModelImpl.getLocCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(HistoryInterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			HistoryInterfaceRequestFieldImpl.class,
			historyInterfaceRequestField.getPrimaryKey(),
			historyInterfaceRequestField);

		clearUniqueFindersCache(historyInterfaceRequestField);
		cacheUniqueFindersCache(historyInterfaceRequestField);

		return historyInterfaceRequestField;
	}

	protected HistoryInterfaceRequestField toUnwrappedModel(
		HistoryInterfaceRequestField historyInterfaceRequestField) {
		if (historyInterfaceRequestField instanceof HistoryInterfaceRequestFieldImpl) {
			return historyInterfaceRequestField;
		}

		HistoryInterfaceRequestFieldImpl historyInterfaceRequestFieldImpl = new HistoryInterfaceRequestFieldImpl();

		historyInterfaceRequestFieldImpl.setNew(historyInterfaceRequestField.isNew());
		historyInterfaceRequestFieldImpl.setPrimaryKey(historyInterfaceRequestField.getPrimaryKey());

		historyInterfaceRequestFieldImpl.setId(historyInterfaceRequestField.getId());
		historyInterfaceRequestFieldImpl.setRequestCode(historyInterfaceRequestField.getRequestCode());
		historyInterfaceRequestFieldImpl.setOrganizationCode(historyInterfaceRequestField.getOrganizationCode());
		historyInterfaceRequestFieldImpl.setLocCode(historyInterfaceRequestField.getLocCode());
		historyInterfaceRequestFieldImpl.setRequestDate(historyInterfaceRequestField.getRequestDate());
		historyInterfaceRequestFieldImpl.setRequestedDate(historyInterfaceRequestField.getRequestedDate());
		historyInterfaceRequestFieldImpl.setRequestDirection(historyInterfaceRequestField.getRequestDirection());
		historyInterfaceRequestFieldImpl.setRequestState(historyInterfaceRequestField.getRequestState());
		historyInterfaceRequestFieldImpl.setRequestResponseTime(historyInterfaceRequestField.getRequestResponseTime());
		historyInterfaceRequestFieldImpl.setDocumentType(historyInterfaceRequestField.getDocumentType());
		historyInterfaceRequestFieldImpl.setBusinessType(historyInterfaceRequestField.getBusinessType());
		historyInterfaceRequestFieldImpl.setFunctionType(historyInterfaceRequestField.getFunctionType());
		historyInterfaceRequestFieldImpl.setSenderName(historyInterfaceRequestField.getSenderName());
		historyInterfaceRequestFieldImpl.setRequestVersion(historyInterfaceRequestField.getRequestVersion());
		historyInterfaceRequestFieldImpl.setSenderIdentify(historyInterfaceRequestField.getSenderIdentify());
		historyInterfaceRequestFieldImpl.setReceiverName(historyInterfaceRequestField.getReceiverName());
		historyInterfaceRequestFieldImpl.setSendingDate(historyInterfaceRequestField.getSendingDate());
		historyInterfaceRequestFieldImpl.setReceiverIdentify(historyInterfaceRequestField.getReceiverIdentify());
		historyInterfaceRequestFieldImpl.setRemarks(historyInterfaceRequestField.getRemarks());

		return historyInterfaceRequestFieldImpl;
	}

	/**
	 * Returns the history interface request field with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the history interface request field
	 * @return the history interface request field
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestFieldException if a history interface request field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequestField findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchHistoryInterfaceRequestFieldException, SystemException {
		HistoryInterfaceRequestField historyInterfaceRequestField = fetchByPrimaryKey(primaryKey);

		if (historyInterfaceRequestField == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHistoryInterfaceRequestFieldException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return historyInterfaceRequestField;
	}

	/**
	 * Returns the history interface request field with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestFieldException} if it could not be found.
	 *
	 * @param id the primary key of the history interface request field
	 * @return the history interface request field
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestFieldException if a history interface request field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequestField findByPrimaryKey(long id)
		throws NoSuchHistoryInterfaceRequestFieldException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the history interface request field with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the history interface request field
	 * @return the history interface request field, or <code>null</code> if a history interface request field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequestField fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		HistoryInterfaceRequestField historyInterfaceRequestField = (HistoryInterfaceRequestField)EntityCacheUtil.getResult(HistoryInterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
				HistoryInterfaceRequestFieldImpl.class, primaryKey);

		if (historyInterfaceRequestField == _nullHistoryInterfaceRequestField) {
			return null;
		}

		if (historyInterfaceRequestField == null) {
			Session session = null;

			try {
				session = openSession();

				historyInterfaceRequestField = (HistoryInterfaceRequestField)session.get(HistoryInterfaceRequestFieldImpl.class,
						primaryKey);

				if (historyInterfaceRequestField != null) {
					cacheResult(historyInterfaceRequestField);
				}
				else {
					EntityCacheUtil.putResult(HistoryInterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
						HistoryInterfaceRequestFieldImpl.class, primaryKey,
						_nullHistoryInterfaceRequestField);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(HistoryInterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
					HistoryInterfaceRequestFieldImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return historyInterfaceRequestField;
	}

	/**
	 * Returns the history interface request field with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the history interface request field
	 * @return the history interface request field, or <code>null</code> if a history interface request field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HistoryInterfaceRequestField fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the history interface request fields.
	 *
	 * @return the history interface request fields
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryInterfaceRequestField> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the history interface request fields.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of history interface request fields
	 * @param end the upper bound of the range of history interface request fields (not inclusive)
	 * @return the range of history interface request fields
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryInterfaceRequestField> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the history interface request fields.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of history interface request fields
	 * @param end the upper bound of the range of history interface request fields (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of history interface request fields
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HistoryInterfaceRequestField> findAll(int start, int end,
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

		List<HistoryInterfaceRequestField> list = (List<HistoryInterfaceRequestField>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_HISTORYINTERFACEREQUESTFIELD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_HISTORYINTERFACEREQUESTFIELD;

				if (pagination) {
					sql = sql.concat(HistoryInterfaceRequestFieldModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<HistoryInterfaceRequestField>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<HistoryInterfaceRequestField>(list);
				}
				else {
					list = (List<HistoryInterfaceRequestField>)QueryUtil.list(q,
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
	 * Removes all the history interface request fields from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (HistoryInterfaceRequestField historyInterfaceRequestField : findAll()) {
			remove(historyInterfaceRequestField);
		}
	}

	/**
	 * Returns the number of history interface request fields.
	 *
	 * @return the number of history interface request fields
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

				Query q = session.createQuery(_SQL_COUNT_HISTORYINTERFACEREQUESTFIELD);

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
	 * Initializes the history interface request field persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequestField")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<HistoryInterfaceRequestField>> listenersList = new ArrayList<ModelListener<HistoryInterfaceRequestField>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<HistoryInterfaceRequestField>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(HistoryInterfaceRequestFieldImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_HISTORYINTERFACEREQUESTFIELD = "SELECT historyInterfaceRequestField FROM HistoryInterfaceRequestField historyInterfaceRequestField";
	private static final String _SQL_SELECT_HISTORYINTERFACEREQUESTFIELD_WHERE = "SELECT historyInterfaceRequestField FROM HistoryInterfaceRequestField historyInterfaceRequestField WHERE ";
	private static final String _SQL_COUNT_HISTORYINTERFACEREQUESTFIELD = "SELECT COUNT(historyInterfaceRequestField) FROM HistoryInterfaceRequestField historyInterfaceRequestField";
	private static final String _SQL_COUNT_HISTORYINTERFACEREQUESTFIELD_WHERE = "SELECT COUNT(historyInterfaceRequestField) FROM HistoryInterfaceRequestField historyInterfaceRequestField WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "historyInterfaceRequestField.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No HistoryInterfaceRequestField exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No HistoryInterfaceRequestField exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(HistoryInterfaceRequestFieldPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "organizationCode", "locCode",
				"requestDate", "requestedDate", "requestDirection",
				"requestState", "requestResponseTime", "documentType",
				"businessType", "functionType", "senderName", "requestVersion",
				"senderIdentify", "receiverName", "sendingDate",
				"receiverIdentify", "remarks"
			});
	private static HistoryInterfaceRequestField _nullHistoryInterfaceRequestField =
		new HistoryInterfaceRequestFieldImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<HistoryInterfaceRequestField> toCacheModel() {
				return _nullHistoryInterfaceRequestFieldCacheModel;
			}
		};

	private static CacheModel<HistoryInterfaceRequestField> _nullHistoryInterfaceRequestFieldCacheModel =
		new CacheModel<HistoryInterfaceRequestField>() {
			@Override
			public HistoryInterfaceRequestField toEntityModel() {
				return _nullHistoryInterfaceRequestField;
			}
		};
}