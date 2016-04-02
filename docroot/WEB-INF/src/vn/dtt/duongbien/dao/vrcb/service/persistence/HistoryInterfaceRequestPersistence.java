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

import vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest;

/**
 * The persistence interface for the history interface request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see HistoryInterfaceRequestPersistenceImpl
 * @see HistoryInterfaceRequestUtil
 * @generated
 */
public interface HistoryInterfaceRequestPersistence extends BasePersistence<HistoryInterfaceRequest> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HistoryInterfaceRequestUtil} to access the history interface request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the history interface request where requestCode = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException} if it could not be found.
	*
	* @param requestCode the request code
	* @return the matching history interface request
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a matching history interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException;

	/**
	* Returns the history interface request where requestCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param requestCode the request code
	* @return the matching history interface request, or <code>null</code> if a matching history interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest fetchByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the history interface request where requestCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param requestCode the request code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching history interface request, or <code>null</code> if a matching history interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest fetchByRequestCode(
		java.lang.String requestCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the history interface request where requestCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @return the history interface request that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest removeByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException;

	/**
	* Returns the number of history interface requests where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the number of matching history interface requests
	* @throws SystemException if a system exception occurred
	*/
	public int countByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the history interface requests where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @return the matching history interface requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest> findByOrganizationCode(
		java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the history interface requests where organizationCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationCode the organization code
	* @param start the lower bound of the range of history interface requests
	* @param end the upper bound of the range of history interface requests (not inclusive)
	* @return the range of matching history interface requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest> findByOrganizationCode(
		java.lang.String organizationCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the history interface requests where organizationCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationCode the organization code
	* @param start the lower bound of the range of history interface requests
	* @param end the upper bound of the range of history interface requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching history interface requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest> findByOrganizationCode(
		java.lang.String organizationCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first history interface request in the ordered set where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching history interface request
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a matching history interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest findByOrganizationCode_First(
		java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException;

	/**
	* Returns the first history interface request in the ordered set where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching history interface request, or <code>null</code> if a matching history interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest fetchByOrganizationCode_First(
		java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last history interface request in the ordered set where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching history interface request
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a matching history interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest findByOrganizationCode_Last(
		java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException;

	/**
	* Returns the last history interface request in the ordered set where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching history interface request, or <code>null</code> if a matching history interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest fetchByOrganizationCode_Last(
		java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the history interface requests before and after the current history interface request in the ordered set where organizationCode = &#63;.
	*
	* @param id the primary key of the current history interface request
	* @param organizationCode the organization code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next history interface request
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a history interface request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest[] findByOrganizationCode_PrevAndNext(
		long id, java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException;

	/**
	* Removes all the history interface requests where organizationCode = &#63; from the database.
	*
	* @param organizationCode the organization code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByOrganizationCode(java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of history interface requests where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @return the number of matching history interface requests
	* @throws SystemException if a system exception occurred
	*/
	public int countByOrganizationCode(java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the history interface requests where locCode = &#63;.
	*
	* @param locCode the loc code
	* @return the matching history interface requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest> findByLocCode(
		java.lang.String locCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the history interface requests where locCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param locCode the loc code
	* @param start the lower bound of the range of history interface requests
	* @param end the upper bound of the range of history interface requests (not inclusive)
	* @return the range of matching history interface requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest> findByLocCode(
		java.lang.String locCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the history interface requests where locCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param locCode the loc code
	* @param start the lower bound of the range of history interface requests
	* @param end the upper bound of the range of history interface requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching history interface requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest> findByLocCode(
		java.lang.String locCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first history interface request in the ordered set where locCode = &#63;.
	*
	* @param locCode the loc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching history interface request
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a matching history interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest findByLocCode_First(
		java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException;

	/**
	* Returns the first history interface request in the ordered set where locCode = &#63;.
	*
	* @param locCode the loc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching history interface request, or <code>null</code> if a matching history interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest fetchByLocCode_First(
		java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last history interface request in the ordered set where locCode = &#63;.
	*
	* @param locCode the loc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching history interface request
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a matching history interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest findByLocCode_Last(
		java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException;

	/**
	* Returns the last history interface request in the ordered set where locCode = &#63;.
	*
	* @param locCode the loc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching history interface request, or <code>null</code> if a matching history interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest fetchByLocCode_Last(
		java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the history interface requests before and after the current history interface request in the ordered set where locCode = &#63;.
	*
	* @param id the primary key of the current history interface request
	* @param locCode the loc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next history interface request
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a history interface request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest[] findByLocCode_PrevAndNext(
		long id, java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException;

	/**
	* Removes all the history interface requests where locCode = &#63; from the database.
	*
	* @param locCode the loc code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByLocCode(java.lang.String locCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of history interface requests where locCode = &#63;.
	*
	* @param locCode the loc code
	* @return the number of matching history interface requests
	* @throws SystemException if a system exception occurred
	*/
	public int countByLocCode(java.lang.String locCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the history interface request in the entity cache if it is enabled.
	*
	* @param historyInterfaceRequest the history interface request
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest historyInterfaceRequest);

	/**
	* Caches the history interface requests in the entity cache if it is enabled.
	*
	* @param historyInterfaceRequests the history interface requests
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest> historyInterfaceRequests);

	/**
	* Creates a new history interface request with the primary key. Does not add the history interface request to the database.
	*
	* @param id the primary key for the new history interface request
	* @return the new history interface request
	*/
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest create(
		long id);

	/**
	* Removes the history interface request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the history interface request
	* @return the history interface request that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a history interface request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException;

	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest historyInterfaceRequest)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the history interface request with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException} if it could not be found.
	*
	* @param id the primary key of the history interface request
	* @return the history interface request
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a history interface request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException;

	/**
	* Returns the history interface request with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the history interface request
	* @return the history interface request, or <code>null</code> if a history interface request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the history interface requests.
	*
	* @return the history interface requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the history interface requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of history interface requests
	* @param end the upper bound of the range of history interface requests (not inclusive)
	* @return the range of history interface requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the history interface requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryInterfaceRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of history interface requests
	* @param end the upper bound of the range of history interface requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of history interface requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the history interface requests from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of history interface requests.
	*
	* @return the number of history interface requests
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}