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

import vn.dtt.duongbien.dao.vrcb.model.TempDocument;

import java.util.List;

/**
 * The persistence utility for the temp document service. This utility wraps {@link TempDocumentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempDocumentPersistence
 * @see TempDocumentPersistenceImpl
 * @generated
 */
public class TempDocumentUtil {
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
	public static void clearCache(TempDocument tempDocument) {
		getPersistence().clearCache(tempDocument);
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
	public static List<TempDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TempDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TempDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TempDocument update(TempDocument tempDocument)
		throws SystemException {
		return getPersistence().update(tempDocument);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TempDocument update(TempDocument tempDocument,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tempDocument, serviceContext);
	}

	/**
	* Returns all the temp documents where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDocument> findByTemDocumentByDocumentNameAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTemDocumentByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	/**
	* Returns a range of all the temp documents where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of temp documents
	* @param end the upper bound of the range of temp documents (not inclusive)
	* @return the range of matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDocument> findByTemDocumentByDocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTemDocumentByDocumentNameAndDocumentYear(documentName,
			documentYear, start, end);
	}

	/**
	* Returns an ordered range of all the temp documents where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of temp documents
	* @param end the upper bound of the range of temp documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDocument> findByTemDocumentByDocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTemDocumentByDocumentNameAndDocumentYear(documentName,
			documentYear, start, end, orderByComparator);
	}

	/**
	* Returns the first temp document in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp document
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException if a matching temp document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempDocument findByTemDocumentByDocumentNameAndDocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException {
		return getPersistence()
				   .findByTemDocumentByDocumentNameAndDocumentYear_First(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the first temp document in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp document, or <code>null</code> if a matching temp document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempDocument fetchByTemDocumentByDocumentNameAndDocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTemDocumentByDocumentNameAndDocumentYear_First(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the last temp document in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp document
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException if a matching temp document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempDocument findByTemDocumentByDocumentNameAndDocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException {
		return getPersistence()
				   .findByTemDocumentByDocumentNameAndDocumentYear_Last(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the last temp document in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp document, or <code>null</code> if a matching temp document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempDocument fetchByTemDocumentByDocumentNameAndDocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTemDocumentByDocumentNameAndDocumentYear_Last(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the temp documents before and after the current temp document in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param id the primary key of the current temp document
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp document
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException if a temp document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempDocument[] findByTemDocumentByDocumentNameAndDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException {
		return getPersistence()
				   .findByTemDocumentByDocumentNameAndDocumentYear_PrevAndNext(id,
			documentName, documentYear, orderByComparator);
	}

	/**
	* Removes all the temp documents where documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTemDocumentByDocumentNameAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByTemDocumentByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	/**
	* Returns the number of temp documents where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTemDocumentByDocumentNameAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByTemDocumentByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	/**
	* Returns all the temp documents where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @return the matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDocument> findByTemDocumentByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTemDocumentByDocumentNameAndDocumentYearRequestState(documentName,
			documentYear, requestState);
	}

	/**
	* Returns a range of all the temp documents where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param start the lower bound of the range of temp documents
	* @param end the upper bound of the range of temp documents (not inclusive)
	* @return the range of matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDocument> findByTemDocumentByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTemDocumentByDocumentNameAndDocumentYearRequestState(documentName,
			documentYear, requestState, start, end);
	}

	/**
	* Returns an ordered range of all the temp documents where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param start the lower bound of the range of temp documents
	* @param end the upper bound of the range of temp documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDocument> findByTemDocumentByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTemDocumentByDocumentNameAndDocumentYearRequestState(documentName,
			documentYear, requestState, start, end, orderByComparator);
	}

	/**
	* Returns the first temp document in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp document
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException if a matching temp document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempDocument findByTemDocumentByDocumentNameAndDocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException {
		return getPersistence()
				   .findByTemDocumentByDocumentNameAndDocumentYearRequestState_First(documentName,
			documentYear, requestState, orderByComparator);
	}

	/**
	* Returns the first temp document in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp document, or <code>null</code> if a matching temp document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempDocument fetchByTemDocumentByDocumentNameAndDocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTemDocumentByDocumentNameAndDocumentYearRequestState_First(documentName,
			documentYear, requestState, orderByComparator);
	}

	/**
	* Returns the last temp document in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp document
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException if a matching temp document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempDocument findByTemDocumentByDocumentNameAndDocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException {
		return getPersistence()
				   .findByTemDocumentByDocumentNameAndDocumentYearRequestState_Last(documentName,
			documentYear, requestState, orderByComparator);
	}

	/**
	* Returns the last temp document in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp document, or <code>null</code> if a matching temp document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempDocument fetchByTemDocumentByDocumentNameAndDocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTemDocumentByDocumentNameAndDocumentYearRequestState_Last(documentName,
			documentYear, requestState, orderByComparator);
	}

	/**
	* Returns the temp documents before and after the current temp document in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param id the primary key of the current temp document
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp document
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException if a temp document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempDocument[] findByTemDocumentByDocumentNameAndDocumentYearRequestState_PrevAndNext(
		long id, long documentName, int documentYear, int requestState,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException {
		return getPersistence()
				   .findByTemDocumentByDocumentNameAndDocumentYearRequestState_PrevAndNext(id,
			documentName, documentYear, requestState, orderByComparator);
	}

	/**
	* Removes all the temp documents where documentName = &#63; and documentYear = &#63; and requestState = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTemDocumentByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByTemDocumentByDocumentNameAndDocumentYearRequestState(documentName,
			documentYear, requestState);
	}

	/**
	* Returns the number of temp documents where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @return the number of matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTemDocumentByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByTemDocumentByDocumentNameAndDocumentYearRequestState(documentName,
			documentYear, requestState);
	}

	/**
	* Returns all the temp documents where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDocument> findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRequestCode(requestCode);
	}

	/**
	* Returns a range of all the temp documents where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param requestCode the request code
	* @param start the lower bound of the range of temp documents
	* @param end the upper bound of the range of temp documents (not inclusive)
	* @return the range of matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDocument> findByRequestCode(
		java.lang.String requestCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRequestCode(requestCode, start, end);
	}

	/**
	* Returns an ordered range of all the temp documents where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param requestCode the request code
	* @param start the lower bound of the range of temp documents
	* @param end the upper bound of the range of temp documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDocument> findByRequestCode(
		java.lang.String requestCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRequestCode(requestCode, start, end, orderByComparator);
	}

	/**
	* Returns the first temp document in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp document
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException if a matching temp document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempDocument findByRequestCode_First(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException {
		return getPersistence()
				   .findByRequestCode_First(requestCode, orderByComparator);
	}

	/**
	* Returns the first temp document in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp document, or <code>null</code> if a matching temp document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempDocument fetchByRequestCode_First(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRequestCode_First(requestCode, orderByComparator);
	}

	/**
	* Returns the last temp document in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp document
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException if a matching temp document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempDocument findByRequestCode_Last(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException {
		return getPersistence()
				   .findByRequestCode_Last(requestCode, orderByComparator);
	}

	/**
	* Returns the last temp document in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp document, or <code>null</code> if a matching temp document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempDocument fetchByRequestCode_Last(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRequestCode_Last(requestCode, orderByComparator);
	}

	/**
	* Returns the temp documents before and after the current temp document in the ordered set where requestCode = &#63;.
	*
	* @param id the primary key of the current temp document
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp document
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException if a temp document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempDocument[] findByRequestCode_PrevAndNext(
		long id, java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException {
		return getPersistence()
				   .findByRequestCode_PrevAndNext(id, requestCode,
			orderByComparator);
	}

	/**
	* Removes all the temp documents where requestCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByRequestCode(requestCode);
	}

	/**
	* Returns the number of temp documents where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the number of matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRequestCode(requestCode);
	}

	/**
	* Caches the temp document in the entity cache if it is enabled.
	*
	* @param tempDocument the temp document
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.TempDocument tempDocument) {
		getPersistence().cacheResult(tempDocument);
	}

	/**
	* Caches the temp documents in the entity cache if it is enabled.
	*
	* @param tempDocuments the temp documents
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDocument> tempDocuments) {
		getPersistence().cacheResult(tempDocuments);
	}

	/**
	* Creates a new temp document with the primary key. Does not add the temp document to the database.
	*
	* @param id the primary key for the new temp document
	* @return the new temp document
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempDocument create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the temp document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp document
	* @return the temp document that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException if a temp document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempDocument remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.TempDocument updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempDocument tempDocument)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tempDocument);
	}

	/**
	* Returns the temp document with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException} if it could not be found.
	*
	* @param id the primary key of the temp document
	* @return the temp document
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException if a temp document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempDocument findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempDocumentException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the temp document with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the temp document
	* @return the temp document, or <code>null</code> if a temp document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempDocument fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the temp documents.
	*
	* @return the temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDocument> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the temp documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temp documents
	* @param end the upper bound of the range of temp documents (not inclusive)
	* @return the range of temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDocument> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the temp documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temp documents
	* @param end the upper bound of the range of temp documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDocument> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the temp documents from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of temp documents.
	*
	* @return the number of temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TempDocumentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TempDocumentPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					TempDocumentPersistence.class.getName());

			ReferenceRegistry.registerReference(TempDocumentUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TempDocumentPersistence persistence) {
	}

	private static TempDocumentPersistence _persistence;
}