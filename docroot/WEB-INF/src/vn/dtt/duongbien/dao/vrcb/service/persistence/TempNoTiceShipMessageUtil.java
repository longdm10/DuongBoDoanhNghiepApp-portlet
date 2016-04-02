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

import vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage;

import java.util.List;

/**
 * The persistence utility for the temp no tice ship message service. This utility wraps {@link TempNoTiceShipMessagePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempNoTiceShipMessagePersistence
 * @see TempNoTiceShipMessagePersistenceImpl
 * @generated
 */
public class TempNoTiceShipMessageUtil {
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
	public static void clearCache(TempNoTiceShipMessage tempNoTiceShipMessage) {
		getPersistence().clearCache(tempNoTiceShipMessage);
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
	public static List<TempNoTiceShipMessage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TempNoTiceShipMessage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TempNoTiceShipMessage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TempNoTiceShipMessage update(
		TempNoTiceShipMessage tempNoTiceShipMessage) throws SystemException {
		return getPersistence().update(tempNoTiceShipMessage);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TempNoTiceShipMessage update(
		TempNoTiceShipMessage tempNoTiceShipMessage,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tempNoTiceShipMessage, serviceContext);
	}

	/**
	* Returns all the temp no tice ship messages where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentNameAnddocumentYear(documentName, documentYear);
	}

	/**
	* Returns a range of all the temp no tice ship messages where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempNoTiceShipMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of temp no tice ship messages
	* @param end the upper bound of the range of temp no tice ship messages (not inclusive)
	* @return the range of matching temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentNameAnddocumentYear(documentName,
			documentYear, start, end);
	}

	/**
	* Returns an ordered range of all the temp no tice ship messages where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempNoTiceShipMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of temp no tice ship messages
	* @param end the upper bound of the range of temp no tice ship messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentNameAnddocumentYear(documentName,
			documentYear, start, end, orderByComparator);
	}

	/**
	* Returns the first temp no tice ship message in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp no tice ship message
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException if a matching temp no tice ship message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage findBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException {
		return getPersistence()
				   .findBydocumentNameAnddocumentYear_First(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the first temp no tice ship message in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp no tice ship message, or <code>null</code> if a matching temp no tice ship message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage fetchBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBydocumentNameAnddocumentYear_First(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the last temp no tice ship message in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp no tice ship message
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException if a matching temp no tice ship message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage findBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException {
		return getPersistence()
				   .findBydocumentNameAnddocumentYear_Last(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the last temp no tice ship message in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp no tice ship message, or <code>null</code> if a matching temp no tice ship message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage fetchBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBydocumentNameAnddocumentYear_Last(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the temp no tice ship messages before and after the current temp no tice ship message in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param id the primary key of the current temp no tice ship message
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp no tice ship message
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException if a temp no tice ship message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage[] findBydocumentNameAnddocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException {
		return getPersistence()
				   .findBydocumentNameAnddocumentYear_PrevAndNext(id,
			documentName, documentYear, orderByComparator);
	}

	/**
	* Removes all the temp no tice ship messages where documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBydocumentNameAnddocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeBydocumentNameAnddocumentYear(documentName, documentYear);
	}

	/**
	* Returns the number of temp no tice ship messages where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public static int countBydocumentNameAnddocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBydocumentNameAnddocumentYear(documentName,
			documentYear);
	}

	/**
	* Returns all the temp no tice ship messages where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param noticeShipType the notice ship type
	* @return the matching temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage> findBydocumentNameAndDocumentYearAndNoticeShipType(
		long documentName, int documentYear, java.lang.String noticeShipType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentNameAndDocumentYearAndNoticeShipType(documentName,
			documentYear, noticeShipType);
	}

	/**
	* Returns a range of all the temp no tice ship messages where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempNoTiceShipMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param noticeShipType the notice ship type
	* @param start the lower bound of the range of temp no tice ship messages
	* @param end the upper bound of the range of temp no tice ship messages (not inclusive)
	* @return the range of matching temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage> findBydocumentNameAndDocumentYearAndNoticeShipType(
		long documentName, int documentYear, java.lang.String noticeShipType,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentNameAndDocumentYearAndNoticeShipType(documentName,
			documentYear, noticeShipType, start, end);
	}

	/**
	* Returns an ordered range of all the temp no tice ship messages where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempNoTiceShipMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param noticeShipType the notice ship type
	* @param start the lower bound of the range of temp no tice ship messages
	* @param end the upper bound of the range of temp no tice ship messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage> findBydocumentNameAndDocumentYearAndNoticeShipType(
		long documentName, int documentYear, java.lang.String noticeShipType,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentNameAndDocumentYearAndNoticeShipType(documentName,
			documentYear, noticeShipType, start, end, orderByComparator);
	}

	/**
	* Returns the first temp no tice ship message in the ordered set where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param noticeShipType the notice ship type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp no tice ship message
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException if a matching temp no tice ship message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage findBydocumentNameAndDocumentYearAndNoticeShipType_First(
		long documentName, int documentYear, java.lang.String noticeShipType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException {
		return getPersistence()
				   .findBydocumentNameAndDocumentYearAndNoticeShipType_First(documentName,
			documentYear, noticeShipType, orderByComparator);
	}

	/**
	* Returns the first temp no tice ship message in the ordered set where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param noticeShipType the notice ship type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp no tice ship message, or <code>null</code> if a matching temp no tice ship message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage fetchBydocumentNameAndDocumentYearAndNoticeShipType_First(
		long documentName, int documentYear, java.lang.String noticeShipType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBydocumentNameAndDocumentYearAndNoticeShipType_First(documentName,
			documentYear, noticeShipType, orderByComparator);
	}

	/**
	* Returns the last temp no tice ship message in the ordered set where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param noticeShipType the notice ship type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp no tice ship message
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException if a matching temp no tice ship message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage findBydocumentNameAndDocumentYearAndNoticeShipType_Last(
		long documentName, int documentYear, java.lang.String noticeShipType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException {
		return getPersistence()
				   .findBydocumentNameAndDocumentYearAndNoticeShipType_Last(documentName,
			documentYear, noticeShipType, orderByComparator);
	}

	/**
	* Returns the last temp no tice ship message in the ordered set where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param noticeShipType the notice ship type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp no tice ship message, or <code>null</code> if a matching temp no tice ship message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage fetchBydocumentNameAndDocumentYearAndNoticeShipType_Last(
		long documentName, int documentYear, java.lang.String noticeShipType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBydocumentNameAndDocumentYearAndNoticeShipType_Last(documentName,
			documentYear, noticeShipType, orderByComparator);
	}

	/**
	* Returns the temp no tice ship messages before and after the current temp no tice ship message in the ordered set where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63;.
	*
	* @param id the primary key of the current temp no tice ship message
	* @param documentName the document name
	* @param documentYear the document year
	* @param noticeShipType the notice ship type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp no tice ship message
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException if a temp no tice ship message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage[] findBydocumentNameAndDocumentYearAndNoticeShipType_PrevAndNext(
		long id, long documentName, int documentYear,
		java.lang.String noticeShipType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException {
		return getPersistence()
				   .findBydocumentNameAndDocumentYearAndNoticeShipType_PrevAndNext(id,
			documentName, documentYear, noticeShipType, orderByComparator);
	}

	/**
	* Removes all the temp no tice ship messages where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param noticeShipType the notice ship type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBydocumentNameAndDocumentYearAndNoticeShipType(
		long documentName, int documentYear, java.lang.String noticeShipType)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeBydocumentNameAndDocumentYearAndNoticeShipType(documentName,
			documentYear, noticeShipType);
	}

	/**
	* Returns the number of temp no tice ship messages where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param noticeShipType the notice ship type
	* @return the number of matching temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public static int countBydocumentNameAndDocumentYearAndNoticeShipType(
		long documentName, int documentYear, java.lang.String noticeShipType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBydocumentNameAndDocumentYearAndNoticeShipType(documentName,
			documentYear, noticeShipType);
	}

	/**
	* Returns all the temp no tice ship messages where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the matching temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage> findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRequestCode(requestCode);
	}

	/**
	* Returns a range of all the temp no tice ship messages where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempNoTiceShipMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param requestCode the request code
	* @param start the lower bound of the range of temp no tice ship messages
	* @param end the upper bound of the range of temp no tice ship messages (not inclusive)
	* @return the range of matching temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage> findByRequestCode(
		java.lang.String requestCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRequestCode(requestCode, start, end);
	}

	/**
	* Returns an ordered range of all the temp no tice ship messages where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempNoTiceShipMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param requestCode the request code
	* @param start the lower bound of the range of temp no tice ship messages
	* @param end the upper bound of the range of temp no tice ship messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage> findByRequestCode(
		java.lang.String requestCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRequestCode(requestCode, start, end, orderByComparator);
	}

	/**
	* Returns the first temp no tice ship message in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp no tice ship message
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException if a matching temp no tice ship message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage findByRequestCode_First(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException {
		return getPersistence()
				   .findByRequestCode_First(requestCode, orderByComparator);
	}

	/**
	* Returns the first temp no tice ship message in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp no tice ship message, or <code>null</code> if a matching temp no tice ship message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage fetchByRequestCode_First(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRequestCode_First(requestCode, orderByComparator);
	}

	/**
	* Returns the last temp no tice ship message in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp no tice ship message
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException if a matching temp no tice ship message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage findByRequestCode_Last(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException {
		return getPersistence()
				   .findByRequestCode_Last(requestCode, orderByComparator);
	}

	/**
	* Returns the last temp no tice ship message in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp no tice ship message, or <code>null</code> if a matching temp no tice ship message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage fetchByRequestCode_Last(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRequestCode_Last(requestCode, orderByComparator);
	}

	/**
	* Returns the temp no tice ship messages before and after the current temp no tice ship message in the ordered set where requestCode = &#63;.
	*
	* @param id the primary key of the current temp no tice ship message
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp no tice ship message
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException if a temp no tice ship message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage[] findByRequestCode_PrevAndNext(
		long id, java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException {
		return getPersistence()
				   .findByRequestCode_PrevAndNext(id, requestCode,
			orderByComparator);
	}

	/**
	* Removes all the temp no tice ship messages where requestCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByRequestCode(requestCode);
	}

	/**
	* Returns the number of temp no tice ship messages where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the number of matching temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRequestCode(requestCode);
	}

	/**
	* Caches the temp no tice ship message in the entity cache if it is enabled.
	*
	* @param tempNoTiceShipMessage the temp no tice ship message
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage tempNoTiceShipMessage) {
		getPersistence().cacheResult(tempNoTiceShipMessage);
	}

	/**
	* Caches the temp no tice ship messages in the entity cache if it is enabled.
	*
	* @param tempNoTiceShipMessages the temp no tice ship messages
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage> tempNoTiceShipMessages) {
		getPersistence().cacheResult(tempNoTiceShipMessages);
	}

	/**
	* Creates a new temp no tice ship message with the primary key. Does not add the temp no tice ship message to the database.
	*
	* @param id the primary key for the new temp no tice ship message
	* @return the new temp no tice ship message
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the temp no tice ship message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp no tice ship message
	* @return the temp no tice ship message that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException if a temp no tice ship message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage tempNoTiceShipMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tempNoTiceShipMessage);
	}

	/**
	* Returns the temp no tice ship message with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException} if it could not be found.
	*
	* @param id the primary key of the temp no tice ship message
	* @return the temp no tice ship message
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException if a temp no tice ship message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the temp no tice ship message with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the temp no tice ship message
	* @return the temp no tice ship message, or <code>null</code> if a temp no tice ship message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the temp no tice ship messages.
	*
	* @return the temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the temp no tice ship messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempNoTiceShipMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temp no tice ship messages
	* @param end the upper bound of the range of temp no tice ship messages (not inclusive)
	* @return the range of temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the temp no tice ship messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempNoTiceShipMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temp no tice ship messages
	* @param end the upper bound of the range of temp no tice ship messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the temp no tice ship messages from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of temp no tice ship messages.
	*
	* @return the number of temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TempNoTiceShipMessagePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TempNoTiceShipMessagePersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					TempNoTiceShipMessagePersistence.class.getName());

			ReferenceRegistry.registerReference(TempNoTiceShipMessageUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TempNoTiceShipMessagePersistence persistence) {
	}

	private static TempNoTiceShipMessagePersistence _persistence;
}