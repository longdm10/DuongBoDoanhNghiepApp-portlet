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

import vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan;

/**
 * The persistence interface for the tthc xac nhan thanh toan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcXacNhanThanhToanPersistenceImpl
 * @see TthcXacNhanThanhToanUtil
 * @generated
 */
public interface TthcXacNhanThanhToanPersistence extends BasePersistence<TthcXacNhanThanhToan> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TthcXacNhanThanhToanUtil} to access the tthc xac nhan thanh toan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the tthc xac nhan thanh toans where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @return the matching tthc xac nhan thanh toans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> findByToChucQuanLy(
		long toChucQuanLy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc xac nhan thanh toans where toChucQuanLy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param start the lower bound of the range of tthc xac nhan thanh toans
	* @param end the upper bound of the range of tthc xac nhan thanh toans (not inclusive)
	* @return the range of matching tthc xac nhan thanh toans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> findByToChucQuanLy(
		long toChucQuanLy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc xac nhan thanh toans where toChucQuanLy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param start the lower bound of the range of tthc xac nhan thanh toans
	* @param end the upper bound of the range of tthc xac nhan thanh toans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc xac nhan thanh toans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> findByToChucQuanLy(
		long toChucQuanLy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tthc xac nhan thanh toan in the ordered set where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc xac nhan thanh toan
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException if a matching tthc xac nhan thanh toan could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan findByToChucQuanLy_First(
		long toChucQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException;

	/**
	* Returns the first tthc xac nhan thanh toan in the ordered set where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc xac nhan thanh toan, or <code>null</code> if a matching tthc xac nhan thanh toan could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan fetchByToChucQuanLy_First(
		long toChucQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tthc xac nhan thanh toan in the ordered set where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc xac nhan thanh toan
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException if a matching tthc xac nhan thanh toan could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan findByToChucQuanLy_Last(
		long toChucQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException;

	/**
	* Returns the last tthc xac nhan thanh toan in the ordered set where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc xac nhan thanh toan, or <code>null</code> if a matching tthc xac nhan thanh toan could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan fetchByToChucQuanLy_Last(
		long toChucQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc xac nhan thanh toans before and after the current tthc xac nhan thanh toan in the ordered set where toChucQuanLy = &#63;.
	*
	* @param id the primary key of the current tthc xac nhan thanh toan
	* @param toChucQuanLy the to chuc quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc xac nhan thanh toan
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException if a tthc xac nhan thanh toan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan[] findByToChucQuanLy_PrevAndNext(
		long id, long toChucQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException;

	/**
	* Removes all the tthc xac nhan thanh toans where toChucQuanLy = &#63; from the database.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @throws SystemException if a system exception occurred
	*/
	public void removeByToChucQuanLy(long toChucQuanLy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc xac nhan thanh toans where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @return the number of matching tthc xac nhan thanh toans
	* @throws SystemException if a system exception occurred
	*/
	public int countByToChucQuanLy(long toChucQuanLy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc xac nhan thanh toan where maTuSinh = &#63; or throws a {@link vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException} if it could not be found.
	*
	* @param maTuSinh the ma tu sinh
	* @return the matching tthc xac nhan thanh toan
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException if a matching tthc xac nhan thanh toan could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan findByMaTuSinh(
		java.lang.String maTuSinh)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException;

	/**
	* Returns the tthc xac nhan thanh toan where maTuSinh = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param maTuSinh the ma tu sinh
	* @return the matching tthc xac nhan thanh toan, or <code>null</code> if a matching tthc xac nhan thanh toan could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan fetchByMaTuSinh(
		java.lang.String maTuSinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc xac nhan thanh toan where maTuSinh = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param maTuSinh the ma tu sinh
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc xac nhan thanh toan, or <code>null</code> if a matching tthc xac nhan thanh toan could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan fetchByMaTuSinh(
		java.lang.String maTuSinh, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the tthc xac nhan thanh toan where maTuSinh = &#63; from the database.
	*
	* @param maTuSinh the ma tu sinh
	* @return the tthc xac nhan thanh toan that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan removeByMaTuSinh(
		java.lang.String maTuSinh)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException;

	/**
	* Returns the number of tthc xac nhan thanh toans where maTuSinh = &#63;.
	*
	* @param maTuSinh the ma tu sinh
	* @return the number of matching tthc xac nhan thanh toans
	* @throws SystemException if a system exception occurred
	*/
	public int countByMaTuSinh(java.lang.String maTuSinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the tthc xac nhan thanh toan in the entity cache if it is enabled.
	*
	* @param tthcXacNhanThanhToan the tthc xac nhan thanh toan
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan tthcXacNhanThanhToan);

	/**
	* Caches the tthc xac nhan thanh toans in the entity cache if it is enabled.
	*
	* @param tthcXacNhanThanhToans the tthc xac nhan thanh toans
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> tthcXacNhanThanhToans);

	/**
	* Creates a new tthc xac nhan thanh toan with the primary key. Does not add the tthc xac nhan thanh toan to the database.
	*
	* @param id the primary key for the new tthc xac nhan thanh toan
	* @return the new tthc xac nhan thanh toan
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan create(
		long id);

	/**
	* Removes the tthc xac nhan thanh toan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc xac nhan thanh toan
	* @return the tthc xac nhan thanh toan that was removed
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException if a tthc xac nhan thanh toan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException;

	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan updateImpl(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan tthcXacNhanThanhToan)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc xac nhan thanh toan with the primary key or throws a {@link vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException} if it could not be found.
	*
	* @param id the primary key of the tthc xac nhan thanh toan
	* @return the tthc xac nhan thanh toan
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException if a tthc xac nhan thanh toan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException;

	/**
	* Returns the tthc xac nhan thanh toan with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tthc xac nhan thanh toan
	* @return the tthc xac nhan thanh toan, or <code>null</code> if a tthc xac nhan thanh toan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tthc xac nhan thanh toans.
	*
	* @return the tthc xac nhan thanh toans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc xac nhan thanh toans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc xac nhan thanh toans
	* @param end the upper bound of the range of tthc xac nhan thanh toans (not inclusive)
	* @return the range of tthc xac nhan thanh toans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc xac nhan thanh toans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc xac nhan thanh toans
	* @param end the upper bound of the range of tthc xac nhan thanh toans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc xac nhan thanh toans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tthc xac nhan thanh toans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc xac nhan thanh toans.
	*
	* @return the number of tthc xac nhan thanh toans
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}