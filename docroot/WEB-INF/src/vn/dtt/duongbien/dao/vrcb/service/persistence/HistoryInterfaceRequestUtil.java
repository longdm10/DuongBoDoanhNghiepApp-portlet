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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest;

import java.util.List;

/**
 * The persistence utility for the history interface request service. This utility wraps {@link HistoryInterfaceRequestPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see HistoryInterfaceRequestPersistence
 * @see HistoryInterfaceRequestPersistenceImpl
 * @generated
 */
public class HistoryInterfaceRequestUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(
		HistoryInterfaceRequest historyInterfaceRequest) {
		getPersistence().clearCache(historyInterfaceRequest);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HistoryInterfaceRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HistoryInterfaceRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HistoryInterfaceRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static HistoryInterfaceRequest update(
		HistoryInterfaceRequest historyInterfaceRequest)
		throws SystemException {
		return getPersistence().update(historyInterfaceRequest);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static HistoryInterfaceRequest update(
		HistoryInterfaceRequest historyInterfaceRequest,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(historyInterfaceRequest, serviceContext);
	}

	/**
	* Returns the history interface request where requestCode = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException} if it could not be found.
	*
	* @param requestCode the request code
	* @return the matching history interface request
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a matching history interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException {
		return getPersistence().findByRequestCode(requestCode);
	}

	/**
	* Returns the history interface request where requestCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param requestCode the request code
	* @return the matching history interface request, or <code>null</code> if a matching history interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest fetchByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByRequestCode(requestCode);
	}

	/**
	* Returns the history interface request where requestCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param requestCode the request code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching history interface request, or <code>null</code> if a matching history interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest fetchByRequestCode(
		java.lang.String requestCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRequestCode(requestCode, retrieveFromCache);
	}

	/**
	* Removes the history interface request where requestCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @return the history interface request that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest removeByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException {
		return getPersistence().removeByRequestCode(requestCode);
	}

	/**
	* Returns the number of history interface requests where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the number of matching history interface requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRequestCode(requestCode);
	}

	/**
	* Returns all the history interface requests where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @return the matching history interface requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest> findByOrganizationCode(
		java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByOrganizationCode(organizationCode);
	}

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
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest> findByOrganizationCode(
		java.lang.String organizationCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOrganizationCode(organizationCode, start, end);
	}

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
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest> findByOrganizationCode(
		java.lang.String organizationCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOrganizationCode(organizationCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first history interface request in the ordered set where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching history interface request
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a matching history interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest findByOrganizationCode_First(
		java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException {
		return getPersistence()
				   .findByOrganizationCode_First(organizationCode,
			orderByComparator);
	}

	/**
	* Returns the first history interface request in the ordered set where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching history interface request, or <code>null</code> if a matching history interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest fetchByOrganizationCode_First(
		java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByOrganizationCode_First(organizationCode,
			orderByComparator);
	}

	/**
	* Returns the last history interface request in the ordered set where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching history interface request
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a matching history interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest findByOrganizationCode_Last(
		java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException {
		return getPersistence()
				   .findByOrganizationCode_Last(organizationCode,
			orderByComparator);
	}

	/**
	* Returns the last history interface request in the ordered set where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching history interface request, or <code>null</code> if a matching history interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest fetchByOrganizationCode_Last(
		java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByOrganizationCode_Last(organizationCode,
			orderByComparator);
	}

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
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest[] findByOrganizationCode_PrevAndNext(
		long id, java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException {
		return getPersistence()
				   .findByOrganizationCode_PrevAndNext(id, organizationCode,
			orderByComparator);
	}

	/**
	* Removes all the history interface requests where organizationCode = &#63; from the database.
	*
	* @param organizationCode the organization code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByOrganizationCode(
		java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByOrganizationCode(organizationCode);
	}

	/**
	* Returns the number of history interface requests where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @return the number of matching history interface requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countByOrganizationCode(java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByOrganizationCode(organizationCode);
	}

	/**
	* Returns all the history interface requests where locCode = &#63;.
	*
	* @param locCode the loc code
	* @return the matching history interface requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest> findByLocCode(
		java.lang.String locCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLocCode(locCode);
	}

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
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest> findByLocCode(
		java.lang.String locCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLocCode(locCode, start, end);
	}

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
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest> findByLocCode(
		java.lang.String locCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByLocCode(locCode, start, end, orderByComparator);
	}

	/**
	* Returns the first history interface request in the ordered set where locCode = &#63;.
	*
	* @param locCode the loc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching history interface request
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a matching history interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest findByLocCode_First(
		java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException {
		return getPersistence().findByLocCode_First(locCode, orderByComparator);
	}

	/**
	* Returns the first history interface request in the ordered set where locCode = &#63;.
	*
	* @param locCode the loc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching history interface request, or <code>null</code> if a matching history interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest fetchByLocCode_First(
		java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByLocCode_First(locCode, orderByComparator);
	}

	/**
	* Returns the last history interface request in the ordered set where locCode = &#63;.
	*
	* @param locCode the loc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching history interface request
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a matching history interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest findByLocCode_Last(
		java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException {
		return getPersistence().findByLocCode_Last(locCode, orderByComparator);
	}

	/**
	* Returns the last history interface request in the ordered set where locCode = &#63;.
	*
	* @param locCode the loc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching history interface request, or <code>null</code> if a matching history interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest fetchByLocCode_Last(
		java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByLocCode_Last(locCode, orderByComparator);
	}

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
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest[] findByLocCode_PrevAndNext(
		long id, java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException {
		return getPersistence()
				   .findByLocCode_PrevAndNext(id, locCode, orderByComparator);
	}

	/**
	* Removes all the history interface requests where locCode = &#63; from the database.
	*
	* @param locCode the loc code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByLocCode(java.lang.String locCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByLocCode(locCode);
	}

	/**
	* Returns the number of history interface requests where locCode = &#63;.
	*
	* @param locCode the loc code
	* @return the number of matching history interface requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countByLocCode(java.lang.String locCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByLocCode(locCode);
	}

	/**
	* Caches the history interface request in the entity cache if it is enabled.
	*
	* @param historyInterfaceRequest the history interface request
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest historyInterfaceRequest) {
		getPersistence().cacheResult(historyInterfaceRequest);
	}

	/**
	* Caches the history interface requests in the entity cache if it is enabled.
	*
	* @param historyInterfaceRequests the history interface requests
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest> historyInterfaceRequests) {
		getPersistence().cacheResult(historyInterfaceRequests);
	}

	/**
	* Creates a new history interface request with the primary key. Does not add the history interface request to the database.
	*
	* @param id the primary key for the new history interface request
	* @return the new history interface request
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the history interface request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the history interface request
	* @return the history interface request that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a history interface request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest historyInterfaceRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(historyInterfaceRequest);
	}

	/**
	* Returns the history interface request with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException} if it could not be found.
	*
	* @param id the primary key of the history interface request
	* @return the history interface request
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException if a history interface request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryInterfaceRequestException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the history interface request with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the history interface request
	* @return the history interface request, or <code>null</code> if a history interface request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the history interface requests.
	*
	* @return the history interface requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the history interface requests from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of history interface requests.
	*
	* @return the number of history interface requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static HistoryInterfaceRequestPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (HistoryInterfaceRequestPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					HistoryInterfaceRequestPersistence.class.getName());

			ReferenceRegistry.registerReference(HistoryInterfaceRequestUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(HistoryInterfaceRequestPersistence persistence) {
	}

	private static HistoryInterfaceRequestPersistence _persistence;
}