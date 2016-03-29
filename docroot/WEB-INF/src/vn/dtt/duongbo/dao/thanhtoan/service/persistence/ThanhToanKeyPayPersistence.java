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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay;

/**
 * The persistence interface for the thanh toan key pay service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ThanhToanKeyPayPersistenceImpl
 * @see ThanhToanKeyPayUtil
 * @generated
 */
public interface ThanhToanKeyPayPersistence extends BasePersistence<ThanhToanKeyPay> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ThanhToanKeyPayUtil} to access the thanh toan key pay persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the thanh toan key pay where goodCode = &#63; or throws a {@link vn.dtt.duongbo.dao.thanhtoan.NoSuchThanhToanKeyPayException} if it could not be found.
	*
	* @param goodCode the good code
	* @return the matching thanh toan key pay
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchThanhToanKeyPayException if a matching thanh toan key pay could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay findBygoodCode(
		java.lang.String goodCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchThanhToanKeyPayException;

	/**
	* Returns the thanh toan key pay where goodCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param goodCode the good code
	* @return the matching thanh toan key pay, or <code>null</code> if a matching thanh toan key pay could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay fetchBygoodCode(
		java.lang.String goodCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the thanh toan key pay where goodCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param goodCode the good code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching thanh toan key pay, or <code>null</code> if a matching thanh toan key pay could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay fetchBygoodCode(
		java.lang.String goodCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the thanh toan key pay where goodCode = &#63; from the database.
	*
	* @param goodCode the good code
	* @return the thanh toan key pay that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay removeBygoodCode(
		java.lang.String goodCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchThanhToanKeyPayException;

	/**
	* Returns the number of thanh toan key paies where goodCode = &#63;.
	*
	* @param goodCode the good code
	* @return the number of matching thanh toan key paies
	* @throws SystemException if a system exception occurred
	*/
	public int countBygoodCode(java.lang.String goodCode)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay findByGoodCodeAndMerchantCodeAndMerchantTransIdAndLoaiMessage(
		java.lang.String goodCode, java.lang.String merchantCode,
		java.lang.String merchantTransId, long loaiMessage)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchThanhToanKeyPayException;

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
	public vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay fetchByGoodCodeAndMerchantCodeAndMerchantTransIdAndLoaiMessage(
		java.lang.String goodCode, java.lang.String merchantCode,
		java.lang.String merchantTransId, long loaiMessage)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay fetchByGoodCodeAndMerchantCodeAndMerchantTransIdAndLoaiMessage(
		java.lang.String goodCode, java.lang.String merchantCode,
		java.lang.String merchantTransId, long loaiMessage,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay removeByGoodCodeAndMerchantCodeAndMerchantTransIdAndLoaiMessage(
		java.lang.String goodCode, java.lang.String merchantCode,
		java.lang.String merchantTransId, long loaiMessage)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchThanhToanKeyPayException;

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
	public int countByGoodCodeAndMerchantCodeAndMerchantTransIdAndLoaiMessage(
		java.lang.String goodCode, java.lang.String merchantCode,
		java.lang.String merchantTransId, long loaiMessage)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the thanh toan key pay in the entity cache if it is enabled.
	*
	* @param thanhToanKeyPay the thanh toan key pay
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay thanhToanKeyPay);

	/**
	* Caches the thanh toan key paies in the entity cache if it is enabled.
	*
	* @param thanhToanKeyPaies the thanh toan key paies
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay> thanhToanKeyPaies);

	/**
	* Creates a new thanh toan key pay with the primary key. Does not add the thanh toan key pay to the database.
	*
	* @param thanhToanKeyPayPK the primary key for the new thanh toan key pay
	* @return the new thanh toan key pay
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay create(
		vn.dtt.duongbo.dao.thanhtoan.service.persistence.ThanhToanKeyPayPK thanhToanKeyPayPK);

	/**
	* Removes the thanh toan key pay with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param thanhToanKeyPayPK the primary key of the thanh toan key pay
	* @return the thanh toan key pay that was removed
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchThanhToanKeyPayException if a thanh toan key pay with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay remove(
		vn.dtt.duongbo.dao.thanhtoan.service.persistence.ThanhToanKeyPayPK thanhToanKeyPayPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchThanhToanKeyPayException;

	public vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay updateImpl(
		vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay thanhToanKeyPay)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the thanh toan key pay with the primary key or throws a {@link vn.dtt.duongbo.dao.thanhtoan.NoSuchThanhToanKeyPayException} if it could not be found.
	*
	* @param thanhToanKeyPayPK the primary key of the thanh toan key pay
	* @return the thanh toan key pay
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchThanhToanKeyPayException if a thanh toan key pay with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay findByPrimaryKey(
		vn.dtt.duongbo.dao.thanhtoan.service.persistence.ThanhToanKeyPayPK thanhToanKeyPayPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchThanhToanKeyPayException;

	/**
	* Returns the thanh toan key pay with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param thanhToanKeyPayPK the primary key of the thanh toan key pay
	* @return the thanh toan key pay, or <code>null</code> if a thanh toan key pay with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay fetchByPrimaryKey(
		vn.dtt.duongbo.dao.thanhtoan.service.persistence.ThanhToanKeyPayPK thanhToanKeyPayPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the thanh toan key paies.
	*
	* @return the thanh toan key paies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the thanh toan key paies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of thanh toan key paies.
	*
	* @return the number of thanh toan key paies
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}