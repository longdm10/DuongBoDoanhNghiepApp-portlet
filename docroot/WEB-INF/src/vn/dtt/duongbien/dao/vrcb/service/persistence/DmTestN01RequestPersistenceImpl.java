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

import vn.dtt.duongbien.dao.vrcb.NoSuchDmTestN01RequestException;
import vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmTestN01RequestImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmTestN01RequestModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm test n01 request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmTestN01RequestPersistence
 * @see DmTestN01RequestUtil
 * @generated
 */
public class DmTestN01RequestPersistenceImpl extends BasePersistenceImpl<DmTestN01Request>
	implements DmTestN01RequestPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmTestN01RequestUtil} to access the dm test n01 request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmTestN01RequestImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmTestN01RequestModelImpl.ENTITY_CACHE_ENABLED,
			DmTestN01RequestModelImpl.FINDER_CACHE_ENABLED,
			DmTestN01RequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmTestN01RequestModelImpl.ENTITY_CACHE_ENABLED,
			DmTestN01RequestModelImpl.FINDER_CACHE_ENABLED,
			DmTestN01RequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmTestN01RequestModelImpl.ENTITY_CACHE_ENABLED,
			DmTestN01RequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DmTestN01RequestPersistenceImpl() {
		setModelClass(DmTestN01Request.class);
	}

	/**
	 * Caches the dm test n01 request in the entity cache if it is enabled.
	 *
	 * @param dmTestN01Request the dm test n01 request
	 */
	@Override
	public void cacheResult(DmTestN01Request dmTestN01Request) {
		EntityCacheUtil.putResult(DmTestN01RequestModelImpl.ENTITY_CACHE_ENABLED,
			DmTestN01RequestImpl.class, dmTestN01Request.getPrimaryKey(),
			dmTestN01Request);

		dmTestN01Request.resetOriginalValues();
	}

	/**
	 * Caches the dm test n01 requests in the entity cache if it is enabled.
	 *
	 * @param dmTestN01Requests the dm test n01 requests
	 */
	@Override
	public void cacheResult(List<DmTestN01Request> dmTestN01Requests) {
		for (DmTestN01Request dmTestN01Request : dmTestN01Requests) {
			if (EntityCacheUtil.getResult(
						DmTestN01RequestModelImpl.ENTITY_CACHE_ENABLED,
						DmTestN01RequestImpl.class,
						dmTestN01Request.getPrimaryKey()) == null) {
				cacheResult(dmTestN01Request);
			}
			else {
				dmTestN01Request.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm test n01 requests.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmTestN01RequestImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmTestN01RequestImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm test n01 request.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmTestN01Request dmTestN01Request) {
		EntityCacheUtil.removeResult(DmTestN01RequestModelImpl.ENTITY_CACHE_ENABLED,
			DmTestN01RequestImpl.class, dmTestN01Request.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DmTestN01Request> dmTestN01Requests) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmTestN01Request dmTestN01Request : dmTestN01Requests) {
			EntityCacheUtil.removeResult(DmTestN01RequestModelImpl.ENTITY_CACHE_ENABLED,
				DmTestN01RequestImpl.class, dmTestN01Request.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dm test n01 request with the primary key. Does not add the dm test n01 request to the database.
	 *
	 * @param requestID the primary key for the new dm test n01 request
	 * @return the new dm test n01 request
	 */
	@Override
	public DmTestN01Request create(int requestID) {
		DmTestN01Request dmTestN01Request = new DmTestN01RequestImpl();

		dmTestN01Request.setNew(true);
		dmTestN01Request.setPrimaryKey(requestID);

		return dmTestN01Request;
	}

	/**
	 * Removes the dm test n01 request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param requestID the primary key of the dm test n01 request
	 * @return the dm test n01 request that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmTestN01RequestException if a dm test n01 request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmTestN01Request remove(int requestID)
		throws NoSuchDmTestN01RequestException, SystemException {
		return remove((Serializable)requestID);
	}

	/**
	 * Removes the dm test n01 request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm test n01 request
	 * @return the dm test n01 request that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmTestN01RequestException if a dm test n01 request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmTestN01Request remove(Serializable primaryKey)
		throws NoSuchDmTestN01RequestException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmTestN01Request dmTestN01Request = (DmTestN01Request)session.get(DmTestN01RequestImpl.class,
					primaryKey);

			if (dmTestN01Request == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmTestN01RequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmTestN01Request);
		}
		catch (NoSuchDmTestN01RequestException nsee) {
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
	protected DmTestN01Request removeImpl(DmTestN01Request dmTestN01Request)
		throws SystemException {
		dmTestN01Request = toUnwrappedModel(dmTestN01Request);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmTestN01Request)) {
				dmTestN01Request = (DmTestN01Request)session.get(DmTestN01RequestImpl.class,
						dmTestN01Request.getPrimaryKeyObj());
			}

			if (dmTestN01Request != null) {
				session.delete(dmTestN01Request);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmTestN01Request != null) {
			clearCache(dmTestN01Request);
		}

		return dmTestN01Request;
	}

	@Override
	public DmTestN01Request updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request dmTestN01Request)
		throws SystemException {
		dmTestN01Request = toUnwrappedModel(dmTestN01Request);

		boolean isNew = dmTestN01Request.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dmTestN01Request.isNew()) {
				session.save(dmTestN01Request);

				dmTestN01Request.setNew(false);
			}
			else {
				session.merge(dmTestN01Request);
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

		EntityCacheUtil.putResult(DmTestN01RequestModelImpl.ENTITY_CACHE_ENABLED,
			DmTestN01RequestImpl.class, dmTestN01Request.getPrimaryKey(),
			dmTestN01Request);

		return dmTestN01Request;
	}

	protected DmTestN01Request toUnwrappedModel(
		DmTestN01Request dmTestN01Request) {
		if (dmTestN01Request instanceof DmTestN01RequestImpl) {
			return dmTestN01Request;
		}

		DmTestN01RequestImpl dmTestN01RequestImpl = new DmTestN01RequestImpl();

		dmTestN01RequestImpl.setNew(dmTestN01Request.isNew());
		dmTestN01RequestImpl.setPrimaryKey(dmTestN01Request.getPrimaryKey());

		dmTestN01RequestImpl.setRequestID(dmTestN01Request.getRequestID());
		dmTestN01RequestImpl.setEnterpriseCode(dmTestN01Request.getEnterpriseCode());
		dmTestN01RequestImpl.setTenDuAn(dmTestN01Request.getTenDuAn());
		dmTestN01RequestImpl.setSuCanThietDauTu(dmTestN01Request.getSuCanThietDauTu());
		dmTestN01RequestImpl.setViTri(dmTestN01Request.getViTri());
		dmTestN01RequestImpl.setLoaiTauBienGioiHanVaoCang(dmTestN01Request.getLoaiTauBienGioiHanVaoCang());
		dmTestN01RequestImpl.setSoLuongCauCang(dmTestN01Request.getSoLuongCauCang());
		dmTestN01RequestImpl.setTongDienTichXayDungDuKien(dmTestN01Request.getTongDienTichXayDungDuKien());
		dmTestN01RequestImpl.setTaiLieulienQuan(dmTestN01Request.getTaiLieulienQuan());
		dmTestN01RequestImpl.setModifiedDate(dmTestN01Request.getModifiedDate());
		dmTestN01RequestImpl.setModifiedUser(dmTestN01Request.getModifiedUser());
		dmTestN01RequestImpl.setIsAuthorized(dmTestN01Request.getIsAuthorized());
		dmTestN01RequestImpl.setAuthorizedDate(dmTestN01Request.getAuthorizedDate());
		dmTestN01RequestImpl.setAuthorizedUser(dmTestN01Request.getAuthorizedUser());

		return dmTestN01RequestImpl;
	}

	/**
	 * Returns the dm test n01 request with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm test n01 request
	 * @return the dm test n01 request
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmTestN01RequestException if a dm test n01 request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmTestN01Request findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmTestN01RequestException, SystemException {
		DmTestN01Request dmTestN01Request = fetchByPrimaryKey(primaryKey);

		if (dmTestN01Request == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmTestN01RequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmTestN01Request;
	}

	/**
	 * Returns the dm test n01 request with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmTestN01RequestException} if it could not be found.
	 *
	 * @param requestID the primary key of the dm test n01 request
	 * @return the dm test n01 request
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmTestN01RequestException if a dm test n01 request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmTestN01Request findByPrimaryKey(int requestID)
		throws NoSuchDmTestN01RequestException, SystemException {
		return findByPrimaryKey((Serializable)requestID);
	}

	/**
	 * Returns the dm test n01 request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm test n01 request
	 * @return the dm test n01 request, or <code>null</code> if a dm test n01 request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmTestN01Request fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmTestN01Request dmTestN01Request = (DmTestN01Request)EntityCacheUtil.getResult(DmTestN01RequestModelImpl.ENTITY_CACHE_ENABLED,
				DmTestN01RequestImpl.class, primaryKey);

		if (dmTestN01Request == _nullDmTestN01Request) {
			return null;
		}

		if (dmTestN01Request == null) {
			Session session = null;

			try {
				session = openSession();

				dmTestN01Request = (DmTestN01Request)session.get(DmTestN01RequestImpl.class,
						primaryKey);

				if (dmTestN01Request != null) {
					cacheResult(dmTestN01Request);
				}
				else {
					EntityCacheUtil.putResult(DmTestN01RequestModelImpl.ENTITY_CACHE_ENABLED,
						DmTestN01RequestImpl.class, primaryKey,
						_nullDmTestN01Request);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmTestN01RequestModelImpl.ENTITY_CACHE_ENABLED,
					DmTestN01RequestImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmTestN01Request;
	}

	/**
	 * Returns the dm test n01 request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param requestID the primary key of the dm test n01 request
	 * @return the dm test n01 request, or <code>null</code> if a dm test n01 request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmTestN01Request fetchByPrimaryKey(int requestID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)requestID);
	}

	/**
	 * Returns all the dm test n01 requests.
	 *
	 * @return the dm test n01 requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmTestN01Request> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm test n01 requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmTestN01RequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm test n01 requests
	 * @param end the upper bound of the range of dm test n01 requests (not inclusive)
	 * @return the range of dm test n01 requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmTestN01Request> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm test n01 requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmTestN01RequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm test n01 requests
	 * @param end the upper bound of the range of dm test n01 requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm test n01 requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmTestN01Request> findAll(int start, int end,
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

		List<DmTestN01Request> list = (List<DmTestN01Request>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMTESTN01REQUEST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMTESTN01REQUEST;

				if (pagination) {
					sql = sql.concat(DmTestN01RequestModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmTestN01Request>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmTestN01Request>(list);
				}
				else {
					list = (List<DmTestN01Request>)QueryUtil.list(q,
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
	 * Removes all the dm test n01 requests from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmTestN01Request dmTestN01Request : findAll()) {
			remove(dmTestN01Request);
		}
	}

	/**
	 * Returns the number of dm test n01 requests.
	 *
	 * @return the number of dm test n01 requests
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

				Query q = session.createQuery(_SQL_COUNT_DMTESTN01REQUEST);

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
	 * Initializes the dm test n01 request persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmTestN01Request>> listenersList = new ArrayList<ModelListener<DmTestN01Request>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmTestN01Request>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmTestN01RequestImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMTESTN01REQUEST = "SELECT dmTestN01Request FROM DmTestN01Request dmTestN01Request";
	private static final String _SQL_COUNT_DMTESTN01REQUEST = "SELECT COUNT(dmTestN01Request) FROM DmTestN01Request dmTestN01Request";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmTestN01Request.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmTestN01Request exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmTestN01RequestPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"requestID", "enterpriseCode", "tenDuAn", "suCanThietDauTu",
				"viTri", "loaiTauBienGioiHanVaoCang", "soLuongCauCang",
				"tongDienTichXayDungDuKien", "taiLieulienQuan", "modifiedDate",
				"authorizedDate", "authorizedUser"
			});
	private static DmTestN01Request _nullDmTestN01Request = new DmTestN01RequestImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmTestN01Request> toCacheModel() {
				return _nullDmTestN01RequestCacheModel;
			}
		};

	private static CacheModel<DmTestN01Request> _nullDmTestN01RequestCacheModel = new CacheModel<DmTestN01Request>() {
			@Override
			public DmTestN01Request toEntityModel() {
				return _nullDmTestN01Request;
			}
		};
}