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

package vn.dtt.duongbo.dao.thanhtoan.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi;

/**
 * The persistence interface for the tthc hinh thuc nop phi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcHinhThucNopPhiPersistenceImpl
 * @see TthcHinhThucNopPhiUtil
 * @generated
 */
public interface TthcHinhThucNopPhiPersistence extends BasePersistence<TthcHinhThucNopPhi> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TthcHinhThucNopPhiUtil} to access the tthc hinh thuc nop phi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the tthc hinh thuc nop phi where thuTucHanhChinhId = &#63; or throws a {@link vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException} if it could not be found.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @return the matching tthc hinh thuc nop phi
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException if a matching tthc hinh thuc nop phi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi findByThuTucHanhChinhId(
		long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException;

	/**
	* Returns the tthc hinh thuc nop phi where thuTucHanhChinhId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @return the matching tthc hinh thuc nop phi, or <code>null</code> if a matching tthc hinh thuc nop phi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi fetchByThuTucHanhChinhId(
		long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc hinh thuc nop phi where thuTucHanhChinhId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc hinh thuc nop phi, or <code>null</code> if a matching tthc hinh thuc nop phi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi fetchByThuTucHanhChinhId(
		long thuTucHanhChinhId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the tthc hinh thuc nop phi where thuTucHanhChinhId = &#63; from the database.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @return the tthc hinh thuc nop phi that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi removeByThuTucHanhChinhId(
		long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException;

	/**
	* Returns the number of tthc hinh thuc nop phis where thuTucHanhChinhId = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @return the number of matching tthc hinh thuc nop phis
	* @throws SystemException if a system exception occurred
	*/
	public int countByThuTucHanhChinhId(long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the tthc hinh thuc nop phi in the entity cache if it is enabled.
	*
	* @param tthcHinhThucNopPhi the tthc hinh thuc nop phi
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi tthcHinhThucNopPhi);

	/**
	* Caches the tthc hinh thuc nop phis in the entity cache if it is enabled.
	*
	* @param tthcHinhThucNopPhis the tthc hinh thuc nop phis
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi> tthcHinhThucNopPhis);

	/**
	* Creates a new tthc hinh thuc nop phi with the primary key. Does not add the tthc hinh thuc nop phi to the database.
	*
	* @param id the primary key for the new tthc hinh thuc nop phi
	* @return the new tthc hinh thuc nop phi
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi create(long id);

	/**
	* Removes the tthc hinh thuc nop phi with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc hinh thuc nop phi
	* @return the tthc hinh thuc nop phi that was removed
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException if a tthc hinh thuc nop phi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException;

	public vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi updateImpl(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi tthcHinhThucNopPhi)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc hinh thuc nop phi with the primary key or throws a {@link vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException} if it could not be found.
	*
	* @param id the primary key of the tthc hinh thuc nop phi
	* @return the tthc hinh thuc nop phi
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException if a tthc hinh thuc nop phi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcHinhThucNopPhiException;

	/**
	* Returns the tthc hinh thuc nop phi with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tthc hinh thuc nop phi
	* @return the tthc hinh thuc nop phi, or <code>null</code> if a tthc hinh thuc nop phi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tthc hinh thuc nop phis.
	*
	* @return the tthc hinh thuc nop phis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc hinh thuc nop phis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcHinhThucNopPhiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc hinh thuc nop phis
	* @param end the upper bound of the range of tthc hinh thuc nop phis (not inclusive)
	* @return the range of tthc hinh thuc nop phis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc hinh thuc nop phis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcHinhThucNopPhiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc hinh thuc nop phis
	* @param end the upper bound of the range of tthc hinh thuc nop phis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc hinh thuc nop phis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tthc hinh thuc nop phis from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc hinh thuc nop phis.
	*
	* @return the number of tthc hinh thuc nop phis
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}