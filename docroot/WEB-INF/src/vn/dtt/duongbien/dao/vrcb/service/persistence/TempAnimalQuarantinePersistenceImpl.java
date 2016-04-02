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

import vn.dtt.duongbien.dao.vrcb.NoSuchTempAnimalQuarantineException;
import vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempAnimalQuarantineImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempAnimalQuarantineModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the temp animal quarantine service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempAnimalQuarantinePersistence
 * @see TempAnimalQuarantineUtil
 * @generated
 */
public class TempAnimalQuarantinePersistenceImpl extends BasePersistenceImpl<TempAnimalQuarantine>
	implements TempAnimalQuarantinePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempAnimalQuarantineUtil} to access the temp animal quarantine persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempAnimalQuarantineImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempAnimalQuarantineModelImpl.FINDER_CACHE_ENABLED,
			TempAnimalQuarantineImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempAnimalQuarantineModelImpl.FINDER_CACHE_ENABLED,
			TempAnimalQuarantineImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempAnimalQuarantineModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempAnimalQuarantineModelImpl.FINDER_CACHE_ENABLED,
			TempAnimalQuarantineImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentNameAnddocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempAnimalQuarantineModelImpl.FINDER_CACHE_ENABLED,
			TempAnimalQuarantineImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			TempAnimalQuarantineModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempAnimalQuarantineModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempAnimalQuarantineModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the temp animal quarantines where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching temp animal quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempAnimalQuarantine> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findBydocumentNameAnddocumentYear(documentName, documentYear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp animal quarantines where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp animal quarantines
	 * @param end the upper bound of the range of temp animal quarantines (not inclusive)
	 * @return the range of matching temp animal quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempAnimalQuarantine> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findBydocumentNameAnddocumentYear(documentName, documentYear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp animal quarantines where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp animal quarantines
	 * @param end the upper bound of the range of temp animal quarantines (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp animal quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempAnimalQuarantine> findBydocumentNameAnddocumentYear(
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

		List<TempAnimalQuarantine> list = (List<TempAnimalQuarantine>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempAnimalQuarantine tempAnimalQuarantine : list) {
				if ((documentName != tempAnimalQuarantine.getDocumentName()) ||
						(documentYear != tempAnimalQuarantine.getDocumentYear())) {
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

			query.append(_SQL_SELECT_TEMPANIMALQUARANTINE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempAnimalQuarantineModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempAnimalQuarantine>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempAnimalQuarantine>(list);
				}
				else {
					list = (List<TempAnimalQuarantine>)QueryUtil.list(q,
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
	 * Returns the first temp animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp animal quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempAnimalQuarantineException if a matching temp animal quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAnimalQuarantine findBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempAnimalQuarantineException, SystemException {
		TempAnimalQuarantine tempAnimalQuarantine = fetchBydocumentNameAnddocumentYear_First(documentName,
				documentYear, orderByComparator);

		if (tempAnimalQuarantine != null) {
			return tempAnimalQuarantine;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempAnimalQuarantineException(msg.toString());
	}

	/**
	 * Returns the first temp animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp animal quarantine, or <code>null</code> if a matching temp animal quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAnimalQuarantine fetchBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		List<TempAnimalQuarantine> list = findBydocumentNameAnddocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp animal quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempAnimalQuarantineException if a matching temp animal quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAnimalQuarantine findBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempAnimalQuarantineException, SystemException {
		TempAnimalQuarantine tempAnimalQuarantine = fetchBydocumentNameAnddocumentYear_Last(documentName,
				documentYear, orderByComparator);

		if (tempAnimalQuarantine != null) {
			return tempAnimalQuarantine;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempAnimalQuarantineException(msg.toString());
	}

	/**
	 * Returns the last temp animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp animal quarantine, or <code>null</code> if a matching temp animal quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAnimalQuarantine fetchBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBydocumentNameAnddocumentYear(documentName,
				documentYear);

		if (count == 0) {
			return null;
		}

		List<TempAnimalQuarantine> list = findBydocumentNameAnddocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp animal quarantines before and after the current temp animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param id the primary key of the current temp animal quarantine
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp animal quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempAnimalQuarantineException if a temp animal quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAnimalQuarantine[] findBydocumentNameAnddocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchTempAnimalQuarantineException, SystemException {
		TempAnimalQuarantine tempAnimalQuarantine = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempAnimalQuarantine[] array = new TempAnimalQuarantineImpl[3];

			array[0] = getBydocumentNameAnddocumentYear_PrevAndNext(session,
					tempAnimalQuarantine, documentName, documentYear,
					orderByComparator, true);

			array[1] = tempAnimalQuarantine;

			array[2] = getBydocumentNameAnddocumentYear_PrevAndNext(session,
					tempAnimalQuarantine, documentName, documentYear,
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

	protected TempAnimalQuarantine getBydocumentNameAnddocumentYear_PrevAndNext(
		Session session, TempAnimalQuarantine tempAnimalQuarantine,
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

		query.append(_SQL_SELECT_TEMPANIMALQUARANTINE_WHERE);

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
			query.append(TempAnimalQuarantineModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempAnimalQuarantine);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempAnimalQuarantine> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp animal quarantines where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBydocumentNameAnddocumentYear(long documentName,
		int documentYear) throws SystemException {
		for (TempAnimalQuarantine tempAnimalQuarantine : findBydocumentNameAnddocumentYear(
				documentName, documentYear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempAnimalQuarantine);
		}
	}

	/**
	 * Returns the number of temp animal quarantines where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching temp animal quarantines
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

			query.append(_SQL_COUNT_TEMPANIMALQUARANTINE_WHERE);

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
		"tempAnimalQuarantine.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"tempAnimalQuarantine.documentYear = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempAnimalQuarantineModelImpl.FINDER_CACHE_ENABLED,
			TempAnimalQuarantineImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempAnimalQuarantineModelImpl.FINDER_CACHE_ENABLED,
			TempAnimalQuarantineImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			TempAnimalQuarantineModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempAnimalQuarantineModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			TempAnimalQuarantineModelImpl.REQUESTSTATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempAnimalQuarantineModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the temp animal quarantines where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the matching temp animal quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempAnimalQuarantine> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		return findBydocumentNameAnddocumentYearRequestState(documentName,
			documentYear, requestState, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the temp animal quarantines where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp animal quarantines
	 * @param end the upper bound of the range of temp animal quarantines (not inclusive)
	 * @return the range of matching temp animal quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempAnimalQuarantine> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end) throws SystemException {
		return findBydocumentNameAnddocumentYearRequestState(documentName,
			documentYear, requestState, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp animal quarantines where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp animal quarantines
	 * @param end the upper bound of the range of temp animal quarantines (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp animal quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempAnimalQuarantine> findBydocumentNameAnddocumentYearRequestState(
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

		List<TempAnimalQuarantine> list = (List<TempAnimalQuarantine>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempAnimalQuarantine tempAnimalQuarantine : list) {
				if ((documentName != tempAnimalQuarantine.getDocumentName()) ||
						(documentYear != tempAnimalQuarantine.getDocumentYear()) ||
						(requestState != tempAnimalQuarantine.getRequestState())) {
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

			query.append(_SQL_SELECT_TEMPANIMALQUARANTINE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempAnimalQuarantineModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempAnimalQuarantine>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempAnimalQuarantine>(list);
				}
				else {
					list = (List<TempAnimalQuarantine>)QueryUtil.list(q,
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
	 * Returns the first temp animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp animal quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempAnimalQuarantineException if a matching temp animal quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAnimalQuarantine findBydocumentNameAnddocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempAnimalQuarantineException, SystemException {
		TempAnimalQuarantine tempAnimalQuarantine = fetchBydocumentNameAnddocumentYearRequestState_First(documentName,
				documentYear, requestState, orderByComparator);

		if (tempAnimalQuarantine != null) {
			return tempAnimalQuarantine;
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

		throw new NoSuchTempAnimalQuarantineException(msg.toString());
	}

	/**
	 * Returns the first temp animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp animal quarantine, or <code>null</code> if a matching temp animal quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAnimalQuarantine fetchBydocumentNameAnddocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempAnimalQuarantine> list = findBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp animal quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempAnimalQuarantineException if a matching temp animal quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAnimalQuarantine findBydocumentNameAnddocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempAnimalQuarantineException, SystemException {
		TempAnimalQuarantine tempAnimalQuarantine = fetchBydocumentNameAnddocumentYearRequestState_Last(documentName,
				documentYear, requestState, orderByComparator);

		if (tempAnimalQuarantine != null) {
			return tempAnimalQuarantine;
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

		throw new NoSuchTempAnimalQuarantineException(msg.toString());
	}

	/**
	 * Returns the last temp animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp animal quarantine, or <code>null</code> if a matching temp animal quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAnimalQuarantine fetchBydocumentNameAnddocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState);

		if (count == 0) {
			return null;
		}

		List<TempAnimalQuarantine> list = findBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp animal quarantines before and after the current temp animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param id the primary key of the current temp animal quarantine
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp animal quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempAnimalQuarantineException if a temp animal quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAnimalQuarantine[] findBydocumentNameAnddocumentYearRequestState_PrevAndNext(
		long id, long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempAnimalQuarantineException, SystemException {
		TempAnimalQuarantine tempAnimalQuarantine = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempAnimalQuarantine[] array = new TempAnimalQuarantineImpl[3];

			array[0] = getBydocumentNameAnddocumentYearRequestState_PrevAndNext(session,
					tempAnimalQuarantine, documentName, documentYear,
					requestState, orderByComparator, true);

			array[1] = tempAnimalQuarantine;

			array[2] = getBydocumentNameAnddocumentYearRequestState_PrevAndNext(session,
					tempAnimalQuarantine, documentName, documentYear,
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

	protected TempAnimalQuarantine getBydocumentNameAnddocumentYearRequestState_PrevAndNext(
		Session session, TempAnimalQuarantine tempAnimalQuarantine,
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

		query.append(_SQL_SELECT_TEMPANIMALQUARANTINE_WHERE);

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
			query.append(TempAnimalQuarantineModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempAnimalQuarantine);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempAnimalQuarantine> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp animal quarantines where documentName = &#63; and documentYear = &#63; and requestState = &#63; from the database.
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
		for (TempAnimalQuarantine tempAnimalQuarantine : findBydocumentNameAnddocumentYearRequestState(
				documentName, documentYear, requestState, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempAnimalQuarantine);
		}
	}

	/**
	 * Returns the number of temp animal quarantines where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the number of matching temp animal quarantines
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

			query.append(_SQL_COUNT_TEMPANIMALQUARANTINE_WHERE);

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
		"tempAnimalQuarantine.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2 =
		"tempAnimalQuarantine.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2 =
		"tempAnimalQuarantine.requestState = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempAnimalQuarantineModelImpl.FINDER_CACHE_ENABLED,
			TempAnimalQuarantineImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempAnimalQuarantineModelImpl.FINDER_CACHE_ENABLED,
			TempAnimalQuarantineImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempAnimalQuarantineModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempAnimalQuarantineModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the temp animal quarantines where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp animal quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempAnimalQuarantine> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp animal quarantines where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp animal quarantines
	 * @param end the upper bound of the range of temp animal quarantines (not inclusive)
	 * @return the range of matching temp animal quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempAnimalQuarantine> findByRequestCode(String requestCode,
		int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp animal quarantines where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp animal quarantines
	 * @param end the upper bound of the range of temp animal quarantines (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp animal quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempAnimalQuarantine> findByRequestCode(String requestCode,
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

		List<TempAnimalQuarantine> list = (List<TempAnimalQuarantine>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempAnimalQuarantine tempAnimalQuarantine : list) {
				if (!Validator.equals(requestCode,
							tempAnimalQuarantine.getRequestCode())) {
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

			query.append(_SQL_SELECT_TEMPANIMALQUARANTINE_WHERE);

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
				query.append(TempAnimalQuarantineModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempAnimalQuarantine>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempAnimalQuarantine>(list);
				}
				else {
					list = (List<TempAnimalQuarantine>)QueryUtil.list(q,
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
	 * Returns the first temp animal quarantine in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp animal quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempAnimalQuarantineException if a matching temp animal quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAnimalQuarantine findByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempAnimalQuarantineException, SystemException {
		TempAnimalQuarantine tempAnimalQuarantine = fetchByRequestCode_First(requestCode,
				orderByComparator);

		if (tempAnimalQuarantine != null) {
			return tempAnimalQuarantine;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempAnimalQuarantineException(msg.toString());
	}

	/**
	 * Returns the first temp animal quarantine in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp animal quarantine, or <code>null</code> if a matching temp animal quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAnimalQuarantine fetchByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempAnimalQuarantine> list = findByRequestCode(requestCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp animal quarantine in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp animal quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempAnimalQuarantineException if a matching temp animal quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAnimalQuarantine findByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempAnimalQuarantineException, SystemException {
		TempAnimalQuarantine tempAnimalQuarantine = fetchByRequestCode_Last(requestCode,
				orderByComparator);

		if (tempAnimalQuarantine != null) {
			return tempAnimalQuarantine;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempAnimalQuarantineException(msg.toString());
	}

	/**
	 * Returns the last temp animal quarantine in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp animal quarantine, or <code>null</code> if a matching temp animal quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAnimalQuarantine fetchByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByRequestCode(requestCode);

		if (count == 0) {
			return null;
		}

		List<TempAnimalQuarantine> list = findByRequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp animal quarantines before and after the current temp animal quarantine in the ordered set where requestCode = &#63;.
	 *
	 * @param id the primary key of the current temp animal quarantine
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp animal quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempAnimalQuarantineException if a temp animal quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAnimalQuarantine[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempAnimalQuarantineException, SystemException {
		TempAnimalQuarantine tempAnimalQuarantine = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempAnimalQuarantine[] array = new TempAnimalQuarantineImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session,
					tempAnimalQuarantine, requestCode, orderByComparator, true);

			array[1] = tempAnimalQuarantine;

			array[2] = getByRequestCode_PrevAndNext(session,
					tempAnimalQuarantine, requestCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempAnimalQuarantine getByRequestCode_PrevAndNext(
		Session session, TempAnimalQuarantine tempAnimalQuarantine,
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

		query.append(_SQL_SELECT_TEMPANIMALQUARANTINE_WHERE);

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
			query.append(TempAnimalQuarantineModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempAnimalQuarantine);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempAnimalQuarantine> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp animal quarantines where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempAnimalQuarantine tempAnimalQuarantine : findByRequestCode(
				requestCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tempAnimalQuarantine);
		}
	}

	/**
	 * Returns the number of temp animal quarantines where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp animal quarantines
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

			query.append(_SQL_COUNT_TEMPANIMALQUARANTINE_WHERE);

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

	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempAnimalQuarantine.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempAnimalQuarantine.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempAnimalQuarantine.requestCode IS NULL OR tempAnimalQuarantine.requestCode = '')";

	public TempAnimalQuarantinePersistenceImpl() {
		setModelClass(TempAnimalQuarantine.class);
	}

	/**
	 * Caches the temp animal quarantine in the entity cache if it is enabled.
	 *
	 * @param tempAnimalQuarantine the temp animal quarantine
	 */
	@Override
	public void cacheResult(TempAnimalQuarantine tempAnimalQuarantine) {
		EntityCacheUtil.putResult(TempAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempAnimalQuarantineImpl.class,
			tempAnimalQuarantine.getPrimaryKey(), tempAnimalQuarantine);

		tempAnimalQuarantine.resetOriginalValues();
	}

	/**
	 * Caches the temp animal quarantines in the entity cache if it is enabled.
	 *
	 * @param tempAnimalQuarantines the temp animal quarantines
	 */
	@Override
	public void cacheResult(List<TempAnimalQuarantine> tempAnimalQuarantines) {
		for (TempAnimalQuarantine tempAnimalQuarantine : tempAnimalQuarantines) {
			if (EntityCacheUtil.getResult(
						TempAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
						TempAnimalQuarantineImpl.class,
						tempAnimalQuarantine.getPrimaryKey()) == null) {
				cacheResult(tempAnimalQuarantine);
			}
			else {
				tempAnimalQuarantine.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp animal quarantines.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempAnimalQuarantineImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempAnimalQuarantineImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp animal quarantine.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempAnimalQuarantine tempAnimalQuarantine) {
		EntityCacheUtil.removeResult(TempAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempAnimalQuarantineImpl.class, tempAnimalQuarantine.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TempAnimalQuarantine> tempAnimalQuarantines) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempAnimalQuarantine tempAnimalQuarantine : tempAnimalQuarantines) {
			EntityCacheUtil.removeResult(TempAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
				TempAnimalQuarantineImpl.class,
				tempAnimalQuarantine.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp animal quarantine with the primary key. Does not add the temp animal quarantine to the database.
	 *
	 * @param id the primary key for the new temp animal quarantine
	 * @return the new temp animal quarantine
	 */
	@Override
	public TempAnimalQuarantine create(long id) {
		TempAnimalQuarantine tempAnimalQuarantine = new TempAnimalQuarantineImpl();

		tempAnimalQuarantine.setNew(true);
		tempAnimalQuarantine.setPrimaryKey(id);

		return tempAnimalQuarantine;
	}

	/**
	 * Removes the temp animal quarantine with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp animal quarantine
	 * @return the temp animal quarantine that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempAnimalQuarantineException if a temp animal quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAnimalQuarantine remove(long id)
		throws NoSuchTempAnimalQuarantineException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the temp animal quarantine with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp animal quarantine
	 * @return the temp animal quarantine that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempAnimalQuarantineException if a temp animal quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAnimalQuarantine remove(Serializable primaryKey)
		throws NoSuchTempAnimalQuarantineException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempAnimalQuarantine tempAnimalQuarantine = (TempAnimalQuarantine)session.get(TempAnimalQuarantineImpl.class,
					primaryKey);

			if (tempAnimalQuarantine == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempAnimalQuarantineException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempAnimalQuarantine);
		}
		catch (NoSuchTempAnimalQuarantineException nsee) {
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
	protected TempAnimalQuarantine removeImpl(
		TempAnimalQuarantine tempAnimalQuarantine) throws SystemException {
		tempAnimalQuarantine = toUnwrappedModel(tempAnimalQuarantine);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tempAnimalQuarantine)) {
				tempAnimalQuarantine = (TempAnimalQuarantine)session.get(TempAnimalQuarantineImpl.class,
						tempAnimalQuarantine.getPrimaryKeyObj());
			}

			if (tempAnimalQuarantine != null) {
				session.delete(tempAnimalQuarantine);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tempAnimalQuarantine != null) {
			clearCache(tempAnimalQuarantine);
		}

		return tempAnimalQuarantine;
	}

	@Override
	public TempAnimalQuarantine updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine tempAnimalQuarantine)
		throws SystemException {
		tempAnimalQuarantine = toUnwrappedModel(tempAnimalQuarantine);

		boolean isNew = tempAnimalQuarantine.isNew();

		TempAnimalQuarantineModelImpl tempAnimalQuarantineModelImpl = (TempAnimalQuarantineModelImpl)tempAnimalQuarantine;

		Session session = null;

		try {
			session = openSession();

			if (tempAnimalQuarantine.isNew()) {
				session.save(tempAnimalQuarantine);

				tempAnimalQuarantine.setNew(false);
			}
			else {
				session.merge(tempAnimalQuarantine);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TempAnimalQuarantineModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempAnimalQuarantineModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempAnimalQuarantineModelImpl.getOriginalDocumentName(),
						tempAnimalQuarantineModelImpl.getOriginalDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						tempAnimalQuarantineModelImpl.getDocumentName(),
						tempAnimalQuarantineModelImpl.getDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
			}

			if ((tempAnimalQuarantineModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempAnimalQuarantineModelImpl.getOriginalDocumentName(),
						tempAnimalQuarantineModelImpl.getOriginalDocumentYear(),
						tempAnimalQuarantineModelImpl.getOriginalRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);

				args = new Object[] {
						tempAnimalQuarantineModelImpl.getDocumentName(),
						tempAnimalQuarantineModelImpl.getDocumentYear(),
						tempAnimalQuarantineModelImpl.getRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
			}

			if ((tempAnimalQuarantineModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempAnimalQuarantineModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] {
						tempAnimalQuarantineModelImpl.getRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempAnimalQuarantineImpl.class,
			tempAnimalQuarantine.getPrimaryKey(), tempAnimalQuarantine);

		return tempAnimalQuarantine;
	}

	protected TempAnimalQuarantine toUnwrappedModel(
		TempAnimalQuarantine tempAnimalQuarantine) {
		if (tempAnimalQuarantine instanceof TempAnimalQuarantineImpl) {
			return tempAnimalQuarantine;
		}

		TempAnimalQuarantineImpl tempAnimalQuarantineImpl = new TempAnimalQuarantineImpl();

		tempAnimalQuarantineImpl.setNew(tempAnimalQuarantine.isNew());
		tempAnimalQuarantineImpl.setPrimaryKey(tempAnimalQuarantine.getPrimaryKey());

		tempAnimalQuarantineImpl.setId(tempAnimalQuarantine.getId());
		tempAnimalQuarantineImpl.setRequestCode(tempAnimalQuarantine.getRequestCode());
		tempAnimalQuarantineImpl.setRequestState(tempAnimalQuarantine.getRequestState());
		tempAnimalQuarantineImpl.setDocumentName(tempAnimalQuarantine.getDocumentName());
		tempAnimalQuarantineImpl.setDocumentYear(tempAnimalQuarantine.getDocumentYear());
		tempAnimalQuarantineImpl.setUserCreated(tempAnimalQuarantine.getUserCreated());
		tempAnimalQuarantineImpl.setNameOfShip(tempAnimalQuarantine.getNameOfShip());
		tempAnimalQuarantineImpl.setFlagStateOfShip(tempAnimalQuarantine.getFlagStateOfShip());
		tempAnimalQuarantineImpl.setNumberOfCrew(tempAnimalQuarantine.getNumberOfCrew());
		tempAnimalQuarantineImpl.setNumberOfPassengers(tempAnimalQuarantine.getNumberOfPassengers());
		tempAnimalQuarantineImpl.setLastPortOfCallCode(tempAnimalQuarantine.getLastPortOfCallCode());
		tempAnimalQuarantineImpl.setNextPortOfCallCode(tempAnimalQuarantine.getNextPortOfCallCode());
		tempAnimalQuarantineImpl.setAnimalNameFirst(tempAnimalQuarantine.getAnimalNameFirst());
		tempAnimalQuarantineImpl.setAnimalNameBetween(tempAnimalQuarantine.getAnimalNameBetween());
		tempAnimalQuarantineImpl.setAnimalNameThis(tempAnimalQuarantine.getAnimalNameThis());
		tempAnimalQuarantineImpl.setNameOfMaster(tempAnimalQuarantine.getNameOfMaster());
		tempAnimalQuarantineImpl.setSignPlace(tempAnimalQuarantine.getSignPlace());
		tempAnimalQuarantineImpl.setSignDate(tempAnimalQuarantine.getSignDate());
		tempAnimalQuarantineImpl.setMasterSigned(tempAnimalQuarantine.getMasterSigned());
		tempAnimalQuarantineImpl.setMasterSignedImage(tempAnimalQuarantine.getMasterSignedImage());
		tempAnimalQuarantineImpl.setAttachedFile(tempAnimalQuarantine.getAttachedFile());

		return tempAnimalQuarantineImpl;
	}

	/**
	 * Returns the temp animal quarantine with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp animal quarantine
	 * @return the temp animal quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempAnimalQuarantineException if a temp animal quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAnimalQuarantine findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTempAnimalQuarantineException, SystemException {
		TempAnimalQuarantine tempAnimalQuarantine = fetchByPrimaryKey(primaryKey);

		if (tempAnimalQuarantine == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTempAnimalQuarantineException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tempAnimalQuarantine;
	}

	/**
	 * Returns the temp animal quarantine with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempAnimalQuarantineException} if it could not be found.
	 *
	 * @param id the primary key of the temp animal quarantine
	 * @return the temp animal quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempAnimalQuarantineException if a temp animal quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAnimalQuarantine findByPrimaryKey(long id)
		throws NoSuchTempAnimalQuarantineException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the temp animal quarantine with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp animal quarantine
	 * @return the temp animal quarantine, or <code>null</code> if a temp animal quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAnimalQuarantine fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TempAnimalQuarantine tempAnimalQuarantine = (TempAnimalQuarantine)EntityCacheUtil.getResult(TempAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
				TempAnimalQuarantineImpl.class, primaryKey);

		if (tempAnimalQuarantine == _nullTempAnimalQuarantine) {
			return null;
		}

		if (tempAnimalQuarantine == null) {
			Session session = null;

			try {
				session = openSession();

				tempAnimalQuarantine = (TempAnimalQuarantine)session.get(TempAnimalQuarantineImpl.class,
						primaryKey);

				if (tempAnimalQuarantine != null) {
					cacheResult(tempAnimalQuarantine);
				}
				else {
					EntityCacheUtil.putResult(TempAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
						TempAnimalQuarantineImpl.class, primaryKey,
						_nullTempAnimalQuarantine);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TempAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
					TempAnimalQuarantineImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tempAnimalQuarantine;
	}

	/**
	 * Returns the temp animal quarantine with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp animal quarantine
	 * @return the temp animal quarantine, or <code>null</code> if a temp animal quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempAnimalQuarantine fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the temp animal quarantines.
	 *
	 * @return the temp animal quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempAnimalQuarantine> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp animal quarantines.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp animal quarantines
	 * @param end the upper bound of the range of temp animal quarantines (not inclusive)
	 * @return the range of temp animal quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempAnimalQuarantine> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp animal quarantines.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp animal quarantines
	 * @param end the upper bound of the range of temp animal quarantines (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp animal quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempAnimalQuarantine> findAll(int start, int end,
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

		List<TempAnimalQuarantine> list = (List<TempAnimalQuarantine>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPANIMALQUARANTINE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPANIMALQUARANTINE;

				if (pagination) {
					sql = sql.concat(TempAnimalQuarantineModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TempAnimalQuarantine>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempAnimalQuarantine>(list);
				}
				else {
					list = (List<TempAnimalQuarantine>)QueryUtil.list(q,
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
	 * Removes all the temp animal quarantines from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TempAnimalQuarantine tempAnimalQuarantine : findAll()) {
			remove(tempAnimalQuarantine);
		}
	}

	/**
	 * Returns the number of temp animal quarantines.
	 *
	 * @return the number of temp animal quarantines
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

				Query q = session.createQuery(_SQL_COUNT_TEMPANIMALQUARANTINE);

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
	 * Initializes the temp animal quarantine persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempAnimalQuarantine>> listenersList = new ArrayList<ModelListener<TempAnimalQuarantine>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempAnimalQuarantine>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempAnimalQuarantineImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TEMPANIMALQUARANTINE = "SELECT tempAnimalQuarantine FROM TempAnimalQuarantine tempAnimalQuarantine";
	private static final String _SQL_SELECT_TEMPANIMALQUARANTINE_WHERE = "SELECT tempAnimalQuarantine FROM TempAnimalQuarantine tempAnimalQuarantine WHERE ";
	private static final String _SQL_COUNT_TEMPANIMALQUARANTINE = "SELECT COUNT(tempAnimalQuarantine) FROM TempAnimalQuarantine tempAnimalQuarantine";
	private static final String _SQL_COUNT_TEMPANIMALQUARANTINE_WHERE = "SELECT COUNT(tempAnimalQuarantine) FROM TempAnimalQuarantine tempAnimalQuarantine WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempAnimalQuarantine.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempAnimalQuarantine exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempAnimalQuarantine exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempAnimalQuarantinePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "requestState", "documentName",
				"documentYear", "userCreated", "nameOfShip", "flagStateOfShip",
				"numberOfCrew", "numberOfPassengers", "lastPortOfCallCode",
				"nextPortOfCallCode", "animalNameFirst", "animalNameBetween",
				"animalNameThis", "nameOfMaster", "signPlace", "signDate",
				"masterSigned", "masterSignedImage", "attachedFile"
			});
	private static TempAnimalQuarantine _nullTempAnimalQuarantine = new TempAnimalQuarantineImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempAnimalQuarantine> toCacheModel() {
				return _nullTempAnimalQuarantineCacheModel;
			}
		};

	private static CacheModel<TempAnimalQuarantine> _nullTempAnimalQuarantineCacheModel =
		new CacheModel<TempAnimalQuarantine>() {
			@Override
			public TempAnimalQuarantine toEntityModel() {
				return _nullTempAnimalQuarantine;
			}
		};
}