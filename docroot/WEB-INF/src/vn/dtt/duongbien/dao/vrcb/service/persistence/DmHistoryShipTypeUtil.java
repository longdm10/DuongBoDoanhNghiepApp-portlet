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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType;

import java.util.List;

/**
 * The persistence utility for the dm history ship type service. This utility wraps {@link DmHistoryShipTypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryShipTypePersistence
 * @see DmHistoryShipTypePersistenceImpl
 * @generated
 */
public class DmHistoryShipTypeUtil {
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
	public static void clearCache(DmHistoryShipType dmHistoryShipType) {
		getPersistence().clearCache(dmHistoryShipType);
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
	public static List<DmHistoryShipType> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmHistoryShipType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmHistoryShipType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DmHistoryShipType update(DmHistoryShipType dmHistoryShipType)
		throws SystemException {
		return getPersistence().update(dmHistoryShipType);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DmHistoryShipType update(
		DmHistoryShipType dmHistoryShipType, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(dmHistoryShipType, serviceContext);
	}

	/**
	* Returns all the dm history ship types where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @return the matching dm history ship types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType> findByShipTypeCode(
		java.lang.String shipTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByShipTypeCode(shipTypeCode);
	}

	/**
	* Returns a range of all the dm history ship types where shipTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryShipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param shipTypeCode the ship type code
	* @param start the lower bound of the range of dm history ship types
	* @param end the upper bound of the range of dm history ship types (not inclusive)
	* @return the range of matching dm history ship types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType> findByShipTypeCode(
		java.lang.String shipTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByShipTypeCode(shipTypeCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm history ship types where shipTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryShipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param shipTypeCode the ship type code
	* @param start the lower bound of the range of dm history ship types
	* @param end the upper bound of the range of dm history ship types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history ship types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType> findByShipTypeCode(
		java.lang.String shipTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByShipTypeCode(shipTypeCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm history ship type in the ordered set where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history ship type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException if a matching dm history ship type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType findByShipTypeCode_First(
		java.lang.String shipTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException {
		return getPersistence()
				   .findByShipTypeCode_First(shipTypeCode, orderByComparator);
	}

	/**
	* Returns the first dm history ship type in the ordered set where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history ship type, or <code>null</code> if a matching dm history ship type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType fetchByShipTypeCode_First(
		java.lang.String shipTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByShipTypeCode_First(shipTypeCode, orderByComparator);
	}

	/**
	* Returns the last dm history ship type in the ordered set where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history ship type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException if a matching dm history ship type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType findByShipTypeCode_Last(
		java.lang.String shipTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException {
		return getPersistence()
				   .findByShipTypeCode_Last(shipTypeCode, orderByComparator);
	}

	/**
	* Returns the last dm history ship type in the ordered set where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history ship type, or <code>null</code> if a matching dm history ship type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType fetchByShipTypeCode_Last(
		java.lang.String shipTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByShipTypeCode_Last(shipTypeCode, orderByComparator);
	}

	/**
	* Returns the dm history ship types before and after the current dm history ship type in the ordered set where shipTypeCode = &#63;.
	*
	* @param id the primary key of the current dm history ship type
	* @param shipTypeCode the ship type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history ship type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException if a dm history ship type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType[] findByShipTypeCode_PrevAndNext(
		int id, java.lang.String shipTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException {
		return getPersistence()
				   .findByShipTypeCode_PrevAndNext(id, shipTypeCode,
			orderByComparator);
	}

	/**
	* Removes all the dm history ship types where shipTypeCode = &#63; from the database.
	*
	* @param shipTypeCode the ship type code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByShipTypeCode(java.lang.String shipTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByShipTypeCode(shipTypeCode);
	}

	/**
	* Returns the number of dm history ship types where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @return the number of matching dm history ship types
	* @throws SystemException if a system exception occurred
	*/
	public static int countByShipTypeCode(java.lang.String shipTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByShipTypeCode(shipTypeCode);
	}

	/**
	* Returns the dm history ship type where shipTypeCode = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException} if it could not be found.
	*
	* @param shipTypeCode the ship type code
	* @param syncVersion the sync version
	* @return the matching dm history ship type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException if a matching dm history ship type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType findByShipTypeCodeAndSyncVersion(
		java.lang.String shipTypeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException {
		return getPersistence()
				   .findByShipTypeCodeAndSyncVersion(shipTypeCode, syncVersion);
	}

	/**
	* Returns the dm history ship type where shipTypeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param shipTypeCode the ship type code
	* @param syncVersion the sync version
	* @return the matching dm history ship type, or <code>null</code> if a matching dm history ship type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType fetchByShipTypeCodeAndSyncVersion(
		java.lang.String shipTypeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByShipTypeCodeAndSyncVersion(shipTypeCode, syncVersion);
	}

	/**
	* Returns the dm history ship type where shipTypeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param shipTypeCode the ship type code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history ship type, or <code>null</code> if a matching dm history ship type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType fetchByShipTypeCodeAndSyncVersion(
		java.lang.String shipTypeCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByShipTypeCodeAndSyncVersion(shipTypeCode,
			syncVersion, retrieveFromCache);
	}

	/**
	* Removes the dm history ship type where shipTypeCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param shipTypeCode the ship type code
	* @param syncVersion the sync version
	* @return the dm history ship type that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType removeByShipTypeCodeAndSyncVersion(
		java.lang.String shipTypeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException {
		return getPersistence()
				   .removeByShipTypeCodeAndSyncVersion(shipTypeCode, syncVersion);
	}

	/**
	* Returns the number of dm history ship types where shipTypeCode = &#63; and syncVersion = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @param syncVersion the sync version
	* @return the number of matching dm history ship types
	* @throws SystemException if a system exception occurred
	*/
	public static int countByShipTypeCodeAndSyncVersion(
		java.lang.String shipTypeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByShipTypeCodeAndSyncVersion(shipTypeCode, syncVersion);
	}

	/**
	* Caches the dm history ship type in the entity cache if it is enabled.
	*
	* @param dmHistoryShipType the dm history ship type
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType dmHistoryShipType) {
		getPersistence().cacheResult(dmHistoryShipType);
	}

	/**
	* Caches the dm history ship types in the entity cache if it is enabled.
	*
	* @param dmHistoryShipTypes the dm history ship types
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType> dmHistoryShipTypes) {
		getPersistence().cacheResult(dmHistoryShipTypes);
	}

	/**
	* Creates a new dm history ship type with the primary key. Does not add the dm history ship type to the database.
	*
	* @param id the primary key for the new dm history ship type
	* @return the new dm history ship type
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType create(
		int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm history ship type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history ship type
	* @return the dm history ship type that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException if a dm history ship type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType dmHistoryShipType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmHistoryShipType);
	}

	/**
	* Returns the dm history ship type with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException} if it could not be found.
	*
	* @param id the primary key of the dm history ship type
	* @return the dm history ship type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException if a dm history ship type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipTypeException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm history ship type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history ship type
	* @return the dm history ship type, or <code>null</code> if a dm history ship type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm history ship types.
	*
	* @return the dm history ship types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm history ship types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryShipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history ship types
	* @param end the upper bound of the range of dm history ship types (not inclusive)
	* @return the range of dm history ship types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm history ship types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryShipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history ship types
	* @param end the upper bound of the range of dm history ship types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history ship types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm history ship types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm history ship types.
	*
	* @return the number of dm history ship types
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmHistoryShipTypePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmHistoryShipTypePersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					DmHistoryShipTypePersistence.class.getName());

			ReferenceRegistry.registerReference(DmHistoryShipTypeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DmHistoryShipTypePersistence persistence) {
	}

	private static DmHistoryShipTypePersistence _persistence;
}