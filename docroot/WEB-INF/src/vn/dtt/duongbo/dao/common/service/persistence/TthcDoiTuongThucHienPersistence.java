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

import vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien;

/**
 * The persistence interface for the tthc doi tuong thuc hien service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcDoiTuongThucHienPersistenceImpl
 * @see TthcDoiTuongThucHienUtil
 * @generated
 */
public interface TthcDoiTuongThucHienPersistence extends BasePersistence<TthcDoiTuongThucHien> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TthcDoiTuongThucHienUtil} to access the tthc doi tuong thuc hien persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the tthc doi tuong thuc hiens where thuTucHanhChinhId = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @return the matching tthc doi tuong thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien> findByThuTucHanhChinhId(
		long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc doi tuong thuc hiens where thuTucHanhChinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcDoiTuongThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param start the lower bound of the range of tthc doi tuong thuc hiens
	* @param end the upper bound of the range of tthc doi tuong thuc hiens (not inclusive)
	* @return the range of matching tthc doi tuong thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien> findByThuTucHanhChinhId(
		long thuTucHanhChinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc doi tuong thuc hiens where thuTucHanhChinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcDoiTuongThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param start the lower bound of the range of tthc doi tuong thuc hiens
	* @param end the upper bound of the range of tthc doi tuong thuc hiens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc doi tuong thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien> findByThuTucHanhChinhId(
		long thuTucHanhChinhId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tthc doi tuong thuc hien in the ordered set where thuTucHanhChinhId = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc doi tuong thuc hien
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException if a matching tthc doi tuong thuc hien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien findByThuTucHanhChinhId_First(
		long thuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException;

	/**
	* Returns the first tthc doi tuong thuc hien in the ordered set where thuTucHanhChinhId = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc doi tuong thuc hien, or <code>null</code> if a matching tthc doi tuong thuc hien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien fetchByThuTucHanhChinhId_First(
		long thuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tthc doi tuong thuc hien in the ordered set where thuTucHanhChinhId = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc doi tuong thuc hien
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException if a matching tthc doi tuong thuc hien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien findByThuTucHanhChinhId_Last(
		long thuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException;

	/**
	* Returns the last tthc doi tuong thuc hien in the ordered set where thuTucHanhChinhId = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc doi tuong thuc hien, or <code>null</code> if a matching tthc doi tuong thuc hien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien fetchByThuTucHanhChinhId_Last(
		long thuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc doi tuong thuc hiens before and after the current tthc doi tuong thuc hien in the ordered set where thuTucHanhChinhId = &#63;.
	*
	* @param id the primary key of the current tthc doi tuong thuc hien
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc doi tuong thuc hien
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException if a tthc doi tuong thuc hien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien[] findByThuTucHanhChinhId_PrevAndNext(
		long id, long thuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException;

	/**
	* Removes all the tthc doi tuong thuc hiens where thuTucHanhChinhId = &#63; from the database.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByThuTucHanhChinhId(long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc doi tuong thuc hiens where thuTucHanhChinhId = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @return the number of matching tthc doi tuong thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	public int countByThuTucHanhChinhId(long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tthc doi tuong thuc hiens where loaiDoiTuongThucHien = &#63;.
	*
	* @param loaiDoiTuongThucHien the loai doi tuong thuc hien
	* @return the matching tthc doi tuong thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien> findByLoaiDoiTuongThucHien(
		java.lang.String loaiDoiTuongThucHien)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc doi tuong thuc hiens where loaiDoiTuongThucHien = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcDoiTuongThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param loaiDoiTuongThucHien the loai doi tuong thuc hien
	* @param start the lower bound of the range of tthc doi tuong thuc hiens
	* @param end the upper bound of the range of tthc doi tuong thuc hiens (not inclusive)
	* @return the range of matching tthc doi tuong thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien> findByLoaiDoiTuongThucHien(
		java.lang.String loaiDoiTuongThucHien, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc doi tuong thuc hiens where loaiDoiTuongThucHien = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcDoiTuongThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param loaiDoiTuongThucHien the loai doi tuong thuc hien
	* @param start the lower bound of the range of tthc doi tuong thuc hiens
	* @param end the upper bound of the range of tthc doi tuong thuc hiens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc doi tuong thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien> findByLoaiDoiTuongThucHien(
		java.lang.String loaiDoiTuongThucHien, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tthc doi tuong thuc hien in the ordered set where loaiDoiTuongThucHien = &#63;.
	*
	* @param loaiDoiTuongThucHien the loai doi tuong thuc hien
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc doi tuong thuc hien
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException if a matching tthc doi tuong thuc hien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien findByLoaiDoiTuongThucHien_First(
		java.lang.String loaiDoiTuongThucHien,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException;

	/**
	* Returns the first tthc doi tuong thuc hien in the ordered set where loaiDoiTuongThucHien = &#63;.
	*
	* @param loaiDoiTuongThucHien the loai doi tuong thuc hien
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc doi tuong thuc hien, or <code>null</code> if a matching tthc doi tuong thuc hien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien fetchByLoaiDoiTuongThucHien_First(
		java.lang.String loaiDoiTuongThucHien,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tthc doi tuong thuc hien in the ordered set where loaiDoiTuongThucHien = &#63;.
	*
	* @param loaiDoiTuongThucHien the loai doi tuong thuc hien
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc doi tuong thuc hien
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException if a matching tthc doi tuong thuc hien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien findByLoaiDoiTuongThucHien_Last(
		java.lang.String loaiDoiTuongThucHien,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException;

	/**
	* Returns the last tthc doi tuong thuc hien in the ordered set where loaiDoiTuongThucHien = &#63;.
	*
	* @param loaiDoiTuongThucHien the loai doi tuong thuc hien
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc doi tuong thuc hien, or <code>null</code> if a matching tthc doi tuong thuc hien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien fetchByLoaiDoiTuongThucHien_Last(
		java.lang.String loaiDoiTuongThucHien,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc doi tuong thuc hiens before and after the current tthc doi tuong thuc hien in the ordered set where loaiDoiTuongThucHien = &#63;.
	*
	* @param id the primary key of the current tthc doi tuong thuc hien
	* @param loaiDoiTuongThucHien the loai doi tuong thuc hien
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc doi tuong thuc hien
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException if a tthc doi tuong thuc hien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien[] findByLoaiDoiTuongThucHien_PrevAndNext(
		long id, java.lang.String loaiDoiTuongThucHien,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException;

	/**
	* Removes all the tthc doi tuong thuc hiens where loaiDoiTuongThucHien = &#63; from the database.
	*
	* @param loaiDoiTuongThucHien the loai doi tuong thuc hien
	* @throws SystemException if a system exception occurred
	*/
	public void removeByLoaiDoiTuongThucHien(
		java.lang.String loaiDoiTuongThucHien)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc doi tuong thuc hiens where loaiDoiTuongThucHien = &#63;.
	*
	* @param loaiDoiTuongThucHien the loai doi tuong thuc hien
	* @return the number of matching tthc doi tuong thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	public int countByLoaiDoiTuongThucHien(
		java.lang.String loaiDoiTuongThucHien)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the tthc doi tuong thuc hien in the entity cache if it is enabled.
	*
	* @param tthcDoiTuongThucHien the tthc doi tuong thuc hien
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien tthcDoiTuongThucHien);

	/**
	* Caches the tthc doi tuong thuc hiens in the entity cache if it is enabled.
	*
	* @param tthcDoiTuongThucHiens the tthc doi tuong thuc hiens
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien> tthcDoiTuongThucHiens);

	/**
	* Creates a new tthc doi tuong thuc hien with the primary key. Does not add the tthc doi tuong thuc hien to the database.
	*
	* @param id the primary key for the new tthc doi tuong thuc hien
	* @return the new tthc doi tuong thuc hien
	*/
	public vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien create(long id);

	/**
	* Removes the tthc doi tuong thuc hien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc doi tuong thuc hien
	* @return the tthc doi tuong thuc hien that was removed
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException if a tthc doi tuong thuc hien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException;

	public vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien updateImpl(
		vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien tthcDoiTuongThucHien)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc doi tuong thuc hien with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException} if it could not be found.
	*
	* @param id the primary key of the tthc doi tuong thuc hien
	* @return the tthc doi tuong thuc hien
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException if a tthc doi tuong thuc hien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException;

	/**
	* Returns the tthc doi tuong thuc hien with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tthc doi tuong thuc hien
	* @return the tthc doi tuong thuc hien, or <code>null</code> if a tthc doi tuong thuc hien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tthc doi tuong thuc hiens.
	*
	* @return the tthc doi tuong thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc doi tuong thuc hiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcDoiTuongThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc doi tuong thuc hiens
	* @param end the upper bound of the range of tthc doi tuong thuc hiens (not inclusive)
	* @return the range of tthc doi tuong thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc doi tuong thuc hiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcDoiTuongThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc doi tuong thuc hiens
	* @param end the upper bound of the range of tthc doi tuong thuc hiens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc doi tuong thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tthc doi tuong thuc hiens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc doi tuong thuc hiens.
	*
	* @return the number of tthc doi tuong thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}