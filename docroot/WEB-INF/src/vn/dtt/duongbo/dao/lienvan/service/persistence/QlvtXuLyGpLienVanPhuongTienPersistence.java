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

package vn.dtt.duongbo.dao.lienvan.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien;

/**
 * The persistence interface for the qlvt xu ly gp lien van phuong tien service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVanPhuongTienPersistenceImpl
 * @see QlvtXuLyGpLienVanPhuongTienUtil
 * @generated
 */
public interface QlvtXuLyGpLienVanPhuongTienPersistence extends BasePersistence<QlvtXuLyGpLienVanPhuongTien> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QlvtXuLyGpLienVanPhuongTienUtil} to access the qlvt xu ly gp lien van phuong tien persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the qlvt xu ly gp lien van phuong tiens where capGplvId = &#63;.
	*
	* @param capGplvId the cap gplv ID
	* @return the matching qlvt xu ly gp lien van phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien> findBycapGplvId(
		long capGplvId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the qlvt xu ly gp lien van phuong tiens where capGplvId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param capGplvId the cap gplv ID
	* @param start the lower bound of the range of qlvt xu ly gp lien van phuong tiens
	* @param end the upper bound of the range of qlvt xu ly gp lien van phuong tiens (not inclusive)
	* @return the range of matching qlvt xu ly gp lien van phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien> findBycapGplvId(
		long capGplvId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the qlvt xu ly gp lien van phuong tiens where capGplvId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param capGplvId the cap gplv ID
	* @param start the lower bound of the range of qlvt xu ly gp lien van phuong tiens
	* @param end the upper bound of the range of qlvt xu ly gp lien van phuong tiens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching qlvt xu ly gp lien van phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien> findBycapGplvId(
		long capGplvId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first qlvt xu ly gp lien van phuong tien in the ordered set where capGplvId = &#63;.
	*
	* @param capGplvId the cap gplv ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt xu ly gp lien van phuong tien
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienException if a matching qlvt xu ly gp lien van phuong tien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien findBycapGplvId_First(
		long capGplvId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienException;

	/**
	* Returns the first qlvt xu ly gp lien van phuong tien in the ordered set where capGplvId = &#63;.
	*
	* @param capGplvId the cap gplv ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt xu ly gp lien van phuong tien, or <code>null</code> if a matching qlvt xu ly gp lien van phuong tien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien fetchBycapGplvId_First(
		long capGplvId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last qlvt xu ly gp lien van phuong tien in the ordered set where capGplvId = &#63;.
	*
	* @param capGplvId the cap gplv ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt xu ly gp lien van phuong tien
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienException if a matching qlvt xu ly gp lien van phuong tien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien findBycapGplvId_Last(
		long capGplvId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienException;

	/**
	* Returns the last qlvt xu ly gp lien van phuong tien in the ordered set where capGplvId = &#63;.
	*
	* @param capGplvId the cap gplv ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt xu ly gp lien van phuong tien, or <code>null</code> if a matching qlvt xu ly gp lien van phuong tien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien fetchBycapGplvId_Last(
		long capGplvId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt xu ly gp lien van phuong tiens before and after the current qlvt xu ly gp lien van phuong tien in the ordered set where capGplvId = &#63;.
	*
	* @param id the primary key of the current qlvt xu ly gp lien van phuong tien
	* @param capGplvId the cap gplv ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next qlvt xu ly gp lien van phuong tien
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienException if a qlvt xu ly gp lien van phuong tien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien[] findBycapGplvId_PrevAndNext(
		long id, long capGplvId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienException;

	/**
	* Removes all the qlvt xu ly gp lien van phuong tiens where capGplvId = &#63; from the database.
	*
	* @param capGplvId the cap gplv ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBycapGplvId(long capGplvId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt xu ly gp lien van phuong tiens where capGplvId = &#63;.
	*
	* @param capGplvId the cap gplv ID
	* @return the number of matching qlvt xu ly gp lien van phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public int countBycapGplvId(long capGplvId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the qlvt xu ly gp lien van phuong tien in the entity cache if it is enabled.
	*
	* @param qlvtXuLyGpLienVanPhuongTien the qlvt xu ly gp lien van phuong tien
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien);

	/**
	* Caches the qlvt xu ly gp lien van phuong tiens in the entity cache if it is enabled.
	*
	* @param qlvtXuLyGpLienVanPhuongTiens the qlvt xu ly gp lien van phuong tiens
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien> qlvtXuLyGpLienVanPhuongTiens);

	/**
	* Creates a new qlvt xu ly gp lien van phuong tien with the primary key. Does not add the qlvt xu ly gp lien van phuong tien to the database.
	*
	* @param id the primary key for the new qlvt xu ly gp lien van phuong tien
	* @return the new qlvt xu ly gp lien van phuong tien
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien create(
		long id);

	/**
	* Removes the qlvt xu ly gp lien van phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt xu ly gp lien van phuong tien
	* @return the qlvt xu ly gp lien van phuong tien that was removed
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienException if a qlvt xu ly gp lien van phuong tien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienException;

	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien updateImpl(
		vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt xu ly gp lien van phuong tien with the primary key or throws a {@link vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienException} if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly gp lien van phuong tien
	* @return the qlvt xu ly gp lien van phuong tien
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienException if a qlvt xu ly gp lien van phuong tien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienException;

	/**
	* Returns the qlvt xu ly gp lien van phuong tien with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly gp lien van phuong tien
	* @return the qlvt xu ly gp lien van phuong tien, or <code>null</code> if a qlvt xu ly gp lien van phuong tien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the qlvt xu ly gp lien van phuong tiens.
	*
	* @return the qlvt xu ly gp lien van phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the qlvt xu ly gp lien van phuong tiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly gp lien van phuong tiens
	* @param end the upper bound of the range of qlvt xu ly gp lien van phuong tiens (not inclusive)
	* @return the range of qlvt xu ly gp lien van phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the qlvt xu ly gp lien van phuong tiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly gp lien van phuong tiens
	* @param end the upper bound of the range of qlvt xu ly gp lien van phuong tiens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt xu ly gp lien van phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the qlvt xu ly gp lien van phuong tiens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt xu ly gp lien van phuong tiens.
	*
	* @return the number of qlvt xu ly gp lien van phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}