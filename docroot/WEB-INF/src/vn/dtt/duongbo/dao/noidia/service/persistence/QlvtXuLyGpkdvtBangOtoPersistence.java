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

package vn.dtt.duongbo.dao.noidia.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto;

/**
 * The persistence interface for the qlvt xu ly gpkdvt bang oto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyGpkdvtBangOtoPersistenceImpl
 * @see QlvtXuLyGpkdvtBangOtoUtil
 * @generated
 */
public interface QlvtXuLyGpkdvtBangOtoPersistence extends BasePersistence<QlvtXuLyGpkdvtBangOto> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QlvtXuLyGpkdvtBangOtoUtil} to access the qlvt xu ly gpkdvt bang oto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the qlvt xu ly gpkdvt bang oto where thongTinXuLyId = &#63; or throws a {@link vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoException} if it could not be found.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the matching qlvt xu ly gpkdvt bang oto
	* @throws vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoException if a matching qlvt xu ly gpkdvt bang oto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto findBythongTinXuLyId(
		int thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoException;

	/**
	* Returns the qlvt xu ly gpkdvt bang oto where thongTinXuLyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the matching qlvt xu ly gpkdvt bang oto, or <code>null</code> if a matching qlvt xu ly gpkdvt bang oto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto fetchBythongTinXuLyId(
		int thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt xu ly gpkdvt bang oto where thongTinXuLyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching qlvt xu ly gpkdvt bang oto, or <code>null</code> if a matching qlvt xu ly gpkdvt bang oto could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto fetchBythongTinXuLyId(
		int thongTinXuLyId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the qlvt xu ly gpkdvt bang oto where thongTinXuLyId = &#63; from the database.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the qlvt xu ly gpkdvt bang oto that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto removeBythongTinXuLyId(
		int thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoException;

	/**
	* Returns the number of qlvt xu ly gpkdvt bang otos where thongTinXuLyId = &#63;.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the number of matching qlvt xu ly gpkdvt bang otos
	* @throws SystemException if a system exception occurred
	*/
	public int countBythongTinXuLyId(int thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the qlvt xu ly gpkdvt bang oto in the entity cache if it is enabled.
	*
	* @param qlvtXuLyGpkdvtBangOto the qlvt xu ly gpkdvt bang oto
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto);

	/**
	* Caches the qlvt xu ly gpkdvt bang otos in the entity cache if it is enabled.
	*
	* @param qlvtXuLyGpkdvtBangOtos the qlvt xu ly gpkdvt bang otos
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto> qlvtXuLyGpkdvtBangOtos);

	/**
	* Creates a new qlvt xu ly gpkdvt bang oto with the primary key. Does not add the qlvt xu ly gpkdvt bang oto to the database.
	*
	* @param id the primary key for the new qlvt xu ly gpkdvt bang oto
	* @return the new qlvt xu ly gpkdvt bang oto
	*/
	public vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto create(long id);

	/**
	* Removes the qlvt xu ly gpkdvt bang oto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt xu ly gpkdvt bang oto
	* @return the qlvt xu ly gpkdvt bang oto that was removed
	* @throws vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoException if a qlvt xu ly gpkdvt bang oto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoException;

	public vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto updateImpl(
		vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt xu ly gpkdvt bang oto with the primary key or throws a {@link vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoException} if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly gpkdvt bang oto
	* @return the qlvt xu ly gpkdvt bang oto
	* @throws vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoException if a qlvt xu ly gpkdvt bang oto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoException;

	/**
	* Returns the qlvt xu ly gpkdvt bang oto with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly gpkdvt bang oto
	* @return the qlvt xu ly gpkdvt bang oto, or <code>null</code> if a qlvt xu ly gpkdvt bang oto with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the qlvt xu ly gpkdvt bang otos.
	*
	* @return the qlvt xu ly gpkdvt bang otos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the qlvt xu ly gpkdvt bang otos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.noidia.model.impl.QlvtXuLyGpkdvtBangOtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly gpkdvt bang otos
	* @param end the upper bound of the range of qlvt xu ly gpkdvt bang otos (not inclusive)
	* @return the range of qlvt xu ly gpkdvt bang otos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the qlvt xu ly gpkdvt bang otos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.noidia.model.impl.QlvtXuLyGpkdvtBangOtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly gpkdvt bang otos
	* @param end the upper bound of the range of qlvt xu ly gpkdvt bang otos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt xu ly gpkdvt bang otos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the qlvt xu ly gpkdvt bang otos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt xu ly gpkdvt bang otos.
	*
	* @return the number of qlvt xu ly gpkdvt bang otos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}