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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.duongbien.dao.vrcb.NoSuchTempUnitGeneralException;
import vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempUnitGeneralImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempUnitGeneralModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the temp unit general service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempUnitGeneralPersistence
 * @see TempUnitGeneralUtil
 * @generated
 */
public class TempUnitGeneralPersistenceImpl extends BasePersistenceImpl<TempUnitGeneral>
	implements TempUnitGeneralPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempUnitGeneralUtil} to access the temp unit general persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempUnitGeneralImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			TempUnitGeneralModelImpl.FINDER_CACHE_ENABLED,
			TempUnitGeneralImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			TempUnitGeneralModelImpl.FINDER_CACHE_ENABLED,
			TempUnitGeneralImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			TempUnitGeneralModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			TempUnitGeneralModelImpl.FINDER_CACHE_ENABLED,
			TempUnitGeneralImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDocumentNameAndDocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			TempUnitGeneralModelImpl.FINDER_CACHE_ENABLED,
			TempUnitGeneralImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDocumentNameAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			TempUnitGeneralModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempUnitGeneralModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			TempUnitGeneralModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocumentNameAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the temp unit generals where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching temp unit generals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempUnitGeneral> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findByDocumentNameAndDocumentYear(documentName, documentYear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp unit generals where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempUnitGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp unit generals
	 * @param end the upper bound of the range of temp unit generals (not inclusive)
	 * @return the range of matching temp unit generals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempUnitGeneral> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findByDocumentNameAndDocumentYear(documentName, documentYear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp unit generals where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempUnitGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp unit generals
	 * @param end the upper bound of the range of temp unit generals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp unit generals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempUnitGeneral> findByDocumentNameAndDocumentYear(
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

		List<TempUnitGeneral> list = (List<TempUnitGeneral>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempUnitGeneral tempUnitGeneral : list) {
				if ((documentName != tempUnitGeneral.getDocumentName()) ||
						(documentYear != tempUnitGeneral.getDocumentYear())) {
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

			query.append(_SQL_SELECT_TEMPUNITGENERAL_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempUnitGeneralModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempUnitGeneral>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempUnitGeneral>(list);
				}
				else {
					list = (List<TempUnitGeneral>)QueryUtil.list(q,
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
	 * Returns the first temp unit general in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp unit general
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempUnitGeneralException if a matching temp unit general could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempUnitGeneral findByDocumentNameAndDocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempUnitGeneralException, SystemException {
		TempUnitGeneral tempUnitGeneral = fetchByDocumentNameAndDocumentYear_First(documentName,
				documentYear, orderByComparator);

		if (tempUnitGeneral != null) {
			return tempUnitGeneral;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempUnitGeneralException(msg.toString());
	}

	/**
	 * Returns the first temp unit general in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp unit general, or <code>null</code> if a matching temp unit general could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempUnitGeneral fetchByDocumentNameAndDocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		List<TempUnitGeneral> list = findByDocumentNameAndDocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp unit general in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp unit general
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempUnitGeneralException if a matching temp unit general could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempUnitGeneral findByDocumentNameAndDocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempUnitGeneralException, SystemException {
		TempUnitGeneral tempUnitGeneral = fetchByDocumentNameAndDocumentYear_Last(documentName,
				documentYear, orderByComparator);

		if (tempUnitGeneral != null) {
			return tempUnitGeneral;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempUnitGeneralException(msg.toString());
	}

	/**
	 * Returns the last temp unit general in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp unit general, or <code>null</code> if a matching temp unit general could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempUnitGeneral fetchByDocumentNameAndDocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByDocumentNameAndDocumentYear(documentName,
				documentYear);

		if (count == 0) {
			return null;
		}

		List<TempUnitGeneral> list = findByDocumentNameAndDocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp unit generals before and after the current temp unit general in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param id the primary key of the current temp unit general
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp unit general
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempUnitGeneralException if a temp unit general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempUnitGeneral[] findByDocumentNameAndDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchTempUnitGeneralException, SystemException {
		TempUnitGeneral tempUnitGeneral = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempUnitGeneral[] array = new TempUnitGeneralImpl[3];

			array[0] = getByDocumentNameAndDocumentYear_PrevAndNext(session,
					tempUnitGeneral, documentName, documentYear,
					orderByComparator, true);

			array[1] = tempUnitGeneral;

			array[2] = getByDocumentNameAndDocumentYear_PrevAndNext(session,
					tempUnitGeneral, documentName, documentYear,
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

	protected TempUnitGeneral getByDocumentNameAndDocumentYear_PrevAndNext(
		Session session, TempUnitGeneral tempUnitGeneral, long documentName,
		int documentYear, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPUNITGENERAL_WHERE);

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
			query.append(TempUnitGeneralModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempUnitGeneral);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempUnitGeneral> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp unit generals where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDocumentNameAndDocumentYear(long documentName,
		int documentYear) throws SystemException {
		for (TempUnitGeneral tempUnitGeneral : findByDocumentNameAndDocumentYear(
				documentName, documentYear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempUnitGeneral);
		}
	}

	/**
	 * Returns the number of temp unit generals where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching temp unit generals
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

			query.append(_SQL_COUNT_TEMPUNITGENERAL_WHERE);

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
		"tempUnitGeneral.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"tempUnitGeneral.documentYear = ?";

	public TempUnitGeneralPersistenceImpl() {
		setModelClass(TempUnitGeneral.class);
	}

	/**
	 * Caches the temp unit general in the entity cache if it is enabled.
	 *
	 * @param tempUnitGeneral the temp unit general
	 */
	@Override
	public void cacheResult(TempUnitGeneral tempUnitGeneral) {
		EntityCacheUtil.putResult(TempUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			TempUnitGeneralImpl.class, tempUnitGeneral.getPrimaryKey(),
			tempUnitGeneral);

		tempUnitGeneral.resetOriginalValues();
	}

	/**
	 * Caches the temp unit generals in the entity cache if it is enabled.
	 *
	 * @param tempUnitGenerals the temp unit generals
	 */
	@Override
	public void cacheResult(List<TempUnitGeneral> tempUnitGenerals) {
		for (TempUnitGeneral tempUnitGeneral : tempUnitGenerals) {
			if (EntityCacheUtil.getResult(
						TempUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
						TempUnitGeneralImpl.class,
						tempUnitGeneral.getPrimaryKey()) == null) {
				cacheResult(tempUnitGeneral);
			}
			else {
				tempUnitGeneral.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp unit generals.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempUnitGeneralImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempUnitGeneralImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp unit general.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempUnitGeneral tempUnitGeneral) {
		EntityCacheUtil.removeResult(TempUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			TempUnitGeneralImpl.class, tempUnitGeneral.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TempUnitGeneral> tempUnitGenerals) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempUnitGeneral tempUnitGeneral : tempUnitGenerals) {
			EntityCacheUtil.removeResult(TempUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
				TempUnitGeneralImpl.class, tempUnitGeneral.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp unit general with the primary key. Does not add the temp unit general to the database.
	 *
	 * @param id the primary key for the new temp unit general
	 * @return the new temp unit general
	 */
	@Override
	public TempUnitGeneral create(long id) {
		TempUnitGeneral tempUnitGeneral = new TempUnitGeneralImpl();

		tempUnitGeneral.setNew(true);
		tempUnitGeneral.setPrimaryKey(id);

		return tempUnitGeneral;
	}

	/**
	 * Removes the temp unit general with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp unit general
	 * @return the temp unit general that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempUnitGeneralException if a temp unit general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempUnitGeneral remove(long id)
		throws NoSuchTempUnitGeneralException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the temp unit general with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp unit general
	 * @return the temp unit general that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempUnitGeneralException if a temp unit general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempUnitGeneral remove(Serializable primaryKey)
		throws NoSuchTempUnitGeneralException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempUnitGeneral tempUnitGeneral = (TempUnitGeneral)session.get(TempUnitGeneralImpl.class,
					primaryKey);

			if (tempUnitGeneral == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempUnitGeneralException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempUnitGeneral);
		}
		catch (NoSuchTempUnitGeneralException nsee) {
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
	protected TempUnitGeneral removeImpl(TempUnitGeneral tempUnitGeneral)
		throws SystemException {
		tempUnitGeneral = toUnwrappedModel(tempUnitGeneral);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tempUnitGeneral)) {
				tempUnitGeneral = (TempUnitGeneral)session.get(TempUnitGeneralImpl.class,
						tempUnitGeneral.getPrimaryKeyObj());
			}

			if (tempUnitGeneral != null) {
				session.delete(tempUnitGeneral);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tempUnitGeneral != null) {
			clearCache(tempUnitGeneral);
		}

		return tempUnitGeneral;
	}

	@Override
	public TempUnitGeneral updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral tempUnitGeneral)
		throws SystemException {
		tempUnitGeneral = toUnwrappedModel(tempUnitGeneral);

		boolean isNew = tempUnitGeneral.isNew();

		TempUnitGeneralModelImpl tempUnitGeneralModelImpl = (TempUnitGeneralModelImpl)tempUnitGeneral;

		Session session = null;

		try {
			session = openSession();

			if (tempUnitGeneral.isNew()) {
				session.save(tempUnitGeneral);

				tempUnitGeneral.setNew(false);
			}
			else {
				session.merge(tempUnitGeneral);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TempUnitGeneralModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempUnitGeneralModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempUnitGeneralModelImpl.getOriginalDocumentName(),
						tempUnitGeneralModelImpl.getOriginalDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						tempUnitGeneralModelImpl.getDocumentName(),
						tempUnitGeneralModelImpl.getDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
			}
		}

		EntityCacheUtil.putResult(TempUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			TempUnitGeneralImpl.class, tempUnitGeneral.getPrimaryKey(),
			tempUnitGeneral);

		return tempUnitGeneral;
	}

	protected TempUnitGeneral toUnwrappedModel(TempUnitGeneral tempUnitGeneral) {
		if (tempUnitGeneral instanceof TempUnitGeneralImpl) {
			return tempUnitGeneral;
		}

		TempUnitGeneralImpl tempUnitGeneralImpl = new TempUnitGeneralImpl();

		tempUnitGeneralImpl.setNew(tempUnitGeneral.isNew());
		tempUnitGeneralImpl.setPrimaryKey(tempUnitGeneral.getPrimaryKey());

		tempUnitGeneralImpl.setId(tempUnitGeneral.getId());
		tempUnitGeneralImpl.setRequestCode(tempUnitGeneral.getRequestCode());
		tempUnitGeneralImpl.setDocumentName(tempUnitGeneral.getDocumentName());
		tempUnitGeneralImpl.setDocumentYear(tempUnitGeneral.getDocumentYear());
		tempUnitGeneralImpl.setGrossTonnageUnit(tempUnitGeneral.getGrossTonnageUnit());
		tempUnitGeneralImpl.setNetTonnageUnit(tempUnitGeneral.getNetTonnageUnit());
		tempUnitGeneralImpl.setUnitDWT(tempUnitGeneral.getUnitDWT());
		tempUnitGeneralImpl.setUnitLOA(tempUnitGeneral.getUnitLOA());
		tempUnitGeneralImpl.setUnitBreadth(tempUnitGeneral.getUnitBreadth());
		tempUnitGeneralImpl.setUnitClearanceHeight(tempUnitGeneral.getUnitClearanceHeight());
		tempUnitGeneralImpl.setUnitShownDraft(tempUnitGeneral.getUnitShownDraft());
		tempUnitGeneralImpl.setUnitShownDraftxF(tempUnitGeneral.getUnitShownDraftxF());
		tempUnitGeneralImpl.setUnitShownDraftxA(tempUnitGeneral.getUnitShownDraftxA());
		tempUnitGeneralImpl.setUnitHorsePower(tempUnitGeneral.getUnitHorsePower());
		tempUnitGeneralImpl.setUnitRemainingOnBoardxB(tempUnitGeneral.getUnitRemainingOnBoardxB());
		tempUnitGeneralImpl.setUnitRemainingOnBoardxS(tempUnitGeneral.getUnitRemainingOnBoardxS());
		tempUnitGeneralImpl.setUnitFO(tempUnitGeneral.getUnitFO());
		tempUnitGeneralImpl.setUnitLO(tempUnitGeneral.getUnitLO());
		tempUnitGeneralImpl.setUnitFW(tempUnitGeneral.getUnitFW());
		tempUnitGeneralImpl.setUnitDO(tempUnitGeneral.getUnitDO());
		tempUnitGeneralImpl.setUnitSludgeOil(tempUnitGeneral.getUnitSludgeOil());

		return tempUnitGeneralImpl;
	}

	/**
	 * Returns the temp unit general with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp unit general
	 * @return the temp unit general
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempUnitGeneralException if a temp unit general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempUnitGeneral findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTempUnitGeneralException, SystemException {
		TempUnitGeneral tempUnitGeneral = fetchByPrimaryKey(primaryKey);

		if (tempUnitGeneral == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTempUnitGeneralException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tempUnitGeneral;
	}

	/**
	 * Returns the temp unit general with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempUnitGeneralException} if it could not be found.
	 *
	 * @param id the primary key of the temp unit general
	 * @return the temp unit general
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempUnitGeneralException if a temp unit general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempUnitGeneral findByPrimaryKey(long id)
		throws NoSuchTempUnitGeneralException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the temp unit general with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp unit general
	 * @return the temp unit general, or <code>null</code> if a temp unit general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempUnitGeneral fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TempUnitGeneral tempUnitGeneral = (TempUnitGeneral)EntityCacheUtil.getResult(TempUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
				TempUnitGeneralImpl.class, primaryKey);

		if (tempUnitGeneral == _nullTempUnitGeneral) {
			return null;
		}

		if (tempUnitGeneral == null) {
			Session session = null;

			try {
				session = openSession();

				tempUnitGeneral = (TempUnitGeneral)session.get(TempUnitGeneralImpl.class,
						primaryKey);

				if (tempUnitGeneral != null) {
					cacheResult(tempUnitGeneral);
				}
				else {
					EntityCacheUtil.putResult(TempUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
						TempUnitGeneralImpl.class, primaryKey,
						_nullTempUnitGeneral);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TempUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
					TempUnitGeneralImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tempUnitGeneral;
	}

	/**
	 * Returns the temp unit general with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp unit general
	 * @return the temp unit general, or <code>null</code> if a temp unit general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempUnitGeneral fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the temp unit generals.
	 *
	 * @return the temp unit generals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempUnitGeneral> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp unit generals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempUnitGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp unit generals
	 * @param end the upper bound of the range of temp unit generals (not inclusive)
	 * @return the range of temp unit generals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempUnitGeneral> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp unit generals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempUnitGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp unit generals
	 * @param end the upper bound of the range of temp unit generals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp unit generals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempUnitGeneral> findAll(int start, int end,
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

		List<TempUnitGeneral> list = (List<TempUnitGeneral>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPUNITGENERAL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPUNITGENERAL;

				if (pagination) {
					sql = sql.concat(TempUnitGeneralModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TempUnitGeneral>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempUnitGeneral>(list);
				}
				else {
					list = (List<TempUnitGeneral>)QueryUtil.list(q,
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
	 * Removes all the temp unit generals from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TempUnitGeneral tempUnitGeneral : findAll()) {
			remove(tempUnitGeneral);
		}
	}

	/**
	 * Returns the number of temp unit generals.
	 *
	 * @return the number of temp unit generals
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

				Query q = session.createQuery(_SQL_COUNT_TEMPUNITGENERAL);

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
	 * Initializes the temp unit general persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempUnitGeneral>> listenersList = new ArrayList<ModelListener<TempUnitGeneral>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempUnitGeneral>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempUnitGeneralImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TEMPUNITGENERAL = "SELECT tempUnitGeneral FROM TempUnitGeneral tempUnitGeneral";
	private static final String _SQL_SELECT_TEMPUNITGENERAL_WHERE = "SELECT tempUnitGeneral FROM TempUnitGeneral tempUnitGeneral WHERE ";
	private static final String _SQL_COUNT_TEMPUNITGENERAL = "SELECT COUNT(tempUnitGeneral) FROM TempUnitGeneral tempUnitGeneral";
	private static final String _SQL_COUNT_TEMPUNITGENERAL_WHERE = "SELECT COUNT(tempUnitGeneral) FROM TempUnitGeneral tempUnitGeneral WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempUnitGeneral.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempUnitGeneral exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempUnitGeneral exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempUnitGeneralPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "documentName", "documentYear",
				"grossTonnageUnit", "netTonnageUnit", "unitDWT", "unitLOA",
				"unitBreadth", "unitClearanceHeight", "unitShownDraft",
				"unitShownDraftxF", "unitShownDraftxA", "unitHorsePower",
				"unitRemainingOnBoardxB", "unitRemainingOnBoardxS", "unitFO",
				"unitLO", "unitFW", "unitDO", "unitSludgeOil"
			});
	private static TempUnitGeneral _nullTempUnitGeneral = new TempUnitGeneralImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempUnitGeneral> toCacheModel() {
				return _nullTempUnitGeneralCacheModel;
			}
		};

	private static CacheModel<TempUnitGeneral> _nullTempUnitGeneralCacheModel = new CacheModel<TempUnitGeneral>() {
			@Override
			public TempUnitGeneral toEntityModel() {
				return _nullTempUnitGeneral;
			}
		};
}