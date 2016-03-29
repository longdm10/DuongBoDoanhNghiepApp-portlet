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

package vn.dtt.duongbo.dao.thanhtoan.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcYeuCauThanhToanException;
import vn.dtt.duongbo.dao.thanhtoan.model.TthcYeuCauThanhToan;
import vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcYeuCauThanhToanImpl;
import vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcYeuCauThanhToanModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tthc yeu cau thanh toan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcYeuCauThanhToanPersistence
 * @see TthcYeuCauThanhToanUtil
 * @generated
 */
public class TthcYeuCauThanhToanPersistenceImpl extends BasePersistenceImpl<TthcYeuCauThanhToan>
	implements TthcYeuCauThanhToanPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TthcYeuCauThanhToanUtil} to access the tthc yeu cau thanh toan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TthcYeuCauThanhToanImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TthcYeuCauThanhToanModelImpl.ENTITY_CACHE_ENABLED,
			TthcYeuCauThanhToanModelImpl.FINDER_CACHE_ENABLED,
			TthcYeuCauThanhToanImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TthcYeuCauThanhToanModelImpl.ENTITY_CACHE_ENABLED,
			TthcYeuCauThanhToanModelImpl.FINDER_CACHE_ENABLED,
			TthcYeuCauThanhToanImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TthcYeuCauThanhToanModelImpl.ENTITY_CACHE_ENABLED,
			TthcYeuCauThanhToanModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TthcYeuCauThanhToanPersistenceImpl() {
		setModelClass(TthcYeuCauThanhToan.class);
	}

	/**
	 * Caches the tthc yeu cau thanh toan in the entity cache if it is enabled.
	 *
	 * @param tthcYeuCauThanhToan the tthc yeu cau thanh toan
	 */
	@Override
	public void cacheResult(TthcYeuCauThanhToan tthcYeuCauThanhToan) {
		EntityCacheUtil.putResult(TthcYeuCauThanhToanModelImpl.ENTITY_CACHE_ENABLED,
			TthcYeuCauThanhToanImpl.class, tthcYeuCauThanhToan.getPrimaryKey(),
			tthcYeuCauThanhToan);

		tthcYeuCauThanhToan.resetOriginalValues();
	}

	/**
	 * Caches the tthc yeu cau thanh toans in the entity cache if it is enabled.
	 *
	 * @param tthcYeuCauThanhToans the tthc yeu cau thanh toans
	 */
	@Override
	public void cacheResult(List<TthcYeuCauThanhToan> tthcYeuCauThanhToans) {
		for (TthcYeuCauThanhToan tthcYeuCauThanhToan : tthcYeuCauThanhToans) {
			if (EntityCacheUtil.getResult(
						TthcYeuCauThanhToanModelImpl.ENTITY_CACHE_ENABLED,
						TthcYeuCauThanhToanImpl.class,
						tthcYeuCauThanhToan.getPrimaryKey()) == null) {
				cacheResult(tthcYeuCauThanhToan);
			}
			else {
				tthcYeuCauThanhToan.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tthc yeu cau thanh toans.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TthcYeuCauThanhToanImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TthcYeuCauThanhToanImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tthc yeu cau thanh toan.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TthcYeuCauThanhToan tthcYeuCauThanhToan) {
		EntityCacheUtil.removeResult(TthcYeuCauThanhToanModelImpl.ENTITY_CACHE_ENABLED,
			TthcYeuCauThanhToanImpl.class, tthcYeuCauThanhToan.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TthcYeuCauThanhToan> tthcYeuCauThanhToans) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TthcYeuCauThanhToan tthcYeuCauThanhToan : tthcYeuCauThanhToans) {
			EntityCacheUtil.removeResult(TthcYeuCauThanhToanModelImpl.ENTITY_CACHE_ENABLED,
				TthcYeuCauThanhToanImpl.class,
				tthcYeuCauThanhToan.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tthc yeu cau thanh toan with the primary key. Does not add the tthc yeu cau thanh toan to the database.
	 *
	 * @param id the primary key for the new tthc yeu cau thanh toan
	 * @return the new tthc yeu cau thanh toan
	 */
	@Override
	public TthcYeuCauThanhToan create(long id) {
		TthcYeuCauThanhToan tthcYeuCauThanhToan = new TthcYeuCauThanhToanImpl();

		tthcYeuCauThanhToan.setNew(true);
		tthcYeuCauThanhToan.setPrimaryKey(id);

		return tthcYeuCauThanhToan;
	}

	/**
	 * Removes the tthc yeu cau thanh toan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tthc yeu cau thanh toan
	 * @return the tthc yeu cau thanh toan that was removed
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcYeuCauThanhToanException if a tthc yeu cau thanh toan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcYeuCauThanhToan remove(long id)
		throws NoSuchTthcYeuCauThanhToanException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tthc yeu cau thanh toan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tthc yeu cau thanh toan
	 * @return the tthc yeu cau thanh toan that was removed
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcYeuCauThanhToanException if a tthc yeu cau thanh toan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcYeuCauThanhToan remove(Serializable primaryKey)
		throws NoSuchTthcYeuCauThanhToanException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TthcYeuCauThanhToan tthcYeuCauThanhToan = (TthcYeuCauThanhToan)session.get(TthcYeuCauThanhToanImpl.class,
					primaryKey);

			if (tthcYeuCauThanhToan == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTthcYeuCauThanhToanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tthcYeuCauThanhToan);
		}
		catch (NoSuchTthcYeuCauThanhToanException nsee) {
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
	protected TthcYeuCauThanhToan removeImpl(
		TthcYeuCauThanhToan tthcYeuCauThanhToan) throws SystemException {
		tthcYeuCauThanhToan = toUnwrappedModel(tthcYeuCauThanhToan);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tthcYeuCauThanhToan)) {
				tthcYeuCauThanhToan = (TthcYeuCauThanhToan)session.get(TthcYeuCauThanhToanImpl.class,
						tthcYeuCauThanhToan.getPrimaryKeyObj());
			}

			if (tthcYeuCauThanhToan != null) {
				session.delete(tthcYeuCauThanhToan);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tthcYeuCauThanhToan != null) {
			clearCache(tthcYeuCauThanhToan);
		}

		return tthcYeuCauThanhToan;
	}

	@Override
	public TthcYeuCauThanhToan updateImpl(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcYeuCauThanhToan tthcYeuCauThanhToan)
		throws SystemException {
		tthcYeuCauThanhToan = toUnwrappedModel(tthcYeuCauThanhToan);

		boolean isNew = tthcYeuCauThanhToan.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tthcYeuCauThanhToan.isNew()) {
				session.save(tthcYeuCauThanhToan);

				tthcYeuCauThanhToan.setNew(false);
			}
			else {
				session.merge(tthcYeuCauThanhToan);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(TthcYeuCauThanhToanModelImpl.ENTITY_CACHE_ENABLED,
			TthcYeuCauThanhToanImpl.class, tthcYeuCauThanhToan.getPrimaryKey(),
			tthcYeuCauThanhToan);

		return tthcYeuCauThanhToan;
	}

	protected TthcYeuCauThanhToan toUnwrappedModel(
		TthcYeuCauThanhToan tthcYeuCauThanhToan) {
		if (tthcYeuCauThanhToan instanceof TthcYeuCauThanhToanImpl) {
			return tthcYeuCauThanhToan;
		}

		TthcYeuCauThanhToanImpl tthcYeuCauThanhToanImpl = new TthcYeuCauThanhToanImpl();

		tthcYeuCauThanhToanImpl.setNew(tthcYeuCauThanhToan.isNew());
		tthcYeuCauThanhToanImpl.setPrimaryKey(tthcYeuCauThanhToan.getPrimaryKey());

		tthcYeuCauThanhToanImpl.setId(tthcYeuCauThanhToan.getId());
		tthcYeuCauThanhToanImpl.setMaSoYeuCau(tthcYeuCauThanhToan.getMaSoYeuCau());
		tthcYeuCauThanhToanImpl.setSoTien(tthcYeuCauThanhToan.getSoTien());
		tthcYeuCauThanhToanImpl.setChiTietYeuCau(tthcYeuCauThanhToan.getChiTietYeuCau());
		tthcYeuCauThanhToanImpl.setNgayTao(tthcYeuCauThanhToan.getNgayTao());
		tthcYeuCauThanhToanImpl.setNguoiTao(tthcYeuCauThanhToan.getNguoiTao());
		tthcYeuCauThanhToanImpl.setToChucQuanLy(tthcYeuCauThanhToan.getToChucQuanLy());
		tthcYeuCauThanhToanImpl.setHoSoThuTucId(tthcYeuCauThanhToan.getHoSoThuTucId());
		tthcYeuCauThanhToanImpl.setXacNhanThanhToanId(tthcYeuCauThanhToan.getXacNhanThanhToanId());

		return tthcYeuCauThanhToanImpl;
	}

	/**
	 * Returns the tthc yeu cau thanh toan with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc yeu cau thanh toan
	 * @return the tthc yeu cau thanh toan
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcYeuCauThanhToanException if a tthc yeu cau thanh toan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcYeuCauThanhToan findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTthcYeuCauThanhToanException, SystemException {
		TthcYeuCauThanhToan tthcYeuCauThanhToan = fetchByPrimaryKey(primaryKey);

		if (tthcYeuCauThanhToan == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTthcYeuCauThanhToanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tthcYeuCauThanhToan;
	}

	/**
	 * Returns the tthc yeu cau thanh toan with the primary key or throws a {@link vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcYeuCauThanhToanException} if it could not be found.
	 *
	 * @param id the primary key of the tthc yeu cau thanh toan
	 * @return the tthc yeu cau thanh toan
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcYeuCauThanhToanException if a tthc yeu cau thanh toan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcYeuCauThanhToan findByPrimaryKey(long id)
		throws NoSuchTthcYeuCauThanhToanException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tthc yeu cau thanh toan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc yeu cau thanh toan
	 * @return the tthc yeu cau thanh toan, or <code>null</code> if a tthc yeu cau thanh toan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcYeuCauThanhToan fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TthcYeuCauThanhToan tthcYeuCauThanhToan = (TthcYeuCauThanhToan)EntityCacheUtil.getResult(TthcYeuCauThanhToanModelImpl.ENTITY_CACHE_ENABLED,
				TthcYeuCauThanhToanImpl.class, primaryKey);

		if (tthcYeuCauThanhToan == _nullTthcYeuCauThanhToan) {
			return null;
		}

		if (tthcYeuCauThanhToan == null) {
			Session session = null;

			try {
				session = openSession();

				tthcYeuCauThanhToan = (TthcYeuCauThanhToan)session.get(TthcYeuCauThanhToanImpl.class,
						primaryKey);

				if (tthcYeuCauThanhToan != null) {
					cacheResult(tthcYeuCauThanhToan);
				}
				else {
					EntityCacheUtil.putResult(TthcYeuCauThanhToanModelImpl.ENTITY_CACHE_ENABLED,
						TthcYeuCauThanhToanImpl.class, primaryKey,
						_nullTthcYeuCauThanhToan);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TthcYeuCauThanhToanModelImpl.ENTITY_CACHE_ENABLED,
					TthcYeuCauThanhToanImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tthcYeuCauThanhToan;
	}

	/**
	 * Returns the tthc yeu cau thanh toan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tthc yeu cau thanh toan
	 * @return the tthc yeu cau thanh toan, or <code>null</code> if a tthc yeu cau thanh toan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcYeuCauThanhToan fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tthc yeu cau thanh toans.
	 *
	 * @return the tthc yeu cau thanh toans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcYeuCauThanhToan> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc yeu cau thanh toans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcYeuCauThanhToanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc yeu cau thanh toans
	 * @param end the upper bound of the range of tthc yeu cau thanh toans (not inclusive)
	 * @return the range of tthc yeu cau thanh toans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcYeuCauThanhToan> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc yeu cau thanh toans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcYeuCauThanhToanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc yeu cau thanh toans
	 * @param end the upper bound of the range of tthc yeu cau thanh toans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tthc yeu cau thanh toans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcYeuCauThanhToan> findAll(int start, int end,
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

		List<TthcYeuCauThanhToan> list = (List<TthcYeuCauThanhToan>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TTHCYEUCAUTHANHTOAN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TTHCYEUCAUTHANHTOAN;

				if (pagination) {
					sql = sql.concat(TthcYeuCauThanhToanModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TthcYeuCauThanhToan>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcYeuCauThanhToan>(list);
				}
				else {
					list = (List<TthcYeuCauThanhToan>)QueryUtil.list(q,
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
	 * Removes all the tthc yeu cau thanh toans from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TthcYeuCauThanhToan tthcYeuCauThanhToan : findAll()) {
			remove(tthcYeuCauThanhToan);
		}
	}

	/**
	 * Returns the number of tthc yeu cau thanh toans.
	 *
	 * @return the number of tthc yeu cau thanh toans
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

				Query q = session.createQuery(_SQL_COUNT_TTHCYEUCAUTHANHTOAN);

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
	 * Initializes the tthc yeu cau thanh toan persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.thanhtoan.model.TthcYeuCauThanhToan")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TthcYeuCauThanhToan>> listenersList = new ArrayList<ModelListener<TthcYeuCauThanhToan>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TthcYeuCauThanhToan>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TthcYeuCauThanhToanImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TTHCYEUCAUTHANHTOAN = "SELECT tthcYeuCauThanhToan FROM TthcYeuCauThanhToan tthcYeuCauThanhToan";
	private static final String _SQL_COUNT_TTHCYEUCAUTHANHTOAN = "SELECT COUNT(tthcYeuCauThanhToan) FROM TthcYeuCauThanhToan tthcYeuCauThanhToan";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tthcYeuCauThanhToan.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TthcYeuCauThanhToan exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TthcYeuCauThanhToanPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"maSoYeuCau", "soTien", "chiTietYeuCau", "ngayTao", "nguoiTao",
				"toChucQuanLy", "hoSoThuTucId", "xacNhanThanhToanId"
			});
	private static TthcYeuCauThanhToan _nullTthcYeuCauThanhToan = new TthcYeuCauThanhToanImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TthcYeuCauThanhToan> toCacheModel() {
				return _nullTthcYeuCauThanhToanCacheModel;
			}
		};

	private static CacheModel<TthcYeuCauThanhToan> _nullTthcYeuCauThanhToanCacheModel =
		new CacheModel<TthcYeuCauThanhToan>() {
			@Override
			public TthcYeuCauThanhToan toEntityModel() {
				return _nullTthcYeuCauThanhToan;
			}
		};
}