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

import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau;

/**
 * The persistence interface for the tthc thanh phan ho so bieu mau service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcThanhPhanHoSoBieuMauPersistenceImpl
 * @see TthcThanhPhanHoSoBieuMauUtil
 * @generated
 */
public interface TthcThanhPhanHoSoBieuMauPersistence extends BasePersistence<TthcThanhPhanHoSoBieuMau> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TthcThanhPhanHoSoBieuMauUtil} to access the tthc thanh phan ho so bieu mau persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the tthc thanh phan ho so bieu maus where thanhPhanHoSoId = &#63;.
	*
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the matching tthc thanh phan ho so bieu maus
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau> findByThanhPhanHoSoId(
		long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc thanh phan ho so bieu maus where thanhPhanHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoBieuMauModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param start the lower bound of the range of tthc thanh phan ho so bieu maus
	* @param end the upper bound of the range of tthc thanh phan ho so bieu maus (not inclusive)
	* @return the range of matching tthc thanh phan ho so bieu maus
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau> findByThanhPhanHoSoId(
		long thanhPhanHoSoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc thanh phan ho so bieu maus where thanhPhanHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoBieuMauModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param start the lower bound of the range of tthc thanh phan ho so bieu maus
	* @param end the upper bound of the range of tthc thanh phan ho so bieu maus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc thanh phan ho so bieu maus
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau> findByThanhPhanHoSoId(
		long thanhPhanHoSoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tthc thanh phan ho so bieu mau in the ordered set where thanhPhanHoSoId = &#63;.
	*
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc thanh phan ho so bieu mau
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException if a matching tthc thanh phan ho so bieu mau could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau findByThanhPhanHoSoId_First(
		long thanhPhanHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException;

	/**
	* Returns the first tthc thanh phan ho so bieu mau in the ordered set where thanhPhanHoSoId = &#63;.
	*
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc thanh phan ho so bieu mau, or <code>null</code> if a matching tthc thanh phan ho so bieu mau could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau fetchByThanhPhanHoSoId_First(
		long thanhPhanHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tthc thanh phan ho so bieu mau in the ordered set where thanhPhanHoSoId = &#63;.
	*
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc thanh phan ho so bieu mau
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException if a matching tthc thanh phan ho so bieu mau could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau findByThanhPhanHoSoId_Last(
		long thanhPhanHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException;

	/**
	* Returns the last tthc thanh phan ho so bieu mau in the ordered set where thanhPhanHoSoId = &#63;.
	*
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc thanh phan ho so bieu mau, or <code>null</code> if a matching tthc thanh phan ho so bieu mau could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau fetchByThanhPhanHoSoId_Last(
		long thanhPhanHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc thanh phan ho so bieu maus before and after the current tthc thanh phan ho so bieu mau in the ordered set where thanhPhanHoSoId = &#63;.
	*
	* @param id the primary key of the current tthc thanh phan ho so bieu mau
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc thanh phan ho so bieu mau
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException if a tthc thanh phan ho so bieu mau with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau[] findByThanhPhanHoSoId_PrevAndNext(
		long id, long thanhPhanHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException;

	/**
	* Removes all the tthc thanh phan ho so bieu maus where thanhPhanHoSoId = &#63; from the database.
	*
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByThanhPhanHoSoId(long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc thanh phan ho so bieu maus where thanhPhanHoSoId = &#63;.
	*
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the number of matching tthc thanh phan ho so bieu maus
	* @throws SystemException if a system exception occurred
	*/
	public int countByThanhPhanHoSoId(long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tthc thanh phan ho so bieu maus where bieuMauHoSoId = &#63;.
	*
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @return the matching tthc thanh phan ho so bieu maus
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau> findByBieuMauHoSoId(
		long bieuMauHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc thanh phan ho so bieu maus where bieuMauHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoBieuMauModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param start the lower bound of the range of tthc thanh phan ho so bieu maus
	* @param end the upper bound of the range of tthc thanh phan ho so bieu maus (not inclusive)
	* @return the range of matching tthc thanh phan ho so bieu maus
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau> findByBieuMauHoSoId(
		long bieuMauHoSoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc thanh phan ho so bieu maus where bieuMauHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoBieuMauModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param start the lower bound of the range of tthc thanh phan ho so bieu maus
	* @param end the upper bound of the range of tthc thanh phan ho so bieu maus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc thanh phan ho so bieu maus
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau> findByBieuMauHoSoId(
		long bieuMauHoSoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tthc thanh phan ho so bieu mau in the ordered set where bieuMauHoSoId = &#63;.
	*
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc thanh phan ho so bieu mau
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException if a matching tthc thanh phan ho so bieu mau could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau findByBieuMauHoSoId_First(
		long bieuMauHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException;

	/**
	* Returns the first tthc thanh phan ho so bieu mau in the ordered set where bieuMauHoSoId = &#63;.
	*
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc thanh phan ho so bieu mau, or <code>null</code> if a matching tthc thanh phan ho so bieu mau could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau fetchByBieuMauHoSoId_First(
		long bieuMauHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tthc thanh phan ho so bieu mau in the ordered set where bieuMauHoSoId = &#63;.
	*
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc thanh phan ho so bieu mau
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException if a matching tthc thanh phan ho so bieu mau could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau findByBieuMauHoSoId_Last(
		long bieuMauHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException;

	/**
	* Returns the last tthc thanh phan ho so bieu mau in the ordered set where bieuMauHoSoId = &#63;.
	*
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc thanh phan ho so bieu mau, or <code>null</code> if a matching tthc thanh phan ho so bieu mau could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau fetchByBieuMauHoSoId_Last(
		long bieuMauHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc thanh phan ho so bieu maus before and after the current tthc thanh phan ho so bieu mau in the ordered set where bieuMauHoSoId = &#63;.
	*
	* @param id the primary key of the current tthc thanh phan ho so bieu mau
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc thanh phan ho so bieu mau
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException if a tthc thanh phan ho so bieu mau with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau[] findByBieuMauHoSoId_PrevAndNext(
		long id, long bieuMauHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException;

	/**
	* Removes all the tthc thanh phan ho so bieu maus where bieuMauHoSoId = &#63; from the database.
	*
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByBieuMauHoSoId(long bieuMauHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc thanh phan ho so bieu maus where bieuMauHoSoId = &#63;.
	*
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @return the number of matching tthc thanh phan ho so bieu maus
	* @throws SystemException if a system exception occurred
	*/
	public int countByBieuMauHoSoId(long bieuMauHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the tthc thanh phan ho so bieu mau in the entity cache if it is enabled.
	*
	* @param tthcThanhPhanHoSoBieuMau the tthc thanh phan ho so bieu mau
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau tthcThanhPhanHoSoBieuMau);

	/**
	* Caches the tthc thanh phan ho so bieu maus in the entity cache if it is enabled.
	*
	* @param tthcThanhPhanHoSoBieuMaus the tthc thanh phan ho so bieu maus
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau> tthcThanhPhanHoSoBieuMaus);

	/**
	* Creates a new tthc thanh phan ho so bieu mau with the primary key. Does not add the tthc thanh phan ho so bieu mau to the database.
	*
	* @param id the primary key for the new tthc thanh phan ho so bieu mau
	* @return the new tthc thanh phan ho so bieu mau
	*/
	public vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau create(
		long id);

	/**
	* Removes the tthc thanh phan ho so bieu mau with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc thanh phan ho so bieu mau
	* @return the tthc thanh phan ho so bieu mau that was removed
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException if a tthc thanh phan ho so bieu mau with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException;

	public vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau updateImpl(
		vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau tthcThanhPhanHoSoBieuMau)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc thanh phan ho so bieu mau with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException} if it could not be found.
	*
	* @param id the primary key of the tthc thanh phan ho so bieu mau
	* @return the tthc thanh phan ho so bieu mau
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException if a tthc thanh phan ho so bieu mau with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException;

	/**
	* Returns the tthc thanh phan ho so bieu mau with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tthc thanh phan ho so bieu mau
	* @return the tthc thanh phan ho so bieu mau, or <code>null</code> if a tthc thanh phan ho so bieu mau with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tthc thanh phan ho so bieu maus.
	*
	* @return the tthc thanh phan ho so bieu maus
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc thanh phan ho so bieu maus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoBieuMauModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc thanh phan ho so bieu maus
	* @param end the upper bound of the range of tthc thanh phan ho so bieu maus (not inclusive)
	* @return the range of tthc thanh phan ho so bieu maus
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc thanh phan ho so bieu maus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoBieuMauModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc thanh phan ho so bieu maus
	* @param end the upper bound of the range of tthc thanh phan ho so bieu maus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc thanh phan ho so bieu maus
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tthc thanh phan ho so bieu maus from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc thanh phan ho so bieu maus.
	*
	* @return the number of tthc thanh phan ho so bieu maus
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}