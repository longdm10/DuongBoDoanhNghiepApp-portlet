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

package vn.dtt.duongbo.dao.lienvan.service.persistence;

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

import vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt xu ly gp lien van phuong tien tram dung nghi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVanPhuongTienTramDungNghiPersistence
 * @see QlvtXuLyGpLienVanPhuongTienTramDungNghiUtil
 * @generated
 */
public class QlvtXuLyGpLienVanPhuongTienTramDungNghiPersistenceImpl
	extends BasePersistenceImpl<QlvtXuLyGpLienVanPhuongTienTramDungNghi>
	implements QlvtXuLyGpLienVanPhuongTienTramDungNghiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtXuLyGpLienVanPhuongTienTramDungNghiUtil} to access the qlvt xu ly gp lien van phuong tien tram dung nghi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CAPGPLXPHUONGTIENID =
		new FinderPath(QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCapGplxPhuongTienId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPGPLXPHUONGTIENID =
		new FinderPath(QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCapGplxPhuongTienId", new String[] { Long.class.getName() },
			QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.CAPGPLXPHUONGTIENID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CAPGPLXPHUONGTIENID = new FinderPath(QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCapGplxPhuongTienId", new String[] { Long.class.getName() });

	/**
	 * Returns all the qlvt xu ly gp lien van phuong tien tram dung nghis where capGplxPhuongTienId = &#63;.
	 *
	 * @param capGplxPhuongTienId the cap gplx phuong tien ID
	 * @return the matching qlvt xu ly gp lien van phuong tien tram dung nghis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVanPhuongTienTramDungNghi> findByCapGplxPhuongTienId(
		long capGplxPhuongTienId) throws SystemException {
		return findByCapGplxPhuongTienId(capGplxPhuongTienId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt xu ly gp lien van phuong tien tram dung nghis where capGplxPhuongTienId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param capGplxPhuongTienId the cap gplx phuong tien ID
	 * @param start the lower bound of the range of qlvt xu ly gp lien van phuong tien tram dung nghis
	 * @param end the upper bound of the range of qlvt xu ly gp lien van phuong tien tram dung nghis (not inclusive)
	 * @return the range of matching qlvt xu ly gp lien van phuong tien tram dung nghis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVanPhuongTienTramDungNghi> findByCapGplxPhuongTienId(
		long capGplxPhuongTienId, int start, int end) throws SystemException {
		return findByCapGplxPhuongTienId(capGplxPhuongTienId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt xu ly gp lien van phuong tien tram dung nghis where capGplxPhuongTienId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param capGplxPhuongTienId the cap gplx phuong tien ID
	 * @param start the lower bound of the range of qlvt xu ly gp lien van phuong tien tram dung nghis
	 * @param end the upper bound of the range of qlvt xu ly gp lien van phuong tien tram dung nghis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qlvt xu ly gp lien van phuong tien tram dung nghis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVanPhuongTienTramDungNghi> findByCapGplxPhuongTienId(
		long capGplxPhuongTienId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPGPLXPHUONGTIENID;
			finderArgs = new Object[] { capGplxPhuongTienId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CAPGPLXPHUONGTIENID;
			finderArgs = new Object[] {
					capGplxPhuongTienId,
					
					start, end, orderByComparator
				};
		}

		List<QlvtXuLyGpLienVanPhuongTienTramDungNghi> list = (List<QlvtXuLyGpLienVanPhuongTienTramDungNghi>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi : list) {
				if ((capGplxPhuongTienId != qlvtXuLyGpLienVanPhuongTienTramDungNghi.getCapGplxPhuongTienId())) {
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

			query.append(_SQL_SELECT_QLVTXULYGPLIENVANPHUONGTIENTRAMDUNGNGHI_WHERE);

			query.append(_FINDER_COLUMN_CAPGPLXPHUONGTIENID_CAPGPLXPHUONGTIENID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(capGplxPhuongTienId);

				if (!pagination) {
					list = (List<QlvtXuLyGpLienVanPhuongTienTramDungNghi>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtXuLyGpLienVanPhuongTienTramDungNghi>(list);
				}
				else {
					list = (List<QlvtXuLyGpLienVanPhuongTienTramDungNghi>)QueryUtil.list(q,
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
	 * Returns the first qlvt xu ly gp lien van phuong tien tram dung nghi in the ordered set where capGplxPhuongTienId = &#63;.
	 *
	 * @param capGplxPhuongTienId the cap gplx phuong tien ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt xu ly gp lien van phuong tien tram dung nghi
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException if a matching qlvt xu ly gp lien van phuong tien tram dung nghi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanPhuongTienTramDungNghi findByCapGplxPhuongTienId_First(
		long capGplxPhuongTienId, OrderByComparator orderByComparator)
		throws NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException,
			SystemException {
		QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi =
			fetchByCapGplxPhuongTienId_First(capGplxPhuongTienId,
				orderByComparator);

		if (qlvtXuLyGpLienVanPhuongTienTramDungNghi != null) {
			return qlvtXuLyGpLienVanPhuongTienTramDungNghi;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("capGplxPhuongTienId=");
		msg.append(capGplxPhuongTienId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException(msg.toString());
	}

	/**
	 * Returns the first qlvt xu ly gp lien van phuong tien tram dung nghi in the ordered set where capGplxPhuongTienId = &#63;.
	 *
	 * @param capGplxPhuongTienId the cap gplx phuong tien ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt xu ly gp lien van phuong tien tram dung nghi, or <code>null</code> if a matching qlvt xu ly gp lien van phuong tien tram dung nghi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanPhuongTienTramDungNghi fetchByCapGplxPhuongTienId_First(
		long capGplxPhuongTienId, OrderByComparator orderByComparator)
		throws SystemException {
		List<QlvtXuLyGpLienVanPhuongTienTramDungNghi> list = findByCapGplxPhuongTienId(capGplxPhuongTienId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last qlvt xu ly gp lien van phuong tien tram dung nghi in the ordered set where capGplxPhuongTienId = &#63;.
	 *
	 * @param capGplxPhuongTienId the cap gplx phuong tien ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt xu ly gp lien van phuong tien tram dung nghi
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException if a matching qlvt xu ly gp lien van phuong tien tram dung nghi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanPhuongTienTramDungNghi findByCapGplxPhuongTienId_Last(
		long capGplxPhuongTienId, OrderByComparator orderByComparator)
		throws NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException,
			SystemException {
		QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi =
			fetchByCapGplxPhuongTienId_Last(capGplxPhuongTienId,
				orderByComparator);

		if (qlvtXuLyGpLienVanPhuongTienTramDungNghi != null) {
			return qlvtXuLyGpLienVanPhuongTienTramDungNghi;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("capGplxPhuongTienId=");
		msg.append(capGplxPhuongTienId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException(msg.toString());
	}

	/**
	 * Returns the last qlvt xu ly gp lien van phuong tien tram dung nghi in the ordered set where capGplxPhuongTienId = &#63;.
	 *
	 * @param capGplxPhuongTienId the cap gplx phuong tien ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt xu ly gp lien van phuong tien tram dung nghi, or <code>null</code> if a matching qlvt xu ly gp lien van phuong tien tram dung nghi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanPhuongTienTramDungNghi fetchByCapGplxPhuongTienId_Last(
		long capGplxPhuongTienId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByCapGplxPhuongTienId(capGplxPhuongTienId);

		if (count == 0) {
			return null;
		}

		List<QlvtXuLyGpLienVanPhuongTienTramDungNghi> list = findByCapGplxPhuongTienId(capGplxPhuongTienId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the qlvt xu ly gp lien van phuong tien tram dung nghis before and after the current qlvt xu ly gp lien van phuong tien tram dung nghi in the ordered set where capGplxPhuongTienId = &#63;.
	 *
	 * @param id the primary key of the current qlvt xu ly gp lien van phuong tien tram dung nghi
	 * @param capGplxPhuongTienId the cap gplx phuong tien ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qlvt xu ly gp lien van phuong tien tram dung nghi
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException if a qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanPhuongTienTramDungNghi[] findByCapGplxPhuongTienId_PrevAndNext(
		long id, long capGplxPhuongTienId, OrderByComparator orderByComparator)
		throws NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException,
			SystemException {
		QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi =
			findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			QlvtXuLyGpLienVanPhuongTienTramDungNghi[] array = new QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl[3];

			array[0] = getByCapGplxPhuongTienId_PrevAndNext(session,
					qlvtXuLyGpLienVanPhuongTienTramDungNghi,
					capGplxPhuongTienId, orderByComparator, true);

			array[1] = qlvtXuLyGpLienVanPhuongTienTramDungNghi;

			array[2] = getByCapGplxPhuongTienId_PrevAndNext(session,
					qlvtXuLyGpLienVanPhuongTienTramDungNghi,
					capGplxPhuongTienId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected QlvtXuLyGpLienVanPhuongTienTramDungNghi getByCapGplxPhuongTienId_PrevAndNext(
		Session session,
		QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi,
		long capGplxPhuongTienId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_QLVTXULYGPLIENVANPHUONGTIENTRAMDUNGNGHI_WHERE);

		query.append(_FINDER_COLUMN_CAPGPLXPHUONGTIENID_CAPGPLXPHUONGTIENID_2);

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
			query.append(QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(capGplxPhuongTienId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(qlvtXuLyGpLienVanPhuongTienTramDungNghi);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<QlvtXuLyGpLienVanPhuongTienTramDungNghi> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the qlvt xu ly gp lien van phuong tien tram dung nghis where capGplxPhuongTienId = &#63; from the database.
	 *
	 * @param capGplxPhuongTienId the cap gplx phuong tien ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCapGplxPhuongTienId(long capGplxPhuongTienId)
		throws SystemException {
		for (QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi : findByCapGplxPhuongTienId(
				capGplxPhuongTienId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(qlvtXuLyGpLienVanPhuongTienTramDungNghi);
		}
	}

	/**
	 * Returns the number of qlvt xu ly gp lien van phuong tien tram dung nghis where capGplxPhuongTienId = &#63;.
	 *
	 * @param capGplxPhuongTienId the cap gplx phuong tien ID
	 * @return the number of matching qlvt xu ly gp lien van phuong tien tram dung nghis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCapGplxPhuongTienId(long capGplxPhuongTienId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CAPGPLXPHUONGTIENID;

		Object[] finderArgs = new Object[] { capGplxPhuongTienId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_QLVTXULYGPLIENVANPHUONGTIENTRAMDUNGNGHI_WHERE);

			query.append(_FINDER_COLUMN_CAPGPLXPHUONGTIENID_CAPGPLXPHUONGTIENID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(capGplxPhuongTienId);

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

	private static final String _FINDER_COLUMN_CAPGPLXPHUONGTIENID_CAPGPLXPHUONGTIENID_2 =
		"qlvtXuLyGpLienVanPhuongTienTramDungNghi.capGplxPhuongTienId = ?";

	public QlvtXuLyGpLienVanPhuongTienTramDungNghiPersistenceImpl() {
		setModelClass(QlvtXuLyGpLienVanPhuongTienTramDungNghi.class);
	}

	/**
	 * Caches the qlvt xu ly gp lien van phuong tien tram dung nghi in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyGpLienVanPhuongTienTramDungNghi the qlvt xu ly gp lien van phuong tien tram dung nghi
	 */
	@Override
	public void cacheResult(
		QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi) {
		EntityCacheUtil.putResult(QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.class,
			qlvtXuLyGpLienVanPhuongTienTramDungNghi.getPrimaryKey(),
			qlvtXuLyGpLienVanPhuongTienTramDungNghi);

		qlvtXuLyGpLienVanPhuongTienTramDungNghi.resetOriginalValues();
	}

	/**
	 * Caches the qlvt xu ly gp lien van phuong tien tram dung nghis in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyGpLienVanPhuongTienTramDungNghis the qlvt xu ly gp lien van phuong tien tram dung nghis
	 */
	@Override
	public void cacheResult(
		List<QlvtXuLyGpLienVanPhuongTienTramDungNghi> qlvtXuLyGpLienVanPhuongTienTramDungNghis) {
		for (QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi : qlvtXuLyGpLienVanPhuongTienTramDungNghis) {
			if (EntityCacheUtil.getResult(
						QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.ENTITY_CACHE_ENABLED,
						QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.class,
						qlvtXuLyGpLienVanPhuongTienTramDungNghi.getPrimaryKey()) == null) {
				cacheResult(qlvtXuLyGpLienVanPhuongTienTramDungNghi);
			}
			else {
				qlvtXuLyGpLienVanPhuongTienTramDungNghi.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt xu ly gp lien van phuong tien tram dung nghis.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt xu ly gp lien van phuong tien tram dung nghi.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi) {
		EntityCacheUtil.removeResult(QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.class,
			qlvtXuLyGpLienVanPhuongTienTramDungNghi.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QlvtXuLyGpLienVanPhuongTienTramDungNghi> qlvtXuLyGpLienVanPhuongTienTramDungNghis) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi : qlvtXuLyGpLienVanPhuongTienTramDungNghis) {
			EntityCacheUtil.removeResult(QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.ENTITY_CACHE_ENABLED,
				QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.class,
				qlvtXuLyGpLienVanPhuongTienTramDungNghi.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key. Does not add the qlvt xu ly gp lien van phuong tien tram dung nghi to the database.
	 *
	 * @param id the primary key for the new qlvt xu ly gp lien van phuong tien tram dung nghi
	 * @return the new qlvt xu ly gp lien van phuong tien tram dung nghi
	 */
	@Override
	public QlvtXuLyGpLienVanPhuongTienTramDungNghi create(long id) {
		QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi =
			new QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl();

		qlvtXuLyGpLienVanPhuongTienTramDungNghi.setNew(true);
		qlvtXuLyGpLienVanPhuongTienTramDungNghi.setPrimaryKey(id);

		return qlvtXuLyGpLienVanPhuongTienTramDungNghi;
	}

	/**
	 * Removes the qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt xu ly gp lien van phuong tien tram dung nghi
	 * @return the qlvt xu ly gp lien van phuong tien tram dung nghi that was removed
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException if a qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanPhuongTienTramDungNghi remove(long id)
		throws NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException,
			SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly gp lien van phuong tien tram dung nghi
	 * @return the qlvt xu ly gp lien van phuong tien tram dung nghi that was removed
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException if a qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanPhuongTienTramDungNghi remove(
		Serializable primaryKey)
		throws NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException,
			SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi =
				(QlvtXuLyGpLienVanPhuongTienTramDungNghi)session.get(QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.class,
					primaryKey);

			if (qlvtXuLyGpLienVanPhuongTienTramDungNghi == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtXuLyGpLienVanPhuongTienTramDungNghi);
		}
		catch (NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException nsee) {
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
	protected QlvtXuLyGpLienVanPhuongTienTramDungNghi removeImpl(
		QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi)
		throws SystemException {
		qlvtXuLyGpLienVanPhuongTienTramDungNghi = toUnwrappedModel(qlvtXuLyGpLienVanPhuongTienTramDungNghi);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtXuLyGpLienVanPhuongTienTramDungNghi)) {
				qlvtXuLyGpLienVanPhuongTienTramDungNghi = (QlvtXuLyGpLienVanPhuongTienTramDungNghi)session.get(QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.class,
						qlvtXuLyGpLienVanPhuongTienTramDungNghi.getPrimaryKeyObj());
			}

			if (qlvtXuLyGpLienVanPhuongTienTramDungNghi != null) {
				session.delete(qlvtXuLyGpLienVanPhuongTienTramDungNghi);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtXuLyGpLienVanPhuongTienTramDungNghi != null) {
			clearCache(qlvtXuLyGpLienVanPhuongTienTramDungNghi);
		}

		return qlvtXuLyGpLienVanPhuongTienTramDungNghi;
	}

	@Override
	public QlvtXuLyGpLienVanPhuongTienTramDungNghi updateImpl(
		vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi)
		throws SystemException {
		qlvtXuLyGpLienVanPhuongTienTramDungNghi = toUnwrappedModel(qlvtXuLyGpLienVanPhuongTienTramDungNghi);

		boolean isNew = qlvtXuLyGpLienVanPhuongTienTramDungNghi.isNew();

		QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl qlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl =
			(QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl)qlvtXuLyGpLienVanPhuongTienTramDungNghi;

		Session session = null;

		try {
			session = openSession();

			if (qlvtXuLyGpLienVanPhuongTienTramDungNghi.isNew()) {
				session.save(qlvtXuLyGpLienVanPhuongTienTramDungNghi);

				qlvtXuLyGpLienVanPhuongTienTramDungNghi.setNew(false);
			}
			else {
				session.merge(qlvtXuLyGpLienVanPhuongTienTramDungNghi);
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
				!QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((qlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPGPLXPHUONGTIENID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.getOriginalCapGplxPhuongTienId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CAPGPLXPHUONGTIENID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPGPLXPHUONGTIENID,
					args);

				args = new Object[] {
						qlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.getCapGplxPhuongTienId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CAPGPLXPHUONGTIENID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPGPLXPHUONGTIENID,
					args);
			}
		}

		EntityCacheUtil.putResult(QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.class,
			qlvtXuLyGpLienVanPhuongTienTramDungNghi.getPrimaryKey(),
			qlvtXuLyGpLienVanPhuongTienTramDungNghi);

		return qlvtXuLyGpLienVanPhuongTienTramDungNghi;
	}

	protected QlvtXuLyGpLienVanPhuongTienTramDungNghi toUnwrappedModel(
		QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi) {
		if (qlvtXuLyGpLienVanPhuongTienTramDungNghi instanceof QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl) {
			return qlvtXuLyGpLienVanPhuongTienTramDungNghi;
		}

		QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl qlvtXuLyGpLienVanPhuongTienTramDungNghiImpl =
			new QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl();

		qlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.setNew(qlvtXuLyGpLienVanPhuongTienTramDungNghi.isNew());
		qlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.setPrimaryKey(qlvtXuLyGpLienVanPhuongTienTramDungNghi.getPrimaryKey());

		qlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.setId(qlvtXuLyGpLienVanPhuongTienTramDungNghi.getId());
		qlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.setCapGplxPhuongTienId(qlvtXuLyGpLienVanPhuongTienTramDungNghi.getCapGplxPhuongTienId());
		qlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.setMaTramDungNghi(qlvtXuLyGpLienVanPhuongTienTramDungNghi.getMaTramDungNghi());

		return qlvtXuLyGpLienVanPhuongTienTramDungNghiImpl;
	}

	/**
	 * Returns the qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly gp lien van phuong tien tram dung nghi
	 * @return the qlvt xu ly gp lien van phuong tien tram dung nghi
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException if a qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanPhuongTienTramDungNghi findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException,
			SystemException {
		QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi =
			fetchByPrimaryKey(primaryKey);

		if (qlvtXuLyGpLienVanPhuongTienTramDungNghi == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtXuLyGpLienVanPhuongTienTramDungNghi;
	}

	/**
	 * Returns the qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key or throws a {@link vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt xu ly gp lien van phuong tien tram dung nghi
	 * @return the qlvt xu ly gp lien van phuong tien tram dung nghi
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException if a qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanPhuongTienTramDungNghi findByPrimaryKey(long id)
		throws NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException,
			SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly gp lien van phuong tien tram dung nghi
	 * @return the qlvt xu ly gp lien van phuong tien tram dung nghi, or <code>null</code> if a qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanPhuongTienTramDungNghi fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi =
			(QlvtXuLyGpLienVanPhuongTienTramDungNghi)EntityCacheUtil.getResult(QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.ENTITY_CACHE_ENABLED,
				QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.class, primaryKey);

		if (qlvtXuLyGpLienVanPhuongTienTramDungNghi == _nullQlvtXuLyGpLienVanPhuongTienTramDungNghi) {
			return null;
		}

		if (qlvtXuLyGpLienVanPhuongTienTramDungNghi == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtXuLyGpLienVanPhuongTienTramDungNghi = (QlvtXuLyGpLienVanPhuongTienTramDungNghi)session.get(QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.class,
						primaryKey);

				if (qlvtXuLyGpLienVanPhuongTienTramDungNghi != null) {
					cacheResult(qlvtXuLyGpLienVanPhuongTienTramDungNghi);
				}
				else {
					EntityCacheUtil.putResult(QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.ENTITY_CACHE_ENABLED,
						QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.class,
						primaryKey, _nullQlvtXuLyGpLienVanPhuongTienTramDungNghi);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.ENTITY_CACHE_ENABLED,
					QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.class,
					primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtXuLyGpLienVanPhuongTienTramDungNghi;
	}

	/**
	 * Returns the qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt xu ly gp lien van phuong tien tram dung nghi
	 * @return the qlvt xu ly gp lien van phuong tien tram dung nghi, or <code>null</code> if a qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanPhuongTienTramDungNghi fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt xu ly gp lien van phuong tien tram dung nghis.
	 *
	 * @return the qlvt xu ly gp lien van phuong tien tram dung nghis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVanPhuongTienTramDungNghi> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt xu ly gp lien van phuong tien tram dung nghis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt xu ly gp lien van phuong tien tram dung nghis
	 * @param end the upper bound of the range of qlvt xu ly gp lien van phuong tien tram dung nghis (not inclusive)
	 * @return the range of qlvt xu ly gp lien van phuong tien tram dung nghis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVanPhuongTienTramDungNghi> findAll(int start,
		int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt xu ly gp lien van phuong tien tram dung nghis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt xu ly gp lien van phuong tien tram dung nghis
	 * @param end the upper bound of the range of qlvt xu ly gp lien van phuong tien tram dung nghis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt xu ly gp lien van phuong tien tram dung nghis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVanPhuongTienTramDungNghi> findAll(int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
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

		List<QlvtXuLyGpLienVanPhuongTienTramDungNghi> list = (List<QlvtXuLyGpLienVanPhuongTienTramDungNghi>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTXULYGPLIENVANPHUONGTIENTRAMDUNGNGHI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTXULYGPLIENVANPHUONGTIENTRAMDUNGNGHI;

				if (pagination) {
					sql = sql.concat(QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtXuLyGpLienVanPhuongTienTramDungNghi>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtXuLyGpLienVanPhuongTienTramDungNghi>(list);
				}
				else {
					list = (List<QlvtXuLyGpLienVanPhuongTienTramDungNghi>)QueryUtil.list(q,
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
	 * Removes all the qlvt xu ly gp lien van phuong tien tram dung nghis from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi : findAll()) {
			remove(qlvtXuLyGpLienVanPhuongTienTramDungNghi);
		}
	}

	/**
	 * Returns the number of qlvt xu ly gp lien van phuong tien tram dung nghis.
	 *
	 * @return the number of qlvt xu ly gp lien van phuong tien tram dung nghis
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

				Query q = session.createQuery(_SQL_COUNT_QLVTXULYGPLIENVANPHUONGTIENTRAMDUNGNGHI);

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
	 * Initializes the qlvt xu ly gp lien van phuong tien tram dung nghi persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtXuLyGpLienVanPhuongTienTramDungNghi>> listenersList =
					new ArrayList<ModelListener<QlvtXuLyGpLienVanPhuongTienTramDungNghi>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtXuLyGpLienVanPhuongTienTramDungNghi>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTXULYGPLIENVANPHUONGTIENTRAMDUNGNGHI =
		"SELECT qlvtXuLyGpLienVanPhuongTienTramDungNghi FROM QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi";
	private static final String _SQL_SELECT_QLVTXULYGPLIENVANPHUONGTIENTRAMDUNGNGHI_WHERE =
		"SELECT qlvtXuLyGpLienVanPhuongTienTramDungNghi FROM QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi WHERE ";
	private static final String _SQL_COUNT_QLVTXULYGPLIENVANPHUONGTIENTRAMDUNGNGHI =
		"SELECT COUNT(qlvtXuLyGpLienVanPhuongTienTramDungNghi) FROM QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi";
	private static final String _SQL_COUNT_QLVTXULYGPLIENVANPHUONGTIENTRAMDUNGNGHI_WHERE =
		"SELECT COUNT(qlvtXuLyGpLienVanPhuongTienTramDungNghi) FROM QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtXuLyGpLienVanPhuongTienTramDungNghi.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtXuLyGpLienVanPhuongTienTramDungNghi exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QlvtXuLyGpLienVanPhuongTienTramDungNghi exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtXuLyGpLienVanPhuongTienTramDungNghiPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "capGplxPhuongTienId", "maTramDungNghi"
			});
	private static QlvtXuLyGpLienVanPhuongTienTramDungNghi _nullQlvtXuLyGpLienVanPhuongTienTramDungNghi =
		new QlvtXuLyGpLienVanPhuongTienTramDungNghiImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtXuLyGpLienVanPhuongTienTramDungNghi> toCacheModel() {
				return _nullQlvtXuLyGpLienVanPhuongTienTramDungNghiCacheModel;
			}
		};

	private static CacheModel<QlvtXuLyGpLienVanPhuongTienTramDungNghi> _nullQlvtXuLyGpLienVanPhuongTienTramDungNghiCacheModel =
		new CacheModel<QlvtXuLyGpLienVanPhuongTienTramDungNghi>() {
			@Override
			public QlvtXuLyGpLienVanPhuongTienTramDungNghi toEntityModel() {
				return _nullQlvtXuLyGpLienVanPhuongTienTramDungNghi;
			}
		};
}