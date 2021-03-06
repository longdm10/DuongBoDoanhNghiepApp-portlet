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

package vn.dtt.duongbo.dao.doanhnghiep.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep;

/**
 * The persistence interface for the dn doanh nghiep service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DnDoanhNghiepPersistenceImpl
 * @see DnDoanhNghiepUtil
 * @generated
 */
public interface DnDoanhNghiepPersistence extends BasePersistence<DnDoanhNghiep> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DnDoanhNghiepUtil} to access the dn doanh nghiep persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the dn doanh nghiep where id = &#63; or throws a {@link vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException} if it could not be found.
	*
	* @param id the ID
	* @return the matching dn doanh nghiep
	* @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a matching dn doanh nghiep could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep findByDnNguoiLamThuTucID(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException;

	/**
	* Returns the dn doanh nghiep where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param id the ID
	* @return the matching dn doanh nghiep, or <code>null</code> if a matching dn doanh nghiep could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep fetchByDnNguoiLamThuTucID(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dn doanh nghiep where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param id the ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dn doanh nghiep, or <code>null</code> if a matching dn doanh nghiep could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep fetchByDnNguoiLamThuTucID(
		long id, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dn doanh nghiep where id = &#63; from the database.
	*
	* @param id the ID
	* @return the dn doanh nghiep that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep removeByDnNguoiLamThuTucID(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException;

	/**
	* Returns the number of dn doanh nghieps where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public int countByDnNguoiLamThuTucID(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dn doanh nghieps where loaiNguoiLamThuTuc = &#63;.
	*
	* @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	* @return the matching dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> findByloaiNguoiLamThuTuc(
		java.lang.String loaiNguoiLamThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dn doanh nghieps where loaiNguoiLamThuTuc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	* @param start the lower bound of the range of dn doanh nghieps
	* @param end the upper bound of the range of dn doanh nghieps (not inclusive)
	* @return the range of matching dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> findByloaiNguoiLamThuTuc(
		java.lang.String loaiNguoiLamThuTuc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dn doanh nghieps where loaiNguoiLamThuTuc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	* @param start the lower bound of the range of dn doanh nghieps
	* @param end the upper bound of the range of dn doanh nghieps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> findByloaiNguoiLamThuTuc(
		java.lang.String loaiNguoiLamThuTuc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dn doanh nghiep in the ordered set where loaiNguoiLamThuTuc = &#63;.
	*
	* @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dn doanh nghiep
	* @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a matching dn doanh nghiep could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep findByloaiNguoiLamThuTuc_First(
		java.lang.String loaiNguoiLamThuTuc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException;

	/**
	* Returns the first dn doanh nghiep in the ordered set where loaiNguoiLamThuTuc = &#63;.
	*
	* @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dn doanh nghiep, or <code>null</code> if a matching dn doanh nghiep could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep fetchByloaiNguoiLamThuTuc_First(
		java.lang.String loaiNguoiLamThuTuc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dn doanh nghiep in the ordered set where loaiNguoiLamThuTuc = &#63;.
	*
	* @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dn doanh nghiep
	* @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a matching dn doanh nghiep could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep findByloaiNguoiLamThuTuc_Last(
		java.lang.String loaiNguoiLamThuTuc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException;

	/**
	* Returns the last dn doanh nghiep in the ordered set where loaiNguoiLamThuTuc = &#63;.
	*
	* @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dn doanh nghiep, or <code>null</code> if a matching dn doanh nghiep could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep fetchByloaiNguoiLamThuTuc_Last(
		java.lang.String loaiNguoiLamThuTuc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dn doanh nghieps before and after the current dn doanh nghiep in the ordered set where loaiNguoiLamThuTuc = &#63;.
	*
	* @param id the primary key of the current dn doanh nghiep
	* @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dn doanh nghiep
	* @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a dn doanh nghiep with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep[] findByloaiNguoiLamThuTuc_PrevAndNext(
		long id, java.lang.String loaiNguoiLamThuTuc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException;

	/**
	* Removes all the dn doanh nghieps where loaiNguoiLamThuTuc = &#63; from the database.
	*
	* @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	* @throws SystemException if a system exception occurred
	*/
	public void removeByloaiNguoiLamThuTuc(java.lang.String loaiNguoiLamThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dn doanh nghieps where loaiNguoiLamThuTuc = &#63;.
	*
	* @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	* @return the number of matching dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public int countByloaiNguoiLamThuTuc(java.lang.String loaiNguoiLamThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dn doanh nghieps where email = &#63;.
	*
	* @param email the email
	* @return the matching dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> findByEmail(
		java.lang.String email)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dn doanh nghieps where email = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param email the email
	* @param start the lower bound of the range of dn doanh nghieps
	* @param end the upper bound of the range of dn doanh nghieps (not inclusive)
	* @return the range of matching dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> findByEmail(
		java.lang.String email, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dn doanh nghieps where email = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param email the email
	* @param start the lower bound of the range of dn doanh nghieps
	* @param end the upper bound of the range of dn doanh nghieps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> findByEmail(
		java.lang.String email, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dn doanh nghiep in the ordered set where email = &#63;.
	*
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dn doanh nghiep
	* @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a matching dn doanh nghiep could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep findByEmail_First(
		java.lang.String email,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException;

	/**
	* Returns the first dn doanh nghiep in the ordered set where email = &#63;.
	*
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dn doanh nghiep, or <code>null</code> if a matching dn doanh nghiep could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep fetchByEmail_First(
		java.lang.String email,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dn doanh nghiep in the ordered set where email = &#63;.
	*
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dn doanh nghiep
	* @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a matching dn doanh nghiep could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep findByEmail_Last(
		java.lang.String email,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException;

	/**
	* Returns the last dn doanh nghiep in the ordered set where email = &#63;.
	*
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dn doanh nghiep, or <code>null</code> if a matching dn doanh nghiep could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep fetchByEmail_Last(
		java.lang.String email,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dn doanh nghieps before and after the current dn doanh nghiep in the ordered set where email = &#63;.
	*
	* @param id the primary key of the current dn doanh nghiep
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dn doanh nghiep
	* @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a dn doanh nghiep with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep[] findByEmail_PrevAndNext(
		long id, java.lang.String email,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException;

	/**
	* Removes all the dn doanh nghieps where email = &#63; from the database.
	*
	* @param email the email
	* @throws SystemException if a system exception occurred
	*/
	public void removeByEmail(java.lang.String email)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dn doanh nghieps where email = &#63;.
	*
	* @param email the email
	* @return the number of matching dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public int countByEmail(java.lang.String email)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dn doanh nghiep in the entity cache if it is enabled.
	*
	* @param dnDoanhNghiep the dn doanh nghiep
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep dnDoanhNghiep);

	/**
	* Caches the dn doanh nghieps in the entity cache if it is enabled.
	*
	* @param dnDoanhNghieps the dn doanh nghieps
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> dnDoanhNghieps);

	/**
	* Creates a new dn doanh nghiep with the primary key. Does not add the dn doanh nghiep to the database.
	*
	* @param id the primary key for the new dn doanh nghiep
	* @return the new dn doanh nghiep
	*/
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep create(long id);

	/**
	* Removes the dn doanh nghiep with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dn doanh nghiep
	* @return the dn doanh nghiep that was removed
	* @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a dn doanh nghiep with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException;

	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep updateImpl(
		vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep dnDoanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dn doanh nghiep with the primary key or throws a {@link vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException} if it could not be found.
	*
	* @param id the primary key of the dn doanh nghiep
	* @return the dn doanh nghiep
	* @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a dn doanh nghiep with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException;

	/**
	* Returns the dn doanh nghiep with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dn doanh nghiep
	* @return the dn doanh nghiep, or <code>null</code> if a dn doanh nghiep with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dn doanh nghieps.
	*
	* @return the dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dn doanh nghieps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dn doanh nghieps
	* @param end the upper bound of the range of dn doanh nghieps (not inclusive)
	* @return the range of dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dn doanh nghieps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dn doanh nghieps
	* @param end the upper bound of the range of dn doanh nghieps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dn doanh nghieps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dn doanh nghieps.
	*
	* @return the number of dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}