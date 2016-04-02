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

import vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationOfHealthException;
import vn.dtt.duongbien.dao.vrcb.model.TempDeclarationOfHealth;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationOfHealthImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationOfHealthModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the temp declaration of health service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempDeclarationOfHealthPersistence
 * @see TempDeclarationOfHealthUtil
 * @generated
 */
public class TempDeclarationOfHealthPersistenceImpl extends BasePersistenceImpl<TempDeclarationOfHealth>
	implements TempDeclarationOfHealthPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempDeclarationOfHealthUtil} to access the temp declaration of health persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempDeclarationOfHealthImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempDeclarationOfHealthModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationOfHealthModelImpl.FINDER_CACHE_ENABLED,
			TempDeclarationOfHealthImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempDeclarationOfHealthModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationOfHealthModelImpl.FINDER_CACHE_ENABLED,
			TempDeclarationOfHealthImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempDeclarationOfHealthModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationOfHealthModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempDeclarationOfHealthModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationOfHealthModelImpl.FINDER_CACHE_ENABLED,
			TempDeclarationOfHealthImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentNameAnddocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempDeclarationOfHealthModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationOfHealthModelImpl.FINDER_CACHE_ENABLED,
			TempDeclarationOfHealthImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			TempDeclarationOfHealthModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempDeclarationOfHealthModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempDeclarationOfHealthModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationOfHealthModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the temp declaration of healths where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching temp declaration of healths
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDeclarationOfHealth> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findBydocumentNameAnddocumentYear(documentName, documentYear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp declaration of healths where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationOfHealthModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp declaration of healths
	 * @param end the upper bound of the range of temp declaration of healths (not inclusive)
	 * @return the range of matching temp declaration of healths
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDeclarationOfHealth> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findBydocumentNameAnddocumentYear(documentName, documentYear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp declaration of healths where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationOfHealthModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp declaration of healths
	 * @param end the upper bound of the range of temp declaration of healths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp declaration of healths
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDeclarationOfHealth> findBydocumentNameAnddocumentYear(
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

		List<TempDeclarationOfHealth> list = (List<TempDeclarationOfHealth>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempDeclarationOfHealth tempDeclarationOfHealth : list) {
				if ((documentName != tempDeclarationOfHealth.getDocumentName()) ||
						(documentYear != tempDeclarationOfHealth.getDocumentYear())) {
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

			query.append(_SQL_SELECT_TEMPDECLARATIONOFHEALTH_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempDeclarationOfHealthModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempDeclarationOfHealth>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempDeclarationOfHealth>(list);
				}
				else {
					list = (List<TempDeclarationOfHealth>)QueryUtil.list(q,
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
	 * Returns the first temp declaration of health in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp declaration of health
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationOfHealthException if a matching temp declaration of health could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationOfHealth findBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempDeclarationOfHealthException, SystemException {
		TempDeclarationOfHealth tempDeclarationOfHealth = fetchBydocumentNameAnddocumentYear_First(documentName,
				documentYear, orderByComparator);

		if (tempDeclarationOfHealth != null) {
			return tempDeclarationOfHealth;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempDeclarationOfHealthException(msg.toString());
	}

	/**
	 * Returns the first temp declaration of health in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp declaration of health, or <code>null</code> if a matching temp declaration of health could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationOfHealth fetchBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		List<TempDeclarationOfHealth> list = findBydocumentNameAnddocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp declaration of health in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp declaration of health
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationOfHealthException if a matching temp declaration of health could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationOfHealth findBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempDeclarationOfHealthException, SystemException {
		TempDeclarationOfHealth tempDeclarationOfHealth = fetchBydocumentNameAnddocumentYear_Last(documentName,
				documentYear, orderByComparator);

		if (tempDeclarationOfHealth != null) {
			return tempDeclarationOfHealth;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempDeclarationOfHealthException(msg.toString());
	}

	/**
	 * Returns the last temp declaration of health in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp declaration of health, or <code>null</code> if a matching temp declaration of health could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationOfHealth fetchBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBydocumentNameAnddocumentYear(documentName,
				documentYear);

		if (count == 0) {
			return null;
		}

		List<TempDeclarationOfHealth> list = findBydocumentNameAnddocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp declaration of healths before and after the current temp declaration of health in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param id the primary key of the current temp declaration of health
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp declaration of health
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationOfHealthException if a temp declaration of health with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationOfHealth[] findBydocumentNameAnddocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchTempDeclarationOfHealthException, SystemException {
		TempDeclarationOfHealth tempDeclarationOfHealth = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempDeclarationOfHealth[] array = new TempDeclarationOfHealthImpl[3];

			array[0] = getBydocumentNameAnddocumentYear_PrevAndNext(session,
					tempDeclarationOfHealth, documentName, documentYear,
					orderByComparator, true);

			array[1] = tempDeclarationOfHealth;

			array[2] = getBydocumentNameAnddocumentYear_PrevAndNext(session,
					tempDeclarationOfHealth, documentName, documentYear,
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

	protected TempDeclarationOfHealth getBydocumentNameAnddocumentYear_PrevAndNext(
		Session session, TempDeclarationOfHealth tempDeclarationOfHealth,
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

		query.append(_SQL_SELECT_TEMPDECLARATIONOFHEALTH_WHERE);

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
			query.append(TempDeclarationOfHealthModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempDeclarationOfHealth);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempDeclarationOfHealth> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp declaration of healths where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBydocumentNameAnddocumentYear(long documentName,
		int documentYear) throws SystemException {
		for (TempDeclarationOfHealth tempDeclarationOfHealth : findBydocumentNameAnddocumentYear(
				documentName, documentYear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempDeclarationOfHealth);
		}
	}

	/**
	 * Returns the number of temp declaration of healths where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching temp declaration of healths
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

			query.append(_SQL_COUNT_TEMPDECLARATIONOFHEALTH_WHERE);

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
		"tempDeclarationOfHealth.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"tempDeclarationOfHealth.documentYear = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempDeclarationOfHealthModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationOfHealthModelImpl.FINDER_CACHE_ENABLED,
			TempDeclarationOfHealthImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempDeclarationOfHealthModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationOfHealthModelImpl.FINDER_CACHE_ENABLED,
			TempDeclarationOfHealthImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			TempDeclarationOfHealthModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempDeclarationOfHealthModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			TempDeclarationOfHealthModelImpl.REQUESTSTATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempDeclarationOfHealthModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationOfHealthModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the temp declaration of healths where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the matching temp declaration of healths
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDeclarationOfHealth> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		return findBydocumentNameAnddocumentYearRequestState(documentName,
			documentYear, requestState, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the temp declaration of healths where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationOfHealthModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp declaration of healths
	 * @param end the upper bound of the range of temp declaration of healths (not inclusive)
	 * @return the range of matching temp declaration of healths
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDeclarationOfHealth> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end) throws SystemException {
		return findBydocumentNameAnddocumentYearRequestState(documentName,
			documentYear, requestState, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp declaration of healths where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationOfHealthModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp declaration of healths
	 * @param end the upper bound of the range of temp declaration of healths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp declaration of healths
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDeclarationOfHealth> findBydocumentNameAnddocumentYearRequestState(
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

		List<TempDeclarationOfHealth> list = (List<TempDeclarationOfHealth>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempDeclarationOfHealth tempDeclarationOfHealth : list) {
				if ((documentName != tempDeclarationOfHealth.getDocumentName()) ||
						(documentYear != tempDeclarationOfHealth.getDocumentYear()) ||
						(requestState != tempDeclarationOfHealth.getRequestState())) {
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

			query.append(_SQL_SELECT_TEMPDECLARATIONOFHEALTH_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempDeclarationOfHealthModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempDeclarationOfHealth>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempDeclarationOfHealth>(list);
				}
				else {
					list = (List<TempDeclarationOfHealth>)QueryUtil.list(q,
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
	 * Returns the first temp declaration of health in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp declaration of health
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationOfHealthException if a matching temp declaration of health could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationOfHealth findBydocumentNameAnddocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempDeclarationOfHealthException, SystemException {
		TempDeclarationOfHealth tempDeclarationOfHealth = fetchBydocumentNameAnddocumentYearRequestState_First(documentName,
				documentYear, requestState, orderByComparator);

		if (tempDeclarationOfHealth != null) {
			return tempDeclarationOfHealth;
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

		throw new NoSuchTempDeclarationOfHealthException(msg.toString());
	}

	/**
	 * Returns the first temp declaration of health in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp declaration of health, or <code>null</code> if a matching temp declaration of health could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationOfHealth fetchBydocumentNameAnddocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempDeclarationOfHealth> list = findBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp declaration of health in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp declaration of health
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationOfHealthException if a matching temp declaration of health could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationOfHealth findBydocumentNameAnddocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempDeclarationOfHealthException, SystemException {
		TempDeclarationOfHealth tempDeclarationOfHealth = fetchBydocumentNameAnddocumentYearRequestState_Last(documentName,
				documentYear, requestState, orderByComparator);

		if (tempDeclarationOfHealth != null) {
			return tempDeclarationOfHealth;
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

		throw new NoSuchTempDeclarationOfHealthException(msg.toString());
	}

	/**
	 * Returns the last temp declaration of health in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp declaration of health, or <code>null</code> if a matching temp declaration of health could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationOfHealth fetchBydocumentNameAnddocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState);

		if (count == 0) {
			return null;
		}

		List<TempDeclarationOfHealth> list = findBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp declaration of healths before and after the current temp declaration of health in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param id the primary key of the current temp declaration of health
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp declaration of health
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationOfHealthException if a temp declaration of health with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationOfHealth[] findBydocumentNameAnddocumentYearRequestState_PrevAndNext(
		long id, long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempDeclarationOfHealthException, SystemException {
		TempDeclarationOfHealth tempDeclarationOfHealth = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempDeclarationOfHealth[] array = new TempDeclarationOfHealthImpl[3];

			array[0] = getBydocumentNameAnddocumentYearRequestState_PrevAndNext(session,
					tempDeclarationOfHealth, documentName, documentYear,
					requestState, orderByComparator, true);

			array[1] = tempDeclarationOfHealth;

			array[2] = getBydocumentNameAnddocumentYearRequestState_PrevAndNext(session,
					tempDeclarationOfHealth, documentName, documentYear,
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

	protected TempDeclarationOfHealth getBydocumentNameAnddocumentYearRequestState_PrevAndNext(
		Session session, TempDeclarationOfHealth tempDeclarationOfHealth,
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

		query.append(_SQL_SELECT_TEMPDECLARATIONOFHEALTH_WHERE);

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
			query.append(TempDeclarationOfHealthModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempDeclarationOfHealth);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempDeclarationOfHealth> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp declaration of healths where documentName = &#63; and documentYear = &#63; and requestState = &#63; from the database.
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
		for (TempDeclarationOfHealth tempDeclarationOfHealth : findBydocumentNameAnddocumentYearRequestState(
				documentName, documentYear, requestState, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempDeclarationOfHealth);
		}
	}

	/**
	 * Returns the number of temp declaration of healths where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the number of matching temp declaration of healths
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

			query.append(_SQL_COUNT_TEMPDECLARATIONOFHEALTH_WHERE);

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
		"tempDeclarationOfHealth.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2 =
		"tempDeclarationOfHealth.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2 =
		"tempDeclarationOfHealth.requestState = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempDeclarationOfHealthModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationOfHealthModelImpl.FINDER_CACHE_ENABLED,
			TempDeclarationOfHealthImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempDeclarationOfHealthModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationOfHealthModelImpl.FINDER_CACHE_ENABLED,
			TempDeclarationOfHealthImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempDeclarationOfHealthModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempDeclarationOfHealthModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationOfHealthModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the temp declaration of healths where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp declaration of healths
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDeclarationOfHealth> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp declaration of healths where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationOfHealthModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp declaration of healths
	 * @param end the upper bound of the range of temp declaration of healths (not inclusive)
	 * @return the range of matching temp declaration of healths
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDeclarationOfHealth> findByRequestCode(String requestCode,
		int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp declaration of healths where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationOfHealthModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp declaration of healths
	 * @param end the upper bound of the range of temp declaration of healths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp declaration of healths
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDeclarationOfHealth> findByRequestCode(String requestCode,
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

		List<TempDeclarationOfHealth> list = (List<TempDeclarationOfHealth>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempDeclarationOfHealth tempDeclarationOfHealth : list) {
				if (!Validator.equals(requestCode,
							tempDeclarationOfHealth.getRequestCode())) {
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

			query.append(_SQL_SELECT_TEMPDECLARATIONOFHEALTH_WHERE);

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
				query.append(TempDeclarationOfHealthModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempDeclarationOfHealth>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempDeclarationOfHealth>(list);
				}
				else {
					list = (List<TempDeclarationOfHealth>)QueryUtil.list(q,
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
	 * Returns the first temp declaration of health in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp declaration of health
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationOfHealthException if a matching temp declaration of health could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationOfHealth findByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempDeclarationOfHealthException, SystemException {
		TempDeclarationOfHealth tempDeclarationOfHealth = fetchByRequestCode_First(requestCode,
				orderByComparator);

		if (tempDeclarationOfHealth != null) {
			return tempDeclarationOfHealth;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempDeclarationOfHealthException(msg.toString());
	}

	/**
	 * Returns the first temp declaration of health in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp declaration of health, or <code>null</code> if a matching temp declaration of health could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationOfHealth fetchByRequestCode_First(
		String requestCode, OrderByComparator orderByComparator)
		throws SystemException {
		List<TempDeclarationOfHealth> list = findByRequestCode(requestCode, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp declaration of health in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp declaration of health
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationOfHealthException if a matching temp declaration of health could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationOfHealth findByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempDeclarationOfHealthException, SystemException {
		TempDeclarationOfHealth tempDeclarationOfHealth = fetchByRequestCode_Last(requestCode,
				orderByComparator);

		if (tempDeclarationOfHealth != null) {
			return tempDeclarationOfHealth;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempDeclarationOfHealthException(msg.toString());
	}

	/**
	 * Returns the last temp declaration of health in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp declaration of health, or <code>null</code> if a matching temp declaration of health could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationOfHealth fetchByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByRequestCode(requestCode);

		if (count == 0) {
			return null;
		}

		List<TempDeclarationOfHealth> list = findByRequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp declaration of healths before and after the current temp declaration of health in the ordered set where requestCode = &#63;.
	 *
	 * @param id the primary key of the current temp declaration of health
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp declaration of health
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationOfHealthException if a temp declaration of health with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationOfHealth[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempDeclarationOfHealthException, SystemException {
		TempDeclarationOfHealth tempDeclarationOfHealth = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempDeclarationOfHealth[] array = new TempDeclarationOfHealthImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session,
					tempDeclarationOfHealth, requestCode, orderByComparator,
					true);

			array[1] = tempDeclarationOfHealth;

			array[2] = getByRequestCode_PrevAndNext(session,
					tempDeclarationOfHealth, requestCode, orderByComparator,
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

	protected TempDeclarationOfHealth getByRequestCode_PrevAndNext(
		Session session, TempDeclarationOfHealth tempDeclarationOfHealth,
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

		query.append(_SQL_SELECT_TEMPDECLARATIONOFHEALTH_WHERE);

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
			query.append(TempDeclarationOfHealthModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempDeclarationOfHealth);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempDeclarationOfHealth> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp declaration of healths where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempDeclarationOfHealth tempDeclarationOfHealth : findByRequestCode(
				requestCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tempDeclarationOfHealth);
		}
	}

	/**
	 * Returns the number of temp declaration of healths where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp declaration of healths
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

			query.append(_SQL_COUNT_TEMPDECLARATIONOFHEALTH_WHERE);

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

	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempDeclarationOfHealth.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempDeclarationOfHealth.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempDeclarationOfHealth.requestCode IS NULL OR tempDeclarationOfHealth.requestCode = '')";

	public TempDeclarationOfHealthPersistenceImpl() {
		setModelClass(TempDeclarationOfHealth.class);
	}

	/**
	 * Caches the temp declaration of health in the entity cache if it is enabled.
	 *
	 * @param tempDeclarationOfHealth the temp declaration of health
	 */
	@Override
	public void cacheResult(TempDeclarationOfHealth tempDeclarationOfHealth) {
		EntityCacheUtil.putResult(TempDeclarationOfHealthModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationOfHealthImpl.class,
			tempDeclarationOfHealth.getPrimaryKey(), tempDeclarationOfHealth);

		tempDeclarationOfHealth.resetOriginalValues();
	}

	/**
	 * Caches the temp declaration of healths in the entity cache if it is enabled.
	 *
	 * @param tempDeclarationOfHealths the temp declaration of healths
	 */
	@Override
	public void cacheResult(
		List<TempDeclarationOfHealth> tempDeclarationOfHealths) {
		for (TempDeclarationOfHealth tempDeclarationOfHealth : tempDeclarationOfHealths) {
			if (EntityCacheUtil.getResult(
						TempDeclarationOfHealthModelImpl.ENTITY_CACHE_ENABLED,
						TempDeclarationOfHealthImpl.class,
						tempDeclarationOfHealth.getPrimaryKey()) == null) {
				cacheResult(tempDeclarationOfHealth);
			}
			else {
				tempDeclarationOfHealth.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp declaration of healths.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempDeclarationOfHealthImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempDeclarationOfHealthImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp declaration of health.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempDeclarationOfHealth tempDeclarationOfHealth) {
		EntityCacheUtil.removeResult(TempDeclarationOfHealthModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationOfHealthImpl.class,
			tempDeclarationOfHealth.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<TempDeclarationOfHealth> tempDeclarationOfHealths) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempDeclarationOfHealth tempDeclarationOfHealth : tempDeclarationOfHealths) {
			EntityCacheUtil.removeResult(TempDeclarationOfHealthModelImpl.ENTITY_CACHE_ENABLED,
				TempDeclarationOfHealthImpl.class,
				tempDeclarationOfHealth.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp declaration of health with the primary key. Does not add the temp declaration of health to the database.
	 *
	 * @param id the primary key for the new temp declaration of health
	 * @return the new temp declaration of health
	 */
	@Override
	public TempDeclarationOfHealth create(long id) {
		TempDeclarationOfHealth tempDeclarationOfHealth = new TempDeclarationOfHealthImpl();

		tempDeclarationOfHealth.setNew(true);
		tempDeclarationOfHealth.setPrimaryKey(id);

		return tempDeclarationOfHealth;
	}

	/**
	 * Removes the temp declaration of health with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp declaration of health
	 * @return the temp declaration of health that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationOfHealthException if a temp declaration of health with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationOfHealth remove(long id)
		throws NoSuchTempDeclarationOfHealthException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the temp declaration of health with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp declaration of health
	 * @return the temp declaration of health that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationOfHealthException if a temp declaration of health with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationOfHealth remove(Serializable primaryKey)
		throws NoSuchTempDeclarationOfHealthException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempDeclarationOfHealth tempDeclarationOfHealth = (TempDeclarationOfHealth)session.get(TempDeclarationOfHealthImpl.class,
					primaryKey);

			if (tempDeclarationOfHealth == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempDeclarationOfHealthException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempDeclarationOfHealth);
		}
		catch (NoSuchTempDeclarationOfHealthException nsee) {
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
	protected TempDeclarationOfHealth removeImpl(
		TempDeclarationOfHealth tempDeclarationOfHealth)
		throws SystemException {
		tempDeclarationOfHealth = toUnwrappedModel(tempDeclarationOfHealth);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tempDeclarationOfHealth)) {
				tempDeclarationOfHealth = (TempDeclarationOfHealth)session.get(TempDeclarationOfHealthImpl.class,
						tempDeclarationOfHealth.getPrimaryKeyObj());
			}

			if (tempDeclarationOfHealth != null) {
				session.delete(tempDeclarationOfHealth);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tempDeclarationOfHealth != null) {
			clearCache(tempDeclarationOfHealth);
		}

		return tempDeclarationOfHealth;
	}

	@Override
	public TempDeclarationOfHealth updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempDeclarationOfHealth tempDeclarationOfHealth)
		throws SystemException {
		tempDeclarationOfHealth = toUnwrappedModel(tempDeclarationOfHealth);

		boolean isNew = tempDeclarationOfHealth.isNew();

		TempDeclarationOfHealthModelImpl tempDeclarationOfHealthModelImpl = (TempDeclarationOfHealthModelImpl)tempDeclarationOfHealth;

		Session session = null;

		try {
			session = openSession();

			if (tempDeclarationOfHealth.isNew()) {
				session.save(tempDeclarationOfHealth);

				tempDeclarationOfHealth.setNew(false);
			}
			else {
				session.merge(tempDeclarationOfHealth);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TempDeclarationOfHealthModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempDeclarationOfHealthModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempDeclarationOfHealthModelImpl.getOriginalDocumentName(),
						tempDeclarationOfHealthModelImpl.getOriginalDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						tempDeclarationOfHealthModelImpl.getDocumentName(),
						tempDeclarationOfHealthModelImpl.getDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
			}

			if ((tempDeclarationOfHealthModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempDeclarationOfHealthModelImpl.getOriginalDocumentName(),
						tempDeclarationOfHealthModelImpl.getOriginalDocumentYear(),
						tempDeclarationOfHealthModelImpl.getOriginalRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);

				args = new Object[] {
						tempDeclarationOfHealthModelImpl.getDocumentName(),
						tempDeclarationOfHealthModelImpl.getDocumentYear(),
						tempDeclarationOfHealthModelImpl.getRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
			}

			if ((tempDeclarationOfHealthModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempDeclarationOfHealthModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] {
						tempDeclarationOfHealthModelImpl.getRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempDeclarationOfHealthModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationOfHealthImpl.class,
			tempDeclarationOfHealth.getPrimaryKey(), tempDeclarationOfHealth);

		return tempDeclarationOfHealth;
	}

	protected TempDeclarationOfHealth toUnwrappedModel(
		TempDeclarationOfHealth tempDeclarationOfHealth) {
		if (tempDeclarationOfHealth instanceof TempDeclarationOfHealthImpl) {
			return tempDeclarationOfHealth;
		}

		TempDeclarationOfHealthImpl tempDeclarationOfHealthImpl = new TempDeclarationOfHealthImpl();

		tempDeclarationOfHealthImpl.setNew(tempDeclarationOfHealth.isNew());
		tempDeclarationOfHealthImpl.setPrimaryKey(tempDeclarationOfHealth.getPrimaryKey());

		tempDeclarationOfHealthImpl.setId(tempDeclarationOfHealth.getId());
		tempDeclarationOfHealthImpl.setRequestCode(tempDeclarationOfHealth.getRequestCode());
		tempDeclarationOfHealthImpl.setRequestState(tempDeclarationOfHealth.getRequestState());
		tempDeclarationOfHealthImpl.setDocumentName(tempDeclarationOfHealth.getDocumentName());
		tempDeclarationOfHealthImpl.setDocumentYear(tempDeclarationOfHealth.getDocumentYear());
		tempDeclarationOfHealthImpl.setUserCreated(tempDeclarationOfHealth.getUserCreated());
		tempDeclarationOfHealthImpl.setSubmittedPortCode(tempDeclarationOfHealth.getSubmittedPortCode());
		tempDeclarationOfHealthImpl.setDateSubmitted(tempDeclarationOfHealth.getDateSubmitted());
		tempDeclarationOfHealthImpl.setNameOfShip(tempDeclarationOfHealth.getNameOfShip());
		tempDeclarationOfHealthImpl.setRegistration(tempDeclarationOfHealth.getRegistration());
		tempDeclarationOfHealthImpl.setImoNumber(tempDeclarationOfHealth.getImoNumber());
		tempDeclarationOfHealthImpl.setArrivingFrom(tempDeclarationOfHealth.getArrivingFrom());
		tempDeclarationOfHealthImpl.setSailingTo(tempDeclarationOfHealth.getSailingTo());
		tempDeclarationOfHealthImpl.setNationality(tempDeclarationOfHealth.getNationality());
		tempDeclarationOfHealthImpl.setMasterName(tempDeclarationOfHealth.getMasterName());
		tempDeclarationOfHealthImpl.setGrossTonnage(tempDeclarationOfHealth.getGrossTonnage());
		tempDeclarationOfHealthImpl.setGrossTonnageUnit(tempDeclarationOfHealth.getGrossTonnageUnit());
		tempDeclarationOfHealthImpl.setTonnage(tempDeclarationOfHealth.getTonnage());
		tempDeclarationOfHealthImpl.setTonnageUnit(tempDeclarationOfHealth.getTonnageUnit());
		tempDeclarationOfHealthImpl.setCertificatecarried(tempDeclarationOfHealth.getCertificatecarried());
		tempDeclarationOfHealthImpl.setIssuedAt(tempDeclarationOfHealth.getIssuedAt());
		tempDeclarationOfHealthImpl.setIssueDate(tempDeclarationOfHealth.getIssueDate());
		tempDeclarationOfHealthImpl.setReInspectionrequired(tempDeclarationOfHealth.getReInspectionrequired());
		tempDeclarationOfHealthImpl.setIsShipVisitedWHO(tempDeclarationOfHealth.getIsShipVisitedWHO());
		tempDeclarationOfHealthImpl.setVisitedWHOPortCode(tempDeclarationOfHealth.getVisitedWHOPortCode());
		tempDeclarationOfHealthImpl.setDateOfVisitedWHO(tempDeclarationOfHealth.getDateOfVisitedWHO());
		tempDeclarationOfHealthImpl.setListPortName(tempDeclarationOfHealth.getListPortName());
		tempDeclarationOfHealthImpl.setDoctorName(tempDeclarationOfHealth.getDoctorName());
		tempDeclarationOfHealthImpl.setDoctorSigndate(tempDeclarationOfHealth.getDoctorSigndate());
		tempDeclarationOfHealthImpl.setSignPlace(tempDeclarationOfHealth.getSignPlace());
		tempDeclarationOfHealthImpl.setSignDate(tempDeclarationOfHealth.getSignDate());
		tempDeclarationOfHealthImpl.setMasterSigned(tempDeclarationOfHealth.getMasterSigned());
		tempDeclarationOfHealthImpl.setMasterSignedImage(tempDeclarationOfHealth.getMasterSignedImage());
		tempDeclarationOfHealthImpl.setAttachedFile(tempDeclarationOfHealth.getAttachedFile());

		return tempDeclarationOfHealthImpl;
	}

	/**
	 * Returns the temp declaration of health with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp declaration of health
	 * @return the temp declaration of health
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationOfHealthException if a temp declaration of health with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationOfHealth findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTempDeclarationOfHealthException, SystemException {
		TempDeclarationOfHealth tempDeclarationOfHealth = fetchByPrimaryKey(primaryKey);

		if (tempDeclarationOfHealth == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTempDeclarationOfHealthException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tempDeclarationOfHealth;
	}

	/**
	 * Returns the temp declaration of health with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationOfHealthException} if it could not be found.
	 *
	 * @param id the primary key of the temp declaration of health
	 * @return the temp declaration of health
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationOfHealthException if a temp declaration of health with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationOfHealth findByPrimaryKey(long id)
		throws NoSuchTempDeclarationOfHealthException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the temp declaration of health with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp declaration of health
	 * @return the temp declaration of health, or <code>null</code> if a temp declaration of health with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationOfHealth fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TempDeclarationOfHealth tempDeclarationOfHealth = (TempDeclarationOfHealth)EntityCacheUtil.getResult(TempDeclarationOfHealthModelImpl.ENTITY_CACHE_ENABLED,
				TempDeclarationOfHealthImpl.class, primaryKey);

		if (tempDeclarationOfHealth == _nullTempDeclarationOfHealth) {
			return null;
		}

		if (tempDeclarationOfHealth == null) {
			Session session = null;

			try {
				session = openSession();

				tempDeclarationOfHealth = (TempDeclarationOfHealth)session.get(TempDeclarationOfHealthImpl.class,
						primaryKey);

				if (tempDeclarationOfHealth != null) {
					cacheResult(tempDeclarationOfHealth);
				}
				else {
					EntityCacheUtil.putResult(TempDeclarationOfHealthModelImpl.ENTITY_CACHE_ENABLED,
						TempDeclarationOfHealthImpl.class, primaryKey,
						_nullTempDeclarationOfHealth);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TempDeclarationOfHealthModelImpl.ENTITY_CACHE_ENABLED,
					TempDeclarationOfHealthImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tempDeclarationOfHealth;
	}

	/**
	 * Returns the temp declaration of health with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp declaration of health
	 * @return the temp declaration of health, or <code>null</code> if a temp declaration of health with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationOfHealth fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the temp declaration of healths.
	 *
	 * @return the temp declaration of healths
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDeclarationOfHealth> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp declaration of healths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationOfHealthModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp declaration of healths
	 * @param end the upper bound of the range of temp declaration of healths (not inclusive)
	 * @return the range of temp declaration of healths
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDeclarationOfHealth> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp declaration of healths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationOfHealthModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp declaration of healths
	 * @param end the upper bound of the range of temp declaration of healths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp declaration of healths
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDeclarationOfHealth> findAll(int start, int end,
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

		List<TempDeclarationOfHealth> list = (List<TempDeclarationOfHealth>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPDECLARATIONOFHEALTH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPDECLARATIONOFHEALTH;

				if (pagination) {
					sql = sql.concat(TempDeclarationOfHealthModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TempDeclarationOfHealth>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempDeclarationOfHealth>(list);
				}
				else {
					list = (List<TempDeclarationOfHealth>)QueryUtil.list(q,
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
	 * Removes all the temp declaration of healths from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TempDeclarationOfHealth tempDeclarationOfHealth : findAll()) {
			remove(tempDeclarationOfHealth);
		}
	}

	/**
	 * Returns the number of temp declaration of healths.
	 *
	 * @return the number of temp declaration of healths
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

				Query q = session.createQuery(_SQL_COUNT_TEMPDECLARATIONOFHEALTH);

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
	 * Initializes the temp declaration of health persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.TempDeclarationOfHealth")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempDeclarationOfHealth>> listenersList = new ArrayList<ModelListener<TempDeclarationOfHealth>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempDeclarationOfHealth>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempDeclarationOfHealthImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TEMPDECLARATIONOFHEALTH = "SELECT tempDeclarationOfHealth FROM TempDeclarationOfHealth tempDeclarationOfHealth";
	private static final String _SQL_SELECT_TEMPDECLARATIONOFHEALTH_WHERE = "SELECT tempDeclarationOfHealth FROM TempDeclarationOfHealth tempDeclarationOfHealth WHERE ";
	private static final String _SQL_COUNT_TEMPDECLARATIONOFHEALTH = "SELECT COUNT(tempDeclarationOfHealth) FROM TempDeclarationOfHealth tempDeclarationOfHealth";
	private static final String _SQL_COUNT_TEMPDECLARATIONOFHEALTH_WHERE = "SELECT COUNT(tempDeclarationOfHealth) FROM TempDeclarationOfHealth tempDeclarationOfHealth WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempDeclarationOfHealth.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempDeclarationOfHealth exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempDeclarationOfHealth exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempDeclarationOfHealthPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "requestState", "documentName",
				"documentYear", "userCreated", "submittedPortCode",
				"dateSubmitted", "nameOfShip", "registration", "imoNumber",
				"arrivingFrom", "sailingTo", "nationality", "masterName",
				"grossTonnage", "grossTonnageUnit", "tonnage", "tonnageUnit",
				"certificatecarried", "issuedAt", "issueDate",
				"reInspectionrequired", "isShipVisitedWHO", "visitedWHOPortCode",
				"dateOfVisitedWHO", "listPortName", "doctorName",
				"doctorSigndate", "signPlace", "signDate", "masterSigned",
				"masterSignedImage", "attachedFile"
			});
	private static TempDeclarationOfHealth _nullTempDeclarationOfHealth = new TempDeclarationOfHealthImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempDeclarationOfHealth> toCacheModel() {
				return _nullTempDeclarationOfHealthCacheModel;
			}
		};

	private static CacheModel<TempDeclarationOfHealth> _nullTempDeclarationOfHealthCacheModel =
		new CacheModel<TempDeclarationOfHealth>() {
			@Override
			public TempDeclarationOfHealth toEntityModel() {
				return _nullTempDeclarationOfHealth;
			}
		};
}