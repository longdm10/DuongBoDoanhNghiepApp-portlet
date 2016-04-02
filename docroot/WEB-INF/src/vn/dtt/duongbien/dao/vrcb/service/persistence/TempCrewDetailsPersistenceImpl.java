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

import vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewDetailsException;
import vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewDetailsImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewDetailsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the temp crew details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempCrewDetailsPersistence
 * @see TempCrewDetailsUtil
 * @generated
 */
public class TempCrewDetailsPersistenceImpl extends BasePersistenceImpl<TempCrewDetails>
	implements TempCrewDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempCrewDetailsUtil} to access the temp crew details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempCrewDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsModelImpl.FINDER_CACHE_ENABLED,
			TempCrewDetailsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsModelImpl.FINDER_CACHE_ENABLED,
			TempCrewDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsModelImpl.FINDER_CACHE_ENABLED,
			TempCrewDetailsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByRequestCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsModelImpl.FINDER_CACHE_ENABLED,
			TempCrewDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempCrewDetailsModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the temp crew detailses where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp crew detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewDetails> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp crew detailses where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp crew detailses
	 * @param end the upper bound of the range of temp crew detailses (not inclusive)
	 * @return the range of matching temp crew detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewDetails> findByRequestCode(String requestCode,
		int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp crew detailses where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp crew detailses
	 * @param end the upper bound of the range of temp crew detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp crew detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewDetails> findByRequestCode(String requestCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
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

		List<TempCrewDetails> list = (List<TempCrewDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempCrewDetails tempCrewDetails : list) {
				if (!Validator.equals(requestCode,
							tempCrewDetails.getRequestCode())) {
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

			query.append(_SQL_SELECT_TEMPCREWDETAILS_WHERE);

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
				query.append(TempCrewDetailsModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempCrewDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempCrewDetails>(list);
				}
				else {
					list = (List<TempCrewDetails>)QueryUtil.list(q,
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
	 * Returns the first temp crew details in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp crew details
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewDetailsException if a matching temp crew details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewDetails findByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempCrewDetailsException, SystemException {
		TempCrewDetails tempCrewDetails = fetchByRequestCode_First(requestCode,
				orderByComparator);

		if (tempCrewDetails != null) {
			return tempCrewDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempCrewDetailsException(msg.toString());
	}

	/**
	 * Returns the first temp crew details in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp crew details, or <code>null</code> if a matching temp crew details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewDetails fetchByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempCrewDetails> list = findByRequestCode(requestCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp crew details in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp crew details
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewDetailsException if a matching temp crew details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewDetails findByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempCrewDetailsException, SystemException {
		TempCrewDetails tempCrewDetails = fetchByRequestCode_Last(requestCode,
				orderByComparator);

		if (tempCrewDetails != null) {
			return tempCrewDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempCrewDetailsException(msg.toString());
	}

	/**
	 * Returns the last temp crew details in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp crew details, or <code>null</code> if a matching temp crew details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewDetails fetchByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByRequestCode(requestCode);

		if (count == 0) {
			return null;
		}

		List<TempCrewDetails> list = findByRequestCode(requestCode, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp crew detailses before and after the current temp crew details in the ordered set where requestCode = &#63;.
	 *
	 * @param id the primary key of the current temp crew details
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp crew details
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewDetailsException if a temp crew details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewDetails[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempCrewDetailsException, SystemException {
		TempCrewDetails tempCrewDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempCrewDetails[] array = new TempCrewDetailsImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session, tempCrewDetails,
					requestCode, orderByComparator, true);

			array[1] = tempCrewDetails;

			array[2] = getByRequestCode_PrevAndNext(session, tempCrewDetails,
					requestCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempCrewDetails getByRequestCode_PrevAndNext(Session session,
		TempCrewDetails tempCrewDetails, String requestCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPCREWDETAILS_WHERE);

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
			query.append(TempCrewDetailsModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempCrewDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempCrewDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp crew detailses where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempCrewDetails tempCrewDetails : findByRequestCode(requestCode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tempCrewDetails);
		}
	}

	/**
	 * Returns the number of temp crew detailses where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp crew detailses
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

			query.append(_SQL_COUNT_TEMPCREWDETAILS_WHERE);

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

	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempCrewDetails.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempCrewDetails.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempCrewDetails.requestCode IS NULL OR tempCrewDetails.requestCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CREWCODE = new FinderPath(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsModelImpl.FINDER_CACHE_ENABLED,
			TempCrewDetailsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCrewCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREWCODE =
		new FinderPath(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsModelImpl.FINDER_CACHE_ENABLED,
			TempCrewDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCrewCode",
			new String[] { String.class.getName() },
			TempCrewDetailsModelImpl.CREWCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CREWCODE = new FinderPath(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCrewCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the temp crew detailses where crewcode = &#63;.
	 *
	 * @param crewcode the crewcode
	 * @return the matching temp crew detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewDetails> findByCrewCode(String crewcode)
		throws SystemException {
		return findByCrewCode(crewcode, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the temp crew detailses where crewcode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param crewcode the crewcode
	 * @param start the lower bound of the range of temp crew detailses
	 * @param end the upper bound of the range of temp crew detailses (not inclusive)
	 * @return the range of matching temp crew detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewDetails> findByCrewCode(String crewcode, int start,
		int end) throws SystemException {
		return findByCrewCode(crewcode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp crew detailses where crewcode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param crewcode the crewcode
	 * @param start the lower bound of the range of temp crew detailses
	 * @param end the upper bound of the range of temp crew detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp crew detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewDetails> findByCrewCode(String crewcode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREWCODE;
			finderArgs = new Object[] { crewcode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CREWCODE;
			finderArgs = new Object[] { crewcode, start, end, orderByComparator };
		}

		List<TempCrewDetails> list = (List<TempCrewDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempCrewDetails tempCrewDetails : list) {
				if (!Validator.equals(crewcode, tempCrewDetails.getCrewcode())) {
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

			query.append(_SQL_SELECT_TEMPCREWDETAILS_WHERE);

			boolean bindCrewcode = false;

			if (crewcode == null) {
				query.append(_FINDER_COLUMN_CREWCODE_CREWCODE_1);
			}
			else if (crewcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CREWCODE_CREWCODE_3);
			}
			else {
				bindCrewcode = true;

				query.append(_FINDER_COLUMN_CREWCODE_CREWCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempCrewDetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCrewcode) {
					qPos.add(crewcode);
				}

				if (!pagination) {
					list = (List<TempCrewDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempCrewDetails>(list);
				}
				else {
					list = (List<TempCrewDetails>)QueryUtil.list(q,
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
	 * Returns the first temp crew details in the ordered set where crewcode = &#63;.
	 *
	 * @param crewcode the crewcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp crew details
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewDetailsException if a matching temp crew details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewDetails findByCrewCode_First(String crewcode,
		OrderByComparator orderByComparator)
		throws NoSuchTempCrewDetailsException, SystemException {
		TempCrewDetails tempCrewDetails = fetchByCrewCode_First(crewcode,
				orderByComparator);

		if (tempCrewDetails != null) {
			return tempCrewDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("crewcode=");
		msg.append(crewcode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempCrewDetailsException(msg.toString());
	}

	/**
	 * Returns the first temp crew details in the ordered set where crewcode = &#63;.
	 *
	 * @param crewcode the crewcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp crew details, or <code>null</code> if a matching temp crew details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewDetails fetchByCrewCode_First(String crewcode,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempCrewDetails> list = findByCrewCode(crewcode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp crew details in the ordered set where crewcode = &#63;.
	 *
	 * @param crewcode the crewcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp crew details
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewDetailsException if a matching temp crew details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewDetails findByCrewCode_Last(String crewcode,
		OrderByComparator orderByComparator)
		throws NoSuchTempCrewDetailsException, SystemException {
		TempCrewDetails tempCrewDetails = fetchByCrewCode_Last(crewcode,
				orderByComparator);

		if (tempCrewDetails != null) {
			return tempCrewDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("crewcode=");
		msg.append(crewcode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempCrewDetailsException(msg.toString());
	}

	/**
	 * Returns the last temp crew details in the ordered set where crewcode = &#63;.
	 *
	 * @param crewcode the crewcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp crew details, or <code>null</code> if a matching temp crew details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewDetails fetchByCrewCode_Last(String crewcode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCrewCode(crewcode);

		if (count == 0) {
			return null;
		}

		List<TempCrewDetails> list = findByCrewCode(crewcode, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp crew detailses before and after the current temp crew details in the ordered set where crewcode = &#63;.
	 *
	 * @param id the primary key of the current temp crew details
	 * @param crewcode the crewcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp crew details
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewDetailsException if a temp crew details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewDetails[] findByCrewCode_PrevAndNext(long id,
		String crewcode, OrderByComparator orderByComparator)
		throws NoSuchTempCrewDetailsException, SystemException {
		TempCrewDetails tempCrewDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempCrewDetails[] array = new TempCrewDetailsImpl[3];

			array[0] = getByCrewCode_PrevAndNext(session, tempCrewDetails,
					crewcode, orderByComparator, true);

			array[1] = tempCrewDetails;

			array[2] = getByCrewCode_PrevAndNext(session, tempCrewDetails,
					crewcode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempCrewDetails getByCrewCode_PrevAndNext(Session session,
		TempCrewDetails tempCrewDetails, String crewcode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPCREWDETAILS_WHERE);

		boolean bindCrewcode = false;

		if (crewcode == null) {
			query.append(_FINDER_COLUMN_CREWCODE_CREWCODE_1);
		}
		else if (crewcode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CREWCODE_CREWCODE_3);
		}
		else {
			bindCrewcode = true;

			query.append(_FINDER_COLUMN_CREWCODE_CREWCODE_2);
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
			query.append(TempCrewDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCrewcode) {
			qPos.add(crewcode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempCrewDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempCrewDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp crew detailses where crewcode = &#63; from the database.
	 *
	 * @param crewcode the crewcode
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCrewCode(String crewcode) throws SystemException {
		for (TempCrewDetails tempCrewDetails : findByCrewCode(crewcode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tempCrewDetails);
		}
	}

	/**
	 * Returns the number of temp crew detailses where crewcode = &#63;.
	 *
	 * @param crewcode the crewcode
	 * @return the number of matching temp crew detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCrewCode(String crewcode) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CREWCODE;

		Object[] finderArgs = new Object[] { crewcode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TEMPCREWDETAILS_WHERE);

			boolean bindCrewcode = false;

			if (crewcode == null) {
				query.append(_FINDER_COLUMN_CREWCODE_CREWCODE_1);
			}
			else if (crewcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CREWCODE_CREWCODE_3);
			}
			else {
				bindCrewcode = true;

				query.append(_FINDER_COLUMN_CREWCODE_CREWCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCrewcode) {
					qPos.add(crewcode);
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

	private static final String _FINDER_COLUMN_CREWCODE_CREWCODE_1 = "tempCrewDetails.crewcode IS NULL";
	private static final String _FINDER_COLUMN_CREWCODE_CREWCODE_2 = "tempCrewDetails.crewcode = ?";
	private static final String _FINDER_COLUMN_CREWCODE_CREWCODE_3 = "(tempCrewDetails.crewcode IS NULL OR tempCrewDetails.crewcode = '')";

	public TempCrewDetailsPersistenceImpl() {
		setModelClass(TempCrewDetails.class);
	}

	/**
	 * Caches the temp crew details in the entity cache if it is enabled.
	 *
	 * @param tempCrewDetails the temp crew details
	 */
	@Override
	public void cacheResult(TempCrewDetails tempCrewDetails) {
		EntityCacheUtil.putResult(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsImpl.class, tempCrewDetails.getPrimaryKey(),
			tempCrewDetails);

		tempCrewDetails.resetOriginalValues();
	}

	/**
	 * Caches the temp crew detailses in the entity cache if it is enabled.
	 *
	 * @param tempCrewDetailses the temp crew detailses
	 */
	@Override
	public void cacheResult(List<TempCrewDetails> tempCrewDetailses) {
		for (TempCrewDetails tempCrewDetails : tempCrewDetailses) {
			if (EntityCacheUtil.getResult(
						TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
						TempCrewDetailsImpl.class,
						tempCrewDetails.getPrimaryKey()) == null) {
				cacheResult(tempCrewDetails);
			}
			else {
				tempCrewDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp crew detailses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempCrewDetailsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempCrewDetailsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp crew details.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempCrewDetails tempCrewDetails) {
		EntityCacheUtil.removeResult(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsImpl.class, tempCrewDetails.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TempCrewDetails> tempCrewDetailses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempCrewDetails tempCrewDetails : tempCrewDetailses) {
			EntityCacheUtil.removeResult(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
				TempCrewDetailsImpl.class, tempCrewDetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp crew details with the primary key. Does not add the temp crew details to the database.
	 *
	 * @param id the primary key for the new temp crew details
	 * @return the new temp crew details
	 */
	@Override
	public TempCrewDetails create(long id) {
		TempCrewDetails tempCrewDetails = new TempCrewDetailsImpl();

		tempCrewDetails.setNew(true);
		tempCrewDetails.setPrimaryKey(id);

		return tempCrewDetails;
	}

	/**
	 * Removes the temp crew details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp crew details
	 * @return the temp crew details that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewDetailsException if a temp crew details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewDetails remove(long id)
		throws NoSuchTempCrewDetailsException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the temp crew details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp crew details
	 * @return the temp crew details that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewDetailsException if a temp crew details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewDetails remove(Serializable primaryKey)
		throws NoSuchTempCrewDetailsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempCrewDetails tempCrewDetails = (TempCrewDetails)session.get(TempCrewDetailsImpl.class,
					primaryKey);

			if (tempCrewDetails == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempCrewDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempCrewDetails);
		}
		catch (NoSuchTempCrewDetailsException nsee) {
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
	protected TempCrewDetails removeImpl(TempCrewDetails tempCrewDetails)
		throws SystemException {
		tempCrewDetails = toUnwrappedModel(tempCrewDetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tempCrewDetails)) {
				tempCrewDetails = (TempCrewDetails)session.get(TempCrewDetailsImpl.class,
						tempCrewDetails.getPrimaryKeyObj());
			}

			if (tempCrewDetails != null) {
				session.delete(tempCrewDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tempCrewDetails != null) {
			clearCache(tempCrewDetails);
		}

		return tempCrewDetails;
	}

	@Override
	public TempCrewDetails updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails tempCrewDetails)
		throws SystemException {
		tempCrewDetails = toUnwrappedModel(tempCrewDetails);

		boolean isNew = tempCrewDetails.isNew();

		TempCrewDetailsModelImpl tempCrewDetailsModelImpl = (TempCrewDetailsModelImpl)tempCrewDetails;

		Session session = null;

		try {
			session = openSession();

			if (tempCrewDetails.isNew()) {
				session.save(tempCrewDetails);

				tempCrewDetails.setNew(false);
			}
			else {
				session.merge(tempCrewDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TempCrewDetailsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempCrewDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempCrewDetailsModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] { tempCrewDetailsModelImpl.getRequestCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}

			if ((tempCrewDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREWCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempCrewDetailsModelImpl.getOriginalCrewcode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CREWCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREWCODE,
					args);

				args = new Object[] { tempCrewDetailsModelImpl.getCrewcode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CREWCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CREWCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewDetailsImpl.class, tempCrewDetails.getPrimaryKey(),
			tempCrewDetails);

		return tempCrewDetails;
	}

	protected TempCrewDetails toUnwrappedModel(TempCrewDetails tempCrewDetails) {
		if (tempCrewDetails instanceof TempCrewDetailsImpl) {
			return tempCrewDetails;
		}

		TempCrewDetailsImpl tempCrewDetailsImpl = new TempCrewDetailsImpl();

		tempCrewDetailsImpl.setNew(tempCrewDetails.isNew());
		tempCrewDetailsImpl.setPrimaryKey(tempCrewDetails.getPrimaryKey());

		tempCrewDetailsImpl.setId(tempCrewDetails.getId());
		tempCrewDetailsImpl.setRequestCode(tempCrewDetails.getRequestCode());
		tempCrewDetailsImpl.setCrewcode(tempCrewDetails.getCrewcode());
		tempCrewDetailsImpl.setFamilyName(tempCrewDetails.getFamilyName());
		tempCrewDetailsImpl.setGivenName(tempCrewDetails.getGivenName());
		tempCrewDetailsImpl.setRankCode(tempCrewDetails.getRankCode());
		tempCrewDetailsImpl.setNationality(tempCrewDetails.getNationality());
		tempCrewDetailsImpl.setDateOfBirth(tempCrewDetails.getDateOfBirth());
		tempCrewDetailsImpl.setPlaceOfBirth(tempCrewDetails.getPlaceOfBirth());
		tempCrewDetailsImpl.setPassportNumber(tempCrewDetails.getPassportNumber());
		tempCrewDetailsImpl.setPassportTypeCode(tempCrewDetails.getPassportTypeCode());

		return tempCrewDetailsImpl;
	}

	/**
	 * Returns the temp crew details with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp crew details
	 * @return the temp crew details
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewDetailsException if a temp crew details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTempCrewDetailsException, SystemException {
		TempCrewDetails tempCrewDetails = fetchByPrimaryKey(primaryKey);

		if (tempCrewDetails == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTempCrewDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tempCrewDetails;
	}

	/**
	 * Returns the temp crew details with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewDetailsException} if it could not be found.
	 *
	 * @param id the primary key of the temp crew details
	 * @return the temp crew details
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewDetailsException if a temp crew details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewDetails findByPrimaryKey(long id)
		throws NoSuchTempCrewDetailsException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the temp crew details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp crew details
	 * @return the temp crew details, or <code>null</code> if a temp crew details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewDetails fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TempCrewDetails tempCrewDetails = (TempCrewDetails)EntityCacheUtil.getResult(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
				TempCrewDetailsImpl.class, primaryKey);

		if (tempCrewDetails == _nullTempCrewDetails) {
			return null;
		}

		if (tempCrewDetails == null) {
			Session session = null;

			try {
				session = openSession();

				tempCrewDetails = (TempCrewDetails)session.get(TempCrewDetailsImpl.class,
						primaryKey);

				if (tempCrewDetails != null) {
					cacheResult(tempCrewDetails);
				}
				else {
					EntityCacheUtil.putResult(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
						TempCrewDetailsImpl.class, primaryKey,
						_nullTempCrewDetails);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TempCrewDetailsModelImpl.ENTITY_CACHE_ENABLED,
					TempCrewDetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tempCrewDetails;
	}

	/**
	 * Returns the temp crew details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp crew details
	 * @return the temp crew details, or <code>null</code> if a temp crew details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewDetails fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the temp crew detailses.
	 *
	 * @return the temp crew detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewDetails> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp crew detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp crew detailses
	 * @param end the upper bound of the range of temp crew detailses (not inclusive)
	 * @return the range of temp crew detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewDetails> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp crew detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp crew detailses
	 * @param end the upper bound of the range of temp crew detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp crew detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewDetails> findAll(int start, int end,
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

		List<TempCrewDetails> list = (List<TempCrewDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPCREWDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPCREWDETAILS;

				if (pagination) {
					sql = sql.concat(TempCrewDetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TempCrewDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempCrewDetails>(list);
				}
				else {
					list = (List<TempCrewDetails>)QueryUtil.list(q,
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
	 * Removes all the temp crew detailses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TempCrewDetails tempCrewDetails : findAll()) {
			remove(tempCrewDetails);
		}
	}

	/**
	 * Returns the number of temp crew detailses.
	 *
	 * @return the number of temp crew detailses
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

				Query q = session.createQuery(_SQL_COUNT_TEMPCREWDETAILS);

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
	 * Initializes the temp crew details persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempCrewDetails>> listenersList = new ArrayList<ModelListener<TempCrewDetails>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempCrewDetails>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempCrewDetailsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TEMPCREWDETAILS = "SELECT tempCrewDetails FROM TempCrewDetails tempCrewDetails";
	private static final String _SQL_SELECT_TEMPCREWDETAILS_WHERE = "SELECT tempCrewDetails FROM TempCrewDetails tempCrewDetails WHERE ";
	private static final String _SQL_COUNT_TEMPCREWDETAILS = "SELECT COUNT(tempCrewDetails) FROM TempCrewDetails tempCrewDetails";
	private static final String _SQL_COUNT_TEMPCREWDETAILS_WHERE = "SELECT COUNT(tempCrewDetails) FROM TempCrewDetails tempCrewDetails WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempCrewDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempCrewDetails exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempCrewDetails exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempCrewDetailsPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "crewcode", "familyName", "givenName",
				"rankCode", "nationality", "dateOfBirth", "placeOfBirth",
				"passportNumber", "passportTypeCode"
			});
	private static TempCrewDetails _nullTempCrewDetails = new TempCrewDetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempCrewDetails> toCacheModel() {
				return _nullTempCrewDetailsCacheModel;
			}
		};

	private static CacheModel<TempCrewDetails> _nullTempCrewDetailsCacheModel = new CacheModel<TempCrewDetails>() {
			@Override
			public TempCrewDetails toEntityModel() {
				return _nullTempCrewDetails;
			}
		};
}