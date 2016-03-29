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

import vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo;

/**
 * The persistence interface for the tthc noidung ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcNoidungHoSoPersistenceImpl
 * @see TthcNoidungHoSoUtil
 * @generated
 */
public interface TthcNoidungHoSoPersistence extends BasePersistence<TthcNoidungHoSo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TthcNoidungHoSoUtil} to access the tthc noidung ho so persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException} if it could not be found.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the tthc noidung ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo removeByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;

	/**
	* Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the number of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; and trangThai = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException} if it could not be found.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param trangThai the trang thai
	* @return the matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		long trangThai)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; and trangThai = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param trangThai the trang thai
	* @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		long trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; and trangThai = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param trangThai the trang thai
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		long trangThai, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; and trangThai = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param trangThai the trang thai
	* @return the tthc noidung ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo removeByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		long trangThai)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;

	/**
	* Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; and trangThai = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param trangThai the trang thai
	* @return the number of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		long trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tthc noidung ho sos where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc noidung ho sos where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @return the range of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc noidung ho sos where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByHoSoThuTucIdAndThanhPhanHoSoId_First(
		long hoSoThuTucId, long thanhPhanHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;

	/**
	* Returns the first tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucIdAndThanhPhanHoSoId_First(
		long hoSoThuTucId, long thanhPhanHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByHoSoThuTucIdAndThanhPhanHoSoId_Last(
		long hoSoThuTucId, long thanhPhanHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;

	/**
	* Returns the last tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucIdAndThanhPhanHoSoId_Last(
		long hoSoThuTucId, long thanhPhanHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho sos before and after the current tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param id the primary key of the current tthc noidung ho so
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo[] findByHoSoThuTucIdAndThanhPhanHoSoId_PrevAndNext(
		long id, long hoSoThuTucId, long thanhPhanHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;

	/**
	* Removes all the tthc noidung ho sos where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByHoSoThuTucIdAndThanhPhanHoSoId(long hoSoThuTucId,
		long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the number of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByHoSoThuTucIdAndThanhPhanHoSoId(long hoSoThuTucId,
		long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tthc noidung ho sos where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByHoSoThuTucId(
		long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc noidung ho sos where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @return the range of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc noidung ho sos where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;

	/**
	* Returns the first tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;

	/**
	* Returns the last tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho sos before and after the current tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param id the primary key of the current tthc noidung ho so
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo[] findByHoSoThuTucId_PrevAndNext(
		long id, long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;

	/**
	* Removes all the tthc noidung ho sos where hoSoThuTucId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the number of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and taiLieuDinhKem = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException} if it could not be found.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param taiLieuDinhKem the tai lieu dinh kem
	* @return the matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByHoSoThuTucId_TaiLieuDinhKem(
		long hoSoThuTucId, long taiLieuDinhKem)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and taiLieuDinhKem = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param taiLieuDinhKem the tai lieu dinh kem
	* @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucId_TaiLieuDinhKem(
		long hoSoThuTucId, long taiLieuDinhKem)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and taiLieuDinhKem = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param taiLieuDinhKem the tai lieu dinh kem
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucId_TaiLieuDinhKem(
		long hoSoThuTucId, long taiLieuDinhKem, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the tthc noidung ho so where hoSoThuTucId = &#63; and taiLieuDinhKem = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param taiLieuDinhKem the tai lieu dinh kem
	* @return the tthc noidung ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo removeByHoSoThuTucId_TaiLieuDinhKem(
		long hoSoThuTucId, long taiLieuDinhKem)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;

	/**
	* Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63; and taiLieuDinhKem = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param taiLieuDinhKem the tai lieu dinh kem
	* @return the number of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByHoSoThuTucId_TaiLieuDinhKem(long hoSoThuTucId,
		long taiLieuDinhKem)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException} if it could not be found.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @return the matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByHoSoThuTucIdAndBieuMauHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucIdAndBieuMauHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucIdAndBieuMauHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @return the tthc noidung ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo removeByHoSoThuTucIdAndBieuMauHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;

	/**
	* Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @return the number of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByHoSoThuTucIdAndBieuMauHoSoId(long hoSoThuTucId,
		long bieuMauHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException} if it could not be found.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByHoSoThuTucIdThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucIdThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucIdThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the tthc noidung ho so where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the tthc noidung ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo removeByHoSoThuTucIdThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;

	/**
	* Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the number of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByHoSoThuTucIdThanhPhanHoSoId(long hoSoThuTucId,
		long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tthc noidung ho sos where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @return the matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc noidung ho sos where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @return the range of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc noidung ho sos where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_First(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;

	/**
	* Returns the first tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_First(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_Last(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;

	/**
	* Returns the last tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_Last(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho sos before and after the current tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* @param id the primary key of the current tthc noidung ho so
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo[] findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_PrevAndNext(
		long id, long hoSoThuTucId, long bieuMauHoSoId,
		java.lang.String maTuSinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;

	/**
	* Removes all the tthc noidung ho sos where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63; from the database.
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
	* Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @return the number of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException} if it could not be found.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByHoSoThuTucDonOnline(
		long hoSoThuTucId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucDonOnline(
		long hoSoThuTucId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucDonOnline(
		long hoSoThuTucId, long thanhPhanHoSoId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the tthc noidung ho so where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the tthc noidung ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo removeByHoSoThuTucDonOnline(
		long hoSoThuTucId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;

	/**
	* Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the number of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByHoSoThuTucDonOnline(long hoSoThuTucId,
		long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tthc noidung ho sos where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByF_HS_DINH_KEM(
		long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc noidung ho sos where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @return the range of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByF_HS_DINH_KEM(
		long hoSoThuTucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc noidung ho sos where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByF_HS_DINH_KEM(
		long hoSoThuTucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByF_HS_DINH_KEM_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;

	/**
	* Returns the first tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByF_HS_DINH_KEM_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByF_HS_DINH_KEM_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;

	/**
	* Returns the last tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByF_HS_DINH_KEM_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho sos before and after the current tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param id the primary key of the current tthc noidung ho so
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo[] findByF_HS_DINH_KEM_PrevAndNext(
		long id, long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;

	/**
	* Removes all the tthc noidung ho sos where hoSoThuTucId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByF_HS_DINH_KEM(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the number of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByF_HS_DINH_KEM(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the tthc noidung ho so in the entity cache if it is enabled.
	*
	* @param tthcNoidungHoSo the tthc noidung ho so
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo tthcNoidungHoSo);

	/**
	* Caches the tthc noidung ho sos in the entity cache if it is enabled.
	*
	* @param tthcNoidungHoSos the tthc noidung ho sos
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> tthcNoidungHoSos);

	/**
	* Creates a new tthc noidung ho so with the primary key. Does not add the tthc noidung ho so to the database.
	*
	* @param id the primary key for the new tthc noidung ho so
	* @return the new tthc noidung ho so
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo create(long id);

	/**
	* Removes the tthc noidung ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc noidung ho so
	* @return the tthc noidung ho so that was removed
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;

	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo updateImpl(
		vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo tthcNoidungHoSo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc noidung ho so with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException} if it could not be found.
	*
	* @param id the primary key of the tthc noidung ho so
	* @return the tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException;

	/**
	* Returns the tthc noidung ho so with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tthc noidung ho so
	* @return the tthc noidung ho so, or <code>null</code> if a tthc noidung ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tthc noidung ho sos.
	*
	* @return the tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc noidung ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @return the range of tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc noidung ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tthc noidung ho sos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc noidung ho sos.
	*
	* @return the number of tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}