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

import vn.dtt.duongbien.dao.vrcb.NoSuchTempCargoDeclarationException;
import vn.dtt.duongbien.dao.vrcb.model.TempCargoDeclaration;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempCargoDeclarationImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempCargoDeclarationModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the temp cargo declaration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempCargoDeclarationPersistence
 * @see TempCargoDeclarationUtil
 * @generated
 */
public class TempCargoDeclarationPersistenceImpl extends BasePersistenceImpl<TempCargoDeclaration>
	implements TempCargoDeclarationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempCargoDeclarationUtil} to access the temp cargo declaration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempCargoDeclarationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempCargoDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCargoDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempCargoDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempCargoDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCargoDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempCargoDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempCargoDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCargoDeclarationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempCargoDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCargoDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempCargoDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentNameAnddocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempCargoDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCargoDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempCargoDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			TempCargoDeclarationModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempCargoDeclarationModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempCargoDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCargoDeclarationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the temp cargo declarations where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching temp cargo declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCargoDeclaration> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findBydocumentNameAnddocumentYear(documentName, documentYear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp cargo declarations where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCargoDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp cargo declarations
	 * @param end the upper bound of the range of temp cargo declarations (not inclusive)
	 * @return the range of matching temp cargo declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCargoDeclaration> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findBydocumentNameAnddocumentYear(documentName, documentYear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp cargo declarations where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCargoDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp cargo declarations
	 * @param end the upper bound of the range of temp cargo declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp cargo declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCargoDeclaration> findBydocumentNameAnddocumentYear(
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

		List<TempCargoDeclaration> list = (List<TempCargoDeclaration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempCargoDeclaration tempCargoDeclaration : list) {
				if ((documentName != tempCargoDeclaration.getDocumentName()) ||
						(documentYear != tempCargoDeclaration.getDocumentYear())) {
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

			query.append(_SQL_SELECT_TEMPCARGODECLARATION_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempCargoDeclarationModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempCargoDeclaration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempCargoDeclaration>(list);
				}
				else {
					list = (List<TempCargoDeclaration>)QueryUtil.list(q,
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
	 * Returns the first temp cargo declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp cargo declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCargoDeclarationException if a matching temp cargo declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCargoDeclaration findBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempCargoDeclarationException, SystemException {
		TempCargoDeclaration tempCargoDeclaration = fetchBydocumentNameAnddocumentYear_First(documentName,
				documentYear, orderByComparator);

		if (tempCargoDeclaration != null) {
			return tempCargoDeclaration;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempCargoDeclarationException(msg.toString());
	}

	/**
	 * Returns the first temp cargo declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp cargo declaration, or <code>null</code> if a matching temp cargo declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCargoDeclaration fetchBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		List<TempCargoDeclaration> list = findBydocumentNameAnddocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp cargo declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp cargo declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCargoDeclarationException if a matching temp cargo declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCargoDeclaration findBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempCargoDeclarationException, SystemException {
		TempCargoDeclaration tempCargoDeclaration = fetchBydocumentNameAnddocumentYear_Last(documentName,
				documentYear, orderByComparator);

		if (tempCargoDeclaration != null) {
			return tempCargoDeclaration;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempCargoDeclarationException(msg.toString());
	}

	/**
	 * Returns the last temp cargo declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp cargo declaration, or <code>null</code> if a matching temp cargo declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCargoDeclaration fetchBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBydocumentNameAnddocumentYear(documentName,
				documentYear);

		if (count == 0) {
			return null;
		}

		List<TempCargoDeclaration> list = findBydocumentNameAnddocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp cargo declarations before and after the current temp cargo declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param id the primary key of the current temp cargo declaration
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp cargo declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCargoDeclarationException if a temp cargo declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCargoDeclaration[] findBydocumentNameAnddocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchTempCargoDeclarationException, SystemException {
		TempCargoDeclaration tempCargoDeclaration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempCargoDeclaration[] array = new TempCargoDeclarationImpl[3];

			array[0] = getBydocumentNameAnddocumentYear_PrevAndNext(session,
					tempCargoDeclaration, documentName, documentYear,
					orderByComparator, true);

			array[1] = tempCargoDeclaration;

			array[2] = getBydocumentNameAnddocumentYear_PrevAndNext(session,
					tempCargoDeclaration, documentName, documentYear,
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

	protected TempCargoDeclaration getBydocumentNameAnddocumentYear_PrevAndNext(
		Session session, TempCargoDeclaration tempCargoDeclaration,
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

		query.append(_SQL_SELECT_TEMPCARGODECLARATION_WHERE);

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
			query.append(TempCargoDeclarationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempCargoDeclaration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempCargoDeclaration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp cargo declarations where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBydocumentNameAnddocumentYear(long documentName,
		int documentYear) throws SystemException {
		for (TempCargoDeclaration tempCargoDeclaration : findBydocumentNameAnddocumentYear(
				documentName, documentYear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempCargoDeclaration);
		}
	}

	/**
	 * Returns the number of temp cargo declarations where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching temp cargo declarations
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

			query.append(_SQL_COUNT_TEMPCARGODECLARATION_WHERE);

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
		"tempCargoDeclaration.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"tempCargoDeclaration.documentYear = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempCargoDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCargoDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempCargoDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempCargoDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCargoDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempCargoDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			TempCargoDeclarationModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempCargoDeclarationModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			TempCargoDeclarationModelImpl.REQUESTSTATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempCargoDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCargoDeclarationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the temp cargo declarations where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the matching temp cargo declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCargoDeclaration> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		return findBydocumentNameAnddocumentYearRequestState(documentName,
			documentYear, requestState, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the temp cargo declarations where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCargoDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp cargo declarations
	 * @param end the upper bound of the range of temp cargo declarations (not inclusive)
	 * @return the range of matching temp cargo declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCargoDeclaration> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end) throws SystemException {
		return findBydocumentNameAnddocumentYearRequestState(documentName,
			documentYear, requestState, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp cargo declarations where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCargoDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp cargo declarations
	 * @param end the upper bound of the range of temp cargo declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp cargo declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCargoDeclaration> findBydocumentNameAnddocumentYearRequestState(
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

		List<TempCargoDeclaration> list = (List<TempCargoDeclaration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempCargoDeclaration tempCargoDeclaration : list) {
				if ((documentName != tempCargoDeclaration.getDocumentName()) ||
						(documentYear != tempCargoDeclaration.getDocumentYear()) ||
						(requestState != tempCargoDeclaration.getRequestState())) {
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

			query.append(_SQL_SELECT_TEMPCARGODECLARATION_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempCargoDeclarationModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempCargoDeclaration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempCargoDeclaration>(list);
				}
				else {
					list = (List<TempCargoDeclaration>)QueryUtil.list(q,
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
	 * Returns the first temp cargo declaration in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp cargo declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCargoDeclarationException if a matching temp cargo declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCargoDeclaration findBydocumentNameAnddocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempCargoDeclarationException, SystemException {
		TempCargoDeclaration tempCargoDeclaration = fetchBydocumentNameAnddocumentYearRequestState_First(documentName,
				documentYear, requestState, orderByComparator);

		if (tempCargoDeclaration != null) {
			return tempCargoDeclaration;
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

		throw new NoSuchTempCargoDeclarationException(msg.toString());
	}

	/**
	 * Returns the first temp cargo declaration in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp cargo declaration, or <code>null</code> if a matching temp cargo declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCargoDeclaration fetchBydocumentNameAnddocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempCargoDeclaration> list = findBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp cargo declaration in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp cargo declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCargoDeclarationException if a matching temp cargo declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCargoDeclaration findBydocumentNameAnddocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempCargoDeclarationException, SystemException {
		TempCargoDeclaration tempCargoDeclaration = fetchBydocumentNameAnddocumentYearRequestState_Last(documentName,
				documentYear, requestState, orderByComparator);

		if (tempCargoDeclaration != null) {
			return tempCargoDeclaration;
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

		throw new NoSuchTempCargoDeclarationException(msg.toString());
	}

	/**
	 * Returns the last temp cargo declaration in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp cargo declaration, or <code>null</code> if a matching temp cargo declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCargoDeclaration fetchBydocumentNameAnddocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState);

		if (count == 0) {
			return null;
		}

		List<TempCargoDeclaration> list = findBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp cargo declarations before and after the current temp cargo declaration in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param id the primary key of the current temp cargo declaration
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp cargo declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCargoDeclarationException if a temp cargo declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCargoDeclaration[] findBydocumentNameAnddocumentYearRequestState_PrevAndNext(
		long id, long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempCargoDeclarationException, SystemException {
		TempCargoDeclaration tempCargoDeclaration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempCargoDeclaration[] array = new TempCargoDeclarationImpl[3];

			array[0] = getBydocumentNameAnddocumentYearRequestState_PrevAndNext(session,
					tempCargoDeclaration, documentName, documentYear,
					requestState, orderByComparator, true);

			array[1] = tempCargoDeclaration;

			array[2] = getBydocumentNameAnddocumentYearRequestState_PrevAndNext(session,
					tempCargoDeclaration, documentName, documentYear,
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

	protected TempCargoDeclaration getBydocumentNameAnddocumentYearRequestState_PrevAndNext(
		Session session, TempCargoDeclaration tempCargoDeclaration,
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

		query.append(_SQL_SELECT_TEMPCARGODECLARATION_WHERE);

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
			query.append(TempCargoDeclarationModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempCargoDeclaration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempCargoDeclaration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp cargo declarations where documentName = &#63; and documentYear = &#63; and requestState = &#63; from the database.
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
		for (TempCargoDeclaration tempCargoDeclaration : findBydocumentNameAnddocumentYearRequestState(
				documentName, documentYear, requestState, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempCargoDeclaration);
		}
	}

	/**
	 * Returns the number of temp cargo declarations where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the number of matching temp cargo declarations
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

			query.append(_SQL_COUNT_TEMPCARGODECLARATION_WHERE);

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
		"tempCargoDeclaration.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2 =
		"tempCargoDeclaration.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2 =
		"tempCargoDeclaration.requestState = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempCargoDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCargoDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempCargoDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempCargoDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCargoDeclarationModelImpl.FINDER_CACHE_ENABLED,
			TempCargoDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempCargoDeclarationModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempCargoDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCargoDeclarationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the temp cargo declarations where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp cargo declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCargoDeclaration> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp cargo declarations where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCargoDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp cargo declarations
	 * @param end the upper bound of the range of temp cargo declarations (not inclusive)
	 * @return the range of matching temp cargo declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCargoDeclaration> findByRequestCode(String requestCode,
		int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp cargo declarations where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCargoDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp cargo declarations
	 * @param end the upper bound of the range of temp cargo declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp cargo declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCargoDeclaration> findByRequestCode(String requestCode,
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

		List<TempCargoDeclaration> list = (List<TempCargoDeclaration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempCargoDeclaration tempCargoDeclaration : list) {
				if (!Validator.equals(requestCode,
							tempCargoDeclaration.getRequestCode())) {
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

			query.append(_SQL_SELECT_TEMPCARGODECLARATION_WHERE);

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
				query.append(TempCargoDeclarationModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempCargoDeclaration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempCargoDeclaration>(list);
				}
				else {
					list = (List<TempCargoDeclaration>)QueryUtil.list(q,
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
	 * Returns the first temp cargo declaration in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp cargo declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCargoDeclarationException if a matching temp cargo declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCargoDeclaration findByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempCargoDeclarationException, SystemException {
		TempCargoDeclaration tempCargoDeclaration = fetchByRequestCode_First(requestCode,
				orderByComparator);

		if (tempCargoDeclaration != null) {
			return tempCargoDeclaration;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempCargoDeclarationException(msg.toString());
	}

	/**
	 * Returns the first temp cargo declaration in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp cargo declaration, or <code>null</code> if a matching temp cargo declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCargoDeclaration fetchByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempCargoDeclaration> list = findByRequestCode(requestCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp cargo declaration in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp cargo declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCargoDeclarationException if a matching temp cargo declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCargoDeclaration findByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempCargoDeclarationException, SystemException {
		TempCargoDeclaration tempCargoDeclaration = fetchByRequestCode_Last(requestCode,
				orderByComparator);

		if (tempCargoDeclaration != null) {
			return tempCargoDeclaration;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempCargoDeclarationException(msg.toString());
	}

	/**
	 * Returns the last temp cargo declaration in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp cargo declaration, or <code>null</code> if a matching temp cargo declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCargoDeclaration fetchByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByRequestCode(requestCode);

		if (count == 0) {
			return null;
		}

		List<TempCargoDeclaration> list = findByRequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp cargo declarations before and after the current temp cargo declaration in the ordered set where requestCode = &#63;.
	 *
	 * @param id the primary key of the current temp cargo declaration
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp cargo declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCargoDeclarationException if a temp cargo declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCargoDeclaration[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempCargoDeclarationException, SystemException {
		TempCargoDeclaration tempCargoDeclaration = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempCargoDeclaration[] array = new TempCargoDeclarationImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session,
					tempCargoDeclaration, requestCode, orderByComparator, true);

			array[1] = tempCargoDeclaration;

			array[2] = getByRequestCode_PrevAndNext(session,
					tempCargoDeclaration, requestCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempCargoDeclaration getByRequestCode_PrevAndNext(
		Session session, TempCargoDeclaration tempCargoDeclaration,
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

		query.append(_SQL_SELECT_TEMPCARGODECLARATION_WHERE);

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
			query.append(TempCargoDeclarationModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempCargoDeclaration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempCargoDeclaration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp cargo declarations where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempCargoDeclaration tempCargoDeclaration : findByRequestCode(
				requestCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tempCargoDeclaration);
		}
	}

	/**
	 * Returns the number of temp cargo declarations where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp cargo declarations
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

			query.append(_SQL_COUNT_TEMPCARGODECLARATION_WHERE);

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

	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempCargoDeclaration.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempCargoDeclaration.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempCargoDeclaration.requestCode IS NULL OR tempCargoDeclaration.requestCode = '')";

	public TempCargoDeclarationPersistenceImpl() {
		setModelClass(TempCargoDeclaration.class);
	}

	/**
	 * Caches the temp cargo declaration in the entity cache if it is enabled.
	 *
	 * @param tempCargoDeclaration the temp cargo declaration
	 */
	@Override
	public void cacheResult(TempCargoDeclaration tempCargoDeclaration) {
		EntityCacheUtil.putResult(TempCargoDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCargoDeclarationImpl.class,
			tempCargoDeclaration.getPrimaryKey(), tempCargoDeclaration);

		tempCargoDeclaration.resetOriginalValues();
	}

	/**
	 * Caches the temp cargo declarations in the entity cache if it is enabled.
	 *
	 * @param tempCargoDeclarations the temp cargo declarations
	 */
	@Override
	public void cacheResult(List<TempCargoDeclaration> tempCargoDeclarations) {
		for (TempCargoDeclaration tempCargoDeclaration : tempCargoDeclarations) {
			if (EntityCacheUtil.getResult(
						TempCargoDeclarationModelImpl.ENTITY_CACHE_ENABLED,
						TempCargoDeclarationImpl.class,
						tempCargoDeclaration.getPrimaryKey()) == null) {
				cacheResult(tempCargoDeclaration);
			}
			else {
				tempCargoDeclaration.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp cargo declarations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempCargoDeclarationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempCargoDeclarationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp cargo declaration.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempCargoDeclaration tempCargoDeclaration) {
		EntityCacheUtil.removeResult(TempCargoDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCargoDeclarationImpl.class, tempCargoDeclaration.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TempCargoDeclaration> tempCargoDeclarations) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempCargoDeclaration tempCargoDeclaration : tempCargoDeclarations) {
			EntityCacheUtil.removeResult(TempCargoDeclarationModelImpl.ENTITY_CACHE_ENABLED,
				TempCargoDeclarationImpl.class,
				tempCargoDeclaration.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp cargo declaration with the primary key. Does not add the temp cargo declaration to the database.
	 *
	 * @param id the primary key for the new temp cargo declaration
	 * @return the new temp cargo declaration
	 */
	@Override
	public TempCargoDeclaration create(long id) {
		TempCargoDeclaration tempCargoDeclaration = new TempCargoDeclarationImpl();

		tempCargoDeclaration.setNew(true);
		tempCargoDeclaration.setPrimaryKey(id);

		return tempCargoDeclaration;
	}

	/**
	 * Removes the temp cargo declaration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp cargo declaration
	 * @return the temp cargo declaration that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCargoDeclarationException if a temp cargo declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCargoDeclaration remove(long id)
		throws NoSuchTempCargoDeclarationException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the temp cargo declaration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp cargo declaration
	 * @return the temp cargo declaration that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCargoDeclarationException if a temp cargo declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCargoDeclaration remove(Serializable primaryKey)
		throws NoSuchTempCargoDeclarationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempCargoDeclaration tempCargoDeclaration = (TempCargoDeclaration)session.get(TempCargoDeclarationImpl.class,
					primaryKey);

			if (tempCargoDeclaration == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempCargoDeclarationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempCargoDeclaration);
		}
		catch (NoSuchTempCargoDeclarationException nsee) {
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
	protected TempCargoDeclaration removeImpl(
		TempCargoDeclaration tempCargoDeclaration) throws SystemException {
		tempCargoDeclaration = toUnwrappedModel(tempCargoDeclaration);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tempCargoDeclaration)) {
				tempCargoDeclaration = (TempCargoDeclaration)session.get(TempCargoDeclarationImpl.class,
						tempCargoDeclaration.getPrimaryKeyObj());
			}

			if (tempCargoDeclaration != null) {
				session.delete(tempCargoDeclaration);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tempCargoDeclaration != null) {
			clearCache(tempCargoDeclaration);
		}

		return tempCargoDeclaration;
	}

	@Override
	public TempCargoDeclaration updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempCargoDeclaration tempCargoDeclaration)
		throws SystemException {
		tempCargoDeclaration = toUnwrappedModel(tempCargoDeclaration);

		boolean isNew = tempCargoDeclaration.isNew();

		TempCargoDeclarationModelImpl tempCargoDeclarationModelImpl = (TempCargoDeclarationModelImpl)tempCargoDeclaration;

		Session session = null;

		try {
			session = openSession();

			if (tempCargoDeclaration.isNew()) {
				session.save(tempCargoDeclaration);

				tempCargoDeclaration.setNew(false);
			}
			else {
				session.merge(tempCargoDeclaration);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TempCargoDeclarationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempCargoDeclarationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempCargoDeclarationModelImpl.getOriginalDocumentName(),
						tempCargoDeclarationModelImpl.getOriginalDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						tempCargoDeclarationModelImpl.getDocumentName(),
						tempCargoDeclarationModelImpl.getDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
			}

			if ((tempCargoDeclarationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempCargoDeclarationModelImpl.getOriginalDocumentName(),
						tempCargoDeclarationModelImpl.getOriginalDocumentYear(),
						tempCargoDeclarationModelImpl.getOriginalRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);

				args = new Object[] {
						tempCargoDeclarationModelImpl.getDocumentName(),
						tempCargoDeclarationModelImpl.getDocumentYear(),
						tempCargoDeclarationModelImpl.getRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
			}

			if ((tempCargoDeclarationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempCargoDeclarationModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] {
						tempCargoDeclarationModelImpl.getRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempCargoDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			TempCargoDeclarationImpl.class,
			tempCargoDeclaration.getPrimaryKey(), tempCargoDeclaration);

		return tempCargoDeclaration;
	}

	protected TempCargoDeclaration toUnwrappedModel(
		TempCargoDeclaration tempCargoDeclaration) {
		if (tempCargoDeclaration instanceof TempCargoDeclarationImpl) {
			return tempCargoDeclaration;
		}

		TempCargoDeclarationImpl tempCargoDeclarationImpl = new TempCargoDeclarationImpl();

		tempCargoDeclarationImpl.setNew(tempCargoDeclaration.isNew());
		tempCargoDeclarationImpl.setPrimaryKey(tempCargoDeclaration.getPrimaryKey());

		tempCargoDeclarationImpl.setId(tempCargoDeclaration.getId());
		tempCargoDeclarationImpl.setRequestCode(tempCargoDeclaration.getRequestCode());
		tempCargoDeclarationImpl.setRequestState(tempCargoDeclaration.getRequestState());
		tempCargoDeclarationImpl.setDocumentName(tempCargoDeclaration.getDocumentName());
		tempCargoDeclarationImpl.setUserCreated(tempCargoDeclaration.getUserCreated());
		tempCargoDeclarationImpl.setIsArrival(tempCargoDeclaration.getIsArrival());
		tempCargoDeclarationImpl.setNameOfShip(tempCargoDeclaration.getNameOfShip());
		tempCargoDeclarationImpl.setImoNumber(tempCargoDeclaration.getImoNumber());
		tempCargoDeclarationImpl.setCallsign(tempCargoDeclaration.getCallsign());
		tempCargoDeclarationImpl.setVoyageNumber(tempCargoDeclaration.getVoyageNumber());
		tempCargoDeclarationImpl.setPortReport(tempCargoDeclaration.getPortReport());
		tempCargoDeclarationImpl.setFlagStateOfShip(tempCargoDeclaration.getFlagStateOfShip());
		tempCargoDeclarationImpl.setNameOfMaster(tempCargoDeclaration.getNameOfMaster());
		tempCargoDeclarationImpl.setPortOfLoading(tempCargoDeclaration.getPortOfLoading());
		tempCargoDeclarationImpl.setListGoods(tempCargoDeclaration.getListGoods());
		tempCargoDeclarationImpl.setSignPlace(tempCargoDeclaration.getSignPlace());
		tempCargoDeclarationImpl.setSignDate(tempCargoDeclaration.getSignDate());
		tempCargoDeclarationImpl.setMasterSigned(tempCargoDeclaration.getMasterSigned());
		tempCargoDeclarationImpl.setMasterSignedImage(tempCargoDeclaration.getMasterSignedImage());
		tempCargoDeclarationImpl.setAttachedFile(tempCargoDeclaration.getAttachedFile());
		tempCargoDeclarationImpl.setDocumentYear(tempCargoDeclaration.getDocumentYear());

		return tempCargoDeclarationImpl;
	}

	/**
	 * Returns the temp cargo declaration with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp cargo declaration
	 * @return the temp cargo declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCargoDeclarationException if a temp cargo declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCargoDeclaration findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTempCargoDeclarationException, SystemException {
		TempCargoDeclaration tempCargoDeclaration = fetchByPrimaryKey(primaryKey);

		if (tempCargoDeclaration == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTempCargoDeclarationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tempCargoDeclaration;
	}

	/**
	 * Returns the temp cargo declaration with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempCargoDeclarationException} if it could not be found.
	 *
	 * @param id the primary key of the temp cargo declaration
	 * @return the temp cargo declaration
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCargoDeclarationException if a temp cargo declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCargoDeclaration findByPrimaryKey(long id)
		throws NoSuchTempCargoDeclarationException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the temp cargo declaration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp cargo declaration
	 * @return the temp cargo declaration, or <code>null</code> if a temp cargo declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCargoDeclaration fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TempCargoDeclaration tempCargoDeclaration = (TempCargoDeclaration)EntityCacheUtil.getResult(TempCargoDeclarationModelImpl.ENTITY_CACHE_ENABLED,
				TempCargoDeclarationImpl.class, primaryKey);

		if (tempCargoDeclaration == _nullTempCargoDeclaration) {
			return null;
		}

		if (tempCargoDeclaration == null) {
			Session session = null;

			try {
				session = openSession();

				tempCargoDeclaration = (TempCargoDeclaration)session.get(TempCargoDeclarationImpl.class,
						primaryKey);

				if (tempCargoDeclaration != null) {
					cacheResult(tempCargoDeclaration);
				}
				else {
					EntityCacheUtil.putResult(TempCargoDeclarationModelImpl.ENTITY_CACHE_ENABLED,
						TempCargoDeclarationImpl.class, primaryKey,
						_nullTempCargoDeclaration);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TempCargoDeclarationModelImpl.ENTITY_CACHE_ENABLED,
					TempCargoDeclarationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tempCargoDeclaration;
	}

	/**
	 * Returns the temp cargo declaration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp cargo declaration
	 * @return the temp cargo declaration, or <code>null</code> if a temp cargo declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCargoDeclaration fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the temp cargo declarations.
	 *
	 * @return the temp cargo declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCargoDeclaration> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp cargo declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCargoDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp cargo declarations
	 * @param end the upper bound of the range of temp cargo declarations (not inclusive)
	 * @return the range of temp cargo declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCargoDeclaration> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp cargo declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCargoDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp cargo declarations
	 * @param end the upper bound of the range of temp cargo declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp cargo declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCargoDeclaration> findAll(int start, int end,
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

		List<TempCargoDeclaration> list = (List<TempCargoDeclaration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPCARGODECLARATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPCARGODECLARATION;

				if (pagination) {
					sql = sql.concat(TempCargoDeclarationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TempCargoDeclaration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempCargoDeclaration>(list);
				}
				else {
					list = (List<TempCargoDeclaration>)QueryUtil.list(q,
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
	 * Removes all the temp cargo declarations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TempCargoDeclaration tempCargoDeclaration : findAll()) {
			remove(tempCargoDeclaration);
		}
	}

	/**
	 * Returns the number of temp cargo declarations.
	 *
	 * @return the number of temp cargo declarations
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

				Query q = session.createQuery(_SQL_COUNT_TEMPCARGODECLARATION);

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
	 * Initializes the temp cargo declaration persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.TempCargoDeclaration")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempCargoDeclaration>> listenersList = new ArrayList<ModelListener<TempCargoDeclaration>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempCargoDeclaration>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempCargoDeclarationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TEMPCARGODECLARATION = "SELECT tempCargoDeclaration FROM TempCargoDeclaration tempCargoDeclaration";
	private static final String _SQL_SELECT_TEMPCARGODECLARATION_WHERE = "SELECT tempCargoDeclaration FROM TempCargoDeclaration tempCargoDeclaration WHERE ";
	private static final String _SQL_COUNT_TEMPCARGODECLARATION = "SELECT COUNT(tempCargoDeclaration) FROM TempCargoDeclaration tempCargoDeclaration";
	private static final String _SQL_COUNT_TEMPCARGODECLARATION_WHERE = "SELECT COUNT(tempCargoDeclaration) FROM TempCargoDeclaration tempCargoDeclaration WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempCargoDeclaration.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempCargoDeclaration exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempCargoDeclaration exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempCargoDeclarationPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "requestState", "documentName",
				"userCreated", "nameOfShip", "imoNumber", "callsign",
				"voyageNumber", "portReport", "flagStateOfShip", "nameOfMaster",
				"portOfLoading", "listGoods", "signPlace", "signDate",
				"masterSigned", "masterSignedImage", "attachedFile",
				"documentYear"
			});
	private static TempCargoDeclaration _nullTempCargoDeclaration = new TempCargoDeclarationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempCargoDeclaration> toCacheModel() {
				return _nullTempCargoDeclarationCacheModel;
			}
		};

	private static CacheModel<TempCargoDeclaration> _nullTempCargoDeclarationCacheModel =
		new CacheModel<TempCargoDeclaration>() {
			@Override
			public TempCargoDeclaration toEntityModel() {
				return _nullTempCargoDeclaration;
			}
		};
}