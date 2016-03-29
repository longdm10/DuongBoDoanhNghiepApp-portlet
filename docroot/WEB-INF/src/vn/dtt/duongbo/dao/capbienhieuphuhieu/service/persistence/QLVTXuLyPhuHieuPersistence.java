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

import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu;

/**
 * The persistence interface for the q l v t xu ly phu hieu service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author binhta
 * @see QLVTXuLyPhuHieuPersistenceImpl
 * @see QLVTXuLyPhuHieuUtil
 * @generated
 */
public interface QLVTXuLyPhuHieuPersistence extends BasePersistence<QLVTXuLyPhuHieu> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QLVTXuLyPhuHieuUtil} to access the q l v t xu ly phu hieu persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the q l v t xu ly phu hieu where thongTinXuLyId = &#63; or throws a {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException} if it could not be found.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the matching q l v t xu ly phu hieu
	* @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException if a matching q l v t xu ly phu hieu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu findBythongTinXuLyId(
		int thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException;

	/**
	* Returns the q l v t xu ly phu hieu where thongTinXuLyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the matching q l v t xu ly phu hieu, or <code>null</code> if a matching q l v t xu ly phu hieu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu fetchBythongTinXuLyId(
		int thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the q l v t xu ly phu hieu where thongTinXuLyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching q l v t xu ly phu hieu, or <code>null</code> if a matching q l v t xu ly phu hieu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu fetchBythongTinXuLyId(
		int thongTinXuLyId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the q l v t xu ly phu hieu where thongTinXuLyId = &#63; from the database.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the q l v t xu ly phu hieu that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu removeBythongTinXuLyId(
		int thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException;

	/**
	* Returns the number of q l v t xu ly phu hieus where thongTinXuLyId = &#63;.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the number of matching q l v t xu ly phu hieus
	* @throws SystemException if a system exception occurred
	*/
	public int countBythongTinXuLyId(int thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the q l v t xu ly phu hieu in the entity cache if it is enabled.
	*
	* @param qlvtXuLyPhuHieu the q l v t xu ly phu hieu
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu qlvtXuLyPhuHieu);

	/**
	* Caches the q l v t xu ly phu hieus in the entity cache if it is enabled.
	*
	* @param qlvtXuLyPhuHieus the q l v t xu ly phu hieus
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu> qlvtXuLyPhuHieus);

	/**
	* Creates a new q l v t xu ly phu hieu with the primary key. Does not add the q l v t xu ly phu hieu to the database.
	*
	* @param id the primary key for the new q l v t xu ly phu hieu
	* @return the new q l v t xu ly phu hieu
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu create(
		int id);

	/**
	* Removes the q l v t xu ly phu hieu with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the q l v t xu ly phu hieu
	* @return the q l v t xu ly phu hieu that was removed
	* @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException if a q l v t xu ly phu hieu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException;

	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu updateImpl(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu qlvtXuLyPhuHieu)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the q l v t xu ly phu hieu with the primary key or throws a {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException} if it could not be found.
	*
	* @param id the primary key of the q l v t xu ly phu hieu
	* @return the q l v t xu ly phu hieu
	* @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException if a q l v t xu ly phu hieu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException;

	/**
	* Returns the q l v t xu ly phu hieu with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the q l v t xu ly phu hieu
	* @return the q l v t xu ly phu hieu, or <code>null</code> if a q l v t xu ly phu hieu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the q l v t xu ly phu hieus.
	*
	* @return the q l v t xu ly phu hieus
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the q l v t xu ly phu hieus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of q l v t xu ly phu hieus
	* @param end the upper bound of the range of q l v t xu ly phu hieus (not inclusive)
	* @return the range of q l v t xu ly phu hieus
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the q l v t xu ly phu hieus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of q l v t xu ly phu hieus
	* @param end the upper bound of the range of q l v t xu ly phu hieus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of q l v t xu ly phu hieus
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the q l v t xu ly phu hieus from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of q l v t xu ly phu hieus.
	*
	* @return the number of q l v t xu ly phu hieus
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}