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

import vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp;

/**
 * The persistence interface for the tthc noidung ho so tmp service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcNoidungHoSoTmpPersistenceImpl
 * @see TthcNoidungHoSoTmpUtil
 * @generated
 */
public interface TthcNoidungHoSoTmpPersistence extends BasePersistence<TthcNoidungHoSoTmp> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TthcNoidungHoSoTmpUtil} to access the tthc noidung ho so tmp persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the tthc noidung ho so tmp where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException} if it could not be found.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the matching tthc noidung ho so tmp
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a matching tthc noidung ho so tmp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp findByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException;

	/**
	* Returns the tthc noidung ho so tmp where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp fetchByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho so tmp where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp fetchByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the tthc noidung ho so tmp where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the tthc noidung ho so tmp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp removeByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException;

	/**
	* Returns the number of tthc noidung ho so tmps where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the number of matching tthc noidung ho so tmps
	* @throws SystemException if a system exception occurred
	*/
	public int countByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho so tmp where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; and trangThai = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException} if it could not be found.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param trangThai the trang thai
	* @return the matching tthc noidung ho so tmp
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a matching tthc noidung ho so tmp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp findByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		long trangThai)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException;

	/**
	* Returns the tthc noidung ho so tmp where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; and trangThai = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param trangThai the trang thai
	* @return the matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp fetchByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		long trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho so tmp where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; and trangThai = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param trangThai the trang thai
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp fetchByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		long trangThai, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the tthc noidung ho so tmp where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; and trangThai = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param trangThai the trang thai
	* @return the tthc noidung ho so tmp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp removeByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		long trangThai)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException;

	/**
	* Returns the number of tthc noidung ho so tmps where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; and trangThai = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param trangThai the trang thai
	* @return the number of matching tthc noidung ho so tmps
	* @throws SystemException if a system exception occurred
	*/
	public int countByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		long trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tthc noidung ho so tmps where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the matching tthc noidung ho so tmps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp> findByHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc noidung ho so tmps where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoTmpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param start the lower bound of the range of tthc noidung ho so tmps
	* @param end the upper bound of the range of tthc noidung ho so tmps (not inclusive)
	* @return the range of matching tthc noidung ho so tmps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp> findByHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc noidung ho so tmps where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoTmpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param start the lower bound of the range of tthc noidung ho so tmps
	* @param end the upper bound of the range of tthc noidung ho so tmps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc noidung ho so tmps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp> findByHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc noidung ho so tmp
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a matching tthc noidung ho so tmp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp findByHoSoThuTucIdAndThanhPhanHoSoId_First(
		long hoSoThuTucId, long thanhPhanHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException;

	/**
	* Returns the first tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp fetchByHoSoThuTucIdAndThanhPhanHoSoId_First(
		long hoSoThuTucId, long thanhPhanHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc noidung ho so tmp
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a matching tthc noidung ho so tmp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp findByHoSoThuTucIdAndThanhPhanHoSoId_Last(
		long hoSoThuTucId, long thanhPhanHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException;

	/**
	* Returns the last tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp fetchByHoSoThuTucIdAndThanhPhanHoSoId_Last(
		long hoSoThuTucId, long thanhPhanHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho so tmps before and after the current tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param id the primary key of the current tthc noidung ho so tmp
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc noidung ho so tmp
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a tthc noidung ho so tmp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp[] findByHoSoThuTucIdAndThanhPhanHoSoId_PrevAndNext(
		long id, long hoSoThuTucId, long thanhPhanHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException;

	/**
	* Removes all the tthc noidung ho so tmps where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByHoSoThuTucIdAndThanhPhanHoSoId(long hoSoThuTucId,
		long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc noidung ho so tmps where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the number of matching tthc noidung ho so tmps
	* @throws SystemException if a system exception occurred
	*/
	public int countByHoSoThuTucIdAndThanhPhanHoSoId(long hoSoThuTucId,
		long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tthc noidung ho so tmps where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the matching tthc noidung ho so tmps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp> findByHoSoThuTucId(
		long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc noidung ho so tmps where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoTmpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of tthc noidung ho so tmps
	* @param end the upper bound of the range of tthc noidung ho so tmps (not inclusive)
	* @return the range of matching tthc noidung ho so tmps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc noidung ho so tmps where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoTmpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of tthc noidung ho so tmps
	* @param end the upper bound of the range of tthc noidung ho so tmps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc noidung ho so tmps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc noidung ho so tmp
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a matching tthc noidung ho so tmp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp findByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException;

	/**
	* Returns the first tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp fetchByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc noidung ho so tmp
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a matching tthc noidung ho so tmp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp findByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException;

	/**
	* Returns the last tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp fetchByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho so tmps before and after the current tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param id the primary key of the current tthc noidung ho so tmp
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc noidung ho so tmp
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a tthc noidung ho so tmp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp[] findByHoSoThuTucId_PrevAndNext(
		long id, long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException;

	/**
	* Removes all the tthc noidung ho so tmps where hoSoThuTucId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc noidung ho so tmps where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the number of matching tthc noidung ho so tmps
	* @throws SystemException if a system exception occurred
	*/
	public int countByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho so tmp where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException} if it could not be found.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @return the matching tthc noidung ho so tmp
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a matching tthc noidung ho so tmp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp findByHoSoThuTucIdAndBieuMauHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException;

	/**
	* Returns the tthc noidung ho so tmp where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @return the matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp fetchByHoSoThuTucIdAndBieuMauHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho so tmp where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp fetchByHoSoThuTucIdAndBieuMauHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the tthc noidung ho so tmp where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @return the tthc noidung ho so tmp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp removeByHoSoThuTucIdAndBieuMauHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException;

	/**
	* Returns the number of tthc noidung ho so tmps where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @return the number of matching tthc noidung ho so tmps
	* @throws SystemException if a system exception occurred
	*/
	public int countByHoSoThuTucIdAndBieuMauHoSoId(long hoSoThuTucId,
		long bieuMauHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho so tmp where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException} if it could not be found.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the matching tthc noidung ho so tmp
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a matching tthc noidung ho so tmp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp findByHoSoThuTucIdThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException;

	/**
	* Returns the tthc noidung ho so tmp where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp fetchByHoSoThuTucIdThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho so tmp where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp fetchByHoSoThuTucIdThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the tthc noidung ho so tmp where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the tthc noidung ho so tmp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp removeByHoSoThuTucIdThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException;

	/**
	* Returns the number of tthc noidung ho so tmps where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the number of matching tthc noidung ho so tmps
	* @throws SystemException if a system exception occurred
	*/
	public int countByHoSoThuTucIdThanhPhanHoSoId(long hoSoThuTucId,
		long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tthc noidung ho so tmps where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @return the matching tthc noidung ho so tmps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp> findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc noidung ho so tmps where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoTmpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @param start the lower bound of the range of tthc noidung ho so tmps
	* @param end the upper bound of the range of tthc noidung ho so tmps (not inclusive)
	* @return the range of matching tthc noidung ho so tmps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp> findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc noidung ho so tmps where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoTmpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @param start the lower bound of the range of tthc noidung ho so tmps
	* @param end the upper bound of the range of tthc noidung ho so tmps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc noidung ho so tmps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp> findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc noidung ho so tmp
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a matching tthc noidung ho so tmp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_First(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException;

	/**
	* Returns the first tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_First(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc noidung ho so tmp
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a matching tthc noidung ho so tmp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_Last(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException;

	/**
	* Returns the last tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc noidung ho so tmp, or <code>null</code> if a matching tthc noidung ho so tmp could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_Last(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho so tmps before and after the current tthc noidung ho so tmp in the ordered set where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* @param id the primary key of the current tthc noidung ho so tmp
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc noidung ho so tmp
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a tthc noidung ho so tmp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp[] findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_PrevAndNext(
		long id, long hoSoThuTucId, long bieuMauHoSoId,
		java.lang.String maTuSinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException;

	/**
	* Removes all the tthc noidung ho so tmps where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @throws SystemException if a system exception occurred
	*/
	public void removeByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc noidung ho so tmps where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @return the number of matching tthc noidung ho so tmps
	* @throws SystemException if a system exception occurred
	*/
	public int countByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the tthc noidung ho so tmp in the entity cache if it is enabled.
	*
	* @param tthcNoidungHoSoTmp the tthc noidung ho so tmp
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp tthcNoidungHoSoTmp);

	/**
	* Caches the tthc noidung ho so tmps in the entity cache if it is enabled.
	*
	* @param tthcNoidungHoSoTmps the tthc noidung ho so tmps
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp> tthcNoidungHoSoTmps);

	/**
	* Creates a new tthc noidung ho so tmp with the primary key. Does not add the tthc noidung ho so tmp to the database.
	*
	* @param id the primary key for the new tthc noidung ho so tmp
	* @return the new tthc noidung ho so tmp
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp create(long id);

	/**
	* Removes the tthc noidung ho so tmp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc noidung ho so tmp
	* @return the tthc noidung ho so tmp that was removed
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a tthc noidung ho so tmp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException;

	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp updateImpl(
		vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp tthcNoidungHoSoTmp)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho so tmp with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException} if it could not be found.
	*
	* @param id the primary key of the tthc noidung ho so tmp
	* @return the tthc noidung ho so tmp
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException if a tthc noidung ho so tmp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoTmpException;

	/**
	* Returns the tthc noidung ho so tmp with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tthc noidung ho so tmp
	* @return the tthc noidung ho so tmp, or <code>null</code> if a tthc noidung ho so tmp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tthc noidung ho so tmps.
	*
	* @return the tthc noidung ho so tmps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc noidung ho so tmps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoTmpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc noidung ho so tmps
	* @param end the upper bound of the range of tthc noidung ho so tmps (not inclusive)
	* @return the range of tthc noidung ho so tmps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc noidung ho so tmps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoTmpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc noidung ho so tmps
	* @param end the upper bound of the range of tthc noidung ho so tmps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc noidung ho so tmps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tthc noidung ho so tmps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc noidung ho so tmps.
	*
	* @return the number of tthc noidung ho so tmps
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}