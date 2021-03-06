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

import vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException;
import vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance;
import vn.dtt.duongbien.dao.vrcb.model.impl.IssuePortClearanceImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.IssuePortClearanceModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the issue port clearance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see IssuePortClearancePersistence
 * @see IssuePortClearanceUtil
 * @generated
 */
public class IssuePortClearancePersistenceImpl extends BasePersistenceImpl<IssuePortClearance>
	implements IssuePortClearancePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link IssuePortClearanceUtil} to access the issue port clearance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = IssuePortClearanceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED,
			IssuePortClearanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED,
			IssuePortClearanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR =
		new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED,
			IssuePortClearanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByfindIssuePortClearanceByDocumentYearAndDocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR =
		new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED,
			IssuePortClearanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByfindIssuePortClearanceByDocumentYearAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			IssuePortClearanceModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			IssuePortClearanceModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR =
		new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByfindIssuePortClearanceByDocumentYearAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the issue port clearances where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssuePortClearance> findByfindIssuePortClearanceByDocumentYearAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findByfindIssuePortClearanceByDocumentYearAndDocumentYear(documentName,
			documentYear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue port clearances where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePortClearanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of issue port clearances
	 * @param end the upper bound of the range of issue port clearances (not inclusive)
	 * @return the range of matching issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssuePortClearance> findByfindIssuePortClearanceByDocumentYearAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findByfindIssuePortClearanceByDocumentYearAndDocumentYear(documentName,
			documentYear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue port clearances where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePortClearanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of issue port clearances
	 * @param end the upper bound of the range of issue port clearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssuePortClearance> findByfindIssuePortClearanceByDocumentYearAndDocumentYear(
		long documentName, int documentYear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR;
			finderArgs = new Object[] { documentName, documentYear };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR;
			finderArgs = new Object[] {
					documentName, documentYear,
					
					start, end, orderByComparator
				};
		}

		List<IssuePortClearance> list = (List<IssuePortClearance>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (IssuePortClearance issuePortClearance : list) {
				if ((documentName != issuePortClearance.getDocumentName()) ||
						(documentYear != issuePortClearance.getDocumentYear())) {
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

			query.append(_SQL_SELECT_ISSUEPORTCLEARANCE_WHERE);

			query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(IssuePortClearanceModelImpl.ORDER_BY_JPQL);
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
					list = (List<IssuePortClearance>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<IssuePortClearance>(list);
				}
				else {
					list = (List<IssuePortClearance>)QueryUtil.list(q,
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
	 * Returns the first issue port clearance in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue port clearance
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException if a matching issue port clearance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePortClearance findByfindIssuePortClearanceByDocumentYearAndDocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchIssuePortClearanceException, SystemException {
		IssuePortClearance issuePortClearance = fetchByfindIssuePortClearanceByDocumentYearAndDocumentYear_First(documentName,
				documentYear, orderByComparator);

		if (issuePortClearance != null) {
			return issuePortClearance;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssuePortClearanceException(msg.toString());
	}

	/**
	 * Returns the first issue port clearance in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue port clearance, or <code>null</code> if a matching issue port clearance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePortClearance fetchByfindIssuePortClearanceByDocumentYearAndDocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		List<IssuePortClearance> list = findByfindIssuePortClearanceByDocumentYearAndDocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last issue port clearance in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue port clearance
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException if a matching issue port clearance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePortClearance findByfindIssuePortClearanceByDocumentYearAndDocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchIssuePortClearanceException, SystemException {
		IssuePortClearance issuePortClearance = fetchByfindIssuePortClearanceByDocumentYearAndDocumentYear_Last(documentName,
				documentYear, orderByComparator);

		if (issuePortClearance != null) {
			return issuePortClearance;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssuePortClearanceException(msg.toString());
	}

	/**
	 * Returns the last issue port clearance in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue port clearance, or <code>null</code> if a matching issue port clearance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePortClearance fetchByfindIssuePortClearanceByDocumentYearAndDocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByfindIssuePortClearanceByDocumentYearAndDocumentYear(documentName,
				documentYear);

		if (count == 0) {
			return null;
		}

		List<IssuePortClearance> list = findByfindIssuePortClearanceByDocumentYearAndDocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the issue port clearances before and after the current issue port clearance in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param id the primary key of the current issue port clearance
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue port clearance
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException if a issue port clearance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePortClearance[] findByfindIssuePortClearanceByDocumentYearAndDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchIssuePortClearanceException, SystemException {
		IssuePortClearance issuePortClearance = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssuePortClearance[] array = new IssuePortClearanceImpl[3];

			array[0] = getByfindIssuePortClearanceByDocumentYearAndDocumentYear_PrevAndNext(session,
					issuePortClearance, documentName, documentYear,
					orderByComparator, true);

			array[1] = issuePortClearance;

			array[2] = getByfindIssuePortClearanceByDocumentYearAndDocumentYear_PrevAndNext(session,
					issuePortClearance, documentName, documentYear,
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

	protected IssuePortClearance getByfindIssuePortClearanceByDocumentYearAndDocumentYear_PrevAndNext(
		Session session, IssuePortClearance issuePortClearance,
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

		query.append(_SQL_SELECT_ISSUEPORTCLEARANCE_WHERE);

		query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTYEAR_2);

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
			query.append(IssuePortClearanceModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(issuePortClearance);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssuePortClearance> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the issue port clearances where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByfindIssuePortClearanceByDocumentYearAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		for (IssuePortClearance issuePortClearance : findByfindIssuePortClearanceByDocumentYearAndDocumentYear(
				documentName, documentYear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(issuePortClearance);
		}
	}

	/**
	 * Returns the number of issue port clearances where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByfindIssuePortClearanceByDocumentYearAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR;

		Object[] finderArgs = new Object[] { documentName, documentYear };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ISSUEPORTCLEARANCE_WHERE);

			query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTYEAR_2);

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

	private static final String _FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTNAME_2 =
		"issuePortClearance.documentName = ? AND ";
	private static final String _FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"issuePortClearance.documentYear = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE =
		new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED,
			IssuePortClearanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE =
		new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED,
			IssuePortClearanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			IssuePortClearanceModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			IssuePortClearanceModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			IssuePortClearanceModelImpl.REQUESTSTATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE =
		new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the issue port clearances where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the matching issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssuePortClearance> findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		return findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the issue port clearances where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePortClearanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of issue port clearances
	 * @param end the upper bound of the range of issue port clearances (not inclusive)
	 * @return the range of matching issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssuePortClearance> findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end) throws SystemException {
		return findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState, start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue port clearances where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePortClearanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of issue port clearances
	 * @param end the upper bound of the range of issue port clearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssuePortClearance> findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE;
			finderArgs = new Object[] { documentName, documentYear, requestState };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE;
			finderArgs = new Object[] {
					documentName, documentYear, requestState,
					
					start, end, orderByComparator
				};
		}

		List<IssuePortClearance> list = (List<IssuePortClearance>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (IssuePortClearance issuePortClearance : list) {
				if ((documentName != issuePortClearance.getDocumentName()) ||
						(documentYear != issuePortClearance.getDocumentYear()) ||
						(requestState != issuePortClearance.getRequestState())) {
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

			query.append(_SQL_SELECT_ISSUEPORTCLEARANCE_WHERE);

			query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_REQUESTSTATE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(IssuePortClearanceModelImpl.ORDER_BY_JPQL);
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
					list = (List<IssuePortClearance>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<IssuePortClearance>(list);
				}
				else {
					list = (List<IssuePortClearance>)QueryUtil.list(q,
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
	 * Returns the first issue port clearance in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue port clearance
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException if a matching issue port clearance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePortClearance findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchIssuePortClearanceException, SystemException {
		IssuePortClearance issuePortClearance = fetchByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_First(documentName,
				documentYear, requestState, orderByComparator);

		if (issuePortClearance != null) {
			return issuePortClearance;
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

		throw new NoSuchIssuePortClearanceException(msg.toString());
	}

	/**
	 * Returns the first issue port clearance in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue port clearance, or <code>null</code> if a matching issue port clearance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePortClearance fetchByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		List<IssuePortClearance> list = findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(documentName,
				documentYear, requestState, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last issue port clearance in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue port clearance
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException if a matching issue port clearance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePortClearance findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchIssuePortClearanceException, SystemException {
		IssuePortClearance issuePortClearance = fetchByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_Last(documentName,
				documentYear, requestState, orderByComparator);

		if (issuePortClearance != null) {
			return issuePortClearance;
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

		throw new NoSuchIssuePortClearanceException(msg.toString());
	}

	/**
	 * Returns the last issue port clearance in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue port clearance, or <code>null</code> if a matching issue port clearance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePortClearance fetchByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(documentName,
				documentYear, requestState);

		if (count == 0) {
			return null;
		}

		List<IssuePortClearance> list = findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(documentName,
				documentYear, requestState, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the issue port clearances before and after the current issue port clearance in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param id the primary key of the current issue port clearance
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue port clearance
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException if a issue port clearance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePortClearance[] findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_PrevAndNext(
		long id, long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchIssuePortClearanceException, SystemException {
		IssuePortClearance issuePortClearance = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssuePortClearance[] array = new IssuePortClearanceImpl[3];

			array[0] = getByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_PrevAndNext(session,
					issuePortClearance, documentName, documentYear,
					requestState, orderByComparator, true);

			array[1] = issuePortClearance;

			array[2] = getByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_PrevAndNext(session,
					issuePortClearance, documentName, documentYear,
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

	protected IssuePortClearance getByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_PrevAndNext(
		Session session, IssuePortClearance issuePortClearance,
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

		query.append(_SQL_SELECT_ISSUEPORTCLEARANCE_WHERE);

		query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTYEAR_2);

		query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_REQUESTSTATE_2);

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
			query.append(IssuePortClearanceModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(issuePortClearance);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssuePortClearance> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the issue port clearances where documentName = &#63; and documentYear = &#63; and requestState = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		for (IssuePortClearance issuePortClearance : findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
				documentName, documentYear, requestState, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(issuePortClearance);
		}
	}

	/**
	 * Returns the number of issue port clearances where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the number of matching issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE;

		Object[] finderArgs = new Object[] {
				documentName, documentYear, requestState
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ISSUEPORTCLEARANCE_WHERE);

			query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_REQUESTSTATE_2);

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

	private static final String _FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTNAME_2 =
		"issuePortClearance.documentName = ? AND ";
	private static final String _FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_DOCUMENTYEAR_2 =
		"issuePortClearance.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE_REQUESTSTATE_2 =
		"issuePortClearance.requestState = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED,
			IssuePortClearanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED,
			IssuePortClearanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			IssuePortClearanceModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the issue port clearances where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssuePortClearance> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue port clearances where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePortClearanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of issue port clearances
	 * @param end the upper bound of the range of issue port clearances (not inclusive)
	 * @return the range of matching issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssuePortClearance> findByRequestCode(String requestCode,
		int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue port clearances where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePortClearanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of issue port clearances
	 * @param end the upper bound of the range of issue port clearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssuePortClearance> findByRequestCode(String requestCode,
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

		List<IssuePortClearance> list = (List<IssuePortClearance>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (IssuePortClearance issuePortClearance : list) {
				if (!Validator.equals(requestCode,
							issuePortClearance.getRequestCode())) {
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

			query.append(_SQL_SELECT_ISSUEPORTCLEARANCE_WHERE);

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
				query.append(IssuePortClearanceModelImpl.ORDER_BY_JPQL);
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
					list = (List<IssuePortClearance>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<IssuePortClearance>(list);
				}
				else {
					list = (List<IssuePortClearance>)QueryUtil.list(q,
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
	 * Returns the first issue port clearance in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue port clearance
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException if a matching issue port clearance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePortClearance findByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchIssuePortClearanceException, SystemException {
		IssuePortClearance issuePortClearance = fetchByRequestCode_First(requestCode,
				orderByComparator);

		if (issuePortClearance != null) {
			return issuePortClearance;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssuePortClearanceException(msg.toString());
	}

	/**
	 * Returns the first issue port clearance in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue port clearance, or <code>null</code> if a matching issue port clearance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePortClearance fetchByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<IssuePortClearance> list = findByRequestCode(requestCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last issue port clearance in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue port clearance
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException if a matching issue port clearance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePortClearance findByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchIssuePortClearanceException, SystemException {
		IssuePortClearance issuePortClearance = fetchByRequestCode_Last(requestCode,
				orderByComparator);

		if (issuePortClearance != null) {
			return issuePortClearance;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssuePortClearanceException(msg.toString());
	}

	/**
	 * Returns the last issue port clearance in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue port clearance, or <code>null</code> if a matching issue port clearance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePortClearance fetchByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByRequestCode(requestCode);

		if (count == 0) {
			return null;
		}

		List<IssuePortClearance> list = findByRequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the issue port clearances before and after the current issue port clearance in the ordered set where requestCode = &#63;.
	 *
	 * @param id the primary key of the current issue port clearance
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue port clearance
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException if a issue port clearance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePortClearance[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchIssuePortClearanceException, SystemException {
		IssuePortClearance issuePortClearance = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssuePortClearance[] array = new IssuePortClearanceImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session,
					issuePortClearance, requestCode, orderByComparator, true);

			array[1] = issuePortClearance;

			array[2] = getByRequestCode_PrevAndNext(session,
					issuePortClearance, requestCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected IssuePortClearance getByRequestCode_PrevAndNext(Session session,
		IssuePortClearance issuePortClearance, String requestCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ISSUEPORTCLEARANCE_WHERE);

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
			query.append(IssuePortClearanceModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(issuePortClearance);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssuePortClearance> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the issue port clearances where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (IssuePortClearance issuePortClearance : findByRequestCode(
				requestCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(issuePortClearance);
		}
	}

	/**
	 * Returns the number of issue port clearances where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching issue port clearances
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

			query.append(_SQL_COUNT_ISSUEPORTCLEARANCE_WHERE);

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

	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "issuePortClearance.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "issuePortClearance.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(issuePortClearance.requestCode IS NULL OR issuePortClearance.requestCode = '')";

	public IssuePortClearancePersistenceImpl() {
		setModelClass(IssuePortClearance.class);
	}

	/**
	 * Caches the issue port clearance in the entity cache if it is enabled.
	 *
	 * @param issuePortClearance the issue port clearance
	 */
	@Override
	public void cacheResult(IssuePortClearance issuePortClearance) {
		EntityCacheUtil.putResult(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceImpl.class, issuePortClearance.getPrimaryKey(),
			issuePortClearance);

		issuePortClearance.resetOriginalValues();
	}

	/**
	 * Caches the issue port clearances in the entity cache if it is enabled.
	 *
	 * @param issuePortClearances the issue port clearances
	 */
	@Override
	public void cacheResult(List<IssuePortClearance> issuePortClearances) {
		for (IssuePortClearance issuePortClearance : issuePortClearances) {
			if (EntityCacheUtil.getResult(
						IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
						IssuePortClearanceImpl.class,
						issuePortClearance.getPrimaryKey()) == null) {
				cacheResult(issuePortClearance);
			}
			else {
				issuePortClearance.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all issue port clearances.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(IssuePortClearanceImpl.class.getName());
		}

		EntityCacheUtil.clearCache(IssuePortClearanceImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the issue port clearance.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(IssuePortClearance issuePortClearance) {
		EntityCacheUtil.removeResult(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceImpl.class, issuePortClearance.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<IssuePortClearance> issuePortClearances) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (IssuePortClearance issuePortClearance : issuePortClearances) {
			EntityCacheUtil.removeResult(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
				IssuePortClearanceImpl.class, issuePortClearance.getPrimaryKey());
		}
	}

	/**
	 * Creates a new issue port clearance with the primary key. Does not add the issue port clearance to the database.
	 *
	 * @param id the primary key for the new issue port clearance
	 * @return the new issue port clearance
	 */
	@Override
	public IssuePortClearance create(long id) {
		IssuePortClearance issuePortClearance = new IssuePortClearanceImpl();

		issuePortClearance.setNew(true);
		issuePortClearance.setPrimaryKey(id);

		return issuePortClearance;
	}

	/**
	 * Removes the issue port clearance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the issue port clearance
	 * @return the issue port clearance that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException if a issue port clearance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePortClearance remove(long id)
		throws NoSuchIssuePortClearanceException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the issue port clearance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the issue port clearance
	 * @return the issue port clearance that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException if a issue port clearance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePortClearance remove(Serializable primaryKey)
		throws NoSuchIssuePortClearanceException, SystemException {
		Session session = null;

		try {
			session = openSession();

			IssuePortClearance issuePortClearance = (IssuePortClearance)session.get(IssuePortClearanceImpl.class,
					primaryKey);

			if (issuePortClearance == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchIssuePortClearanceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(issuePortClearance);
		}
		catch (NoSuchIssuePortClearanceException nsee) {
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
	protected IssuePortClearance removeImpl(
		IssuePortClearance issuePortClearance) throws SystemException {
		issuePortClearance = toUnwrappedModel(issuePortClearance);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(issuePortClearance)) {
				issuePortClearance = (IssuePortClearance)session.get(IssuePortClearanceImpl.class,
						issuePortClearance.getPrimaryKeyObj());
			}

			if (issuePortClearance != null) {
				session.delete(issuePortClearance);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (issuePortClearance != null) {
			clearCache(issuePortClearance);
		}

		return issuePortClearance;
	}

	@Override
	public IssuePortClearance updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance issuePortClearance)
		throws SystemException {
		issuePortClearance = toUnwrappedModel(issuePortClearance);

		boolean isNew = issuePortClearance.isNew();

		IssuePortClearanceModelImpl issuePortClearanceModelImpl = (IssuePortClearanceModelImpl)issuePortClearance;

		Session session = null;

		try {
			session = openSession();

			if (issuePortClearance.isNew()) {
				session.save(issuePortClearance);

				issuePortClearance.setNew(false);
			}
			else {
				session.merge(issuePortClearance);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !IssuePortClearanceModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((issuePortClearanceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						issuePortClearanceModelImpl.getOriginalDocumentName(),
						issuePortClearanceModelImpl.getOriginalDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						issuePortClearanceModelImpl.getDocumentName(),
						issuePortClearanceModelImpl.getDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEAR,
					args);
			}

			if ((issuePortClearanceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						issuePortClearanceModelImpl.getOriginalDocumentName(),
						issuePortClearanceModelImpl.getOriginalDocumentYear(),
						issuePortClearanceModelImpl.getOriginalRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
					args);

				args = new Object[] {
						issuePortClearanceModelImpl.getDocumentName(),
						issuePortClearanceModelImpl.getDocumentYear(),
						issuePortClearanceModelImpl.getRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDISSUEPORTCLEARANCEBYDOCUMENTYEARANDDOCUMENTYEARANDREQUESTSTATE,
					args);
			}

			if ((issuePortClearanceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						issuePortClearanceModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] { issuePortClearanceModelImpl.getRequestCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
			IssuePortClearanceImpl.class, issuePortClearance.getPrimaryKey(),
			issuePortClearance);

		return issuePortClearance;
	}

	protected IssuePortClearance toUnwrappedModel(
		IssuePortClearance issuePortClearance) {
		if (issuePortClearance instanceof IssuePortClearanceImpl) {
			return issuePortClearance;
		}

		IssuePortClearanceImpl issuePortClearanceImpl = new IssuePortClearanceImpl();

		issuePortClearanceImpl.setNew(issuePortClearance.isNew());
		issuePortClearanceImpl.setPrimaryKey(issuePortClearance.getPrimaryKey());

		issuePortClearanceImpl.setId(issuePortClearance.getId());
		issuePortClearanceImpl.setRequestCode(issuePortClearance.getRequestCode());
		issuePortClearanceImpl.setNumberPortClearance(issuePortClearance.getNumberPortClearance());
		issuePortClearanceImpl.setDocumentName(issuePortClearance.getDocumentName());
		issuePortClearanceImpl.setDocumentYear(issuePortClearance.getDocumentYear());
		issuePortClearanceImpl.setPortofAuthority(issuePortClearance.getPortofAuthority());
		issuePortClearanceImpl.setNameOfShip(issuePortClearance.getNameOfShip());
		issuePortClearanceImpl.setFlagStateOfShip(issuePortClearance.getFlagStateOfShip());
		issuePortClearanceImpl.setNumberOfCrews(issuePortClearance.getNumberOfCrews());
		issuePortClearanceImpl.setNumberOfPassengers(issuePortClearance.getNumberOfPassengers());
		issuePortClearanceImpl.setCallSign(issuePortClearance.getCallSign());
		issuePortClearanceImpl.setNameOfMaster(issuePortClearance.getNameOfMaster());
		issuePortClearanceImpl.setCargo(issuePortClearance.getCargo());
		issuePortClearanceImpl.setVolumeCargo(issuePortClearance.getVolumeCargo());
		issuePortClearanceImpl.setCargoUnit(issuePortClearance.getCargoUnit());
		issuePortClearanceImpl.setTransitCargo(issuePortClearance.getTransitCargo());
		issuePortClearanceImpl.setVolumeTransitCargo(issuePortClearance.getVolumeTransitCargo());
		issuePortClearanceImpl.setTransitCargoUnit(issuePortClearance.getTransitCargoUnit());
		issuePortClearanceImpl.setTimeOfDeparture(issuePortClearance.getTimeOfDeparture());
		issuePortClearanceImpl.setNextPortOfCallCode(issuePortClearance.getNextPortOfCallCode());
		issuePortClearanceImpl.setValidUntil(issuePortClearance.getValidUntil());
		issuePortClearanceImpl.setIssueDate(issuePortClearance.getIssueDate());
		issuePortClearanceImpl.setDirectorOfMaritime(issuePortClearance.getDirectorOfMaritime());
		issuePortClearanceImpl.setCertificateNo(issuePortClearance.getCertificateNo());
		issuePortClearanceImpl.setRequestState(issuePortClearance.getRequestState());
		issuePortClearanceImpl.setGt(issuePortClearance.getGt());
		issuePortClearanceImpl.setVersionNo(issuePortClearance.getVersionNo());
		issuePortClearanceImpl.setIsApproval(issuePortClearance.getIsApproval());
		issuePortClearanceImpl.setApprovalDate(issuePortClearance.getApprovalDate());
		issuePortClearanceImpl.setApprovalName(issuePortClearance.getApprovalName());
		issuePortClearanceImpl.setRemarks(issuePortClearance.getRemarks());
		issuePortClearanceImpl.setIsCancel(issuePortClearance.getIsCancel());
		issuePortClearanceImpl.setCancelDate(issuePortClearance.getCancelDate());
		issuePortClearanceImpl.setCancelName(issuePortClearance.getCancelName());
		issuePortClearanceImpl.setCancelNote(issuePortClearance.getCancelNote());
		issuePortClearanceImpl.setRepresentative(issuePortClearance.getRepresentative());
		issuePortClearanceImpl.setSignDate(issuePortClearance.getSignDate());
		issuePortClearanceImpl.setSignName(issuePortClearance.getSignName());
		issuePortClearanceImpl.setSignTitle(issuePortClearance.getSignTitle());
		issuePortClearanceImpl.setSignPlace(issuePortClearance.getSignPlace());
		issuePortClearanceImpl.setStampStatus(issuePortClearance.getStampStatus());
		issuePortClearanceImpl.setAttachedFile(issuePortClearance.getAttachedFile());

		return issuePortClearanceImpl;
	}

	/**
	 * Returns the issue port clearance with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the issue port clearance
	 * @return the issue port clearance
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException if a issue port clearance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePortClearance findByPrimaryKey(Serializable primaryKey)
		throws NoSuchIssuePortClearanceException, SystemException {
		IssuePortClearance issuePortClearance = fetchByPrimaryKey(primaryKey);

		if (issuePortClearance == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchIssuePortClearanceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return issuePortClearance;
	}

	/**
	 * Returns the issue port clearance with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException} if it could not be found.
	 *
	 * @param id the primary key of the issue port clearance
	 * @return the issue port clearance
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException if a issue port clearance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePortClearance findByPrimaryKey(long id)
		throws NoSuchIssuePortClearanceException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the issue port clearance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the issue port clearance
	 * @return the issue port clearance, or <code>null</code> if a issue port clearance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePortClearance fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		IssuePortClearance issuePortClearance = (IssuePortClearance)EntityCacheUtil.getResult(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
				IssuePortClearanceImpl.class, primaryKey);

		if (issuePortClearance == _nullIssuePortClearance) {
			return null;
		}

		if (issuePortClearance == null) {
			Session session = null;

			try {
				session = openSession();

				issuePortClearance = (IssuePortClearance)session.get(IssuePortClearanceImpl.class,
						primaryKey);

				if (issuePortClearance != null) {
					cacheResult(issuePortClearance);
				}
				else {
					EntityCacheUtil.putResult(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
						IssuePortClearanceImpl.class, primaryKey,
						_nullIssuePortClearance);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(IssuePortClearanceModelImpl.ENTITY_CACHE_ENABLED,
					IssuePortClearanceImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return issuePortClearance;
	}

	/**
	 * Returns the issue port clearance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the issue port clearance
	 * @return the issue port clearance, or <code>null</code> if a issue port clearance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssuePortClearance fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the issue port clearances.
	 *
	 * @return the issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssuePortClearance> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue port clearances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePortClearanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of issue port clearances
	 * @param end the upper bound of the range of issue port clearances (not inclusive)
	 * @return the range of issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssuePortClearance> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue port clearances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePortClearanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of issue port clearances
	 * @param end the upper bound of the range of issue port clearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of issue port clearances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssuePortClearance> findAll(int start, int end,
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

		List<IssuePortClearance> list = (List<IssuePortClearance>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ISSUEPORTCLEARANCE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ISSUEPORTCLEARANCE;

				if (pagination) {
					sql = sql.concat(IssuePortClearanceModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<IssuePortClearance>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<IssuePortClearance>(list);
				}
				else {
					list = (List<IssuePortClearance>)QueryUtil.list(q,
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
	 * Removes all the issue port clearances from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (IssuePortClearance issuePortClearance : findAll()) {
			remove(issuePortClearance);
		}
	}

	/**
	 * Returns the number of issue port clearances.
	 *
	 * @return the number of issue port clearances
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

				Query q = session.createQuery(_SQL_COUNT_ISSUEPORTCLEARANCE);

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
	 * Initializes the issue port clearance persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<IssuePortClearance>> listenersList = new ArrayList<ModelListener<IssuePortClearance>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<IssuePortClearance>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(IssuePortClearanceImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ISSUEPORTCLEARANCE = "SELECT issuePortClearance FROM IssuePortClearance issuePortClearance";
	private static final String _SQL_SELECT_ISSUEPORTCLEARANCE_WHERE = "SELECT issuePortClearance FROM IssuePortClearance issuePortClearance WHERE ";
	private static final String _SQL_COUNT_ISSUEPORTCLEARANCE = "SELECT COUNT(issuePortClearance) FROM IssuePortClearance issuePortClearance";
	private static final String _SQL_COUNT_ISSUEPORTCLEARANCE_WHERE = "SELECT COUNT(issuePortClearance) FROM IssuePortClearance issuePortClearance WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "issuePortClearance.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No IssuePortClearance exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No IssuePortClearance exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(IssuePortClearancePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "numberPortClearance", "documentName",
				"documentYear", "portofAuthority", "nameOfShip",
				"flagStateOfShip", "numberOfCrews", "numberOfPassengers",
				"callSign", "nameOfMaster", "cargo", "volumeCargo", "cargoUnit",
				"transitCargo", "volumeTransitCargo", "transitCargoUnit",
				"timeOfDeparture", "nextPortOfCallCode", "validUntil",
				"issueDate", "directorOfMaritime", "certificateNo",
				"requestState", "gt", "versionNo", "isApproval", "approvalDate",
				"approvalName", "remarks", "isCancel", "cancelDate",
				"cancelName", "cancelNote", "representative", "signDate",
				"signName", "signTitle", "signPlace", "stampStatus",
				"attachedFile"
			});
	private static IssuePortClearance _nullIssuePortClearance = new IssuePortClearanceImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<IssuePortClearance> toCacheModel() {
				return _nullIssuePortClearanceCacheModel;
			}
		};

	private static CacheModel<IssuePortClearance> _nullIssuePortClearanceCacheModel =
		new CacheModel<IssuePortClearance>() {
			@Override
			public IssuePortClearance toEntityModel() {
				return _nullIssuePortClearance;
			}
		};
}