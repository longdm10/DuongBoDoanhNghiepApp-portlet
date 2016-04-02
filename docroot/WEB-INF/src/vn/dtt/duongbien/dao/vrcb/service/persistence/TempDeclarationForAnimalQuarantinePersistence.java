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

import vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine;

/**
 * The persistence interface for the temp declaration for animal quarantine service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempDeclarationForAnimalQuarantinePersistenceImpl
 * @see TempDeclarationForAnimalQuarantineUtil
 * @generated
 */
public interface TempDeclarationForAnimalQuarantinePersistence
	extends BasePersistence<TempDeclarationForAnimalQuarantine> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TempDeclarationForAnimalQuarantineUtil} to access the temp declaration for animal quarantine persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the temp declaration for animal quarantines where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching temp declaration for animal quarantines
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp declaration for animal quarantines where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of temp declaration for animal quarantines
	* @param end the upper bound of the range of temp declaration for animal quarantines (not inclusive)
	* @return the range of matching temp declaration for animal quarantines
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp declaration for animal quarantines where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of temp declaration for animal quarantines
	* @param end the upper bound of the range of temp declaration for animal quarantines (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp declaration for animal quarantines
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first temp declaration for animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp declaration for animal quarantine
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException if a matching temp declaration for animal quarantine could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine findBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException;

	/**
	* Returns the first temp declaration for animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp declaration for animal quarantine, or <code>null</code> if a matching temp declaration for animal quarantine could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine fetchBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last temp declaration for animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp declaration for animal quarantine
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException if a matching temp declaration for animal quarantine could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine findBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException;

	/**
	* Returns the last temp declaration for animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp declaration for animal quarantine, or <code>null</code> if a matching temp declaration for animal quarantine could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine fetchBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the temp declaration for animal quarantines before and after the current temp declaration for animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param id the primary key of the current temp declaration for animal quarantine
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp declaration for animal quarantine
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException if a temp declaration for animal quarantine with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine[] findBydocumentNameAnddocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException;

	/**
	* Removes all the temp declaration for animal quarantines where documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public void removeBydocumentNameAnddocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp declaration for animal quarantines where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching temp declaration for animal quarantines
	* @throws SystemException if a system exception occurred
	*/
	public int countBydocumentNameAnddocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the temp declaration for animal quarantines where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @return the matching temp declaration for animal quarantines
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp declaration for animal quarantines where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param start the lower bound of the range of temp declaration for animal quarantines
	* @param end the upper bound of the range of temp declaration for animal quarantines (not inclusive)
	* @return the range of matching temp declaration for animal quarantines
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp declaration for animal quarantines where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param start the lower bound of the range of temp declaration for animal quarantines
	* @param end the upper bound of the range of temp declaration for animal quarantines (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp declaration for animal quarantines
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first temp declaration for animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp declaration for animal quarantine
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException if a matching temp declaration for animal quarantine could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine findBydocumentNameAnddocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException;

	/**
	* Returns the first temp declaration for animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp declaration for animal quarantine, or <code>null</code> if a matching temp declaration for animal quarantine could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine fetchBydocumentNameAnddocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last temp declaration for animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp declaration for animal quarantine
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException if a matching temp declaration for animal quarantine could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine findBydocumentNameAnddocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException;

	/**
	* Returns the last temp declaration for animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp declaration for animal quarantine, or <code>null</code> if a matching temp declaration for animal quarantine could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine fetchBydocumentNameAnddocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the temp declaration for animal quarantines before and after the current temp declaration for animal quarantine in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param id the primary key of the current temp declaration for animal quarantine
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp declaration for animal quarantine
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException if a temp declaration for animal quarantine with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine[] findBydocumentNameAnddocumentYearRequestState_PrevAndNext(
		long id, long documentName, int documentYear, int requestState,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException;

	/**
	* Removes all the temp declaration for animal quarantines where documentName = &#63; and documentYear = &#63; and requestState = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @throws SystemException if a system exception occurred
	*/
	public void removeBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp declaration for animal quarantines where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @return the number of matching temp declaration for animal quarantines
	* @throws SystemException if a system exception occurred
	*/
	public int countBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the temp declaration for animal quarantines where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the matching temp declaration for animal quarantines
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine> findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp declaration for animal quarantines where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param requestCode the request code
	* @param start the lower bound of the range of temp declaration for animal quarantines
	* @param end the upper bound of the range of temp declaration for animal quarantines (not inclusive)
	* @return the range of matching temp declaration for animal quarantines
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine> findByRequestCode(
		java.lang.String requestCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp declaration for animal quarantines where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param requestCode the request code
	* @param start the lower bound of the range of temp declaration for animal quarantines
	* @param end the upper bound of the range of temp declaration for animal quarantines (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp declaration for animal quarantines
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine> findByRequestCode(
		java.lang.String requestCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first temp declaration for animal quarantine in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp declaration for animal quarantine
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException if a matching temp declaration for animal quarantine could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine findByRequestCode_First(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException;

	/**
	* Returns the first temp declaration for animal quarantine in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp declaration for animal quarantine, or <code>null</code> if a matching temp declaration for animal quarantine could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine fetchByRequestCode_First(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last temp declaration for animal quarantine in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp declaration for animal quarantine
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException if a matching temp declaration for animal quarantine could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine findByRequestCode_Last(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException;

	/**
	* Returns the last temp declaration for animal quarantine in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp declaration for animal quarantine, or <code>null</code> if a matching temp declaration for animal quarantine could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine fetchByRequestCode_Last(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the temp declaration for animal quarantines before and after the current temp declaration for animal quarantine in the ordered set where requestCode = &#63;.
	*
	* @param id the primary key of the current temp declaration for animal quarantine
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp declaration for animal quarantine
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException if a temp declaration for animal quarantine with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine[] findByRequestCode_PrevAndNext(
		long id, java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException;

	/**
	* Removes all the temp declaration for animal quarantines where requestCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp declaration for animal quarantines where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the number of matching temp declaration for animal quarantines
	* @throws SystemException if a system exception occurred
	*/
	public int countByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the temp declaration for animal quarantine in the entity cache if it is enabled.
	*
	* @param tempDeclarationForAnimalQuarantine the temp declaration for animal quarantine
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine);

	/**
	* Caches the temp declaration for animal quarantines in the entity cache if it is enabled.
	*
	* @param tempDeclarationForAnimalQuarantines the temp declaration for animal quarantines
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine> tempDeclarationForAnimalQuarantines);

	/**
	* Creates a new temp declaration for animal quarantine with the primary key. Does not add the temp declaration for animal quarantine to the database.
	*
	* @param id the primary key for the new temp declaration for animal quarantine
	* @return the new temp declaration for animal quarantine
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine create(
		long id);

	/**
	* Removes the temp declaration for animal quarantine with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp declaration for animal quarantine
	* @return the temp declaration for animal quarantine that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException if a temp declaration for animal quarantine with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException;

	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the temp declaration for animal quarantine with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException} if it could not be found.
	*
	* @param id the primary key of the temp declaration for animal quarantine
	* @return the temp declaration for animal quarantine
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException if a temp declaration for animal quarantine with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempDeclarationForAnimalQuarantineException;

	/**
	* Returns the temp declaration for animal quarantine with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the temp declaration for animal quarantine
	* @return the temp declaration for animal quarantine, or <code>null</code> if a temp declaration for animal quarantine with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the temp declaration for animal quarantines.
	*
	* @return the temp declaration for animal quarantines
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp declaration for animal quarantines.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temp declaration for animal quarantines
	* @param end the upper bound of the range of temp declaration for animal quarantines (not inclusive)
	* @return the range of temp declaration for animal quarantines
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp declaration for animal quarantines.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temp declaration for animal quarantines
	* @param end the upper bound of the range of temp declaration for animal quarantines (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of temp declaration for animal quarantines
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the temp declaration for animal quarantines from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp declaration for animal quarantines.
	*
	* @return the number of temp declaration for animal quarantines
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}