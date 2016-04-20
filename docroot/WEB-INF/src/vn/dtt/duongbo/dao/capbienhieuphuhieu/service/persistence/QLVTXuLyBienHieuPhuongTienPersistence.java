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

package vn.dtt.duongbo.dao.capbienhieuphuhieu.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien;

/**
 * The persistence interface for the q l v t xu ly bien hieu phuong tien service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author binhta
 * @see QLVTXuLyBienHieuPhuongTienPersistenceImpl
 * @see QLVTXuLyBienHieuPhuongTienUtil
 * @generated
 */
public interface QLVTXuLyBienHieuPhuongTienPersistence extends BasePersistence<QLVTXuLyBienHieuPhuongTien> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QLVTXuLyBienHieuPhuongTienUtil} to access the q l v t xu ly bien hieu phuong tien persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the q l v t xu ly bien hieu phuong tiens where capBienHieuID = &#63;.
	*
	* @param capBienHieuID the cap bien hieu i d
	* @return the matching q l v t xu ly bien hieu phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien> findBycapBienHieuID(
		int capBienHieuID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the q l v t xu ly bien hieu phuong tiens where capBienHieuID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyBienHieuPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param capBienHieuID the cap bien hieu i d
	* @param start the lower bound of the range of q l v t xu ly bien hieu phuong tiens
	* @param end the upper bound of the range of q l v t xu ly bien hieu phuong tiens (not inclusive)
	* @return the range of matching q l v t xu ly bien hieu phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien> findBycapBienHieuID(
		int capBienHieuID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the q l v t xu ly bien hieu phuong tiens where capBienHieuID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyBienHieuPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param capBienHieuID the cap bien hieu i d
	* @param start the lower bound of the range of q l v t xu ly bien hieu phuong tiens
	* @param end the upper bound of the range of q l v t xu ly bien hieu phuong tiens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching q l v t xu ly bien hieu phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien> findBycapBienHieuID(
		int capBienHieuID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first q l v t xu ly bien hieu phuong tien in the ordered set where capBienHieuID = &#63;.
	*
	* @param capBienHieuID the cap bien hieu i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching q l v t xu ly bien hieu phuong tien
	* @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuPhuongTienException if a matching q l v t xu ly bien hieu phuong tien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien findBycapBienHieuID_First(
		int capBienHieuID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuPhuongTienException;

	/**
	* Returns the first q l v t xu ly bien hieu phuong tien in the ordered set where capBienHieuID = &#63;.
	*
	* @param capBienHieuID the cap bien hieu i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching q l v t xu ly bien hieu phuong tien, or <code>null</code> if a matching q l v t xu ly bien hieu phuong tien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien fetchBycapBienHieuID_First(
		int capBienHieuID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last q l v t xu ly bien hieu phuong tien in the ordered set where capBienHieuID = &#63;.
	*
	* @param capBienHieuID the cap bien hieu i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching q l v t xu ly bien hieu phuong tien
	* @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuPhuongTienException if a matching q l v t xu ly bien hieu phuong tien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien findBycapBienHieuID_Last(
		int capBienHieuID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuPhuongTienException;

	/**
	* Returns the last q l v t xu ly bien hieu phuong tien in the ordered set where capBienHieuID = &#63;.
	*
	* @param capBienHieuID the cap bien hieu i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching q l v t xu ly bien hieu phuong tien, or <code>null</code> if a matching q l v t xu ly bien hieu phuong tien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien fetchBycapBienHieuID_Last(
		int capBienHieuID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the q l v t xu ly bien hieu phuong tiens before and after the current q l v t xu ly bien hieu phuong tien in the ordered set where capBienHieuID = &#63;.
	*
	* @param id the primary key of the current q l v t xu ly bien hieu phuong tien
	* @param capBienHieuID the cap bien hieu i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next q l v t xu ly bien hieu phuong tien
	* @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuPhuongTienException if a q l v t xu ly bien hieu phuong tien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien[] findBycapBienHieuID_PrevAndNext(
		int id, int capBienHieuID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuPhuongTienException;

	/**
	* Removes all the q l v t xu ly bien hieu phuong tiens where capBienHieuID = &#63; from the database.
	*
	* @param capBienHieuID the cap bien hieu i d
	* @throws SystemException if a system exception occurred
	*/
	public void removeBycapBienHieuID(int capBienHieuID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of q l v t xu ly bien hieu phuong tiens where capBienHieuID = &#63;.
	*
	* @param capBienHieuID the cap bien hieu i d
	* @return the number of matching q l v t xu ly bien hieu phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public int countBycapBienHieuID(int capBienHieuID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the q l v t xu ly bien hieu phuong tien in the entity cache if it is enabled.
	*
	* @param qlvtXuLyBienHieuPhuongTien the q l v t xu ly bien hieu phuong tien
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien);

	/**
	* Caches the q l v t xu ly bien hieu phuong tiens in the entity cache if it is enabled.
	*
	* @param qlvtXuLyBienHieuPhuongTiens the q l v t xu ly bien hieu phuong tiens
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien> qlvtXuLyBienHieuPhuongTiens);

	/**
	* Creates a new q l v t xu ly bien hieu phuong tien with the primary key. Does not add the q l v t xu ly bien hieu phuong tien to the database.
	*
	* @param id the primary key for the new q l v t xu ly bien hieu phuong tien
	* @return the new q l v t xu ly bien hieu phuong tien
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien create(
		int id);

	/**
	* Removes the q l v t xu ly bien hieu phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the q l v t xu ly bien hieu phuong tien
	* @return the q l v t xu ly bien hieu phuong tien that was removed
	* @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuPhuongTienException if a q l v t xu ly bien hieu phuong tien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuPhuongTienException;

	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien updateImpl(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the q l v t xu ly bien hieu phuong tien with the primary key or throws a {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuPhuongTienException} if it could not be found.
	*
	* @param id the primary key of the q l v t xu ly bien hieu phuong tien
	* @return the q l v t xu ly bien hieu phuong tien
	* @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuPhuongTienException if a q l v t xu ly bien hieu phuong tien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuPhuongTienException;

	/**
	* Returns the q l v t xu ly bien hieu phuong tien with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the q l v t xu ly bien hieu phuong tien
	* @return the q l v t xu ly bien hieu phuong tien, or <code>null</code> if a q l v t xu ly bien hieu phuong tien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the q l v t xu ly bien hieu phuong tiens.
	*
	* @return the q l v t xu ly bien hieu phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the q l v t xu ly bien hieu phuong tiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyBienHieuPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of q l v t xu ly bien hieu phuong tiens
	* @param end the upper bound of the range of q l v t xu ly bien hieu phuong tiens (not inclusive)
	* @return the range of q l v t xu ly bien hieu phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the q l v t xu ly bien hieu phuong tiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyBienHieuPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of q l v t xu ly bien hieu phuong tiens
	* @param end the upper bound of the range of q l v t xu ly bien hieu phuong tiens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of q l v t xu ly bien hieu phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the q l v t xu ly bien hieu phuong tiens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of q l v t xu ly bien hieu phuong tiens.
	*
	* @return the number of q l v t xu ly bien hieu phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}