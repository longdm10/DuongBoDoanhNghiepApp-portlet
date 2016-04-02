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

package vn.dtt.duongbien.dao.vrcb.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request;

/**
 * The persistence interface for the dm test n01 request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmTestN01RequestPersistenceImpl
 * @see DmTestN01RequestUtil
 * @generated
 */
public interface DmTestN01RequestPersistence extends BasePersistence<DmTestN01Request> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmTestN01RequestUtil} to access the dm test n01 request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm test n01 request in the entity cache if it is enabled.
	*
	* @param dmTestN01Request the dm test n01 request
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request dmTestN01Request);

	/**
	* Caches the dm test n01 requests in the entity cache if it is enabled.
	*
	* @param dmTestN01Requests the dm test n01 requests
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request> dmTestN01Requests);

	/**
	* Creates a new dm test n01 request with the primary key. Does not add the dm test n01 request to the database.
	*
	* @param requestID the primary key for the new dm test n01 request
	* @return the new dm test n01 request
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request create(
		int requestID);

	/**
	* Removes the dm test n01 request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param requestID the primary key of the dm test n01 request
	* @return the dm test n01 request that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmTestN01RequestException if a dm test n01 request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request remove(
		int requestID)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmTestN01RequestException;

	public vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request dmTestN01Request)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm test n01 request with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmTestN01RequestException} if it could not be found.
	*
	* @param requestID the primary key of the dm test n01 request
	* @return the dm test n01 request
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmTestN01RequestException if a dm test n01 request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request findByPrimaryKey(
		int requestID)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmTestN01RequestException;

	/**
	* Returns the dm test n01 request with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param requestID the primary key of the dm test n01 request
	* @return the dm test n01 request, or <code>null</code> if a dm test n01 request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request fetchByPrimaryKey(
		int requestID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm test n01 requests.
	*
	* @return the dm test n01 requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm test n01 requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmTestN01RequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm test n01 requests
	* @param end the upper bound of the range of dm test n01 requests (not inclusive)
	* @return the range of dm test n01 requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm test n01 requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmTestN01RequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm test n01 requests
	* @param end the upper bound of the range of dm test n01 requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm test n01 requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmTestN01Request> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm test n01 requests from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm test n01 requests.
	*
	* @return the number of dm test n01 requests
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}