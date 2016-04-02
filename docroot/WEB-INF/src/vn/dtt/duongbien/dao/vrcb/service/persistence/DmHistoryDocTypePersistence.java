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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType;

/**
 * The persistence interface for the dm history doc type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryDocTypePersistenceImpl
 * @see DmHistoryDocTypeUtil
 * @generated
 */
public interface DmHistoryDocTypePersistence extends BasePersistence<DmHistoryDocType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmHistoryDocTypeUtil} to access the dm history doc type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the dm history doc type where documentType = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException} if it could not be found.
	*
	* @param documentType the document type
	* @return the matching dm history doc type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException if a matching dm history doc type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType findByDocumentType(
		java.lang.String documentType)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException;

	/**
	* Returns the dm history doc type where documentType = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param documentType the document type
	* @return the matching dm history doc type, or <code>null</code> if a matching dm history doc type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType fetchByDocumentType(
		java.lang.String documentType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history doc type where documentType = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param documentType the document type
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history doc type, or <code>null</code> if a matching dm history doc type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType fetchByDocumentType(
		java.lang.String documentType, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm history doc type where documentType = &#63; from the database.
	*
	* @param documentType the document type
	* @return the dm history doc type that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType removeByDocumentType(
		java.lang.String documentType)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException;

	/**
	* Returns the number of dm history doc types where documentType = &#63;.
	*
	* @param documentType the document type
	* @return the number of matching dm history doc types
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocumentType(java.lang.String documentType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history doc type where documentType = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException} if it could not be found.
	*
	* @param documentType the document type
	* @param syncVersion the sync version
	* @return the matching dm history doc type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException if a matching dm history doc type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType findByDocumentTypeAndSyncVersion(
		java.lang.String documentType, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException;

	/**
	* Returns the dm history doc type where documentType = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param documentType the document type
	* @param syncVersion the sync version
	* @return the matching dm history doc type, or <code>null</code> if a matching dm history doc type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType fetchByDocumentTypeAndSyncVersion(
		java.lang.String documentType, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history doc type where documentType = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param documentType the document type
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history doc type, or <code>null</code> if a matching dm history doc type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType fetchByDocumentTypeAndSyncVersion(
		java.lang.String documentType, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm history doc type where documentType = &#63; and syncVersion = &#63; from the database.
	*
	* @param documentType the document type
	* @param syncVersion the sync version
	* @return the dm history doc type that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType removeByDocumentTypeAndSyncVersion(
		java.lang.String documentType, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException;

	/**
	* Returns the number of dm history doc types where documentType = &#63; and syncVersion = &#63;.
	*
	* @param documentType the document type
	* @param syncVersion the sync version
	* @return the number of matching dm history doc types
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocumentTypeAndSyncVersion(
		java.lang.String documentType, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dm history doc type in the entity cache if it is enabled.
	*
	* @param dmHistoryDocType the dm history doc type
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType dmHistoryDocType);

	/**
	* Caches the dm history doc types in the entity cache if it is enabled.
	*
	* @param dmHistoryDocTypes the dm history doc types
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType> dmHistoryDocTypes);

	/**
	* Creates a new dm history doc type with the primary key. Does not add the dm history doc type to the database.
	*
	* @param id the primary key for the new dm history doc type
	* @return the new dm history doc type
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType create(int id);

	/**
	* Removes the dm history doc type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history doc type
	* @return the dm history doc type that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException if a dm history doc type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException;

	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType dmHistoryDocType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history doc type with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException} if it could not be found.
	*
	* @param id the primary key of the dm history doc type
	* @return the dm history doc type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException if a dm history doc type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException;

	/**
	* Returns the dm history doc type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history doc type
	* @return the dm history doc type, or <code>null</code> if a dm history doc type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm history doc types.
	*
	* @return the dm history doc types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history doc types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryDocTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history doc types
	* @param end the upper bound of the range of dm history doc types (not inclusive)
	* @return the range of dm history doc types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history doc types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryDocTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history doc types
	* @param end the upper bound of the range of dm history doc types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history doc types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm history doc types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history doc types.
	*
	* @return the number of dm history doc types
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}