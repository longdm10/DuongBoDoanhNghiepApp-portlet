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

import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi;

/**
 * The persistence interface for the qlvt xu ly k t t quoc te diem dung nghi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyKTTQuocTeDiemDungNghiPersistenceImpl
 * @see QlvtXuLyKTTQuocTeDiemDungNghiUtil
 * @generated
 */
public interface QlvtXuLyKTTQuocTeDiemDungNghiPersistence
	extends BasePersistence<QlvtXuLyKTTQuocTeDiemDungNghi> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QlvtXuLyKTTQuocTeDiemDungNghiUtil} to access the qlvt xu ly k t t quoc te diem dung nghi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the qlvt xu ly k t t quoc te diem dung nghi in the entity cache if it is enabled.
	*
	* @param qlvtXuLyKTTQuocTeDiemDungNghi the qlvt xu ly k t t quoc te diem dung nghi
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi qlvtXuLyKTTQuocTeDiemDungNghi);

	/**
	* Caches the qlvt xu ly k t t quoc te diem dung nghis in the entity cache if it is enabled.
	*
	* @param qlvtXuLyKTTQuocTeDiemDungNghis the qlvt xu ly k t t quoc te diem dung nghis
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi> qlvtXuLyKTTQuocTeDiemDungNghis);

	/**
	* Creates a new qlvt xu ly k t t quoc te diem dung nghi with the primary key. Does not add the qlvt xu ly k t t quoc te diem dung nghi to the database.
	*
	* @param id the primary key for the new qlvt xu ly k t t quoc te diem dung nghi
	* @return the new qlvt xu ly k t t quoc te diem dung nghi
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi create(
		long id);

	/**
	* Removes the qlvt xu ly k t t quoc te diem dung nghi with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt xu ly k t t quoc te diem dung nghi
	* @return the qlvt xu ly k t t quoc te diem dung nghi that was removed
	* @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeDiemDungNghiException if a qlvt xu ly k t t quoc te diem dung nghi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeDiemDungNghiException;

	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi updateImpl(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi qlvtXuLyKTTQuocTeDiemDungNghi)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt xu ly k t t quoc te diem dung nghi with the primary key or throws a {@link vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeDiemDungNghiException} if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly k t t quoc te diem dung nghi
	* @return the qlvt xu ly k t t quoc te diem dung nghi
	* @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeDiemDungNghiException if a qlvt xu ly k t t quoc te diem dung nghi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeDiemDungNghiException;

	/**
	* Returns the qlvt xu ly k t t quoc te diem dung nghi with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly k t t quoc te diem dung nghi
	* @return the qlvt xu ly k t t quoc te diem dung nghi, or <code>null</code> if a qlvt xu ly k t t quoc te diem dung nghi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the qlvt xu ly k t t quoc te diem dung nghis.
	*
	* @return the qlvt xu ly k t t quoc te diem dung nghis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the qlvt xu ly k t t quoc te diem dung nghis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeDiemDungNghiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly k t t quoc te diem dung nghis
	* @param end the upper bound of the range of qlvt xu ly k t t quoc te diem dung nghis (not inclusive)
	* @return the range of qlvt xu ly k t t quoc te diem dung nghis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the qlvt xu ly k t t quoc te diem dung nghis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeDiemDungNghiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly k t t quoc te diem dung nghis
	* @param end the upper bound of the range of qlvt xu ly k t t quoc te diem dung nghis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt xu ly k t t quoc te diem dung nghis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the qlvt xu ly k t t quoc te diem dung nghis from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt xu ly k t t quoc te diem dung nghis.
	*
	* @return the number of qlvt xu ly k t t quoc te diem dung nghis
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}