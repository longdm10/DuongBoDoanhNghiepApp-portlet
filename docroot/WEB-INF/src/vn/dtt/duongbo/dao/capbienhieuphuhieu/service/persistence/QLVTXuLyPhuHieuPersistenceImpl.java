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

package vn.dtt.duongbo.dao.capbienhieuphuhieu.service.persistence;

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

import vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuImpl;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the q l v t xu ly phu hieu service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author binhta
 * @see QLVTXuLyPhuHieuPersistence
 * @see QLVTXuLyPhuHieuUtil
 * @generated
 */
public class QLVTXuLyPhuHieuPersistenceImpl extends BasePersistenceImpl<QLVTXuLyPhuHieu>
	implements QLVTXuLyPhuHieuPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QLVTXuLyPhuHieuUtil} to access the q l v t xu ly phu hieu persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QLVTXuLyPhuHieuImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QLVTXuLyPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyPhuHieuModelImpl.FINDER_CACHE_ENABLED,
			QLVTXuLyPhuHieuImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QLVTXuLyPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyPhuHieuModelImpl.FINDER_CACHE_ENABLED,
			QLVTXuLyPhuHieuImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QLVTXuLyPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyPhuHieuModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_THONGTINXULYID = new FinderPath(QLVTXuLyPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyPhuHieuModelImpl.FINDER_CACHE_ENABLED,
			QLVTXuLyPhuHieuImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBythongTinXuLyId", new String[] { Integer.class.getName() },
			QLVTXuLyPhuHieuModelImpl.THONGTINXULYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_THONGTINXULYID = new FinderPath(QLVTXuLyPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyPhuHieuModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBythongTinXuLyId",
			new String[] { Integer.class.getName() });

	/**
	 * Returns the q l v t xu ly phu hieu where thongTinXuLyId = &#63; or throws a {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException} if it could not be found.
	 *
	 * @param thongTinXuLyId the thong tin xu ly ID
	 * @return the matching q l v t xu ly phu hieu
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException if a matching q l v t xu ly phu hieu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieu findBythongTinXuLyId(int thongTinXuLyId)
		throws NoSuchQLVTXuLyPhuHieuException, SystemException {
		QLVTXuLyPhuHieu qlvtXuLyPhuHieu = fetchBythongTinXuLyId(thongTinXuLyId);

		if (qlvtXuLyPhuHieu == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("thongTinXuLyId=");
			msg.append(thongTinXuLyId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchQLVTXuLyPhuHieuException(msg.toString());
		}

		return qlvtXuLyPhuHieu;
	}

	/**
	 * Returns the q l v t xu ly phu hieu where thongTinXuLyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param thongTinXuLyId the thong tin xu ly ID
	 * @return the matching q l v t xu ly phu hieu, or <code>null</code> if a matching q l v t xu ly phu hieu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieu fetchBythongTinXuLyId(int thongTinXuLyId)
		throws SystemException {
		return fetchBythongTinXuLyId(thongTinXuLyId, true);
	}

	/**
	 * Returns the q l v t xu ly phu hieu where thongTinXuLyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param thongTinXuLyId the thong tin xu ly ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching q l v t xu ly phu hieu, or <code>null</code> if a matching q l v t xu ly phu hieu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieu fetchBythongTinXuLyId(int thongTinXuLyId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { thongTinXuLyId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
					finderArgs, this);
		}

		if (result instanceof QLVTXuLyPhuHieu) {
			QLVTXuLyPhuHieu qlvtXuLyPhuHieu = (QLVTXuLyPhuHieu)result;

			if ((thongTinXuLyId != qlvtXuLyPhuHieu.getThongTinXuLyId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_QLVTXULYPHUHIEU_WHERE);

			query.append(_FINDER_COLUMN_THONGTINXULYID_THONGTINXULYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thongTinXuLyId);

				List<QLVTXuLyPhuHieu> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"QLVTXuLyPhuHieuPersistenceImpl.fetchBythongTinXuLyId(int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					QLVTXuLyPhuHieu qlvtXuLyPhuHieu = list.get(0);

					result = qlvtXuLyPhuHieu;

					cacheResult(qlvtXuLyPhuHieu);

					if ((qlvtXuLyPhuHieu.getThongTinXuLyId() != thongTinXuLyId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
							finderArgs, qlvtXuLyPhuHieu);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
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
			return (QLVTXuLyPhuHieu)result;
		}
	}

	/**
	 * Removes the q l v t xu ly phu hieu where thongTinXuLyId = &#63; from the database.
	 *
	 * @param thongTinXuLyId the thong tin xu ly ID
	 * @return the q l v t xu ly phu hieu that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieu removeBythongTinXuLyId(int thongTinXuLyId)
		throws NoSuchQLVTXuLyPhuHieuException, SystemException {
		QLVTXuLyPhuHieu qlvtXuLyPhuHieu = findBythongTinXuLyId(thongTinXuLyId);

		return remove(qlvtXuLyPhuHieu);
	}

	/**
	 * Returns the number of q l v t xu ly phu hieus where thongTinXuLyId = &#63;.
	 *
	 * @param thongTinXuLyId the thong tin xu ly ID
	 * @return the number of matching q l v t xu ly phu hieus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBythongTinXuLyId(int thongTinXuLyId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_THONGTINXULYID;

		Object[] finderArgs = new Object[] { thongTinXuLyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_QLVTXULYPHUHIEU_WHERE);

			query.append(_FINDER_COLUMN_THONGTINXULYID_THONGTINXULYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thongTinXuLyId);

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

	private static final String _FINDER_COLUMN_THONGTINXULYID_THONGTINXULYID_2 = "qlvtXuLyPhuHieu.thongTinXuLyId = ?";

	public QLVTXuLyPhuHieuPersistenceImpl() {
		setModelClass(QLVTXuLyPhuHieu.class);
	}

	/**
	 * Caches the q l v t xu ly phu hieu in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyPhuHieu the q l v t xu ly phu hieu
	 */
	@Override
	public void cacheResult(QLVTXuLyPhuHieu qlvtXuLyPhuHieu) {
		EntityCacheUtil.putResult(QLVTXuLyPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyPhuHieuImpl.class, qlvtXuLyPhuHieu.getPrimaryKey(),
			qlvtXuLyPhuHieu);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
			new Object[] { qlvtXuLyPhuHieu.getThongTinXuLyId() },
			qlvtXuLyPhuHieu);

		qlvtXuLyPhuHieu.resetOriginalValues();
	}

	/**
	 * Caches the q l v t xu ly phu hieus in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyPhuHieus the q l v t xu ly phu hieus
	 */
	@Override
	public void cacheResult(List<QLVTXuLyPhuHieu> qlvtXuLyPhuHieus) {
		for (QLVTXuLyPhuHieu qlvtXuLyPhuHieu : qlvtXuLyPhuHieus) {
			if (EntityCacheUtil.getResult(
						QLVTXuLyPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
						QLVTXuLyPhuHieuImpl.class,
						qlvtXuLyPhuHieu.getPrimaryKey()) == null) {
				cacheResult(qlvtXuLyPhuHieu);
			}
			else {
				qlvtXuLyPhuHieu.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all q l v t xu ly phu hieus.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QLVTXuLyPhuHieuImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QLVTXuLyPhuHieuImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the q l v t xu ly phu hieu.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QLVTXuLyPhuHieu qlvtXuLyPhuHieu) {
		EntityCacheUtil.removeResult(QLVTXuLyPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyPhuHieuImpl.class, qlvtXuLyPhuHieu.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(qlvtXuLyPhuHieu);
	}

	@Override
	public void clearCache(List<QLVTXuLyPhuHieu> qlvtXuLyPhuHieus) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QLVTXuLyPhuHieu qlvtXuLyPhuHieu : qlvtXuLyPhuHieus) {
			EntityCacheUtil.removeResult(QLVTXuLyPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
				QLVTXuLyPhuHieuImpl.class, qlvtXuLyPhuHieu.getPrimaryKey());

			clearUniqueFindersCache(qlvtXuLyPhuHieu);
		}
	}

	protected void cacheUniqueFindersCache(QLVTXuLyPhuHieu qlvtXuLyPhuHieu) {
		if (qlvtXuLyPhuHieu.isNew()) {
			Object[] args = new Object[] { qlvtXuLyPhuHieu.getThongTinXuLyId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_THONGTINXULYID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
				args, qlvtXuLyPhuHieu);
		}
		else {
			QLVTXuLyPhuHieuModelImpl qlvtXuLyPhuHieuModelImpl = (QLVTXuLyPhuHieuModelImpl)qlvtXuLyPhuHieu;

			if ((qlvtXuLyPhuHieuModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_THONGTINXULYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { qlvtXuLyPhuHieu.getThongTinXuLyId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_THONGTINXULYID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
					args, qlvtXuLyPhuHieu);
			}
		}
	}

	protected void clearUniqueFindersCache(QLVTXuLyPhuHieu qlvtXuLyPhuHieu) {
		QLVTXuLyPhuHieuModelImpl qlvtXuLyPhuHieuModelImpl = (QLVTXuLyPhuHieuModelImpl)qlvtXuLyPhuHieu;

		Object[] args = new Object[] { qlvtXuLyPhuHieu.getThongTinXuLyId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THONGTINXULYID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THONGTINXULYID, args);

		if ((qlvtXuLyPhuHieuModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_THONGTINXULYID.getColumnBitmask()) != 0) {
			args = new Object[] {
					qlvtXuLyPhuHieuModelImpl.getOriginalThongTinXuLyId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THONGTINXULYID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
				args);
		}
	}

	/**
	 * Creates a new q l v t xu ly phu hieu with the primary key. Does not add the q l v t xu ly phu hieu to the database.
	 *
	 * @param id the primary key for the new q l v t xu ly phu hieu
	 * @return the new q l v t xu ly phu hieu
	 */
	@Override
	public QLVTXuLyPhuHieu create(int id) {
		QLVTXuLyPhuHieu qlvtXuLyPhuHieu = new QLVTXuLyPhuHieuImpl();

		qlvtXuLyPhuHieu.setNew(true);
		qlvtXuLyPhuHieu.setPrimaryKey(id);

		return qlvtXuLyPhuHieu;
	}

	/**
	 * Removes the q l v t xu ly phu hieu with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the q l v t xu ly phu hieu
	 * @return the q l v t xu ly phu hieu that was removed
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException if a q l v t xu ly phu hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieu remove(int id)
		throws NoSuchQLVTXuLyPhuHieuException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the q l v t xu ly phu hieu with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the q l v t xu ly phu hieu
	 * @return the q l v t xu ly phu hieu that was removed
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException if a q l v t xu ly phu hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieu remove(Serializable primaryKey)
		throws NoSuchQLVTXuLyPhuHieuException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QLVTXuLyPhuHieu qlvtXuLyPhuHieu = (QLVTXuLyPhuHieu)session.get(QLVTXuLyPhuHieuImpl.class,
					primaryKey);

			if (qlvtXuLyPhuHieu == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQLVTXuLyPhuHieuException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtXuLyPhuHieu);
		}
		catch (NoSuchQLVTXuLyPhuHieuException nsee) {
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
	protected QLVTXuLyPhuHieu removeImpl(QLVTXuLyPhuHieu qlvtXuLyPhuHieu)
		throws SystemException {
		qlvtXuLyPhuHieu = toUnwrappedModel(qlvtXuLyPhuHieu);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtXuLyPhuHieu)) {
				qlvtXuLyPhuHieu = (QLVTXuLyPhuHieu)session.get(QLVTXuLyPhuHieuImpl.class,
						qlvtXuLyPhuHieu.getPrimaryKeyObj());
			}

			if (qlvtXuLyPhuHieu != null) {
				session.delete(qlvtXuLyPhuHieu);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtXuLyPhuHieu != null) {
			clearCache(qlvtXuLyPhuHieu);
		}

		return qlvtXuLyPhuHieu;
	}

	@Override
	public QLVTXuLyPhuHieu updateImpl(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu qlvtXuLyPhuHieu)
		throws SystemException {
		qlvtXuLyPhuHieu = toUnwrappedModel(qlvtXuLyPhuHieu);

		boolean isNew = qlvtXuLyPhuHieu.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtXuLyPhuHieu.isNew()) {
				session.save(qlvtXuLyPhuHieu);

				qlvtXuLyPhuHieu.setNew(false);
			}
			else {
				session.merge(qlvtXuLyPhuHieu);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !QLVTXuLyPhuHieuModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(QLVTXuLyPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyPhuHieuImpl.class, qlvtXuLyPhuHieu.getPrimaryKey(),
			qlvtXuLyPhuHieu);

		clearUniqueFindersCache(qlvtXuLyPhuHieu);
		cacheUniqueFindersCache(qlvtXuLyPhuHieu);

		return qlvtXuLyPhuHieu;
	}

	protected QLVTXuLyPhuHieu toUnwrappedModel(QLVTXuLyPhuHieu qlvtXuLyPhuHieu) {
		if (qlvtXuLyPhuHieu instanceof QLVTXuLyPhuHieuImpl) {
			return qlvtXuLyPhuHieu;
		}

		QLVTXuLyPhuHieuImpl qlvtXuLyPhuHieuImpl = new QLVTXuLyPhuHieuImpl();

		qlvtXuLyPhuHieuImpl.setNew(qlvtXuLyPhuHieu.isNew());
		qlvtXuLyPhuHieuImpl.setPrimaryKey(qlvtXuLyPhuHieu.getPrimaryKey());

		qlvtXuLyPhuHieuImpl.setId(qlvtXuLyPhuHieu.getId());
		qlvtXuLyPhuHieuImpl.setSoLuongBHPHNopLai(qlvtXuLyPhuHieu.getSoLuongBHPHNopLai());
		qlvtXuLyPhuHieuImpl.setSoLuongBienHieu(qlvtXuLyPhuHieu.getSoLuongBienHieu());
		qlvtXuLyPhuHieuImpl.setThongTinXuLyId(qlvtXuLyPhuHieu.getThongTinXuLyId());
		qlvtXuLyPhuHieuImpl.setLoaiPhuHieu(qlvtXuLyPhuHieu.getLoaiPhuHieu());
		qlvtXuLyPhuHieuImpl.setSoLuong(qlvtXuLyPhuHieu.getSoLuong());
		qlvtXuLyPhuHieuImpl.setSoLuongBH_PHNopLai(qlvtXuLyPhuHieu.getSoLuongBH_PHNopLai());
		qlvtXuLyPhuHieuImpl.setSovbChapNhanTuyen(qlvtXuLyPhuHieu.getSovbChapNhanTuyen());
		qlvtXuLyPhuHieuImpl.setNgayCapVBChapNhanTuyen(qlvtXuLyPhuHieu.getNgayCapVBChapNhanTuyen());
		qlvtXuLyPhuHieuImpl.setLanCap(qlvtXuLyPhuHieu.getLanCap());

		return qlvtXuLyPhuHieuImpl;
	}

	/**
	 * Returns the q l v t xu ly phu hieu with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the q l v t xu ly phu hieu
	 * @return the q l v t xu ly phu hieu
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException if a q l v t xu ly phu hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieu findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQLVTXuLyPhuHieuException, SystemException {
		QLVTXuLyPhuHieu qlvtXuLyPhuHieu = fetchByPrimaryKey(primaryKey);

		if (qlvtXuLyPhuHieu == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQLVTXuLyPhuHieuException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtXuLyPhuHieu;
	}

	/**
	 * Returns the q l v t xu ly phu hieu with the primary key or throws a {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException} if it could not be found.
	 *
	 * @param id the primary key of the q l v t xu ly phu hieu
	 * @return the q l v t xu ly phu hieu
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException if a q l v t xu ly phu hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieu findByPrimaryKey(int id)
		throws NoSuchQLVTXuLyPhuHieuException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the q l v t xu ly phu hieu with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the q l v t xu ly phu hieu
	 * @return the q l v t xu ly phu hieu, or <code>null</code> if a q l v t xu ly phu hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieu fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QLVTXuLyPhuHieu qlvtXuLyPhuHieu = (QLVTXuLyPhuHieu)EntityCacheUtil.getResult(QLVTXuLyPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
				QLVTXuLyPhuHieuImpl.class, primaryKey);

		if (qlvtXuLyPhuHieu == _nullQLVTXuLyPhuHieu) {
			return null;
		}

		if (qlvtXuLyPhuHieu == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtXuLyPhuHieu = (QLVTXuLyPhuHieu)session.get(QLVTXuLyPhuHieuImpl.class,
						primaryKey);

				if (qlvtXuLyPhuHieu != null) {
					cacheResult(qlvtXuLyPhuHieu);
				}
				else {
					EntityCacheUtil.putResult(QLVTXuLyPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
						QLVTXuLyPhuHieuImpl.class, primaryKey,
						_nullQLVTXuLyPhuHieu);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QLVTXuLyPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
					QLVTXuLyPhuHieuImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtXuLyPhuHieu;
	}

	/**
	 * Returns the q l v t xu ly phu hieu with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the q l v t xu ly phu hieu
	 * @return the q l v t xu ly phu hieu, or <code>null</code> if a q l v t xu ly phu hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieu fetchByPrimaryKey(int id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the q l v t xu ly phu hieus.
	 *
	 * @return the q l v t xu ly phu hieus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTXuLyPhuHieu> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the q l v t xu ly phu hieus.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q l v t xu ly phu hieus
	 * @param end the upper bound of the range of q l v t xu ly phu hieus (not inclusive)
	 * @return the range of q l v t xu ly phu hieus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTXuLyPhuHieu> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the q l v t xu ly phu hieus.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q l v t xu ly phu hieus
	 * @param end the upper bound of the range of q l v t xu ly phu hieus (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of q l v t xu ly phu hieus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTXuLyPhuHieu> findAll(int start, int end,
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

		List<QLVTXuLyPhuHieu> list = (List<QLVTXuLyPhuHieu>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTXULYPHUHIEU);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTXULYPHUHIEU;

				if (pagination) {
					sql = sql.concat(QLVTXuLyPhuHieuModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QLVTXuLyPhuHieu>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QLVTXuLyPhuHieu>(list);
				}
				else {
					list = (List<QLVTXuLyPhuHieu>)QueryUtil.list(q,
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
	 * Removes all the q l v t xu ly phu hieus from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QLVTXuLyPhuHieu qlvtXuLyPhuHieu : findAll()) {
			remove(qlvtXuLyPhuHieu);
		}
	}

	/**
	 * Returns the number of q l v t xu ly phu hieus.
	 *
	 * @return the number of q l v t xu ly phu hieus
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

				Query q = session.createQuery(_SQL_COUNT_QLVTXULYPHUHIEU);

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
	 * Initializes the q l v t xu ly phu hieu persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QLVTXuLyPhuHieu>> listenersList = new ArrayList<ModelListener<QLVTXuLyPhuHieu>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QLVTXuLyPhuHieu>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QLVTXuLyPhuHieuImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTXULYPHUHIEU = "SELECT qlvtXuLyPhuHieu FROM QLVTXuLyPhuHieu qlvtXuLyPhuHieu";
	private static final String _SQL_SELECT_QLVTXULYPHUHIEU_WHERE = "SELECT qlvtXuLyPhuHieu FROM QLVTXuLyPhuHieu qlvtXuLyPhuHieu WHERE ";
	private static final String _SQL_COUNT_QLVTXULYPHUHIEU = "SELECT COUNT(qlvtXuLyPhuHieu) FROM QLVTXuLyPhuHieu qlvtXuLyPhuHieu";
	private static final String _SQL_COUNT_QLVTXULYPHUHIEU_WHERE = "SELECT COUNT(qlvtXuLyPhuHieu) FROM QLVTXuLyPhuHieu qlvtXuLyPhuHieu WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtXuLyPhuHieu.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QLVTXuLyPhuHieu exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QLVTXuLyPhuHieu exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QLVTXuLyPhuHieuPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "soLuongBHPHNopLai", "soLuongBienHieu", "thongTinXuLyId",
				"loaiPhuHieu", "soLuong", "soLuongBH_PHNopLai",
				"sovbChapNhanTuyen", "ngayCapVBChapNhanTuyen", "lanCap"
			});
	private static QLVTXuLyPhuHieu _nullQLVTXuLyPhuHieu = new QLVTXuLyPhuHieuImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QLVTXuLyPhuHieu> toCacheModel() {
				return _nullQLVTXuLyPhuHieuCacheModel;
			}
		};

	private static CacheModel<QLVTXuLyPhuHieu> _nullQLVTXuLyPhuHieuCacheModel = new CacheModel<QLVTXuLyPhuHieu>() {
			@Override
			public QLVTXuLyPhuHieu toEntityModel() {
				return _nullQLVTXuLyPhuHieu;
			}
		};
}