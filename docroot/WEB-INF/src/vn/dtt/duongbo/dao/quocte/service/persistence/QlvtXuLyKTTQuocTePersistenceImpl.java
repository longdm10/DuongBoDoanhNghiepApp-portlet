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

package vn.dtt.duongbo.dao.quocte.service.persistence;

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

import vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeException;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe;
import vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeImpl;
import vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt xu ly k t t quoc te service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyKTTQuocTePersistence
 * @see QlvtXuLyKTTQuocTeUtil
 * @generated
 */
public class QlvtXuLyKTTQuocTePersistenceImpl extends BasePersistenceImpl<QlvtXuLyKTTQuocTe>
	implements QlvtXuLyKTTQuocTePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtXuLyKTTQuocTeUtil} to access the qlvt xu ly k t t quoc te persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtXuLyKTTQuocTeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtXuLyKTTQuocTeModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtXuLyKTTQuocTeModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtXuLyKTTQuocTeModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_THONGTINXULYID = new FinderPath(QlvtXuLyKTTQuocTeModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBythongTinXuLyId", new String[] { Integer.class.getName() },
			QlvtXuLyKTTQuocTeModelImpl.THONGTINXULYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_THONGTINXULYID = new FinderPath(QlvtXuLyKTTQuocTeModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBythongTinXuLyId",
			new String[] { Integer.class.getName() });

	/**
	 * Returns the qlvt xu ly k t t quoc te where thongTinXuLyId = &#63; or throws a {@link vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeException} if it could not be found.
	 *
	 * @param thongTinXuLyId the thong tin xu ly ID
	 * @return the matching qlvt xu ly k t t quoc te
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeException if a matching qlvt xu ly k t t quoc te could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTe findBythongTinXuLyId(int thongTinXuLyId)
		throws NoSuchQlvtXuLyKTTQuocTeException, SystemException {
		QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe = fetchBythongTinXuLyId(thongTinXuLyId);

		if (qlvtXuLyKTTQuocTe == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("thongTinXuLyId=");
			msg.append(thongTinXuLyId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchQlvtXuLyKTTQuocTeException(msg.toString());
		}

		return qlvtXuLyKTTQuocTe;
	}

	/**
	 * Returns the qlvt xu ly k t t quoc te where thongTinXuLyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param thongTinXuLyId the thong tin xu ly ID
	 * @return the matching qlvt xu ly k t t quoc te, or <code>null</code> if a matching qlvt xu ly k t t quoc te could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTe fetchBythongTinXuLyId(int thongTinXuLyId)
		throws SystemException {
		return fetchBythongTinXuLyId(thongTinXuLyId, true);
	}

	/**
	 * Returns the qlvt xu ly k t t quoc te where thongTinXuLyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param thongTinXuLyId the thong tin xu ly ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching qlvt xu ly k t t quoc te, or <code>null</code> if a matching qlvt xu ly k t t quoc te could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTe fetchBythongTinXuLyId(int thongTinXuLyId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { thongTinXuLyId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
					finderArgs, this);
		}

		if (result instanceof QlvtXuLyKTTQuocTe) {
			QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe = (QlvtXuLyKTTQuocTe)result;

			if ((thongTinXuLyId != qlvtXuLyKTTQuocTe.getThongTinXuLyId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_QLVTXULYKTTQUOCTE_WHERE);

			query.append(_FINDER_COLUMN_THONGTINXULYID_THONGTINXULYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thongTinXuLyId);

				List<QlvtXuLyKTTQuocTe> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"QlvtXuLyKTTQuocTePersistenceImpl.fetchBythongTinXuLyId(int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe = list.get(0);

					result = qlvtXuLyKTTQuocTe;

					cacheResult(qlvtXuLyKTTQuocTe);

					if ((qlvtXuLyKTTQuocTe.getThongTinXuLyId() != thongTinXuLyId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
							finderArgs, qlvtXuLyKTTQuocTe);
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
			return (QlvtXuLyKTTQuocTe)result;
		}
	}

	/**
	 * Removes the qlvt xu ly k t t quoc te where thongTinXuLyId = &#63; from the database.
	 *
	 * @param thongTinXuLyId the thong tin xu ly ID
	 * @return the qlvt xu ly k t t quoc te that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTe removeBythongTinXuLyId(int thongTinXuLyId)
		throws NoSuchQlvtXuLyKTTQuocTeException, SystemException {
		QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe = findBythongTinXuLyId(thongTinXuLyId);

		return remove(qlvtXuLyKTTQuocTe);
	}

	/**
	 * Returns the number of qlvt xu ly k t t quoc tes where thongTinXuLyId = &#63;.
	 *
	 * @param thongTinXuLyId the thong tin xu ly ID
	 * @return the number of matching qlvt xu ly k t t quoc tes
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

			query.append(_SQL_COUNT_QLVTXULYKTTQUOCTE_WHERE);

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

	private static final String _FINDER_COLUMN_THONGTINXULYID_THONGTINXULYID_2 = "qlvtXuLyKTTQuocTe.thongTinXuLyId = ?";

	public QlvtXuLyKTTQuocTePersistenceImpl() {
		setModelClass(QlvtXuLyKTTQuocTe.class);
	}

	/**
	 * Caches the qlvt xu ly k t t quoc te in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyKTTQuocTe the qlvt xu ly k t t quoc te
	 */
	@Override
	public void cacheResult(QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe) {
		EntityCacheUtil.putResult(QlvtXuLyKTTQuocTeModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeImpl.class, qlvtXuLyKTTQuocTe.getPrimaryKey(),
			qlvtXuLyKTTQuocTe);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
			new Object[] { qlvtXuLyKTTQuocTe.getThongTinXuLyId() },
			qlvtXuLyKTTQuocTe);

		qlvtXuLyKTTQuocTe.resetOriginalValues();
	}

	/**
	 * Caches the qlvt xu ly k t t quoc tes in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyKTTQuocTes the qlvt xu ly k t t quoc tes
	 */
	@Override
	public void cacheResult(List<QlvtXuLyKTTQuocTe> qlvtXuLyKTTQuocTes) {
		for (QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe : qlvtXuLyKTTQuocTes) {
			if (EntityCacheUtil.getResult(
						QlvtXuLyKTTQuocTeModelImpl.ENTITY_CACHE_ENABLED,
						QlvtXuLyKTTQuocTeImpl.class,
						qlvtXuLyKTTQuocTe.getPrimaryKey()) == null) {
				cacheResult(qlvtXuLyKTTQuocTe);
			}
			else {
				qlvtXuLyKTTQuocTe.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt xu ly k t t quoc tes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtXuLyKTTQuocTeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtXuLyKTTQuocTeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt xu ly k t t quoc te.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe) {
		EntityCacheUtil.removeResult(QlvtXuLyKTTQuocTeModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeImpl.class, qlvtXuLyKTTQuocTe.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(qlvtXuLyKTTQuocTe);
	}

	@Override
	public void clearCache(List<QlvtXuLyKTTQuocTe> qlvtXuLyKTTQuocTes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe : qlvtXuLyKTTQuocTes) {
			EntityCacheUtil.removeResult(QlvtXuLyKTTQuocTeModelImpl.ENTITY_CACHE_ENABLED,
				QlvtXuLyKTTQuocTeImpl.class, qlvtXuLyKTTQuocTe.getPrimaryKey());

			clearUniqueFindersCache(qlvtXuLyKTTQuocTe);
		}
	}

	protected void cacheUniqueFindersCache(QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe) {
		if (qlvtXuLyKTTQuocTe.isNew()) {
			Object[] args = new Object[] { qlvtXuLyKTTQuocTe.getThongTinXuLyId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_THONGTINXULYID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
				args, qlvtXuLyKTTQuocTe);
		}
		else {
			QlvtXuLyKTTQuocTeModelImpl qlvtXuLyKTTQuocTeModelImpl = (QlvtXuLyKTTQuocTeModelImpl)qlvtXuLyKTTQuocTe;

			if ((qlvtXuLyKTTQuocTeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_THONGTINXULYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qlvtXuLyKTTQuocTe.getThongTinXuLyId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_THONGTINXULYID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
					args, qlvtXuLyKTTQuocTe);
			}
		}
	}

	protected void clearUniqueFindersCache(QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe) {
		QlvtXuLyKTTQuocTeModelImpl qlvtXuLyKTTQuocTeModelImpl = (QlvtXuLyKTTQuocTeModelImpl)qlvtXuLyKTTQuocTe;

		Object[] args = new Object[] { qlvtXuLyKTTQuocTe.getThongTinXuLyId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THONGTINXULYID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THONGTINXULYID, args);

		if ((qlvtXuLyKTTQuocTeModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_THONGTINXULYID.getColumnBitmask()) != 0) {
			args = new Object[] {
					qlvtXuLyKTTQuocTeModelImpl.getOriginalThongTinXuLyId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THONGTINXULYID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THONGTINXULYID,
				args);
		}
	}

	/**
	 * Creates a new qlvt xu ly k t t quoc te with the primary key. Does not add the qlvt xu ly k t t quoc te to the database.
	 *
	 * @param id the primary key for the new qlvt xu ly k t t quoc te
	 * @return the new qlvt xu ly k t t quoc te
	 */
	@Override
	public QlvtXuLyKTTQuocTe create(long id) {
		QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe = new QlvtXuLyKTTQuocTeImpl();

		qlvtXuLyKTTQuocTe.setNew(true);
		qlvtXuLyKTTQuocTe.setPrimaryKey(id);

		return qlvtXuLyKTTQuocTe;
	}

	/**
	 * Removes the qlvt xu ly k t t quoc te with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt xu ly k t t quoc te
	 * @return the qlvt xu ly k t t quoc te that was removed
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeException if a qlvt xu ly k t t quoc te with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTe remove(long id)
		throws NoSuchQlvtXuLyKTTQuocTeException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt xu ly k t t quoc te with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly k t t quoc te
	 * @return the qlvt xu ly k t t quoc te that was removed
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeException if a qlvt xu ly k t t quoc te with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTe remove(Serializable primaryKey)
		throws NoSuchQlvtXuLyKTTQuocTeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe = (QlvtXuLyKTTQuocTe)session.get(QlvtXuLyKTTQuocTeImpl.class,
					primaryKey);

			if (qlvtXuLyKTTQuocTe == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtXuLyKTTQuocTeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtXuLyKTTQuocTe);
		}
		catch (NoSuchQlvtXuLyKTTQuocTeException nsee) {
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
	protected QlvtXuLyKTTQuocTe removeImpl(QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe)
		throws SystemException {
		qlvtXuLyKTTQuocTe = toUnwrappedModel(qlvtXuLyKTTQuocTe);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtXuLyKTTQuocTe)) {
				qlvtXuLyKTTQuocTe = (QlvtXuLyKTTQuocTe)session.get(QlvtXuLyKTTQuocTeImpl.class,
						qlvtXuLyKTTQuocTe.getPrimaryKeyObj());
			}

			if (qlvtXuLyKTTQuocTe != null) {
				session.delete(qlvtXuLyKTTQuocTe);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtXuLyKTTQuocTe != null) {
			clearCache(qlvtXuLyKTTQuocTe);
		}

		return qlvtXuLyKTTQuocTe;
	}

	@Override
	public QlvtXuLyKTTQuocTe updateImpl(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe)
		throws SystemException {
		qlvtXuLyKTTQuocTe = toUnwrappedModel(qlvtXuLyKTTQuocTe);

		boolean isNew = qlvtXuLyKTTQuocTe.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qlvtXuLyKTTQuocTe.isNew()) {
				session.save(qlvtXuLyKTTQuocTe);

				qlvtXuLyKTTQuocTe.setNew(false);
			}
			else {
				session.merge(qlvtXuLyKTTQuocTe);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !QlvtXuLyKTTQuocTeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(QlvtXuLyKTTQuocTeModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTeImpl.class, qlvtXuLyKTTQuocTe.getPrimaryKey(),
			qlvtXuLyKTTQuocTe);

		clearUniqueFindersCache(qlvtXuLyKTTQuocTe);
		cacheUniqueFindersCache(qlvtXuLyKTTQuocTe);

		return qlvtXuLyKTTQuocTe;
	}

	protected QlvtXuLyKTTQuocTe toUnwrappedModel(
		QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe) {
		if (qlvtXuLyKTTQuocTe instanceof QlvtXuLyKTTQuocTeImpl) {
			return qlvtXuLyKTTQuocTe;
		}

		QlvtXuLyKTTQuocTeImpl qlvtXuLyKTTQuocTeImpl = new QlvtXuLyKTTQuocTeImpl();

		qlvtXuLyKTTQuocTeImpl.setNew(qlvtXuLyKTTQuocTe.isNew());
		qlvtXuLyKTTQuocTeImpl.setPrimaryKey(qlvtXuLyKTTQuocTe.getPrimaryKey());

		qlvtXuLyKTTQuocTeImpl.setId(qlvtXuLyKTTQuocTe.getId());
		qlvtXuLyKTTQuocTeImpl.setThongTinXuLyId(qlvtXuLyKTTQuocTe.getThongTinXuLyId());
		qlvtXuLyKTTQuocTeImpl.setLoaiCapPhep(qlvtXuLyKTTQuocTe.getLoaiCapPhep());
		qlvtXuLyKTTQuocTeImpl.setBenDi(qlvtXuLyKTTQuocTe.getBenDi());
		qlvtXuLyKTTQuocTeImpl.setDiemDi(qlvtXuLyKTTQuocTe.getDiemDi());
		qlvtXuLyKTTQuocTeImpl.setBenDen(qlvtXuLyKTTQuocTe.getBenDen());
		qlvtXuLyKTTQuocTeImpl.setDiemDen(qlvtXuLyKTTQuocTe.getDiemDen());
		qlvtXuLyKTTQuocTeImpl.setCuLyVanChuyen(qlvtXuLyKTTQuocTe.getCuLyVanChuyen());
		qlvtXuLyKTTQuocTeImpl.setHanhTrinhChay(qlvtXuLyKTTQuocTe.getHanhTrinhChay());
		qlvtXuLyKTTQuocTeImpl.setCuaKhau(qlvtXuLyKTTQuocTe.getCuaKhau());
		qlvtXuLyKTTQuocTeImpl.setKetQuaDanhGiaGPVT(qlvtXuLyKTTQuocTe.getKetQuaDanhGiaGPVT());
		qlvtXuLyKTTQuocTeImpl.setLyDoKhongDat(qlvtXuLyKTTQuocTe.getLyDoKhongDat());

		return qlvtXuLyKTTQuocTeImpl;
	}

	/**
	 * Returns the qlvt xu ly k t t quoc te with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly k t t quoc te
	 * @return the qlvt xu ly k t t quoc te
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeException if a qlvt xu ly k t t quoc te with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTe findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtXuLyKTTQuocTeException, SystemException {
		QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe = fetchByPrimaryKey(primaryKey);

		if (qlvtXuLyKTTQuocTe == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtXuLyKTTQuocTeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtXuLyKTTQuocTe;
	}

	/**
	 * Returns the qlvt xu ly k t t quoc te with the primary key or throws a {@link vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt xu ly k t t quoc te
	 * @return the qlvt xu ly k t t quoc te
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeException if a qlvt xu ly k t t quoc te with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTe findByPrimaryKey(long id)
		throws NoSuchQlvtXuLyKTTQuocTeException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt xu ly k t t quoc te with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly k t t quoc te
	 * @return the qlvt xu ly k t t quoc te, or <code>null</code> if a qlvt xu ly k t t quoc te with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTe fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe = (QlvtXuLyKTTQuocTe)EntityCacheUtil.getResult(QlvtXuLyKTTQuocTeModelImpl.ENTITY_CACHE_ENABLED,
				QlvtXuLyKTTQuocTeImpl.class, primaryKey);

		if (qlvtXuLyKTTQuocTe == _nullQlvtXuLyKTTQuocTe) {
			return null;
		}

		if (qlvtXuLyKTTQuocTe == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtXuLyKTTQuocTe = (QlvtXuLyKTTQuocTe)session.get(QlvtXuLyKTTQuocTeImpl.class,
						primaryKey);

				if (qlvtXuLyKTTQuocTe != null) {
					cacheResult(qlvtXuLyKTTQuocTe);
				}
				else {
					EntityCacheUtil.putResult(QlvtXuLyKTTQuocTeModelImpl.ENTITY_CACHE_ENABLED,
						QlvtXuLyKTTQuocTeImpl.class, primaryKey,
						_nullQlvtXuLyKTTQuocTe);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtXuLyKTTQuocTeModelImpl.ENTITY_CACHE_ENABLED,
					QlvtXuLyKTTQuocTeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtXuLyKTTQuocTe;
	}

	/**
	 * Returns the qlvt xu ly k t t quoc te with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt xu ly k t t quoc te
	 * @return the qlvt xu ly k t t quoc te, or <code>null</code> if a qlvt xu ly k t t quoc te with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTe fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt xu ly k t t quoc tes.
	 *
	 * @return the qlvt xu ly k t t quoc tes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyKTTQuocTe> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt xu ly k t t quoc tes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt xu ly k t t quoc tes
	 * @param end the upper bound of the range of qlvt xu ly k t t quoc tes (not inclusive)
	 * @return the range of qlvt xu ly k t t quoc tes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyKTTQuocTe> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt xu ly k t t quoc tes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt xu ly k t t quoc tes
	 * @param end the upper bound of the range of qlvt xu ly k t t quoc tes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt xu ly k t t quoc tes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyKTTQuocTe> findAll(int start, int end,
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

		List<QlvtXuLyKTTQuocTe> list = (List<QlvtXuLyKTTQuocTe>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTXULYKTTQUOCTE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTXULYKTTQUOCTE;

				if (pagination) {
					sql = sql.concat(QlvtXuLyKTTQuocTeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtXuLyKTTQuocTe>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtXuLyKTTQuocTe>(list);
				}
				else {
					list = (List<QlvtXuLyKTTQuocTe>)QueryUtil.list(q,
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
	 * Removes all the qlvt xu ly k t t quoc tes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe : findAll()) {
			remove(qlvtXuLyKTTQuocTe);
		}
	}

	/**
	 * Returns the number of qlvt xu ly k t t quoc tes.
	 *
	 * @return the number of qlvt xu ly k t t quoc tes
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

				Query q = session.createQuery(_SQL_COUNT_QLVTXULYKTTQUOCTE);

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
	 * Initializes the qlvt xu ly k t t quoc te persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtXuLyKTTQuocTe>> listenersList = new ArrayList<ModelListener<QlvtXuLyKTTQuocTe>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtXuLyKTTQuocTe>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtXuLyKTTQuocTeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTXULYKTTQUOCTE = "SELECT qlvtXuLyKTTQuocTe FROM QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe";
	private static final String _SQL_SELECT_QLVTXULYKTTQUOCTE_WHERE = "SELECT qlvtXuLyKTTQuocTe FROM QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe WHERE ";
	private static final String _SQL_COUNT_QLVTXULYKTTQUOCTE = "SELECT COUNT(qlvtXuLyKTTQuocTe) FROM QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe";
	private static final String _SQL_COUNT_QLVTXULYKTTQUOCTE_WHERE = "SELECT COUNT(qlvtXuLyKTTQuocTe) FROM QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtXuLyKTTQuocTe.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtXuLyKTTQuocTe exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QlvtXuLyKTTQuocTe exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtXuLyKTTQuocTePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "thongTinXuLyId", "loaiCapPhep", "benDi", "diemDi",
				"benDen", "diemDen", "cuLyVanChuyen", "hanhTrinhChay", "cuaKhau",
				"ketQuaDanhGiaGPVT", "lyDoKhongDat"
			});
	private static QlvtXuLyKTTQuocTe _nullQlvtXuLyKTTQuocTe = new QlvtXuLyKTTQuocTeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtXuLyKTTQuocTe> toCacheModel() {
				return _nullQlvtXuLyKTTQuocTeCacheModel;
			}
		};

	private static CacheModel<QlvtXuLyKTTQuocTe> _nullQlvtXuLyKTTQuocTeCacheModel =
		new CacheModel<QlvtXuLyKTTQuocTe>() {
			@Override
			public QlvtXuLyKTTQuocTe toEntityModel() {
				return _nullQlvtXuLyKTTQuocTe;
			}
		};
}