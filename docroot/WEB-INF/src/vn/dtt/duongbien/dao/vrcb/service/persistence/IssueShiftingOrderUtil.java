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

import vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder;

import java.util.List;

/**
 * The persistence utility for the issue shifting order service. This utility wraps {@link IssueShiftingOrderPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see IssueShiftingOrderPersistence
 * @see IssueShiftingOrderPersistenceImpl
 * @generated
 */
public class IssueShiftingOrderUtil {
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
	public static void clearCache(IssueShiftingOrder issueShiftingOrder) {
		getPersistence().clearCache(issueShiftingOrder);
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
	public static List<IssueShiftingOrder> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<IssueShiftingOrder> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<IssueShiftingOrder> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static IssueShiftingOrder update(
		IssueShiftingOrder issueShiftingOrder) throws SystemException {
		return getPersistence().update(issueShiftingOrder);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static IssueShiftingOrder update(
		IssueShiftingOrder issueShiftingOrder, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(issueShiftingOrder, serviceContext);
	}

	/**
	* Returns all the issue shifting orders where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching issue shifting orders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder> findByfindIssueShiftingOrderByDocumentYearAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfindIssueShiftingOrderByDocumentYearAndDocumentYear(documentName,
			documentYear);
	}

	/**
	* Returns a range of all the issue shifting orders where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueShiftingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of issue shifting orders
	* @param end the upper bound of the range of issue shifting orders (not inclusive)
	* @return the range of matching issue shifting orders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder> findByfindIssueShiftingOrderByDocumentYearAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfindIssueShiftingOrderByDocumentYearAndDocumentYear(documentName,
			documentYear, start, end);
	}

	/**
	* Returns an ordered range of all the issue shifting orders where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueShiftingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of issue shifting orders
	* @param end the upper bound of the range of issue shifting orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching issue shifting orders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder> findByfindIssueShiftingOrderByDocumentYearAndDocumentYear(
		long documentName, int documentYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfindIssueShiftingOrderByDocumentYearAndDocumentYear(documentName,
			documentYear, start, end, orderByComparator);
	}

	/**
	* Returns the first issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue shifting order
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a matching issue shifting order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder findByfindIssueShiftingOrderByDocumentYearAndDocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException {
		return getPersistence()
				   .findByfindIssueShiftingOrderByDocumentYearAndDocumentYear_First(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the first issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue shifting order, or <code>null</code> if a matching issue shifting order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder fetchByfindIssueShiftingOrderByDocumentYearAndDocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfindIssueShiftingOrderByDocumentYearAndDocumentYear_First(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the last issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue shifting order
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a matching issue shifting order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder findByfindIssueShiftingOrderByDocumentYearAndDocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException {
		return getPersistence()
				   .findByfindIssueShiftingOrderByDocumentYearAndDocumentYear_Last(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the last issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue shifting order, or <code>null</code> if a matching issue shifting order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder fetchByfindIssueShiftingOrderByDocumentYearAndDocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfindIssueShiftingOrderByDocumentYearAndDocumentYear_Last(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the issue shifting orders before and after the current issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param id the primary key of the current issue shifting order
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next issue shifting order
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a issue shifting order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder[] findByfindIssueShiftingOrderByDocumentYearAndDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException {
		return getPersistence()
				   .findByfindIssueShiftingOrderByDocumentYearAndDocumentYear_PrevAndNext(id,
			documentName, documentYear, orderByComparator);
	}

	/**
	* Removes all the issue shifting orders where documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByfindIssueShiftingOrderByDocumentYearAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByfindIssueShiftingOrderByDocumentYearAndDocumentYear(documentName,
			documentYear);
	}

	/**
	* Returns the number of issue shifting orders where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching issue shifting orders
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfindIssueShiftingOrderByDocumentYearAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByfindIssueShiftingOrderByDocumentYearAndDocumentYear(documentName,
			documentYear);
	}

	/**
	* Returns all the issue shifting orders where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @return the matching issue shifting orders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder> findByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState);
	}

	/**
	* Returns a range of all the issue shifting orders where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueShiftingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param start the lower bound of the range of issue shifting orders
	* @param end the upper bound of the range of issue shifting orders (not inclusive)
	* @return the range of matching issue shifting orders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder> findByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState, start, end);
	}

	/**
	* Returns an ordered range of all the issue shifting orders where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueShiftingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param start the lower bound of the range of issue shifting orders
	* @param end the upper bound of the range of issue shifting orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching issue shifting orders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder> findByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState, start, end, orderByComparator);
	}

	/**
	* Returns the first issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue shifting order
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a matching issue shifting order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder findByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState_First(
		long documentName, int documentYear, int requestState,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException {
		return getPersistence()
				   .findByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState_First(documentName,
			documentYear, requestState, orderByComparator);
	}

	/**
	* Returns the first issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue shifting order, or <code>null</code> if a matching issue shifting order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder fetchByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState_First(
		long documentName, int documentYear, int requestState,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState_First(documentName,
			documentYear, requestState, orderByComparator);
	}

	/**
	* Returns the last issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue shifting order
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a matching issue shifting order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder findByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState_Last(
		long documentName, int documentYear, int requestState,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException {
		return getPersistence()
				   .findByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState_Last(documentName,
			documentYear, requestState, orderByComparator);
	}

	/**
	* Returns the last issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue shifting order, or <code>null</code> if a matching issue shifting order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder fetchByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState_Last(
		long documentName, int documentYear, int requestState,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState_Last(documentName,
			documentYear, requestState, orderByComparator);
	}

	/**
	* Returns the issue shifting orders before and after the current issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param id the primary key of the current issue shifting order
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next issue shifting order
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a issue shifting order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder[] findByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState_PrevAndNext(
		long id, long documentName, int documentYear, int requestState,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException {
		return getPersistence()
				   .findByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState_PrevAndNext(id,
			documentName, documentYear, requestState, orderByComparator);
	}

	/**
	* Removes all the issue shifting orders where documentName = &#63; and documentYear = &#63; and requestState = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState);
	}

	/**
	* Returns the number of issue shifting orders where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @return the number of matching issue shifting orders
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByfindIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState);
	}

	/**
	* Returns all the issue shifting orders where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the matching issue shifting orders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder> findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRequestCode(requestCode);
	}

	/**
	* Returns a range of all the issue shifting orders where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueShiftingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param requestCode the request code
	* @param start the lower bound of the range of issue shifting orders
	* @param end the upper bound of the range of issue shifting orders (not inclusive)
	* @return the range of matching issue shifting orders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder> findByRequestCode(
		java.lang.String requestCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRequestCode(requestCode, start, end);
	}

	/**
	* Returns an ordered range of all the issue shifting orders where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueShiftingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param requestCode the request code
	* @param start the lower bound of the range of issue shifting orders
	* @param end the upper bound of the range of issue shifting orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching issue shifting orders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder> findByRequestCode(
		java.lang.String requestCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRequestCode(requestCode, start, end, orderByComparator);
	}

	/**
	* Returns the first issue shifting order in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue shifting order
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a matching issue shifting order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder findByRequestCode_First(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException {
		return getPersistence()
				   .findByRequestCode_First(requestCode, orderByComparator);
	}

	/**
	* Returns the first issue shifting order in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue shifting order, or <code>null</code> if a matching issue shifting order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder fetchByRequestCode_First(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRequestCode_First(requestCode, orderByComparator);
	}

	/**
	* Returns the last issue shifting order in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue shifting order
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a matching issue shifting order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder findByRequestCode_Last(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException {
		return getPersistence()
				   .findByRequestCode_Last(requestCode, orderByComparator);
	}

	/**
	* Returns the last issue shifting order in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue shifting order, or <code>null</code> if a matching issue shifting order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder fetchByRequestCode_Last(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRequestCode_Last(requestCode, orderByComparator);
	}

	/**
	* Returns the issue shifting orders before and after the current issue shifting order in the ordered set where requestCode = &#63;.
	*
	* @param id the primary key of the current issue shifting order
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next issue shifting order
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a issue shifting order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder[] findByRequestCode_PrevAndNext(
		long id, java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException {
		return getPersistence()
				   .findByRequestCode_PrevAndNext(id, requestCode,
			orderByComparator);
	}

	/**
	* Removes all the issue shifting orders where requestCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByRequestCode(requestCode);
	}

	/**
	* Returns the number of issue shifting orders where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the number of matching issue shifting orders
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRequestCode(requestCode);
	}

	/**
	* Returns all the issue shifting orders where documentName = &#63; and documentYear = &#63; and versionNo = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param versionNo the version no
	* @return the matching issue shifting orders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder> findByDocumentNameAndDocumentYearAndVersionNo(
		long documentName, int documentYear, java.lang.String versionNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAndDocumentYearAndVersionNo(documentName,
			documentYear, versionNo);
	}

	/**
	* Returns a range of all the issue shifting orders where documentName = &#63; and documentYear = &#63; and versionNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueShiftingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param versionNo the version no
	* @param start the lower bound of the range of issue shifting orders
	* @param end the upper bound of the range of issue shifting orders (not inclusive)
	* @return the range of matching issue shifting orders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder> findByDocumentNameAndDocumentYearAndVersionNo(
		long documentName, int documentYear, java.lang.String versionNo,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAndDocumentYearAndVersionNo(documentName,
			documentYear, versionNo, start, end);
	}

	/**
	* Returns an ordered range of all the issue shifting orders where documentName = &#63; and documentYear = &#63; and versionNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueShiftingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param versionNo the version no
	* @param start the lower bound of the range of issue shifting orders
	* @param end the upper bound of the range of issue shifting orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching issue shifting orders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder> findByDocumentNameAndDocumentYearAndVersionNo(
		long documentName, int documentYear, java.lang.String versionNo,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAndDocumentYearAndVersionNo(documentName,
			documentYear, versionNo, start, end, orderByComparator);
	}

	/**
	* Returns the first issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63; and versionNo = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param versionNo the version no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue shifting order
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a matching issue shifting order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder findByDocumentNameAndDocumentYearAndVersionNo_First(
		long documentName, int documentYear, java.lang.String versionNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException {
		return getPersistence()
				   .findByDocumentNameAndDocumentYearAndVersionNo_First(documentName,
			documentYear, versionNo, orderByComparator);
	}

	/**
	* Returns the first issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63; and versionNo = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param versionNo the version no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue shifting order, or <code>null</code> if a matching issue shifting order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder fetchByDocumentNameAndDocumentYearAndVersionNo_First(
		long documentName, int documentYear, java.lang.String versionNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDocumentNameAndDocumentYearAndVersionNo_First(documentName,
			documentYear, versionNo, orderByComparator);
	}

	/**
	* Returns the last issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63; and versionNo = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param versionNo the version no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue shifting order
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a matching issue shifting order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder findByDocumentNameAndDocumentYearAndVersionNo_Last(
		long documentName, int documentYear, java.lang.String versionNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException {
		return getPersistence()
				   .findByDocumentNameAndDocumentYearAndVersionNo_Last(documentName,
			documentYear, versionNo, orderByComparator);
	}

	/**
	* Returns the last issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63; and versionNo = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param versionNo the version no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue shifting order, or <code>null</code> if a matching issue shifting order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder fetchByDocumentNameAndDocumentYearAndVersionNo_Last(
		long documentName, int documentYear, java.lang.String versionNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDocumentNameAndDocumentYearAndVersionNo_Last(documentName,
			documentYear, versionNo, orderByComparator);
	}

	/**
	* Returns the issue shifting orders before and after the current issue shifting order in the ordered set where documentName = &#63; and documentYear = &#63; and versionNo = &#63;.
	*
	* @param id the primary key of the current issue shifting order
	* @param documentName the document name
	* @param documentYear the document year
	* @param versionNo the version no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next issue shifting order
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a issue shifting order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder[] findByDocumentNameAndDocumentYearAndVersionNo_PrevAndNext(
		long id, long documentName, int documentYear,
		java.lang.String versionNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException {
		return getPersistence()
				   .findByDocumentNameAndDocumentYearAndVersionNo_PrevAndNext(id,
			documentName, documentYear, versionNo, orderByComparator);
	}

	/**
	* Removes all the issue shifting orders where documentName = &#63; and documentYear = &#63; and versionNo = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param versionNo the version no
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDocumentNameAndDocumentYearAndVersionNo(
		long documentName, int documentYear, java.lang.String versionNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDocumentNameAndDocumentYearAndVersionNo(documentName,
			documentYear, versionNo);
	}

	/**
	* Returns the number of issue shifting orders where documentName = &#63; and documentYear = &#63; and versionNo = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param versionNo the version no
	* @return the number of matching issue shifting orders
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
	* Caches the issue shifting order in the entity cache if it is enabled.
	*
	* @param issueShiftingOrder the issue shifting order
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder issueShiftingOrder) {
		getPersistence().cacheResult(issueShiftingOrder);
	}

	/**
	* Caches the issue shifting orders in the entity cache if it is enabled.
	*
	* @param issueShiftingOrders the issue shifting orders
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder> issueShiftingOrders) {
		getPersistence().cacheResult(issueShiftingOrders);
	}

	/**
	* Creates a new issue shifting order with the primary key. Does not add the issue shifting order to the database.
	*
	* @param id the primary key for the new issue shifting order
	* @return the new issue shifting order
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the issue shifting order with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the issue shifting order
	* @return the issue shifting order that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a issue shifting order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder issueShiftingOrder)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(issueShiftingOrder);
	}

	/**
	* Returns the issue shifting order with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException} if it could not be found.
	*
	* @param id the primary key of the issue shifting order
	* @return the issue shifting order
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException if a issue shifting order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssueShiftingOrderException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the issue shifting order with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the issue shifting order
	* @return the issue shifting order, or <code>null</code> if a issue shifting order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the issue shifting orders.
	*
	* @return the issue shifting orders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the issue shifting orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueShiftingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of issue shifting orders
	* @param end the upper bound of the range of issue shifting orders (not inclusive)
	* @return the range of issue shifting orders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the issue shifting orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueShiftingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of issue shifting orders
	* @param end the upper bound of the range of issue shifting orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of issue shifting orders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the issue shifting orders from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of issue shifting orders.
	*
	* @return the number of issue shifting orders
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static IssueShiftingOrderPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (IssueShiftingOrderPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					IssueShiftingOrderPersistence.class.getName());

			ReferenceRegistry.registerReference(IssueShiftingOrderUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(IssueShiftingOrderPersistence persistence) {
	}

	private static IssueShiftingOrderPersistence _persistence;
}