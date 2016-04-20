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

import vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuException;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyBienHieuImpl;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyBienHieuModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the q l v t xu ly bien hieu service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author binhta
 * @see QLVTXuLyBienHieuPersistence
 * @see QLVTXuLyBienHieuUtil
 * @generated
 */
public class QLVTXuLyBienHieuPersistenceImpl extends BasePersistenceImpl<QLVTXuLyBienHieu>
	implements QLVTXuLyBienHieuPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QLVTXuLyBienHieuUtil} to access the q l v t xu ly bien hieu persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QLVTXuLyBienHieuImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QLVTXuLyBienHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyBienHieuModelImpl.FINDER_CACHE_ENABLED,
			QLVTXuLyBienHieuImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QLVTXuLyBienHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyBienHieuModelImpl.FINDER_CACHE_ENABLED,
			QLVTXuLyBienHieuImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QLVTXuLyBienHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyBienHieuModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_THONGTINXULYID = new FinderPath(QLVTXuLyBienHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyBienHieuModelImpl.FINDER_CACHE_ENABLED,
			QLVTXuLyBienHieuImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBythongTinXuLyId", new String[] { Integer.class.getName() },
			QLVTXuLyBienHieuModelImpl.THONGTINXULYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_THONGTINXULYID = new FinderPath(QLVTXuLyBienHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyBienHieuModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBythongTinXuLyId",
			new String[] { Integer.class.getName() });

	/**
	 * Returns the q l v t xu ly bien hieu where thongTinXuLyId = &#63; or throws a {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuException} if it could not be found.
	 *
	 * @param thongTinXuLyId the thong tin xu ly ID
	 * @return the matching q l v t xu ly bien hieu
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuException if a matching q l v t xu ly bien hieu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyBienHieu findBythongTinXuLyId(int thongTinXuLyId)
		throws NoSuchQLVTXuLyBienHieuException, SystemException {
		QLVTXuLyBienHieu qlvtXuLyBienHieu = fetchBythongTinXuLyId(thongTinXuLyId);

		if (qlvtXuLyBienHieu == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("thongTinXuLyId=");
			msg.append(thongTinXuLyId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchQLVTXuLyBienHieuException(msg.toString());
		}

		return qlvtXuLyBienHieu;
	}

	/**
	 * Returns the q l v t xu ly bien hieu where thongTinXuLyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param thongTinXuLyId the thong tin xu ly ID
	 * @return the matching q l v t xu ly bien hieu, or <code>null</code> if a matching q l v t xu ly bien hieu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyBienHieu fetchBythongTinXuLyId(int thongTinXuLyId)
		throws SystemException {
		return fetchBythongTinXuLyId(thongTinXuLyId, true);
	}

	/**
	 * Returns the q l v t xu ly bien hieu where thongTinXuLyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param thongTinXuLyId the thong tin xu ly ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching q l v t xu ly bien hieu, or <code>null</code> if a matching q l v t xu ly bien hieu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyBienHieu fetchBythongTinXuLyId(int thongTinXuLyId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { thongTinXuLyId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
					finderArgs, this);
		}

		if (result instanceof QLVTXuLyBienHieu) {
			QLVTXuLyBienHieu qlvtXuLyBienHieu = (QLVTXuLyBienHieu)result;

			if ((thongTinXuLyId != qlvtXuLyBienHieu.getThongTinXuLyId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_QLVTXULYBIENHIEU_WHERE);

			query.append(_FINDER_COLUMN_THONGTINXULYID_THONGTINXULYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thongTinXuLyId);

				List<QLVTXuLyBienHieu> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"QLVTXuLyBienHieuPersistenceImpl.fetchBythongTinXuLyId(int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					QLVTXuLyBienHieu qlvtXuLyBienHieu = list.get(0);

					result = qlvtXuLyBienHieu;

					cacheResult(qlvtXuLyBienHieu);

					if ((qlvtXuLyBienHieu.getThongTinXuLyId() != thongTinXuLyId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
							finderArgs, qlvtXuLyBienHieu);
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
			return (QLVTXuLyBienHieu)result;
		}
	}

	/**
	 * Removes the q l v t xu ly bien hieu where thongTinXuLyId = &#63; from the database.
	 *
	 * @param thongTinXuLyId the thong tin xu ly ID
	 * @return the q l v t xu ly bien hieu that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyBienHieu removeBythongTinXuLyId(int thongTinXuLyId)
		throws NoSuchQLVTXuLyBienHieuException, SystemException {
		QLVTXuLyBienHieu qlvtXuLyBienHieu = findBythongTinXuLyId(thongTinXuLyId);

		return remove(qlvtXuLyBienHieu);
	}

	/**
	 * Returns the number of q l v t xu ly bien hieus where thongTinXuLyId = &#63;.
	 *
	 * @param thongTinXuLyId the thong tin xu ly ID
	 * @return the number of matching q l v t xu ly bien hieus
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

			query.append(_SQL_COUNT_QLVTXULYBIENHIEU_WHERE);

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

	private static final String _FINDER_COLUMN_THONGTINXULYID_THONGTINXULYID_2 = "qlvtXuLyBienHieu.thongTinXuLyId = ?";

	public QLVTXuLyBienHieuPersistenceImpl() {
		setModelClass(QLVTXuLyBienHieu.class);
	}

	/**
	 * Caches the q l v t xu ly bien hieu in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyBienHieu the q l v t xu ly bien hieu
	 */
	@Override
	public void cacheResult(QLVTXuLyBienHieu qlvtXuLyBienHieu) {
		EntityCacheUtil.putResult(QLVTXuLyBienHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyBienHieuImpl.class, qlvtXuLyBienHieu.getPrimaryKey(),
			qlvtXuLyBienHieu);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
			new Object[] { qlvtXuLyBienHieu.getThongTinXuLyId() },
			qlvtXuLyBienHieu);

		qlvtXuLyBienHieu.resetOriginalValues();
	}

	/**
	 * Caches the q l v t xu ly bien hieus in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyBienHieus the q l v t xu ly bien hieus
	 */
	@Override
	public void cacheResult(List<QLVTXuLyBienHieu> qlvtXuLyBienHieus) {
		for (QLVTXuLyBienHieu qlvtXuLyBienHieu : qlvtXuLyBienHieus) {
			if (EntityCacheUtil.getResult(
						QLVTXuLyBienHieuModelImpl.ENTITY_CACHE_ENABLED,
						QLVTXuLyBienHieuImpl.class,
						qlvtXuLyBienHieu.getPrimaryKey()) == null) {
				cacheResult(qlvtXuLyBienHieu);
			}
			else {
				qlvtXuLyBienHieu.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all q l v t xu ly bien hieus.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QLVTXuLyBienHieuImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QLVTXuLyBienHieuImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the q l v t xu ly bien hieu.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QLVTXuLyBienHieu qlvtXuLyBienHieu) {
		EntityCacheUtil.removeResult(QLVTXuLyBienHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyBienHieuImpl.class, qlvtXuLyBienHieu.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(qlvtXuLyBienHieu);
	}

	@Override
	public void clearCache(List<QLVTXuLyBienHieu> qlvtXuLyBienHieus) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QLVTXuLyBienHieu qlvtXuLyBienHieu : qlvtXuLyBienHieus) {
			EntityCacheUtil.removeResult(QLVTXuLyBienHieuModelImpl.ENTITY_CACHE_ENABLED,
				QLVTXuLyBienHieuImpl.class, qlvtXuLyBienHieu.getPrimaryKey());

			clearUniqueFindersCache(qlvtXuLyBienHieu);
		}
	}

	protected void cacheUniqueFindersCache(QLVTXuLyBienHieu qlvtXuLyBienHieu) {
		if (qlvtXuLyBienHieu.isNew()) {
			Object[] args = new Object[] { qlvtXuLyBienHieu.getThongTinXuLyId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_THONGTINXULYID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
				args, qlvtXuLyBienHieu);
		}
		else {
			QLVTXuLyBienHieuModelImpl qlvtXuLyBienHieuModelImpl = (QLVTXuLyBienHieuModelImpl)qlvtXuLyBienHieu;

			if ((qlvtXuLyBienHieuModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_THONGTINXULYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qlvtXuLyBienHieu.getThongTinXuLyId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_THONGTINXULYID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
					args, qlvtXuLyBienHieu);
			}
		}
	}

	protected void clearUniqueFindersCache(QLVTXuLyBienHieu qlvtXuLyBienHieu) {
		QLVTXuLyBienHieuModelImpl qlvtXuLyBienHieuModelImpl = (QLVTXuLyBienHieuModelImpl)qlvtXuLyBienHieu;

		Object[] args = new Object[] { qlvtXuLyBienHieu.getThongTinXuLyId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THONGTINXULYID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THONGTINXULYID, args);

		if ((qlvtXuLyBienHieuModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_THONGTINXULYID.getColumnBitmask()) != 0) {
			args = new Object[] {
					qlvtXuLyBienHieuModelImpl.getOriginalThongTinXuLyId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THONGTINXULYID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
				args);
		}
	}

	/**
	 * Creates a new q l v t xu ly bien hieu with the primary key. Does not add the q l v t xu ly bien hieu to the database.
	 *
	 * @param id the primary key for the new q l v t xu ly bien hieu
	 * @return the new q l v t xu ly bien hieu
	 */
	@Override
	public QLVTXuLyBienHieu create(int id) {
		QLVTXuLyBienHieu qlvtXuLyBienHieu = new QLVTXuLyBienHieuImpl();

		qlvtXuLyBienHieu.setNew(true);
		qlvtXuLyBienHieu.setPrimaryKey(id);

		return qlvtXuLyBienHieu;
	}

	/**
	 * Removes the q l v t xu ly bien hieu with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the q l v t xu ly bien hieu
	 * @return the q l v t xu ly bien hieu that was removed
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuException if a q l v t xu ly bien hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyBienHieu remove(int id)
		throws NoSuchQLVTXuLyBienHieuException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the q l v t xu ly bien hieu with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the q l v t xu ly bien hieu
	 * @return the q l v t xu ly bien hieu that was removed
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuException if a q l v t xu ly bien hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyBienHieu remove(Serializable primaryKey)
		throws NoSuchQLVTXuLyBienHieuException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QLVTXuLyBienHieu qlvtXuLyBienHieu = (QLVTXuLyBienHieu)session.get(QLVTXuLyBienHieuImpl.class,
					primaryKey);

			if (qlvtXuLyBienHieu == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQLVTXuLyBienHieuException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtXuLyBienHieu);
		}
		catch (NoSuchQLVTXuLyBienHieuException nsee) {
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
	protected QLVTXuLyBienHieu removeImpl(QLVTXuLyBienHieu qlvtXuLyBienHieu)
		throws SystemException {
		qlvtXuLyBienHieu = toUnwrappedModel(qlvtXuLyBienHieu);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtXuLyBienHieu)) {
				qlvtXuLyBienHieu = (QLVTXuLyBienHieu)session.get(QLVTXuLyBienHieuImpl.class,
						qlvtXuLyBienHieu.getPrimaryKeyObj());
			}

			if (qlvtXuLyBienHieu != null) {
				session.delete(qlvtXuLyBienHieu);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtXuLyBienHieu != null) {
			clearCache(qlvtXuLyBienHieu);
		}

		return qlvtXuLyBienHieu;
	}

	@Override
	public QLVTXuLyBienHieu updateImpl(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu qlvtXuLyBienHieu)
		throws SystemException {
		qlvtXuLyBienHieu = toUnwrappedModel(qlvtXuLyBienHieu);

		boolean isNew = qlvtXuLyBienHieu.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtXuLyBienHieu.isNew()) {
				session.save(qlvtXuLyBienHieu);

				qlvtXuLyBienHieu.setNew(false);
			}
			else {
				session.merge(qlvtXuLyBienHieu);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !QLVTXuLyBienHieuModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(QLVTXuLyBienHieuModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyBienHieuImpl.class, qlvtXuLyBienHieu.getPrimaryKey(),
			qlvtXuLyBienHieu);

		clearUniqueFindersCache(qlvtXuLyBienHieu);
		cacheUniqueFindersCache(qlvtXuLyBienHieu);

		return qlvtXuLyBienHieu;
	}

	protected QLVTXuLyBienHieu toUnwrappedModel(
		QLVTXuLyBienHieu qlvtXuLyBienHieu) {
		if (qlvtXuLyBienHieu instanceof QLVTXuLyBienHieuImpl) {
			return qlvtXuLyBienHieu;
		}

		QLVTXuLyBienHieuImpl qlvtXuLyBienHieuImpl = new QLVTXuLyBienHieuImpl();

		qlvtXuLyBienHieuImpl.setNew(qlvtXuLyBienHieu.isNew());
		qlvtXuLyBienHieuImpl.setPrimaryKey(qlvtXuLyBienHieu.getPrimaryKey());

		qlvtXuLyBienHieuImpl.setId(qlvtXuLyBienHieu.getId());
		qlvtXuLyBienHieuImpl.setThongTinXuLyId(qlvtXuLyBienHieu.getThongTinXuLyId());
		qlvtXuLyBienHieuImpl.setLinhVucKinhDoanh(qlvtXuLyBienHieu.getLinhVucKinhDoanh());
		qlvtXuLyBienHieuImpl.setLyDoCapLai(qlvtXuLyBienHieu.getLyDoCapLai());
		qlvtXuLyBienHieuImpl.setGpkdLuuHanhQuocTe(qlvtXuLyBienHieu.getGpkdLuuHanhQuocTe());
		qlvtXuLyBienHieuImpl.setGpkdLuuHanhQuocTeCQCAP(qlvtXuLyBienHieu.getGpkdLuuHanhQuocTeCQCAP());
		qlvtXuLyBienHieuImpl.setGpkdLuuHanhQuocTeNgayCap(qlvtXuLyBienHieu.getGpkdLuuHanhQuocTeNgayCap());
		qlvtXuLyBienHieuImpl.setGpkdLuuHanhQuocTeNgayHetHan(qlvtXuLyBienHieu.getGpkdLuuHanhQuocTeNgayHetHan());
		qlvtXuLyBienHieuImpl.setSoLuongXe(qlvtXuLyBienHieu.getSoLuongXe());
		qlvtXuLyBienHieuImpl.setSoLuongBHPHNopLai(qlvtXuLyBienHieu.getSoLuongBHPHNopLai());
		qlvtXuLyBienHieuImpl.setLapCap(qlvtXuLyBienHieu.getLapCap());

		return qlvtXuLyBienHieuImpl;
	}

	/**
	 * Returns the q l v t xu ly bien hieu with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the q l v t xu ly bien hieu
	 * @return the q l v t xu ly bien hieu
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuException if a q l v t xu ly bien hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyBienHieu findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQLVTXuLyBienHieuException, SystemException {
		QLVTXuLyBienHieu qlvtXuLyBienHieu = fetchByPrimaryKey(primaryKey);

		if (qlvtXuLyBienHieu == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQLVTXuLyBienHieuException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtXuLyBienHieu;
	}

	/**
	 * Returns the q l v t xu ly bien hieu with the primary key or throws a {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuException} if it could not be found.
	 *
	 * @param id the primary key of the q l v t xu ly bien hieu
	 * @return the q l v t xu ly bien hieu
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuException if a q l v t xu ly bien hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyBienHieu findByPrimaryKey(int id)
		throws NoSuchQLVTXuLyBienHieuException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the q l v t xu ly bien hieu with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the q l v t xu ly bien hieu
	 * @return the q l v t xu ly bien hieu, or <code>null</code> if a q l v t xu ly bien hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyBienHieu fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QLVTXuLyBienHieu qlvtXuLyBienHieu = (QLVTXuLyBienHieu)EntityCacheUtil.getResult(QLVTXuLyBienHieuModelImpl.ENTITY_CACHE_ENABLED,
				QLVTXuLyBienHieuImpl.class, primaryKey);

		if (qlvtXuLyBienHieu == _nullQLVTXuLyBienHieu) {
			return null;
		}

		if (qlvtXuLyBienHieu == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtXuLyBienHieu = (QLVTXuLyBienHieu)session.get(QLVTXuLyBienHieuImpl.class,
						primaryKey);

				if (qlvtXuLyBienHieu != null) {
					cacheResult(qlvtXuLyBienHieu);
				}
				else {
					EntityCacheUtil.putResult(QLVTXuLyBienHieuModelImpl.ENTITY_CACHE_ENABLED,
						QLVTXuLyBienHieuImpl.class, primaryKey,
						_nullQLVTXuLyBienHieu);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QLVTXuLyBienHieuModelImpl.ENTITY_CACHE_ENABLED,
					QLVTXuLyBienHieuImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtXuLyBienHieu;
	}

	/**
	 * Returns the q l v t xu ly bien hieu with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the q l v t xu ly bien hieu
	 * @return the q l v t xu ly bien hieu, or <code>null</code> if a q l v t xu ly bien hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyBienHieu fetchByPrimaryKey(int id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the q l v t xu ly bien hieus.
	 *
	 * @return the q l v t xu ly bien hieus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTXuLyBienHieu> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the q l v t xu ly bien hieus.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyBienHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q l v t xu ly bien hieus
	 * @param end the upper bound of the range of q l v t xu ly bien hieus (not inclusive)
	 * @return the range of q l v t xu ly bien hieus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTXuLyBienHieu> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the q l v t xu ly bien hieus.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyBienHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q l v t xu ly bien hieus
	 * @param end the upper bound of the range of q l v t xu ly bien hieus (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of q l v t xu ly bien hieus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTXuLyBienHieu> findAll(int start, int end,
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

		List<QLVTXuLyBienHieu> list = (List<QLVTXuLyBienHieu>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTXULYBIENHIEU);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTXULYBIENHIEU;

				if (pagination) {
					sql = sql.concat(QLVTXuLyBienHieuModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QLVTXuLyBienHieu>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QLVTXuLyBienHieu>(list);
				}
				else {
					list = (List<QLVTXuLyBienHieu>)QueryUtil.list(q,
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
	 * Removes all the q l v t xu ly bien hieus from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QLVTXuLyBienHieu qlvtXuLyBienHieu : findAll()) {
			remove(qlvtXuLyBienHieu);
		}
	}

	/**
	 * Returns the number of q l v t xu ly bien hieus.
	 *
	 * @return the number of q l v t xu ly bien hieus
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

				Query q = session.createQuery(_SQL_COUNT_QLVTXULYBIENHIEU);

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
	 * Initializes the q l v t xu ly bien hieu persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QLVTXuLyBienHieu>> listenersList = new ArrayList<ModelListener<QLVTXuLyBienHieu>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QLVTXuLyBienHieu>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QLVTXuLyBienHieuImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTXULYBIENHIEU = "SELECT qlvtXuLyBienHieu FROM QLVTXuLyBienHieu qlvtXuLyBienHieu";
	private static final String _SQL_SELECT_QLVTXULYBIENHIEU_WHERE = "SELECT qlvtXuLyBienHieu FROM QLVTXuLyBienHieu qlvtXuLyBienHieu WHERE ";
	private static final String _SQL_COUNT_QLVTXULYBIENHIEU = "SELECT COUNT(qlvtXuLyBienHieu) FROM QLVTXuLyBienHieu qlvtXuLyBienHieu";
	private static final String _SQL_COUNT_QLVTXULYBIENHIEU_WHERE = "SELECT COUNT(qlvtXuLyBienHieu) FROM QLVTXuLyBienHieu qlvtXuLyBienHieu WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtXuLyBienHieu.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QLVTXuLyBienHieu exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QLVTXuLyBienHieu exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QLVTXuLyBienHieuPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "thongTinXuLyId", "LinhVucKinhDoanh", "lyDoCapLai",
				"gpkdLuuHanhQuocTe", "gpkdLuuHanhQuocTeCQCAP",
				"gpkdLuuHanhQuocTeNgayCap", "gpkdLuuHanhQuocTeNgayHetHan",
				"soLuongXe", "soLuongBHPHNopLai", "lapCap"
			});
	private static QLVTXuLyBienHieu _nullQLVTXuLyBienHieu = new QLVTXuLyBienHieuImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QLVTXuLyBienHieu> toCacheModel() {
				return _nullQLVTXuLyBienHieuCacheModel;
			}
		};

	private static CacheModel<QLVTXuLyBienHieu> _nullQLVTXuLyBienHieuCacheModel = new CacheModel<QLVTXuLyBienHieu>() {
			@Override
			public QLVTXuLyBienHieu toEntityModel() {
				return _nullQLVTXuLyBienHieu;
			}
		};
}