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

import vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry;

/**
 * The persistence interface for the result history ministry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see ResultHistoryMinistryPersistenceImpl
 * @see ResultHistoryMinistryUtil
 * @generated
 */
public interface ResultHistoryMinistryPersistence extends BasePersistence<ResultHistoryMinistry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ResultHistoryMinistryUtil} to access the result history ministry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the result history ministry where requestCode = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException} if it could not be found.
	*
	* @param requestCode the request code
	* @return the matching result history ministry
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException if a matching result history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException;

	/**
	* Returns the result history ministry where requestCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param requestCode the request code
	* @return the matching result history ministry, or <code>null</code> if a matching result history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry fetchByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the result history ministry where requestCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param requestCode the request code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching result history ministry, or <code>null</code> if a matching result history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry fetchByRequestCode(
		java.lang.String requestCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the result history ministry where requestCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @return the result history ministry that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry removeByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException;

	/**
	* Returns the number of result history ministries where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the number of matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public int countByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the result history ministries where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the result history ministries where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultHistoryMinistryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of result history ministries
	* @param end the upper bound of the range of result history ministries (not inclusive)
	* @return the range of matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the result history ministries where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultHistoryMinistryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of result history ministries
	* @param end the upper bound of the range of result history ministries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first result history ministry in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result history ministry
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException if a matching result history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry findByDocumentNameAnddocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException;

	/**
	* Returns the first result history ministry in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result history ministry, or <code>null</code> if a matching result history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry fetchByDocumentNameAnddocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last result history ministry in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result history ministry
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException if a matching result history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry findByDocumentNameAnddocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException;

	/**
	* Returns the last result history ministry in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result history ministry, or <code>null</code> if a matching result history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry fetchByDocumentNameAnddocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the result history ministries before and after the current result history ministry in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param id the primary key of the current result history ministry
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result history ministry
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException if a result history ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry[] findByDocumentNameAnddocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException;

	/**
	* Removes all the result history ministries where documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocumentNameAnddocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of result history ministries where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocumentNameAnddocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the result history ministries where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param ministryCode the ministry code
	* @return the matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry> findByDocumentNameAnddocumentYearAndMinistryCode(
		long documentName, int documentYear, java.lang.String ministryCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the result history ministries where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultHistoryMinistryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param ministryCode the ministry code
	* @param start the lower bound of the range of result history ministries
	* @param end the upper bound of the range of result history ministries (not inclusive)
	* @return the range of matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry> findByDocumentNameAnddocumentYearAndMinistryCode(
		long documentName, int documentYear, java.lang.String ministryCode,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the result history ministries where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultHistoryMinistryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param ministryCode the ministry code
	* @param start the lower bound of the range of result history ministries
	* @param end the upper bound of the range of result history ministries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry> findByDocumentNameAnddocumentYearAndMinistryCode(
		long documentName, int documentYear, java.lang.String ministryCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first result history ministry in the ordered set where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param ministryCode the ministry code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result history ministry
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException if a matching result history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry findByDocumentNameAnddocumentYearAndMinistryCode_First(
		long documentName, int documentYear, java.lang.String ministryCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException;

	/**
	* Returns the first result history ministry in the ordered set where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param ministryCode the ministry code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result history ministry, or <code>null</code> if a matching result history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry fetchByDocumentNameAnddocumentYearAndMinistryCode_First(
		long documentName, int documentYear, java.lang.String ministryCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last result history ministry in the ordered set where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param ministryCode the ministry code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result history ministry
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException if a matching result history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry findByDocumentNameAnddocumentYearAndMinistryCode_Last(
		long documentName, int documentYear, java.lang.String ministryCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException;

	/**
	* Returns the last result history ministry in the ordered set where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param ministryCode the ministry code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result history ministry, or <code>null</code> if a matching result history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry fetchByDocumentNameAnddocumentYearAndMinistryCode_Last(
		long documentName, int documentYear, java.lang.String ministryCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the result history ministries before and after the current result history ministry in the ordered set where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	*
	* @param id the primary key of the current result history ministry
	* @param documentName the document name
	* @param documentYear the document year
	* @param ministryCode the ministry code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result history ministry
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException if a result history ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry[] findByDocumentNameAnddocumentYearAndMinistryCode_PrevAndNext(
		long id, long documentName, int documentYear,
		java.lang.String ministryCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException;

	/**
	* Removes all the result history ministries where documentName = &#63; and documentYear = &#63; and ministryCode = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param ministryCode the ministry code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocumentNameAnddocumentYearAndMinistryCode(
		long documentName, int documentYear, java.lang.String ministryCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of result history ministries where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param ministryCode the ministry code
	* @return the number of matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocumentNameAnddocumentYearAndMinistryCode(
		long documentName, int documentYear, java.lang.String ministryCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the result history ministries where ministryCode = &#63;.
	*
	* @param ministryCode the ministry code
	* @return the matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry> findByMinistryCode(
		java.lang.String ministryCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the result history ministries where ministryCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultHistoryMinistryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ministryCode the ministry code
	* @param start the lower bound of the range of result history ministries
	* @param end the upper bound of the range of result history ministries (not inclusive)
	* @return the range of matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry> findByMinistryCode(
		java.lang.String ministryCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the result history ministries where ministryCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultHistoryMinistryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ministryCode the ministry code
	* @param start the lower bound of the range of result history ministries
	* @param end the upper bound of the range of result history ministries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry> findByMinistryCode(
		java.lang.String ministryCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first result history ministry in the ordered set where ministryCode = &#63;.
	*
	* @param ministryCode the ministry code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result history ministry
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException if a matching result history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry findByMinistryCode_First(
		java.lang.String ministryCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException;

	/**
	* Returns the first result history ministry in the ordered set where ministryCode = &#63;.
	*
	* @param ministryCode the ministry code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result history ministry, or <code>null</code> if a matching result history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry fetchByMinistryCode_First(
		java.lang.String ministryCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last result history ministry in the ordered set where ministryCode = &#63;.
	*
	* @param ministryCode the ministry code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result history ministry
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException if a matching result history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry findByMinistryCode_Last(
		java.lang.String ministryCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException;

	/**
	* Returns the last result history ministry in the ordered set where ministryCode = &#63;.
	*
	* @param ministryCode the ministry code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result history ministry, or <code>null</code> if a matching result history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry fetchByMinistryCode_Last(
		java.lang.String ministryCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the result history ministries before and after the current result history ministry in the ordered set where ministryCode = &#63;.
	*
	* @param id the primary key of the current result history ministry
	* @param ministryCode the ministry code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result history ministry
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException if a result history ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry[] findByMinistryCode_PrevAndNext(
		long id, java.lang.String ministryCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException;

	/**
	* Removes all the result history ministries where ministryCode = &#63; from the database.
	*
	* @param ministryCode the ministry code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByMinistryCode(java.lang.String ministryCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of result history ministries where ministryCode = &#63;.
	*
	* @param ministryCode the ministry code
	* @return the number of matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public int countByMinistryCode(java.lang.String ministryCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the result history ministry in the entity cache if it is enabled.
	*
	* @param resultHistoryMinistry the result history ministry
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry resultHistoryMinistry);

	/**
	* Caches the result history ministries in the entity cache if it is enabled.
	*
	* @param resultHistoryMinistries the result history ministries
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry> resultHistoryMinistries);

	/**
	* Creates a new result history ministry with the primary key. Does not add the result history ministry to the database.
	*
	* @param id the primary key for the new result history ministry
	* @return the new result history ministry
	*/
	public vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry create(long id);

	/**
	* Removes the result history ministry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the result history ministry
	* @return the result history ministry that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException if a result history ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException;

	public vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry resultHistoryMinistry)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the result history ministry with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException} if it could not be found.
	*
	* @param id the primary key of the result history ministry
	* @return the result history ministry
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException if a result history ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchResultHistoryMinistryException;

	/**
	* Returns the result history ministry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the result history ministry
	* @return the result history ministry, or <code>null</code> if a result history ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the result history ministries.
	*
	* @return the result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the result history ministries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultHistoryMinistryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of result history ministries
	* @param end the upper bound of the range of result history ministries (not inclusive)
	* @return the range of result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the result history ministries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultHistoryMinistryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of result history ministries
	* @param end the upper bound of the range of result history ministries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the result history ministries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of result history ministries.
	*
	* @return the number of result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}