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

package vn.dtt.duongbo.dao.motcua.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo;

/**
 * The persistence interface for the mot cua nhan tra ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaNhanTraHoSoPersistenceImpl
 * @see MotCuaNhanTraHoSoUtil
 * @generated
 */
public interface MotCuaNhanTraHoSoPersistence extends BasePersistence<MotCuaNhanTraHoSo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MotCuaNhanTraHoSoUtil} to access the mot cua nhan tra ho so persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the mot cua nhan tra ho so in the entity cache if it is enabled.
	*
	* @param motCuaNhanTraHoSo the mot cua nhan tra ho so
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo motCuaNhanTraHoSo);

	/**
	* Caches the mot cua nhan tra ho sos in the entity cache if it is enabled.
	*
	* @param motCuaNhanTraHoSos the mot cua nhan tra ho sos
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo> motCuaNhanTraHoSos);

	/**
	* Creates a new mot cua nhan tra ho so with the primary key. Does not add the mot cua nhan tra ho so to the database.
	*
	* @param id the primary key for the new mot cua nhan tra ho so
	* @return the new mot cua nhan tra ho so
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo create(long id);

	/**
	* Removes the mot cua nhan tra ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua nhan tra ho so
	* @return the mot cua nhan tra ho so that was removed
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaNhanTraHoSoException if a mot cua nhan tra ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaNhanTraHoSoException;

	public vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo updateImpl(
		vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo motCuaNhanTraHoSo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua nhan tra ho so with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaNhanTraHoSoException} if it could not be found.
	*
	* @param id the primary key of the mot cua nhan tra ho so
	* @return the mot cua nhan tra ho so
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaNhanTraHoSoException if a mot cua nhan tra ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaNhanTraHoSoException;

	/**
	* Returns the mot cua nhan tra ho so with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the mot cua nhan tra ho so
	* @return the mot cua nhan tra ho so, or <code>null</code> if a mot cua nhan tra ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua nhan tra ho sos.
	*
	* @return the mot cua nhan tra ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua nhan tra ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaNhanTraHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua nhan tra ho sos
	* @param end the upper bound of the range of mot cua nhan tra ho sos (not inclusive)
	* @return the range of mot cua nhan tra ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua nhan tra ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaNhanTraHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua nhan tra ho sos
	* @param end the upper bound of the range of mot cua nhan tra ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mot cua nhan tra ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the mot cua nhan tra ho sos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua nhan tra ho sos.
	*
	* @return the number of mot cua nhan tra ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}