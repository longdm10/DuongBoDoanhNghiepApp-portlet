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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen;

/**
 * The persistence interface for the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenPersistenceImpl
 * @see QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenUtil
 * @generated
 */
public interface QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenPersistence
	extends BasePersistence<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenUtil} to access the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens where gpkdLoaiHinhKdId = &#63;.
	*
	* @param gpkdLoaiHinhKdId the gpkd loai hinh kd ID
	* @return the matching qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> findBygpkdLoaiHinhKdId(
		int gpkdLoaiHinhKdId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens where gpkdLoaiHinhKdId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param gpkdLoaiHinhKdId the gpkd loai hinh kd ID
	* @param start the lower bound of the range of qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens
	* @param end the upper bound of the range of qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens (not inclusive)
	* @return the range of matching qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> findBygpkdLoaiHinhKdId(
		int gpkdLoaiHinhKdId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens where gpkdLoaiHinhKdId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param gpkdLoaiHinhKdId the gpkd loai hinh kd ID
	* @param start the lower bound of the range of qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens
	* @param end the upper bound of the range of qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> findBygpkdLoaiHinhKdId(
		int gpkdLoaiHinhKdId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen in the ordered set where gpkdLoaiHinhKdId = &#63;.
	*
	* @param gpkdLoaiHinhKdId the gpkd loai hinh kd ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	* @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException if a matching qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen findBygpkdLoaiHinhKdId_First(
		int gpkdLoaiHinhKdId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException;

	/**
	* Returns the first qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen in the ordered set where gpkdLoaiHinhKdId = &#63;.
	*
	* @param gpkdLoaiHinhKdId the gpkd loai hinh kd ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen, or <code>null</code> if a matching qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen fetchBygpkdLoaiHinhKdId_First(
		int gpkdLoaiHinhKdId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen in the ordered set where gpkdLoaiHinhKdId = &#63;.
	*
	* @param gpkdLoaiHinhKdId the gpkd loai hinh kd ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	* @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException if a matching qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen findBygpkdLoaiHinhKdId_Last(
		int gpkdLoaiHinhKdId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException;

	/**
	* Returns the last qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen in the ordered set where gpkdLoaiHinhKdId = &#63;.
	*
	* @param gpkdLoaiHinhKdId the gpkd loai hinh kd ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen, or <code>null</code> if a matching qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen fetchBygpkdLoaiHinhKdId_Last(
		int gpkdLoaiHinhKdId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens before and after the current qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen in the ordered set where gpkdLoaiHinhKdId = &#63;.
	*
	* @param id the primary key of the current qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	* @param gpkdLoaiHinhKdId the gpkd loai hinh kd ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	* @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException if a qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen[] findBygpkdLoaiHinhKdId_PrevAndNext(
		long id, int gpkdLoaiHinhKdId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException;

	/**
	* Removes all the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens where gpkdLoaiHinhKdId = &#63; from the database.
	*
	* @param gpkdLoaiHinhKdId the gpkd loai hinh kd ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBygpkdLoaiHinhKdId(int gpkdLoaiHinhKdId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens where gpkdLoaiHinhKdId = &#63;.
	*
	* @param gpkdLoaiHinhKdId the gpkd loai hinh kd ID
	* @return the number of matching qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens
	* @throws SystemException if a system exception occurred
	*/
	public int countBygpkdLoaiHinhKdId(int gpkdLoaiHinhKdId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen in the entity cache if it is enabled.
	*
	* @param qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen);

	/**
	* Caches the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens in the entity cache if it is enabled.
	*
	* @param qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyens the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyens);

	/**
	* Creates a new qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen with the primary key. Does not add the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen to the database.
	*
	* @param id the primary key for the new qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	* @return the new qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen create(
		long id);

	/**
	* Removes the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	* @return the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen that was removed
	* @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException if a qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException;

	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen updateImpl(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen with the primary key or throws a {@link vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException} if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	* @return the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	* @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException if a qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException;

	/**
	* Returns the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	* @return the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen, or <code>null</code> if a qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens.
	*
	* @return the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens
	* @param end the upper bound of the range of qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens (not inclusive)
	* @return the range of qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens
	* @param end the upper bound of the range of qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens.
	*
	* @return the number of qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}