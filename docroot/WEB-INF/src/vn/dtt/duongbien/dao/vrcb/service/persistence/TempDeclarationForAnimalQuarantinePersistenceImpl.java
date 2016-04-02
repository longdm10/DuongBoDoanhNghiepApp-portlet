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

import vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException;
import vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForAnimalQuarantineImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForAnimalQuarantineModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the temp declaration for animal quarantine service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempDeclarationForAnimalQuarantinePersistence
 * @see TempDeclarationForAnimalQuarantineUtil
 * @generated
 */
public class TempDeclarationForAnimalQuarantinePersistenceImpl
	extends BasePersistenceImpl<TempDeclarationForAnimalQuarantine>
	implements TempDeclarationForAnimalQuarantinePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempDeclarationForAnimalQuarantineUtil} to access the temp declaration for animal quarantine persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempDeclarationForAnimalQuarantineImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempDeclarationForAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationForAnimalQuarantineModelImpl.FINDER_CACHE_ENABLED,
			TempDeclarationForAnimalQuarantineImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempDeclarationForAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationForAnimalQuarantineModelImpl.FINDER_CACHE_ENABLED,
			TempDeclarationForAnimalQuarantineImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempDeclarationForAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationForAnimalQuarantineModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempDeclarationForAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationForAnimalQuarantineModelImpl.FINDER_CACHE_ENABLED,
			TempDeclarationForAnimalQuarantineImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentNameAnddocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempDeclarationForAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationForAnimalQuarantineModelImpl.FINDER_CACHE_ENABLED,
			TempDeclarationForAnimalQuarantineImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			TempDeclarationForAnimalQuarantineModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempDeclarationForAnimalQuarantineModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempDeclarationForAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationForAnimalQuarantineModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the temp declaration for animal quarantines where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching temp declaration for animal quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDeclarationForAnimalQuarantine> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findBydocumentNameAnddocumentYear(documentName, documentYear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp declaration for animal quarantines where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp declaration for animal quarantines
	 * @param end the upper bound of the range of temp declaration for animal quarantines (not inclusive)
	 * @return the range of matching temp declaration for animal quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDeclarationForAnimalQuarantine> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findBydocumentNameAnddocumentYear(documentName, documentYear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp declaration for animal quarantines where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp declaration for animal quarantines
	 * @param end the upper bound of the range of temp declaration for animal quarantines (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp declaration for animal quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDeclarationForAnimalQuarantine> findBydocumentNameAnddocumentYear(
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

		List<TempDeclarationForAnimalQuarantine> list = (List<TempDeclarationForAnimalQuarantine>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine : list) {
				if ((documentName != tempDeclarationForAnimalQuarantine.getDocumentName()) ||
						(documentYear != tempDeclarationForAnimalQuarantine.getDocumentYear())) {
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

			query.append(_SQL_SELECT_TEMPDECLARATIONFORANIMALQUARANTINE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempDeclarationForAnimalQuarantineModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempDeclarationForAnimalQuarantine>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempDeclarationForAnimalQuarantine>(list);
				}
				else {
					list = (List<TempDeclarationForAnimalQuarantine>)QueryUtil.list(q,
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
	 * Returns the first temp declaration for animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp declaration for animal quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException if a matching temp declaration for animal quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationForAnimalQuarantine findBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempDeclarationForAnimalQuarantineException,
			SystemException {
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine = fetchBydocumentNameAnddocumentYear_First(documentName,
				documentYear, orderByComparator);

		if (tempDeclarationForAnimalQuarantine != null) {
			return tempDeclarationForAnimalQuarantine;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempDeclarationForAnimalQuarantineException(msg.toString());
	}

	/**
	 * Returns the first temp declaration for animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp declaration for animal quarantine, or <code>null</code> if a matching temp declaration for animal quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationForAnimalQuarantine fetchBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		List<TempDeclarationForAnimalQuarantine> list = findBydocumentNameAnddocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp declaration for animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp declaration for animal quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException if a matching temp declaration for animal quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationForAnimalQuarantine findBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempDeclarationForAnimalQuarantineException,
			SystemException {
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine = fetchBydocumentNameAnddocumentYear_Last(documentName,
				documentYear, orderByComparator);

		if (tempDeclarationForAnimalQuarantine != null) {
			return tempDeclarationForAnimalQuarantine;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempDeclarationForAnimalQuarantineException(msg.toString());
	}

	/**
	 * Returns the last temp declaration for animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp declaration for animal quarantine, or <code>null</code> if a matching temp declaration for animal quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationForAnimalQuarantine fetchBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBydocumentNameAnddocumentYear(documentName,
				documentYear);

		if (count == 0) {
			return null;
		}

		List<TempDeclarationForAnimalQuarantine> list = findBydocumentNameAnddocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp declaration for animal quarantines before and after the current temp declaration for animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param id the primary key of the current temp declaration for animal quarantine
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp declaration for animal quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException if a temp declaration for animal quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationForAnimalQuarantine[] findBydocumentNameAnddocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchTempDeclarationForAnimalQuarantineException,
			SystemException {
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempDeclarationForAnimalQuarantine[] array = new TempDeclarationForAnimalQuarantineImpl[3];

			array[0] = getBydocumentNameAnddocumentYear_PrevAndNext(session,
					tempDeclarationForAnimalQuarantine, documentName,
					documentYear, orderByComparator, true);

			array[1] = tempDeclarationForAnimalQuarantine;

			array[2] = getBydocumentNameAnddocumentYear_PrevAndNext(session,
					tempDeclarationForAnimalQuarantine, documentName,
					documentYear, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempDeclarationForAnimalQuarantine getBydocumentNameAnddocumentYear_PrevAndNext(
		Session session,
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine,
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

		query.append(_SQL_SELECT_TEMPDECLARATIONFORANIMALQUARANTINE_WHERE);

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
			query.append(TempDeclarationForAnimalQuarantineModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempDeclarationForAnimalQuarantine);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempDeclarationForAnimalQuarantine> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp declaration for animal quarantines where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBydocumentNameAnddocumentYear(long documentName,
		int documentYear) throws SystemException {
		for (TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine : findBydocumentNameAnddocumentYear(
				documentName, documentYear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempDeclarationForAnimalQuarantine);
		}
	}

	/**
	 * Returns the number of temp declaration for animal quarantines where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching temp declaration for animal quarantines
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

			query.append(_SQL_COUNT_TEMPDECLARATIONFORANIMALQUARANTINE_WHERE);

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
		"tempDeclarationForAnimalQuarantine.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"tempDeclarationForAnimalQuarantine.documentYear = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempDeclarationForAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationForAnimalQuarantineModelImpl.FINDER_CACHE_ENABLED,
			TempDeclarationForAnimalQuarantineImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempDeclarationForAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationForAnimalQuarantineModelImpl.FINDER_CACHE_ENABLED,
			TempDeclarationForAnimalQuarantineImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			TempDeclarationForAnimalQuarantineModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempDeclarationForAnimalQuarantineModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			TempDeclarationForAnimalQuarantineModelImpl.REQUESTSTATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempDeclarationForAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationForAnimalQuarantineModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the temp declaration for animal quarantines where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the matching temp declaration for animal quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDeclarationForAnimalQuarantine> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		return findBydocumentNameAnddocumentYearRequestState(documentName,
			documentYear, requestState, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the temp declaration for animal quarantines where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp declaration for animal quarantines
	 * @param end the upper bound of the range of temp declaration for animal quarantines (not inclusive)
	 * @return the range of matching temp declaration for animal quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDeclarationForAnimalQuarantine> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end) throws SystemException {
		return findBydocumentNameAnddocumentYearRequestState(documentName,
			documentYear, requestState, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp declaration for animal quarantines where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp declaration for animal quarantines
	 * @param end the upper bound of the range of temp declaration for animal quarantines (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp declaration for animal quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDeclarationForAnimalQuarantine> findBydocumentNameAnddocumentYearRequestState(
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

		List<TempDeclarationForAnimalQuarantine> list = (List<TempDeclarationForAnimalQuarantine>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine : list) {
				if ((documentName != tempDeclarationForAnimalQuarantine.getDocumentName()) ||
						(documentYear != tempDeclarationForAnimalQuarantine.getDocumentYear()) ||
						(requestState != tempDeclarationForAnimalQuarantine.getRequestState())) {
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

			query.append(_SQL_SELECT_TEMPDECLARATIONFORANIMALQUARANTINE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempDeclarationForAnimalQuarantineModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempDeclarationForAnimalQuarantine>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempDeclarationForAnimalQuarantine>(list);
				}
				else {
					list = (List<TempDeclarationForAnimalQuarantine>)QueryUtil.list(q,
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
	 * Returns the first temp declaration for animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp declaration for animal quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException if a matching temp declaration for animal quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationForAnimalQuarantine findBydocumentNameAnddocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempDeclarationForAnimalQuarantineException,
			SystemException {
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine = fetchBydocumentNameAnddocumentYearRequestState_First(documentName,
				documentYear, requestState, orderByComparator);

		if (tempDeclarationForAnimalQuarantine != null) {
			return tempDeclarationForAnimalQuarantine;
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

		throw new NoSuchTempDeclarationForAnimalQuarantineException(msg.toString());
	}

	/**
	 * Returns the first temp declaration for animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp declaration for animal quarantine, or <code>null</code> if a matching temp declaration for animal quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationForAnimalQuarantine fetchBydocumentNameAnddocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempDeclarationForAnimalQuarantine> list = findBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp declaration for animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp declaration for animal quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException if a matching temp declaration for animal quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationForAnimalQuarantine findBydocumentNameAnddocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempDeclarationForAnimalQuarantineException,
			SystemException {
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine = fetchBydocumentNameAnddocumentYearRequestState_Last(documentName,
				documentYear, requestState, orderByComparator);

		if (tempDeclarationForAnimalQuarantine != null) {
			return tempDeclarationForAnimalQuarantine;
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

		throw new NoSuchTempDeclarationForAnimalQuarantineException(msg.toString());
	}

	/**
	 * Returns the last temp declaration for animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp declaration for animal quarantine, or <code>null</code> if a matching temp declaration for animal quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationForAnimalQuarantine fetchBydocumentNameAnddocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState);

		if (count == 0) {
			return null;
		}

		List<TempDeclarationForAnimalQuarantine> list = findBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp declaration for animal quarantines before and after the current temp declaration for animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param id the primary key of the current temp declaration for animal quarantine
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp declaration for animal quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException if a temp declaration for animal quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationForAnimalQuarantine[] findBydocumentNameAnddocumentYearRequestState_PrevAndNext(
		long id, long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempDeclarationForAnimalQuarantineException,
			SystemException {
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempDeclarationForAnimalQuarantine[] array = new TempDeclarationForAnimalQuarantineImpl[3];

			array[0] = getBydocumentNameAnddocumentYearRequestState_PrevAndNext(session,
					tempDeclarationForAnimalQuarantine, documentName,
					documentYear, requestState, orderByComparator, true);

			array[1] = tempDeclarationForAnimalQuarantine;

			array[2] = getBydocumentNameAnddocumentYearRequestState_PrevAndNext(session,
					tempDeclarationForAnimalQuarantine, documentName,
					documentYear, requestState, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempDeclarationForAnimalQuarantine getBydocumentNameAnddocumentYearRequestState_PrevAndNext(
		Session session,
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine,
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

		query.append(_SQL_SELECT_TEMPDECLARATIONFORANIMALQUARANTINE_WHERE);

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
			query.append(TempDeclarationForAnimalQuarantineModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempDeclarationForAnimalQuarantine);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempDeclarationForAnimalQuarantine> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp declaration for animal quarantines where documentName = &#63; and documentYear = &#63; and requestState = &#63; from the database.
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
		for (TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine : findBydocumentNameAnddocumentYearRequestState(
				documentName, documentYear, requestState, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempDeclarationForAnimalQuarantine);
		}
	}

	/**
	 * Returns the number of temp declaration for animal quarantines where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the number of matching temp declaration for animal quarantines
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

			query.append(_SQL_COUNT_TEMPDECLARATIONFORANIMALQUARANTINE_WHERE);

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
		"tempDeclarationForAnimalQuarantine.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2 =
		"tempDeclarationForAnimalQuarantine.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2 =
		"tempDeclarationForAnimalQuarantine.requestState = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempDeclarationForAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationForAnimalQuarantineModelImpl.FINDER_CACHE_ENABLED,
			TempDeclarationForAnimalQuarantineImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempDeclarationForAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationForAnimalQuarantineModelImpl.FINDER_CACHE_ENABLED,
			TempDeclarationForAnimalQuarantineImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempDeclarationForAnimalQuarantineModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempDeclarationForAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationForAnimalQuarantineModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRequestCode", new String[] { String.class.getName() });

	/**
	 * Returns all the temp declaration for animal quarantines where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp declaration for animal quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDeclarationForAnimalQuarantine> findByRequestCode(
		String requestCode) throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp declaration for animal quarantines where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp declaration for animal quarantines
	 * @param end the upper bound of the range of temp declaration for animal quarantines (not inclusive)
	 * @return the range of matching temp declaration for animal quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDeclarationForAnimalQuarantine> findByRequestCode(
		String requestCode, int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp declaration for animal quarantines where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp declaration for animal quarantines
	 * @param end the upper bound of the range of temp declaration for animal quarantines (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp declaration for animal quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDeclarationForAnimalQuarantine> findByRequestCode(
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

		List<TempDeclarationForAnimalQuarantine> list = (List<TempDeclarationForAnimalQuarantine>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine : list) {
				if (!Validator.equals(requestCode,
							tempDeclarationForAnimalQuarantine.getRequestCode())) {
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

			query.append(_SQL_SELECT_TEMPDECLARATIONFORANIMALQUARANTINE_WHERE);

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
				query.append(TempDeclarationForAnimalQuarantineModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempDeclarationForAnimalQuarantine>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempDeclarationForAnimalQuarantine>(list);
				}
				else {
					list = (List<TempDeclarationForAnimalQuarantine>)QueryUtil.list(q,
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
	 * Returns the first temp declaration for animal quarantine in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp declaration for animal quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException if a matching temp declaration for animal quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationForAnimalQuarantine findByRequestCode_First(
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempDeclarationForAnimalQuarantineException,
			SystemException {
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine = fetchByRequestCode_First(requestCode,
				orderByComparator);

		if (tempDeclarationForAnimalQuarantine != null) {
			return tempDeclarationForAnimalQuarantine;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempDeclarationForAnimalQuarantineException(msg.toString());
	}

	/**
	 * Returns the first temp declaration for animal quarantine in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp declaration for animal quarantine, or <code>null</code> if a matching temp declaration for animal quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationForAnimalQuarantine fetchByRequestCode_First(
		String requestCode, OrderByComparator orderByComparator)
		throws SystemException {
		List<TempDeclarationForAnimalQuarantine> list = findByRequestCode(requestCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp declaration for animal quarantine in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp declaration for animal quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException if a matching temp declaration for animal quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationForAnimalQuarantine findByRequestCode_Last(
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempDeclarationForAnimalQuarantineException,
			SystemException {
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine = fetchByRequestCode_Last(requestCode,
				orderByComparator);

		if (tempDeclarationForAnimalQuarantine != null) {
			return tempDeclarationForAnimalQuarantine;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempDeclarationForAnimalQuarantineException(msg.toString());
	}

	/**
	 * Returns the last temp declaration for animal quarantine in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp declaration for animal quarantine, or <code>null</code> if a matching temp declaration for animal quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationForAnimalQuarantine fetchByRequestCode_Last(
		String requestCode, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByRequestCode(requestCode);

		if (count == 0) {
			return null;
		}

		List<TempDeclarationForAnimalQuarantine> list = findByRequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp declaration for animal quarantines before and after the current temp declaration for animal quarantine in the ordered set where requestCode = &#63;.
	 *
	 * @param id the primary key of the current temp declaration for animal quarantine
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp declaration for animal quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException if a temp declaration for animal quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationForAnimalQuarantine[] findByRequestCode_PrevAndNext(
		long id, String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempDeclarationForAnimalQuarantineException,
			SystemException {
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempDeclarationForAnimalQuarantine[] array = new TempDeclarationForAnimalQuarantineImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session,
					tempDeclarationForAnimalQuarantine, requestCode,
					orderByComparator, true);

			array[1] = tempDeclarationForAnimalQuarantine;

			array[2] = getByRequestCode_PrevAndNext(session,
					tempDeclarationForAnimalQuarantine, requestCode,
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

	protected TempDeclarationForAnimalQuarantine getByRequestCode_PrevAndNext(
		Session session,
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine,
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

		query.append(_SQL_SELECT_TEMPDECLARATIONFORANIMALQUARANTINE_WHERE);

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
			query.append(TempDeclarationForAnimalQuarantineModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempDeclarationForAnimalQuarantine);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempDeclarationForAnimalQuarantine> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp declaration for animal quarantines where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine : findByRequestCode(
				requestCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tempDeclarationForAnimalQuarantine);
		}
	}

	/**
	 * Returns the number of temp declaration for animal quarantines where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp declaration for animal quarantines
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

			query.append(_SQL_COUNT_TEMPDECLARATIONFORANIMALQUARANTINE_WHERE);

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

	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempDeclarationForAnimalQuarantine.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempDeclarationForAnimalQuarantine.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempDeclarationForAnimalQuarantine.requestCode IS NULL OR tempDeclarationForAnimalQuarantine.requestCode = '')";

	public TempDeclarationForAnimalQuarantinePersistenceImpl() {
		setModelClass(TempDeclarationForAnimalQuarantine.class);
	}

	/**
	 * Caches the temp declaration for animal quarantine in the entity cache if it is enabled.
	 *
	 * @param tempDeclarationForAnimalQuarantine the temp declaration for animal quarantine
	 */
	@Override
	public void cacheResult(
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine) {
		EntityCacheUtil.putResult(TempDeclarationForAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationForAnimalQuarantineImpl.class,
			tempDeclarationForAnimalQuarantine.getPrimaryKey(),
			tempDeclarationForAnimalQuarantine);

		tempDeclarationForAnimalQuarantine.resetOriginalValues();
	}

	/**
	 * Caches the temp declaration for animal quarantines in the entity cache if it is enabled.
	 *
	 * @param tempDeclarationForAnimalQuarantines the temp declaration for animal quarantines
	 */
	@Override
	public void cacheResult(
		List<TempDeclarationForAnimalQuarantine> tempDeclarationForAnimalQuarantines) {
		for (TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine : tempDeclarationForAnimalQuarantines) {
			if (EntityCacheUtil.getResult(
						TempDeclarationForAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
						TempDeclarationForAnimalQuarantineImpl.class,
						tempDeclarationForAnimalQuarantine.getPrimaryKey()) == null) {
				cacheResult(tempDeclarationForAnimalQuarantine);
			}
			else {
				tempDeclarationForAnimalQuarantine.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp declaration for animal quarantines.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempDeclarationForAnimalQuarantineImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempDeclarationForAnimalQuarantineImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp declaration for animal quarantine.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine) {
		EntityCacheUtil.removeResult(TempDeclarationForAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationForAnimalQuarantineImpl.class,
			tempDeclarationForAnimalQuarantine.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<TempDeclarationForAnimalQuarantine> tempDeclarationForAnimalQuarantines) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine : tempDeclarationForAnimalQuarantines) {
			EntityCacheUtil.removeResult(TempDeclarationForAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
				TempDeclarationForAnimalQuarantineImpl.class,
				tempDeclarationForAnimalQuarantine.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp declaration for animal quarantine with the primary key. Does not add the temp declaration for animal quarantine to the database.
	 *
	 * @param id the primary key for the new temp declaration for animal quarantine
	 * @return the new temp declaration for animal quarantine
	 */
	@Override
	public TempDeclarationForAnimalQuarantine create(long id) {
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine = new TempDeclarationForAnimalQuarantineImpl();

		tempDeclarationForAnimalQuarantine.setNew(true);
		tempDeclarationForAnimalQuarantine.setPrimaryKey(id);

		return tempDeclarationForAnimalQuarantine;
	}

	/**
	 * Removes the temp declaration for animal quarantine with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp declaration for animal quarantine
	 * @return the temp declaration for animal quarantine that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException if a temp declaration for animal quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationForAnimalQuarantine remove(long id)
		throws NoSuchTempDeclarationForAnimalQuarantineException,
			SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the temp declaration for animal quarantine with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp declaration for animal quarantine
	 * @return the temp declaration for animal quarantine that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException if a temp declaration for animal quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationForAnimalQuarantine remove(Serializable primaryKey)
		throws NoSuchTempDeclarationForAnimalQuarantineException,
			SystemException {
		Session session = null;

		try {
			session = openSession();

			TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine =
				(TempDeclarationForAnimalQuarantine)session.get(TempDeclarationForAnimalQuarantineImpl.class,
					primaryKey);

			if (tempDeclarationForAnimalQuarantine == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempDeclarationForAnimalQuarantineException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempDeclarationForAnimalQuarantine);
		}
		catch (NoSuchTempDeclarationForAnimalQuarantineException nsee) {
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
	protected TempDeclarationForAnimalQuarantine removeImpl(
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine)
		throws SystemException {
		tempDeclarationForAnimalQuarantine = toUnwrappedModel(tempDeclarationForAnimalQuarantine);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tempDeclarationForAnimalQuarantine)) {
				tempDeclarationForAnimalQuarantine = (TempDeclarationForAnimalQuarantine)session.get(TempDeclarationForAnimalQuarantineImpl.class,
						tempDeclarationForAnimalQuarantine.getPrimaryKeyObj());
			}

			if (tempDeclarationForAnimalQuarantine != null) {
				session.delete(tempDeclarationForAnimalQuarantine);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tempDeclarationForAnimalQuarantine != null) {
			clearCache(tempDeclarationForAnimalQuarantine);
		}

		return tempDeclarationForAnimalQuarantine;
	}

	@Override
	public TempDeclarationForAnimalQuarantine updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine)
		throws SystemException {
		tempDeclarationForAnimalQuarantine = toUnwrappedModel(tempDeclarationForAnimalQuarantine);

		boolean isNew = tempDeclarationForAnimalQuarantine.isNew();

		TempDeclarationForAnimalQuarantineModelImpl tempDeclarationForAnimalQuarantineModelImpl =
			(TempDeclarationForAnimalQuarantineModelImpl)tempDeclarationForAnimalQuarantine;

		Session session = null;

		try {
			session = openSession();

			if (tempDeclarationForAnimalQuarantine.isNew()) {
				session.save(tempDeclarationForAnimalQuarantine);

				tempDeclarationForAnimalQuarantine.setNew(false);
			}
			else {
				session.merge(tempDeclarationForAnimalQuarantine);
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
				!TempDeclarationForAnimalQuarantineModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempDeclarationForAnimalQuarantineModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempDeclarationForAnimalQuarantineModelImpl.getOriginalDocumentName(),
						tempDeclarationForAnimalQuarantineModelImpl.getOriginalDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						tempDeclarationForAnimalQuarantineModelImpl.getDocumentName(),
						tempDeclarationForAnimalQuarantineModelImpl.getDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
			}

			if ((tempDeclarationForAnimalQuarantineModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempDeclarationForAnimalQuarantineModelImpl.getOriginalDocumentName(),
						tempDeclarationForAnimalQuarantineModelImpl.getOriginalDocumentYear(),
						tempDeclarationForAnimalQuarantineModelImpl.getOriginalRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);

				args = new Object[] {
						tempDeclarationForAnimalQuarantineModelImpl.getDocumentName(),
						tempDeclarationForAnimalQuarantineModelImpl.getDocumentYear(),
						tempDeclarationForAnimalQuarantineModelImpl.getRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
			}

			if ((tempDeclarationForAnimalQuarantineModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempDeclarationForAnimalQuarantineModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] {
						tempDeclarationForAnimalQuarantineModelImpl.getRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempDeclarationForAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempDeclarationForAnimalQuarantineImpl.class,
			tempDeclarationForAnimalQuarantine.getPrimaryKey(),
			tempDeclarationForAnimalQuarantine);

		return tempDeclarationForAnimalQuarantine;
	}

	protected TempDeclarationForAnimalQuarantine toUnwrappedModel(
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine) {
		if (tempDeclarationForAnimalQuarantine instanceof TempDeclarationForAnimalQuarantineImpl) {
			return tempDeclarationForAnimalQuarantine;
		}

		TempDeclarationForAnimalQuarantineImpl tempDeclarationForAnimalQuarantineImpl =
			new TempDeclarationForAnimalQuarantineImpl();

		tempDeclarationForAnimalQuarantineImpl.setNew(tempDeclarationForAnimalQuarantine.isNew());
		tempDeclarationForAnimalQuarantineImpl.setPrimaryKey(tempDeclarationForAnimalQuarantine.getPrimaryKey());

		tempDeclarationForAnimalQuarantineImpl.setId(tempDeclarationForAnimalQuarantine.getId());
		tempDeclarationForAnimalQuarantineImpl.setRequestCode(tempDeclarationForAnimalQuarantine.getRequestCode());
		tempDeclarationForAnimalQuarantineImpl.setRequestState(tempDeclarationForAnimalQuarantine.getRequestState());
		tempDeclarationForAnimalQuarantineImpl.setDocumentName(tempDeclarationForAnimalQuarantine.getDocumentName());
		tempDeclarationForAnimalQuarantineImpl.setDocumentYear(tempDeclarationForAnimalQuarantine.getDocumentYear());
		tempDeclarationForAnimalQuarantineImpl.setUserCreated(tempDeclarationForAnimalQuarantine.getUserCreated());
		tempDeclarationForAnimalQuarantineImpl.setNameOfShip(tempDeclarationForAnimalQuarantine.getNameOfShip());
		tempDeclarationForAnimalQuarantineImpl.setFlagStateOfShip(tempDeclarationForAnimalQuarantine.getFlagStateOfShip());
		tempDeclarationForAnimalQuarantineImpl.setNumberOfCrew(tempDeclarationForAnimalQuarantine.getNumberOfCrew());
		tempDeclarationForAnimalQuarantineImpl.setNumberOfPassengers(tempDeclarationForAnimalQuarantine.getNumberOfPassengers());
		tempDeclarationForAnimalQuarantineImpl.setLastPortOfCallCode(tempDeclarationForAnimalQuarantine.getLastPortOfCallCode());
		tempDeclarationForAnimalQuarantineImpl.setNextPortOfCallCode(tempDeclarationForAnimalQuarantine.getNextPortOfCallCode());
		tempDeclarationForAnimalQuarantineImpl.setAnimalNameFirst(tempDeclarationForAnimalQuarantine.getAnimalNameFirst());
		tempDeclarationForAnimalQuarantineImpl.setAnimalNameBetween(tempDeclarationForAnimalQuarantine.getAnimalNameBetween());
		tempDeclarationForAnimalQuarantineImpl.setAnimalNameThis(tempDeclarationForAnimalQuarantine.getAnimalNameThis());
		tempDeclarationForAnimalQuarantineImpl.setNameOfMaster(tempDeclarationForAnimalQuarantine.getNameOfMaster());
		tempDeclarationForAnimalQuarantineImpl.setSignPlace(tempDeclarationForAnimalQuarantine.getSignPlace());
		tempDeclarationForAnimalQuarantineImpl.setSignDate(tempDeclarationForAnimalQuarantine.getSignDate());
		tempDeclarationForAnimalQuarantineImpl.setMasterSigned(tempDeclarationForAnimalQuarantine.getMasterSigned());
		tempDeclarationForAnimalQuarantineImpl.setMasterSignedImage(tempDeclarationForAnimalQuarantine.getMasterSignedImage());
		tempDeclarationForAnimalQuarantineImpl.setAttachedFile(tempDeclarationForAnimalQuarantine.getAttachedFile());

		return tempDeclarationForAnimalQuarantineImpl;
	}

	/**
	 * Returns the temp declaration for animal quarantine with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp declaration for animal quarantine
	 * @return the temp declaration for animal quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException if a temp declaration for animal quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationForAnimalQuarantine findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchTempDeclarationForAnimalQuarantineException,
			SystemException {
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine = fetchByPrimaryKey(primaryKey);

		if (tempDeclarationForAnimalQuarantine == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTempDeclarationForAnimalQuarantineException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tempDeclarationForAnimalQuarantine;
	}

	/**
	 * Returns the temp declaration for animal quarantine with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException} if it could not be found.
	 *
	 * @param id the primary key of the temp declaration for animal quarantine
	 * @return the temp declaration for animal quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException if a temp declaration for animal quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationForAnimalQuarantine findByPrimaryKey(long id)
		throws NoSuchTempDeclarationForAnimalQuarantineException,
			SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the temp declaration for animal quarantine with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp declaration for animal quarantine
	 * @return the temp declaration for animal quarantine, or <code>null</code> if a temp declaration for animal quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationForAnimalQuarantine fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine = (TempDeclarationForAnimalQuarantine)EntityCacheUtil.getResult(TempDeclarationForAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
				TempDeclarationForAnimalQuarantineImpl.class, primaryKey);

		if (tempDeclarationForAnimalQuarantine == _nullTempDeclarationForAnimalQuarantine) {
			return null;
		}

		if (tempDeclarationForAnimalQuarantine == null) {
			Session session = null;

			try {
				session = openSession();

				tempDeclarationForAnimalQuarantine = (TempDeclarationForAnimalQuarantine)session.get(TempDeclarationForAnimalQuarantineImpl.class,
						primaryKey);

				if (tempDeclarationForAnimalQuarantine != null) {
					cacheResult(tempDeclarationForAnimalQuarantine);
				}
				else {
					EntityCacheUtil.putResult(TempDeclarationForAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
						TempDeclarationForAnimalQuarantineImpl.class,
						primaryKey, _nullTempDeclarationForAnimalQuarantine);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TempDeclarationForAnimalQuarantineModelImpl.ENTITY_CACHE_ENABLED,
					TempDeclarationForAnimalQuarantineImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tempDeclarationForAnimalQuarantine;
	}

	/**
	 * Returns the temp declaration for animal quarantine with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp declaration for animal quarantine
	 * @return the temp declaration for animal quarantine, or <code>null</code> if a temp declaration for animal quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationForAnimalQuarantine fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the temp declaration for animal quarantines.
	 *
	 * @return the temp declaration for animal quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDeclarationForAnimalQuarantine> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp declaration for animal quarantines.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp declaration for animal quarantines
	 * @param end the upper bound of the range of temp declaration for animal quarantines (not inclusive)
	 * @return the range of temp declaration for animal quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDeclarationForAnimalQuarantine> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp declaration for animal quarantines.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp declaration for animal quarantines
	 * @param end the upper bound of the range of temp declaration for animal quarantines (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp declaration for animal quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDeclarationForAnimalQuarantine> findAll(int start, int end,
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

		List<TempDeclarationForAnimalQuarantine> list = (List<TempDeclarationForAnimalQuarantine>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPDECLARATIONFORANIMALQUARANTINE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPDECLARATIONFORANIMALQUARANTINE;

				if (pagination) {
					sql = sql.concat(TempDeclarationForAnimalQuarantineModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TempDeclarationForAnimalQuarantine>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempDeclarationForAnimalQuarantine>(list);
				}
				else {
					list = (List<TempDeclarationForAnimalQuarantine>)QueryUtil.list(q,
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
	 * Removes all the temp declaration for animal quarantines from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine : findAll()) {
			remove(tempDeclarationForAnimalQuarantine);
		}
	}

	/**
	 * Returns the number of temp declaration for animal quarantines.
	 *
	 * @return the number of temp declaration for animal quarantines
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

				Query q = session.createQuery(_SQL_COUNT_TEMPDECLARATIONFORANIMALQUARANTINE);

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
	 * Initializes the temp declaration for animal quarantine persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempDeclarationForAnimalQuarantine>> listenersList =
					new ArrayList<ModelListener<TempDeclarationForAnimalQuarantine>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempDeclarationForAnimalQuarantine>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempDeclarationForAnimalQuarantineImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TEMPDECLARATIONFORANIMALQUARANTINE = "SELECT tempDeclarationForAnimalQuarantine FROM TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine";
	private static final String _SQL_SELECT_TEMPDECLARATIONFORANIMALQUARANTINE_WHERE =
		"SELECT tempDeclarationForAnimalQuarantine FROM TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine WHERE ";
	private static final String _SQL_COUNT_TEMPDECLARATIONFORANIMALQUARANTINE = "SELECT COUNT(tempDeclarationForAnimalQuarantine) FROM TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine";
	private static final String _SQL_COUNT_TEMPDECLARATIONFORANIMALQUARANTINE_WHERE =
		"SELECT COUNT(tempDeclarationForAnimalQuarantine) FROM TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempDeclarationForAnimalQuarantine.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempDeclarationForAnimalQuarantine exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempDeclarationForAnimalQuarantine exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempDeclarationForAnimalQuarantinePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "requestState", "documentName",
				"documentYear", "userCreated", "nameOfShip", "flagStateOfShip",
				"numberOfCrew", "numberOfPassengers", "lastPortOfCallCode",
				"nextPortOfCallCode", "animalNameFirst", "animalNameBetween",
				"animalNameThis", "nameOfMaster", "signPlace", "signDate",
				"masterSigned", "masterSignedImage", "attachedFile"
			});
	private static TempDeclarationForAnimalQuarantine _nullTempDeclarationForAnimalQuarantine =
		new TempDeclarationForAnimalQuarantineImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempDeclarationForAnimalQuarantine> toCacheModel() {
				return _nullTempDeclarationForAnimalQuarantineCacheModel;
			}
		};

	private static CacheModel<TempDeclarationForAnimalQuarantine> _nullTempDeclarationForAnimalQuarantineCacheModel =
		new CacheModel<TempDeclarationForAnimalQuarantine>() {
			@Override
			public TempDeclarationForAnimalQuarantine toEntityModel() {
				return _nullTempDeclarationForAnimalQuarantine;
			}
		};
}