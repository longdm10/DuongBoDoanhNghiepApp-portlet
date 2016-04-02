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

import vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException;
import vn.dtt.duongbien.dao.vrcb.model.ResultCertificate;
import vn.dtt.duongbien.dao.vrcb.model.impl.ResultCertificateImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.ResultCertificateModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the result certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see ResultCertificatePersistence
 * @see ResultCertificateUtil
 * @generated
 */
public class ResultCertificatePersistenceImpl extends BasePersistenceImpl<ResultCertificate>
	implements ResultCertificatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ResultCertificateUtil} to access the result certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ResultCertificateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ResultCertificateModelImpl.ENTITY_CACHE_ENABLED,
			ResultCertificateModelImpl.FINDER_CACHE_ENABLED,
			ResultCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ResultCertificateModelImpl.ENTITY_CACHE_ENABLED,
			ResultCertificateModelImpl.FINDER_CACHE_ENABLED,
			ResultCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ResultCertificateModelImpl.ENTITY_CACHE_ENABLED,
			ResultCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(ResultCertificateModelImpl.ENTITY_CACHE_ENABLED,
			ResultCertificateModelImpl.FINDER_CACHE_ENABLED,
			ResultCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDocumentNameAnddocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(ResultCertificateModelImpl.ENTITY_CACHE_ENABLED,
			ResultCertificateModelImpl.FINDER_CACHE_ENABLED,
			ResultCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			ResultCertificateModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			ResultCertificateModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(ResultCertificateModelImpl.ENTITY_CACHE_ENABLED,
			ResultCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the result certificates where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching result certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ResultCertificate> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findByDocumentNameAnddocumentYear(documentName, documentYear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the result certificates where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of result certificates
	 * @param end the upper bound of the range of result certificates (not inclusive)
	 * @return the range of matching result certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ResultCertificate> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findByDocumentNameAnddocumentYear(documentName, documentYear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the result certificates where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of result certificates
	 * @param end the upper bound of the range of result certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching result certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ResultCertificate> findByDocumentNameAnddocumentYear(
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

		List<ResultCertificate> list = (List<ResultCertificate>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ResultCertificate resultCertificate : list) {
				if ((documentName != resultCertificate.getDocumentName()) ||
						(documentYear != resultCertificate.getDocumentYear())) {
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

			query.append(_SQL_SELECT_RESULTCERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ResultCertificateModelImpl.ORDER_BY_JPQL);
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
					list = (List<ResultCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ResultCertificate>(list);
				}
				else {
					list = (List<ResultCertificate>)QueryUtil.list(q,
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
	 * Returns the first result certificate in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching result certificate
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException if a matching result certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultCertificate findByDocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchResultCertificateException, SystemException {
		ResultCertificate resultCertificate = fetchByDocumentNameAnddocumentYear_First(documentName,
				documentYear, orderByComparator);

		if (resultCertificate != null) {
			return resultCertificate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchResultCertificateException(msg.toString());
	}

	/**
	 * Returns the first result certificate in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching result certificate, or <code>null</code> if a matching result certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultCertificate fetchByDocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		List<ResultCertificate> list = findByDocumentNameAnddocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last result certificate in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching result certificate
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException if a matching result certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultCertificate findByDocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchResultCertificateException, SystemException {
		ResultCertificate resultCertificate = fetchByDocumentNameAnddocumentYear_Last(documentName,
				documentYear, orderByComparator);

		if (resultCertificate != null) {
			return resultCertificate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchResultCertificateException(msg.toString());
	}

	/**
	 * Returns the last result certificate in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching result certificate, or <code>null</code> if a matching result certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultCertificate fetchByDocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByDocumentNameAnddocumentYear(documentName,
				documentYear);

		if (count == 0) {
			return null;
		}

		List<ResultCertificate> list = findByDocumentNameAnddocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the result certificates before and after the current result certificate in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param id the primary key of the current result certificate
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next result certificate
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException if a result certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultCertificate[] findByDocumentNameAnddocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchResultCertificateException, SystemException {
		ResultCertificate resultCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ResultCertificate[] array = new ResultCertificateImpl[3];

			array[0] = getByDocumentNameAnddocumentYear_PrevAndNext(session,
					resultCertificate, documentName, documentYear,
					orderByComparator, true);

			array[1] = resultCertificate;

			array[2] = getByDocumentNameAnddocumentYear_PrevAndNext(session,
					resultCertificate, documentName, documentYear,
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

	protected ResultCertificate getByDocumentNameAnddocumentYear_PrevAndNext(
		Session session, ResultCertificate resultCertificate,
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

		query.append(_SQL_SELECT_RESULTCERTIFICATE_WHERE);

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
			query.append(ResultCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(resultCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ResultCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the result certificates where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDocumentNameAnddocumentYear(long documentName,
		int documentYear) throws SystemException {
		for (ResultCertificate resultCertificate : findByDocumentNameAnddocumentYear(
				documentName, documentYear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(resultCertificate);
		}
	}

	/**
	 * Returns the number of result certificates where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching result certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDocumentNameAnddocumentYear(long documentName,
		int documentYear) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR;

		Object[] finderArgs = new Object[] { documentName, documentYear };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_RESULTCERTIFICATE_WHERE);

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
		"resultCertificate.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"resultCertificate.documentYear = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE =
		new FinderPath(ResultCertificateModelImpl.ENTITY_CACHE_ENABLED,
			ResultCertificateModelImpl.FINDER_CACHE_ENABLED,
			ResultCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDocumentNameAnddocumentYearAndMaritimeCode",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE =
		new FinderPath(ResultCertificateModelImpl.ENTITY_CACHE_ENABLED,
			ResultCertificateModelImpl.FINDER_CACHE_ENABLED,
			ResultCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDocumentNameAnddocumentYearAndMaritimeCode",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			},
			ResultCertificateModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			ResultCertificateModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			ResultCertificateModelImpl.MARITIMECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE =
		new FinderPath(ResultCertificateModelImpl.ENTITY_CACHE_ENABLED,
			ResultCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocumentNameAnddocumentYearAndMaritimeCode",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the result certificates where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param maritimeCode the maritime code
	 * @return the matching result certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ResultCertificate> findByDocumentNameAnddocumentYearAndMaritimeCode(
		long documentName, int documentYear, String maritimeCode)
		throws SystemException {
		return findByDocumentNameAnddocumentYearAndMaritimeCode(documentName,
			documentYear, maritimeCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the result certificates where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param maritimeCode the maritime code
	 * @param start the lower bound of the range of result certificates
	 * @param end the upper bound of the range of result certificates (not inclusive)
	 * @return the range of matching result certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ResultCertificate> findByDocumentNameAnddocumentYearAndMaritimeCode(
		long documentName, int documentYear, String maritimeCode, int start,
		int end) throws SystemException {
		return findByDocumentNameAnddocumentYearAndMaritimeCode(documentName,
			documentYear, maritimeCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the result certificates where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param maritimeCode the maritime code
	 * @param start the lower bound of the range of result certificates
	 * @param end the upper bound of the range of result certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching result certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ResultCertificate> findByDocumentNameAnddocumentYearAndMaritimeCode(
		long documentName, int documentYear, String maritimeCode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE;
			finderArgs = new Object[] { documentName, documentYear, maritimeCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE;
			finderArgs = new Object[] {
					documentName, documentYear, maritimeCode,
					
					start, end, orderByComparator
				};
		}

		List<ResultCertificate> list = (List<ResultCertificate>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ResultCertificate resultCertificate : list) {
				if ((documentName != resultCertificate.getDocumentName()) ||
						(documentYear != resultCertificate.getDocumentYear()) ||
						!Validator.equals(maritimeCode,
							resultCertificate.getMaritimeCode())) {
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

			query.append(_SQL_SELECT_RESULTCERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE_DOCUMENTYEAR_2);

			boolean bindMaritimeCode = false;

			if (maritimeCode == null) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE_MARITIMECODE_1);
			}
			else if (maritimeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE_MARITIMECODE_3);
			}
			else {
				bindMaritimeCode = true;

				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE_MARITIMECODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ResultCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				if (bindMaritimeCode) {
					qPos.add(maritimeCode);
				}

				if (!pagination) {
					list = (List<ResultCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ResultCertificate>(list);
				}
				else {
					list = (List<ResultCertificate>)QueryUtil.list(q,
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
	 * Returns the first result certificate in the ordered set where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param maritimeCode the maritime code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching result certificate
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException if a matching result certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultCertificate findByDocumentNameAnddocumentYearAndMaritimeCode_First(
		long documentName, int documentYear, String maritimeCode,
		OrderByComparator orderByComparator)
		throws NoSuchResultCertificateException, SystemException {
		ResultCertificate resultCertificate = fetchByDocumentNameAnddocumentYearAndMaritimeCode_First(documentName,
				documentYear, maritimeCode, orderByComparator);

		if (resultCertificate != null) {
			return resultCertificate;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(", maritimeCode=");
		msg.append(maritimeCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchResultCertificateException(msg.toString());
	}

	/**
	 * Returns the first result certificate in the ordered set where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param maritimeCode the maritime code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching result certificate, or <code>null</code> if a matching result certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultCertificate fetchByDocumentNameAnddocumentYearAndMaritimeCode_First(
		long documentName, int documentYear, String maritimeCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<ResultCertificate> list = findByDocumentNameAnddocumentYearAndMaritimeCode(documentName,
				documentYear, maritimeCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last result certificate in the ordered set where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param maritimeCode the maritime code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching result certificate
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException if a matching result certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultCertificate findByDocumentNameAnddocumentYearAndMaritimeCode_Last(
		long documentName, int documentYear, String maritimeCode,
		OrderByComparator orderByComparator)
		throws NoSuchResultCertificateException, SystemException {
		ResultCertificate resultCertificate = fetchByDocumentNameAnddocumentYearAndMaritimeCode_Last(documentName,
				documentYear, maritimeCode, orderByComparator);

		if (resultCertificate != null) {
			return resultCertificate;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(", maritimeCode=");
		msg.append(maritimeCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchResultCertificateException(msg.toString());
	}

	/**
	 * Returns the last result certificate in the ordered set where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param maritimeCode the maritime code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching result certificate, or <code>null</code> if a matching result certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultCertificate fetchByDocumentNameAnddocumentYearAndMaritimeCode_Last(
		long documentName, int documentYear, String maritimeCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDocumentNameAnddocumentYearAndMaritimeCode(documentName,
				documentYear, maritimeCode);

		if (count == 0) {
			return null;
		}

		List<ResultCertificate> list = findByDocumentNameAnddocumentYearAndMaritimeCode(documentName,
				documentYear, maritimeCode, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the result certificates before and after the current result certificate in the ordered set where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63;.
	 *
	 * @param id the primary key of the current result certificate
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param maritimeCode the maritime code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next result certificate
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException if a result certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultCertificate[] findByDocumentNameAnddocumentYearAndMaritimeCode_PrevAndNext(
		long id, long documentName, int documentYear, String maritimeCode,
		OrderByComparator orderByComparator)
		throws NoSuchResultCertificateException, SystemException {
		ResultCertificate resultCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ResultCertificate[] array = new ResultCertificateImpl[3];

			array[0] = getByDocumentNameAnddocumentYearAndMaritimeCode_PrevAndNext(session,
					resultCertificate, documentName, documentYear,
					maritimeCode, orderByComparator, true);

			array[1] = resultCertificate;

			array[2] = getByDocumentNameAnddocumentYearAndMaritimeCode_PrevAndNext(session,
					resultCertificate, documentName, documentYear,
					maritimeCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ResultCertificate getByDocumentNameAnddocumentYearAndMaritimeCode_PrevAndNext(
		Session session, ResultCertificate resultCertificate,
		long documentName, int documentYear, String maritimeCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_RESULTCERTIFICATE_WHERE);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE_DOCUMENTYEAR_2);

		boolean bindMaritimeCode = false;

		if (maritimeCode == null) {
			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE_MARITIMECODE_1);
		}
		else if (maritimeCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE_MARITIMECODE_3);
		}
		else {
			bindMaritimeCode = true;

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE_MARITIMECODE_2);
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
			query.append(ResultCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (bindMaritimeCode) {
			qPos.add(maritimeCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(resultCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ResultCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the result certificates where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param maritimeCode the maritime code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDocumentNameAnddocumentYearAndMaritimeCode(
		long documentName, int documentYear, String maritimeCode)
		throws SystemException {
		for (ResultCertificate resultCertificate : findByDocumentNameAnddocumentYearAndMaritimeCode(
				documentName, documentYear, maritimeCode, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(resultCertificate);
		}
	}

	/**
	 * Returns the number of result certificates where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param maritimeCode the maritime code
	 * @return the number of matching result certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDocumentNameAnddocumentYearAndMaritimeCode(
		long documentName, int documentYear, String maritimeCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE;

		Object[] finderArgs = new Object[] {
				documentName, documentYear, maritimeCode
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_RESULTCERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE_DOCUMENTYEAR_2);

			boolean bindMaritimeCode = false;

			if (maritimeCode == null) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE_MARITIMECODE_1);
			}
			else if (maritimeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE_MARITIMECODE_3);
			}
			else {
				bindMaritimeCode = true;

				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE_MARITIMECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				if (bindMaritimeCode) {
					qPos.add(maritimeCode);
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

	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE_DOCUMENTNAME_2 =
		"resultCertificate.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE_DOCUMENTYEAR_2 =
		"resultCertificate.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE_MARITIMECODE_1 =
		"resultCertificate.maritimeCode IS NULL";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE_MARITIMECODE_2 =
		"resultCertificate.maritimeCode = ?";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE_MARITIMECODE_3 =
		"(resultCertificate.maritimeCode IS NULL OR resultCertificate.maritimeCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE =
		new FinderPath(ResultCertificateModelImpl.ENTITY_CACHE_ENABLED,
			ResultCertificateModelImpl.FINDER_CACHE_ENABLED,
			ResultCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDocumentNameAnddocumentYearAndCertificateCode",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE =
		new FinderPath(ResultCertificateModelImpl.ENTITY_CACHE_ENABLED,
			ResultCertificateModelImpl.FINDER_CACHE_ENABLED,
			ResultCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDocumentNameAnddocumentYearAndCertificateCode",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			},
			ResultCertificateModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			ResultCertificateModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			ResultCertificateModelImpl.CERTIFICATECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE =
		new FinderPath(ResultCertificateModelImpl.ENTITY_CACHE_ENABLED,
			ResultCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocumentNameAnddocumentYearAndCertificateCode",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the result certificates where documentName = &#63; and documentYear = &#63; and certificateCode = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param certificateCode the certificate code
	 * @return the matching result certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ResultCertificate> findByDocumentNameAnddocumentYearAndCertificateCode(
		long documentName, int documentYear, String certificateCode)
		throws SystemException {
		return findByDocumentNameAnddocumentYearAndCertificateCode(documentName,
			documentYear, certificateCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the result certificates where documentName = &#63; and documentYear = &#63; and certificateCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param certificateCode the certificate code
	 * @param start the lower bound of the range of result certificates
	 * @param end the upper bound of the range of result certificates (not inclusive)
	 * @return the range of matching result certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ResultCertificate> findByDocumentNameAnddocumentYearAndCertificateCode(
		long documentName, int documentYear, String certificateCode, int start,
		int end) throws SystemException {
		return findByDocumentNameAnddocumentYearAndCertificateCode(documentName,
			documentYear, certificateCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the result certificates where documentName = &#63; and documentYear = &#63; and certificateCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param certificateCode the certificate code
	 * @param start the lower bound of the range of result certificates
	 * @param end the upper bound of the range of result certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching result certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ResultCertificate> findByDocumentNameAnddocumentYearAndCertificateCode(
		long documentName, int documentYear, String certificateCode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE;
			finderArgs = new Object[] {
					documentName, documentYear, certificateCode
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE;
			finderArgs = new Object[] {
					documentName, documentYear, certificateCode,
					
					start, end, orderByComparator
				};
		}

		List<ResultCertificate> list = (List<ResultCertificate>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ResultCertificate resultCertificate : list) {
				if ((documentName != resultCertificate.getDocumentName()) ||
						(documentYear != resultCertificate.getDocumentYear()) ||
						!Validator.equals(certificateCode,
							resultCertificate.getCertificateCode())) {
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

			query.append(_SQL_SELECT_RESULTCERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE_DOCUMENTYEAR_2);

			boolean bindCertificateCode = false;

			if (certificateCode == null) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE_CERTIFICATECODE_1);
			}
			else if (certificateCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE_CERTIFICATECODE_3);
			}
			else {
				bindCertificateCode = true;

				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE_CERTIFICATECODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ResultCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				if (bindCertificateCode) {
					qPos.add(certificateCode);
				}

				if (!pagination) {
					list = (List<ResultCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ResultCertificate>(list);
				}
				else {
					list = (List<ResultCertificate>)QueryUtil.list(q,
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
	 * Returns the first result certificate in the ordered set where documentName = &#63; and documentYear = &#63; and certificateCode = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param certificateCode the certificate code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching result certificate
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException if a matching result certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultCertificate findByDocumentNameAnddocumentYearAndCertificateCode_First(
		long documentName, int documentYear, String certificateCode,
		OrderByComparator orderByComparator)
		throws NoSuchResultCertificateException, SystemException {
		ResultCertificate resultCertificate = fetchByDocumentNameAnddocumentYearAndCertificateCode_First(documentName,
				documentYear, certificateCode, orderByComparator);

		if (resultCertificate != null) {
			return resultCertificate;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(", certificateCode=");
		msg.append(certificateCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchResultCertificateException(msg.toString());
	}

	/**
	 * Returns the first result certificate in the ordered set where documentName = &#63; and documentYear = &#63; and certificateCode = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param certificateCode the certificate code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching result certificate, or <code>null</code> if a matching result certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultCertificate fetchByDocumentNameAnddocumentYearAndCertificateCode_First(
		long documentName, int documentYear, String certificateCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<ResultCertificate> list = findByDocumentNameAnddocumentYearAndCertificateCode(documentName,
				documentYear, certificateCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last result certificate in the ordered set where documentName = &#63; and documentYear = &#63; and certificateCode = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param certificateCode the certificate code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching result certificate
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException if a matching result certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultCertificate findByDocumentNameAnddocumentYearAndCertificateCode_Last(
		long documentName, int documentYear, String certificateCode,
		OrderByComparator orderByComparator)
		throws NoSuchResultCertificateException, SystemException {
		ResultCertificate resultCertificate = fetchByDocumentNameAnddocumentYearAndCertificateCode_Last(documentName,
				documentYear, certificateCode, orderByComparator);

		if (resultCertificate != null) {
			return resultCertificate;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(", certificateCode=");
		msg.append(certificateCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchResultCertificateException(msg.toString());
	}

	/**
	 * Returns the last result certificate in the ordered set where documentName = &#63; and documentYear = &#63; and certificateCode = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param certificateCode the certificate code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching result certificate, or <code>null</code> if a matching result certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultCertificate fetchByDocumentNameAnddocumentYearAndCertificateCode_Last(
		long documentName, int documentYear, String certificateCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDocumentNameAnddocumentYearAndCertificateCode(documentName,
				documentYear, certificateCode);

		if (count == 0) {
			return null;
		}

		List<ResultCertificate> list = findByDocumentNameAnddocumentYearAndCertificateCode(documentName,
				documentYear, certificateCode, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the result certificates before and after the current result certificate in the ordered set where documentName = &#63; and documentYear = &#63; and certificateCode = &#63;.
	 *
	 * @param id the primary key of the current result certificate
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param certificateCode the certificate code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next result certificate
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException if a result certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultCertificate[] findByDocumentNameAnddocumentYearAndCertificateCode_PrevAndNext(
		long id, long documentName, int documentYear, String certificateCode,
		OrderByComparator orderByComparator)
		throws NoSuchResultCertificateException, SystemException {
		ResultCertificate resultCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ResultCertificate[] array = new ResultCertificateImpl[3];

			array[0] = getByDocumentNameAnddocumentYearAndCertificateCode_PrevAndNext(session,
					resultCertificate, documentName, documentYear,
					certificateCode, orderByComparator, true);

			array[1] = resultCertificate;

			array[2] = getByDocumentNameAnddocumentYearAndCertificateCode_PrevAndNext(session,
					resultCertificate, documentName, documentYear,
					certificateCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ResultCertificate getByDocumentNameAnddocumentYearAndCertificateCode_PrevAndNext(
		Session session, ResultCertificate resultCertificate,
		long documentName, int documentYear, String certificateCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_RESULTCERTIFICATE_WHERE);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE_DOCUMENTYEAR_2);

		boolean bindCertificateCode = false;

		if (certificateCode == null) {
			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE_CERTIFICATECODE_1);
		}
		else if (certificateCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE_CERTIFICATECODE_3);
		}
		else {
			bindCertificateCode = true;

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE_CERTIFICATECODE_2);
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
			query.append(ResultCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (bindCertificateCode) {
			qPos.add(certificateCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(resultCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ResultCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the result certificates where documentName = &#63; and documentYear = &#63; and certificateCode = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param certificateCode the certificate code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDocumentNameAnddocumentYearAndCertificateCode(
		long documentName, int documentYear, String certificateCode)
		throws SystemException {
		for (ResultCertificate resultCertificate : findByDocumentNameAnddocumentYearAndCertificateCode(
				documentName, documentYear, certificateCode, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(resultCertificate);
		}
	}

	/**
	 * Returns the number of result certificates where documentName = &#63; and documentYear = &#63; and certificateCode = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param certificateCode the certificate code
	 * @return the number of matching result certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDocumentNameAnddocumentYearAndCertificateCode(
		long documentName, int documentYear, String certificateCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE;

		Object[] finderArgs = new Object[] {
				documentName, documentYear, certificateCode
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_RESULTCERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE_DOCUMENTYEAR_2);

			boolean bindCertificateCode = false;

			if (certificateCode == null) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE_CERTIFICATECODE_1);
			}
			else if (certificateCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE_CERTIFICATECODE_3);
			}
			else {
				bindCertificateCode = true;

				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE_CERTIFICATECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				if (bindCertificateCode) {
					qPos.add(certificateCode);
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

	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE_DOCUMENTNAME_2 =
		"resultCertificate.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE_DOCUMENTYEAR_2 =
		"resultCertificate.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE_CERTIFICATECODE_1 =
		"resultCertificate.certificateCode IS NULL";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE_CERTIFICATECODE_2 =
		"resultCertificate.certificateCode = ?";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE_CERTIFICATECODE_3 =
		"(resultCertificate.certificateCode IS NULL OR resultCertificate.certificateCode = '')";

	public ResultCertificatePersistenceImpl() {
		setModelClass(ResultCertificate.class);
	}

	/**
	 * Caches the result certificate in the entity cache if it is enabled.
	 *
	 * @param resultCertificate the result certificate
	 */
	@Override
	public void cacheResult(ResultCertificate resultCertificate) {
		EntityCacheUtil.putResult(ResultCertificateModelImpl.ENTITY_CACHE_ENABLED,
			ResultCertificateImpl.class, resultCertificate.getPrimaryKey(),
			resultCertificate);

		resultCertificate.resetOriginalValues();
	}

	/**
	 * Caches the result certificates in the entity cache if it is enabled.
	 *
	 * @param resultCertificates the result certificates
	 */
	@Override
	public void cacheResult(List<ResultCertificate> resultCertificates) {
		for (ResultCertificate resultCertificate : resultCertificates) {
			if (EntityCacheUtil.getResult(
						ResultCertificateModelImpl.ENTITY_CACHE_ENABLED,
						ResultCertificateImpl.class,
						resultCertificate.getPrimaryKey()) == null) {
				cacheResult(resultCertificate);
			}
			else {
				resultCertificate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all result certificates.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ResultCertificateImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ResultCertificateImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the result certificate.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ResultCertificate resultCertificate) {
		EntityCacheUtil.removeResult(ResultCertificateModelImpl.ENTITY_CACHE_ENABLED,
			ResultCertificateImpl.class, resultCertificate.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ResultCertificate> resultCertificates) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ResultCertificate resultCertificate : resultCertificates) {
			EntityCacheUtil.removeResult(ResultCertificateModelImpl.ENTITY_CACHE_ENABLED,
				ResultCertificateImpl.class, resultCertificate.getPrimaryKey());
		}
	}

	/**
	 * Creates a new result certificate with the primary key. Does not add the result certificate to the database.
	 *
	 * @param id the primary key for the new result certificate
	 * @return the new result certificate
	 */
	@Override
	public ResultCertificate create(long id) {
		ResultCertificate resultCertificate = new ResultCertificateImpl();

		resultCertificate.setNew(true);
		resultCertificate.setPrimaryKey(id);

		return resultCertificate;
	}

	/**
	 * Removes the result certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the result certificate
	 * @return the result certificate that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException if a result certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultCertificate remove(long id)
		throws NoSuchResultCertificateException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the result certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the result certificate
	 * @return the result certificate that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException if a result certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultCertificate remove(Serializable primaryKey)
		throws NoSuchResultCertificateException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ResultCertificate resultCertificate = (ResultCertificate)session.get(ResultCertificateImpl.class,
					primaryKey);

			if (resultCertificate == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchResultCertificateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(resultCertificate);
		}
		catch (NoSuchResultCertificateException nsee) {
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
	protected ResultCertificate removeImpl(ResultCertificate resultCertificate)
		throws SystemException {
		resultCertificate = toUnwrappedModel(resultCertificate);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(resultCertificate)) {
				resultCertificate = (ResultCertificate)session.get(ResultCertificateImpl.class,
						resultCertificate.getPrimaryKeyObj());
			}

			if (resultCertificate != null) {
				session.delete(resultCertificate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (resultCertificate != null) {
			clearCache(resultCertificate);
		}

		return resultCertificate;
	}

	@Override
	public ResultCertificate updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.ResultCertificate resultCertificate)
		throws SystemException {
		resultCertificate = toUnwrappedModel(resultCertificate);

		boolean isNew = resultCertificate.isNew();

		ResultCertificateModelImpl resultCertificateModelImpl = (ResultCertificateModelImpl)resultCertificate;

		Session session = null;

		try {
			session = openSession();

			if (resultCertificate.isNew()) {
				session.save(resultCertificate);

				resultCertificate.setNew(false);
			}
			else {
				session.merge(resultCertificate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ResultCertificateModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((resultCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						resultCertificateModelImpl.getOriginalDocumentName(),
						resultCertificateModelImpl.getOriginalDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						resultCertificateModelImpl.getDocumentName(),
						resultCertificateModelImpl.getDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
			}

			if ((resultCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						resultCertificateModelImpl.getOriginalDocumentName(),
						resultCertificateModelImpl.getOriginalDocumentYear(),
						resultCertificateModelImpl.getOriginalMaritimeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE,
					args);

				args = new Object[] {
						resultCertificateModelImpl.getDocumentName(),
						resultCertificateModelImpl.getDocumentYear(),
						resultCertificateModelImpl.getMaritimeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDMARITIMECODE,
					args);
			}

			if ((resultCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						resultCertificateModelImpl.getOriginalDocumentName(),
						resultCertificateModelImpl.getOriginalDocumentYear(),
						resultCertificateModelImpl.getOriginalCertificateCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE,
					args);

				args = new Object[] {
						resultCertificateModelImpl.getDocumentName(),
						resultCertificateModelImpl.getDocumentYear(),
						resultCertificateModelImpl.getCertificateCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDCERTIFICATECODE,
					args);
			}
		}

		EntityCacheUtil.putResult(ResultCertificateModelImpl.ENTITY_CACHE_ENABLED,
			ResultCertificateImpl.class, resultCertificate.getPrimaryKey(),
			resultCertificate);

		return resultCertificate;
	}

	protected ResultCertificate toUnwrappedModel(
		ResultCertificate resultCertificate) {
		if (resultCertificate instanceof ResultCertificateImpl) {
			return resultCertificate;
		}

		ResultCertificateImpl resultCertificateImpl = new ResultCertificateImpl();

		resultCertificateImpl.setNew(resultCertificate.isNew());
		resultCertificateImpl.setPrimaryKey(resultCertificate.getPrimaryKey());

		resultCertificateImpl.setId(resultCertificate.getId());
		resultCertificateImpl.setDocumentName(resultCertificate.getDocumentName());
		resultCertificateImpl.setDocumentYear(resultCertificate.getDocumentYear());
		resultCertificateImpl.setMaritimeCode(resultCertificate.getMaritimeCode());
		resultCertificateImpl.setCertificateCode(resultCertificate.getCertificateCode());
		resultCertificateImpl.setCertificateOrder(resultCertificate.getCertificateOrder());
		resultCertificateImpl.setCertificateNo(resultCertificate.getCertificateNo());
		resultCertificateImpl.setCertificateIssueDate(resultCertificate.getCertificateIssueDate());
		resultCertificateImpl.setCertificateExpiredDate(resultCertificate.getCertificateExpiredDate());
		resultCertificateImpl.setExaminationDate(resultCertificate.getExaminationDate());
		resultCertificateImpl.setApprovalName(resultCertificate.getApprovalName());
		resultCertificateImpl.setIsExamined(resultCertificate.getIsExamined());
		resultCertificateImpl.setMandatory(resultCertificate.getMandatory());

		return resultCertificateImpl;
	}

	/**
	 * Returns the result certificate with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the result certificate
	 * @return the result certificate
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException if a result certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultCertificate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchResultCertificateException, SystemException {
		ResultCertificate resultCertificate = fetchByPrimaryKey(primaryKey);

		if (resultCertificate == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchResultCertificateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return resultCertificate;
	}

	/**
	 * Returns the result certificate with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException} if it could not be found.
	 *
	 * @param id the primary key of the result certificate
	 * @return the result certificate
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException if a result certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultCertificate findByPrimaryKey(long id)
		throws NoSuchResultCertificateException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the result certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the result certificate
	 * @return the result certificate, or <code>null</code> if a result certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultCertificate fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ResultCertificate resultCertificate = (ResultCertificate)EntityCacheUtil.getResult(ResultCertificateModelImpl.ENTITY_CACHE_ENABLED,
				ResultCertificateImpl.class, primaryKey);

		if (resultCertificate == _nullResultCertificate) {
			return null;
		}

		if (resultCertificate == null) {
			Session session = null;

			try {
				session = openSession();

				resultCertificate = (ResultCertificate)session.get(ResultCertificateImpl.class,
						primaryKey);

				if (resultCertificate != null) {
					cacheResult(resultCertificate);
				}
				else {
					EntityCacheUtil.putResult(ResultCertificateModelImpl.ENTITY_CACHE_ENABLED,
						ResultCertificateImpl.class, primaryKey,
						_nullResultCertificate);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ResultCertificateModelImpl.ENTITY_CACHE_ENABLED,
					ResultCertificateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return resultCertificate;
	}

	/**
	 * Returns the result certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the result certificate
	 * @return the result certificate, or <code>null</code> if a result certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResultCertificate fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the result certificates.
	 *
	 * @return the result certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ResultCertificate> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the result certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of result certificates
	 * @param end the upper bound of the range of result certificates (not inclusive)
	 * @return the range of result certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ResultCertificate> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the result certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of result certificates
	 * @param end the upper bound of the range of result certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of result certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ResultCertificate> findAll(int start, int end,
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

		List<ResultCertificate> list = (List<ResultCertificate>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_RESULTCERTIFICATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RESULTCERTIFICATE;

				if (pagination) {
					sql = sql.concat(ResultCertificateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ResultCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ResultCertificate>(list);
				}
				else {
					list = (List<ResultCertificate>)QueryUtil.list(q,
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
	 * Removes all the result certificates from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ResultCertificate resultCertificate : findAll()) {
			remove(resultCertificate);
		}
	}

	/**
	 * Returns the number of result certificates.
	 *
	 * @return the number of result certificates
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

				Query q = session.createQuery(_SQL_COUNT_RESULTCERTIFICATE);

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
	 * Initializes the result certificate persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.ResultCertificate")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ResultCertificate>> listenersList = new ArrayList<ModelListener<ResultCertificate>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ResultCertificate>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ResultCertificateImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_RESULTCERTIFICATE = "SELECT resultCertificate FROM ResultCertificate resultCertificate";
	private static final String _SQL_SELECT_RESULTCERTIFICATE_WHERE = "SELECT resultCertificate FROM ResultCertificate resultCertificate WHERE ";
	private static final String _SQL_COUNT_RESULTCERTIFICATE = "SELECT COUNT(resultCertificate) FROM ResultCertificate resultCertificate";
	private static final String _SQL_COUNT_RESULTCERTIFICATE_WHERE = "SELECT COUNT(resultCertificate) FROM ResultCertificate resultCertificate WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "resultCertificate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ResultCertificate exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ResultCertificate exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ResultCertificatePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "documentName", "documentYear", "maritimeCode",
				"certificateCode", "certificateOrder", "certificateNo",
				"certificateIssueDate", "certificateExpiredDate",
				"examinationDate", "approvalName", "isExamined"
			});
	private static ResultCertificate _nullResultCertificate = new ResultCertificateImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ResultCertificate> toCacheModel() {
				return _nullResultCertificateCacheModel;
			}
		};

	private static CacheModel<ResultCertificate> _nullResultCertificateCacheModel =
		new CacheModel<ResultCertificate>() {
			@Override
			public ResultCertificate toEntityModel() {
				return _nullResultCertificate;
			}
		};
}