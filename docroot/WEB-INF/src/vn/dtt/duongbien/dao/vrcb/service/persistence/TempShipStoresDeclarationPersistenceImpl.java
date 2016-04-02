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

import vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresDeclarationException;
import vn.dtt.duongbien.dao.vrcb.model.TempShipStoresDeclaration;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempShipStoresDeclarationImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempShipStoresDeclarationModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the temp ship stores declaration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempShipStoresDeclarationPersistence
 * @see TempShipStoresDeclarationUtil
 * @generated
 */
public class TempShipStoresDeclarationPersistenceImpl
	extends BasePersistenceImpl<TempShipStoresDeclaration>
	implements TempShipStoresDeclarationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempShipStoresDeclarationUtil} to access the temp ship stores declaration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempShipStoresDeclarationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempShipStoresDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempShipStoresDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempShipStoresDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempShipStoresDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempShipStoresDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempShipStoresDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempShipStoresDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempShipStoresDeclarationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempShipStoresDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempShipStoresDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempShipStoresDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentNameAnddocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempShipStoresDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempShipStoresDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempShipStoresDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			TempShipStoresDeclarationModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempShipStoresDeclarationModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempShipStoresDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempShipStoresDeclarationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the temp ship stores declarations where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching temp ship stores declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipStoresDeclaration> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findBydocumentNameAnddocumentYear(documentName, documentYear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp ship stores declarations where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipStoresDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp ship stores declarations
	 * @param end the upper bound of the range of temp ship stores declarations (not inclusive)
	 * @return the range of matching temp ship stores declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipStoresDeclaration> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findBydocumentNameAnddocumentYear(documentName, documentYear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp ship stores declarations where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipStoresDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp ship stores declarations
	 * @param end the upper bound of the range of temp ship stores declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp ship stores declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipStoresDeclaration> findBydocumentNameAnddocumentYear(
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

		List<TempShipStoresDeclaration> list = (List<TempShipStoresDeclaration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempShipStoresDeclaration tempShipStoresDeclaration : list) {
				if ((documentName != tempShipStoresDeclaration.getDocumentName()) ||
						(documentYear != tempShipStoresDeclaration.getDocumentYear())) {
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

			query.append(_SQL_SELECT_TEMPSHIPSTORESDECLARATION_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempShipStoresDeclarationModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempShipStoresDeclaration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempShipStoresDeclaration>(list);
				}
				else {
					list = (List<TempShipStoresDeclaration>)QueryUtil.list(q,
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
	 * Returns the first temp ship stores declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp ship stores declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresDeclarationException if a matching temp ship stores declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresDeclaration findBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempShipStoresDeclarationException, SystemException {
		TempShipStoresDeclaration tempShipStoresDeclaration = fetchBydocumentNameAnddocumentYear_First(documentName,
				documentYear, orderByComparator);

		if (tempShipStoresDeclaration != null) {
			return tempShipStoresDeclaration;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempShipStoresDeclarationException(msg.toString());
	}

	/**
	 * Returns the first temp ship stores declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp ship stores declaration, or <code>null</code> if a matching temp ship stores declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresDeclaration fetchBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		List<TempShipStoresDeclaration> list = findBydocumentNameAnddocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp ship stores declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp ship stores declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresDeclarationException if a matching temp ship stores declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresDeclaration findBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempShipStoresDeclarationException, SystemException {
		TempShipStoresDeclaration tempShipStoresDeclaration = fetchBydocumentNameAnddocumentYear_Last(documentName,
				documentYear, orderByComparator);

		if (tempShipStoresDeclaration != null) {
			return tempShipStoresDeclaration;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempShipStoresDeclarationException(msg.toString());
	}

	/**
	 * Returns the last temp ship stores declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp ship stores declaration, or <code>null</code> if a matching temp ship stores declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresDeclaration fetchBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBydocumentNameAnddocumentYear(documentName,
				documentYear);

		if (count == 0) {
			return null;
		}

		List<TempShipStoresDeclaration> list = findBydocumentNameAnddocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp ship stores declarations before and after the current temp ship stores declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param id the primary key of the current temp ship stores declaration
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp ship stores declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresDeclarationException if a temp ship stores declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresDeclaration[] findBydocumentNameAnddocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchTempShipStoresDeclarationException, SystemException {
		TempShipStoresDeclaration tempShipStoresDeclaration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempShipStoresDeclaration[] array = new TempShipStoresDeclarationImpl[3];

			array[0] = getBydocumentNameAnddocumentYear_PrevAndNext(session,
					tempShipStoresDeclaration, documentName, documentYear,
					orderByComparator, true);

			array[1] = tempShipStoresDeclaration;

			array[2] = getBydocumentNameAnddocumentYear_PrevAndNext(session,
					tempShipStoresDeclaration, documentName, documentYear,
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

	protected TempShipStoresDeclaration getBydocumentNameAnddocumentYear_PrevAndNext(
		Session session, TempShipStoresDeclaration tempShipStoresDeclaration,
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

		query.append(_SQL_SELECT_TEMPSHIPSTORESDECLARATION_WHERE);

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
			query.append(TempShipStoresDeclarationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempShipStoresDeclaration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempShipStoresDeclaration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp ship stores declarations where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBydocumentNameAnddocumentYear(long documentName,
		int documentYear) throws SystemException {
		for (TempShipStoresDeclaration tempShipStoresDeclaration : findBydocumentNameAnddocumentYear(
				documentName, documentYear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempShipStoresDeclaration);
		}
	}

	/**
	 * Returns the number of temp ship stores declarations where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching temp ship stores declarations
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

			query.append(_SQL_COUNT_TEMPSHIPSTORESDECLARATION_WHERE);

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
		"tempShipStoresDeclaration.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"tempShipStoresDeclaration.documentYear = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempShipStoresDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempShipStoresDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempShipStoresDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempShipStoresDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempShipStoresDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempShipStoresDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			TempShipStoresDeclarationModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempShipStoresDeclarationModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			TempShipStoresDeclarationModelImpl.REQUESTSTATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempShipStoresDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempShipStoresDeclarationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the temp ship stores declarations where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the matching temp ship stores declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipStoresDeclaration> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		return findBydocumentNameAnddocumentYearRequestState(documentName,
			documentYear, requestState, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the temp ship stores declarations where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipStoresDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp ship stores declarations
	 * @param end the upper bound of the range of temp ship stores declarations (not inclusive)
	 * @return the range of matching temp ship stores declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipStoresDeclaration> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end) throws SystemException {
		return findBydocumentNameAnddocumentYearRequestState(documentName,
			documentYear, requestState, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp ship stores declarations where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipStoresDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp ship stores declarations
	 * @param end the upper bound of the range of temp ship stores declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp ship stores declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipStoresDeclaration> findBydocumentNameAnddocumentYearRequestState(
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

		List<TempShipStoresDeclaration> list = (List<TempShipStoresDeclaration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempShipStoresDeclaration tempShipStoresDeclaration : list) {
				if ((documentName != tempShipStoresDeclaration.getDocumentName()) ||
						(documentYear != tempShipStoresDeclaration.getDocumentYear()) ||
						(requestState != tempShipStoresDeclaration.getRequestState())) {
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

			query.append(_SQL_SELECT_TEMPSHIPSTORESDECLARATION_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempShipStoresDeclarationModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempShipStoresDeclaration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempShipStoresDeclaration>(list);
				}
				else {
					list = (List<TempShipStoresDeclaration>)QueryUtil.list(q,
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
	 * Returns the first temp ship stores declaration in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp ship stores declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresDeclarationException if a matching temp ship stores declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresDeclaration findBydocumentNameAnddocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempShipStoresDeclarationException, SystemException {
		TempShipStoresDeclaration tempShipStoresDeclaration = fetchBydocumentNameAnddocumentYearRequestState_First(documentName,
				documentYear, requestState, orderByComparator);

		if (tempShipStoresDeclaration != null) {
			return tempShipStoresDeclaration;
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

		throw new NoSuchTempShipStoresDeclarationException(msg.toString());
	}

	/**
	 * Returns the first temp ship stores declaration in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp ship stores declaration, or <code>null</code> if a matching temp ship stores declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresDeclaration fetchBydocumentNameAnddocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempShipStoresDeclaration> list = findBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp ship stores declaration in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp ship stores declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresDeclarationException if a matching temp ship stores declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresDeclaration findBydocumentNameAnddocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempShipStoresDeclarationException, SystemException {
		TempShipStoresDeclaration tempShipStoresDeclaration = fetchBydocumentNameAnddocumentYearRequestState_Last(documentName,
				documentYear, requestState, orderByComparator);

		if (tempShipStoresDeclaration != null) {
			return tempShipStoresDeclaration;
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

		throw new NoSuchTempShipStoresDeclarationException(msg.toString());
	}

	/**
	 * Returns the last temp ship stores declaration in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp ship stores declaration, or <code>null</code> if a matching temp ship stores declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresDeclaration fetchBydocumentNameAnddocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState);

		if (count == 0) {
			return null;
		}

		List<TempShipStoresDeclaration> list = findBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp ship stores declarations before and after the current temp ship stores declaration in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param id the primary key of the current temp ship stores declaration
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp ship stores declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresDeclarationException if a temp ship stores declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresDeclaration[] findBydocumentNameAnddocumentYearRequestState_PrevAndNext(
		long id, long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempShipStoresDeclarationException, SystemException {
		TempShipStoresDeclaration tempShipStoresDeclaration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempShipStoresDeclaration[] array = new TempShipStoresDeclarationImpl[3];

			array[0] = getBydocumentNameAnddocumentYearRequestState_PrevAndNext(session,
					tempShipStoresDeclaration, documentName, documentYear,
					requestState, orderByComparator, true);

			array[1] = tempShipStoresDeclaration;

			array[2] = getBydocumentNameAnddocumentYearRequestState_PrevAndNext(session,
					tempShipStoresDeclaration, documentName, documentYear,
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

	protected TempShipStoresDeclaration getBydocumentNameAnddocumentYearRequestState_PrevAndNext(
		Session session, TempShipStoresDeclaration tempShipStoresDeclaration,
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

		query.append(_SQL_SELECT_TEMPSHIPSTORESDECLARATION_WHERE);

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
			query.append(TempShipStoresDeclarationModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempShipStoresDeclaration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempShipStoresDeclaration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp ship stores declarations where documentName = &#63; and documentYear = &#63; and requestState = &#63; from the database.
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
		for (TempShipStoresDeclaration tempShipStoresDeclaration : findBydocumentNameAnddocumentYearRequestState(
				documentName, documentYear, requestState, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempShipStoresDeclaration);
		}
	}

	/**
	 * Returns the number of temp ship stores declarations where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the number of matching temp ship stores declarations
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

			query.append(_SQL_COUNT_TEMPSHIPSTORESDECLARATION_WHERE);

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
		"tempShipStoresDeclaration.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2 =
		"tempShipStoresDeclaration.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2 =
		"tempShipStoresDeclaration.requestState = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempShipStoresDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempShipStoresDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempShipStoresDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempShipStoresDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempShipStoresDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempShipStoresDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempShipStoresDeclarationModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempShipStoresDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempShipStoresDeclarationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRequestCode", new String[] { String.class.getName() });

	/**
	 * Returns all the temp ship stores declarations where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp ship stores declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipStoresDeclaration> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp ship stores declarations where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipStoresDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp ship stores declarations
	 * @param end the upper bound of the range of temp ship stores declarations (not inclusive)
	 * @return the range of matching temp ship stores declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipStoresDeclaration> findByRequestCode(
		String requestCode, int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp ship stores declarations where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipStoresDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp ship stores declarations
	 * @param end the upper bound of the range of temp ship stores declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp ship stores declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipStoresDeclaration> findByRequestCode(
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

		List<TempShipStoresDeclaration> list = (List<TempShipStoresDeclaration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempShipStoresDeclaration tempShipStoresDeclaration : list) {
				if (!Validator.equals(requestCode,
							tempShipStoresDeclaration.getRequestCode())) {
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

			query.append(_SQL_SELECT_TEMPSHIPSTORESDECLARATION_WHERE);

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
				query.append(TempShipStoresDeclarationModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempShipStoresDeclaration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempShipStoresDeclaration>(list);
				}
				else {
					list = (List<TempShipStoresDeclaration>)QueryUtil.list(q,
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
	 * Returns the first temp ship stores declaration in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp ship stores declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresDeclarationException if a matching temp ship stores declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresDeclaration findByRequestCode_First(
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempShipStoresDeclarationException, SystemException {
		TempShipStoresDeclaration tempShipStoresDeclaration = fetchByRequestCode_First(requestCode,
				orderByComparator);

		if (tempShipStoresDeclaration != null) {
			return tempShipStoresDeclaration;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempShipStoresDeclarationException(msg.toString());
	}

	/**
	 * Returns the first temp ship stores declaration in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp ship stores declaration, or <code>null</code> if a matching temp ship stores declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresDeclaration fetchByRequestCode_First(
		String requestCode, OrderByComparator orderByComparator)
		throws SystemException {
		List<TempShipStoresDeclaration> list = findByRequestCode(requestCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp ship stores declaration in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp ship stores declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresDeclarationException if a matching temp ship stores declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresDeclaration findByRequestCode_Last(
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempShipStoresDeclarationException, SystemException {
		TempShipStoresDeclaration tempShipStoresDeclaration = fetchByRequestCode_Last(requestCode,
				orderByComparator);

		if (tempShipStoresDeclaration != null) {
			return tempShipStoresDeclaration;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempShipStoresDeclarationException(msg.toString());
	}

	/**
	 * Returns the last temp ship stores declaration in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp ship stores declaration, or <code>null</code> if a matching temp ship stores declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresDeclaration fetchByRequestCode_Last(
		String requestCode, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByRequestCode(requestCode);

		if (count == 0) {
			return null;
		}

		List<TempShipStoresDeclaration> list = findByRequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp ship stores declarations before and after the current temp ship stores declaration in the ordered set where requestCode = &#63;.
	 *
	 * @param id the primary key of the current temp ship stores declaration
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp ship stores declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresDeclarationException if a temp ship stores declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresDeclaration[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempShipStoresDeclarationException, SystemException {
		TempShipStoresDeclaration tempShipStoresDeclaration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempShipStoresDeclaration[] array = new TempShipStoresDeclarationImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session,
					tempShipStoresDeclaration, requestCode, orderByComparator,
					true);

			array[1] = tempShipStoresDeclaration;

			array[2] = getByRequestCode_PrevAndNext(session,
					tempShipStoresDeclaration, requestCode, orderByComparator,
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

	protected TempShipStoresDeclaration getByRequestCode_PrevAndNext(
		Session session, TempShipStoresDeclaration tempShipStoresDeclaration,
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

		query.append(_SQL_SELECT_TEMPSHIPSTORESDECLARATION_WHERE);

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
			query.append(TempShipStoresDeclarationModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempShipStoresDeclaration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempShipStoresDeclaration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp ship stores declarations where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempShipStoresDeclaration tempShipStoresDeclaration : findByRequestCode(
				requestCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tempShipStoresDeclaration);
		}
	}

	/**
	 * Returns the number of temp ship stores declarations where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp ship stores declarations
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

			query.append(_SQL_COUNT_TEMPSHIPSTORESDECLARATION_WHERE);

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

	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempShipStoresDeclaration.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempShipStoresDeclaration.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempShipStoresDeclaration.requestCode IS NULL OR tempShipStoresDeclaration.requestCode = '')";

	public TempShipStoresDeclarationPersistenceImpl() {
		setModelClass(TempShipStoresDeclaration.class);
	}

	/**
	 * Caches the temp ship stores declaration in the entity cache if it is enabled.
	 *
	 * @param tempShipStoresDeclaration the temp ship stores declaration
	 */
	@Override
	public void cacheResult(TempShipStoresDeclaration tempShipStoresDeclaration) {
		EntityCacheUtil.putResult(TempShipStoresDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempShipStoresDeclarationImpl.class,
			tempShipStoresDeclaration.getPrimaryKey(), tempShipStoresDeclaration);

		tempShipStoresDeclaration.resetOriginalValues();
	}

	/**
	 * Caches the temp ship stores declarations in the entity cache if it is enabled.
	 *
	 * @param tempShipStoresDeclarations the temp ship stores declarations
	 */
	@Override
	public void cacheResult(
		List<TempShipStoresDeclaration> tempShipStoresDeclarations) {
		for (TempShipStoresDeclaration tempShipStoresDeclaration : tempShipStoresDeclarations) {
			if (EntityCacheUtil.getResult(
						TempShipStoresDeclarationModelImpl.ENTITY_CACHE_ENABLED,
						TempShipStoresDeclarationImpl.class,
						tempShipStoresDeclaration.getPrimaryKey()) == null) {
				cacheResult(tempShipStoresDeclaration);
			}
			else {
				tempShipStoresDeclaration.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp ship stores declarations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempShipStoresDeclarationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempShipStoresDeclarationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp ship stores declaration.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempShipStoresDeclaration tempShipStoresDeclaration) {
		EntityCacheUtil.removeResult(TempShipStoresDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempShipStoresDeclarationImpl.class,
			tempShipStoresDeclaration.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<TempShipStoresDeclaration> tempShipStoresDeclarations) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempShipStoresDeclaration tempShipStoresDeclaration : tempShipStoresDeclarations) {
			EntityCacheUtil.removeResult(TempShipStoresDeclarationModelImpl.ENTITY_CACHE_ENABLED,
				TempShipStoresDeclarationImpl.class,
				tempShipStoresDeclaration.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp ship stores declaration with the primary key. Does not add the temp ship stores declaration to the database.
	 *
	 * @param id the primary key for the new temp ship stores declaration
	 * @return the new temp ship stores declaration
	 */
	@Override
	public TempShipStoresDeclaration create(long id) {
		TempShipStoresDeclaration tempShipStoresDeclaration = new TempShipStoresDeclarationImpl();

		tempShipStoresDeclaration.setNew(true);
		tempShipStoresDeclaration.setPrimaryKey(id);

		return tempShipStoresDeclaration;
	}

	/**
	 * Removes the temp ship stores declaration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp ship stores declaration
	 * @return the temp ship stores declaration that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresDeclarationException if a temp ship stores declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresDeclaration remove(long id)
		throws NoSuchTempShipStoresDeclarationException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the temp ship stores declaration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp ship stores declaration
	 * @return the temp ship stores declaration that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresDeclarationException if a temp ship stores declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresDeclaration remove(Serializable primaryKey)
		throws NoSuchTempShipStoresDeclarationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempShipStoresDeclaration tempShipStoresDeclaration = (TempShipStoresDeclaration)session.get(TempShipStoresDeclarationImpl.class,
					primaryKey);

			if (tempShipStoresDeclaration == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempShipStoresDeclarationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempShipStoresDeclaration);
		}
		catch (NoSuchTempShipStoresDeclarationException nsee) {
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
	protected TempShipStoresDeclaration removeImpl(
		TempShipStoresDeclaration tempShipStoresDeclaration)
		throws SystemException {
		tempShipStoresDeclaration = toUnwrappedModel(tempShipStoresDeclaration);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tempShipStoresDeclaration)) {
				tempShipStoresDeclaration = (TempShipStoresDeclaration)session.get(TempShipStoresDeclarationImpl.class,
						tempShipStoresDeclaration.getPrimaryKeyObj());
			}

			if (tempShipStoresDeclaration != null) {
				session.delete(tempShipStoresDeclaration);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tempShipStoresDeclaration != null) {
			clearCache(tempShipStoresDeclaration);
		}

		return tempShipStoresDeclaration;
	}

	@Override
	public TempShipStoresDeclaration updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempShipStoresDeclaration tempShipStoresDeclaration)
		throws SystemException {
		tempShipStoresDeclaration = toUnwrappedModel(tempShipStoresDeclaration);

		boolean isNew = tempShipStoresDeclaration.isNew();

		TempShipStoresDeclarationModelImpl tempShipStoresDeclarationModelImpl = (TempShipStoresDeclarationModelImpl)tempShipStoresDeclaration;

		Session session = null;

		try {
			session = openSession();

			if (tempShipStoresDeclaration.isNew()) {
				session.save(tempShipStoresDeclaration);

				tempShipStoresDeclaration.setNew(false);
			}
			else {
				session.merge(tempShipStoresDeclaration);
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
				!TempShipStoresDeclarationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempShipStoresDeclarationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempShipStoresDeclarationModelImpl.getOriginalDocumentName(),
						tempShipStoresDeclarationModelImpl.getOriginalDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						tempShipStoresDeclarationModelImpl.getDocumentName(),
						tempShipStoresDeclarationModelImpl.getDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
			}

			if ((tempShipStoresDeclarationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempShipStoresDeclarationModelImpl.getOriginalDocumentName(),
						tempShipStoresDeclarationModelImpl.getOriginalDocumentYear(),
						tempShipStoresDeclarationModelImpl.getOriginalRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);

				args = new Object[] {
						tempShipStoresDeclarationModelImpl.getDocumentName(),
						tempShipStoresDeclarationModelImpl.getDocumentYear(),
						tempShipStoresDeclarationModelImpl.getRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
			}

			if ((tempShipStoresDeclarationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempShipStoresDeclarationModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] {
						tempShipStoresDeclarationModelImpl.getRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempShipStoresDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempShipStoresDeclarationImpl.class,
			tempShipStoresDeclaration.getPrimaryKey(), tempShipStoresDeclaration);

		return tempShipStoresDeclaration;
	}

	protected TempShipStoresDeclaration toUnwrappedModel(
		TempShipStoresDeclaration tempShipStoresDeclaration) {
		if (tempShipStoresDeclaration instanceof TempShipStoresDeclarationImpl) {
			return tempShipStoresDeclaration;
		}

		TempShipStoresDeclarationImpl tempShipStoresDeclarationImpl = new TempShipStoresDeclarationImpl();

		tempShipStoresDeclarationImpl.setNew(tempShipStoresDeclaration.isNew());
		tempShipStoresDeclarationImpl.setPrimaryKey(tempShipStoresDeclaration.getPrimaryKey());

		tempShipStoresDeclarationImpl.setId(tempShipStoresDeclaration.getId());
		tempShipStoresDeclarationImpl.setRequestCode(tempShipStoresDeclaration.getRequestCode());
		tempShipStoresDeclarationImpl.setRequestState(tempShipStoresDeclaration.getRequestState());
		tempShipStoresDeclarationImpl.setDocumentName(tempShipStoresDeclaration.getDocumentName());
		tempShipStoresDeclarationImpl.setDocumentYear(tempShipStoresDeclaration.getDocumentYear());
		tempShipStoresDeclarationImpl.setUserCreated(tempShipStoresDeclaration.getUserCreated());
		tempShipStoresDeclarationImpl.setIsArrival(tempShipStoresDeclaration.getIsArrival());
		tempShipStoresDeclarationImpl.setNameOfShip(tempShipStoresDeclaration.getNameOfShip());
		tempShipStoresDeclarationImpl.setImoNumber(tempShipStoresDeclaration.getImoNumber());
		tempShipStoresDeclarationImpl.setCallsign(tempShipStoresDeclaration.getCallsign());
		tempShipStoresDeclarationImpl.setVoyageNumber(tempShipStoresDeclaration.getVoyageNumber());
		tempShipStoresDeclarationImpl.setNationalityOfShip(tempShipStoresDeclaration.getNationalityOfShip());
		tempShipStoresDeclarationImpl.setPortOfArrivalCode(tempShipStoresDeclaration.getPortOfArrivalCode());
		tempShipStoresDeclarationImpl.setDateOfArrival(tempShipStoresDeclaration.getDateOfArrival());
		tempShipStoresDeclarationImpl.setLastPortOfCallCode(tempShipStoresDeclaration.getLastPortOfCallCode());
		tempShipStoresDeclarationImpl.setNumberOfPersonsOnBoat(tempShipStoresDeclaration.getNumberOfPersonsOnBoat());
		tempShipStoresDeclarationImpl.setPeriodOfStay(tempShipStoresDeclaration.getPeriodOfStay());
		tempShipStoresDeclarationImpl.setPeriodOfStayUnit(tempShipStoresDeclaration.getPeriodOfStayUnit());
		tempShipStoresDeclarationImpl.setNameOfMaster(tempShipStoresDeclaration.getNameOfMaster());
		tempShipStoresDeclarationImpl.setListShipsStores(tempShipStoresDeclaration.getListShipsStores());
		tempShipStoresDeclarationImpl.setSignPlace(tempShipStoresDeclaration.getSignPlace());
		tempShipStoresDeclarationImpl.setSignDate(tempShipStoresDeclaration.getSignDate());
		tempShipStoresDeclarationImpl.setMasterSigned(tempShipStoresDeclaration.getMasterSigned());
		tempShipStoresDeclarationImpl.setMasterSignedImage(tempShipStoresDeclaration.getMasterSignedImage());
		tempShipStoresDeclarationImpl.setAttachedFile(tempShipStoresDeclaration.getAttachedFile());

		return tempShipStoresDeclarationImpl;
	}

	/**
	 * Returns the temp ship stores declaration with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp ship stores declaration
	 * @return the temp ship stores declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresDeclarationException if a temp ship stores declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresDeclaration findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTempShipStoresDeclarationException, SystemException {
		TempShipStoresDeclaration tempShipStoresDeclaration = fetchByPrimaryKey(primaryKey);

		if (tempShipStoresDeclaration == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTempShipStoresDeclarationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tempShipStoresDeclaration;
	}

	/**
	 * Returns the temp ship stores declaration with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresDeclarationException} if it could not be found.
	 *
	 * @param id the primary key of the temp ship stores declaration
	 * @return the temp ship stores declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresDeclarationException if a temp ship stores declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresDeclaration findByPrimaryKey(long id)
		throws NoSuchTempShipStoresDeclarationException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the temp ship stores declaration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp ship stores declaration
	 * @return the temp ship stores declaration, or <code>null</code> if a temp ship stores declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresDeclaration fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TempShipStoresDeclaration tempShipStoresDeclaration = (TempShipStoresDeclaration)EntityCacheUtil.getResult(TempShipStoresDeclarationModelImpl.ENTITY_CACHE_ENABLED,
				TempShipStoresDeclarationImpl.class, primaryKey);

		if (tempShipStoresDeclaration == _nullTempShipStoresDeclaration) {
			return null;
		}

		if (tempShipStoresDeclaration == null) {
			Session session = null;

			try {
				session = openSession();

				tempShipStoresDeclaration = (TempShipStoresDeclaration)session.get(TempShipStoresDeclarationImpl.class,
						primaryKey);

				if (tempShipStoresDeclaration != null) {
					cacheResult(tempShipStoresDeclaration);
				}
				else {
					EntityCacheUtil.putResult(TempShipStoresDeclarationModelImpl.ENTITY_CACHE_ENABLED,
						TempShipStoresDeclarationImpl.class, primaryKey,
						_nullTempShipStoresDeclaration);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TempShipStoresDeclarationModelImpl.ENTITY_CACHE_ENABLED,
					TempShipStoresDeclarationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tempShipStoresDeclaration;
	}

	/**
	 * Returns the temp ship stores declaration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp ship stores declaration
	 * @return the temp ship stores declaration, or <code>null</code> if a temp ship stores declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresDeclaration fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the temp ship stores declarations.
	 *
	 * @return the temp ship stores declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipStoresDeclaration> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp ship stores declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipStoresDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp ship stores declarations
	 * @param end the upper bound of the range of temp ship stores declarations (not inclusive)
	 * @return the range of temp ship stores declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipStoresDeclaration> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp ship stores declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipStoresDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp ship stores declarations
	 * @param end the upper bound of the range of temp ship stores declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp ship stores declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipStoresDeclaration> findAll(int start, int end,
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

		List<TempShipStoresDeclaration> list = (List<TempShipStoresDeclaration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPSHIPSTORESDECLARATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPSHIPSTORESDECLARATION;

				if (pagination) {
					sql = sql.concat(TempShipStoresDeclarationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TempShipStoresDeclaration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempShipStoresDeclaration>(list);
				}
				else {
					list = (List<TempShipStoresDeclaration>)QueryUtil.list(q,
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
	 * Removes all the temp ship stores declarations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TempShipStoresDeclaration tempShipStoresDeclaration : findAll()) {
			remove(tempShipStoresDeclaration);
		}
	}

	/**
	 * Returns the number of temp ship stores declarations.
	 *
	 * @return the number of temp ship stores declarations
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

				Query q = session.createQuery(_SQL_COUNT_TEMPSHIPSTORESDECLARATION);

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
	 * Initializes the temp ship stores declaration persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.TempShipStoresDeclaration")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempShipStoresDeclaration>> listenersList = new ArrayList<ModelListener<TempShipStoresDeclaration>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempShipStoresDeclaration>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempShipStoresDeclarationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TEMPSHIPSTORESDECLARATION = "SELECT tempShipStoresDeclaration FROM TempShipStoresDeclaration tempShipStoresDeclaration";
	private static final String _SQL_SELECT_TEMPSHIPSTORESDECLARATION_WHERE = "SELECT tempShipStoresDeclaration FROM TempShipStoresDeclaration tempShipStoresDeclaration WHERE ";
	private static final String _SQL_COUNT_TEMPSHIPSTORESDECLARATION = "SELECT COUNT(tempShipStoresDeclaration) FROM TempShipStoresDeclaration tempShipStoresDeclaration";
	private static final String _SQL_COUNT_TEMPSHIPSTORESDECLARATION_WHERE = "SELECT COUNT(tempShipStoresDeclaration) FROM TempShipStoresDeclaration tempShipStoresDeclaration WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempShipStoresDeclaration.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempShipStoresDeclaration exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempShipStoresDeclaration exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempShipStoresDeclarationPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "requestState", "documentName",
				"documentYear", "userCreated", "nameOfShip", "imoNumber",
				"callsign", "voyageNumber", "nationalityOfShip",
				"portOfArrivalCode", "dateOfArrival", "lastPortOfCallCode",
				"numberOfPersonsOnBoat", "periodOfStay", "periodOfStayUnit",
				"nameOfMaster", "listShipsStores", "signPlace", "signDate",
				"masterSigned", "masterSignedImage", "attachedFile"
			});
	private static TempShipStoresDeclaration _nullTempShipStoresDeclaration = new TempShipStoresDeclarationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempShipStoresDeclaration> toCacheModel() {
				return _nullTempShipStoresDeclarationCacheModel;
			}
		};

	private static CacheModel<TempShipStoresDeclaration> _nullTempShipStoresDeclarationCacheModel =
		new CacheModel<TempShipStoresDeclaration>() {
			@Override
			public TempShipStoresDeclaration toEntityModel() {
				return _nullTempShipStoresDeclaration;
			}
		};
}