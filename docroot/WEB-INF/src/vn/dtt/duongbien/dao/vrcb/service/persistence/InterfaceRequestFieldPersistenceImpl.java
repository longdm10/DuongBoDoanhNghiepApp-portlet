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

import vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException;
import vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField;
import vn.dtt.duongbien.dao.vrcb.model.impl.InterfaceRequestFieldImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.InterfaceRequestFieldModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the interface request field service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see InterfaceRequestFieldPersistence
 * @see InterfaceRequestFieldUtil
 * @generated
 */
public class InterfaceRequestFieldPersistenceImpl extends BasePersistenceImpl<InterfaceRequestField>
	implements InterfaceRequestFieldPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link InterfaceRequestFieldUtil} to access the interface request field persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = InterfaceRequestFieldImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(InterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestFieldModelImpl.FINDER_CACHE_ENABLED,
			InterfaceRequestFieldImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(InterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestFieldModelImpl.FINDER_CACHE_ENABLED,
			InterfaceRequestFieldImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(InterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestFieldModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_REQUESTCODE = new FinderPath(InterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestFieldModelImpl.FINDER_CACHE_ENABLED,
			InterfaceRequestFieldImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByRequestCode", new String[] { String.class.getName() },
			InterfaceRequestFieldModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(InterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestFieldModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });

	/**
	 * Returns the interface request field where requestCode = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException} if it could not be found.
	 *
	 * @param requestCode the request code
	 * @return the matching interface request field
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException if a matching interface request field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InterfaceRequestField findByRequestCode(String requestCode)
		throws NoSuchInterfaceRequestFieldException, SystemException {
		InterfaceRequestField interfaceRequestField = fetchByRequestCode(requestCode);

		if (interfaceRequestField == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("requestCode=");
			msg.append(requestCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchInterfaceRequestFieldException(msg.toString());
		}

		return interfaceRequestField;
	}

	/**
	 * Returns the interface request field where requestCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param requestCode the request code
	 * @return the matching interface request field, or <code>null</code> if a matching interface request field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InterfaceRequestField fetchByRequestCode(String requestCode)
		throws SystemException {
		return fetchByRequestCode(requestCode, true);
	}

	/**
	 * Returns the interface request field where requestCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param requestCode the request code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching interface request field, or <code>null</code> if a matching interface request field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InterfaceRequestField fetchByRequestCode(String requestCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { requestCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
					finderArgs, this);
		}

		if (result instanceof InterfaceRequestField) {
			InterfaceRequestField interfaceRequestField = (InterfaceRequestField)result;

			if (!Validator.equals(requestCode,
						interfaceRequestField.getRequestCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_INTERFACEREQUESTFIELD_WHERE);

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

				List<InterfaceRequestField> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"InterfaceRequestFieldPersistenceImpl.fetchByRequestCode(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					InterfaceRequestField interfaceRequestField = list.get(0);

					result = interfaceRequestField;

					cacheResult(interfaceRequestField);

					if ((interfaceRequestField.getRequestCode() == null) ||
							!interfaceRequestField.getRequestCode()
													  .equals(requestCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
							finderArgs, interfaceRequestField);
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
			return (InterfaceRequestField)result;
		}
	}

	/**
	 * Removes the interface request field where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @return the interface request field that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InterfaceRequestField removeByRequestCode(String requestCode)
		throws NoSuchInterfaceRequestFieldException, SystemException {
		InterfaceRequestField interfaceRequestField = findByRequestCode(requestCode);

		return remove(interfaceRequestField);
	}

	/**
	 * Returns the number of interface request fields where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching interface request fields
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

			query.append(_SQL_COUNT_INTERFACEREQUESTFIELD_WHERE);

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

	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "interfaceRequestField.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "interfaceRequestField.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(interfaceRequestField.requestCode IS NULL OR interfaceRequestField.requestCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONCODE =
		new FinderPath(InterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestFieldModelImpl.FINDER_CACHE_ENABLED,
			InterfaceRequestFieldImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOrganizationCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONCODE =
		new FinderPath(InterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestFieldModelImpl.FINDER_CACHE_ENABLED,
			InterfaceRequestFieldImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByOrganizationCode", new String[] { String.class.getName() },
			InterfaceRequestFieldModelImpl.ORGANIZATIONCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORGANIZATIONCODE = new FinderPath(InterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestFieldModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByOrganizationCode", new String[] { String.class.getName() });

	/**
	 * Returns all the interface request fields where organizationCode = &#63;.
	 *
	 * @param organizationCode the organization code
	 * @return the matching interface request fields
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InterfaceRequestField> findByOrganizationCode(
		String organizationCode) throws SystemException {
		return findByOrganizationCode(organizationCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the interface request fields where organizationCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.InterfaceRequestFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationCode the organization code
	 * @param start the lower bound of the range of interface request fields
	 * @param end the upper bound of the range of interface request fields (not inclusive)
	 * @return the range of matching interface request fields
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InterfaceRequestField> findByOrganizationCode(
		String organizationCode, int start, int end) throws SystemException {
		return findByOrganizationCode(organizationCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the interface request fields where organizationCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.InterfaceRequestFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationCode the organization code
	 * @param start the lower bound of the range of interface request fields
	 * @param end the upper bound of the range of interface request fields (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching interface request fields
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InterfaceRequestField> findByOrganizationCode(
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

		List<InterfaceRequestField> list = (List<InterfaceRequestField>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (InterfaceRequestField interfaceRequestField : list) {
				if (!Validator.equals(organizationCode,
							interfaceRequestField.getOrganizationCode())) {
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

			query.append(_SQL_SELECT_INTERFACEREQUESTFIELD_WHERE);

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
				query.append(InterfaceRequestFieldModelImpl.ORDER_BY_JPQL);
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
					list = (List<InterfaceRequestField>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<InterfaceRequestField>(list);
				}
				else {
					list = (List<InterfaceRequestField>)QueryUtil.list(q,
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
	 * Returns the first interface request field in the ordered set where organizationCode = &#63;.
	 *
	 * @param organizationCode the organization code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching interface request field
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException if a matching interface request field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InterfaceRequestField findByOrganizationCode_First(
		String organizationCode, OrderByComparator orderByComparator)
		throws NoSuchInterfaceRequestFieldException, SystemException {
		InterfaceRequestField interfaceRequestField = fetchByOrganizationCode_First(organizationCode,
				orderByComparator);

		if (interfaceRequestField != null) {
			return interfaceRequestField;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationCode=");
		msg.append(organizationCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInterfaceRequestFieldException(msg.toString());
	}

	/**
	 * Returns the first interface request field in the ordered set where organizationCode = &#63;.
	 *
	 * @param organizationCode the organization code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching interface request field, or <code>null</code> if a matching interface request field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InterfaceRequestField fetchByOrganizationCode_First(
		String organizationCode, OrderByComparator orderByComparator)
		throws SystemException {
		List<InterfaceRequestField> list = findByOrganizationCode(organizationCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last interface request field in the ordered set where organizationCode = &#63;.
	 *
	 * @param organizationCode the organization code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching interface request field
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException if a matching interface request field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InterfaceRequestField findByOrganizationCode_Last(
		String organizationCode, OrderByComparator orderByComparator)
		throws NoSuchInterfaceRequestFieldException, SystemException {
		InterfaceRequestField interfaceRequestField = fetchByOrganizationCode_Last(organizationCode,
				orderByComparator);

		if (interfaceRequestField != null) {
			return interfaceRequestField;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationCode=");
		msg.append(organizationCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInterfaceRequestFieldException(msg.toString());
	}

	/**
	 * Returns the last interface request field in the ordered set where organizationCode = &#63;.
	 *
	 * @param organizationCode the organization code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching interface request field, or <code>null</code> if a matching interface request field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InterfaceRequestField fetchByOrganizationCode_Last(
		String organizationCode, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByOrganizationCode(organizationCode);

		if (count == 0) {
			return null;
		}

		List<InterfaceRequestField> list = findByOrganizationCode(organizationCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the interface request fields before and after the current interface request field in the ordered set where organizationCode = &#63;.
	 *
	 * @param id the primary key of the current interface request field
	 * @param organizationCode the organization code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next interface request field
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException if a interface request field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InterfaceRequestField[] findByOrganizationCode_PrevAndNext(long id,
		String organizationCode, OrderByComparator orderByComparator)
		throws NoSuchInterfaceRequestFieldException, SystemException {
		InterfaceRequestField interfaceRequestField = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			InterfaceRequestField[] array = new InterfaceRequestFieldImpl[3];

			array[0] = getByOrganizationCode_PrevAndNext(session,
					interfaceRequestField, organizationCode, orderByComparator,
					true);

			array[1] = interfaceRequestField;

			array[2] = getByOrganizationCode_PrevAndNext(session,
					interfaceRequestField, organizationCode, orderByComparator,
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

	protected InterfaceRequestField getByOrganizationCode_PrevAndNext(
		Session session, InterfaceRequestField interfaceRequestField,
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

		query.append(_SQL_SELECT_INTERFACEREQUESTFIELD_WHERE);

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
			query.append(InterfaceRequestFieldModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(interfaceRequestField);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<InterfaceRequestField> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the interface request fields where organizationCode = &#63; from the database.
	 *
	 * @param organizationCode the organization code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByOrganizationCode(String organizationCode)
		throws SystemException {
		for (InterfaceRequestField interfaceRequestField : findByOrganizationCode(
				organizationCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(interfaceRequestField);
		}
	}

	/**
	 * Returns the number of interface request fields where organizationCode = &#63;.
	 *
	 * @param organizationCode the organization code
	 * @return the number of matching interface request fields
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

			query.append(_SQL_COUNT_INTERFACEREQUESTFIELD_WHERE);

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
		"interfaceRequestField.organizationCode IS NULL";
	private static final String _FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_2 =
		"interfaceRequestField.organizationCode = ?";
	private static final String _FINDER_COLUMN_ORGANIZATIONCODE_ORGANIZATIONCODE_3 =
		"(interfaceRequestField.organizationCode IS NULL OR interfaceRequestField.organizationCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCCODE = new FinderPath(InterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestFieldModelImpl.FINDER_CACHE_ENABLED,
			InterfaceRequestFieldImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLocCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCCODE =
		new FinderPath(InterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestFieldModelImpl.FINDER_CACHE_ENABLED,
			InterfaceRequestFieldImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLocCode",
			new String[] { String.class.getName() },
			InterfaceRequestFieldModelImpl.LOCCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOCCODE = new FinderPath(InterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestFieldModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLocCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the interface request fields where locCode = &#63;.
	 *
	 * @param locCode the loc code
	 * @return the matching interface request fields
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InterfaceRequestField> findByLocCode(String locCode)
		throws SystemException {
		return findByLocCode(locCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the interface request fields where locCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.InterfaceRequestFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param locCode the loc code
	 * @param start the lower bound of the range of interface request fields
	 * @param end the upper bound of the range of interface request fields (not inclusive)
	 * @return the range of matching interface request fields
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InterfaceRequestField> findByLocCode(String locCode, int start,
		int end) throws SystemException {
		return findByLocCode(locCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the interface request fields where locCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.InterfaceRequestFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param locCode the loc code
	 * @param start the lower bound of the range of interface request fields
	 * @param end the upper bound of the range of interface request fields (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching interface request fields
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InterfaceRequestField> findByLocCode(String locCode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
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

		List<InterfaceRequestField> list = (List<InterfaceRequestField>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (InterfaceRequestField interfaceRequestField : list) {
				if (!Validator.equals(locCode,
							interfaceRequestField.getLocCode())) {
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

			query.append(_SQL_SELECT_INTERFACEREQUESTFIELD_WHERE);

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
				query.append(InterfaceRequestFieldModelImpl.ORDER_BY_JPQL);
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
					list = (List<InterfaceRequestField>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<InterfaceRequestField>(list);
				}
				else {
					list = (List<InterfaceRequestField>)QueryUtil.list(q,
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
	 * Returns the first interface request field in the ordered set where locCode = &#63;.
	 *
	 * @param locCode the loc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching interface request field
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException if a matching interface request field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InterfaceRequestField findByLocCode_First(String locCode,
		OrderByComparator orderByComparator)
		throws NoSuchInterfaceRequestFieldException, SystemException {
		InterfaceRequestField interfaceRequestField = fetchByLocCode_First(locCode,
				orderByComparator);

		if (interfaceRequestField != null) {
			return interfaceRequestField;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("locCode=");
		msg.append(locCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInterfaceRequestFieldException(msg.toString());
	}

	/**
	 * Returns the first interface request field in the ordered set where locCode = &#63;.
	 *
	 * @param locCode the loc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching interface request field, or <code>null</code> if a matching interface request field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InterfaceRequestField fetchByLocCode_First(String locCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<InterfaceRequestField> list = findByLocCode(locCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last interface request field in the ordered set where locCode = &#63;.
	 *
	 * @param locCode the loc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching interface request field
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException if a matching interface request field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InterfaceRequestField findByLocCode_Last(String locCode,
		OrderByComparator orderByComparator)
		throws NoSuchInterfaceRequestFieldException, SystemException {
		InterfaceRequestField interfaceRequestField = fetchByLocCode_Last(locCode,
				orderByComparator);

		if (interfaceRequestField != null) {
			return interfaceRequestField;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("locCode=");
		msg.append(locCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInterfaceRequestFieldException(msg.toString());
	}

	/**
	 * Returns the last interface request field in the ordered set where locCode = &#63;.
	 *
	 * @param locCode the loc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching interface request field, or <code>null</code> if a matching interface request field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InterfaceRequestField fetchByLocCode_Last(String locCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByLocCode(locCode);

		if (count == 0) {
			return null;
		}

		List<InterfaceRequestField> list = findByLocCode(locCode, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the interface request fields before and after the current interface request field in the ordered set where locCode = &#63;.
	 *
	 * @param id the primary key of the current interface request field
	 * @param locCode the loc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next interface request field
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException if a interface request field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InterfaceRequestField[] findByLocCode_PrevAndNext(long id,
		String locCode, OrderByComparator orderByComparator)
		throws NoSuchInterfaceRequestFieldException, SystemException {
		InterfaceRequestField interfaceRequestField = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			InterfaceRequestField[] array = new InterfaceRequestFieldImpl[3];

			array[0] = getByLocCode_PrevAndNext(session, interfaceRequestField,
					locCode, orderByComparator, true);

			array[1] = interfaceRequestField;

			array[2] = getByLocCode_PrevAndNext(session, interfaceRequestField,
					locCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected InterfaceRequestField getByLocCode_PrevAndNext(Session session,
		InterfaceRequestField interfaceRequestField, String locCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_INTERFACEREQUESTFIELD_WHERE);

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
			query.append(InterfaceRequestFieldModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(interfaceRequestField);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<InterfaceRequestField> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the interface request fields where locCode = &#63; from the database.
	 *
	 * @param locCode the loc code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByLocCode(String locCode) throws SystemException {
		for (InterfaceRequestField interfaceRequestField : findByLocCode(
				locCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(interfaceRequestField);
		}
	}

	/**
	 * Returns the number of interface request fields where locCode = &#63;.
	 *
	 * @param locCode the loc code
	 * @return the number of matching interface request fields
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

			query.append(_SQL_COUNT_INTERFACEREQUESTFIELD_WHERE);

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

	private static final String _FINDER_COLUMN_LOCCODE_LOCCODE_1 = "interfaceRequestField.locCode IS NULL";
	private static final String _FINDER_COLUMN_LOCCODE_LOCCODE_2 = "interfaceRequestField.locCode = ?";
	private static final String _FINDER_COLUMN_LOCCODE_LOCCODE_3 = "(interfaceRequestField.locCode IS NULL OR interfaceRequestField.locCode = '')";

	public InterfaceRequestFieldPersistenceImpl() {
		setModelClass(InterfaceRequestField.class);
	}

	/**
	 * Caches the interface request field in the entity cache if it is enabled.
	 *
	 * @param interfaceRequestField the interface request field
	 */
	@Override
	public void cacheResult(InterfaceRequestField interfaceRequestField) {
		EntityCacheUtil.putResult(InterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestFieldImpl.class,
			interfaceRequestField.getPrimaryKey(), interfaceRequestField);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
			new Object[] { interfaceRequestField.getRequestCode() },
			interfaceRequestField);

		interfaceRequestField.resetOriginalValues();
	}

	/**
	 * Caches the interface request fields in the entity cache if it is enabled.
	 *
	 * @param interfaceRequestFields the interface request fields
	 */
	@Override
	public void cacheResult(List<InterfaceRequestField> interfaceRequestFields) {
		for (InterfaceRequestField interfaceRequestField : interfaceRequestFields) {
			if (EntityCacheUtil.getResult(
						InterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
						InterfaceRequestFieldImpl.class,
						interfaceRequestField.getPrimaryKey()) == null) {
				cacheResult(interfaceRequestField);
			}
			else {
				interfaceRequestField.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all interface request fields.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(InterfaceRequestFieldImpl.class.getName());
		}

		EntityCacheUtil.clearCache(InterfaceRequestFieldImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the interface request field.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(InterfaceRequestField interfaceRequestField) {
		EntityCacheUtil.removeResult(InterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestFieldImpl.class,
			interfaceRequestField.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(interfaceRequestField);
	}

	@Override
	public void clearCache(List<InterfaceRequestField> interfaceRequestFields) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (InterfaceRequestField interfaceRequestField : interfaceRequestFields) {
			EntityCacheUtil.removeResult(InterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
				InterfaceRequestFieldImpl.class,
				interfaceRequestField.getPrimaryKey());

			clearUniqueFindersCache(interfaceRequestField);
		}
	}

	protected void cacheUniqueFindersCache(
		InterfaceRequestField interfaceRequestField) {
		if (interfaceRequestField.isNew()) {
			Object[] args = new Object[] { interfaceRequestField.getRequestCode() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REQUESTCODE, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE, args,
				interfaceRequestField);
		}
		else {
			InterfaceRequestFieldModelImpl interfaceRequestFieldModelImpl = (InterfaceRequestFieldModelImpl)interfaceRequestField;

			if ((interfaceRequestFieldModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						interfaceRequestField.getRequestCode()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REQUESTCODE,
					args, interfaceRequestField);
			}
		}
	}

	protected void clearUniqueFindersCache(
		InterfaceRequestField interfaceRequestField) {
		InterfaceRequestFieldModelImpl interfaceRequestFieldModelImpl = (InterfaceRequestFieldModelImpl)interfaceRequestField;

		Object[] args = new Object[] { interfaceRequestField.getRequestCode() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTCODE, args);

		if ((interfaceRequestFieldModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_REQUESTCODE.getColumnBitmask()) != 0) {
			args = new Object[] {
					interfaceRequestFieldModelImpl.getOriginalRequestCode()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REQUESTCODE, args);
		}
	}

	/**
	 * Creates a new interface request field with the primary key. Does not add the interface request field to the database.
	 *
	 * @param id the primary key for the new interface request field
	 * @return the new interface request field
	 */
	@Override
	public InterfaceRequestField create(long id) {
		InterfaceRequestField interfaceRequestField = new InterfaceRequestFieldImpl();

		interfaceRequestField.setNew(true);
		interfaceRequestField.setPrimaryKey(id);

		return interfaceRequestField;
	}

	/**
	 * Removes the interface request field with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the interface request field
	 * @return the interface request field that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException if a interface request field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InterfaceRequestField remove(long id)
		throws NoSuchInterfaceRequestFieldException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the interface request field with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the interface request field
	 * @return the interface request field that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException if a interface request field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InterfaceRequestField remove(Serializable primaryKey)
		throws NoSuchInterfaceRequestFieldException, SystemException {
		Session session = null;

		try {
			session = openSession();

			InterfaceRequestField interfaceRequestField = (InterfaceRequestField)session.get(InterfaceRequestFieldImpl.class,
					primaryKey);

			if (interfaceRequestField == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchInterfaceRequestFieldException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(interfaceRequestField);
		}
		catch (NoSuchInterfaceRequestFieldException nsee) {
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
	protected InterfaceRequestField removeImpl(
		InterfaceRequestField interfaceRequestField) throws SystemException {
		interfaceRequestField = toUnwrappedModel(interfaceRequestField);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(interfaceRequestField)) {
				interfaceRequestField = (InterfaceRequestField)session.get(InterfaceRequestFieldImpl.class,
						interfaceRequestField.getPrimaryKeyObj());
			}

			if (interfaceRequestField != null) {
				session.delete(interfaceRequestField);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (interfaceRequestField != null) {
			clearCache(interfaceRequestField);
		}

		return interfaceRequestField;
	}

	@Override
	public InterfaceRequestField updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField interfaceRequestField)
		throws SystemException {
		interfaceRequestField = toUnwrappedModel(interfaceRequestField);

		boolean isNew = interfaceRequestField.isNew();

		InterfaceRequestFieldModelImpl interfaceRequestFieldModelImpl = (InterfaceRequestFieldModelImpl)interfaceRequestField;

		Session session = null;

		try {
			session = openSession();

			if (interfaceRequestField.isNew()) {
				session.save(interfaceRequestField);

				interfaceRequestField.setNew(false);
			}
			else {
				session.merge(interfaceRequestField);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !InterfaceRequestFieldModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((interfaceRequestFieldModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						interfaceRequestFieldModelImpl.getOriginalOrganizationCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONCODE,
					args);

				args = new Object[] {
						interfaceRequestFieldModelImpl.getOrganizationCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONCODE,
					args);
			}

			if ((interfaceRequestFieldModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						interfaceRequestFieldModelImpl.getOriginalLocCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCCODE,
					args);

				args = new Object[] { interfaceRequestFieldModelImpl.getLocCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(InterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
			InterfaceRequestFieldImpl.class,
			interfaceRequestField.getPrimaryKey(), interfaceRequestField);

		clearUniqueFindersCache(interfaceRequestField);
		cacheUniqueFindersCache(interfaceRequestField);

		return interfaceRequestField;
	}

	protected InterfaceRequestField toUnwrappedModel(
		InterfaceRequestField interfaceRequestField) {
		if (interfaceRequestField instanceof InterfaceRequestFieldImpl) {
			return interfaceRequestField;
		}

		InterfaceRequestFieldImpl interfaceRequestFieldImpl = new InterfaceRequestFieldImpl();

		interfaceRequestFieldImpl.setNew(interfaceRequestField.isNew());
		interfaceRequestFieldImpl.setPrimaryKey(interfaceRequestField.getPrimaryKey());

		interfaceRequestFieldImpl.setId(interfaceRequestField.getId());
		interfaceRequestFieldImpl.setRequestCode(interfaceRequestField.getRequestCode());
		interfaceRequestFieldImpl.setOrganizationCode(interfaceRequestField.getOrganizationCode());
		interfaceRequestFieldImpl.setLocCode(interfaceRequestField.getLocCode());
		interfaceRequestFieldImpl.setRequestDate(interfaceRequestField.getRequestDate());
		interfaceRequestFieldImpl.setRequestedDate(interfaceRequestField.getRequestedDate());
		interfaceRequestFieldImpl.setRequestDirection(interfaceRequestField.getRequestDirection());
		interfaceRequestFieldImpl.setRequestState(interfaceRequestField.getRequestState());
		interfaceRequestFieldImpl.setRequestResponseTime(interfaceRequestField.getRequestResponseTime());
		interfaceRequestFieldImpl.setDocumentType(interfaceRequestField.getDocumentType());
		interfaceRequestFieldImpl.setBusinessType(interfaceRequestField.getBusinessType());
		interfaceRequestFieldImpl.setFunctionType(interfaceRequestField.getFunctionType());
		interfaceRequestFieldImpl.setSenderName(interfaceRequestField.getSenderName());
		interfaceRequestFieldImpl.setRequestVersion(interfaceRequestField.getRequestVersion());
		interfaceRequestFieldImpl.setSenderIdentify(interfaceRequestField.getSenderIdentify());
		interfaceRequestFieldImpl.setReceiverName(interfaceRequestField.getReceiverName());
		interfaceRequestFieldImpl.setSendingDate(interfaceRequestField.getSendingDate());
		interfaceRequestFieldImpl.setReceiverIdentify(interfaceRequestField.getReceiverIdentify());
		interfaceRequestFieldImpl.setRemarks(interfaceRequestField.getRemarks());

		return interfaceRequestFieldImpl;
	}

	/**
	 * Returns the interface request field with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the interface request field
	 * @return the interface request field
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException if a interface request field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InterfaceRequestField findByPrimaryKey(Serializable primaryKey)
		throws NoSuchInterfaceRequestFieldException, SystemException {
		InterfaceRequestField interfaceRequestField = fetchByPrimaryKey(primaryKey);

		if (interfaceRequestField == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchInterfaceRequestFieldException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return interfaceRequestField;
	}

	/**
	 * Returns the interface request field with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException} if it could not be found.
	 *
	 * @param id the primary key of the interface request field
	 * @return the interface request field
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchInterfaceRequestFieldException if a interface request field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InterfaceRequestField findByPrimaryKey(long id)
		throws NoSuchInterfaceRequestFieldException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the interface request field with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the interface request field
	 * @return the interface request field, or <code>null</code> if a interface request field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InterfaceRequestField fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		InterfaceRequestField interfaceRequestField = (InterfaceRequestField)EntityCacheUtil.getResult(InterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
				InterfaceRequestFieldImpl.class, primaryKey);

		if (interfaceRequestField == _nullInterfaceRequestField) {
			return null;
		}

		if (interfaceRequestField == null) {
			Session session = null;

			try {
				session = openSession();

				interfaceRequestField = (InterfaceRequestField)session.get(InterfaceRequestFieldImpl.class,
						primaryKey);

				if (interfaceRequestField != null) {
					cacheResult(interfaceRequestField);
				}
				else {
					EntityCacheUtil.putResult(InterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
						InterfaceRequestFieldImpl.class, primaryKey,
						_nullInterfaceRequestField);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(InterfaceRequestFieldModelImpl.ENTITY_CACHE_ENABLED,
					InterfaceRequestFieldImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return interfaceRequestField;
	}

	/**
	 * Returns the interface request field with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the interface request field
	 * @return the interface request field, or <code>null</code> if a interface request field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InterfaceRequestField fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the interface request fields.
	 *
	 * @return the interface request fields
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InterfaceRequestField> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the interface request fields.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.InterfaceRequestFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of interface request fields
	 * @param end the upper bound of the range of interface request fields (not inclusive)
	 * @return the range of interface request fields
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InterfaceRequestField> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the interface request fields.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.InterfaceRequestFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of interface request fields
	 * @param end the upper bound of the range of interface request fields (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of interface request fields
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InterfaceRequestField> findAll(int start, int end,
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

		List<InterfaceRequestField> list = (List<InterfaceRequestField>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_INTERFACEREQUESTFIELD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_INTERFACEREQUESTFIELD;

				if (pagination) {
					sql = sql.concat(InterfaceRequestFieldModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<InterfaceRequestField>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<InterfaceRequestField>(list);
				}
				else {
					list = (List<InterfaceRequestField>)QueryUtil.list(q,
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
	 * Removes all the interface request fields from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (InterfaceRequestField interfaceRequestField : findAll()) {
			remove(interfaceRequestField);
		}
	}

	/**
	 * Returns the number of interface request fields.
	 *
	 * @return the number of interface request fields
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

				Query q = session.createQuery(_SQL_COUNT_INTERFACEREQUESTFIELD);

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
	 * Initializes the interface request field persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<InterfaceRequestField>> listenersList = new ArrayList<ModelListener<InterfaceRequestField>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<InterfaceRequestField>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(InterfaceRequestFieldImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_INTERFACEREQUESTFIELD = "SELECT interfaceRequestField FROM InterfaceRequestField interfaceRequestField";
	private static final String _SQL_SELECT_INTERFACEREQUESTFIELD_WHERE = "SELECT interfaceRequestField FROM InterfaceRequestField interfaceRequestField WHERE ";
	private static final String _SQL_COUNT_INTERFACEREQUESTFIELD = "SELECT COUNT(interfaceRequestField) FROM InterfaceRequestField interfaceRequestField";
	private static final String _SQL_COUNT_INTERFACEREQUESTFIELD_WHERE = "SELECT COUNT(interfaceRequestField) FROM InterfaceRequestField interfaceRequestField WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "interfaceRequestField.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No InterfaceRequestField exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No InterfaceRequestField exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(InterfaceRequestFieldPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "organizationCode", "locCode",
				"requestDate", "requestedDate", "requestDirection",
				"requestState", "requestResponseTime", "documentType",
				"businessType", "functionType", "senderName", "requestVersion",
				"senderIdentify", "receiverName", "sendingDate",
				"receiverIdentify", "remarks"
			});
	private static InterfaceRequestField _nullInterfaceRequestField = new InterfaceRequestFieldImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<InterfaceRequestField> toCacheModel() {
				return _nullInterfaceRequestFieldCacheModel;
			}
		};

	private static CacheModel<InterfaceRequestField> _nullInterfaceRequestFieldCacheModel =
		new CacheModel<InterfaceRequestField>() {
			@Override
			public InterfaceRequestField toEntityModel() {
				return _nullInterfaceRequestField;
			}
		};
}