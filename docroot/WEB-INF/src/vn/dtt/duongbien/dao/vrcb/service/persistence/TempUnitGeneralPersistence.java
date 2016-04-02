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

import vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral;

/**
 * The persistence interface for the temp unit general service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempUnitGeneralPersistenceImpl
 * @see TempUnitGeneralUtil
 * @generated
 */
public interface TempUnitGeneralPersistence extends BasePersistence<TempUnitGeneral> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TempUnitGeneralUtil} to access the temp unit general persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the temp unit generals where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching temp unit generals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp unit generals where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempUnitGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of temp unit generals
	* @param end the upper bound of the range of temp unit generals (not inclusive)
	* @return the range of matching temp unit generals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp unit generals where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempUnitGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of temp unit generals
	* @param end the upper bound of the range of temp unit generals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp unit generals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first temp unit general in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp unit general
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempUnitGeneralException if a matching temp unit general could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral findByDocumentNameAndDocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempUnitGeneralException;

	/**
	* Returns the first temp unit general in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp unit general, or <code>null</code> if a matching temp unit general could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral fetchByDocumentNameAndDocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last temp unit general in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp unit general
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempUnitGeneralException if a matching temp unit general could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral findByDocumentNameAndDocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempUnitGeneralException;

	/**
	* Returns the last temp unit general in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp unit general, or <code>null</code> if a matching temp unit general could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral fetchByDocumentNameAndDocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the temp unit generals before and after the current temp unit general in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* @param id the primary key of the current temp unit general
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp unit general
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempUnitGeneralException if a temp unit general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral[] findByDocumentNameAndDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempUnitGeneralException;

	/**
	* Removes all the temp unit generals where documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocumentNameAndDocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp unit generals where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching temp unit generals
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocumentNameAndDocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the temp unit general in the entity cache if it is enabled.
	*
	* @param tempUnitGeneral the temp unit general
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral tempUnitGeneral);

	/**
	* Caches the temp unit generals in the entity cache if it is enabled.
	*
	* @param tempUnitGenerals the temp unit generals
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral> tempUnitGenerals);

	/**
	* Creates a new temp unit general with the primary key. Does not add the temp unit general to the database.
	*
	* @param id the primary key for the new temp unit general
	* @return the new temp unit general
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral create(long id);

	/**
	* Removes the temp unit general with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp unit general
	* @return the temp unit general that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempUnitGeneralException if a temp unit general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempUnitGeneralException;

	public vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral tempUnitGeneral)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the temp unit general with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempUnitGeneralException} if it could not be found.
	*
	* @param id the primary key of the temp unit general
	* @return the temp unit general
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempUnitGeneralException if a temp unit general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempUnitGeneralException;

	/**
	* Returns the temp unit general with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the temp unit general
	* @return the temp unit general, or <code>null</code> if a temp unit general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the temp unit generals.
	*
	* @return the temp unit generals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp unit generals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempUnitGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temp unit generals
	* @param end the upper bound of the range of temp unit generals (not inclusive)
	* @return the range of temp unit generals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp unit generals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempUnitGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temp unit generals
	* @param end the upper bound of the range of temp unit generals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of temp unit generals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the temp unit generals from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp unit generals.
	*
	* @return the number of temp unit generals
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}