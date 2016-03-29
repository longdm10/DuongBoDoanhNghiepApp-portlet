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

import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi;

/**
 * The persistence interface for the qlvt xu ly gp lien van phuong tien tram dung nghi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVanPhuongTienTramDungNghiPersistenceImpl
 * @see QlvtXuLyGpLienVanPhuongTienTramDungNghiUtil
 * @generated
 */
public interface QlvtXuLyGpLienVanPhuongTienTramDungNghiPersistence
	extends BasePersistence<QlvtXuLyGpLienVanPhuongTienTramDungNghi> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QlvtXuLyGpLienVanPhuongTienTramDungNghiUtil} to access the qlvt xu ly gp lien van phuong tien tram dung nghi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the qlvt xu ly gp lien van phuong tien tram dung nghis where capGplxPhuongTienId = &#63;.
	*
	* @param capGplxPhuongTienId the cap gplx phuong tien ID
	* @return the matching qlvt xu ly gp lien van phuong tien tram dung nghis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi> findByCapGplxPhuongTienId(
		long capGplxPhuongTienId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the qlvt xu ly gp lien van phuong tien tram dung nghis where capGplxPhuongTienId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param capGplxPhuongTienId the cap gplx phuong tien ID
	* @param start the lower bound of the range of qlvt xu ly gp lien van phuong tien tram dung nghis
	* @param end the upper bound of the range of qlvt xu ly gp lien van phuong tien tram dung nghis (not inclusive)
	* @return the range of matching qlvt xu ly gp lien van phuong tien tram dung nghis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi> findByCapGplxPhuongTienId(
		long capGplxPhuongTienId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the qlvt xu ly gp lien van phuong tien tram dung nghis where capGplxPhuongTienId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param capGplxPhuongTienId the cap gplx phuong tien ID
	* @param start the lower bound of the range of qlvt xu ly gp lien van phuong tien tram dung nghis
	* @param end the upper bound of the range of qlvt xu ly gp lien van phuong tien tram dung nghis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching qlvt xu ly gp lien van phuong tien tram dung nghis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi> findByCapGplxPhuongTienId(
		long capGplxPhuongTienId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first qlvt xu ly gp lien van phuong tien tram dung nghi in the ordered set where capGplxPhuongTienId = &#63;.
	*
	* @param capGplxPhuongTienId the cap gplx phuong tien ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt xu ly gp lien van phuong tien tram dung nghi
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException if a matching qlvt xu ly gp lien van phuong tien tram dung nghi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi findByCapGplxPhuongTienId_First(
		long capGplxPhuongTienId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException;

	/**
	* Returns the first qlvt xu ly gp lien van phuong tien tram dung nghi in the ordered set where capGplxPhuongTienId = &#63;.
	*
	* @param capGplxPhuongTienId the cap gplx phuong tien ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt xu ly gp lien van phuong tien tram dung nghi, or <code>null</code> if a matching qlvt xu ly gp lien van phuong tien tram dung nghi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi fetchByCapGplxPhuongTienId_First(
		long capGplxPhuongTienId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last qlvt xu ly gp lien van phuong tien tram dung nghi in the ordered set where capGplxPhuongTienId = &#63;.
	*
	* @param capGplxPhuongTienId the cap gplx phuong tien ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt xu ly gp lien van phuong tien tram dung nghi
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException if a matching qlvt xu ly gp lien van phuong tien tram dung nghi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi findByCapGplxPhuongTienId_Last(
		long capGplxPhuongTienId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException;

	/**
	* Returns the last qlvt xu ly gp lien van phuong tien tram dung nghi in the ordered set where capGplxPhuongTienId = &#63;.
	*
	* @param capGplxPhuongTienId the cap gplx phuong tien ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt xu ly gp lien van phuong tien tram dung nghi, or <code>null</code> if a matching qlvt xu ly gp lien van phuong tien tram dung nghi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi fetchByCapGplxPhuongTienId_Last(
		long capGplxPhuongTienId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt xu ly gp lien van phuong tien tram dung nghis before and after the current qlvt xu ly gp lien van phuong tien tram dung nghi in the ordered set where capGplxPhuongTienId = &#63;.
	*
	* @param id the primary key of the current qlvt xu ly gp lien van phuong tien tram dung nghi
	* @param capGplxPhuongTienId the cap gplx phuong tien ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next qlvt xu ly gp lien van phuong tien tram dung nghi
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException if a qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi[] findByCapGplxPhuongTienId_PrevAndNext(
		long id, long capGplxPhuongTienId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException;

	/**
	* Removes all the qlvt xu ly gp lien van phuong tien tram dung nghis where capGplxPhuongTienId = &#63; from the database.
	*
	* @param capGplxPhuongTienId the cap gplx phuong tien ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCapGplxPhuongTienId(long capGplxPhuongTienId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt xu ly gp lien van phuong tien tram dung nghis where capGplxPhuongTienId = &#63;.
	*
	* @param capGplxPhuongTienId the cap gplx phuong tien ID
	* @return the number of matching qlvt xu ly gp lien van phuong tien tram dung nghis
	* @throws SystemException if a system exception occurred
	*/
	public int countByCapGplxPhuongTienId(long capGplxPhuongTienId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the qlvt xu ly gp lien van phuong tien tram dung nghi in the entity cache if it is enabled.
	*
	* @param qlvtXuLyGpLienVanPhuongTienTramDungNghi the qlvt xu ly gp lien van phuong tien tram dung nghi
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi);

	/**
	* Caches the qlvt xu ly gp lien van phuong tien tram dung nghis in the entity cache if it is enabled.
	*
	* @param qlvtXuLyGpLienVanPhuongTienTramDungNghis the qlvt xu ly gp lien van phuong tien tram dung nghis
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi> qlvtXuLyGpLienVanPhuongTienTramDungNghis);

	/**
	* Creates a new qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key. Does not add the qlvt xu ly gp lien van phuong tien tram dung nghi to the database.
	*
	* @param id the primary key for the new qlvt xu ly gp lien van phuong tien tram dung nghi
	* @return the new qlvt xu ly gp lien van phuong tien tram dung nghi
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi create(
		long id);

	/**
	* Removes the qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt xu ly gp lien van phuong tien tram dung nghi
	* @return the qlvt xu ly gp lien van phuong tien tram dung nghi that was removed
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException if a qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException;

	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi updateImpl(
		vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key or throws a {@link vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException} if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly gp lien van phuong tien tram dung nghi
	* @return the qlvt xu ly gp lien van phuong tien tram dung nghi
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException if a qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException;

	/**
	* Returns the qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly gp lien van phuong tien tram dung nghi
	* @return the qlvt xu ly gp lien van phuong tien tram dung nghi, or <code>null</code> if a qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the qlvt xu ly gp lien van phuong tien tram dung nghis.
	*
	* @return the qlvt xu ly gp lien van phuong tien tram dung nghis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the qlvt xu ly gp lien van phuong tien tram dung nghis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly gp lien van phuong tien tram dung nghis
	* @param end the upper bound of the range of qlvt xu ly gp lien van phuong tien tram dung nghis (not inclusive)
	* @return the range of qlvt xu ly gp lien van phuong tien tram dung nghis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the qlvt xu ly gp lien van phuong tien tram dung nghis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly gp lien van phuong tien tram dung nghis
	* @param end the upper bound of the range of qlvt xu ly gp lien van phuong tien tram dung nghis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt xu ly gp lien van phuong tien tram dung nghis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the qlvt xu ly gp lien van phuong tien tram dung nghis from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt xu ly gp lien van phuong tien tram dung nghis.
	*
	* @return the number of qlvt xu ly gp lien van phuong tien tram dung nghis
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}