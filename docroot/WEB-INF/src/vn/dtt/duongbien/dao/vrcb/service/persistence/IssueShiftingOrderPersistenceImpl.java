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

import vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException;
import vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder;
import vn.dtt.duongbien.dao.vrcb.model.impl.IssueShiftingOrderImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.IssueShiftingOrderModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the issue shifting order service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see IssueShiftingOrderPersistence
 * @see IssueShiftingOrderUtil
 * @generated
 */
public class IssueShiftingOrderPersistenceImpl extends BasePersistenceImpl<IssueShiftingOrder>
	implements IssueShiftingOrderPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link IssueShiftingOrderUtil} to access the issue shifting order persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = IssueShiftingOrderImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(IssueShiftingOrderModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderModelImpl.FINDER_CACHE_ENABLED,
			IssueShiftingOrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(IssueShiftingOrderModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderModelImpl.FINDER_CACHE_ENABLED,
			IssueShiftingOrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(IssueShiftingOrderModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEAR =
		new FinderPath(IssueShiftingOrderModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderModelImpl.FINDER_CACHE_ENABLED,
			IssueShiftingOrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByfindIssueShiftingOrderByDocumentYearAndDocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEAR =
		new FinderPath(IssueShiftingOrderModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderModelImpl.FINDER_CACHE_ENABLED,
			IssueShiftingOrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByfindIssueShiftingOrderByDocumentYearAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			IssueShiftingOrderModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			IssueShiftingOrderModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEAR =
		new FinderPath(IssueShiftingOrderModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByfindIssueShiftingOrderByDocumentYearAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the issue shifting orders where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching issue shifting orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueShiftingOrder> findByfindIssueShiftingOrderByDocumentYearAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findByfindIssueShiftingOrderByDocumentYearAndDocumentYear(documentName,
			documentYear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue shifting orders where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueShiftingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of issue shifting orders
	 * @param end the upper bound of the range of issue shifting orders (not inclusive)
	 * @return the range of matching issue shifting orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueShiftingOrder> findByfindIssueShiftingOrderByDocumentYearAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findByfindIssueShiftingOrderByDocumentYearAndDocumentYear(documentName,
			documentYear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue shifting orders where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueShiftingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of issue shifting orders
	 * @param end the upper bound of the range of issue shifting orders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue shifting orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueShiftingOrder> findByfindIssueShiftingOrderByDocumentYearAndDocumentYear(
		long documentName, int documentYear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEAR;
			finderArgs = new Object[] { documentName, documentYear };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEAR;
			finderArgs = new Object[] {
					documentName, documentYear,
					
					start, end, orderByComparator
				};
		}

		List<IssueShiftingOrder> list = (List<IssueShiftingOrder>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (IssueShiftingOrder issueShiftingOrder : list) {
				if ((documentName != issueShiftingOrder.getDocumentName()) ||
						(documentYear != issueShiftingOrder.getDocumentYear())) {
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

			query.append(_SQL_SELECT_ISSUESHIFTINGORDER_WHERE);

			query.append(_FINDER_COLUMN_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(IssueShiftingOrderModelImpl.ORDER_BY_JPQL);
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
					list = (List<IssueShiftingOrder>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<IssueShiftingOrder>(list);
				}
				else {
					list = (List<IssueShiftingOrder>)QueryUtil.list(q,
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
	 * Returns the first issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue shifting order
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a matching issue shifting order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrder findByfindIssueShiftingOrderByDocumentYearAndDocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchIssueShiftingOrderException, SystemException {
		IssueShiftingOrder issueShiftingOrder = fetchByfindIssueShiftingOrderByDocumentYearAndDocumentYear_First(documentName,
				documentYear, orderByComparator);

		if (issueShiftingOrder != null) {
			return issueShiftingOrder;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssueShiftingOrderException(msg.toString());
	}

	/**
	 * Returns the first issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue shifting order, or <code>null</code> if a matching issue shifting order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrder fetchByfindIssueShiftingOrderByDocumentYearAndDocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		List<IssueShiftingOrder> list = findByfindIssueShiftingOrderByDocumentYearAndDocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue shifting order
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a matching issue shifting order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrder findByfindIssueShiftingOrderByDocumentYearAndDocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchIssueShiftingOrderException, SystemException {
		IssueShiftingOrder issueShiftingOrder = fetchByfindIssueShiftingOrderByDocumentYearAndDocumentYear_Last(documentName,
				documentYear, orderByComparator);

		if (issueShiftingOrder != null) {
			return issueShiftingOrder;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssueShiftingOrderException(msg.toString());
	}

	/**
	 * Returns the last issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue shifting order, or <code>null</code> if a matching issue shifting order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrder fetchByfindIssueShiftingOrderByDocumentYearAndDocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByfindIssueShiftingOrderByDocumentYearAndDocumentYear(documentName,
				documentYear);

		if (count == 0) {
			return null;
		}

		List<IssueShiftingOrder> list = findByfindIssueShiftingOrderByDocumentYearAndDocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the issue shifting orders before and after the current issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param id the primary key of the current issue shifting order
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue shifting order
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a issue shifting order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrder[] findByfindIssueShiftingOrderByDocumentYearAndDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchIssueShiftingOrderException, SystemException {
		IssueShiftingOrder issueShiftingOrder = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssueShiftingOrder[] array = new IssueShiftingOrderImpl[3];

			array[0] = getByfindIssueShiftingOrderByDocumentYearAndDocumentYear_PrevAndNext(session,
					issueShiftingOrder, documentName, documentYear,
					orderByComparator, true);

			array[1] = issueShiftingOrder;

			array[2] = getByfindIssueShiftingOrderByDocumentYearAndDocumentYear_PrevAndNext(session,
					issueShiftingOrder, documentName, documentYear,
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

	protected IssueShiftingOrder getByfindIssueShiftingOrderByDocumentYearAndDocumentYear_PrevAndNext(
		Session session, IssueShiftingOrder issueShiftingOrder,
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

		query.append(_SQL_SELECT_ISSUESHIFTINGORDER_WHERE);

		query.append(_FINDER_COLUMN_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTYEAR_2);

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
			query.append(IssueShiftingOrderModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(issueShiftingOrder);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssueShiftingOrder> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the issue shifting orders where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByfindIssueShiftingOrderByDocumentYearAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		for (IssueShiftingOrder issueShiftingOrder : findByfindIssueShiftingOrderByDocumentYearAndDocumentYear(
				documentName, documentYear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(issueShiftingOrder);
		}
	}

	/**
	 * Returns the number of issue shifting orders where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching issue shifting orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByfindIssueShiftingOrderByDocumentYearAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEAR;

		Object[] finderArgs = new Object[] { documentName, documentYear };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ISSUESHIFTINGORDER_WHERE);

			query.append(_FINDER_COLUMN_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTYEAR_2);

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

	private static final String _FINDER_COLUMN_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTNAME_2 =
		"issueShiftingOrder.documentName = ? AND ";
	private static final String _FINDER_COLUMN_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"issueShiftingOrder.documentYear = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE =
		new FinderPath(IssueShiftingOrderModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderModelImpl.FINDER_CACHE_ENABLED,
			IssueShiftingOrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE =
		new FinderPath(IssueShiftingOrderModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderModelImpl.FINDER_CACHE_ENABLED,
			IssueShiftingOrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			IssueShiftingOrderModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			IssueShiftingOrderModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			IssueShiftingOrderModelImpl.REQUESTSTATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE =
		new FinderPath(IssueShiftingOrderModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the issue shifting orders where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the matching issue shifting orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueShiftingOrder> findByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		return findByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the issue shifting orders where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueShiftingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of issue shifting orders
	 * @param end the upper bound of the range of issue shifting orders (not inclusive)
	 * @return the range of matching issue shifting orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueShiftingOrder> findByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end) throws SystemException {
		return findByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState, start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue shifting orders where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueShiftingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of issue shifting orders
	 * @param end the upper bound of the range of issue shifting orders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue shifting orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueShiftingOrder> findByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE;
			finderArgs = new Object[] { documentName, documentYear, requestState };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE;
			finderArgs = new Object[] {
					documentName, documentYear, requestState,
					
					start, end, orderByComparator
				};
		}

		List<IssueShiftingOrder> list = (List<IssueShiftingOrder>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (IssueShiftingOrder issueShiftingOrder : list) {
				if ((documentName != issueShiftingOrder.getDocumentName()) ||
						(documentYear != issueShiftingOrder.getDocumentYear()) ||
						(requestState != issueShiftingOrder.getRequestState())) {
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

			query.append(_SQL_SELECT_ISSUESHIFTINGORDER_WHERE);

			query.append(_FINDER_COLUMN_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_REQUESTSTATE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(IssueShiftingOrderModelImpl.ORDER_BY_JPQL);
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
					list = (List<IssueShiftingOrder>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<IssueShiftingOrder>(list);
				}
				else {
					list = (List<IssueShiftingOrder>)QueryUtil.list(q,
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
	 * Returns the first issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue shifting order
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a matching issue shifting order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrder findByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchIssueShiftingOrderException, SystemException {
		IssueShiftingOrder issueShiftingOrder = fetchByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState_First(documentName,
				documentYear, requestState, orderByComparator);

		if (issueShiftingOrder != null) {
			return issueShiftingOrder;
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

		throw new NoSuchIssueShiftingOrderException(msg.toString());
	}

	/**
	 * Returns the first issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue shifting order, or <code>null</code> if a matching issue shifting order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrder fetchByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		List<IssueShiftingOrder> list = findByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState(documentName,
				documentYear, requestState, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue shifting order
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a matching issue shifting order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrder findByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchIssueShiftingOrderException, SystemException {
		IssueShiftingOrder issueShiftingOrder = fetchByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState_Last(documentName,
				documentYear, requestState, orderByComparator);

		if (issueShiftingOrder != null) {
			return issueShiftingOrder;
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

		throw new NoSuchIssueShiftingOrderException(msg.toString());
	}

	/**
	 * Returns the last issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue shifting order, or <code>null</code> if a matching issue shifting order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrder fetchByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState(documentName,
				documentYear, requestState);

		if (count == 0) {
			return null;
		}

		List<IssueShiftingOrder> list = findByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState(documentName,
				documentYear, requestState, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the issue shifting orders before and after the current issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param id the primary key of the current issue shifting order
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue shifting order
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a issue shifting order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrder[] findByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState_PrevAndNext(
		long id, long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchIssueShiftingOrderException, SystemException {
		IssueShiftingOrder issueShiftingOrder = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssueShiftingOrder[] array = new IssueShiftingOrderImpl[3];

			array[0] = getByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState_PrevAndNext(session,
					issueShiftingOrder, documentName, documentYear,
					requestState, orderByComparator, true);

			array[1] = issueShiftingOrder;

			array[2] = getByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState_PrevAndNext(session,
					issueShiftingOrder, documentName, documentYear,
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

	protected IssueShiftingOrder getByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState_PrevAndNext(
		Session session, IssueShiftingOrder issueShiftingOrder,
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

		query.append(_SQL_SELECT_ISSUESHIFTINGORDER_WHERE);

		query.append(_FINDER_COLUMN_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTYEAR_2);

		query.append(_FINDER_COLUMN_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_REQUESTSTATE_2);

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
			query.append(IssueShiftingOrderModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(issueShiftingOrder);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssueShiftingOrder> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the issue shifting orders where documentName = &#63; and documentYear = &#63; and requestState = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		for (IssueShiftingOrder issueShiftingOrder : findByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState(
				documentName, documentYear, requestState, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(issueShiftingOrder);
		}
	}

	/**
	 * Returns the number of issue shifting orders where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the number of matching issue shifting orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE;

		Object[] finderArgs = new Object[] {
				documentName, documentYear, requestState
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ISSUESHIFTINGORDER_WHERE);

			query.append(_FINDER_COLUMN_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_REQUESTSTATE_2);

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

	private static final String _FINDER_COLUMN_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTNAME_2 =
		"issueShiftingOrder.documentName = ? AND ";
	private static final String _FINDER_COLUMN_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTYEAR_2 =
		"issueShiftingOrder.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_REQUESTSTATE_2 =
		"issueShiftingOrder.requestState = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(IssueShiftingOrderModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderModelImpl.FINDER_CACHE_ENABLED,
			IssueShiftingOrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(IssueShiftingOrderModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderModelImpl.FINDER_CACHE_ENABLED,
			IssueShiftingOrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			IssueShiftingOrderModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(IssueShiftingOrderModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the issue shifting orders where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching issue shifting orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueShiftingOrder> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue shifting orders where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueShiftingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of issue shifting orders
	 * @param end the upper bound of the range of issue shifting orders (not inclusive)
	 * @return the range of matching issue shifting orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueShiftingOrder> findByRequestCode(String requestCode,
		int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue shifting orders where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueShiftingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of issue shifting orders
	 * @param end the upper bound of the range of issue shifting orders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue shifting orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueShiftingOrder> findByRequestCode(String requestCode,
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

		List<IssueShiftingOrder> list = (List<IssueShiftingOrder>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (IssueShiftingOrder issueShiftingOrder : list) {
				if (!Validator.equals(requestCode,
							issueShiftingOrder.getRequestCode())) {
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

			query.append(_SQL_SELECT_ISSUESHIFTINGORDER_WHERE);

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
				query.append(IssueShiftingOrderModelImpl.ORDER_BY_JPQL);
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
					list = (List<IssueShiftingOrder>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<IssueShiftingOrder>(list);
				}
				else {
					list = (List<IssueShiftingOrder>)QueryUtil.list(q,
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
	 * Returns the first issue shifting order in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue shifting order
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a matching issue shifting order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrder findByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchIssueShiftingOrderException, SystemException {
		IssueShiftingOrder issueShiftingOrder = fetchByRequestCode_First(requestCode,
				orderByComparator);

		if (issueShiftingOrder != null) {
			return issueShiftingOrder;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssueShiftingOrderException(msg.toString());
	}

	/**
	 * Returns the first issue shifting order in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue shifting order, or <code>null</code> if a matching issue shifting order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrder fetchByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<IssueShiftingOrder> list = findByRequestCode(requestCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last issue shifting order in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue shifting order
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a matching issue shifting order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrder findByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchIssueShiftingOrderException, SystemException {
		IssueShiftingOrder issueShiftingOrder = fetchByRequestCode_Last(requestCode,
				orderByComparator);

		if (issueShiftingOrder != null) {
			return issueShiftingOrder;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssueShiftingOrderException(msg.toString());
	}

	/**
	 * Returns the last issue shifting order in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue shifting order, or <code>null</code> if a matching issue shifting order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrder fetchByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByRequestCode(requestCode);

		if (count == 0) {
			return null;
		}

		List<IssueShiftingOrder> list = findByRequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the issue shifting orders before and after the current issue shifting order in the ordered set where requestCode = &#63;.
	 *
	 * @param id the primary key of the current issue shifting order
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue shifting order
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a issue shifting order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrder[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchIssueShiftingOrderException, SystemException {
		IssueShiftingOrder issueShiftingOrder = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssueShiftingOrder[] array = new IssueShiftingOrderImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session,
					issueShiftingOrder, requestCode, orderByComparator, true);

			array[1] = issueShiftingOrder;

			array[2] = getByRequestCode_PrevAndNext(session,
					issueShiftingOrder, requestCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected IssueShiftingOrder getByRequestCode_PrevAndNext(Session session,
		IssueShiftingOrder issueShiftingOrder, String requestCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ISSUESHIFTINGORDER_WHERE);

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
			query.append(IssueShiftingOrderModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(issueShiftingOrder);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssueShiftingOrder> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the issue shifting orders where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (IssueShiftingOrder issueShiftingOrder : findByRequestCode(
				requestCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(issueShiftingOrder);
		}
	}

	/**
	 * Returns the number of issue shifting orders where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching issue shifting orders
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

			query.append(_SQL_COUNT_ISSUESHIFTINGORDER_WHERE);

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

	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "issueShiftingOrder.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "issueShiftingOrder.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(issueShiftingOrder.requestCode IS NULL OR issueShiftingOrder.requestCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO =
		new FinderPath(IssueShiftingOrderModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderModelImpl.FINDER_CACHE_ENABLED,
			IssueShiftingOrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDocumentNameAndDocumentYearAndVersionNo",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO =
		new FinderPath(IssueShiftingOrderModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderModelImpl.FINDER_CACHE_ENABLED,
			IssueShiftingOrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDocumentNameAndDocumentYearAndVersionNo",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			},
			IssueShiftingOrderModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			IssueShiftingOrderModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			IssueShiftingOrderModelImpl.VERSIONNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO =
		new FinderPath(IssueShiftingOrderModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocumentNameAndDocumentYearAndVersionNo",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the issue shifting orders where documentName = &#63; and documentYear = &#63; and versionNo = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param versionNo the version no
	 * @return the matching issue shifting orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueShiftingOrder> findByDocumentNameAndDocumentYearAndVersionNo(
		long documentName, int documentYear, String versionNo)
		throws SystemException {
		return findByDocumentNameAndDocumentYearAndVersionNo(documentName,
			documentYear, versionNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue shifting orders where documentName = &#63; and documentYear = &#63; and versionNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueShiftingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param versionNo the version no
	 * @param start the lower bound of the range of issue shifting orders
	 * @param end the upper bound of the range of issue shifting orders (not inclusive)
	 * @return the range of matching issue shifting orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueShiftingOrder> findByDocumentNameAndDocumentYearAndVersionNo(
		long documentName, int documentYear, String versionNo, int start,
		int end) throws SystemException {
		return findByDocumentNameAndDocumentYearAndVersionNo(documentName,
			documentYear, versionNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue shifting orders where documentName = &#63; and documentYear = &#63; and versionNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueShiftingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param versionNo the version no
	 * @param start the lower bound of the range of issue shifting orders
	 * @param end the upper bound of the range of issue shifting orders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue shifting orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueShiftingOrder> findByDocumentNameAndDocumentYearAndVersionNo(
		long documentName, int documentYear, String versionNo, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO;
			finderArgs = new Object[] { documentName, documentYear, versionNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO;
			finderArgs = new Object[] {
					documentName, documentYear, versionNo,
					
					start, end, orderByComparator
				};
		}

		List<IssueShiftingOrder> list = (List<IssueShiftingOrder>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (IssueShiftingOrder issueShiftingOrder : list) {
				if ((documentName != issueShiftingOrder.getDocumentName()) ||
						(documentYear != issueShiftingOrder.getDocumentYear()) ||
						!Validator.equals(versionNo,
							issueShiftingOrder.getVersionNo())) {
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

			query.append(_SQL_SELECT_ISSUESHIFTINGORDER_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_DOCUMENTYEAR_2);

			boolean bindVersionNo = false;

			if (versionNo == null) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_VERSIONNO_1);
			}
			else if (versionNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_VERSIONNO_3);
			}
			else {
				bindVersionNo = true;

				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_VERSIONNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(IssueShiftingOrderModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				if (bindVersionNo) {
					qPos.add(versionNo);
				}

				if (!pagination) {
					list = (List<IssueShiftingOrder>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<IssueShiftingOrder>(list);
				}
				else {
					list = (List<IssueShiftingOrder>)QueryUtil.list(q,
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
	 * Returns the first issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63; and versionNo = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param versionNo the version no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue shifting order
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a matching issue shifting order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrder findByDocumentNameAndDocumentYearAndVersionNo_First(
		long documentName, int documentYear, String versionNo,
		OrderByComparator orderByComparator)
		throws NoSuchIssueShiftingOrderException, SystemException {
		IssueShiftingOrder issueShiftingOrder = fetchByDocumentNameAndDocumentYearAndVersionNo_First(documentName,
				documentYear, versionNo, orderByComparator);

		if (issueShiftingOrder != null) {
			return issueShiftingOrder;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(", versionNo=");
		msg.append(versionNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssueShiftingOrderException(msg.toString());
	}

	/**
	 * Returns the first issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63; and versionNo = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param versionNo the version no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue shifting order, or <code>null</code> if a matching issue shifting order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrder fetchByDocumentNameAndDocumentYearAndVersionNo_First(
		long documentName, int documentYear, String versionNo,
		OrderByComparator orderByComparator) throws SystemException {
		List<IssueShiftingOrder> list = findByDocumentNameAndDocumentYearAndVersionNo(documentName,
				documentYear, versionNo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63; and versionNo = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param versionNo the version no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue shifting order
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a matching issue shifting order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrder findByDocumentNameAndDocumentYearAndVersionNo_Last(
		long documentName, int documentYear, String versionNo,
		OrderByComparator orderByComparator)
		throws NoSuchIssueShiftingOrderException, SystemException {
		IssueShiftingOrder issueShiftingOrder = fetchByDocumentNameAndDocumentYearAndVersionNo_Last(documentName,
				documentYear, versionNo, orderByComparator);

		if (issueShiftingOrder != null) {
			return issueShiftingOrder;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(", versionNo=");
		msg.append(versionNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssueShiftingOrderException(msg.toString());
	}

	/**
	 * Returns the last issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63; and versionNo = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param versionNo the version no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue shifting order, or <code>null</code> if a matching issue shifting order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrder fetchByDocumentNameAndDocumentYearAndVersionNo_Last(
		long documentName, int documentYear, String versionNo,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDocumentNameAndDocumentYearAndVersionNo(documentName,
				documentYear, versionNo);

		if (count == 0) {
			return null;
		}

		List<IssueShiftingOrder> list = findByDocumentNameAndDocumentYearAndVersionNo(documentName,
				documentYear, versionNo, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the issue shifting orders before and after the current issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63; and versionNo = &#63;.
	 *
	 * @param id the primary key of the current issue shifting order
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param versionNo the version no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue shifting order
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a issue shifting order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrder[] findByDocumentNameAndDocumentYearAndVersionNo_PrevAndNext(
		long id, long documentName, int documentYear, String versionNo,
		OrderByComparator orderByComparator)
		throws NoSuchIssueShiftingOrderException, SystemException {
		IssueShiftingOrder issueShiftingOrder = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssueShiftingOrder[] array = new IssueShiftingOrderImpl[3];

			array[0] = getByDocumentNameAndDocumentYearAndVersionNo_PrevAndNext(session,
					issueShiftingOrder, documentName, documentYear, versionNo,
					orderByComparator, true);

			array[1] = issueShiftingOrder;

			array[2] = getByDocumentNameAndDocumentYearAndVersionNo_PrevAndNext(session,
					issueShiftingOrder, documentName, documentYear, versionNo,
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

	protected IssueShiftingOrder getByDocumentNameAndDocumentYearAndVersionNo_PrevAndNext(
		Session session, IssueShiftingOrder issueShiftingOrder,
		long documentName, int documentYear, String versionNo,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ISSUESHIFTINGORDER_WHERE);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_DOCUMENTYEAR_2);

		boolean bindVersionNo = false;

		if (versionNo == null) {
			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_VERSIONNO_1);
		}
		else if (versionNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_VERSIONNO_3);
		}
		else {
			bindVersionNo = true;

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_VERSIONNO_2);
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
			query.append(IssueShiftingOrderModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (bindVersionNo) {
			qPos.add(versionNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(issueShiftingOrder);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssueShiftingOrder> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the issue shifting orders where documentName = &#63; and documentYear = &#63; and versionNo = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param versionNo the version no
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDocumentNameAndDocumentYearAndVersionNo(
		long documentName, int documentYear, String versionNo)
		throws SystemException {
		for (IssueShiftingOrder issueShiftingOrder : findByDocumentNameAndDocumentYearAndVersionNo(
				documentName, documentYear, versionNo, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(issueShiftingOrder);
		}
	}

	/**
	 * Returns the number of issue shifting orders where documentName = &#63; and documentYear = &#63; and versionNo = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param versionNo the version no
	 * @return the number of matching issue shifting orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDocumentNameAndDocumentYearAndVersionNo(
		long documentName, int documentYear, String versionNo)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO;

		Object[] finderArgs = new Object[] { documentName, documentYear, versionNo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ISSUESHIFTINGORDER_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_DOCUMENTYEAR_2);

			boolean bindVersionNo = false;

			if (versionNo == null) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_VERSIONNO_1);
			}
			else if (versionNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_VERSIONNO_3);
			}
			else {
				bindVersionNo = true;

				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_VERSIONNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				if (bindVersionNo) {
					qPos.add(versionNo);
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

	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_DOCUMENTNAME_2 =
		"issueShiftingOrder.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_DOCUMENTYEAR_2 =
		"issueShiftingOrder.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_VERSIONNO_1 =
		"issueShiftingOrder.versionNo IS NULL";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_VERSIONNO_2 =
		"issueShiftingOrder.versionNo = ?";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO_VERSIONNO_3 =
		"(issueShiftingOrder.versionNo IS NULL OR issueShiftingOrder.versionNo = '')";

	public IssueShiftingOrderPersistenceImpl() {
		setModelClass(IssueShiftingOrder.class);
	}

	/**
	 * Caches the issue shifting order in the entity cache if it is enabled.
	 *
	 * @param issueShiftingOrder the issue shifting order
	 */
	@Override
	public void cacheResult(IssueShiftingOrder issueShiftingOrder) {
		EntityCacheUtil.putResult(IssueShiftingOrderModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderImpl.class, issueShiftingOrder.getPrimaryKey(),
			issueShiftingOrder);

		issueShiftingOrder.resetOriginalValues();
	}

	/**
	 * Caches the issue shifting orders in the entity cache if it is enabled.
	 *
	 * @param issueShiftingOrders the issue shifting orders
	 */
	@Override
	public void cacheResult(List<IssueShiftingOrder> issueShiftingOrders) {
		for (IssueShiftingOrder issueShiftingOrder : issueShiftingOrders) {
			if (EntityCacheUtil.getResult(
						IssueShiftingOrderModelImpl.ENTITY_CACHE_ENABLED,
						IssueShiftingOrderImpl.class,
						issueShiftingOrder.getPrimaryKey()) == null) {
				cacheResult(issueShiftingOrder);
			}
			else {
				issueShiftingOrder.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all issue shifting orders.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(IssueShiftingOrderImpl.class.getName());
		}

		EntityCacheUtil.clearCache(IssueShiftingOrderImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the issue shifting order.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(IssueShiftingOrder issueShiftingOrder) {
		EntityCacheUtil.removeResult(IssueShiftingOrderModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderImpl.class, issueShiftingOrder.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<IssueShiftingOrder> issueShiftingOrders) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (IssueShiftingOrder issueShiftingOrder : issueShiftingOrders) {
			EntityCacheUtil.removeResult(IssueShiftingOrderModelImpl.ENTITY_CACHE_ENABLED,
				IssueShiftingOrderImpl.class, issueShiftingOrder.getPrimaryKey());
		}
	}

	/**
	 * Creates a new issue shifting order with the primary key. Does not add the issue shifting order to the database.
	 *
	 * @param id the primary key for the new issue shifting order
	 * @return the new issue shifting order
	 */
	@Override
	public IssueShiftingOrder create(long id) {
		IssueShiftingOrder issueShiftingOrder = new IssueShiftingOrderImpl();

		issueShiftingOrder.setNew(true);
		issueShiftingOrder.setPrimaryKey(id);

		return issueShiftingOrder;
	}

	/**
	 * Removes the issue shifting order with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the issue shifting order
	 * @return the issue shifting order that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a issue shifting order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrder remove(long id)
		throws NoSuchIssueShiftingOrderException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the issue shifting order with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the issue shifting order
	 * @return the issue shifting order that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a issue shifting order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrder remove(Serializable primaryKey)
		throws NoSuchIssueShiftingOrderException, SystemException {
		Session session = null;

		try {
			session = openSession();

			IssueShiftingOrder issueShiftingOrder = (IssueShiftingOrder)session.get(IssueShiftingOrderImpl.class,
					primaryKey);

			if (issueShiftingOrder == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchIssueShiftingOrderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(issueShiftingOrder);
		}
		catch (NoSuchIssueShiftingOrderException nsee) {
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
	protected IssueShiftingOrder removeImpl(
		IssueShiftingOrder issueShiftingOrder) throws SystemException {
		issueShiftingOrder = toUnwrappedModel(issueShiftingOrder);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(issueShiftingOrder)) {
				issueShiftingOrder = (IssueShiftingOrder)session.get(IssueShiftingOrderImpl.class,
						issueShiftingOrder.getPrimaryKeyObj());
			}

			if (issueShiftingOrder != null) {
				session.delete(issueShiftingOrder);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (issueShiftingOrder != null) {
			clearCache(issueShiftingOrder);
		}

		return issueShiftingOrder;
	}

	@Override
	public IssueShiftingOrder updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder issueShiftingOrder)
		throws SystemException {
		issueShiftingOrder = toUnwrappedModel(issueShiftingOrder);

		boolean isNew = issueShiftingOrder.isNew();

		IssueShiftingOrderModelImpl issueShiftingOrderModelImpl = (IssueShiftingOrderModelImpl)issueShiftingOrder;

		Session session = null;

		try {
			session = openSession();

			if (issueShiftingOrder.isNew()) {
				session.save(issueShiftingOrder);

				issueShiftingOrder.setNew(false);
			}
			else {
				session.merge(issueShiftingOrder);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !IssueShiftingOrderModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((issueShiftingOrderModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						issueShiftingOrderModelImpl.getOriginalDocumentName(),
						issueShiftingOrderModelImpl.getOriginalDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						issueShiftingOrderModelImpl.getDocumentName(),
						issueShiftingOrderModelImpl.getDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEAR,
					args);
			}

			if ((issueShiftingOrderModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						issueShiftingOrderModelImpl.getOriginalDocumentName(),
						issueShiftingOrderModelImpl.getOriginalDocumentYear(),
						issueShiftingOrderModelImpl.getOriginalRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
					args);

				args = new Object[] {
						issueShiftingOrderModelImpl.getDocumentName(),
						issueShiftingOrderModelImpl.getDocumentYear(),
						issueShiftingOrderModelImpl.getRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUESHIFTINGORDERBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
					args);
			}

			if ((issueShiftingOrderModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						issueShiftingOrderModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] { issueShiftingOrderModelImpl.getRequestCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}

			if ((issueShiftingOrderModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						issueShiftingOrderModelImpl.getOriginalDocumentName(),
						issueShiftingOrderModelImpl.getOriginalDocumentYear(),
						issueShiftingOrderModelImpl.getOriginalVersionNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO,
					args);

				args = new Object[] {
						issueShiftingOrderModelImpl.getDocumentName(),
						issueShiftingOrderModelImpl.getDocumentYear(),
						issueShiftingOrderModelImpl.getVersionNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDVERSIONNO,
					args);
			}
		}

		EntityCacheUtil.putResult(IssueShiftingOrderModelImpl.ENTITY_CACHE_ENABLED,
			IssueShiftingOrderImpl.class, issueShiftingOrder.getPrimaryKey(),
			issueShiftingOrder);

		return issueShiftingOrder;
	}

	protected IssueShiftingOrder toUnwrappedModel(
		IssueShiftingOrder issueShiftingOrder) {
		if (issueShiftingOrder instanceof IssueShiftingOrderImpl) {
			return issueShiftingOrder;
		}

		IssueShiftingOrderImpl issueShiftingOrderImpl = new IssueShiftingOrderImpl();

		issueShiftingOrderImpl.setNew(issueShiftingOrder.isNew());
		issueShiftingOrderImpl.setPrimaryKey(issueShiftingOrder.getPrimaryKey());

		issueShiftingOrderImpl.setId(issueShiftingOrder.getId());
		issueShiftingOrderImpl.setRequestCode(issueShiftingOrder.getRequestCode());
		issueShiftingOrderImpl.setNumberShiftingOrder(issueShiftingOrder.getNumberShiftingOrder());
		issueShiftingOrderImpl.setDocumentName(issueShiftingOrder.getDocumentName());
		issueShiftingOrderImpl.setDocumentYear(issueShiftingOrder.getDocumentYear());
		issueShiftingOrderImpl.setPortofAuthority(issueShiftingOrder.getPortofAuthority());
		issueShiftingOrderImpl.setNameOfShip(issueShiftingOrder.getNameOfShip());
		issueShiftingOrderImpl.setFlagStateOfShip(issueShiftingOrder.getFlagStateOfShip());
		issueShiftingOrderImpl.setAnchoringPortCode(issueShiftingOrder.getAnchoringPortCode());
		issueShiftingOrderImpl.setAnchoringPortWharfCode(issueShiftingOrder.getAnchoringPortWharfCode());
		issueShiftingOrderImpl.setPortHarbourCode(issueShiftingOrder.getPortHarbourCode());
		issueShiftingOrderImpl.setShiftingPortWharfCode(issueShiftingOrder.getShiftingPortWharfCode());
		issueShiftingOrderImpl.setShiftingDate(issueShiftingOrder.getShiftingDate());
		issueShiftingOrderImpl.setReasonToShift(issueShiftingOrder.getReasonToShift());
		issueShiftingOrderImpl.setIssueDate(issueShiftingOrder.getIssueDate());
		issueShiftingOrderImpl.setDirectorOfMaritime(issueShiftingOrder.getDirectorOfMaritime());
		issueShiftingOrderImpl.setCertificateNo(issueShiftingOrder.getCertificateNo());
		issueShiftingOrderImpl.setRequestState(issueShiftingOrder.getRequestState());
		issueShiftingOrderImpl.setVersionNo(issueShiftingOrder.getVersionNo());
		issueShiftingOrderImpl.setIsApproval(issueShiftingOrder.getIsApproval());
		issueShiftingOrderImpl.setApprovalDate(issueShiftingOrder.getApprovalDate());
		issueShiftingOrderImpl.setApprovalName(issueShiftingOrder.getApprovalName());
		issueShiftingOrderImpl.setRemarks(issueShiftingOrder.getRemarks());
		issueShiftingOrderImpl.setIsCancel(issueShiftingOrder.getIsCancel());
		issueShiftingOrderImpl.setCancelDate(issueShiftingOrder.getCancelDate());
		issueShiftingOrderImpl.setCancelName(issueShiftingOrder.getCancelName());
		issueShiftingOrderImpl.setCancelNote(issueShiftingOrder.getCancelNote());
		issueShiftingOrderImpl.setRepresentative(issueShiftingOrder.getRepresentative());
		issueShiftingOrderImpl.setDigitalAttachedFile(issueShiftingOrder.getDigitalAttachedFile());
		issueShiftingOrderImpl.setSignDate(issueShiftingOrder.getSignDate());
		issueShiftingOrderImpl.setSignName(issueShiftingOrder.getSignName());
		issueShiftingOrderImpl.setSignTitle(issueShiftingOrder.getSignTitle());
		issueShiftingOrderImpl.setSignPlace(issueShiftingOrder.getSignPlace());
		issueShiftingOrderImpl.setStampStatus(issueShiftingOrder.getStampStatus());
		issueShiftingOrderImpl.setAttachedFile(issueShiftingOrder.getAttachedFile());

		return issueShiftingOrderImpl;
	}

	/**
	 * Returns the issue shifting order with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the issue shifting order
	 * @return the issue shifting order
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a issue shifting order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrder findByPrimaryKey(Serializable primaryKey)
		throws NoSuchIssueShiftingOrderException, SystemException {
		IssueShiftingOrder issueShiftingOrder = fetchByPrimaryKey(primaryKey);

		if (issueShiftingOrder == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchIssueShiftingOrderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return issueShiftingOrder;
	}

	/**
	 * Returns the issue shifting order with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException} if it could not be found.
	 *
	 * @param id the primary key of the issue shifting order
	 * @return the issue shifting order
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a issue shifting order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrder findByPrimaryKey(long id)
		throws NoSuchIssueShiftingOrderException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the issue shifting order with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the issue shifting order
	 * @return the issue shifting order, or <code>null</code> if a issue shifting order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrder fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		IssueShiftingOrder issueShiftingOrder = (IssueShiftingOrder)EntityCacheUtil.getResult(IssueShiftingOrderModelImpl.ENTITY_CACHE_ENABLED,
				IssueShiftingOrderImpl.class, primaryKey);

		if (issueShiftingOrder == _nullIssueShiftingOrder) {
			return null;
		}

		if (issueShiftingOrder == null) {
			Session session = null;

			try {
				session = openSession();

				issueShiftingOrder = (IssueShiftingOrder)session.get(IssueShiftingOrderImpl.class,
						primaryKey);

				if (issueShiftingOrder != null) {
					cacheResult(issueShiftingOrder);
				}
				else {
					EntityCacheUtil.putResult(IssueShiftingOrderModelImpl.ENTITY_CACHE_ENABLED,
						IssueShiftingOrderImpl.class, primaryKey,
						_nullIssueShiftingOrder);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(IssueShiftingOrderModelImpl.ENTITY_CACHE_ENABLED,
					IssueShiftingOrderImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return issueShiftingOrder;
	}

	/**
	 * Returns the issue shifting order with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the issue shifting order
	 * @return the issue shifting order, or <code>null</code> if a issue shifting order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueShiftingOrder fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the issue shifting orders.
	 *
	 * @return the issue shifting orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueShiftingOrder> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue shifting orders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueShiftingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of issue shifting orders
	 * @param end the upper bound of the range of issue shifting orders (not inclusive)
	 * @return the range of issue shifting orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueShiftingOrder> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue shifting orders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueShiftingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of issue shifting orders
	 * @param end the upper bound of the range of issue shifting orders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of issue shifting orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueShiftingOrder> findAll(int start, int end,
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

		List<IssueShiftingOrder> list = (List<IssueShiftingOrder>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ISSUESHIFTINGORDER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ISSUESHIFTINGORDER;

				if (pagination) {
					sql = sql.concat(IssueShiftingOrderModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<IssueShiftingOrder>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<IssueShiftingOrder>(list);
				}
				else {
					list = (List<IssueShiftingOrder>)QueryUtil.list(q,
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
	 * Removes all the issue shifting orders from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (IssueShiftingOrder issueShiftingOrder : findAll()) {
			remove(issueShiftingOrder);
		}
	}

	/**
	 * Returns the number of issue shifting orders.
	 *
	 * @return the number of issue shifting orders
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

				Query q = session.createQuery(_SQL_COUNT_ISSUESHIFTINGORDER);

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
	 * Initializes the issue shifting order persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<IssueShiftingOrder>> listenersList = new ArrayList<ModelListener<IssueShiftingOrder>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<IssueShiftingOrder>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(IssueShiftingOrderImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ISSUESHIFTINGORDER = "SELECT issueShiftingOrder FROM IssueShiftingOrder issueShiftingOrder";
	private static final String _SQL_SELECT_ISSUESHIFTINGORDER_WHERE = "SELECT issueShiftingOrder FROM IssueShiftingOrder issueShiftingOrder WHERE ";
	private static final String _SQL_COUNT_ISSUESHIFTINGORDER = "SELECT COUNT(issueShiftingOrder) FROM IssueShiftingOrder issueShiftingOrder";
	private static final String _SQL_COUNT_ISSUESHIFTINGORDER_WHERE = "SELECT COUNT(issueShiftingOrder) FROM IssueShiftingOrder issueShiftingOrder WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "issueShiftingOrder.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No IssueShiftingOrder exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No IssueShiftingOrder exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(IssueShiftingOrderPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "numberShiftingOrder", "documentName",
				"documentYear", "portofAuthority", "nameOfShip",
				"flagStateOfShip", "anchoringPortCode", "anchoringPortWharfCode",
				"portHarbourCode", "shiftingPortWharfCode", "shiftingDate",
				"reasonToShift", "issueDate", "directorOfMaritime",
				"certificateNo", "requestState", "versionNo", "isApproval",
				"approvalDate", "approvalName", "remarks", "isCancel",
				"cancelDate", "cancelName", "cancelNote", "representative",
				"digitalAttachedFile", "signDate", "signName", "signTitle",
				"signPlace", "stampStatus", "attachedFile"
			});
	private static IssueShiftingOrder _nullIssueShiftingOrder = new IssueShiftingOrderImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<IssueShiftingOrder> toCacheModel() {
				return _nullIssueShiftingOrderCacheModel;
			}
		};

	private static CacheModel<IssueShiftingOrder> _nullIssueShiftingOrderCacheModel =
		new CacheModel<IssueShiftingOrder>() {
			@Override
			public IssueShiftingOrder toEntityModel() {
				return _nullIssueShiftingOrder;
			}
		};
}