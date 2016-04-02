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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency;

import java.util.List;

/**
 * The persistence utility for the dm history ship agency service. This utility wraps {@link DmHistoryShipAgencyPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryShipAgencyPersistence
 * @see DmHistoryShipAgencyPersistenceImpl
 * @generated
 */
public class DmHistoryShipAgencyUtil {
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
	public static void clearCache(DmHistoryShipAgency dmHistoryShipAgency) {
		getPersistence().clearCache(dmHistoryShipAgency);
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
	public static List<DmHistoryShipAgency> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmHistoryShipAgency> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmHistoryShipAgency> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DmHistoryShipAgency update(
		DmHistoryShipAgency dmHistoryShipAgency) throws SystemException {
		return getPersistence().update(dmHistoryShipAgency);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DmHistoryShipAgency update(
		DmHistoryShipAgency dmHistoryShipAgency, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(dmHistoryShipAgency, serviceContext);
	}

	/**
	* Returns all the dm history ship agencies where shipAgencyCode = &#63;.
	*
	* @param shipAgencyCode the ship agency code
	* @return the matching dm history ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency> findByShipAgencyCode(
		java.lang.String shipAgencyCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByShipAgencyCode(shipAgencyCode);
	}

	/**
	* Returns a range of all the dm history ship agencies where shipAgencyCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryShipAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param shipAgencyCode the ship agency code
	* @param start the lower bound of the range of dm history ship agencies
	* @param end the upper bound of the range of dm history ship agencies (not inclusive)
	* @return the range of matching dm history ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency> findByShipAgencyCode(
		java.lang.String shipAgencyCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByShipAgencyCode(shipAgencyCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm history ship agencies where shipAgencyCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryShipAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param shipAgencyCode the ship agency code
	* @param start the lower bound of the range of dm history ship agencies
	* @param end the upper bound of the range of dm history ship agencies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency> findByShipAgencyCode(
		java.lang.String shipAgencyCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByShipAgencyCode(shipAgencyCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm history ship agency in the ordered set where shipAgencyCode = &#63;.
	*
	* @param shipAgencyCode the ship agency code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history ship agency
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException if a matching dm history ship agency could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency findByShipAgencyCode_First(
		java.lang.String shipAgencyCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException {
		return getPersistence()
				   .findByShipAgencyCode_First(shipAgencyCode, orderByComparator);
	}

	/**
	* Returns the first dm history ship agency in the ordered set where shipAgencyCode = &#63;.
	*
	* @param shipAgencyCode the ship agency code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history ship agency, or <code>null</code> if a matching dm history ship agency could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency fetchByShipAgencyCode_First(
		java.lang.String shipAgencyCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByShipAgencyCode_First(shipAgencyCode,
			orderByComparator);
	}

	/**
	* Returns the last dm history ship agency in the ordered set where shipAgencyCode = &#63;.
	*
	* @param shipAgencyCode the ship agency code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history ship agency
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException if a matching dm history ship agency could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency findByShipAgencyCode_Last(
		java.lang.String shipAgencyCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException {
		return getPersistence()
				   .findByShipAgencyCode_Last(shipAgencyCode, orderByComparator);
	}

	/**
	* Returns the last dm history ship agency in the ordered set where shipAgencyCode = &#63;.
	*
	* @param shipAgencyCode the ship agency code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history ship agency, or <code>null</code> if a matching dm history ship agency could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency fetchByShipAgencyCode_Last(
		java.lang.String shipAgencyCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByShipAgencyCode_Last(shipAgencyCode, orderByComparator);
	}

	/**
	* Returns the dm history ship agencies before and after the current dm history ship agency in the ordered set where shipAgencyCode = &#63;.
	*
	* @param id the primary key of the current dm history ship agency
	* @param shipAgencyCode the ship agency code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history ship agency
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException if a dm history ship agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency[] findByShipAgencyCode_PrevAndNext(
		int id, java.lang.String shipAgencyCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException {
		return getPersistence()
				   .findByShipAgencyCode_PrevAndNext(id, shipAgencyCode,
			orderByComparator);
	}

	/**
	* Removes all the dm history ship agencies where shipAgencyCode = &#63; from the database.
	*
	* @param shipAgencyCode the ship agency code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByShipAgencyCode(java.lang.String shipAgencyCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByShipAgencyCode(shipAgencyCode);
	}

	/**
	* Returns the number of dm history ship agencies where shipAgencyCode = &#63;.
	*
	* @param shipAgencyCode the ship agency code
	* @return the number of matching dm history ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public static int countByShipAgencyCode(java.lang.String shipAgencyCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByShipAgencyCode(shipAgencyCode);
	}

	/**
	* Returns the dm history ship agency where shipAgencyCode = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException} if it could not be found.
	*
	* @param shipAgencyCode the ship agency code
	* @param syncVersion the sync version
	* @return the matching dm history ship agency
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException if a matching dm history ship agency could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency findByShipAgencyCodeAndSyncVersion(
		java.lang.String shipAgencyCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException {
		return getPersistence()
				   .findByShipAgencyCodeAndSyncVersion(shipAgencyCode,
			syncVersion);
	}

	/**
	* Returns the dm history ship agency where shipAgencyCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param shipAgencyCode the ship agency code
	* @param syncVersion the sync version
	* @return the matching dm history ship agency, or <code>null</code> if a matching dm history ship agency could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency fetchByShipAgencyCodeAndSyncVersion(
		java.lang.String shipAgencyCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByShipAgencyCodeAndSyncVersion(shipAgencyCode,
			syncVersion);
	}

	/**
	* Returns the dm history ship agency where shipAgencyCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param shipAgencyCode the ship agency code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history ship agency, or <code>null</code> if a matching dm history ship agency could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency fetchByShipAgencyCodeAndSyncVersion(
		java.lang.String shipAgencyCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByShipAgencyCodeAndSyncVersion(shipAgencyCode,
			syncVersion, retrieveFromCache);
	}

	/**
	* Removes the dm history ship agency where shipAgencyCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param shipAgencyCode the ship agency code
	* @param syncVersion the sync version
	* @return the dm history ship agency that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency removeByShipAgencyCodeAndSyncVersion(
		java.lang.String shipAgencyCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException {
		return getPersistence()
				   .removeByShipAgencyCodeAndSyncVersion(shipAgencyCode,
			syncVersion);
	}

	/**
	* Returns the number of dm history ship agencies where shipAgencyCode = &#63; and syncVersion = &#63;.
	*
	* @param shipAgencyCode the ship agency code
	* @param syncVersion the sync version
	* @return the number of matching dm history ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public static int countByShipAgencyCodeAndSyncVersion(
		java.lang.String shipAgencyCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByShipAgencyCodeAndSyncVersion(shipAgencyCode,
			syncVersion);
	}

	/**
	* Caches the dm history ship agency in the entity cache if it is enabled.
	*
	* @param dmHistoryShipAgency the dm history ship agency
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency dmHistoryShipAgency) {
		getPersistence().cacheResult(dmHistoryShipAgency);
	}

	/**
	* Caches the dm history ship agencies in the entity cache if it is enabled.
	*
	* @param dmHistoryShipAgencies the dm history ship agencies
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency> dmHistoryShipAgencies) {
		getPersistence().cacheResult(dmHistoryShipAgencies);
	}

	/**
	* Creates a new dm history ship agency with the primary key. Does not add the dm history ship agency to the database.
	*
	* @param id the primary key for the new dm history ship agency
	* @return the new dm history ship agency
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency create(
		int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm history ship agency with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history ship agency
	* @return the dm history ship agency that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException if a dm history ship agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency dmHistoryShipAgency)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmHistoryShipAgency);
	}

	/**
	* Returns the dm history ship agency with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException} if it could not be found.
	*
	* @param id the primary key of the dm history ship agency
	* @return the dm history ship agency
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException if a dm history ship agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryShipAgencyException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm history ship agency with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history ship agency
	* @return the dm history ship agency, or <code>null</code> if a dm history ship agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm history ship agencies.
	*
	* @return the dm history ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm history ship agencies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryShipAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history ship agencies
	* @param end the upper bound of the range of dm history ship agencies (not inclusive)
	* @return the range of dm history ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm history ship agencies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryShipAgencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history ship agencies
	* @param end the upper bound of the range of dm history ship agencies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm history ship agencies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm history ship agencies.
	*
	* @return the number of dm history ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmHistoryShipAgencyPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmHistoryShipAgencyPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					DmHistoryShipAgencyPersistence.class.getName());

			ReferenceRegistry.registerReference(DmHistoryShipAgencyUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DmHistoryShipAgencyPersistence persistence) {
	}

	private static DmHistoryShipAgencyPersistence _persistence;
}