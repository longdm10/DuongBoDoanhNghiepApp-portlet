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

package vn.dtt.duongbo.dao.common.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc;

/**
 * The persistence interface for the tthc linh vuc thu tuc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcLinhVucThuTucPersistenceImpl
 * @see TthcLinhVucThuTucUtil
 * @generated
 */
public interface TthcLinhVucThuTucPersistence extends BasePersistence<TthcLinhVucThuTuc> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TthcLinhVucThuTucUtil} to access the tthc linh vuc thu tuc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the tthc linh vuc thu tuc in the entity cache if it is enabled.
	*
	* @param tthcLinhVucThuTuc the tthc linh vuc thu tuc
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc tthcLinhVucThuTuc);

	/**
	* Caches the tthc linh vuc thu tucs in the entity cache if it is enabled.
	*
	* @param tthcLinhVucThuTucs the tthc linh vuc thu tucs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc> tthcLinhVucThuTucs);

	/**
	* Creates a new tthc linh vuc thu tuc with the primary key. Does not add the tthc linh vuc thu tuc to the database.
	*
	* @param id the primary key for the new tthc linh vuc thu tuc
	* @return the new tthc linh vuc thu tuc
	*/
	public vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc create(long id);

	/**
	* Removes the tthc linh vuc thu tuc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc linh vuc thu tuc
	* @return the tthc linh vuc thu tuc that was removed
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcLinhVucThuTucException if a tthc linh vuc thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcLinhVucThuTucException;

	public vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc updateImpl(
		vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc tthcLinhVucThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc linh vuc thu tuc with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcLinhVucThuTucException} if it could not be found.
	*
	* @param id the primary key of the tthc linh vuc thu tuc
	* @return the tthc linh vuc thu tuc
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcLinhVucThuTucException if a tthc linh vuc thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcLinhVucThuTucException;

	/**
	* Returns the tthc linh vuc thu tuc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tthc linh vuc thu tuc
	* @return the tthc linh vuc thu tuc, or <code>null</code> if a tthc linh vuc thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tthc linh vuc thu tucs.
	*
	* @return the tthc linh vuc thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc linh vuc thu tucs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcLinhVucThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc linh vuc thu tucs
	* @param end the upper bound of the range of tthc linh vuc thu tucs (not inclusive)
	* @return the range of tthc linh vuc thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc linh vuc thu tucs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcLinhVucThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc linh vuc thu tucs
	* @param end the upper bound of the range of tthc linh vuc thu tucs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc linh vuc thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcLinhVucThuTuc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tthc linh vuc thu tucs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc linh vuc thu tucs.
	*
	* @return the number of tthc linh vuc thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}