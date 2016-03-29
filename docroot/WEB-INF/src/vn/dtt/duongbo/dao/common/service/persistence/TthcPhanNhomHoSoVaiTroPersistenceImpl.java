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

package vn.dtt.duongbo.dao.common.service.persistence;

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

import vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException;
import vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSoVaiTro;
import vn.dtt.duongbo.dao.common.model.impl.TthcPhanNhomHoSoVaiTroImpl;
import vn.dtt.duongbo.dao.common.model.impl.TthcPhanNhomHoSoVaiTroModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tthc phan nhom ho so vai tro service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcPhanNhomHoSoVaiTroPersistence
 * @see TthcPhanNhomHoSoVaiTroUtil
 * @generated
 */
public class TthcPhanNhomHoSoVaiTroPersistenceImpl extends BasePersistenceImpl<TthcPhanNhomHoSoVaiTro>
	implements TthcPhanNhomHoSoVaiTroPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TthcPhanNhomHoSoVaiTroUtil} to access the tthc phan nhom ho so vai tro persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TthcPhanNhomHoSoVaiTroImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TthcPhanNhomHoSoVaiTroModelImpl.ENTITY_CACHE_ENABLED,
			TthcPhanNhomHoSoVaiTroModelImpl.FINDER_CACHE_ENABLED,
			TthcPhanNhomHoSoVaiTroImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TthcPhanNhomHoSoVaiTroModelImpl.ENTITY_CACHE_ENABLED,
			TthcPhanNhomHoSoVaiTroModelImpl.FINDER_CACHE_ENABLED,
			TthcPhanNhomHoSoVaiTroImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TthcPhanNhomHoSoVaiTroModelImpl.ENTITY_CACHE_ENABLED,
			TthcPhanNhomHoSoVaiTroModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_PHANNHOMHOSOIDANDVAITROXULY =
		new FinderPath(TthcPhanNhomHoSoVaiTroModelImpl.ENTITY_CACHE_ENABLED,
			TthcPhanNhomHoSoVaiTroModelImpl.FINDER_CACHE_ENABLED,
			TthcPhanNhomHoSoVaiTroImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByPhanNhomHoSoIdAndVaiTroXuLy",
			new String[] { Long.class.getName(), Long.class.getName() },
			TthcPhanNhomHoSoVaiTroModelImpl.PHANNHOMHOSOID_COLUMN_BITMASK |
			TthcPhanNhomHoSoVaiTroModelImpl.VAITROXULY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PHANNHOMHOSOIDANDVAITROXULY =
		new FinderPath(TthcPhanNhomHoSoVaiTroModelImpl.ENTITY_CACHE_ENABLED,
			TthcPhanNhomHoSoVaiTroModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPhanNhomHoSoIdAndVaiTroXuLy",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the tthc phan nhom ho so vai tro where phanNhomHoSoId = &#63; and vaiTroXuLy = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException} if it could not be found.
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @param vaiTroXuLy the vai tro xu ly
	 * @return the matching tthc phan nhom ho so vai tro
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException if a matching tthc phan nhom ho so vai tro could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcPhanNhomHoSoVaiTro findByPhanNhomHoSoIdAndVaiTroXuLy(
		long phanNhomHoSoId, long vaiTroXuLy)
		throws NoSuchTthcPhanNhomHoSoVaiTroException, SystemException {
		TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro = fetchByPhanNhomHoSoIdAndVaiTroXuLy(phanNhomHoSoId,
				vaiTroXuLy);

		if (tthcPhanNhomHoSoVaiTro == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("phanNhomHoSoId=");
			msg.append(phanNhomHoSoId);

			msg.append(", vaiTroXuLy=");
			msg.append(vaiTroXuLy);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTthcPhanNhomHoSoVaiTroException(msg.toString());
		}

		return tthcPhanNhomHoSoVaiTro;
	}

	/**
	 * Returns the tthc phan nhom ho so vai tro where phanNhomHoSoId = &#63; and vaiTroXuLy = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @param vaiTroXuLy the vai tro xu ly
	 * @return the matching tthc phan nhom ho so vai tro, or <code>null</code> if a matching tthc phan nhom ho so vai tro could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcPhanNhomHoSoVaiTro fetchByPhanNhomHoSoIdAndVaiTroXuLy(
		long phanNhomHoSoId, long vaiTroXuLy) throws SystemException {
		return fetchByPhanNhomHoSoIdAndVaiTroXuLy(phanNhomHoSoId, vaiTroXuLy,
			true);
	}

	/**
	 * Returns the tthc phan nhom ho so vai tro where phanNhomHoSoId = &#63; and vaiTroXuLy = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @param vaiTroXuLy the vai tro xu ly
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tthc phan nhom ho so vai tro, or <code>null</code> if a matching tthc phan nhom ho so vai tro could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcPhanNhomHoSoVaiTro fetchByPhanNhomHoSoIdAndVaiTroXuLy(
		long phanNhomHoSoId, long vaiTroXuLy, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { phanNhomHoSoId, vaiTroXuLy };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PHANNHOMHOSOIDANDVAITROXULY,
					finderArgs, this);
		}

		if (result instanceof TthcPhanNhomHoSoVaiTro) {
			TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro = (TthcPhanNhomHoSoVaiTro)result;

			if ((phanNhomHoSoId != tthcPhanNhomHoSoVaiTro.getPhanNhomHoSoId()) ||
					(vaiTroXuLy != tthcPhanNhomHoSoVaiTro.getVaiTroXuLy())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TTHCPHANNHOMHOSOVAITRO_WHERE);

			query.append(_FINDER_COLUMN_PHANNHOMHOSOIDANDVAITROXULY_PHANNHOMHOSOID_2);

			query.append(_FINDER_COLUMN_PHANNHOMHOSOIDANDVAITROXULY_VAITROXULY_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phanNhomHoSoId);

				qPos.add(vaiTroXuLy);

				List<TthcPhanNhomHoSoVaiTro> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHANNHOMHOSOIDANDVAITROXULY,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"TthcPhanNhomHoSoVaiTroPersistenceImpl.fetchByPhanNhomHoSoIdAndVaiTroXuLy(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro = list.get(0);

					result = tthcPhanNhomHoSoVaiTro;

					cacheResult(tthcPhanNhomHoSoVaiTro);

					if ((tthcPhanNhomHoSoVaiTro.getPhanNhomHoSoId() != phanNhomHoSoId) ||
							(tthcPhanNhomHoSoVaiTro.getVaiTroXuLy() != vaiTroXuLy)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHANNHOMHOSOIDANDVAITROXULY,
							finderArgs, tthcPhanNhomHoSoVaiTro);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PHANNHOMHOSOIDANDVAITROXULY,
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
			return (TthcPhanNhomHoSoVaiTro)result;
		}
	}

	/**
	 * Removes the tthc phan nhom ho so vai tro where phanNhomHoSoId = &#63; and vaiTroXuLy = &#63; from the database.
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @param vaiTroXuLy the vai tro xu ly
	 * @return the tthc phan nhom ho so vai tro that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcPhanNhomHoSoVaiTro removeByPhanNhomHoSoIdAndVaiTroXuLy(
		long phanNhomHoSoId, long vaiTroXuLy)
		throws NoSuchTthcPhanNhomHoSoVaiTroException, SystemException {
		TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro = findByPhanNhomHoSoIdAndVaiTroXuLy(phanNhomHoSoId,
				vaiTroXuLy);

		return remove(tthcPhanNhomHoSoVaiTro);
	}

	/**
	 * Returns the number of tthc phan nhom ho so vai tros where phanNhomHoSoId = &#63; and vaiTroXuLy = &#63;.
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @param vaiTroXuLy the vai tro xu ly
	 * @return the number of matching tthc phan nhom ho so vai tros
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPhanNhomHoSoIdAndVaiTroXuLy(long phanNhomHoSoId,
		long vaiTroXuLy) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PHANNHOMHOSOIDANDVAITROXULY;

		Object[] finderArgs = new Object[] { phanNhomHoSoId, vaiTroXuLy };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TTHCPHANNHOMHOSOVAITRO_WHERE);

			query.append(_FINDER_COLUMN_PHANNHOMHOSOIDANDVAITROXULY_PHANNHOMHOSOID_2);

			query.append(_FINDER_COLUMN_PHANNHOMHOSOIDANDVAITROXULY_VAITROXULY_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phanNhomHoSoId);

				qPos.add(vaiTroXuLy);

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

	private static final String _FINDER_COLUMN_PHANNHOMHOSOIDANDVAITROXULY_PHANNHOMHOSOID_2 =
		"tthcPhanNhomHoSoVaiTro.phanNhomHoSoId = ? AND ";
	private static final String _FINDER_COLUMN_PHANNHOMHOSOIDANDVAITROXULY_VAITROXULY_2 =
		"tthcPhanNhomHoSoVaiTro.vaiTroXuLy = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PHANNHOMHOSOID =
		new FinderPath(TthcPhanNhomHoSoVaiTroModelImpl.ENTITY_CACHE_ENABLED,
			TthcPhanNhomHoSoVaiTroModelImpl.FINDER_CACHE_ENABLED,
			TthcPhanNhomHoSoVaiTroImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPhanNhomHoSoId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHANNHOMHOSOID =
		new FinderPath(TthcPhanNhomHoSoVaiTroModelImpl.ENTITY_CACHE_ENABLED,
			TthcPhanNhomHoSoVaiTroModelImpl.FINDER_CACHE_ENABLED,
			TthcPhanNhomHoSoVaiTroImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPhanNhomHoSoId",
			new String[] { Long.class.getName() },
			TthcPhanNhomHoSoVaiTroModelImpl.PHANNHOMHOSOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PHANNHOMHOSOID = new FinderPath(TthcPhanNhomHoSoVaiTroModelImpl.ENTITY_CACHE_ENABLED,
			TthcPhanNhomHoSoVaiTroModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPhanNhomHoSoId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the tthc phan nhom ho so vai tros where phanNhomHoSoId = &#63;.
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @return the matching tthc phan nhom ho so vai tros
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcPhanNhomHoSoVaiTro> findByPhanNhomHoSoId(
		long phanNhomHoSoId) throws SystemException {
		return findByPhanNhomHoSoId(phanNhomHoSoId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc phan nhom ho so vai tros where phanNhomHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcPhanNhomHoSoVaiTroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @param start the lower bound of the range of tthc phan nhom ho so vai tros
	 * @param end the upper bound of the range of tthc phan nhom ho so vai tros (not inclusive)
	 * @return the range of matching tthc phan nhom ho so vai tros
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcPhanNhomHoSoVaiTro> findByPhanNhomHoSoId(
		long phanNhomHoSoId, int start, int end) throws SystemException {
		return findByPhanNhomHoSoId(phanNhomHoSoId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc phan nhom ho so vai tros where phanNhomHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcPhanNhomHoSoVaiTroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @param start the lower bound of the range of tthc phan nhom ho so vai tros
	 * @param end the upper bound of the range of tthc phan nhom ho so vai tros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc phan nhom ho so vai tros
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcPhanNhomHoSoVaiTro> findByPhanNhomHoSoId(
		long phanNhomHoSoId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHANNHOMHOSOID;
			finderArgs = new Object[] { phanNhomHoSoId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PHANNHOMHOSOID;
			finderArgs = new Object[] {
					phanNhomHoSoId,
					
					start, end, orderByComparator
				};
		}

		List<TthcPhanNhomHoSoVaiTro> list = (List<TthcPhanNhomHoSoVaiTro>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro : list) {
				if ((phanNhomHoSoId != tthcPhanNhomHoSoVaiTro.getPhanNhomHoSoId())) {
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

			query.append(_SQL_SELECT_TTHCPHANNHOMHOSOVAITRO_WHERE);

			query.append(_FINDER_COLUMN_PHANNHOMHOSOID_PHANNHOMHOSOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcPhanNhomHoSoVaiTroModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phanNhomHoSoId);

				if (!pagination) {
					list = (List<TthcPhanNhomHoSoVaiTro>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcPhanNhomHoSoVaiTro>(list);
				}
				else {
					list = (List<TthcPhanNhomHoSoVaiTro>)QueryUtil.list(q,
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
	 * Returns the first tthc phan nhom ho so vai tro in the ordered set where phanNhomHoSoId = &#63;.
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc phan nhom ho so vai tro
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException if a matching tthc phan nhom ho so vai tro could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcPhanNhomHoSoVaiTro findByPhanNhomHoSoId_First(
		long phanNhomHoSoId, OrderByComparator orderByComparator)
		throws NoSuchTthcPhanNhomHoSoVaiTroException, SystemException {
		TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro = fetchByPhanNhomHoSoId_First(phanNhomHoSoId,
				orderByComparator);

		if (tthcPhanNhomHoSoVaiTro != null) {
			return tthcPhanNhomHoSoVaiTro;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phanNhomHoSoId=");
		msg.append(phanNhomHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcPhanNhomHoSoVaiTroException(msg.toString());
	}

	/**
	 * Returns the first tthc phan nhom ho so vai tro in the ordered set where phanNhomHoSoId = &#63;.
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc phan nhom ho so vai tro, or <code>null</code> if a matching tthc phan nhom ho so vai tro could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcPhanNhomHoSoVaiTro fetchByPhanNhomHoSoId_First(
		long phanNhomHoSoId, OrderByComparator orderByComparator)
		throws SystemException {
		List<TthcPhanNhomHoSoVaiTro> list = findByPhanNhomHoSoId(phanNhomHoSoId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc phan nhom ho so vai tro in the ordered set where phanNhomHoSoId = &#63;.
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc phan nhom ho so vai tro
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException if a matching tthc phan nhom ho so vai tro could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcPhanNhomHoSoVaiTro findByPhanNhomHoSoId_Last(
		long phanNhomHoSoId, OrderByComparator orderByComparator)
		throws NoSuchTthcPhanNhomHoSoVaiTroException, SystemException {
		TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro = fetchByPhanNhomHoSoId_Last(phanNhomHoSoId,
				orderByComparator);

		if (tthcPhanNhomHoSoVaiTro != null) {
			return tthcPhanNhomHoSoVaiTro;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phanNhomHoSoId=");
		msg.append(phanNhomHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcPhanNhomHoSoVaiTroException(msg.toString());
	}

	/**
	 * Returns the last tthc phan nhom ho so vai tro in the ordered set where phanNhomHoSoId = &#63;.
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc phan nhom ho so vai tro, or <code>null</code> if a matching tthc phan nhom ho so vai tro could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcPhanNhomHoSoVaiTro fetchByPhanNhomHoSoId_Last(
		long phanNhomHoSoId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByPhanNhomHoSoId(phanNhomHoSoId);

		if (count == 0) {
			return null;
		}

		List<TthcPhanNhomHoSoVaiTro> list = findByPhanNhomHoSoId(phanNhomHoSoId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc phan nhom ho so vai tros before and after the current tthc phan nhom ho so vai tro in the ordered set where phanNhomHoSoId = &#63;.
	 *
	 * @param id the primary key of the current tthc phan nhom ho so vai tro
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc phan nhom ho so vai tro
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException if a tthc phan nhom ho so vai tro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcPhanNhomHoSoVaiTro[] findByPhanNhomHoSoId_PrevAndNext(long id,
		long phanNhomHoSoId, OrderByComparator orderByComparator)
		throws NoSuchTthcPhanNhomHoSoVaiTroException, SystemException {
		TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcPhanNhomHoSoVaiTro[] array = new TthcPhanNhomHoSoVaiTroImpl[3];

			array[0] = getByPhanNhomHoSoId_PrevAndNext(session,
					tthcPhanNhomHoSoVaiTro, phanNhomHoSoId, orderByComparator,
					true);

			array[1] = tthcPhanNhomHoSoVaiTro;

			array[2] = getByPhanNhomHoSoId_PrevAndNext(session,
					tthcPhanNhomHoSoVaiTro, phanNhomHoSoId, orderByComparator,
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

	protected TthcPhanNhomHoSoVaiTro getByPhanNhomHoSoId_PrevAndNext(
		Session session, TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro,
		long phanNhomHoSoId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCPHANNHOMHOSOVAITRO_WHERE);

		query.append(_FINDER_COLUMN_PHANNHOMHOSOID_PHANNHOMHOSOID_2);

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
			query.append(TthcPhanNhomHoSoVaiTroModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(phanNhomHoSoId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcPhanNhomHoSoVaiTro);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcPhanNhomHoSoVaiTro> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc phan nhom ho so vai tros where phanNhomHoSoId = &#63; from the database.
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPhanNhomHoSoId(long phanNhomHoSoId)
		throws SystemException {
		for (TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro : findByPhanNhomHoSoId(
				phanNhomHoSoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tthcPhanNhomHoSoVaiTro);
		}
	}

	/**
	 * Returns the number of tthc phan nhom ho so vai tros where phanNhomHoSoId = &#63;.
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @return the number of matching tthc phan nhom ho so vai tros
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPhanNhomHoSoId(long phanNhomHoSoId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PHANNHOMHOSOID;

		Object[] finderArgs = new Object[] { phanNhomHoSoId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TTHCPHANNHOMHOSOVAITRO_WHERE);

			query.append(_FINDER_COLUMN_PHANNHOMHOSOID_PHANNHOMHOSOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phanNhomHoSoId);

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

	private static final String _FINDER_COLUMN_PHANNHOMHOSOID_PHANNHOMHOSOID_2 = "tthcPhanNhomHoSoVaiTro.phanNhomHoSoId = ?";

	public TthcPhanNhomHoSoVaiTroPersistenceImpl() {
		setModelClass(TthcPhanNhomHoSoVaiTro.class);
	}

	/**
	 * Caches the tthc phan nhom ho so vai tro in the entity cache if it is enabled.
	 *
	 * @param tthcPhanNhomHoSoVaiTro the tthc phan nhom ho so vai tro
	 */
	@Override
	public void cacheResult(TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro) {
		EntityCacheUtil.putResult(TthcPhanNhomHoSoVaiTroModelImpl.ENTITY_CACHE_ENABLED,
			TthcPhanNhomHoSoVaiTroImpl.class,
			tthcPhanNhomHoSoVaiTro.getPrimaryKey(), tthcPhanNhomHoSoVaiTro);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHANNHOMHOSOIDANDVAITROXULY,
			new Object[] {
				tthcPhanNhomHoSoVaiTro.getPhanNhomHoSoId(),
				tthcPhanNhomHoSoVaiTro.getVaiTroXuLy()
			}, tthcPhanNhomHoSoVaiTro);

		tthcPhanNhomHoSoVaiTro.resetOriginalValues();
	}

	/**
	 * Caches the tthc phan nhom ho so vai tros in the entity cache if it is enabled.
	 *
	 * @param tthcPhanNhomHoSoVaiTros the tthc phan nhom ho so vai tros
	 */
	@Override
	public void cacheResult(
		List<TthcPhanNhomHoSoVaiTro> tthcPhanNhomHoSoVaiTros) {
		for (TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro : tthcPhanNhomHoSoVaiTros) {
			if (EntityCacheUtil.getResult(
						TthcPhanNhomHoSoVaiTroModelImpl.ENTITY_CACHE_ENABLED,
						TthcPhanNhomHoSoVaiTroImpl.class,
						tthcPhanNhomHoSoVaiTro.getPrimaryKey()) == null) {
				cacheResult(tthcPhanNhomHoSoVaiTro);
			}
			else {
				tthcPhanNhomHoSoVaiTro.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tthc phan nhom ho so vai tros.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TthcPhanNhomHoSoVaiTroImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TthcPhanNhomHoSoVaiTroImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tthc phan nhom ho so vai tro.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro) {
		EntityCacheUtil.removeResult(TthcPhanNhomHoSoVaiTroModelImpl.ENTITY_CACHE_ENABLED,
			TthcPhanNhomHoSoVaiTroImpl.class,
			tthcPhanNhomHoSoVaiTro.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(tthcPhanNhomHoSoVaiTro);
	}

	@Override
	public void clearCache(List<TthcPhanNhomHoSoVaiTro> tthcPhanNhomHoSoVaiTros) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro : tthcPhanNhomHoSoVaiTros) {
			EntityCacheUtil.removeResult(TthcPhanNhomHoSoVaiTroModelImpl.ENTITY_CACHE_ENABLED,
				TthcPhanNhomHoSoVaiTroImpl.class,
				tthcPhanNhomHoSoVaiTro.getPrimaryKey());

			clearUniqueFindersCache(tthcPhanNhomHoSoVaiTro);
		}
	}

	protected void cacheUniqueFindersCache(
		TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro) {
		if (tthcPhanNhomHoSoVaiTro.isNew()) {
			Object[] args = new Object[] {
					tthcPhanNhomHoSoVaiTro.getPhanNhomHoSoId(),
					tthcPhanNhomHoSoVaiTro.getVaiTroXuLy()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PHANNHOMHOSOIDANDVAITROXULY,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHANNHOMHOSOIDANDVAITROXULY,
				args, tthcPhanNhomHoSoVaiTro);
		}
		else {
			TthcPhanNhomHoSoVaiTroModelImpl tthcPhanNhomHoSoVaiTroModelImpl = (TthcPhanNhomHoSoVaiTroModelImpl)tthcPhanNhomHoSoVaiTro;

			if ((tthcPhanNhomHoSoVaiTroModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_PHANNHOMHOSOIDANDVAITROXULY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcPhanNhomHoSoVaiTro.getPhanNhomHoSoId(),
						tthcPhanNhomHoSoVaiTro.getVaiTroXuLy()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PHANNHOMHOSOIDANDVAITROXULY,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHANNHOMHOSOIDANDVAITROXULY,
					args, tthcPhanNhomHoSoVaiTro);
			}
		}
	}

	protected void clearUniqueFindersCache(
		TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro) {
		TthcPhanNhomHoSoVaiTroModelImpl tthcPhanNhomHoSoVaiTroModelImpl = (TthcPhanNhomHoSoVaiTroModelImpl)tthcPhanNhomHoSoVaiTro;

		Object[] args = new Object[] {
				tthcPhanNhomHoSoVaiTro.getPhanNhomHoSoId(),
				tthcPhanNhomHoSoVaiTro.getVaiTroXuLy()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHANNHOMHOSOIDANDVAITROXULY,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PHANNHOMHOSOIDANDVAITROXULY,
			args);

		if ((tthcPhanNhomHoSoVaiTroModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_PHANNHOMHOSOIDANDVAITROXULY.getColumnBitmask()) != 0) {
			args = new Object[] {
					tthcPhanNhomHoSoVaiTroModelImpl.getOriginalPhanNhomHoSoId(),
					tthcPhanNhomHoSoVaiTroModelImpl.getOriginalVaiTroXuLy()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHANNHOMHOSOIDANDVAITROXULY,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PHANNHOMHOSOIDANDVAITROXULY,
				args);
		}
	}

	/**
	 * Creates a new tthc phan nhom ho so vai tro with the primary key. Does not add the tthc phan nhom ho so vai tro to the database.
	 *
	 * @param id the primary key for the new tthc phan nhom ho so vai tro
	 * @return the new tthc phan nhom ho so vai tro
	 */
	@Override
	public TthcPhanNhomHoSoVaiTro create(long id) {
		TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro = new TthcPhanNhomHoSoVaiTroImpl();

		tthcPhanNhomHoSoVaiTro.setNew(true);
		tthcPhanNhomHoSoVaiTro.setPrimaryKey(id);

		return tthcPhanNhomHoSoVaiTro;
	}

	/**
	 * Removes the tthc phan nhom ho so vai tro with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tthc phan nhom ho so vai tro
	 * @return the tthc phan nhom ho so vai tro that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException if a tthc phan nhom ho so vai tro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcPhanNhomHoSoVaiTro remove(long id)
		throws NoSuchTthcPhanNhomHoSoVaiTroException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tthc phan nhom ho so vai tro with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tthc phan nhom ho so vai tro
	 * @return the tthc phan nhom ho so vai tro that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException if a tthc phan nhom ho so vai tro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcPhanNhomHoSoVaiTro remove(Serializable primaryKey)
		throws NoSuchTthcPhanNhomHoSoVaiTroException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro = (TthcPhanNhomHoSoVaiTro)session.get(TthcPhanNhomHoSoVaiTroImpl.class,
					primaryKey);

			if (tthcPhanNhomHoSoVaiTro == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTthcPhanNhomHoSoVaiTroException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tthcPhanNhomHoSoVaiTro);
		}
		catch (NoSuchTthcPhanNhomHoSoVaiTroException nsee) {
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
	protected TthcPhanNhomHoSoVaiTro removeImpl(
		TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro)
		throws SystemException {
		tthcPhanNhomHoSoVaiTro = toUnwrappedModel(tthcPhanNhomHoSoVaiTro);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tthcPhanNhomHoSoVaiTro)) {
				tthcPhanNhomHoSoVaiTro = (TthcPhanNhomHoSoVaiTro)session.get(TthcPhanNhomHoSoVaiTroImpl.class,
						tthcPhanNhomHoSoVaiTro.getPrimaryKeyObj());
			}

			if (tthcPhanNhomHoSoVaiTro != null) {
				session.delete(tthcPhanNhomHoSoVaiTro);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tthcPhanNhomHoSoVaiTro != null) {
			clearCache(tthcPhanNhomHoSoVaiTro);
		}

		return tthcPhanNhomHoSoVaiTro;
	}

	@Override
	public TthcPhanNhomHoSoVaiTro updateImpl(
		vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro)
		throws SystemException {
		tthcPhanNhomHoSoVaiTro = toUnwrappedModel(tthcPhanNhomHoSoVaiTro);

		boolean isNew = tthcPhanNhomHoSoVaiTro.isNew();

		TthcPhanNhomHoSoVaiTroModelImpl tthcPhanNhomHoSoVaiTroModelImpl = (TthcPhanNhomHoSoVaiTroModelImpl)tthcPhanNhomHoSoVaiTro;

		Session session = null;

		try {
			session = openSession();

			if (tthcPhanNhomHoSoVaiTro.isNew()) {
				session.save(tthcPhanNhomHoSoVaiTro);

				tthcPhanNhomHoSoVaiTro.setNew(false);
			}
			else {
				session.merge(tthcPhanNhomHoSoVaiTro);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TthcPhanNhomHoSoVaiTroModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tthcPhanNhomHoSoVaiTroModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHANNHOMHOSOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcPhanNhomHoSoVaiTroModelImpl.getOriginalPhanNhomHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHANNHOMHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHANNHOMHOSOID,
					args);

				args = new Object[] {
						tthcPhanNhomHoSoVaiTroModelImpl.getPhanNhomHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHANNHOMHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHANNHOMHOSOID,
					args);
			}
		}

		EntityCacheUtil.putResult(TthcPhanNhomHoSoVaiTroModelImpl.ENTITY_CACHE_ENABLED,
			TthcPhanNhomHoSoVaiTroImpl.class,
			tthcPhanNhomHoSoVaiTro.getPrimaryKey(), tthcPhanNhomHoSoVaiTro);

		clearUniqueFindersCache(tthcPhanNhomHoSoVaiTro);
		cacheUniqueFindersCache(tthcPhanNhomHoSoVaiTro);

		return tthcPhanNhomHoSoVaiTro;
	}

	protected TthcPhanNhomHoSoVaiTro toUnwrappedModel(
		TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro) {
		if (tthcPhanNhomHoSoVaiTro instanceof TthcPhanNhomHoSoVaiTroImpl) {
			return tthcPhanNhomHoSoVaiTro;
		}

		TthcPhanNhomHoSoVaiTroImpl tthcPhanNhomHoSoVaiTroImpl = new TthcPhanNhomHoSoVaiTroImpl();

		tthcPhanNhomHoSoVaiTroImpl.setNew(tthcPhanNhomHoSoVaiTro.isNew());
		tthcPhanNhomHoSoVaiTroImpl.setPrimaryKey(tthcPhanNhomHoSoVaiTro.getPrimaryKey());

		tthcPhanNhomHoSoVaiTroImpl.setId(tthcPhanNhomHoSoVaiTro.getId());
		tthcPhanNhomHoSoVaiTroImpl.setPhanNhomHoSoId(tthcPhanNhomHoSoVaiTro.getPhanNhomHoSoId());
		tthcPhanNhomHoSoVaiTroImpl.setVaiTroXuLy(tthcPhanNhomHoSoVaiTro.getVaiTroXuLy());

		return tthcPhanNhomHoSoVaiTroImpl;
	}

	/**
	 * Returns the tthc phan nhom ho so vai tro with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc phan nhom ho so vai tro
	 * @return the tthc phan nhom ho so vai tro
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException if a tthc phan nhom ho so vai tro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcPhanNhomHoSoVaiTro findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTthcPhanNhomHoSoVaiTroException, SystemException {
		TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro = fetchByPrimaryKey(primaryKey);

		if (tthcPhanNhomHoSoVaiTro == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTthcPhanNhomHoSoVaiTroException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tthcPhanNhomHoSoVaiTro;
	}

	/**
	 * Returns the tthc phan nhom ho so vai tro with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException} if it could not be found.
	 *
	 * @param id the primary key of the tthc phan nhom ho so vai tro
	 * @return the tthc phan nhom ho so vai tro
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException if a tthc phan nhom ho so vai tro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcPhanNhomHoSoVaiTro findByPrimaryKey(long id)
		throws NoSuchTthcPhanNhomHoSoVaiTroException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tthc phan nhom ho so vai tro with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc phan nhom ho so vai tro
	 * @return the tthc phan nhom ho so vai tro, or <code>null</code> if a tthc phan nhom ho so vai tro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcPhanNhomHoSoVaiTro fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro = (TthcPhanNhomHoSoVaiTro)EntityCacheUtil.getResult(TthcPhanNhomHoSoVaiTroModelImpl.ENTITY_CACHE_ENABLED,
				TthcPhanNhomHoSoVaiTroImpl.class, primaryKey);

		if (tthcPhanNhomHoSoVaiTro == _nullTthcPhanNhomHoSoVaiTro) {
			return null;
		}

		if (tthcPhanNhomHoSoVaiTro == null) {
			Session session = null;

			try {
				session = openSession();

				tthcPhanNhomHoSoVaiTro = (TthcPhanNhomHoSoVaiTro)session.get(TthcPhanNhomHoSoVaiTroImpl.class,
						primaryKey);

				if (tthcPhanNhomHoSoVaiTro != null) {
					cacheResult(tthcPhanNhomHoSoVaiTro);
				}
				else {
					EntityCacheUtil.putResult(TthcPhanNhomHoSoVaiTroModelImpl.ENTITY_CACHE_ENABLED,
						TthcPhanNhomHoSoVaiTroImpl.class, primaryKey,
						_nullTthcPhanNhomHoSoVaiTro);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TthcPhanNhomHoSoVaiTroModelImpl.ENTITY_CACHE_ENABLED,
					TthcPhanNhomHoSoVaiTroImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tthcPhanNhomHoSoVaiTro;
	}

	/**
	 * Returns the tthc phan nhom ho so vai tro with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tthc phan nhom ho so vai tro
	 * @return the tthc phan nhom ho so vai tro, or <code>null</code> if a tthc phan nhom ho so vai tro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcPhanNhomHoSoVaiTro fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tthc phan nhom ho so vai tros.
	 *
	 * @return the tthc phan nhom ho so vai tros
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcPhanNhomHoSoVaiTro> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc phan nhom ho so vai tros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcPhanNhomHoSoVaiTroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc phan nhom ho so vai tros
	 * @param end the upper bound of the range of tthc phan nhom ho so vai tros (not inclusive)
	 * @return the range of tthc phan nhom ho so vai tros
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcPhanNhomHoSoVaiTro> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc phan nhom ho so vai tros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcPhanNhomHoSoVaiTroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc phan nhom ho so vai tros
	 * @param end the upper bound of the range of tthc phan nhom ho so vai tros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tthc phan nhom ho so vai tros
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcPhanNhomHoSoVaiTro> findAll(int start, int end,
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

		List<TthcPhanNhomHoSoVaiTro> list = (List<TthcPhanNhomHoSoVaiTro>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TTHCPHANNHOMHOSOVAITRO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TTHCPHANNHOMHOSOVAITRO;

				if (pagination) {
					sql = sql.concat(TthcPhanNhomHoSoVaiTroModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TthcPhanNhomHoSoVaiTro>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcPhanNhomHoSoVaiTro>(list);
				}
				else {
					list = (List<TthcPhanNhomHoSoVaiTro>)QueryUtil.list(q,
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
	 * Removes all the tthc phan nhom ho so vai tros from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro : findAll()) {
			remove(tthcPhanNhomHoSoVaiTro);
		}
	}

	/**
	 * Returns the number of tthc phan nhom ho so vai tros.
	 *
	 * @return the number of tthc phan nhom ho so vai tros
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

				Query q = session.createQuery(_SQL_COUNT_TTHCPHANNHOMHOSOVAITRO);

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
	 * Initializes the tthc phan nhom ho so vai tro persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSoVaiTro")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TthcPhanNhomHoSoVaiTro>> listenersList = new ArrayList<ModelListener<TthcPhanNhomHoSoVaiTro>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TthcPhanNhomHoSoVaiTro>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TthcPhanNhomHoSoVaiTroImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TTHCPHANNHOMHOSOVAITRO = "SELECT tthcPhanNhomHoSoVaiTro FROM TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro";
	private static final String _SQL_SELECT_TTHCPHANNHOMHOSOVAITRO_WHERE = "SELECT tthcPhanNhomHoSoVaiTro FROM TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro WHERE ";
	private static final String _SQL_COUNT_TTHCPHANNHOMHOSOVAITRO = "SELECT COUNT(tthcPhanNhomHoSoVaiTro) FROM TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro";
	private static final String _SQL_COUNT_TTHCPHANNHOMHOSOVAITRO_WHERE = "SELECT COUNT(tthcPhanNhomHoSoVaiTro) FROM TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tthcPhanNhomHoSoVaiTro.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TthcPhanNhomHoSoVaiTro exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TthcPhanNhomHoSoVaiTro exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TthcPhanNhomHoSoVaiTroPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"phanNhomHoSoId", "vaiTroXuLy"
			});
	private static TthcPhanNhomHoSoVaiTro _nullTthcPhanNhomHoSoVaiTro = new TthcPhanNhomHoSoVaiTroImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TthcPhanNhomHoSoVaiTro> toCacheModel() {
				return _nullTthcPhanNhomHoSoVaiTroCacheModel;
			}
		};

	private static CacheModel<TthcPhanNhomHoSoVaiTro> _nullTthcPhanNhomHoSoVaiTroCacheModel =
		new CacheModel<TthcPhanNhomHoSoVaiTro>() {
			@Override
			public TthcPhanNhomHoSoVaiTro toEntityModel() {
				return _nullTthcPhanNhomHoSoVaiTro;
			}
		};
}