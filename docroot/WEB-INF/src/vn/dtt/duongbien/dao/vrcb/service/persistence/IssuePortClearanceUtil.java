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

import vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance;

import java.util.List;

/**
 * The persistence utility for the issue port clearance service. This utility wraps {@link IssuePortClearancePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see IssuePortClearancePersistence
 * @see IssuePortClearancePersistenceImpl
 * @generated
 */
public class IssuePortClearanceUtil {
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
	public static void clearCache(IssuePortClearance issuePortClearance) {
		getPersistence().clearCache(issuePortClearance);
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
	public static List<IssuePortClearance> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<IssuePortClearance> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<IssuePortClearance> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static IssuePortClearance update(
		IssuePortClearance issuePortClearance) throws SystemException {
		return getPersistence().update(issuePortClearance);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static IssuePortClearance update(
		IssuePortClearance issuePortClearance, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(issuePortClearance, serviceContext);
	}

	/**
	* Returns all the issue port clearances where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching issue port clearances
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance> findByfindIssuePortClearanceByDocumentYearAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfindIssuePortClearanceByDocumentYearAndDocumentYear(documentName,
			documentYear);
	}

	/**
	* Returns a range of all the issue port clearances where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePortClearanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of issue port clearances
	* @param end the upper bound of the range of issue port clearances (not inclusive)
	* @return the range of matching issue port clearances
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance> findByfindIssuePortClearanceByDocumentYearAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfindIssuePortClearanceByDocumentYearAndDocumentYear(documentName,
			documentYear, start, end);
	}

	/**
	* Returns an ordered range of all the issue port clearances where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePortClearanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of issue port clearances
	* @param end the upper bound of the range of issue port clearances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching issue port clearances
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance> findByfindIssuePortClearanceByDocumentYearAndDocumentYear(
		long documentName, int documentYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfindIssuePortClearanceByDocumentYearAndDocumentYear(documentName,
			documentYear, start, end, orderByComparator);
	}

	/**
	* Returns the first issue port clearance in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue port clearance
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException if a matching issue port clearance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance findByfindIssuePortClearanceByDocumentYearAndDocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException {
		return getPersistence()
				   .findByfindIssuePortClearanceByDocumentYearAndDocumentYear_First(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the first issue port clearance in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue port clearance, or <code>null</code> if a matching issue port clearance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance fetchByfindIssuePortClearanceByDocumentYearAndDocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfindIssuePortClearanceByDocumentYearAndDocumentYear_First(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the last issue port clearance in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue port clearance
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException if a matching issue port clearance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance findByfindIssuePortClearanceByDocumentYearAndDocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException {
		return getPersistence()
				   .findByfindIssuePortClearanceByDocumentYearAndDocumentYear_Last(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the last issue port clearance in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue port clearance, or <code>null</code> if a matching issue port clearance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance fetchByfindIssuePortClearanceByDocumentYearAndDocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfindIssuePortClearanceByDocumentYearAndDocumentYear_Last(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the issue port clearances before and after the current issue port clearance in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param id the primary key of the current issue port clearance
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next issue port clearance
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException if a issue port clearance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance[] findByfindIssuePortClearanceByDocumentYearAndDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException {
		return getPersistence()
				   .findByfindIssuePortClearanceByDocumentYearAndDocumentYear_PrevAndNext(id,
			documentName, documentYear, orderByComparator);
	}

	/**
	* Removes all the issue port clearances where documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByfindIssuePortClearanceByDocumentYearAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByfindIssuePortClearanceByDocumentYearAndDocumentYear(documentName,
			documentYear);
	}

	/**
	* Returns the number of issue port clearances where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching issue port clearances
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfindIssuePortClearanceByDocumentYearAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByfindIssuePortClearanceByDocumentYearAndDocumentYear(documentName,
			documentYear);
	}

	/**
	* Returns all the issue port clearances where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @return the matching issue port clearances
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance> findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState);
	}

	/**
	* Returns a range of all the issue port clearances where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePortClearanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param start the lower bound of the range of issue port clearances
	* @param end the upper bound of the range of issue port clearances (not inclusive)
	* @return the range of matching issue port clearances
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance> findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState, start, end);
	}

	/**
	* Returns an ordered range of all the issue port clearances where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePortClearanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param start the lower bound of the range of issue port clearances
	* @param end the upper bound of the range of issue port clearances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching issue port clearances
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance> findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState, start, end, orderByComparator);
	}

	/**
	* Returns the first issue port clearance in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue port clearance
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException if a matching issue port clearance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_First(
		long documentName, int documentYear, int requestState,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException {
		return getPersistence()
				   .findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_First(documentName,
			documentYear, requestState, orderByComparator);
	}

	/**
	* Returns the first issue port clearance in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue port clearance, or <code>null</code> if a matching issue port clearance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance fetchByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_First(
		long documentName, int documentYear, int requestState,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_First(documentName,
			documentYear, requestState, orderByComparator);
	}

	/**
	* Returns the last issue port clearance in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue port clearance
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException if a matching issue port clearance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_Last(
		long documentName, int documentYear, int requestState,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException {
		return getPersistence()
				   .findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_Last(documentName,
			documentYear, requestState, orderByComparator);
	}

	/**
	* Returns the last issue port clearance in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue port clearance, or <code>null</code> if a matching issue port clearance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance fetchByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_Last(
		long documentName, int documentYear, int requestState,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_Last(documentName,
			documentYear, requestState, orderByComparator);
	}

	/**
	* Returns the issue port clearances before and after the current issue port clearance in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param id the primary key of the current issue port clearance
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next issue port clearance
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException if a issue port clearance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance[] findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_PrevAndNext(
		long id, long documentName, int documentYear, int requestState,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException {
		return getPersistence()
				   .findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState_PrevAndNext(id,
			documentName, documentYear, requestState, orderByComparator);
	}

	/**
	* Removes all the issue port clearances where documentName = &#63; and documentYear = &#63; and requestState = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState);
	}

	/**
	* Returns the number of issue port clearances where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @return the number of matching issue port clearances
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState);
	}

	/**
	* Returns all the issue port clearances where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the matching issue port clearances
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance> findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRequestCode(requestCode);
	}

	/**
	* Returns a range of all the issue port clearances where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePortClearanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param requestCode the request code
	* @param start the lower bound of the range of issue port clearances
	* @param end the upper bound of the range of issue port clearances (not inclusive)
	* @return the range of matching issue port clearances
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance> findByRequestCode(
		java.lang.String requestCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRequestCode(requestCode, start, end);
	}

	/**
	* Returns an ordered range of all the issue port clearances where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePortClearanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param requestCode the request code
	* @param start the lower bound of the range of issue port clearances
	* @param end the upper bound of the range of issue port clearances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching issue port clearances
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance> findByRequestCode(
		java.lang.String requestCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRequestCode(requestCode, start, end, orderByComparator);
	}

	/**
	* Returns the first issue port clearance in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue port clearance
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException if a matching issue port clearance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance findByRequestCode_First(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException {
		return getPersistence()
				   .findByRequestCode_First(requestCode, orderByComparator);
	}

	/**
	* Returns the first issue port clearance in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue port clearance, or <code>null</code> if a matching issue port clearance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance fetchByRequestCode_First(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRequestCode_First(requestCode, orderByComparator);
	}

	/**
	* Returns the last issue port clearance in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue port clearance
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException if a matching issue port clearance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance findByRequestCode_Last(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException {
		return getPersistence()
				   .findByRequestCode_Last(requestCode, orderByComparator);
	}

	/**
	* Returns the last issue port clearance in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue port clearance, or <code>null</code> if a matching issue port clearance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance fetchByRequestCode_Last(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRequestCode_Last(requestCode, orderByComparator);
	}

	/**
	* Returns the issue port clearances before and after the current issue port clearance in the ordered set where requestCode = &#63;.
	*
	* @param id the primary key of the current issue port clearance
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next issue port clearance
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException if a issue port clearance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance[] findByRequestCode_PrevAndNext(
		long id, java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException {
		return getPersistence()
				   .findByRequestCode_PrevAndNext(id, requestCode,
			orderByComparator);
	}

	/**
	* Removes all the issue port clearances where requestCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByRequestCode(requestCode);
	}

	/**
	* Returns the number of issue port clearances where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the number of matching issue port clearances
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRequestCode(requestCode);
	}

	/**
	* Caches the issue port clearance in the entity cache if it is enabled.
	*
	* @param issuePortClearance the issue port clearance
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance issuePortClearance) {
		getPersistence().cacheResult(issuePortClearance);
	}

	/**
	* Caches the issue port clearances in the entity cache if it is enabled.
	*
	* @param issuePortClearances the issue port clearances
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance> issuePortClearances) {
		getPersistence().cacheResult(issuePortClearances);
	}

	/**
	* Creates a new issue port clearance with the primary key. Does not add the issue port clearance to the database.
	*
	* @param id the primary key for the new issue port clearance
	* @return the new issue port clearance
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the issue port clearance with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the issue port clearance
	* @return the issue port clearance that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException if a issue port clearance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance issuePortClearance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(issuePortClearance);
	}

	/**
	* Returns the issue port clearance with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException} if it could not be found.
	*
	* @param id the primary key of the issue port clearance
	* @return the issue port clearance
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException if a issue port clearance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssuePortClearanceException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the issue port clearance with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the issue port clearance
	* @return the issue port clearance, or <code>null</code> if a issue port clearance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the issue port clearances.
	*
	* @return the issue port clearances
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the issue port clearances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePortClearanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of issue port clearances
	* @param end the upper bound of the range of issue port clearances (not inclusive)
	* @return the range of issue port clearances
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the issue port clearances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssuePortClearanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of issue port clearances
	* @param end the upper bound of the range of issue port clearances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of issue port clearances
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the issue port clearances from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of issue port clearances.
	*
	* @return the number of issue port clearances
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static IssuePortClearancePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (IssuePortClearancePersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					IssuePortClearancePersistence.class.getName());

			ReferenceRegistry.registerReference(IssuePortClearanceUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(IssuePortClearancePersistence persistence) {
	}

	private static IssuePortClearancePersistence _persistence;
}