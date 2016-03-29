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

import vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC;

/**
 * The persistence interface for the mot cua quy trinh thu tuc t t h c service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaQuyTrinhThuTucTTHCPersistenceImpl
 * @see MotCuaQuyTrinhThuTucTTHCUtil
 * @generated
 */
public interface MotCuaQuyTrinhThuTucTTHCPersistence extends BasePersistence<MotCuaQuyTrinhThuTucTTHC> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MotCuaQuyTrinhThuTucTTHCUtil} to access the mot cua quy trinh thu tuc t t h c persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the mot cua quy trinh thu tuc t t h c where quyTrinhThuTucId = &#63; and thuTucHanhChinhID = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException} if it could not be found.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @return the matching mot cua quy trinh thu tuc t t h c
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC findByThuTucHanhChinhIDAndQuyTrinhThuTucId(
		long quyTrinhThuTucId, long thuTucHanhChinhID)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException;

	/**
	* Returns the mot cua quy trinh thu tuc t t h c where quyTrinhThuTucId = &#63; and thuTucHanhChinhID = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @return the matching mot cua quy trinh thu tuc t t h c, or <code>null</code> if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC fetchByThuTucHanhChinhIDAndQuyTrinhThuTucId(
		long quyTrinhThuTucId, long thuTucHanhChinhID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua quy trinh thu tuc t t h c where quyTrinhThuTucId = &#63; and thuTucHanhChinhID = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching mot cua quy trinh thu tuc t t h c, or <code>null</code> if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC fetchByThuTucHanhChinhIDAndQuyTrinhThuTucId(
		long quyTrinhThuTucId, long thuTucHanhChinhID, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the mot cua quy trinh thu tuc t t h c where quyTrinhThuTucId = &#63; and thuTucHanhChinhID = &#63; from the database.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @return the mot cua quy trinh thu tuc t t h c that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC removeByThuTucHanhChinhIDAndQuyTrinhThuTucId(
		long quyTrinhThuTucId, long thuTucHanhChinhID)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException;

	/**
	* Returns the number of mot cua quy trinh thu tuc t t h cs where quyTrinhThuTucId = &#63; and thuTucHanhChinhID = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @return the number of matching mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public int countByThuTucHanhChinhIDAndQuyTrinhThuTucId(
		long quyTrinhThuTucId, long thuTucHanhChinhID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua quy trinh thu tuc t t h c where thuTucHanhChinhID = &#63; and toChucXuLy = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException} if it could not be found.
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @param toChucXuLy the to chuc xu ly
	* @return the matching mot cua quy trinh thu tuc t t h c
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC findByThuTucHanhChinhIDAndToChucXuLy(
		long thuTucHanhChinhID, long toChucXuLy)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException;

	/**
	* Returns the mot cua quy trinh thu tuc t t h c where thuTucHanhChinhID = &#63; and toChucXuLy = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @param toChucXuLy the to chuc xu ly
	* @return the matching mot cua quy trinh thu tuc t t h c, or <code>null</code> if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC fetchByThuTucHanhChinhIDAndToChucXuLy(
		long thuTucHanhChinhID, long toChucXuLy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua quy trinh thu tuc t t h c where thuTucHanhChinhID = &#63; and toChucXuLy = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @param toChucXuLy the to chuc xu ly
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching mot cua quy trinh thu tuc t t h c, or <code>null</code> if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC fetchByThuTucHanhChinhIDAndToChucXuLy(
		long thuTucHanhChinhID, long toChucXuLy, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the mot cua quy trinh thu tuc t t h c where thuTucHanhChinhID = &#63; and toChucXuLy = &#63; from the database.
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @param toChucXuLy the to chuc xu ly
	* @return the mot cua quy trinh thu tuc t t h c that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC removeByThuTucHanhChinhIDAndToChucXuLy(
		long thuTucHanhChinhID, long toChucXuLy)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException;

	/**
	* Returns the number of mot cua quy trinh thu tuc t t h cs where thuTucHanhChinhID = &#63; and toChucXuLy = &#63;.
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @param toChucXuLy the to chuc xu ly
	* @return the number of matching mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public int countByThuTucHanhChinhIDAndToChucXuLy(long thuTucHanhChinhID,
		long toChucXuLy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua quy trinh thu tuc t t h cs where thuTucHanhChinhID = &#63;.
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @return the matching mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC> findByThuTucHanhChinhID(
		long thuTucHanhChinhID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua quy trinh thu tuc t t h cs where thuTucHanhChinhID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @param start the lower bound of the range of mot cua quy trinh thu tuc t t h cs
	* @param end the upper bound of the range of mot cua quy trinh thu tuc t t h cs (not inclusive)
	* @return the range of matching mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC> findByThuTucHanhChinhID(
		long thuTucHanhChinhID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua quy trinh thu tuc t t h cs where thuTucHanhChinhID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @param start the lower bound of the range of mot cua quy trinh thu tuc t t h cs
	* @param end the upper bound of the range of mot cua quy trinh thu tuc t t h cs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC> findByThuTucHanhChinhID(
		long thuTucHanhChinhID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua quy trinh thu tuc t t h c in the ordered set where thuTucHanhChinhID = &#63;.
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua quy trinh thu tuc t t h c
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC findByThuTucHanhChinhID_First(
		long thuTucHanhChinhID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException;

	/**
	* Returns the first mot cua quy trinh thu tuc t t h c in the ordered set where thuTucHanhChinhID = &#63;.
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua quy trinh thu tuc t t h c, or <code>null</code> if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC fetchByThuTucHanhChinhID_First(
		long thuTucHanhChinhID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua quy trinh thu tuc t t h c in the ordered set where thuTucHanhChinhID = &#63;.
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua quy trinh thu tuc t t h c
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC findByThuTucHanhChinhID_Last(
		long thuTucHanhChinhID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException;

	/**
	* Returns the last mot cua quy trinh thu tuc t t h c in the ordered set where thuTucHanhChinhID = &#63;.
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua quy trinh thu tuc t t h c, or <code>null</code> if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC fetchByThuTucHanhChinhID_Last(
		long thuTucHanhChinhID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua quy trinh thu tuc t t h cs before and after the current mot cua quy trinh thu tuc t t h c in the ordered set where thuTucHanhChinhID = &#63;.
	*
	* @param id the primary key of the current mot cua quy trinh thu tuc t t h c
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua quy trinh thu tuc t t h c
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a mot cua quy trinh thu tuc t t h c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC[] findByThuTucHanhChinhID_PrevAndNext(
		long id, long thuTucHanhChinhID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException;

	/**
	* Removes all the mot cua quy trinh thu tuc t t h cs where thuTucHanhChinhID = &#63; from the database.
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @throws SystemException if a system exception occurred
	*/
	public void removeByThuTucHanhChinhID(long thuTucHanhChinhID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua quy trinh thu tuc t t h cs where thuTucHanhChinhID = &#63;.
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @return the number of matching mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public int countByThuTucHanhChinhID(long thuTucHanhChinhID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua quy trinh thu tuc t t h cs where quyTrinhThuTucId = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @return the matching mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC> findByquyTrinhThuTucId(
		long quyTrinhThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua quy trinh thu tuc t t h cs where quyTrinhThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param start the lower bound of the range of mot cua quy trinh thu tuc t t h cs
	* @param end the upper bound of the range of mot cua quy trinh thu tuc t t h cs (not inclusive)
	* @return the range of matching mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC> findByquyTrinhThuTucId(
		long quyTrinhThuTucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua quy trinh thu tuc t t h cs where quyTrinhThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param start the lower bound of the range of mot cua quy trinh thu tuc t t h cs
	* @param end the upper bound of the range of mot cua quy trinh thu tuc t t h cs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC> findByquyTrinhThuTucId(
		long quyTrinhThuTucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua quy trinh thu tuc t t h c in the ordered set where quyTrinhThuTucId = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua quy trinh thu tuc t t h c
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC findByquyTrinhThuTucId_First(
		long quyTrinhThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException;

	/**
	* Returns the first mot cua quy trinh thu tuc t t h c in the ordered set where quyTrinhThuTucId = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua quy trinh thu tuc t t h c, or <code>null</code> if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC fetchByquyTrinhThuTucId_First(
		long quyTrinhThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua quy trinh thu tuc t t h c in the ordered set where quyTrinhThuTucId = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua quy trinh thu tuc t t h c
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC findByquyTrinhThuTucId_Last(
		long quyTrinhThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException;

	/**
	* Returns the last mot cua quy trinh thu tuc t t h c in the ordered set where quyTrinhThuTucId = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua quy trinh thu tuc t t h c, or <code>null</code> if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC fetchByquyTrinhThuTucId_Last(
		long quyTrinhThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua quy trinh thu tuc t t h cs before and after the current mot cua quy trinh thu tuc t t h c in the ordered set where quyTrinhThuTucId = &#63;.
	*
	* @param id the primary key of the current mot cua quy trinh thu tuc t t h c
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua quy trinh thu tuc t t h c
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a mot cua quy trinh thu tuc t t h c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC[] findByquyTrinhThuTucId_PrevAndNext(
		long id, long quyTrinhThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException;

	/**
	* Removes all the mot cua quy trinh thu tuc t t h cs where quyTrinhThuTucId = &#63; from the database.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByquyTrinhThuTucId(long quyTrinhThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua quy trinh thu tuc t t h cs where quyTrinhThuTucId = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @return the number of matching mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public int countByquyTrinhThuTucId(long quyTrinhThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the mot cua quy trinh thu tuc t t h c in the entity cache if it is enabled.
	*
	* @param motCuaQuyTrinhThuTucTTHC the mot cua quy trinh thu tuc t t h c
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC);

	/**
	* Caches the mot cua quy trinh thu tuc t t h cs in the entity cache if it is enabled.
	*
	* @param motCuaQuyTrinhThuTucTTHCs the mot cua quy trinh thu tuc t t h cs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC> motCuaQuyTrinhThuTucTTHCs);

	/**
	* Creates a new mot cua quy trinh thu tuc t t h c with the primary key. Does not add the mot cua quy trinh thu tuc t t h c to the database.
	*
	* @param id the primary key for the new mot cua quy trinh thu tuc t t h c
	* @return the new mot cua quy trinh thu tuc t t h c
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC create(
		long id);

	/**
	* Removes the mot cua quy trinh thu tuc t t h c with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua quy trinh thu tuc t t h c
	* @return the mot cua quy trinh thu tuc t t h c that was removed
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a mot cua quy trinh thu tuc t t h c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException;

	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC updateImpl(
		vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua quy trinh thu tuc t t h c with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException} if it could not be found.
	*
	* @param id the primary key of the mot cua quy trinh thu tuc t t h c
	* @return the mot cua quy trinh thu tuc t t h c
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a mot cua quy trinh thu tuc t t h c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException;

	/**
	* Returns the mot cua quy trinh thu tuc t t h c with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the mot cua quy trinh thu tuc t t h c
	* @return the mot cua quy trinh thu tuc t t h c, or <code>null</code> if a mot cua quy trinh thu tuc t t h c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua quy trinh thu tuc t t h cs.
	*
	* @return the mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua quy trinh thu tuc t t h cs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua quy trinh thu tuc t t h cs
	* @param end the upper bound of the range of mot cua quy trinh thu tuc t t h cs (not inclusive)
	* @return the range of mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua quy trinh thu tuc t t h cs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua quy trinh thu tuc t t h cs
	* @param end the upper bound of the range of mot cua quy trinh thu tuc t t h cs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the mot cua quy trinh thu tuc t t h cs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua quy trinh thu tuc t t h cs.
	*
	* @return the number of mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}