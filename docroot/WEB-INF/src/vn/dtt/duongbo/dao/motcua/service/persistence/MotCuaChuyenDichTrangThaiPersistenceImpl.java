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

package vn.dtt.duongbo.dao.motcua.service.persistence;

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

import vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException;
import vn.dtt.duongbo.dao.motcua.model.MotCuaChuyenDichTrangThai;
import vn.dtt.duongbo.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiImpl;
import vn.dtt.duongbo.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the mot cua chuyen dich trang thai service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaChuyenDichTrangThaiPersistence
 * @see MotCuaChuyenDichTrangThaiUtil
 * @generated
 */
public class MotCuaChuyenDichTrangThaiPersistenceImpl
	extends BasePersistenceImpl<MotCuaChuyenDichTrangThai>
	implements MotCuaChuyenDichTrangThaiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MotCuaChuyenDichTrangThaiUtil} to access the mot cua chuyen dich trang thai persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MotCuaChuyenDichTrangThaiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DIEUKIENCHUYENDICH =
		new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDieuKienChuyenDich",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIEUKIENCHUYENDICH =
		new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDieuKienChuyenDich",
			new String[] { String.class.getName() },
			MotCuaChuyenDichTrangThaiModelImpl.DIEUKIENCHUYENDICH_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DIEUKIENCHUYENDICH = new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDieuKienChuyenDich", new String[] { String.class.getName() });

	/**
	 * Returns all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @return the matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByDieuKienChuyenDich(
		String dieuKienChuyenDich) throws SystemException {
		return findByDieuKienChuyenDich(dieuKienChuyenDich, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param start the lower bound of the range of mot cua chuyen dich trang thais
	 * @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	 * @return the range of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByDieuKienChuyenDich(
		String dieuKienChuyenDich, int start, int end)
		throws SystemException {
		return findByDieuKienChuyenDich(dieuKienChuyenDich, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param start the lower bound of the range of mot cua chuyen dich trang thais
	 * @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByDieuKienChuyenDich(
		String dieuKienChuyenDich, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIEUKIENCHUYENDICH;
			finderArgs = new Object[] { dieuKienChuyenDich };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DIEUKIENCHUYENDICH;
			finderArgs = new Object[] {
					dieuKienChuyenDich,
					
					start, end, orderByComparator
				};
		}

		List<MotCuaChuyenDichTrangThai> list = (List<MotCuaChuyenDichTrangThai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : list) {
				if (!Validator.equals(dieuKienChuyenDich,
							motCuaChuyenDichTrangThai.getDieuKienChuyenDich())) {
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

			query.append(_SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

			boolean bindDieuKienChuyenDich = false;

			if (dieuKienChuyenDich == null) {
				query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_1);
			}
			else if (dieuKienChuyenDich.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_3);
			}
			else {
				bindDieuKienChuyenDich = true;

				query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaChuyenDichTrangThaiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDieuKienChuyenDich) {
					qPos.add(dieuKienChuyenDich);
				}

				if (!pagination) {
					list = (List<MotCuaChuyenDichTrangThai>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaChuyenDichTrangThai>(list);
				}
				else {
					list = (List<MotCuaChuyenDichTrangThai>)QueryUtil.list(q,
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
	 * Returns the first mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua chuyen dich trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai findByDieuKienChuyenDich_First(
		String dieuKienChuyenDich, OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = fetchByDieuKienChuyenDich_First(dieuKienChuyenDich,
				orderByComparator);

		if (motCuaChuyenDichTrangThai != null) {
			return motCuaChuyenDichTrangThai;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dieuKienChuyenDich=");
		msg.append(dieuKienChuyenDich);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaChuyenDichTrangThaiException(msg.toString());
	}

	/**
	 * Returns the first mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByDieuKienChuyenDich_First(
		String dieuKienChuyenDich, OrderByComparator orderByComparator)
		throws SystemException {
		List<MotCuaChuyenDichTrangThai> list = findByDieuKienChuyenDich(dieuKienChuyenDich,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua chuyen dich trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai findByDieuKienChuyenDich_Last(
		String dieuKienChuyenDich, OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = fetchByDieuKienChuyenDich_Last(dieuKienChuyenDich,
				orderByComparator);

		if (motCuaChuyenDichTrangThai != null) {
			return motCuaChuyenDichTrangThai;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dieuKienChuyenDich=");
		msg.append(dieuKienChuyenDich);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaChuyenDichTrangThaiException(msg.toString());
	}

	/**
	 * Returns the last mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByDieuKienChuyenDich_Last(
		String dieuKienChuyenDich, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByDieuKienChuyenDich(dieuKienChuyenDich);

		if (count == 0) {
			return null;
		}

		List<MotCuaChuyenDichTrangThai> list = findByDieuKienChuyenDich(dieuKienChuyenDich,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua chuyen dich trang thais before and after the current mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63;.
	 *
	 * @param id the primary key of the current mot cua chuyen dich trang thai
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua chuyen dich trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a mot cua chuyen dich trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai[] findByDieuKienChuyenDich_PrevAndNext(
		long id, String dieuKienChuyenDich, OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaChuyenDichTrangThai[] array = new MotCuaChuyenDichTrangThaiImpl[3];

			array[0] = getByDieuKienChuyenDich_PrevAndNext(session,
					motCuaChuyenDichTrangThai, dieuKienChuyenDich,
					orderByComparator, true);

			array[1] = motCuaChuyenDichTrangThai;

			array[2] = getByDieuKienChuyenDich_PrevAndNext(session,
					motCuaChuyenDichTrangThai, dieuKienChuyenDich,
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

	protected MotCuaChuyenDichTrangThai getByDieuKienChuyenDich_PrevAndNext(
		Session session, MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai,
		String dieuKienChuyenDich, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

		boolean bindDieuKienChuyenDich = false;

		if (dieuKienChuyenDich == null) {
			query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_1);
		}
		else if (dieuKienChuyenDich.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_3);
		}
		else {
			bindDieuKienChuyenDich = true;

			query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_2);
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
			query.append(MotCuaChuyenDichTrangThaiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDieuKienChuyenDich) {
			qPos.add(dieuKienChuyenDich);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaChuyenDichTrangThai);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaChuyenDichTrangThai> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; from the database.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDieuKienChuyenDich(String dieuKienChuyenDich)
		throws SystemException {
		for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : findByDieuKienChuyenDich(
				dieuKienChuyenDich, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(motCuaChuyenDichTrangThai);
		}
	}

	/**
	 * Returns the number of mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @return the number of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDieuKienChuyenDich(String dieuKienChuyenDich)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DIEUKIENCHUYENDICH;

		Object[] finderArgs = new Object[] { dieuKienChuyenDich };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

			boolean bindDieuKienChuyenDich = false;

			if (dieuKienChuyenDich == null) {
				query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_1);
			}
			else if (dieuKienChuyenDich.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_3);
			}
			else {
				bindDieuKienChuyenDich = true;

				query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDieuKienChuyenDich) {
					qPos.add(dieuKienChuyenDich);
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

	private static final String _FINDER_COLUMN_DIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_1 =
		"motCuaChuyenDichTrangThai.dieuKienChuyenDich IS NULL";
	private static final String _FINDER_COLUMN_DIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_2 =
		"motCuaChuyenDichTrangThai.dieuKienChuyenDich = ?";
	private static final String _FINDER_COLUMN_DIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_3 =
		"(motCuaChuyenDichTrangThai.dieuKienChuyenDich IS NULL OR motCuaChuyenDichTrangThai.dieuKienChuyenDich = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID =
		new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID =
		new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Long.class.getName()
			},
			MotCuaChuyenDichTrangThaiModelImpl.DIEUKIENCHUYENDICH_COLUMN_BITMASK |
			MotCuaChuyenDichTrangThaiModelImpl.TRANGTHAINGUONID_COLUMN_BITMASK |
			MotCuaChuyenDichTrangThaiModelImpl.QUYTRINHTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID =
		new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Long.class.getName()
			});

	/**
	 * Returns all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63; and quyTrinhThuTucId = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @return the matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId(
		String dieuKienChuyenDich, long trangThaiNguonId, long quyTrinhThuTucId)
		throws SystemException {
		return findByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId(dieuKienChuyenDich,
			trangThaiNguonId, quyTrinhThuTucId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63; and quyTrinhThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param start the lower bound of the range of mot cua chuyen dich trang thais
	 * @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	 * @return the range of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId(
		String dieuKienChuyenDich, long trangThaiNguonId,
		long quyTrinhThuTucId, int start, int end) throws SystemException {
		return findByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId(dieuKienChuyenDich,
			trangThaiNguonId, quyTrinhThuTucId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63; and quyTrinhThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param start the lower bound of the range of mot cua chuyen dich trang thais
	 * @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId(
		String dieuKienChuyenDich, long trangThaiNguonId,
		long quyTrinhThuTucId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID;
			finderArgs = new Object[] {
					dieuKienChuyenDich, trangThaiNguonId, quyTrinhThuTucId
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID;
			finderArgs = new Object[] {
					dieuKienChuyenDich, trangThaiNguonId, quyTrinhThuTucId,
					
					start, end, orderByComparator
				};
		}

		List<MotCuaChuyenDichTrangThai> list = (List<MotCuaChuyenDichTrangThai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : list) {
				if (!Validator.equals(dieuKienChuyenDich,
							motCuaChuyenDichTrangThai.getDieuKienChuyenDich()) ||
						(trangThaiNguonId != motCuaChuyenDichTrangThai.getTrangThaiNguonId()) ||
						(quyTrinhThuTucId != motCuaChuyenDichTrangThai.getQuyTrinhThuTucId())) {
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

			query.append(_SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

			boolean bindDieuKienChuyenDich = false;

			if (dieuKienChuyenDich == null) {
				query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID_DIEUKIENCHUYENDICH_1);
			}
			else if (dieuKienChuyenDich.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID_DIEUKIENCHUYENDICH_3);
			}
			else {
				bindDieuKienChuyenDich = true;

				query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID_DIEUKIENCHUYENDICH_2);
			}

			query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID_TRANGTHAINGUONID_2);

			query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID_QUYTRINHTHUTUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaChuyenDichTrangThaiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDieuKienChuyenDich) {
					qPos.add(dieuKienChuyenDich);
				}

				qPos.add(trangThaiNguonId);

				qPos.add(quyTrinhThuTucId);

				if (!pagination) {
					list = (List<MotCuaChuyenDichTrangThai>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaChuyenDichTrangThai>(list);
				}
				else {
					list = (List<MotCuaChuyenDichTrangThai>)QueryUtil.list(q,
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
	 * Returns the first mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63; and quyTrinhThuTucId = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua chuyen dich trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai findByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId_First(
		String dieuKienChuyenDich, long trangThaiNguonId,
		long quyTrinhThuTucId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = fetchByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId_First(dieuKienChuyenDich,
				trangThaiNguonId, quyTrinhThuTucId, orderByComparator);

		if (motCuaChuyenDichTrangThai != null) {
			return motCuaChuyenDichTrangThai;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dieuKienChuyenDich=");
		msg.append(dieuKienChuyenDich);

		msg.append(", trangThaiNguonId=");
		msg.append(trangThaiNguonId);

		msg.append(", quyTrinhThuTucId=");
		msg.append(quyTrinhThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaChuyenDichTrangThaiException(msg.toString());
	}

	/**
	 * Returns the first mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63; and quyTrinhThuTucId = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId_First(
		String dieuKienChuyenDich, long trangThaiNguonId,
		long quyTrinhThuTucId, OrderByComparator orderByComparator)
		throws SystemException {
		List<MotCuaChuyenDichTrangThai> list = findByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId(dieuKienChuyenDich,
				trangThaiNguonId, quyTrinhThuTucId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63; and quyTrinhThuTucId = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua chuyen dich trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai findByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId_Last(
		String dieuKienChuyenDich, long trangThaiNguonId,
		long quyTrinhThuTucId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = fetchByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId_Last(dieuKienChuyenDich,
				trangThaiNguonId, quyTrinhThuTucId, orderByComparator);

		if (motCuaChuyenDichTrangThai != null) {
			return motCuaChuyenDichTrangThai;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dieuKienChuyenDich=");
		msg.append(dieuKienChuyenDich);

		msg.append(", trangThaiNguonId=");
		msg.append(trangThaiNguonId);

		msg.append(", quyTrinhThuTucId=");
		msg.append(quyTrinhThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaChuyenDichTrangThaiException(msg.toString());
	}

	/**
	 * Returns the last mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63; and quyTrinhThuTucId = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId_Last(
		String dieuKienChuyenDich, long trangThaiNguonId,
		long quyTrinhThuTucId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId(dieuKienChuyenDich,
				trangThaiNguonId, quyTrinhThuTucId);

		if (count == 0) {
			return null;
		}

		List<MotCuaChuyenDichTrangThai> list = findByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId(dieuKienChuyenDich,
				trangThaiNguonId, quyTrinhThuTucId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua chuyen dich trang thais before and after the current mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63; and quyTrinhThuTucId = &#63;.
	 *
	 * @param id the primary key of the current mot cua chuyen dich trang thai
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua chuyen dich trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a mot cua chuyen dich trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai[] findByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId_PrevAndNext(
		long id, String dieuKienChuyenDich, long trangThaiNguonId,
		long quyTrinhThuTucId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaChuyenDichTrangThai[] array = new MotCuaChuyenDichTrangThaiImpl[3];

			array[0] = getByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId_PrevAndNext(session,
					motCuaChuyenDichTrangThai, dieuKienChuyenDich,
					trangThaiNguonId, quyTrinhThuTucId, orderByComparator, true);

			array[1] = motCuaChuyenDichTrangThai;

			array[2] = getByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId_PrevAndNext(session,
					motCuaChuyenDichTrangThai, dieuKienChuyenDich,
					trangThaiNguonId, quyTrinhThuTucId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MotCuaChuyenDichTrangThai getByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId_PrevAndNext(
		Session session, MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai,
		String dieuKienChuyenDich, long trangThaiNguonId,
		long quyTrinhThuTucId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

		boolean bindDieuKienChuyenDich = false;

		if (dieuKienChuyenDich == null) {
			query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID_DIEUKIENCHUYENDICH_1);
		}
		else if (dieuKienChuyenDich.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID_DIEUKIENCHUYENDICH_3);
		}
		else {
			bindDieuKienChuyenDich = true;

			query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID_DIEUKIENCHUYENDICH_2);
		}

		query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID_TRANGTHAINGUONID_2);

		query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID_QUYTRINHTHUTUCID_2);

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
			query.append(MotCuaChuyenDichTrangThaiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDieuKienChuyenDich) {
			qPos.add(dieuKienChuyenDich);
		}

		qPos.add(trangThaiNguonId);

		qPos.add(quyTrinhThuTucId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaChuyenDichTrangThai);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaChuyenDichTrangThai> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63; and quyTrinhThuTucId = &#63; from the database.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId(
		String dieuKienChuyenDich, long trangThaiNguonId, long quyTrinhThuTucId)
		throws SystemException {
		for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : findByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId(
				dieuKienChuyenDich, trangThaiNguonId, quyTrinhThuTucId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(motCuaChuyenDichTrangThai);
		}
	}

	/**
	 * Returns the number of mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63; and quyTrinhThuTucId = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @return the number of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId(
		String dieuKienChuyenDich, long trangThaiNguonId, long quyTrinhThuTucId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID;

		Object[] finderArgs = new Object[] {
				dieuKienChuyenDich, trangThaiNguonId, quyTrinhThuTucId
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

			boolean bindDieuKienChuyenDich = false;

			if (dieuKienChuyenDich == null) {
				query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID_DIEUKIENCHUYENDICH_1);
			}
			else if (dieuKienChuyenDich.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID_DIEUKIENCHUYENDICH_3);
			}
			else {
				bindDieuKienChuyenDich = true;

				query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID_DIEUKIENCHUYENDICH_2);
			}

			query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID_TRANGTHAINGUONID_2);

			query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID_QUYTRINHTHUTUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDieuKienChuyenDich) {
					qPos.add(dieuKienChuyenDich);
				}

				qPos.add(trangThaiNguonId);

				qPos.add(quyTrinhThuTucId);

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

	private static final String _FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID_DIEUKIENCHUYENDICH_1 =
		"motCuaChuyenDichTrangThai.dieuKienChuyenDich IS NULL AND ";
	private static final String _FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID_DIEUKIENCHUYENDICH_2 =
		"motCuaChuyenDichTrangThai.dieuKienChuyenDich = ? AND ";
	private static final String _FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID_DIEUKIENCHUYENDICH_3 =
		"(motCuaChuyenDichTrangThai.dieuKienChuyenDich IS NULL OR motCuaChuyenDichTrangThai.dieuKienChuyenDich = '') AND ";
	private static final String _FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID_TRANGTHAINGUONID_2 =
		"motCuaChuyenDichTrangThai.trangThaiNguonId = ? AND ";
	private static final String _FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID_QUYTRINHTHUTUCID_2 =
		"motCuaChuyenDichTrangThai.quyTrinhThuTucId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID =
		new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByF_DieuKienChuyenDich_TrangThaiNguonId_QuyTrinhThuTucId",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Long.class.getName()
			},
			MotCuaChuyenDichTrangThaiModelImpl.DIEUKIENCHUYENDICH_COLUMN_BITMASK |
			MotCuaChuyenDichTrangThaiModelImpl.TRANGTHAINGUONID_COLUMN_BITMASK |
			MotCuaChuyenDichTrangThaiModelImpl.QUYTRINHTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID =
		new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_DieuKienChuyenDich_TrangThaiNguonId_QuyTrinhThuTucId",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Long.class.getName()
			});

	/**
	 * Returns the mot cua chuyen dich trang thai where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63; and quyTrinhThuTucId = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException} if it could not be found.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @return the matching mot cua chuyen dich trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai findByF_DieuKienChuyenDich_TrangThaiNguonId_QuyTrinhThuTucId(
		String dieuKienChuyenDich, long trangThaiNguonId, long quyTrinhThuTucId)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = fetchByF_DieuKienChuyenDich_TrangThaiNguonId_QuyTrinhThuTucId(dieuKienChuyenDich,
				trangThaiNguonId, quyTrinhThuTucId);

		if (motCuaChuyenDichTrangThai == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("dieuKienChuyenDich=");
			msg.append(dieuKienChuyenDich);

			msg.append(", trangThaiNguonId=");
			msg.append(trangThaiNguonId);

			msg.append(", quyTrinhThuTucId=");
			msg.append(quyTrinhThuTucId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchMotCuaChuyenDichTrangThaiException(msg.toString());
		}

		return motCuaChuyenDichTrangThai;
	}

	/**
	 * Returns the mot cua chuyen dich trang thai where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63; and quyTrinhThuTucId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @return the matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByF_DieuKienChuyenDich_TrangThaiNguonId_QuyTrinhThuTucId(
		String dieuKienChuyenDich, long trangThaiNguonId, long quyTrinhThuTucId)
		throws SystemException {
		return fetchByF_DieuKienChuyenDich_TrangThaiNguonId_QuyTrinhThuTucId(dieuKienChuyenDich,
			trangThaiNguonId, quyTrinhThuTucId, true);
	}

	/**
	 * Returns the mot cua chuyen dich trang thai where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63; and quyTrinhThuTucId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByF_DieuKienChuyenDich_TrangThaiNguonId_QuyTrinhThuTucId(
		String dieuKienChuyenDich, long trangThaiNguonId,
		long quyTrinhThuTucId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				dieuKienChuyenDich, trangThaiNguonId, quyTrinhThuTucId
			};

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID,
					finderArgs, this);
		}

		if (result instanceof MotCuaChuyenDichTrangThai) {
			MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = (MotCuaChuyenDichTrangThai)result;

			if (!Validator.equals(dieuKienChuyenDich,
						motCuaChuyenDichTrangThai.getDieuKienChuyenDich()) ||
					(trangThaiNguonId != motCuaChuyenDichTrangThai.getTrangThaiNguonId()) ||
					(quyTrinhThuTucId != motCuaChuyenDichTrangThai.getQuyTrinhThuTucId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

			boolean bindDieuKienChuyenDich = false;

			if (dieuKienChuyenDich == null) {
				query.append(_FINDER_COLUMN_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID_DIEUKIENCHUYENDICH_1);
			}
			else if (dieuKienChuyenDich.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID_DIEUKIENCHUYENDICH_3);
			}
			else {
				bindDieuKienChuyenDich = true;

				query.append(_FINDER_COLUMN_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID_DIEUKIENCHUYENDICH_2);
			}

			query.append(_FINDER_COLUMN_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID_TRANGTHAINGUONID_2);

			query.append(_FINDER_COLUMN_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID_QUYTRINHTHUTUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDieuKienChuyenDich) {
					qPos.add(dieuKienChuyenDich);
				}

				qPos.add(trangThaiNguonId);

				qPos.add(quyTrinhThuTucId);

				List<MotCuaChuyenDichTrangThai> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"MotCuaChuyenDichTrangThaiPersistenceImpl.fetchByF_DieuKienChuyenDich_TrangThaiNguonId_QuyTrinhThuTucId(String, long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = list.get(0);

					result = motCuaChuyenDichTrangThai;

					cacheResult(motCuaChuyenDichTrangThai);

					if ((motCuaChuyenDichTrangThai.getDieuKienChuyenDich() == null) ||
							!motCuaChuyenDichTrangThai.getDieuKienChuyenDich()
														  .equals(dieuKienChuyenDich) ||
							(motCuaChuyenDichTrangThai.getTrangThaiNguonId() != trangThaiNguonId) ||
							(motCuaChuyenDichTrangThai.getQuyTrinhThuTucId() != quyTrinhThuTucId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID,
							finderArgs, motCuaChuyenDichTrangThai);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (MotCuaChuyenDichTrangThai)result;
		}
	}

	/**
	 * Removes the mot cua chuyen dich trang thai where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63; and quyTrinhThuTucId = &#63; from the database.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @return the mot cua chuyen dich trang thai that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai removeByF_DieuKienChuyenDich_TrangThaiNguonId_QuyTrinhThuTucId(
		String dieuKienChuyenDich, long trangThaiNguonId, long quyTrinhThuTucId)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = findByF_DieuKienChuyenDich_TrangThaiNguonId_QuyTrinhThuTucId(dieuKienChuyenDich,
				trangThaiNguonId, quyTrinhThuTucId);

		return remove(motCuaChuyenDichTrangThai);
	}

	/**
	 * Returns the number of mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63; and quyTrinhThuTucId = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @return the number of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByF_DieuKienChuyenDich_TrangThaiNguonId_QuyTrinhThuTucId(
		String dieuKienChuyenDich, long trangThaiNguonId, long quyTrinhThuTucId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID;

		Object[] finderArgs = new Object[] {
				dieuKienChuyenDich, trangThaiNguonId, quyTrinhThuTucId
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

			boolean bindDieuKienChuyenDich = false;

			if (dieuKienChuyenDich == null) {
				query.append(_FINDER_COLUMN_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID_DIEUKIENCHUYENDICH_1);
			}
			else if (dieuKienChuyenDich.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID_DIEUKIENCHUYENDICH_3);
			}
			else {
				bindDieuKienChuyenDich = true;

				query.append(_FINDER_COLUMN_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID_DIEUKIENCHUYENDICH_2);
			}

			query.append(_FINDER_COLUMN_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID_TRANGTHAINGUONID_2);

			query.append(_FINDER_COLUMN_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID_QUYTRINHTHUTUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDieuKienChuyenDich) {
					qPos.add(dieuKienChuyenDich);
				}

				qPos.add(trangThaiNguonId);

				qPos.add(quyTrinhThuTucId);

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

	private static final String _FINDER_COLUMN_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID_DIEUKIENCHUYENDICH_1 =
		"motCuaChuyenDichTrangThai.dieuKienChuyenDich IS NULL AND ";
	private static final String _FINDER_COLUMN_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID_DIEUKIENCHUYENDICH_2 =
		"motCuaChuyenDichTrangThai.dieuKienChuyenDich = ? AND ";
	private static final String _FINDER_COLUMN_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID_DIEUKIENCHUYENDICH_3 =
		"(motCuaChuyenDichTrangThai.dieuKienChuyenDich IS NULL OR motCuaChuyenDichTrangThai.dieuKienChuyenDich = '') AND ";
	private static final String _FINDER_COLUMN_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID_TRANGTHAINGUONID_2 =
		"motCuaChuyenDichTrangThai.trangThaiNguonId = ? AND ";
	private static final String _FINDER_COLUMN_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID_QUYTRINHTHUTUCID_2 =
		"motCuaChuyenDichTrangThai.quyTrinhThuTucId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TRANGTHAIDICHID =
		new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTrangThaiDichId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAIDICHID =
		new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTrangThaiDichId",
			new String[] { Long.class.getName() },
			MotCuaChuyenDichTrangThaiModelImpl.TRANGTHAIDICHID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TRANGTHAIDICHID = new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByTrangThaiDichId", new String[] { Long.class.getName() });

	/**
	 * Returns all the mot cua chuyen dich trang thais where trangThaiDichId = &#63;.
	 *
	 * @param trangThaiDichId the trang thai dich ID
	 * @return the matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByTrangThaiDichId(
		long trangThaiDichId) throws SystemException {
		return findByTrangThaiDichId(trangThaiDichId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua chuyen dich trang thais where trangThaiDichId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param trangThaiDichId the trang thai dich ID
	 * @param start the lower bound of the range of mot cua chuyen dich trang thais
	 * @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	 * @return the range of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByTrangThaiDichId(
		long trangThaiDichId, int start, int end) throws SystemException {
		return findByTrangThaiDichId(trangThaiDichId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua chuyen dich trang thais where trangThaiDichId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param trangThaiDichId the trang thai dich ID
	 * @param start the lower bound of the range of mot cua chuyen dich trang thais
	 * @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByTrangThaiDichId(
		long trangThaiDichId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAIDICHID;
			finderArgs = new Object[] { trangThaiDichId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TRANGTHAIDICHID;
			finderArgs = new Object[] {
					trangThaiDichId,
					
					start, end, orderByComparator
				};
		}

		List<MotCuaChuyenDichTrangThai> list = (List<MotCuaChuyenDichTrangThai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : list) {
				if ((trangThaiDichId != motCuaChuyenDichTrangThai.getTrangThaiDichId())) {
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

			query.append(_SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

			query.append(_FINDER_COLUMN_TRANGTHAIDICHID_TRANGTHAIDICHID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaChuyenDichTrangThaiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(trangThaiDichId);

				if (!pagination) {
					list = (List<MotCuaChuyenDichTrangThai>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaChuyenDichTrangThai>(list);
				}
				else {
					list = (List<MotCuaChuyenDichTrangThai>)QueryUtil.list(q,
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
	 * Returns the first mot cua chuyen dich trang thai in the ordered set where trangThaiDichId = &#63;.
	 *
	 * @param trangThaiDichId the trang thai dich ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua chuyen dich trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai findByTrangThaiDichId_First(
		long trangThaiDichId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = fetchByTrangThaiDichId_First(trangThaiDichId,
				orderByComparator);

		if (motCuaChuyenDichTrangThai != null) {
			return motCuaChuyenDichTrangThai;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("trangThaiDichId=");
		msg.append(trangThaiDichId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaChuyenDichTrangThaiException(msg.toString());
	}

	/**
	 * Returns the first mot cua chuyen dich trang thai in the ordered set where trangThaiDichId = &#63;.
	 *
	 * @param trangThaiDichId the trang thai dich ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByTrangThaiDichId_First(
		long trangThaiDichId, OrderByComparator orderByComparator)
		throws SystemException {
		List<MotCuaChuyenDichTrangThai> list = findByTrangThaiDichId(trangThaiDichId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua chuyen dich trang thai in the ordered set where trangThaiDichId = &#63;.
	 *
	 * @param trangThaiDichId the trang thai dich ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua chuyen dich trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai findByTrangThaiDichId_Last(
		long trangThaiDichId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = fetchByTrangThaiDichId_Last(trangThaiDichId,
				orderByComparator);

		if (motCuaChuyenDichTrangThai != null) {
			return motCuaChuyenDichTrangThai;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("trangThaiDichId=");
		msg.append(trangThaiDichId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaChuyenDichTrangThaiException(msg.toString());
	}

	/**
	 * Returns the last mot cua chuyen dich trang thai in the ordered set where trangThaiDichId = &#63;.
	 *
	 * @param trangThaiDichId the trang thai dich ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByTrangThaiDichId_Last(
		long trangThaiDichId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByTrangThaiDichId(trangThaiDichId);

		if (count == 0) {
			return null;
		}

		List<MotCuaChuyenDichTrangThai> list = findByTrangThaiDichId(trangThaiDichId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua chuyen dich trang thais before and after the current mot cua chuyen dich trang thai in the ordered set where trangThaiDichId = &#63;.
	 *
	 * @param id the primary key of the current mot cua chuyen dich trang thai
	 * @param trangThaiDichId the trang thai dich ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua chuyen dich trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a mot cua chuyen dich trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai[] findByTrangThaiDichId_PrevAndNext(
		long id, long trangThaiDichId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaChuyenDichTrangThai[] array = new MotCuaChuyenDichTrangThaiImpl[3];

			array[0] = getByTrangThaiDichId_PrevAndNext(session,
					motCuaChuyenDichTrangThai, trangThaiDichId,
					orderByComparator, true);

			array[1] = motCuaChuyenDichTrangThai;

			array[2] = getByTrangThaiDichId_PrevAndNext(session,
					motCuaChuyenDichTrangThai, trangThaiDichId,
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

	protected MotCuaChuyenDichTrangThai getByTrangThaiDichId_PrevAndNext(
		Session session, MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai,
		long trangThaiDichId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

		query.append(_FINDER_COLUMN_TRANGTHAIDICHID_TRANGTHAIDICHID_2);

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
			query.append(MotCuaChuyenDichTrangThaiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(trangThaiDichId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaChuyenDichTrangThai);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaChuyenDichTrangThai> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua chuyen dich trang thais where trangThaiDichId = &#63; from the database.
	 *
	 * @param trangThaiDichId the trang thai dich ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTrangThaiDichId(long trangThaiDichId)
		throws SystemException {
		for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : findByTrangThaiDichId(
				trangThaiDichId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(motCuaChuyenDichTrangThai);
		}
	}

	/**
	 * Returns the number of mot cua chuyen dich trang thais where trangThaiDichId = &#63;.
	 *
	 * @param trangThaiDichId the trang thai dich ID
	 * @return the number of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTrangThaiDichId(long trangThaiDichId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TRANGTHAIDICHID;

		Object[] finderArgs = new Object[] { trangThaiDichId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

			query.append(_FINDER_COLUMN_TRANGTHAIDICHID_TRANGTHAIDICHID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(trangThaiDichId);

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

	private static final String _FINDER_COLUMN_TRANGTHAIDICHID_TRANGTHAIDICHID_2 =
		"motCuaChuyenDichTrangThai.trangThaiDichId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TRANGTHAINGUONID =
		new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTrangThaiNguonId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAINGUONID =
		new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByTrangThaiNguonId", new String[] { Long.class.getName() },
			MotCuaChuyenDichTrangThaiModelImpl.TRANGTHAINGUONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TRANGTHAINGUONID = new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByTrangThaiNguonId", new String[] { Long.class.getName() });

	/**
	 * Returns all the mot cua chuyen dich trang thais where trangThaiNguonId = &#63;.
	 *
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @return the matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByTrangThaiNguonId(
		long trangThaiNguonId) throws SystemException {
		return findByTrangThaiNguonId(trangThaiNguonId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua chuyen dich trang thais where trangThaiNguonId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param start the lower bound of the range of mot cua chuyen dich trang thais
	 * @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	 * @return the range of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByTrangThaiNguonId(
		long trangThaiNguonId, int start, int end) throws SystemException {
		return findByTrangThaiNguonId(trangThaiNguonId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua chuyen dich trang thais where trangThaiNguonId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param start the lower bound of the range of mot cua chuyen dich trang thais
	 * @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByTrangThaiNguonId(
		long trangThaiNguonId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAINGUONID;
			finderArgs = new Object[] { trangThaiNguonId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TRANGTHAINGUONID;
			finderArgs = new Object[] {
					trangThaiNguonId,
					
					start, end, orderByComparator
				};
		}

		List<MotCuaChuyenDichTrangThai> list = (List<MotCuaChuyenDichTrangThai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : list) {
				if ((trangThaiNguonId != motCuaChuyenDichTrangThai.getTrangThaiNguonId())) {
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

			query.append(_SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

			query.append(_FINDER_COLUMN_TRANGTHAINGUONID_TRANGTHAINGUONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaChuyenDichTrangThaiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(trangThaiNguonId);

				if (!pagination) {
					list = (List<MotCuaChuyenDichTrangThai>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaChuyenDichTrangThai>(list);
				}
				else {
					list = (List<MotCuaChuyenDichTrangThai>)QueryUtil.list(q,
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
	 * Returns the first mot cua chuyen dich trang thai in the ordered set where trangThaiNguonId = &#63;.
	 *
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua chuyen dich trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai findByTrangThaiNguonId_First(
		long trangThaiNguonId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = fetchByTrangThaiNguonId_First(trangThaiNguonId,
				orderByComparator);

		if (motCuaChuyenDichTrangThai != null) {
			return motCuaChuyenDichTrangThai;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("trangThaiNguonId=");
		msg.append(trangThaiNguonId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaChuyenDichTrangThaiException(msg.toString());
	}

	/**
	 * Returns the first mot cua chuyen dich trang thai in the ordered set where trangThaiNguonId = &#63;.
	 *
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByTrangThaiNguonId_First(
		long trangThaiNguonId, OrderByComparator orderByComparator)
		throws SystemException {
		List<MotCuaChuyenDichTrangThai> list = findByTrangThaiNguonId(trangThaiNguonId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua chuyen dich trang thai in the ordered set where trangThaiNguonId = &#63;.
	 *
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua chuyen dich trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai findByTrangThaiNguonId_Last(
		long trangThaiNguonId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = fetchByTrangThaiNguonId_Last(trangThaiNguonId,
				orderByComparator);

		if (motCuaChuyenDichTrangThai != null) {
			return motCuaChuyenDichTrangThai;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("trangThaiNguonId=");
		msg.append(trangThaiNguonId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaChuyenDichTrangThaiException(msg.toString());
	}

	/**
	 * Returns the last mot cua chuyen dich trang thai in the ordered set where trangThaiNguonId = &#63;.
	 *
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByTrangThaiNguonId_Last(
		long trangThaiNguonId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByTrangThaiNguonId(trangThaiNguonId);

		if (count == 0) {
			return null;
		}

		List<MotCuaChuyenDichTrangThai> list = findByTrangThaiNguonId(trangThaiNguonId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua chuyen dich trang thais before and after the current mot cua chuyen dich trang thai in the ordered set where trangThaiNguonId = &#63;.
	 *
	 * @param id the primary key of the current mot cua chuyen dich trang thai
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua chuyen dich trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a mot cua chuyen dich trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai[] findByTrangThaiNguonId_PrevAndNext(
		long id, long trangThaiNguonId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaChuyenDichTrangThai[] array = new MotCuaChuyenDichTrangThaiImpl[3];

			array[0] = getByTrangThaiNguonId_PrevAndNext(session,
					motCuaChuyenDichTrangThai, trangThaiNguonId,
					orderByComparator, true);

			array[1] = motCuaChuyenDichTrangThai;

			array[2] = getByTrangThaiNguonId_PrevAndNext(session,
					motCuaChuyenDichTrangThai, trangThaiNguonId,
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

	protected MotCuaChuyenDichTrangThai getByTrangThaiNguonId_PrevAndNext(
		Session session, MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai,
		long trangThaiNguonId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

		query.append(_FINDER_COLUMN_TRANGTHAINGUONID_TRANGTHAINGUONID_2);

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
			query.append(MotCuaChuyenDichTrangThaiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(trangThaiNguonId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaChuyenDichTrangThai);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaChuyenDichTrangThai> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua chuyen dich trang thais where trangThaiNguonId = &#63; from the database.
	 *
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTrangThaiNguonId(long trangThaiNguonId)
		throws SystemException {
		for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : findByTrangThaiNguonId(
				trangThaiNguonId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(motCuaChuyenDichTrangThai);
		}
	}

	/**
	 * Returns the number of mot cua chuyen dich trang thais where trangThaiNguonId = &#63;.
	 *
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @return the number of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTrangThaiNguonId(long trangThaiNguonId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TRANGTHAINGUONID;

		Object[] finderArgs = new Object[] { trangThaiNguonId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

			query.append(_FINDER_COLUMN_TRANGTHAINGUONID_TRANGTHAINGUONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(trangThaiNguonId);

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

	private static final String _FINDER_COLUMN_TRANGTHAINGUONID_TRANGTHAINGUONID_2 =
		"motCuaChuyenDichTrangThai.trangThaiNguonId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH =
		new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByQuyTrinhThuTucIdAndDieuKienChuyenDich",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH =
		new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByQuyTrinhThuTucIdAndDieuKienChuyenDich",
			new String[] { String.class.getName(), Long.class.getName() },
			MotCuaChuyenDichTrangThaiModelImpl.DIEUKIENCHUYENDICH_COLUMN_BITMASK |
			MotCuaChuyenDichTrangThaiModelImpl.QUYTRINHTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH =
		new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByQuyTrinhThuTucIdAndDieuKienChuyenDich",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; and quyTrinhThuTucId = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @return the matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByQuyTrinhThuTucIdAndDieuKienChuyenDich(
		String dieuKienChuyenDich, long quyTrinhThuTucId)
		throws SystemException {
		return findByQuyTrinhThuTucIdAndDieuKienChuyenDich(dieuKienChuyenDich,
			quyTrinhThuTucId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; and quyTrinhThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param start the lower bound of the range of mot cua chuyen dich trang thais
	 * @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	 * @return the range of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByQuyTrinhThuTucIdAndDieuKienChuyenDich(
		String dieuKienChuyenDich, long quyTrinhThuTucId, int start, int end)
		throws SystemException {
		return findByQuyTrinhThuTucIdAndDieuKienChuyenDich(dieuKienChuyenDich,
			quyTrinhThuTucId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; and quyTrinhThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param start the lower bound of the range of mot cua chuyen dich trang thais
	 * @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByQuyTrinhThuTucIdAndDieuKienChuyenDich(
		String dieuKienChuyenDich, long quyTrinhThuTucId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH;
			finderArgs = new Object[] { dieuKienChuyenDich, quyTrinhThuTucId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH;
			finderArgs = new Object[] {
					dieuKienChuyenDich, quyTrinhThuTucId,
					
					start, end, orderByComparator
				};
		}

		List<MotCuaChuyenDichTrangThai> list = (List<MotCuaChuyenDichTrangThai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : list) {
				if (!Validator.equals(dieuKienChuyenDich,
							motCuaChuyenDichTrangThai.getDieuKienChuyenDich()) ||
						(quyTrinhThuTucId != motCuaChuyenDichTrangThai.getQuyTrinhThuTucId())) {
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

			query.append(_SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

			boolean bindDieuKienChuyenDich = false;

			if (dieuKienChuyenDich == null) {
				query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_1);
			}
			else if (dieuKienChuyenDich.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_3);
			}
			else {
				bindDieuKienChuyenDich = true;

				query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_2);
			}

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH_QUYTRINHTHUTUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaChuyenDichTrangThaiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDieuKienChuyenDich) {
					qPos.add(dieuKienChuyenDich);
				}

				qPos.add(quyTrinhThuTucId);

				if (!pagination) {
					list = (List<MotCuaChuyenDichTrangThai>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaChuyenDichTrangThai>(list);
				}
				else {
					list = (List<MotCuaChuyenDichTrangThai>)QueryUtil.list(q,
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
	 * Returns the first mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63; and quyTrinhThuTucId = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua chuyen dich trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai findByQuyTrinhThuTucIdAndDieuKienChuyenDich_First(
		String dieuKienChuyenDich, long quyTrinhThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = fetchByQuyTrinhThuTucIdAndDieuKienChuyenDich_First(dieuKienChuyenDich,
				quyTrinhThuTucId, orderByComparator);

		if (motCuaChuyenDichTrangThai != null) {
			return motCuaChuyenDichTrangThai;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dieuKienChuyenDich=");
		msg.append(dieuKienChuyenDich);

		msg.append(", quyTrinhThuTucId=");
		msg.append(quyTrinhThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaChuyenDichTrangThaiException(msg.toString());
	}

	/**
	 * Returns the first mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63; and quyTrinhThuTucId = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByQuyTrinhThuTucIdAndDieuKienChuyenDich_First(
		String dieuKienChuyenDich, long quyTrinhThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		List<MotCuaChuyenDichTrangThai> list = findByQuyTrinhThuTucIdAndDieuKienChuyenDich(dieuKienChuyenDich,
				quyTrinhThuTucId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63; and quyTrinhThuTucId = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua chuyen dich trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai findByQuyTrinhThuTucIdAndDieuKienChuyenDich_Last(
		String dieuKienChuyenDich, long quyTrinhThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = fetchByQuyTrinhThuTucIdAndDieuKienChuyenDich_Last(dieuKienChuyenDich,
				quyTrinhThuTucId, orderByComparator);

		if (motCuaChuyenDichTrangThai != null) {
			return motCuaChuyenDichTrangThai;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dieuKienChuyenDich=");
		msg.append(dieuKienChuyenDich);

		msg.append(", quyTrinhThuTucId=");
		msg.append(quyTrinhThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaChuyenDichTrangThaiException(msg.toString());
	}

	/**
	 * Returns the last mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63; and quyTrinhThuTucId = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByQuyTrinhThuTucIdAndDieuKienChuyenDich_Last(
		String dieuKienChuyenDich, long quyTrinhThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByQuyTrinhThuTucIdAndDieuKienChuyenDich(dieuKienChuyenDich,
				quyTrinhThuTucId);

		if (count == 0) {
			return null;
		}

		List<MotCuaChuyenDichTrangThai> list = findByQuyTrinhThuTucIdAndDieuKienChuyenDich(dieuKienChuyenDich,
				quyTrinhThuTucId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua chuyen dich trang thais before and after the current mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63; and quyTrinhThuTucId = &#63;.
	 *
	 * @param id the primary key of the current mot cua chuyen dich trang thai
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua chuyen dich trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a mot cua chuyen dich trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai[] findByQuyTrinhThuTucIdAndDieuKienChuyenDich_PrevAndNext(
		long id, String dieuKienChuyenDich, long quyTrinhThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaChuyenDichTrangThai[] array = new MotCuaChuyenDichTrangThaiImpl[3];

			array[0] = getByQuyTrinhThuTucIdAndDieuKienChuyenDich_PrevAndNext(session,
					motCuaChuyenDichTrangThai, dieuKienChuyenDich,
					quyTrinhThuTucId, orderByComparator, true);

			array[1] = motCuaChuyenDichTrangThai;

			array[2] = getByQuyTrinhThuTucIdAndDieuKienChuyenDich_PrevAndNext(session,
					motCuaChuyenDichTrangThai, dieuKienChuyenDich,
					quyTrinhThuTucId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MotCuaChuyenDichTrangThai getByQuyTrinhThuTucIdAndDieuKienChuyenDich_PrevAndNext(
		Session session, MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai,
		String dieuKienChuyenDich, long quyTrinhThuTucId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

		boolean bindDieuKienChuyenDich = false;

		if (dieuKienChuyenDich == null) {
			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_1);
		}
		else if (dieuKienChuyenDich.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_3);
		}
		else {
			bindDieuKienChuyenDich = true;

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_2);
		}

		query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH_QUYTRINHTHUTUCID_2);

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
			query.append(MotCuaChuyenDichTrangThaiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDieuKienChuyenDich) {
			qPos.add(dieuKienChuyenDich);
		}

		qPos.add(quyTrinhThuTucId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaChuyenDichTrangThai);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaChuyenDichTrangThai> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; and quyTrinhThuTucId = &#63; from the database.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByQuyTrinhThuTucIdAndDieuKienChuyenDich(
		String dieuKienChuyenDich, long quyTrinhThuTucId)
		throws SystemException {
		for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : findByQuyTrinhThuTucIdAndDieuKienChuyenDich(
				dieuKienChuyenDich, quyTrinhThuTucId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(motCuaChuyenDichTrangThai);
		}
	}

	/**
	 * Returns the number of mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; and quyTrinhThuTucId = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @return the number of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByQuyTrinhThuTucIdAndDieuKienChuyenDich(
		String dieuKienChuyenDich, long quyTrinhThuTucId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH;

		Object[] finderArgs = new Object[] { dieuKienChuyenDich, quyTrinhThuTucId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

			boolean bindDieuKienChuyenDich = false;

			if (dieuKienChuyenDich == null) {
				query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_1);
			}
			else if (dieuKienChuyenDich.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_3);
			}
			else {
				bindDieuKienChuyenDich = true;

				query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_2);
			}

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH_QUYTRINHTHUTUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDieuKienChuyenDich) {
					qPos.add(dieuKienChuyenDich);
				}

				qPos.add(quyTrinhThuTucId);

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

	private static final String _FINDER_COLUMN_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_1 =
		"motCuaChuyenDichTrangThai.dieuKienChuyenDich IS NULL AND ";
	private static final String _FINDER_COLUMN_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_2 =
		"motCuaChuyenDichTrangThai.dieuKienChuyenDich = ? AND ";
	private static final String _FINDER_COLUMN_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_3 =
		"(motCuaChuyenDichTrangThai.dieuKienChuyenDich IS NULL OR motCuaChuyenDichTrangThai.dieuKienChuyenDich = '') AND ";
	private static final String _FINDER_COLUMN_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH_QUYTRINHTHUTUCID_2 =
		"motCuaChuyenDichTrangThai.quyTrinhThuTucId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_KHOITAOPHIEUXULY =
		new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByKhoiTaoPhieuXuLy",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KHOITAOPHIEUXULY =
		new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByKhoiTaoPhieuXuLy",
			new String[] { Long.class.getName(), Long.class.getName() },
			MotCuaChuyenDichTrangThaiModelImpl.QUYTRINHTHUTUCID_COLUMN_BITMASK |
			MotCuaChuyenDichTrangThaiModelImpl.TRANGTHAINGUONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_KHOITAOPHIEUXULY = new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByKhoiTaoPhieuXuLy",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the mot cua chuyen dich trang thais where quyTrinhThuTucId = &#63; and trangThaiNguonId = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @return the matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByKhoiTaoPhieuXuLy(
		long quyTrinhThuTucId, long trangThaiNguonId) throws SystemException {
		return findByKhoiTaoPhieuXuLy(quyTrinhThuTucId, trangThaiNguonId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua chuyen dich trang thais where quyTrinhThuTucId = &#63; and trangThaiNguonId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param start the lower bound of the range of mot cua chuyen dich trang thais
	 * @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	 * @return the range of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByKhoiTaoPhieuXuLy(
		long quyTrinhThuTucId, long trangThaiNguonId, int start, int end)
		throws SystemException {
		return findByKhoiTaoPhieuXuLy(quyTrinhThuTucId, trangThaiNguonId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua chuyen dich trang thais where quyTrinhThuTucId = &#63; and trangThaiNguonId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param start the lower bound of the range of mot cua chuyen dich trang thais
	 * @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByKhoiTaoPhieuXuLy(
		long quyTrinhThuTucId, long trangThaiNguonId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KHOITAOPHIEUXULY;
			finderArgs = new Object[] { quyTrinhThuTucId, trangThaiNguonId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_KHOITAOPHIEUXULY;
			finderArgs = new Object[] {
					quyTrinhThuTucId, trangThaiNguonId,
					
					start, end, orderByComparator
				};
		}

		List<MotCuaChuyenDichTrangThai> list = (List<MotCuaChuyenDichTrangThai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : list) {
				if ((quyTrinhThuTucId != motCuaChuyenDichTrangThai.getQuyTrinhThuTucId()) ||
						(trangThaiNguonId != motCuaChuyenDichTrangThai.getTrangThaiNguonId())) {
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

			query.append(_SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

			query.append(_FINDER_COLUMN_KHOITAOPHIEUXULY_QUYTRINHTHUTUCID_2);

			query.append(_FINDER_COLUMN_KHOITAOPHIEUXULY_TRANGTHAINGUONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaChuyenDichTrangThaiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(quyTrinhThuTucId);

				qPos.add(trangThaiNguonId);

				if (!pagination) {
					list = (List<MotCuaChuyenDichTrangThai>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaChuyenDichTrangThai>(list);
				}
				else {
					list = (List<MotCuaChuyenDichTrangThai>)QueryUtil.list(q,
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
	 * Returns the first mot cua chuyen dich trang thai in the ordered set where quyTrinhThuTucId = &#63; and trangThaiNguonId = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua chuyen dich trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai findByKhoiTaoPhieuXuLy_First(
		long quyTrinhThuTucId, long trangThaiNguonId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = fetchByKhoiTaoPhieuXuLy_First(quyTrinhThuTucId,
				trangThaiNguonId, orderByComparator);

		if (motCuaChuyenDichTrangThai != null) {
			return motCuaChuyenDichTrangThai;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("quyTrinhThuTucId=");
		msg.append(quyTrinhThuTucId);

		msg.append(", trangThaiNguonId=");
		msg.append(trangThaiNguonId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaChuyenDichTrangThaiException(msg.toString());
	}

	/**
	 * Returns the first mot cua chuyen dich trang thai in the ordered set where quyTrinhThuTucId = &#63; and trangThaiNguonId = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByKhoiTaoPhieuXuLy_First(
		long quyTrinhThuTucId, long trangThaiNguonId,
		OrderByComparator orderByComparator) throws SystemException {
		List<MotCuaChuyenDichTrangThai> list = findByKhoiTaoPhieuXuLy(quyTrinhThuTucId,
				trangThaiNguonId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua chuyen dich trang thai in the ordered set where quyTrinhThuTucId = &#63; and trangThaiNguonId = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua chuyen dich trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai findByKhoiTaoPhieuXuLy_Last(
		long quyTrinhThuTucId, long trangThaiNguonId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = fetchByKhoiTaoPhieuXuLy_Last(quyTrinhThuTucId,
				trangThaiNguonId, orderByComparator);

		if (motCuaChuyenDichTrangThai != null) {
			return motCuaChuyenDichTrangThai;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("quyTrinhThuTucId=");
		msg.append(quyTrinhThuTucId);

		msg.append(", trangThaiNguonId=");
		msg.append(trangThaiNguonId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaChuyenDichTrangThaiException(msg.toString());
	}

	/**
	 * Returns the last mot cua chuyen dich trang thai in the ordered set where quyTrinhThuTucId = &#63; and trangThaiNguonId = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByKhoiTaoPhieuXuLy_Last(
		long quyTrinhThuTucId, long trangThaiNguonId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByKhoiTaoPhieuXuLy(quyTrinhThuTucId, trangThaiNguonId);

		if (count == 0) {
			return null;
		}

		List<MotCuaChuyenDichTrangThai> list = findByKhoiTaoPhieuXuLy(quyTrinhThuTucId,
				trangThaiNguonId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua chuyen dich trang thais before and after the current mot cua chuyen dich trang thai in the ordered set where quyTrinhThuTucId = &#63; and trangThaiNguonId = &#63;.
	 *
	 * @param id the primary key of the current mot cua chuyen dich trang thai
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua chuyen dich trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a mot cua chuyen dich trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai[] findByKhoiTaoPhieuXuLy_PrevAndNext(
		long id, long quyTrinhThuTucId, long trangThaiNguonId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaChuyenDichTrangThai[] array = new MotCuaChuyenDichTrangThaiImpl[3];

			array[0] = getByKhoiTaoPhieuXuLy_PrevAndNext(session,
					motCuaChuyenDichTrangThai, quyTrinhThuTucId,
					trangThaiNguonId, orderByComparator, true);

			array[1] = motCuaChuyenDichTrangThai;

			array[2] = getByKhoiTaoPhieuXuLy_PrevAndNext(session,
					motCuaChuyenDichTrangThai, quyTrinhThuTucId,
					trangThaiNguonId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MotCuaChuyenDichTrangThai getByKhoiTaoPhieuXuLy_PrevAndNext(
		Session session, MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai,
		long quyTrinhThuTucId, long trangThaiNguonId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

		query.append(_FINDER_COLUMN_KHOITAOPHIEUXULY_QUYTRINHTHUTUCID_2);

		query.append(_FINDER_COLUMN_KHOITAOPHIEUXULY_TRANGTHAINGUONID_2);

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
			query.append(MotCuaChuyenDichTrangThaiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(quyTrinhThuTucId);

		qPos.add(trangThaiNguonId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaChuyenDichTrangThai);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaChuyenDichTrangThai> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua chuyen dich trang thais where quyTrinhThuTucId = &#63; and trangThaiNguonId = &#63; from the database.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByKhoiTaoPhieuXuLy(long quyTrinhThuTucId,
		long trangThaiNguonId) throws SystemException {
		for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : findByKhoiTaoPhieuXuLy(
				quyTrinhThuTucId, trangThaiNguonId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(motCuaChuyenDichTrangThai);
		}
	}

	/**
	 * Returns the number of mot cua chuyen dich trang thais where quyTrinhThuTucId = &#63; and trangThaiNguonId = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @return the number of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByKhoiTaoPhieuXuLy(long quyTrinhThuTucId,
		long trangThaiNguonId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_KHOITAOPHIEUXULY;

		Object[] finderArgs = new Object[] { quyTrinhThuTucId, trangThaiNguonId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

			query.append(_FINDER_COLUMN_KHOITAOPHIEUXULY_QUYTRINHTHUTUCID_2);

			query.append(_FINDER_COLUMN_KHOITAOPHIEUXULY_TRANGTHAINGUONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(quyTrinhThuTucId);

				qPos.add(trangThaiNguonId);

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

	private static final String _FINDER_COLUMN_KHOITAOPHIEUXULY_QUYTRINHTHUTUCID_2 =
		"motCuaChuyenDichTrangThai.quyTrinhThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_KHOITAOPHIEUXULY_TRANGTHAINGUONID_2 =
		"motCuaChuyenDichTrangThai.trangThaiNguonId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_TRANGTHAINGUONNULL = new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByTrangThaiNguonNull",
			new String[] { Long.class.getName(), String.class.getName() },
			MotCuaChuyenDichTrangThaiModelImpl.QUYTRINHTHUTUCID_COLUMN_BITMASK |
			MotCuaChuyenDichTrangThaiModelImpl.DIEUKIENCHUYENDICH_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TRANGTHAINGUONNULL = new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByTrangThaiNguonNull",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the mot cua chuyen dich trang thai where quyTrinhThuTucId = &#63; and dieuKienChuyenDich = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException} if it could not be found.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @return the matching mot cua chuyen dich trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai findByTrangThaiNguonNull(
		long quyTrinhThuTucId, String dieuKienChuyenDich)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = fetchByTrangThaiNguonNull(quyTrinhThuTucId,
				dieuKienChuyenDich);

		if (motCuaChuyenDichTrangThai == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("quyTrinhThuTucId=");
			msg.append(quyTrinhThuTucId);

			msg.append(", dieuKienChuyenDich=");
			msg.append(dieuKienChuyenDich);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchMotCuaChuyenDichTrangThaiException(msg.toString());
		}

		return motCuaChuyenDichTrangThai;
	}

	/**
	 * Returns the mot cua chuyen dich trang thai where quyTrinhThuTucId = &#63; and dieuKienChuyenDich = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @return the matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByTrangThaiNguonNull(
		long quyTrinhThuTucId, String dieuKienChuyenDich)
		throws SystemException {
		return fetchByTrangThaiNguonNull(quyTrinhThuTucId, dieuKienChuyenDich,
			true);
	}

	/**
	 * Returns the mot cua chuyen dich trang thai where quyTrinhThuTucId = &#63; and dieuKienChuyenDich = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByTrangThaiNguonNull(
		long quyTrinhThuTucId, String dieuKienChuyenDich,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { quyTrinhThuTucId, dieuKienChuyenDich };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_TRANGTHAINGUONNULL,
					finderArgs, this);
		}

		if (result instanceof MotCuaChuyenDichTrangThai) {
			MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = (MotCuaChuyenDichTrangThai)result;

			if ((quyTrinhThuTucId != motCuaChuyenDichTrangThai.getQuyTrinhThuTucId()) ||
					!Validator.equals(dieuKienChuyenDich,
						motCuaChuyenDichTrangThai.getDieuKienChuyenDich())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

			query.append(_FINDER_COLUMN_TRANGTHAINGUONNULL_QUYTRINHTHUTUCID_2);

			boolean bindDieuKienChuyenDich = false;

			if (dieuKienChuyenDich == null) {
				query.append(_FINDER_COLUMN_TRANGTHAINGUONNULL_DIEUKIENCHUYENDICH_1);
			}
			else if (dieuKienChuyenDich.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TRANGTHAINGUONNULL_DIEUKIENCHUYENDICH_3);
			}
			else {
				bindDieuKienChuyenDich = true;

				query.append(_FINDER_COLUMN_TRANGTHAINGUONNULL_DIEUKIENCHUYENDICH_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(quyTrinhThuTucId);

				if (bindDieuKienChuyenDich) {
					qPos.add(dieuKienChuyenDich);
				}

				List<MotCuaChuyenDichTrangThai> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TRANGTHAINGUONNULL,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"MotCuaChuyenDichTrangThaiPersistenceImpl.fetchByTrangThaiNguonNull(long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = list.get(0);

					result = motCuaChuyenDichTrangThai;

					cacheResult(motCuaChuyenDichTrangThai);

					if ((motCuaChuyenDichTrangThai.getQuyTrinhThuTucId() != quyTrinhThuTucId) ||
							(motCuaChuyenDichTrangThai.getDieuKienChuyenDich() == null) ||
							!motCuaChuyenDichTrangThai.getDieuKienChuyenDich()
														  .equals(dieuKienChuyenDich)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TRANGTHAINGUONNULL,
							finderArgs, motCuaChuyenDichTrangThai);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TRANGTHAINGUONNULL,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (MotCuaChuyenDichTrangThai)result;
		}
	}

	/**
	 * Removes the mot cua chuyen dich trang thai where quyTrinhThuTucId = &#63; and dieuKienChuyenDich = &#63; from the database.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @return the mot cua chuyen dich trang thai that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai removeByTrangThaiNguonNull(
		long quyTrinhThuTucId, String dieuKienChuyenDich)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = findByTrangThaiNguonNull(quyTrinhThuTucId,
				dieuKienChuyenDich);

		return remove(motCuaChuyenDichTrangThai);
	}

	/**
	 * Returns the number of mot cua chuyen dich trang thais where quyTrinhThuTucId = &#63; and dieuKienChuyenDich = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @return the number of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTrangThaiNguonNull(long quyTrinhThuTucId,
		String dieuKienChuyenDich) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TRANGTHAINGUONNULL;

		Object[] finderArgs = new Object[] { quyTrinhThuTucId, dieuKienChuyenDich };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

			query.append(_FINDER_COLUMN_TRANGTHAINGUONNULL_QUYTRINHTHUTUCID_2);

			boolean bindDieuKienChuyenDich = false;

			if (dieuKienChuyenDich == null) {
				query.append(_FINDER_COLUMN_TRANGTHAINGUONNULL_DIEUKIENCHUYENDICH_1);
			}
			else if (dieuKienChuyenDich.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TRANGTHAINGUONNULL_DIEUKIENCHUYENDICH_3);
			}
			else {
				bindDieuKienChuyenDich = true;

				query.append(_FINDER_COLUMN_TRANGTHAINGUONNULL_DIEUKIENCHUYENDICH_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(quyTrinhThuTucId);

				if (bindDieuKienChuyenDich) {
					qPos.add(dieuKienChuyenDich);
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

	private static final String _FINDER_COLUMN_TRANGTHAINGUONNULL_QUYTRINHTHUTUCID_2 =
		"motCuaChuyenDichTrangThai.quyTrinhThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_TRANGTHAINGUONNULL_DIEUKIENCHUYENDICH_1 =
		"motCuaChuyenDichTrangThai.dieuKienChuyenDich IS NULL AND  motCuaChuyenDichTrangThai.trangThaiNguonId is null ";
	private static final String _FINDER_COLUMN_TRANGTHAINGUONNULL_DIEUKIENCHUYENDICH_2 =
		"motCuaChuyenDichTrangThai.dieuKienChuyenDich = ? AND  motCuaChuyenDichTrangThai.trangThaiNguonId is null ";
	private static final String _FINDER_COLUMN_TRANGTHAINGUONNULL_DIEUKIENCHUYENDICH_3 =
		"(motCuaChuyenDichTrangThai.dieuKienChuyenDich IS NULL OR motCuaChuyenDichTrangThai.dieuKienChuyenDich = '') AND  motCuaChuyenDichTrangThai.trangThaiNguonId is null ";

	public MotCuaChuyenDichTrangThaiPersistenceImpl() {
		setModelClass(MotCuaChuyenDichTrangThai.class);
	}

	/**
	 * Caches the mot cua chuyen dich trang thai in the entity cache if it is enabled.
	 *
	 * @param motCuaChuyenDichTrangThai the mot cua chuyen dich trang thai
	 */
	@Override
	public void cacheResult(MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai) {
		EntityCacheUtil.putResult(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			motCuaChuyenDichTrangThai.getPrimaryKey(), motCuaChuyenDichTrangThai);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID,
			new Object[] {
				motCuaChuyenDichTrangThai.getDieuKienChuyenDich(),
				motCuaChuyenDichTrangThai.getTrangThaiNguonId(),
				motCuaChuyenDichTrangThai.getQuyTrinhThuTucId()
			}, motCuaChuyenDichTrangThai);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TRANGTHAINGUONNULL,
			new Object[] {
				motCuaChuyenDichTrangThai.getQuyTrinhThuTucId(),
				motCuaChuyenDichTrangThai.getDieuKienChuyenDich()
			}, motCuaChuyenDichTrangThai);

		motCuaChuyenDichTrangThai.resetOriginalValues();
	}

	/**
	 * Caches the mot cua chuyen dich trang thais in the entity cache if it is enabled.
	 *
	 * @param motCuaChuyenDichTrangThais the mot cua chuyen dich trang thais
	 */
	@Override
	public void cacheResult(
		List<MotCuaChuyenDichTrangThai> motCuaChuyenDichTrangThais) {
		for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : motCuaChuyenDichTrangThais) {
			if (EntityCacheUtil.getResult(
						MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaChuyenDichTrangThaiImpl.class,
						motCuaChuyenDichTrangThai.getPrimaryKey()) == null) {
				cacheResult(motCuaChuyenDichTrangThai);
			}
			else {
				motCuaChuyenDichTrangThai.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all mot cua chuyen dich trang thais.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MotCuaChuyenDichTrangThaiImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MotCuaChuyenDichTrangThaiImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the mot cua chuyen dich trang thai.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai) {
		EntityCacheUtil.removeResult(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			motCuaChuyenDichTrangThai.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(motCuaChuyenDichTrangThai);
	}

	@Override
	public void clearCache(
		List<MotCuaChuyenDichTrangThai> motCuaChuyenDichTrangThais) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : motCuaChuyenDichTrangThais) {
			EntityCacheUtil.removeResult(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaChuyenDichTrangThaiImpl.class,
				motCuaChuyenDichTrangThai.getPrimaryKey());

			clearUniqueFindersCache(motCuaChuyenDichTrangThai);
		}
	}

	protected void cacheUniqueFindersCache(
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai) {
		if (motCuaChuyenDichTrangThai.isNew()) {
			Object[] args = new Object[] {
					motCuaChuyenDichTrangThai.getDieuKienChuyenDich(),
					motCuaChuyenDichTrangThai.getTrangThaiNguonId(),
					motCuaChuyenDichTrangThai.getQuyTrinhThuTucId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID,
				args, motCuaChuyenDichTrangThai);

			args = new Object[] {
					motCuaChuyenDichTrangThai.getQuyTrinhThuTucId(),
					motCuaChuyenDichTrangThai.getDieuKienChuyenDich()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TRANGTHAINGUONNULL,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TRANGTHAINGUONNULL,
				args, motCuaChuyenDichTrangThai);
		}
		else {
			MotCuaChuyenDichTrangThaiModelImpl motCuaChuyenDichTrangThaiModelImpl =
				(MotCuaChuyenDichTrangThaiModelImpl)motCuaChuyenDichTrangThai;

			if ((motCuaChuyenDichTrangThaiModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaChuyenDichTrangThai.getDieuKienChuyenDich(),
						motCuaChuyenDichTrangThai.getTrangThaiNguonId(),
						motCuaChuyenDichTrangThai.getQuyTrinhThuTucId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID,
					args, motCuaChuyenDichTrangThai);
			}

			if ((motCuaChuyenDichTrangThaiModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_TRANGTHAINGUONNULL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaChuyenDichTrangThai.getQuyTrinhThuTucId(),
						motCuaChuyenDichTrangThai.getDieuKienChuyenDich()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TRANGTHAINGUONNULL,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TRANGTHAINGUONNULL,
					args, motCuaChuyenDichTrangThai);
			}
		}
	}

	protected void clearUniqueFindersCache(
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai) {
		MotCuaChuyenDichTrangThaiModelImpl motCuaChuyenDichTrangThaiModelImpl = (MotCuaChuyenDichTrangThaiModelImpl)motCuaChuyenDichTrangThai;

		Object[] args = new Object[] {
				motCuaChuyenDichTrangThai.getDieuKienChuyenDich(),
				motCuaChuyenDichTrangThai.getTrangThaiNguonId(),
				motCuaChuyenDichTrangThai.getQuyTrinhThuTucId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID,
			args);

		if ((motCuaChuyenDichTrangThaiModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID.getColumnBitmask()) != 0) {
			args = new Object[] {
					motCuaChuyenDichTrangThaiModelImpl.getOriginalDieuKienChuyenDich(),
					motCuaChuyenDichTrangThaiModelImpl.getOriginalTrangThaiNguonId(),
					motCuaChuyenDichTrangThaiModelImpl.getOriginalQuyTrinhThuTucId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_DIEUKIENCHUYENDICH_TRANGTHAINGUONID_QUYTRINHTHUTUCID,
				args);
		}

		args = new Object[] {
				motCuaChuyenDichTrangThai.getQuyTrinhThuTucId(),
				motCuaChuyenDichTrangThai.getDieuKienChuyenDich()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TRANGTHAINGUONNULL,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TRANGTHAINGUONNULL,
			args);

		if ((motCuaChuyenDichTrangThaiModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_TRANGTHAINGUONNULL.getColumnBitmask()) != 0) {
			args = new Object[] {
					motCuaChuyenDichTrangThaiModelImpl.getOriginalQuyTrinhThuTucId(),
					motCuaChuyenDichTrangThaiModelImpl.getOriginalDieuKienChuyenDich()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TRANGTHAINGUONNULL,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TRANGTHAINGUONNULL,
				args);
		}
	}

	/**
	 * Creates a new mot cua chuyen dich trang thai with the primary key. Does not add the mot cua chuyen dich trang thai to the database.
	 *
	 * @param id the primary key for the new mot cua chuyen dich trang thai
	 * @return the new mot cua chuyen dich trang thai
	 */
	@Override
	public MotCuaChuyenDichTrangThai create(long id) {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = new MotCuaChuyenDichTrangThaiImpl();

		motCuaChuyenDichTrangThai.setNew(true);
		motCuaChuyenDichTrangThai.setPrimaryKey(id);

		return motCuaChuyenDichTrangThai;
	}

	/**
	 * Removes the mot cua chuyen dich trang thai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the mot cua chuyen dich trang thai
	 * @return the mot cua chuyen dich trang thai that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a mot cua chuyen dich trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai remove(long id)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the mot cua chuyen dich trang thai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mot cua chuyen dich trang thai
	 * @return the mot cua chuyen dich trang thai that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a mot cua chuyen dich trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai remove(Serializable primaryKey)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = (MotCuaChuyenDichTrangThai)session.get(MotCuaChuyenDichTrangThaiImpl.class,
					primaryKey);

			if (motCuaChuyenDichTrangThai == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMotCuaChuyenDichTrangThaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(motCuaChuyenDichTrangThai);
		}
		catch (NoSuchMotCuaChuyenDichTrangThaiException nsee) {
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
	protected MotCuaChuyenDichTrangThai removeImpl(
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai)
		throws SystemException {
		motCuaChuyenDichTrangThai = toUnwrappedModel(motCuaChuyenDichTrangThai);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(motCuaChuyenDichTrangThai)) {
				motCuaChuyenDichTrangThai = (MotCuaChuyenDichTrangThai)session.get(MotCuaChuyenDichTrangThaiImpl.class,
						motCuaChuyenDichTrangThai.getPrimaryKeyObj());
			}

			if (motCuaChuyenDichTrangThai != null) {
				session.delete(motCuaChuyenDichTrangThai);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (motCuaChuyenDichTrangThai != null) {
			clearCache(motCuaChuyenDichTrangThai);
		}

		return motCuaChuyenDichTrangThai;
	}

	@Override
	public MotCuaChuyenDichTrangThai updateImpl(
		vn.dtt.duongbo.dao.motcua.model.MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai)
		throws SystemException {
		motCuaChuyenDichTrangThai = toUnwrappedModel(motCuaChuyenDichTrangThai);

		boolean isNew = motCuaChuyenDichTrangThai.isNew();

		MotCuaChuyenDichTrangThaiModelImpl motCuaChuyenDichTrangThaiModelImpl = (MotCuaChuyenDichTrangThaiModelImpl)motCuaChuyenDichTrangThai;

		Session session = null;

		try {
			session = openSession();

			if (motCuaChuyenDichTrangThai.isNew()) {
				session.save(motCuaChuyenDichTrangThai);

				motCuaChuyenDichTrangThai.setNew(false);
			}
			else {
				session.merge(motCuaChuyenDichTrangThai);
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
				!MotCuaChuyenDichTrangThaiModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((motCuaChuyenDichTrangThaiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIEUKIENCHUYENDICH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaChuyenDichTrangThaiModelImpl.getOriginalDieuKienChuyenDich()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DIEUKIENCHUYENDICH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIEUKIENCHUYENDICH,
					args);

				args = new Object[] {
						motCuaChuyenDichTrangThaiModelImpl.getDieuKienChuyenDich()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DIEUKIENCHUYENDICH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIEUKIENCHUYENDICH,
					args);
			}

			if ((motCuaChuyenDichTrangThaiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaChuyenDichTrangThaiModelImpl.getOriginalDieuKienChuyenDich(),
						motCuaChuyenDichTrangThaiModelImpl.getOriginalTrangThaiNguonId(),
						motCuaChuyenDichTrangThaiModelImpl.getOriginalQuyTrinhThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID,
					args);

				args = new Object[] {
						motCuaChuyenDichTrangThaiModelImpl.getDieuKienChuyenDich(),
						motCuaChuyenDichTrangThaiModelImpl.getTrangThaiNguonId(),
						motCuaChuyenDichTrangThaiModelImpl.getQuyTrinhThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIEUKIENCHUYENDICHANDTRANGTHAINGUONIDANDQUYTRINHTHUTUCID,
					args);
			}

			if ((motCuaChuyenDichTrangThaiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAIDICHID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaChuyenDichTrangThaiModelImpl.getOriginalTrangThaiDichId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TRANGTHAIDICHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAIDICHID,
					args);

				args = new Object[] {
						motCuaChuyenDichTrangThaiModelImpl.getTrangThaiDichId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TRANGTHAIDICHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAIDICHID,
					args);
			}

			if ((motCuaChuyenDichTrangThaiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAINGUONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaChuyenDichTrangThaiModelImpl.getOriginalTrangThaiNguonId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TRANGTHAINGUONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAINGUONID,
					args);

				args = new Object[] {
						motCuaChuyenDichTrangThaiModelImpl.getTrangThaiNguonId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TRANGTHAINGUONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAINGUONID,
					args);
			}

			if ((motCuaChuyenDichTrangThaiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaChuyenDichTrangThaiModelImpl.getOriginalDieuKienChuyenDich(),
						motCuaChuyenDichTrangThaiModelImpl.getOriginalQuyTrinhThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH,
					args);

				args = new Object[] {
						motCuaChuyenDichTrangThaiModelImpl.getDieuKienChuyenDich(),
						motCuaChuyenDichTrangThaiModelImpl.getQuyTrinhThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDDIEUKIENCHUYENDICH,
					args);
			}

			if ((motCuaChuyenDichTrangThaiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KHOITAOPHIEUXULY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaChuyenDichTrangThaiModelImpl.getOriginalQuyTrinhThuTucId(),
						motCuaChuyenDichTrangThaiModelImpl.getOriginalTrangThaiNguonId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_KHOITAOPHIEUXULY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KHOITAOPHIEUXULY,
					args);

				args = new Object[] {
						motCuaChuyenDichTrangThaiModelImpl.getQuyTrinhThuTucId(),
						motCuaChuyenDichTrangThaiModelImpl.getTrangThaiNguonId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_KHOITAOPHIEUXULY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KHOITAOPHIEUXULY,
					args);
			}
		}

		EntityCacheUtil.putResult(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			motCuaChuyenDichTrangThai.getPrimaryKey(), motCuaChuyenDichTrangThai);

		clearUniqueFindersCache(motCuaChuyenDichTrangThai);
		cacheUniqueFindersCache(motCuaChuyenDichTrangThai);

		return motCuaChuyenDichTrangThai;
	}

	protected MotCuaChuyenDichTrangThai toUnwrappedModel(
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai) {
		if (motCuaChuyenDichTrangThai instanceof MotCuaChuyenDichTrangThaiImpl) {
			return motCuaChuyenDichTrangThai;
		}

		MotCuaChuyenDichTrangThaiImpl motCuaChuyenDichTrangThaiImpl = new MotCuaChuyenDichTrangThaiImpl();

		motCuaChuyenDichTrangThaiImpl.setNew(motCuaChuyenDichTrangThai.isNew());
		motCuaChuyenDichTrangThaiImpl.setPrimaryKey(motCuaChuyenDichTrangThai.getPrimaryKey());

		motCuaChuyenDichTrangThaiImpl.setId(motCuaChuyenDichTrangThai.getId());
		motCuaChuyenDichTrangThaiImpl.setTrangThaiNguonId(motCuaChuyenDichTrangThai.getTrangThaiNguonId());
		motCuaChuyenDichTrangThaiImpl.setTrangThaiDichId(motCuaChuyenDichTrangThai.getTrangThaiDichId());
		motCuaChuyenDichTrangThaiImpl.setDieuKienChuyenDich(motCuaChuyenDichTrangThai.getDieuKienChuyenDich());
		motCuaChuyenDichTrangThaiImpl.setHanhDongXuLy(motCuaChuyenDichTrangThai.getHanhDongXuLy());
		motCuaChuyenDichTrangThaiImpl.setSoNgayXuLy(motCuaChuyenDichTrangThai.getSoNgayXuLy());
		motCuaChuyenDichTrangThaiImpl.setPhanNhomHoSoId(motCuaChuyenDichTrangThai.getPhanNhomHoSoId());
		motCuaChuyenDichTrangThaiImpl.setQuyTrinhThuTucId(motCuaChuyenDichTrangThai.getQuyTrinhThuTucId());
		motCuaChuyenDichTrangThaiImpl.setTaoPhieuMoi(motCuaChuyenDichTrangThai.getTaoPhieuMoi());
		motCuaChuyenDichTrangThaiImpl.setThongBaoXuLy(motCuaChuyenDichTrangThai.getThongBaoXuLy());
		motCuaChuyenDichTrangThaiImpl.setChuyenXuLy(motCuaChuyenDichTrangThai.getChuyenXuLy());

		return motCuaChuyenDichTrangThaiImpl;
	}

	/**
	 * Returns the mot cua chuyen dich trang thai with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua chuyen dich trang thai
	 * @return the mot cua chuyen dich trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a mot cua chuyen dich trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = fetchByPrimaryKey(primaryKey);

		if (motCuaChuyenDichTrangThai == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMotCuaChuyenDichTrangThaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return motCuaChuyenDichTrangThai;
	}

	/**
	 * Returns the mot cua chuyen dich trang thai with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException} if it could not be found.
	 *
	 * @param id the primary key of the mot cua chuyen dich trang thai
	 * @return the mot cua chuyen dich trang thai
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a mot cua chuyen dich trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai findByPrimaryKey(long id)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the mot cua chuyen dich trang thai with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua chuyen dich trang thai
	 * @return the mot cua chuyen dich trang thai, or <code>null</code> if a mot cua chuyen dich trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = (MotCuaChuyenDichTrangThai)EntityCacheUtil.getResult(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaChuyenDichTrangThaiImpl.class, primaryKey);

		if (motCuaChuyenDichTrangThai == _nullMotCuaChuyenDichTrangThai) {
			return null;
		}

		if (motCuaChuyenDichTrangThai == null) {
			Session session = null;

			try {
				session = openSession();

				motCuaChuyenDichTrangThai = (MotCuaChuyenDichTrangThai)session.get(MotCuaChuyenDichTrangThaiImpl.class,
						primaryKey);

				if (motCuaChuyenDichTrangThai != null) {
					cacheResult(motCuaChuyenDichTrangThai);
				}
				else {
					EntityCacheUtil.putResult(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaChuyenDichTrangThaiImpl.class, primaryKey,
						_nullMotCuaChuyenDichTrangThai);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
					MotCuaChuyenDichTrangThaiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return motCuaChuyenDichTrangThai;
	}

	/**
	 * Returns the mot cua chuyen dich trang thai with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the mot cua chuyen dich trang thai
	 * @return the mot cua chuyen dich trang thai, or <code>null</code> if a mot cua chuyen dich trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the mot cua chuyen dich trang thais.
	 *
	 * @return the mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua chuyen dich trang thais.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua chuyen dich trang thais
	 * @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	 * @return the range of mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua chuyen dich trang thais.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua chuyen dich trang thais
	 * @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findAll(int start, int end,
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

		List<MotCuaChuyenDichTrangThai> list = (List<MotCuaChuyenDichTrangThai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI;

				if (pagination) {
					sql = sql.concat(MotCuaChuyenDichTrangThaiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MotCuaChuyenDichTrangThai>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaChuyenDichTrangThai>(list);
				}
				else {
					list = (List<MotCuaChuyenDichTrangThai>)QueryUtil.list(q,
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
	 * Removes all the mot cua chuyen dich trang thais from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : findAll()) {
			remove(motCuaChuyenDichTrangThai);
		}
	}

	/**
	 * Returns the number of mot cua chuyen dich trang thais.
	 *
	 * @return the number of mot cua chuyen dich trang thais
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

				Query q = session.createQuery(_SQL_COUNT_MOTCUACHUYENDICHTRANGTHAI);

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
	 * Initializes the mot cua chuyen dich trang thai persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.motcua.model.MotCuaChuyenDichTrangThai")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MotCuaChuyenDichTrangThai>> listenersList = new ArrayList<ModelListener<MotCuaChuyenDichTrangThai>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MotCuaChuyenDichTrangThai>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MotCuaChuyenDichTrangThaiImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI = "SELECT motCuaChuyenDichTrangThai FROM MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai";
	private static final String _SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI_WHERE = "SELECT motCuaChuyenDichTrangThai FROM MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai WHERE ";
	private static final String _SQL_COUNT_MOTCUACHUYENDICHTRANGTHAI = "SELECT COUNT(motCuaChuyenDichTrangThai) FROM MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai";
	private static final String _SQL_COUNT_MOTCUACHUYENDICHTRANGTHAI_WHERE = "SELECT COUNT(motCuaChuyenDichTrangThai) FROM MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "motCuaChuyenDichTrangThai.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MotCuaChuyenDichTrangThai exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MotCuaChuyenDichTrangThai exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MotCuaChuyenDichTrangThaiPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"trangThaiNguonId", "trangThaiDichId", "dieuKienChuyenDich",
				"hanhDongXuLy", "soNgayXuLy", "phanNhomHoSoId",
				"quyTrinhThuTucId", "taoPhieuMoi", "thongBaoXuLy", "chuyenXuLy"
			});
	private static MotCuaChuyenDichTrangThai _nullMotCuaChuyenDichTrangThai = new MotCuaChuyenDichTrangThaiImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MotCuaChuyenDichTrangThai> toCacheModel() {
				return _nullMotCuaChuyenDichTrangThaiCacheModel;
			}
		};

	private static CacheModel<MotCuaChuyenDichTrangThai> _nullMotCuaChuyenDichTrangThaiCacheModel =
		new CacheModel<MotCuaChuyenDichTrangThai>() {
			@Override
			public MotCuaChuyenDichTrangThai toEntityModel() {
				return _nullMotCuaChuyenDichTrangThai;
			}
		};
}