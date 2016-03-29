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

import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien;

/**
 * The persistence interface for the qlvt xu ly k t t quoc te phuong tien service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyKTTQuocTePhuongTienPersistenceImpl
 * @see QlvtXuLyKTTQuocTePhuongTienUtil
 * @generated
 */
public interface QlvtXuLyKTTQuocTePhuongTienPersistence extends BasePersistence<QlvtXuLyKTTQuocTePhuongTien> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QlvtXuLyKTTQuocTePhuongTienUtil} to access the qlvt xu ly k t t quoc te phuong tien persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the qlvt xu ly k t t quoc te phuong tiens where capPhepKTTQuocTeID = &#63;.
	*
	* @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	* @return the matching qlvt xu ly k t t quoc te phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien> findBycapPhepKTTQuocTeID(
		long capPhepKTTQuocTeID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the qlvt xu ly k t t quoc te phuong tiens where capPhepKTTQuocTeID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTePhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	* @param start the lower bound of the range of qlvt xu ly k t t quoc te phuong tiens
	* @param end the upper bound of the range of qlvt xu ly k t t quoc te phuong tiens (not inclusive)
	* @return the range of matching qlvt xu ly k t t quoc te phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien> findBycapPhepKTTQuocTeID(
		long capPhepKTTQuocTeID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the qlvt xu ly k t t quoc te phuong tiens where capPhepKTTQuocTeID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTePhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	* @param start the lower bound of the range of qlvt xu ly k t t quoc te phuong tiens
	* @param end the upper bound of the range of qlvt xu ly k t t quoc te phuong tiens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching qlvt xu ly k t t quoc te phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien> findBycapPhepKTTQuocTeID(
		long capPhepKTTQuocTeID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first qlvt xu ly k t t quoc te phuong tien in the ordered set where capPhepKTTQuocTeID = &#63;.
	*
	* @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt xu ly k t t quoc te phuong tien
	* @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException if a matching qlvt xu ly k t t quoc te phuong tien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien findBycapPhepKTTQuocTeID_First(
		long capPhepKTTQuocTeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException;

	/**
	* Returns the first qlvt xu ly k t t quoc te phuong tien in the ordered set where capPhepKTTQuocTeID = &#63;.
	*
	* @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt xu ly k t t quoc te phuong tien, or <code>null</code> if a matching qlvt xu ly k t t quoc te phuong tien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien fetchBycapPhepKTTQuocTeID_First(
		long capPhepKTTQuocTeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last qlvt xu ly k t t quoc te phuong tien in the ordered set where capPhepKTTQuocTeID = &#63;.
	*
	* @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt xu ly k t t quoc te phuong tien
	* @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException if a matching qlvt xu ly k t t quoc te phuong tien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien findBycapPhepKTTQuocTeID_Last(
		long capPhepKTTQuocTeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException;

	/**
	* Returns the last qlvt xu ly k t t quoc te phuong tien in the ordered set where capPhepKTTQuocTeID = &#63;.
	*
	* @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt xu ly k t t quoc te phuong tien, or <code>null</code> if a matching qlvt xu ly k t t quoc te phuong tien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien fetchBycapPhepKTTQuocTeID_Last(
		long capPhepKTTQuocTeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt xu ly k t t quoc te phuong tiens before and after the current qlvt xu ly k t t quoc te phuong tien in the ordered set where capPhepKTTQuocTeID = &#63;.
	*
	* @param id the primary key of the current qlvt xu ly k t t quoc te phuong tien
	* @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next qlvt xu ly k t t quoc te phuong tien
	* @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException if a qlvt xu ly k t t quoc te phuong tien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien[] findBycapPhepKTTQuocTeID_PrevAndNext(
		long id, long capPhepKTTQuocTeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException;

	/**
	* Removes all the qlvt xu ly k t t quoc te phuong tiens where capPhepKTTQuocTeID = &#63; from the database.
	*
	* @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	* @throws SystemException if a system exception occurred
	*/
	public void removeBycapPhepKTTQuocTeID(long capPhepKTTQuocTeID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt xu ly k t t quoc te phuong tiens where capPhepKTTQuocTeID = &#63;.
	*
	* @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	* @return the number of matching qlvt xu ly k t t quoc te phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public int countBycapPhepKTTQuocTeID(long capPhepKTTQuocTeID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the qlvt xu ly k t t quoc te phuong tien in the entity cache if it is enabled.
	*
	* @param qlvtXuLyKTTQuocTePhuongTien the qlvt xu ly k t t quoc te phuong tien
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien);

	/**
	* Caches the qlvt xu ly k t t quoc te phuong tiens in the entity cache if it is enabled.
	*
	* @param qlvtXuLyKTTQuocTePhuongTiens the qlvt xu ly k t t quoc te phuong tiens
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien> qlvtXuLyKTTQuocTePhuongTiens);

	/**
	* Creates a new qlvt xu ly k t t quoc te phuong tien with the primary key. Does not add the qlvt xu ly k t t quoc te phuong tien to the database.
	*
	* @param id the primary key for the new qlvt xu ly k t t quoc te phuong tien
	* @return the new qlvt xu ly k t t quoc te phuong tien
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien create(
		long id);

	/**
	* Removes the qlvt xu ly k t t quoc te phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt xu ly k t t quoc te phuong tien
	* @return the qlvt xu ly k t t quoc te phuong tien that was removed
	* @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException if a qlvt xu ly k t t quoc te phuong tien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException;

	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien updateImpl(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt xu ly k t t quoc te phuong tien with the primary key or throws a {@link vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException} if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly k t t quoc te phuong tien
	* @return the qlvt xu ly k t t quoc te phuong tien
	* @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException if a qlvt xu ly k t t quoc te phuong tien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException;

	/**
	* Returns the qlvt xu ly k t t quoc te phuong tien with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly k t t quoc te phuong tien
	* @return the qlvt xu ly k t t quoc te phuong tien, or <code>null</code> if a qlvt xu ly k t t quoc te phuong tien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the qlvt xu ly k t t quoc te phuong tiens.
	*
	* @return the qlvt xu ly k t t quoc te phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the qlvt xu ly k t t quoc te phuong tiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTePhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly k t t quoc te phuong tiens
	* @param end the upper bound of the range of qlvt xu ly k t t quoc te phuong tiens (not inclusive)
	* @return the range of qlvt xu ly k t t quoc te phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the qlvt xu ly k t t quoc te phuong tiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTePhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly k t t quoc te phuong tiens
	* @param end the upper bound of the range of qlvt xu ly k t t quoc te phuong tiens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt xu ly k t t quoc te phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the qlvt xu ly k t t quoc te phuong tiens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt xu ly k t t quoc te phuong tiens.
	*
	* @return the number of qlvt xu ly k t t quoc te phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}