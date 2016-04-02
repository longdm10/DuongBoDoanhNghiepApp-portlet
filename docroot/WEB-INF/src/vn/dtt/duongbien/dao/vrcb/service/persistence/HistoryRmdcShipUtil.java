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

import vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip;

import java.util.List;

/**
 * The persistence utility for the history rmdc ship service. This utility wraps {@link HistoryRmdcShipPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see HistoryRmdcShipPersistence
 * @see HistoryRmdcShipPersistenceImpl
 * @generated
 */
public class HistoryRmdcShipUtil {
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
	public static void clearCache(HistoryRmdcShip historyRmdcShip) {
		getPersistence().clearCache(historyRmdcShip);
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
	public static List<HistoryRmdcShip> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HistoryRmdcShip> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HistoryRmdcShip> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static HistoryRmdcShip update(HistoryRmdcShip historyRmdcShip)
		throws SystemException {
		return getPersistence().update(historyRmdcShip);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static HistoryRmdcShip update(HistoryRmdcShip historyRmdcShip,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(historyRmdcShip, serviceContext);
	}

	/**
	* Returns all the history rmdc ships where syncVersion = &#63;.
	*
	* @param syncVersion the sync version
	* @return the matching history rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip> findBySyncVersion(
		java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySyncVersion(syncVersion);
	}

	/**
	* Returns a range of all the history rmdc ships where syncVersion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryRmdcShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param syncVersion the sync version
	* @param start the lower bound of the range of history rmdc ships
	* @param end the upper bound of the range of history rmdc ships (not inclusive)
	* @return the range of matching history rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip> findBySyncVersion(
		java.lang.String syncVersion, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySyncVersion(syncVersion, start, end);
	}

	/**
	* Returns an ordered range of all the history rmdc ships where syncVersion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryRmdcShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param syncVersion the sync version
	* @param start the lower bound of the range of history rmdc ships
	* @param end the upper bound of the range of history rmdc ships (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching history rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip> findBySyncVersion(
		java.lang.String syncVersion, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySyncVersion(syncVersion, start, end, orderByComparator);
	}

	/**
	* Returns the first history rmdc ship in the ordered set where syncVersion = &#63;.
	*
	* @param syncVersion the sync version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching history rmdc ship
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException if a matching history rmdc ship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip findBySyncVersion_First(
		java.lang.String syncVersion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException {
		return getPersistence()
				   .findBySyncVersion_First(syncVersion, orderByComparator);
	}

	/**
	* Returns the first history rmdc ship in the ordered set where syncVersion = &#63;.
	*
	* @param syncVersion the sync version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching history rmdc ship, or <code>null</code> if a matching history rmdc ship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip fetchBySyncVersion_First(
		java.lang.String syncVersion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySyncVersion_First(syncVersion, orderByComparator);
	}

	/**
	* Returns the last history rmdc ship in the ordered set where syncVersion = &#63;.
	*
	* @param syncVersion the sync version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching history rmdc ship
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException if a matching history rmdc ship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip findBySyncVersion_Last(
		java.lang.String syncVersion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException {
		return getPersistence()
				   .findBySyncVersion_Last(syncVersion, orderByComparator);
	}

	/**
	* Returns the last history rmdc ship in the ordered set where syncVersion = &#63;.
	*
	* @param syncVersion the sync version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching history rmdc ship, or <code>null</code> if a matching history rmdc ship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip fetchBySyncVersion_Last(
		java.lang.String syncVersion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySyncVersion_Last(syncVersion, orderByComparator);
	}

	/**
	* Returns the history rmdc ships before and after the current history rmdc ship in the ordered set where syncVersion = &#63;.
	*
	* @param id the primary key of the current history rmdc ship
	* @param syncVersion the sync version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next history rmdc ship
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException if a history rmdc ship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip[] findBySyncVersion_PrevAndNext(
		long id, java.lang.String syncVersion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException {
		return getPersistence()
				   .findBySyncVersion_PrevAndNext(id, syncVersion,
			orderByComparator);
	}

	/**
	* Removes all the history rmdc ships where syncVersion = &#63; from the database.
	*
	* @param syncVersion the sync version
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySyncVersion(java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySyncVersion(syncVersion);
	}

	/**
	* Returns the number of history rmdc ships where syncVersion = &#63;.
	*
	* @param syncVersion the sync version
	* @return the number of matching history rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySyncVersion(java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBySyncVersion(syncVersion);
	}

	/**
	* Returns all the history rmdc ships where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @return the matching history rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip> findByShipTypeCode(
		java.lang.String shipTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByShipTypeCode(shipTypeCode);
	}

	/**
	* Returns a range of all the history rmdc ships where shipTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryRmdcShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param shipTypeCode the ship type code
	* @param start the lower bound of the range of history rmdc ships
	* @param end the upper bound of the range of history rmdc ships (not inclusive)
	* @return the range of matching history rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip> findByShipTypeCode(
		java.lang.String shipTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByShipTypeCode(shipTypeCode, start, end);
	}

	/**
	* Returns an ordered range of all the history rmdc ships where shipTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryRmdcShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param shipTypeCode the ship type code
	* @param start the lower bound of the range of history rmdc ships
	* @param end the upper bound of the range of history rmdc ships (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching history rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip> findByShipTypeCode(
		java.lang.String shipTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByShipTypeCode(shipTypeCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first history rmdc ship in the ordered set where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching history rmdc ship
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException if a matching history rmdc ship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip findByShipTypeCode_First(
		java.lang.String shipTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException {
		return getPersistence()
				   .findByShipTypeCode_First(shipTypeCode, orderByComparator);
	}

	/**
	* Returns the first history rmdc ship in the ordered set where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching history rmdc ship, or <code>null</code> if a matching history rmdc ship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip fetchByShipTypeCode_First(
		java.lang.String shipTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByShipTypeCode_First(shipTypeCode, orderByComparator);
	}

	/**
	* Returns the last history rmdc ship in the ordered set where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching history rmdc ship
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException if a matching history rmdc ship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip findByShipTypeCode_Last(
		java.lang.String shipTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException {
		return getPersistence()
				   .findByShipTypeCode_Last(shipTypeCode, orderByComparator);
	}

	/**
	* Returns the last history rmdc ship in the ordered set where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching history rmdc ship, or <code>null</code> if a matching history rmdc ship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip fetchByShipTypeCode_Last(
		java.lang.String shipTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByShipTypeCode_Last(shipTypeCode, orderByComparator);
	}

	/**
	* Returns the history rmdc ships before and after the current history rmdc ship in the ordered set where shipTypeCode = &#63;.
	*
	* @param id the primary key of the current history rmdc ship
	* @param shipTypeCode the ship type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next history rmdc ship
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException if a history rmdc ship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip[] findByShipTypeCode_PrevAndNext(
		long id, java.lang.String shipTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException {
		return getPersistence()
				   .findByShipTypeCode_PrevAndNext(id, shipTypeCode,
			orderByComparator);
	}

	/**
	* Removes all the history rmdc ships where shipTypeCode = &#63; from the database.
	*
	* @param shipTypeCode the ship type code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByShipTypeCode(java.lang.String shipTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByShipTypeCode(shipTypeCode);
	}

	/**
	* Returns the number of history rmdc ships where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @return the number of matching history rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public static int countByShipTypeCode(java.lang.String shipTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByShipTypeCode(shipTypeCode);
	}

	/**
	* Caches the history rmdc ship in the entity cache if it is enabled.
	*
	* @param historyRmdcShip the history rmdc ship
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip historyRmdcShip) {
		getPersistence().cacheResult(historyRmdcShip);
	}

	/**
	* Caches the history rmdc ships in the entity cache if it is enabled.
	*
	* @param historyRmdcShips the history rmdc ships
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip> historyRmdcShips) {
		getPersistence().cacheResult(historyRmdcShips);
	}

	/**
	* Creates a new history rmdc ship with the primary key. Does not add the history rmdc ship to the database.
	*
	* @param id the primary key for the new history rmdc ship
	* @return the new history rmdc ship
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the history rmdc ship with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the history rmdc ship
	* @return the history rmdc ship that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException if a history rmdc ship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip historyRmdcShip)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(historyRmdcShip);
	}

	/**
	* Returns the history rmdc ship with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException} if it could not be found.
	*
	* @param id the primary key of the history rmdc ship
	* @return the history rmdc ship
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException if a history rmdc ship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchHistoryRmdcShipException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the history rmdc ship with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the history rmdc ship
	* @return the history rmdc ship, or <code>null</code> if a history rmdc ship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the history rmdc ships.
	*
	* @return the history rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the history rmdc ships.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryRmdcShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of history rmdc ships
	* @param end the upper bound of the range of history rmdc ships (not inclusive)
	* @return the range of history rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the history rmdc ships.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryRmdcShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of history rmdc ships
	* @param end the upper bound of the range of history rmdc ships (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of history rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the history rmdc ships from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of history rmdc ships.
	*
	* @return the number of history rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static HistoryRmdcShipPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (HistoryRmdcShipPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					HistoryRmdcShipPersistence.class.getName());

			ReferenceRegistry.registerReference(HistoryRmdcShipUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(HistoryRmdcShipPersistence persistence) {
	}

	private static HistoryRmdcShipPersistence _persistence;
}