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

import vn.dtt.duongbo.dao.thanhtoan.NoSuchThanhToanKeyPayException;
import vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay;
import vn.dtt.duongbo.dao.thanhtoan.model.impl.ThanhToanKeyPayImpl;
import vn.dtt.duongbo.dao.thanhtoan.model.impl.ThanhToanKeyPayModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the thanh toan key pay service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ThanhToanKeyPayPersistence
 * @see ThanhToanKeyPayUtil
 * @generated
 */
public class ThanhToanKeyPayPersistenceImpl extends BasePersistenceImpl<ThanhToanKeyPay>
	implements ThanhToanKeyPayPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ThanhToanKeyPayUtil} to access the thanh toan key pay persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ThanhToanKeyPayImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ThanhToanKeyPayModelImpl.ENTITY_CACHE_ENABLED,
			ThanhToanKeyPayModelImpl.FINDER_CACHE_ENABLED,
			ThanhToanKeyPayImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ThanhToanKeyPayModelImpl.ENTITY_CACHE_ENABLED,
			ThanhToanKeyPayModelImpl.FINDER_CACHE_ENABLED,
			ThanhToanKeyPayImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ThanhToanKeyPayModelImpl.ENTITY_CACHE_ENABLED,
			ThanhToanKeyPayModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_GOODCODE = new FinderPath(ThanhToanKeyPayModelImpl.ENTITY_CACHE_ENABLED,
			ThanhToanKeyPayModelImpl.FINDER_CACHE_ENABLED,
			ThanhToanKeyPayImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBygoodCode", new String[] { String.class.getName() },
			ThanhToanKeyPayModelImpl.GOODCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GOODCODE = new FinderPath(ThanhToanKeyPayModelImpl.ENTITY_CACHE_ENABLED,
			ThanhToanKeyPayModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygoodCode",
			new String[] { String.class.getName() });

	/**
	 * Returns the thanh toan key pay where goodCode = &#63; or throws a {@link vn.dtt.duongbo.dao.thanhtoan.NoSuchThanhToanKeyPayException} if it could not be found.
	 *
	 * @param goodCode the good code
	 * @return the matching thanh toan key pay
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchThanhToanKeyPayException if a matching thanh toan key pay could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThanhToanKeyPay findBygoodCode(String goodCode)
		throws NoSuchThanhToanKeyPayException, SystemException {
		ThanhToanKeyPay thanhToanKeyPay = fetchBygoodCode(goodCode);

		if (thanhToanKeyPay == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("goodCode=");
			msg.append(goodCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchThanhToanKeyPayException(msg.toString());
		}

		return thanhToanKeyPay;
	}

	/**
	 * Returns the thanh toan key pay where goodCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param goodCode the good code
	 * @return the matching thanh toan key pay, or <code>null</code> if a matching thanh toan key pay could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThanhToanKeyPay fetchBygoodCode(String goodCode)
		throws SystemException {
		return fetchBygoodCode(goodCode, true);
	}

	/**
	 * Returns the thanh toan key pay where goodCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param goodCode the good code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching thanh toan key pay, or <code>null</code> if a matching thanh toan key pay could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThanhToanKeyPay fetchBygoodCode(String goodCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { goodCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_GOODCODE,
					finderArgs, this);
		}

		if (result instanceof ThanhToanKeyPay) {
			ThanhToanKeyPay thanhToanKeyPay = (ThanhToanKeyPay)result;

			if (!Validator.equals(goodCode, thanhToanKeyPay.getGoodCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_THANHTOANKEYPAY_WHERE);

			boolean bindGoodCode = false;

			if (goodCode == null) {
				query.append(_FINDER_COLUMN_GOODCODE_GOODCODE_1);
			}
			else if (goodCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GOODCODE_GOODCODE_3);
			}
			else {
				bindGoodCode = true;

				query.append(_FINDER_COLUMN_GOODCODE_GOODCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindGoodCode) {
					qPos.add(goodCode);
				}

				List<ThanhToanKeyPay> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODCODE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"ThanhToanKeyPayPersistenceImpl.fetchBygoodCode(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					ThanhToanKeyPay thanhToanKeyPay = list.get(0);

					result = thanhToanKeyPay;

					cacheResult(thanhToanKeyPay);

					if ((thanhToanKeyPay.getGoodCode() == null) ||
							!thanhToanKeyPay.getGoodCode().equals(goodCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODCODE,
							finderArgs, thanhToanKeyPay);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GOODCODE,
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
			return (ThanhToanKeyPay)result;
		}
	}

	/**
	 * Removes the thanh toan key pay where goodCode = &#63; from the database.
	 *
	 * @param goodCode the good code
	 * @return the thanh toan key pay that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThanhToanKeyPay removeBygoodCode(String goodCode)
		throws NoSuchThanhToanKeyPayException, SystemException {
		ThanhToanKeyPay thanhToanKeyPay = findBygoodCode(goodCode);

		return remove(thanhToanKeyPay);
	}

	/**
	 * Returns the number of thanh toan key paies where goodCode = &#63;.
	 *
	 * @param goodCode the good code
	 * @return the number of matching thanh toan key paies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBygoodCode(String goodCode) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GOODCODE;

		Object[] finderArgs = new Object[] { goodCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_THANHTOANKEYPAY_WHERE);

			boolean bindGoodCode = false;

			if (goodCode == null) {
				query.append(_FINDER_COLUMN_GOODCODE_GOODCODE_1);
			}
			else if (goodCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GOODCODE_GOODCODE_3);
			}
			else {
				bindGoodCode = true;

				query.append(_FINDER_COLUMN_GOODCODE_GOODCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindGoodCode) {
					qPos.add(goodCode);
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

	private static final String _FINDER_COLUMN_GOODCODE_GOODCODE_1 = "thanhToanKeyPay.goodCode IS NULL";
	private static final String _FINDER_COLUMN_GOODCODE_GOODCODE_2 = "thanhToanKeyPay.goodCode = ?";
	private static final String _FINDER_COLUMN_GOODCODE_GOODCODE_3 = "(thanhToanKeyPay.goodCode IS NULL OR thanhToanKeyPay.goodCode = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE =
		new FinderPath(ThanhToanKeyPayModelImpl.ENTITY_CACHE_ENABLED,
			ThanhToanKeyPayModelImpl.FINDER_CACHE_ENABLED,
			ThanhToanKeyPayImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByGoodCodeAndMerchantCodeAndMerchantTransIdAndLoaiMessage",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Long.class.getName()
			},
			ThanhToanKeyPayModelImpl.GOODCODE_COLUMN_BITMASK |
			ThanhToanKeyPayModelImpl.MERCHANTCODE_COLUMN_BITMASK |
			ThanhToanKeyPayModelImpl.MERCHANTTRANSID_COLUMN_BITMASK |
			ThanhToanKeyPayModelImpl.LOAIMESSAGE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE =
		new FinderPath(ThanhToanKeyPayModelImpl.ENTITY_CACHE_ENABLED,
			ThanhToanKeyPayModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByGoodCodeAndMerchantCodeAndMerchantTransIdAndLoaiMessage",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Long.class.getName()
			});

	/**
	 * Returns the thanh toan key pay where goodCode = &#63; and merchantCode = &#63; and merchantTransId = &#63; and loaiMessage = &#63; or throws a {@link vn.dtt.duongbo.dao.thanhtoan.NoSuchThanhToanKeyPayException} if it could not be found.
	 *
	 * @param goodCode the good code
	 * @param merchantCode the merchant code
	 * @param merchantTransId the merchant trans ID
	 * @param loaiMessage the loai message
	 * @return the matching thanh toan key pay
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchThanhToanKeyPayException if a matching thanh toan key pay could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThanhToanKeyPay findByGoodCodeAndMerchantCodeAndMerchantTransIdAndLoaiMessage(
		String goodCode, String merchantCode, String merchantTransId,
		long loaiMessage)
		throws NoSuchThanhToanKeyPayException, SystemException {
		ThanhToanKeyPay thanhToanKeyPay = fetchByGoodCodeAndMerchantCodeAndMerchantTransIdAndLoaiMessage(goodCode,
				merchantCode, merchantTransId, loaiMessage);

		if (thanhToanKeyPay == null) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("goodCode=");
			msg.append(goodCode);

			msg.append(", merchantCode=");
			msg.append(merchantCode);

			msg.append(", merchantTransId=");
			msg.append(merchantTransId);

			msg.append(", loaiMessage=");
			msg.append(loaiMessage);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchThanhToanKeyPayException(msg.toString());
		}

		return thanhToanKeyPay;
	}

	/**
	 * Returns the thanh toan key pay where goodCode = &#63; and merchantCode = &#63; and merchantTransId = &#63; and loaiMessage = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param goodCode the good code
	 * @param merchantCode the merchant code
	 * @param merchantTransId the merchant trans ID
	 * @param loaiMessage the loai message
	 * @return the matching thanh toan key pay, or <code>null</code> if a matching thanh toan key pay could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThanhToanKeyPay fetchByGoodCodeAndMerchantCodeAndMerchantTransIdAndLoaiMessage(
		String goodCode, String merchantCode, String merchantTransId,
		long loaiMessage) throws SystemException {
		return fetchByGoodCodeAndMerchantCodeAndMerchantTransIdAndLoaiMessage(goodCode,
			merchantCode, merchantTransId, loaiMessage, true);
	}

	/**
	 * Returns the thanh toan key pay where goodCode = &#63; and merchantCode = &#63; and merchantTransId = &#63; and loaiMessage = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param goodCode the good code
	 * @param merchantCode the merchant code
	 * @param merchantTransId the merchant trans ID
	 * @param loaiMessage the loai message
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching thanh toan key pay, or <code>null</code> if a matching thanh toan key pay could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThanhToanKeyPay fetchByGoodCodeAndMerchantCodeAndMerchantTransIdAndLoaiMessage(
		String goodCode, String merchantCode, String merchantTransId,
		long loaiMessage, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] {
				goodCode, merchantCode, merchantTransId, loaiMessage
			};

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE,
					finderArgs, this);
		}

		if (result instanceof ThanhToanKeyPay) {
			ThanhToanKeyPay thanhToanKeyPay = (ThanhToanKeyPay)result;

			if (!Validator.equals(goodCode, thanhToanKeyPay.getGoodCode()) ||
					!Validator.equals(merchantCode,
						thanhToanKeyPay.getMerchantCode()) ||
					!Validator.equals(merchantTransId,
						thanhToanKeyPay.getMerchantTransId()) ||
					(loaiMessage != thanhToanKeyPay.getLoaiMessage())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_SELECT_THANHTOANKEYPAY_WHERE);

			boolean bindGoodCode = false;

			if (goodCode == null) {
				query.append(_FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_GOODCODE_1);
			}
			else if (goodCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_GOODCODE_3);
			}
			else {
				bindGoodCode = true;

				query.append(_FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_GOODCODE_2);
			}

			boolean bindMerchantCode = false;

			if (merchantCode == null) {
				query.append(_FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_MERCHANTCODE_1);
			}
			else if (merchantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_MERCHANTCODE_3);
			}
			else {
				bindMerchantCode = true;

				query.append(_FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_MERCHANTCODE_2);
			}

			boolean bindMerchantTransId = false;

			if (merchantTransId == null) {
				query.append(_FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_MERCHANTTRANSID_1);
			}
			else if (merchantTransId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_MERCHANTTRANSID_3);
			}
			else {
				bindMerchantTransId = true;

				query.append(_FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_MERCHANTTRANSID_2);
			}

			query.append(_FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_LOAIMESSAGE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindGoodCode) {
					qPos.add(goodCode);
				}

				if (bindMerchantCode) {
					qPos.add(merchantCode);
				}

				if (bindMerchantTransId) {
					qPos.add(merchantTransId);
				}

				qPos.add(loaiMessage);

				List<ThanhToanKeyPay> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"ThanhToanKeyPayPersistenceImpl.fetchByGoodCodeAndMerchantCodeAndMerchantTransIdAndLoaiMessage(String, String, String, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					ThanhToanKeyPay thanhToanKeyPay = list.get(0);

					result = thanhToanKeyPay;

					cacheResult(thanhToanKeyPay);

					if ((thanhToanKeyPay.getGoodCode() == null) ||
							!thanhToanKeyPay.getGoodCode().equals(goodCode) ||
							(thanhToanKeyPay.getMerchantCode() == null) ||
							!thanhToanKeyPay.getMerchantCode()
												.equals(merchantCode) ||
							(thanhToanKeyPay.getMerchantTransId() == null) ||
							!thanhToanKeyPay.getMerchantTransId()
												.equals(merchantTransId) ||
							(thanhToanKeyPay.getLoaiMessage() != loaiMessage)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE,
							finderArgs, thanhToanKeyPay);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE,
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
			return (ThanhToanKeyPay)result;
		}
	}

	/**
	 * Removes the thanh toan key pay where goodCode = &#63; and merchantCode = &#63; and merchantTransId = &#63; and loaiMessage = &#63; from the database.
	 *
	 * @param goodCode the good code
	 * @param merchantCode the merchant code
	 * @param merchantTransId the merchant trans ID
	 * @param loaiMessage the loai message
	 * @return the thanh toan key pay that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThanhToanKeyPay removeByGoodCodeAndMerchantCodeAndMerchantTransIdAndLoaiMessage(
		String goodCode, String merchantCode, String merchantTransId,
		long loaiMessage)
		throws NoSuchThanhToanKeyPayException, SystemException {
		ThanhToanKeyPay thanhToanKeyPay = findByGoodCodeAndMerchantCodeAndMerchantTransIdAndLoaiMessage(goodCode,
				merchantCode, merchantTransId, loaiMessage);

		return remove(thanhToanKeyPay);
	}

	/**
	 * Returns the number of thanh toan key paies where goodCode = &#63; and merchantCode = &#63; and merchantTransId = &#63; and loaiMessage = &#63;.
	 *
	 * @param goodCode the good code
	 * @param merchantCode the merchant code
	 * @param merchantTransId the merchant trans ID
	 * @param loaiMessage the loai message
	 * @return the number of matching thanh toan key paies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGoodCodeAndMerchantCodeAndMerchantTransIdAndLoaiMessage(
		String goodCode, String merchantCode, String merchantTransId,
		long loaiMessage) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE;

		Object[] finderArgs = new Object[] {
				goodCode, merchantCode, merchantTransId, loaiMessage
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_THANHTOANKEYPAY_WHERE);

			boolean bindGoodCode = false;

			if (goodCode == null) {
				query.append(_FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_GOODCODE_1);
			}
			else if (goodCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_GOODCODE_3);
			}
			else {
				bindGoodCode = true;

				query.append(_FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_GOODCODE_2);
			}

			boolean bindMerchantCode = false;

			if (merchantCode == null) {
				query.append(_FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_MERCHANTCODE_1);
			}
			else if (merchantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_MERCHANTCODE_3);
			}
			else {
				bindMerchantCode = true;

				query.append(_FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_MERCHANTCODE_2);
			}

			boolean bindMerchantTransId = false;

			if (merchantTransId == null) {
				query.append(_FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_MERCHANTTRANSID_1);
			}
			else if (merchantTransId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_MERCHANTTRANSID_3);
			}
			else {
				bindMerchantTransId = true;

				query.append(_FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_MERCHANTTRANSID_2);
			}

			query.append(_FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_LOAIMESSAGE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindGoodCode) {
					qPos.add(goodCode);
				}

				if (bindMerchantCode) {
					qPos.add(merchantCode);
				}

				if (bindMerchantTransId) {
					qPos.add(merchantTransId);
				}

				qPos.add(loaiMessage);

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

	private static final String _FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_GOODCODE_1 =
		"thanhToanKeyPay.goodCode IS NULL AND ";
	private static final String _FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_GOODCODE_2 =
		"thanhToanKeyPay.goodCode = ? AND ";
	private static final String _FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_GOODCODE_3 =
		"(thanhToanKeyPay.goodCode IS NULL OR thanhToanKeyPay.goodCode = '') AND ";
	private static final String _FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_MERCHANTCODE_1 =
		"thanhToanKeyPay.merchantCode IS NULL AND ";
	private static final String _FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_MERCHANTCODE_2 =
		"thanhToanKeyPay.merchantCode = ? AND ";
	private static final String _FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_MERCHANTCODE_3 =
		"(thanhToanKeyPay.merchantCode IS NULL OR thanhToanKeyPay.merchantCode = '') AND ";
	private static final String _FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_MERCHANTTRANSID_1 =
		"thanhToanKeyPay.merchantTransId IS NULL AND ";
	private static final String _FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_MERCHANTTRANSID_2 =
		"thanhToanKeyPay.merchantTransId = ? AND ";
	private static final String _FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_MERCHANTTRANSID_3 =
		"(thanhToanKeyPay.merchantTransId IS NULL OR thanhToanKeyPay.merchantTransId = '') AND ";
	private static final String _FINDER_COLUMN_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE_LOAIMESSAGE_2 =
		"thanhToanKeyPay.loaiMessage = ?";

	public ThanhToanKeyPayPersistenceImpl() {
		setModelClass(ThanhToanKeyPay.class);
	}

	/**
	 * Caches the thanh toan key pay in the entity cache if it is enabled.
	 *
	 * @param thanhToanKeyPay the thanh toan key pay
	 */
	@Override
	public void cacheResult(ThanhToanKeyPay thanhToanKeyPay) {
		EntityCacheUtil.putResult(ThanhToanKeyPayModelImpl.ENTITY_CACHE_ENABLED,
			ThanhToanKeyPayImpl.class, thanhToanKeyPay.getPrimaryKey(),
			thanhToanKeyPay);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODCODE,
			new Object[] { thanhToanKeyPay.getGoodCode() }, thanhToanKeyPay);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE,
			new Object[] {
				thanhToanKeyPay.getGoodCode(), thanhToanKeyPay.getMerchantCode(),
				thanhToanKeyPay.getMerchantTransId(),
				thanhToanKeyPay.getLoaiMessage()
			}, thanhToanKeyPay);

		thanhToanKeyPay.resetOriginalValues();
	}

	/**
	 * Caches the thanh toan key paies in the entity cache if it is enabled.
	 *
	 * @param thanhToanKeyPaies the thanh toan key paies
	 */
	@Override
	public void cacheResult(List<ThanhToanKeyPay> thanhToanKeyPaies) {
		for (ThanhToanKeyPay thanhToanKeyPay : thanhToanKeyPaies) {
			if (EntityCacheUtil.getResult(
						ThanhToanKeyPayModelImpl.ENTITY_CACHE_ENABLED,
						ThanhToanKeyPayImpl.class,
						thanhToanKeyPay.getPrimaryKey()) == null) {
				cacheResult(thanhToanKeyPay);
			}
			else {
				thanhToanKeyPay.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all thanh toan key paies.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ThanhToanKeyPayImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ThanhToanKeyPayImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the thanh toan key pay.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ThanhToanKeyPay thanhToanKeyPay) {
		EntityCacheUtil.removeResult(ThanhToanKeyPayModelImpl.ENTITY_CACHE_ENABLED,
			ThanhToanKeyPayImpl.class, thanhToanKeyPay.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(thanhToanKeyPay);
	}

	@Override
	public void clearCache(List<ThanhToanKeyPay> thanhToanKeyPaies) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ThanhToanKeyPay thanhToanKeyPay : thanhToanKeyPaies) {
			EntityCacheUtil.removeResult(ThanhToanKeyPayModelImpl.ENTITY_CACHE_ENABLED,
				ThanhToanKeyPayImpl.class, thanhToanKeyPay.getPrimaryKey());

			clearUniqueFindersCache(thanhToanKeyPay);
		}
	}

	protected void cacheUniqueFindersCache(ThanhToanKeyPay thanhToanKeyPay) {
		if (thanhToanKeyPay.isNew()) {
			Object[] args = new Object[] { thanhToanKeyPay.getGoodCode() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GOODCODE, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODCODE, args,
				thanhToanKeyPay);

			args = new Object[] {
					thanhToanKeyPay.getGoodCode(),
					thanhToanKeyPay.getMerchantCode(),
					thanhToanKeyPay.getMerchantTransId(),
					thanhToanKeyPay.getLoaiMessage()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE,
				args, thanhToanKeyPay);
		}
		else {
			ThanhToanKeyPayModelImpl thanhToanKeyPayModelImpl = (ThanhToanKeyPayModelImpl)thanhToanKeyPay;

			if ((thanhToanKeyPayModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_GOODCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { thanhToanKeyPay.getGoodCode() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GOODCODE, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODCODE, args,
					thanhToanKeyPay);
			}

			if ((thanhToanKeyPayModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thanhToanKeyPay.getGoodCode(),
						thanhToanKeyPay.getMerchantCode(),
						thanhToanKeyPay.getMerchantTransId(),
						thanhToanKeyPay.getLoaiMessage()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE,
					args, thanhToanKeyPay);
			}
		}
	}

	protected void clearUniqueFindersCache(ThanhToanKeyPay thanhToanKeyPay) {
		ThanhToanKeyPayModelImpl thanhToanKeyPayModelImpl = (ThanhToanKeyPayModelImpl)thanhToanKeyPay;

		Object[] args = new Object[] { thanhToanKeyPay.getGoodCode() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GOODCODE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GOODCODE, args);

		if ((thanhToanKeyPayModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_GOODCODE.getColumnBitmask()) != 0) {
			args = new Object[] { thanhToanKeyPayModelImpl.getOriginalGoodCode() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GOODCODE, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GOODCODE, args);
		}

		args = new Object[] {
				thanhToanKeyPay.getGoodCode(), thanhToanKeyPay.getMerchantCode(),
				thanhToanKeyPay.getMerchantTransId(),
				thanhToanKeyPay.getLoaiMessage()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE,
			args);

		if ((thanhToanKeyPayModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE.getColumnBitmask()) != 0) {
			args = new Object[] {
					thanhToanKeyPayModelImpl.getOriginalGoodCode(),
					thanhToanKeyPayModelImpl.getOriginalMerchantCode(),
					thanhToanKeyPayModelImpl.getOriginalMerchantTransId(),
					thanhToanKeyPayModelImpl.getOriginalLoaiMessage()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GOODCODEANDMERCHANTCODEANDMERCHANTTRANSIDANDLOAIMESSAGE,
				args);
		}
	}

	/**
	 * Creates a new thanh toan key pay with the primary key. Does not add the thanh toan key pay to the database.
	 *
	 * @param thanhToanKeyPayPK the primary key for the new thanh toan key pay
	 * @return the new thanh toan key pay
	 */
	@Override
	public ThanhToanKeyPay create(ThanhToanKeyPayPK thanhToanKeyPayPK) {
		ThanhToanKeyPay thanhToanKeyPay = new ThanhToanKeyPayImpl();

		thanhToanKeyPay.setNew(true);
		thanhToanKeyPay.setPrimaryKey(thanhToanKeyPayPK);

		return thanhToanKeyPay;
	}

	/**
	 * Removes the thanh toan key pay with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param thanhToanKeyPayPK the primary key of the thanh toan key pay
	 * @return the thanh toan key pay that was removed
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchThanhToanKeyPayException if a thanh toan key pay with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThanhToanKeyPay remove(ThanhToanKeyPayPK thanhToanKeyPayPK)
		throws NoSuchThanhToanKeyPayException, SystemException {
		return remove((Serializable)thanhToanKeyPayPK);
	}

	/**
	 * Removes the thanh toan key pay with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the thanh toan key pay
	 * @return the thanh toan key pay that was removed
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchThanhToanKeyPayException if a thanh toan key pay with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThanhToanKeyPay remove(Serializable primaryKey)
		throws NoSuchThanhToanKeyPayException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ThanhToanKeyPay thanhToanKeyPay = (ThanhToanKeyPay)session.get(ThanhToanKeyPayImpl.class,
					primaryKey);

			if (thanhToanKeyPay == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchThanhToanKeyPayException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(thanhToanKeyPay);
		}
		catch (NoSuchThanhToanKeyPayException nsee) {
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
	protected ThanhToanKeyPay removeImpl(ThanhToanKeyPay thanhToanKeyPay)
		throws SystemException {
		thanhToanKeyPay = toUnwrappedModel(thanhToanKeyPay);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(thanhToanKeyPay)) {
				thanhToanKeyPay = (ThanhToanKeyPay)session.get(ThanhToanKeyPayImpl.class,
						thanhToanKeyPay.getPrimaryKeyObj());
			}

			if (thanhToanKeyPay != null) {
				session.delete(thanhToanKeyPay);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (thanhToanKeyPay != null) {
			clearCache(thanhToanKeyPay);
		}

		return thanhToanKeyPay;
	}

	@Override
	public ThanhToanKeyPay updateImpl(
		vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay thanhToanKeyPay)
		throws SystemException {
		thanhToanKeyPay = toUnwrappedModel(thanhToanKeyPay);

		boolean isNew = thanhToanKeyPay.isNew();

		Session session = null;

		try {
			session = openSession();

			if (thanhToanKeyPay.isNew()) {
				session.save(thanhToanKeyPay);

				thanhToanKeyPay.setNew(false);
			}
			else {
				session.merge(thanhToanKeyPay);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ThanhToanKeyPayModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(ThanhToanKeyPayModelImpl.ENTITY_CACHE_ENABLED,
			ThanhToanKeyPayImpl.class, thanhToanKeyPay.getPrimaryKey(),
			thanhToanKeyPay);

		clearUniqueFindersCache(thanhToanKeyPay);
		cacheUniqueFindersCache(thanhToanKeyPay);

		return thanhToanKeyPay;
	}

	protected ThanhToanKeyPay toUnwrappedModel(ThanhToanKeyPay thanhToanKeyPay) {
		if (thanhToanKeyPay instanceof ThanhToanKeyPayImpl) {
			return thanhToanKeyPay;
		}

		ThanhToanKeyPayImpl thanhToanKeyPayImpl = new ThanhToanKeyPayImpl();

		thanhToanKeyPayImpl.setNew(thanhToanKeyPay.isNew());
		thanhToanKeyPayImpl.setPrimaryKey(thanhToanKeyPay.getPrimaryKey());

		thanhToanKeyPayImpl.setId(thanhToanKeyPay.getId());
		thanhToanKeyPayImpl.setIdDoanhNghiep(thanhToanKeyPay.getIdDoanhNghiep());
		thanhToanKeyPayImpl.setGoodCode(thanhToanKeyPay.getGoodCode());
		thanhToanKeyPayImpl.setAmount(thanhToanKeyPay.getAmount());
		thanhToanKeyPayImpl.setMerchantTransId(thanhToanKeyPay.getMerchantTransId());
		thanhToanKeyPayImpl.setMerchantCode(thanhToanKeyPay.getMerchantCode());
		thanhToanKeyPayImpl.setResponseCode(thanhToanKeyPay.getResponseCode());
		thanhToanKeyPayImpl.setTransidKeypay(thanhToanKeyPay.getTransidKeypay());
		thanhToanKeyPayImpl.setNetCost(thanhToanKeyPay.getNetCost());
		thanhToanKeyPayImpl.setShipFee(thanhToanKeyPay.getShipFee());
		thanhToanKeyPayImpl.setCurrencyCode(thanhToanKeyPay.getCurrencyCode());
		thanhToanKeyPayImpl.setBankCode(thanhToanKeyPay.getBankCode());
		thanhToanKeyPayImpl.setXmlDescription(thanhToanKeyPay.getXmlDescription());
		thanhToanKeyPayImpl.setNgayXuLy(thanhToanKeyPay.getNgayXuLy());
		thanhToanKeyPayImpl.setThongTinHoSo(thanhToanKeyPay.getThongTinHoSo());
		thanhToanKeyPayImpl.setLoaiMessage(thanhToanKeyPay.getLoaiMessage());
		thanhToanKeyPayImpl.setIpn(thanhToanKeyPay.getIpn());

		return thanhToanKeyPayImpl;
	}

	/**
	 * Returns the thanh toan key pay with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the thanh toan key pay
	 * @return the thanh toan key pay
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchThanhToanKeyPayException if a thanh toan key pay with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThanhToanKeyPay findByPrimaryKey(Serializable primaryKey)
		throws NoSuchThanhToanKeyPayException, SystemException {
		ThanhToanKeyPay thanhToanKeyPay = fetchByPrimaryKey(primaryKey);

		if (thanhToanKeyPay == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchThanhToanKeyPayException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return thanhToanKeyPay;
	}

	/**
	 * Returns the thanh toan key pay with the primary key or throws a {@link vn.dtt.duongbo.dao.thanhtoan.NoSuchThanhToanKeyPayException} if it could not be found.
	 *
	 * @param thanhToanKeyPayPK the primary key of the thanh toan key pay
	 * @return the thanh toan key pay
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchThanhToanKeyPayException if a thanh toan key pay with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThanhToanKeyPay findByPrimaryKey(ThanhToanKeyPayPK thanhToanKeyPayPK)
		throws NoSuchThanhToanKeyPayException, SystemException {
		return findByPrimaryKey((Serializable)thanhToanKeyPayPK);
	}

	/**
	 * Returns the thanh toan key pay with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the thanh toan key pay
	 * @return the thanh toan key pay, or <code>null</code> if a thanh toan key pay with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThanhToanKeyPay fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ThanhToanKeyPay thanhToanKeyPay = (ThanhToanKeyPay)EntityCacheUtil.getResult(ThanhToanKeyPayModelImpl.ENTITY_CACHE_ENABLED,
				ThanhToanKeyPayImpl.class, primaryKey);

		if (thanhToanKeyPay == _nullThanhToanKeyPay) {
			return null;
		}

		if (thanhToanKeyPay == null) {
			Session session = null;

			try {
				session = openSession();

				thanhToanKeyPay = (ThanhToanKeyPay)session.get(ThanhToanKeyPayImpl.class,
						primaryKey);

				if (thanhToanKeyPay != null) {
					cacheResult(thanhToanKeyPay);
				}
				else {
					EntityCacheUtil.putResult(ThanhToanKeyPayModelImpl.ENTITY_CACHE_ENABLED,
						ThanhToanKeyPayImpl.class, primaryKey,
						_nullThanhToanKeyPay);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ThanhToanKeyPayModelImpl.ENTITY_CACHE_ENABLED,
					ThanhToanKeyPayImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return thanhToanKeyPay;
	}

	/**
	 * Returns the thanh toan key pay with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param thanhToanKeyPayPK the primary key of the thanh toan key pay
	 * @return the thanh toan key pay, or <code>null</code> if a thanh toan key pay with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThanhToanKeyPay fetchByPrimaryKey(
		ThanhToanKeyPayPK thanhToanKeyPayPK) throws SystemException {
		return fetchByPrimaryKey((Serializable)thanhToanKeyPayPK);
	}

	/**
	 * Returns all the thanh toan key paies.
	 *
	 * @return the thanh toan key paies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThanhToanKeyPay> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the thanh toan key paies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.ThanhToanKeyPayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of thanh toan key paies
	 * @param end the upper bound of the range of thanh toan key paies (not inclusive)
	 * @return the range of thanh toan key paies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThanhToanKeyPay> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the thanh toan key paies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.ThanhToanKeyPayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of thanh toan key paies
	 * @param end the upper bound of the range of thanh toan key paies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of thanh toan key paies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThanhToanKeyPay> findAll(int start, int end,
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

		List<ThanhToanKeyPay> list = (List<ThanhToanKeyPay>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_THANHTOANKEYPAY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_THANHTOANKEYPAY;

				if (pagination) {
					sql = sql.concat(ThanhToanKeyPayModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ThanhToanKeyPay>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ThanhToanKeyPay>(list);
				}
				else {
					list = (List<ThanhToanKeyPay>)QueryUtil.list(q,
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
	 * Removes all the thanh toan key paies from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ThanhToanKeyPay thanhToanKeyPay : findAll()) {
			remove(thanhToanKeyPay);
		}
	}

	/**
	 * Returns the number of thanh toan key paies.
	 *
	 * @return the number of thanh toan key paies
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

				Query q = session.createQuery(_SQL_COUNT_THANHTOANKEYPAY);

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
	 * Initializes the thanh toan key pay persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ThanhToanKeyPay>> listenersList = new ArrayList<ModelListener<ThanhToanKeyPay>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ThanhToanKeyPay>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ThanhToanKeyPayImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_THANHTOANKEYPAY = "SELECT thanhToanKeyPay FROM ThanhToanKeyPay thanhToanKeyPay";
	private static final String _SQL_SELECT_THANHTOANKEYPAY_WHERE = "SELECT thanhToanKeyPay FROM ThanhToanKeyPay thanhToanKeyPay WHERE ";
	private static final String _SQL_COUNT_THANHTOANKEYPAY = "SELECT COUNT(thanhToanKeyPay) FROM ThanhToanKeyPay thanhToanKeyPay";
	private static final String _SQL_COUNT_THANHTOANKEYPAY_WHERE = "SELECT COUNT(thanhToanKeyPay) FROM ThanhToanKeyPay thanhToanKeyPay WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "thanhToanKeyPay.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ThanhToanKeyPay exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ThanhToanKeyPay exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ThanhToanKeyPayPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"idDoanhNghiep", "goodCode", "merchantTransId", "merchantCode",
				"responseCode", "transidKeypay", "netCost", "shipFee",
				"currencyCode", "bankCode", "xmlDescription", "ngayXuLy",
				"thongTinHoSo", "loaiMessage"
			});
	private static ThanhToanKeyPay _nullThanhToanKeyPay = new ThanhToanKeyPayImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ThanhToanKeyPay> toCacheModel() {
				return _nullThanhToanKeyPayCacheModel;
			}
		};

	private static CacheModel<ThanhToanKeyPay> _nullThanhToanKeyPayCacheModel = new CacheModel<ThanhToanKeyPay>() {
			@Override
			public ThanhToanKeyPay toEntityModel() {
				return _nullThanhToanKeyPay;
			}
		};
}