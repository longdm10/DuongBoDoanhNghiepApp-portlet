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

import vn.dtt.duongbien.dao.vrcb.NoSuchTempAttachmentDeclarationHealthException;
import vn.dtt.duongbien.dao.vrcb.model.TempAttachmentDeclarationHealth;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempAttachmentDeclarationHealthImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempAttachmentDeclarationHealthModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the temp attachment declaration health service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempAttachmentDeclarationHealthPersistence
 * @see TempAttachmentDeclarationHealthUtil
 * @generated
 */
public class TempAttachmentDeclarationHealthPersistenceImpl
	extends BasePersistenceImpl<TempAttachmentDeclarationHealth>
	implements TempAttachmentDeclarationHealthPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempAttachmentDeclarationHealthUtil} to access the temp attachment declaration health persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempAttachmentDeclarationHealthImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempAttachmentDeclarationHealthModelImpl.ENTITY_CACHE_ENABLED,
			TempAttachmentDeclarationHealthModelImpl.FINDER_CACHE_ENABLED,
			TempAttachmentDeclarationHealthImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempAttachmentDeclarationHealthModelImpl.ENTITY_CACHE_ENABLED,
			TempAttachmentDeclarationHealthModelImpl.FINDER_CACHE_ENABLED,
			TempAttachmentDeclarationHealthImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempAttachmentDeclarationHealthModelImpl.ENTITY_CACHE_ENABLED,
			TempAttachmentDeclarationHealthModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempAttachmentDeclarationHealthModelImpl.ENTITY_CACHE_ENABLED,
			TempAttachmentDeclarationHealthModelImpl.FINDER_CACHE_ENABLED,
			TempAttachmentDeclarationHealthImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempAttachmentDeclarationHealthModelImpl.ENTITY_CACHE_ENABLED,
			TempAttachmentDeclarationHealthModelImpl.FINDER_CACHE_ENABLED,
			TempAttachmentDeclarationHealthImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempAttachmentDeclarationHealthModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempAttachmentDeclarationHealthModelImpl.ENTITY_CACHE_ENABLED,
			TempAttachmentDeclarationHealthModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRequestCode", new String[] { String.class.getName() });

	/**
	 * Returns all the temp attachment declaration healths where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp attachment declaration healths
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempAttachmentDeclarationHealth> findByRequestCode(
		String requestCode) throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp attachment declaration healths where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempAttachmentDeclarationHealthModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp attachment declaration healths
	 * @param end the upper bound of the range of temp attachment declaration healths (not inclusive)
	 * @return the range of matching temp attachment declaration healths
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempAttachmentDeclarationHealth> findByRequestCode(
		String requestCode, int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp attachment declaration healths where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempAttachmentDeclarationHealthModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp attachment declaration healths
	 * @param end the upper bound of the range of temp attachment declaration healths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp attachment declaration healths
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempAttachmentDeclarationHealth> findByRequestCode(
		String requestCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE;
			finderArgs = new Object[] { requestCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE;
			finderArgs = new Object[] { requestCode, start, end, orderByComparator };
		}

		List<TempAttachmentDeclarationHealth> list = (List<TempAttachmentDeclarationHealth>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth : list) {
				if (!Validator.equals(requestCode,
							tempAttachmentDeclarationHealth.getRequestCode())) {
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

			query.append(_SQL_SELECT_TEMPATTACHMENTDECLARATIONHEALTH_WHERE);

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

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempAttachmentDeclarationHealthModelImpl.ORDER_BY_JPQL);
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

				if (!pagination) {
					list = (List<TempAttachmentDeclarationHealth>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempAttachmentDeclarationHealth>(list);
				}
				else {
					list = (List<TempAttachmentDeclarationHealth>)QueryUtil.list(q,
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
	 * Returns the first temp attachment declaration health in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp attachment declaration health
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempAttachmentDeclarationHealthException if a matching temp attachment declaration health could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAttachmentDeclarationHealth findByRequestCode_First(
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempAttachmentDeclarationHealthException, SystemException {
		TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth = fetchByRequestCode_First(requestCode,
				orderByComparator);

		if (tempAttachmentDeclarationHealth != null) {
			return tempAttachmentDeclarationHealth;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempAttachmentDeclarationHealthException(msg.toString());
	}

	/**
	 * Returns the first temp attachment declaration health in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp attachment declaration health, or <code>null</code> if a matching temp attachment declaration health could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAttachmentDeclarationHealth fetchByRequestCode_First(
		String requestCode, OrderByComparator orderByComparator)
		throws SystemException {
		List<TempAttachmentDeclarationHealth> list = findByRequestCode(requestCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp attachment declaration health in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp attachment declaration health
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempAttachmentDeclarationHealthException if a matching temp attachment declaration health could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAttachmentDeclarationHealth findByRequestCode_Last(
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempAttachmentDeclarationHealthException, SystemException {
		TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth = fetchByRequestCode_Last(requestCode,
				orderByComparator);

		if (tempAttachmentDeclarationHealth != null) {
			return tempAttachmentDeclarationHealth;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempAttachmentDeclarationHealthException(msg.toString());
	}

	/**
	 * Returns the last temp attachment declaration health in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp attachment declaration health, or <code>null</code> if a matching temp attachment declaration health could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAttachmentDeclarationHealth fetchByRequestCode_Last(
		String requestCode, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByRequestCode(requestCode);

		if (count == 0) {
			return null;
		}

		List<TempAttachmentDeclarationHealth> list = findByRequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp attachment declaration healths before and after the current temp attachment declaration health in the ordered set where requestCode = &#63;.
	 *
	 * @param id the primary key of the current temp attachment declaration health
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp attachment declaration health
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempAttachmentDeclarationHealthException if a temp attachment declaration health with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAttachmentDeclarationHealth[] findByRequestCode_PrevAndNext(
		long id, String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempAttachmentDeclarationHealthException, SystemException {
		TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempAttachmentDeclarationHealth[] array = new TempAttachmentDeclarationHealthImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session,
					tempAttachmentDeclarationHealth, requestCode,
					orderByComparator, true);

			array[1] = tempAttachmentDeclarationHealth;

			array[2] = getByRequestCode_PrevAndNext(session,
					tempAttachmentDeclarationHealth, requestCode,
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

	protected TempAttachmentDeclarationHealth getByRequestCode_PrevAndNext(
		Session session,
		TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth,
		String requestCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPATTACHMENTDECLARATIONHEALTH_WHERE);

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
			query.append(TempAttachmentDeclarationHealthModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindRequestCode) {
			qPos.add(requestCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempAttachmentDeclarationHealth);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempAttachmentDeclarationHealth> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp attachment declaration healths where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth : findByRequestCode(
				requestCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tempAttachmentDeclarationHealth);
		}
	}

	/**
	 * Returns the number of temp attachment declaration healths where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp attachment declaration healths
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

			query.append(_SQL_COUNT_TEMPATTACHMENTDECLARATIONHEALTH_WHERE);

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

	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempAttachmentDeclarationHealth.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempAttachmentDeclarationHealth.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempAttachmentDeclarationHealth.requestCode IS NULL OR tempAttachmentDeclarationHealth.requestCode = '')";

	public TempAttachmentDeclarationHealthPersistenceImpl() {
		setModelClass(TempAttachmentDeclarationHealth.class);
	}

	/**
	 * Caches the temp attachment declaration health in the entity cache if it is enabled.
	 *
	 * @param tempAttachmentDeclarationHealth the temp attachment declaration health
	 */
	@Override
	public void cacheResult(
		TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth) {
		EntityCacheUtil.putResult(TempAttachmentDeclarationHealthModelImpl.ENTITY_CACHE_ENABLED,
			TempAttachmentDeclarationHealthImpl.class,
			tempAttachmentDeclarationHealth.getPrimaryKey(),
			tempAttachmentDeclarationHealth);

		tempAttachmentDeclarationHealth.resetOriginalValues();
	}

	/**
	 * Caches the temp attachment declaration healths in the entity cache if it is enabled.
	 *
	 * @param tempAttachmentDeclarationHealths the temp attachment declaration healths
	 */
	@Override
	public void cacheResult(
		List<TempAttachmentDeclarationHealth> tempAttachmentDeclarationHealths) {
		for (TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth : tempAttachmentDeclarationHealths) {
			if (EntityCacheUtil.getResult(
						TempAttachmentDeclarationHealthModelImpl.ENTITY_CACHE_ENABLED,
						TempAttachmentDeclarationHealthImpl.class,
						tempAttachmentDeclarationHealth.getPrimaryKey()) == null) {
				cacheResult(tempAttachmentDeclarationHealth);
			}
			else {
				tempAttachmentDeclarationHealth.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp attachment declaration healths.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempAttachmentDeclarationHealthImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempAttachmentDeclarationHealthImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp attachment declaration health.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth) {
		EntityCacheUtil.removeResult(TempAttachmentDeclarationHealthModelImpl.ENTITY_CACHE_ENABLED,
			TempAttachmentDeclarationHealthImpl.class,
			tempAttachmentDeclarationHealth.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<TempAttachmentDeclarationHealth> tempAttachmentDeclarationHealths) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth : tempAttachmentDeclarationHealths) {
			EntityCacheUtil.removeResult(TempAttachmentDeclarationHealthModelImpl.ENTITY_CACHE_ENABLED,
				TempAttachmentDeclarationHealthImpl.class,
				tempAttachmentDeclarationHealth.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp attachment declaration health with the primary key. Does not add the temp attachment declaration health to the database.
	 *
	 * @param id the primary key for the new temp attachment declaration health
	 * @return the new temp attachment declaration health
	 */
	@Override
	public TempAttachmentDeclarationHealth create(long id) {
		TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth = new TempAttachmentDeclarationHealthImpl();

		tempAttachmentDeclarationHealth.setNew(true);
		tempAttachmentDeclarationHealth.setPrimaryKey(id);

		return tempAttachmentDeclarationHealth;
	}

	/**
	 * Removes the temp attachment declaration health with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp attachment declaration health
	 * @return the temp attachment declaration health that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempAttachmentDeclarationHealthException if a temp attachment declaration health with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAttachmentDeclarationHealth remove(long id)
		throws NoSuchTempAttachmentDeclarationHealthException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the temp attachment declaration health with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp attachment declaration health
	 * @return the temp attachment declaration health that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempAttachmentDeclarationHealthException if a temp attachment declaration health with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAttachmentDeclarationHealth remove(Serializable primaryKey)
		throws NoSuchTempAttachmentDeclarationHealthException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth = (TempAttachmentDeclarationHealth)session.get(TempAttachmentDeclarationHealthImpl.class,
					primaryKey);

			if (tempAttachmentDeclarationHealth == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempAttachmentDeclarationHealthException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempAttachmentDeclarationHealth);
		}
		catch (NoSuchTempAttachmentDeclarationHealthException nsee) {
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
	protected TempAttachmentDeclarationHealth removeImpl(
		TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth)
		throws SystemException {
		tempAttachmentDeclarationHealth = toUnwrappedModel(tempAttachmentDeclarationHealth);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tempAttachmentDeclarationHealth)) {
				tempAttachmentDeclarationHealth = (TempAttachmentDeclarationHealth)session.get(TempAttachmentDeclarationHealthImpl.class,
						tempAttachmentDeclarationHealth.getPrimaryKeyObj());
			}

			if (tempAttachmentDeclarationHealth != null) {
				session.delete(tempAttachmentDeclarationHealth);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tempAttachmentDeclarationHealth != null) {
			clearCache(tempAttachmentDeclarationHealth);
		}

		return tempAttachmentDeclarationHealth;
	}

	@Override
	public TempAttachmentDeclarationHealth updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth)
		throws SystemException {
		tempAttachmentDeclarationHealth = toUnwrappedModel(tempAttachmentDeclarationHealth);

		boolean isNew = tempAttachmentDeclarationHealth.isNew();

		TempAttachmentDeclarationHealthModelImpl tempAttachmentDeclarationHealthModelImpl =
			(TempAttachmentDeclarationHealthModelImpl)tempAttachmentDeclarationHealth;

		Session session = null;

		try {
			session = openSession();

			if (tempAttachmentDeclarationHealth.isNew()) {
				session.save(tempAttachmentDeclarationHealth);

				tempAttachmentDeclarationHealth.setNew(false);
			}
			else {
				session.merge(tempAttachmentDeclarationHealth);
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
				!TempAttachmentDeclarationHealthModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempAttachmentDeclarationHealthModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempAttachmentDeclarationHealthModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] {
						tempAttachmentDeclarationHealthModelImpl.getRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempAttachmentDeclarationHealthModelImpl.ENTITY_CACHE_ENABLED,
			TempAttachmentDeclarationHealthImpl.class,
			tempAttachmentDeclarationHealth.getPrimaryKey(),
			tempAttachmentDeclarationHealth);

		return tempAttachmentDeclarationHealth;
	}

	protected TempAttachmentDeclarationHealth toUnwrappedModel(
		TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth) {
		if (tempAttachmentDeclarationHealth instanceof TempAttachmentDeclarationHealthImpl) {
			return tempAttachmentDeclarationHealth;
		}

		TempAttachmentDeclarationHealthImpl tempAttachmentDeclarationHealthImpl = new TempAttachmentDeclarationHealthImpl();

		tempAttachmentDeclarationHealthImpl.setNew(tempAttachmentDeclarationHealth.isNew());
		tempAttachmentDeclarationHealthImpl.setPrimaryKey(tempAttachmentDeclarationHealth.getPrimaryKey());

		tempAttachmentDeclarationHealthImpl.setId(tempAttachmentDeclarationHealth.getId());
		tempAttachmentDeclarationHealthImpl.setRequestCode(tempAttachmentDeclarationHealth.getRequestCode());
		tempAttachmentDeclarationHealthImpl.setAttachmentCode(tempAttachmentDeclarationHealth.getAttachmentCode());
		tempAttachmentDeclarationHealthImpl.setPassengerOrCrewCode(tempAttachmentDeclarationHealth.getPassengerOrCrewCode());
		tempAttachmentDeclarationHealthImpl.setName(tempAttachmentDeclarationHealth.getName());
		tempAttachmentDeclarationHealthImpl.setAge(tempAttachmentDeclarationHealth.getAge());
		tempAttachmentDeclarationHealthImpl.setSex(tempAttachmentDeclarationHealth.getSex());
		tempAttachmentDeclarationHealthImpl.setNationality(tempAttachmentDeclarationHealth.getNationality());
		tempAttachmentDeclarationHealthImpl.setPortJoinVesselCode(tempAttachmentDeclarationHealth.getPortJoinVesselCode());
		tempAttachmentDeclarationHealthImpl.setDateJoinVessel(tempAttachmentDeclarationHealth.getDateJoinVessel());
		tempAttachmentDeclarationHealthImpl.setClassOrRating(tempAttachmentDeclarationHealth.getClassOrRating());
		tempAttachmentDeclarationHealthImpl.setNatureOfIllness(tempAttachmentDeclarationHealth.getNatureOfIllness());
		tempAttachmentDeclarationHealthImpl.setDateOfOnsetOfSymptom(tempAttachmentDeclarationHealth.getDateOfOnsetOfSymptom());
		tempAttachmentDeclarationHealthImpl.setReportedMedicalOfficer(tempAttachmentDeclarationHealth.getReportedMedicalOfficer());
		tempAttachmentDeclarationHealthImpl.setDisposalOfCase(tempAttachmentDeclarationHealth.getDisposalOfCase());
		tempAttachmentDeclarationHealthImpl.setMedicinesOrOther(tempAttachmentDeclarationHealth.getMedicinesOrOther());
		tempAttachmentDeclarationHealthImpl.setComments(tempAttachmentDeclarationHealth.getComments());

		return tempAttachmentDeclarationHealthImpl;
	}

	/**
	 * Returns the temp attachment declaration health with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp attachment declaration health
	 * @return the temp attachment declaration health
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempAttachmentDeclarationHealthException if a temp attachment declaration health with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAttachmentDeclarationHealth findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchTempAttachmentDeclarationHealthException, SystemException {
		TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth = fetchByPrimaryKey(primaryKey);

		if (tempAttachmentDeclarationHealth == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTempAttachmentDeclarationHealthException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tempAttachmentDeclarationHealth;
	}

	/**
	 * Returns the temp attachment declaration health with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempAttachmentDeclarationHealthException} if it could not be found.
	 *
	 * @param id the primary key of the temp attachment declaration health
	 * @return the temp attachment declaration health
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempAttachmentDeclarationHealthException if a temp attachment declaration health with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAttachmentDeclarationHealth findByPrimaryKey(long id)
		throws NoSuchTempAttachmentDeclarationHealthException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the temp attachment declaration health with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp attachment declaration health
	 * @return the temp attachment declaration health, or <code>null</code> if a temp attachment declaration health with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAttachmentDeclarationHealth fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth = (TempAttachmentDeclarationHealth)EntityCacheUtil.getResult(TempAttachmentDeclarationHealthModelImpl.ENTITY_CACHE_ENABLED,
				TempAttachmentDeclarationHealthImpl.class, primaryKey);

		if (tempAttachmentDeclarationHealth == _nullTempAttachmentDeclarationHealth) {
			return null;
		}

		if (tempAttachmentDeclarationHealth == null) {
			Session session = null;

			try {
				session = openSession();

				tempAttachmentDeclarationHealth = (TempAttachmentDeclarationHealth)session.get(TempAttachmentDeclarationHealthImpl.class,
						primaryKey);

				if (tempAttachmentDeclarationHealth != null) {
					cacheResult(tempAttachmentDeclarationHealth);
				}
				else {
					EntityCacheUtil.putResult(TempAttachmentDeclarationHealthModelImpl.ENTITY_CACHE_ENABLED,
						TempAttachmentDeclarationHealthImpl.class, primaryKey,
						_nullTempAttachmentDeclarationHealth);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TempAttachmentDeclarationHealthModelImpl.ENTITY_CACHE_ENABLED,
					TempAttachmentDeclarationHealthImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tempAttachmentDeclarationHealth;
	}

	/**
	 * Returns the temp attachment declaration health with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp attachment declaration health
	 * @return the temp attachment declaration health, or <code>null</code> if a temp attachment declaration health with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAttachmentDeclarationHealth fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the temp attachment declaration healths.
	 *
	 * @return the temp attachment declaration healths
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempAttachmentDeclarationHealth> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp attachment declaration healths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempAttachmentDeclarationHealthModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp attachment declaration healths
	 * @param end the upper bound of the range of temp attachment declaration healths (not inclusive)
	 * @return the range of temp attachment declaration healths
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempAttachmentDeclarationHealth> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp attachment declaration healths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempAttachmentDeclarationHealthModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp attachment declaration healths
	 * @param end the upper bound of the range of temp attachment declaration healths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp attachment declaration healths
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempAttachmentDeclarationHealth> findAll(int start, int end,
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

		List<TempAttachmentDeclarationHealth> list = (List<TempAttachmentDeclarationHealth>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPATTACHMENTDECLARATIONHEALTH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPATTACHMENTDECLARATIONHEALTH;

				if (pagination) {
					sql = sql.concat(TempAttachmentDeclarationHealthModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TempAttachmentDeclarationHealth>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempAttachmentDeclarationHealth>(list);
				}
				else {
					list = (List<TempAttachmentDeclarationHealth>)QueryUtil.list(q,
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
	 * Removes all the temp attachment declaration healths from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth : findAll()) {
			remove(tempAttachmentDeclarationHealth);
		}
	}

	/**
	 * Returns the number of temp attachment declaration healths.
	 *
	 * @return the number of temp attachment declaration healths
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

				Query q = session.createQuery(_SQL_COUNT_TEMPATTACHMENTDECLARATIONHEALTH);

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
	 * Initializes the temp attachment declaration health persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.TempAttachmentDeclarationHealth")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempAttachmentDeclarationHealth>> listenersList =
					new ArrayList<ModelListener<TempAttachmentDeclarationHealth>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempAttachmentDeclarationHealth>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempAttachmentDeclarationHealthImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TEMPATTACHMENTDECLARATIONHEALTH = "SELECT tempAttachmentDeclarationHealth FROM TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth";
	private static final String _SQL_SELECT_TEMPATTACHMENTDECLARATIONHEALTH_WHERE =
		"SELECT tempAttachmentDeclarationHealth FROM TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth WHERE ";
	private static final String _SQL_COUNT_TEMPATTACHMENTDECLARATIONHEALTH = "SELECT COUNT(tempAttachmentDeclarationHealth) FROM TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth";
	private static final String _SQL_COUNT_TEMPATTACHMENTDECLARATIONHEALTH_WHERE =
		"SELECT COUNT(tempAttachmentDeclarationHealth) FROM TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempAttachmentDeclarationHealth.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempAttachmentDeclarationHealth exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempAttachmentDeclarationHealth exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempAttachmentDeclarationHealthPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "attachmentCode", "passengerOrCrewCode",
				"name", "age", "sex", "nationality", "portJoinVesselCode",
				"dateJoinVessel", "classOrRating", "natureOfIllness",
				"dateOfOnsetOfSymptom", "reportedMedicalOfficer",
				"disposalOfCase", "medicinesOrOther", "comments"
			});
	private static TempAttachmentDeclarationHealth _nullTempAttachmentDeclarationHealth =
		new TempAttachmentDeclarationHealthImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempAttachmentDeclarationHealth> toCacheModel() {
				return _nullTempAttachmentDeclarationHealthCacheModel;
			}
		};

	private static CacheModel<TempAttachmentDeclarationHealth> _nullTempAttachmentDeclarationHealthCacheModel =
		new CacheModel<TempAttachmentDeclarationHealth>() {
			@Override
			public TempAttachmentDeclarationHealth toEntityModel() {
				return _nullTempAttachmentDeclarationHealth;
			}
		};
}