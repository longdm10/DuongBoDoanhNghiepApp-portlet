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

import vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException;
import vn.dtt.duongbien.dao.vrcb.model.DmCertificate;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmCertificateImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmCertificateModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmCertificatePersistence
 * @see DmCertificateUtil
 * @generated
 */
public class DmCertificatePersistenceImpl extends BasePersistenceImpl<DmCertificate>
	implements DmCertificatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmCertificateUtil} to access the dm certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmCertificateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateModelImpl.FINDER_CACHE_ENABLED,
			DmCertificateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateModelImpl.FINDER_CACHE_ENABLED,
			DmCertificateImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATECODE =
		new FinderPath(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateModelImpl.FINDER_CACHE_ENABLED,
			DmCertificateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCertificateCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATECODE =
		new FinderPath(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateModelImpl.FINDER_CACHE_ENABLED,
			DmCertificateImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCertificateCode", new String[] { String.class.getName() },
			DmCertificateModelImpl.CERTIFICATECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFICATECODE = new FinderPath(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCertificateCode", new String[] { String.class.getName() });

	/**
	 * Returns all the dm certificates where certificateCode = &#63;.
	 *
	 * @param certificateCode the certificate code
	 * @return the matching dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmCertificate> findByCertificateCode(String certificateCode)
		throws SystemException {
		return findByCertificateCode(certificateCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm certificates where certificateCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateCode the certificate code
	 * @param start the lower bound of the range of dm certificates
	 * @param end the upper bound of the range of dm certificates (not inclusive)
	 * @return the range of matching dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmCertificate> findByCertificateCode(String certificateCode,
		int start, int end) throws SystemException {
		return findByCertificateCode(certificateCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm certificates where certificateCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateCode the certificate code
	 * @param start the lower bound of the range of dm certificates
	 * @param end the upper bound of the range of dm certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmCertificate> findByCertificateCode(String certificateCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATECODE;
			finderArgs = new Object[] { certificateCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATECODE;
			finderArgs = new Object[] {
					certificateCode,
					
					start, end, orderByComparator
				};
		}

		List<DmCertificate> list = (List<DmCertificate>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmCertificate dmCertificate : list) {
				if (!Validator.equals(certificateCode,
							dmCertificate.getCertificateCode())) {
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

			query.append(_SQL_SELECT_DMCERTIFICATE_WHERE);

			boolean bindCertificateCode = false;

			if (certificateCode == null) {
				query.append(_FINDER_COLUMN_CERTIFICATECODE_CERTIFICATECODE_1);
			}
			else if (certificateCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFICATECODE_CERTIFICATECODE_3);
			}
			else {
				bindCertificateCode = true;

				query.append(_FINDER_COLUMN_CERTIFICATECODE_CERTIFICATECODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCertificateCode) {
					qPos.add(certificateCode);
				}

				if (!pagination) {
					list = (List<DmCertificate>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmCertificate>(list);
				}
				else {
					list = (List<DmCertificate>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm certificate in the ordered set where certificateCode = &#63;.
	 *
	 * @param certificateCode the certificate code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm certificate
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException if a matching dm certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmCertificate findByCertificateCode_First(String certificateCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmCertificateException, SystemException {
		DmCertificate dmCertificate = fetchByCertificateCode_First(certificateCode,
				orderByComparator);

		if (dmCertificate != null) {
			return dmCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateCode=");
		msg.append(certificateCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmCertificateException(msg.toString());
	}

	/**
	 * Returns the first dm certificate in the ordered set where certificateCode = &#63;.
	 *
	 * @param certificateCode the certificate code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm certificate, or <code>null</code> if a matching dm certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmCertificate fetchByCertificateCode_First(String certificateCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmCertificate> list = findByCertificateCode(certificateCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm certificate in the ordered set where certificateCode = &#63;.
	 *
	 * @param certificateCode the certificate code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm certificate
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException if a matching dm certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmCertificate findByCertificateCode_Last(String certificateCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmCertificateException, SystemException {
		DmCertificate dmCertificate = fetchByCertificateCode_Last(certificateCode,
				orderByComparator);

		if (dmCertificate != null) {
			return dmCertificate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateCode=");
		msg.append(certificateCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmCertificateException(msg.toString());
	}

	/**
	 * Returns the last dm certificate in the ordered set where certificateCode = &#63;.
	 *
	 * @param certificateCode the certificate code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm certificate, or <code>null</code> if a matching dm certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmCertificate fetchByCertificateCode_Last(String certificateCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCertificateCode(certificateCode);

		if (count == 0) {
			return null;
		}

		List<DmCertificate> list = findByCertificateCode(certificateCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm certificates before and after the current dm certificate in the ordered set where certificateCode = &#63;.
	 *
	 * @param id the primary key of the current dm certificate
	 * @param certificateCode the certificate code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm certificate
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException if a dm certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmCertificate[] findByCertificateCode_PrevAndNext(long id,
		String certificateCode, OrderByComparator orderByComparator)
		throws NoSuchDmCertificateException, SystemException {
		DmCertificate dmCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmCertificate[] array = new DmCertificateImpl[3];

			array[0] = getByCertificateCode_PrevAndNext(session, dmCertificate,
					certificateCode, orderByComparator, true);

			array[1] = dmCertificate;

			array[2] = getByCertificateCode_PrevAndNext(session, dmCertificate,
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

	protected DmCertificate getByCertificateCode_PrevAndNext(Session session,
		DmCertificate dmCertificate, String certificateCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMCERTIFICATE_WHERE);

		boolean bindCertificateCode = false;

		if (certificateCode == null) {
			query.append(_FINDER_COLUMN_CERTIFICATECODE_CERTIFICATECODE_1);
		}
		else if (certificateCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CERTIFICATECODE_CERTIFICATECODE_3);
		}
		else {
			bindCertificateCode = true;

			query.append(_FINDER_COLUMN_CERTIFICATECODE_CERTIFICATECODE_2);
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
			query.append(DmCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCertificateCode) {
			qPos.add(certificateCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm certificates where certificateCode = &#63; from the database.
	 *
	 * @param certificateCode the certificate code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCertificateCode(String certificateCode)
		throws SystemException {
		for (DmCertificate dmCertificate : findByCertificateCode(
				certificateCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmCertificate);
		}
	}

	/**
	 * Returns the number of dm certificates where certificateCode = &#63;.
	 *
	 * @param certificateCode the certificate code
	 * @return the number of matching dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCertificateCode(String certificateCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CERTIFICATECODE;

		Object[] finderArgs = new Object[] { certificateCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMCERTIFICATE_WHERE);

			boolean bindCertificateCode = false;

			if (certificateCode == null) {
				query.append(_FINDER_COLUMN_CERTIFICATECODE_CERTIFICATECODE_1);
			}
			else if (certificateCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFICATECODE_CERTIFICATECODE_3);
			}
			else {
				bindCertificateCode = true;

				query.append(_FINDER_COLUMN_CERTIFICATECODE_CERTIFICATECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_CERTIFICATECODE_CERTIFICATECODE_1 =
		"dmCertificate.certificateCode IS NULL";
	private static final String _FINDER_COLUMN_CERTIFICATECODE_CERTIFICATECODE_2 =
		"dmCertificate.certificateCode = ?";
	private static final String _FINDER_COLUMN_CERTIFICATECODE_CERTIFICATECODE_3 =
		"(dmCertificate.certificateCode IS NULL OR dmCertificate.certificateCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATECODEANDCERTIFICATENAME =
		new FinderPath(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateModelImpl.FINDER_CACHE_ENABLED,
			DmCertificateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCertificateCodeAndCertificateName",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATECODEANDCERTIFICATENAME =
		new FinderPath(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateModelImpl.FINDER_CACHE_ENABLED,
			DmCertificateImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCertificateCodeAndCertificateName",
			new String[] { String.class.getName(), String.class.getName() },
			DmCertificateModelImpl.CERTIFICATECODE_COLUMN_BITMASK |
			DmCertificateModelImpl.CERTIFICATENAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFICATECODEANDCERTIFICATENAME =
		new FinderPath(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCertificateCodeAndCertificateName",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the dm certificates where certificateCode = &#63; and certificateName = &#63;.
	 *
	 * @param certificateCode the certificate code
	 * @param certificateName the certificate name
	 * @return the matching dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmCertificate> findByCertificateCodeAndCertificateName(
		String certificateCode, String certificateName)
		throws SystemException {
		return findByCertificateCodeAndCertificateName(certificateCode,
			certificateName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm certificates where certificateCode = &#63; and certificateName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateCode the certificate code
	 * @param certificateName the certificate name
	 * @param start the lower bound of the range of dm certificates
	 * @param end the upper bound of the range of dm certificates (not inclusive)
	 * @return the range of matching dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmCertificate> findByCertificateCodeAndCertificateName(
		String certificateCode, String certificateName, int start, int end)
		throws SystemException {
		return findByCertificateCodeAndCertificateName(certificateCode,
			certificateName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm certificates where certificateCode = &#63; and certificateName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateCode the certificate code
	 * @param certificateName the certificate name
	 * @param start the lower bound of the range of dm certificates
	 * @param end the upper bound of the range of dm certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmCertificate> findByCertificateCodeAndCertificateName(
		String certificateCode, String certificateName, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATECODEANDCERTIFICATENAME;
			finderArgs = new Object[] { certificateCode, certificateName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATECODEANDCERTIFICATENAME;
			finderArgs = new Object[] {
					certificateCode, certificateName,
					
					start, end, orderByComparator
				};
		}

		List<DmCertificate> list = (List<DmCertificate>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmCertificate dmCertificate : list) {
				if (!Validator.equals(certificateCode,
							dmCertificate.getCertificateCode()) ||
						!Validator.equals(certificateName,
							dmCertificate.getCertificateName())) {
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

			query.append(_SQL_SELECT_DMCERTIFICATE_WHERE);

			boolean bindCertificateCode = false;

			if (certificateCode == null) {
				query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATECODE_1);
			}
			else if (certificateCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATECODE_3);
			}
			else {
				bindCertificateCode = true;

				query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATECODE_2);
			}

			boolean bindCertificateName = false;

			if (certificateName == null) {
				query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATENAME_1);
			}
			else if (certificateName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATENAME_3);
			}
			else {
				bindCertificateName = true;

				query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmCertificateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCertificateCode) {
					qPos.add(certificateCode);
				}

				if (bindCertificateName) {
					qPos.add(certificateName);
				}

				if (!pagination) {
					list = (List<DmCertificate>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmCertificate>(list);
				}
				else {
					list = (List<DmCertificate>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm certificate in the ordered set where certificateCode = &#63; and certificateName = &#63;.
	 *
	 * @param certificateCode the certificate code
	 * @param certificateName the certificate name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm certificate
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException if a matching dm certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmCertificate findByCertificateCodeAndCertificateName_First(
		String certificateCode, String certificateName,
		OrderByComparator orderByComparator)
		throws NoSuchDmCertificateException, SystemException {
		DmCertificate dmCertificate = fetchByCertificateCodeAndCertificateName_First(certificateCode,
				certificateName, orderByComparator);

		if (dmCertificate != null) {
			return dmCertificate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateCode=");
		msg.append(certificateCode);

		msg.append(", certificateName=");
		msg.append(certificateName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmCertificateException(msg.toString());
	}

	/**
	 * Returns the first dm certificate in the ordered set where certificateCode = &#63; and certificateName = &#63;.
	 *
	 * @param certificateCode the certificate code
	 * @param certificateName the certificate name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm certificate, or <code>null</code> if a matching dm certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmCertificate fetchByCertificateCodeAndCertificateName_First(
		String certificateCode, String certificateName,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmCertificate> list = findByCertificateCodeAndCertificateName(certificateCode,
				certificateName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm certificate in the ordered set where certificateCode = &#63; and certificateName = &#63;.
	 *
	 * @param certificateCode the certificate code
	 * @param certificateName the certificate name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm certificate
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException if a matching dm certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmCertificate findByCertificateCodeAndCertificateName_Last(
		String certificateCode, String certificateName,
		OrderByComparator orderByComparator)
		throws NoSuchDmCertificateException, SystemException {
		DmCertificate dmCertificate = fetchByCertificateCodeAndCertificateName_Last(certificateCode,
				certificateName, orderByComparator);

		if (dmCertificate != null) {
			return dmCertificate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateCode=");
		msg.append(certificateCode);

		msg.append(", certificateName=");
		msg.append(certificateName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmCertificateException(msg.toString());
	}

	/**
	 * Returns the last dm certificate in the ordered set where certificateCode = &#63; and certificateName = &#63;.
	 *
	 * @param certificateCode the certificate code
	 * @param certificateName the certificate name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm certificate, or <code>null</code> if a matching dm certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmCertificate fetchByCertificateCodeAndCertificateName_Last(
		String certificateCode, String certificateName,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCertificateCodeAndCertificateName(certificateCode,
				certificateName);

		if (count == 0) {
			return null;
		}

		List<DmCertificate> list = findByCertificateCodeAndCertificateName(certificateCode,
				certificateName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm certificates before and after the current dm certificate in the ordered set where certificateCode = &#63; and certificateName = &#63;.
	 *
	 * @param id the primary key of the current dm certificate
	 * @param certificateCode the certificate code
	 * @param certificateName the certificate name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm certificate
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException if a dm certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmCertificate[] findByCertificateCodeAndCertificateName_PrevAndNext(
		long id, String certificateCode, String certificateName,
		OrderByComparator orderByComparator)
		throws NoSuchDmCertificateException, SystemException {
		DmCertificate dmCertificate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmCertificate[] array = new DmCertificateImpl[3];

			array[0] = getByCertificateCodeAndCertificateName_PrevAndNext(session,
					dmCertificate, certificateCode, certificateName,
					orderByComparator, true);

			array[1] = dmCertificate;

			array[2] = getByCertificateCodeAndCertificateName_PrevAndNext(session,
					dmCertificate, certificateCode, certificateName,
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

	protected DmCertificate getByCertificateCodeAndCertificateName_PrevAndNext(
		Session session, DmCertificate dmCertificate, String certificateCode,
		String certificateName, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMCERTIFICATE_WHERE);

		boolean bindCertificateCode = false;

		if (certificateCode == null) {
			query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATECODE_1);
		}
		else if (certificateCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATECODE_3);
		}
		else {
			bindCertificateCode = true;

			query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATECODE_2);
		}

		boolean bindCertificateName = false;

		if (certificateName == null) {
			query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATENAME_1);
		}
		else if (certificateName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATENAME_3);
		}
		else {
			bindCertificateName = true;

			query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATENAME_2);
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
			query.append(DmCertificateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCertificateCode) {
			qPos.add(certificateCode);
		}

		if (bindCertificateName) {
			qPos.add(certificateName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmCertificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmCertificate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm certificates where certificateCode = &#63; and certificateName = &#63; from the database.
	 *
	 * @param certificateCode the certificate code
	 * @param certificateName the certificate name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCertificateCodeAndCertificateName(
		String certificateCode, String certificateName)
		throws SystemException {
		for (DmCertificate dmCertificate : findByCertificateCodeAndCertificateName(
				certificateCode, certificateName, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dmCertificate);
		}
	}

	/**
	 * Returns the number of dm certificates where certificateCode = &#63; and certificateName = &#63;.
	 *
	 * @param certificateCode the certificate code
	 * @param certificateName the certificate name
	 * @return the number of matching dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCertificateCodeAndCertificateName(
		String certificateCode, String certificateName)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CERTIFICATECODEANDCERTIFICATENAME;

		Object[] finderArgs = new Object[] { certificateCode, certificateName };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMCERTIFICATE_WHERE);

			boolean bindCertificateCode = false;

			if (certificateCode == null) {
				query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATECODE_1);
			}
			else if (certificateCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATECODE_3);
			}
			else {
				bindCertificateCode = true;

				query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATECODE_2);
			}

			boolean bindCertificateName = false;

			if (certificateName == null) {
				query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATENAME_1);
			}
			else if (certificateName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATENAME_3);
			}
			else {
				bindCertificateName = true;

				query.append(_FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATENAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCertificateCode) {
					qPos.add(certificateCode);
				}

				if (bindCertificateName) {
					qPos.add(certificateName);
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

	private static final String _FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATECODE_1 =
		"dmCertificate.certificateCode IS NULL AND ";
	private static final String _FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATECODE_2 =
		"dmCertificate.certificateCode = ? AND ";
	private static final String _FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATECODE_3 =
		"(dmCertificate.certificateCode IS NULL OR dmCertificate.certificateCode = '') AND ";
	private static final String _FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATENAME_1 =
		"dmCertificate.certificateName IS NULL";
	private static final String _FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATENAME_2 =
		"dmCertificate.certificateName = ?";
	private static final String _FINDER_COLUMN_CERTIFICATECODEANDCERTIFICATENAME_CERTIFICATENAME_3 =
		"(dmCertificate.certificateName IS NULL OR dmCertificate.certificateName = '')";

	public DmCertificatePersistenceImpl() {
		setModelClass(DmCertificate.class);
	}

	/**
	 * Caches the dm certificate in the entity cache if it is enabled.
	 *
	 * @param dmCertificate the dm certificate
	 */
	@Override
	public void cacheResult(DmCertificate dmCertificate) {
		EntityCacheUtil.putResult(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateImpl.class, dmCertificate.getPrimaryKey(),
			dmCertificate);

		dmCertificate.resetOriginalValues();
	}

	/**
	 * Caches the dm certificates in the entity cache if it is enabled.
	 *
	 * @param dmCertificates the dm certificates
	 */
	@Override
	public void cacheResult(List<DmCertificate> dmCertificates) {
		for (DmCertificate dmCertificate : dmCertificates) {
			if (EntityCacheUtil.getResult(
						DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
						DmCertificateImpl.class, dmCertificate.getPrimaryKey()) == null) {
				cacheResult(dmCertificate);
			}
			else {
				dmCertificate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm certificates.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmCertificateImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmCertificateImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm certificate.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmCertificate dmCertificate) {
		EntityCacheUtil.removeResult(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateImpl.class, dmCertificate.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DmCertificate> dmCertificates) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmCertificate dmCertificate : dmCertificates) {
			EntityCacheUtil.removeResult(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
				DmCertificateImpl.class, dmCertificate.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dm certificate with the primary key. Does not add the dm certificate to the database.
	 *
	 * @param id the primary key for the new dm certificate
	 * @return the new dm certificate
	 */
	@Override
	public DmCertificate create(long id) {
		DmCertificate dmCertificate = new DmCertificateImpl();

		dmCertificate.setNew(true);
		dmCertificate.setPrimaryKey(id);

		return dmCertificate;
	}

	/**
	 * Removes the dm certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm certificate
	 * @return the dm certificate that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException if a dm certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmCertificate remove(long id)
		throws NoSuchDmCertificateException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm certificate
	 * @return the dm certificate that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException if a dm certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmCertificate remove(Serializable primaryKey)
		throws NoSuchDmCertificateException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmCertificate dmCertificate = (DmCertificate)session.get(DmCertificateImpl.class,
					primaryKey);

			if (dmCertificate == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmCertificateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmCertificate);
		}
		catch (NoSuchDmCertificateException nsee) {
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
	protected DmCertificate removeImpl(DmCertificate dmCertificate)
		throws SystemException {
		dmCertificate = toUnwrappedModel(dmCertificate);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmCertificate)) {
				dmCertificate = (DmCertificate)session.get(DmCertificateImpl.class,
						dmCertificate.getPrimaryKeyObj());
			}

			if (dmCertificate != null) {
				session.delete(dmCertificate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmCertificate != null) {
			clearCache(dmCertificate);
		}

		return dmCertificate;
	}

	@Override
	public DmCertificate updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmCertificate dmCertificate)
		throws SystemException {
		dmCertificate = toUnwrappedModel(dmCertificate);

		boolean isNew = dmCertificate.isNew();

		DmCertificateModelImpl dmCertificateModelImpl = (DmCertificateModelImpl)dmCertificate;

		Session session = null;

		try {
			session = openSession();

			if (dmCertificate.isNew()) {
				session.save(dmCertificate);

				dmCertificate.setNew(false);
			}
			else {
				session.merge(dmCertificate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmCertificateModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmCertificateModelImpl.getOriginalCertificateCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATECODE,
					args);

				args = new Object[] { dmCertificateModelImpl.getCertificateCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATECODE,
					args);
			}

			if ((dmCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATECODEANDCERTIFICATENAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmCertificateModelImpl.getOriginalCertificateCode(),
						dmCertificateModelImpl.getOriginalCertificateName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATECODEANDCERTIFICATENAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATECODEANDCERTIFICATENAME,
					args);

				args = new Object[] {
						dmCertificateModelImpl.getCertificateCode(),
						dmCertificateModelImpl.getCertificateName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATECODEANDCERTIFICATENAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATECODEANDCERTIFICATENAME,
					args);
			}
		}

		EntityCacheUtil.putResult(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DmCertificateImpl.class, dmCertificate.getPrimaryKey(),
			dmCertificate);

		return dmCertificate;
	}

	protected DmCertificate toUnwrappedModel(DmCertificate dmCertificate) {
		if (dmCertificate instanceof DmCertificateImpl) {
			return dmCertificate;
		}

		DmCertificateImpl dmCertificateImpl = new DmCertificateImpl();

		dmCertificateImpl.setNew(dmCertificate.isNew());
		dmCertificateImpl.setPrimaryKey(dmCertificate.getPrimaryKey());

		dmCertificateImpl.setId(dmCertificate.getId());
		dmCertificateImpl.setCertificateCode(dmCertificate.getCertificateCode());
		dmCertificateImpl.setCertificateName(dmCertificate.getCertificateName());
		dmCertificateImpl.setCertificateNameVN(dmCertificate.getCertificateNameVN());
		dmCertificateImpl.setCertificateOrder(dmCertificate.getCertificateOrder());
		dmCertificateImpl.setIsDelete(dmCertificate.getIsDelete());
		dmCertificateImpl.setMarkedAsDelete(dmCertificate.getMarkedAsDelete());
		dmCertificateImpl.setModifiedDate(dmCertificate.getModifiedDate());
		dmCertificateImpl.setRequestedDate(dmCertificate.getRequestedDate());
		dmCertificateImpl.setSyncVersion(dmCertificate.getSyncVersion());

		return dmCertificateImpl;
	}

	/**
	 * Returns the dm certificate with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm certificate
	 * @return the dm certificate
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException if a dm certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmCertificate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmCertificateException, SystemException {
		DmCertificate dmCertificate = fetchByPrimaryKey(primaryKey);

		if (dmCertificate == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmCertificateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmCertificate;
	}

	/**
	 * Returns the dm certificate with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException} if it could not be found.
	 *
	 * @param id the primary key of the dm certificate
	 * @return the dm certificate
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException if a dm certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmCertificate findByPrimaryKey(long id)
		throws NoSuchDmCertificateException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm certificate
	 * @return the dm certificate, or <code>null</code> if a dm certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmCertificate fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmCertificate dmCertificate = (DmCertificate)EntityCacheUtil.getResult(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
				DmCertificateImpl.class, primaryKey);

		if (dmCertificate == _nullDmCertificate) {
			return null;
		}

		if (dmCertificate == null) {
			Session session = null;

			try {
				session = openSession();

				dmCertificate = (DmCertificate)session.get(DmCertificateImpl.class,
						primaryKey);

				if (dmCertificate != null) {
					cacheResult(dmCertificate);
				}
				else {
					EntityCacheUtil.putResult(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
						DmCertificateImpl.class, primaryKey, _nullDmCertificate);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmCertificateModelImpl.ENTITY_CACHE_ENABLED,
					DmCertificateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmCertificate;
	}

	/**
	 * Returns the dm certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm certificate
	 * @return the dm certificate, or <code>null</code> if a dm certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmCertificate fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm certificates.
	 *
	 * @return the dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmCertificate> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm certificates
	 * @param end the upper bound of the range of dm certificates (not inclusive)
	 * @return the range of dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmCertificate> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm certificates
	 * @param end the upper bound of the range of dm certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmCertificate> findAll(int start, int end,
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

		List<DmCertificate> list = (List<DmCertificate>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMCERTIFICATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMCERTIFICATE;

				if (pagination) {
					sql = sql.concat(DmCertificateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmCertificate>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmCertificate>(list);
				}
				else {
					list = (List<DmCertificate>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dm certificates from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmCertificate dmCertificate : findAll()) {
			remove(dmCertificate);
		}
	}

	/**
	 * Returns the number of dm certificates.
	 *
	 * @return the number of dm certificates
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

				Query q = session.createQuery(_SQL_COUNT_DMCERTIFICATE);

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
	 * Initializes the dm certificate persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmCertificate")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmCertificate>> listenersList = new ArrayList<ModelListener<DmCertificate>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmCertificate>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmCertificateImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMCERTIFICATE = "SELECT dmCertificate FROM DmCertificate dmCertificate";
	private static final String _SQL_SELECT_DMCERTIFICATE_WHERE = "SELECT dmCertificate FROM DmCertificate dmCertificate WHERE ";
	private static final String _SQL_COUNT_DMCERTIFICATE = "SELECT COUNT(dmCertificate) FROM DmCertificate dmCertificate";
	private static final String _SQL_COUNT_DMCERTIFICATE_WHERE = "SELECT COUNT(dmCertificate) FROM DmCertificate dmCertificate WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmCertificate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmCertificate exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmCertificate exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmCertificatePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "certificateCode", "certificateName", "certificateNameVN",
				"certificateOrder", "isDelete", "markedAsDelete", "modifiedDate",
				"requestedDate", "syncVersion"
			});
	private static DmCertificate _nullDmCertificate = new DmCertificateImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmCertificate> toCacheModel() {
				return _nullDmCertificateCacheModel;
			}
		};

	private static CacheModel<DmCertificate> _nullDmCertificateCacheModel = new CacheModel<DmCertificate>() {
			@Override
			public DmCertificate toEntityModel() {
				return _nullDmCertificate;
			}
		};
}