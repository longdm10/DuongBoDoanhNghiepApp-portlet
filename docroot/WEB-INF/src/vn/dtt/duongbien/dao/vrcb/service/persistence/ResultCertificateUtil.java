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

import vn.dtt.duongbien.dao.vrcb.model.ResultCertificate;

import java.util.List;

/**
 * The persistence utility for the result certificate service. This utility wraps {@link ResultCertificatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see ResultCertificatePersistence
 * @see ResultCertificatePersistenceImpl
 * @generated
 */
public class ResultCertificateUtil {
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
	public static void clearCache(ResultCertificate resultCertificate) {
		getPersistence().clearCache(resultCertificate);
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
	public static List<ResultCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ResultCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ResultCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ResultCertificate update(ResultCertificate resultCertificate)
		throws SystemException {
		return getPersistence().update(resultCertificate);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ResultCertificate update(
		ResultCertificate resultCertificate, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(resultCertificate, serviceContext);
	}

	/**
	* Returns all the result certificates where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching result certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultCertificate> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYear(documentName, documentYear);
	}

	/**
	* Returns a range of all the result certificates where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of result certificates
	* @param end the upper bound of the range of result certificates (not inclusive)
	* @return the range of matching result certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultCertificate> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYear(documentName,
			documentYear, start, end);
	}

	/**
	* Returns an ordered range of all the result certificates where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of result certificates
	* @param end the upper bound of the range of result certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultCertificate> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYear(documentName,
			documentYear, start, end, orderByComparator);
	}

	/**
	* Returns the first result certificate in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result certificate
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException if a matching result certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultCertificate findByDocumentNameAnddocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYear_First(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the first result certificate in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result certificate, or <code>null</code> if a matching result certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultCertificate fetchByDocumentNameAnddocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDocumentNameAnddocumentYear_First(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the last result certificate in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result certificate
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException if a matching result certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultCertificate findByDocumentNameAnddocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYear_Last(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the last result certificate in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result certificate, or <code>null</code> if a matching result certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultCertificate fetchByDocumentNameAnddocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDocumentNameAnddocumentYear_Last(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the result certificates before and after the current result certificate in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param id the primary key of the current result certificate
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result certificate
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException if a result certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultCertificate[] findByDocumentNameAnddocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYear_PrevAndNext(id,
			documentName, documentYear, orderByComparator);
	}

	/**
	* Removes all the result certificates where documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDocumentNameAnddocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDocumentNameAnddocumentYear(documentName, documentYear);
	}

	/**
	* Returns the number of result certificates where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching result certificates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDocumentNameAnddocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDocumentNameAnddocumentYear(documentName,
			documentYear);
	}

	/**
	* Returns all the result certificates where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param maritimeCode the maritime code
	* @return the matching result certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultCertificate> findByDocumentNameAnddocumentYearAndMaritimeCode(
		long documentName, int documentYear, java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearAndMaritimeCode(documentName,
			documentYear, maritimeCode);
	}

	/**
	* Returns a range of all the result certificates where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param maritimeCode the maritime code
	* @param start the lower bound of the range of result certificates
	* @param end the upper bound of the range of result certificates (not inclusive)
	* @return the range of matching result certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultCertificate> findByDocumentNameAnddocumentYearAndMaritimeCode(
		long documentName, int documentYear, java.lang.String maritimeCode,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearAndMaritimeCode(documentName,
			documentYear, maritimeCode, start, end);
	}

	/**
	* Returns an ordered range of all the result certificates where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param maritimeCode the maritime code
	* @param start the lower bound of the range of result certificates
	* @param end the upper bound of the range of result certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultCertificate> findByDocumentNameAnddocumentYearAndMaritimeCode(
		long documentName, int documentYear, java.lang.String maritimeCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearAndMaritimeCode(documentName,
			documentYear, maritimeCode, start, end, orderByComparator);
	}

	/**
	* Returns the first result certificate in the ordered set where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param maritimeCode the maritime code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result certificate
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException if a matching result certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultCertificate findByDocumentNameAnddocumentYearAndMaritimeCode_First(
		long documentName, int documentYear, java.lang.String maritimeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearAndMaritimeCode_First(documentName,
			documentYear, maritimeCode, orderByComparator);
	}

	/**
	* Returns the first result certificate in the ordered set where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param maritimeCode the maritime code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result certificate, or <code>null</code> if a matching result certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultCertificate fetchByDocumentNameAnddocumentYearAndMaritimeCode_First(
		long documentName, int documentYear, java.lang.String maritimeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDocumentNameAnddocumentYearAndMaritimeCode_First(documentName,
			documentYear, maritimeCode, orderByComparator);
	}

	/**
	* Returns the last result certificate in the ordered set where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param maritimeCode the maritime code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result certificate
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException if a matching result certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultCertificate findByDocumentNameAnddocumentYearAndMaritimeCode_Last(
		long documentName, int documentYear, java.lang.String maritimeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearAndMaritimeCode_Last(documentName,
			documentYear, maritimeCode, orderByComparator);
	}

	/**
	* Returns the last result certificate in the ordered set where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param maritimeCode the maritime code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result certificate, or <code>null</code> if a matching result certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultCertificate fetchByDocumentNameAnddocumentYearAndMaritimeCode_Last(
		long documentName, int documentYear, java.lang.String maritimeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDocumentNameAnddocumentYearAndMaritimeCode_Last(documentName,
			documentYear, maritimeCode, orderByComparator);
	}

	/**
	* Returns the result certificates before and after the current result certificate in the ordered set where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63;.
	*
	* @param id the primary key of the current result certificate
	* @param documentName the document name
	* @param documentYear the document year
	* @param maritimeCode the maritime code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result certificate
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException if a result certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultCertificate[] findByDocumentNameAnddocumentYearAndMaritimeCode_PrevAndNext(
		long id, long documentName, int documentYear,
		java.lang.String maritimeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearAndMaritimeCode_PrevAndNext(id,
			documentName, documentYear, maritimeCode, orderByComparator);
	}

	/**
	* Removes all the result certificates where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param maritimeCode the maritime code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDocumentNameAnddocumentYearAndMaritimeCode(
		long documentName, int documentYear, java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDocumentNameAnddocumentYearAndMaritimeCode(documentName,
			documentYear, maritimeCode);
	}

	/**
	* Returns the number of result certificates where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param maritimeCode the maritime code
	* @return the number of matching result certificates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDocumentNameAnddocumentYearAndMaritimeCode(
		long documentName, int documentYear, java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDocumentNameAnddocumentYearAndMaritimeCode(documentName,
			documentYear, maritimeCode);
	}

	/**
	* Returns all the result certificates where documentName = &#63; and documentYear = &#63; and certificateCode = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @return the matching result certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultCertificate> findByDocumentNameAnddocumentYearAndCertificateCode(
		long documentName, int documentYear, java.lang.String certificateCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearAndCertificateCode(documentName,
			documentYear, certificateCode);
	}

	/**
	* Returns a range of all the result certificates where documentName = &#63; and documentYear = &#63; and certificateCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @param start the lower bound of the range of result certificates
	* @param end the upper bound of the range of result certificates (not inclusive)
	* @return the range of matching result certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultCertificate> findByDocumentNameAnddocumentYearAndCertificateCode(
		long documentName, int documentYear, java.lang.String certificateCode,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearAndCertificateCode(documentName,
			documentYear, certificateCode, start, end);
	}

	/**
	* Returns an ordered range of all the result certificates where documentName = &#63; and documentYear = &#63; and certificateCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @param start the lower bound of the range of result certificates
	* @param end the upper bound of the range of result certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultCertificate> findByDocumentNameAnddocumentYearAndCertificateCode(
		long documentName, int documentYear, java.lang.String certificateCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearAndCertificateCode(documentName,
			documentYear, certificateCode, start, end, orderByComparator);
	}

	/**
	* Returns the first result certificate in the ordered set where documentName = &#63; and documentYear = &#63; and certificateCode = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result certificate
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException if a matching result certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultCertificate findByDocumentNameAnddocumentYearAndCertificateCode_First(
		long documentName, int documentYear, java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearAndCertificateCode_First(documentName,
			documentYear, certificateCode, orderByComparator);
	}

	/**
	* Returns the first result certificate in the ordered set where documentName = &#63; and documentYear = &#63; and certificateCode = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result certificate, or <code>null</code> if a matching result certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultCertificate fetchByDocumentNameAnddocumentYearAndCertificateCode_First(
		long documentName, int documentYear, java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDocumentNameAnddocumentYearAndCertificateCode_First(documentName,
			documentYear, certificateCode, orderByComparator);
	}

	/**
	* Returns the last result certificate in the ordered set where documentName = &#63; and documentYear = &#63; and certificateCode = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result certificate
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException if a matching result certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultCertificate findByDocumentNameAnddocumentYearAndCertificateCode_Last(
		long documentName, int documentYear, java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearAndCertificateCode_Last(documentName,
			documentYear, certificateCode, orderByComparator);
	}

	/**
	* Returns the last result certificate in the ordered set where documentName = &#63; and documentYear = &#63; and certificateCode = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result certificate, or <code>null</code> if a matching result certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultCertificate fetchByDocumentNameAnddocumentYearAndCertificateCode_Last(
		long documentName, int documentYear, java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDocumentNameAnddocumentYearAndCertificateCode_Last(documentName,
			documentYear, certificateCode, orderByComparator);
	}

	/**
	* Returns the result certificates before and after the current result certificate in the ordered set where documentName = &#63; and documentYear = &#63; and certificateCode = &#63;.
	*
	* @param id the primary key of the current result certificate
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result certificate
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException if a result certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultCertificate[] findByDocumentNameAnddocumentYearAndCertificateCode_PrevAndNext(
		long id, long documentName, int documentYear,
		java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearAndCertificateCode_PrevAndNext(id,
			documentName, documentYear, certificateCode, orderByComparator);
	}

	/**
	* Removes all the result certificates where documentName = &#63; and documentYear = &#63; and certificateCode = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDocumentNameAnddocumentYearAndCertificateCode(
		long documentName, int documentYear, java.lang.String certificateCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDocumentNameAnddocumentYearAndCertificateCode(documentName,
			documentYear, certificateCode);
	}

	/**
	* Returns the number of result certificates where documentName = &#63; and documentYear = &#63; and certificateCode = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @return the number of matching result certificates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDocumentNameAnddocumentYearAndCertificateCode(
		long documentName, int documentYear, java.lang.String certificateCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDocumentNameAnddocumentYearAndCertificateCode(documentName,
			documentYear, certificateCode);
	}

	/**
	* Caches the result certificate in the entity cache if it is enabled.
	*
	* @param resultCertificate the result certificate
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.ResultCertificate resultCertificate) {
		getPersistence().cacheResult(resultCertificate);
	}

	/**
	* Caches the result certificates in the entity cache if it is enabled.
	*
	* @param resultCertificates the result certificates
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultCertificate> resultCertificates) {
		getPersistence().cacheResult(resultCertificates);
	}

	/**
	* Creates a new result certificate with the primary key. Does not add the result certificate to the database.
	*
	* @param id the primary key for the new result certificate
	* @return the new result certificate
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultCertificate create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the result certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the result certificate
	* @return the result certificate that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException if a result certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultCertificate remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.ResultCertificate updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.ResultCertificate resultCertificate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(resultCertificate);
	}

	/**
	* Returns the result certificate with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException} if it could not be found.
	*
	* @param id the primary key of the result certificate
	* @return the result certificate
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException if a result certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultCertificate findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultCertificateException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the result certificate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the result certificate
	* @return the result certificate, or <code>null</code> if a result certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.ResultCertificate fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the result certificates.
	*
	* @return the result certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultCertificate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the result certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of result certificates
	* @param end the upper bound of the range of result certificates (not inclusive)
	* @return the range of result certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultCertificate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the result certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of result certificates
	* @param end the upper bound of the range of result certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of result certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultCertificate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the result certificates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of result certificates.
	*
	* @return the number of result certificates
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ResultCertificatePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ResultCertificatePersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					ResultCertificatePersistence.class.getName());

			ReferenceRegistry.registerReference(ResultCertificateUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ResultCertificatePersistence persistence) {
	}

	private static ResultCertificatePersistence _persistence;
}