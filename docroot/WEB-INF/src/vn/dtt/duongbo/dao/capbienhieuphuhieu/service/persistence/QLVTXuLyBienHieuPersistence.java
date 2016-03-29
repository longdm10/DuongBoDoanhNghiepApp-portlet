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

import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu;

/**
 * The persistence interface for the q l v t xu ly bien hieu service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author binhta
 * @see QLVTXuLyBienHieuPersistenceImpl
 * @see QLVTXuLyBienHieuUtil
 * @generated
 */
public interface QLVTXuLyBienHieuPersistence extends BasePersistence<QLVTXuLyBienHieu> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QLVTXuLyBienHieuUtil} to access the q l v t xu ly bien hieu persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the q l v t xu ly bien hieu where thongTinXuLyId = &#63; or throws a {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuException} if it could not be found.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the matching q l v t xu ly bien hieu
	* @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuException if a matching q l v t xu ly bien hieu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu findBythongTinXuLyId(
		int thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuException;

	/**
	* Returns the q l v t xu ly bien hieu where thongTinXuLyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the matching q l v t xu ly bien hieu, or <code>null</code> if a matching q l v t xu ly bien hieu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu fetchBythongTinXuLyId(
		int thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the q l v t xu ly bien hieu where thongTinXuLyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching q l v t xu ly bien hieu, or <code>null</code> if a matching q l v t xu ly bien hieu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu fetchBythongTinXuLyId(
		int thongTinXuLyId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the q l v t xu ly bien hieu where thongTinXuLyId = &#63; from the database.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the q l v t xu ly bien hieu that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu removeBythongTinXuLyId(
		int thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuException;

	/**
	* Returns the number of q l v t xu ly bien hieus where thongTinXuLyId = &#63;.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the number of matching q l v t xu ly bien hieus
	* @throws SystemException if a system exception occurred
	*/
	public int countBythongTinXuLyId(int thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the q l v t xu ly bien hieu in the entity cache if it is enabled.
	*
	* @param qlvtXuLyBienHieu the q l v t xu ly bien hieu
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu qlvtXuLyBienHieu);

	/**
	* Caches the q l v t xu ly bien hieus in the entity cache if it is enabled.
	*
	* @param qlvtXuLyBienHieus the q l v t xu ly bien hieus
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu> qlvtXuLyBienHieus);

	/**
	* Creates a new q l v t xu ly bien hieu with the primary key. Does not add the q l v t xu ly bien hieu to the database.
	*
	* @param id the primary key for the new q l v t xu ly bien hieu
	* @return the new q l v t xu ly bien hieu
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu create(
		int id);

	/**
	* Removes the q l v t xu ly bien hieu with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the q l v t xu ly bien hieu
	* @return the q l v t xu ly bien hieu that was removed
	* @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuException if a q l v t xu ly bien hieu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuException;

	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu updateImpl(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu qlvtXuLyBienHieu)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the q l v t xu ly bien hieu with the primary key or throws a {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuException} if it could not be found.
	*
	* @param id the primary key of the q l v t xu ly bien hieu
	* @return the q l v t xu ly bien hieu
	* @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuException if a q l v t xu ly bien hieu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuException;

	/**
	* Returns the q l v t xu ly bien hieu with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the q l v t xu ly bien hieu
	* @return the q l v t xu ly bien hieu, or <code>null</code> if a q l v t xu ly bien hieu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the q l v t xu ly bien hieus.
	*
	* @return the q l v t xu ly bien hieus
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the q l v t xu ly bien hieus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyBienHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of q l v t xu ly bien hieus
	* @param end the upper bound of the range of q l v t xu ly bien hieus (not inclusive)
	* @return the range of q l v t xu ly bien hieus
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the q l v t xu ly bien hieus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyBienHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of q l v t xu ly bien hieus
	* @param end the upper bound of the range of q l v t xu ly bien hieus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of q l v t xu ly bien hieus
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the q l v t xu ly bien hieus from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of q l v t xu ly bien hieus.
	*
	* @return the number of q l v t xu ly bien hieus
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}