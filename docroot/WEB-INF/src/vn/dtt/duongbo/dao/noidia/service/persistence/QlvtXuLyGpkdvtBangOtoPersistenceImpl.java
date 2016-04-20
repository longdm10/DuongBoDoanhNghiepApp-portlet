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

package vn.dtt.duongbo.dao.noidia.service.persistence;

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

import vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoException;
import vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto;
import vn.dtt.duongbo.dao.noidia.model.impl.QlvtXuLyGpkdvtBangOtoImpl;
import vn.dtt.duongbo.dao.noidia.model.impl.QlvtXuLyGpkdvtBangOtoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt xu ly gpkdvt bang oto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyGpkdvtBangOtoPersistence
 * @see QlvtXuLyGpkdvtBangOtoUtil
 * @generated
 */
public class QlvtXuLyGpkdvtBangOtoPersistenceImpl extends BasePersistenceImpl<QlvtXuLyGpkdvtBangOto>
	implements QlvtXuLyGpkdvtBangOtoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtXuLyGpkdvtBangOtoUtil} to access the qlvt xu ly gpkdvt bang oto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtXuLyGpkdvtBangOtoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtXuLyGpkdvtBangOtoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpkdvtBangOtoModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpkdvtBangOtoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtXuLyGpkdvtBangOtoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpkdvtBangOtoModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpkdvtBangOtoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtXuLyGpkdvtBangOtoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpkdvtBangOtoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_THONGTINXULYID = new FinderPath(QlvtXuLyGpkdvtBangOtoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpkdvtBangOtoModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpkdvtBangOtoImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBythongTinXuLyId", new String[] { Integer.class.getName() },
			QlvtXuLyGpkdvtBangOtoModelImpl.THONGTINXULYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_THONGTINXULYID = new FinderPath(QlvtXuLyGpkdvtBangOtoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpkdvtBangOtoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBythongTinXuLyId",
			new String[] { Integer.class.getName() });

	/**
	 * Returns the qlvt xu ly gpkdvt bang oto where thongTinXuLyId = &#63; or throws a {@link vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoException} if it could not be found.
	 *
	 * @param thongTinXuLyId the thong tin xu ly ID
	 * @return the matching qlvt xu ly gpkdvt bang oto
	 * @throws vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoException if a matching qlvt xu ly gpkdvt bang oto could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtBangOto findBythongTinXuLyId(int thongTinXuLyId)
		throws NoSuchQlvtXuLyGpkdvtBangOtoException, SystemException {
		QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto = fetchBythongTinXuLyId(thongTinXuLyId);

		if (qlvtXuLyGpkdvtBangOto == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("thongTinXuLyId=");
			msg.append(thongTinXuLyId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchQlvtXuLyGpkdvtBangOtoException(msg.toString());
		}

		return qlvtXuLyGpkdvtBangOto;
	}

	/**
	 * Returns the qlvt xu ly gpkdvt bang oto where thongTinXuLyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param thongTinXuLyId the thong tin xu ly ID
	 * @return the matching qlvt xu ly gpkdvt bang oto, or <code>null</code> if a matching qlvt xu ly gpkdvt bang oto could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtBangOto fetchBythongTinXuLyId(int thongTinXuLyId)
		throws SystemException {
		return fetchBythongTinXuLyId(thongTinXuLyId, true);
	}

	/**
	 * Returns the qlvt xu ly gpkdvt bang oto where thongTinXuLyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param thongTinXuLyId the thong tin xu ly ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching qlvt xu ly gpkdvt bang oto, or <code>null</code> if a matching qlvt xu ly gpkdvt bang oto could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtBangOto fetchBythongTinXuLyId(int thongTinXuLyId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { thongTinXuLyId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
					finderArgs, this);
		}

		if (result instanceof QlvtXuLyGpkdvtBangOto) {
			QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto = (QlvtXuLyGpkdvtBangOto)result;

			if ((thongTinXuLyId != qlvtXuLyGpkdvtBangOto.getThongTinXuLyId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_QLVTXULYGPKDVTBANGOTO_WHERE);

			query.append(_FINDER_COLUMN_THONGTINXULYID_THONGTINXULYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thongTinXuLyId);

				List<QlvtXuLyGpkdvtBangOto> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"QlvtXuLyGpkdvtBangOtoPersistenceImpl.fetchBythongTinXuLyId(int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto = list.get(0);

					result = qlvtXuLyGpkdvtBangOto;

					cacheResult(qlvtXuLyGpkdvtBangOto);

					if ((qlvtXuLyGpkdvtBangOto.getThongTinXuLyId() != thongTinXuLyId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
							finderArgs, qlvtXuLyGpkdvtBangOto);
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
			return (QlvtXuLyGpkdvtBangOto)result;
		}
	}

	/**
	 * Removes the qlvt xu ly gpkdvt bang oto where thongTinXuLyId = &#63; from the database.
	 *
	 * @param thongTinXuLyId the thong tin xu ly ID
	 * @return the qlvt xu ly gpkdvt bang oto that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtBangOto removeBythongTinXuLyId(int thongTinXuLyId)
		throws NoSuchQlvtXuLyGpkdvtBangOtoException, SystemException {
		QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto = findBythongTinXuLyId(thongTinXuLyId);

		return remove(qlvtXuLyGpkdvtBangOto);
	}

	/**
	 * Returns the number of qlvt xu ly gpkdvt bang otos where thongTinXuLyId = &#63;.
	 *
	 * @param thongTinXuLyId the thong tin xu ly ID
	 * @return the number of matching qlvt xu ly gpkdvt bang otos
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

			query.append(_SQL_COUNT_QLVTXULYGPKDVTBANGOTO_WHERE);

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

	private static final String _FINDER_COLUMN_THONGTINXULYID_THONGTINXULYID_2 = "qlvtXuLyGpkdvtBangOto.thongTinXuLyId = ?";

	public QlvtXuLyGpkdvtBangOtoPersistenceImpl() {
		setModelClass(QlvtXuLyGpkdvtBangOto.class);
	}

	/**
	 * Caches the qlvt xu ly gpkdvt bang oto in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyGpkdvtBangOto the qlvt xu ly gpkdvt bang oto
	 */
	@Override
	public void cacheResult(QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto) {
		EntityCacheUtil.putResult(QlvtXuLyGpkdvtBangOtoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpkdvtBangOtoImpl.class,
			qlvtXuLyGpkdvtBangOto.getPrimaryKey(), qlvtXuLyGpkdvtBangOto);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
			new Object[] { qlvtXuLyGpkdvtBangOto.getThongTinXuLyId() },
			qlvtXuLyGpkdvtBangOto);

		qlvtXuLyGpkdvtBangOto.resetOriginalValues();
	}

	/**
	 * Caches the qlvt xu ly gpkdvt bang otos in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyGpkdvtBangOtos the qlvt xu ly gpkdvt bang otos
	 */
	@Override
	public void cacheResult(List<QlvtXuLyGpkdvtBangOto> qlvtXuLyGpkdvtBangOtos) {
		for (QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto : qlvtXuLyGpkdvtBangOtos) {
			if (EntityCacheUtil.getResult(
						QlvtXuLyGpkdvtBangOtoModelImpl.ENTITY_CACHE_ENABLED,
						QlvtXuLyGpkdvtBangOtoImpl.class,
						qlvtXuLyGpkdvtBangOto.getPrimaryKey()) == null) {
				cacheResult(qlvtXuLyGpkdvtBangOto);
			}
			else {
				qlvtXuLyGpkdvtBangOto.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt xu ly gpkdvt bang otos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtXuLyGpkdvtBangOtoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtXuLyGpkdvtBangOtoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt xu ly gpkdvt bang oto.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto) {
		EntityCacheUtil.removeResult(QlvtXuLyGpkdvtBangOtoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpkdvtBangOtoImpl.class,
			qlvtXuLyGpkdvtBangOto.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(qlvtXuLyGpkdvtBangOto);
	}

	@Override
	public void clearCache(List<QlvtXuLyGpkdvtBangOto> qlvtXuLyGpkdvtBangOtos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto : qlvtXuLyGpkdvtBangOtos) {
			EntityCacheUtil.removeResult(QlvtXuLyGpkdvtBangOtoModelImpl.ENTITY_CACHE_ENABLED,
				QlvtXuLyGpkdvtBangOtoImpl.class,
				qlvtXuLyGpkdvtBangOto.getPrimaryKey());

			clearUniqueFindersCache(qlvtXuLyGpkdvtBangOto);
		}
	}

	protected void cacheUniqueFindersCache(
		QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto) {
		if (qlvtXuLyGpkdvtBangOto.isNew()) {
			Object[] args = new Object[] {
					qlvtXuLyGpkdvtBangOto.getThongTinXuLyId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_THONGTINXULYID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
				args, qlvtXuLyGpkdvtBangOto);
		}
		else {
			QlvtXuLyGpkdvtBangOtoModelImpl qlvtXuLyGpkdvtBangOtoModelImpl = (QlvtXuLyGpkdvtBangOtoModelImpl)qlvtXuLyGpkdvtBangOto;

			if ((qlvtXuLyGpkdvtBangOtoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_THONGTINXULYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qlvtXuLyGpkdvtBangOto.getThongTinXuLyId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_THONGTINXULYID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
					args, qlvtXuLyGpkdvtBangOto);
			}
		}
	}

	protected void clearUniqueFindersCache(
		QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto) {
		QlvtXuLyGpkdvtBangOtoModelImpl qlvtXuLyGpkdvtBangOtoModelImpl = (QlvtXuLyGpkdvtBangOtoModelImpl)qlvtXuLyGpkdvtBangOto;

		Object[] args = new Object[] { qlvtXuLyGpkdvtBangOto.getThongTinXuLyId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THONGTINXULYID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THONGTINXULYID, args);

		if ((qlvtXuLyGpkdvtBangOtoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_THONGTINXULYID.getColumnBitmask()) != 0) {
			args = new Object[] {
					qlvtXuLyGpkdvtBangOtoModelImpl.getOriginalThongTinXuLyId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THONGTINXULYID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
				args);
		}
	}

	/**
	 * Creates a new qlvt xu ly gpkdvt bang oto with the primary key. Does not add the qlvt xu ly gpkdvt bang oto to the database.
	 *
	 * @param id the primary key for the new qlvt xu ly gpkdvt bang oto
	 * @return the new qlvt xu ly gpkdvt bang oto
	 */
	@Override
	public QlvtXuLyGpkdvtBangOto create(long id) {
		QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto = new QlvtXuLyGpkdvtBangOtoImpl();

		qlvtXuLyGpkdvtBangOto.setNew(true);
		qlvtXuLyGpkdvtBangOto.setPrimaryKey(id);

		return qlvtXuLyGpkdvtBangOto;
	}

	/**
	 * Removes the qlvt xu ly gpkdvt bang oto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt xu ly gpkdvt bang oto
	 * @return the qlvt xu ly gpkdvt bang oto that was removed
	 * @throws vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoException if a qlvt xu ly gpkdvt bang oto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtBangOto remove(long id)
		throws NoSuchQlvtXuLyGpkdvtBangOtoException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt xu ly gpkdvt bang oto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly gpkdvt bang oto
	 * @return the qlvt xu ly gpkdvt bang oto that was removed
	 * @throws vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoException if a qlvt xu ly gpkdvt bang oto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtBangOto remove(Serializable primaryKey)
		throws NoSuchQlvtXuLyGpkdvtBangOtoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto = (QlvtXuLyGpkdvtBangOto)session.get(QlvtXuLyGpkdvtBangOtoImpl.class,
					primaryKey);

			if (qlvtXuLyGpkdvtBangOto == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtXuLyGpkdvtBangOtoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtXuLyGpkdvtBangOto);
		}
		catch (NoSuchQlvtXuLyGpkdvtBangOtoException nsee) {
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
	protected QlvtXuLyGpkdvtBangOto removeImpl(
		QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto) throws SystemException {
		qlvtXuLyGpkdvtBangOto = toUnwrappedModel(qlvtXuLyGpkdvtBangOto);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtXuLyGpkdvtBangOto)) {
				qlvtXuLyGpkdvtBangOto = (QlvtXuLyGpkdvtBangOto)session.get(QlvtXuLyGpkdvtBangOtoImpl.class,
						qlvtXuLyGpkdvtBangOto.getPrimaryKeyObj());
			}

			if (qlvtXuLyGpkdvtBangOto != null) {
				session.delete(qlvtXuLyGpkdvtBangOto);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtXuLyGpkdvtBangOto != null) {
			clearCache(qlvtXuLyGpkdvtBangOto);
		}

		return qlvtXuLyGpkdvtBangOto;
	}

	@Override
	public QlvtXuLyGpkdvtBangOto updateImpl(
		vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto)
		throws SystemException {
		qlvtXuLyGpkdvtBangOto = toUnwrappedModel(qlvtXuLyGpkdvtBangOto);

		boolean isNew = qlvtXuLyGpkdvtBangOto.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtXuLyGpkdvtBangOto.isNew()) {
				session.save(qlvtXuLyGpkdvtBangOto);

				qlvtXuLyGpkdvtBangOto.setNew(false);
			}
			else {
				session.merge(qlvtXuLyGpkdvtBangOto);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !QlvtXuLyGpkdvtBangOtoModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(QlvtXuLyGpkdvtBangOtoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpkdvtBangOtoImpl.class,
			qlvtXuLyGpkdvtBangOto.getPrimaryKey(), qlvtXuLyGpkdvtBangOto);

		clearUniqueFindersCache(qlvtXuLyGpkdvtBangOto);
		cacheUniqueFindersCache(qlvtXuLyGpkdvtBangOto);

		return qlvtXuLyGpkdvtBangOto;
	}

	protected QlvtXuLyGpkdvtBangOto toUnwrappedModel(
		QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto) {
		if (qlvtXuLyGpkdvtBangOto instanceof QlvtXuLyGpkdvtBangOtoImpl) {
			return qlvtXuLyGpkdvtBangOto;
		}

		QlvtXuLyGpkdvtBangOtoImpl qlvtXuLyGpkdvtBangOtoImpl = new QlvtXuLyGpkdvtBangOtoImpl();

		qlvtXuLyGpkdvtBangOtoImpl.setNew(qlvtXuLyGpkdvtBangOto.isNew());
		qlvtXuLyGpkdvtBangOtoImpl.setPrimaryKey(qlvtXuLyGpkdvtBangOto.getPrimaryKey());

		qlvtXuLyGpkdvtBangOtoImpl.setId(qlvtXuLyGpkdvtBangOto.getId());
		qlvtXuLyGpkdvtBangOtoImpl.setThongTinXuLyId(qlvtXuLyGpkdvtBangOto.getThongTinXuLyId());
		qlvtXuLyGpkdvtBangOtoImpl.setLoaiHinhCap(qlvtXuLyGpkdvtBangOto.getLoaiHinhCap());
		qlvtXuLyGpkdvtBangOtoImpl.setSoGpkdVanTaiBangOto(qlvtXuLyGpkdvtBangOto.getSoGpkdVanTaiBangOto());
		qlvtXuLyGpkdvtBangOtoImpl.setNgayCapGpkdVanTaiBangOto(qlvtXuLyGpkdvtBangOto.getNgayCapGpkdVanTaiBangOto());
		qlvtXuLyGpkdvtBangOtoImpl.setCoQuanCapGpkdVanTaiBangOto(qlvtXuLyGpkdvtBangOto.getCoQuanCapGpkdVanTaiBangOto());
		qlvtXuLyGpkdvtBangOtoImpl.setNgayHetHanGpkdVanTaiBangOto(qlvtXuLyGpkdvtBangOto.getNgayHetHanGpkdVanTaiBangOto());
		qlvtXuLyGpkdvtBangOtoImpl.setNguoiTrucTiepDieuHanh(qlvtXuLyGpkdvtBangOto.getNguoiTrucTiepDieuHanh());
		qlvtXuLyGpkdvtBangOtoImpl.setSoCmtNguoiDieuHanh(qlvtXuLyGpkdvtBangOto.getSoCmtNguoiDieuHanh());
		qlvtXuLyGpkdvtBangOtoImpl.setNgayCapNguoiDieuHanh(qlvtXuLyGpkdvtBangOto.getNgayCapNguoiDieuHanh());
		qlvtXuLyGpkdvtBangOtoImpl.setNoiCapNguoiDieuHanh(qlvtXuLyGpkdvtBangOto.getNoiCapNguoiDieuHanh());
		qlvtXuLyGpkdvtBangOtoImpl.setBangCapNguoiDieuHanh(qlvtXuLyGpkdvtBangOto.getBangCapNguoiDieuHanh());
		qlvtXuLyGpkdvtBangOtoImpl.setThoiGianBatDauDieuHanh(qlvtXuLyGpkdvtBangOto.getThoiGianBatDauDieuHanh());
		qlvtXuLyGpkdvtBangOtoImpl.setThoiGianKetThucDieuHanh(qlvtXuLyGpkdvtBangOto.getThoiGianKetThucDieuHanh());
		qlvtXuLyGpkdvtBangOtoImpl.setSoGiayPhepNguoiDieuHanh(qlvtXuLyGpkdvtBangOto.getSoGiayPhepNguoiDieuHanh());
		qlvtXuLyGpkdvtBangOtoImpl.setLanCapNguoiDieuHanh(qlvtXuLyGpkdvtBangOto.getLanCapNguoiDieuHanh());
		qlvtXuLyGpkdvtBangOtoImpl.setNgayCapCcDieuHanh(qlvtXuLyGpkdvtBangOto.getNgayCapCcDieuHanh());
		qlvtXuLyGpkdvtBangOtoImpl.setNgayHetHanCcDieuHanh(qlvtXuLyGpkdvtBangOto.getNgayHetHanCcDieuHanh());
		qlvtXuLyGpkdvtBangOtoImpl.setKetQuaXuLy(qlvtXuLyGpkdvtBangOto.getKetQuaXuLy());
		qlvtXuLyGpkdvtBangOtoImpl.setLyDoKhongDat(qlvtXuLyGpkdvtBangOto.getLyDoKhongDat());
		qlvtXuLyGpkdvtBangOtoImpl.setKetQuaXuLyNguoiDieuHanh(qlvtXuLyGpkdvtBangOto.getKetQuaXuLyNguoiDieuHanh());
		qlvtXuLyGpkdvtBangOtoImpl.setLyDoKhongDatNguoiDieuHanh(qlvtXuLyGpkdvtBangOto.getLyDoKhongDatNguoiDieuHanh());

		return qlvtXuLyGpkdvtBangOtoImpl;
	}

	/**
	 * Returns the qlvt xu ly gpkdvt bang oto with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly gpkdvt bang oto
	 * @return the qlvt xu ly gpkdvt bang oto
	 * @throws vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoException if a qlvt xu ly gpkdvt bang oto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtBangOto findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtXuLyGpkdvtBangOtoException, SystemException {
		QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto = fetchByPrimaryKey(primaryKey);

		if (qlvtXuLyGpkdvtBangOto == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtXuLyGpkdvtBangOtoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtXuLyGpkdvtBangOto;
	}

	/**
	 * Returns the qlvt xu ly gpkdvt bang oto with the primary key or throws a {@link vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt xu ly gpkdvt bang oto
	 * @return the qlvt xu ly gpkdvt bang oto
	 * @throws vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoException if a qlvt xu ly gpkdvt bang oto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtBangOto findByPrimaryKey(long id)
		throws NoSuchQlvtXuLyGpkdvtBangOtoException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt xu ly gpkdvt bang oto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly gpkdvt bang oto
	 * @return the qlvt xu ly gpkdvt bang oto, or <code>null</code> if a qlvt xu ly gpkdvt bang oto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtBangOto fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto = (QlvtXuLyGpkdvtBangOto)EntityCacheUtil.getResult(QlvtXuLyGpkdvtBangOtoModelImpl.ENTITY_CACHE_ENABLED,
				QlvtXuLyGpkdvtBangOtoImpl.class, primaryKey);

		if (qlvtXuLyGpkdvtBangOto == _nullQlvtXuLyGpkdvtBangOto) {
			return null;
		}

		if (qlvtXuLyGpkdvtBangOto == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtXuLyGpkdvtBangOto = (QlvtXuLyGpkdvtBangOto)session.get(QlvtXuLyGpkdvtBangOtoImpl.class,
						primaryKey);

				if (qlvtXuLyGpkdvtBangOto != null) {
					cacheResult(qlvtXuLyGpkdvtBangOto);
				}
				else {
					EntityCacheUtil.putResult(QlvtXuLyGpkdvtBangOtoModelImpl.ENTITY_CACHE_ENABLED,
						QlvtXuLyGpkdvtBangOtoImpl.class, primaryKey,
						_nullQlvtXuLyGpkdvtBangOto);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtXuLyGpkdvtBangOtoModelImpl.ENTITY_CACHE_ENABLED,
					QlvtXuLyGpkdvtBangOtoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtXuLyGpkdvtBangOto;
	}

	/**
	 * Returns the qlvt xu ly gpkdvt bang oto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt xu ly gpkdvt bang oto
	 * @return the qlvt xu ly gpkdvt bang oto, or <code>null</code> if a qlvt xu ly gpkdvt bang oto with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtBangOto fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt xu ly gpkdvt bang otos.
	 *
	 * @return the qlvt xu ly gpkdvt bang otos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpkdvtBangOto> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt xu ly gpkdvt bang otos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.noidia.model.impl.QlvtXuLyGpkdvtBangOtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt xu ly gpkdvt bang otos
	 * @param end the upper bound of the range of qlvt xu ly gpkdvt bang otos (not inclusive)
	 * @return the range of qlvt xu ly gpkdvt bang otos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpkdvtBangOto> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt xu ly gpkdvt bang otos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.noidia.model.impl.QlvtXuLyGpkdvtBangOtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt xu ly gpkdvt bang otos
	 * @param end the upper bound of the range of qlvt xu ly gpkdvt bang otos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt xu ly gpkdvt bang otos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpkdvtBangOto> findAll(int start, int end,
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

		List<QlvtXuLyGpkdvtBangOto> list = (List<QlvtXuLyGpkdvtBangOto>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTXULYGPKDVTBANGOTO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTXULYGPKDVTBANGOTO;

				if (pagination) {
					sql = sql.concat(QlvtXuLyGpkdvtBangOtoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtXuLyGpkdvtBangOto>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtXuLyGpkdvtBangOto>(list);
				}
				else {
					list = (List<QlvtXuLyGpkdvtBangOto>)QueryUtil.list(q,
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
	 * Removes all the qlvt xu ly gpkdvt bang otos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto : findAll()) {
			remove(qlvtXuLyGpkdvtBangOto);
		}
	}

	/**
	 * Returns the number of qlvt xu ly gpkdvt bang otos.
	 *
	 * @return the number of qlvt xu ly gpkdvt bang otos
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

				Query q = session.createQuery(_SQL_COUNT_QLVTXULYGPKDVTBANGOTO);

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
	 * Initializes the qlvt xu ly gpkdvt bang oto persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtXuLyGpkdvtBangOto>> listenersList = new ArrayList<ModelListener<QlvtXuLyGpkdvtBangOto>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtXuLyGpkdvtBangOto>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtXuLyGpkdvtBangOtoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTXULYGPKDVTBANGOTO = "SELECT qlvtXuLyGpkdvtBangOto FROM QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto";
	private static final String _SQL_SELECT_QLVTXULYGPKDVTBANGOTO_WHERE = "SELECT qlvtXuLyGpkdvtBangOto FROM QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto WHERE ";
	private static final String _SQL_COUNT_QLVTXULYGPKDVTBANGOTO = "SELECT COUNT(qlvtXuLyGpkdvtBangOto) FROM QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto";
	private static final String _SQL_COUNT_QLVTXULYGPKDVTBANGOTO_WHERE = "SELECT COUNT(qlvtXuLyGpkdvtBangOto) FROM QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtXuLyGpkdvtBangOto.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtXuLyGpkdvtBangOto exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QlvtXuLyGpkdvtBangOto exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtXuLyGpkdvtBangOtoPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "thongTinXuLyId", "loaiHinhCap", "soGpkdVanTaiBangOto",
				"ngayCapGpkdVanTaiBangOto", "coQuanCapGpkdVanTaiBangOto",
				"ngayHetHanGpkdVanTaiBangOto", "nguoiTrucTiepDieuHanh",
				"soCmtNguoiDieuHanh", "ngayCapNguoiDieuHanh",
				"noiCapNguoiDieuHanh", "bangCapNguoiDieuHanh",
				"thoiGianBatDauDieuHanh", "thoiGianKetThucDieuHanh",
				"soGiayPhepNguoiDieuHanh", "lanCapNguoiDieuHanh",
				"ngayCapCcDieuHanh", "ngayHetHanCcDieuHanh", "ketQuaXuLy",
				"lyDoKhongDat", "ketQuaXuLyNguoiDieuHanh",
				"lyDoKhongDatNguoiDieuHanh"
			});
	private static QlvtXuLyGpkdvtBangOto _nullQlvtXuLyGpkdvtBangOto = new QlvtXuLyGpkdvtBangOtoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtXuLyGpkdvtBangOto> toCacheModel() {
				return _nullQlvtXuLyGpkdvtBangOtoCacheModel;
			}
		};

	private static CacheModel<QlvtXuLyGpkdvtBangOto> _nullQlvtXuLyGpkdvtBangOtoCacheModel =
		new CacheModel<QlvtXuLyGpkdvtBangOto>() {
			@Override
			public QlvtXuLyGpkdvtBangOto toEntityModel() {
				return _nullQlvtXuLyGpkdvtBangOto;
			}
		};
}