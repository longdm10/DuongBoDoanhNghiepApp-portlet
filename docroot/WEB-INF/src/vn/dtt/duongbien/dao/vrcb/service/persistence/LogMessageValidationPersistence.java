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

import vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation;

/**
 * The persistence interface for the log message validation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see LogMessageValidationPersistenceImpl
 * @see LogMessageValidationUtil
 * @generated
 */
public interface LogMessageValidationPersistence extends BasePersistence<LogMessageValidation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LogMessageValidationUtil} to access the log message validation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the log message validations where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching log message validations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation> findByDocumentNameDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the log message validations where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.LogMessageValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of log message validations
	* @param end the upper bound of the range of log message validations (not inclusive)
	* @return the range of matching log message validations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation> findByDocumentNameDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the log message validations where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.LogMessageValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of log message validations
	* @param end the upper bound of the range of log message validations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching log message validations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation> findByDocumentNameDocumentYear(
		long documentName, int documentYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first log message validation in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching log message validation
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchLogMessageValidationException if a matching log message validation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation findByDocumentNameDocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchLogMessageValidationException;

	/**
	* Returns the first log message validation in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching log message validation, or <code>null</code> if a matching log message validation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation fetchByDocumentNameDocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last log message validation in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching log message validation
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchLogMessageValidationException if a matching log message validation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation findByDocumentNameDocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchLogMessageValidationException;

	/**
	* Returns the last log message validation in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching log message validation, or <code>null</code> if a matching log message validation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation fetchByDocumentNameDocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the log message validations before and after the current log message validation in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param id the primary key of the current log message validation
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next log message validation
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchLogMessageValidationException if a log message validation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation[] findByDocumentNameDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchLogMessageValidationException;

	/**
	* Removes all the log message validations where documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocumentNameDocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of log message validations where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching log message validations
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocumentNameDocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the log message validation in the entity cache if it is enabled.
	*
	* @param logMessageValidation the log message validation
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation logMessageValidation);

	/**
	* Caches the log message validations in the entity cache if it is enabled.
	*
	* @param logMessageValidations the log message validations
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation> logMessageValidations);

	/**
	* Creates a new log message validation with the primary key. Does not add the log message validation to the database.
	*
	* @param id the primary key for the new log message validation
	* @return the new log message validation
	*/
	public vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation create(long id);

	/**
	* Removes the log message validation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the log message validation
	* @return the log message validation that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchLogMessageValidationException if a log message validation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchLogMessageValidationException;

	public vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation logMessageValidation)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the log message validation with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchLogMessageValidationException} if it could not be found.
	*
	* @param id the primary key of the log message validation
	* @return the log message validation
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchLogMessageValidationException if a log message validation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchLogMessageValidationException;

	/**
	* Returns the log message validation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the log message validation
	* @return the log message validation, or <code>null</code> if a log message validation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the log message validations.
	*
	* @return the log message validations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the log message validations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.LogMessageValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of log message validations
	* @param end the upper bound of the range of log message validations (not inclusive)
	* @return the range of log message validations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the log message validations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.LogMessageValidationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of log message validations
	* @param end the upper bound of the range of log message validations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of log message validations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the log message validations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of log message validations.
	*
	* @return the number of log message validations
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}