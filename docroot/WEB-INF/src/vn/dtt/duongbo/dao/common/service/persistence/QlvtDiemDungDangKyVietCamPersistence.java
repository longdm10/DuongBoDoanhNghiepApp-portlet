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

import vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam;

/**
 * The persistence interface for the qlvt diem dung dang ky viet cam service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see QlvtDiemDungDangKyVietCamPersistenceImpl
 * @see QlvtDiemDungDangKyVietCamUtil
 * @generated
 */
public interface QlvtDiemDungDangKyVietCamPersistence extends BasePersistence<QlvtDiemDungDangKyVietCam> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QlvtDiemDungDangKyVietCamUtil} to access the qlvt diem dung dang ky viet cam persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the qlvt diem dung dang ky viet cam in the entity cache if it is enabled.
	*
	* @param qlvtDiemDungDangKyVietCam the qlvt diem dung dang ky viet cam
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam qlvtDiemDungDangKyVietCam);

	/**
	* Caches the qlvt diem dung dang ky viet cams in the entity cache if it is enabled.
	*
	* @param qlvtDiemDungDangKyVietCams the qlvt diem dung dang ky viet cams
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam> qlvtDiemDungDangKyVietCams);

	/**
	* Creates a new qlvt diem dung dang ky viet cam with the primary key. Does not add the qlvt diem dung dang ky viet cam to the database.
	*
	* @param id the primary key for the new qlvt diem dung dang ky viet cam
	* @return the new qlvt diem dung dang ky viet cam
	*/
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam create(
		long id);

	/**
	* Removes the qlvt diem dung dang ky viet cam with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt diem dung dang ky viet cam
	* @return the qlvt diem dung dang ky viet cam that was removed
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietCamException if a qlvt diem dung dang ky viet cam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietCamException;

	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam updateImpl(
		vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam qlvtDiemDungDangKyVietCam)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt diem dung dang ky viet cam with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietCamException} if it could not be found.
	*
	* @param id the primary key of the qlvt diem dung dang ky viet cam
	* @return the qlvt diem dung dang ky viet cam
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietCamException if a qlvt diem dung dang ky viet cam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietCamException;

	/**
	* Returns the qlvt diem dung dang ky viet cam with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt diem dung dang ky viet cam
	* @return the qlvt diem dung dang ky viet cam, or <code>null</code> if a qlvt diem dung dang ky viet cam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the qlvt diem dung dang ky viet cams.
	*
	* @return the qlvt diem dung dang ky viet cams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the qlvt diem dung dang ky viet cams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietCamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt diem dung dang ky viet cams
	* @param end the upper bound of the range of qlvt diem dung dang ky viet cams (not inclusive)
	* @return the range of qlvt diem dung dang ky viet cams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the qlvt diem dung dang ky viet cams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietCamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt diem dung dang ky viet cams
	* @param end the upper bound of the range of qlvt diem dung dang ky viet cams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt diem dung dang ky viet cams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the qlvt diem dung dang ky viet cams from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt diem dung dang ky viet cams.
	*
	* @return the number of qlvt diem dung dang ky viet cams
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}