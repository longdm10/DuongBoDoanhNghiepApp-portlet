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

import vn.dtt.duongbo.dao.motcua.NoSuchMotCuaNhanTraHoSoException;
import vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo;
import vn.dtt.duongbo.dao.motcua.model.impl.MotCuaNhanTraHoSoImpl;
import vn.dtt.duongbo.dao.motcua.model.impl.MotCuaNhanTraHoSoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the mot cua nhan tra ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaNhanTraHoSoPersistence
 * @see MotCuaNhanTraHoSoUtil
 * @generated
 */
public class MotCuaNhanTraHoSoPersistenceImpl extends BasePersistenceImpl<MotCuaNhanTraHoSo>
	implements MotCuaNhanTraHoSoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MotCuaNhanTraHoSoUtil} to access the mot cua nhan tra ho so persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MotCuaNhanTraHoSoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MotCuaNhanTraHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaNhanTraHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaNhanTraHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MotCuaNhanTraHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaNhanTraHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaNhanTraHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MotCuaNhanTraHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaNhanTraHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public MotCuaNhanTraHoSoPersistenceImpl() {
		setModelClass(MotCuaNhanTraHoSo.class);
	}

	/**
	 * Caches the mot cua nhan tra ho so in the entity cache if it is enabled.
	 *
	 * @param motCuaNhanTraHoSo the mot cua nhan tra ho so
	 */
	@Override
	public void cacheResult(MotCuaNhanTraHoSo motCuaNhanTraHoSo) {
		EntityCacheUtil.putResult(MotCuaNhanTraHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaNhanTraHoSoImpl.class, motCuaNhanTraHoSo.getPrimaryKey(),
			motCuaNhanTraHoSo);

		motCuaNhanTraHoSo.resetOriginalValues();
	}

	/**
	 * Caches the mot cua nhan tra ho sos in the entity cache if it is enabled.
	 *
	 * @param motCuaNhanTraHoSos the mot cua nhan tra ho sos
	 */
	@Override
	public void cacheResult(List<MotCuaNhanTraHoSo> motCuaNhanTraHoSos) {
		for (MotCuaNhanTraHoSo motCuaNhanTraHoSo : motCuaNhanTraHoSos) {
			if (EntityCacheUtil.getResult(
						MotCuaNhanTraHoSoModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaNhanTraHoSoImpl.class,
						motCuaNhanTraHoSo.getPrimaryKey()) == null) {
				cacheResult(motCuaNhanTraHoSo);
			}
			else {
				motCuaNhanTraHoSo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all mot cua nhan tra ho sos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MotCuaNhanTraHoSoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MotCuaNhanTraHoSoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the mot cua nhan tra ho so.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MotCuaNhanTraHoSo motCuaNhanTraHoSo) {
		EntityCacheUtil.removeResult(MotCuaNhanTraHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaNhanTraHoSoImpl.class, motCuaNhanTraHoSo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<MotCuaNhanTraHoSo> motCuaNhanTraHoSos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MotCuaNhanTraHoSo motCuaNhanTraHoSo : motCuaNhanTraHoSos) {
			EntityCacheUtil.removeResult(MotCuaNhanTraHoSoModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaNhanTraHoSoImpl.class, motCuaNhanTraHoSo.getPrimaryKey());
		}
	}

	/**
	 * Creates a new mot cua nhan tra ho so with the primary key. Does not add the mot cua nhan tra ho so to the database.
	 *
	 * @param id the primary key for the new mot cua nhan tra ho so
	 * @return the new mot cua nhan tra ho so
	 */
	@Override
	public MotCuaNhanTraHoSo create(long id) {
		MotCuaNhanTraHoSo motCuaNhanTraHoSo = new MotCuaNhanTraHoSoImpl();

		motCuaNhanTraHoSo.setNew(true);
		motCuaNhanTraHoSo.setPrimaryKey(id);

		return motCuaNhanTraHoSo;
	}

	/**
	 * Removes the mot cua nhan tra ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the mot cua nhan tra ho so
	 * @return the mot cua nhan tra ho so that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaNhanTraHoSoException if a mot cua nhan tra ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaNhanTraHoSo remove(long id)
		throws NoSuchMotCuaNhanTraHoSoException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the mot cua nhan tra ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mot cua nhan tra ho so
	 * @return the mot cua nhan tra ho so that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaNhanTraHoSoException if a mot cua nhan tra ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaNhanTraHoSo remove(Serializable primaryKey)
		throws NoSuchMotCuaNhanTraHoSoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MotCuaNhanTraHoSo motCuaNhanTraHoSo = (MotCuaNhanTraHoSo)session.get(MotCuaNhanTraHoSoImpl.class,
					primaryKey);

			if (motCuaNhanTraHoSo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMotCuaNhanTraHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(motCuaNhanTraHoSo);
		}
		catch (NoSuchMotCuaNhanTraHoSoException nsee) {
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
	protected MotCuaNhanTraHoSo removeImpl(MotCuaNhanTraHoSo motCuaNhanTraHoSo)
		throws SystemException {
		motCuaNhanTraHoSo = toUnwrappedModel(motCuaNhanTraHoSo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(motCuaNhanTraHoSo)) {
				motCuaNhanTraHoSo = (MotCuaNhanTraHoSo)session.get(MotCuaNhanTraHoSoImpl.class,
						motCuaNhanTraHoSo.getPrimaryKeyObj());
			}

			if (motCuaNhanTraHoSo != null) {
				session.delete(motCuaNhanTraHoSo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (motCuaNhanTraHoSo != null) {
			clearCache(motCuaNhanTraHoSo);
		}

		return motCuaNhanTraHoSo;
	}

	@Override
	public MotCuaNhanTraHoSo updateImpl(
		vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo motCuaNhanTraHoSo)
		throws SystemException {
		motCuaNhanTraHoSo = toUnwrappedModel(motCuaNhanTraHoSo);

		boolean isNew = motCuaNhanTraHoSo.isNew();

		Session session = null;

		try {
			session = openSession();

			if (motCuaNhanTraHoSo.isNew()) {
				session.save(motCuaNhanTraHoSo);

				motCuaNhanTraHoSo.setNew(false);
			}
			else {
				session.merge(motCuaNhanTraHoSo);
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

		EntityCacheUtil.putResult(MotCuaNhanTraHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaNhanTraHoSoImpl.class, motCuaNhanTraHoSo.getPrimaryKey(),
			motCuaNhanTraHoSo);

		return motCuaNhanTraHoSo;
	}

	protected MotCuaNhanTraHoSo toUnwrappedModel(
		MotCuaNhanTraHoSo motCuaNhanTraHoSo) {
		if (motCuaNhanTraHoSo instanceof MotCuaNhanTraHoSoImpl) {
			return motCuaNhanTraHoSo;
		}

		MotCuaNhanTraHoSoImpl motCuaNhanTraHoSoImpl = new MotCuaNhanTraHoSoImpl();

		motCuaNhanTraHoSoImpl.setNew(motCuaNhanTraHoSo.isNew());
		motCuaNhanTraHoSoImpl.setPrimaryKey(motCuaNhanTraHoSo.getPrimaryKey());

		motCuaNhanTraHoSoImpl.setId(motCuaNhanTraHoSo.getId());
		motCuaNhanTraHoSoImpl.setHoSoThuTucId(motCuaNhanTraHoSo.getHoSoThuTucId());
		motCuaNhanTraHoSoImpl.setTenNguoiNop(motCuaNhanTraHoSo.getTenNguoiNop());
		motCuaNhanTraHoSoImpl.setCmndNguoiNop(motCuaNhanTraHoSo.getCmndNguoiNop());
		motCuaNhanTraHoSoImpl.setDiaChiNguoiNop(motCuaNhanTraHoSo.getDiaChiNguoiNop());
		motCuaNhanTraHoSoImpl.setSoDienThoaiNguoiNop(motCuaNhanTraHoSo.getSoDienThoaiNguoiNop());
		motCuaNhanTraHoSoImpl.setEmailNguoiNop(motCuaNhanTraHoSo.getEmailNguoiNop());

		return motCuaNhanTraHoSoImpl;
	}

	/**
	 * Returns the mot cua nhan tra ho so with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua nhan tra ho so
	 * @return the mot cua nhan tra ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaNhanTraHoSoException if a mot cua nhan tra ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaNhanTraHoSo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMotCuaNhanTraHoSoException, SystemException {
		MotCuaNhanTraHoSo motCuaNhanTraHoSo = fetchByPrimaryKey(primaryKey);

		if (motCuaNhanTraHoSo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMotCuaNhanTraHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return motCuaNhanTraHoSo;
	}

	/**
	 * Returns the mot cua nhan tra ho so with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaNhanTraHoSoException} if it could not be found.
	 *
	 * @param id the primary key of the mot cua nhan tra ho so
	 * @return the mot cua nhan tra ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaNhanTraHoSoException if a mot cua nhan tra ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaNhanTraHoSo findByPrimaryKey(long id)
		throws NoSuchMotCuaNhanTraHoSoException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the mot cua nhan tra ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua nhan tra ho so
	 * @return the mot cua nhan tra ho so, or <code>null</code> if a mot cua nhan tra ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaNhanTraHoSo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MotCuaNhanTraHoSo motCuaNhanTraHoSo = (MotCuaNhanTraHoSo)EntityCacheUtil.getResult(MotCuaNhanTraHoSoModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaNhanTraHoSoImpl.class, primaryKey);

		if (motCuaNhanTraHoSo == _nullMotCuaNhanTraHoSo) {
			return null;
		}

		if (motCuaNhanTraHoSo == null) {
			Session session = null;

			try {
				session = openSession();

				motCuaNhanTraHoSo = (MotCuaNhanTraHoSo)session.get(MotCuaNhanTraHoSoImpl.class,
						primaryKey);

				if (motCuaNhanTraHoSo != null) {
					cacheResult(motCuaNhanTraHoSo);
				}
				else {
					EntityCacheUtil.putResult(MotCuaNhanTraHoSoModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaNhanTraHoSoImpl.class, primaryKey,
						_nullMotCuaNhanTraHoSo);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MotCuaNhanTraHoSoModelImpl.ENTITY_CACHE_ENABLED,
					MotCuaNhanTraHoSoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return motCuaNhanTraHoSo;
	}

	/**
	 * Returns the mot cua nhan tra ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the mot cua nhan tra ho so
	 * @return the mot cua nhan tra ho so, or <code>null</code> if a mot cua nhan tra ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaNhanTraHoSo fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the mot cua nhan tra ho sos.
	 *
	 * @return the mot cua nhan tra ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaNhanTraHoSo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua nhan tra ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaNhanTraHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua nhan tra ho sos
	 * @param end the upper bound of the range of mot cua nhan tra ho sos (not inclusive)
	 * @return the range of mot cua nhan tra ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaNhanTraHoSo> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua nhan tra ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaNhanTraHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua nhan tra ho sos
	 * @param end the upper bound of the range of mot cua nhan tra ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mot cua nhan tra ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaNhanTraHoSo> findAll(int start, int end,
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

		List<MotCuaNhanTraHoSo> list = (List<MotCuaNhanTraHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MOTCUANHANTRAHOSO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MOTCUANHANTRAHOSO;

				if (pagination) {
					sql = sql.concat(MotCuaNhanTraHoSoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MotCuaNhanTraHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaNhanTraHoSo>(list);
				}
				else {
					list = (List<MotCuaNhanTraHoSo>)QueryUtil.list(q,
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
	 * Removes all the mot cua nhan tra ho sos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MotCuaNhanTraHoSo motCuaNhanTraHoSo : findAll()) {
			remove(motCuaNhanTraHoSo);
		}
	}

	/**
	 * Returns the number of mot cua nhan tra ho sos.
	 *
	 * @return the number of mot cua nhan tra ho sos
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

				Query q = session.createQuery(_SQL_COUNT_MOTCUANHANTRAHOSO);

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
	 * Initializes the mot cua nhan tra ho so persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MotCuaNhanTraHoSo>> listenersList = new ArrayList<ModelListener<MotCuaNhanTraHoSo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MotCuaNhanTraHoSo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MotCuaNhanTraHoSoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MOTCUANHANTRAHOSO = "SELECT motCuaNhanTraHoSo FROM MotCuaNhanTraHoSo motCuaNhanTraHoSo";
	private static final String _SQL_COUNT_MOTCUANHANTRAHOSO = "SELECT COUNT(motCuaNhanTraHoSo) FROM MotCuaNhanTraHoSo motCuaNhanTraHoSo";
	private static final String _ORDER_BY_ENTITY_ALIAS = "motCuaNhanTraHoSo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MotCuaNhanTraHoSo exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MotCuaNhanTraHoSoPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"hoSoThuTucId", "tenNguoiNop", "cmndNguoiNop", "diaChiNguoiNop",
				"soDienThoaiNguoiNop", "emailNguoiNop"
			});
	private static MotCuaNhanTraHoSo _nullMotCuaNhanTraHoSo = new MotCuaNhanTraHoSoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MotCuaNhanTraHoSo> toCacheModel() {
				return _nullMotCuaNhanTraHoSoCacheModel;
			}
		};

	private static CacheModel<MotCuaNhanTraHoSo> _nullMotCuaNhanTraHoSoCacheModel =
		new CacheModel<MotCuaNhanTraHoSo>() {
			@Override
			public MotCuaNhanTraHoSo toEntityModel() {
				return _nullMotCuaNhanTraHoSo;
			}
		};
}