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

import vn.dtt.duongbien.dao.vrcb.NoSuchTempGeneralDeclarationException;
import vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempGeneralDeclarationImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempGeneralDeclarationModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the temp general declaration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempGeneralDeclarationPersistence
 * @see TempGeneralDeclarationUtil
 * @generated
 */
public class TempGeneralDeclarationPersistenceImpl extends BasePersistenceImpl<TempGeneralDeclaration>
	implements TempGeneralDeclarationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempGeneralDeclarationUtil} to access the temp general declaration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempGeneralDeclarationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempGeneralDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempGeneralDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempGeneralDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDocumentNameAndDocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempGeneralDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDocumentNameAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			TempGeneralDeclarationModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempGeneralDeclarationModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocumentNameAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the temp general declarations where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempGeneralDeclaration> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findByDocumentNameAndDocumentYear(documentName, documentYear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp general declarations where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempGeneralDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp general declarations
	 * @param end the upper bound of the range of temp general declarations (not inclusive)
	 * @return the range of matching temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempGeneralDeclaration> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findByDocumentNameAndDocumentYear(documentName, documentYear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp general declarations where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempGeneralDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp general declarations
	 * @param end the upper bound of the range of temp general declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempGeneralDeclaration> findByDocumentNameAndDocumentYear(
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

		List<TempGeneralDeclaration> list = (List<TempGeneralDeclaration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempGeneralDeclaration tempGeneralDeclaration : list) {
				if ((documentName != tempGeneralDeclaration.getDocumentName()) ||
						(documentYear != tempGeneralDeclaration.getDocumentYear())) {
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

			query.append(_SQL_SELECT_TEMPGENERALDECLARATION_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempGeneralDeclarationModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempGeneralDeclaration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempGeneralDeclaration>(list);
				}
				else {
					list = (List<TempGeneralDeclaration>)QueryUtil.list(q,
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
	 * Returns the first temp general declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp general declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempGeneralDeclarationException if a matching temp general declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGeneralDeclaration findByDocumentNameAndDocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempGeneralDeclarationException, SystemException {
		TempGeneralDeclaration tempGeneralDeclaration = fetchByDocumentNameAndDocumentYear_First(documentName,
				documentYear, orderByComparator);

		if (tempGeneralDeclaration != null) {
			return tempGeneralDeclaration;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempGeneralDeclarationException(msg.toString());
	}

	/**
	 * Returns the first temp general declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp general declaration, or <code>null</code> if a matching temp general declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGeneralDeclaration fetchByDocumentNameAndDocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		List<TempGeneralDeclaration> list = findByDocumentNameAndDocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp general declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp general declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempGeneralDeclarationException if a matching temp general declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGeneralDeclaration findByDocumentNameAndDocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempGeneralDeclarationException, SystemException {
		TempGeneralDeclaration tempGeneralDeclaration = fetchByDocumentNameAndDocumentYear_Last(documentName,
				documentYear, orderByComparator);

		if (tempGeneralDeclaration != null) {
			return tempGeneralDeclaration;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempGeneralDeclarationException(msg.toString());
	}

	/**
	 * Returns the last temp general declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp general declaration, or <code>null</code> if a matching temp general declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGeneralDeclaration fetchByDocumentNameAndDocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByDocumentNameAndDocumentYear(documentName,
				documentYear);

		if (count == 0) {
			return null;
		}

		List<TempGeneralDeclaration> list = findByDocumentNameAndDocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp general declarations before and after the current temp general declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param id the primary key of the current temp general declaration
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp general declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempGeneralDeclarationException if a temp general declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGeneralDeclaration[] findByDocumentNameAndDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchTempGeneralDeclarationException, SystemException {
		TempGeneralDeclaration tempGeneralDeclaration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempGeneralDeclaration[] array = new TempGeneralDeclarationImpl[3];

			array[0] = getByDocumentNameAndDocumentYear_PrevAndNext(session,
					tempGeneralDeclaration, documentName, documentYear,
					orderByComparator, true);

			array[1] = tempGeneralDeclaration;

			array[2] = getByDocumentNameAndDocumentYear_PrevAndNext(session,
					tempGeneralDeclaration, documentName, documentYear,
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

	protected TempGeneralDeclaration getByDocumentNameAndDocumentYear_PrevAndNext(
		Session session, TempGeneralDeclaration tempGeneralDeclaration,
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

		query.append(_SQL_SELECT_TEMPGENERALDECLARATION_WHERE);

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
			query.append(TempGeneralDeclarationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempGeneralDeclaration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempGeneralDeclaration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp general declarations where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDocumentNameAndDocumentYear(long documentName,
		int documentYear) throws SystemException {
		for (TempGeneralDeclaration tempGeneralDeclaration : findByDocumentNameAndDocumentYear(
				documentName, documentYear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempGeneralDeclaration);
		}
	}

	/**
	 * Returns the number of temp general declarations where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDocumentNameAndDocumentYear(long documentName,
		int documentYear) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR;

		Object[] finderArgs = new Object[] { documentName, documentYear };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TEMPGENERALDECLARATION_WHERE);

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
		"tempGeneralDeclaration.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"tempGeneralDeclaration.documentYear = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempGeneralDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDocumentNameAndDocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempGeneralDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDocumentNameAndDocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			TempGeneralDeclarationModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempGeneralDeclarationModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			TempGeneralDeclarationModelImpl.REQUESTSTATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocumentNameAndDocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the temp general declarations where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the matching temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempGeneralDeclaration> findByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		return findByDocumentNameAndDocumentYearRequestState(documentName,
			documentYear, requestState, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the temp general declarations where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempGeneralDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp general declarations
	 * @param end the upper bound of the range of temp general declarations (not inclusive)
	 * @return the range of matching temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempGeneralDeclaration> findByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end) throws SystemException {
		return findByDocumentNameAndDocumentYearRequestState(documentName,
			documentYear, requestState, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp general declarations where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempGeneralDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp general declarations
	 * @param end the upper bound of the range of temp general declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempGeneralDeclaration> findByDocumentNameAndDocumentYearRequestState(
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

		List<TempGeneralDeclaration> list = (List<TempGeneralDeclaration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempGeneralDeclaration tempGeneralDeclaration : list) {
				if ((documentName != tempGeneralDeclaration.getDocumentName()) ||
						(documentYear != tempGeneralDeclaration.getDocumentYear()) ||
						(requestState != tempGeneralDeclaration.getRequestState())) {
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

			query.append(_SQL_SELECT_TEMPGENERALDECLARATION_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempGeneralDeclarationModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempGeneralDeclaration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempGeneralDeclaration>(list);
				}
				else {
					list = (List<TempGeneralDeclaration>)QueryUtil.list(q,
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
	 * Returns the first temp general declaration in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp general declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempGeneralDeclarationException if a matching temp general declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGeneralDeclaration findByDocumentNameAndDocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempGeneralDeclarationException, SystemException {
		TempGeneralDeclaration tempGeneralDeclaration = fetchByDocumentNameAndDocumentYearRequestState_First(documentName,
				documentYear, requestState, orderByComparator);

		if (tempGeneralDeclaration != null) {
			return tempGeneralDeclaration;
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

		throw new NoSuchTempGeneralDeclarationException(msg.toString());
	}

	/**
	 * Returns the first temp general declaration in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp general declaration, or <code>null</code> if a matching temp general declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGeneralDeclaration fetchByDocumentNameAndDocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempGeneralDeclaration> list = findByDocumentNameAndDocumentYearRequestState(documentName,
				documentYear, requestState, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp general declaration in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp general declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempGeneralDeclarationException if a matching temp general declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGeneralDeclaration findByDocumentNameAndDocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempGeneralDeclarationException, SystemException {
		TempGeneralDeclaration tempGeneralDeclaration = fetchByDocumentNameAndDocumentYearRequestState_Last(documentName,
				documentYear, requestState, orderByComparator);

		if (tempGeneralDeclaration != null) {
			return tempGeneralDeclaration;
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

		throw new NoSuchTempGeneralDeclarationException(msg.toString());
	}

	/**
	 * Returns the last temp general declaration in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp general declaration, or <code>null</code> if a matching temp general declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGeneralDeclaration fetchByDocumentNameAndDocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDocumentNameAndDocumentYearRequestState(documentName,
				documentYear, requestState);

		if (count == 0) {
			return null;
		}

		List<TempGeneralDeclaration> list = findByDocumentNameAndDocumentYearRequestState(documentName,
				documentYear, requestState, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp general declarations before and after the current temp general declaration in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param id the primary key of the current temp general declaration
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp general declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempGeneralDeclarationException if a temp general declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGeneralDeclaration[] findByDocumentNameAndDocumentYearRequestState_PrevAndNext(
		long id, long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempGeneralDeclarationException, SystemException {
		TempGeneralDeclaration tempGeneralDeclaration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempGeneralDeclaration[] array = new TempGeneralDeclarationImpl[3];

			array[0] = getByDocumentNameAndDocumentYearRequestState_PrevAndNext(session,
					tempGeneralDeclaration, documentName, documentYear,
					requestState, orderByComparator, true);

			array[1] = tempGeneralDeclaration;

			array[2] = getByDocumentNameAndDocumentYearRequestState_PrevAndNext(session,
					tempGeneralDeclaration, documentName, documentYear,
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

	protected TempGeneralDeclaration getByDocumentNameAndDocumentYearRequestState_PrevAndNext(
		Session session, TempGeneralDeclaration tempGeneralDeclaration,
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

		query.append(_SQL_SELECT_TEMPGENERALDECLARATION_WHERE);

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
			query.append(TempGeneralDeclarationModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempGeneralDeclaration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempGeneralDeclaration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp general declarations where documentName = &#63; and documentYear = &#63; and requestState = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		for (TempGeneralDeclaration tempGeneralDeclaration : findByDocumentNameAndDocumentYearRequestState(
				documentName, documentYear, requestState, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempGeneralDeclaration);
		}
	}

	/**
	 * Returns the number of temp general declarations where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the number of matching temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDocumentNameAndDocumentYearRequestState(
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

			query.append(_SQL_COUNT_TEMPGENERALDECLARATION_WHERE);

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
		"tempGeneralDeclaration.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2 =
		"tempGeneralDeclaration.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2 =
		"tempGeneralDeclaration.requestState = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempGeneralDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempGeneralDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempGeneralDeclarationModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the temp general declarations where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempGeneralDeclaration> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp general declarations where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempGeneralDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp general declarations
	 * @param end the upper bound of the range of temp general declarations (not inclusive)
	 * @return the range of matching temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempGeneralDeclaration> findByRequestCode(String requestCode,
		int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp general declarations where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempGeneralDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp general declarations
	 * @param end the upper bound of the range of temp general declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempGeneralDeclaration> findByRequestCode(String requestCode,
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

		List<TempGeneralDeclaration> list = (List<TempGeneralDeclaration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempGeneralDeclaration tempGeneralDeclaration : list) {
				if (!Validator.equals(requestCode,
							tempGeneralDeclaration.getRequestCode())) {
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

			query.append(_SQL_SELECT_TEMPGENERALDECLARATION_WHERE);

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
				query.append(TempGeneralDeclarationModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempGeneralDeclaration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempGeneralDeclaration>(list);
				}
				else {
					list = (List<TempGeneralDeclaration>)QueryUtil.list(q,
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
	 * Returns the first temp general declaration in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp general declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempGeneralDeclarationException if a matching temp general declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGeneralDeclaration findByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempGeneralDeclarationException, SystemException {
		TempGeneralDeclaration tempGeneralDeclaration = fetchByRequestCode_First(requestCode,
				orderByComparator);

		if (tempGeneralDeclaration != null) {
			return tempGeneralDeclaration;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempGeneralDeclarationException(msg.toString());
	}

	/**
	 * Returns the first temp general declaration in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp general declaration, or <code>null</code> if a matching temp general declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGeneralDeclaration fetchByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempGeneralDeclaration> list = findByRequestCode(requestCode, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp general declaration in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp general declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempGeneralDeclarationException if a matching temp general declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGeneralDeclaration findByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempGeneralDeclarationException, SystemException {
		TempGeneralDeclaration tempGeneralDeclaration = fetchByRequestCode_Last(requestCode,
				orderByComparator);

		if (tempGeneralDeclaration != null) {
			return tempGeneralDeclaration;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempGeneralDeclarationException(msg.toString());
	}

	/**
	 * Returns the last temp general declaration in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp general declaration, or <code>null</code> if a matching temp general declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGeneralDeclaration fetchByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByRequestCode(requestCode);

		if (count == 0) {
			return null;
		}

		List<TempGeneralDeclaration> list = findByRequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp general declarations before and after the current temp general declaration in the ordered set where requestCode = &#63;.
	 *
	 * @param id the primary key of the current temp general declaration
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp general declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempGeneralDeclarationException if a temp general declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGeneralDeclaration[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempGeneralDeclarationException, SystemException {
		TempGeneralDeclaration tempGeneralDeclaration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempGeneralDeclaration[] array = new TempGeneralDeclarationImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session,
					tempGeneralDeclaration, requestCode, orderByComparator, true);

			array[1] = tempGeneralDeclaration;

			array[2] = getByRequestCode_PrevAndNext(session,
					tempGeneralDeclaration, requestCode, orderByComparator,
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

	protected TempGeneralDeclaration getByRequestCode_PrevAndNext(
		Session session, TempGeneralDeclaration tempGeneralDeclaration,
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

		query.append(_SQL_SELECT_TEMPGENERALDECLARATION_WHERE);

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
			query.append(TempGeneralDeclarationModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempGeneralDeclaration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempGeneralDeclaration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp general declarations where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempGeneralDeclaration tempGeneralDeclaration : findByRequestCode(
				requestCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tempGeneralDeclaration);
		}
	}

	/**
	 * Returns the number of temp general declarations where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp general declarations
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

			query.append(_SQL_COUNT_TEMPGENERALDECLARATION_WHERE);

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

	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempGeneralDeclaration.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempGeneralDeclaration.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempGeneralDeclaration.requestCode IS NULL OR tempGeneralDeclaration.requestCode = '')";

	public TempGeneralDeclarationPersistenceImpl() {
		setModelClass(TempGeneralDeclaration.class);
	}

	/**
	 * Caches the temp general declaration in the entity cache if it is enabled.
	 *
	 * @param tempGeneralDeclaration the temp general declaration
	 */
	@Override
	public void cacheResult(TempGeneralDeclaration tempGeneralDeclaration) {
		EntityCacheUtil.putResult(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationImpl.class,
			tempGeneralDeclaration.getPrimaryKey(), tempGeneralDeclaration);

		tempGeneralDeclaration.resetOriginalValues();
	}

	/**
	 * Caches the temp general declarations in the entity cache if it is enabled.
	 *
	 * @param tempGeneralDeclarations the temp general declarations
	 */
	@Override
	public void cacheResult(
		List<TempGeneralDeclaration> tempGeneralDeclarations) {
		for (TempGeneralDeclaration tempGeneralDeclaration : tempGeneralDeclarations) {
			if (EntityCacheUtil.getResult(
						TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
						TempGeneralDeclarationImpl.class,
						tempGeneralDeclaration.getPrimaryKey()) == null) {
				cacheResult(tempGeneralDeclaration);
			}
			else {
				tempGeneralDeclaration.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp general declarations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempGeneralDeclarationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempGeneralDeclarationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp general declaration.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempGeneralDeclaration tempGeneralDeclaration) {
		EntityCacheUtil.removeResult(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationImpl.class,
			tempGeneralDeclaration.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TempGeneralDeclaration> tempGeneralDeclarations) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempGeneralDeclaration tempGeneralDeclaration : tempGeneralDeclarations) {
			EntityCacheUtil.removeResult(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
				TempGeneralDeclarationImpl.class,
				tempGeneralDeclaration.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp general declaration with the primary key. Does not add the temp general declaration to the database.
	 *
	 * @param id the primary key for the new temp general declaration
	 * @return the new temp general declaration
	 */
	@Override
	public TempGeneralDeclaration create(long id) {
		TempGeneralDeclaration tempGeneralDeclaration = new TempGeneralDeclarationImpl();

		tempGeneralDeclaration.setNew(true);
		tempGeneralDeclaration.setPrimaryKey(id);

		return tempGeneralDeclaration;
	}

	/**
	 * Removes the temp general declaration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp general declaration
	 * @return the temp general declaration that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempGeneralDeclarationException if a temp general declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGeneralDeclaration remove(long id)
		throws NoSuchTempGeneralDeclarationException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the temp general declaration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp general declaration
	 * @return the temp general declaration that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempGeneralDeclarationException if a temp general declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGeneralDeclaration remove(Serializable primaryKey)
		throws NoSuchTempGeneralDeclarationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempGeneralDeclaration tempGeneralDeclaration = (TempGeneralDeclaration)session.get(TempGeneralDeclarationImpl.class,
					primaryKey);

			if (tempGeneralDeclaration == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempGeneralDeclarationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempGeneralDeclaration);
		}
		catch (NoSuchTempGeneralDeclarationException nsee) {
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
	protected TempGeneralDeclaration removeImpl(
		TempGeneralDeclaration tempGeneralDeclaration)
		throws SystemException {
		tempGeneralDeclaration = toUnwrappedModel(tempGeneralDeclaration);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tempGeneralDeclaration)) {
				tempGeneralDeclaration = (TempGeneralDeclaration)session.get(TempGeneralDeclarationImpl.class,
						tempGeneralDeclaration.getPrimaryKeyObj());
			}

			if (tempGeneralDeclaration != null) {
				session.delete(tempGeneralDeclaration);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tempGeneralDeclaration != null) {
			clearCache(tempGeneralDeclaration);
		}

		return tempGeneralDeclaration;
	}

	@Override
	public TempGeneralDeclaration updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration tempGeneralDeclaration)
		throws SystemException {
		tempGeneralDeclaration = toUnwrappedModel(tempGeneralDeclaration);

		boolean isNew = tempGeneralDeclaration.isNew();

		TempGeneralDeclarationModelImpl tempGeneralDeclarationModelImpl = (TempGeneralDeclarationModelImpl)tempGeneralDeclaration;

		Session session = null;

		try {
			session = openSession();

			if (tempGeneralDeclaration.isNew()) {
				session.save(tempGeneralDeclaration);

				tempGeneralDeclaration.setNew(false);
			}
			else {
				session.merge(tempGeneralDeclaration);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TempGeneralDeclarationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempGeneralDeclarationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempGeneralDeclarationModelImpl.getOriginalDocumentName(),
						tempGeneralDeclarationModelImpl.getOriginalDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						tempGeneralDeclarationModelImpl.getDocumentName(),
						tempGeneralDeclarationModelImpl.getDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
			}

			if ((tempGeneralDeclarationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempGeneralDeclarationModelImpl.getOriginalDocumentName(),
						tempGeneralDeclarationModelImpl.getOriginalDocumentYear(),
						tempGeneralDeclarationModelImpl.getOriginalRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);

				args = new Object[] {
						tempGeneralDeclarationModelImpl.getDocumentName(),
						tempGeneralDeclarationModelImpl.getDocumentYear(),
						tempGeneralDeclarationModelImpl.getRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
			}

			if ((tempGeneralDeclarationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempGeneralDeclarationModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] {
						tempGeneralDeclarationModelImpl.getRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempGeneralDeclarationImpl.class,
			tempGeneralDeclaration.getPrimaryKey(), tempGeneralDeclaration);

		return tempGeneralDeclaration;
	}

	protected TempGeneralDeclaration toUnwrappedModel(
		TempGeneralDeclaration tempGeneralDeclaration) {
		if (tempGeneralDeclaration instanceof TempGeneralDeclarationImpl) {
			return tempGeneralDeclaration;
		}

		TempGeneralDeclarationImpl tempGeneralDeclarationImpl = new TempGeneralDeclarationImpl();

		tempGeneralDeclarationImpl.setNew(tempGeneralDeclaration.isNew());
		tempGeneralDeclarationImpl.setPrimaryKey(tempGeneralDeclaration.getPrimaryKey());

		tempGeneralDeclarationImpl.setId(tempGeneralDeclaration.getId());
		tempGeneralDeclarationImpl.setRequestCode(tempGeneralDeclaration.getRequestCode());
		tempGeneralDeclarationImpl.setRequestState(tempGeneralDeclaration.getRequestState());
		tempGeneralDeclarationImpl.setDocumentName(tempGeneralDeclaration.getDocumentName());
		tempGeneralDeclarationImpl.setDocumentYear(tempGeneralDeclaration.getDocumentYear());
		tempGeneralDeclarationImpl.setUserCreated(tempGeneralDeclaration.getUserCreated());
		tempGeneralDeclarationImpl.setIsArrival(tempGeneralDeclaration.getIsArrival());
		tempGeneralDeclarationImpl.setNameOfShip(tempGeneralDeclaration.getNameOfShip());
		tempGeneralDeclarationImpl.setShipTypeCode(tempGeneralDeclaration.getShipTypeCode());
		tempGeneralDeclarationImpl.setImoNumber(tempGeneralDeclaration.getImoNumber());
		tempGeneralDeclarationImpl.setCallSign(tempGeneralDeclaration.getCallSign());
		tempGeneralDeclarationImpl.setVoyageNumber(tempGeneralDeclaration.getVoyageNumber());
		tempGeneralDeclarationImpl.setPortOfArrivalCode(tempGeneralDeclaration.getPortOfArrivalCode());
		tempGeneralDeclarationImpl.setDateOfArrival(tempGeneralDeclaration.getDateOfArrival());
		tempGeneralDeclarationImpl.setPortHarbourCode(tempGeneralDeclaration.getPortHarbourCode());
		tempGeneralDeclarationImpl.setPortRegionCode(tempGeneralDeclaration.getPortRegionCode());
		tempGeneralDeclarationImpl.setPortWharfCode(tempGeneralDeclaration.getPortWharfCode());
		tempGeneralDeclarationImpl.setFlagStateOfShip(tempGeneralDeclaration.getFlagStateOfShip());
		tempGeneralDeclarationImpl.setNameOfMaster(tempGeneralDeclaration.getNameOfMaster());
		tempGeneralDeclarationImpl.setLastPortOfCallCode(tempGeneralDeclaration.getLastPortOfCallCode());
		tempGeneralDeclarationImpl.setCertificateOfRegistryNumber(tempGeneralDeclaration.getCertificateOfRegistryNumber());
		tempGeneralDeclarationImpl.setCertificateOfRegistryDate(tempGeneralDeclaration.getCertificateOfRegistryDate());
		tempGeneralDeclarationImpl.setCertificateOfRegistryPortName(tempGeneralDeclaration.getCertificateOfRegistryPortName());
		tempGeneralDeclarationImpl.setTaxCodeOfShipownersAgents(tempGeneralDeclaration.getTaxCodeOfShipownersAgents());
		tempGeneralDeclarationImpl.setNameOfShipownersAgents(tempGeneralDeclaration.getNameOfShipownersAgents());
		tempGeneralDeclarationImpl.setShipAgencyAddress(tempGeneralDeclaration.getShipAgencyAddress());
		tempGeneralDeclarationImpl.setShipAgencyPhone(tempGeneralDeclaration.getShipAgencyPhone());
		tempGeneralDeclarationImpl.setShipAgencyFax(tempGeneralDeclaration.getShipAgencyFax());
		tempGeneralDeclarationImpl.setShipAgencyEmail(tempGeneralDeclaration.getShipAgencyEmail());
		tempGeneralDeclarationImpl.setGrossTonnage(tempGeneralDeclaration.getGrossTonnage());
		tempGeneralDeclarationImpl.setNetTonnage(tempGeneralDeclaration.getNetTonnage());
		tempGeneralDeclarationImpl.setPositionOfShipInport(tempGeneralDeclaration.getPositionOfShipInport());
		tempGeneralDeclarationImpl.setBriefParticularsOfVoyage(tempGeneralDeclaration.getBriefParticularsOfVoyage());
		tempGeneralDeclarationImpl.setBriefDescriptionOfTheCargo(tempGeneralDeclaration.getBriefDescriptionOfTheCargo());
		tempGeneralDeclarationImpl.setNumberOfCrew(tempGeneralDeclaration.getNumberOfCrew());
		tempGeneralDeclarationImpl.setNumberOfPassengers(tempGeneralDeclaration.getNumberOfPassengers());
		tempGeneralDeclarationImpl.setShipRequirementsInTermsOfWaste(tempGeneralDeclaration.getShipRequirementsInTermsOfWaste());
		tempGeneralDeclarationImpl.setRemarks(tempGeneralDeclaration.getRemarks());
		tempGeneralDeclarationImpl.setNumberCargoDeclaration(tempGeneralDeclaration.getNumberCargoDeclaration());
		tempGeneralDeclarationImpl.setNumberShipStoreDeclaration(tempGeneralDeclaration.getNumberShipStoreDeclaration());
		tempGeneralDeclarationImpl.setNumberCrewList(tempGeneralDeclaration.getNumberCrewList());
		tempGeneralDeclarationImpl.setNumberPassengerList(tempGeneralDeclaration.getNumberPassengerList());
		tempGeneralDeclarationImpl.setNumberCrewEffects(tempGeneralDeclaration.getNumberCrewEffects());
		tempGeneralDeclarationImpl.setNumberHealthMaritime(tempGeneralDeclaration.getNumberHealthMaritime());
		tempGeneralDeclarationImpl.setSignPlace(tempGeneralDeclaration.getSignPlace());
		tempGeneralDeclarationImpl.setSignDate(tempGeneralDeclaration.getSignDate());
		tempGeneralDeclarationImpl.setMasterSigned(tempGeneralDeclaration.getMasterSigned());
		tempGeneralDeclarationImpl.setMasterSignedImage(tempGeneralDeclaration.getMasterSignedImage());

		return tempGeneralDeclarationImpl;
	}

	/**
	 * Returns the temp general declaration with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp general declaration
	 * @return the temp general declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempGeneralDeclarationException if a temp general declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGeneralDeclaration findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTempGeneralDeclarationException, SystemException {
		TempGeneralDeclaration tempGeneralDeclaration = fetchByPrimaryKey(primaryKey);

		if (tempGeneralDeclaration == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTempGeneralDeclarationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tempGeneralDeclaration;
	}

	/**
	 * Returns the temp general declaration with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempGeneralDeclarationException} if it could not be found.
	 *
	 * @param id the primary key of the temp general declaration
	 * @return the temp general declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempGeneralDeclarationException if a temp general declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGeneralDeclaration findByPrimaryKey(long id)
		throws NoSuchTempGeneralDeclarationException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the temp general declaration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp general declaration
	 * @return the temp general declaration, or <code>null</code> if a temp general declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGeneralDeclaration fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TempGeneralDeclaration tempGeneralDeclaration = (TempGeneralDeclaration)EntityCacheUtil.getResult(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
				TempGeneralDeclarationImpl.class, primaryKey);

		if (tempGeneralDeclaration == _nullTempGeneralDeclaration) {
			return null;
		}

		if (tempGeneralDeclaration == null) {
			Session session = null;

			try {
				session = openSession();

				tempGeneralDeclaration = (TempGeneralDeclaration)session.get(TempGeneralDeclarationImpl.class,
						primaryKey);

				if (tempGeneralDeclaration != null) {
					cacheResult(tempGeneralDeclaration);
				}
				else {
					EntityCacheUtil.putResult(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
						TempGeneralDeclarationImpl.class, primaryKey,
						_nullTempGeneralDeclaration);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TempGeneralDeclarationModelImpl.ENTITY_CACHE_ENABLED,
					TempGeneralDeclarationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tempGeneralDeclaration;
	}

	/**
	 * Returns the temp general declaration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp general declaration
	 * @return the temp general declaration, or <code>null</code> if a temp general declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempGeneralDeclaration fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the temp general declarations.
	 *
	 * @return the temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempGeneralDeclaration> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp general declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempGeneralDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp general declarations
	 * @param end the upper bound of the range of temp general declarations (not inclusive)
	 * @return the range of temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempGeneralDeclaration> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp general declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempGeneralDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp general declarations
	 * @param end the upper bound of the range of temp general declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp general declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempGeneralDeclaration> findAll(int start, int end,
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

		List<TempGeneralDeclaration> list = (List<TempGeneralDeclaration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPGENERALDECLARATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPGENERALDECLARATION;

				if (pagination) {
					sql = sql.concat(TempGeneralDeclarationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TempGeneralDeclaration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempGeneralDeclaration>(list);
				}
				else {
					list = (List<TempGeneralDeclaration>)QueryUtil.list(q,
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
	 * Removes all the temp general declarations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TempGeneralDeclaration tempGeneralDeclaration : findAll()) {
			remove(tempGeneralDeclaration);
		}
	}

	/**
	 * Returns the number of temp general declarations.
	 *
	 * @return the number of temp general declarations
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

				Query q = session.createQuery(_SQL_COUNT_TEMPGENERALDECLARATION);

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
	 * Initializes the temp general declaration persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempGeneralDeclaration>> listenersList = new ArrayList<ModelListener<TempGeneralDeclaration>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempGeneralDeclaration>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempGeneralDeclarationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TEMPGENERALDECLARATION = "SELECT tempGeneralDeclaration FROM TempGeneralDeclaration tempGeneralDeclaration";
	private static final String _SQL_SELECT_TEMPGENERALDECLARATION_WHERE = "SELECT tempGeneralDeclaration FROM TempGeneralDeclaration tempGeneralDeclaration WHERE ";
	private static final String _SQL_COUNT_TEMPGENERALDECLARATION = "SELECT COUNT(tempGeneralDeclaration) FROM TempGeneralDeclaration tempGeneralDeclaration";
	private static final String _SQL_COUNT_TEMPGENERALDECLARATION_WHERE = "SELECT COUNT(tempGeneralDeclaration) FROM TempGeneralDeclaration tempGeneralDeclaration WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempGeneralDeclaration.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempGeneralDeclaration exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempGeneralDeclaration exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempGeneralDeclarationPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "requestState", "documentName",
				"documentYear", "userCreated", "isArrival", "nameOfShip",
				"shipTypeCode", "imoNumber", "callSign", "voyageNumber",
				"portOfArrivalCode", "dateOfArrival", "portHarbourCode",
				"portRegionCode", "portWharfCode", "flagStateOfShip",
				"nameOfMaster", "lastPortOfCallCode",
				"certificateOfRegistryNumber", "certificateOfRegistryDate",
				"certificateOfRegistryPortName", "taxCodeOfShipownersAgents",
				"nameOfShipownersAgents", "shipAgencyAddress", "shipAgencyPhone",
				"shipAgencyFax", "shipAgencyEmail", "grossTonnage", "netTonnage",
				"positionOfShipInport", "briefParticularsOfVoyage",
				"briefDescriptionOfTheCargo", "numberOfCrew",
				"numberOfPassengers", "shipRequirementsInTermsOfWaste",
				"remarks", "numberCargoDeclaration",
				"numberShipStoreDeclaration", "numberCrewList",
				"numberPassengerList", "numberCrewEffects",
				"numberHealthMaritime", "signPlace", "signDate", "masterSigned",
				"masterSignedImage"
			});
	private static TempGeneralDeclaration _nullTempGeneralDeclaration = new TempGeneralDeclarationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempGeneralDeclaration> toCacheModel() {
				return _nullTempGeneralDeclarationCacheModel;
			}
		};

	private static CacheModel<TempGeneralDeclaration> _nullTempGeneralDeclarationCacheModel =
		new CacheModel<TempGeneralDeclaration>() {
			@Override
			public TempGeneralDeclaration toEntityModel() {
				return _nullTempGeneralDeclaration;
			}
		};
}