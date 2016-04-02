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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType;

import java.util.List;

/**
 * The persistence utility for the dm history doc type service. This utility wraps {@link DmHistoryDocTypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryDocTypePersistence
 * @see DmHistoryDocTypePersistenceImpl
 * @generated
 */
public class DmHistoryDocTypeUtil {
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
	public static void clearCache(DmHistoryDocType dmHistoryDocType) {
		getPersistence().clearCache(dmHistoryDocType);
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
	public static List<DmHistoryDocType> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmHistoryDocType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmHistoryDocType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DmHistoryDocType update(DmHistoryDocType dmHistoryDocType)
		throws SystemException {
		return getPersistence().update(dmHistoryDocType);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DmHistoryDocType update(DmHistoryDocType dmHistoryDocType,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmHistoryDocType, serviceContext);
	}

	/**
	* Returns the dm history doc type where documentType = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException} if it could not be found.
	*
	* @param documentType the document type
	* @return the matching dm history doc type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException if a matching dm history doc type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType findByDocumentType(
		java.lang.String documentType)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException {
		return getPersistence().findByDocumentType(documentType);
	}

	/**
	* Returns the dm history doc type where documentType = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param documentType the document type
	* @return the matching dm history doc type, or <code>null</code> if a matching dm history doc type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType fetchByDocumentType(
		java.lang.String documentType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByDocumentType(documentType);
	}

	/**
	* Returns the dm history doc type where documentType = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param documentType the document type
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history doc type, or <code>null</code> if a matching dm history doc type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType fetchByDocumentType(
		java.lang.String documentType, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDocumentType(documentType, retrieveFromCache);
	}

	/**
	* Removes the dm history doc type where documentType = &#63; from the database.
	*
	* @param documentType the document type
	* @return the dm history doc type that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType removeByDocumentType(
		java.lang.String documentType)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException {
		return getPersistence().removeByDocumentType(documentType);
	}

	/**
	* Returns the number of dm history doc types where documentType = &#63;.
	*
	* @param documentType the document type
	* @return the number of matching dm history doc types
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDocumentType(java.lang.String documentType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDocumentType(documentType);
	}

	/**
	* Returns the dm history doc type where documentType = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException} if it could not be found.
	*
	* @param documentType the document type
	* @param syncVersion the sync version
	* @return the matching dm history doc type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException if a matching dm history doc type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType findByDocumentTypeAndSyncVersion(
		java.lang.String documentType, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException {
		return getPersistence()
				   .findByDocumentTypeAndSyncVersion(documentType, syncVersion);
	}

	/**
	* Returns the dm history doc type where documentType = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param documentType the document type
	* @param syncVersion the sync version
	* @return the matching dm history doc type, or <code>null</code> if a matching dm history doc type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType fetchByDocumentTypeAndSyncVersion(
		java.lang.String documentType, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDocumentTypeAndSyncVersion(documentType, syncVersion);
	}

	/**
	* Returns the dm history doc type where documentType = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param documentType the document type
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history doc type, or <code>null</code> if a matching dm history doc type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType fetchByDocumentTypeAndSyncVersion(
		java.lang.String documentType, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDocumentTypeAndSyncVersion(documentType,
			syncVersion, retrieveFromCache);
	}

	/**
	* Removes the dm history doc type where documentType = &#63; and syncVersion = &#63; from the database.
	*
	* @param documentType the document type
	* @param syncVersion the sync version
	* @return the dm history doc type that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType removeByDocumentTypeAndSyncVersion(
		java.lang.String documentType, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException {
		return getPersistence()
				   .removeByDocumentTypeAndSyncVersion(documentType, syncVersion);
	}

	/**
	* Returns the number of dm history doc types where documentType = &#63; and syncVersion = &#63;.
	*
	* @param documentType the document type
	* @param syncVersion the sync version
	* @return the number of matching dm history doc types
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDocumentTypeAndSyncVersion(
		java.lang.String documentType, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDocumentTypeAndSyncVersion(documentType, syncVersion);
	}

	/**
	* Caches the dm history doc type in the entity cache if it is enabled.
	*
	* @param dmHistoryDocType the dm history doc type
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType dmHistoryDocType) {
		getPersistence().cacheResult(dmHistoryDocType);
	}

	/**
	* Caches the dm history doc types in the entity cache if it is enabled.
	*
	* @param dmHistoryDocTypes the dm history doc types
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType> dmHistoryDocTypes) {
		getPersistence().cacheResult(dmHistoryDocTypes);
	}

	/**
	* Creates a new dm history doc type with the primary key. Does not add the dm history doc type to the database.
	*
	* @param id the primary key for the new dm history doc type
	* @return the new dm history doc type
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType create(
		int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm history doc type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history doc type
	* @return the dm history doc type that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException if a dm history doc type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType dmHistoryDocType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmHistoryDocType);
	}

	/**
	* Returns the dm history doc type with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException} if it could not be found.
	*
	* @param id the primary key of the dm history doc type
	* @return the dm history doc type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException if a dm history doc type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryDocTypeException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm history doc type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history doc type
	* @return the dm history doc type, or <code>null</code> if a dm history doc type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm history doc types.
	*
	* @return the dm history doc types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryDocType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm history doc types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm history doc types.
	*
	* @return the number of dm history doc types
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmHistoryDocTypePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmHistoryDocTypePersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					DmHistoryDocTypePersistence.class.getName());

			ReferenceRegistry.registerReference(DmHistoryDocTypeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DmHistoryDocTypePersistence persistence) {
	}

	private static DmHistoryDocTypePersistence _persistence;
}