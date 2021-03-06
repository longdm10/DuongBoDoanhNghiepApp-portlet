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

import vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsDeclarationException;
import vn.dtt.duongbien.dao.vrcb.model.TempCrewEffectsDeclaration;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewEffectsDeclarationImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewEffectsDeclarationModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the temp crew effects declaration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempCrewEffectsDeclarationPersistence
 * @see TempCrewEffectsDeclarationUtil
 * @generated
 */
public class TempCrewEffectsDeclarationPersistenceImpl
	extends BasePersistenceImpl<TempCrewEffectsDeclaration>
	implements TempCrewEffectsDeclarationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempCrewEffectsDeclarationUtil} to access the temp crew effects declaration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempCrewEffectsDeclarationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempCrewEffectsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewEffectsDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempCrewEffectsDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempCrewEffectsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewEffectsDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempCrewEffectsDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempCrewEffectsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewEffectsDeclarationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempCrewEffectsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewEffectsDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempCrewEffectsDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentNameAnddocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempCrewEffectsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewEffectsDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempCrewEffectsDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			TempCrewEffectsDeclarationModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempCrewEffectsDeclarationModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempCrewEffectsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewEffectsDeclarationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the temp crew effects declarations where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching temp crew effects declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewEffectsDeclaration> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findBydocumentNameAnddocumentYear(documentName, documentYear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp crew effects declarations where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewEffectsDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp crew effects declarations
	 * @param end the upper bound of the range of temp crew effects declarations (not inclusive)
	 * @return the range of matching temp crew effects declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewEffectsDeclaration> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findBydocumentNameAnddocumentYear(documentName, documentYear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp crew effects declarations where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewEffectsDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp crew effects declarations
	 * @param end the upper bound of the range of temp crew effects declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp crew effects declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewEffectsDeclaration> findBydocumentNameAnddocumentYear(
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

		List<TempCrewEffectsDeclaration> list = (List<TempCrewEffectsDeclaration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempCrewEffectsDeclaration tempCrewEffectsDeclaration : list) {
				if ((documentName != tempCrewEffectsDeclaration.getDocumentName()) ||
						(documentYear != tempCrewEffectsDeclaration.getDocumentYear())) {
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

			query.append(_SQL_SELECT_TEMPCREWEFFECTSDECLARATION_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempCrewEffectsDeclarationModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempCrewEffectsDeclaration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempCrewEffectsDeclaration>(list);
				}
				else {
					list = (List<TempCrewEffectsDeclaration>)QueryUtil.list(q,
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
	 * Returns the first temp crew effects declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp crew effects declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsDeclarationException if a matching temp crew effects declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsDeclaration findBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempCrewEffectsDeclarationException, SystemException {
		TempCrewEffectsDeclaration tempCrewEffectsDeclaration = fetchBydocumentNameAnddocumentYear_First(documentName,
				documentYear, orderByComparator);

		if (tempCrewEffectsDeclaration != null) {
			return tempCrewEffectsDeclaration;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempCrewEffectsDeclarationException(msg.toString());
	}

	/**
	 * Returns the first temp crew effects declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp crew effects declaration, or <code>null</code> if a matching temp crew effects declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsDeclaration fetchBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		List<TempCrewEffectsDeclaration> list = findBydocumentNameAnddocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp crew effects declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp crew effects declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsDeclarationException if a matching temp crew effects declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsDeclaration findBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempCrewEffectsDeclarationException, SystemException {
		TempCrewEffectsDeclaration tempCrewEffectsDeclaration = fetchBydocumentNameAnddocumentYear_Last(documentName,
				documentYear, orderByComparator);

		if (tempCrewEffectsDeclaration != null) {
			return tempCrewEffectsDeclaration;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempCrewEffectsDeclarationException(msg.toString());
	}

	/**
	 * Returns the last temp crew effects declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp crew effects declaration, or <code>null</code> if a matching temp crew effects declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsDeclaration fetchBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBydocumentNameAnddocumentYear(documentName,
				documentYear);

		if (count == 0) {
			return null;
		}

		List<TempCrewEffectsDeclaration> list = findBydocumentNameAnddocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp crew effects declarations before and after the current temp crew effects declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param id the primary key of the current temp crew effects declaration
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp crew effects declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsDeclarationException if a temp crew effects declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsDeclaration[] findBydocumentNameAnddocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchTempCrewEffectsDeclarationException, SystemException {
		TempCrewEffectsDeclaration tempCrewEffectsDeclaration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempCrewEffectsDeclaration[] array = new TempCrewEffectsDeclarationImpl[3];

			array[0] = getBydocumentNameAnddocumentYear_PrevAndNext(session,
					tempCrewEffectsDeclaration, documentName, documentYear,
					orderByComparator, true);

			array[1] = tempCrewEffectsDeclaration;

			array[2] = getBydocumentNameAnddocumentYear_PrevAndNext(session,
					tempCrewEffectsDeclaration, documentName, documentYear,
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

	protected TempCrewEffectsDeclaration getBydocumentNameAnddocumentYear_PrevAndNext(
		Session session, TempCrewEffectsDeclaration tempCrewEffectsDeclaration,
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

		query.append(_SQL_SELECT_TEMPCREWEFFECTSDECLARATION_WHERE);

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
			query.append(TempCrewEffectsDeclarationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempCrewEffectsDeclaration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempCrewEffectsDeclaration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp crew effects declarations where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBydocumentNameAnddocumentYear(long documentName,
		int documentYear) throws SystemException {
		for (TempCrewEffectsDeclaration tempCrewEffectsDeclaration : findBydocumentNameAnddocumentYear(
				documentName, documentYear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempCrewEffectsDeclaration);
		}
	}

	/**
	 * Returns the number of temp crew effects declarations where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching temp crew effects declarations
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

			query.append(_SQL_COUNT_TEMPCREWEFFECTSDECLARATION_WHERE);

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
		"tempCrewEffectsDeclaration.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"tempCrewEffectsDeclaration.documentYear = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempCrewEffectsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewEffectsDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempCrewEffectsDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempCrewEffectsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewEffectsDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempCrewEffectsDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			TempCrewEffectsDeclarationModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempCrewEffectsDeclarationModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			TempCrewEffectsDeclarationModelImpl.REQUESTSTATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempCrewEffectsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewEffectsDeclarationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the temp crew effects declarations where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the matching temp crew effects declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewEffectsDeclaration> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		return findBydocumentNameAnddocumentYearRequestState(documentName,
			documentYear, requestState, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the temp crew effects declarations where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewEffectsDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp crew effects declarations
	 * @param end the upper bound of the range of temp crew effects declarations (not inclusive)
	 * @return the range of matching temp crew effects declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewEffectsDeclaration> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end) throws SystemException {
		return findBydocumentNameAnddocumentYearRequestState(documentName,
			documentYear, requestState, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp crew effects declarations where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewEffectsDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp crew effects declarations
	 * @param end the upper bound of the range of temp crew effects declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp crew effects declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewEffectsDeclaration> findBydocumentNameAnddocumentYearRequestState(
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

		List<TempCrewEffectsDeclaration> list = (List<TempCrewEffectsDeclaration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempCrewEffectsDeclaration tempCrewEffectsDeclaration : list) {
				if ((documentName != tempCrewEffectsDeclaration.getDocumentName()) ||
						(documentYear != tempCrewEffectsDeclaration.getDocumentYear()) ||
						(requestState != tempCrewEffectsDeclaration.getRequestState())) {
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

			query.append(_SQL_SELECT_TEMPCREWEFFECTSDECLARATION_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempCrewEffectsDeclarationModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempCrewEffectsDeclaration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempCrewEffectsDeclaration>(list);
				}
				else {
					list = (List<TempCrewEffectsDeclaration>)QueryUtil.list(q,
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
	 * Returns the first temp crew effects declaration in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp crew effects declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsDeclarationException if a matching temp crew effects declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsDeclaration findBydocumentNameAnddocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempCrewEffectsDeclarationException, SystemException {
		TempCrewEffectsDeclaration tempCrewEffectsDeclaration = fetchBydocumentNameAnddocumentYearRequestState_First(documentName,
				documentYear, requestState, orderByComparator);

		if (tempCrewEffectsDeclaration != null) {
			return tempCrewEffectsDeclaration;
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

		throw new NoSuchTempCrewEffectsDeclarationException(msg.toString());
	}

	/**
	 * Returns the first temp crew effects declaration in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp crew effects declaration, or <code>null</code> if a matching temp crew effects declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsDeclaration fetchBydocumentNameAnddocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempCrewEffectsDeclaration> list = findBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp crew effects declaration in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp crew effects declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsDeclarationException if a matching temp crew effects declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsDeclaration findBydocumentNameAnddocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempCrewEffectsDeclarationException, SystemException {
		TempCrewEffectsDeclaration tempCrewEffectsDeclaration = fetchBydocumentNameAnddocumentYearRequestState_Last(documentName,
				documentYear, requestState, orderByComparator);

		if (tempCrewEffectsDeclaration != null) {
			return tempCrewEffectsDeclaration;
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

		throw new NoSuchTempCrewEffectsDeclarationException(msg.toString());
	}

	/**
	 * Returns the last temp crew effects declaration in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp crew effects declaration, or <code>null</code> if a matching temp crew effects declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsDeclaration fetchBydocumentNameAnddocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState);

		if (count == 0) {
			return null;
		}

		List<TempCrewEffectsDeclaration> list = findBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp crew effects declarations before and after the current temp crew effects declaration in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param id the primary key of the current temp crew effects declaration
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp crew effects declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsDeclarationException if a temp crew effects declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsDeclaration[] findBydocumentNameAnddocumentYearRequestState_PrevAndNext(
		long id, long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempCrewEffectsDeclarationException, SystemException {
		TempCrewEffectsDeclaration tempCrewEffectsDeclaration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempCrewEffectsDeclaration[] array = new TempCrewEffectsDeclarationImpl[3];

			array[0] = getBydocumentNameAnddocumentYearRequestState_PrevAndNext(session,
					tempCrewEffectsDeclaration, documentName, documentYear,
					requestState, orderByComparator, true);

			array[1] = tempCrewEffectsDeclaration;

			array[2] = getBydocumentNameAnddocumentYearRequestState_PrevAndNext(session,
					tempCrewEffectsDeclaration, documentName, documentYear,
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

	protected TempCrewEffectsDeclaration getBydocumentNameAnddocumentYearRequestState_PrevAndNext(
		Session session, TempCrewEffectsDeclaration tempCrewEffectsDeclaration,
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

		query.append(_SQL_SELECT_TEMPCREWEFFECTSDECLARATION_WHERE);

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
			query.append(TempCrewEffectsDeclarationModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempCrewEffectsDeclaration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempCrewEffectsDeclaration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp crew effects declarations where documentName = &#63; and documentYear = &#63; and requestState = &#63; from the database.
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
		for (TempCrewEffectsDeclaration tempCrewEffectsDeclaration : findBydocumentNameAnddocumentYearRequestState(
				documentName, documentYear, requestState, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempCrewEffectsDeclaration);
		}
	}

	/**
	 * Returns the number of temp crew effects declarations where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the number of matching temp crew effects declarations
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

			query.append(_SQL_COUNT_TEMPCREWEFFECTSDECLARATION_WHERE);

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
		"tempCrewEffectsDeclaration.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2 =
		"tempCrewEffectsDeclaration.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2 =
		"tempCrewEffectsDeclaration.requestState = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempCrewEffectsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewEffectsDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempCrewEffectsDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempCrewEffectsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewEffectsDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempCrewEffectsDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempCrewEffectsDeclarationModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempCrewEffectsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewEffectsDeclarationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRequestCode", new String[] { String.class.getName() });

	/**
	 * Returns all the temp crew effects declarations where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp crew effects declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewEffectsDeclaration> findByRequestCode(
		String requestCode) throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp crew effects declarations where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewEffectsDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp crew effects declarations
	 * @param end the upper bound of the range of temp crew effects declarations (not inclusive)
	 * @return the range of matching temp crew effects declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewEffectsDeclaration> findByRequestCode(
		String requestCode, int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp crew effects declarations where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewEffectsDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp crew effects declarations
	 * @param end the upper bound of the range of temp crew effects declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp crew effects declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewEffectsDeclaration> findByRequestCode(
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

		List<TempCrewEffectsDeclaration> list = (List<TempCrewEffectsDeclaration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempCrewEffectsDeclaration tempCrewEffectsDeclaration : list) {
				if (!Validator.equals(requestCode,
							tempCrewEffectsDeclaration.getRequestCode())) {
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

			query.append(_SQL_SELECT_TEMPCREWEFFECTSDECLARATION_WHERE);

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
				query.append(TempCrewEffectsDeclarationModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempCrewEffectsDeclaration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempCrewEffectsDeclaration>(list);
				}
				else {
					list = (List<TempCrewEffectsDeclaration>)QueryUtil.list(q,
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
	 * Returns the first temp crew effects declaration in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp crew effects declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsDeclarationException if a matching temp crew effects declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsDeclaration findByRequestCode_First(
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempCrewEffectsDeclarationException, SystemException {
		TempCrewEffectsDeclaration tempCrewEffectsDeclaration = fetchByRequestCode_First(requestCode,
				orderByComparator);

		if (tempCrewEffectsDeclaration != null) {
			return tempCrewEffectsDeclaration;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempCrewEffectsDeclarationException(msg.toString());
	}

	/**
	 * Returns the first temp crew effects declaration in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp crew effects declaration, or <code>null</code> if a matching temp crew effects declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsDeclaration fetchByRequestCode_First(
		String requestCode, OrderByComparator orderByComparator)
		throws SystemException {
		List<TempCrewEffectsDeclaration> list = findByRequestCode(requestCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp crew effects declaration in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp crew effects declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsDeclarationException if a matching temp crew effects declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsDeclaration findByRequestCode_Last(
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempCrewEffectsDeclarationException, SystemException {
		TempCrewEffectsDeclaration tempCrewEffectsDeclaration = fetchByRequestCode_Last(requestCode,
				orderByComparator);

		if (tempCrewEffectsDeclaration != null) {
			return tempCrewEffectsDeclaration;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempCrewEffectsDeclarationException(msg.toString());
	}

	/**
	 * Returns the last temp crew effects declaration in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp crew effects declaration, or <code>null</code> if a matching temp crew effects declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsDeclaration fetchByRequestCode_Last(
		String requestCode, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByRequestCode(requestCode);

		if (count == 0) {
			return null;
		}

		List<TempCrewEffectsDeclaration> list = findByRequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp crew effects declarations before and after the current temp crew effects declaration in the ordered set where requestCode = &#63;.
	 *
	 * @param id the primary key of the current temp crew effects declaration
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp crew effects declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsDeclarationException if a temp crew effects declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsDeclaration[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempCrewEffectsDeclarationException, SystemException {
		TempCrewEffectsDeclaration tempCrewEffectsDeclaration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempCrewEffectsDeclaration[] array = new TempCrewEffectsDeclarationImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session,
					tempCrewEffectsDeclaration, requestCode, orderByComparator,
					true);

			array[1] = tempCrewEffectsDeclaration;

			array[2] = getByRequestCode_PrevAndNext(session,
					tempCrewEffectsDeclaration, requestCode, orderByComparator,
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

	protected TempCrewEffectsDeclaration getByRequestCode_PrevAndNext(
		Session session, TempCrewEffectsDeclaration tempCrewEffectsDeclaration,
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

		query.append(_SQL_SELECT_TEMPCREWEFFECTSDECLARATION_WHERE);

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
			query.append(TempCrewEffectsDeclarationModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempCrewEffectsDeclaration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempCrewEffectsDeclaration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp crew effects declarations where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempCrewEffectsDeclaration tempCrewEffectsDeclaration : findByRequestCode(
				requestCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tempCrewEffectsDeclaration);
		}
	}

	/**
	 * Returns the number of temp crew effects declarations where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp crew effects declarations
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

			query.append(_SQL_COUNT_TEMPCREWEFFECTSDECLARATION_WHERE);

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

	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempCrewEffectsDeclaration.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempCrewEffectsDeclaration.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempCrewEffectsDeclaration.requestCode IS NULL OR tempCrewEffectsDeclaration.requestCode = '')";

	public TempCrewEffectsDeclarationPersistenceImpl() {
		setModelClass(TempCrewEffectsDeclaration.class);
	}

	/**
	 * Caches the temp crew effects declaration in the entity cache if it is enabled.
	 *
	 * @param tempCrewEffectsDeclaration the temp crew effects declaration
	 */
	@Override
	public void cacheResult(
		TempCrewEffectsDeclaration tempCrewEffectsDeclaration) {
		EntityCacheUtil.putResult(TempCrewEffectsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewEffectsDeclarationImpl.class,
			tempCrewEffectsDeclaration.getPrimaryKey(),
			tempCrewEffectsDeclaration);

		tempCrewEffectsDeclaration.resetOriginalValues();
	}

	/**
	 * Caches the temp crew effects declarations in the entity cache if it is enabled.
	 *
	 * @param tempCrewEffectsDeclarations the temp crew effects declarations
	 */
	@Override
	public void cacheResult(
		List<TempCrewEffectsDeclaration> tempCrewEffectsDeclarations) {
		for (TempCrewEffectsDeclaration tempCrewEffectsDeclaration : tempCrewEffectsDeclarations) {
			if (EntityCacheUtil.getResult(
						TempCrewEffectsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
						TempCrewEffectsDeclarationImpl.class,
						tempCrewEffectsDeclaration.getPrimaryKey()) == null) {
				cacheResult(tempCrewEffectsDeclaration);
			}
			else {
				tempCrewEffectsDeclaration.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp crew effects declarations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempCrewEffectsDeclarationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempCrewEffectsDeclarationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp crew effects declaration.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TempCrewEffectsDeclaration tempCrewEffectsDeclaration) {
		EntityCacheUtil.removeResult(TempCrewEffectsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewEffectsDeclarationImpl.class,
			tempCrewEffectsDeclaration.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<TempCrewEffectsDeclaration> tempCrewEffectsDeclarations) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempCrewEffectsDeclaration tempCrewEffectsDeclaration : tempCrewEffectsDeclarations) {
			EntityCacheUtil.removeResult(TempCrewEffectsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
				TempCrewEffectsDeclarationImpl.class,
				tempCrewEffectsDeclaration.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp crew effects declaration with the primary key. Does not add the temp crew effects declaration to the database.
	 *
	 * @param id the primary key for the new temp crew effects declaration
	 * @return the new temp crew effects declaration
	 */
	@Override
	public TempCrewEffectsDeclaration create(long id) {
		TempCrewEffectsDeclaration tempCrewEffectsDeclaration = new TempCrewEffectsDeclarationImpl();

		tempCrewEffectsDeclaration.setNew(true);
		tempCrewEffectsDeclaration.setPrimaryKey(id);

		return tempCrewEffectsDeclaration;
	}

	/**
	 * Removes the temp crew effects declaration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp crew effects declaration
	 * @return the temp crew effects declaration that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsDeclarationException if a temp crew effects declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsDeclaration remove(long id)
		throws NoSuchTempCrewEffectsDeclarationException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the temp crew effects declaration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp crew effects declaration
	 * @return the temp crew effects declaration that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsDeclarationException if a temp crew effects declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsDeclaration remove(Serializable primaryKey)
		throws NoSuchTempCrewEffectsDeclarationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempCrewEffectsDeclaration tempCrewEffectsDeclaration = (TempCrewEffectsDeclaration)session.get(TempCrewEffectsDeclarationImpl.class,
					primaryKey);

			if (tempCrewEffectsDeclaration == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempCrewEffectsDeclarationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempCrewEffectsDeclaration);
		}
		catch (NoSuchTempCrewEffectsDeclarationException nsee) {
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
	protected TempCrewEffectsDeclaration removeImpl(
		TempCrewEffectsDeclaration tempCrewEffectsDeclaration)
		throws SystemException {
		tempCrewEffectsDeclaration = toUnwrappedModel(tempCrewEffectsDeclaration);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tempCrewEffectsDeclaration)) {
				tempCrewEffectsDeclaration = (TempCrewEffectsDeclaration)session.get(TempCrewEffectsDeclarationImpl.class,
						tempCrewEffectsDeclaration.getPrimaryKeyObj());
			}

			if (tempCrewEffectsDeclaration != null) {
				session.delete(tempCrewEffectsDeclaration);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tempCrewEffectsDeclaration != null) {
			clearCache(tempCrewEffectsDeclaration);
		}

		return tempCrewEffectsDeclaration;
	}

	@Override
	public TempCrewEffectsDeclaration updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempCrewEffectsDeclaration tempCrewEffectsDeclaration)
		throws SystemException {
		tempCrewEffectsDeclaration = toUnwrappedModel(tempCrewEffectsDeclaration);

		boolean isNew = tempCrewEffectsDeclaration.isNew();

		TempCrewEffectsDeclarationModelImpl tempCrewEffectsDeclarationModelImpl = (TempCrewEffectsDeclarationModelImpl)tempCrewEffectsDeclaration;

		Session session = null;

		try {
			session = openSession();

			if (tempCrewEffectsDeclaration.isNew()) {
				session.save(tempCrewEffectsDeclaration);

				tempCrewEffectsDeclaration.setNew(false);
			}
			else {
				session.merge(tempCrewEffectsDeclaration);
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
				!TempCrewEffectsDeclarationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempCrewEffectsDeclarationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempCrewEffectsDeclarationModelImpl.getOriginalDocumentName(),
						tempCrewEffectsDeclarationModelImpl.getOriginalDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						tempCrewEffectsDeclarationModelImpl.getDocumentName(),
						tempCrewEffectsDeclarationModelImpl.getDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
			}

			if ((tempCrewEffectsDeclarationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempCrewEffectsDeclarationModelImpl.getOriginalDocumentName(),
						tempCrewEffectsDeclarationModelImpl.getOriginalDocumentYear(),
						tempCrewEffectsDeclarationModelImpl.getOriginalRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);

				args = new Object[] {
						tempCrewEffectsDeclarationModelImpl.getDocumentName(),
						tempCrewEffectsDeclarationModelImpl.getDocumentYear(),
						tempCrewEffectsDeclarationModelImpl.getRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
			}

			if ((tempCrewEffectsDeclarationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempCrewEffectsDeclarationModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] {
						tempCrewEffectsDeclarationModelImpl.getRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempCrewEffectsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewEffectsDeclarationImpl.class,
			tempCrewEffectsDeclaration.getPrimaryKey(),
			tempCrewEffectsDeclaration);

		return tempCrewEffectsDeclaration;
	}

	protected TempCrewEffectsDeclaration toUnwrappedModel(
		TempCrewEffectsDeclaration tempCrewEffectsDeclaration) {
		if (tempCrewEffectsDeclaration instanceof TempCrewEffectsDeclarationImpl) {
			return tempCrewEffectsDeclaration;
		}

		TempCrewEffectsDeclarationImpl tempCrewEffectsDeclarationImpl = new TempCrewEffectsDeclarationImpl();

		tempCrewEffectsDeclarationImpl.setNew(tempCrewEffectsDeclaration.isNew());
		tempCrewEffectsDeclarationImpl.setPrimaryKey(tempCrewEffectsDeclaration.getPrimaryKey());

		tempCrewEffectsDeclarationImpl.setId(tempCrewEffectsDeclaration.getId());
		tempCrewEffectsDeclarationImpl.setRequestCode(tempCrewEffectsDeclaration.getRequestCode());
		tempCrewEffectsDeclarationImpl.setRequestState(tempCrewEffectsDeclaration.getRequestState());
		tempCrewEffectsDeclarationImpl.setDocumentName(tempCrewEffectsDeclaration.getDocumentName());
		tempCrewEffectsDeclarationImpl.setUserCreated(tempCrewEffectsDeclaration.getUserCreated());
		tempCrewEffectsDeclarationImpl.setNameOfShip(tempCrewEffectsDeclaration.getNameOfShip());
		tempCrewEffectsDeclarationImpl.setImoNumber(tempCrewEffectsDeclaration.getImoNumber());
		tempCrewEffectsDeclarationImpl.setCallsign(tempCrewEffectsDeclaration.getCallsign());
		tempCrewEffectsDeclarationImpl.setVoyageNumber(tempCrewEffectsDeclaration.getVoyageNumber());
		tempCrewEffectsDeclarationImpl.setFlagStateOfShip(tempCrewEffectsDeclaration.getFlagStateOfShip());
		tempCrewEffectsDeclarationImpl.setNameOfMaster(tempCrewEffectsDeclaration.getNameOfMaster());
		tempCrewEffectsDeclarationImpl.setListCrewEffects(tempCrewEffectsDeclaration.getListCrewEffects());
		tempCrewEffectsDeclarationImpl.setSignPlace(tempCrewEffectsDeclaration.getSignPlace());
		tempCrewEffectsDeclarationImpl.setSignDate(tempCrewEffectsDeclaration.getSignDate());
		tempCrewEffectsDeclarationImpl.setMasterSigned(tempCrewEffectsDeclaration.getMasterSigned());
		tempCrewEffectsDeclarationImpl.setMasterSignedImage(tempCrewEffectsDeclaration.getMasterSignedImage());
		tempCrewEffectsDeclarationImpl.setAttachedFile(tempCrewEffectsDeclaration.getAttachedFile());
		tempCrewEffectsDeclarationImpl.setDocumentYear(tempCrewEffectsDeclaration.getDocumentYear());

		return tempCrewEffectsDeclarationImpl;
	}

	/**
	 * Returns the temp crew effects declaration with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp crew effects declaration
	 * @return the temp crew effects declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsDeclarationException if a temp crew effects declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsDeclaration findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTempCrewEffectsDeclarationException, SystemException {
		TempCrewEffectsDeclaration tempCrewEffectsDeclaration = fetchByPrimaryKey(primaryKey);

		if (tempCrewEffectsDeclaration == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTempCrewEffectsDeclarationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tempCrewEffectsDeclaration;
	}

	/**
	 * Returns the temp crew effects declaration with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsDeclarationException} if it could not be found.
	 *
	 * @param id the primary key of the temp crew effects declaration
	 * @return the temp crew effects declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsDeclarationException if a temp crew effects declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsDeclaration findByPrimaryKey(long id)
		throws NoSuchTempCrewEffectsDeclarationException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the temp crew effects declaration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp crew effects declaration
	 * @return the temp crew effects declaration, or <code>null</code> if a temp crew effects declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsDeclaration fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TempCrewEffectsDeclaration tempCrewEffectsDeclaration = (TempCrewEffectsDeclaration)EntityCacheUtil.getResult(TempCrewEffectsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
				TempCrewEffectsDeclarationImpl.class, primaryKey);

		if (tempCrewEffectsDeclaration == _nullTempCrewEffectsDeclaration) {
			return null;
		}

		if (tempCrewEffectsDeclaration == null) {
			Session session = null;

			try {
				session = openSession();

				tempCrewEffectsDeclaration = (TempCrewEffectsDeclaration)session.get(TempCrewEffectsDeclarationImpl.class,
						primaryKey);

				if (tempCrewEffectsDeclaration != null) {
					cacheResult(tempCrewEffectsDeclaration);
				}
				else {
					EntityCacheUtil.putResult(TempCrewEffectsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
						TempCrewEffectsDeclarationImpl.class, primaryKey,
						_nullTempCrewEffectsDeclaration);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TempCrewEffectsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
					TempCrewEffectsDeclarationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tempCrewEffectsDeclaration;
	}

	/**
	 * Returns the temp crew effects declaration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp crew effects declaration
	 * @return the temp crew effects declaration, or <code>null</code> if a temp crew effects declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsDeclaration fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the temp crew effects declarations.
	 *
	 * @return the temp crew effects declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewEffectsDeclaration> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp crew effects declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewEffectsDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp crew effects declarations
	 * @param end the upper bound of the range of temp crew effects declarations (not inclusive)
	 * @return the range of temp crew effects declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewEffectsDeclaration> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp crew effects declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewEffectsDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp crew effects declarations
	 * @param end the upper bound of the range of temp crew effects declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp crew effects declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewEffectsDeclaration> findAll(int start, int end,
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

		List<TempCrewEffectsDeclaration> list = (List<TempCrewEffectsDeclaration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPCREWEFFECTSDECLARATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPCREWEFFECTSDECLARATION;

				if (pagination) {
					sql = sql.concat(TempCrewEffectsDeclarationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TempCrewEffectsDeclaration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempCrewEffectsDeclaration>(list);
				}
				else {
					list = (List<TempCrewEffectsDeclaration>)QueryUtil.list(q,
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
	 * Removes all the temp crew effects declarations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TempCrewEffectsDeclaration tempCrewEffectsDeclaration : findAll()) {
			remove(tempCrewEffectsDeclaration);
		}
	}

	/**
	 * Returns the number of temp crew effects declarations.
	 *
	 * @return the number of temp crew effects declarations
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

				Query q = session.createQuery(_SQL_COUNT_TEMPCREWEFFECTSDECLARATION);

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
	 * Initializes the temp crew effects declaration persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.TempCrewEffectsDeclaration")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempCrewEffectsDeclaration>> listenersList = new ArrayList<ModelListener<TempCrewEffectsDeclaration>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempCrewEffectsDeclaration>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempCrewEffectsDeclarationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TEMPCREWEFFECTSDECLARATION = "SELECT tempCrewEffectsDeclaration FROM TempCrewEffectsDeclaration tempCrewEffectsDeclaration";
	private static final String _SQL_SELECT_TEMPCREWEFFECTSDECLARATION_WHERE = "SELECT tempCrewEffectsDeclaration FROM TempCrewEffectsDeclaration tempCrewEffectsDeclaration WHERE ";
	private static final String _SQL_COUNT_TEMPCREWEFFECTSDECLARATION = "SELECT COUNT(tempCrewEffectsDeclaration) FROM TempCrewEffectsDeclaration tempCrewEffectsDeclaration";
	private static final String _SQL_COUNT_TEMPCREWEFFECTSDECLARATION_WHERE = "SELECT COUNT(tempCrewEffectsDeclaration) FROM TempCrewEffectsDeclaration tempCrewEffectsDeclaration WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempCrewEffectsDeclaration.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempCrewEffectsDeclaration exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempCrewEffectsDeclaration exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempCrewEffectsDeclarationPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "requestState", "documentName",
				"userCreated", "nameOfShip", "imoNumber", "callsign",
				"voyageNumber", "flagStateOfShip", "nameOfMaster",
				"listCrewEffects", "signPlace", "signDate", "masterSigned",
				"masterSignedImage", "attachedFile", "documentYear"
			});
	private static TempCrewEffectsDeclaration _nullTempCrewEffectsDeclaration = new TempCrewEffectsDeclarationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempCrewEffectsDeclaration> toCacheModel() {
				return _nullTempCrewEffectsDeclarationCacheModel;
			}
		};

	private static CacheModel<TempCrewEffectsDeclaration> _nullTempCrewEffectsDeclarationCacheModel =
		new CacheModel<TempCrewEffectsDeclaration>() {
			@Override
			public TempCrewEffectsDeclaration toEntityModel() {
				return _nullTempCrewEffectsDeclaration;
			}
		};
}