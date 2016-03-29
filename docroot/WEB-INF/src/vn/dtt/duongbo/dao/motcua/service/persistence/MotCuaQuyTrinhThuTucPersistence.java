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

import vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTuc;

/**
 * The persistence interface for the mot cua quy trinh thu tuc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaQuyTrinhThuTucPersistenceImpl
 * @see MotCuaQuyTrinhThuTucUtil
 * @generated
 */
public interface MotCuaQuyTrinhThuTucPersistence extends BasePersistence<MotCuaQuyTrinhThuTuc> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MotCuaQuyTrinhThuTucUtil} to access the mot cua quy trinh thu tuc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the mot cua quy trinh thu tuc where maQuyTrinh = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException} if it could not be found.
	*
	* @param maQuyTrinh the ma quy trinh
	* @return the matching mot cua quy trinh thu tuc
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException if a matching mot cua quy trinh thu tuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTuc findByMaQuyTrinh(
		java.lang.String maQuyTrinh)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException;

	/**
	* Returns the mot cua quy trinh thu tuc where maQuyTrinh = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param maQuyTrinh the ma quy trinh
	* @return the matching mot cua quy trinh thu tuc, or <code>null</code> if a matching mot cua quy trinh thu tuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTuc fetchByMaQuyTrinh(
		java.lang.String maQuyTrinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua quy trinh thu tuc where maQuyTrinh = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param maQuyTrinh the ma quy trinh
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching mot cua quy trinh thu tuc, or <code>null</code> if a matching mot cua quy trinh thu tuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTuc fetchByMaQuyTrinh(
		java.lang.String maQuyTrinh, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the mot cua quy trinh thu tuc where maQuyTrinh = &#63; from the database.
	*
	* @param maQuyTrinh the ma quy trinh
	* @return the mot cua quy trinh thu tuc that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTuc removeByMaQuyTrinh(
		java.lang.String maQuyTrinh)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException;

	/**
	* Returns the number of mot cua quy trinh thu tucs where maQuyTrinh = &#63;.
	*
	* @param maQuyTrinh the ma quy trinh
	* @return the number of matching mot cua quy trinh thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public int countByMaQuyTrinh(java.lang.String maQuyTrinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the mot cua quy trinh thu tuc in the entity cache if it is enabled.
	*
	* @param motCuaQuyTrinhThuTuc the mot cua quy trinh thu tuc
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc);

	/**
	* Caches the mot cua quy trinh thu tucs in the entity cache if it is enabled.
	*
	* @param motCuaQuyTrinhThuTucs the mot cua quy trinh thu tucs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTuc> motCuaQuyTrinhThuTucs);

	/**
	* Creates a new mot cua quy trinh thu tuc with the primary key. Does not add the mot cua quy trinh thu tuc to the database.
	*
	* @param id the primary key for the new mot cua quy trinh thu tuc
	* @return the new mot cua quy trinh thu tuc
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTuc create(long id);

	/**
	* Removes the mot cua quy trinh thu tuc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua quy trinh thu tuc
	* @return the mot cua quy trinh thu tuc that was removed
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException if a mot cua quy trinh thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTuc remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException;

	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTuc updateImpl(
		vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua quy trinh thu tuc with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException} if it could not be found.
	*
	* @param id the primary key of the mot cua quy trinh thu tuc
	* @return the mot cua quy trinh thu tuc
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException if a mot cua quy trinh thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTuc findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException;

	/**
	* Returns the mot cua quy trinh thu tuc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the mot cua quy trinh thu tuc
	* @return the mot cua quy trinh thu tuc, or <code>null</code> if a mot cua quy trinh thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTuc fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua quy trinh thu tucs.
	*
	* @return the mot cua quy trinh thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTuc> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua quy trinh thu tucs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua quy trinh thu tucs
	* @param end the upper bound of the range of mot cua quy trinh thu tucs (not inclusive)
	* @return the range of mot cua quy trinh thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTuc> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua quy trinh thu tucs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua quy trinh thu tucs
	* @param end the upper bound of the range of mot cua quy trinh thu tucs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mot cua quy trinh thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTuc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the mot cua quy trinh thu tucs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua quy trinh thu tucs.
	*
	* @return the number of mot cua quy trinh thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}