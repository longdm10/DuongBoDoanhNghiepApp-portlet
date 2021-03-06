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

import vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit;

/**
 * The persistence interface for the issue acceptance for transit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see IssueAcceptanceForTransitPersistenceImpl
 * @see IssueAcceptanceForTransitUtil
 * @generated
 */
public interface IssueAcceptanceForTransitPersistence extends BasePersistence<IssueAcceptanceForTransit> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link IssueAcceptanceForTransitUtil} to access the issue acceptance for transit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the issue acceptance for transit where documentName = &#63; and documentYear = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchIssueAcceptanceForTransitException} if it could not be found.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching issue acceptance for transit
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueAcceptanceForTransitException if a matching issue acceptance for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit findByfindIssueAcceptanceForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssueAcceptanceForTransitException;

	/**
	* Returns the issue acceptance for transit where documentName = &#63; and documentYear = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching issue acceptance for transit, or <code>null</code> if a matching issue acceptance for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit fetchByfindIssueAcceptanceForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the issue acceptance for transit where documentName = &#63; and documentYear = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching issue acceptance for transit, or <code>null</code> if a matching issue acceptance for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit fetchByfindIssueAcceptanceForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the issue acceptance for transit where documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the issue acceptance for transit that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit removeByfindIssueAcceptanceForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssueAcceptanceForTransitException;

	/**
	* Returns the number of issue acceptance for transits where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching issue acceptance for transits
	* @throws SystemException if a system exception occurred
	*/
	public int countByfindIssueAcceptanceForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the issue acceptance for transit in the entity cache if it is enabled.
	*
	* @param issueAcceptanceForTransit the issue acceptance for transit
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit issueAcceptanceForTransit);

	/**
	* Caches the issue acceptance for transits in the entity cache if it is enabled.
	*
	* @param issueAcceptanceForTransits the issue acceptance for transits
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit> issueAcceptanceForTransits);

	/**
	* Creates a new issue acceptance for transit with the primary key. Does not add the issue acceptance for transit to the database.
	*
	* @param id the primary key for the new issue acceptance for transit
	* @return the new issue acceptance for transit
	*/
	public vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit create(
		long id);

	/**
	* Removes the issue acceptance for transit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the issue acceptance for transit
	* @return the issue acceptance for transit that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueAcceptanceForTransitException if a issue acceptance for transit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssueAcceptanceForTransitException;

	public vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit issueAcceptanceForTransit)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the issue acceptance for transit with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchIssueAcceptanceForTransitException} if it could not be found.
	*
	* @param id the primary key of the issue acceptance for transit
	* @return the issue acceptance for transit
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchIssueAcceptanceForTransitException if a issue acceptance for transit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchIssueAcceptanceForTransitException;

	/**
	* Returns the issue acceptance for transit with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the issue acceptance for transit
	* @return the issue acceptance for transit, or <code>null</code> if a issue acceptance for transit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the issue acceptance for transits.
	*
	* @return the issue acceptance for transits
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the issue acceptance for transits.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueAcceptanceForTransitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of issue acceptance for transits
	* @param end the upper bound of the range of issue acceptance for transits (not inclusive)
	* @return the range of issue acceptance for transits
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the issue acceptance for transits.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.IssueAcceptanceForTransitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of issue acceptance for transits
	* @param end the upper bound of the range of issue acceptance for transits (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of issue acceptance for transits
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the issue acceptance for transits from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of issue acceptance for transits.
	*
	* @return the number of issue acceptance for transits
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}