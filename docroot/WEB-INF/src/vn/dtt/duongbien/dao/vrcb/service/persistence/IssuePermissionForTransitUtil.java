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

import vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit;

import java.util.List;

/**
 * The persistence utility for the issue permission for transit service. This utility wraps {@link IssuePermissionForTransitPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see IssuePermissionForTransitPersistence
 * @see IssuePermissionForTransitPersistenceImpl
 * @generated
 */
public class IssuePermissionForTransitUtil {
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
		IssuePermissionForTransit issuePermissionForTransit) {
		getPersistence().clearCache(issuePermissionForTransit);
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
	public static List<IssuePermissionForTransit> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<IssuePermissionForTransit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<IssuePermissionForTransit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static IssuePermissionForTransit update(
		IssuePermissionForTransit issuePermissionForTransit)
		throws SystemException {
		return getPersistence().update(issuePermissionForTransit);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static IssuePermissionForTransit update(
		IssuePermissionForTransit issuePermissionForTransit,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(issuePermissionForTransit, serviceContext);
	}

	/**
	* Returns all the issue permission for transits where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit> findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(documentName,
			documentYear);
	}

	/**
	* Returns a range of all the issue permission for transits where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePermissionForTransitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of issue permission for transits
	* @param end the upper bound of the range of issue permission for transits (not inclusive)
	* @return the range of matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit> findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(documentName,
			documentYear, start, end);
	}

	/**
	* Returns an ordered range of all the issue permission for transits where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePermissionForTransitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of issue permission for transits
	* @param end the upper bound of the range of issue permission for transits (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit> findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(documentName,
			documentYear, start, end, orderByComparator);
	}

	/**
	* Returns the first issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue permission for transit
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear_First(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the first issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue permission for transit, or <code>null</code> if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit fetchByfindIssuePermissionForTransitByDocumentYearAndDocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfindIssuePermissionForTransitByDocumentYearAndDocumentYear_First(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the last issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue permission for transit
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear_Last(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the last issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue permission for transit, or <code>null</code> if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit fetchByfindIssuePermissionForTransitByDocumentYearAndDocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfindIssuePermissionForTransitByDocumentYearAndDocumentYear_Last(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the issue permission for transits before and after the current issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param id the primary key of the current issue permission for transit
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next issue permission for transit
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException if a issue permission for transit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit[] findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear_PrevAndNext(id,
			documentName, documentYear, orderByComparator);
	}

	/**
	* Removes all the issue permission for transits where documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(documentName,
			documentYear);
	}

	/**
	* Returns the number of issue permission for transits where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(documentName,
			documentYear);
	}

	/**
	* Returns the issue permission for transit where documentName = &#63; and documentYear = &#63; and requestState = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException} if it could not be found.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @return the matching issue permission for transit
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit findByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .findByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState);
	}

	/**
	* Returns the issue permission for transit where documentName = &#63; and documentYear = &#63; and requestState = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @return the matching issue permission for transit, or <code>null</code> if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit fetchByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState);
	}

	/**
	* Returns the issue permission for transit where documentName = &#63; and documentYear = &#63; and requestState = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching issue permission for transit, or <code>null</code> if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit fetchByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState, retrieveFromCache);
	}

	/**
	* Removes the issue permission for transit where documentName = &#63; and documentYear = &#63; and requestState = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @return the issue permission for transit that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit removeByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .removeByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState);
	}

	/**
	* Returns the number of issue permission for transits where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @return the number of matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static int countByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState);
	}

	/**
	* Returns all the issue permission for transits where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit> findByrequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByrequestCode(requestCode);
	}

	/**
	* Returns a range of all the issue permission for transits where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePermissionForTransitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param requestCode the request code
	* @param start the lower bound of the range of issue permission for transits
	* @param end the upper bound of the range of issue permission for transits (not inclusive)
	* @return the range of matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit> findByrequestCode(
		java.lang.String requestCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByrequestCode(requestCode, start, end);
	}

	/**
	* Returns an ordered range of all the issue permission for transits where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePermissionForTransitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param requestCode the request code
	* @param start the lower bound of the range of issue permission for transits
	* @param end the upper bound of the range of issue permission for transits (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit> findByrequestCode(
		java.lang.String requestCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByrequestCode(requestCode, start, end, orderByComparator);
	}

	/**
	* Returns the first issue permission for transit in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue permission for transit
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit findByrequestCode_First(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .findByrequestCode_First(requestCode, orderByComparator);
	}

	/**
	* Returns the first issue permission for transit in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue permission for transit, or <code>null</code> if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit fetchByrequestCode_First(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByrequestCode_First(requestCode, orderByComparator);
	}

	/**
	* Returns the last issue permission for transit in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue permission for transit
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit findByrequestCode_Last(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .findByrequestCode_Last(requestCode, orderByComparator);
	}

	/**
	* Returns the last issue permission for transit in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue permission for transit, or <code>null</code> if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit fetchByrequestCode_Last(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByrequestCode_Last(requestCode, orderByComparator);
	}

	/**
	* Returns the issue permission for transits before and after the current issue permission for transit in the ordered set where requestCode = &#63;.
	*
	* @param id the primary key of the current issue permission for transit
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next issue permission for transit
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException if a issue permission for transit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit[] findByrequestCode_PrevAndNext(
		long id, java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .findByrequestCode_PrevAndNext(id, requestCode,
			orderByComparator);
	}

	/**
	* Removes all the issue permission for transits where requestCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByrequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByrequestCode(requestCode);
	}

	/**
	* Returns the number of issue permission for transits where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the number of matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static int countByrequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByrequestCode(requestCode);
	}

	/**
	* Returns all the issue permission for transits where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit> findBydocumentNameAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentNameAndDocumentYear(documentName, documentYear);
	}

	/**
	* Returns a range of all the issue permission for transits where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePermissionForTransitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of issue permission for transits
	* @param end the upper bound of the range of issue permission for transits (not inclusive)
	* @return the range of matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit> findBydocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentNameAndDocumentYear(documentName,
			documentYear, start, end);
	}

	/**
	* Returns an ordered range of all the issue permission for transits where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePermissionForTransitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of issue permission for transits
	* @param end the upper bound of the range of issue permission for transits (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit> findBydocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentNameAndDocumentYear(documentName,
			documentYear, start, end, orderByComparator);
	}

	/**
	* Returns the first issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue permission for transit
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit findBydocumentNameAndDocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .findBydocumentNameAndDocumentYear_First(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the first issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue permission for transit, or <code>null</code> if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit fetchBydocumentNameAndDocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBydocumentNameAndDocumentYear_First(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the last issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue permission for transit
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit findBydocumentNameAndDocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .findBydocumentNameAndDocumentYear_Last(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the last issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue permission for transit, or <code>null</code> if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit fetchBydocumentNameAndDocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBydocumentNameAndDocumentYear_Last(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the issue permission for transits before and after the current issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param id the primary key of the current issue permission for transit
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next issue permission for transit
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException if a issue permission for transit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit[] findBydocumentNameAndDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .findBydocumentNameAndDocumentYear_PrevAndNext(id,
			documentName, documentYear, orderByComparator);
	}

	/**
	* Removes all the issue permission for transits where documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBydocumentNameAndDocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeBydocumentNameAndDocumentYear(documentName, documentYear);
	}

	/**
	* Returns the number of issue permission for transits where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static int countBydocumentNameAndDocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBydocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	/**
	* Returns the issue permission for transit where documentName = &#63; and documentYear = &#63; and versionNo = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException} if it could not be found.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param versionNo the version no
	* @return the matching issue permission for transit
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit findByDocumentNameAndDocumentYearAndVersionNo(
		long documentName, int documentYear, java.lang.String versionNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .findByDocumentNameAndDocumentYearAndVersionNo(documentName,
			documentYear, versionNo);
	}

	/**
	* Returns the issue permission for transit where documentName = &#63; and documentYear = &#63; and versionNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param versionNo the version no
	* @return the matching issue permission for transit, or <code>null</code> if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit fetchByDocumentNameAndDocumentYearAndVersionNo(
		long documentName, int documentYear, java.lang.String versionNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDocumentNameAndDocumentYearAndVersionNo(documentName,
			documentYear, versionNo);
	}

	/**
	* Returns the issue permission for transit where documentName = &#63; and documentYear = &#63; and versionNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param versionNo the version no
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching issue permission for transit, or <code>null</code> if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit fetchByDocumentNameAndDocumentYearAndVersionNo(
		long documentName, int documentYear, java.lang.String versionNo,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDocumentNameAndDocumentYearAndVersionNo(documentName,
			documentYear, versionNo, retrieveFromCache);
	}

	/**
	* Removes the issue permission for transit where documentName = &#63; and documentYear = &#63; and versionNo = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param versionNo the version no
	* @return the issue permission for transit that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit removeByDocumentNameAndDocumentYearAndVersionNo(
		long documentName, int documentYear, java.lang.String versionNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .removeByDocumentNameAndDocumentYearAndVersionNo(documentName,
			documentYear, versionNo);
	}

	/**
	* Returns the number of issue permission for transits where documentName = &#63; and documentYear = &#63; and versionNo = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param versionNo the version no
	* @return the number of matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDocumentNameAndDocumentYearAndVersionNo(
		long documentName, int documentYear, java.lang.String versionNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDocumentNameAndDocumentYearAndVersionNo(documentName,
			documentYear, versionNo);
	}

	/**
	* Caches the issue permission for transit in the entity cache if it is enabled.
	*
	* @param issuePermissionForTransit the issue permission for transit
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit issuePermissionForTransit) {
		getPersistence().cacheResult(issuePermissionForTransit);
	}

	/**
	* Caches the issue permission for transits in the entity cache if it is enabled.
	*
	* @param issuePermissionForTransits the issue permission for transits
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit> issuePermissionForTransits) {
		getPersistence().cacheResult(issuePermissionForTransits);
	}

	/**
	* Creates a new issue permission for transit with the primary key. Does not add the issue permission for transit to the database.
	*
	* @param id the primary key for the new issue permission for transit
	* @return the new issue permission for transit
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the issue permission for transit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the issue permission for transit
	* @return the issue permission for transit that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException if a issue permission for transit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit issuePermissionForTransit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(issuePermissionForTransit);
	}

	/**
	* Returns the issue permission for transit with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException} if it could not be found.
	*
	* @param id the primary key of the issue permission for transit
	* @return the issue permission for transit
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException if a issue permission for transit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssuePermissionForTransitException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the issue permission for transit with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the issue permission for transit
	* @return the issue permission for transit, or <code>null</code> if a issue permission for transit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the issue permission for transits.
	*
	* @return the issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the issue permission for transits.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePermissionForTransitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of issue permission for transits
	* @param end the upper bound of the range of issue permission for transits (not inclusive)
	* @return the range of issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the issue permission for transits.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePermissionForTransitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of issue permission for transits
	* @param end the upper bound of the range of issue permission for transits (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the issue permission for transits from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of issue permission for transits.
	*
	* @return the number of issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static IssuePermissionForTransitPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (IssuePermissionForTransitPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					IssuePermissionForTransitPersistence.class.getName());

			ReferenceRegistry.registerReference(IssuePermissionForTransitUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(IssuePermissionForTransitPersistence persistence) {
	}

	private static IssuePermissionForTransitPersistence _persistence;
}