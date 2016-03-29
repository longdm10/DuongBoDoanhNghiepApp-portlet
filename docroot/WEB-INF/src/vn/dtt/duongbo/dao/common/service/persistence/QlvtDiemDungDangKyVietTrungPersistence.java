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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung;

/**
 * The persistence interface for the qlvt diem dung dang ky viet trung service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see QlvtDiemDungDangKyVietTrungPersistenceImpl
 * @see QlvtDiemDungDangKyVietTrungUtil
 * @generated
 */
public interface QlvtDiemDungDangKyVietTrungPersistence extends BasePersistence<QlvtDiemDungDangKyVietTrung> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QlvtDiemDungDangKyVietTrungUtil} to access the qlvt diem dung dang ky viet trung persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the qlvt diem dung dang ky viet trung in the entity cache if it is enabled.
	*
	* @param qlvtDiemDungDangKyVietTrung the qlvt diem dung dang ky viet trung
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung qlvtDiemDungDangKyVietTrung);

	/**
	* Caches the qlvt diem dung dang ky viet trungs in the entity cache if it is enabled.
	*
	* @param qlvtDiemDungDangKyVietTrungs the qlvt diem dung dang ky viet trungs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung> qlvtDiemDungDangKyVietTrungs);

	/**
	* Creates a new qlvt diem dung dang ky viet trung with the primary key. Does not add the qlvt diem dung dang ky viet trung to the database.
	*
	* @param id the primary key for the new qlvt diem dung dang ky viet trung
	* @return the new qlvt diem dung dang ky viet trung
	*/
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung create(
		long id);

	/**
	* Removes the qlvt diem dung dang ky viet trung with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt diem dung dang ky viet trung
	* @return the qlvt diem dung dang ky viet trung that was removed
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietTrungException if a qlvt diem dung dang ky viet trung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietTrungException;

	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung updateImpl(
		vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung qlvtDiemDungDangKyVietTrung)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt diem dung dang ky viet trung with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietTrungException} if it could not be found.
	*
	* @param id the primary key of the qlvt diem dung dang ky viet trung
	* @return the qlvt diem dung dang ky viet trung
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietTrungException if a qlvt diem dung dang ky viet trung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietTrungException;

	/**
	* Returns the qlvt diem dung dang ky viet trung with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt diem dung dang ky viet trung
	* @return the qlvt diem dung dang ky viet trung, or <code>null</code> if a qlvt diem dung dang ky viet trung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the qlvt diem dung dang ky viet trungs.
	*
	* @return the qlvt diem dung dang ky viet trungs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the qlvt diem dung dang ky viet trungs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietTrungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt diem dung dang ky viet trungs
	* @param end the upper bound of the range of qlvt diem dung dang ky viet trungs (not inclusive)
	* @return the range of qlvt diem dung dang ky viet trungs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the qlvt diem dung dang ky viet trungs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietTrungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt diem dung dang ky viet trungs
	* @param end the upper bound of the range of qlvt diem dung dang ky viet trungs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt diem dung dang ky viet trungs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the qlvt diem dung dang ky viet trungs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt diem dung dang ky viet trungs.
	*
	* @return the number of qlvt diem dung dang ky viet trungs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}