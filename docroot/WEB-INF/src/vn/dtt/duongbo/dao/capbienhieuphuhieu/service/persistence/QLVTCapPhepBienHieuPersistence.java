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

import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieu;

/**
 * The persistence interface for the q l v t cap phep bien hieu service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author binhta
 * @see QLVTCapPhepBienHieuPersistenceImpl
 * @see QLVTCapPhepBienHieuUtil
 * @generated
 */
public interface QLVTCapPhepBienHieuPersistence extends BasePersistence<QLVTCapPhepBienHieu> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QLVTCapPhepBienHieuUtil} to access the q l v t cap phep bien hieu persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the q l v t cap phep bien hieu in the entity cache if it is enabled.
	*
	* @param qlvtCapPhepBienHieu the q l v t cap phep bien hieu
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieu qlvtCapPhepBienHieu);

	/**
	* Caches the q l v t cap phep bien hieus in the entity cache if it is enabled.
	*
	* @param qlvtCapPhepBienHieus the q l v t cap phep bien hieus
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieu> qlvtCapPhepBienHieus);

	/**
	* Creates a new q l v t cap phep bien hieu with the primary key. Does not add the q l v t cap phep bien hieu to the database.
	*
	* @param id the primary key for the new q l v t cap phep bien hieu
	* @return the new q l v t cap phep bien hieu
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieu create(
		int id);

	/**
	* Removes the q l v t cap phep bien hieu with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the q l v t cap phep bien hieu
	* @return the q l v t cap phep bien hieu that was removed
	* @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepBienHieuException if a q l v t cap phep bien hieu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieu remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepBienHieuException;

	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieu updateImpl(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieu qlvtCapPhepBienHieu)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the q l v t cap phep bien hieu with the primary key or throws a {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepBienHieuException} if it could not be found.
	*
	* @param id the primary key of the q l v t cap phep bien hieu
	* @return the q l v t cap phep bien hieu
	* @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepBienHieuException if a q l v t cap phep bien hieu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieu findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTCapPhepBienHieuException;

	/**
	* Returns the q l v t cap phep bien hieu with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the q l v t cap phep bien hieu
	* @return the q l v t cap phep bien hieu, or <code>null</code> if a q l v t cap phep bien hieu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieu fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the q l v t cap phep bien hieus.
	*
	* @return the q l v t cap phep bien hieus
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieu> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the q l v t cap phep bien hieus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTCapPhepBienHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of q l v t cap phep bien hieus
	* @param end the upper bound of the range of q l v t cap phep bien hieus (not inclusive)
	* @return the range of q l v t cap phep bien hieus
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieu> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the q l v t cap phep bien hieus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTCapPhepBienHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of q l v t cap phep bien hieus
	* @param end the upper bound of the range of q l v t cap phep bien hieus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of q l v t cap phep bien hieus
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepBienHieu> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the q l v t cap phep bien hieus from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of q l v t cap phep bien hieus.
	*
	* @return the number of q l v t cap phep bien hieus
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}