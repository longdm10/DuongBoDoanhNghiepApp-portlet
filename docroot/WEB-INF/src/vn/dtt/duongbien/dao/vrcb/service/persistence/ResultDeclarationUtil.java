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

import vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration;

import java.util.List;

/**
 * The persistence utility for the result declaration service. This utility wraps {@link ResultDeclarationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see ResultDeclarationPersistence
 * @see ResultDeclarationPersistenceImpl
 * @generated
 */
public class ResultDeclarationUtil {
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
	public static void clearCache(ResultDeclaration resultDeclaration) {
		getPersistence().clearCache(resultDeclaration);
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
	public static List<ResultDeclaration> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ResultDeclaration> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ResultDeclaration> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ResultDeclaration update(ResultDeclaration resultDeclaration)
		throws SystemException {
		return getPersistence().update(resultDeclaration);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ResultDeclaration update(
		ResultDeclaration resultDeclaration, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(resultDeclaration, serviceContext);
	}

	/**
	* Returns the result declaration where requestCode = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException} if it could not be found.
	*
	* @param requestCode the request code
	* @return the matching result declaration
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException {
		return getPersistence().findByRequestCode(requestCode);
	}

	/**
	* Returns the result declaration where requestCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param requestCode the request code
	* @return the matching result declaration, or <code>null</code> if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration fetchByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByRequestCode(requestCode);
	}

	/**
	* Returns the result declaration where requestCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param requestCode the request code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching result declaration, or <code>null</code> if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration fetchByRequestCode(
		java.lang.String requestCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRequestCode(requestCode, retrieveFromCache);
	}

	/**
	* Removes the result declaration where requestCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @return the result declaration that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration removeByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException {
		return getPersistence().removeByRequestCode(requestCode);
	}

	/**
	* Returns the number of result declarations where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the number of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRequestCode(requestCode);
	}

	/**
	* Returns all the result declarations where businessTypeCode = &#63;.
	*
	* @param businessTypeCode the business type code
	* @return the matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration> findByBusinessTypeCode(
		int businessTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByBusinessTypeCode(businessTypeCode);
	}

	/**
	* Returns a range of all the result declarations where businessTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param businessTypeCode the business type code
	* @param start the lower bound of the range of result declarations
	* @param end the upper bound of the range of result declarations (not inclusive)
	* @return the range of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration> findByBusinessTypeCode(
		int businessTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByBusinessTypeCode(businessTypeCode, start, end);
	}

	/**
	* Returns an ordered range of all the result declarations where businessTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param businessTypeCode the business type code
	* @param start the lower bound of the range of result declarations
	* @param end the upper bound of the range of result declarations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration> findByBusinessTypeCode(
		int businessTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByBusinessTypeCode(businessTypeCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first result declaration in the ordered set where businessTypeCode = &#63;.
	*
	* @param businessTypeCode the business type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result declaration
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration findByBusinessTypeCode_First(
		int businessTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException {
		return getPersistence()
				   .findByBusinessTypeCode_First(businessTypeCode,
			orderByComparator);
	}

	/**
	* Returns the first result declaration in the ordered set where businessTypeCode = &#63;.
	*
	* @param businessTypeCode the business type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result declaration, or <code>null</code> if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration fetchByBusinessTypeCode_First(
		int businessTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByBusinessTypeCode_First(businessTypeCode,
			orderByComparator);
	}

	/**
	* Returns the last result declaration in the ordered set where businessTypeCode = &#63;.
	*
	* @param businessTypeCode the business type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result declaration
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration findByBusinessTypeCode_Last(
		int businessTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException {
		return getPersistence()
				   .findByBusinessTypeCode_Last(businessTypeCode,
			orderByComparator);
	}

	/**
	* Returns the last result declaration in the ordered set where businessTypeCode = &#63;.
	*
	* @param businessTypeCode the business type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result declaration, or <code>null</code> if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration fetchByBusinessTypeCode_Last(
		int businessTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByBusinessTypeCode_Last(businessTypeCode,
			orderByComparator);
	}

	/**
	* Returns the result declarations before and after the current result declaration in the ordered set where businessTypeCode = &#63;.
	*
	* @param id the primary key of the current result declaration
	* @param businessTypeCode the business type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result declaration
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException if a result declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration[] findByBusinessTypeCode_PrevAndNext(
		long id, int businessTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException {
		return getPersistence()
				   .findByBusinessTypeCode_PrevAndNext(id, businessTypeCode,
			orderByComparator);
	}

	/**
	* Removes all the result declarations where businessTypeCode = &#63; from the database.
	*
	* @param businessTypeCode the business type code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByBusinessTypeCode(int businessTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByBusinessTypeCode(businessTypeCode);
	}

	/**
	* Returns the number of result declarations where businessTypeCode = &#63;.
	*
	* @param businessTypeCode the business type code
	* @return the number of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByBusinessTypeCode(int businessTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByBusinessTypeCode(businessTypeCode);
	}

	/**
	* Returns all the result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration> findByDocumentNameAndBusinessTypeCodeAndDocumentYear(
		int businessTypeCode, long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAndBusinessTypeCodeAndDocumentYear(businessTypeCode,
			documentName, documentYear);
	}

	/**
	* Returns a range of all the result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of result declarations
	* @param end the upper bound of the range of result declarations (not inclusive)
	* @return the range of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration> findByDocumentNameAndBusinessTypeCodeAndDocumentYear(
		int businessTypeCode, long documentName, int documentYear, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAndBusinessTypeCodeAndDocumentYear(businessTypeCode,
			documentName, documentYear, start, end);
	}

	/**
	* Returns an ordered range of all the result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of result declarations
	* @param end the upper bound of the range of result declarations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration> findByDocumentNameAndBusinessTypeCodeAndDocumentYear(
		int businessTypeCode, long documentName, int documentYear, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAndBusinessTypeCodeAndDocumentYear(businessTypeCode,
			documentName, documentYear, start, end, orderByComparator);
	}

	/**
	* Returns the first result declaration in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result declaration
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration findByDocumentNameAndBusinessTypeCodeAndDocumentYear_First(
		int businessTypeCode, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException {
		return getPersistence()
				   .findByDocumentNameAndBusinessTypeCodeAndDocumentYear_First(businessTypeCode,
			documentName, documentYear, orderByComparator);
	}

	/**
	* Returns the first result declaration in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result declaration, or <code>null</code> if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration fetchByDocumentNameAndBusinessTypeCodeAndDocumentYear_First(
		int businessTypeCode, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDocumentNameAndBusinessTypeCodeAndDocumentYear_First(businessTypeCode,
			documentName, documentYear, orderByComparator);
	}

	/**
	* Returns the last result declaration in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result declaration
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration findByDocumentNameAndBusinessTypeCodeAndDocumentYear_Last(
		int businessTypeCode, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException {
		return getPersistence()
				   .findByDocumentNameAndBusinessTypeCodeAndDocumentYear_Last(businessTypeCode,
			documentName, documentYear, orderByComparator);
	}

	/**
	* Returns the last result declaration in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result declaration, or <code>null</code> if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration fetchByDocumentNameAndBusinessTypeCodeAndDocumentYear_Last(
		int businessTypeCode, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDocumentNameAndBusinessTypeCodeAndDocumentYear_Last(businessTypeCode,
			documentName, documentYear, orderByComparator);
	}

	/**
	* Returns the result declarations before and after the current result declaration in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	*
	* @param id the primary key of the current result declaration
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result declaration
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException if a result declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration[] findByDocumentNameAndBusinessTypeCodeAndDocumentYear_PrevAndNext(
		long id, int businessTypeCode, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException {
		return getPersistence()
				   .findByDocumentNameAndBusinessTypeCodeAndDocumentYear_PrevAndNext(id,
			businessTypeCode, documentName, documentYear, orderByComparator);
	}

	/**
	* Removes all the result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDocumentNameAndBusinessTypeCodeAndDocumentYear(
		int businessTypeCode, long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDocumentNameAndBusinessTypeCodeAndDocumentYear(businessTypeCode,
			documentName, documentYear);
	}

	/**
	* Returns the number of result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDocumentNameAndBusinessTypeCodeAndDocumentYear(
		int businessTypeCode, long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDocumentNameAndBusinessTypeCodeAndDocumentYear(businessTypeCode,
			documentName, documentYear);
	}

	/**
	* Returns all the result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @return the matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration> findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(businessTypeCode,
			documentName, documentYear, requestCode);
	}

	/**
	* Returns a range of all the result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @param start the lower bound of the range of result declarations
	* @param end the upper bound of the range of result declarations (not inclusive)
	* @return the range of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration> findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(businessTypeCode,
			documentName, documentYear, requestCode, start, end);
	}

	/**
	* Returns an ordered range of all the result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @param start the lower bound of the range of result declarations
	* @param end the upper bound of the range of result declarations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration> findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(businessTypeCode,
			documentName, documentYear, requestCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first result declaration in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result declaration
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode_First(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException {
		return getPersistence()
				   .findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode_First(businessTypeCode,
			documentName, documentYear, requestCode, orderByComparator);
	}

	/**
	* Returns the first result declaration in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result declaration, or <code>null</code> if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration fetchByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode_First(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode_First(businessTypeCode,
			documentName, documentYear, requestCode, orderByComparator);
	}

	/**
	* Returns the last result declaration in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result declaration
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode_Last(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException {
		return getPersistence()
				   .findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode_Last(businessTypeCode,
			documentName, documentYear, requestCode, orderByComparator);
	}

	/**
	* Returns the last result declaration in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result declaration, or <code>null</code> if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration fetchByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode_Last(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode_Last(businessTypeCode,
			documentName, documentYear, requestCode, orderByComparator);
	}

	/**
	* Returns the result declarations before and after the current result declaration in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	*
	* @param id the primary key of the current result declaration
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result declaration
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException if a result declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration[] findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode_PrevAndNext(
		long id, int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException {
		return getPersistence()
				   .findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode_PrevAndNext(id,
			businessTypeCode, documentName, documentYear, requestCode,
			orderByComparator);
	}

	/**
	* Removes all the result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63; from the database.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(businessTypeCode,
			documentName, documentYear, requestCode);
	}

	/**
	* Returns the number of result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @return the number of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(businessTypeCode,
			documentName, documentYear, requestCode);
	}

	/**
	* Returns the result declaration where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException} if it could not be found.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @return the matching result declaration
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration findByfndDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException {
		return getPersistence()
				   .findByfndDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(businessTypeCode,
			documentName, documentYear, requestCode);
	}

	/**
	* Returns the result declaration where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @return the matching result declaration, or <code>null</code> if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration fetchByfndDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfndDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(businessTypeCode,
			documentName, documentYear, requestCode);
	}

	/**
	* Returns the result declaration where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching result declaration, or <code>null</code> if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration fetchByfndDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfndDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(businessTypeCode,
			documentName, documentYear, requestCode, retrieveFromCache);
	}

	/**
	* Removes the result declaration where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63; from the database.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @return the result declaration that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration removeByfndDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException {
		return getPersistence()
				   .removeByfndDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(businessTypeCode,
			documentName, documentYear, requestCode);
	}

	/**
	* Returns the number of result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @return the number of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfndDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByfndDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(businessTypeCode,
			documentName, documentYear, requestCode);
	}

	/**
	* Returns all the result declarations where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAndDocumentYear(documentName, documentYear);
	}

	/**
	* Returns a range of all the result declarations where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of result declarations
	* @param end the upper bound of the range of result declarations (not inclusive)
	* @return the range of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAndDocumentYear(documentName,
			documentYear, start, end);
	}

	/**
	* Returns an ordered range of all the result declarations where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of result declarations
	* @param end the upper bound of the range of result declarations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAndDocumentYear(documentName,
			documentYear, start, end, orderByComparator);
	}

	/**
	* Returns the first result declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result declaration
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration findByDocumentNameAndDocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException {
		return getPersistence()
				   .findByDocumentNameAndDocumentYear_First(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the first result declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result declaration, or <code>null</code> if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration fetchByDocumentNameAndDocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDocumentNameAndDocumentYear_First(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the last result declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result declaration
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration findByDocumentNameAndDocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException {
		return getPersistence()
				   .findByDocumentNameAndDocumentYear_Last(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the last result declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result declaration, or <code>null</code> if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration fetchByDocumentNameAndDocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDocumentNameAndDocumentYear_Last(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the result declarations before and after the current result declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param id the primary key of the current result declaration
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result declaration
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException if a result declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration[] findByDocumentNameAndDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException {
		return getPersistence()
				   .findByDocumentNameAndDocumentYear_PrevAndNext(id,
			documentName, documentYear, orderByComparator);
	}

	/**
	* Removes all the result declarations where documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDocumentNameAndDocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDocumentNameAndDocumentYear(documentName, documentYear);
	}

	/**
	* Returns the number of result declarations where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDocumentNameAndDocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	/**
	* Returns all the result declarations where requestCode = &#63; and businessTypeCode = &#63;.
	*
	* @param requestCode the request code
	* @param businessTypeCode the business type code
	* @return the matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration> findByRequestCodeAndBusinessTypeCode(
		java.lang.String requestCode, int businessTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRequestCodeAndBusinessTypeCode(requestCode,
			businessTypeCode);
	}

	/**
	* Returns a range of all the result declarations where requestCode = &#63; and businessTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param requestCode the request code
	* @param businessTypeCode the business type code
	* @param start the lower bound of the range of result declarations
	* @param end the upper bound of the range of result declarations (not inclusive)
	* @return the range of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration> findByRequestCodeAndBusinessTypeCode(
		java.lang.String requestCode, int businessTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRequestCodeAndBusinessTypeCode(requestCode,
			businessTypeCode, start, end);
	}

	/**
	* Returns an ordered range of all the result declarations where requestCode = &#63; and businessTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param requestCode the request code
	* @param businessTypeCode the business type code
	* @param start the lower bound of the range of result declarations
	* @param end the upper bound of the range of result declarations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration> findByRequestCodeAndBusinessTypeCode(
		java.lang.String requestCode, int businessTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRequestCodeAndBusinessTypeCode(requestCode,
			businessTypeCode, start, end, orderByComparator);
	}

	/**
	* Returns the first result declaration in the ordered set where requestCode = &#63; and businessTypeCode = &#63;.
	*
	* @param requestCode the request code
	* @param businessTypeCode the business type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result declaration
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration findByRequestCodeAndBusinessTypeCode_First(
		java.lang.String requestCode, int businessTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException {
		return getPersistence()
				   .findByRequestCodeAndBusinessTypeCode_First(requestCode,
			businessTypeCode, orderByComparator);
	}

	/**
	* Returns the first result declaration in the ordered set where requestCode = &#63; and businessTypeCode = &#63;.
	*
	* @param requestCode the request code
	* @param businessTypeCode the business type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result declaration, or <code>null</code> if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration fetchByRequestCodeAndBusinessTypeCode_First(
		java.lang.String requestCode, int businessTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRequestCodeAndBusinessTypeCode_First(requestCode,
			businessTypeCode, orderByComparator);
	}

	/**
	* Returns the last result declaration in the ordered set where requestCode = &#63; and businessTypeCode = &#63;.
	*
	* @param requestCode the request code
	* @param businessTypeCode the business type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result declaration
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration findByRequestCodeAndBusinessTypeCode_Last(
		java.lang.String requestCode, int businessTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException {
		return getPersistence()
				   .findByRequestCodeAndBusinessTypeCode_Last(requestCode,
			businessTypeCode, orderByComparator);
	}

	/**
	* Returns the last result declaration in the ordered set where requestCode = &#63; and businessTypeCode = &#63;.
	*
	* @param requestCode the request code
	* @param businessTypeCode the business type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result declaration, or <code>null</code> if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration fetchByRequestCodeAndBusinessTypeCode_Last(
		java.lang.String requestCode, int businessTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRequestCodeAndBusinessTypeCode_Last(requestCode,
			businessTypeCode, orderByComparator);
	}

	/**
	* Returns the result declarations before and after the current result declaration in the ordered set where requestCode = &#63; and businessTypeCode = &#63;.
	*
	* @param id the primary key of the current result declaration
	* @param requestCode the request code
	* @param businessTypeCode the business type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result declaration
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException if a result declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration[] findByRequestCodeAndBusinessTypeCode_PrevAndNext(
		long id, java.lang.String requestCode, int businessTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException {
		return getPersistence()
				   .findByRequestCodeAndBusinessTypeCode_PrevAndNext(id,
			requestCode, businessTypeCode, orderByComparator);
	}

	/**
	* Removes all the result declarations where requestCode = &#63; and businessTypeCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @param businessTypeCode the business type code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRequestCodeAndBusinessTypeCode(
		java.lang.String requestCode, int businessTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByRequestCodeAndBusinessTypeCode(requestCode,
			businessTypeCode);
	}

	/**
	* Returns the number of result declarations where requestCode = &#63; and businessTypeCode = &#63;.
	*
	* @param requestCode the request code
	* @param businessTypeCode the business type code
	* @return the number of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRequestCodeAndBusinessTypeCode(
		java.lang.String requestCode, int businessTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByRequestCodeAndBusinessTypeCode(requestCode,
			businessTypeCode);
	}

	/**
	* Caches the result declaration in the entity cache if it is enabled.
	*
	* @param resultDeclaration the result declaration
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration resultDeclaration) {
		getPersistence().cacheResult(resultDeclaration);
	}

	/**
	* Caches the result declarations in the entity cache if it is enabled.
	*
	* @param resultDeclarations the result declarations
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration> resultDeclarations) {
		getPersistence().cacheResult(resultDeclarations);
	}

	/**
	* Creates a new result declaration with the primary key. Does not add the result declaration to the database.
	*
	* @param id the primary key for the new result declaration
	* @return the new result declaration
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the result declaration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the result declaration
	* @return the result declaration that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException if a result declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration resultDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(resultDeclaration);
	}

	/**
	* Returns the result declaration with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException} if it could not be found.
	*
	* @param id the primary key of the result declaration
	* @return the result declaration
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException if a result declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultDeclarationException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the result declaration with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the result declaration
	* @return the result declaration, or <code>null</code> if a result declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the result declarations.
	*
	* @return the result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the result declarations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of result declarations
	* @param end the upper bound of the range of result declarations (not inclusive)
	* @return the range of result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the result declarations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of result declarations
	* @param end the upper bound of the range of result declarations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the result declarations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of result declarations.
	*
	* @return the number of result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ResultDeclarationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ResultDeclarationPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					ResultDeclarationPersistence.class.getName());

			ReferenceRegistry.registerReference(ResultDeclarationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ResultDeclarationPersistence persistence) {
	}

	private static ResultDeclarationPersistence _persistence;
}