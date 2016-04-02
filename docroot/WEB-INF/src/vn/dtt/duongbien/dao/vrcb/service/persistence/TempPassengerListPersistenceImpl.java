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

import vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerListException;
import vn.dtt.duongbien.dao.vrcb.model.TempPassengerList;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerListImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerListModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the temp passenger list service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempPassengerListPersistence
 * @see TempPassengerListUtil
 * @generated
 */
public class TempPassengerListPersistenceImpl extends BasePersistenceImpl<TempPassengerList>
	implements TempPassengerListPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempPassengerListUtil} to access the temp passenger list persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempPassengerListImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempPassengerListModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerListModelImpl.FINDER_CACHE_ENABLED,
			TempPassengerListImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempPassengerListModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerListModelImpl.FINDER_CACHE_ENABLED,
			TempPassengerListImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempPassengerListModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerListModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempPassengerListModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerListModelImpl.FINDER_CACHE_ENABLED,
			TempPassengerListImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentNameAnddocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempPassengerListModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerListModelImpl.FINDER_CACHE_ENABLED,
			TempPassengerListImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			TempPassengerListModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempPassengerListModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempPassengerListModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerListModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the temp passenger lists where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching temp passenger lists
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPassengerList> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findBydocumentNameAnddocumentYear(documentName, documentYear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp passenger lists where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp passenger lists
	 * @param end the upper bound of the range of temp passenger lists (not inclusive)
	 * @return the range of matching temp passenger lists
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPassengerList> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findBydocumentNameAnddocumentYear(documentName, documentYear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp passenger lists where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp passenger lists
	 * @param end the upper bound of the range of temp passenger lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp passenger lists
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPassengerList> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR;
			finderArgs = new Object[] { documentName, documentYear };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR;
			finderArgs = new Object[] {
					documentName, documentYear,
					
					start, end, orderByComparator
				};
		}

		List<TempPassengerList> list = (List<TempPassengerList>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempPassengerList tempPassengerList : list) {
				if ((documentName != tempPassengerList.getDocumentName()) ||
						(documentYear != tempPassengerList.getDocumentYear())) {
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

			query.append(_SQL_SELECT_TEMPPASSENGERLIST_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempPassengerListModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				if (!pagination) {
					list = (List<TempPassengerList>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempPassengerList>(list);
				}
				else {
					list = (List<TempPassengerList>)QueryUtil.list(q,
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
	 * Returns the first temp passenger list in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp passenger list
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerListException if a matching temp passenger list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerList findBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempPassengerListException, SystemException {
		TempPassengerList tempPassengerList = fetchBydocumentNameAnddocumentYear_First(documentName,
				documentYear, orderByComparator);

		if (tempPassengerList != null) {
			return tempPassengerList;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempPassengerListException(msg.toString());
	}

	/**
	 * Returns the first temp passenger list in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp passenger list, or <code>null</code> if a matching temp passenger list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerList fetchBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		List<TempPassengerList> list = findBydocumentNameAnddocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp passenger list in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp passenger list
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerListException if a matching temp passenger list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerList findBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempPassengerListException, SystemException {
		TempPassengerList tempPassengerList = fetchBydocumentNameAnddocumentYear_Last(documentName,
				documentYear, orderByComparator);

		if (tempPassengerList != null) {
			return tempPassengerList;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempPassengerListException(msg.toString());
	}

	/**
	 * Returns the last temp passenger list in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp passenger list, or <code>null</code> if a matching temp passenger list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerList fetchBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBydocumentNameAnddocumentYear(documentName,
				documentYear);

		if (count == 0) {
			return null;
		}

		List<TempPassengerList> list = findBydocumentNameAnddocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp passenger lists before and after the current temp passenger list in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param id the primary key of the current temp passenger list
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp passenger list
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerListException if a temp passenger list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerList[] findBydocumentNameAnddocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchTempPassengerListException, SystemException {
		TempPassengerList tempPassengerList = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempPassengerList[] array = new TempPassengerListImpl[3];

			array[0] = getBydocumentNameAnddocumentYear_PrevAndNext(session,
					tempPassengerList, documentName, documentYear,
					orderByComparator, true);

			array[1] = tempPassengerList;

			array[2] = getBydocumentNameAnddocumentYear_PrevAndNext(session,
					tempPassengerList, documentName, documentYear,
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

	protected TempPassengerList getBydocumentNameAnddocumentYear_PrevAndNext(
		Session session, TempPassengerList tempPassengerList,
		long documentName, int documentYear,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPPASSENGERLIST_WHERE);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

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
			query.append(TempPassengerListModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempPassengerList);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempPassengerList> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp passenger lists where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBydocumentNameAnddocumentYear(long documentName,
		int documentYear) throws SystemException {
		for (TempPassengerList tempPassengerList : findBydocumentNameAnddocumentYear(
				documentName, documentYear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempPassengerList);
		}
	}

	/**
	 * Returns the number of temp passenger lists where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching temp passenger lists
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBydocumentNameAnddocumentYear(long documentName,
		int documentYear) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR;

		Object[] finderArgs = new Object[] { documentName, documentYear };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TEMPPASSENGERLIST_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

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

	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2 =
		"tempPassengerList.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"tempPassengerList.documentYear = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempPassengerListModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerListModelImpl.FINDER_CACHE_ENABLED,
			TempPassengerListImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempPassengerListModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerListModelImpl.FINDER_CACHE_ENABLED,
			TempPassengerListImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			TempPassengerListModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempPassengerListModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			TempPassengerListModelImpl.REQUESTSTATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempPassengerListModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerListModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the temp passenger lists where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the matching temp passenger lists
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPassengerList> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		return findBydocumentNameAnddocumentYearRequestState(documentName,
			documentYear, requestState, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the temp passenger lists where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp passenger lists
	 * @param end the upper bound of the range of temp passenger lists (not inclusive)
	 * @return the range of matching temp passenger lists
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPassengerList> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end) throws SystemException {
		return findBydocumentNameAnddocumentYearRequestState(documentName,
			documentYear, requestState, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp passenger lists where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp passenger lists
	 * @param end the upper bound of the range of temp passenger lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp passenger lists
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPassengerList> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE;
			finderArgs = new Object[] { documentName, documentYear, requestState };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE;
			finderArgs = new Object[] {
					documentName, documentYear, requestState,
					
					start, end, orderByComparator
				};
		}

		List<TempPassengerList> list = (List<TempPassengerList>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempPassengerList tempPassengerList : list) {
				if ((documentName != tempPassengerList.getDocumentName()) ||
						(documentYear != tempPassengerList.getDocumentYear()) ||
						(requestState != tempPassengerList.getRequestState())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_TEMPPASSENGERLIST_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempPassengerListModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				qPos.add(requestState);

				if (!pagination) {
					list = (List<TempPassengerList>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempPassengerList>(list);
				}
				else {
					list = (List<TempPassengerList>)QueryUtil.list(q,
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
	 * Returns the first temp passenger list in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp passenger list
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerListException if a matching temp passenger list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerList findBydocumentNameAnddocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempPassengerListException, SystemException {
		TempPassengerList tempPassengerList = fetchBydocumentNameAnddocumentYearRequestState_First(documentName,
				documentYear, requestState, orderByComparator);

		if (tempPassengerList != null) {
			return tempPassengerList;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(", requestState=");
		msg.append(requestState);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempPassengerListException(msg.toString());
	}

	/**
	 * Returns the first temp passenger list in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp passenger list, or <code>null</code> if a matching temp passenger list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerList fetchBydocumentNameAnddocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempPassengerList> list = findBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp passenger list in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp passenger list
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerListException if a matching temp passenger list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerList findBydocumentNameAnddocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempPassengerListException, SystemException {
		TempPassengerList tempPassengerList = fetchBydocumentNameAnddocumentYearRequestState_Last(documentName,
				documentYear, requestState, orderByComparator);

		if (tempPassengerList != null) {
			return tempPassengerList;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(", requestState=");
		msg.append(requestState);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempPassengerListException(msg.toString());
	}

	/**
	 * Returns the last temp passenger list in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp passenger list, or <code>null</code> if a matching temp passenger list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerList fetchBydocumentNameAnddocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState);

		if (count == 0) {
			return null;
		}

		List<TempPassengerList> list = findBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp passenger lists before and after the current temp passenger list in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param id the primary key of the current temp passenger list
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp passenger list
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerListException if a temp passenger list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerList[] findBydocumentNameAnddocumentYearRequestState_PrevAndNext(
		long id, long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempPassengerListException, SystemException {
		TempPassengerList tempPassengerList = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempPassengerList[] array = new TempPassengerListImpl[3];

			array[0] = getBydocumentNameAnddocumentYearRequestState_PrevAndNext(session,
					tempPassengerList, documentName, documentYear,
					requestState, orderByComparator, true);

			array[1] = tempPassengerList;

			array[2] = getBydocumentNameAnddocumentYearRequestState_PrevAndNext(session,
					tempPassengerList, documentName, documentYear,
					requestState, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempPassengerList getBydocumentNameAnddocumentYearRequestState_PrevAndNext(
		Session session, TempPassengerList tempPassengerList,
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPPASSENGERLIST_WHERE);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2);

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
			query.append(TempPassengerListModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		qPos.add(requestState);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempPassengerList);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempPassengerList> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp passenger lists where documentName = &#63; and documentYear = &#63; and requestState = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		for (TempPassengerList tempPassengerList : findBydocumentNameAnddocumentYearRequestState(
				documentName, documentYear, requestState, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempPassengerList);
		}
	}

	/**
	 * Returns the number of temp passenger lists where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the number of matching temp passenger lists
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE;

		Object[] finderArgs = new Object[] {
				documentName, documentYear, requestState
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TEMPPASSENGERLIST_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				qPos.add(requestState);

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

	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2 =
		"tempPassengerList.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2 =
		"tempPassengerList.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2 =
		"tempPassengerList.requestState = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempPassengerListModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerListModelImpl.FINDER_CACHE_ENABLED,
			TempPassengerListImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempPassengerListModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerListModelImpl.FINDER_CACHE_ENABLED,
			TempPassengerListImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempPassengerListModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempPassengerListModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerListModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the temp passenger lists where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp passenger lists
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPassengerList> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp passenger lists where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp passenger lists
	 * @param end the upper bound of the range of temp passenger lists (not inclusive)
	 * @return the range of matching temp passenger lists
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPassengerList> findByRequestCode(String requestCode,
		int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp passenger lists where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp passenger lists
	 * @param end the upper bound of the range of temp passenger lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp passenger lists
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPassengerList> findByRequestCode(String requestCode,
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

		List<TempPassengerList> list = (List<TempPassengerList>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempPassengerList tempPassengerList : list) {
				if (!Validator.equals(requestCode,
							tempPassengerList.getRequestCode())) {
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

			query.append(_SQL_SELECT_TEMPPASSENGERLIST_WHERE);

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
				query.append(TempPassengerListModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempPassengerList>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempPassengerList>(list);
				}
				else {
					list = (List<TempPassengerList>)QueryUtil.list(q,
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
	 * Returns the first temp passenger list in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp passenger list
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerListException if a matching temp passenger list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerList findByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempPassengerListException, SystemException {
		TempPassengerList tempPassengerList = fetchByRequestCode_First(requestCode,
				orderByComparator);

		if (tempPassengerList != null) {
			return tempPassengerList;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempPassengerListException(msg.toString());
	}

	/**
	 * Returns the first temp passenger list in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp passenger list, or <code>null</code> if a matching temp passenger list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerList fetchByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempPassengerList> list = findByRequestCode(requestCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp passenger list in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp passenger list
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerListException if a matching temp passenger list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerList findByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempPassengerListException, SystemException {
		TempPassengerList tempPassengerList = fetchByRequestCode_Last(requestCode,
				orderByComparator);

		if (tempPassengerList != null) {
			return tempPassengerList;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempPassengerListException(msg.toString());
	}

	/**
	 * Returns the last temp passenger list in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp passenger list, or <code>null</code> if a matching temp passenger list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerList fetchByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByRequestCode(requestCode);

		if (count == 0) {
			return null;
		}

		List<TempPassengerList> list = findByRequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp passenger lists before and after the current temp passenger list in the ordered set where requestCode = &#63;.
	 *
	 * @param id the primary key of the current temp passenger list
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp passenger list
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerListException if a temp passenger list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerList[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempPassengerListException, SystemException {
		TempPassengerList tempPassengerList = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempPassengerList[] array = new TempPassengerListImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session, tempPassengerList,
					requestCode, orderByComparator, true);

			array[1] = tempPassengerList;

			array[2] = getByRequestCode_PrevAndNext(session, tempPassengerList,
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

	protected TempPassengerList getByRequestCode_PrevAndNext(Session session,
		TempPassengerList tempPassengerList, String requestCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPPASSENGERLIST_WHERE);

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
			query.append(TempPassengerListModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempPassengerList);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempPassengerList> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp passenger lists where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempPassengerList tempPassengerList : findByRequestCode(
				requestCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tempPassengerList);
		}
	}

	/**
	 * Returns the number of temp passenger lists where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp passenger lists
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

			query.append(_SQL_COUNT_TEMPPASSENGERLIST_WHERE);

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

	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempPassengerList.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempPassengerList.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempPassengerList.requestCode IS NULL OR tempPassengerList.requestCode = '')";

	public TempPassengerListPersistenceImpl() {
		setModelClass(TempPassengerList.class);
	}

	/**
	 * Caches the temp passenger list in the entity cache if it is enabled.
	 *
	 * @param tempPassengerList the temp passenger list
	 */
	@Override
	public void cacheResult(TempPassengerList tempPassengerList) {
		EntityCacheUtil.putResult(TempPassengerListModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerListImpl.class, tempPassengerList.getPrimaryKey(),
			tempPassengerList);

		tempPassengerList.resetOriginalValues();
	}

	/**
	 * Caches the temp passenger lists in the entity cache if it is enabled.
	 *
	 * @param tempPassengerLists the temp passenger lists
	 */
	@Override
	public void cacheResult(List<TempPassengerList> tempPassengerLists) {
		for (TempPassengerList tempPassengerList : tempPassengerLists) {
			if (EntityCacheUtil.getResult(
						TempPassengerListModelImpl.ENTITY_CACHE_ENABLED,
						TempPassengerListImpl.class,
						tempPassengerList.getPrimaryKey()) == null) {
				cacheResult(tempPassengerList);
			}
			else {
				tempPassengerList.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp passenger lists.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempPassengerListImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempPassengerListImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp passenger list.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempPassengerList tempPassengerList) {
		EntityCacheUtil.removeResult(TempPassengerListModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerListImpl.class, tempPassengerList.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TempPassengerList> tempPassengerLists) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempPassengerList tempPassengerList : tempPassengerLists) {
			EntityCacheUtil.removeResult(TempPassengerListModelImpl.ENTITY_CACHE_ENABLED,
				TempPassengerListImpl.class, tempPassengerList.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp passenger list with the primary key. Does not add the temp passenger list to the database.
	 *
	 * @param id the primary key for the new temp passenger list
	 * @return the new temp passenger list
	 */
	@Override
	public TempPassengerList create(long id) {
		TempPassengerList tempPassengerList = new TempPassengerListImpl();

		tempPassengerList.setNew(true);
		tempPassengerList.setPrimaryKey(id);

		return tempPassengerList;
	}

	/**
	 * Removes the temp passenger list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp passenger list
	 * @return the temp passenger list that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerListException if a temp passenger list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerList remove(long id)
		throws NoSuchTempPassengerListException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the temp passenger list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp passenger list
	 * @return the temp passenger list that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerListException if a temp passenger list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerList remove(Serializable primaryKey)
		throws NoSuchTempPassengerListException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempPassengerList tempPassengerList = (TempPassengerList)session.get(TempPassengerListImpl.class,
					primaryKey);

			if (tempPassengerList == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempPassengerListException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempPassengerList);
		}
		catch (NoSuchTempPassengerListException nsee) {
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
	protected TempPassengerList removeImpl(TempPassengerList tempPassengerList)
		throws SystemException {
		tempPassengerList = toUnwrappedModel(tempPassengerList);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tempPassengerList)) {
				tempPassengerList = (TempPassengerList)session.get(TempPassengerListImpl.class,
						tempPassengerList.getPrimaryKeyObj());
			}

			if (tempPassengerList != null) {
				session.delete(tempPassengerList);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tempPassengerList != null) {
			clearCache(tempPassengerList);
		}

		return tempPassengerList;
	}

	@Override
	public TempPassengerList updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempPassengerList tempPassengerList)
		throws SystemException {
		tempPassengerList = toUnwrappedModel(tempPassengerList);

		boolean isNew = tempPassengerList.isNew();

		TempPassengerListModelImpl tempPassengerListModelImpl = (TempPassengerListModelImpl)tempPassengerList;

		Session session = null;

		try {
			session = openSession();

			if (tempPassengerList.isNew()) {
				session.save(tempPassengerList);

				tempPassengerList.setNew(false);
			}
			else {
				session.merge(tempPassengerList);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TempPassengerListModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempPassengerListModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempPassengerListModelImpl.getOriginalDocumentName(),
						tempPassengerListModelImpl.getOriginalDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						tempPassengerListModelImpl.getDocumentName(),
						tempPassengerListModelImpl.getDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
			}

			if ((tempPassengerListModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempPassengerListModelImpl.getOriginalDocumentName(),
						tempPassengerListModelImpl.getOriginalDocumentYear(),
						tempPassengerListModelImpl.getOriginalRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);

				args = new Object[] {
						tempPassengerListModelImpl.getDocumentName(),
						tempPassengerListModelImpl.getDocumentYear(),
						tempPassengerListModelImpl.getRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
			}

			if ((tempPassengerListModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempPassengerListModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] { tempPassengerListModelImpl.getRequestCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempPassengerListModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerListImpl.class, tempPassengerList.getPrimaryKey(),
			tempPassengerList);

		return tempPassengerList;
	}

	protected TempPassengerList toUnwrappedModel(
		TempPassengerList tempPassengerList) {
		if (tempPassengerList instanceof TempPassengerListImpl) {
			return tempPassengerList;
		}

		TempPassengerListImpl tempPassengerListImpl = new TempPassengerListImpl();

		tempPassengerListImpl.setNew(tempPassengerList.isNew());
		tempPassengerListImpl.setPrimaryKey(tempPassengerList.getPrimaryKey());

		tempPassengerListImpl.setId(tempPassengerList.getId());
		tempPassengerListImpl.setRequestCode(tempPassengerList.getRequestCode());
		tempPassengerListImpl.setRequestState(tempPassengerList.getRequestState());
		tempPassengerListImpl.setDocumentName(tempPassengerList.getDocumentName());
		tempPassengerListImpl.setUserCreated(tempPassengerList.getUserCreated());
		tempPassengerListImpl.setIsArrival(tempPassengerList.getIsArrival());
		tempPassengerListImpl.setNameOfShip(tempPassengerList.getNameOfShip());
		tempPassengerListImpl.setPortOfArrivalCode(tempPassengerList.getPortOfArrivalCode());
		tempPassengerListImpl.setDateOfArrival(tempPassengerList.getDateOfArrival());
		tempPassengerListImpl.setImoNumber(tempPassengerList.getImoNumber());
		tempPassengerListImpl.setCallSign(tempPassengerList.getCallSign());
		tempPassengerListImpl.setVoyageNumber(tempPassengerList.getVoyageNumber());
		tempPassengerListImpl.setFlagStateOfShip(tempPassengerList.getFlagStateOfShip());
		tempPassengerListImpl.setListPassengers(tempPassengerList.getListPassengers());
		tempPassengerListImpl.setSignPlace(tempPassengerList.getSignPlace());
		tempPassengerListImpl.setSignDate(tempPassengerList.getSignDate());
		tempPassengerListImpl.setMasterSigned(tempPassengerList.getMasterSigned());
		tempPassengerListImpl.setMasterSignedImage(tempPassengerList.getMasterSignedImage());
		tempPassengerListImpl.setAttachedFile(tempPassengerList.getAttachedFile());
		tempPassengerListImpl.setDocumentYear(tempPassengerList.getDocumentYear());

		return tempPassengerListImpl;
	}

	/**
	 * Returns the temp passenger list with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp passenger list
	 * @return the temp passenger list
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerListException if a temp passenger list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerList findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTempPassengerListException, SystemException {
		TempPassengerList tempPassengerList = fetchByPrimaryKey(primaryKey);

		if (tempPassengerList == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTempPassengerListException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tempPassengerList;
	}

	/**
	 * Returns the temp passenger list with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerListException} if it could not be found.
	 *
	 * @param id the primary key of the temp passenger list
	 * @return the temp passenger list
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerListException if a temp passenger list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerList findByPrimaryKey(long id)
		throws NoSuchTempPassengerListException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the temp passenger list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp passenger list
	 * @return the temp passenger list, or <code>null</code> if a temp passenger list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerList fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TempPassengerList tempPassengerList = (TempPassengerList)EntityCacheUtil.getResult(TempPassengerListModelImpl.ENTITY_CACHE_ENABLED,
				TempPassengerListImpl.class, primaryKey);

		if (tempPassengerList == _nullTempPassengerList) {
			return null;
		}

		if (tempPassengerList == null) {
			Session session = null;

			try {
				session = openSession();

				tempPassengerList = (TempPassengerList)session.get(TempPassengerListImpl.class,
						primaryKey);

				if (tempPassengerList != null) {
					cacheResult(tempPassengerList);
				}
				else {
					EntityCacheUtil.putResult(TempPassengerListModelImpl.ENTITY_CACHE_ENABLED,
						TempPassengerListImpl.class, primaryKey,
						_nullTempPassengerList);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TempPassengerListModelImpl.ENTITY_CACHE_ENABLED,
					TempPassengerListImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tempPassengerList;
	}

	/**
	 * Returns the temp passenger list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp passenger list
	 * @return the temp passenger list, or <code>null</code> if a temp passenger list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerList fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the temp passenger lists.
	 *
	 * @return the temp passenger lists
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPassengerList> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp passenger lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp passenger lists
	 * @param end the upper bound of the range of temp passenger lists (not inclusive)
	 * @return the range of temp passenger lists
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPassengerList> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp passenger lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp passenger lists
	 * @param end the upper bound of the range of temp passenger lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp passenger lists
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPassengerList> findAll(int start, int end,
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

		List<TempPassengerList> list = (List<TempPassengerList>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPPASSENGERLIST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPPASSENGERLIST;

				if (pagination) {
					sql = sql.concat(TempPassengerListModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TempPassengerList>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempPassengerList>(list);
				}
				else {
					list = (List<TempPassengerList>)QueryUtil.list(q,
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
	 * Removes all the temp passenger lists from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TempPassengerList tempPassengerList : findAll()) {
			remove(tempPassengerList);
		}
	}

	/**
	 * Returns the number of temp passenger lists.
	 *
	 * @return the number of temp passenger lists
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

				Query q = session.createQuery(_SQL_COUNT_TEMPPASSENGERLIST);

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
	 * Initializes the temp passenger list persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.TempPassengerList")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempPassengerList>> listenersList = new ArrayList<ModelListener<TempPassengerList>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempPassengerList>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempPassengerListImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TEMPPASSENGERLIST = "SELECT tempPassengerList FROM TempPassengerList tempPassengerList";
	private static final String _SQL_SELECT_TEMPPASSENGERLIST_WHERE = "SELECT tempPassengerList FROM TempPassengerList tempPassengerList WHERE ";
	private static final String _SQL_COUNT_TEMPPASSENGERLIST = "SELECT COUNT(tempPassengerList) FROM TempPassengerList tempPassengerList";
	private static final String _SQL_COUNT_TEMPPASSENGERLIST_WHERE = "SELECT COUNT(tempPassengerList) FROM TempPassengerList tempPassengerList WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempPassengerList.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempPassengerList exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempPassengerList exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempPassengerListPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "requestState", "documentName",
				"userCreated", "nameOfShip", "portOfArrivalCode",
				"dateOfArrival", "imoNumber", "callSign", "voyageNumber",
				"flagStateOfShip", "listPassengers", "signPlace", "signDate",
				"masterSigned", "masterSignedImage", "attachedFile",
				"documentYear"
			});
	private static TempPassengerList _nullTempPassengerList = new TempPassengerListImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempPassengerList> toCacheModel() {
				return _nullTempPassengerListCacheModel;
			}
		};

	private static CacheModel<TempPassengerList> _nullTempPassengerListCacheModel =
		new CacheModel<TempPassengerList>() {
			@Override
			public TempPassengerList toEntityModel() {
				return _nullTempPassengerList;
			}
		};
}