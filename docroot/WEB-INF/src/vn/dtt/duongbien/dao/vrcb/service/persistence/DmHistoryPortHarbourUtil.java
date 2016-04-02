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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour;

import java.util.List;

/**
 * The persistence utility for the dm history port harbour service. This utility wraps {@link DmHistoryPortHarbourPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryPortHarbourPersistence
 * @see DmHistoryPortHarbourPersistenceImpl
 * @generated
 */
public class DmHistoryPortHarbourUtil {
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
	public static void clearCache(DmHistoryPortHarbour dmHistoryPortHarbour) {
		getPersistence().clearCache(dmHistoryPortHarbour);
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
	public static List<DmHistoryPortHarbour> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmHistoryPortHarbour> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmHistoryPortHarbour> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DmHistoryPortHarbour update(
		DmHistoryPortHarbour dmHistoryPortHarbour) throws SystemException {
		return getPersistence().update(dmHistoryPortHarbour);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DmHistoryPortHarbour update(
		DmHistoryPortHarbour dmHistoryPortHarbour, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(dmHistoryPortHarbour, serviceContext);
	}

	/**
	* Returns all the dm history port harbours where portHarbourCode = &#63;.
	*
	* @param portHarbourCode the port harbour code
	* @return the matching dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour> findByPortHarbourCode(
		java.lang.String portHarbourCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortHarbourCode(portHarbourCode);
	}

	/**
	* Returns a range of all the dm history port harbours where portHarbourCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portHarbourCode the port harbour code
	* @param start the lower bound of the range of dm history port harbours
	* @param end the upper bound of the range of dm history port harbours (not inclusive)
	* @return the range of matching dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour> findByPortHarbourCode(
		java.lang.String portHarbourCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPortHarbourCode(portHarbourCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm history port harbours where portHarbourCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portHarbourCode the port harbour code
	* @param start the lower bound of the range of dm history port harbours
	* @param end the upper bound of the range of dm history port harbours (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour> findByPortHarbourCode(
		java.lang.String portHarbourCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPortHarbourCode(portHarbourCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm history port harbour in the ordered set where portHarbourCode = &#63;.
	*
	* @param portHarbourCode the port harbour code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history port harbour
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException if a matching dm history port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour findByPortHarbourCode_First(
		java.lang.String portHarbourCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException {
		return getPersistence()
				   .findByPortHarbourCode_First(portHarbourCode,
			orderByComparator);
	}

	/**
	* Returns the first dm history port harbour in the ordered set where portHarbourCode = &#63;.
	*
	* @param portHarbourCode the port harbour code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history port harbour, or <code>null</code> if a matching dm history port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour fetchByPortHarbourCode_First(
		java.lang.String portHarbourCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPortHarbourCode_First(portHarbourCode,
			orderByComparator);
	}

	/**
	* Returns the last dm history port harbour in the ordered set where portHarbourCode = &#63;.
	*
	* @param portHarbourCode the port harbour code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history port harbour
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException if a matching dm history port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour findByPortHarbourCode_Last(
		java.lang.String portHarbourCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException {
		return getPersistence()
				   .findByPortHarbourCode_Last(portHarbourCode,
			orderByComparator);
	}

	/**
	* Returns the last dm history port harbour in the ordered set where portHarbourCode = &#63;.
	*
	* @param portHarbourCode the port harbour code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history port harbour, or <code>null</code> if a matching dm history port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour fetchByPortHarbourCode_Last(
		java.lang.String portHarbourCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPortHarbourCode_Last(portHarbourCode,
			orderByComparator);
	}

	/**
	* Returns the dm history port harbours before and after the current dm history port harbour in the ordered set where portHarbourCode = &#63;.
	*
	* @param id the primary key of the current dm history port harbour
	* @param portHarbourCode the port harbour code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history port harbour
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException if a dm history port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour[] findByPortHarbourCode_PrevAndNext(
		int id, java.lang.String portHarbourCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException {
		return getPersistence()
				   .findByPortHarbourCode_PrevAndNext(id, portHarbourCode,
			orderByComparator);
	}

	/**
	* Removes all the dm history port harbours where portHarbourCode = &#63; from the database.
	*
	* @param portHarbourCode the port harbour code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPortHarbourCode(java.lang.String portHarbourCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPortHarbourCode(portHarbourCode);
	}

	/**
	* Returns the number of dm history port harbours where portHarbourCode = &#63;.
	*
	* @param portHarbourCode the port harbour code
	* @return the number of matching dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPortHarbourCode(java.lang.String portHarbourCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPortHarbourCode(portHarbourCode);
	}

	/**
	* Returns the dm history port harbour where portHarbourCode = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException} if it could not be found.
	*
	* @param portHarbourCode the port harbour code
	* @param syncVersion the sync version
	* @return the matching dm history port harbour
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException if a matching dm history port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour findByPortHarbourCodeAndSyncVersion(
		java.lang.String portHarbourCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException {
		return getPersistence()
				   .findByPortHarbourCodeAndSyncVersion(portHarbourCode,
			syncVersion);
	}

	/**
	* Returns the dm history port harbour where portHarbourCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param portHarbourCode the port harbour code
	* @param syncVersion the sync version
	* @return the matching dm history port harbour, or <code>null</code> if a matching dm history port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour fetchByPortHarbourCodeAndSyncVersion(
		java.lang.String portHarbourCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPortHarbourCodeAndSyncVersion(portHarbourCode,
			syncVersion);
	}

	/**
	* Returns the dm history port harbour where portHarbourCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param portHarbourCode the port harbour code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history port harbour, or <code>null</code> if a matching dm history port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour fetchByPortHarbourCodeAndSyncVersion(
		java.lang.String portHarbourCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPortHarbourCodeAndSyncVersion(portHarbourCode,
			syncVersion, retrieveFromCache);
	}

	/**
	* Removes the dm history port harbour where portHarbourCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param portHarbourCode the port harbour code
	* @param syncVersion the sync version
	* @return the dm history port harbour that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour removeByPortHarbourCodeAndSyncVersion(
		java.lang.String portHarbourCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException {
		return getPersistence()
				   .removeByPortHarbourCodeAndSyncVersion(portHarbourCode,
			syncVersion);
	}

	/**
	* Returns the number of dm history port harbours where portHarbourCode = &#63; and syncVersion = &#63;.
	*
	* @param portHarbourCode the port harbour code
	* @param syncVersion the sync version
	* @return the number of matching dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPortHarbourCodeAndSyncVersion(
		java.lang.String portHarbourCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByPortHarbourCodeAndSyncVersion(portHarbourCode,
			syncVersion);
	}

	/**
	* Returns all the dm history port harbours where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @return the matching dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour> findByPortRegionCode(
		java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortRegionCode(portRegionCode);
	}

	/**
	* Returns a range of all the dm history port harbours where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portRegionCode the port region code
	* @param start the lower bound of the range of dm history port harbours
	* @param end the upper bound of the range of dm history port harbours (not inclusive)
	* @return the range of matching dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour> findByPortRegionCode(
		java.lang.String portRegionCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortRegionCode(portRegionCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm history port harbours where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portRegionCode the port region code
	* @param start the lower bound of the range of dm history port harbours
	* @param end the upper bound of the range of dm history port harbours (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour> findByPortRegionCode(
		java.lang.String portRegionCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPortRegionCode(portRegionCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm history port harbour in the ordered set where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history port harbour
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException if a matching dm history port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour findByPortRegionCode_First(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException {
		return getPersistence()
				   .findByPortRegionCode_First(portRegionCode, orderByComparator);
	}

	/**
	* Returns the first dm history port harbour in the ordered set where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history port harbour, or <code>null</code> if a matching dm history port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour fetchByPortRegionCode_First(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPortRegionCode_First(portRegionCode,
			orderByComparator);
	}

	/**
	* Returns the last dm history port harbour in the ordered set where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history port harbour
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException if a matching dm history port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour findByPortRegionCode_Last(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException {
		return getPersistence()
				   .findByPortRegionCode_Last(portRegionCode, orderByComparator);
	}

	/**
	* Returns the last dm history port harbour in the ordered set where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history port harbour, or <code>null</code> if a matching dm history port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour fetchByPortRegionCode_Last(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPortRegionCode_Last(portRegionCode, orderByComparator);
	}

	/**
	* Returns the dm history port harbours before and after the current dm history port harbour in the ordered set where portRegionCode = &#63;.
	*
	* @param id the primary key of the current dm history port harbour
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history port harbour
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException if a dm history port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour[] findByPortRegionCode_PrevAndNext(
		int id, java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException {
		return getPersistence()
				   .findByPortRegionCode_PrevAndNext(id, portRegionCode,
			orderByComparator);
	}

	/**
	* Removes all the dm history port harbours where portRegionCode = &#63; from the database.
	*
	* @param portRegionCode the port region code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPortRegionCode(java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPortRegionCode(portRegionCode);
	}

	/**
	* Returns the number of dm history port harbours where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @return the number of matching dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPortRegionCode(java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPortRegionCode(portRegionCode);
	}

	/**
	* Caches the dm history port harbour in the entity cache if it is enabled.
	*
	* @param dmHistoryPortHarbour the dm history port harbour
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour dmHistoryPortHarbour) {
		getPersistence().cacheResult(dmHistoryPortHarbour);
	}

	/**
	* Caches the dm history port harbours in the entity cache if it is enabled.
	*
	* @param dmHistoryPortHarbours the dm history port harbours
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour> dmHistoryPortHarbours) {
		getPersistence().cacheResult(dmHistoryPortHarbours);
	}

	/**
	* Creates a new dm history port harbour with the primary key. Does not add the dm history port harbour to the database.
	*
	* @param id the primary key for the new dm history port harbour
	* @return the new dm history port harbour
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour create(
		int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm history port harbour with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history port harbour
	* @return the dm history port harbour that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException if a dm history port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour dmHistoryPortHarbour)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmHistoryPortHarbour);
	}

	/**
	* Returns the dm history port harbour with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException} if it could not be found.
	*
	* @param id the primary key of the dm history port harbour
	* @return the dm history port harbour
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException if a dm history port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryPortHarbourException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm history port harbour with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history port harbour
	* @return the dm history port harbour, or <code>null</code> if a dm history port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm history port harbours.
	*
	* @return the dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm history port harbours.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history port harbours
	* @param end the upper bound of the range of dm history port harbours (not inclusive)
	* @return the range of dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm history port harbours.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history port harbours
	* @param end the upper bound of the range of dm history port harbours (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm history port harbours from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm history port harbours.
	*
	* @return the number of dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmHistoryPortHarbourPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmHistoryPortHarbourPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					DmHistoryPortHarbourPersistence.class.getName());

			ReferenceRegistry.registerReference(DmHistoryPortHarbourUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DmHistoryPortHarbourPersistence persistence) {
	}

	private static DmHistoryPortHarbourPersistence _persistence;
}