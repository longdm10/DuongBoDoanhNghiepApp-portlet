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

import vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException;
import vn.dtt.duongbien.dao.vrcb.model.TempDocument;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempDocumentImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempDocumentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the temp document service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempDocumentPersistence
 * @see TempDocumentUtil
 * @generated
 */
public class TempDocumentPersistenceImpl extends BasePersistenceImpl<TempDocument>
	implements TempDocumentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempDocumentUtil} to access the temp document persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempDocumentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, TempDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, TempDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, TempDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByTemDocumentByDocumentNameAndDocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, TempDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByTemDocumentByDocumentNameAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			TempDocumentModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempDocumentModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByTemDocumentByDocumentNameAndDocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the temp documents where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDocument> findByTemDocumentByDocumentNameAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findByTemDocumentByDocumentNameAndDocumentYear(documentName,
			documentYear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp documents where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp documents
	 * @param end the upper bound of the range of temp documents (not inclusive)
	 * @return the range of matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDocument> findByTemDocumentByDocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findByTemDocumentByDocumentNameAndDocumentYear(documentName,
			documentYear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp documents where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp documents
	 * @param end the upper bound of the range of temp documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDocument> findByTemDocumentByDocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR;
			finderArgs = new Object[] { documentName, documentYear };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR;
			finderArgs = new Object[] {
					documentName, documentYear,
					
					start, end, orderByComparator
				};
		}

		List<TempDocument> list = (List<TempDocument>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempDocument tempDocument : list) {
				if ((documentName != tempDocument.getDocumentName()) ||
						(documentYear != tempDocument.getDocumentYear())) {
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

			query.append(_SQL_SELECT_TEMPDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempDocumentModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempDocument>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempDocument>(list);
				}
				else {
					list = (List<TempDocument>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first temp document in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp document
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException if a matching temp document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDocument findByTemDocumentByDocumentNameAndDocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempDocumentException, SystemException {
		TempDocument tempDocument = fetchByTemDocumentByDocumentNameAndDocumentYear_First(documentName,
				documentYear, orderByComparator);

		if (tempDocument != null) {
			return tempDocument;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempDocumentException(msg.toString());
	}

	/**
	 * Returns the first temp document in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp document, or <code>null</code> if a matching temp document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDocument fetchByTemDocumentByDocumentNameAndDocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		List<TempDocument> list = findByTemDocumentByDocumentNameAndDocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp document in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp document
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException if a matching temp document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDocument findByTemDocumentByDocumentNameAndDocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempDocumentException, SystemException {
		TempDocument tempDocument = fetchByTemDocumentByDocumentNameAndDocumentYear_Last(documentName,
				documentYear, orderByComparator);

		if (tempDocument != null) {
			return tempDocument;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempDocumentException(msg.toString());
	}

	/**
	 * Returns the last temp document in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp document, or <code>null</code> if a matching temp document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDocument fetchByTemDocumentByDocumentNameAndDocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByTemDocumentByDocumentNameAndDocumentYear(documentName,
				documentYear);

		if (count == 0) {
			return null;
		}

		List<TempDocument> list = findByTemDocumentByDocumentNameAndDocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp documents before and after the current temp document in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param id the primary key of the current temp document
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp document
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException if a temp document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDocument[] findByTemDocumentByDocumentNameAndDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchTempDocumentException, SystemException {
		TempDocument tempDocument = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempDocument[] array = new TempDocumentImpl[3];

			array[0] = getByTemDocumentByDocumentNameAndDocumentYear_PrevAndNext(session,
					tempDocument, documentName, documentYear,
					orderByComparator, true);

			array[1] = tempDocument;

			array[2] = getByTemDocumentByDocumentNameAndDocumentYear_PrevAndNext(session,
					tempDocument, documentName, documentYear,
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

	protected TempDocument getByTemDocumentByDocumentNameAndDocumentYear_PrevAndNext(
		Session session, TempDocument tempDocument, long documentName,
		int documentYear, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

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
			query.append(TempDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp documents where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTemDocumentByDocumentNameAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		for (TempDocument tempDocument : findByTemDocumentByDocumentNameAndDocumentYear(
				documentName, documentYear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempDocument);
		}
	}

	/**
	 * Returns the number of temp documents where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTemDocumentByDocumentNameAndDocumentYear(
		long documentName, int documentYear) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR;

		Object[] finderArgs = new Object[] { documentName, documentYear };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TEMPDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

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

	private static final String _FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2 =
		"tempDocument.documentName = ? AND ";
	private static final String _FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"tempDocument.documentYear = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, TempDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByTemDocumentByDocumentNameAndDocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, TempDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByTemDocumentByDocumentNameAndDocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			TempDocumentModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempDocumentModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			TempDocumentModelImpl.REQUESTSTATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByTemDocumentByDocumentNameAndDocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the temp documents where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDocument> findByTemDocumentByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		return findByTemDocumentByDocumentNameAndDocumentYearRequestState(documentName,
			documentYear, requestState, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the temp documents where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp documents
	 * @param end the upper bound of the range of temp documents (not inclusive)
	 * @return the range of matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDocument> findByTemDocumentByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end) throws SystemException {
		return findByTemDocumentByDocumentNameAndDocumentYearRequestState(documentName,
			documentYear, requestState, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp documents where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp documents
	 * @param end the upper bound of the range of temp documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDocument> findByTemDocumentByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE;
			finderArgs = new Object[] { documentName, documentYear, requestState };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE;
			finderArgs = new Object[] {
					documentName, documentYear, requestState,
					
					start, end, orderByComparator
				};
		}

		List<TempDocument> list = (List<TempDocument>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempDocument tempDocument : list) {
				if ((documentName != tempDocument.getDocumentName()) ||
						(documentYear != tempDocument.getDocumentYear()) ||
						(requestState != tempDocument.getRequestState())) {
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

			query.append(_SQL_SELECT_TEMPDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempDocumentModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempDocument>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempDocument>(list);
				}
				else {
					list = (List<TempDocument>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first temp document in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp document
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException if a matching temp document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDocument findByTemDocumentByDocumentNameAndDocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempDocumentException, SystemException {
		TempDocument tempDocument = fetchByTemDocumentByDocumentNameAndDocumentYearRequestState_First(documentName,
				documentYear, requestState, orderByComparator);

		if (tempDocument != null) {
			return tempDocument;
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

		throw new NoSuchTempDocumentException(msg.toString());
	}

	/**
	 * Returns the first temp document in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp document, or <code>null</code> if a matching temp document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDocument fetchByTemDocumentByDocumentNameAndDocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempDocument> list = findByTemDocumentByDocumentNameAndDocumentYearRequestState(documentName,
				documentYear, requestState, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp document in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp document
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException if a matching temp document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDocument findByTemDocumentByDocumentNameAndDocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempDocumentException, SystemException {
		TempDocument tempDocument = fetchByTemDocumentByDocumentNameAndDocumentYearRequestState_Last(documentName,
				documentYear, requestState, orderByComparator);

		if (tempDocument != null) {
			return tempDocument;
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

		throw new NoSuchTempDocumentException(msg.toString());
	}

	/**
	 * Returns the last temp document in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp document, or <code>null</code> if a matching temp document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDocument fetchByTemDocumentByDocumentNameAndDocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTemDocumentByDocumentNameAndDocumentYearRequestState(documentName,
				documentYear, requestState);

		if (count == 0) {
			return null;
		}

		List<TempDocument> list = findByTemDocumentByDocumentNameAndDocumentYearRequestState(documentName,
				documentYear, requestState, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp documents before and after the current temp document in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param id the primary key of the current temp document
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp document
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException if a temp document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDocument[] findByTemDocumentByDocumentNameAndDocumentYearRequestState_PrevAndNext(
		long id, long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempDocumentException, SystemException {
		TempDocument tempDocument = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempDocument[] array = new TempDocumentImpl[3];

			array[0] = getByTemDocumentByDocumentNameAndDocumentYearRequestState_PrevAndNext(session,
					tempDocument, documentName, documentYear, requestState,
					orderByComparator, true);

			array[1] = tempDocument;

			array[2] = getByTemDocumentByDocumentNameAndDocumentYearRequestState_PrevAndNext(session,
					tempDocument, documentName, documentYear, requestState,
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

	protected TempDocument getByTemDocumentByDocumentNameAndDocumentYearRequestState_PrevAndNext(
		Session session, TempDocument tempDocument, long documentName,
		int documentYear, int requestState,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2);

		query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2);

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
			query.append(TempDocumentModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp documents where documentName = &#63; and documentYear = &#63; and requestState = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTemDocumentByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		for (TempDocument tempDocument : findByTemDocumentByDocumentNameAndDocumentYearRequestState(
				documentName, documentYear, requestState, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempDocument);
		}
	}

	/**
	 * Returns the number of temp documents where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the number of matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTemDocumentByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE;

		Object[] finderArgs = new Object[] {
				documentName, documentYear, requestState
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TEMPDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2);

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

	private static final String _FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2 =
		"tempDocument.documentName = ? AND ";
	private static final String _FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2 =
		"tempDocument.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2 =
		"tempDocument.requestState = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, TempDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, TempDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempDocumentModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the temp documents where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDocument> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp documents where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp documents
	 * @param end the upper bound of the range of temp documents (not inclusive)
	 * @return the range of matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDocument> findByRequestCode(String requestCode, int start,
		int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp documents where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp documents
	 * @param end the upper bound of the range of temp documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDocument> findByRequestCode(String requestCode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
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

		List<TempDocument> list = (List<TempDocument>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempDocument tempDocument : list) {
				if (!Validator.equals(requestCode, tempDocument.getRequestCode())) {
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

			query.append(_SQL_SELECT_TEMPDOCUMENT_WHERE);

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
				query.append(TempDocumentModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempDocument>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempDocument>(list);
				}
				else {
					list = (List<TempDocument>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first temp document in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp document
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException if a matching temp document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDocument findByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempDocumentException, SystemException {
		TempDocument tempDocument = fetchByRequestCode_First(requestCode,
				orderByComparator);

		if (tempDocument != null) {
			return tempDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempDocumentException(msg.toString());
	}

	/**
	 * Returns the first temp document in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp document, or <code>null</code> if a matching temp document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDocument fetchByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempDocument> list = findByRequestCode(requestCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp document in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp document
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException if a matching temp document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDocument findByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempDocumentException, SystemException {
		TempDocument tempDocument = fetchByRequestCode_Last(requestCode,
				orderByComparator);

		if (tempDocument != null) {
			return tempDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempDocumentException(msg.toString());
	}

	/**
	 * Returns the last temp document in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp document, or <code>null</code> if a matching temp document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDocument fetchByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByRequestCode(requestCode);

		if (count == 0) {
			return null;
		}

		List<TempDocument> list = findByRequestCode(requestCode, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp documents before and after the current temp document in the ordered set where requestCode = &#63;.
	 *
	 * @param id the primary key of the current temp document
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp document
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException if a temp document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDocument[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempDocumentException, SystemException {
		TempDocument tempDocument = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempDocument[] array = new TempDocumentImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session, tempDocument,
					requestCode, orderByComparator, true);

			array[1] = tempDocument;

			array[2] = getByRequestCode_PrevAndNext(session, tempDocument,
					requestCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempDocument getByRequestCode_PrevAndNext(Session session,
		TempDocument tempDocument, String requestCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPDOCUMENT_WHERE);

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
			query.append(TempDocumentModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp documents where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempDocument tempDocument : findByRequestCode(requestCode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tempDocument);
		}
	}

	/**
	 * Returns the number of temp documents where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp documents
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

			query.append(_SQL_COUNT_TEMPDOCUMENT_WHERE);

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

	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempDocument.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempDocument.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempDocument.requestCode IS NULL OR tempDocument.requestCode = '')";

	public TempDocumentPersistenceImpl() {
		setModelClass(TempDocument.class);
	}

	/**
	 * Caches the temp document in the entity cache if it is enabled.
	 *
	 * @param tempDocument the temp document
	 */
	@Override
	public void cacheResult(TempDocument tempDocument) {
		EntityCacheUtil.putResult(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentImpl.class, tempDocument.getPrimaryKey(), tempDocument);

		tempDocument.resetOriginalValues();
	}

	/**
	 * Caches the temp documents in the entity cache if it is enabled.
	 *
	 * @param tempDocuments the temp documents
	 */
	@Override
	public void cacheResult(List<TempDocument> tempDocuments) {
		for (TempDocument tempDocument : tempDocuments) {
			if (EntityCacheUtil.getResult(
						TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
						TempDocumentImpl.class, tempDocument.getPrimaryKey()) == null) {
				cacheResult(tempDocument);
			}
			else {
				tempDocument.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp documents.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempDocumentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempDocumentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp document.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempDocument tempDocument) {
		EntityCacheUtil.removeResult(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentImpl.class, tempDocument.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TempDocument> tempDocuments) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempDocument tempDocument : tempDocuments) {
			EntityCacheUtil.removeResult(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
				TempDocumentImpl.class, tempDocument.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp document with the primary key. Does not add the temp document to the database.
	 *
	 * @param id the primary key for the new temp document
	 * @return the new temp document
	 */
	@Override
	public TempDocument create(long id) {
		TempDocument tempDocument = new TempDocumentImpl();

		tempDocument.setNew(true);
		tempDocument.setPrimaryKey(id);

		return tempDocument;
	}

	/**
	 * Removes the temp document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp document
	 * @return the temp document that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException if a temp document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDocument remove(long id)
		throws NoSuchTempDocumentException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the temp document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp document
	 * @return the temp document that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException if a temp document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDocument remove(Serializable primaryKey)
		throws NoSuchTempDocumentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempDocument tempDocument = (TempDocument)session.get(TempDocumentImpl.class,
					primaryKey);

			if (tempDocument == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempDocument);
		}
		catch (NoSuchTempDocumentException nsee) {
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
	protected TempDocument removeImpl(TempDocument tempDocument)
		throws SystemException {
		tempDocument = toUnwrappedModel(tempDocument);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tempDocument)) {
				tempDocument = (TempDocument)session.get(TempDocumentImpl.class,
						tempDocument.getPrimaryKeyObj());
			}

			if (tempDocument != null) {
				session.delete(tempDocument);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tempDocument != null) {
			clearCache(tempDocument);
		}

		return tempDocument;
	}

	@Override
	public TempDocument updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempDocument tempDocument)
		throws SystemException {
		tempDocument = toUnwrappedModel(tempDocument);

		boolean isNew = tempDocument.isNew();

		TempDocumentModelImpl tempDocumentModelImpl = (TempDocumentModelImpl)tempDocument;

		Session session = null;

		try {
			session = openSession();

			if (tempDocument.isNew()) {
				session.save(tempDocument);

				tempDocument.setNew(false);
			}
			else {
				session.merge(tempDocument);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TempDocumentModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempDocumentModelImpl.getOriginalDocumentName(),
						tempDocumentModelImpl.getOriginalDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						tempDocumentModelImpl.getDocumentName(),
						tempDocumentModelImpl.getDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEAR,
					args);
			}

			if ((tempDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempDocumentModelImpl.getOriginalDocumentName(),
						tempDocumentModelImpl.getOriginalDocumentYear(),
						tempDocumentModelImpl.getOriginalRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);

				args = new Object[] {
						tempDocumentModelImpl.getDocumentName(),
						tempDocumentModelImpl.getDocumentYear(),
						tempDocumentModelImpl.getRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMDOCUMENTBYDOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
			}

			if ((tempDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempDocumentModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] { tempDocumentModelImpl.getRequestCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
			TempDocumentImpl.class, tempDocument.getPrimaryKey(), tempDocument);

		return tempDocument;
	}

	protected TempDocument toUnwrappedModel(TempDocument tempDocument) {
		if (tempDocument instanceof TempDocumentImpl) {
			return tempDocument;
		}

		TempDocumentImpl tempDocumentImpl = new TempDocumentImpl();

		tempDocumentImpl.setNew(tempDocument.isNew());
		tempDocumentImpl.setPrimaryKey(tempDocument.getPrimaryKey());

		tempDocumentImpl.setId(tempDocument.getId());
		tempDocumentImpl.setRequestCode(tempDocument.getRequestCode());
		tempDocumentImpl.setRequestState(tempDocument.getRequestState());
		tempDocumentImpl.setDocumentName(tempDocument.getDocumentName());
		tempDocumentImpl.setDocumentYear(tempDocument.getDocumentYear());
		tempDocumentImpl.setDocumentTypeCode(tempDocument.getDocumentTypeCode());
		tempDocumentImpl.setUserCreated(tempDocument.getUserCreated());
		tempDocumentImpl.setShipAgencyCode(tempDocument.getShipAgencyCode());
		tempDocumentImpl.setShipName(tempDocument.getShipName());
		tempDocumentImpl.setShipTypeCode(tempDocument.getShipTypeCode());
		tempDocumentImpl.setStateCode(tempDocument.getStateCode());
		tempDocumentImpl.setShipCaptain(tempDocument.getShipCaptain());
		tempDocumentImpl.setImo(tempDocument.getImo());
		tempDocumentImpl.setGrt(tempDocument.getGrt());
		tempDocumentImpl.setNt(tempDocument.getNt());
		tempDocumentImpl.setDwt(tempDocument.getDwt());
		tempDocumentImpl.setUnitGRT(tempDocument.getUnitGRT());
		tempDocumentImpl.setUnitNT(tempDocument.getUnitNT());
		tempDocumentImpl.setUnitDWT(tempDocument.getUnitDWT());
		tempDocumentImpl.setCallSign(tempDocument.getCallSign());
		tempDocumentImpl.setPreDocumentName(tempDocument.getPreDocumentName());
		tempDocumentImpl.setCreatedDate(tempDocument.getCreatedDate());
		tempDocumentImpl.setLastModifiedDate(tempDocument.getLastModifiedDate());
		tempDocumentImpl.setFlowFlag(tempDocument.getFlowFlag());
		tempDocumentImpl.setDocumentStatusCode(tempDocument.getDocumentStatusCode());
		tempDocumentImpl.setLocationCode(tempDocument.getLocationCode());
		tempDocumentImpl.setMaritimeCode(tempDocument.getMaritimeCode());
		tempDocumentImpl.setPortRegionCode(tempDocument.getPortRegionCode());
		tempDocumentImpl.setPortCode(tempDocument.getPortCode());
		tempDocumentImpl.setLastPortCode(tempDocument.getLastPortCode());
		tempDocumentImpl.setShipPosition(tempDocument.getShipPosition());
		tempDocumentImpl.setShipOwnerCode(tempDocument.getShipOwnerCode());
		tempDocumentImpl.setArrivalShipAgency(tempDocument.getArrivalShipAgency());
		tempDocumentImpl.setDepartureShipAgency(tempDocument.getDepartureShipAgency());
		tempDocumentImpl.setShipDateFrom(tempDocument.getShipDateFrom());
		tempDocumentImpl.setShipDateTo(tempDocument.getShipDateTo());
		tempDocumentImpl.setShipDateLastCheck(tempDocument.getShipDateLastCheck());

		return tempDocumentImpl;
	}

	/**
	 * Returns the temp document with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp document
	 * @return the temp document
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException if a temp document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDocument findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTempDocumentException, SystemException {
		TempDocument tempDocument = fetchByPrimaryKey(primaryKey);

		if (tempDocument == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTempDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tempDocument;
	}

	/**
	 * Returns the temp document with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException} if it could not be found.
	 *
	 * @param id the primary key of the temp document
	 * @return the temp document
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException if a temp document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDocument findByPrimaryKey(long id)
		throws NoSuchTempDocumentException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the temp document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp document
	 * @return the temp document, or <code>null</code> if a temp document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDocument fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TempDocument tempDocument = (TempDocument)EntityCacheUtil.getResult(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
				TempDocumentImpl.class, primaryKey);

		if (tempDocument == _nullTempDocument) {
			return null;
		}

		if (tempDocument == null) {
			Session session = null;

			try {
				session = openSession();

				tempDocument = (TempDocument)session.get(TempDocumentImpl.class,
						primaryKey);

				if (tempDocument != null) {
					cacheResult(tempDocument);
				}
				else {
					EntityCacheUtil.putResult(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
						TempDocumentImpl.class, primaryKey, _nullTempDocument);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TempDocumentModelImpl.ENTITY_CACHE_ENABLED,
					TempDocumentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tempDocument;
	}

	/**
	 * Returns the temp document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp document
	 * @return the temp document, or <code>null</code> if a temp document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDocument fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the temp documents.
	 *
	 * @return the temp documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDocument> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp documents
	 * @param end the upper bound of the range of temp documents (not inclusive)
	 * @return the range of temp documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDocument> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp documents
	 * @param end the upper bound of the range of temp documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDocument> findAll(int start, int end,
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

		List<TempDocument> list = (List<TempDocument>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPDOCUMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPDOCUMENT;

				if (pagination) {
					sql = sql.concat(TempDocumentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TempDocument>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempDocument>(list);
				}
				else {
					list = (List<TempDocument>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the temp documents from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TempDocument tempDocument : findAll()) {
			remove(tempDocument);
		}
	}

	/**
	 * Returns the number of temp documents.
	 *
	 * @return the number of temp documents
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

				Query q = session.createQuery(_SQL_COUNT_TEMPDOCUMENT);

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
	 * Initializes the temp document persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.TempDocument")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempDocument>> listenersList = new ArrayList<ModelListener<TempDocument>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempDocument>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempDocumentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TEMPDOCUMENT = "SELECT tempDocument FROM TempDocument tempDocument";
	private static final String _SQL_SELECT_TEMPDOCUMENT_WHERE = "SELECT tempDocument FROM TempDocument tempDocument WHERE ";
	private static final String _SQL_COUNT_TEMPDOCUMENT = "SELECT COUNT(tempDocument) FROM TempDocument tempDocument";
	private static final String _SQL_COUNT_TEMPDOCUMENT_WHERE = "SELECT COUNT(tempDocument) FROM TempDocument tempDocument WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempDocument.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempDocument exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempDocument exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempDocumentPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "requestState", "documentName",
				"documentYear", "documentTypeCode", "userCreated",
				"shipAgencyCode", "shipName", "shipTypeCode", "stateCode",
				"shipCaptain", "imo", "grt", "nt", "dwt", "unitGRT", "unitNT",
				"unitDWT", "callSign", "preDocumentName", "createdDate",
				"lastModifiedDate", "flowFlag", "documentStatusCode",
				"locationCode", "maritimeCode", "portRegionCode", "portCode",
				"lastPortCode", "shipPosition", "shipOwnerCode",
				"arrivalShipAgency", "departureShipAgency", "shipDateFrom",
				"shipDateTo", "shipDateLastCheck"
			});
	private static TempDocument _nullTempDocument = new TempDocumentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempDocument> toCacheModel() {
				return _nullTempDocumentCacheModel;
			}
		};

	private static CacheModel<TempDocument> _nullTempDocumentCacheModel = new CacheModel<TempDocument>() {
			@Override
			public TempDocument toEntityModel() {
				return _nullTempDocument;
			}
		};
}